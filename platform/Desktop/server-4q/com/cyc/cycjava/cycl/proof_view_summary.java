package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class proof_view_summary extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.proof_view_summary";
    public static final String myFingerPrint = "8ff1b629f7944abc06cceac955f19627fa6622755d0640170ba2b25a99b98096";
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 2169L)
    public static SubLSymbol $proof_view_show_abductions_in_proof_summaryP$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 3137L)
    public static SubLSymbol $disprefer_hypothetical_terms_in_proof_view_summariesP$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 4976L)
    public static SubLSymbol $proof_view_seen_entries$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 5044L)
    public static SubLSymbol $proof_view_track_seen_entriesP$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 7958L)
    public static SubLSymbol $proof_view_use_new_because_section_algorithmP$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 19507L)
    private static SubLSymbol $bad_proof_view_rules$;
    private static final SubLSymbol $sym0$GET_PROOF_VIEW_INCLUDE_SUMMARY;
    private static final SubLSymbol $sym1$SET_PROOF_VIEW_INCLUDE_SUMMARY;
    private static final SubLSymbol $sym2$GET_PROOF_VIEW_SUMMARY_ALGORITHM;
    private static final SubLSymbol $sym3$SET_PROOF_VIEW_SUMMARY_ALGORITHM;
    private static final SubLSymbol $kw4$INCLUDE_SUMMARY_SECTION_;
    private static final SubLSymbol $sym5$BOOLEANP;
    private static final SubLSymbol $kw6$SUMMARY_ROOT;
    private static final SubLString $str7$proof_view_summary;
    private static final SubLSymbol $kw8$SUMMARY_ALGORITHM;
    private static final SubLSymbol $kw9$DEFAULT;
    private static final SubLString $str10$Can_t_find_a_sentence_from__S;
    private static final SubLString $str11$__Got__D_support__p_for__S__;
    private static final SubLSymbol $sym12$PROOF_VIEW_SUMMARY_ITEM_SUBSUMES_;
    private static final SubLSymbol $sym13$PROOF_VIEW_ENTRY_GET_OBJECT;
    private static final SubLString $str14$__Got__D_summary_item_candidates_;
    private static final SubLSymbol $sym15$_EXIT;
    private static final SubLObject $const16$causes_PropProp;
    private static final SubLString $str17$Invalid_summary_item___S;
    private static final SubLString $str18$Filtering_summary_item___S;
    private static final SubLString $str19$__Because__D__Adding__S__;
    private static final SubLSymbol $kw20$IGNORE;
    private static final SubLString $str21$Already_seen__S;
    private static final SubLSymbol $kw22$WHITELIST;
    private static final SubLSymbol $sym23$PROOF_VIEW_NON_TRIVIAL_RULE_SUPPORT_ENTRY_UNSUITABLE_FOR_SUMMARY_;
    private static final SubLString $str24$Using_rule_conclusion___S;
    private static final SubLString $str25$Not_descending_into_transitive_su;
    private static final SubLSymbol $kw26$EVAL;
    private static final SubLString $str27$Not_descending_into_eval_support_;
    private static final SubLString $str28$__Filtering__S__so_using_children;
    private static final SubLString $str29$__Entire_support_tree_pruned_unde;
    private static final SubLString $str30$__Because__D__Attempting__because;
    private static final SubLString $str31$__Because__D__Got__D_child_suppor;
    private static final SubLString $str32$__Inheriting__because__support_fr;
    private static final SubLSymbol $sym33$CYCL_SENTENCE_P;
    private static final SubLSymbol $sym34$PROOF_VIEW_SUMMARY_ITEM_SENTENCE;
    private static final SubLSymbol $sym35$CAUSATION_SENTENCE_P;
    private static final SubLSymbol $sym36$CAUSATION_SENTENCE_EFFECT;
    private static final SubLString $str37$__Adding_causation_sentence_____S;
    private static final SubLString $str38$__Passing_over__S___down_to__S__;
    private static final SubLString $str39$__Adding_summary_object__S___;
    private static final SubLSymbol $sym40$PROOF_VIEW_P;
    private static final SubLSymbol $kw41$ALLOW_BECAUSE_STRENGTHENING_;
    private static final SubLSymbol $sym42$CCONCATENATE;
    private static final SubLString $str43$Expanding_entry__D__S____S;
    private static final SubLString $str44$Filtering__S__despite_no_child_fa;
    private static final SubLString $str45$No_child_facts_for__S;
    private static final SubLSymbol $sym46$PROOF_VIEW_FACT_IMPLIES_;
    private static final SubLSymbol $sym47$PROOF_VIEW_FACT_REFERENCES_HYPOTHETICAL_;
    private static final SubLSymbol $sym48$HYPOTHETICAL_TERM_P;
    private static final SubLSymbol $sym49$FILTER_PROOF_VIEW_ENTRY_SUMMARY_ITEM_;
    private static final SubLString $str50$Trivial_support___S;
    private static final SubLString $str51$Trivial_support_for_answer___S;
    private static final SubLString $str52$Assertion_on_hypothetical___S;
    private static final SubLString $str53$Trivial_sentence___S__;
    private static final SubLString $str54$Non_THCL___S;
    private static final SubLString $str55$__WHITELIST__Allowing__S__;
    private static final SubLString $str56$___S_has_a_highly_relevant_predic;
    private static final SubLObject $const57$assertionRequiredForJustification;
    private static final SubLString $str58$___S_is_a_required_assertion___;
    private static final SubLString $str59$WHITELIST__Filtering__S;
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 816L)
    public static SubLObject get_proof_view_include_summary(final SubLObject proof_view_id) {
        return proof_view_get_include_summary_sectionP(proof_view.find_proof_view_by_id(proof_view_id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 970L)
    public static SubLObject set_proof_view_include_summary(final SubLObject proof_view_id, final SubLObject bool) {
        proof_view_set_include_summary_sectionP(proof_view.find_proof_view_by_id(proof_view_id), bool);
        return (SubLObject)proof_view_summary.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 1138L)
    public static SubLObject get_proof_view_summary_algorithm(final SubLObject proof_view_id) {
        return proof_view_get_summary_algorithm(proof_view.find_proof_view_by_id(proof_view_id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 1287L)
    public static SubLObject set_proof_view_summary_algorithm(final SubLObject proof_view_id, final SubLObject algorithm) {
        proof_view_set_summary_algorithm(proof_view.find_proof_view_by_id(proof_view_id), algorithm);
        return (SubLObject)proof_view_summary.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 1460L)
    public static SubLObject proof_view_get_include_summary_sectionP(final SubLObject v_proof_view) {
        return proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_summary.$kw4$INCLUDE_SUMMARY_SECTION_, (SubLObject)proof_view_summary.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 1603L)
    public static SubLObject proof_view_set_include_summary_sectionP(final SubLObject v_proof_view, final SubLObject include_summary_sectionP) {
        assert proof_view_summary.NIL != Types.booleanp(include_summary_sectionP) : include_summary_sectionP;
        return proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_summary.$kw4$INCLUDE_SUMMARY_SECTION_, include_summary_sectionP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 1843L)
    public static SubLObject proof_view_get_include_summary_sourcesP(final SubLObject v_proof_view) {
        final SubLObject spec = proof_view.proof_view_get_include_sourcesP(v_proof_view);
        return list_utilities.sublisp_boolean(spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 2001L)
    public static SubLObject output_proof_view_summary_in_xml(final SubLObject v_proof_view) {
        proof_view.output_proof_view_section_in_xml(v_proof_view, (SubLObject)proof_view_summary.$kw6$SUMMARY_ROOT, (SubLObject)proof_view_summary.$str7$proof_view_summary);
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 2302L)
    public static SubLObject proof_view_get_summary_root(final SubLObject v_proof_view) {
        return proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_summary.$kw6$SUMMARY_ROOT, (SubLObject)proof_view_summary.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 2422L)
    public static SubLObject proof_view_get_summary_algorithm(final SubLObject v_proof_view) {
        return proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_summary.$kw8$SUMMARY_ALGORITHM, (SubLObject)proof_view_summary.$kw9$DEFAULT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 2561L)
    public static SubLObject proof_view_set_summary_algorithm(final SubLObject v_proof_view, final SubLObject algorithm) {
        return proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_summary.$kw8$SUMMARY_ALGORITHM, algorithm);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 2933L)
    public static SubLObject proof_view_get_summary_entries(final SubLObject v_proof_view) {
        final SubLObject root = proof_view_get_summary_root(v_proof_view);
        return (SubLObject)((proof_view_summary.NIL != proof_view.proof_view_entry_p(root)) ? proof_view.proof_view_entry_get_children(root) : proof_view_summary.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 3221L)
    public static SubLObject proof_view_summary_item_sentence(final SubLObject item) {
        if (proof_view_summary.NIL != arguments.support_p(item)) {
            return cycl_utilities.hl_to_el(arguments.support_sentence(item));
        }
        if (proof_view_summary.NIL != cycl_grammar.cycl_sentence_p(item)) {
            return cycl_utilities.hl_to_el(item);
        }
        Errors.error((SubLObject)proof_view_summary.$str10$Can_t_find_a_sentence_from__S, item);
        return (SubLObject)proof_view_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 3468L)
    public static SubLObject proof_view_has_summary_sectionP(final SubLObject v_proof_view) {
        return proof_view.proof_view_has_sectionP(v_proof_view, (SubLObject)proof_view_summary.$kw6$SUMMARY_ROOT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 3589L)
    public static SubLObject proof_view_maybe_remove_inference_proof_summary_root(final SubLObject v_proof_view) {
        final SubLObject facts_used_section_root = proof_view_get_summary_root(v_proof_view);
        if (proof_view_summary.NIL != facts_used_section_root && proof_view_summary.NIL == proof_view.proof_view_entry_get_children(facts_used_section_root) && proof_view_summary.NIL != proof_view.proof_view_has_justification_sectionP(v_proof_view)) {
            proof_view_populator.proof_view_remove_entry(v_proof_view, facts_used_section_root);
            proof_view_populator.proof_view_rem_property(v_proof_view, (SubLObject)proof_view_summary.$kw6$SUMMARY_ROOT);
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 4068L)
    public static SubLObject proof_view_flesh_out_inference_proof_summary(final SubLObject v_proof_view, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (proof_view_summary.NIL != pph_vars.$pph_proof_show_facts_usedP$.getDynamicValue(thread)) {
            final SubLObject summary_items = proof_view_get_proof_summary_items(v_proof_view);
            final SubLObject minimum_worth_showing = (SubLObject)proof_view_summary.ONE_INTEGER;
            if (proof_view_summary.NIL != list_utilities.lengthGE(summary_items, minimum_worth_showing, (SubLObject)proof_view_summary.UNPROVIDED)) {
                final SubLObject facts_used_section_root = proof_view_get_summary_root(v_proof_view);
                SubLObject cdolist_list_var = proof_view_populator.proof_view_sort_entries_to_maximize_coherence(v_proof_view, mt, summary_items);
                SubLObject item = (SubLObject)proof_view_summary.NIL;
                item = cdolist_list_var.first();
                while (proof_view_summary.NIL != cdolist_list_var) {
                    proof_view_populator.proof_view_add_fact_used(v_proof_view, facts_used_section_root, proof_view.proof_view_entry_get_object(item), mt);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                proof_view_populator.proof_view_entry_note_expand_initially(facts_used_section_root);
            }
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 4735L)
    public static SubLObject proof_view_add_inference_proof_summary_root(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject root = proof_view_populator.proof_view_add_section_root(v_proof_view, proof_view.$proof_view_facts_used_label$.getDynamicValue(thread));
        proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_summary.$kw6$SUMMARY_ROOT, root);
        return root;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 5106L)
    public static SubLObject proof_view_summary_item_candidates(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject justification_root_entry = proof_view_populator.proof_view_get_justification_root_entry(v_proof_view);
        final SubLObject _prev_bind_0 = proof_view_summary.$proof_view_seen_entries$.currentBinding(thread);
        try {
            proof_view_summary.$proof_view_seen_entries$.bind((proof_view_summary.NIL != misc_utilities.initialized_p(proof_view_summary.$proof_view_seen_entries$.getDynamicValue(thread))) ? proof_view_summary.$proof_view_seen_entries$.getDynamicValue(thread) : set.new_set((SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED), thread);
            SubLObject summary_entries = (SubLObject)proof_view_summary.NIL;
            final SubLObject local_state;
            final SubLObject state = local_state = proof_view.find_proof_view_memoization_state(v_proof_view);
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (proof_view_summary.NIL != justification_root_entry) {
                        SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children(justification_root_entry);
                        SubLObject child = (SubLObject)proof_view_summary.NIL;
                        child = cdolist_list_var.first();
                        while (proof_view_summary.NIL != cdolist_list_var) {
                            final SubLObject child_summary_entries = proof_view_entry_summary_items(child);
                            if (proof_view_summary.NIL != child_summary_entries) {
                                if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                                    format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str11$__Got__D_support__p_for__S__, Sequences.length(child_summary_entries), child, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
                                }
                                summary_entries = ConsesLow.append(summary_entries, child_summary_entries);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            child = cdolist_list_var.first();
                        }
                    }
                    summary_entries = list_utilities.delete_subsumed_items(summary_entries, (SubLObject)proof_view_summary.$sym12$PROOF_VIEW_SUMMARY_ITEM_SUBSUMES_, (SubLObject)proof_view_summary.$sym13$PROOF_VIEW_ENTRY_GET_OBJECT);
                }
                finally {
                    final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)proof_view_summary.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str14$__Got__D_summary_item_candidates_, Sequences.length(summary_entries), (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
            }
            return summary_entries;
        }
        finally {
            proof_view_summary.$proof_view_seen_entries$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 6126L)
    public static SubLObject proof_view_summary_item_subsumesP(final SubLObject item1, final SubLObject item2) {
        final SubLObject sentence1 = proof_view_summary_item_sentence(item1);
        final SubLObject sentence2 = proof_view_summary_item_sentence(item2);
        if (proof_view_summary_item_sentence(sentence1).equal(proof_view_summary_item_sentence(sentence2))) {
            return (SubLObject)proof_view_summary.T;
        }
        if (proof_view_summary.NIL == el_utilities.el_formula_with_operator_p(sentence1, proof_view_summary.$const16$causes_PropProp)) {
            return (SubLObject)proof_view_summary.NIL;
        }
        final SubLObject cause = cycl_utilities.formula_arg1(sentence1, (SubLObject)proof_view_summary.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject causes = cdolist_list_var = (SubLObject)((proof_view_summary.NIL != el_utilities.el_conjunction_p(cause)) ? cycl_utilities.formula_args(cause, (SubLObject)proof_view_summary.UNPROVIDED) : ConsesLow.list(cause));
        SubLObject conjunct = (SubLObject)proof_view_summary.NIL;
        conjunct = cdolist_list_var.first();
        while (proof_view_summary.NIL != cdolist_list_var) {
            if (proof_view_summary.NIL != proof_view_summary_item_subsumesP(conjunct, sentence2)) {
                return (SubLObject)proof_view_summary.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        if (proof_view_summary.NIL != proof_view_summary_item_subsumesP(cycl_utilities.formula_arg2(sentence1, (SubLObject)proof_view_summary.UNPROVIDED), sentence2)) {
            return (SubLObject)proof_view_summary.T;
        }
        return (SubLObject)proof_view_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 6868L)
    public static SubLObject maybe_add_proof_view_entry_summary_item(final SubLObject item, SubLObject supports, final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (proof_view_summary.NIL == valid_proof_view_entry_summary_item_p(item)) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str17$Invalid_summary_item___S, item);
            }
        }
        else if (proof_view_summary.NIL != filter_proof_view_entry_summary_itemP(item, entry)) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str18$Filtering_summary_item___S, item);
            }
        }
        else if (proof_view_summary.NIL != cycl_grammar.cycl_sentence_p(item) && proof_view_summary.$const16$causes_PropProp.eql(cycl_utilities.formula_arg0(item))) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str19$__Because__D__Adding__S__, proof_view.proof_view_entry_get_id(entry), item, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
            }
            supports = add_proof_view_entry_summary_item(item, supports, entry);
        }
        else {
            SubLObject cdolist_list_var = proof_view_entry_summary_items_post_filter_check(entry, item, (SubLObject)proof_view_summary.UNPROVIDED);
            SubLObject sub_entry = (SubLObject)proof_view_summary.NIL;
            sub_entry = cdolist_list_var.first();
            while (proof_view_summary.NIL != cdolist_list_var) {
                final SubLObject item_var = sub_entry;
                if (proof_view_summary.NIL == conses_high.member(item_var, supports, Symbols.symbol_function((SubLObject)proof_view_summary.EQUAL), (SubLObject)proof_view_summary.$sym13$PROOF_VIEW_ENTRY_GET_OBJECT)) {
                    supports = (SubLObject)ConsesLow.cons(item_var, supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_entry = cdolist_list_var.first();
            }
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 7654L)
    public static SubLObject add_proof_view_entry_summary_item(final SubLObject item, SubLObject supports, final SubLObject entry) {
        if (proof_view_summary.NIL != el_utilities.el_conjunction_p(item)) {
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(item, (SubLObject)proof_view_summary.$kw20$IGNORE);
            SubLObject conjunct = (SubLObject)proof_view_summary.NIL;
            conjunct = cdolist_list_var.first();
            while (proof_view_summary.NIL != cdolist_list_var) {
                add_proof_view_entry_summary_item(conjunct, supports, entry);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
        }
        else if (proof_view_summary.NIL == conses_high.member(entry, supports, Symbols.symbol_function((SubLObject)proof_view_summary.EQUAL), (SubLObject)proof_view_summary.$sym13$PROOF_VIEW_ENTRY_GET_OBJECT)) {
            supports = (SubLObject)ConsesLow.cons(entry, supports);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 8036L)
    public static SubLObject proof_view_entry_summary_items(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = (SubLObject)proof_view_summary.NIL;
        if (proof_view_summary.NIL == proof_view_summary.$proof_view_track_seen_entriesP$.getDynamicValue(thread) || proof_view_summary.NIL != set.set_add(entry, proof_view_summary.$proof_view_seen_entries$.getDynamicValue(thread))) {
            supports = proof_view_entry_summary_items_int(entry);
        }
        else if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)proof_view_summary.$str21$Already_seen__S, entry);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 8339L)
    public static SubLObject proof_view_entry_summary_items_int(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_object = proof_view.proof_view_entry_get_object(entry);
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(entry);
        final SubLObject filter_objectP = (SubLObject)SubLObjectFactory.makeBoolean(proof_view_summary.NIL == valid_proof_view_entry_summary_item_p(v_object) || proof_view_summary.NIL != filter_proof_view_entry_summary_itemP(v_object, entry));
        SubLObject supports = (SubLObject)proof_view_summary.NIL;
        if (proof_view_summary.$kw22$WHITELIST.eql(proof_view_get_summary_algorithm(v_proof_view))) {
            supports = proof_view_entry_summary_items_post_filter_check(entry, v_object, filter_objectP);
        }
        else if (proof_view_summary.NIL != proof_view.proof_view_rule_support_entryP(entry)) {
            supports = maybe_add_proof_view_entry_summary_item(v_object, supports, entry);
        }
        else if (proof_view_summary.NIL != Sequences.find_if((SubLObject)proof_view_summary.$sym23$PROOF_VIEW_NON_TRIVIAL_RULE_SUPPORT_ENTRY_UNSUITABLE_FOR_SUMMARY_, proof_view.proof_view_entry_get_children(entry), (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED) && proof_view_summary.NIL == filter_objectP && proof_view_summary.NIL == proof_view.proof_view_fact_trivially_implies_proof_conclusionP(v_object, proof_view.proof_view_entry_get_proof_view(entry), (SubLObject)proof_view_summary.UNPROVIDED)) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str24$Using_rule_conclusion___S, v_object);
            }
            supports = maybe_add_proof_view_entry_summary_item(v_object, supports, entry);
        }
        else if (proof_view_summary.NIL != proof_view.proof_view_transitive_support_p(v_object) && proof_view_summary.NIL == proof_view.proof_view_fact_trivially_implies_proof_conclusionP(v_object, proof_view.proof_view_entry_get_proof_view(entry), (SubLObject)proof_view_summary.T) && proof_view_summary.NIL == proof_view_fact_references_hypotheticalP(v_object)) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str25$Not_descending_into_transitive_su, v_object);
            }
            if (proof_view_summary.NIL == filter_objectP) {
                supports = maybe_add_proof_view_entry_summary_item(v_object, supports, entry);
            }
        }
        else if (proof_view_summary.NIL != arguments.support_p(v_object) && proof_view_summary.$kw26$EVAL.eql(arguments.support_module(v_object)) && proof_view_summary.NIL == proof_view.proof_view_fact_trivially_implies_proof_conclusionP(v_object, proof_view.proof_view_entry_get_proof_view(entry), (SubLObject)proof_view_summary.T)) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str27$Not_descending_into_eval_support_, v_object);
            }
            if (proof_view_summary.NIL == filter_objectP) {
                supports = maybe_add_proof_view_entry_summary_item(v_object, supports, entry);
            }
        }
        else {
            supports = proof_view_entry_summary_items_from_children(entry, v_object, filter_objectP);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 10673L)
    public static SubLObject proof_view_entry_summary_items_post_filter_check(final SubLObject entry, final SubLObject v_object, SubLObject filter_objectP) {
        if (filter_objectP == proof_view_summary.UNPROVIDED) {
            filter_objectP = (SubLObject)proof_view_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(entry);
        final SubLObject child_supports = proof_view_entry_summary_items_from_children(entry, v_object, filter_objectP);
        if (proof_view_summary.NIL != filter_objectP) {
            if (proof_view_summary.NIL != child_supports) {
                if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str28$__Filtering__S__so_using_children, v_object, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
                }
            }
            else if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str29$__Entire_support_tree_pruned_unde, v_object);
            }
            return child_supports;
        }
        if (proof_view_summary.NIL != allow_because_strengthening_for_proof_view_summary_itemP(v_object, entry) && proof_view_summary.NIL != list_utilities.non_empty_list_p(child_supports)) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str30$__Because__D__Attempting__because, proof_view.proof_view_entry_get_id(entry), v_object, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
            }
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str31$__Because__D__Got__D_child_suppor, proof_view.proof_view_entry_get_id(entry), Sequences.length(child_supports), (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
            }
            if (proof_view_summary.NIL != list_utilities.singletonP(child_supports) && proof_view_summary.$const16$causes_PropProp.eql(cycl_utilities.formula_arg0(proof_view.proof_view_entry_get_object(list_utilities.only_one(child_supports))))) {
                if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str32$__Inheriting__because__support_fr, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
                }
                return child_supports;
            }
            if (proof_view_summary.NIL != list_utilities.lengthGE(child_supports, (SubLObject)proof_view_summary.ONE_INTEGER, (SubLObject)proof_view_summary.UNPROVIDED) && proof_view_summary.NIL != list_utilities.lengthLE(child_supports, (SubLObject)proof_view_summary.TWO_INTEGER, (SubLObject)proof_view_summary.UNPROVIDED) && proof_view_summary.NIL == list_utilities.find_if_not((SubLObject)proof_view_summary.$sym33$CYCL_SENTENCE_P, child_supports, (SubLObject)proof_view_summary.$sym13$PROOF_VIEW_ENTRY_GET_OBJECT, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED)) {
                SubLObject cause = cycl_utilities.hl_to_el((proof_view_summary.NIL != list_utilities.singletonP(child_supports)) ? proof_view_summary_item_sentence(proof_view.proof_view_entry_get_object(list_utilities.only_one(child_supports))) : simplifier.conjoin(Mapping.mapcar((SubLObject)proof_view_summary.$sym34$PROOF_VIEW_SUMMARY_ITEM_SENTENCE, Mapping.mapcar((SubLObject)proof_view_summary.$sym13$PROOF_VIEW_ENTRY_GET_OBJECT, child_supports)), (SubLObject)proof_view_summary.UNPROVIDED));
                final SubLObject effect = cycl_utilities.hl_to_el(proof_view_summary_item_sentence(v_object));
                cause = cycl_utilities.expression_transform(cause, (SubLObject)proof_view_summary.$sym35$CAUSATION_SENTENCE_P, (SubLObject)proof_view_summary.$sym36$CAUSATION_SENTENCE_EFFECT, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
                if (proof_view_summary.NIL == equals.equalsP(cause, effect, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED)) {
                    final SubLObject complex_sentence = el_utilities.make_binary_formula(proof_view_summary.$const16$causes_PropProp, cause, effect);
                    final SubLObject throwaway_entry = proof_view_populator.new_proof_view_entry(v_proof_view, complex_sentence);
                    proof_view.proof_view_entry_set_proof(throwaway_entry, proof_view.proof_view_entry_get_proof(entry, (SubLObject)proof_view_summary.T));
                    if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str37$__Adding_causation_sentence_____S, complex_sentence, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
                    }
                    return (SubLObject)ConsesLow.list(throwaway_entry);
                }
            }
        }
        if (proof_view_summary.NIL != list_utilities.singletonP(child_supports)) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str38$__Passing_over__S___down_to__S__, v_object, proof_view.proof_view_entry_get_object(list_utilities.only_one(child_supports)), (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
            }
            return child_supports;
        }
        if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str39$__Adding_summary_object__S___, v_object, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
        }
        return add_proof_view_entry_summary_item(v_object, (SubLObject)proof_view_summary.NIL, entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 13406L)
    public static SubLObject causation_sentence_p(final SubLObject obj) {
        return el_utilities.el_formula_with_operator_p(obj, proof_view_summary.$const16$causes_PropProp);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 13510L)
    public static SubLObject causation_sentence_effect(final SubLObject c_sent) {
        return cycl_utilities.atomic_sentence_arg2(c_sent, (SubLObject)proof_view_summary.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 13601L)
    public static SubLObject allow_because_strengthening_for_proof_view_summary_itemP(final SubLObject v_object, final SubLObject entry) {
        return proof_view_entry_get_allow_because_strengtheningP(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 13913L)
    public static SubLObject proof_view_entry_get_allow_because_strengtheningP(final SubLObject entry) {
        return proof_view_get_allow_because_strengtheningP(proof_view.proof_view_entry_get_proof_view(entry));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 14083L)
    public static SubLObject proof_view_get_allow_because_strengtheningP(final SubLObject v_proof_view) {
        assert proof_view_summary.NIL != proof_view.proof_view_p(v_proof_view) : v_proof_view;
        return proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_summary.$kw41$ALLOW_BECAUSE_STRENGTHENING_, (SubLObject)proof_view_summary.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 14273L)
    public static SubLObject proof_view_set_allow_because_strengtheningP(final SubLObject v_proof_view, final SubLObject bool) {
        assert proof_view_summary.NIL != proof_view.proof_view_p(v_proof_view) : v_proof_view;
        return proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_summary.$kw41$ALLOW_BECAUSE_STRENGTHENING_, bool);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 14471L)
    public static SubLObject proof_view_entry_summary_items_from_children(final SubLObject entry, final SubLObject v_object, final SubLObject filter_objectP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indexed_child_items = dictionary.new_dictionary((SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
        SubLObject supports = (SubLObject)proof_view_summary.NIL;
        SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children(entry);
        SubLObject child = (SubLObject)proof_view_summary.NIL;
        child = cdolist_list_var.first();
        while (proof_view_summary.NIL != cdolist_list_var) {
            dictionary.dictionary_enter(indexed_child_items, child, proof_view_entry_summary_items(child));
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        }
        final SubLObject child_items = (SubLObject)((proof_view_summary.NIL != dictionary.dictionary_empty_p(indexed_child_items)) ? proof_view_summary.NIL : Sequences.remove_duplicates(Functions.apply((SubLObject)proof_view_summary.$sym42$CCONCATENATE, dictionary.dictionary_values(indexed_child_items)), Symbols.symbol_function((SubLObject)proof_view_summary.EQUAL), Symbols.symbol_function((SubLObject)proof_view_summary.$sym13$PROOF_VIEW_ENTRY_GET_OBJECT), (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED));
        if (proof_view_summary.NIL != list_utilities.non_empty_list_p(child_items) && (proof_view_summary.NIL == list_utilities.singletonP(child_items) || !proof_view.proof_view_entry_get_object(list_utilities.only_one(child_items)).equal(v_object))) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str43$Expanding_entry__D__S____S, proof_view.proof_view_entry_get_id(entry), proof_view.proof_view_fact_sentence(v_object), Mapping.mapcar((SubLObject)proof_view_summary.$sym13$PROOF_VIEW_ENTRY_GET_OBJECT, child_items));
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(indexed_child_items)); proof_view_summary.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject this_child_items = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var2 = this_child_items;
                SubLObject child_item = (SubLObject)proof_view_summary.NIL;
                child_item = cdolist_list_var2.first();
                while (proof_view_summary.NIL != cdolist_list_var2) {
                    supports = maybe_add_proof_view_entry_summary_item(proof_view.proof_view_entry_get_object(child_item), supports, child_item);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    child_item = cdolist_list_var2.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        else if (proof_view_summary.NIL != filter_objectP) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str44$Filtering__S__despite_no_child_fa, v_object);
            }
        }
        else {
            if (proof_view_summary.NIL != list_utilities.empty_list_p(child_items) && proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str45$No_child_facts_for__S, v_object);
            }
            supports = add_proof_view_entry_summary_item(v_object, supports, entry);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 15944L)
    public static SubLObject proof_view_get_proof_summary_items(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_fact_entries = proof_view_summary_item_candidates(v_proof_view);
        final SubLObject unsubsumed = list_utilities.delete_subsumed_items(all_fact_entries, (SubLObject)proof_view_summary.$sym46$PROOF_VIEW_FACT_IMPLIES_, (SubLObject)proof_view_summary.$sym13$PROOF_VIEW_ENTRY_GET_OBJECT);
        final SubLObject non_hypothetical = (SubLObject)((proof_view_summary.NIL != proof_view_summary.$disprefer_hypothetical_terms_in_proof_view_summariesP$.getDynamicValue(thread)) ? Sequences.remove_if((SubLObject)proof_view_summary.$sym47$PROOF_VIEW_FACT_REFERENCES_HYPOTHETICAL_, unsubsumed, (SubLObject)proof_view_summary.$sym13$PROOF_VIEW_ENTRY_GET_OBJECT, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED) : proof_view_summary.NIL);
        return (proof_view_summary.NIL != non_hypothetical) ? non_hypothetical : unsubsumed;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 16451L)
    public static SubLObject proof_view_fact_references_hypotheticalP(final SubLObject fact) {
        return cycl_utilities.expression_find_if((SubLObject)proof_view_summary.$sym48$HYPOTHETICAL_TERM_P, proof_view.proof_view_fact_sentence(fact), (SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 16601L)
    public static SubLObject valid_proof_view_entry_summary_item_p(final SubLObject v_object) {
        if (proof_view_summary.NIL == arguments.support_p(v_object) && proof_view_summary.NIL == cycl_grammar.cycl_sentence_p(v_object)) {
            return (SubLObject)proof_view_summary.NIL;
        }
        return (SubLObject)proof_view_summary.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 16771L)
    public static SubLObject filter_proof_view_entry_summary_itemP_internal(final SubLObject item, final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(entry);
        if (proof_view_summary.$kw22$WHITELIST.eql(proof_view_get_summary_algorithm(v_proof_view))) {
            return proof_view_item_fails_summary_whitelist_testP(v_proof_view, item);
        }
        if (proof_view_summary.NIL != proof_view_get_include_summary_sourcesP(v_proof_view) && (proof_view_summary.NIL != proof_view.proof_view_entry_get_sources(entry) || (proof_view_summary.NIL != assertion_handles.assertion_p(item) && proof_view_summary.NIL != sources.assertion_sourcedP(item)))) {
            return (SubLObject)proof_view_summary.NIL;
        }
        if (proof_view_summary.NIL != assertion_handles.assertion_p(item) && proof_view_summary.NIL != pph_methods.pph_assertion_has_glossP(item)) {
            return (SubLObject)proof_view_summary.NIL;
        }
        if (proof_view_summary.NIL != arguments.support_p(item) && proof_view_summary.NIL != pph_proof.pph_support_trivialP(item, (SubLObject)proof_view_summary.UNPROVIDED)) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str50$Trivial_support___S, item);
            }
            return (SubLObject)proof_view_summary.T;
        }
        if (proof_view_summary.NIL != proof_view.proof_view_fact_trivially_implies_proof_conclusionP(item, proof_view.proof_view_entry_get_proof_view(entry), (SubLObject)proof_view_summary.UNPROVIDED)) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str51$Trivial_support_for_answer___S, item);
            }
            return (SubLObject)proof_view_summary.T;
        }
        if (proof_view_summary.NIL != assertion_handles.assertion_p(item) && proof_view_summary.NIL != assertions_high.asserted_assertionP(item) && proof_view_summary.NIL != proof_view_fact_references_hypotheticalP(item)) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str52$Assertion_on_hypothetical___S, item);
            }
            return (SubLObject)proof_view_summary.T;
        }
        if (proof_view_summary.NIL != el_grammar.el_sentence_p(item) && proof_view_summary.NIL != pph_proof.pph_trivial_sentenceP(item, (SubLObject)proof_view_summary.UNPROVIDED)) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str53$Trivial_sentence___S__, item);
            }
            return (SubLObject)proof_view_summary.T;
        }
        if (proof_view_summary.NIL != proof_view.proof_view_rule_support_entryP(entry)) {
            return proof_view_rule_support_entry_unsuitable_for_summaryP(entry);
        }
        if (proof_view_summary.NIL == thcl.thcl_formulaP(narts_high.nart_substitute(proof_view.proof_view_fact_sentence(item)), (SubLObject)proof_view_summary.NIL)) {
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str54$Non_THCL___S, item);
            }
            return (SubLObject)proof_view_summary.T;
        }
        return (SubLObject)proof_view_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 16771L)
    public static SubLObject filter_proof_view_entry_summary_itemP(final SubLObject item, final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)proof_view_summary.NIL;
        if (proof_view_summary.NIL == v_memoization_state) {
            return filter_proof_view_entry_summary_itemP_internal(item, entry);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)proof_view_summary.$sym49$FILTER_PROOF_VIEW_ENTRY_SUMMARY_ITEM_, (SubLObject)proof_view_summary.UNPROVIDED);
        if (proof_view_summary.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)proof_view_summary.$sym49$FILTER_PROOF_VIEW_ENTRY_SUMMARY_ITEM_, (SubLObject)proof_view_summary.TWO_INTEGER, (SubLObject)proof_view_summary.NIL, (SubLObject)proof_view_summary.EQUAL, (SubLObject)proof_view_summary.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)proof_view_summary.$sym49$FILTER_PROOF_VIEW_ENTRY_SUMMARY_ITEM_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(item, entry);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)proof_view_summary.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)proof_view_summary.NIL;
            collision = cdolist_list_var.first();
            while (proof_view_summary.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (item.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (proof_view_summary.NIL != cached_args && proof_view_summary.NIL == cached_args.rest() && entry.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(filter_proof_view_entry_summary_itemP_internal(item, entry)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(item, entry));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 18440L)
    public static SubLObject proof_view_item_fails_summary_whitelist_testP(final SubLObject v_proof_view, final SubLObject item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(proof_view_summary.NIL == proof_view_item_passes_summary_whitelist_testP(v_proof_view, item));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 18602L)
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
            if (proof_view_summary.NIL != cycl_grammar.cycl_sentence_p(item) && proof_view_summary.$const16$causes_PropProp.eql(cycl_utilities.formula_arg0(item))) {
                if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str55$__WHITELIST__Allowing__S__, item, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
                }
                return (SubLObject)proof_view_summary.T;
            }
            if (proof_view_summary.NIL != valid_proof_view_entry_summary_item_p(item) && proof_view_summary.NIL != pph_proof.pph_justification_pred_highly_relevantP(cycl_utilities.formula_arg0(proof_view_summary_item_sentence(item)), proof_view.proof_view_get_domain_mt(v_proof_view))) {
                if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str56$___S_has_a_highly_relevant_predic, item, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
                }
                return (SubLObject)proof_view_summary.T;
            }
            if (proof_view_summary.NIL != assertion_handles.assertion_p(item) && proof_view_summary.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(item, proof_view_summary.$const57$assertionRequiredForJustification, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED)) {
                if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format((SubLObject)proof_view_summary.T, (SubLObject)proof_view_summary.$str58$___S_is_a_required_assertion___, item, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED, (SubLObject)proof_view_summary.UNPROVIDED);
                }
                return (SubLObject)proof_view_summary.T;
            }
            if (proof_view_summary.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_summary.$str59$WHITELIST__Filtering__S, item);
            }
            return (SubLObject)proof_view_summary.NIL;
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 19632L)
    public static SubLObject proof_view_rule_support_entry_unsuitable_for_summaryP(final SubLObject entry) {
        if (proof_view_summary.NIL != proof_view.proof_view_rule_support_entryP(entry)) {
            final SubLObject rule = proof_view.proof_view_entry_get_object(entry);
            if (proof_view_summary.NIL != pph_proof.pph_support_trivialP(rule, (SubLObject)proof_view_summary.UNPROVIDED) || proof_view_summary.NIL == pph_methods.pph_assertion_has_glossP(rule)) {
                return (SubLObject)proof_view_summary.T;
            }
        }
        return (SubLObject)proof_view_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-summary.lisp", position = 19929L)
    public static SubLObject proof_view_non_trivial_rule_support_entry_unsuitable_for_summaryP(final SubLObject entry) {
        if (proof_view_summary.NIL != proof_view.proof_view_rule_support_entryP(entry)) {
            final SubLObject rule = proof_view.proof_view_entry_get_object(entry);
            if (proof_view_summary.NIL == pph_proof.pph_support_trivialP(rule, (SubLObject)proof_view_summary.UNPROVIDED) && proof_view_summary.NIL == pph_methods.pph_assertion_has_glossP(rule)) {
                final SubLObject item_var = rule;
                if (proof_view_summary.NIL == conses_high.member(item_var, proof_view_summary.$bad_proof_view_rules$.getGlobalValue(), Symbols.symbol_function((SubLObject)proof_view_summary.EQL), Symbols.symbol_function((SubLObject)proof_view_summary.IDENTITY))) {
                    proof_view_summary.$bad_proof_view_rules$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, proof_view_summary.$bad_proof_view_rules$.getGlobalValue()));
                }
                return (SubLObject)proof_view_summary.T;
            }
        }
        return (SubLObject)proof_view_summary.NIL;
    }
    
    public static SubLObject declare_proof_view_summary_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "get_proof_view_include_summary", "GET-PROOF-VIEW-INCLUDE-SUMMARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "set_proof_view_include_summary", "SET-PROOF-VIEW-INCLUDE-SUMMARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "get_proof_view_summary_algorithm", "GET-PROOF-VIEW-SUMMARY-ALGORITHM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "set_proof_view_summary_algorithm", "SET-PROOF-VIEW-SUMMARY-ALGORITHM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_get_include_summary_sectionP", "PROOF-VIEW-GET-INCLUDE-SUMMARY-SECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_set_include_summary_sectionP", "PROOF-VIEW-SET-INCLUDE-SUMMARY-SECTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_get_include_summary_sourcesP", "PROOF-VIEW-GET-INCLUDE-SUMMARY-SOURCES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "output_proof_view_summary_in_xml", "OUTPUT-PROOF-VIEW-SUMMARY-IN-XML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_get_summary_root", "PROOF-VIEW-GET-SUMMARY-ROOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_get_summary_algorithm", "PROOF-VIEW-GET-SUMMARY-ALGORITHM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_set_summary_algorithm", "PROOF-VIEW-SET-SUMMARY-ALGORITHM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_get_summary_entries", "PROOF-VIEW-GET-SUMMARY-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_summary_item_sentence", "PROOF-VIEW-SUMMARY-ITEM-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_has_summary_sectionP", "PROOF-VIEW-HAS-SUMMARY-SECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_maybe_remove_inference_proof_summary_root", "PROOF-VIEW-MAYBE-REMOVE-INFERENCE-PROOF-SUMMARY-ROOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_flesh_out_inference_proof_summary", "PROOF-VIEW-FLESH-OUT-INFERENCE-PROOF-SUMMARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_add_inference_proof_summary_root", "PROOF-VIEW-ADD-INFERENCE-PROOF-SUMMARY-ROOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_summary_item_candidates", "PROOF-VIEW-SUMMARY-ITEM-CANDIDATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_summary_item_subsumesP", "PROOF-VIEW-SUMMARY-ITEM-SUBSUMES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "maybe_add_proof_view_entry_summary_item", "MAYBE-ADD-PROOF-VIEW-ENTRY-SUMMARY-ITEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "add_proof_view_entry_summary_item", "ADD-PROOF-VIEW-ENTRY-SUMMARY-ITEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_entry_summary_items", "PROOF-VIEW-ENTRY-SUMMARY-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_entry_summary_items_int", "PROOF-VIEW-ENTRY-SUMMARY-ITEMS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_entry_summary_items_post_filter_check", "PROOF-VIEW-ENTRY-SUMMARY-ITEMS-POST-FILTER-CHECK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "causation_sentence_p", "CAUSATION-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "causation_sentence_effect", "CAUSATION-SENTENCE-EFFECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "allow_because_strengthening_for_proof_view_summary_itemP", "ALLOW-BECAUSE-STRENGTHENING-FOR-PROOF-VIEW-SUMMARY-ITEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_entry_get_allow_because_strengtheningP", "PROOF-VIEW-ENTRY-GET-ALLOW-BECAUSE-STRENGTHENING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_get_allow_because_strengtheningP", "PROOF-VIEW-GET-ALLOW-BECAUSE-STRENGTHENING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_set_allow_because_strengtheningP", "PROOF-VIEW-SET-ALLOW-BECAUSE-STRENGTHENING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_entry_summary_items_from_children", "PROOF-VIEW-ENTRY-SUMMARY-ITEMS-FROM-CHILDREN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_get_proof_summary_items", "PROOF-VIEW-GET-PROOF-SUMMARY-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_fact_references_hypotheticalP", "PROOF-VIEW-FACT-REFERENCES-HYPOTHETICAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "valid_proof_view_entry_summary_item_p", "VALID-PROOF-VIEW-ENTRY-SUMMARY-ITEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "filter_proof_view_entry_summary_itemP_internal", "FILTER-PROOF-VIEW-ENTRY-SUMMARY-ITEM?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "filter_proof_view_entry_summary_itemP", "FILTER-PROOF-VIEW-ENTRY-SUMMARY-ITEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_item_fails_summary_whitelist_testP", "PROOF-VIEW-ITEM-FAILS-SUMMARY-WHITELIST-TEST?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_item_passes_summary_whitelist_testP", "PROOF-VIEW-ITEM-PASSES-SUMMARY-WHITELIST-TEST?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_rule_support_entry_unsuitable_for_summaryP", "PROOF-VIEW-RULE-SUPPORT-ENTRY-UNSUITABLE-FOR-SUMMARY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_summary", "proof_view_non_trivial_rule_support_entry_unsuitable_for_summaryP", "PROOF-VIEW-NON-TRIVIAL-RULE-SUPPORT-ENTRY-UNSUITABLE-FOR-SUMMARY?", 1, 0, false);
        return (SubLObject)proof_view_summary.NIL;
    }
    
    public static SubLObject init_proof_view_summary_file() {
        proof_view_summary.$proof_view_show_abductions_in_proof_summaryP$ = SubLFiles.defparameter("*PROOF-VIEW-SHOW-ABDUCTIONS-IN-PROOF-SUMMARY?*", (SubLObject)proof_view_summary.T);
        proof_view_summary.$disprefer_hypothetical_terms_in_proof_view_summariesP$ = SubLFiles.defparameter("*DISPREFER-HYPOTHETICAL-TERMS-IN-PROOF-VIEW-SUMMARIES?*", (SubLObject)proof_view_summary.T);
        proof_view_summary.$proof_view_seen_entries$ = SubLFiles.defparameter("*PROOF-VIEW-SEEN-ENTRIES*", misc_utilities.uninitialized());
        proof_view_summary.$proof_view_track_seen_entriesP$ = SubLFiles.defparameter("*PROOF-VIEW-TRACK-SEEN-ENTRIES?*", (SubLObject)proof_view_summary.NIL);
        proof_view_summary.$proof_view_use_new_because_section_algorithmP$ = SubLFiles.defparameter("*PROOF-VIEW-USE-NEW-BECAUSE-SECTION-ALGORITHM?*", (SubLObject)proof_view_summary.NIL);
        proof_view_summary.$bad_proof_view_rules$ = SubLFiles.deflexical("*BAD-PROOF-VIEW-RULES*", (SubLObject)proof_view_summary.NIL);
        return (SubLObject)proof_view_summary.NIL;
    }
    
    public static SubLObject setup_proof_view_summary_file() {
        access_macros.register_external_symbol((SubLObject)proof_view_summary.$sym0$GET_PROOF_VIEW_INCLUDE_SUMMARY);
        access_macros.register_external_symbol((SubLObject)proof_view_summary.$sym1$SET_PROOF_VIEW_INCLUDE_SUMMARY);
        access_macros.register_external_symbol((SubLObject)proof_view_summary.$sym2$GET_PROOF_VIEW_SUMMARY_ALGORITHM);
        access_macros.register_external_symbol((SubLObject)proof_view_summary.$sym3$SET_PROOF_VIEW_SUMMARY_ALGORITHM);
        memoization_state.note_memoized_function((SubLObject)proof_view_summary.$sym49$FILTER_PROOF_VIEW_ENTRY_SUMMARY_ITEM_);
        return (SubLObject)proof_view_summary.NIL;
    }
    
    public void declareFunctions() {
        declare_proof_view_summary_file();
    }
    
    public void initializeVariables() {
        init_proof_view_summary_file();
    }
    
    public void runTopLevelForms() {
        setup_proof_view_summary_file();
    }
    
    static {
        me = (SubLFile)new proof_view_summary();
        proof_view_summary.$proof_view_show_abductions_in_proof_summaryP$ = null;
        proof_view_summary.$disprefer_hypothetical_terms_in_proof_view_summariesP$ = null;
        proof_view_summary.$proof_view_seen_entries$ = null;
        proof_view_summary.$proof_view_track_seen_entriesP$ = null;
        proof_view_summary.$proof_view_use_new_because_section_algorithmP$ = null;
        proof_view_summary.$bad_proof_view_rules$ = null;
        $sym0$GET_PROOF_VIEW_INCLUDE_SUMMARY = SubLObjectFactory.makeSymbol("GET-PROOF-VIEW-INCLUDE-SUMMARY");
        $sym1$SET_PROOF_VIEW_INCLUDE_SUMMARY = SubLObjectFactory.makeSymbol("SET-PROOF-VIEW-INCLUDE-SUMMARY");
        $sym2$GET_PROOF_VIEW_SUMMARY_ALGORITHM = SubLObjectFactory.makeSymbol("GET-PROOF-VIEW-SUMMARY-ALGORITHM");
        $sym3$SET_PROOF_VIEW_SUMMARY_ALGORITHM = SubLObjectFactory.makeSymbol("SET-PROOF-VIEW-SUMMARY-ALGORITHM");
        $kw4$INCLUDE_SUMMARY_SECTION_ = SubLObjectFactory.makeKeyword("INCLUDE-SUMMARY-SECTION?");
        $sym5$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $kw6$SUMMARY_ROOT = SubLObjectFactory.makeKeyword("SUMMARY-ROOT");
        $str7$proof_view_summary = SubLObjectFactory.makeString("proof-view-summary");
        $kw8$SUMMARY_ALGORITHM = SubLObjectFactory.makeKeyword("SUMMARY-ALGORITHM");
        $kw9$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str10$Can_t_find_a_sentence_from__S = SubLObjectFactory.makeString("Can't find a sentence from ~S");
        $str11$__Got__D_support__p_for__S__ = SubLObjectFactory.makeString("~&Got ~D support~:p for ~S~%");
        $sym12$PROOF_VIEW_SUMMARY_ITEM_SUBSUMES_ = SubLObjectFactory.makeSymbol("PROOF-VIEW-SUMMARY-ITEM-SUBSUMES?");
        $sym13$PROOF_VIEW_ENTRY_GET_OBJECT = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY-GET-OBJECT");
        $str14$__Got__D_summary_item_candidates_ = SubLObjectFactory.makeString("~&Got ~D summary item candidates.~%");
        $sym15$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $const16$causes_PropProp = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("causes-PropProp"));
        $str17$Invalid_summary_item___S = SubLObjectFactory.makeString("Invalid summary item: ~S");
        $str18$Filtering_summary_item___S = SubLObjectFactory.makeString("Filtering summary item: ~S");
        $str19$__Because__D__Adding__S__ = SubLObjectFactory.makeString("~&Because ~D: Adding ~S~%");
        $kw20$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str21$Already_seen__S = SubLObjectFactory.makeString("Already seen ~S");
        $kw22$WHITELIST = SubLObjectFactory.makeKeyword("WHITELIST");
        $sym23$PROOF_VIEW_NON_TRIVIAL_RULE_SUPPORT_ENTRY_UNSUITABLE_FOR_SUMMARY_ = SubLObjectFactory.makeSymbol("PROOF-VIEW-NON-TRIVIAL-RULE-SUPPORT-ENTRY-UNSUITABLE-FOR-SUMMARY?");
        $str24$Using_rule_conclusion___S = SubLObjectFactory.makeString("Using rule conclusion: ~S");
        $str25$Not_descending_into_transitive_su = SubLObjectFactory.makeString("Not descending into transitive support ~S");
        $kw26$EVAL = SubLObjectFactory.makeKeyword("EVAL");
        $str27$Not_descending_into_eval_support_ = SubLObjectFactory.makeString("Not descending into eval support ~S");
        $str28$__Filtering__S__so_using_children = SubLObjectFactory.makeString("~&Filtering ~S, so using children.~%");
        $str29$__Entire_support_tree_pruned_unde = SubLObjectFactory.makeString("~&Entire support tree pruned under~% ~S~%");
        $str30$__Because__D__Attempting__because = SubLObjectFactory.makeString("~&Because ~D: Attempting 'because' strengthening for ~S~%");
        $str31$__Because__D__Got__D_child_suppor = SubLObjectFactory.makeString("~&Because ~D: Got ~D child support~:p.~%");
        $str32$__Inheriting__because__support_fr = SubLObjectFactory.makeString("~&Inheriting 'because' support from child.~%");
        $sym33$CYCL_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P");
        $sym34$PROOF_VIEW_SUMMARY_ITEM_SENTENCE = SubLObjectFactory.makeSymbol("PROOF-VIEW-SUMMARY-ITEM-SENTENCE");
        $sym35$CAUSATION_SENTENCE_P = SubLObjectFactory.makeSymbol("CAUSATION-SENTENCE-P");
        $sym36$CAUSATION_SENTENCE_EFFECT = SubLObjectFactory.makeSymbol("CAUSATION-SENTENCE-EFFECT");
        $str37$__Adding_causation_sentence_____S = SubLObjectFactory.makeString("~&Adding causation sentence:~% ~S~%");
        $str38$__Passing_over__S___down_to__S__ = SubLObjectFactory.makeString("~&Passing over ~S~% down to ~S~%");
        $str39$__Adding_summary_object__S___ = SubLObjectFactory.makeString("~&Adding summary object ~S.~%");
        $sym40$PROOF_VIEW_P = SubLObjectFactory.makeSymbol("PROOF-VIEW-P");
        $kw41$ALLOW_BECAUSE_STRENGTHENING_ = SubLObjectFactory.makeKeyword("ALLOW-BECAUSE-STRENGTHENING?");
        $sym42$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $str43$Expanding_entry__D__S____S = SubLObjectFactory.makeString("Expanding entry ~D ~S~% ~S");
        $str44$Filtering__S__despite_no_child_fa = SubLObjectFactory.makeString("Filtering ~S, despite no child facts.");
        $str45$No_child_facts_for__S = SubLObjectFactory.makeString("No child facts for ~S");
        $sym46$PROOF_VIEW_FACT_IMPLIES_ = SubLObjectFactory.makeSymbol("PROOF-VIEW-FACT-IMPLIES?");
        $sym47$PROOF_VIEW_FACT_REFERENCES_HYPOTHETICAL_ = SubLObjectFactory.makeSymbol("PROOF-VIEW-FACT-REFERENCES-HYPOTHETICAL?");
        $sym48$HYPOTHETICAL_TERM_P = SubLObjectFactory.makeSymbol("HYPOTHETICAL-TERM-P");
        $sym49$FILTER_PROOF_VIEW_ENTRY_SUMMARY_ITEM_ = SubLObjectFactory.makeSymbol("FILTER-PROOF-VIEW-ENTRY-SUMMARY-ITEM?");
        $str50$Trivial_support___S = SubLObjectFactory.makeString("Trivial support: ~S");
        $str51$Trivial_support_for_answer___S = SubLObjectFactory.makeString("Trivial support for answer: ~S");
        $str52$Assertion_on_hypothetical___S = SubLObjectFactory.makeString("Assertion on hypothetical: ~S");
        $str53$Trivial_sentence___S__ = SubLObjectFactory.makeString("Trivial sentence: ~S~%");
        $str54$Non_THCL___S = SubLObjectFactory.makeString("Non-THCL: ~S");
        $str55$__WHITELIST__Allowing__S__ = SubLObjectFactory.makeString("~&WHITELIST: Allowing ~S~%");
        $str56$___S_has_a_highly_relevant_predic = SubLObjectFactory.makeString("~&~S has a highly relevant predicate.~%");
        $const57$assertionRequiredForJustification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionRequiredForJustificationParaphrase"));
        $str58$___S_is_a_required_assertion___ = SubLObjectFactory.makeString("~&~S is a required assertion.~%");
        $str59$WHITELIST__Filtering__S = SubLObjectFactory.makeString("WHITELIST: Filtering ~S");
    }
}

/*

	Total time: 166 ms
	
*/