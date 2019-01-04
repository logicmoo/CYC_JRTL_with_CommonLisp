package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_precision_suggestor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_precision_suggestor";
    public static final String myFingerPrint = "54bf2509115dcde6d5c571e1525b0687436d01f6b9d8e77a858097f653b8d3cb";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 7924L)
    private static SubLSymbol $rkf_raw_specialization_type_col$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 10243L)
    private static SubLSymbol $rkf_irrelevant_precision_suggestion_forts_from_fort_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 18597L)
    private static SubLSymbol $rkf_transitive_strengthener_max$;
    private static final SubLObject $const0$disjointWith;
    private static final SubLList $list1;
    private static final SubLObject $const2$transitiveViaArgInverse;
    private static final SubLObject $const3$transitiveViaArg;
    private static final SubLObject $const4$NLTemplateGenerationPredicate;
    private static final SubLObject $const5$GenTemplateRecipe;
    private static final SubLSymbol $sym6$SPEC_;
    private static final SubLList $list7;
    private static final SubLObject $const8$deeperGenTemplateRecipe;
    private static final SubLList $list9;
    private static final SubLObject $const10$and;
    private static final SubLSymbol $sym11$_PRED;
    private static final SubLSymbol $sym12$_ARG;
    private static final SubLObject $const13$elementOf;
    private static final SubLObject $const14$TheSet;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$_;
    private static final SubLSymbol $sym17$FIRST;
    private static final SubLObject $const18$genls;
    private static final SubLSymbol $sym19$GENERALITY_ESTIMATE;
    private static final SubLObject $const20$genlPreds;
    private static final SubLSymbol $sym21$SPEC_PREDICATE_;
    private static final SubLSymbol $sym22$GENL_;
    private static final SubLSymbol $sym23$RKF_ISA_OF_TYPE_COLLECTION_;
    private static final SubLSymbol $sym24$_;
    private static final SubLSymbol $sym25$GENL_PREDICATE_;
    private static final SubLSymbol $sym26$ALL_SPECS;
    private static final SubLSymbol $sym27$ALL_GENLS;
    private static final SubLSymbol $sym28$ALL_SPEC_PREDS;
    private static final SubLSymbol $sym29$ALL_GENL_PREDS;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$RKF_REMOVE_SUBSUMED_HELPER;
    private static final SubLSymbol $sym32$RKF_IRRELEVANT_PRECISION_SUGGESTION_FORTS_FROM_FORT;
    private static final SubLSymbol $sym33$_IRREL;
    private static final SubLObject $const34$keIrrelevantPrecisionSuggestionFr;
    private static final SubLSymbol $sym35$_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORTS_FROM_FORT_CACHING_STAT;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$_GEN;
    private static final SubLObject $const38$keGeneralizationSuggestion;
    private static final SubLSymbol $sym39$GENLS_;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$_SPEC;
    private static final SubLObject $const42$kePrecisionSuggestion;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $kw45$GAF;
    private static final SubLSymbol $kw46$TRUE;
    private static final SubLObject $const47$RuleMacroPredicate;
    private static final SubLObject $const48$Collection;
    private static final SubLObject $const49$typeGenls;
    private static final SubLList $list50;
    private static final SubLObject $const51$unknownSentence;
    private static final SubLObject $const52$relationAllInstance;
    private static final SubLObject $const53$thereExists;
    private static final SubLSymbol $sym54$_COLTYPE2;
    private static final SubLList $list55;
    private static final SubLSymbol $kw56$RESULT_UNIQUENESS;
    private static final SubLSymbol $kw57$BINDINGS;
    private static final SubLSymbol $kw58$RETURN;
    private static final SubLSymbol $kw59$TEMPLATE;
    private static final SubLSymbol $kw60$PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $kw61$POSITIVE_INFINITY;
    private static final SubLSymbol $kw62$ALLOWED_MODULES;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$NUM_INDEX;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 1016L)
    public static SubLObject rkf_raw_precisify_arg(final SubLObject asent, final SubLObject argnum, final SubLObject domain_mt, final SubLObject generalizeP, SubLObject v_term, SubLObject precisification_predicates, SubLObject type_col) {
        if (v_term == rkf_precision_suggestor.UNPROVIDED) {
            v_term = (SubLObject)rkf_precision_suggestor.NIL;
        }
        if (precisification_predicates == rkf_precision_suggestor.UNPROVIDED) {
            precisification_predicates = (SubLObject)rkf_precision_suggestor.NIL;
        }
        if (type_col == rkf_precision_suggestor.UNPROVIDED) {
            type_col = (SubLObject)rkf_precision_suggestor.NIL;
        }
        if (rkf_precision_suggestor.NIL == v_term) {
            v_term = cycl_utilities.sentence_arg(asent, argnum, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
        }
        if (rkf_precision_suggestor.NIL == precisification_predicates) {
            precisification_predicates = rkf_sentence_arg_precisification_options(asent, domain_mt, argnum, generalizeP);
        }
        SubLObject result = (SubLObject)rkf_precision_suggestor.NIL;
        if (rkf_precision_suggestor.NIL != precisification_predicates) {
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject disjoint_statementP = Equality.eq(rkf_precision_suggestor.$const0$disjointWith, cycl_utilities.atomic_sentence_predicate(asent));
            final SubLObject other_term = (SubLObject)((rkf_precision_suggestor.NIL != disjoint_statementP) ? cycl_utilities.atomic_sentence_arg(asent, Numbers.subtract((SubLObject)rkf_precision_suggestor.THREE_INTEGER, argnum), (SubLObject)rkf_precision_suggestor.UNPROVIDED) : rkf_precision_suggestor.NIL);
            final SubLObject arg_constraint_argnum = (rkf_precision_suggestor.NIL != rkf_concept_clarifier.rkf_quantified_binary_predicate_naut_p(pred)) ? number_utilities.f_1_(argnum) : argnum;
            final SubLObject isa_constraints = rkf_concept_clarifier.rkf_argn_isa(pred, arg_constraint_argnum, domain_mt);
            final SubLObject genl_constraints = rkf_concept_clarifier.rkf_argn_genl(pred, arg_constraint_argnum, domain_mt);
            SubLObject cdolist_list_var = precisification_predicates;
            SubLObject precisification_pred = (SubLObject)rkf_precision_suggestor.NIL;
            precisification_pred = cdolist_list_var.first();
            while (rkf_precision_suggestor.NIL != cdolist_list_var) {
                final SubLObject candidates = (rkf_precision_suggestor.NIL != generalizeP) ? rkf_raw_generalization_candidates(v_term, precisification_pred, domain_mt) : Sequences.nreverse(rkf_raw_specialization_candidates(v_term, precisification_pred, domain_mt, type_col));
                SubLObject stopP = (SubLObject)rkf_precision_suggestor.NIL;
                if (rkf_precision_suggestor.NIL == stopP) {
                    SubLObject csome_list_var = candidates;
                    SubLObject candidate = (SubLObject)rkf_precision_suggestor.NIL;
                    candidate = csome_list_var.first();
                    while (rkf_precision_suggestor.NIL == stopP && rkf_precision_suggestor.NIL != csome_list_var) {
                        SubLObject failP = (SubLObject)rkf_precision_suggestor.NIL;
                        if (rkf_precision_suggestor.NIL != disjoint_statementP && rkf_precision_suggestor.NIL != genls.genlP(other_term, candidate, domain_mt, (SubLObject)rkf_precision_suggestor.UNPROVIDED)) {
                            failP = (SubLObject)rkf_precision_suggestor.T;
                            stopP = (SubLObject)rkf_precision_suggestor.T;
                        }
                        if (rkf_precision_suggestor.NIL == stopP) {
                            SubLObject csome_list_var_$1 = genl_constraints;
                            SubLObject genl_constraint = (SubLObject)rkf_precision_suggestor.NIL;
                            genl_constraint = csome_list_var_$1.first();
                            while (rkf_precision_suggestor.NIL == stopP && rkf_precision_suggestor.NIL != csome_list_var_$1) {
                                if (rkf_precision_suggestor.NIL == genls.genlP(candidate, genl_constraint, domain_mt, (SubLObject)rkf_precision_suggestor.UNPROVIDED)) {
                                    failP = (SubLObject)rkf_precision_suggestor.T;
                                    stopP = (SubLObject)rkf_precision_suggestor.T;
                                }
                                csome_list_var_$1 = csome_list_var_$1.rest();
                                genl_constraint = csome_list_var_$1.first();
                            }
                        }
                        if (rkf_precision_suggestor.NIL == failP) {
                            SubLObject csome_list_var_$2 = isa_constraints;
                            SubLObject isa_constraint = (SubLObject)rkf_precision_suggestor.NIL;
                            isa_constraint = csome_list_var_$2.first();
                            while (rkf_precision_suggestor.NIL == failP && rkf_precision_suggestor.NIL != csome_list_var_$2) {
                                if (rkf_precision_suggestor.NIL == isa.isaP(candidate, isa_constraint, domain_mt, (SubLObject)rkf_precision_suggestor.UNPROVIDED)) {
                                    failP = (SubLObject)rkf_precision_suggestor.T;
                                }
                                csome_list_var_$2 = csome_list_var_$2.rest();
                                isa_constraint = csome_list_var_$2.first();
                            }
                        }
                        if (rkf_precision_suggestor.NIL == failP) {
                            final SubLObject item_var = candidate;
                            if (rkf_precision_suggestor.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)rkf_precision_suggestor.EQL), Symbols.symbol_function((SubLObject)rkf_precision_suggestor.IDENTITY))) {
                                result = (SubLObject)ConsesLow.cons(item_var, result);
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        candidate = csome_list_var.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                precisification_pred = cdolist_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 3226L)
    public static SubLObject rkf_sentence_arg_precisification_options(final SubLObject sentence, final SubLObject domain_mt, final SubLObject argnum, final SubLObject generalizeP) {
        return (rkf_precision_suggestor.NIL != generalizeP) ? rkf_sentence_arg_generalization_options(sentence, domain_mt, argnum) : rkf_sentence_arg_specialization_options(sentence, domain_mt, argnum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 3916L)
    public static SubLObject rkf_sentence_arg_generalization_options(final SubLObject sentence, final SubLObject domain_mt, final SubLObject argnum) {
        if (argnum.isFixnum() && argnum.isZero()) {
            return (SubLObject)rkf_precision_suggestor.$list1;
        }
        return rkf_sentence_arg_tva_options(sentence, domain_mt, rkf_precision_suggestor.$const2$transitiveViaArgInverse, argnum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 4421L)
    public static SubLObject rkf_sentence_arg_specialization_options(final SubLObject sentence, final SubLObject domain_mt, final SubLObject argnum) {
        if (argnum.isFixnum() && argnum.isZero()) {
            return (SubLObject)rkf_precision_suggestor.$list1;
        }
        if (rkf_precision_suggestor.NIL != gen_template_recipe_argP(cycl_utilities.formula_arg0(sentence), argnum, domain_mt)) {
            return gen_template_recipe_specialization_options(sentence, argnum, domain_mt);
        }
        return rkf_sentence_arg_tva_options(sentence, domain_mt, rkf_precision_suggestor.$const3$transitiveViaArg, argnum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 5087L)
    public static SubLObject gen_template_recipe_argP(final SubLObject operator, final SubLObject argnum, final SubLObject domain_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_precision_suggestor.NIL != isa.isaP(operator, rkf_precision_suggestor.$const4$NLTemplateGenerationPredicate, domain_mt, (SubLObject)rkf_precision_suggestor.UNPROVIDED) && (rkf_precision_suggestor.NIL == argnum || rkf_precision_suggestor.NIL != conses_high.member(rkf_precision_suggestor.$const5$GenTemplateRecipe, kb_accessors.argn_quoted_isa(operator, argnum, domain_mt), (SubLObject)rkf_precision_suggestor.$sym6$SPEC_, (SubLObject)rkf_precision_suggestor.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 5349L)
    public static SubLObject gen_template_recipe_specialization_options(final SubLObject sentence, final SubLObject argnum, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_precision_suggestor.NIL != argnum) {
            return (SubLObject)rkf_precision_suggestor.$list7;
        }
        SubLObject ans = (SubLObject)rkf_precision_suggestor.NIL;
        SubLObject end_var;
        SubLObject argnum_$3;
        SubLObject mt_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject _prev_bind_3;
        for (end_var = number_utilities.f_1X(el_utilities.formula_arity(sentence, (SubLObject)rkf_precision_suggestor.UNPROVIDED)), argnum_$3 = (SubLObject)rkf_precision_suggestor.NIL, argnum_$3 = (SubLObject)rkf_precision_suggestor.ONE_INTEGER; !argnum_$3.numGE(end_var); argnum_$3 = number_utilities.f_1X(argnum_$3)) {
            mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
            _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (rkf_precision_suggestor.NIL != conses_high.member(rkf_precision_suggestor.$const5$GenTemplateRecipe, kb_accessors.argn_quoted_isa(cycl_utilities.formula_arg0(sentence), argnum_$3, (SubLObject)rkf_precision_suggestor.UNPROVIDED), (SubLObject)rkf_precision_suggestor.$sym6$SPEC_, (SubLObject)rkf_precision_suggestor.UNPROVIDED)) {
                    ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(argnum_$3, rkf_precision_suggestor.$const8$deeperGenTemplateRecipe), ans);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 5803L)
    public static SubLObject rkf_sentence_arg_tva_options(final SubLObject sentence, final SubLObject domain_mt, final SubLObject tva_predicate, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(sentence);
        if (rkf_precision_suggestor.NIL != fort_types_interface.predicateP(predicate)) {
            SubLObject v_answer = (SubLObject)rkf_precision_suggestor.NIL;
            final SubLObject supported_transitive_preds = (SubLObject)rkf_precision_suggestor.$list9;
            final SubLObject query = (SubLObject)ConsesLow.list(rkf_precision_suggestor.$const10$and, (SubLObject)ConsesLow.list(tva_predicate, predicate, (SubLObject)rkf_precision_suggestor.$sym11$_PRED, (SubLObject)((rkf_precision_suggestor.NIL != argnum) ? argnum : rkf_precision_suggestor.$sym12$_ARG)), (SubLObject)ConsesLow.list(rkf_precision_suggestor.$const13$elementOf, (SubLObject)rkf_precision_suggestor.$sym11$_PRED, reader.bq_cons(rkf_precision_suggestor.$const14$TheSet, ConsesLow.append(supported_transitive_preds, (SubLObject)rkf_precision_suggestor.NIL))));
            final SubLObject _prev_bind_0 = control_vars.$cache_inference_results$.currentBinding(thread);
            final SubLObject _prev_bind_2 = control_vars.$compute_inference_results$.currentBinding(thread);
            final SubLObject _prev_bind_3 = control_vars.$unique_inference_result_bindings$.currentBinding(thread);
            final SubLObject _prev_bind_4 = abnormal.$abnormality_checking_enabled$.currentBinding(thread);
            final SubLObject _prev_bind_5 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
            final SubLObject _prev_bind_6 = control_vars.$within_assert$.currentBinding(thread);
            final SubLObject _prev_bind_7 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            final SubLObject _prev_bind_10 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            final SubLObject _prev_bind_11 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_12 = czer_vars.$simplify_literalP$.currentBinding(thread);
            final SubLObject _prev_bind_13 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            final SubLObject _prev_bind_14 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            final SubLObject _prev_bind_15 = wff_vars.$validate_constantsP$.currentBinding(thread);
            final SubLObject _prev_bind_16 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            try {
                control_vars.$cache_inference_results$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                control_vars.$compute_inference_results$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                control_vars.$unique_inference_result_bindings$.bind((SubLObject)rkf_precision_suggestor.T, thread);
                abnormal.$abnormality_checking_enabled$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                api_control_vars.$generate_readable_fi_results$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                control_vars.$within_assert$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                wff_utilities.$check_arg_typesP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                at_vars.$at_check_arg_typesP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                wff_utilities.$check_var_typesP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                czer_vars.$simplify_literalP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                at_vars.$at_check_arg_formatP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                wff_vars.$validate_constantsP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)rkf_precision_suggestor.T, thread);
                v_answer = ask_utilities.ask_template((SubLObject)((rkf_precision_suggestor.NIL != argnum) ? rkf_precision_suggestor.$sym11$_PRED : rkf_precision_suggestor.$list15), query, domain_mt, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
            }
            finally {
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_16, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_15, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_14, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_13, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_12, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_11, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_10, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_8, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_7, thread);
                control_vars.$within_assert$.rebind(_prev_bind_6, thread);
                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_5, thread);
                abnormal.$abnormality_checking_enabled$.rebind(_prev_bind_4, thread);
                control_vars.$unique_inference_result_bindings$.rebind(_prev_bind_3, thread);
                control_vars.$compute_inference_results$.rebind(_prev_bind_2, thread);
                control_vars.$cache_inference_results$.rebind(_prev_bind_0, thread);
            }
            v_answer = Sort.sort(v_answer, Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym16$_), Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym17$FIRST));
            return v_answer;
        }
        return (SubLObject)rkf_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 7125L)
    public static SubLObject rkf_raw_generalization_candidates(final SubLObject v_term, final SubLObject predicate, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)rkf_precision_suggestor.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (predicate.eql(rkf_precision_suggestor.$const18$genls)) {
                v_answer = Sequences.delete(v_term, genls.all_genls(v_term, domain_mt, (SubLObject)rkf_precision_suggestor.UNPROVIDED), (SubLObject)rkf_precision_suggestor.$sym6$SPEC_, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
                v_answer = Sort.sort(v_answer, Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym16$_), Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym19$GENERALITY_ESTIMATE));
            }
            else if (predicate.eql(rkf_precision_suggestor.$const20$genlPreds)) {
                v_answer = (SubLObject)((rkf_precision_suggestor.NIL != forts.fort_p(v_term)) ? Sequences.delete(v_term, genl_predicates.all_genl_preds(v_term, domain_mt, (SubLObject)rkf_precision_suggestor.UNPROVIDED), (SubLObject)rkf_precision_suggestor.$sym21$SPEC_PREDICATE_, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED) : rkf_precision_suggestor.NIL);
            }
            else {
                v_answer = (SubLObject)rkf_precision_suggestor.NIL;
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return rkf_remove_subsumed(v_answer, predicate, domain_mt, (SubLObject)rkf_precision_suggestor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 7987L)
    public static SubLObject rkf_isa_of_type_collectionP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject isas = isa.asserted_isa(v_term, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
        if (rkf_precision_suggestor.NIL != subl_promotions.memberP(rkf_precision_suggestor.$rkf_raw_specialization_type_col$.getDynamicValue(thread), isas, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED)) {
            return (SubLObject)rkf_precision_suggestor.T;
        }
        return (SubLObject)rkf_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 8165L)
    public static SubLObject rkf_raw_specialization_candidates(final SubLObject v_term, final SubLObject predicate, final SubLObject domain_mt, SubLObject type_col) {
        if (type_col == rkf_precision_suggestor.UNPROVIDED) {
            type_col = (SubLObject)rkf_precision_suggestor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)rkf_precision_suggestor.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (predicate.eql(rkf_precision_suggestor.$const18$genls)) {
                v_answer = Sequences.delete(v_term, genls.specs(v_term, domain_mt, (SubLObject)rkf_precision_suggestor.UNPROVIDED), (SubLObject)rkf_precision_suggestor.$sym22$GENL_, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
                if (rkf_precision_suggestor.NIL != forts.fort_p(type_col)) {
                    final SubLObject _prev_bind_0_$4 = rkf_precision_suggestor.$rkf_raw_specialization_type_col$.currentBinding(thread);
                    try {
                        rkf_precision_suggestor.$rkf_raw_specialization_type_col$.bind(type_col, thread);
                        v_answer = list_utilities.delete_if_not((SubLObject)rkf_precision_suggestor.$sym23$RKF_ISA_OF_TYPE_COLLECTION_, v_answer, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
                    }
                    finally {
                        rkf_precision_suggestor.$rkf_raw_specialization_type_col$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                v_answer = Sort.sort(v_answer, Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym24$_), Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym19$GENERALITY_ESTIMATE));
            }
            else if (predicate.eql(rkf_precision_suggestor.$const20$genlPreds)) {
                v_answer = (SubLObject)((rkf_precision_suggestor.NIL != forts.fort_p(v_term)) ? Sequences.delete(v_term, genl_predicates.spec_predicates(v_term, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED), (SubLObject)rkf_precision_suggestor.$sym25$GENL_PREDICATE_, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED) : rkf_precision_suggestor.NIL);
            }
            else if (predicate.eql(rkf_precision_suggestor.$const8$deeperGenTemplateRecipe)) {
                v_answer = pph_templates.pph_phrase_naut_deepening_candidates(v_term, domain_mt, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
            }
            else {
                v_answer = (SubLObject)rkf_precision_suggestor.NIL;
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return rkf_remove_subsumed(v_answer, predicate, domain_mt, (SubLObject)rkf_precision_suggestor.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 9114L)
    public static SubLObject rkf_remove_subsumed(final SubLObject candidates, final SubLObject pred, final SubLObject domain_mt, final SubLObject inverseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rkf_precision_suggestor.NIL;
        SubLObject helper_fn = (SubLObject)rkf_precision_suggestor.NIL;
        if (pred.eql(rkf_precision_suggestor.$const18$genls)) {
            helper_fn = (SubLObject)((rkf_precision_suggestor.NIL != inverseP) ? rkf_precision_suggestor.$sym26$ALL_SPECS : rkf_precision_suggestor.$sym27$ALL_GENLS);
        }
        else if (pred.eql(rkf_precision_suggestor.$const20$genlPreds)) {
            helper_fn = (SubLObject)((rkf_precision_suggestor.NIL != inverseP) ? rkf_precision_suggestor.$sym28$ALL_SPEC_PREDS : rkf_precision_suggestor.$sym29$ALL_GENL_PREDS);
        }
        if (rkf_precision_suggestor.NIL != Symbols.fboundp(helper_fn)) {
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject remain;
                    SubLObject current;
                    SubLObject datum;
                    SubLObject now;
                    SubLObject later;
                    SubLObject badP;
                    SubLObject csome_list_var;
                    SubLObject other;
                    for (remain = (SubLObject)rkf_precision_suggestor.NIL, remain = candidates; rkf_precision_suggestor.NIL != remain; remain = remain.rest()) {
                        datum = (current = remain);
                        now = (SubLObject)rkf_precision_suggestor.NIL;
                        later = (SubLObject)rkf_precision_suggestor.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_precision_suggestor.$list30);
                        now = current.first();
                        current = (later = current.rest());
                        badP = (SubLObject)rkf_precision_suggestor.NIL;
                        if (rkf_precision_suggestor.NIL == badP) {
                            csome_list_var = later;
                            other = (SubLObject)rkf_precision_suggestor.NIL;
                            other = csome_list_var.first();
                            while (rkf_precision_suggestor.NIL == badP && rkf_precision_suggestor.NIL != csome_list_var) {
                                if (rkf_precision_suggestor.NIL != subl_promotions.memberP(now, rkf_remove_subsumed_helper(other, helper_fn, domain_mt), (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED)) {
                                    badP = (SubLObject)rkf_precision_suggestor.T;
                                }
                                csome_list_var = csome_list_var.rest();
                                other = csome_list_var.first();
                            }
                        }
                        if (rkf_precision_suggestor.NIL == badP) {
                            csome_list_var = ans;
                            other = (SubLObject)rkf_precision_suggestor.NIL;
                            other = csome_list_var.first();
                            while (rkf_precision_suggestor.NIL == badP && rkf_precision_suggestor.NIL != csome_list_var) {
                                if (rkf_precision_suggestor.NIL != subl_promotions.memberP(now, rkf_remove_subsumed_helper(other, helper_fn, domain_mt), (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED)) {
                                    badP = (SubLObject)rkf_precision_suggestor.T;
                                }
                                csome_list_var = csome_list_var.rest();
                                other = csome_list_var.first();
                            }
                        }
                        if (rkf_precision_suggestor.NIL == badP) {
                            ans = (SubLObject)ConsesLow.cons(now, ans);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_precision_suggestor.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
            return ans;
        }
        return candidates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 10053L)
    public static SubLObject rkf_remove_subsumed_helper_internal(final SubLObject v_term, final SubLObject helper_fn, final SubLObject mt) {
        return Functions.funcall(helper_fn, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 10053L)
    public static SubLObject rkf_remove_subsumed_helper(final SubLObject v_term, final SubLObject helper_fn, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_precision_suggestor.NIL;
        if (rkf_precision_suggestor.NIL == v_memoization_state) {
            return rkf_remove_subsumed_helper_internal(v_term, helper_fn, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_precision_suggestor.$sym31$RKF_REMOVE_SUBSUMED_HELPER, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
        if (rkf_precision_suggestor.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_precision_suggestor.$sym31$RKF_REMOVE_SUBSUMED_HELPER, (SubLObject)rkf_precision_suggestor.THREE_INTEGER, (SubLObject)rkf_precision_suggestor.NIL, (SubLObject)rkf_precision_suggestor.EQL, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_precision_suggestor.$sym31$RKF_REMOVE_SUBSUMED_HELPER, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, helper_fn, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_precision_suggestor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_precision_suggestor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (helper_fn.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rkf_precision_suggestor.NIL != cached_args && rkf_precision_suggestor.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_remove_subsumed_helper_internal(v_term, helper_fn, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, helper_fn, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 10243L)
    public static SubLObject clear_rkf_irrelevant_precision_suggestion_forts_from_fort() {
        final SubLObject cs = rkf_precision_suggestor.$rkf_irrelevant_precision_suggestion_forts_from_fort_caching_state$.getGlobalValue();
        if (rkf_precision_suggestor.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 10243L)
    public static SubLObject remove_rkf_irrelevant_precision_suggestion_forts_from_fort(final SubLObject from_fort, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_precision_suggestor.$rkf_irrelevant_precision_suggestion_forts_from_fort_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(from_fort, domain_mt), (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 10243L)
    public static SubLObject rkf_irrelevant_precision_suggestion_forts_from_fort_internal(final SubLObject from_fort, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rkf_precision_suggestor.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            api_control_vars.$generate_readable_fi_results$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            ans = ask_utilities.ask_variable((SubLObject)rkf_precision_suggestor.$sym33$_IRREL, (SubLObject)ConsesLow.list(rkf_precision_suggestor.$const34$keIrrelevantPrecisionSuggestionFr, (SubLObject)rkf_precision_suggestor.$sym33$_IRREL, from_fort), domain_mt, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
        }
        finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 10243L)
    public static SubLObject rkf_irrelevant_precision_suggestion_forts_from_fort(final SubLObject from_fort, final SubLObject domain_mt) {
        SubLObject caching_state = rkf_precision_suggestor.$rkf_irrelevant_precision_suggestion_forts_from_fort_caching_state$.getGlobalValue();
        if (rkf_precision_suggestor.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_precision_suggestor.$sym32$RKF_IRRELEVANT_PRECISION_SUGGESTION_FORTS_FROM_FORT, (SubLObject)rkf_precision_suggestor.$sym35$_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORTS_FROM_FORT_CACHING_STAT, (SubLObject)rkf_precision_suggestor.NIL, (SubLObject)rkf_precision_suggestor.EQL, (SubLObject)rkf_precision_suggestor.TWO_INTEGER, (SubLObject)rkf_precision_suggestor.TEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(from_fort, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_precision_suggestor.NIL;
            collision = cdolist_list_var.first();
            while (rkf_precision_suggestor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (from_fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_precision_suggestor.NIL != cached_args && rkf_precision_suggestor.NIL == cached_args.rest() && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_irrelevant_precision_suggestion_forts_from_fort_internal(from_fort, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(from_fort, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 10590L)
    public static SubLObject rkf_raw_sentence_predicate_generalization_candidates(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(sentence);
        if (rkf_precision_suggestor.NIL != fort_types_interface.predicateP(predicate)) {
            final SubLObject candidates = rkf_raw_generalization_candidates(predicate, rkf_precision_suggestor.$const20$genlPreds, domain_mt);
            return candidates;
        }
        return (SubLObject)rkf_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 11131L)
    public static SubLObject rkf_sentence_predicate_generalization_candidates(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject candidates = rkf_raw_sentence_predicate_generalization_candidates(sentence, domain_mt);
        return rkf_relevance_utilities.rkf_filter_irrelevant_terms(candidates, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 11400L)
    public static SubLObject rkf_raw_sentence_predicate_specialization_candidates(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(sentence);
        if (rkf_precision_suggestor.NIL != fort_types_interface.predicateP(predicate)) {
            final SubLObject candidates = rkf_raw_specialization_candidates(predicate, rkf_precision_suggestor.$const20$genlPreds, domain_mt, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
            return candidates;
        }
        return (SubLObject)rkf_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 11925L)
    public static SubLObject rkf_sentence_predicate_specialization_candidates(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject candidates = rkf_raw_sentence_predicate_specialization_candidates(sentence, domain_mt);
        return rkf_relevance_utilities.rkf_filter_irrelevant_terms(candidates, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 12195L)
    public static SubLObject rkf_generalize(final SubLObject asent, SubLObject mt) {
        if (mt == rkf_precision_suggestor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_precision_suggestor.NIL == el_utilities.formula_arityE(asent, (SubLObject)rkf_precision_suggestor.TWO_INTEGER, (SubLObject)rkf_precision_suggestor.UNPROVIDED)) {
            return (SubLObject)rkf_precision_suggestor.NIL;
        }
        final SubLObject generalization_template = (SubLObject)ConsesLow.listS(cycl_utilities.atomic_sentence_predicate(asent), cycl_utilities.sentence_arg1(asent, (SubLObject)rkf_precision_suggestor.UNPROVIDED), (SubLObject)rkf_precision_suggestor.$list36);
        SubLObject generalizations = (SubLObject)rkf_precision_suggestor.NIL;
        final SubLObject _prev_bind_0 = control_vars.$cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$compute_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$unique_inference_result_bindings$.currentBinding(thread);
        final SubLObject _prev_bind_4 = abnormal.$abnormality_checking_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        final SubLObject _prev_bind_6 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_7 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_16 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            control_vars.$cache_inference_results$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            control_vars.$compute_inference_results$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            control_vars.$unique_inference_result_bindings$.bind((SubLObject)rkf_precision_suggestor.T, thread);
            abnormal.$abnormality_checking_enabled$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            api_control_vars.$generate_readable_fi_results$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            control_vars.$within_assert$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            wff_utilities.$check_arg_typesP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            at_vars.$at_check_arg_typesP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            wff_utilities.$check_var_typesP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            at_vars.$at_check_arg_formatP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            wff_vars.$validate_constantsP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)rkf_precision_suggestor.T, thread);
            generalizations = ask_utilities.ask_template((SubLObject)rkf_precision_suggestor.$sym37$_GEN, (SubLObject)ConsesLow.list(rkf_precision_suggestor.$const38$keGeneralizationSuggestion, asent, generalization_template), mt, (SubLObject)rkf_precision_suggestor.ONE_INTEGER, (SubLObject)rkf_precision_suggestor.NIL, (SubLObject)rkf_precision_suggestor.NIL, (SubLObject)rkf_precision_suggestor.NIL);
        }
        finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_16, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_15, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_14, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_13, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_12, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_11, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_10, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_8, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_7, thread);
            control_vars.$within_assert$.rebind(_prev_bind_6, thread);
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_5, thread);
            abnormal.$abnormality_checking_enabled$.rebind(_prev_bind_4, thread);
            control_vars.$unique_inference_result_bindings$.rebind(_prev_bind_3, thread);
            control_vars.$compute_inference_results$.rebind(_prev_bind_2, thread);
            control_vars.$cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        generalizations = rkf_relevance_utilities.rkf_filter_irrelevant_terms(generalizations, mt);
        generalizations = Sort.sort(generalizations, Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym39$GENLS_), (SubLObject)rkf_precision_suggestor.UNPROVIDED);
        generalizations = Sort.stable_sort(generalizations, Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym16$_), Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym19$GENERALITY_ESTIMATE));
        SubLObject answers = (SubLObject)rkf_precision_suggestor.NIL;
        SubLObject cdolist_list_var = generalizations;
        SubLObject generalization = (SubLObject)rkf_precision_suggestor.NIL;
        generalization = cdolist_list_var.first();
        while (rkf_precision_suggestor.NIL != cdolist_list_var) {
            answers = (SubLObject)ConsesLow.cons(conses_high.subst(generalization, (SubLObject)rkf_precision_suggestor.$sym37$_GEN, generalization_template, Symbols.symbol_function((SubLObject)rkf_precision_suggestor.EQUAL), (SubLObject)rkf_precision_suggestor.UNPROVIDED), answers);
            cdolist_list_var = cdolist_list_var.rest();
            generalization = cdolist_list_var.first();
        }
        answers = Sequences.nreverse(answers);
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 13831L)
    public static SubLObject rkf_specialize(final SubLObject asent, SubLObject mt) {
        if (mt == rkf_precision_suggestor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_precision_suggestor.NIL == el_utilities.formula_arityE(asent, (SubLObject)rkf_precision_suggestor.TWO_INTEGER, (SubLObject)rkf_precision_suggestor.UNPROVIDED)) {
            return (SubLObject)rkf_precision_suggestor.NIL;
        }
        final SubLObject specialization_template = (SubLObject)ConsesLow.listS(cycl_utilities.formula_operator(asent), cycl_utilities.formula_arg1(asent, (SubLObject)rkf_precision_suggestor.UNPROVIDED), (SubLObject)rkf_precision_suggestor.$list40);
        SubLObject specializations = (SubLObject)rkf_precision_suggestor.NIL;
        final SubLObject _prev_bind_0 = control_vars.$cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$compute_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$unique_inference_result_bindings$.currentBinding(thread);
        final SubLObject _prev_bind_4 = abnormal.$abnormality_checking_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        final SubLObject _prev_bind_6 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_7 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_16 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            control_vars.$cache_inference_results$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            control_vars.$compute_inference_results$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            control_vars.$unique_inference_result_bindings$.bind((SubLObject)rkf_precision_suggestor.T, thread);
            abnormal.$abnormality_checking_enabled$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            api_control_vars.$generate_readable_fi_results$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            control_vars.$within_assert$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            wff_utilities.$check_arg_typesP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            at_vars.$at_check_arg_typesP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            wff_utilities.$check_var_typesP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            at_vars.$at_check_arg_formatP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            wff_vars.$validate_constantsP$.bind((SubLObject)rkf_precision_suggestor.NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)rkf_precision_suggestor.T, thread);
            specializations = ask_utilities.ask_template((SubLObject)rkf_precision_suggestor.$sym41$_SPEC, (SubLObject)ConsesLow.list(rkf_precision_suggestor.$const42$kePrecisionSuggestion, asent, specialization_template), mt, (SubLObject)rkf_precision_suggestor.ONE_INTEGER, (SubLObject)rkf_precision_suggestor.NIL, (SubLObject)rkf_precision_suggestor.NIL, (SubLObject)rkf_precision_suggestor.NIL);
        }
        finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_16, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_15, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_14, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_13, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_12, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_11, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_10, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_8, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_7, thread);
            control_vars.$within_assert$.rebind(_prev_bind_6, thread);
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_5, thread);
            abnormal.$abnormality_checking_enabled$.rebind(_prev_bind_4, thread);
            control_vars.$unique_inference_result_bindings$.rebind(_prev_bind_3, thread);
            control_vars.$compute_inference_results$.rebind(_prev_bind_2, thread);
            control_vars.$cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        specializations = rkf_relevance_utilities.rkf_filter_irrelevant_terms(specializations, mt);
        specializations = Sort.sort(specializations, Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym39$GENLS_), (SubLObject)rkf_precision_suggestor.UNPROVIDED);
        specializations = Sort.stable_sort(specializations, Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym24$_), Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym19$GENERALITY_ESTIMATE));
        SubLObject answers = (SubLObject)rkf_precision_suggestor.NIL;
        SubLObject cdolist_list_var = specializations;
        SubLObject specialization = (SubLObject)rkf_precision_suggestor.NIL;
        specialization = cdolist_list_var.first();
        while (rkf_precision_suggestor.NIL != cdolist_list_var) {
            answers = (SubLObject)ConsesLow.cons(conses_high.subst(specialization, (SubLObject)rkf_precision_suggestor.$sym41$_SPEC, specialization_template, Symbols.symbol_function((SubLObject)rkf_precision_suggestor.EQUAL), (SubLObject)rkf_precision_suggestor.UNPROVIDED), answers);
            cdolist_list_var = cdolist_list_var.rest();
            specialization = cdolist_list_var.first();
        }
        answers = Sequences.nreverse(answers);
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 15839L)
    public static SubLObject rkf_transitivity_strengthening_candidates(final SubLObject trans_pred_formula, SubLObject inverseP, SubLObject mt) {
        if (inverseP == rkf_precision_suggestor.UNPROVIDED) {
            inverseP = (SubLObject)rkf_precision_suggestor.NIL;
        }
        if (mt == rkf_precision_suggestor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        SubLObject pred_sets = (SubLObject)rkf_precision_suggestor.NIL;
        SubLObject binding = (SubLObject)rkf_precision_suggestor.NIL;
        SubLObject trans_pred = (SubLObject)rkf_precision_suggestor.NIL;
        SubLObject arg1 = (SubLObject)rkf_precision_suggestor.NIL;
        SubLObject arg2 = (SubLObject)rkf_precision_suggestor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(trans_pred_formula, trans_pred_formula, (SubLObject)rkf_precision_suggestor.$list43);
        trans_pred = trans_pred_formula.first();
        SubLObject current = trans_pred_formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, trans_pred_formula, (SubLObject)rkf_precision_suggestor.$list43);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, trans_pred_formula, (SubLObject)rkf_precision_suggestor.$list43);
        arg2 = current.first();
        current = current.rest();
        if (rkf_precision_suggestor.NIL == current) {
            if (rkf_precision_suggestor.NIL != inverseP) {
                pred_sets = rkf_transitivity_strengthening_candidates_int(trans_pred, rkf_precision_suggestor.$const2$transitiveViaArgInverse, arg1, mt);
                binding = reader.bq_cons(arg1, arg2);
            }
            else {
                pred_sets = rkf_transitivity_strengthening_candidates_int(trans_pred, rkf_precision_suggestor.$const3$transitiveViaArg, arg2, mt);
                binding = reader.bq_cons(arg2, arg1);
            }
            SubLObject found_itP = (SubLObject)rkf_precision_suggestor.NIL;
            if (rkf_precision_suggestor.NIL == found_itP) {
                SubLObject csome_list_var = pred_sets;
                SubLObject pred_set = (SubLObject)rkf_precision_suggestor.NIL;
                pred_set = csome_list_var.first();
                while (rkf_precision_suggestor.NIL == found_itP && rkf_precision_suggestor.NIL != csome_list_var) {
                    SubLObject current_$7;
                    final SubLObject datum_$6 = current_$7 = pred_set;
                    SubLObject pred = (SubLObject)rkf_precision_suggestor.NIL;
                    SubLObject gaf_set = (SubLObject)rkf_precision_suggestor.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)rkf_precision_suggestor.$list44);
                    pred = current_$7.first();
                    current_$7 = (gaf_set = current_$7.rest());
                    if (pred.eql(trans_pred)) {
                        found_itP = (SubLObject)rkf_precision_suggestor.T;
                        final SubLObject new_set = set.new_set(Symbols.symbol_function((SubLObject)rkf_precision_suggestor.EQ), (SubLObject)rkf_precision_suggestor.UNPROVIDED);
                        final SubLObject set_contents_var = set.do_set_internal(gaf_set);
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject gaf;
                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_precision_suggestor.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_precision_suggestor.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            gaf = set_contents.do_set_contents_next(basis_object, state);
                            if (rkf_precision_suggestor.NIL != set_contents.do_set_contents_element_validP(state, gaf) && !trans_pred_formula.equal(assertions_high.gaf_formula(gaf))) {
                                set.set_add(gaf, new_set);
                            }
                        }
                        pred_sets = Sequences.remove(pred_set, pred_sets, Symbols.symbol_function((SubLObject)rkf_precision_suggestor.EQUAL), (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED);
                        if (rkf_precision_suggestor.NIL == set.empty_set_p(new_set)) {
                            pred_sets = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pred, new_set), pred_sets);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    pred_set = csome_list_var.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(trans_pred_formula, (SubLObject)rkf_precision_suggestor.$list43);
        }
        return (SubLObject)ConsesLow.list(binding, pred_sets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 17756L)
    public static SubLObject rkf_transitivity_strengthening_candidates_int(final SubLObject trans_pred, final SubLObject tva_pred, final SubLObject general, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rkf_precision_suggestor.NIL;
        final SubLObject tva_argnum = (SubLObject)rkf_precision_suggestor.TWO_INTEGER;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (rkf_precision_suggestor.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(trans_pred, tva_argnum, tva_pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(trans_pred, tva_argnum, tva_pred);
                SubLObject done_var = (SubLObject)rkf_precision_suggestor.NIL;
                final SubLObject token_var = (SubLObject)rkf_precision_suggestor.NIL;
                while (rkf_precision_suggestor.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (rkf_precision_suggestor.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)rkf_precision_suggestor.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rkf_precision_suggestor.$kw45$GAF, (SubLObject)rkf_precision_suggestor.$kw46$TRUE, (SubLObject)rkf_precision_suggestor.NIL);
                            SubLObject done_var_$8 = (SubLObject)rkf_precision_suggestor.NIL;
                            final SubLObject token_var_$9 = (SubLObject)rkf_precision_suggestor.NIL;
                            while (rkf_precision_suggestor.NIL == done_var_$8) {
                                final SubLObject tva_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
                                final SubLObject valid_$10 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$9.eql(tva_as));
                                if (rkf_precision_suggestor.NIL != valid_$10) {
                                    final SubLObject args = assertions_high.gaf_args(tva_as);
                                    final SubLObject pred = args.first();
                                    final SubLObject argnum = conses_high.third(args);
                                    final SubLObject pred_gafs = set.new_set(Symbols.symbol_function((SubLObject)rkf_precision_suggestor.EQ), (SubLObject)rkf_precision_suggestor.UNPROVIDED);
                                    if (rkf_precision_suggestor.NIL != rkf_pred_ok_for_transitivity_strengtheningP(pred, general, argnum, mt)) {
                                        final SubLObject pred_var_$11 = pred;
                                        if (rkf_precision_suggestor.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(general, argnum, pred_var_$11)) {
                                            final SubLObject iterator_var_$12 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(general, argnum, pred_var_$11);
                                            SubLObject done_var_$9 = (SubLObject)rkf_precision_suggestor.NIL;
                                            final SubLObject token_var_$10 = (SubLObject)rkf_precision_suggestor.NIL;
                                            while (rkf_precision_suggestor.NIL == done_var_$9) {
                                                final SubLObject final_index_spec_$15 = iteration.iteration_next_without_values_macro_helper(iterator_var_$12, token_var_$10);
                                                final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(final_index_spec_$15));
                                                if (rkf_precision_suggestor.NIL != valid_$11) {
                                                    SubLObject final_index_iterator_$17 = (SubLObject)rkf_precision_suggestor.NIL;
                                                    try {
                                                        final_index_iterator_$17 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$15, (SubLObject)rkf_precision_suggestor.$kw45$GAF, (SubLObject)rkf_precision_suggestor.$kw46$TRUE, (SubLObject)rkf_precision_suggestor.NIL);
                                                        SubLObject done_var_$10 = (SubLObject)rkf_precision_suggestor.NIL;
                                                        final SubLObject token_var_$11 = (SubLObject)rkf_precision_suggestor.NIL;
                                                        while (rkf_precision_suggestor.NIL == done_var_$10) {
                                                            final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$17, token_var_$11);
                                                            final SubLObject valid_$12 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$11.eql(as));
                                                            if (rkf_precision_suggestor.NIL != valid_$12 && rkf_precision_suggestor.NIL != assertions_high.asserted_assertionP(as) && rkf_precision_suggestor.NIL == rkf_relevance_utilities.rkf_irrelevant_formula(assertions_high.gaf_formula(as), mt)) {
                                                                set.set_add(as, pred_gafs);
                                                            }
                                                            done_var_$10 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_precision_suggestor.NIL == valid_$12);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_precision_suggestor.T, thread);
                                                            final SubLObject _values = Values.getValuesAsVector();
                                                            if (rkf_precision_suggestor.NIL != final_index_iterator_$17) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$17);
                                                            }
                                                            Values.restoreValuesFromVector(_values);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                                        }
                                                    }
                                                }
                                                done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_precision_suggestor.NIL == valid_$11);
                                            }
                                        }
                                        if (rkf_precision_suggestor.NIL == set.empty_set_p(pred_gafs)) {
                                            ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pred, pred_gafs), ans);
                                        }
                                    }
                                }
                                done_var_$8 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_precision_suggestor.NIL == valid_$10);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_precision_suggestor.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (rkf_precision_suggestor.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(rkf_precision_suggestor.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 18658L)
    public static SubLObject rkf_pred_ok_for_transitivity_strengtheningP(final SubLObject pred, final SubLObject arg, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing.num_gaf_arg_index(arg, argnum, pred, (SubLObject)rkf_precision_suggestor.UNPROVIDED).numLE(rkf_precision_suggestor.$rkf_transitive_strengthener_max$.getDynamicValue(thread)) && (rkf_precision_suggestor.NIL != isa.isaP(pred, rkf_precision_suggestor.$const47$RuleMacroPredicate, mt, (SubLObject)rkf_precision_suggestor.UNPROVIDED) || rkf_precision_suggestor.NIL != rkf_pure_type_level_predP(pred, mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 18991L)
    public static SubLObject rkf_pure_type_level_predP(final SubLObject pred, final SubLObject mt) {
        final SubLObject v_arity = arity.arity(pred);
        SubLObject okP = (SubLObject)rkf_precision_suggestor.NIL;
        if (v_arity.isInteger()) {
            SubLObject badP = (SubLObject)rkf_precision_suggestor.NIL;
            if (rkf_precision_suggestor.NIL == badP) {
                SubLObject end_var;
                SubLObject argnum;
                for (end_var = number_utilities.f_1X(v_arity), argnum = (SubLObject)rkf_precision_suggestor.NIL, argnum = (SubLObject)rkf_precision_suggestor.ONE_INTEGER; rkf_precision_suggestor.NIL == badP && !argnum.numGE(end_var); argnum = number_utilities.f_1X(argnum)) {
                    if (rkf_precision_suggestor.NIL == kb_accessors.argn_genl(pred, argnum, mt) && rkf_precision_suggestor.NIL == conses_high.member(rkf_precision_suggestor.$const48$Collection, kb_accessors.argn_isa(pred, argnum, mt), (SubLObject)rkf_precision_suggestor.UNPROVIDED, (SubLObject)rkf_precision_suggestor.UNPROVIDED)) {
                        badP = (SubLObject)rkf_precision_suggestor.T;
                    }
                }
            }
            if (rkf_precision_suggestor.NIL == badP) {
                okP = (SubLObject)rkf_precision_suggestor.T;
            }
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-precision-suggestor.lisp", position = 19429L)
    public static SubLObject rkf_get_typed_specializations_for_collection(final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template = (SubLObject)ConsesLow.list((SubLObject)rkf_precision_suggestor.$sym41$_SPEC);
        final SubLObject sentence = (SubLObject)ConsesLow.list(rkf_precision_suggestor.$const10$and, (SubLObject)ConsesLow.list(rkf_precision_suggestor.$const49$typeGenls, (SubLObject)rkf_precision_suggestor.$sym41$_SPEC, collection), (SubLObject)rkf_precision_suggestor.$list50, (SubLObject)ConsesLow.list(rkf_precision_suggestor.$const51$unknownSentence, (SubLObject)ConsesLow.list(rkf_precision_suggestor.$const52$relationAllInstance, rkf_precision_suggestor.$const34$keIrrelevantPrecisionSuggestionFr, (SubLObject)rkf_precision_suggestor.$sym41$_SPEC, collection)), (SubLObject)ConsesLow.list(rkf_precision_suggestor.$const51$unknownSentence, (SubLObject)ConsesLow.list(rkf_precision_suggestor.$const53$thereExists, (SubLObject)rkf_precision_suggestor.$sym54$_COLTYPE2, (SubLObject)ConsesLow.listS(rkf_precision_suggestor.$const10$and, (SubLObject)ConsesLow.list(rkf_precision_suggestor.$const49$typeGenls, (SubLObject)rkf_precision_suggestor.$sym54$_COLTYPE2, collection), (SubLObject)rkf_precision_suggestor.$list55))));
        SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters((SubLObject)rkf_precision_suggestor.ZERO_INTEGER, (SubLObject)rkf_precision_suggestor.NIL, (SubLObject)rkf_precision_suggestor.NIL, (SubLObject)rkf_precision_suggestor.NIL);
        SubLObject results = (SubLObject)rkf_precision_suggestor.NIL;
        query_properties = conses_high.putf(query_properties, (SubLObject)rkf_precision_suggestor.$kw56$RESULT_UNIQUENESS, (SubLObject)rkf_precision_suggestor.$kw57$BINDINGS);
        query_properties = conses_high.putf(query_properties, (SubLObject)rkf_precision_suggestor.$kw58$RETURN, (SubLObject)ConsesLow.list((SubLObject)rkf_precision_suggestor.$kw59$TEMPLATE, template));
        query_properties = conses_high.putf(query_properties, (SubLObject)rkf_precision_suggestor.$kw60$PRODUCTIVITY_LIMIT, (SubLObject)rkf_precision_suggestor.$kw61$POSITIVE_INFINITY);
        query_properties = conses_high.putf(query_properties, (SubLObject)rkf_precision_suggestor.$kw62$ALLOWED_MODULES, (SubLObject)rkf_precision_suggestor.$list63);
        thread.resetMultipleValues();
        final SubLObject query_results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        final SubLObject suspend_status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = query_results;
        SubLObject query_result = (SubLObject)rkf_precision_suggestor.NIL;
        query_result = cdolist_list_var.first();
        while (rkf_precision_suggestor.NIL != cdolist_list_var) {
            final SubLObject type_spec = query_result.first();
            if (rkf_precision_suggestor.NIL == rkf_relevance_utilities.rkf_irrelevant_term(type_spec, mt)) {
                results = (SubLObject)ConsesLow.cons(type_spec, results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_result = cdolist_list_var.first();
        }
        return Sort.sort(results, Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym24$_), Symbols.symbol_function((SubLObject)rkf_precision_suggestor.$sym64$NUM_INDEX));
    }
    
    public static SubLObject declare_rkf_precision_suggestor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_raw_precisify_arg", "RKF-RAW-PRECISIFY-ARG", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_sentence_arg_precisification_options", "RKF-SENTENCE-ARG-PRECISIFICATION-OPTIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_sentence_arg_generalization_options", "RKF-SENTENCE-ARG-GENERALIZATION-OPTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_sentence_arg_specialization_options", "RKF-SENTENCE-ARG-SPECIALIZATION-OPTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "gen_template_recipe_argP", "GEN-TEMPLATE-RECIPE-ARG?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "gen_template_recipe_specialization_options", "GEN-TEMPLATE-RECIPE-SPECIALIZATION-OPTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_sentence_arg_tva_options", "RKF-SENTENCE-ARG-TVA-OPTIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_raw_generalization_candidates", "RKF-RAW-GENERALIZATION-CANDIDATES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_isa_of_type_collectionP", "RKF-ISA-OF-TYPE-COLLECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_raw_specialization_candidates", "RKF-RAW-SPECIALIZATION-CANDIDATES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_remove_subsumed", "RKF-REMOVE-SUBSUMED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_remove_subsumed_helper_internal", "RKF-REMOVE-SUBSUMED-HELPER-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_remove_subsumed_helper", "RKF-REMOVE-SUBSUMED-HELPER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "clear_rkf_irrelevant_precision_suggestion_forts_from_fort", "CLEAR-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "remove_rkf_irrelevant_precision_suggestion_forts_from_fort", "REMOVE-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_irrelevant_precision_suggestion_forts_from_fort_internal", "RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_irrelevant_precision_suggestion_forts_from_fort", "RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_raw_sentence_predicate_generalization_candidates", "RKF-RAW-SENTENCE-PREDICATE-GENERALIZATION-CANDIDATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_sentence_predicate_generalization_candidates", "RKF-SENTENCE-PREDICATE-GENERALIZATION-CANDIDATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_raw_sentence_predicate_specialization_candidates", "RKF-RAW-SENTENCE-PREDICATE-SPECIALIZATION-CANDIDATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_sentence_predicate_specialization_candidates", "RKF-SENTENCE-PREDICATE-SPECIALIZATION-CANDIDATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_generalize", "RKF-GENERALIZE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_specialize", "RKF-SPECIALIZE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_transitivity_strengthening_candidates", "RKF-TRANSITIVITY-STRENGTHENING-CANDIDATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_transitivity_strengthening_candidates_int", "RKF-TRANSITIVITY-STRENGTHENING-CANDIDATES-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_pred_ok_for_transitivity_strengtheningP", "RKF-PRED-OK-FOR-TRANSITIVITY-STRENGTHENING?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_pure_type_level_predP", "RKF-PURE-TYPE-LEVEL-PRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_precision_suggestor", "rkf_get_typed_specializations_for_collection", "RKF-GET-TYPED-SPECIALIZATIONS-FOR-COLLECTION", 2, 0, false);
        return (SubLObject)rkf_precision_suggestor.NIL;
    }
    
    public static SubLObject init_rkf_precision_suggestor_file() {
        rkf_precision_suggestor.$rkf_raw_specialization_type_col$ = SubLFiles.defparameter("*RKF-RAW-SPECIALIZATION-TYPE-COL*", (SubLObject)rkf_precision_suggestor.NIL);
        rkf_precision_suggestor.$rkf_irrelevant_precision_suggestion_forts_from_fort_caching_state$ = SubLFiles.deflexical("*RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT-CACHING-STATE*", (SubLObject)rkf_precision_suggestor.NIL);
        rkf_precision_suggestor.$rkf_transitive_strengthener_max$ = SubLFiles.defparameter("*RKF-TRANSITIVE-STRENGTHENER-MAX*", (SubLObject)rkf_precision_suggestor.TEN_INTEGER);
        return (SubLObject)rkf_precision_suggestor.NIL;
    }
    
    public static SubLObject setup_rkf_precision_suggestor_file() {
        memoization_state.note_memoized_function((SubLObject)rkf_precision_suggestor.$sym31$RKF_REMOVE_SUBSUMED_HELPER);
        memoization_state.note_globally_cached_function((SubLObject)rkf_precision_suggestor.$sym32$RKF_IRRELEVANT_PRECISION_SUGGESTION_FORTS_FROM_FORT);
        return (SubLObject)rkf_precision_suggestor.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_precision_suggestor_file();
    }
    
    public void initializeVariables() {
        init_rkf_precision_suggestor_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_precision_suggestor_file();
    }
    
    static {
        me = (SubLFile)new rkf_precision_suggestor();
        rkf_precision_suggestor.$rkf_raw_specialization_type_col$ = null;
        rkf_precision_suggestor.$rkf_irrelevant_precision_suggestion_forts_from_fort_caching_state$ = null;
        rkf_precision_suggestor.$rkf_transitive_strengthener_max$ = null;
        $const0$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $list1 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")));
        $const2$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $const3$transitiveViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $const4$NLTemplateGenerationPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLTemplateGenerationPredicate"));
        $const5$GenTemplateRecipe = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenTemplateRecipe"));
        $sym6$SPEC_ = SubLObjectFactory.makeSymbol("SPEC?");
        $list7 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deeperGenTemplateRecipe")));
        $const8$deeperGenTemplateRecipe = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deeperGenTemplateRecipe"));
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")));
        $const10$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $sym11$_PRED = SubLObjectFactory.makeSymbol("?PRED");
        $sym12$_ARG = SubLObjectFactory.makeSymbol("?ARG");
        $const13$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $const14$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ARG"), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"));
        $sym16$_ = SubLObjectFactory.makeSymbol("<");
        $sym17$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $const18$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym19$GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE");
        $const20$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $sym21$SPEC_PREDICATE_ = SubLObjectFactory.makeSymbol("SPEC-PREDICATE?");
        $sym22$GENL_ = SubLObjectFactory.makeSymbol("GENL?");
        $sym23$RKF_ISA_OF_TYPE_COLLECTION_ = SubLObjectFactory.makeSymbol("RKF-ISA-OF-TYPE-COLLECTION?");
        $sym24$_ = SubLObjectFactory.makeSymbol(">");
        $sym25$GENL_PREDICATE_ = SubLObjectFactory.makeSymbol("GENL-PREDICATE?");
        $sym26$ALL_SPECS = SubLObjectFactory.makeSymbol("ALL-SPECS");
        $sym27$ALL_GENLS = SubLObjectFactory.makeSymbol("ALL-GENLS");
        $sym28$ALL_SPEC_PREDS = SubLObjectFactory.makeSymbol("ALL-SPEC-PREDS");
        $sym29$ALL_GENL_PREDS = SubLObjectFactory.makeSymbol("ALL-GENL-PREDS");
        $list30 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NOW"), (SubLObject)SubLObjectFactory.makeSymbol("LATER"));
        $sym31$RKF_REMOVE_SUBSUMED_HELPER = SubLObjectFactory.makeSymbol("RKF-REMOVE-SUBSUMED-HELPER");
        $sym32$RKF_IRRELEVANT_PRECISION_SUGGESTION_FORTS_FROM_FORT = SubLObjectFactory.makeSymbol("RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT");
        $sym33$_IRREL = SubLObjectFactory.makeSymbol("?IRREL");
        $const34$keIrrelevantPrecisionSuggestionFr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keIrrelevantPrecisionSuggestionFrom"));
        $sym35$_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORTS_FROM_FORT_CACHING_STAT = SubLObjectFactory.makeSymbol("*RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT-CACHING-STATE*");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?GEN"));
        $sym37$_GEN = SubLObjectFactory.makeSymbol("?GEN");
        $const38$keGeneralizationSuggestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keGeneralizationSuggestion"));
        $sym39$GENLS_ = SubLObjectFactory.makeSymbol("GENLS?");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SPEC"));
        $sym41$_SPEC = SubLObjectFactory.makeSymbol("?SPEC");
        $const42$kePrecisionSuggestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kePrecisionSuggestion"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $list44 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-SET"));
        $kw45$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw46$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const47$RuleMacroPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RuleMacroPredicate"));
        $const48$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $const49$typeGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeGenls"));
        $list50 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keIrrelevantTypeGenls")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC")));
        $const51$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $const52$relationAllInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $const53$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym54$_COLTYPE2 = SubLObjectFactory.makeSymbol("?COLTYPE2");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("?COLTYPE2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("?COLTYPE2")));
        $kw56$RESULT_UNIQUENESS = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $kw57$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw58$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw59$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $kw60$PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $kw61$POSITIVE_INFINITY = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
        $kw62$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-TVA-UNIFY"));
        $sym64$NUM_INDEX = SubLObjectFactory.makeSymbol("NUM-INDEX");
    }
}

/*

	Total time: 315 ms
	
*/