package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.graph_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_interpretation;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_conjunctive_removal_modules_applicability extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability";
    public static final String myFingerPrint = "2a46abc2db9fa8425172e382f7fdbd7bd98b88ffff2d319976834ca768cdedf2";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 877L)
    public static SubLSymbol $sksi_crm_ignore_subsumed_subclause_specsP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 1168L)
    private static SubLSymbol $sksi_crm_applicability_max_time_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 1407L)
    private static SubLSymbol $sksi_crm_applicability_max_time_override$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 1585L)
    public static SubLSymbol $sksi_crm_applicability_start_time$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 10134L)
    private static SubLSymbol $sksi_crm_gathered_pos_subclause_specs$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 10298L)
    private static SubLSymbol $sksi_crm_rejected_pos_subclause_specs$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 10365L)
    private static SubLSymbol $sksi_crm_gather_literals_using_iterative_methodP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 10441L)
    private static SubLSymbol $sksi_crm_gather_literals_iterative_method_return_first_successP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 10664L)
    private static SubLSymbol $sksi_crm_gather_literals_stop_if_total_subclause_specs_fails_enumerability_optimizationP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 10966L)
    private static SubLSymbol $sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$;
    private static final SubLSymbol $kw0$SKSI_CRM_APPLICABILITY_MAX_TIME;
    private static final SubLString $str1$SKSI_conjunctive_removal_was_appl;
    private static final SubLSymbol $kw2$UNKNOWN;
    private static final SubLString $str3$_but_was_lacking_this___sksiUnkno;
    private static final SubLSymbol $sym4$NEW_POS_SUBCLAUSE_SPEC;
    private static final SubLList $list5;
    private static final SubLObject $const6$RDFTripleStore_Physical;
    private static final SubLSymbol $sym7$SKSI_SUPPORTED_FUNCTION_P;
    private static final SubLSymbol $sym8$SKSI_CRM_FULLY_FORBIDDEN_COMPARISON_OPERATORS;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$CLET;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$CSETQ;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$SUBSETP;
    private static final SubLSymbol $sym15$NCANONICALIZE_LITERAL_INDICES;
    private static final SubLSymbol $sym16$SUPERSETP;
    private static final SubLSymbol $sym17$POS_SUBCLAUSE_SPEC__;
    private static final SubLSymbol $sym18$_;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$VARPRED;
    private static final SubLSymbol $kw21$GENLPREDS;
    private static final SubLSymbol $kw22$GENLINVERSE;
    private static final SubLString $str23$__SKSI__A_;
    private static final SubLString $str24$Could_not_form_a_CSQL_query_with_;
    private static final SubLObject $const25$Database_Physical;
    private static final SubLSymbol $sym26$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str27$Could_not_form_a_SQL_query_with__;
    private static final SubLSymbol $sym28$_EXIT;
    private static final SubLSymbol $kw29$POS;
    private static final SubLSymbol $sym30$FIRST;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$VARIABLE_P;
    private static final SubLSymbol $sym33$LOGICAL_FIELD_INDEXICAL_P;
    private static final SubLSymbol $sym34$CONTEXTUALIZED_LITERAL_HL_VARIABLES;
    private static final SubLObject $const35$enumerableSchema;
    private static final SubLSymbol $kw36$GAF;
    private static final SubLSymbol $kw37$FALSE;
    private static final SubLSymbol $sym38$SKSI_CRM_ANY_FULLY_BOUND_ARG_;
    private static final SubLSymbol $sym39$CONTEXTUALIZED_ASENT_ASENT;
    private static final SubLSymbol $sym40$FULLY_BOUND_P;
    private static final SubLSymbol $sym41$LOGICAL_SCHEMA_PHYSICAL_SCHEMATA;
    private static final SubLSymbol $sym42$COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL;
    private static final SubLObject $const43$logicalPhysicalFieldMap;
    private static final SubLSymbol $kw44$TRUE;
    private static final SubLSymbol $sym45$CYC_VAR_;
    private static final SubLSymbol $sym46$HL_VAR_;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 1733L)
    public static SubLObject removal_sksi_conjunction_pos_lits_applicability(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        SubLObject subclause_specs = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_crm_profile_relevantP(sks_profile, contextualized_dnf_clause)) {
            subclause_specs = removal_sksi_conjunction_pos_lits_applicability_int(contextualized_dnf_clause, sks_profile);
        }
        SubLObject good_subclause_specs = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject cdolist_list_var = subclause_specs;
        SubLObject subclause_spec = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        subclause_spec = cdolist_list_var.first();
        while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
            if (!sksi_conjunctive_removal_modules_cost.removal_sksi_conjunction_pos_lits_cost(clause_utilities.subclause_specified_by_spec(contextualized_dnf_clause, subclause_spec), sks_profile).isZero()) {
                good_subclause_specs = (SubLObject)ConsesLow.cons(subclause_spec, good_subclause_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subclause_spec = cdolist_list_var.first();
        }
        return Sequences.nreverse(good_subclause_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 2539L)
    public static SubLObject removal_sksi_conjunction_pos_lits_applicability_int(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subclause_specs = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject max_time_cutoff_reached = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        final SubLObject time = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_start_time$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$.bind((SubLObject)sksi_conjunctive_removal_modules_applicability.T, thread);
            sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_start_time$.bind(Time.get_universal_time(), thread);
            try {
                thread.throwStack.push(sksi_conjunctive_removal_modules_applicability.$kw0$SKSI_CRM_APPLICABILITY_MAX_TIME);
                final SubLObject mt_var = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    thread.resetMultipleValues();
                    final SubLObject candidate_lit_nums = sksi_crm_get_subclause_candidates(contextualized_dnf_clause, sks_profile);
                    final SubLObject meaning_sentence_gaf_iterators = thread.secondMultipleValue();
                    final SubLObject comparison_lit_nums = thread.thirdMultipleValue();
                    final SubLObject evaluate_lit_nums = thread.fourthMultipleValue();
                    final SubLObject sksi_unknown_sentence_lit_nums = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    if (sksi_conjunctive_removal_modules_applicability.NIL != candidate_lit_nums && (sksi_conjunctive_removal_modules_applicability.NIL != list_utilities.lengthGE(candidate_lit_nums, sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.getDynamicValue(thread), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED) || sksi_conjunctive_removal_modules_applicability.NIL != comparison_lit_nums || sksi_conjunctive_removal_modules_applicability.NIL != evaluate_lit_nums || sksi_conjunctive_removal_modules_applicability.NIL != sksi_unknown_sentence_lit_nums)) {
                        final SubLObject pos_subclause_specs = sksi_crm_gather_literals(candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                        if (sksi_conjunctive_removal_modules_applicability.NIL != pos_subclause_specs && sksi_conjunctive_removal_modules_applicability.NIL == sksi_debugging.sksi_ignore_errorsP()) {
                            SubLObject cdolist_list_var = sksi_unknown_sentence_lit_nums;
                            SubLObject lit_num = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                            lit_num = cdolist_list_var.first();
                            while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
                                if (sksi_conjunctive_removal_modules_applicability.NIL == list_utilities.member_eqP(lit_num, pos_subclause_specs.first())) {
                                    final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(ConsesLow.nth(lit_num, clauses.pos_lits(contextualized_dnf_clause)));
                                    if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_query_utilities.sksi_unknown_sentence_literal_p(asent)) {
                                        sksi_debugging.sksi_error(Sequences.cconcatenate((SubLObject)sksi_conjunctive_removal_modules_applicability.$str1$SKSI_conjunctive_removal_was_appl, new SubLObject[] { format_nil.format_nil_a_no_copy((SubLObject)((sksi_conjunctive_removal_modules_applicability.NIL != inference_worker.currently_active_problem()) ? inference_datastructures_problem.problem_suid(inference_worker.currently_active_problem()) : sksi_conjunctive_removal_modules_applicability.$kw2$UNKNOWN)), sksi_conjunctive_removal_modules_applicability.$str3$_but_was_lacking_this___sksiUnkno, format_nil.format_nil_a_no_copy(asent) }));
                                    }
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                lit_num = cdolist_list_var.first();
                            }
                        }
                        subclause_specs = Mapping.mapcar((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym4$NEW_POS_SUBCLAUSE_SPEC, pos_subclause_specs);
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                max_time_cutoff_reached = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_conjunctive_removal_modules_applicability.$kw0$SKSI_CRM_APPLICABILITY_MAX_TIME);
            }
            finally {
                thread.throwStack.pop();
            }
            if (sksi_conjunctive_removal_modules_applicability.NIL != max_time_cutoff_reached) {}
        }
        finally {
            sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_start_time$.rebind(_prev_bind_2, thread);
            sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$.rebind(_prev_bind_0, thread);
        }
        return subclause_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 5585L)
    public static SubLObject sksi_crm_profile_relevantP(final SubLObject sks_profile, final SubLObject contextualized_dnf_clause) {
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        return sksi_crm_sks_relevantP(sks, contextualized_dnf_clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 5782L)
    public static SubLObject sksi_crm_sks_relevantP(final SubLObject sks, final SubLObject contextualized_dnf_clause) {
        if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_infrastructure_utilities.external_source_activated_in_imageP(sks)) {
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(sks);
            SubLObject relevantP = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            SubLObject count = (SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER;
            SubLObject rest;
            SubLObject lit;
            SubLObject current;
            SubLObject datum;
            SubLObject mt;
            SubLObject asent;
            for (rest = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, rest = clauses.pos_lits(contextualized_dnf_clause); sksi_conjunctive_removal_modules_applicability.NIL == relevantP && sksi_conjunctive_removal_modules_applicability.NIL != rest; rest = rest.rest()) {
                lit = rest.first();
                datum = (current = lit);
                mt = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                asent = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list5);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list5);
                asent = current.first();
                current = current.rest();
                if (sksi_conjunctive_removal_modules_applicability.NIL == current) {
                    if (sksi_conjunctive_removal_modules_applicability.NIL != hlmt.hlmt_equalP(mt, content_mt) || sksi_conjunctive_removal_modules_applicability.NIL != sksi_infrastructure_utilities.mt_relevant_to_mt_memoizedP(mt, content_mt, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED)) {
                        count = Numbers.add(count, (SubLObject)sksi_conjunctive_removal_modules_applicability.ONE_INTEGER);
                    }
                    if (count.numGE((SubLObject)sksi_conjunctive_removal_modules_applicability.TWO_INTEGER)) {
                        relevantP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list5);
                }
            }
            if (sksi_conjunctive_removal_modules_applicability.NIL != relevantP) {
                final SubLObject parent_sks = sksi_crm_genl_ks(sks);
                return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == parent_sks || sksi_conjunctive_removal_modules_applicability.NIL == sksi_crm_sks_relevantP(parent_sks, contextualized_dnf_clause));
            }
        }
        return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 6676L)
    public static SubLObject sksi_crm_genl_ks(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject genl_ks = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            genl_ks = sksi_kb_accessors.immediate_genl_ks(sks);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return genl_ks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 6921L)
    public static SubLObject sksi_crm_get_subclause_candidates(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        final SubLObject content_mt = sksi_query_datastructures.sks_profile_content_mt(sks_profile);
        final SubLObject logical_schemata = sksi_query_datastructures.sks_profile_logical_schemata(sks_profile);
        final SubLObject physical_schemata = sksi_query_datastructures.sks_profile_physical_schemata(sks_profile);
        final SubLObject forbidden_comp_ops = sksi_crm_fully_forbidden_comparison_operators(physical_schemata);
        SubLObject candidate_lit_nums = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject meaning_sentence_gaf_iterators = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject comparison_lit_nums = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject evaluate_lit_nums = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject sksi_unknown_sentence_lit_nums = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject num = (SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        lit = cdolist_list_var.first();
        while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = lit;
            SubLObject mt = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            SubLObject asent = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list5);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list5);
            asent = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_modules_applicability.NIL == current) {
                if (sksi_conjunctive_removal_modules_applicability.NIL != hlmt.hlmt_equalP(mt, content_mt) || sksi_conjunctive_removal_modules_applicability.NIL != sksi_infrastructure_utilities.mt_relevant_to_mt_memoizedP(mt, content_mt, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED)) {
                    if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_query_utilities.comparison_literal_p(asent)) {
                        if (sksi_conjunctive_removal_modules_applicability.NIL == list_utilities.member_eqP(el_utilities.literal_predicate(asent, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED), forbidden_comp_ops)) {
                            comparison_lit_nums = (SubLObject)ConsesLow.cons(num, comparison_lit_nums);
                        }
                        meaning_sentence_gaf_iterators = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, meaning_sentence_gaf_iterators);
                    }
                    else if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_query_utilities.evaluate_literal_p(asent)) {
                        if (sksi_conjunctive_removal_modules_applicability.NIL != sks_supports_evaluation_asentsP(sks) && sksi_conjunctive_removal_modules_applicability.NIL != sksi_supported_evaluate_asentP(asent)) {
                            evaluate_lit_nums = (SubLObject)ConsesLow.cons(num, evaluate_lit_nums);
                        }
                        meaning_sentence_gaf_iterators = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, meaning_sentence_gaf_iterators);
                    }
                    else if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_query_utilities.sksi_unknown_sentence_literal_p(asent)) {
                        sksi_unknown_sentence_lit_nums = (SubLObject)ConsesLow.cons(num, sksi_unknown_sentence_lit_nums);
                        meaning_sentence_gaf_iterators = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, meaning_sentence_gaf_iterators);
                    }
                    else {
                        final SubLObject lit_meaning_sentence_gaf_iterator = sksi_conjunctive_removal_module_utilities.get_meaning_sentence_gaf_iterator_for_asent(asent, logical_schemata, sksi_query_datastructures.sks_profile_sks(sks_profile), (SubLObject)sksi_conjunctive_removal_modules_applicability.T, mt, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                        meaning_sentence_gaf_iterators = (SubLObject)ConsesLow.cons(lit_meaning_sentence_gaf_iterator, meaning_sentence_gaf_iterators);
                        if (sksi_conjunctive_removal_modules_applicability.NIL != lit_meaning_sentence_gaf_iterator) {
                            candidate_lit_nums = (SubLObject)ConsesLow.cons(num, candidate_lit_nums);
                        }
                    }
                }
                else {
                    meaning_sentence_gaf_iterators = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, meaning_sentence_gaf_iterators);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list5);
            }
            num = Numbers.add(num, (SubLObject)sksi_conjunctive_removal_modules_applicability.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(candidate_lit_nums), Sequences.nreverse(meaning_sentence_gaf_iterators), Sequences.nreverse(comparison_lit_nums), Sequences.nreverse(evaluate_lit_nums), Sequences.nreverse(sksi_unknown_sentence_lit_nums));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 9033L)
    public static SubLObject sks_supports_evaluation_asentsP(final SubLObject sks) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == kb_utilities.kbeq(sksi_conjunctive_removal_modules_applicability.$const6$RDFTripleStore_Physical, sksi_kb_accessors.sk_source_ks_type(sks)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 9225L)
    public static SubLObject sksi_supported_evaluate_asentP(final SubLObject asent) {
        return cycl_utilities.expression_find_if((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym7$SKSI_SUPPORTED_FUNCTION_P, asent, (SubLObject)sksi_conjunctive_removal_modules_applicability.T, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 9501L)
    public static SubLObject sksi_crm_fully_forbidden_comparison_operators_internal(final SubLObject physical_schemata) {
        SubLObject comparison_operators = sksi_kb_accessors.physical_schema_forbidden_comparison_operators(physical_schemata.first());
        SubLObject doneP = Types.sublisp_null(comparison_operators);
        if (sksi_conjunctive_removal_modules_applicability.NIL == doneP) {
            SubLObject csome_list_var = physical_schemata.rest();
            SubLObject physical_schema = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            physical_schema = csome_list_var.first();
            while (sksi_conjunctive_removal_modules_applicability.NIL == doneP && sksi_conjunctive_removal_modules_applicability.NIL != csome_list_var) {
                final SubLObject ps_comparison_operators = sksi_kb_accessors.physical_schema_forbidden_comparison_operators(physical_schema);
                comparison_operators = keyhash_utilities.fast_intersection(comparison_operators, ps_comparison_operators, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQ), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                if (sksi_conjunctive_removal_modules_applicability.NIL == comparison_operators) {
                    doneP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
                }
                csome_list_var = csome_list_var.rest();
                physical_schema = csome_list_var.first();
            }
        }
        return comparison_operators;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 9501L)
    public static SubLObject sksi_crm_fully_forbidden_comparison_operators(final SubLObject physical_schemata) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        if (sksi_conjunctive_removal_modules_applicability.NIL == v_memoization_state) {
            return sksi_crm_fully_forbidden_comparison_operators_internal(physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym8$SKSI_CRM_FULLY_FORBIDDEN_COMPARISON_OPERATORS, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        if (sksi_conjunctive_removal_modules_applicability.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym8$SKSI_CRM_FULLY_FORBIDDEN_COMPARISON_OPERATORS, (SubLObject)sksi_conjunctive_removal_modules_applicability.ONE_INTEGER, (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, (SubLObject)sksi_conjunctive_removal_modules_applicability.EQUAL, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym8$SKSI_CRM_FULLY_FORBIDDEN_COMPARISON_OPERATORS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_schemata, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_crm_fully_forbidden_comparison_operators_internal(physical_schemata)));
            memoization_state.caching_state_put(caching_state, physical_schemata, results, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 11065L)
    public static SubLObject with_sksi_crm_pos_subclause_spec_gathering(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result_var = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list9);
        result_var = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_modules_applicability.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym10$CLET, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list11, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym12$CSETQ, result_var, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list13))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list9);
        return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 11503L)
    public static SubLObject sksi_crm_add_pos_subclause_spec(final SubLObject pos_subclause_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_conjunctive_removal_modules_applicability.NIL == conses_high.member(pos_subclause_spec, sksi_conjunctive_removal_modules_applicability.$sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.IDENTITY))) {
            sksi_conjunctive_removal_modules_applicability.$sksi_crm_gathered_pos_subclause_specs$.setDynamicValue((SubLObject)ConsesLow.cons(pos_subclause_spec, sksi_conjunctive_removal_modules_applicability.$sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 11714L)
    public static SubLObject sksi_crm_reject_pos_subclause_spec(final SubLObject pos_subclause_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.dictionary_enter(sksi_conjunctive_removal_modules_applicability.$sksi_crm_rejected_pos_subclause_specs$.getDynamicValue(thread), pos_subclause_spec, (SubLObject)sksi_conjunctive_removal_modules_applicability.T);
        return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 11933L)
    public static SubLObject sksi_crm_pos_subclause_spec_irrelevantP(final SubLObject pos_subclause_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_conjunctive_removal_modules_applicability.NIL != list_utilities.lengthL(pos_subclause_spec, sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.getDynamicValue(thread), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED)) {
            return (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
        }
        if (sksi_conjunctive_removal_modules_applicability.NIL != dictionary.dictionary_lookup_without_values(sksi_conjunctive_removal_modules_applicability.$sksi_crm_rejected_pos_subclause_specs$.getDynamicValue(thread), pos_subclause_spec, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED)) {
            return (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
        }
        if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_modules_applicability.$sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) {
            if (sksi_conjunctive_removal_modules_applicability.NIL != subl_promotions.memberP(pos_subclause_spec, sksi_conjunctive_removal_modules_applicability.$sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym14$SUBSETP), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED)) {
                return (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
            }
        }
        else if (sksi_conjunctive_removal_modules_applicability.NIL != subl_promotions.memberP(pos_subclause_spec, sksi_conjunctive_removal_modules_applicability.$sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQUAL), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED)) {}
        return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 12828L)
    public static SubLObject sksi_crm_gather_literals(final SubLObject candidate_lit_nums, final SubLObject comparison_lit_nums, final SubLObject evaluate_lit_nums, final SubLObject sksi_unknown_sentence_lit_nums, final SubLObject contextualized_dnf_clause, final SubLObject meaning_sentence_gaf_iterators, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_subclause_spec = ConsesLow.append(candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums);
        if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.getDynamicValue(thread) && !Sequences.length(pos_subclause_spec).eql(Sequences.length(clauses.pos_lits(contextualized_dnf_clause)))) {
            return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        }
        final SubLObject islands = list_utilities.nmapcar((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym15$NCANONICALIZE_LITERAL_INDICES, sksi_crm_form_islands(pos_subclause_spec, contextualized_dnf_clause, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED));
        SubLObject result = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.getDynamicValue(thread) && sksi_conjunctive_removal_modules_applicability.NIL == list_utilities.singletonP(islands)) {
            return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        }
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_modules_applicability.$sksi_crm_gathered_pos_subclause_specs$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_conjunctive_removal_modules_applicability.$sksi_crm_rejected_pos_subclause_specs$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_modules_applicability.$sksi_crm_gathered_pos_subclause_specs$.bind((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, thread);
            sksi_conjunctive_removal_modules_applicability.$sksi_crm_rejected_pos_subclause_specs$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQUAL), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED), thread);
            if (sksi_conjunctive_removal_modules_applicability.NIL == sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_using_iterative_methodP$.getDynamicValue(thread)) {
                SubLObject cdolist_list_var = islands;
                SubLObject island = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                island = cdolist_list_var.first();
                while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
                    sksi_crm_gather_literals_recursive(island, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                    cdolist_list_var = cdolist_list_var.rest();
                    island = cdolist_list_var.first();
                }
            }
            else {
                SubLObject cdolist_list_var = islands;
                SubLObject island = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                island = cdolist_list_var.first();
                while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
                    sksi_crm_gather_literals_iterative(island, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                    cdolist_list_var = cdolist_list_var.rest();
                    island = cdolist_list_var.first();
                }
            }
            result = ((sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_modules_applicability.$sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) ? list_utilities.delete_subsumed_items(sksi_conjunctive_removal_modules_applicability.$sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread), (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym16$SUPERSETP, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED) : sksi_conjunctive_removal_modules_applicability.$sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread));
        }
        finally {
            sksi_conjunctive_removal_modules_applicability.$sksi_crm_rejected_pos_subclause_specs$.rebind(_prev_bind_2, thread);
            sksi_conjunctive_removal_modules_applicability.$sksi_crm_gathered_pos_subclause_specs$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 14500L)
    public static SubLObject sksi_crm_gather_literals_iterative(final SubLObject initial_pos_subclause_spec, final SubLObject candidate_lit_nums, final SubLObject comparison_lit_nums, final SubLObject evaluate_lit_nums, final SubLObject sksi_unknown_sentence_lit_nums, final SubLObject contextualized_dnf_clause, final SubLObject meaning_sentence_gaf_iterators, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pos_subclause_specs_queue = queues.create_p_queue((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, (SubLObject)sksi_conjunctive_removal_modules_applicability.IDENTITY, (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym17$POS_SUBCLAUSE_SPEC__);
        SubLObject max_added_subclause_spec_length = (SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER;
        pos_subclause_specs_queue = queues.p_enqueue(initial_pos_subclause_spec, pos_subclause_specs_queue);
        while (sksi_conjunctive_removal_modules_applicability.NIL == queues.p_queue_empty_p(pos_subclause_specs_queue) && (sksi_conjunctive_removal_modules_applicability.NIL == sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_iterative_method_return_first_successP$.getDynamicValue(thread) || sksi_conjunctive_removal_modules_applicability.NIL == number_utilities.positive_number_p(max_added_subclause_spec_length))) {
            final SubLObject _prev_bind_0 = sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$.currentBinding(thread);
            try {
                sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$.bind((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, thread);
                final SubLObject pos_subclause_spec = queues.p_dequeue(pos_subclause_specs_queue, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                SubLObject add_smaller_specs_to_queueP = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_crm_pos_subclause_spec_irrelevantP(pos_subclause_spec)) {
                    add_smaller_specs_to_queueP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
                }
                else if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_crm_valid_queryP(pos_subclause_spec, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile)) {
                    sksi_crm_add_pos_subclause_spec(pos_subclause_spec);
                    if (max_added_subclause_spec_length.isZero()) {
                        max_added_subclause_spec_length = Sequences.length(pos_subclause_spec);
                    }
                    if (sksi_conjunctive_removal_modules_applicability.NIL == sksi_conjunctive_removal_modules_applicability.$sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) {
                        add_smaller_specs_to_queueP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
                    }
                }
                else {
                    sksi_crm_reject_pos_subclause_spec(pos_subclause_spec);
                }
                if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.getDynamicValue(thread) || sksi_conjunctive_removal_modules_applicability.NIL != add_smaller_specs_to_queueP || (sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_modules_applicability.$sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread) && max_added_subclause_spec_length.numG(Sequences.length(pos_subclause_spec))) || (sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_stop_if_total_subclause_specs_fails_enumerability_optimizationP$.getDynamicValue(thread) && sksi_conjunctive_removal_modules_applicability.NIL != list_utilities.same_length_p(pos_subclause_spec, initial_pos_subclause_spec) && sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$.getDynamicValue(thread))) {
                    continue;
                }
                SubLObject cdolist_list_var = pos_subclause_spec;
                SubLObject num = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                num = cdolist_list_var.first();
                while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
                    final SubLObject test_spec = Sequences.remove(num, pos_subclause_spec, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                    SubLObject cdolist_list_var_$3;
                    final SubLObject islands = cdolist_list_var_$3 = list_utilities.nmapcar((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym15$NCANONICALIZE_LITERAL_INDICES, sksi_crm_form_islands(test_spec, contextualized_dnf_clause, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED));
                    SubLObject island = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                    island = cdolist_list_var_$3.first();
                    while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var_$3) {
                        if (sksi_conjunctive_removal_modules_applicability.NIL == queues.p_queue_full_p(pos_subclause_specs_queue) && sksi_conjunctive_removal_modules_applicability.NIL == queues.p_queue_find(island, pos_subclause_specs_queue, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQUAL), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED)) {
                            queues.p_enqueue(island, pos_subclause_specs_queue);
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        island = cdolist_list_var_$3.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    num = cdolist_list_var.first();
                }
            }
            finally {
                sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 17544L)
    public static SubLObject pos_subclause_spec_G(final SubLObject pos_subclause_spec_1, final SubLObject pos_subclause_spec_2) {
        final SubLObject pos_subclause_spec_1_length = Sequences.length(pos_subclause_spec_1);
        final SubLObject pos_subclause_spec_2_length = Sequences.length(pos_subclause_spec_2);
        if (pos_subclause_spec_1_length.numL(pos_subclause_spec_2_length)) {
            return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        }
        if (pos_subclause_spec_2_length.numL(pos_subclause_spec_1_length)) {
            return (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
        }
        if (sksi_conjunctive_removal_modules_applicability.NIL == pos_subclause_spec_1) {
            return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        }
        if (sksi_conjunctive_removal_modules_applicability.NIL == pos_subclause_spec_2) {
            return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        }
        if (pos_subclause_spec_2.first().numL(pos_subclause_spec_1.first())) {
            return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        }
        if (pos_subclause_spec_1.first().numL(pos_subclause_spec_2.first())) {
            return (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
        }
        return pos_subclause_spec_G(pos_subclause_spec_1.rest(), pos_subclause_spec_2.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 18325L)
    public static SubLObject sksi_crm_gather_literals_recursive(final SubLObject pos_subclause_spec, final SubLObject candidate_lit_nums, final SubLObject comparison_lit_nums, final SubLObject evaluate_lit_nums, final SubLObject sksi_unknown_sentence_lit_nums, final SubLObject contextualized_dnf_clause, final SubLObject meaning_sentence_gaf_iterators, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_crm_pos_subclause_spec_irrelevantP(pos_subclause_spec)) {
            return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        }
        if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_crm_valid_queryP(pos_subclause_spec, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile)) {
            sksi_crm_add_pos_subclause_spec(pos_subclause_spec);
            if (sksi_conjunctive_removal_modules_applicability.NIL == sksi_conjunctive_removal_modules_applicability.$sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) {
                sksi_crm_gather_literals_recursive_continue_recursion(pos_subclause_spec, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
            }
            return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        }
        sksi_crm_reject_pos_subclause_spec(pos_subclause_spec);
        sksi_crm_gather_literals_recursive_continue_recursion(pos_subclause_spec, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
        return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 19584L)
    public static SubLObject sksi_crm_gather_literals_recursive_continue_recursion(final SubLObject pos_subclause_spec, final SubLObject candidate_lit_nums, final SubLObject comparison_lit_nums, final SubLObject evaluate_lit_nums, final SubLObject sksi_unknown_sentence_lit_nums, final SubLObject contextualized_dnf_clause, final SubLObject meaning_sentence_gaf_iterators, final SubLObject sks_profile) {
        SubLObject cdolist_list_var = pos_subclause_spec;
        SubLObject num = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        num = cdolist_list_var.first();
        while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
            final SubLObject test_spec = Sequences.remove(num, pos_subclause_spec, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
            SubLObject cdolist_list_var_$4;
            final SubLObject islands = cdolist_list_var_$4 = list_utilities.nmapcar((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym15$NCANONICALIZE_LITERAL_INDICES, sksi_crm_form_islands(test_spec, contextualized_dnf_clause, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED));
            SubLObject island = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            island = cdolist_list_var_$4.first();
            while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var_$4) {
                sksi_crm_gather_literals_recursive(island, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                island = cdolist_list_var_$4.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        }
        return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 20333L)
    public static SubLObject sksi_crm_valid_queryP(final SubLObject pos_subclause_spec, final SubLObject candidate_lit_nums, final SubLObject comparison_lit_nums, final SubLObject evaluate_lit_nums, final SubLObject sksi_unknown_sentence_lit_nums, final SubLObject contextualized_dnf_clause, final SubLObject meaning_sentence_gaf_iterators, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((sksi_conjunctive_removal_modules_applicability.NIL != inference_worker.currently_active_problem() && sksi_conjunctive_removal_modules_applicability.NIL != inference_strategist.current_controlling_inference_max_time_reachedP()) || (sksi_conjunctive_removal_modules_applicability.NIL != number_utilities.positive_number_p(sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_max_time_override$.getDynamicValue(thread)) && sksi_conjunctive_removal_modules_applicability.NIL != number_utilities.positive_number_p(sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_start_time$.getDynamicValue(thread)) && Numbers.add(sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_start_time$.getDynamicValue(thread), sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_max_time_override$.getDynamicValue(thread)).numLE(Time.get_universal_time()))) {
            Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_modules_applicability.$kw0$SKSI_CRM_APPLICABILITY_MAX_TIME, Numbers.subtract(Time.get_universal_time(), sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_start_time$.getDynamicValue(thread)));
        }
        final SubLObject candidate_spec = list_utilities.ordered_intersection(candidate_lit_nums, pos_subclause_spec, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym18$_), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        final SubLObject comparison_spec = list_utilities.ordered_intersection(comparison_lit_nums, pos_subclause_spec, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym18$_), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        final SubLObject evaluate_spec = list_utilities.ordered_intersection(evaluate_lit_nums, pos_subclause_spec, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym18$_), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        final SubLObject sksi_unknown_sentence_spec = list_utilities.ordered_intersection(sksi_unknown_sentence_lit_nums, pos_subclause_spec, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym18$_), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        final SubLObject asents = clauses.pos_lits(clause_utilities.subclause_specified_by_spec(contextualized_dnf_clause, clause_utilities.new_subclause_spec((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, candidate_spec)));
        final SubLObject comparison_asents = clauses.pos_lits(clause_utilities.subclause_specified_by_spec(contextualized_dnf_clause, clause_utilities.new_subclause_spec((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, comparison_spec)));
        final SubLObject evaluate_asents = clauses.pos_lits(clause_utilities.subclause_specified_by_spec(contextualized_dnf_clause, clause_utilities.new_subclause_spec((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, evaluate_spec)));
        final SubLObject sksi_unknown_sentence_asents = clauses.pos_lits(clause_utilities.subclause_specified_by_spec(contextualized_dnf_clause, clause_utilities.new_subclause_spec((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, sksi_unknown_sentence_spec)));
        final SubLObject lit_meaning_sentence_gaf_iterators = list_utilities.nths(candidate_spec, meaning_sentence_gaf_iterators);
        return sksi_crm_valid_query_int(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, lit_meaning_sentence_gaf_iterators, sks_profile);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 22425L)
    public static SubLObject sksi_crm_valid_query_int(final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gaf_iterators, final SubLObject sks_profile) {
        return sksi_crm_applicability_iterate_over_meaning_sentence_gafs((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, meaning_sentence_gaf_iterators, (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, asents, asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, sks_profile);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 22789L)
    public static SubLObject sksi_crm_applicability_iterate_over_meaning_sentence_gafs(final SubLObject meaning_sentence_gafs_so_far, final SubLObject remaining_meaning_sentence_gaf_iterators, final SubLObject lits_so_far, final SubLObject remaining_lits, final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        if (sksi_conjunctive_removal_modules_applicability.NIL == remaining_meaning_sentence_gaf_iterators) {
            successP = sksi_crm_applicability_process_meaning_sentence_gafs(meaning_sentence_gafs_so_far, asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, sks_profile);
        }
        else {
            final SubLObject iterator = remaining_meaning_sentence_gaf_iterators.first();
            if (sksi_conjunctive_removal_modules_applicability.NIL != iterator) {
                final SubLObject physical_schemata = sksi_query_datastructures.sks_profile_physical_schemata(sks_profile);
                final SubLObject asent = remaining_lits.first();
                SubLObject current;
                final SubLObject datum = current = asent;
                SubLObject mt = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                SubLObject lit = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list19);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list19);
                lit = current.first();
                current = current.rest();
                if (sksi_conjunctive_removal_modules_applicability.NIL == current) {
                    SubLObject valid;
                    for (SubLObject done_var = successP; sksi_conjunctive_removal_modules_applicability.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == valid || sksi_conjunctive_removal_modules_applicability.NIL != successP)) {
                        thread.resetMultipleValues();
                        final SubLObject gaf = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (sksi_conjunctive_removal_modules_applicability.NIL != valid && sksi_conjunctive_removal_modules_applicability.NIL != sksi_crm_literal_coherentP(lit, mt, (SubLObject)ConsesLow.list(gaf), physical_schemata, sksi_query_datastructures.sks_profile_sks(sks_profile)) && sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.sksi_crm_literal_coherent_with_other_literalsP(asent, gaf, lits_so_far, meaning_sentence_gafs_so_far, physical_schemata)) {
                            successP = sksi_crm_applicability_iterate_over_meaning_sentence_gafs(list_utilities.snoc(gaf, meaning_sentence_gafs_so_far), remaining_meaning_sentence_gaf_iterators.rest(), list_utilities.snoc(asent, lits_so_far), remaining_lits.rest(), asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, sks_profile);
                        }
                    }
                    iteration.reset_reusable_iterator(iterator);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list19);
                }
            }
            else {
                successP = sksi_crm_applicability_iterate_over_meaning_sentence_gafs(list_utilities.snoc((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, meaning_sentence_gafs_so_far), remaining_meaning_sentence_gaf_iterators.rest(), lits_so_far, remaining_lits.rest(), asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, sks_profile);
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 24613L)
    public static SubLObject sksi_crm_applicability_process_meaning_sentence_gafs(final SubLObject meaning_sentence_gafs, final SubLObject lits, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject sks_profile) {
        SubLObject asents = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject keywords = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject new_meaning_sentence_gafs = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject successP = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        if (sksi_conjunctive_removal_modules_applicability.NIL == sksi_crm_enumerability_check_asents(lits, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs)) {
            sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$.setDynamicValue((SubLObject)sksi_conjunctive_removal_modules_applicability.T);
        }
        else {
            SubLObject list_var = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            SubLObject lit = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            SubLObject num = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            list_var = lits;
            lit = list_var.first();
            for (num = (SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER; sksi_conjunctive_removal_modules_applicability.NIL != list_var; list_var = list_var.rest(), lit = list_var.first(), num = Numbers.add((SubLObject)sksi_conjunctive_removal_modules_applicability.ONE_INTEGER, num)) {
                SubLObject current;
                final SubLObject datum = current = lit;
                SubLObject mt = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                SubLObject asent = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list5);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list5);
                asent = current.first();
                current = current.rest();
                if (sksi_conjunctive_removal_modules_applicability.NIL == current) {
                    final SubLObject meaning_sentence_gaf = ConsesLow.nth(num, meaning_sentence_gafs);
                    if (sksi_conjunctive_removal_modules_applicability.NIL != meaning_sentence_gaf) {
                        final SubLObject asent_args = cycl_utilities.formula_args(asent, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                        final SubLObject inverse_args = Sequences.reverse(asent_args);
                        final SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                        new_meaning_sentence_gafs = (SubLObject)ConsesLow.cons(meaning_sentence_gaf, new_meaning_sentence_gafs);
                        asents = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, asents);
                        keywords = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, keywords);
                        if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(asent)) {
                            ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER, asents, (SubLObject)ConsesLow.cons(lit, ConsesLow.nth((SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER, asents)));
                            ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER, keywords, (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_applicability.$kw20$VARPRED, ConsesLow.nth((SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER, keywords)));
                        }
                        else {
                            final SubLObject asent_pred = el_utilities.literal_predicate(asent, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                            final SubLObject spec_preds = sksi_conjunctive_removal_module_utilities.sksi_relevant_spec_preds_from_meaning_sentence(asent_pred, meaning_sentence, mt, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                            final SubLObject spec_inverses = sksi_conjunctive_removal_module_utilities.sksi_relevant_spec_inverses_from_meaning_sentence(asent_pred, meaning_sentence, mt, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                            if (sksi_conjunctive_removal_modules_applicability.NIL == spec_preds && sksi_conjunctive_removal_modules_applicability.NIL == spec_inverses) {
                                return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                            }
                            SubLObject cdolist_list_var = spec_preds;
                            SubLObject spec_pred = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                            spec_pred = cdolist_list_var.first();
                            while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
                                final SubLObject new_asent = el_utilities.list_to_elf((SubLObject)ConsesLow.cons(spec_pred, asent_args));
                                final SubLObject new_lit = inference_datastructures_problem_query.make_contextualized_asent(mt, new_asent);
                                ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER, asents, (SubLObject)ConsesLow.cons(new_lit, ConsesLow.nth((SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER, asents)));
                                ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER, keywords, (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_applicability.$kw21$GENLPREDS, ConsesLow.nth((SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER, keywords)));
                                cdolist_list_var = cdolist_list_var.rest();
                                spec_pred = cdolist_list_var.first();
                            }
                            cdolist_list_var = spec_inverses;
                            SubLObject spec_inverse = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                            spec_inverse = cdolist_list_var.first();
                            while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
                                final SubLObject new_asent = el_utilities.list_to_elf((SubLObject)ConsesLow.cons(spec_inverse, inverse_args));
                                final SubLObject new_lit = inference_datastructures_problem_query.make_contextualized_asent(mt, new_asent);
                                ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER, asents, (SubLObject)ConsesLow.cons(new_lit, ConsesLow.nth((SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER, asents)));
                                ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER, keywords, (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_applicability.$kw22$GENLINVERSE, ConsesLow.nth((SubLObject)sksi_conjunctive_removal_modules_applicability.ZERO_INTEGER, keywords)));
                                cdolist_list_var = cdolist_list_var.rest();
                                spec_inverse = cdolist_list_var.first();
                            }
                        }
                    }
                    else {
                        keywords = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, keywords);
                        asents = (SubLObject)ConsesLow.cons(lit, asents);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_modules_applicability.$list5);
                }
            }
            asents = Sequences.nreverse(asents);
            keywords = Sequences.nreverse(keywords);
            new_meaning_sentence_gafs = Sequences.nreverse(new_meaning_sentence_gafs);
            successP = sksi_crm_applicability_iterate_over_asents((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, asents, (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, keywords, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, new_meaning_sentence_gafs, sks_profile);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 27129L)
    public static SubLObject sksi_crm_applicability_iterate_over_asents(final SubLObject asents_so_far, final SubLObject remaining_asents, final SubLObject keywords_so_far, final SubLObject remaining_keywords, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gafs, final SubLObject sks_profile) {
        SubLObject successP = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        if (sksi_conjunctive_removal_modules_applicability.NIL == remaining_asents) {
            successP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.sksi_crm_joinable_asentsP(asents_so_far, meaning_sentence_gafs, sksi_query_datastructures.sks_profile_physical_schemata(sks_profile)) && sksi_conjunctive_removal_modules_applicability.NIL != sksi_crm_asents_generate_sqlP(asents_so_far, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs, sks_profile));
        }
        else if (sksi_conjunctive_removal_modules_applicability.NIL == successP) {
            SubLObject asent;
            SubLObject asent_$5;
            SubLObject keyword;
            SubLObject keyword_$6;
            for (asent = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, asent_$5 = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, keyword = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, keyword_$6 = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, asent = remaining_asents.first(), asent_$5 = asent.first(), keyword = remaining_keywords.first(), keyword_$6 = keyword.first(); sksi_conjunctive_removal_modules_applicability.NIL == successP && (sksi_conjunctive_removal_modules_applicability.NIL != keyword || sksi_conjunctive_removal_modules_applicability.NIL != asent); successP = sksi_crm_applicability_iterate_over_asents(list_utilities.snoc(asent_$5, asents_so_far), remaining_asents.rest(), list_utilities.snoc(keyword_$6, keywords_so_far), remaining_keywords.rest(), comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs, sks_profile), asent = asent.rest(), asent_$5 = asent.first(), keyword = keyword.rest(), keyword_$6 = keyword.first()) {}
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 28267L)
    public static SubLObject sksi_crm_asents_generate_csqlP(final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gafs, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.bind((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, thread);
            error_message = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)sksi_conjunctive_removal_modules_applicability.THREE_INTEGER), sksi_conjunctive_removal_module_utilities.sksi_crm_generate_csql_for_query(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs, sks_profile));
        }
        finally {
            sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.rebind(_prev_bind_0, thread);
        }
        if (sksi_conjunctive_removal_modules_applicability.NIL != error_message && sksi_conjunctive_removal_modules_applicability.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_conjunctive_removal_modules_applicability.FIVE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_conjunctive_removal_modules_applicability.$str23$__SKSI__A_, (SubLObject)sksi_conjunctive_removal_modules_applicability.$str24$Could_not_form_a_CSQL_query_with_), new SubLObject[] { sksi_conjunctive_removal_modules_applicability.FIVE_INTEGER, meaning_sentence_gafs, ConsesLow.append(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents), error_message });
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return Types.sublisp_null(error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 29134L)
    public static SubLObject sksi_crm_asents_generate_sqlP(final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gafs, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sksi_query_datastructures.print_sks_profile_contents(sks_profile, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.bind((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject csql = sksi_conjunctive_removal_module_utilities.sksi_crm_generate_csql_for_query(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs, sks_profile);
            final SubLObject var_decoding_map = thread.secondMultipleValue();
            final SubLObject booleanP = thread.thirdMultipleValue();
            SubLObject error_message = thread.fourthMultipleValue();
            final SubLObject var_pfi_encodings = thread.fifthMultipleValue();
            final SubLObject var_lit_pfis = thread.sixthMultipleValue();
            final SubLObject lit_pfi_selects = thread.seventhMultipleValue();
            final SubLObject var_lfi_map = thread.eighthMultipleValue();
            thread.resetMultipleValues();
            if (sksi_conjunctive_removal_modules_applicability.NIL == error_message && sksi_conjunctive_removal_modules_applicability.NIL != kb_utilities.kbeq(sksi_conjunctive_removal_modules_applicability.$const25$Database_Physical, sksi_query_datastructures.sks_profile_type(sks_profile))) {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$7 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym26$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject sql = sksi_csql_interpretation.csql_to_sql(csql, sksi_kb_accessors.sk_source_sql_flavor(sksi_query_datastructures.sks_profile_sks(sks_profile)), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                            if (sksi_conjunctive_removal_modules_applicability.NIL == sql) {
                                if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_conjunctive_removal_modules_applicability.FIVE_INTEGER)) {
                                    PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_conjunctive_removal_modules_applicability.$str23$__SKSI__A_, (SubLObject)sksi_conjunctive_removal_modules_applicability.$str27$Could_not_form_a_SQL_query_with__), new SubLObject[] { sksi_conjunctive_removal_modules_applicability.FIVE_INTEGER, meaning_sentence_gafs, ConsesLow.append(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents), error_message });
                                    streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                                }
                                return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$7, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            if (sksi_conjunctive_removal_modules_applicability.NIL != error_message && sksi_conjunctive_removal_modules_applicability.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_conjunctive_removal_modules_applicability.FIVE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_conjunctive_removal_modules_applicability.$str23$__SKSI__A_, (SubLObject)sksi_conjunctive_removal_modules_applicability.$str24$Could_not_form_a_CSQL_query_with_), new SubLObject[] { sksi_conjunctive_removal_modules_applicability.FIVE_INTEGER, meaning_sentence_gafs, ConsesLow.append(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents), error_message });
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            return Types.sublisp_null(error_message);
        }
        finally {
            sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 30654L)
    public static SubLObject sksi_crm_form_islands(final SubLObject pos_lits_subclause_spec, final SubLObject contextualized_dnf_clause, SubLObject fully_bound_islandP) {
        if (fully_bound_islandP == sksi_conjunctive_removal_modules_applicability.UNPROVIDED) {
            fully_bound_islandP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject vars = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject prepared_spec = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject islands = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject cdolist_list_var = pos_lits_subclause_spec;
        SubLObject lit_num = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        lit_num = cdolist_list_var.first();
        while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
            final SubLObject lit_vars = clause_literal_variables(contextualized_dnf_clause, (SubLObject)sksi_conjunctive_removal_modules_applicability.$kw29$POS, lit_num);
            vars = ConsesLow.append(vars, lit_vars, (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL);
            prepared_spec = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(lit_num, lit_vars), prepared_spec);
            cdolist_list_var = cdolist_list_var.rest();
            lit_num = cdolist_list_var.first();
        }
        vars = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, list_utilities.fast_delete_duplicates(vars, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQ), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED));
        thread.resetMultipleValues();
        final SubLObject connected_proto_islands = graph_utilities.categorize_nodes_via_links(vars, prepared_spec, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        final SubLObject isolated_proto_islands = thread.secondMultipleValue();
        final SubLObject naked_proto_islands = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject nil_islands = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject cdolist_list_var2 = connected_proto_islands;
        SubLObject proto_island = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        proto_island = cdolist_list_var2.first();
        while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var2) {
            final SubLObject pre_island = conses_high.cadr(proto_island);
            final SubLObject island = Mapping.mapcar(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym30$FIRST), pre_island);
            islands = (SubLObject)ConsesLow.cons(island, islands);
            cdolist_list_var2 = cdolist_list_var2.rest();
            proto_island = cdolist_list_var2.first();
        }
        cdolist_list_var2 = isolated_proto_islands;
        proto_island = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        proto_island = cdolist_list_var2.first();
        while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var2) {
            final SubLObject island_nodes = proto_island.first();
            final SubLObject pre_island2 = conses_high.cadr(proto_island);
            final SubLObject island2 = Mapping.mapcar(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym30$FIRST), pre_island2);
            if (island_nodes.equal((SubLObject)sksi_conjunctive_removal_modules_applicability.$list31)) {
                nil_islands = ConsesLow.append(nil_islands, island2);
            }
            else {
                islands = (SubLObject)ConsesLow.cons(island2, islands);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            proto_island = cdolist_list_var2.first();
        }
        cdolist_list_var2 = naked_proto_islands;
        proto_island = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        proto_island = cdolist_list_var2.first();
        while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var2) {
            final SubLObject island_nodes = proto_island.first();
            final SubLObject pre_island2 = conses_high.cadr(proto_island);
            final SubLObject island2 = Mapping.mapcar(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym30$FIRST), pre_island2);
            if (island_nodes.equal((SubLObject)sksi_conjunctive_removal_modules_applicability.$list31)) {
                nil_islands = ConsesLow.append(nil_islands, island2);
            }
            else {
                islands = (SubLObject)ConsesLow.cons(island2, islands);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            proto_island = cdolist_list_var2.first();
        }
        if (sksi_conjunctive_removal_modules_applicability.NIL != fully_bound_islandP && sksi_conjunctive_removal_modules_applicability.NIL != nil_islands) {
            islands = (SubLObject)ConsesLow.cons(nil_islands, islands);
        }
        return list_utilities.fast_delete_duplicates(islands, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQUAL), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 32355L)
    public static SubLObject sksi_crm_literal_coherentP(final SubLObject lit, final SubLObject mt, final SubLObject lit_meaning_sentence_gafs, final SubLObject physical_schemata, final SubLObject sks) {
        return list_utilities.sublisp_boolean(sksi_crm_literal_coherent(lit, mt, lit_meaning_sentence_gafs, physical_schemata, sks));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 32623L)
    public static SubLObject sksi_crm_literal_coherent(final SubLObject lit, final SubLObject mt, final SubLObject lit_meaning_sentence_gafs, final SubLObject physical_schemata, final SubLObject sks) {
        final SubLObject inverse_lit = sksi_conjunctive_removal_module_utilities.invert_lit(lit);
        final SubLObject lit_vars = cycl_utilities.expression_gather(lit, (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym32$VARIABLE_P, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQ), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        SubLObject new_lit_meaning_sentence_gafs = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject cdolist_list_var = lit_meaning_sentence_gafs;
        SubLObject meaning_sentence_gaf = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        meaning_sentence_gaf = cdolist_list_var.first();
        while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
            final SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
            SubLObject genl_pred_incoherentP = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            SubLObject genl_inverse_incoherentP = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.genl_pred_meaning_sentenceP(meaning_sentence, lit, mt, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED) && sksi_conjunctive_removal_modules_applicability.NIL == genl_pred_incoherentP) {
                SubLObject csome_list_var = lit_vars;
                SubLObject lit_var = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                lit_var = csome_list_var.first();
                while (sksi_conjunctive_removal_modules_applicability.NIL == genl_pred_incoherentP && sksi_conjunctive_removal_modules_applicability.NIL != csome_list_var) {
                    final SubLObject var_positions = list_utilities.tree_positions(lit_var, lit, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQ), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                    if (sksi_conjunctive_removal_modules_applicability.NIL == list_utilities.singletonP(var_positions) && sksi_conjunctive_removal_modules_applicability.NIL == sksi_crm_literal_coherent_int(meaning_sentence, var_positions, physical_schemata)) {
                        genl_pred_incoherentP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    lit_var = csome_list_var.first();
                }
            }
            if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.genl_inverse_meaning_sentenceP(meaning_sentence, lit, mt, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED) && sksi_conjunctive_removal_modules_applicability.NIL == genl_inverse_incoherentP) {
                SubLObject csome_list_var = lit_vars;
                SubLObject lit_var = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                lit_var = csome_list_var.first();
                while (sksi_conjunctive_removal_modules_applicability.NIL == genl_inverse_incoherentP && sksi_conjunctive_removal_modules_applicability.NIL != csome_list_var) {
                    final SubLObject var_positions = list_utilities.tree_positions(lit_var, inverse_lit, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQ), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                    if (sksi_conjunctive_removal_modules_applicability.NIL == list_utilities.singletonP(var_positions) && sksi_conjunctive_removal_modules_applicability.NIL == sksi_crm_literal_coherent_int(meaning_sentence, var_positions, physical_schemata)) {
                        genl_inverse_incoherentP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    lit_var = csome_list_var.first();
                }
            }
            if (sksi_conjunctive_removal_modules_applicability.NIL == genl_pred_incoherentP || sksi_conjunctive_removal_modules_applicability.NIL == genl_inverse_incoherentP) {
                new_lit_meaning_sentence_gafs = (SubLObject)ConsesLow.cons(meaning_sentence_gaf, new_lit_meaning_sentence_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence_gaf = cdolist_list_var.first();
        }
        return new_lit_meaning_sentence_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 34710L)
    public static SubLObject sksi_crm_literal_coherent_int(final SubLObject meaning_sentence, final SubLObject positions, final SubLObject physical_schemata) {
        final SubLObject meaning_sentence_terms = list_utilities.fast_delete_duplicates(list_utilities.tree_nths(positions, meaning_sentence), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        SubLObject coherentP = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        if (sksi_conjunctive_removal_modules_applicability.NIL != list_utilities.singletonP(meaning_sentence_terms)) {
            coherentP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
        }
        else {
            final SubLObject term0 = Sequences.find_if((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym33$LOGICAL_FIELD_INDEXICAL_P, meaning_sentence_terms, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
            if (sksi_conjunctive_removal_modules_applicability.NIL != term0) {
                final SubLObject other_terms = Sequences.remove(term0, meaning_sentence_terms, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQ), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                SubLObject incoherentP = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                if (sksi_conjunctive_removal_modules_applicability.NIL == incoherentP) {
                    SubLObject csome_list_var = other_terms;
                    SubLObject v_term = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                    v_term = csome_list_var.first();
                    while (sksi_conjunctive_removal_modules_applicability.NIL == incoherentP && sksi_conjunctive_removal_modules_applicability.NIL != csome_list_var) {
                        if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_kb_accessors.logical_field_indexical_p(v_term)) {
                            incoherentP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == sksi_conjunctive_removal_module_utilities.logical_field_indexicals_joinableP(term0, v_term, physical_schemata));
                        }
                        else {
                            incoherentP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    }
                }
                coherentP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == incoherentP);
            }
        }
        return coherentP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 35693L)
    public static SubLObject sksi_crm_literals_coherent_together(final SubLObject lit0, final SubLObject lit0_meaning_sentence_gafs, final SubLObject lit1, final SubLObject lit1_meaning_sentence_gafs, final SubLObject physical_schemata) {
        final SubLObject inverse_lit0 = sksi_conjunctive_removal_module_utilities.invert_lit(lit0);
        final SubLObject inverse_lit2 = sksi_conjunctive_removal_module_utilities.invert_lit(lit1);
        SubLObject coherent = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject cdolist_list_var = lit0_meaning_sentence_gafs;
        SubLObject lit0_meaning_sentence_gaf = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        lit0_meaning_sentence_gaf = cdolist_list_var.first();
        while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = lit1_meaning_sentence_gafs;
            SubLObject lit1_meaning_sentence_gaf = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            lit1_meaning_sentence_gaf = cdolist_list_var_$8.first();
            while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var_$8) {
                coherent = ConsesLow.append(sksi_crm_literals_coherent_together_int(lit0, inverse_lit0, lit1, inverse_lit2, lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf, physical_schemata), coherent);
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                lit1_meaning_sentence_gaf = cdolist_list_var_$8.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit0_meaning_sentence_gaf = cdolist_list_var.first();
        }
        return coherent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 36463L)
    public static SubLObject sksi_crm_literals_coherent_together_int(final SubLObject lit0, final SubLObject inverse_lit0, final SubLObject lit1, final SubLObject inverse_lit1, final SubLObject lit0_meaning_sentence_gaf, final SubLObject lit1_meaning_sentence_gaf, final SubLObject physical_schemata) {
        final SubLObject lit0_meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(lit0_meaning_sentence_gaf, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        final SubLObject lit1_meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(lit1_meaning_sentence_gaf, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        SubLObject coherent = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(lit0) || sksi_conjunctive_removal_modules_applicability.NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(lit0_meaning_sentence) || sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.genl_pred_meaning_sentenceP(lit0_meaning_sentence, lit0, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED)) {
            if ((sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(lit1) || sksi_conjunctive_removal_modules_applicability.NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(lit1_meaning_sentence) || sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.genl_pred_meaning_sentenceP(lit1_meaning_sentence, lit1, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED)) && sksi_conjunctive_removal_modules_applicability.NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(lit0, lit0_meaning_sentence, lit1, lit1_meaning_sentence, physical_schemata)) {
                coherent = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf), coherent);
            }
            if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.genl_inverse_meaning_sentenceP(lit1_meaning_sentence, lit1, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED) && sksi_conjunctive_removal_modules_applicability.NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(lit0, lit0_meaning_sentence, inverse_lit1, lit1_meaning_sentence, physical_schemata)) {
                coherent = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf), coherent);
            }
        }
        if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.genl_inverse_meaning_sentenceP(lit0_meaning_sentence, lit0, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED)) {
            if ((sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(lit1) || sksi_conjunctive_removal_modules_applicability.NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(lit1_meaning_sentence) || sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.genl_pred_meaning_sentenceP(lit1_meaning_sentence, lit1, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED)) && sksi_conjunctive_removal_modules_applicability.NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(inverse_lit0, lit0_meaning_sentence, lit1, lit1_meaning_sentence, physical_schemata)) {
                coherent = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf), coherent);
            }
            if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_conjunctive_removal_module_utilities.genl_inverse_meaning_sentenceP(lit1_meaning_sentence, lit1, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED) && sksi_conjunctive_removal_modules_applicability.NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(inverse_lit0, lit0_meaning_sentence, inverse_lit1, lit1_meaning_sentence, physical_schemata)) {
                coherent = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf), coherent);
            }
        }
        return coherent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 38507L)
    public static SubLObject sksi_crm_enumerability_check_asents(final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gafs) {
        return (SubLObject)SubLObjectFactory.makeBoolean((sksi_conjunctive_removal_modules_applicability.NIL == sksi_crm_fully_unbound_asentsP(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs) || sksi_conjunctive_removal_modules_applicability.NIL != sksi_crm_enumerability_check(meaning_sentence_gafs)) && (sksi_conjunctive_removal_modules_applicability.NIL == sksi_unknown_sentence_asents || sksi_conjunctive_removal_modules_applicability.NIL == sksi_crm_unbound_unknown_sentence_asentsP(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 39628L)
    public static SubLObject sksi_crm_unbound_unknown_sentence_asentsP(final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gafs) {
        SubLObject unboundP = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        final SubLObject all_asent_vars = ConsesLow.append(Mapping.mapcan((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym34$CONTEXTUALIZED_LITERAL_HL_VARIABLES, asents, sksi_conjunctive_removal_modules_applicability.EMPTY_SUBL_OBJECT_ARRAY), Mapping.mapcan((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym34$CONTEXTUALIZED_LITERAL_HL_VARIABLES, comparison_asents, sksi_conjunctive_removal_modules_applicability.EMPTY_SUBL_OBJECT_ARRAY), Mapping.mapcan((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym34$CONTEXTUALIZED_LITERAL_HL_VARIABLES, evaluate_asents, sksi_conjunctive_removal_modules_applicability.EMPTY_SUBL_OBJECT_ARRAY));
        if (sksi_conjunctive_removal_modules_applicability.NIL == unboundP) {
            SubLObject csome_list_var = sksi_unknown_sentence_asents;
            SubLObject unknown_sentence_asent = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            unknown_sentence_asent = csome_list_var.first();
            while (sksi_conjunctive_removal_modules_applicability.NIL == unboundP && sksi_conjunctive_removal_modules_applicability.NIL != csome_list_var) {
                if (sksi_conjunctive_removal_modules_applicability.NIL == list_utilities.fast_subsetP(contextualized_literal_hl_variables(unknown_sentence_asent), all_asent_vars, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED)) {
                    unboundP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
                }
                csome_list_var = csome_list_var.rest();
                unknown_sentence_asent = csome_list_var.first();
            }
        }
        return unboundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 40302L)
    public static SubLObject sksi_crm_enumerability_check(final SubLObject meaning_sentence_gafs) {
        final SubLObject physical_schemata = collect_physical_schemata_from_meaning_sentence_gafs(meaning_sentence_gafs);
        SubLObject non_enumerableP = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        if (sksi_conjunctive_removal_modules_applicability.NIL == non_enumerableP) {
            SubLObject csome_list_var = physical_schemata;
            SubLObject physical_schema = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            physical_schema = csome_list_var.first();
            while (sksi_conjunctive_removal_modules_applicability.NIL == non_enumerableP && sksi_conjunctive_removal_modules_applicability.NIL != csome_list_var) {
                final SubLObject pred_var = sksi_conjunctive_removal_modules_applicability.$const35$enumerableSchema;
                if (sksi_conjunctive_removal_modules_applicability.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(physical_schema, (SubLObject)sksi_conjunctive_removal_modules_applicability.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(physical_schema, (SubLObject)sksi_conjunctive_removal_modules_applicability.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                    final SubLObject token_var = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                    while (sksi_conjunctive_removal_modules_applicability.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_conjunctive_removal_modules_applicability.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_conjunctive_removal_modules_applicability.$kw36$GAF, (SubLObject)sksi_conjunctive_removal_modules_applicability.$kw37$FALSE, (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL);
                                SubLObject done_var_$9 = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                                final SubLObject token_var_$10 = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                                while (sksi_conjunctive_removal_modules_applicability.NIL == done_var_$9) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                    final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(assertion));
                                    if (sksi_conjunctive_removal_modules_applicability.NIL != valid_$11) {
                                        non_enumerableP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
                                    }
                                    done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == valid_$11);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_conjunctive_removal_modules_applicability.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_conjunctive_removal_modules_applicability.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == valid);
                    }
                }
                csome_list_var = csome_list_var.rest();
                physical_schema = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == non_enumerableP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 40750L)
    public static SubLObject sksi_crm_multi_table_check(final SubLObject meaning_sentence_gafs, final SubLObject physical_schemata) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL != list_utilities.singletonP(physical_schemata) || sksi_conjunctive_removal_modules_applicability.NIL == list_utilities.singletonP(collect_physical_schemata_from_meaning_sentence_gafs(meaning_sentence_gafs)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 41123L)
    public static SubLObject sksi_crm_fully_unbound_asentsP(final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gafs) {
        SubLObject boundP = list_utilities.any_in_list((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym38$SKSI_CRM_ANY_FULLY_BOUND_ARG_, comparison_asents, (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym39$CONTEXTUALIZED_ASENT_ASENT);
        if (sksi_conjunctive_removal_modules_applicability.NIL == boundP && sksi_conjunctive_removal_modules_applicability.NIL == boundP) {
            SubLObject asent = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            SubLObject asent_$12 = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            SubLObject meaning_sentence_gaf = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            SubLObject meaning_sentence_gaf_$13 = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            asent = asents;
            asent_$12 = asent.first();
            meaning_sentence_gaf = meaning_sentence_gafs;
            meaning_sentence_gaf_$13 = meaning_sentence_gaf.first();
            while (sksi_conjunctive_removal_modules_applicability.NIL == boundP && (sksi_conjunctive_removal_modules_applicability.NIL != meaning_sentence_gaf || sksi_conjunctive_removal_modules_applicability.NIL != asent)) {
                final SubLObject lit = inference_datastructures_problem_query.contextualized_asent_asent(asent_$12);
                final SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf_$13, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                if (sksi_conjunctive_removal_modules_applicability.NIL == sksi_crm_fully_unbound_for_meaning_sentenceP(lit, meaning_sentence)) {
                    boundP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
                }
                asent = asent.rest();
                asent_$12 = asent.first();
                meaning_sentence_gaf = meaning_sentence_gaf.rest();
                meaning_sentence_gaf_$13 = meaning_sentence_gaf.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == boundP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 41903L)
    public static SubLObject sksi_crm_any_fully_bound_argP(final SubLObject formula) {
        return list_utilities.any_in_list((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym40$FULLY_BOUND_P, cycl_utilities.formula_args(formula, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 42074L)
    public static SubLObject sksi_crm_fully_unbound_for_meaning_sentenceP(final SubLObject formula, final SubLObject meaning_sentence) {
        final SubLObject formula_list = el_utilities.elf_to_list(formula);
        final SubLObject ms_list = el_utilities.elf_to_list(meaning_sentence);
        return sksi_crm_fully_unbound_for_meaning_sentence_int(formula_list, ms_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 42341L)
    public static SubLObject sksi_crm_fully_unbound_for_meaning_sentence_int(final SubLObject formula_tree, final SubLObject ms_tree) {
        SubLObject boundP = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_kb_accessors.logical_field_indexical_p(ms_tree)) {
            boundP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == variables.variable_p(formula_tree));
        }
        else if (ms_tree.isCons() && sksi_conjunctive_removal_modules_applicability.NIL == boundP) {
            SubLObject formula_elt = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            SubLObject formula_elt_$14 = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            SubLObject ms_elt = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            SubLObject ms_elt_$15 = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            formula_elt = formula_tree;
            formula_elt_$14 = formula_elt.first();
            ms_elt = ms_tree;
            ms_elt_$15 = ms_elt.first();
            while (sksi_conjunctive_removal_modules_applicability.NIL == boundP && (sksi_conjunctive_removal_modules_applicability.NIL != ms_elt || sksi_conjunctive_removal_modules_applicability.NIL != formula_elt)) {
                if (sksi_conjunctive_removal_modules_applicability.NIL == sksi_crm_fully_unbound_for_meaning_sentence_int(formula_elt_$14, ms_elt_$15)) {
                    boundP = (SubLObject)sksi_conjunctive_removal_modules_applicability.T;
                }
                formula_elt = formula_elt.rest();
                formula_elt_$14 = formula_elt.first();
                ms_elt = ms_elt.rest();
                ms_elt_$15 = ms_elt.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == boundP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 42869L)
    public static SubLObject collect_physical_schemata_from_meaning_sentence_gafs(final SubLObject meaning_sentence_gafs) {
        SubLObject physical_schemata = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject cdolist_list_var = meaning_sentence_gafs;
        SubLObject meaning_sentence_gaf = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        meaning_sentence_gaf = cdolist_list_var.first();
        while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
            if (sksi_conjunctive_removal_modules_applicability.NIL != sksi_meaning_sentence_utilities.gaf_assertion_is_conditional_meaning_sentence_gafP(meaning_sentence_gaf)) {
                final SubLObject ant_lses = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf);
                final SubLObject ant_ms = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(meaning_sentence_gaf);
                final SubLObject con_lses = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf);
                final SubLObject con_ms = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                physical_schemata = ConsesLow.nconc(new SubLObject[] { physical_schemata, Mapping.mapcan((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym41$LOGICAL_SCHEMA_PHYSICAL_SCHEMATA, ant_lses, sksi_conjunctive_removal_modules_applicability.EMPTY_SUBL_OBJECT_ARRAY), Mapping.mapcan((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym41$LOGICAL_SCHEMA_PHYSICAL_SCHEMATA, con_lses, sksi_conjunctive_removal_modules_applicability.EMPTY_SUBL_OBJECT_ARRAY), collect_physical_schemata_from_meaning_sentence(ant_ms), collect_physical_schemata_from_meaning_sentence(con_ms) });
            }
            else {
                final SubLObject ms = sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
                physical_schemata = ConsesLow.nconc(physical_schemata, collect_physical_schemata_from_meaning_sentence(ms));
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence_gaf = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(physical_schemata, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQ), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 43867L)
    public static SubLObject collect_physical_schemata_from_meaning_sentence(final SubLObject meaning_sentence) {
        final SubLObject lfis = cycl_utilities.expression_gather(meaning_sentence, (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym33$LOGICAL_FIELD_INDEXICAL_P, (SubLObject)sksi_conjunctive_removal_modules_applicability.T, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQUAL), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        SubLObject physical_schemata = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        SubLObject cdolist_list_var = lfis;
        SubLObject lfi = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        lfi = cdolist_list_var.first();
        while (sksi_conjunctive_removal_modules_applicability.NIL != cdolist_list_var) {
            physical_schemata = ConsesLow.append(collect_physical_schemata_from_logical_field_indexical(lfi), physical_schemata);
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(physical_schemata, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQ), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 44267L)
    public static SubLObject collect_physical_schemata_from_logical_field_indexical_internal(final SubLObject logical_field_indexical) {
        final SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
        SubLObject physical_schemata = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        final SubLObject pred_var = sksi_conjunctive_removal_modules_applicability.$const43$logicalPhysicalFieldMap;
        if (sksi_conjunctive_removal_modules_applicability.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(logical_field, (SubLObject)sksi_conjunctive_removal_modules_applicability.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(logical_field, (SubLObject)sksi_conjunctive_removal_modules_applicability.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            final SubLObject token_var = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
            while (sksi_conjunctive_removal_modules_applicability.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (sksi_conjunctive_removal_modules_applicability.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_conjunctive_removal_modules_applicability.$kw36$GAF, (SubLObject)sksi_conjunctive_removal_modules_applicability.$kw44$TRUE, (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL);
                        SubLObject done_var_$16 = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                        final SubLObject token_var_$17 = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
                        while (sksi_conjunctive_removal_modules_applicability.NIL == done_var_$16) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                            final SubLObject valid_$18 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$17.eql(assertion));
                            if (sksi_conjunctive_removal_modules_applicability.NIL != valid_$18) {
                                final SubLObject physical_field = assertions_high.gaf_arg2(assertion);
                                final SubLObject physical_schema = sksi_kb_accessors.physical_field_schema(physical_field);
                                physical_schemata = (SubLObject)ConsesLow.cons(physical_schema, physical_schemata);
                            }
                            done_var_$16 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == valid_$18);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_conjunctive_removal_modules_applicability.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (sksi_conjunctive_removal_modules_applicability.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_applicability.NIL == valid);
            }
        }
        return list_utilities.fast_delete_duplicates(physical_schemata, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQ), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 44267L)
    public static SubLObject collect_physical_schemata_from_logical_field_indexical(final SubLObject logical_field_indexical) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
        if (sksi_conjunctive_removal_modules_applicability.NIL == v_memoization_state) {
            return collect_physical_schemata_from_logical_field_indexical_internal(logical_field_indexical);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym42$COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        if (sksi_conjunctive_removal_modules_applicability.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym42$COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_conjunctive_removal_modules_applicability.ONE_INTEGER, (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, (SubLObject)sksi_conjunctive_removal_modules_applicability.EQUAL, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym42$COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, logical_field_indexical, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(collect_physical_schemata_from_logical_field_indexical_internal(logical_field_indexical)));
            memoization_state.caching_state_put(caching_state, logical_field_indexical, results, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 44826L)
    public static SubLObject clause_literal_variables(final SubLObject clause, final SubLObject sense, final SubLObject num) {
        final SubLObject lit = clauses.clause_literal(clause, sense, num);
        return contextualized_literal_variables(lit);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 45134L)
    public static SubLObject contextualized_literal_variables(final SubLObject lit) {
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
        return cycl_utilities.expression_gather(asent, (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym45$CYC_VAR_, (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQ), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp", position = 45537L)
    public static SubLObject contextualized_literal_hl_variables(final SubLObject lit) {
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
        return cycl_utilities.expression_gather(asent, (SubLObject)sksi_conjunctive_removal_modules_applicability.$sym46$HL_VAR_, (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_modules_applicability.EQ), (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_applicability.UNPROVIDED);
    }
    
    public static SubLObject declare_sksi_conjunctive_removal_modules_applicability_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "removal_sksi_conjunction_pos_lits_applicability", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-APPLICABILITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "removal_sksi_conjunction_pos_lits_applicability_int", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-APPLICABILITY-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_profile_relevantP", "SKSI-CRM-PROFILE-RELEVANT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_sks_relevantP", "SKSI-CRM-SKS-RELEVANT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_genl_ks", "SKSI-CRM-GENL-KS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_get_subclause_candidates", "SKSI-CRM-GET-SUBCLAUSE-CANDIDATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sks_supports_evaluation_asentsP", "SKS-SUPPORTS-EVALUATION-ASENTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_supported_evaluate_asentP", "SKSI-SUPPORTED-EVALUATE-ASENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_fully_forbidden_comparison_operators_internal", "SKSI-CRM-FULLY-FORBIDDEN-COMPARISON-OPERATORS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_fully_forbidden_comparison_operators", "SKSI-CRM-FULLY-FORBIDDEN-COMPARISON-OPERATORS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "with_sksi_crm_pos_subclause_spec_gathering", "WITH-SKSI-CRM-POS-SUBCLAUSE-SPEC-GATHERING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_add_pos_subclause_spec", "SKSI-CRM-ADD-POS-SUBCLAUSE-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_reject_pos_subclause_spec", "SKSI-CRM-REJECT-POS-SUBCLAUSE-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_pos_subclause_spec_irrelevantP", "SKSI-CRM-POS-SUBCLAUSE-SPEC-IRRELEVANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_gather_literals", "SKSI-CRM-GATHER-LITERALS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_gather_literals_iterative", "SKSI-CRM-GATHER-LITERALS-ITERATIVE", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "pos_subclause_spec_G", "POS-SUBCLAUSE-SPEC->", 2, 0, false);
        new $pos_subclause_spec_G$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_gather_literals_recursive", "SKSI-CRM-GATHER-LITERALS-RECURSIVE", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_gather_literals_recursive_continue_recursion", "SKSI-CRM-GATHER-LITERALS-RECURSIVE-CONTINUE-RECURSION", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_valid_queryP", "SKSI-CRM-VALID-QUERY?", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_valid_query_int", "SKSI-CRM-VALID-QUERY-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_applicability_iterate_over_meaning_sentence_gafs", "SKSI-CRM-APPLICABILITY-ITERATE-OVER-MEANING-SENTENCE-GAFS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_applicability_process_meaning_sentence_gafs", "SKSI-CRM-APPLICABILITY-PROCESS-MEANING-SENTENCE-GAFS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_applicability_iterate_over_asents", "SKSI-CRM-APPLICABILITY-ITERATE-OVER-ASENTS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_asents_generate_csqlP", "SKSI-CRM-ASENTS-GENERATE-CSQL?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_asents_generate_sqlP", "SKSI-CRM-ASENTS-GENERATE-SQL?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_form_islands", "SKSI-CRM-FORM-ISLANDS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_literal_coherentP", "SKSI-CRM-LITERAL-COHERENT?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_literal_coherent", "SKSI-CRM-LITERAL-COHERENT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_literal_coherent_int", "SKSI-CRM-LITERAL-COHERENT-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_literals_coherent_together", "SKSI-CRM-LITERALS-COHERENT-TOGETHER", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_literals_coherent_together_int", "SKSI-CRM-LITERALS-COHERENT-TOGETHER-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_enumerability_check_asents", "SKSI-CRM-ENUMERABILITY-CHECK-ASENTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_unbound_unknown_sentence_asentsP", "SKSI-CRM-UNBOUND-UNKNOWN-SENTENCE-ASENTS?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_enumerability_check", "SKSI-CRM-ENUMERABILITY-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_multi_table_check", "SKSI-CRM-MULTI-TABLE-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_fully_unbound_asentsP", "SKSI-CRM-FULLY-UNBOUND-ASENTS?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_any_fully_bound_argP", "SKSI-CRM-ANY-FULLY-BOUND-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_fully_unbound_for_meaning_sentenceP", "SKSI-CRM-FULLY-UNBOUND-FOR-MEANING-SENTENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "sksi_crm_fully_unbound_for_meaning_sentence_int", "SKSI-CRM-FULLY-UNBOUND-FOR-MEANING-SENTENCE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "collect_physical_schemata_from_meaning_sentence_gafs", "COLLECT-PHYSICAL-SCHEMATA-FROM-MEANING-SENTENCE-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "collect_physical_schemata_from_meaning_sentence", "COLLECT-PHYSICAL-SCHEMATA-FROM-MEANING-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "collect_physical_schemata_from_logical_field_indexical_internal", "COLLECT-PHYSICAL-SCHEMATA-FROM-LOGICAL-FIELD-INDEXICAL-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "collect_physical_schemata_from_logical_field_indexical", "COLLECT-PHYSICAL-SCHEMATA-FROM-LOGICAL-FIELD-INDEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "clause_literal_variables", "CLAUSE-LITERAL-VARIABLES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "contextualized_literal_variables", "CONTEXTUALIZED-LITERAL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability", "contextualized_literal_hl_variables", "CONTEXTUALIZED-LITERAL-HL-VARIABLES", 1, 0, false);
        return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
    }
    
    public static SubLObject init_sksi_conjunctive_removal_modules_applicability_file() {
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_ignore_subsumed_subclause_specsP$ = SubLFiles.defparameter("*SKSI-CRM-IGNORE-SUBSUMED-SUBCLAUSE-SPECS?*", (SubLObject)sksi_conjunctive_removal_modules_applicability.T);
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_max_time_enabledP$ = SubLFiles.deflexical("*SKSI-CRM-APPLICABILITY-MAX-TIME-ENABLED?*", (SubLObject)sksi_conjunctive_removal_modules_applicability.T);
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_max_time_override$ = SubLFiles.defparameter("*SKSI-CRM-APPLICABILITY-MAX-TIME-OVERRIDE*", (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL);
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_start_time$ = SubLFiles.defparameter("*SKSI-CRM-APPLICABILITY-START-TIME*", (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL);
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_gathered_pos_subclause_specs$ = SubLFiles.defparameter("*SKSI-CRM-GATHERED-POS-SUBCLAUSE-SPECS*", (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL);
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_rejected_pos_subclause_specs$ = SubLFiles.defparameter("*SKSI-CRM-REJECTED-POS-SUBCLAUSE-SPECS*", (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL);
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_using_iterative_methodP$ = SubLFiles.defparameter("*SKSI-CRM-GATHER-LITERALS-USING-ITERATIVE-METHOD?*", (SubLObject)sksi_conjunctive_removal_modules_applicability.T);
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_iterative_method_return_first_successP$ = SubLFiles.defparameter("*SKSI-CRM-GATHER-LITERALS-ITERATIVE-METHOD-RETURN-FIRST-SUCCESS?*", (SubLObject)sksi_conjunctive_removal_modules_applicability.T);
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_stop_if_total_subclause_specs_fails_enumerability_optimizationP$ = SubLFiles.defparameter("*SKSI-CRM-GATHER-LITERALS-STOP-IF-TOTAL-SUBCLAUSE-SPECS-FAILS-ENUMERABILITY-OPTIMIZATION?*", (SubLObject)sksi_conjunctive_removal_modules_applicability.T);
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$ = SubLFiles.defparameter("*SKSI-CRM-GATHER-LITERALS-SUBCLAUSE-SPECS-FAILED-DUE-TO-ENUMERABILITY?*", (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL);
        return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
    }
    
    public static SubLObject setup_sksi_conjunctive_removal_modules_applicability_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym8$SKSI_CRM_FULLY_FORBIDDEN_COMPARISON_OPERATORS);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_modules_applicability.$sym42$COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL);
        return (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_conjunctive_removal_modules_applicability_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_conjunctive_removal_modules_applicability_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_conjunctive_removal_modules_applicability_file();
    }
    
    static {
        me = (SubLFile)new sksi_conjunctive_removal_modules_applicability();
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_ignore_subsumed_subclause_specsP$ = null;
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_max_time_enabledP$ = null;
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_max_time_override$ = null;
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_applicability_start_time$ = null;
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_gathered_pos_subclause_specs$ = null;
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_rejected_pos_subclause_specs$ = null;
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_using_iterative_methodP$ = null;
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_iterative_method_return_first_successP$ = null;
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_stop_if_total_subclause_specs_fails_enumerability_optimizationP$ = null;
        sksi_conjunctive_removal_modules_applicability.$sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$ = null;
        $kw0$SKSI_CRM_APPLICABILITY_MAX_TIME = SubLObjectFactory.makeKeyword("SKSI-CRM-APPLICABILITY-MAX-TIME");
        $str1$SKSI_conjunctive_removal_was_appl = SubLObjectFactory.makeString("SKSI conjunctive removal was applicable to problem ");
        $kw2$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str3$_but_was_lacking_this___sksiUnkno = SubLObjectFactory.makeString(" but was lacking this #$sksiUnknownSentence literal: ");
        $sym4$NEW_POS_SUBCLAUSE_SPEC = SubLObjectFactory.makeSymbol("NEW-POS-SUBCLAUSE-SPEC");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $const6$RDFTripleStore_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTripleStore-Physical"));
        $sym7$SKSI_SUPPORTED_FUNCTION_P = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-FUNCTION-P");
        $sym8$SKSI_CRM_FULLY_FORBIDDEN_COMPARISON_OPERATORS = SubLObjectFactory.makeSymbol("SKSI-CRM-FULLY-FORBIDDEN-COMPARISON-OPERATORS");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym10$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-CRM-GATHERED-POS-SUBCLAUSE-SPECS*"), (SubLObject)sksi_conjunctive_removal_modules_applicability.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-CRM-REJECTED-POS-SUBCLAUSE-SPECS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)sksi_conjunctive_removal_modules_applicability.EQUAL))));
        $sym12$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("*SKSI-CRM-IGNORE-SUBSUMED-SUBCLAUSE-SPECS?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-SUBSUMED-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("*SKSI-CRM-GATHERED-POS-SUBCLAUSE-SPECS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERSETP"))), (SubLObject)SubLObjectFactory.makeSymbol("*SKSI-CRM-GATHERED-POS-SUBCLAUSE-SPECS*")));
        $sym14$SUBSETP = SubLObjectFactory.makeSymbol("SUBSETP");
        $sym15$NCANONICALIZE_LITERAL_INDICES = SubLObjectFactory.makeSymbol("NCANONICALIZE-LITERAL-INDICES");
        $sym16$SUPERSETP = SubLObjectFactory.makeSymbol("SUPERSETP");
        $sym17$POS_SUBCLAUSE_SPEC__ = SubLObjectFactory.makeSymbol("POS-SUBCLAUSE-SPEC->");
        $sym18$_ = SubLObjectFactory.makeSymbol("=");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("LIT"));
        $kw20$VARPRED = SubLObjectFactory.makeKeyword("VARPRED");
        $kw21$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $kw22$GENLINVERSE = SubLObjectFactory.makeKeyword("GENLINVERSE");
        $str23$__SKSI__A_ = SubLObjectFactory.makeString("~&SKSI-~A ");
        $str24$Could_not_form_a_CSQL_query_with_ = SubLObjectFactory.makeString("Could not form a CSQL query with:~%  Meaning sentence GAFs: ~a~%  Literals: ~a~% for the reason: ~a");
        $const25$Database_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Database-Physical"));
        $sym26$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str27$Could_not_form_a_SQL_query_with__ = SubLObjectFactory.makeString("Could not form a SQL query with:~%  Meaning sentence GAFs: ~a~%  Literals: ~a~% for the reason: ~a");
        $sym28$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw29$POS = SubLObjectFactory.makeKeyword("POS");
        $sym30$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $list31 = ConsesLow.list((SubLObject)sksi_conjunctive_removal_modules_applicability.NIL);
        $sym32$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym33$LOGICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-P");
        $sym34$CONTEXTUALIZED_LITERAL_HL_VARIABLES = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-LITERAL-HL-VARIABLES");
        $const35$enumerableSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("enumerableSchema"));
        $kw36$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw37$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $sym38$SKSI_CRM_ANY_FULLY_BOUND_ARG_ = SubLObjectFactory.makeSymbol("SKSI-CRM-ANY-FULLY-BOUND-ARG?");
        $sym39$CONTEXTUALIZED_ASENT_ASENT = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-ASENT-ASENT");
        $sym40$FULLY_BOUND_P = SubLObjectFactory.makeSymbol("FULLY-BOUND-P");
        $sym41$LOGICAL_SCHEMA_PHYSICAL_SCHEMATA = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-PHYSICAL-SCHEMATA");
        $sym42$COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL = SubLObjectFactory.makeSymbol("COLLECT-PHYSICAL-SCHEMATA-FROM-LOGICAL-FIELD-INDEXICAL");
        $const43$logicalPhysicalFieldMap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalPhysicalFieldMap"));
        $kw44$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym45$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $sym46$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
    }
    
    public static final class $pos_subclause_spec_G$BinaryFunction extends BinaryFunction
    {
        public $pos_subclause_spec_G$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("POS-SUBCLAUSE-SPEC->"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return sksi_conjunctive_removal_modules_applicability.pos_subclause_spec_G(arg1, arg2);
        }
    }
}

/*

	Total time: 639 ms
	
*/