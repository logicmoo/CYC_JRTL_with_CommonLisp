/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.sequence_var;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.string_utilities;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-KNOWN-ANTECEDENT-RULE
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp
 * created:     2019/07/03 17:37:47
 */
public final class removal_modules_known_antecedent_rule extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_known_antecedent_rule();



    // defvar
    // Definitions
    /**
     * Whether #$knownAntecedentRule is enabled. Currently (May 2004) it is disabled
     * due to several unresolved issues.
     */
    @LispMethod(comment = "Whether #$knownAntecedentRule is enabled. Currently (May 2004) it is disabled\r\ndue to several unresolved issues.\ndefvar\nWhether #$knownAntecedentRule is enabled. Currently (May 2004) it is disabled\ndue to several unresolved issues.")
    public static final SubLSymbol $known_antecedent_rule_enabledP$ = makeSymbol("*KNOWN-ANTECEDENT-RULE-ENABLED?*");

    // deflexical
    /**
     * The substring used to uniquely identify knownAntecedentRule HL modules. It is
     * assumed to be unique to knownAntecedentRule modules.
     */
    @LispMethod(comment = "The substring used to uniquely identify knownAntecedentRule HL modules. It is\r\nassumed to be unique to knownAntecedentRule modules.\ndeflexical\nThe substring used to uniquely identify knownAntecedentRule HL modules. It is\nassumed to be unique to knownAntecedentRule modules.")
    private static final SubLSymbol $via_known_antecedent_rule_string$ = makeSymbol("*VIA-KNOWN-ANTECEDENT-RULE-STRING*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $within_removal_known_antecedent_rule_costP$ = makeSymbol("*WITHIN-REMOVAL-KNOWN-ANTECEDENT-RULE-COST?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$__knownAntecedentRule_support_is_ = makeString("#$knownAntecedentRule support is disabled.  Asserting #$knownAntecedentRule on ~s will have no effect.~%");

    static private final SubLString $str1$_via_known_antecedent_rule = makeString("-via-known-antecedent-rule");

    static private final SubLSymbol $sym2$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    static private final SubLString $str3$__knownAntecedentRule_currently_o = makeString("#$knownAntecedentRule currently only applies to rules with exactly one poslit, but was applied to ~s");

    static private final SubLString $str4$__knownAntecedentRule_cannot_hand = makeString("#$knownAntecedentRule cannot handle poslits with sequence variables, but was applied to ~s");

    static private final SubLString $str8$__knownAntecedentRule_currently_o = makeString("#$knownAntecedentRule currently only applies to rules with a fort as the predicate of their single pos-lit, but was applied to ~s");

    private static final SubLSymbol REMOVAL_KNOWN_ANTECEDENT_RULE_COST = makeSymbol("REMOVAL-KNOWN-ANTECEDENT-RULE-COST");

    private static final SubLSymbol REMOVAL_KNOWN_ANTECEDENT_RULE_ITERATOR = makeSymbol("REMOVAL-KNOWN-ANTECEDENT-RULE-ITERATOR");

    private static final SubLSymbol $OUTPUT_GENERATE_PATTERN = makeKeyword("OUTPUT-GENERATE-PATTERN");

    private static final SubLSymbol DESTROY_INFERENCE = makeSymbol("DESTROY-INFERENCE");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    static private final SubLList $list31 = list(makeKeyword("SUPPORTS"));

    private static final SubLSymbol $kw34$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    public static final SubLSymbol $known_antecedent_rule_hl_module_index$ = makeSymbol("*KNOWN-ANTECEDENT-RULE-HL-MODULE-INDEX*");

    public static final SubLObject declare_known_antecedent_rule_removal_module_for_rule_alt(SubLObject rule, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $known_antecedent_rule_enabledP$.getDynamicValue(thread)) {
                Errors.warn($str_alt0$__knownAntecedentRule_support_is_, rule);
                return NIL;
            }
            thread.resetMultipleValues();
            {
                SubLObject plist = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.known_antecedent_rule_removal_module_plist(rule);
                SubLObject name = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject hl_module = inference_modules.inference_removal_module(name, plist);
                    com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.note_hl_module_for_known_antecedent_rule(rule, hl_module);
                    if (NIL != reclassifyP) {
                        inference_modules.reclassify_removal_modules();
                    }
                    return hl_module;
                }
            }
        }
    }

    public static SubLObject declare_known_antecedent_rule_removal_module_for_rule(final SubLObject rule, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $known_antecedent_rule_enabledP$.getDynamicValue(thread)) {
            Errors.warn($str0$__knownAntecedentRule_support_is_, rule);
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject plist = known_antecedent_rule_removal_module_plist(rule);
        final SubLObject name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject hl_module = inference_modules.inference_removal_module(name, plist);
        note_hl_module_for_known_antecedent_rule(rule, hl_module);
        if (NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return hl_module;
    }

    public static final SubLObject undeclare_known_antecedent_rule_removal_module_for_rule_alt(SubLObject rule, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.clear_hl_module_for_known_antecedent_rule(rule);
            thread.resetMultipleValues();
            {
                SubLObject plist = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.known_antecedent_rule_removal_module_plist(rule);
                SubLObject name = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return inference_modules.undeclare_inference_removal_module(name, reclassifyP);
            }
        }
    }

    public static SubLObject undeclare_known_antecedent_rule_removal_module_for_rule(final SubLObject rule, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_hl_module_for_known_antecedent_rule(rule);
        if (NIL != assertion_handles.valid_assertionP(rule, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject plist = known_antecedent_rule_removal_module_plist(rule);
            final SubLObject name = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return inference_modules.undeclare_inference_removal_module(name, reclassifyP);
        }
        return NIL;
    }

    public static final SubLObject redeclare_known_antecedent_rule_removal_module_for_rule_alt(SubLObject rule) {
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.undeclare_known_antecedent_rule_removal_module_for_rule(rule, UNPROVIDED);
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.declare_known_antecedent_rule_removal_module_for_rule(rule, T);
    }

    public static SubLObject redeclare_known_antecedent_rule_removal_module_for_rule(final SubLObject rule) {
        undeclare_known_antecedent_rule_removal_module_for_rule(rule, UNPROVIDED);
        return declare_known_antecedent_rule_removal_module_for_rule(rule, T);
    }

    public static final SubLObject undeclare_all_known_antecedent_rule_removal_modules_alt() {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdohash_table = inference_modules.hl_module_store();
            SubLObject name_var = NIL;
            SubLObject hl_module = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        name_var = getEntryKey(cdohash_entry);
                        hl_module = getEntryValue(cdohash_entry);
                        {
                            SubLObject name = inference_modules.hl_module_name(hl_module);
                            if (NIL != string_utilities.substringP($via_known_antecedent_rule_string$.getGlobalValue(), string_utilities.str(name), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                count = add(count, ONE_INTEGER);
                                inference_modules.undeclare_inference_removal_module(name, NIL);
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            inference_modules.reclassify_removal_modules();
            return count;
        }
    }

    public static SubLObject undeclare_all_known_antecedent_rule_removal_modules() {
        SubLObject count = ZERO_INTEGER;
        final SubLObject cdohash_table = inference_modules.hl_module_store();
        SubLObject name_var = NIL;
        SubLObject hl_module = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                name_var = getEntryKey(cdohash_entry);
                hl_module = getEntryValue(cdohash_entry);
                final SubLObject name = inference_modules.hl_module_name(hl_module);
                if (NIL != string_utilities.substringP($via_known_antecedent_rule_string$.getGlobalValue(), string_utilities.str(name), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    count = add(count, ONE_INTEGER);
                    inference_modules.undeclare_inference_removal_module(name, NIL);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        inference_modules.reclassify_removal_modules();
        return count;
    }

    /**
     *
     *
     * @return 0 property-list-p
     * @return 1 keywordp; the name of the HL module that will have this plist
     */
    @LispMethod(comment = "@return 0 property-list-p\r\n@return 1 keywordp; the name of the HL module that will have this plist")
    public static final SubLObject known_antecedent_rule_removal_module_plist_alt(SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(rule, $sym2$RULE_ASSERTION_);
            {
                SubLObject plist = NIL;
                SubLObject name = NIL;
                SubLObject cnf = assertions_high.assertion_cnf(rule);
                SubLObject pos_lits = clauses.pos_lits(cnf);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!ONE_INTEGER.numE(length(pos_lits))) {
                        Errors.error($str_alt3$__knownAntecedentRule_currently_o, rule);
                    }
                }
                {
                    SubLObject pos_lit = pos_lits.first();
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL != sequence_var(pos_lit, UNPROVIDED)) {
                            Errors.error($str_alt4$__knownAntecedentRule_cannot_hand, rule);
                        }
                    }
                    {
                        SubLObject sense = $POS;
                        plist = putf(plist, $SENSE, sense);
                    }
                    {
                        SubLObject direction = assertions_high.assertion_direction(rule);
                        plist = putf(plist, $DIRECTION, direction);
                    }
                    {
                        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(pos_lit);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == forts.fort_p(predicate)) {
                                Errors.error($str_alt8$__knownAntecedentRule_currently_o, rule);
                            }
                        }
                        plist = putf(plist, $PREDICATE, predicate);
                        name = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.known_antecedent_rule_hl_module_name(rule);
                    }
                    {
                        SubLObject v_arity = formula_arity(pos_lit, UNPROVIDED);
                        plist = putf(plist, $ARITY, v_arity);
                    }
                    {
                        SubLObject mt = assertions_high.assertion_mt(rule);
                        plist = putf(plist, $REQUIRED_MT, mt);
                    }
                    {
                        SubLObject required_pattern = list($UNIFY, pos_lit);
                        plist = putf(plist, $REQUIRED_PATTERN, required_pattern);
                    }
                    {
                        SubLObject cost_pattern = list($CALL, REMOVAL_KNOWN_ANTECEDENT_RULE_COST, $INPUT, rule);
                        plist = putf(plist, $COST_PATTERN, cost_pattern);
                    }
                    {
                        SubLObject output_generate_pattern = list($CALL, REMOVAL_KNOWN_ANTECEDENT_RULE_ITERATOR, $INPUT, rule, list($NOT, name));
                        plist = putf(plist, $OUTPUT_GENERATE_PATTERN, output_generate_pattern);
                    }
                }
                return values(plist, name);
            }
        }
    }

    /**
     *
     *
     * @return 0 property-list-p
     * @return 1 keywordp; the name of the HL module that will have this plist
     */
    @LispMethod(comment = "@return 0 property-list-p\r\n@return 1 keywordp; the name of the HL module that will have this plist")
    public static SubLObject known_antecedent_rule_removal_module_plist(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertions_high.rule_assertionP(rule) : "! assertions_high.rule_assertionP(rule) " + ("assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) ") + rule;
        SubLObject plist = NIL;
        SubLObject name = NIL;
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ONE_INTEGER.numE(length(pos_lits)))) {
            Errors.error($str3$__knownAntecedentRule_currently_o, rule);
        }
        final SubLObject pos_lit = pos_lits.first();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != sequence_var(pos_lit, UNPROVIDED))) {
            Errors.error($str4$__knownAntecedentRule_cannot_hand, rule);
        }
        final SubLObject sense = $POS;
        plist = putf(plist, $SENSE, sense);
        final SubLObject direction = assertions_high.assertion_direction(rule);
        plist = putf(plist, $DIRECTION, direction);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(pos_lit);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == forts.fort_p(predicate))) {
            Errors.error($str8$__knownAntecedentRule_currently_o, rule);
        }
        plist = putf(plist, $PREDICATE, predicate);
        name = known_antecedent_rule_hl_module_name(rule);
        final SubLObject v_arity = formula_arity(pos_lit, UNPROVIDED);
        plist = putf(plist, $ARITY, v_arity);
        final SubLObject mt = assertions_high.assertion_mt(rule);
        plist = putf(plist, $REQUIRED_MT, mt);
        final SubLObject required_pattern = list($UNIFY, pos_lit);
        plist = putf(plist, $REQUIRED_PATTERN, required_pattern);
        final SubLObject cost_pattern = list($CALL, REMOVAL_KNOWN_ANTECEDENT_RULE_COST, $INPUT, rule);
        plist = putf(plist, $COST_PATTERN, cost_pattern);
        final SubLObject output_generate_pattern = list($CALL, REMOVAL_KNOWN_ANTECEDENT_RULE_ITERATOR, $INPUT, rule, list($NOT, name));
        plist = putf(plist, $OUTPUT_GENERATE_PATTERN, output_generate_pattern);
        return values(plist, name);
    }

    public static final SubLObject known_antecedent_rule_removal_module_name_alt(SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject plist = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.known_antecedent_rule_removal_module_plist(rule);
                SubLObject name = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return name;
            }
        }
    }

    public static SubLObject known_antecedent_rule_removal_module_name(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject plist = known_antecedent_rule_removal_module_plist(rule);
        final SubLObject name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return name;
    }

    public static final SubLObject removal_known_antecedent_rule_cost_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cost = NIL;
                if (NIL == $within_removal_known_antecedent_rule_costP$.getDynamicValue(thread)) {
                    {
                        SubLObject _prev_bind_0 = $within_removal_known_antecedent_rule_costP$.currentBinding(thread);
                        try {
                            $within_removal_known_antecedent_rule_costP$.bind(T, thread);
                            {
                                SubLObject store = inference_worker.currently_active_problem_store();
                                if (NIL != store) {
                                    {
                                        SubLObject meta_store = inference_datastructures_problem_store.problem_store_meta_problem_store(store);
                                        SubLObject mt = mt_relevance_macros.inference_relevant_mt();
                                        SubLObject name = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.known_antecedent_rule_removal_module_name(rule);
                                        SubLObject query_static_properties = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.removal_known_antecedent_rule_static_properties(asent, rule, meta_store, list($NOT, name));
                                        SubLObject removal_inference = inference_utilities.new_continuable_antecedent_inference(asent, mt, rule, meta_store, query_static_properties);
                                        SubLObject transformed_problem = inference_datastructures_inference.inference_root_problem(removal_inference);
                                        if (NIL != transformed_problem) {
                                            if (NIL != inference_datastructures_inference.simplest_inference_p(removal_inference)) {
                                                {
                                                    SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(removal_inference);
                                                    cost = inference_datastructures_enumerated_types.number_of_children_for_productivity(inference_lookahead_productivity.memoized_problem_max_removal_productivity(transformed_problem, strategy));
                                                }
                                            }
                                        }
                                        inference_datastructures_inference.destroy_inference(removal_inference);
                                    }
                                }
                            }
                        } finally {
                            $within_removal_known_antecedent_rule_costP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return cost;
            }
        }
    }

    public static SubLObject removal_known_antecedent_rule_cost(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = NIL;
        if (NIL == $within_removal_known_antecedent_rule_costP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = $within_removal_known_antecedent_rule_costP$.currentBinding(thread);
            try {
                $within_removal_known_antecedent_rule_costP$.bind(T, thread);
                final SubLObject store = inference_worker.currently_active_problem_store();
                if (NIL != store) {
                    final SubLObject meta_store = inference_datastructures_problem_store.problem_store_meta_problem_store(store);
                    final SubLObject mt = mt_relevance_macros.inference_relevant_mt();
                    final SubLObject name = known_antecedent_rule_removal_module_name(rule);
                    final SubLObject query_static_properties = removal_known_antecedent_rule_static_properties(asent, rule, meta_store, list($NOT, name));
                    final SubLObject removal_inference = inference_utilities.new_continuable_antecedent_inference(asent, mt, rule, meta_store, query_static_properties);
                    final SubLObject transformed_problem = inference_datastructures_inference.inference_root_problem(removal_inference);
                    if ((NIL != transformed_problem) && (NIL != inference_datastructures_inference.simplest_inference_p(removal_inference))) {
                        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(removal_inference);
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

    public static final SubLObject removal_known_antecedent_rule_inference_alt(SubLObject sentence, SubLObject mt, SubLObject rule, SubLObject problem_store, SubLObject allowed_modules) {
        {
            SubLObject query_static_properties = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.removal_known_antecedent_rule_static_properties(sentence, rule, problem_store, allowed_modules);
            SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, query_static_properties);
            return inference;
        }
    }

    public static SubLObject removal_known_antecedent_rule_inference(final SubLObject sentence, final SubLObject mt, final SubLObject rule, final SubLObject problem_store, final SubLObject allowed_modules) {
        final SubLObject query_static_properties = removal_known_antecedent_rule_static_properties(sentence, rule, problem_store, allowed_modules);
        final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, query_static_properties);
        return inference;
    }

    public static final SubLObject removal_known_antecedent_rule_iterator_alt(SubLObject sentence, SubLObject rule, SubLObject allowed_modules) {
        {
            SubLObject problem_store = inference_worker.currently_active_problem_store();
            SubLObject query_static_properties = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.removal_known_antecedent_rule_static_properties(sentence, rule, problem_store, allowed_modules);
            SubLObject inference = inference_utilities.new_continuable_antecedent_inference(sentence, mt_relevance_macros.inference_relevant_mt(), rule, problem_store, query_static_properties);
            SubLObject query_dynamic_properties = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.removal_known_antecedent_rule_dynamic_properties(sentence);
            SubLObject iterator = inference_iterators.new_inference_iterator(inference, query_dynamic_properties, DESTROY_INFERENCE);
            return iterator;
        }
    }

    public static SubLObject removal_known_antecedent_rule_iterator(final SubLObject sentence, final SubLObject rule, final SubLObject allowed_modules) {
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        final SubLObject query_static_properties = removal_known_antecedent_rule_static_properties(sentence, rule, problem_store, allowed_modules);
        final SubLObject inference = inference_utilities.new_continuable_antecedent_inference(sentence, mt_relevance_macros.inference_relevant_mt(), rule, problem_store, query_static_properties);
        final SubLObject query_dynamic_properties = removal_known_antecedent_rule_dynamic_properties(sentence);
        final SubLObject iterator = inference_iterators.new_inference_iterator(inference, query_dynamic_properties, DESTROY_INFERENCE);
        return iterator;
    }

    public static final SubLObject removal_known_antecedent_rule_static_properties_alt(SubLObject sentence, SubLObject rule, SubLObject problem_store, SubLObject allowed_modules) {
        {
            SubLObject query_static_properties = list($PROBLEM_STORE, problem_store, $RESULT_UNIQUENESS, $PROOF, $ALLOWED_RULES, list(rule), $ALLOWED_MODULES, allowed_modules);
            return query_static_properties;
        }
    }

    public static SubLObject removal_known_antecedent_rule_static_properties(final SubLObject sentence, final SubLObject rule, final SubLObject problem_store, final SubLObject allowed_modules) {
        final SubLObject query_static_properties = list($PROBLEM_STORE, problem_store, $RESULT_UNIQUENESS, $PROOF, $ALLOWED_RULES, list(rule), $ALLOWED_MODULES, allowed_modules);
        return query_static_properties;
    }

    public static final SubLObject removal_known_antecedent_rule_dynamic_properties_alt(SubLObject sentence) {
        {
            SubLObject query_dynamic_properties = list(new SubLObject[]{ $CONTINUABLE_, NIL, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $RETURN, list($TEMPLATE, bq_cons(sentence, $list_alt31)), $ANSWER_LANGUAGE, $HL, $kw34$CACHE_INFERENCE_RESULTS_, NIL });
            return query_dynamic_properties;
        }
    }

    public static SubLObject removal_known_antecedent_rule_dynamic_properties(final SubLObject sentence) {
        final SubLObject query_dynamic_properties = list(new SubLObject[]{ $CONTINUABLE_, NIL, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $RETURN, list($TEMPLATE, bq_cons(sentence, $list31)), $ANSWER_LANGUAGE, $HL, $kw34$CACHE_INFERENCE_RESULTS_, NIL });
        return query_dynamic_properties;
    }

    public static final SubLObject note_hl_module_for_known_antecedent_rule_alt(SubLObject rule, SubLObject hl_module) {
        return dictionary.dictionary_enter($known_antecedent_rule_hl_module_index$.getGlobalValue(), rule, hl_module);
    }

    public static SubLObject note_hl_module_for_known_antecedent_rule(final SubLObject rule, final SubLObject hl_module) {
        return dictionary.dictionary_enter($known_antecedent_rule_hl_module_index$.getGlobalValue(), rule, hl_module);
    }

    public static final SubLObject clear_hl_module_for_known_antecedent_rule_alt(SubLObject rule) {
        return dictionary.dictionary_remove($known_antecedent_rule_hl_module_index$.getGlobalValue(), rule);
    }

    public static SubLObject clear_hl_module_for_known_antecedent_rule(final SubLObject rule) {
        return dictionary.dictionary_remove($known_antecedent_rule_hl_module_index$.getGlobalValue(), rule);
    }

    public static final SubLObject hl_module_for_known_antecedent_rule_alt(SubLObject rule) {
        return dictionary.dictionary_lookup($known_antecedent_rule_hl_module_index$.getGlobalValue(), rule, UNPROVIDED);
    }

    public static SubLObject hl_module_for_known_antecedent_rule(final SubLObject rule) {
        return dictionary.dictionary_lookup($known_antecedent_rule_hl_module_index$.getGlobalValue(), rule, UNPROVIDED);
    }

    public static final SubLObject known_antecedent_rule_hl_module_name_alt(SubLObject rule) {
        {
            SubLObject existing_hl_module = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule.hl_module_for_known_antecedent_rule(rule);
            if (NIL != existing_hl_module) {
                return inference_modules.hl_module_name(existing_hl_module);
            } else {
                {
                    SubLObject pos_lit = clauses.pos_lits(assertions_high.assertion_cnf(rule)).first();
                    SubLObject predicate = cycl_utilities.atomic_sentence_predicate(pos_lit);
                    SubLObject sense = $POS;
                    SubLObject string = cconcatenate(string_utilities.str(predicate), $via_known_antecedent_rule_string$.getGlobalValue());
                    return removal_module_utilities.determine_hl_module_name(string, sense);
                }
            }
        }
    }

    public static SubLObject known_antecedent_rule_hl_module_name(final SubLObject rule) {
        final SubLObject existing_hl_module = hl_module_for_known_antecedent_rule(rule);
        if (NIL != existing_hl_module) {
            return inference_modules.hl_module_name(existing_hl_module);
        }
        final SubLObject pos_lit = clauses.pos_lits(assertions_high.assertion_cnf(rule)).first();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(pos_lit);
        final SubLObject sense = $POS;
        final SubLObject string = cconcatenate(string_utilities.str(predicate), $via_known_antecedent_rule_string$.getGlobalValue());
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

    public static final SubLObject init_removal_modules_known_antecedent_rule_file_alt() {
        defvar("*KNOWN-ANTECEDENT-RULE-ENABLED?*", NIL);
        deflexical("*VIA-KNOWN-ANTECEDENT-RULE-STRING*", $str_alt1$_via_known_antecedent_rule);
        defparameter("*WITHIN-REMOVAL-KNOWN-ANTECEDENT-RULE-COST?*", NIL);
        deflexical("*KNOWN-ANTECEDENT-RULE-HL-MODULE-INDEX*", NIL != boundp($known_antecedent_rule_hl_module_index$) ? ((SubLObject) ($known_antecedent_rule_hl_module_index$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_removal_modules_known_antecedent_rule_file() {
        if (SubLFiles.USE_V1) {
            defvar("*KNOWN-ANTECEDENT-RULE-ENABLED?*", NIL);
            deflexical("*VIA-KNOWN-ANTECEDENT-RULE-STRING*", $str1$_via_known_antecedent_rule);
            defparameter("*WITHIN-REMOVAL-KNOWN-ANTECEDENT-RULE-COST?*", NIL);
            deflexical("*KNOWN-ANTECEDENT-RULE-HL-MODULE-INDEX*", SubLTrampolineFile.maybeDefault($known_antecedent_rule_hl_module_index$, $known_antecedent_rule_hl_module_index$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*KNOWN-ANTECEDENT-RULE-HL-MODULE-INDEX*", NIL != boundp($known_antecedent_rule_hl_module_index$) ? ((SubLObject) ($known_antecedent_rule_hl_module_index$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_removal_modules_known_antecedent_rule_file_Previous() {
        defvar("*KNOWN-ANTECEDENT-RULE-ENABLED?*", NIL);
        deflexical("*VIA-KNOWN-ANTECEDENT-RULE-STRING*", $str1$_via_known_antecedent_rule);
        defparameter("*WITHIN-REMOVAL-KNOWN-ANTECEDENT-RULE-COST?*", NIL);
        deflexical("*KNOWN-ANTECEDENT-RULE-HL-MODULE-INDEX*", SubLTrampolineFile.maybeDefault($known_antecedent_rule_hl_module_index$, $known_antecedent_rule_hl_module_index$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_removal_modules_known_antecedent_rule_file() {
        declare_defglobal($known_antecedent_rule_hl_module_index$);
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
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$__knownAntecedentRule_support_is_ = makeString("#$knownAntecedentRule support is disabled.  Asserting #$knownAntecedentRule on ~s will have no effect.~%");

    static private final SubLString $str_alt1$_via_known_antecedent_rule = makeString("-via-known-antecedent-rule");

    static private final SubLString $str_alt3$__knownAntecedentRule_currently_o = makeString("#$knownAntecedentRule currently only applies to rules with exactly one poslit, but was applied to ~s");

    static private final SubLString $str_alt4$__knownAntecedentRule_cannot_hand = makeString("#$knownAntecedentRule cannot handle poslits with sequence variables, but was applied to ~s");

    static private final SubLString $str_alt8$__knownAntecedentRule_currently_o = makeString("#$knownAntecedentRule currently only applies to rules with a fort as the predicate of their single pos-lit, but was applied to ~s");

    static private final SubLList $list_alt31 = list(makeKeyword("SUPPORTS"));
}

/**
 * Total time: 113 ms
 */
