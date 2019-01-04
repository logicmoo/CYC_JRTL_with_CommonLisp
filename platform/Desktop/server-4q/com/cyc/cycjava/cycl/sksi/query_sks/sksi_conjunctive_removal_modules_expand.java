package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_conjunctive_removal_modules_expand extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand";
    public static final String myFingerPrint = "06f1baa9eb3eb9dc377346f6c1ba58b63ffd63de465e8a54f8d9ca2be861bec5";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 974L)
    private static SubLSymbol $sksi_crm_return_null_bindingsP$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$VARPRED;
    private static final SubLSymbol $kw2$GENLPREDS;
    private static final SubLSymbol $kw3$GENLINVERSE;
    private static final SubLString $str4$__SKSI__A_;
    private static final SubLString $str5$Could_not_form_a_CSQL_query_with_;
    private static final SubLObject $const6$meaningSentencePredicateForSource;
    private static final SubLSymbol $kw7$TRUE;
    private static final SubLString $str8$Could_not_find_table_name_via___m;
    private static final SubLSymbol $kw9$ROBUST;
    private static final SubLSymbol $kw10$NORMAL;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$_EXIT;
    private static final SubLSymbol $sym13$SKSI_CRM_RESULT_ITERATOR_NEXT;
    private static final SubLSymbol $sym14$SKSI_CRM_RESULT_ITERATOR_DONE;
    private static final SubLSymbol $sym15$SKSI_CRM_RESULT_ITERATOR_FINALIZE;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$SKSI;
    private static final SubLObject $const19$genlPreds;
    private static final SubLObject $const20$genlInverse;
    private static final SubLString $str21$Unknown_support_keyword__a_;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$SKSI_CRM_RESULT_ITERATOR_P;
    private static final SubLSymbol $kw24$RS_INDEX;
    private static final SubLSymbol $kw25$DECODE;
    private static final SubLSymbol $sym26$VARIABLE_P;
    private static final SubLSymbol $sym27$FIRST;
    private static final SubLSymbol $sym28$ALPHA_OR_UNDERSCORE_P;
    private static final SubLSymbol $sym29$SKSI_CSQL_ATOMS_EQUAL;
    private static final SubLSymbol $sym30$TEST_SKSI_CONJUNCTIVE_QUERY_TO_CSQL;
    private static final SubLSymbol $kw31$TEST;
    private static final SubLSymbol $sym32$SKSI_CSQL_EQUIVALENT;
    private static final SubLSymbol $kw33$OWNER;
    private static final SubLSymbol $kw34$CLASSES;
    private static final SubLSymbol $kw35$KB;
    private static final SubLSymbol $kw36$FULL;
    private static final SubLSymbol $kw37$WORKING_;
    private static final SubLObject $list38;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 1297L)
    public static SubLObject removal_sksi_conjunction_pos_lits_output_generate(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile, SubLObject accept_null_bindingsP, SubLObject ask_queryP) {
        if (accept_null_bindingsP == sksi_conjunctive_removal_modules_expand.UNPROVIDED) {
            accept_null_bindingsP = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        }
        if (ask_queryP == sksi_conjunctive_removal_modules_expand.UNPROVIDED) {
            ask_queryP = (SubLObject)sksi_conjunctive_removal_modules_expand.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        final SubLObject mt_var = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sksi_conjunctive_removal_modules_expand.$sksi_crm_return_null_bindingsP$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$.bind(sksi_query_utilities.sksi_cost_recording_suspended_for_current_iterator_initial_state(), thread);
            sksi_conjunctive_removal_modules_expand.$sksi_crm_return_null_bindingsP$.bind(accept_null_bindingsP, thread);
            final SubLObject logical_schemata = sksi_query_datastructures.sks_profile_logical_schemata(sks_profile);
            final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
            final SubLObject meaning_sentence_gafs = sksi_conjunctive_removal_module_utilities.get_all_meaning_sentence_gafs_for_contextualized_dnf_clause(contextualized_dnf_clause, logical_schemata, sks, (SubLObject)sksi_conjunctive_removal_modules_expand.T, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
            result = sksi_crm_expand_iterate_over_meaning_sentence_gafs((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, meaning_sentence_gafs, contextualized_dnf_clause, sks_profile, ask_queryP);
            if (sksi_conjunctive_removal_modules_expand.NIL != ask_queryP && sksi_conjunctive_removal_modules_expand.NIL == sksi_query_utilities.sksi_cost_recording_suspended_for_current_iteratorP()) {
                result = sksi_query_utilities.generate_sksi_conjunctive_cost_recording_iterator(result, sks);
            }
        }
        finally {
            sksi_conjunctive_removal_modules_expand.$sksi_crm_return_null_bindingsP$.rebind(_prev_bind_5, thread);
            sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 2421L)
    public static SubLObject sksi_crm_expand_iterate_over_meaning_sentence_gafs(final SubLObject meaning_sentence_gafs_so_far, final SubLObject remaining_meaning_sentence_gafs, final SubLObject contextualized_dnf_clause, final SubLObject sks_profile, SubLObject ask_queryP) {
        if (ask_queryP == sksi_conjunctive_removal_modules_expand.UNPROVIDED) {
            ask_queryP = (SubLObject)sksi_conjunctive_removal_modules_expand.T;
        }
        SubLObject results = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        if (sksi_conjunctive_removal_modules_expand.NIL == remaining_meaning_sentence_gafs) {
            results = sksi_crm_expand_process_meaning_sentence_gafs(meaning_sentence_gafs_so_far, contextualized_dnf_clause, sks_profile, ask_queryP);
        }
        else {
            final SubLObject gafs = remaining_meaning_sentence_gafs.first();
            if (sksi_conjunctive_removal_modules_expand.NIL != gafs) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
                gaf = cdolist_list_var.first();
                while (sksi_conjunctive_removal_modules_expand.NIL != cdolist_list_var) {
                    results = ConsesLow.nconc(results, sksi_crm_expand_iterate_over_meaning_sentence_gafs(list_utilities.snoc(gaf, meaning_sentence_gafs_so_far), remaining_meaning_sentence_gafs.rest(), contextualized_dnf_clause, sks_profile, ask_queryP));
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                }
            }
            else {
                results = sksi_crm_expand_iterate_over_meaning_sentence_gafs(list_utilities.snoc((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, meaning_sentence_gafs_so_far), remaining_meaning_sentence_gafs.rest(), contextualized_dnf_clause, sks_profile, ask_queryP);
            }
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 3433L)
    public static SubLObject sksi_crm_expand_process_meaning_sentence_gafs(final SubLObject meaning_sentence_gafs, final SubLObject contextualized_dnf_clause, final SubLObject sks_profile, SubLObject ask_queryP) {
        if (ask_queryP == sksi_conjunctive_removal_modules_expand.UNPROVIDED) {
            ask_queryP = (SubLObject)sksi_conjunctive_removal_modules_expand.T;
        }
        SubLObject asents = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject keywords = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject new_meaning_sentence_gafs = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject num = (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        lit = cdolist_list_var.first();
        while (sksi_conjunctive_removal_modules_expand.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = lit;
            SubLObject mt = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            SubLObject asent = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_expand.$list0);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_expand.$list0);
            asent = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_modules_expand.NIL == current) {
                final SubLObject meaning_sentence_gaf = ConsesLow.nth(num, meaning_sentence_gafs);
                if (sksi_conjunctive_removal_modules_expand.NIL != meaning_sentence_gaf) {
                    final SubLObject asent_args = cycl_utilities.formula_args(asent, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
                    final SubLObject inverse_args = Sequences.reverse(asent_args);
                    final SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
                    new_meaning_sentence_gafs = (SubLObject)ConsesLow.cons(meaning_sentence_gaf, new_meaning_sentence_gafs);
                    asents = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, asents);
                    keywords = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, keywords);
                    if (sksi_conjunctive_removal_modules_expand.NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(asent)) {
                        ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, asents, (SubLObject)ConsesLow.cons(lit, ConsesLow.nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, asents)));
                        ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, keywords, (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_expand.$kw1$VARPRED, ConsesLow.nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, keywords)));
                    }
                    else {
                        final SubLObject asent_pred = el_utilities.literal_predicate(asent, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
                        final SubLObject spec_preds = sksi_conjunctive_removal_module_utilities.sksi_relevant_spec_preds_from_meaning_sentence(asent_pred, meaning_sentence, mt, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
                        final SubLObject spec_inverses = sksi_conjunctive_removal_module_utilities.sksi_relevant_spec_inverses_from_meaning_sentence(asent_pred, meaning_sentence, mt, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
                        if (sksi_conjunctive_removal_modules_expand.NIL == spec_preds && sksi_conjunctive_removal_modules_expand.NIL == spec_inverses) {
                            return (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
                        }
                        SubLObject cdolist_list_var_$1 = spec_preds;
                        SubLObject spec_pred = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
                        spec_pred = cdolist_list_var_$1.first();
                        while (sksi_conjunctive_removal_modules_expand.NIL != cdolist_list_var_$1) {
                            final SubLObject new_asent = el_utilities.list_to_elf((SubLObject)ConsesLow.cons(spec_pred, asent_args));
                            final SubLObject new_lit = inference_datastructures_problem_query.make_contextualized_asent(mt, new_asent);
                            ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, asents, (SubLObject)ConsesLow.cons(new_lit, ConsesLow.nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, asents)));
                            ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, keywords, (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_expand.$kw2$GENLPREDS, ConsesLow.nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, keywords)));
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            spec_pred = cdolist_list_var_$1.first();
                        }
                        SubLObject cdolist_list_var_$2 = spec_inverses;
                        SubLObject spec_inverse = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
                        spec_inverse = cdolist_list_var_$2.first();
                        while (sksi_conjunctive_removal_modules_expand.NIL != cdolist_list_var_$2) {
                            final SubLObject new_asent = el_utilities.list_to_elf((SubLObject)ConsesLow.cons(spec_inverse, inverse_args));
                            final SubLObject new_lit = inference_datastructures_problem_query.make_contextualized_asent(mt, new_asent);
                            ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, asents, (SubLObject)ConsesLow.cons(new_lit, ConsesLow.nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, asents)));
                            ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, keywords, (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_expand.$kw3$GENLINVERSE, ConsesLow.nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, keywords)));
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            spec_inverse = cdolist_list_var_$2.first();
                        }
                    }
                }
                else {
                    keywords = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, keywords);
                    asents = (SubLObject)ConsesLow.cons(lit, asents);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_modules_expand.$list0);
            }
            num = Numbers.add(num, (SubLObject)sksi_conjunctive_removal_modules_expand.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        asents = Sequences.nreverse(asents);
        keywords = Sequences.nreverse(keywords);
        new_meaning_sentence_gafs = Sequences.nreverse(new_meaning_sentence_gafs);
        return sksi_crm_expand_iterate_over_asents((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, (SubLObject)sksi_conjunctive_removal_modules_expand.NIL, (SubLObject)sksi_conjunctive_removal_modules_expand.NIL, (SubLObject)sksi_conjunctive_removal_modules_expand.NIL, (SubLObject)sksi_conjunctive_removal_modules_expand.NIL, asents, (SubLObject)sksi_conjunctive_removal_modules_expand.NIL, keywords, new_meaning_sentence_gafs, contextualized_dnf_clause, sks_profile, ask_queryP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 5572L)
    public static SubLObject sksi_crm_expand_iterate_over_asents(final SubLObject regular_asents_so_far, final SubLObject comparison_asents_so_far, final SubLObject evaluate_asents_so_far, final SubLObject sksi_unknown_sentence_asents_fo_far, final SubLObject all_asents_so_far, final SubLObject remaining_asents, final SubLObject keywords_so_far, final SubLObject remaining_keywords, final SubLObject meaning_sentence_gafs, final SubLObject contextualized_dnf_clause, final SubLObject sks_profile, SubLObject ask_queryP) {
        if (ask_queryP == sksi_conjunctive_removal_modules_expand.UNPROVIDED) {
            ask_queryP = (SubLObject)sksi_conjunctive_removal_modules_expand.T;
        }
        SubLObject results = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        if (sksi_conjunctive_removal_modules_expand.NIL == remaining_asents) {
            results = sksi_crm_expand_get_results(meaning_sentence_gafs, regular_asents_so_far, comparison_asents_so_far, evaluate_asents_so_far, sksi_unknown_sentence_asents_fo_far, all_asents_so_far, contextualized_dnf_clause, keywords_so_far, sks_profile, ask_queryP);
        }
        else if (sksi_conjunctive_removal_modules_expand.NIL != remaining_keywords.first()) {
            SubLObject asent = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            SubLObject asent_$3 = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            SubLObject keyword = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            SubLObject keyword_$4 = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            asent = remaining_asents.first();
            asent_$3 = asent.first();
            keyword = remaining_keywords.first();
            keyword_$4 = keyword.first();
            while (sksi_conjunctive_removal_modules_expand.NIL != keyword || sksi_conjunctive_removal_modules_expand.NIL != asent) {
                results = ConsesLow.nconc(results, sksi_crm_expand_iterate_over_asents(list_utilities.snoc(asent_$3, regular_asents_so_far), comparison_asents_so_far, evaluate_asents_so_far, sksi_unknown_sentence_asents_fo_far, list_utilities.snoc(asent_$3, all_asents_so_far), remaining_asents.rest(), list_utilities.snoc(keyword_$4, keywords_so_far), remaining_keywords.rest(), meaning_sentence_gafs, contextualized_dnf_clause, sks_profile, ask_queryP));
                asent = asent.rest();
                asent_$3 = asent.first();
                keyword = keyword.rest();
                keyword_$4 = keyword.first();
            }
        }
        else {
            final SubLObject asent = remaining_asents.first();
            final SubLObject asent_asent = inference_datastructures_problem_query.contextualized_asent_asent(asent);
            if (sksi_conjunctive_removal_modules_expand.NIL != sksi_query_utilities.evaluate_literal_p(asent_asent)) {
                results = ConsesLow.nconc(results, sksi_crm_expand_iterate_over_asents(regular_asents_so_far, comparison_asents_so_far, list_utilities.snoc(asent, evaluate_asents_so_far), sksi_unknown_sentence_asents_fo_far, list_utilities.snoc(asent, all_asents_so_far), remaining_asents.rest(), list_utilities.snoc((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, keywords_so_far), remaining_keywords.rest(), meaning_sentence_gafs, contextualized_dnf_clause, sks_profile, ask_queryP));
            }
            else if (sksi_conjunctive_removal_modules_expand.NIL != sksi_query_utilities.sksi_unknown_sentence_literal_p(asent_asent)) {
                results = ConsesLow.nconc(results, sksi_crm_expand_iterate_over_asents(regular_asents_so_far, comparison_asents_so_far, evaluate_asents_so_far, list_utilities.snoc(asent, sksi_unknown_sentence_asents_fo_far), list_utilities.snoc(asent, all_asents_so_far), remaining_asents.rest(), list_utilities.snoc((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, keywords_so_far), remaining_keywords.rest(), meaning_sentence_gafs, contextualized_dnf_clause, sks_profile, ask_queryP));
            }
            else if (sksi_conjunctive_removal_modules_expand.NIL != sksi_query_utilities.comparison_literal_p(asent_asent)) {
                results = ConsesLow.nconc(results, sksi_crm_expand_iterate_over_asents(regular_asents_so_far, list_utilities.snoc(asent, comparison_asents_so_far), evaluate_asents_so_far, sksi_unknown_sentence_asents_fo_far, list_utilities.snoc(asent, all_asents_so_far), remaining_asents.rest(), list_utilities.snoc((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, keywords_so_far), remaining_keywords.rest(), meaning_sentence_gafs, contextualized_dnf_clause, sks_profile, ask_queryP));
            }
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 8337L)
    public static SubLObject sksi_crm_expand_get_results(final SubLObject meaning_sentence_gafs, final SubLObject regular_asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject all_asents, final SubLObject contextualized_dnf_clause, final SubLObject keywords, final SubLObject sks_profile, SubLObject ask_queryP) {
        if (ask_queryP == sksi_conjunctive_removal_modules_expand.UNPROVIDED) {
            ask_queryP = (SubLObject)sksi_conjunctive_removal_modules_expand.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        final SubLObject content_mt = sksi_query_datastructures.sks_profile_content_mt(sks_profile);
        SubLObject results = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        if (sksi_conjunctive_removal_modules_expand.NIL != sksi_conjunctive_removal_module_utilities.sksi_crm_joinable_asentsP(regular_asents, meaning_sentence_gafs, sksi_query_datastructures.sks_profile_physical_schemata(sks_profile))) {
            thread.resetMultipleValues();
            final SubLObject csql = sksi_conjunctive_removal_module_utilities.sksi_crm_generate_csql_for_query(regular_asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs, sks_profile);
            final SubLObject var_decoding_map = thread.secondMultipleValue();
            final SubLObject booleanP = thread.thirdMultipleValue();
            final SubLObject error_message = thread.fourthMultipleValue();
            final SubLObject var_pfi_encodings = thread.fifthMultipleValue();
            final SubLObject var_lit_pfis = thread.sixthMultipleValue();
            final SubLObject lit_pfi_selects = thread.seventhMultipleValue();
            final SubLObject var_lfi_map = thread.eighthMultipleValue();
            thread.resetMultipleValues();
            if (sksi_conjunctive_removal_modules_expand.NIL != error_message) {
                if (sksi_conjunctive_removal_modules_expand.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_conjunctive_removal_modules_expand.FOUR_INTEGER)) {
                    PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_conjunctive_removal_modules_expand.$str4$__SKSI__A_, (SubLObject)sksi_conjunctive_removal_modules_expand.$str5$Could_not_form_a_CSQL_query_with_), new SubLObject[] { sksi_conjunctive_removal_modules_expand.FOUR_INTEGER, meaning_sentence_gafs, ConsesLow.append(regular_asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents), error_message });
                    streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                }
            }
            else if (sksi_conjunctive_removal_modules_expand.NIL != ask_queryP) {
                if (sksi_conjunctive_removal_modules_expand.NIL != booleanP) {
                    final SubLObject result = sksi_sks_interaction.generate_boolean_from_csql(csql, sks, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
                    if (sksi_conjunctive_removal_modules_expand.NIL != result) {
                        final SubLObject supports = conjunctive_boolean_csql_to_sksi_support(all_asents, keywords, contextualized_dnf_clause, content_mt);
                        inference_worker_removal.conjunctive_removal_callback((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, supports);
                    }
                }
                else {
                    SubLObject table_names = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
                    SubLObject cdolist_list_var = all_asents;
                    SubLObject asent = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
                    asent = cdolist_list_var.first();
                    while (sksi_conjunctive_removal_modules_expand.NIL != cdolist_list_var) {
                        final SubLObject v_term = conses_high.second(asent).first();
                        if (sksi_conjunctive_removal_modules_expand.NIL != forts.fort_p(v_term)) {
                            table_names = (SubLObject)ConsesLow.cons(kb_mapping_utilities.pred_values(conses_high.second(asent).first(), sksi_conjunctive_removal_modules_expand.$const6$meaningSentencePredicateForSource, (SubLObject)sksi_conjunctive_removal_modules_expand.TWO_INTEGER, (SubLObject)sksi_conjunctive_removal_modules_expand.ONE_INTEGER, (SubLObject)sksi_conjunctive_removal_modules_expand.$kw7$TRUE), table_names);
                        }
                        else if (sksi_conjunctive_removal_modules_expand.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_conjunctive_removal_modules_expand.FOUR_INTEGER)) {
                            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_conjunctive_removal_modules_expand.$str4$__SKSI__A_, (SubLObject)sksi_conjunctive_removal_modules_expand.$str8$Could_not_find_table_name_via___m), new SubLObject[] { sksi_conjunctive_removal_modules_expand.FOUR_INTEGER, v_term, asent });
                            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        asent = cdolist_list_var.first();
                    }
                    final SubLObject _prev_bind_0 = sksi_macros.$spreadsheet_sksi_conjunctive_query_table_name_list$.currentBinding(thread);
                    try {
                        sksi_macros.$spreadsheet_sksi_conjunctive_query_table_name_list$.bind(Sequences.remove_duplicates(list_utilities.flatten(table_names), (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED), thread);
                        final SubLObject trans_style = (SubLObject)((sksi_conjunctive_removal_modules_expand.NIL != sksi_conjunctive_removal_modules_expand.$sksi_crm_return_null_bindingsP$.getDynamicValue(thread)) ? sksi_conjunctive_removal_modules_expand.$kw9$ROBUST : sksi_conjunctive_removal_modules_expand.$kw10$NORMAL);
                        final SubLObject rs_iterator = sksi_sks_interaction.generate_iterator_from_csql(csql, sks, (SubLObject)sksi_conjunctive_removal_modules_expand.NIL, (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)sksi_conjunctive_removal_modules_expand.NIL, trans_style);
                        if (rs_iterator.equal((SubLObject)sksi_conjunctive_removal_modules_expand.$list11)) {
                            SubLObject supports2 = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
                            SubLObject cdolist_list_var2 = all_asents;
                            SubLObject asent2 = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
                            asent2 = cdolist_list_var2.first();
                            while (sksi_conjunctive_removal_modules_expand.NIL != cdolist_list_var2) {
                                supports2 = (SubLObject)ConsesLow.cons(sksi_infrastructure_utilities.make_sksi_support(asent2, mt_relevance_macros.$mt$.getDynamicValue(thread)), supports2);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                asent2 = cdolist_list_var2.first();
                            }
                            return (SubLObject)ConsesLow.list(iteration.new_list_iterator((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, (SubLObject)ConsesLow.list(supports2)))));
                        }
                        if (sksi_conjunctive_removal_modules_expand.NIL != iteration.iterator_p(rs_iterator) && sksi_conjunctive_removal_modules_expand.NIL == iteration.iteration_done(rs_iterator)) {
                            final SubLObject result_iterator = new_sksi_crm_result_iterator(rs_iterator, var_decoding_map, all_asents, contextualized_dnf_clause, keywords, sks, content_mt);
                            results = (SubLObject)ConsesLow.list(result_iterator);
                        }
                    }
                    finally {
                        sksi_macros.$spreadsheet_sksi_conjunctive_query_table_name_list$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            else {
                results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(csql, var_decoding_map, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, var_lfi_map), results);
            }
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 11320L)
    public static SubLObject sksi_crm_result_iterator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_expand.NIL != iteration.iterator_p(v_object) && iteration.iteration_next_peek(v_object) == sksi_conjunctive_removal_modules_expand.$sym13$SKSI_CRM_RESULT_ITERATOR_NEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 11577L)
    public static SubLObject new_sksi_crm_result_iterator(final SubLObject rs_iterator, final SubLObject var_decoding_map, final SubLObject asents, final SubLObject contextualized_dnf_clause, final SubLObject keywords, final SubLObject sks, final SubLObject content_mt) {
        return iteration.new_iterator(sksi_crm_result_iterator_state(rs_iterator, var_decoding_map, asents, contextualized_dnf_clause, keywords, sks, content_mt), (SubLObject)sksi_conjunctive_removal_modules_expand.$sym14$SKSI_CRM_RESULT_ITERATOR_DONE, (SubLObject)sksi_conjunctive_removal_modules_expand.$sym13$SKSI_CRM_RESULT_ITERATOR_NEXT, (SubLObject)sksi_conjunctive_removal_modules_expand.$sym15$SKSI_CRM_RESULT_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 11972L)
    public static SubLObject sksi_crm_result_iterator_state(final SubLObject rs_iterator, final SubLObject var_decoding_map, final SubLObject asents, final SubLObject contextualized_dnf_clause, final SubLObject keywords, final SubLObject sks, final SubLObject content_mt) {
        final SubLObject support_template = sksi_crm_result_iterator_build_support_template(asents, content_mt, contextualized_dnf_clause, keywords);
        final SubLObject content_mt_$5 = sksi_kb_accessors.sk_source_content_mt(sks);
        final SubLObject queue = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        return (SubLObject)ConsesLow.list(queue, rs_iterator, var_decoding_map, support_template, sks, content_mt_$5);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 12382L)
    public static SubLObject sksi_crm_result_iterator_build_support_template(final SubLObject asents, final SubLObject content_mt, final SubLObject contextualized_dnf_clause, final SubLObject keywords) {
        SubLObject support_template = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject asent = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject asent_$6 = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject original_lit = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject original_lit_$7 = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject keyword = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject keyword_$8 = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        asent = asents;
        asent_$6 = asent.first();
        original_lit = clauses.pos_lits(contextualized_dnf_clause);
        original_lit_$7 = original_lit.first();
        keyword = keywords;
        keyword_$8 = keyword.first();
        while (sksi_conjunctive_removal_modules_expand.NIL != keyword || sksi_conjunctive_removal_modules_expand.NIL != original_lit || sksi_conjunctive_removal_modules_expand.NIL != asent) {
            SubLObject current;
            final SubLObject datum = current = asent_$6;
            SubLObject asent_mt = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            SubLObject asent_asent = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_expand.$list16);
            asent_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_expand.$list16);
            asent_asent = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_modules_expand.NIL == current) {
                SubLObject current_$10;
                final SubLObject datum_$9 = current_$10 = original_lit_$7;
                SubLObject original_mt = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
                SubLObject original_asent = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)sksi_conjunctive_removal_modules_expand.$list17);
                original_mt = current_$10.first();
                current_$10 = current_$10.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)sksi_conjunctive_removal_modules_expand.$list17);
                original_asent = current_$10.first();
                current_$10 = current_$10.rest();
                if (sksi_conjunctive_removal_modules_expand.NIL == current_$10) {
                    final SubLObject asent_support = arguments.make_hl_support((SubLObject)sksi_conjunctive_removal_modules_expand.$kw18$SKSI, asent_asent, content_mt, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
                    final SubLObject aux_support = sksi_crm_result_iterator_build_auxiliary_support(asent_asent, original_asent, original_mt, keyword_$8);
                    if (sksi_conjunctive_removal_modules_expand.NIL != aux_support) {
                        support_template = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(asent_support, aux_support), support_template);
                    }
                    else {
                        support_template = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(asent_support), support_template);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$9, (SubLObject)sksi_conjunctive_removal_modules_expand.$list17);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_modules_expand.$list16);
            }
            asent = asent.rest();
            asent_$6 = asent.first();
            original_lit = original_lit.rest();
            original_lit_$7 = original_lit.first();
            keyword = keyword.rest();
            keyword_$8 = keyword.first();
        }
        return Sequences.nreverse(support_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 13202L)
    public static SubLObject sksi_crm_result_iterator_build_auxiliary_support(final SubLObject asent, final SubLObject original_asent, final SubLObject original_mt, final SubLObject support_keyword) {
        SubLObject support = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        if (sksi_conjunctive_removal_modules_expand.NIL != support_keyword && !asent.equal(original_asent)) {
            final SubLObject pred = el_utilities.literal_predicate(asent, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
            final SubLObject original_pred = el_utilities.literal_predicate(original_asent, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
            if (support_keyword.eql((SubLObject)sksi_conjunctive_removal_modules_expand.$kw2$GENLPREDS)) {
                support = arguments.make_hl_support((SubLObject)sksi_conjunctive_removal_modules_expand.$kw2$GENLPREDS, el_utilities.make_binary_formula(sksi_conjunctive_removal_modules_expand.$const19$genlPreds, pred, original_pred), original_mt, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
            }
            else if (support_keyword.eql((SubLObject)sksi_conjunctive_removal_modules_expand.$kw3$GENLINVERSE)) {
                support = arguments.make_hl_support((SubLObject)sksi_conjunctive_removal_modules_expand.$kw2$GENLPREDS, el_utilities.make_binary_formula(sksi_conjunctive_removal_modules_expand.$const20$genlInverse, pred, original_pred), original_mt, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
            }
            else {
                Errors.warn((SubLObject)sksi_conjunctive_removal_modules_expand.$str21$Unknown_support_keyword__a_, support_keyword);
            }
        }
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 13908L)
    public static SubLObject sksi_crm_result_iterator_done(final SubLObject state) {
        SubLObject queue = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject rs_iterator = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject var_decoding_map = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject support_template = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject sks = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject content_mt = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        queue = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        rs_iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        var_decoding_map = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        support_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        sks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        content_mt = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_modules_expand.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_expand.NIL == queue && sksi_conjunctive_removal_modules_expand.NIL != iteration.iteration_done(rs_iterator));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        return (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 14194L)
    public static SubLObject sksi_crm_result_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject queue = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject rs_iterator = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject var_decoding_map = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject support_template = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject sks = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject content_mt = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        queue = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        rs_iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        var_decoding_map = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        support_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        sks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        content_mt = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_modules_expand.NIL == current) {
            SubLObject result = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            SubLObject premature_endP = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            if (sksi_conjunctive_removal_modules_expand.NIL != queue) {
                ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, state, queue.rest());
                result = queue.first();
            }
            else {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(content_mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    while (sksi_conjunctive_removal_modules_expand.NIL == result && sksi_conjunctive_removal_modules_expand.NIL == premature_endP) {
                        thread.resetMultipleValues();
                        final SubLObject raw_results = iteration.iteration_next(rs_iterator);
                        final SubLObject validP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (sksi_conjunctive_removal_modules_expand.NIL != validP) {
                            final SubLObject results = list_utilities.fast_delete_duplicates(sksi_crm_expand_process_results(raw_results, var_decoding_map, support_template, sks), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_expand.EQUAL), (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
                            if (sksi_conjunctive_removal_modules_expand.NIL == results) {
                                continue;
                            }
                            result = results.first();
                            ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, state, results.rest());
                        }
                        else {
                            premature_endP = (SubLObject)sksi_conjunctive_removal_modules_expand.T;
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            return Values.values(result, state, premature_endP);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        return (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 15006L)
    public static SubLObject sksi_crm_result_iterator_finalize(final SubLObject state) {
        SubLObject queue = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject rs_iterator = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject var_decoding_map = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject support_template = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject sks = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject content_mt = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        queue = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        rs_iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        var_decoding_map = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        support_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        sks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        content_mt = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_modules_expand.NIL == current) {
            return iteration.iteration_finalize(rs_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)sksi_conjunctive_removal_modules_expand.$list22);
        return (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 15278L)
    public static SubLObject sksi_crm_result_iterator_size(final SubLObject result_iterator) {
        assert sksi_conjunctive_removal_modules_expand.NIL != sksi_crm_result_iterator_p(result_iterator) : result_iterator;
        final SubLObject state = iteration.iteration_state_peek(result_iterator);
        if (sksi_conjunctive_removal_modules_expand.NIL != list_utilities.proper_list_p(state)) {
            final SubLObject raw_iterator = conses_high.second(state);
            if (sksi_conjunctive_removal_modules_expand.NIL != iteration.list_iterator_p(raw_iterator)) {
                final SubLObject size = iteration.list_iterator_size(raw_iterator);
                return size;
            }
        }
        return (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 15688L)
    public static SubLObject sksi_crm_expand_process_results(final SubLObject raw_results, final SubLObject var_decoding_map, final SubLObject support_template, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject processed_results = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject binding_lists = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject alist = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject list_var = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject raw_result = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject index = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        list_var = raw_results;
        raw_result = list_var.first();
        for (index = (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER; sksi_conjunctive_removal_modules_expand.NIL != list_var; list_var = list_var.rest(), raw_result = list_var.first(), index = Numbers.add((SubLObject)sksi_conjunctive_removal_modules_expand.ONE_INTEGER, index)) {
            alist = conses_high.acons((SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_modules_expand.$kw24$RS_INDEX, index), raw_result, alist);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_decoding_map)); sksi_conjunctive_removal_modules_expand.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject decodings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject subst_decodings = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            SubLObject var_bindings = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            SubLObject cdolist_list_var = decodings;
            SubLObject decoding = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            decoding = cdolist_list_var.first();
            while (sksi_conjunctive_removal_modules_expand.NIL != cdolist_list_var) {
                subst_decodings = (SubLObject)ConsesLow.cons(conses_high.sublis(alist, decoding, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_expand.EQUAL), (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED), subst_decodings);
                cdolist_list_var = cdolist_list_var.rest();
                decoding = cdolist_list_var.first();
            }
            subst_decodings = (cdolist_list_var = list_utilities.fast_delete_duplicates(subst_decodings, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_expand.EQUAL), (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED));
            SubLObject subst_decoding = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            subst_decoding = cdolist_list_var.first();
            while (sksi_conjunctive_removal_modules_expand.NIL != cdolist_list_var) {
                final SubLObject reformed = sksi_reformulate.sksi_reformulate(subst_decoding, (SubLObject)sksi_conjunctive_removal_modules_expand.$kw25$DECODE, sks);
                if (sksi_conjunctive_removal_modules_expand.NIL == sksi_query_utilities.sksi_unreformulatable_p(reformed)) {
                    final SubLObject binding = bindings.make_variable_binding(var, reformed);
                    if (sksi_conjunctive_removal_modules_expand.NIL == sksi_crm_valid_bindingP(binding)) {
                        return (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
                    }
                    var_bindings = (SubLObject)ConsesLow.cons(binding, var_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subst_decoding = cdolist_list_var.first();
            }
            binding_lists = (SubLObject)ConsesLow.cons(list_utilities.fast_delete_duplicates(var_bindings, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_expand.EQUAL), (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED), binding_lists);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        SubLObject cdolist_list_var2;
        final SubLObject all_bindings = cdolist_list_var2 = sksi_crm_cartesian_product(binding_lists);
        SubLObject v_bindings = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        v_bindings = cdolist_list_var2.first();
        while (sksi_conjunctive_removal_modules_expand.NIL != cdolist_list_var2) {
            v_bindings = sksi_crm_nsanitize_bindings(v_bindings);
            final SubLObject supports = conses_high.sublis(v_bindings, support_template, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_expand.EQ), (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
            processed_results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, supports), processed_results);
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_bindings = cdolist_list_var2.first();
        }
        return processed_results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 17124L)
    public static SubLObject sksi_crm_valid_bindingP(final SubLObject binding) {
        final SubLObject variable = bindings.variable_binding_variable(binding);
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_expand.NIL != variables.variable_p(variable) || sksi_conjunctive_removal_modules_expand.NIL != unification.unify_possible(variable, bindings.variable_binding_value(binding)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 17406L)
    public static SubLObject sksi_crm_nsanitize_bindings(SubLObject v_bindings) {
        if (sksi_conjunctive_removal_modules_expand.NIL != list_utilities.find_if_not(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_expand.$sym26$VARIABLE_P), v_bindings, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_expand.$sym27$FIRST), (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED)) {
            v_bindings = list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_expand.$sym26$VARIABLE_P), v_bindings, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_expand.$sym27$FIRST), (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
        }
        return v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 17626L)
    public static SubLObject sksi_crm_cartesian_product(final SubLObject lists) {
        SubLObject non_singletonP = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject result = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        if (sksi_conjunctive_removal_modules_expand.NIL == non_singletonP) {
            SubLObject csome_list_var = lists;
            SubLObject list = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            list = csome_list_var.first();
            while (sksi_conjunctive_removal_modules_expand.NIL == non_singletonP && sksi_conjunctive_removal_modules_expand.NIL != csome_list_var) {
                if (sksi_conjunctive_removal_modules_expand.NIL == list_utilities.singletonP(list)) {
                    non_singletonP = (SubLObject)sksi_conjunctive_removal_modules_expand.T;
                }
                csome_list_var = csome_list_var.rest();
                list = csome_list_var.first();
            }
        }
        if (sksi_conjunctive_removal_modules_expand.NIL != non_singletonP) {
            result = list_utilities.cartesian_product(lists, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
        }
        else {
            SubLObject sub_result = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            SubLObject cdolist_list_var = lists;
            SubLObject list2 = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            list2 = cdolist_list_var.first();
            while (sksi_conjunctive_removal_modules_expand.NIL != cdolist_list_var) {
                sub_result = ConsesLow.nconc(sub_result, list2);
                cdolist_list_var = cdolist_list_var.rest();
                list2 = cdolist_list_var.first();
            }
            result = (SubLObject)ConsesLow.cons(sub_result, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 18030L)
    public static SubLObject conjunctive_boolean_csql_to_sksi_support(final SubLObject lits, final SubLObject keywords, final SubLObject contextualized_dnf_clause, final SubLObject content_mt) {
        SubLObject supports = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject lit = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject lit_$11 = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject original_lit = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject original_lit_$12 = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject keyword = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        SubLObject keyword_$13 = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
        lit = lits;
        lit_$11 = lit.first();
        original_lit = clauses.pos_lits(contextualized_dnf_clause);
        original_lit_$12 = original_lit.first();
        keyword = keywords;
        keyword_$13 = keyword.first();
        while (sksi_conjunctive_removal_modules_expand.NIL != keyword || sksi_conjunctive_removal_modules_expand.NIL != original_lit || sksi_conjunctive_removal_modules_expand.NIL != lit) {
            SubLObject current;
            final SubLObject datum = current = original_lit_$12;
            SubLObject original_mt = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            SubLObject original_asent = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_expand.$list17);
            original_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_expand.$list17);
            original_asent = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_modules_expand.NIL == current) {
                final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit_$11);
                SubLObject support = (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
                if (!asent.equal(original_asent)) {
                    final SubLObject pred = el_utilities.literal_predicate(asent, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
                    final SubLObject original_pred = el_utilities.literal_predicate(original_asent, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
                    if (keyword_$13 == sksi_conjunctive_removal_modules_expand.$kw2$GENLPREDS) {
                        support = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)sksi_conjunctive_removal_modules_expand.$kw2$GENLPREDS, el_utilities.list_to_elf((SubLObject)ConsesLow.list(sksi_conjunctive_removal_modules_expand.$const19$genlPreds, pred, original_pred)), original_mt, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED), support);
                    }
                    else {
                        support = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)sksi_conjunctive_removal_modules_expand.$kw2$GENLPREDS, el_utilities.list_to_elf((SubLObject)ConsesLow.list(sksi_conjunctive_removal_modules_expand.$const20$genlInverse, pred, original_pred)), original_mt, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED), support);
                    }
                }
                support = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)sksi_conjunctive_removal_modules_expand.$kw18$SKSI, asent, content_mt, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED), support);
                supports = (SubLObject)ConsesLow.cons(support, supports);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_modules_expand.$list17);
            }
            lit = lit.rest();
            lit_$11 = lit.first();
            original_lit = original_lit.rest();
            original_lit_$12 = original_lit.first();
            keyword = keyword.rest();
            keyword_$13 = keyword.first();
        }
        return Sequences.nreverse(supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 19112L)
    public static SubLObject test_sksi_conjunctive_query_to_csql(final SubLObject contextualized_dnf_clause, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return removal_sksi_conjunction_pos_lits_output_generate(variables.canonicalize_default_el_vars(contextualized_dnf_clause), sksi_query_datastructures.new_sks_profile(sks, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL, (SubLObject)sksi_conjunctive_removal_modules_expand.NIL).first().first();
            }
            finally {
                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_conjunctive_removal_modules_expand.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 19112L)
    public static SubLObject sksi_csql_atoms_equal(final SubLObject atom1, final SubLObject atom2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(atom1.eql(atom2) || (atom1.isString() && atom2.isString() && sksi_conjunctive_removal_modules_expand.NIL != Strings.stringE(list_utilities.remove_if_not((SubLObject)sksi_conjunctive_removal_modules_expand.$sym28$ALPHA_OR_UNDERSCORE_P, atom1, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED), list_utilities.remove_if_not((SubLObject)sksi_conjunctive_removal_modules_expand.$sym28$ALPHA_OR_UNDERSCORE_P, atom2, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED), (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_expand.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 19112L)
    public static SubLObject sksi_csql_equivalent(final SubLObject csql1, final SubLObject csql2) {
        return conses_high.tree_equal(csql1, csql2, (SubLObject)sksi_conjunctive_removal_modules_expand.$sym29$SKSI_CSQL_ATOMS_EQUAL);
    }
    
    public static SubLObject declare_sksi_conjunctive_removal_modules_expand_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "removal_sksi_conjunction_pos_lits_output_generate", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-OUTPUT-GENERATE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_expand_iterate_over_meaning_sentence_gafs", "SKSI-CRM-EXPAND-ITERATE-OVER-MEANING-SENTENCE-GAFS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_expand_process_meaning_sentence_gafs", "SKSI-CRM-EXPAND-PROCESS-MEANING-SENTENCE-GAFS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_expand_iterate_over_asents", "SKSI-CRM-EXPAND-ITERATE-OVER-ASENTS", 11, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_expand_get_results", "SKSI-CRM-EXPAND-GET-RESULTS", 9, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_result_iterator_p", "SKSI-CRM-RESULT-ITERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "new_sksi_crm_result_iterator", "NEW-SKSI-CRM-RESULT-ITERATOR", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_result_iterator_state", "SKSI-CRM-RESULT-ITERATOR-STATE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_result_iterator_build_support_template", "SKSI-CRM-RESULT-ITERATOR-BUILD-SUPPORT-TEMPLATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_result_iterator_build_auxiliary_support", "SKSI-CRM-RESULT-ITERATOR-BUILD-AUXILIARY-SUPPORT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_result_iterator_done", "SKSI-CRM-RESULT-ITERATOR-DONE", 1, 0, false);
        new $sksi_crm_result_iterator_done$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_result_iterator_next", "SKSI-CRM-RESULT-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_result_iterator_finalize", "SKSI-CRM-RESULT-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_result_iterator_size", "SKSI-CRM-RESULT-ITERATOR-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_expand_process_results", "SKSI-CRM-EXPAND-PROCESS-RESULTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_valid_bindingP", "SKSI-CRM-VALID-BINDING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_nsanitize_bindings", "SKSI-CRM-NSANITIZE-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_crm_cartesian_product", "SKSI-CRM-CARTESIAN-PRODUCT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "conjunctive_boolean_csql_to_sksi_support", "CONJUNCTIVE-BOOLEAN-CSQL-TO-SKSI-SUPPORT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "test_sksi_conjunctive_query_to_csql", "TEST-SKSI-CONJUNCTIVE-QUERY-TO-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_csql_atoms_equal", "SKSI-CSQL-ATOMS-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand", "sksi_csql_equivalent", "SKSI-CSQL-EQUIVALENT", 2, 0, false);
        return (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
    }
    
    public static SubLObject init_sksi_conjunctive_removal_modules_expand_file() {
        sksi_conjunctive_removal_modules_expand.$sksi_crm_return_null_bindingsP$ = SubLFiles.defparameter("*SKSI-CRM-RETURN-NULL-BINDINGS?*", (SubLObject)sksi_conjunctive_removal_modules_expand.NIL);
        return (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
    }
    
    public static SubLObject setup_sksi_conjunctive_removal_modules_expand_file() {
        generic_testing.define_test_case_table_int((SubLObject)sksi_conjunctive_removal_modules_expand.$sym30$TEST_SKSI_CONJUNCTIVE_QUERY_TO_CSQL, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_conjunctive_removal_modules_expand.$kw31$TEST, sksi_conjunctive_removal_modules_expand.$sym32$SKSI_CSQL_EQUIVALENT, sksi_conjunctive_removal_modules_expand.$kw33$OWNER, sksi_conjunctive_removal_modules_expand.NIL, sksi_conjunctive_removal_modules_expand.$kw34$CLASSES, sksi_conjunctive_removal_modules_expand.NIL, sksi_conjunctive_removal_modules_expand.$kw35$KB, sksi_conjunctive_removal_modules_expand.$kw36$FULL, sksi_conjunctive_removal_modules_expand.$kw37$WORKING_, sksi_conjunctive_removal_modules_expand.T }), sksi_conjunctive_removal_modules_expand.$list38);
        return (SubLObject)sksi_conjunctive_removal_modules_expand.NIL;
    }
    
    private static SubLObject _constant_38_initializer() {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DateAfterFn")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DaysDuration")), (SubLObject)SubLObjectFactory.makeInteger(300))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiLaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pharmaceuticalGC3Code")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"), (SubLObject)SubLObjectFactory.makeString("H2F"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientOfClaim")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxClaimMapping")), (SubLObject)SubLObjectFactory.makeInteger("939621383841318230")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pharmaceuticalOfClaim")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("acceptanceOutcomeTypeOfClaim")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcceptingAnInsuranceClaim")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientOfClaim")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("claimProcessedOnDate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientOfClaim")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR6"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("claimProcessedOnDate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR6"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))) })), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRx-KS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELECT"), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("product_service_id"), (SubLObject)SubLObjectFactory.makeString("drug723227")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723228")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("phcy_claim_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("product_service_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723232")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("phcy_claim_id"), (SubLObject)SubLObjectFactory.makeString("claim723234")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723234")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723234")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLDateAfterFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLSecondsDurationFn")), (SubLObject)SubLObjectFactory.makeInteger(25920000)))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("claim"), (SubLObject)SubLObjectFactory.makeString("claim723234"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("claim"), (SubLObject)SubLObjectFactory.makeString("claim723232"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("claim"), (SubLObject)SubLObjectFactory.makeString("claim723228"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("drug"), (SubLObject)SubLObjectFactory.makeString("drug723227"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHERE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLaterThan")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723234")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLDateAfterFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLSecondsDurationFn")), (SubLObject)SubLObjectFactory.makeInteger(25920000)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723234"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723228")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723234"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723228")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723232"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("product_service_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("product_service_id"), (SubLObject)SubLObjectFactory.makeString("drug723227"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("specific_class_cde"), (SubLObject)SubLObjectFactory.makeString("drug723227")), (SubLObject)SubLObjectFactory.makeString("H2F")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("phcy_claim_id"), (SubLObject)SubLObjectFactory.makeString("claim723228")), (SubLObject)SubLObjectFactory.makeInteger("939621383841318230")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("claim_accepted_ind"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)SubLObjectFactory.makeString("Y")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DateAfterFn")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthsDuration")), (SubLObject)sksi_conjunctive_removal_modules_expand.THREE_INTEGER)))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiLaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pharmaceuticalGC3Code")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"), (SubLObject)SubLObjectFactory.makeString("H2F"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientOfClaim")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxClaimMapping")), (SubLObject)SubLObjectFactory.makeInteger("939621383841318230")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pharmaceuticalOfClaim")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("acceptanceOutcomeTypeOfClaim")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcceptingAnInsuranceClaim")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientOfClaim")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("claimProcessedOnDate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientOfClaim")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR6"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("claimProcessedOnDate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR6"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))) })), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRx-KS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELECT"), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("product_service_id"), (SubLObject)SubLObjectFactory.makeString("drug723227")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723228")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("phcy_claim_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("product_service_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723232")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("phcy_claim_id"), (SubLObject)SubLObjectFactory.makeString("claim723234")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723234")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723234")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLDateAfterFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLMonthsDurationFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.THREE_INTEGER))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("claim"), (SubLObject)SubLObjectFactory.makeString("claim723234"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("claim"), (SubLObject)SubLObjectFactory.makeString("claim723232"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("claim"), (SubLObject)SubLObjectFactory.makeString("claim723228"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("drug"), (SubLObject)SubLObjectFactory.makeString("drug723227"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHERE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLaterThan")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723234")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLDateAfterFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLMonthsDurationFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.THREE_INTEGER))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723234"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723228")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723234"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723228")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723232"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("product_service_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("product_service_id"), (SubLObject)SubLObjectFactory.makeString("drug723227"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("specific_class_cde"), (SubLObject)SubLObjectFactory.makeString("drug723227")), (SubLObject)SubLObjectFactory.makeString("H2F")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("phcy_claim_id"), (SubLObject)SubLObjectFactory.makeString("claim723228")), (SubLObject)SubLObjectFactory.makeInteger("939621383841318230")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("claim_accepted_ind"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)SubLObjectFactory.makeString("Y")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DateAfterFn")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecadesDuration")), (SubLObject)sksi_conjunctive_removal_modules_expand.ONE_INTEGER)))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiLaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pharmaceuticalGC3Code")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"), (SubLObject)SubLObjectFactory.makeString("H2F"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientOfClaim")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxClaimMapping")), (SubLObject)SubLObjectFactory.makeInteger("939621383841318230")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pharmaceuticalOfClaim")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("acceptanceOutcomeTypeOfClaim")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcceptingAnInsuranceClaim")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientOfClaim")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("claimProcessedOnDate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientOfClaim")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR6"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("claimProcessedOnDate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR6"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))) })), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRx-KS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELECT"), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("product_service_id"), (SubLObject)SubLObjectFactory.makeString("drug723227")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723228")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("phcy_claim_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("product_service_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723232")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("phcy_claim_id"), (SubLObject)SubLObjectFactory.makeString("claim723234")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723234")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723234")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLDateAfterFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLYearsDurationFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.TEN_INTEGER))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("claim"), (SubLObject)SubLObjectFactory.makeString("claim723234"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("claim"), (SubLObject)SubLObjectFactory.makeString("claim723232"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("claim"), (SubLObject)SubLObjectFactory.makeString("claim723228"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("drug"), (SubLObject)SubLObjectFactory.makeString("drug723227"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHERE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLaterThan")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723234")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLDateAfterFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("serviced_dte"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLYearsDurationFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.TEN_INTEGER))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723234"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723228")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723234"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723228")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("patient_id"), (SubLObject)SubLObjectFactory.makeString("claim723232"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("product_service_id"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("product_service_id"), (SubLObject)SubLObjectFactory.makeString("drug723227"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("specific_class_cde"), (SubLObject)SubLObjectFactory.makeString("drug723227")), (SubLObject)SubLObjectFactory.makeString("H2F")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("phcy_claim_id"), (SubLObject)SubLObjectFactory.makeString("claim723228")), (SubLObject)SubLObjectFactory.makeInteger("939621383841318230")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("claim_accepted_ind"), (SubLObject)SubLObjectFactory.makeString("claim723232")), (SubLObject)SubLObjectFactory.makeString("Y")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_modules_expand.NIL, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeInteger(25))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), (SubLObject)sksi_conjunctive_removal_modules_expand.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), (SubLObject)SubLObjectFactory.makeInteger(60), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("detectedFinalValueOfGaugeTrendDetection-ImplicitUnits")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiUnknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?T-START"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gaugeTrendDetectionStartDate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"), (SubLObject)SubLObjectFactory.makeSymbol("?T-START")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiLaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?T-START"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilliSecondFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.SIXTEEN_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.THREE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.THIRTEEN_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("March")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2011))))))))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiUnknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?T-END"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gaugeTrendDetectionEndDate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"), (SubLObject)SubLObjectFactory.makeSymbol("?T-END")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiLaterThan")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilliSecondFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)SubLObjectFactory.makeInteger(44), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)SubLObjectFactory.makeInteger(22), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("March")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2011)))))))), (SubLObject)SubLObjectFactory.makeSymbol("?T-END")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("detectedMagnitudeOfGaugeTrendDetection-ImplicitUnits")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gaugeTrendDetectionAssessmentDate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilliSecondFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.EIGHT_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.THIRTEEN_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("March")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2011)))))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiUnknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?T-START"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gaugeTrendDetectionStartDate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"), (SubLObject)SubLObjectFactory.makeSymbol("?T-START")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiLaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?T-START"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilliSecondFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.SIXTEEN_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.THREE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.THIRTEEN_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("March")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2011))))))))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiUnknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?T-END"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gaugeTrendDetectionEndDate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"), (SubLObject)SubLObjectFactory.makeSymbol("?T-END")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiLaterThan")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilliSecondFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)SubLObjectFactory.makeInteger(44), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)SubLObjectFactory.makeInteger(22), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("March")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2011)))))))), (SubLObject)SubLObjectFactory.makeSymbol("?T-END")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gaugeTrendDetectionBySensor")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gaugeTrendDetectionBySensor")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR6"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("detectedMagnitudeOfGaugeTrendDetection-ImplicitUnits")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gaugeTrendDetectionAssessmentDate")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR4"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilliSecondFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.EIGHT_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)sksi_conjunctive_removal_modules_expand.THIRTEEN_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("March")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2011)))))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gaugeInWell")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR5"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OilWell-033")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceQueryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gaugeInWell")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR6"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OilWell-033")))) })), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WellSurveillanceDataStore-KS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELECT"), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND0")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("FINAL_VALUE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND0")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND1")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("CHANGE_VALUE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND1")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND2")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND3")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("GAUGE_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND3")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND4")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("GAUGE_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND4")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND5")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("CHANGE_VALUE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND5")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND6")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE7")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE8")) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE"), (SubLObject)SubLObjectFactory.makeString("GAUGE8"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE"), (SubLObject)SubLObjectFactory.makeString("GAUGE7"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND6"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND5"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND4"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND3"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND2"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND1"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND0"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL) })), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHERE"), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLNot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELECT"), (SubLObject)sksi_conjunctive_removal_modules_expand.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND9"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHERE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND9"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLaterThan")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("START_DATE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND9")), (SubLObject)SubLObjectFactory.makeString("2011-03-13 03:16:00.0")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("GAUGE_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND6")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE7"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("GAUGE_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND9")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE8")))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLNot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELECT"), (SubLObject)sksi_conjunctive_removal_modules_expand.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND10"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHERE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND10"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLaterThan")), (SubLObject)SubLObjectFactory.makeString("2011-03-12 22:44:00.0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("END_DATE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND10"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("GAUGE_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND6")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE7"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("GAUGE_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND10")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE8")))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLNot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELECT"), (SubLObject)sksi_conjunctive_removal_modules_expand.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND10"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND11"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHERE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND11")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND3"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLaterThan")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("START_DATE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND11")), (SubLObject)SubLObjectFactory.makeString("2011-03-13 03:16:00.0")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("GAUGE_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND11")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE7"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("GAUGE_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND10")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE8")))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLNot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELECT"), (SubLObject)sksi_conjunctive_removal_modules_expand.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND10"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND12"), (SubLObject)sksi_conjunctive_removal_modules_expand.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHERE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND12")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND3"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLaterThan")), (SubLObject)SubLObjectFactory.makeString("2011-03-12 22:44:00.0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("END_DATE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND12"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("GAUGE_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND12")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE7"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("GAUGE_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND10")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE8")))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLGreaterThan")), (SubLObject)SubLObjectFactory.makeInteger(60), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("CHANGE_VALUE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND5"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLGreaterThan")), (SubLObject)sksi_conjunctive_removal_modules_expand.FIVE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("CHANGE_VALUE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLGreaterThan")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("FINAL_VALUE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND0")), (SubLObject)SubLObjectFactory.makeInteger(25)), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("GAUGE_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND4")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE8"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("GAUGE_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND3")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE7"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND5")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND6"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND3")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND6"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND3")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND5"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND4"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND4"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND4"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND2"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND2"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ASSESS_DATE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND2")), (SubLObject)SubLObjectFactory.makeString("2011-03-13 08:00:00.0")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("ASSESS_DATE"), (SubLObject)SubLObjectFactory.makeString("GAUGE_TREND6")), (SubLObject)SubLObjectFactory.makeString("2011-03-13 08:00:00.0")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("WELL_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE7")), (SubLObject)SubLObjectFactory.makeInteger(33)), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("WELL_ID"), (SubLObject)SubLObjectFactory.makeString("GAUGE8")), (SubLObject)SubLObjectFactory.makeInteger(33)) })))));
    }
    
    public void declareFunctions() {
        declare_sksi_conjunctive_removal_modules_expand_file();
    }
    
    public void initializeVariables() {
        init_sksi_conjunctive_removal_modules_expand_file();
    }
    
    public void runTopLevelForms() {
        setup_sksi_conjunctive_removal_modules_expand_file();
    }
    
    static {
        me = (SubLFile)new sksi_conjunctive_removal_modules_expand();
        sksi_conjunctive_removal_modules_expand.$sksi_crm_return_null_bindingsP$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $kw1$VARPRED = SubLObjectFactory.makeKeyword("VARPRED");
        $kw2$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $kw3$GENLINVERSE = SubLObjectFactory.makeKeyword("GENLINVERSE");
        $str4$__SKSI__A_ = SubLObjectFactory.makeString("~&SKSI-~A ");
        $str5$Could_not_form_a_CSQL_query_with_ = SubLObjectFactory.makeString("Could not form a CSQL query with:~%  Meaning sentence GAFs: ~a~%  Literals: ~a~% for the reason: ~a");
        $const6$meaningSentencePredicateForSource = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meaningSentencePredicateForSource"));
        $kw7$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str8$Could_not_find_table_name_via___m = SubLObjectFactory.makeString("Could not find table name via #$meaningSentencePredicateForSource for ~S of ~S");
        $kw9$ROBUST = SubLObjectFactory.makeKeyword("ROBUST");
        $kw10$NORMAL = SubLObjectFactory.makeKeyword("NORMAL");
        $list11 = ConsesLow.list((SubLObject)sksi_conjunctive_removal_modules_expand.T);
        $sym12$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym13$SKSI_CRM_RESULT_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("SKSI-CRM-RESULT-ITERATOR-NEXT");
        $sym14$SKSI_CRM_RESULT_ITERATOR_DONE = SubLObjectFactory.makeSymbol("SKSI-CRM-RESULT-ITERATOR-DONE");
        $sym15$SKSI_CRM_RESULT_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("SKSI-CRM-RESULT-ITERATOR-FINALIZE");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-ASENT"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORIGINAL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("ORIGINAL-ASENT"));
        $kw18$SKSI = SubLObjectFactory.makeKeyword("SKSI");
        $const19$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const20$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $str21$Unknown_support_keyword__a_ = SubLObjectFactory.makeString("Unknown support keyword ~a.");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("RS-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-DECODING-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("SKS"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-MT"));
        $sym23$SKSI_CRM_RESULT_ITERATOR_P = SubLObjectFactory.makeSymbol("SKSI-CRM-RESULT-ITERATOR-P");
        $kw24$RS_INDEX = SubLObjectFactory.makeKeyword("RS-INDEX");
        $kw25$DECODE = SubLObjectFactory.makeKeyword("DECODE");
        $sym26$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym27$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym28$ALPHA_OR_UNDERSCORE_P = SubLObjectFactory.makeSymbol("ALPHA-OR-UNDERSCORE-P");
        $sym29$SKSI_CSQL_ATOMS_EQUAL = SubLObjectFactory.makeSymbol("SKSI-CSQL-ATOMS-EQUAL");
        $sym30$TEST_SKSI_CONJUNCTIVE_QUERY_TO_CSQL = SubLObjectFactory.makeSymbol("TEST-SKSI-CONJUNCTIVE-QUERY-TO-CSQL");
        $kw31$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym32$SKSI_CSQL_EQUIVALENT = SubLObjectFactory.makeSymbol("SKSI-CSQL-EQUIVALENT");
        $kw33$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw34$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw35$KB = SubLObjectFactory.makeKeyword("KB");
        $kw36$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw37$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list38 = _constant_38_initializer();
    }
    
    public static final class $sksi_crm_result_iterator_done$UnaryFunction extends UnaryFunction
    {
        public $sksi_crm_result_iterator_done$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SKSI-CRM-RESULT-ITERATOR-DONE"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return sksi_conjunctive_removal_modules_expand.sksi_crm_result_iterator_done(arg1);
        }
    }
}

/*

	Total time: 563 ms
	
*/