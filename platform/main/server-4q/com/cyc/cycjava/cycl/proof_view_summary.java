package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class proof_view_summary extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new proof_view_summary();

    public static final String myName = "com.cyc.cycjava_2.cycl.proof_view_summary";


    // defparameter
    public static final SubLSymbol $proof_view_show_abductions_in_proof_summaryP$ = makeSymbol("*PROOF-VIEW-SHOW-ABDUCTIONS-IN-PROOF-SUMMARY?*");

    // defparameter
    public static final SubLSymbol $disprefer_hypothetical_terms_in_proof_view_summariesP$ = makeSymbol("*DISPREFER-HYPOTHETICAL-TERMS-IN-PROOF-VIEW-SUMMARIES?*");

    // defparameter
    public static final SubLSymbol $proof_view_seen_entries$ = makeSymbol("*PROOF-VIEW-SEEN-ENTRIES*");

    // defparameter
    public static final SubLSymbol $proof_view_track_seen_entriesP$ = makeSymbol("*PROOF-VIEW-TRACK-SEEN-ENTRIES?*");

    // defparameter
    public static final SubLSymbol $proof_view_use_new_because_section_algorithmP$ = makeSymbol("*PROOF-VIEW-USE-NEW-BECAUSE-SECTION-ALGORITHM?*");

    // deflexical
    private static final SubLSymbol $bad_proof_view_rules$ = makeSymbol("*BAD-PROOF-VIEW-RULES*");

    private static final SubLSymbol GET_PROOF_VIEW_INCLUDE_SUMMARY = makeSymbol("GET-PROOF-VIEW-INCLUDE-SUMMARY");

    private static final SubLSymbol SET_PROOF_VIEW_INCLUDE_SUMMARY = makeSymbol("SET-PROOF-VIEW-INCLUDE-SUMMARY");

    private static final SubLSymbol GET_PROOF_VIEW_SUMMARY_ALGORITHM = makeSymbol("GET-PROOF-VIEW-SUMMARY-ALGORITHM");

    private static final SubLSymbol SET_PROOF_VIEW_SUMMARY_ALGORITHM = makeSymbol("SET-PROOF-VIEW-SUMMARY-ALGORITHM");

    private static final SubLSymbol $kw4$INCLUDE_SUMMARY_SECTION_ = makeKeyword("INCLUDE-SUMMARY-SECTION?");



    private static final SubLSymbol $SUMMARY_ROOT = makeKeyword("SUMMARY-ROOT");

    private static final SubLString $str7$proof_view_summary = makeString("proof-view-summary");

    private static final SubLSymbol $SUMMARY_ALGORITHM = makeKeyword("SUMMARY-ALGORITHM");



    private static final SubLString $str10$Can_t_find_a_sentence_from__S = makeString("Can't find a sentence from ~S");

    private static final SubLString $str11$__Got__D_support__p_for__S__ = makeString("~&Got ~D support~:p for ~S~%");

    private static final SubLSymbol $sym12$PROOF_VIEW_SUMMARY_ITEM_SUBSUMES_ = makeSymbol("PROOF-VIEW-SUMMARY-ITEM-SUBSUMES?");

    private static final SubLSymbol PROOF_VIEW_ENTRY_GET_OBJECT = makeSymbol("PROOF-VIEW-ENTRY-GET-OBJECT");

    private static final SubLString $str14$__Got__D_summary_item_candidates_ = makeString("~&Got ~D summary item candidates.~%");

    private static final SubLSymbol $sym15$_EXIT = makeSymbol("%EXIT");

    private static final SubLObject $$causes_PropProp = reader_make_constant_shell(makeString("causes-PropProp"));

    private static final SubLString $str17$Invalid_summary_item___S = makeString("Invalid summary item: ~S");

    private static final SubLString $str18$Filtering_summary_item___S = makeString("Filtering summary item: ~S");

    private static final SubLString $str19$__Because__D__Adding__S__ = makeString("~&Because ~D: Adding ~S~%");



    private static final SubLString $str21$Already_seen__S = makeString("Already seen ~S");

    private static final SubLSymbol $WHITELIST = makeKeyword("WHITELIST");

    private static final SubLSymbol $sym23$PROOF_VIEW_NON_TRIVIAL_RULE_SUPPORT_ENTRY_UNSUITABLE_FOR_SUMMARY_ = makeSymbol("PROOF-VIEW-NON-TRIVIAL-RULE-SUPPORT-ENTRY-UNSUITABLE-FOR-SUMMARY?");

    private static final SubLString $str24$Using_rule_conclusion___S = makeString("Using rule conclusion: ~S");

    private static final SubLString $str25$Not_descending_into_transitive_su = makeString("Not descending into transitive support ~S");



    private static final SubLString $str27$Not_descending_into_eval_support_ = makeString("Not descending into eval support ~S");

    private static final SubLString $str28$__Filtering__S__so_using_children = makeString("~&Filtering ~S, so using children.~%");

    private static final SubLString $str29$__Entire_support_tree_pruned_unde = makeString("~&Entire support tree pruned under~% ~S~%");

    private static final SubLString $str30$__Because__D__Attempting__because = makeString("~&Because ~D: Attempting 'because' strengthening for ~S~%");

    private static final SubLString $str31$__Because__D__Got__D_child_suppor = makeString("~&Because ~D: Got ~D child support~:p.~%");

    private static final SubLString $str32$__Inheriting__because__support_fr = makeString("~&Inheriting 'because' support from child.~%");



    private static final SubLSymbol PROOF_VIEW_SUMMARY_ITEM_SENTENCE = makeSymbol("PROOF-VIEW-SUMMARY-ITEM-SENTENCE");

    private static final SubLSymbol CAUSATION_SENTENCE_P = makeSymbol("CAUSATION-SENTENCE-P");

    private static final SubLSymbol CAUSATION_SENTENCE_EFFECT = makeSymbol("CAUSATION-SENTENCE-EFFECT");

    private static final SubLString $str37$__Adding_causation_sentence_____S = makeString("~&Adding causation sentence:~% ~S~%");

    private static final SubLString $str38$__Passing_over__S___down_to__S__ = makeString("~&Passing over ~S~% down to ~S~%");

    private static final SubLString $str39$__Adding_summary_object__S___ = makeString("~&Adding summary object ~S.~%");

    private static final SubLSymbol PROOF_VIEW_P = makeSymbol("PROOF-VIEW-P");

    private static final SubLSymbol $kw41$ALLOW_BECAUSE_STRENGTHENING_ = makeKeyword("ALLOW-BECAUSE-STRENGTHENING?");



    private static final SubLString $str43$Expanding_entry__D__S____S = makeString("Expanding entry ~D ~S~% ~S");

    private static final SubLString $str44$Filtering__S__despite_no_child_fa = makeString("Filtering ~S, despite no child facts.");

    private static final SubLString $str45$No_child_facts_for__S = makeString("No child facts for ~S");

    private static final SubLSymbol $sym46$PROOF_VIEW_FACT_IMPLIES_ = makeSymbol("PROOF-VIEW-FACT-IMPLIES?");

    private static final SubLSymbol $sym47$PROOF_VIEW_FACT_REFERENCES_HYPOTHETICAL_ = makeSymbol("PROOF-VIEW-FACT-REFERENCES-HYPOTHETICAL?");

    private static final SubLSymbol HYPOTHETICAL_TERM_P = makeSymbol("HYPOTHETICAL-TERM-P");

    private static final SubLSymbol $sym49$FILTER_PROOF_VIEW_ENTRY_SUMMARY_ITEM_ = makeSymbol("FILTER-PROOF-VIEW-ENTRY-SUMMARY-ITEM?");

    private static final SubLString $str50$Trivial_support___S = makeString("Trivial support: ~S");

    private static final SubLString $str51$Trivial_support_for_answer___S = makeString("Trivial support for answer: ~S");

    private static final SubLString $str52$Assertion_on_hypothetical___S = makeString("Assertion on hypothetical: ~S");

    private static final SubLString $str53$Trivial_sentence___S__ = makeString("Trivial sentence: ~S~%");

    private static final SubLString $str54$Non_THCL___S = makeString("Non-THCL: ~S");

    private static final SubLString $str55$__WHITELIST__Allowing__S__ = makeString("~&WHITELIST: Allowing ~S~%");

    private static final SubLString $str56$___S_has_a_highly_relevant_predic = makeString("~&~S has a highly relevant predicate.~%");

    private static final SubLObject $const57$assertionRequiredForJustification = reader_make_constant_shell(makeString("assertionRequiredForJustificationParaphrase"));

    private static final SubLString $str58$___S_is_a_required_assertion___ = makeString("~&~S is a required assertion.~%");

    private static final SubLString $str59$WHITELIST__Filtering__S = makeString("WHITELIST: Filtering ~S");

    public static SubLObject get_proof_view_include_summary(final SubLObject proof_view_id) {
        return proof_view_get_include_summary_sectionP(proof_view.find_proof_view_by_id(proof_view_id));
    }

    public static SubLObject set_proof_view_include_summary(final SubLObject proof_view_id, final SubLObject bool) {
        proof_view_set_include_summary_sectionP(proof_view.find_proof_view_by_id(proof_view_id), bool);
        return T;
    }

    public static SubLObject get_proof_view_summary_algorithm(final SubLObject proof_view_id) {
        return proof_view_get_summary_algorithm(proof_view.find_proof_view_by_id(proof_view_id));
    }

    public static SubLObject set_proof_view_summary_algorithm(final SubLObject proof_view_id, final SubLObject algorithm) {
        proof_view_set_summary_algorithm(proof_view.find_proof_view_by_id(proof_view_id), algorithm);
        return T;
    }

    public static SubLObject proof_view_get_include_summary_sectionP(final SubLObject v_proof_view) {
        return proof_view.proof_view_get_property(v_proof_view, $kw4$INCLUDE_SUMMARY_SECTION_, T);
    }

    public static SubLObject proof_view_set_include_summary_sectionP(final SubLObject v_proof_view, final SubLObject include_summary_sectionP) {
        assert NIL != booleanp(include_summary_sectionP) : "Types.booleanp(include_summary_sectionP) " + "CommonSymbols.NIL != Types.booleanp(include_summary_sectionP) " + include_summary_sectionP;
        return proof_view.proof_view_set_property(v_proof_view, $kw4$INCLUDE_SUMMARY_SECTION_, include_summary_sectionP);
    }

    public static SubLObject proof_view_get_include_summary_sourcesP(final SubLObject v_proof_view) {
        final SubLObject spec = proof_view.proof_view_get_include_sourcesP(v_proof_view);
        return list_utilities.sublisp_boolean(spec);
    }

    public static SubLObject output_proof_view_summary_in_xml(final SubLObject v_proof_view) {
        proof_view.output_proof_view_section_in_xml(v_proof_view, $SUMMARY_ROOT, $str7$proof_view_summary);
        return v_proof_view;
    }

    public static SubLObject proof_view_get_summary_root(final SubLObject v_proof_view) {
        return proof_view.proof_view_get_property(v_proof_view, $SUMMARY_ROOT, UNPROVIDED);
    }

    public static SubLObject proof_view_get_summary_algorithm(final SubLObject v_proof_view) {
        return proof_view.proof_view_get_property(v_proof_view, $SUMMARY_ALGORITHM, $DEFAULT);
    }

    public static SubLObject proof_view_set_summary_algorithm(final SubLObject v_proof_view, final SubLObject algorithm) {
        return proof_view.proof_view_set_property(v_proof_view, $SUMMARY_ALGORITHM, algorithm);
    }

    public static SubLObject proof_view_get_summary_entries(final SubLObject v_proof_view) {
        final SubLObject root = proof_view_get_summary_root(v_proof_view);
        return NIL != proof_view.proof_view_entry_p(root) ? proof_view.proof_view_entry_get_children(root) : NIL;
    }

    public static SubLObject proof_view_summary_item_sentence(final SubLObject item) {
        if (NIL != arguments.support_p(item)) {
            return cycl_utilities.hl_to_el(arguments.support_sentence(item));
        }
        if (NIL != cycl_grammar.cycl_sentence_p(item)) {
            return cycl_utilities.hl_to_el(item);
        }
        Errors.error($str10$Can_t_find_a_sentence_from__S, item);
        return NIL;
    }

    public static SubLObject proof_view_has_summary_sectionP(final SubLObject v_proof_view) {
        return proof_view.proof_view_has_sectionP(v_proof_view, $SUMMARY_ROOT);
    }

    public static SubLObject proof_view_maybe_remove_inference_proof_summary_root(final SubLObject v_proof_view) {
        final SubLObject facts_used_section_root = proof_view_get_summary_root(v_proof_view);
        if (((NIL != facts_used_section_root) && (NIL == proof_view.proof_view_entry_get_children(facts_used_section_root))) && (NIL != proof_view.proof_view_has_justification_sectionP(v_proof_view))) {
            proof_view_populator.proof_view_remove_entry(v_proof_view, facts_used_section_root);
            proof_view_populator.proof_view_rem_property(v_proof_view, $SUMMARY_ROOT);
        }
        return v_proof_view;
    }

    public static SubLObject proof_view_flesh_out_inference_proof_summary(final SubLObject v_proof_view, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_vars.$pph_proof_show_facts_usedP$.getDynamicValue(thread)) {
            final SubLObject summary_items = proof_view_get_proof_summary_items(v_proof_view);
            final SubLObject minimum_worth_showing = ONE_INTEGER;
            if (NIL != list_utilities.lengthGE(summary_items, minimum_worth_showing, UNPROVIDED)) {
                final SubLObject facts_used_section_root = proof_view_get_summary_root(v_proof_view);
                SubLObject cdolist_list_var = proof_view_populator.proof_view_sort_entries_to_maximize_coherence(v_proof_view, mt, summary_items);
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    proof_view_populator.proof_view_add_fact_used(v_proof_view, facts_used_section_root, proof_view.proof_view_entry_get_object(item), mt);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
                proof_view_populator.proof_view_entry_note_expand_initially(facts_used_section_root);
            }
        }
        return v_proof_view;
    }

    public static SubLObject proof_view_add_inference_proof_summary_root(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject root = proof_view_populator.proof_view_add_section_root(v_proof_view, proof_view.$proof_view_facts_used_label$.getDynamicValue(thread));
        proof_view.proof_view_set_property(v_proof_view, $SUMMARY_ROOT, root);
        return root;
    }

    public static SubLObject proof_view_summary_item_candidates(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject justification_root_entry = proof_view_populator.proof_view_get_justification_root_entry(v_proof_view);
        final SubLObject _prev_bind_0 = $proof_view_seen_entries$.currentBinding(thread);
        try {
            $proof_view_seen_entries$.bind(NIL != misc_utilities.initialized_p($proof_view_seen_entries$.getDynamicValue(thread)) ? $proof_view_seen_entries$.getDynamicValue(thread) : set.new_set(UNPROVIDED, UNPROVIDED), thread);
            SubLObject summary_entries = NIL;
            final SubLObject local_state;
            final SubLObject state = local_state = proof_view.find_proof_view_memoization_state(v_proof_view);
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL != justification_root_entry) {
                        SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children(justification_root_entry);
                        SubLObject child = NIL;
                        child = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject child_summary_entries = proof_view_entry_summary_items(child);
                            if (NIL != child_summary_entries) {
                                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                                    format_nil.force_format(T, $str11$__Got__D_support__p_for__S__, length(child_summary_entries), child, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                summary_entries = append(summary_entries, child_summary_entries);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            child = cdolist_list_var.first();
                        } 
                    }
                    summary_entries = list_utilities.delete_subsumed_items(summary_entries, $sym12$PROOF_VIEW_SUMMARY_ITEM_SUBSUMES_, PROOF_VIEW_ENTRY_GET_OBJECT);
                } finally {
                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str14$__Got__D_summary_item_candidates_, length(summary_entries), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return summary_entries;
        } finally {
            $proof_view_seen_entries$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject proof_view_summary_item_subsumesP(final SubLObject item1, final SubLObject item2) {
        final SubLObject sentence1 = proof_view_summary_item_sentence(item1);
        final SubLObject sentence2 = proof_view_summary_item_sentence(item2);
        if (proof_view_summary_item_sentence(sentence1).equal(proof_view_summary_item_sentence(sentence2))) {
            return T;
        }
        if (NIL == el_formula_with_operator_p(sentence1, $$causes_PropProp)) {
            return NIL;
        }
        final SubLObject cause = cycl_utilities.formula_arg1(sentence1, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject causes = cdolist_list_var = (NIL != el_conjunction_p(cause)) ? cycl_utilities.formula_args(cause, UNPROVIDED) : list(cause);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != proof_view_summary_item_subsumesP(conjunct, sentence2)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        if (NIL != proof_view_summary_item_subsumesP(cycl_utilities.formula_arg2(sentence1, UNPROVIDED), sentence2)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject maybe_add_proof_view_entry_summary_item(final SubLObject item, SubLObject supports, final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == valid_proof_view_entry_summary_item_p(item)) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str17$Invalid_summary_item___S, item);
            }
        } else
            if (NIL != filter_proof_view_entry_summary_itemP(item, entry)) {
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn($str18$Filtering_summary_item___S, item);
                }
            } else
                if ((NIL != cycl_grammar.cycl_sentence_p(item)) && $$causes_PropProp.eql(cycl_utilities.formula_arg0(item))) {
                    if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        format_nil.force_format(T, $str19$__Because__D__Adding__S__, proof_view.proof_view_entry_get_id(entry), item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    supports = add_proof_view_entry_summary_item(item, supports, entry);
                } else {
                    SubLObject cdolist_list_var = proof_view_entry_summary_items_post_filter_check(entry, item, UNPROVIDED);
                    SubLObject sub_entry = NIL;
                    sub_entry = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject item_var = sub_entry;
                        if (NIL == member(item_var, supports, symbol_function(EQUAL), PROOF_VIEW_ENTRY_GET_OBJECT)) {
                            supports = cons(item_var, supports);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        sub_entry = cdolist_list_var.first();
                    } 
                }


        return supports;
    }

    public static SubLObject add_proof_view_entry_summary_item(final SubLObject item, SubLObject supports, final SubLObject entry) {
        if (NIL != el_conjunction_p(item)) {
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(item, $IGNORE);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                add_proof_view_entry_summary_item(conjunct, supports, entry);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
        } else
            if (NIL == member(entry, supports, symbol_function(EQUAL), PROOF_VIEW_ENTRY_GET_OBJECT)) {
                supports = cons(entry, supports);
            }

        return supports;
    }

    public static SubLObject proof_view_entry_summary_items(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        if ((NIL == $proof_view_track_seen_entriesP$.getDynamicValue(thread)) || (NIL != set.set_add(entry, $proof_view_seen_entries$.getDynamicValue(thread)))) {
            supports = proof_view_entry_summary_items_int(entry);
        } else
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str21$Already_seen__S, entry);
            }

        return supports;
    }

    public static SubLObject proof_view_entry_summary_items_int(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_object = proof_view.proof_view_entry_get_object(entry);
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(entry);
        final SubLObject filter_objectP = makeBoolean((NIL == valid_proof_view_entry_summary_item_p(v_object)) || (NIL != filter_proof_view_entry_summary_itemP(v_object, entry)));
        SubLObject supports = NIL;
        if ($WHITELIST.eql(proof_view_get_summary_algorithm(v_proof_view))) {
            supports = proof_view_entry_summary_items_post_filter_check(entry, v_object, filter_objectP);
        } else
            if (NIL != proof_view.proof_view_rule_support_entryP(entry)) {
                supports = maybe_add_proof_view_entry_summary_item(v_object, supports, entry);
            } else
                if (((NIL != find_if($sym23$PROOF_VIEW_NON_TRIVIAL_RULE_SUPPORT_ENTRY_UNSUITABLE_FOR_SUMMARY_, proof_view.proof_view_entry_get_children(entry), UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == filter_objectP)) && (NIL == proof_view.proof_view_fact_trivially_implies_proof_conclusionP(v_object, proof_view.proof_view_entry_get_proof_view(entry), UNPROVIDED))) {
                    if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        Errors.warn($str24$Using_rule_conclusion___S, v_object);
                    }
                    supports = maybe_add_proof_view_entry_summary_item(v_object, supports, entry);
                } else
                    if (((NIL != proof_view.proof_view_transitive_support_p(v_object)) && (NIL == proof_view.proof_view_fact_trivially_implies_proof_conclusionP(v_object, proof_view.proof_view_entry_get_proof_view(entry), T))) && (NIL == proof_view_fact_references_hypotheticalP(v_object))) {
                        if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                            Errors.warn($str25$Not_descending_into_transitive_su, v_object);
                        }
                        if (NIL == filter_objectP) {
                            supports = maybe_add_proof_view_entry_summary_item(v_object, supports, entry);
                        }
                    } else
                        if (((NIL != arguments.support_p(v_object)) && $EVAL.eql(arguments.support_module(v_object))) && (NIL == proof_view.proof_view_fact_trivially_implies_proof_conclusionP(v_object, proof_view.proof_view_entry_get_proof_view(entry), T))) {
                            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                                Errors.warn($str27$Not_descending_into_eval_support_, v_object);
                            }
                            if (NIL == filter_objectP) {
                                supports = maybe_add_proof_view_entry_summary_item(v_object, supports, entry);
                            }
                        } else {
                            supports = proof_view_entry_summary_items_from_children(entry, v_object, filter_objectP);
                        }




        return supports;
    }

    public static SubLObject proof_view_entry_summary_items_post_filter_check(final SubLObject entry, final SubLObject v_object, SubLObject filter_objectP) {
        if (filter_objectP == UNPROVIDED) {
            filter_objectP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(entry);
        final SubLObject child_supports = proof_view_entry_summary_items_from_children(entry, v_object, filter_objectP);
        if (NIL != filter_objectP) {
            if (NIL != child_supports) {
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format(T, $str28$__Filtering__S__so_using_children, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn($str29$__Entire_support_tree_pruned_unde, v_object);
                }

            return child_supports;
        }
        if ((NIL != allow_because_strengthening_for_proof_view_summary_itemP(v_object, entry)) && (NIL != list_utilities.non_empty_list_p(child_supports))) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str30$__Because__D__Attempting__because, proof_view.proof_view_entry_get_id(entry), v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str31$__Because__D__Got__D_child_suppor, proof_view.proof_view_entry_get_id(entry), length(child_supports), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((NIL != list_utilities.singletonP(child_supports)) && $$causes_PropProp.eql(cycl_utilities.formula_arg0(proof_view.proof_view_entry_get_object(list_utilities.only_one(child_supports))))) {
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format(T, $str32$__Inheriting__because__support_fr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return child_supports;
            }
            if (((NIL != list_utilities.lengthGE(child_supports, ONE_INTEGER, UNPROVIDED)) && (NIL != list_utilities.lengthLE(child_supports, TWO_INTEGER, UNPROVIDED))) && (NIL == list_utilities.find_if_not(CYCL_SENTENCE_P, child_supports, PROOF_VIEW_ENTRY_GET_OBJECT, UNPROVIDED, UNPROVIDED))) {
                SubLObject cause = cycl_utilities.hl_to_el(NIL != list_utilities.singletonP(child_supports) ? proof_view_summary_item_sentence(proof_view.proof_view_entry_get_object(list_utilities.only_one(child_supports))) : simplifier.conjoin(Mapping.mapcar(PROOF_VIEW_SUMMARY_ITEM_SENTENCE, Mapping.mapcar(PROOF_VIEW_ENTRY_GET_OBJECT, child_supports)), UNPROVIDED));
                final SubLObject effect = cycl_utilities.hl_to_el(proof_view_summary_item_sentence(v_object));
                cause = cycl_utilities.expression_transform(cause, CAUSATION_SENTENCE_P, CAUSATION_SENTENCE_EFFECT, UNPROVIDED, UNPROVIDED);
                if (NIL == equals.equalsP(cause, effect, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject complex_sentence = make_binary_formula($$causes_PropProp, cause, effect);
                    final SubLObject throwaway_entry = proof_view_populator.new_proof_view_entry(v_proof_view, complex_sentence);
                    proof_view.proof_view_entry_set_proof(throwaway_entry, proof_view.proof_view_entry_get_proof(entry, T));
                    if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        format_nil.force_format(T, $str37$__Adding_causation_sentence_____S, complex_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return list(throwaway_entry);
                }
            }
        }
        if (NIL != list_utilities.singletonP(child_supports)) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str38$__Passing_over__S___down_to__S__, v_object, proof_view.proof_view_entry_get_object(list_utilities.only_one(child_supports)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return child_supports;
        }
        if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            format_nil.force_format(T, $str39$__Adding_summary_object__S___, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return add_proof_view_entry_summary_item(v_object, NIL, entry);
    }

    public static SubLObject causation_sentence_p(final SubLObject obj) {
        return el_formula_with_operator_p(obj, $$causes_PropProp);
    }

    public static SubLObject causation_sentence_effect(final SubLObject c_sent) {
        return cycl_utilities.atomic_sentence_arg2(c_sent, UNPROVIDED);
    }

    public static SubLObject allow_because_strengthening_for_proof_view_summary_itemP(final SubLObject v_object, final SubLObject entry) {
        return proof_view_entry_get_allow_because_strengtheningP(entry);
    }

    public static SubLObject proof_view_entry_get_allow_because_strengtheningP(final SubLObject entry) {
        return proof_view_get_allow_because_strengtheningP(proof_view.proof_view_entry_get_proof_view(entry));
    }

    public static SubLObject proof_view_get_allow_because_strengtheningP(final SubLObject v_proof_view) {
        assert NIL != proof_view.proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
        return proof_view.proof_view_get_property(v_proof_view, $kw41$ALLOW_BECAUSE_STRENGTHENING_, T);
    }

    public static SubLObject proof_view_set_allow_because_strengtheningP(final SubLObject v_proof_view, final SubLObject bool) {
        assert NIL != proof_view.proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
        return proof_view.proof_view_set_property(v_proof_view, $kw41$ALLOW_BECAUSE_STRENGTHENING_, bool);
    }

    public static SubLObject proof_view_entry_summary_items_from_children(final SubLObject entry, final SubLObject v_object, final SubLObject filter_objectP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indexed_child_items = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject supports = NIL;
        SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children(entry);
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary.dictionary_enter(indexed_child_items, child, proof_view_entry_summary_items(child));
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        final SubLObject child_items = (NIL != dictionary.dictionary_empty_p(indexed_child_items)) ? NIL : remove_duplicates(apply(CCONCATENATE, dictionary.dictionary_values(indexed_child_items)), symbol_function(EQUAL), symbol_function(PROOF_VIEW_ENTRY_GET_OBJECT), UNPROVIDED, UNPROVIDED);
        if ((NIL != list_utilities.non_empty_list_p(child_items)) && ((NIL == list_utilities.singletonP(child_items)) || (!proof_view.proof_view_entry_get_object(list_utilities.only_one(child_items)).equal(v_object)))) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str43$Expanding_entry__D__S____S, proof_view.proof_view_entry_get_id(entry), proof_view.proof_view_fact_sentence(v_object), Mapping.mapcar(PROOF_VIEW_ENTRY_GET_OBJECT, child_items));
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(indexed_child_items)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject this_child_items = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var2 = this_child_items;
                SubLObject child_item = NIL;
                child_item = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    supports = maybe_add_proof_view_entry_summary_item(proof_view.proof_view_entry_get_object(child_item), supports, child_item);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    child_item = cdolist_list_var2.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        } else
            if (NIL != filter_objectP) {
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn($str44$Filtering__S__despite_no_child_fa, v_object);
                }
            } else {
                if ((NIL != list_utilities.empty_list_p(child_items)) && (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread))) {
                    Errors.warn($str45$No_child_facts_for__S, v_object);
                }
                supports = add_proof_view_entry_summary_item(v_object, supports, entry);
            }

        return supports;
    }

    public static SubLObject proof_view_get_proof_summary_items(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_fact_entries = proof_view_summary_item_candidates(v_proof_view);
        final SubLObject unsubsumed = list_utilities.delete_subsumed_items(all_fact_entries, $sym46$PROOF_VIEW_FACT_IMPLIES_, PROOF_VIEW_ENTRY_GET_OBJECT);
        final SubLObject non_hypothetical = (NIL != $disprefer_hypothetical_terms_in_proof_view_summariesP$.getDynamicValue(thread)) ? remove_if($sym47$PROOF_VIEW_FACT_REFERENCES_HYPOTHETICAL_, unsubsumed, PROOF_VIEW_ENTRY_GET_OBJECT, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        return NIL != non_hypothetical ? non_hypothetical : unsubsumed;
    }

    public static SubLObject proof_view_fact_references_hypotheticalP(final SubLObject fact) {
        return cycl_utilities.expression_find_if(HYPOTHETICAL_TERM_P, proof_view.proof_view_fact_sentence(fact), T, UNPROVIDED);
    }

    public static SubLObject valid_proof_view_entry_summary_item_p(final SubLObject v_object) {
        if ((NIL == arguments.support_p(v_object)) && (NIL == cycl_grammar.cycl_sentence_p(v_object))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject filter_proof_view_entry_summary_itemP_internal(final SubLObject item, final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(entry);
        if ($WHITELIST.eql(proof_view_get_summary_algorithm(v_proof_view))) {
            return proof_view_item_fails_summary_whitelist_testP(v_proof_view, item);
        }
        if ((NIL != proof_view_get_include_summary_sourcesP(v_proof_view)) && ((NIL != proof_view.proof_view_entry_get_sources(entry)) || ((NIL != assertion_handles.assertion_p(item)) && (NIL != sources.assertion_sourcedP(item))))) {
            return NIL;
        }
        if ((NIL != assertion_handles.assertion_p(item)) && (NIL != pph_methods.pph_assertion_has_glossP(item))) {
            return NIL;
        }
        if ((NIL != arguments.support_p(item)) && (NIL != pph_proof.pph_support_trivialP(item, UNPROVIDED))) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str50$Trivial_support___S, item);
            }
            return T;
        }
        if (NIL != proof_view.proof_view_fact_trivially_implies_proof_conclusionP(item, proof_view.proof_view_entry_get_proof_view(entry), UNPROVIDED)) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str51$Trivial_support_for_answer___S, item);
            }
            return T;
        }
        if (((NIL != assertion_handles.assertion_p(item)) && (NIL != assertions_high.asserted_assertionP(item))) && (NIL != proof_view_fact_references_hypotheticalP(item))) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str52$Assertion_on_hypothetical___S, item);
            }
            return T;
        }
        if ((NIL != el_grammar.el_sentence_p(item)) && (NIL != pph_proof.pph_trivial_sentenceP(item, UNPROVIDED))) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str53$Trivial_sentence___S__, item);
            }
            return T;
        }
        if (NIL != proof_view.proof_view_rule_support_entryP(entry)) {
            return proof_view_rule_support_entry_unsuitable_for_summaryP(entry);
        }
        if (NIL == thcl.thcl_formulaP(narts_high.nart_substitute(proof_view.proof_view_fact_sentence(item)), NIL)) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str54$Non_THCL___S, item);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject filter_proof_view_entry_summary_itemP(final SubLObject item, final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return filter_proof_view_entry_summary_itemP_internal(item, entry);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym49$FILTER_PROOF_VIEW_ENTRY_SUMMARY_ITEM_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym49$FILTER_PROOF_VIEW_ENTRY_SUMMARY_ITEM_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym49$FILTER_PROOF_VIEW_ENTRY_SUMMARY_ITEM_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(item, entry);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (item.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && entry.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(filter_proof_view_entry_summary_itemP_internal(item, entry)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(item, entry));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject proof_view_item_fails_summary_whitelist_testP(final SubLObject v_proof_view, final SubLObject item) {
        return makeBoolean(NIL == proof_view_item_passes_summary_whitelist_testP(v_proof_view, item));
    }

    public static SubLObject proof_view_item_passes_summary_whitelist_testP(final SubLObject v_proof_view, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(proof_view.proof_view_get_domain_mt(v_proof_view));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != cycl_grammar.cycl_sentence_p(item)) && $$causes_PropProp.eql(cycl_utilities.formula_arg0(item))) {
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format(T, $str55$__WHITELIST__Allowing__S__, item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return T;
            }
            if ((NIL != valid_proof_view_entry_summary_item_p(item)) && (NIL != pph_proof.pph_justification_pred_highly_relevantP(cycl_utilities.formula_arg0(proof_view_summary_item_sentence(item)), proof_view.proof_view_get_domain_mt(v_proof_view)))) {
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format(T, $str56$___S_has_a_highly_relevant_predic, item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return T;
            }
            if ((NIL != assertion_handles.assertion_p(item)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(item, $const57$assertionRequiredForJustification, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format(T, $str58$___S_is_a_required_assertion___, item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return T;
            }
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str59$WHITELIST__Filtering__S, item);
            }
            return NIL;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject proof_view_rule_support_entry_unsuitable_for_summaryP(final SubLObject entry) {
        if (NIL != proof_view.proof_view_rule_support_entryP(entry)) {
            final SubLObject rule = proof_view.proof_view_entry_get_object(entry);
            if ((NIL != pph_proof.pph_support_trivialP(rule, UNPROVIDED)) || (NIL == pph_methods.pph_assertion_has_glossP(rule))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject proof_view_non_trivial_rule_support_entry_unsuitable_for_summaryP(final SubLObject entry) {
        if (NIL != proof_view.proof_view_rule_support_entryP(entry)) {
            final SubLObject rule = proof_view.proof_view_entry_get_object(entry);
            if ((NIL == pph_proof.pph_support_trivialP(rule, UNPROVIDED)) && (NIL == pph_methods.pph_assertion_has_glossP(rule))) {
                final SubLObject item_var = rule;
                if (NIL == member(item_var, $bad_proof_view_rules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $bad_proof_view_rules$.setGlobalValue(cons(item_var, $bad_proof_view_rules$.getGlobalValue()));
                }
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject declare_proof_view_summary_file() {
        declareFunction("get_proof_view_include_summary", "GET-PROOF-VIEW-INCLUDE-SUMMARY", 1, 0, false);
        declareFunction("set_proof_view_include_summary", "SET-PROOF-VIEW-INCLUDE-SUMMARY", 2, 0, false);
        declareFunction("get_proof_view_summary_algorithm", "GET-PROOF-VIEW-SUMMARY-ALGORITHM", 1, 0, false);
        declareFunction("set_proof_view_summary_algorithm", "SET-PROOF-VIEW-SUMMARY-ALGORITHM", 2, 0, false);
        declareFunction("proof_view_get_include_summary_sectionP", "PROOF-VIEW-GET-INCLUDE-SUMMARY-SECTION?", 1, 0, false);
        declareFunction("proof_view_set_include_summary_sectionP", "PROOF-VIEW-SET-INCLUDE-SUMMARY-SECTION?", 2, 0, false);
        declareFunction("proof_view_get_include_summary_sourcesP", "PROOF-VIEW-GET-INCLUDE-SUMMARY-SOURCES?", 1, 0, false);
        declareFunction("output_proof_view_summary_in_xml", "OUTPUT-PROOF-VIEW-SUMMARY-IN-XML", 1, 0, false);
        declareFunction("proof_view_get_summary_root", "PROOF-VIEW-GET-SUMMARY-ROOT", 1, 0, false);
        declareFunction("proof_view_get_summary_algorithm", "PROOF-VIEW-GET-SUMMARY-ALGORITHM", 1, 0, false);
        declareFunction("proof_view_set_summary_algorithm", "PROOF-VIEW-SET-SUMMARY-ALGORITHM", 2, 0, false);
        declareFunction("proof_view_get_summary_entries", "PROOF-VIEW-GET-SUMMARY-ENTRIES", 1, 0, false);
        declareFunction("proof_view_summary_item_sentence", "PROOF-VIEW-SUMMARY-ITEM-SENTENCE", 1, 0, false);
        declareFunction("proof_view_has_summary_sectionP", "PROOF-VIEW-HAS-SUMMARY-SECTION?", 1, 0, false);
        declareFunction("proof_view_maybe_remove_inference_proof_summary_root", "PROOF-VIEW-MAYBE-REMOVE-INFERENCE-PROOF-SUMMARY-ROOT", 1, 0, false);
        declareFunction("proof_view_flesh_out_inference_proof_summary", "PROOF-VIEW-FLESH-OUT-INFERENCE-PROOF-SUMMARY", 2, 0, false);
        declareFunction("proof_view_add_inference_proof_summary_root", "PROOF-VIEW-ADD-INFERENCE-PROOF-SUMMARY-ROOT", 1, 0, false);
        declareFunction("proof_view_summary_item_candidates", "PROOF-VIEW-SUMMARY-ITEM-CANDIDATES", 1, 0, false);
        declareFunction("proof_view_summary_item_subsumesP", "PROOF-VIEW-SUMMARY-ITEM-SUBSUMES?", 2, 0, false);
        declareFunction("maybe_add_proof_view_entry_summary_item", "MAYBE-ADD-PROOF-VIEW-ENTRY-SUMMARY-ITEM", 3, 0, false);
        declareFunction("add_proof_view_entry_summary_item", "ADD-PROOF-VIEW-ENTRY-SUMMARY-ITEM", 3, 0, false);
        declareFunction("proof_view_entry_summary_items", "PROOF-VIEW-ENTRY-SUMMARY-ITEMS", 1, 0, false);
        declareFunction("proof_view_entry_summary_items_int", "PROOF-VIEW-ENTRY-SUMMARY-ITEMS-INT", 1, 0, false);
        declareFunction("proof_view_entry_summary_items_post_filter_check", "PROOF-VIEW-ENTRY-SUMMARY-ITEMS-POST-FILTER-CHECK", 2, 1, false);
        declareFunction("causation_sentence_p", "CAUSATION-SENTENCE-P", 1, 0, false);
        declareFunction("causation_sentence_effect", "CAUSATION-SENTENCE-EFFECT", 1, 0, false);
        declareFunction("allow_because_strengthening_for_proof_view_summary_itemP", "ALLOW-BECAUSE-STRENGTHENING-FOR-PROOF-VIEW-SUMMARY-ITEM?", 2, 0, false);
        declareFunction("proof_view_entry_get_allow_because_strengtheningP", "PROOF-VIEW-ENTRY-GET-ALLOW-BECAUSE-STRENGTHENING?", 1, 0, false);
        declareFunction("proof_view_get_allow_because_strengtheningP", "PROOF-VIEW-GET-ALLOW-BECAUSE-STRENGTHENING?", 1, 0, false);
        declareFunction("proof_view_set_allow_because_strengtheningP", "PROOF-VIEW-SET-ALLOW-BECAUSE-STRENGTHENING?", 2, 0, false);
        declareFunction("proof_view_entry_summary_items_from_children", "PROOF-VIEW-ENTRY-SUMMARY-ITEMS-FROM-CHILDREN", 3, 0, false);
        declareFunction("proof_view_get_proof_summary_items", "PROOF-VIEW-GET-PROOF-SUMMARY-ITEMS", 1, 0, false);
        declareFunction("proof_view_fact_references_hypotheticalP", "PROOF-VIEW-FACT-REFERENCES-HYPOTHETICAL?", 1, 0, false);
        declareFunction("valid_proof_view_entry_summary_item_p", "VALID-PROOF-VIEW-ENTRY-SUMMARY-ITEM-P", 1, 0, false);
        declareFunction("filter_proof_view_entry_summary_itemP_internal", "FILTER-PROOF-VIEW-ENTRY-SUMMARY-ITEM?-INTERNAL", 2, 0, false);
        declareFunction("filter_proof_view_entry_summary_itemP", "FILTER-PROOF-VIEW-ENTRY-SUMMARY-ITEM?", 2, 0, false);
        declareFunction("proof_view_item_fails_summary_whitelist_testP", "PROOF-VIEW-ITEM-FAILS-SUMMARY-WHITELIST-TEST?", 2, 0, false);
        declareFunction("proof_view_item_passes_summary_whitelist_testP", "PROOF-VIEW-ITEM-PASSES-SUMMARY-WHITELIST-TEST?", 2, 0, false);
        declareFunction("proof_view_rule_support_entry_unsuitable_for_summaryP", "PROOF-VIEW-RULE-SUPPORT-ENTRY-UNSUITABLE-FOR-SUMMARY?", 1, 0, false);
        declareFunction("proof_view_non_trivial_rule_support_entry_unsuitable_for_summaryP", "PROOF-VIEW-NON-TRIVIAL-RULE-SUPPORT-ENTRY-UNSUITABLE-FOR-SUMMARY?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_proof_view_summary_file() {
        defparameter("*PROOF-VIEW-SHOW-ABDUCTIONS-IN-PROOF-SUMMARY?*", T);
        defparameter("*DISPREFER-HYPOTHETICAL-TERMS-IN-PROOF-VIEW-SUMMARIES?*", T);
        defparameter("*PROOF-VIEW-SEEN-ENTRIES*", misc_utilities.uninitialized());
        defparameter("*PROOF-VIEW-TRACK-SEEN-ENTRIES?*", NIL);
        defparameter("*PROOF-VIEW-USE-NEW-BECAUSE-SECTION-ALGORITHM?*", NIL);
        deflexical("*BAD-PROOF-VIEW-RULES*", NIL);
        return NIL;
    }

    public static SubLObject setup_proof_view_summary_file() {
        register_external_symbol(GET_PROOF_VIEW_INCLUDE_SUMMARY);
        register_external_symbol(SET_PROOF_VIEW_INCLUDE_SUMMARY);
        register_external_symbol(GET_PROOF_VIEW_SUMMARY_ALGORITHM);
        register_external_symbol(SET_PROOF_VIEW_SUMMARY_ALGORITHM);
        memoization_state.note_memoized_function($sym49$FILTER_PROOF_VIEW_ENTRY_SUMMARY_ITEM_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_proof_view_summary_file();
    }

    @Override
    public void initializeVariables() {
        init_proof_view_summary_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_proof_view_summary_file();
    }

    static {



































































    }
}

/**
 * Total time: 166 ms
 */
