package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arg_type;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.unification;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_abduction_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities";
    public static final String myFingerPrint = "15f2e35a1b5b77906c078433c15ab9b29c4686b88eaad0d9a41e20e5aca23b52";
    private static final SubLSymbol $kw0$POS;
    private static final SubLSymbol $kw1$IGNORE;
    private static final SubLList $list2;
    private static final SubLObject $const3$nonAbducibleSentence;
    private static final SubLObject $const4$NonAbducibleRelation;
    private static final SubLObject $const5$NonAbduciblePredicate;
    private static final SubLObject $const6$NonAbducibleCollection;
    private static final SubLObject $const7$notAbducibleForArg;
    private static final SubLSymbol $kw8$TRUE;
    private static final SubLObject $const9$notAbducibleWRTValueInArg;
    private static final SubLSymbol $kw10$GAF_ARG;
    private static final SubLSymbol $kw11$GAF;
    private static final SubLSymbol $kw12$PREDICATE_EXTENT;
    private static final SubLSymbol $kw13$OVERLAP;
    private static final SubLObject $const14$notAbducibleWRTTypeInArg;
    private static final SubLObject $const15$isa;
    private static final SubLObject $const16$termOfUnit;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$FALSE;
    private static final SubLSymbol $kw19$NEG;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 948L)
    public static SubLObject reject_proof_due_to_non_abducible_ruleP(final SubLObject link, final SubLObject supported_problem, final SubLObject subproofs) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem.problem_store(supported_problem)) && inference_abduction_utilities.NIL != inference_worker_transformation.transformation_link_p(link) && inference_abduction_utilities.NIL != kb_accessors.non_abducible_ruleP(inference_worker_transformation.transformation_link_rule_assertion(link)) && inference_abduction_utilities.NIL != some_abductive_subproofP(subproofs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 1304L)
    public static SubLObject some_abductive_subproofP(final SubLObject subproofs) {
        SubLObject abductive_subproofP = (SubLObject)inference_abduction_utilities.NIL;
        if (inference_abduction_utilities.NIL == abductive_subproofP) {
            SubLObject csome_list_var = subproofs;
            SubLObject subproof = (SubLObject)inference_abduction_utilities.NIL;
            subproof = csome_list_var.first();
            while (inference_abduction_utilities.NIL == abductive_subproofP && inference_abduction_utilities.NIL != csome_list_var) {
                if ((inference_abduction_utilities.NIL != inference_worker.content_proof_p(subproof) && inference_abduction_utilities.NIL != inference_modules.abductive_hl_moduleP(inference_worker.content_proof_hl_module(subproof))) || inference_abduction_utilities.NIL != some_abductive_subproofP(inference_datastructures_proof.proof_direct_subproofs(subproof))) {
                    abductive_subproofP = (SubLObject)inference_abduction_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                subproof = csome_list_var.first();
            }
        }
        return abductive_subproofP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 1686L)
    public static SubLObject abduction_allowed_on_asentP(final SubLObject asent, SubLObject mt, SubLObject sense) {
        if (mt == inference_abduction_utilities.UNPROVIDED) {
            mt = (SubLObject)inference_abduction_utilities.NIL;
        }
        if (sense == inference_abduction_utilities.UNPROVIDED) {
            sense = (SubLObject)inference_abduction_utilities.$kw0$POS;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (inference_abduction_utilities.NIL == forts.fort_p(predicate)) {
            return (SubLObject)inference_abduction_utilities.NIL;
        }
        if (inference_abduction_utilities.NIL != non_abducible_relationP(predicate, mt)) {
            return (SubLObject)inference_abduction_utilities.NIL;
        }
        if (inference_abduction_utilities.NIL != non_abducible_predicateP(predicate, mt)) {
            return (SubLObject)inference_abduction_utilities.NIL;
        }
        SubLObject argnum = (SubLObject)inference_abduction_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, (SubLObject)inference_abduction_utilities.$kw1$IGNORE);
        SubLObject arg = (SubLObject)inference_abduction_utilities.NIL;
        arg = cdolist_list_var.first();
        while (inference_abduction_utilities.NIL != cdolist_list_var) {
            argnum = Numbers.add(argnum, (SubLObject)inference_abduction_utilities.ONE_INTEGER);
            if (!argnum.isZero()) {
                if (inference_abduction_utilities.NIL != variables.fully_bound_p(arg)) {
                    if (inference_abduction_utilities.NIL != non_abducible_wrt_value_in_argnumP(predicate, arg, argnum, mt) || inference_abduction_utilities.NIL != non_abducible_wrt_value_in_argnum_via_typeP(predicate, arg, argnum, mt) || inference_abduction_utilities.NIL != kb_accessors.complete_extent_enumerable_for_argP(predicate, argnum, mt)) {
                        return (SubLObject)inference_abduction_utilities.NIL;
                    }
                }
                else if (inference_abduction_utilities.NIL != non_abducible_for_argnumP(predicate, argnum, mt)) {
                    return (SubLObject)inference_abduction_utilities.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        if (inference_abduction_utilities.NIL != non_abducible_sentenceP(asent, mt)) {
            return (SubLObject)inference_abduction_utilities.NIL;
        }
        return (SubLObject)inference_abduction_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 3103L)
    public static SubLObject non_abducible_sentenceP(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_worker.currently_active_problem_store();
        final SubLObject transformation_link = inference_datastructures_problem_store.problem_store_most_recent_transformation_link(store);
        SubLObject non_abducibleP = (SubLObject)inference_abduction_utilities.NIL;
        if (inference_abduction_utilities.NIL != inference_worker_transformation.transformation_link_p(transformation_link)) {
            final SubLObject v_bindings = inference_worker_transformation.transformation_link_bindings(transformation_link);
            final SubLObject new_asent = bindings.subst_bindings(v_bindings, asent);
            final SubLObject pragmatic_requirements = inference_worker_transformation.transformation_link_pragmatic_requirements(transformation_link);
            final SubLObject pos_lits = inference_czer.contextualized_pos_lits(pragmatic_requirements);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                if (inference_abduction_utilities.NIL == non_abducibleP) {
                    SubLObject csome_list_var = pos_lits;
                    SubLObject lit = (SubLObject)inference_abduction_utilities.NIL;
                    lit = csome_list_var.first();
                    while (inference_abduction_utilities.NIL == non_abducibleP && inference_abduction_utilities.NIL != csome_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = lit;
                        SubLObject lit_mt = (SubLObject)inference_abduction_utilities.NIL;
                        SubLObject lit_formula = (SubLObject)inference_abduction_utilities.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_abduction_utilities.$list2);
                        lit_mt = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_abduction_utilities.$list2);
                        lit_formula = current.first();
                        current = current.rest();
                        if (inference_abduction_utilities.NIL == current) {
                            if (cycl_utilities.formula_operator(lit_formula).eql(inference_abduction_utilities.$const3$nonAbducibleSentence) && inference_abduction_utilities.NIL != unification.unify_possible(new_asent, cycl_utilities.formula_arg1(lit_formula, (SubLObject)inference_abduction_utilities.UNPROVIDED)) && inference_abduction_utilities.NIL != mt_relevance_macros.relevant_mtP(lit_mt)) {
                                non_abducibleP = (SubLObject)inference_abduction_utilities.T;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_abduction_utilities.$list2);
                        }
                        csome_list_var = csome_list_var.rest();
                        lit = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return non_abducibleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 4082L)
    public static SubLObject non_abducible_relationP(final SubLObject relation, SubLObject mt) {
        if (mt == inference_abduction_utilities.UNPROVIDED) {
            mt = (SubLObject)inference_abduction_utilities.NIL;
        }
        return isa.isaP(relation, inference_abduction_utilities.$const4$NonAbducibleRelation, mt, (SubLObject)inference_abduction_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 4199L)
    public static SubLObject non_abducible_predicateP(final SubLObject predicate, SubLObject mt) {
        if (mt == inference_abduction_utilities.UNPROVIDED) {
            mt = (SubLObject)inference_abduction_utilities.NIL;
        }
        return isa.isaP(predicate, inference_abduction_utilities.$const5$NonAbduciblePredicate, mt, (SubLObject)inference_abduction_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 4319L)
    public static SubLObject non_abducible_collectionP(final SubLObject collection, SubLObject mt) {
        if (mt == inference_abduction_utilities.UNPROVIDED) {
            mt = (SubLObject)inference_abduction_utilities.NIL;
        }
        return isa.isaP(collection, inference_abduction_utilities.$const6$NonAbducibleCollection, mt, (SubLObject)inference_abduction_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 4445L)
    public static SubLObject non_abducible_for_argnumP(final SubLObject predicate, final SubLObject argnum, SubLObject mt) {
        if (mt == inference_abduction_utilities.UNPROVIDED) {
            mt = (SubLObject)inference_abduction_utilities.NIL;
        }
        return kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(inference_abduction_utilities.$const7$notAbducibleForArg, predicate, argnum, mt, (SubLObject)inference_abduction_utilities.ONE_INTEGER, (SubLObject)inference_abduction_utilities.TWO_INTEGER, (SubLObject)inference_abduction_utilities.$kw8$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 4613L)
    public static SubLObject non_abducible_wrt_value_in_argnumP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        if (mt == inference_abduction_utilities.UNPROVIDED) {
            mt = (SubLObject)inference_abduction_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = el_utilities.make_ternary_formula(inference_abduction_utilities.$const9$notAbducibleWRTValueInArg, predicate, value, argnum);
        SubLObject non_abducibleP = (SubLObject)inference_abduction_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject l_index = kb_indexing.best_gaf_lookup_index(asent, (SubLObject)inference_abduction_utilities.$kw8$TRUE, (SubLObject)inference_abduction_utilities.NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)inference_abduction_utilities.$kw10$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum_$1 = thread.secondMultipleValue();
                final SubLObject predicate_$2 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (inference_abduction_utilities.NIL != argnum_$1) {
                    if (inference_abduction_utilities.NIL != predicate_$2) {
                        final SubLObject pred_var = predicate_$2;
                        if (inference_abduction_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum_$1, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum_$1, pred_var);
                            SubLObject done_var = non_abducibleP;
                            final SubLObject token_var = (SubLObject)inference_abduction_utilities.NIL;
                            while (inference_abduction_utilities.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (inference_abduction_utilities.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)inference_abduction_utilities.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)inference_abduction_utilities.$kw11$GAF, (SubLObject)inference_abduction_utilities.$kw8$TRUE, (SubLObject)inference_abduction_utilities.NIL);
                                        SubLObject done_var_$3 = non_abducibleP;
                                        final SubLObject token_var_$4 = (SubLObject)inference_abduction_utilities.NIL;
                                        while (inference_abduction_utilities.NIL == done_var_$3) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                            final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(gaf));
                                            if (inference_abduction_utilities.NIL != valid_$5 && asent.equal(assertions_high.gaf_formula(gaf))) {
                                                non_abducibleP = (SubLObject)inference_abduction_utilities.T;
                                            }
                                            done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == valid_$5 || inference_abduction_utilities.NIL != non_abducibleP);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_abduction_utilities.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (inference_abduction_utilities.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == valid || inference_abduction_utilities.NIL != non_abducibleP);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)inference_abduction_utilities.NIL;
                        if (inference_abduction_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum_$1, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum_$1, pred_var);
                            SubLObject done_var = non_abducibleP;
                            final SubLObject token_var = (SubLObject)inference_abduction_utilities.NIL;
                            while (inference_abduction_utilities.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (inference_abduction_utilities.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)inference_abduction_utilities.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)inference_abduction_utilities.$kw11$GAF, (SubLObject)inference_abduction_utilities.$kw8$TRUE, (SubLObject)inference_abduction_utilities.NIL);
                                        SubLObject done_var_$4 = non_abducibleP;
                                        final SubLObject token_var_$5 = (SubLObject)inference_abduction_utilities.NIL;
                                        while (inference_abduction_utilities.NIL == done_var_$4) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(gaf));
                                            if (inference_abduction_utilities.NIL != valid_$6 && asent.equal(assertions_high.gaf_formula(gaf))) {
                                                non_abducibleP = (SubLObject)inference_abduction_utilities.T;
                                            }
                                            done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == valid_$6 || inference_abduction_utilities.NIL != non_abducibleP);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_abduction_utilities.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (inference_abduction_utilities.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == valid || inference_abduction_utilities.NIL != non_abducibleP);
                            }
                        }
                    }
                }
                else if (inference_abduction_utilities.NIL != predicate_$2) {
                    final SubLObject pred_var = predicate_$2;
                    if (inference_abduction_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)inference_abduction_utilities.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)inference_abduction_utilities.NIL, pred_var);
                        SubLObject done_var = non_abducibleP;
                        final SubLObject token_var = (SubLObject)inference_abduction_utilities.NIL;
                        while (inference_abduction_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (inference_abduction_utilities.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)inference_abduction_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)inference_abduction_utilities.$kw11$GAF, (SubLObject)inference_abduction_utilities.$kw8$TRUE, (SubLObject)inference_abduction_utilities.NIL);
                                    SubLObject done_var_$5 = non_abducibleP;
                                    final SubLObject token_var_$6 = (SubLObject)inference_abduction_utilities.NIL;
                                    while (inference_abduction_utilities.NIL == done_var_$5) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                        final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(gaf));
                                        if (inference_abduction_utilities.NIL != valid_$7 && asent.equal(assertions_high.gaf_formula(gaf))) {
                                            non_abducibleP = (SubLObject)inference_abduction_utilities.T;
                                        }
                                        done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == valid_$7 || inference_abduction_utilities.NIL != non_abducibleP);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_abduction_utilities.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (inference_abduction_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == valid || inference_abduction_utilities.NIL != non_abducibleP);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)inference_abduction_utilities.NIL;
                    if (inference_abduction_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)inference_abduction_utilities.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)inference_abduction_utilities.NIL, pred_var);
                        SubLObject done_var = non_abducibleP;
                        final SubLObject token_var = (SubLObject)inference_abduction_utilities.NIL;
                        while (inference_abduction_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (inference_abduction_utilities.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)inference_abduction_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)inference_abduction_utilities.$kw11$GAF, (SubLObject)inference_abduction_utilities.$kw8$TRUE, (SubLObject)inference_abduction_utilities.NIL);
                                    SubLObject done_var_$6 = non_abducibleP;
                                    final SubLObject token_var_$7 = (SubLObject)inference_abduction_utilities.NIL;
                                    while (inference_abduction_utilities.NIL == done_var_$6) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                        final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(gaf));
                                        if (inference_abduction_utilities.NIL != valid_$8 && asent.equal(assertions_high.gaf_formula(gaf))) {
                                            non_abducibleP = (SubLObject)inference_abduction_utilities.T;
                                        }
                                        done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == valid_$8 || inference_abduction_utilities.NIL != non_abducibleP);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_abduction_utilities.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (inference_abduction_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == valid || inference_abduction_utilities.NIL != non_abducibleP);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)inference_abduction_utilities.$kw12$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (inference_abduction_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)inference_abduction_utilities.NIL;
                    final SubLObject _prev_bind_0_$10 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$20 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)inference_abduction_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)inference_abduction_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)inference_abduction_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)inference_abduction_utilities.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((inference_abduction_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : inference_abduction_utilities.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = non_abducibleP;
                        final SubLObject token_var2 = (SubLObject)inference_abduction_utilities.NIL;
                        while (inference_abduction_utilities.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (inference_abduction_utilities.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)inference_abduction_utilities.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)inference_abduction_utilities.$kw11$GAF, (SubLObject)inference_abduction_utilities.$kw8$TRUE, (SubLObject)inference_abduction_utilities.NIL);
                                    SubLObject done_var_$7 = non_abducibleP;
                                    final SubLObject token_var_$8 = (SubLObject)inference_abduction_utilities.NIL;
                                    while (inference_abduction_utilities.NIL == done_var_$7) {
                                        final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$8);
                                        final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(gaf2));
                                        if (inference_abduction_utilities.NIL != valid_$9 && asent.equal(assertions_high.gaf_formula(gaf2))) {
                                            non_abducibleP = (SubLObject)inference_abduction_utilities.T;
                                        }
                                        done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == valid_$9 || inference_abduction_utilities.NIL != non_abducibleP);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_abduction_utilities.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (inference_abduction_utilities.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == valid2 || inference_abduction_utilities.NIL != non_abducibleP);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$20, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)inference_abduction_utilities.$kw13$OVERLAP)) {
                SubLObject rest;
                SubLObject gaf3;
                for (rest = (SubLObject)inference_abduction_utilities.NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)inference_abduction_utilities.UNPROVIDED); inference_abduction_utilities.NIL == non_abducibleP && inference_abduction_utilities.NIL != rest; rest = rest.rest()) {
                    gaf3 = rest.first();
                    if (inference_abduction_utilities.NIL != assertions_high.assertion_has_truth(gaf3, (SubLObject)inference_abduction_utilities.$kw8$TRUE) && asent.equal(assertions_high.gaf_formula(gaf3))) {
                        non_abducibleP = (SubLObject)inference_abduction_utilities.T;
                    }
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return non_abducibleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 5023L)
    public static SubLObject non_abducible_wrt_value_in_argnum_via_typeP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        if (mt == inference_abduction_utilities.UNPROVIDED) {
            mt = (SubLObject)inference_abduction_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject non_abducibleP = (SubLObject)inference_abduction_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject pred_var = inference_abduction_utilities.$const14$notAbducibleWRTTypeInArg;
            if (inference_abduction_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)inference_abduction_utilities.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)inference_abduction_utilities.ONE_INTEGER, pred_var);
                SubLObject done_var = non_abducibleP;
                final SubLObject token_var = (SubLObject)inference_abduction_utilities.NIL;
                while (inference_abduction_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (inference_abduction_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)inference_abduction_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)inference_abduction_utilities.$kw11$GAF, (SubLObject)inference_abduction_utilities.$kw8$TRUE, (SubLObject)inference_abduction_utilities.NIL);
                            SubLObject done_var_$25 = non_abducibleP;
                            final SubLObject token_var_$26 = (SubLObject)inference_abduction_utilities.NIL;
                            while (inference_abduction_utilities.NIL == done_var_$25) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                final SubLObject valid_$27 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$26.eql(gaf));
                                if (inference_abduction_utilities.NIL != valid_$27 && argnum.numE(assertions_high.gaf_arg3(gaf))) {
                                    final SubLObject collection = assertions_high.gaf_arg2(gaf);
                                    if (inference_abduction_utilities.NIL != isa.isaP(value, collection, mt, (SubLObject)inference_abduction_utilities.UNPROVIDED)) {
                                        non_abducibleP = (SubLObject)inference_abduction_utilities.T;
                                    }
                                }
                                done_var_$25 = (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == valid_$27 || inference_abduction_utilities.NIL != non_abducibleP);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_abduction_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (inference_abduction_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == valid || inference_abduction_utilities.NIL != non_abducibleP);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return non_abducibleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 5646L)
    public static SubLObject valid_abduction_asentP(final SubLObject asent, final SubLObject mt, final SubLObject sense, final SubLObject contains_abduced_termP) {
        if (inference_abduction_utilities.NIL == variables.fully_bound_p(asent)) {
            return (SubLObject)inference_abduction_utilities.NIL;
        }
        if (inference_abduction_utilities.NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, inference_abduction_utilities.$const15$isa)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == provably_false_contextualized_isa_asentP(asent, mt, sense));
        }
        if (inference_abduction_utilities.NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, inference_abduction_utilities.$const16$termOfUnit)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_abduction_utilities.NIL == provably_false_contextualized_tou_asentP(asent, mt));
        }
        if (inference_abduction_utilities.NIL == contains_abduced_termP && inference_abduction_utilities.NIL != known_to_be_true_or_falseP(asent, mt, sense)) {
            return (SubLObject)inference_abduction_utilities.NIL;
        }
        return abduction_admitted_formula(asent, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 6266L)
    public static SubLObject abduction_admitted_formula(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_abduction_utilities.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)inference_abduction_utilities.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)inference_abduction_utilities.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)inference_abduction_utilities.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)inference_abduction_utilities.NIL, thread);
            if (inference_abduction_utilities.NIL == cycl_grammar.cycl_sentence_p(asent)) {
                result = (SubLObject)inference_abduction_utilities.NIL;
            }
            else if (inference_abduction_utilities.NIL != kb_accessors.irreflexive_predicateP(cycl_utilities.atomic_sentence_predicate(asent)) && inference_abduction_utilities.NIL != equals.equalsP(cycl_utilities.reify_arg_when_closed_naut(asent, (SubLObject)inference_abduction_utilities.ONE_INTEGER), cycl_utilities.reify_arg_when_closed_naut(asent, (SubLObject)inference_abduction_utilities.TWO_INTEGER), (SubLObject)inference_abduction_utilities.UNPROVIDED, (SubLObject)inference_abduction_utilities.UNPROVIDED)) {
                result = (SubLObject)inference_abduction_utilities.NIL;
            }
            else {
                final SubLObject _prev_bind_0_$29 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                try {
                    at_vars.$at_check_relator_constraintsP$.bind((SubLObject)inference_abduction_utilities.NIL, thread);
                    result = arg_type.formula_args_ok_wrt_typeP(asent, mt);
                }
                finally {
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_0_$29, thread);
                }
            }
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 6860L)
    public static SubLObject known_to_be_true_or_falseP(final SubLObject asent, final SubLObject mt, final SubLObject sense) {
        final SubLObject v_properties = (SubLObject)inference_abduction_utilities.$list17;
        if (sense.eql((SubLObject)inference_abduction_utilities.$kw0$POS)) {
            return list_utilities.sublisp_boolean(backward.removal_ask(asent, mt, (SubLObject)inference_abduction_utilities.$kw18$FALSE, v_properties));
        }
        if (sense.eql((SubLObject)inference_abduction_utilities.$kw19$NEG)) {
            return list_utilities.sublisp_boolean(backward.removal_ask(asent, mt, (SubLObject)inference_abduction_utilities.$kw8$TRUE, v_properties));
        }
        return (SubLObject)inference_abduction_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 7197L)
    public static SubLObject provably_false_contextualized_isa_asentP(final SubLObject asent, final SubLObject mt, final SubLObject sense) {
        if (inference_abduction_utilities.NIL == el_utilities.groundP(asent, (SubLObject)inference_abduction_utilities.UNPROVIDED)) {
            return (SubLObject)inference_abduction_utilities.NIL;
        }
        final SubLObject inst = el_utilities.literal_arg1(asent, (SubLObject)inference_abduction_utilities.UNPROVIDED);
        final SubLObject col = el_utilities.literal_arg2(asent, (SubLObject)inference_abduction_utilities.UNPROVIDED);
        if (inference_abduction_utilities.NIL != isa.isaP(inst, col, mt, (SubLObject)inference_abduction_utilities.UNPROVIDED)) {
            return (SubLObject)inference_abduction_utilities.NIL;
        }
        return at_defns.quiet_not_has_typeP(inst, col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 7512L)
    public static SubLObject provably_false_contextualized_tou_asentP(final SubLObject asent, final SubLObject mt) {
        if (inference_abduction_utilities.NIL == el_utilities.groundP(asent, (SubLObject)inference_abduction_utilities.UNPROVIDED)) {
            return (SubLObject)inference_abduction_utilities.NIL;
        }
        final SubLObject arg1 = el_utilities.literal_arg1(asent, (SubLObject)inference_abduction_utilities.UNPROVIDED);
        final SubLObject arg2 = el_utilities.literal_arg2(asent, (SubLObject)inference_abduction_utilities.UNPROVIDED);
        return disjoint_with.instances_of_disjoint_collectionsP(arg1, arg2, mt, (SubLObject)inference_abduction_utilities.UNPROVIDED);
    }
    
    public static SubLObject declare_inference_abduction_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "reject_proof_due_to_non_abducible_ruleP", "REJECT-PROOF-DUE-TO-NON-ABDUCIBLE-RULE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "some_abductive_subproofP", "SOME-ABDUCTIVE-SUBPROOF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "abduction_allowed_on_asentP", "ABDUCTION-ALLOWED-ON-ASENT?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "non_abducible_sentenceP", "NON-ABDUCIBLE-SENTENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "non_abducible_relationP", "NON-ABDUCIBLE-RELATION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "non_abducible_predicateP", "NON-ABDUCIBLE-PREDICATE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "non_abducible_collectionP", "NON-ABDUCIBLE-COLLECTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "non_abducible_for_argnumP", "NON-ABDUCIBLE-FOR-ARGNUM?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "non_abducible_wrt_value_in_argnumP", "NON-ABDUCIBLE-WRT-VALUE-IN-ARGNUM?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "non_abducible_wrt_value_in_argnum_via_typeP", "NON-ABDUCIBLE-WRT-VALUE-IN-ARGNUM-VIA-TYPE?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "valid_abduction_asentP", "VALID-ABDUCTION-ASENT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "abduction_admitted_formula", "ABDUCTION-ADMITTED-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "known_to_be_true_or_falseP", "KNOWN-TO-BE-TRUE-OR-FALSE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "provably_false_contextualized_isa_asentP", "PROVABLY-FALSE-CONTEXTUALIZED-ISA-ASENT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities", "provably_false_contextualized_tou_asentP", "PROVABLY-FALSE-CONTEXTUALIZED-TOU-ASENT?", 2, 0, false);
        return (SubLObject)inference_abduction_utilities.NIL;
    }
    
    public static SubLObject init_inference_abduction_utilities_file() {
        return (SubLObject)inference_abduction_utilities.NIL;
    }
    
    public static SubLObject setup_inference_abduction_utilities_file() {
        return (SubLObject)inference_abduction_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_abduction_utilities_file();
    }
    
    public void initializeVariables() {
        init_inference_abduction_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_abduction_utilities_file();
    }
    
    static {
        me = (SubLFile)new inference_abduction_utilities();
        $kw0$POS = SubLObjectFactory.makeKeyword("POS");
        $kw1$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("LIT-FORMULA"));
        $const3$nonAbducibleSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonAbducibleSentence"));
        $const4$NonAbducibleRelation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonAbducibleRelation"));
        $const5$NonAbduciblePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonAbduciblePredicate"));
        $const6$NonAbducibleCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonAbducibleCollection"));
        $const7$notAbducibleForArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("notAbducibleForArg"));
        $kw8$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const9$notAbducibleWRTValueInArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("notAbducibleWRTValueInArg"));
        $kw10$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw11$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw12$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $kw13$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $const14$notAbducibleWRTTypeInArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("notAbducibleWRTTypeInArg"));
        $const15$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const16$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)inference_abduction_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ALLOWED-MODULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ABDUCTION"))));
        $kw18$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw19$NEG = SubLObjectFactory.makeKeyword("NEG");
    }
}

/*

	Total time: 633 ms
	
*/