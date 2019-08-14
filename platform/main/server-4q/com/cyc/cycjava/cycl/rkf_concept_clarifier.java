/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.api_control_vars.$generate_readable_fi_results$;
import static com.cyc.cycjava.cycl.at_vars.$at_check_arg_formatP$;
import static com.cyc.cycjava.cycl.at_vars.$at_check_arg_typesP$;
import static com.cyc.cycjava.cycl.at_vars.$at_check_relator_constraintsP$;
import static com.cyc.cycjava.cycl.cardinality_estimates.sort_by_generality_estimate;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$cache_inference_results$;
import static com.cyc.cycjava.cycl.control_vars.$compute_inference_results$;
import static com.cyc.cycjava.cycl.control_vars.$unique_inference_result_bindings$;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.czer_vars.$simplify_literalP$;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.isa.all_isa;
import static com.cyc.cycjava.cycl.isa.isaP;
import static com.cyc.cycjava.cycl.isa.min_isa;
import static com.cyc.cycjava.cycl.list_utilities.first_n;
import static com.cyc.cycjava.cycl.list_utilities.lengthGE;
import static com.cyc.cycjava.cycl.list_utilities.randomize_list;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mts$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mtP;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list;
import static com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_validate;
import static com.cyc.cycjava.cycl.rkf_ontology_utilities.rkf_all_genls;
import static com.cyc.cycjava.cycl.set.new_set;
import static com.cyc.cycjava.cycl.set.set_add;
import static com.cyc.cycjava.cycl.set.set_memberP;
import static com.cyc.cycjava.cycl.system_parameters.$suspend_sbhl_type_checkingP$;
import static com.cyc.cycjava.cycl.wff_utilities.$check_arg_typesP$;
import static com.cyc.cycjava.cycl.wff_utilities.$check_var_typesP$;
import static com.cyc.cycjava.cycl.wff_utilities.$check_wff_coherenceP$;
import static com.cyc.cycjava.cycl.wff_utilities.$check_wff_semanticsP$;
import static com.cyc.cycjava.cycl.wff_vars.$validate_constantsP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-CONCEPT-CLARIFIER
 * source file: /cyc/top/cycl/rkf-concept-clarifier.lisp
 * created:     2019/07/03 17:37:59
 */
public final class rkf_concept_clarifier extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_concept_clarifier();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_concept_clarifier";


    // deflexical
    // Definitions
    /**
     * The greatest number of clarifying sentences that rkf-clarifying-sentences
     * will ever return.
     */
    @LispMethod(comment = "The greatest number of clarifying sentences that rkf-clarifying-sentences\r\nwill ever return.\ndeflexical\nThe greatest number of clarifying sentences that rkf-clarifying-sentences\nwill ever return.")
    private static final SubLSymbol $max_rkf_clarifying_sentences$ = makeSymbol("*MAX-RKF-CLARIFYING-SENTENCES*");







    static private final SubLList $list6 = list(makeSymbol("?SENT"));

    static private final SubLList $list7 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), TWO_INTEGER);

    static private final SubLList $list8 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLList $list10 = list(reader_make_constant_shell("geographicalSubRegionsOfUSState"), reader_make_constant_shell("geographicalSubRegionsOfCountry"), reader_make_constant_shell("geographicalSubRegionsOfContinent"), reader_make_constant_shell("geographicalSubRegionsOfBodyOfWater"));

    private static final SubLSymbol $GENLS_FOR_COLLECTIONS = makeKeyword("GENLS-FOR-COLLECTIONS");

    private static final SubLSymbol RKF_SALIENT_GENERALIZATIONS = makeSymbol("RKF-SALIENT-GENERALIZATIONS");

    private static final SubLSymbol $sym14$CLOSED_ = makeSymbol("CLOSED?");

    private static final SubLSymbol $sym15$GENL_IN_ANY_MT_ = makeSymbol("GENL-IN-ANY-MT?");

    private static final SubLSymbol $rkf_salient_generalizations_caching_state$ = makeSymbol("*RKF-SALIENT-GENERALIZATIONS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_RKF_SALIENT_GENERALIZATIONS = makeSymbol("CLEAR-RKF-SALIENT-GENERALIZATIONS");



    static private final SubLList $list20 = list(makeSymbol("?GENLS"));

    static private final SubLList $list21 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?GENLS")), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));



    private static final SubLList $list24 = list(makeSymbol("?ISA"));

    private static final SubLList $list25 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?ISA")), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLString $str31$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str36$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str37$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str38$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str39$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");





    private static final SubLSymbol $sym42$_PATHNAME = makeSymbol("?PATHNAME");



    private static final SubLSymbol $sym44$_URL = makeSymbol("?URL");



    private static final SubLList $list46 = list(makeSymbol("RMP"), makeSymbol("BINPRED"));

    private static final SubLSymbol $sym47$_RMP_ARGNUM = makeSymbol("?RMP-ARGNUM");









    private static final SubLSymbol $sym52$SPEC_ = makeSymbol("SPEC?");

    private static final SubLString $$$QuantifiedBinaryPredicateFn = makeString("QuantifiedBinaryPredicateFn");

    /**
     * Return a list of at most MAX-COUNT sentences about TERM that are useful
     * in clarifying its intended meaning in DOMAIN-MT.  If ALLOW-REDUNDANT is non-nil, some of the sentences might be
     * entailed by others in the return.  If MAX-COUNT is :ALL, all sentences will be returned
     */
    @LispMethod(comment = "Return a list of at most MAX-COUNT sentences about TERM that are useful\r\nin clarifying its intended meaning in DOMAIN-MT.  If ALLOW-REDUNDANT is non-nil, some of the sentences might be\r\nentailed by others in the return.  If MAX-COUNT is :ALL, all sentences will be returned\nReturn a list of at most MAX-COUNT sentences about TERM that are useful\nin clarifying its intended meaning in DOMAIN-MT.  If ALLOW-REDUNDANT is non-nil, some of the sentences might be\nentailed by others in the return.  If MAX-COUNT is :ALL, all sentences will be returned")
    public static final SubLObject rkf_clarifying_sentences_alt(SubLObject v_term, SubLObject domain_mt, SubLObject max_count, SubLObject allow_redundant, SubLObject strict_clarification_checkingP) {
        if (max_count == UNPROVIDED) {
            max_count = $max_rkf_clarifying_sentences$.getGlobalValue();
        }
        if (allow_redundant == UNPROVIDED) {
            allow_redundant = NIL;
        }
        if (strict_clarification_checkingP == UNPROVIDED) {
            strict_clarification_checkingP = NIL;
        }
        {
            SubLObject raw_term = parsing_utilities.strip_nl_tags(v_term, UNPROVIDED);
            SubLObject collectionP = fort_types_interface.isa_collectionP(raw_term, UNPROVIDED);
            SubLObject isas_or_genlsP = (NIL != collectionP) ? ((SubLObject) ($GENLS)) : $ISAS;
            SubLObject generalizations = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_salient_generalizations(raw_term, domain_mt, T, allow_redundant, max_count, strict_clarification_checkingP, isas_or_genlsP);
            SubLObject count = ZERO_INTEGER;
            SubLObject enoughP = NIL;
            SubLObject clarifying_sentences = NIL;
            if (NIL == enoughP) {
                {
                    SubLObject csome_list_var = generalizations;
                    SubLObject generalization = NIL;
                    for (generalization = csome_list_var.first(); !((NIL != enoughP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , generalization = csome_list_var.first()) {
                        {
                            SubLObject pred = (NIL != collectionP) ? ((SubLObject) ($$genls)) : $$isa;
                            clarifying_sentences = cons(make_binary_formula(pred, raw_term, generalization), clarifying_sentences);
                            count = add(count, ONE_INTEGER);
                            if (max_count.isNumber() && count.numGE(max_count)) {
                                enoughP = T;
                            }
                        }
                    }
                }
            }
            if ((NIL != collectionP) && (NIL == enoughP)) {
                {
                    SubLObject number_left = (max_count.isNumber()) ? ((SubLObject) (subtract(max_count, count))) : max_count;
                    SubLObject isas = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_salient_generalizations(raw_term, domain_mt, T, allow_redundant, number_left, strict_clarification_checkingP, $ISAS);
                    if (NIL == enoughP) {
                        {
                            SubLObject csome_list_var = isas;
                            SubLObject generalization = NIL;
                            for (generalization = csome_list_var.first(); !((NIL != enoughP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , generalization = csome_list_var.first()) {
                                clarifying_sentences = cons(make_binary_formula($$isa, raw_term, generalization), clarifying_sentences);
                                count = add(count, ONE_INTEGER);
                                if (max_count.isNumber() && count.numGE(max_count)) {
                                    enoughP = T;
                                }
                            }
                        }
                    }
                }
            }
            if ((NIL != forts.fort_p(raw_term)) && (NIL != fort_types_interface.predicateP(raw_term))) {
                {
                    SubLObject arg_type_summary = rkf_concept_communicator.rkf_arg_type_summary_cycl_for_pred(raw_term, domain_mt, $ALL);
                    if (NIL != el_formula_p(arg_type_summary)) {
                        clarifying_sentences = cons(arg_type_summary, clarifying_sentences);
                    }
                }
            }
            return nreverse(clarifying_sentences);
        }
    }

    /**
     * Return a list of at most MAX-COUNT sentences about TERM that are useful
     * in clarifying its intended meaning in DOMAIN-MT.  If ALLOW-REDUNDANT is non-nil, some of the sentences might be
     * entailed by others in the return.  If MAX-COUNT is :ALL, all sentences will be returned
     */
    @LispMethod(comment = "Return a list of at most MAX-COUNT sentences about TERM that are useful\r\nin clarifying its intended meaning in DOMAIN-MT.  If ALLOW-REDUNDANT is non-nil, some of the sentences might be\r\nentailed by others in the return.  If MAX-COUNT is :ALL, all sentences will be returned\nReturn a list of at most MAX-COUNT sentences about TERM that are useful\nin clarifying its intended meaning in DOMAIN-MT.  If ALLOW-REDUNDANT is non-nil, some of the sentences might be\nentailed by others in the return.  If MAX-COUNT is :ALL, all sentences will be returned")
    public static SubLObject rkf_clarifying_sentences(final SubLObject v_term, final SubLObject domain_mt, SubLObject max_count, SubLObject allow_redundant, SubLObject strict_clarification_checkingP) {
        if (max_count == UNPROVIDED) {
            max_count = $max_rkf_clarifying_sentences$.getGlobalValue();
        }
        if (allow_redundant == UNPROVIDED) {
            allow_redundant = NIL;
        }
        if (strict_clarification_checkingP == UNPROVIDED) {
            strict_clarification_checkingP = NIL;
        }
        final SubLObject raw_term = parsing_utilities.strip_nl_tags(v_term, UNPROVIDED);
        final SubLObject collectionP = fort_types_interface.isa_collectionP(raw_term, UNPROVIDED);
        final SubLObject isas_or_genlsP = (NIL != collectionP) ? $GENLS : $ISAS;
        final SubLObject generalizations = rkf_salient_generalizations(raw_term, domain_mt, T, allow_redundant, max_count, strict_clarification_checkingP, isas_or_genlsP);
        SubLObject count = ZERO_INTEGER;
        SubLObject enoughP = NIL;
        SubLObject clarifying_sentences = NIL;
        if (NIL == enoughP) {
            SubLObject csome_list_var = generalizations;
            SubLObject generalization = NIL;
            generalization = csome_list_var.first();
            while ((NIL == enoughP) && (NIL != csome_list_var)) {
                final SubLObject pred = (NIL != collectionP) ? $$genls : $$isa;
                clarifying_sentences = cons(make_binary_formula(pred, raw_term, generalization), clarifying_sentences);
                count = add(count, ONE_INTEGER);
                if (max_count.isNumber() && count.numGE(max_count)) {
                    enoughP = T;
                }
                csome_list_var = csome_list_var.rest();
                generalization = csome_list_var.first();
            } 
        }
        if ((NIL != collectionP) && (NIL == enoughP)) {
            final SubLObject number_left = (max_count.isNumber()) ? subtract(max_count, count) : max_count;
            final SubLObject isas = rkf_salient_generalizations(raw_term, domain_mt, T, allow_redundant, number_left, strict_clarification_checkingP, $ISAS);
            if (NIL == enoughP) {
                SubLObject csome_list_var2 = isas;
                SubLObject generalization2 = NIL;
                generalization2 = csome_list_var2.first();
                while ((NIL == enoughP) && (NIL != csome_list_var2)) {
                    clarifying_sentences = cons(make_binary_formula($$isa, raw_term, generalization2), clarifying_sentences);
                    count = add(count, ONE_INTEGER);
                    if (max_count.isNumber() && count.numGE(max_count)) {
                        enoughP = T;
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    generalization2 = csome_list_var2.first();
                } 
            }
        }
        if ((NIL != forts.fort_p(raw_term)) && (NIL != fort_types_interface.predicateP(raw_term))) {
            final SubLObject arg_type_summary = rkf_concept_communicator.rkf_arg_type_summary_cycl_for_pred(raw_term, domain_mt, $ALL);
            if (NIL != el_formula_p(arg_type_summary)) {
                clarifying_sentences = cons(arg_type_summary, clarifying_sentences);
            }
        }
        return nreverse(clarifying_sentences);
    }

    public static final SubLObject rkf_interesting_clarifying_sentences_alt(SubLObject v_term, SubLObject domain_mt, SubLObject max_count, SubLObject allow_redundant, SubLObject strict_clarification_checkingP) {
        if (max_count == UNPROVIDED) {
            max_count = $max_rkf_clarifying_sentences$.getGlobalValue();
        }
        if (allow_redundant == UNPROVIDED) {
            allow_redundant = NIL;
        }
        if (strict_clarification_checkingP == UNPROVIDED) {
            strict_clarification_checkingP = NIL;
        }
        {
            SubLObject raw_term = parsing_utilities.strip_nl_tags(v_term, UNPROVIDED);
            SubLObject interesting_sentences = inference_kernel.new_cyc_query(listS($$interestingSentence, raw_term, $list_alt6), domain_mt, $list_alt7);
            return com.cyc.cycjava.cycl.rkf_concept_clarifier.separate_isa_or_genls_sentences_from_inference_answer(interesting_sentences);
        }
    }

    public static SubLObject rkf_interesting_clarifying_sentences(final SubLObject v_term, final SubLObject domain_mt, SubLObject max_count, SubLObject allow_redundant, SubLObject strict_clarification_checkingP) {
        if (max_count == UNPROVIDED) {
            max_count = $max_rkf_clarifying_sentences$.getGlobalValue();
        }
        if (allow_redundant == UNPROVIDED) {
            allow_redundant = NIL;
        }
        if (strict_clarification_checkingP == UNPROVIDED) {
            strict_clarification_checkingP = NIL;
        }
        final SubLObject raw_term = parsing_utilities.strip_nl_tags(v_term, UNPROVIDED);
        final SubLObject interesting_sentences = inference_kernel.new_cyc_query(listS($$interestingSentence, raw_term, $list6), domain_mt, $list7);
        return separate_isa_or_genls_sentences_from_inference_answer(interesting_sentences);
    }

    public static final SubLObject separate_isa_or_genls_sentences_from_inference_answer_alt(SubLObject v_answer) {
        {
            SubLObject isa_genls_sentences = NIL;
            SubLObject other_sentences = NIL;
            SubLObject cdolist_list_var = v_answer;
            SubLObject binding_set = NIL;
            for (binding_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_set = cdolist_list_var.first()) {
                {
                    SubLObject cycl = binding_set.first().rest();
                    if (NIL != member(cycl_utilities.formula_operator(cycl), $list_alt8, EQ, UNPROVIDED)) {
                        isa_genls_sentences = cons(cycl, isa_genls_sentences);
                    } else {
                        other_sentences = cons(cycl, other_sentences);
                    }
                }
            }
            return values(isa_genls_sentences, other_sentences);
        }
    }

    public static SubLObject separate_isa_or_genls_sentences_from_inference_answer(final SubLObject v_answer) {
        SubLObject isa_genls_sentences = NIL;
        SubLObject other_sentences = NIL;
        SubLObject cdolist_list_var = v_answer;
        SubLObject binding_set = NIL;
        binding_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cycl = binding_set.first().rest();
            if (NIL != member(cycl_utilities.formula_operator(cycl), $list8, EQ, UNPROVIDED)) {
                isa_genls_sentences = cons(cycl, isa_genls_sentences);
            } else {
                other_sentences = cons(cycl, other_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        } 
        return values(isa_genls_sentences, other_sentences);
    }

    /**
     * Return a list of sentences about TERM that are useful in distinguishing
     * its intended meaning from amongst TERMS within DOMAIN-MT.
     */
    @LispMethod(comment = "Return a list of sentences about TERM that are useful in distinguishing\r\nits intended meaning from amongst TERMS within DOMAIN-MT.\nReturn a list of sentences about TERM that are useful in distinguishing\nits intended meaning from amongst TERMS within DOMAIN-MT.")
    public static final SubLObject rkf_terms_distinguishing_sentences_alt(SubLObject terms, SubLObject domain_mt) {
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject clarifying_sentences = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_clarifying_sentences(v_term, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject distinguishing_sentence = clarifying_sentences.first();
                    v_answer = cons(list(v_term, distinguishing_sentence), v_answer);
                }
            }
            return nreverse(v_answer);
        }
    }

    /**
     * Return a list of sentences about TERM that are useful in distinguishing
     * its intended meaning from amongst TERMS within DOMAIN-MT.
     */
    @LispMethod(comment = "Return a list of sentences about TERM that are useful in distinguishing\r\nits intended meaning from amongst TERMS within DOMAIN-MT.\nReturn a list of sentences about TERM that are useful in distinguishing\nits intended meaning from amongst TERMS within DOMAIN-MT.")
    public static SubLObject rkf_terms_distinguishing_sentences(final SubLObject terms, final SubLObject domain_mt) {
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject clarifying_sentences = rkf_clarifying_sentences(v_term, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject distinguishing_sentence = clarifying_sentences.first();
            v_answer = cons(list(v_term, distinguishing_sentence), v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(v_answer);
    }

    /**
     * Return REGION (a list of regions) in which SUB-REGION is located.
     * Predicates in the following order are used to determine REGION:
     * 1. #$geographicalSubRegionsOfUSState
     * 2. #$geographicalSubRegionsOfCountry
     * 3. #$geographicalSubRegionsOfContinent
     * 4. #$geographicalSubRegionsOfBodyOfWater
     *
     * @unknown (rkf-region-clarification #$CityOfAustinTX #$InferencePSC)
     * @unknown shah
     * @unknown 2004-08-12
     * @unknown shah 2004-08-12
     */
    @LispMethod(comment = "Return REGION (a list of regions) in which SUB-REGION is located.\r\nPredicates in the following order are used to determine REGION:\r\n1. #$geographicalSubRegionsOfUSState\r\n2. #$geographicalSubRegionsOfCountry\r\n3. #$geographicalSubRegionsOfContinent\r\n4. #$geographicalSubRegionsOfBodyOfWater\r\n\r\n@unknown (rkf-region-clarification #$CityOfAustinTX #$InferencePSC)\r\n@unknown shah\r\n@unknown 2004-08-12\r\n@unknown shah 2004-08-12\nReturn REGION (a list of regions) in which SUB-REGION is located.\nPredicates in the following order are used to determine REGION:\n1. #$geographicalSubRegionsOfUSState\n2. #$geographicalSubRegionsOfCountry\n3. #$geographicalSubRegionsOfContinent\n4. #$geographicalSubRegionsOfBodyOfWater")
    public static final SubLObject rkf_region_clarification_alt(SubLObject sub_region, SubLObject mt) {
        {
            SubLObject region = NIL;
            if (NIL == region) {
                {
                    SubLObject csome_list_var = $list_alt10;
                    SubLObject predicate = NIL;
                    for (predicate = csome_list_var.first(); !((NIL != region) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , predicate = csome_list_var.first()) {
                        {
                            SubLObject query_formula = make_binary_formula(predicate, $REGION, sub_region);
                            region = backward.removal_ask_variable($REGION, query_formula, mt, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return region;
        }
    }

    /**
     * Return REGION (a list of regions) in which SUB-REGION is located.
     * Predicates in the following order are used to determine REGION:
     * 1. #$geographicalSubRegionsOfUSState
     * 2. #$geographicalSubRegionsOfCountry
     * 3. #$geographicalSubRegionsOfContinent
     * 4. #$geographicalSubRegionsOfBodyOfWater
     *
     * @unknown (rkf-region-clarification #$CityOfAustinTX #$InferencePSC)
     * @unknown shah
     * @unknown 2004-08-12
     * @unknown shah 2004-08-12
     */
    @LispMethod(comment = "Return REGION (a list of regions) in which SUB-REGION is located.\r\nPredicates in the following order are used to determine REGION:\r\n1. #$geographicalSubRegionsOfUSState\r\n2. #$geographicalSubRegionsOfCountry\r\n3. #$geographicalSubRegionsOfContinent\r\n4. #$geographicalSubRegionsOfBodyOfWater\r\n\r\n@unknown (rkf-region-clarification #$CityOfAustinTX #$InferencePSC)\r\n@unknown shah\r\n@unknown 2004-08-12\r\n@unknown shah 2004-08-12\nReturn REGION (a list of regions) in which SUB-REGION is located.\nPredicates in the following order are used to determine REGION:\n1. #$geographicalSubRegionsOfUSState\n2. #$geographicalSubRegionsOfCountry\n3. #$geographicalSubRegionsOfContinent\n4. #$geographicalSubRegionsOfBodyOfWater")
    public static SubLObject rkf_region_clarification(final SubLObject sub_region, final SubLObject mt) {
        SubLObject region = NIL;
        if (NIL == region) {
            SubLObject csome_list_var = $list10;
            SubLObject predicate = NIL;
            predicate = csome_list_var.first();
            while ((NIL == region) && (NIL != csome_list_var)) {
                final SubLObject query_formula = make_binary_formula(predicate, $REGION, sub_region);
                region = backward.removal_ask_variable($REGION, query_formula, mt, UNPROVIDED, UNPROVIDED);
                csome_list_var = csome_list_var.rest();
                predicate = csome_list_var.first();
            } 
        }
        return region;
    }

    public static final SubLObject rkf_salient_generalization_alt(SubLObject v_term, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_salient_generalizations(v_term, domain_mt, T, T, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject rkf_salient_generalization(final SubLObject v_term, final SubLObject domain_mt) {
        return rkf_salient_generalizations(v_term, domain_mt, T, T, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject clear_rkf_salient_generalizations() {
        final SubLObject cs = $rkf_salient_generalizations_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rkf_salient_generalizations(final SubLObject v_term, final SubLObject domain_mt, SubLObject exclusiveP, SubLObject allow_redundantP, SubLObject max_to_return, SubLObject strict_clarification_checkingP, SubLObject isas_or_genlsP) {
        if (exclusiveP == UNPROVIDED) {
            exclusiveP = T;
        }
        if (allow_redundantP == UNPROVIDED) {
            allow_redundantP = NIL;
        }
        if (max_to_return == UNPROVIDED) {
            max_to_return = $ALL;
        }
        if (strict_clarification_checkingP == UNPROVIDED) {
            strict_clarification_checkingP = T;
        }
        if (isas_or_genlsP == UNPROVIDED) {
            isas_or_genlsP = $GENLS_FOR_COLLECTIONS;
        }
        return memoization_state.caching_state_remove_function_results_with_args($rkf_salient_generalizations_caching_state$.getGlobalValue(), list(v_term, domain_mt, exclusiveP, allow_redundantP, max_to_return, strict_clarification_checkingP, isas_or_genlsP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_salient_generalizations_internal(final SubLObject v_term, final SubLObject domain_mt, final SubLObject exclusiveP, final SubLObject allow_redundantP, final SubLObject max_to_return, final SubLObject strict_clarification_checkingP, SubLObject isas_or_genlsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_term) : "! cycl_grammar.cycl_denotational_term_p(v_term) " + ("cycl_grammar.cycl_denotational_term_p(v_term) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_term) ") + v_term;
        assert NIL != closedP(v_term, UNPROVIDED) : "! el_utilities.closedP(v_term, .UNPROVIDED) " + ("el_utilities.closedP(v_term, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != el_utilities.closedP(v_term, CommonSymbols.UNPROVIDED) ") + v_term;
        SubLObject generalizations = NIL;
        SubLObject enoughP = NIL;
        final SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $compute_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $unique_inference_result_bindings$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            $cache_inference_results$.bind(NIL, thread);
            $compute_inference_results$.bind(NIL, thread);
            $unique_inference_result_bindings$.bind(T, thread);
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            final SubLObject already_seen = set.new_set(EQ, UNPROVIDED);
            if ($GENLS_FOR_COLLECTIONS == isas_or_genlsP) {
                isas_or_genlsP = (NIL != fort_types_interface.isa_collectionP(v_term, UNPROVIDED)) ? $GENLS : $ISAS;
            }
            if ((isas_or_genlsP == $GENLS) && (NIL != rkf_generalization_okP(v_term, v_term, domain_mt, already_seen, exclusiveP, allow_redundantP, strict_clarification_checkingP))) {
                thread.resetMultipleValues();
                final SubLObject generalizations_$1 = rkf_update_generalizations(v_term, generalizations, already_seen, max_to_return);
                final SubLObject enoughP_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                generalizations = generalizations_$1;
                enoughP = enoughP_$2;
            }
            final SubLObject _prev_bind_0_$3 = $within_assert$.currentBinding(thread);
            final SubLObject _prev_bind_1_$4 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_2_$5 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_3_$6 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
            final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            try {
                $within_assert$.bind(NIL, thread);
                wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                wff_utilities.$check_var_typesP$.bind(NIL, thread);
                czer_vars.$simplify_literalP$.bind(NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                wff_vars.$validate_constantsP$.bind(NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                final SubLObject pcase_var = isas_or_genlsP;
                if (pcase_var.eql($GENLS)) {
                    final SubLObject notable = rkf_most_notable_genls(v_term, domain_mt, allow_redundantP, max_to_return);
                    if (NIL == enoughP) {
                        SubLObject csome_list_var = notable;
                        SubLObject generalization = NIL;
                        generalization = csome_list_var.first();
                        while ((NIL == enoughP) && (NIL != csome_list_var)) {
                            thread.resetMultipleValues();
                            final SubLObject generalizations_$2 = rkf_update_generalizations(generalization, generalizations, already_seen, max_to_return);
                            final SubLObject enoughP_$3 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            generalizations = generalizations_$2;
                            enoughP = enoughP_$3;
                            csome_list_var = csome_list_var.rest();
                            generalization = csome_list_var.first();
                        } 
                    }
                    if (max_to_return.eql(ONE_INTEGER) && (NIL == enoughP)) {
                        thread.resetMultipleValues();
                        final SubLObject generalizations_$3 = rkf_add_most_specific_genl(v_term, already_seen, domain_mt, strict_clarification_checkingP, max_to_return);
                        final SubLObject enoughP_$4 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        generalizations = generalizations_$3;
                        enoughP = enoughP_$4;
                    }
                    if (NIL == enoughP) {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
                        final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$6 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject v_genls = rkf_ontology_utilities.rkf_all_genls(v_term, UNPROVIDED);
                            if (NIL == enoughP) {
                                SubLObject csome_list_var2 = v_genls;
                                SubLObject generalization2 = NIL;
                                generalization2 = csome_list_var2.first();
                                while ((NIL == enoughP) && (NIL != csome_list_var2)) {
                                    if (NIL != rkf_generalization_okP(generalization2, v_term, domain_mt, already_seen, exclusiveP, allow_redundantP, strict_clarification_checkingP)) {
                                        thread.resetMultipleValues();
                                        final SubLObject generalizations_$4 = rkf_update_generalizations(generalization2, generalizations, already_seen, max_to_return);
                                        final SubLObject enoughP_$5 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        generalizations = generalizations_$4;
                                        enoughP = enoughP_$5;
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    generalization2 = csome_list_var2.first();
                                } 
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$6, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$5, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($ISAS)) {
                        thread.resetMultipleValues();
                        final SubLObject generalizations_$5 = rkf_add_most_notable_isas(v_term, generalizations, domain_mt, allow_redundantP, max_to_return);
                        final SubLObject enoughP_$6 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        generalizations = generalizations_$5;
                        enoughP = enoughP_$6;
                        if (max_to_return.eql(ONE_INTEGER) && (NIL == enoughP)) {
                            thread.resetMultipleValues();
                            final SubLObject generalizations_$6 = rkf_add_most_specific_isa(v_term, already_seen, domain_mt, strict_clarification_checkingP, max_to_return);
                            final SubLObject enoughP_$7 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            generalizations = generalizations_$6;
                            enoughP = enoughP_$7;
                        }
                        if (NIL == enoughP) {
                            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
                            final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$7 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject isas = cardinality_estimates.sort_by_generality_estimate(isa.all_isa(v_term, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                if (NIL == enoughP) {
                                    SubLObject csome_list_var2 = isas;
                                    SubLObject generalization2 = NIL;
                                    generalization2 = csome_list_var2.first();
                                    while ((NIL == enoughP) && (NIL != csome_list_var2)) {
                                        if (NIL != rkf_generalization_okP(generalization2, v_term, domain_mt, already_seen, exclusiveP, allow_redundantP, strict_clarification_checkingP)) {
                                            thread.resetMultipleValues();
                                            final SubLObject generalizations_$7 = rkf_update_generalizations(generalization2, generalizations, already_seen, max_to_return);
                                            final SubLObject enoughP_$8 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            generalizations = generalizations_$7;
                                            enoughP = enoughP_$8;
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        generalization2 = csome_list_var2.first();
                                    } 
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$7, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$6, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }

            } finally {
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3_$6, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2_$5, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1_$4, thread);
                $within_assert$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_4, thread);
            $unique_inference_result_bindings$.rebind(_prev_bind_3, thread);
            $compute_inference_results$.rebind(_prev_bind_2, thread);
            $cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        generalizations = reverse(generalizations);
        generalizations = Sort.stable_sort(generalizations, symbol_function($sym15$GENL_IN_ANY_MT_), UNPROVIDED);
        return max_to_return.isInteger() ? list_utilities.first_n(max_to_return, generalizations) : generalizations;
    }

    /**
     *
     *
     * @param ISAS-OR-GENLS?
     * 		keywordp; :ISAS, :GENLS, or :GENLS-FOR-COLLECTIONS.
     */
    @LispMethod(comment = "@param ISAS-OR-GENLS?\r\n\t\tkeywordp; :ISAS, :GENLS, or :GENLS-FOR-COLLECTIONS.")
    public static final SubLObject rkf_salient_generalizations_alt(SubLObject v_term, SubLObject domain_mt, SubLObject exclusiveP, SubLObject allow_redundantP, SubLObject max_to_return, SubLObject strict_clarification_checkingP, SubLObject isas_or_genlsP) {
        if (exclusiveP == UNPROVIDED) {
            exclusiveP = T;
        }
        if (allow_redundantP == UNPROVIDED) {
            allow_redundantP = NIL;
        }
        if (max_to_return == UNPROVIDED) {
            max_to_return = $ALL;
        }
        if (strict_clarification_checkingP == UNPROVIDED) {
            strict_clarification_checkingP = T;
        }
        if (isas_or_genlsP == UNPROVIDED) {
            isas_or_genlsP = $GENLS_FOR_COLLECTIONS;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, CYCL_DENOTATIONAL_TERM_P);
            SubLTrampolineFile.checkType(v_term, $sym13$CLOSED_);
            {
                SubLObject generalizations = NIL;
                SubLObject enoughP = NIL;
                {
                    SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $compute_inference_results$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $unique_inference_result_bindings$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $generate_readable_fi_results$.currentBinding(thread);
                    try {
                        $cache_inference_results$.bind(NIL, thread);
                        $compute_inference_results$.bind(NIL, thread);
                        $unique_inference_result_bindings$.bind(T, thread);
                        $generate_readable_fi_results$.bind(NIL, thread);
                        {
                            SubLObject already_seen = new_set(EQ, UNPROVIDED);
                            if ($GENLS_FOR_COLLECTIONS == isas_or_genlsP) {
                                isas_or_genlsP = (NIL != fort_types_interface.isa_collectionP(v_term, UNPROVIDED)) ? ((SubLObject) ($GENLS)) : $ISAS;
                            }
                            if ((isas_or_genlsP == $GENLS) && (NIL != com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_generalization_okP(v_term, v_term, domain_mt, already_seen, exclusiveP, allow_redundantP, strict_clarification_checkingP))) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject generalizations_1 = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_update_generalizations(v_term, generalizations, already_seen, max_to_return);
                                    SubLObject enoughP_2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    generalizations = generalizations_1;
                                    enoughP = enoughP_2;
                                }
                            }
                            {
                                SubLObject _prev_bind_0_3 = $within_assert$.currentBinding(thread);
                                SubLObject _prev_bind_1_4 = $check_arg_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_2_5 = $at_check_arg_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_3_6 = $check_wff_semanticsP$.currentBinding(thread);
                                SubLObject _prev_bind_4 = $check_wff_coherenceP$.currentBinding(thread);
                                SubLObject _prev_bind_5 = $check_var_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_6 = $simplify_literalP$.currentBinding(thread);
                                SubLObject _prev_bind_7 = $at_check_relator_constraintsP$.currentBinding(thread);
                                SubLObject _prev_bind_8 = $at_check_arg_formatP$.currentBinding(thread);
                                SubLObject _prev_bind_9 = $validate_constantsP$.currentBinding(thread);
                                SubLObject _prev_bind_10 = $suspend_sbhl_type_checkingP$.currentBinding(thread);
                                try {
                                    $within_assert$.bind(NIL, thread);
                                    $check_arg_typesP$.bind(NIL, thread);
                                    $at_check_arg_typesP$.bind(NIL, thread);
                                    $check_wff_semanticsP$.bind(NIL, thread);
                                    $check_wff_coherenceP$.bind(NIL, thread);
                                    $check_var_typesP$.bind(NIL, thread);
                                    $simplify_literalP$.bind(NIL, thread);
                                    $at_check_relator_constraintsP$.bind(NIL, thread);
                                    $at_check_arg_formatP$.bind(NIL, thread);
                                    $validate_constantsP$.bind(NIL, thread);
                                    $suspend_sbhl_type_checkingP$.bind(T, thread);
                                    {
                                        SubLObject pcase_var = isas_or_genlsP;
                                        if (pcase_var.eql($GENLS)) {
                                            {
                                                SubLObject notable = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_most_notable_genls(v_term, domain_mt, allow_redundantP, max_to_return);
                                                if (NIL == enoughP) {
                                                    {
                                                        SubLObject csome_list_var = notable;
                                                        SubLObject generalization = NIL;
                                                        for (generalization = csome_list_var.first(); !((NIL != enoughP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , generalization = csome_list_var.first()) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject generalizations_7 = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_update_generalizations(generalization, generalizations, already_seen, max_to_return);
                                                                SubLObject enoughP_8 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                generalizations = generalizations_7;
                                                                enoughP = enoughP_8;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if ((max_to_return == ONE_INTEGER) && (NIL == enoughP)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject generalizations_9 = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_add_most_specific_genl(v_term, already_seen, domain_mt, strict_clarification_checkingP, max_to_return);
                                                    SubLObject enoughP_10 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    generalizations = generalizations_9;
                                                    enoughP = enoughP_10;
                                                }
                                            }
                                            if (NIL == enoughP) {
                                                {
                                                    SubLObject mt_var = with_inference_mt_relevance_validate(domain_mt);
                                                    {
                                                        SubLObject _prev_bind_0_11 = $mt$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_12 = $relevant_mt_function$.currentBinding(thread);
                                                        SubLObject _prev_bind_2_13 = $relevant_mts$.currentBinding(thread);
                                                        try {
                                                            $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                                                            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                                                            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                                                            {
                                                                SubLObject v_genls = rkf_all_genls(v_term, UNPROVIDED);
                                                                if (NIL == enoughP) {
                                                                    {
                                                                        SubLObject csome_list_var = v_genls;
                                                                        SubLObject generalization = NIL;
                                                                        for (generalization = csome_list_var.first(); !((NIL != enoughP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , generalization = csome_list_var.first()) {
                                                                            if (NIL != com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_generalization_okP(generalization, v_term, domain_mt, already_seen, exclusiveP, allow_redundantP, strict_clarification_checkingP)) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject generalizations_14 = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_update_generalizations(generalization, generalizations, already_seen, max_to_return);
                                                                                    SubLObject enoughP_15 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    generalizations = generalizations_14;
                                                                                    enoughP = enoughP_15;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            $relevant_mts$.rebind(_prev_bind_2_13, thread);
                                                            $relevant_mt_function$.rebind(_prev_bind_1_12, thread);
                                                            $mt$.rebind(_prev_bind_0_11, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (pcase_var.eql($ISAS)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject generalizations_16 = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_add_most_notable_isas(v_term, generalizations, domain_mt, allow_redundantP, max_to_return);
                                                    SubLObject enoughP_17 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    generalizations = generalizations_16;
                                                    enoughP = enoughP_17;
                                                }
                                                if ((max_to_return == ONE_INTEGER) && (NIL == enoughP)) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject generalizations_18 = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_add_most_specific_isa(v_term, already_seen, domain_mt, strict_clarification_checkingP, max_to_return);
                                                        SubLObject enoughP_19 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        generalizations = generalizations_18;
                                                        enoughP = enoughP_19;
                                                    }
                                                }
                                                if (NIL == enoughP) {
                                                    {
                                                        SubLObject mt_var = with_inference_mt_relevance_validate(domain_mt);
                                                        {
                                                            SubLObject _prev_bind_0_20 = $mt$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_21 = $relevant_mt_function$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_22 = $relevant_mts$.currentBinding(thread);
                                                            try {
                                                                $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                                                                $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                                                                $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                                                                {
                                                                    SubLObject isas = sort_by_generality_estimate(all_isa(v_term, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                                                    if (NIL == enoughP) {
                                                                        {
                                                                            SubLObject csome_list_var = isas;
                                                                            SubLObject generalization = NIL;
                                                                            for (generalization = csome_list_var.first(); !((NIL != enoughP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , generalization = csome_list_var.first()) {
                                                                                if (NIL != com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_generalization_okP(generalization, v_term, domain_mt, already_seen, exclusiveP, allow_redundantP, strict_clarification_checkingP)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject generalizations_23 = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_update_generalizations(generalization, generalizations, already_seen, max_to_return);
                                                                                        SubLObject enoughP_24 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        generalizations = generalizations_23;
                                                                                        enoughP = enoughP_24;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                $relevant_mts$.rebind(_prev_bind_2_22, thread);
                                                                $relevant_mt_function$.rebind(_prev_bind_1_21, thread);
                                                                $mt$.rebind(_prev_bind_0_20, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    $suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                                    $validate_constantsP$.rebind(_prev_bind_9, thread);
                                    $at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                                    $at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                                    $simplify_literalP$.rebind(_prev_bind_6, thread);
                                    $check_var_typesP$.rebind(_prev_bind_5, thread);
                                    $check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                                    $check_wff_semanticsP$.rebind(_prev_bind_3_6, thread);
                                    $at_check_arg_typesP$.rebind(_prev_bind_2_5, thread);
                                    $check_arg_typesP$.rebind(_prev_bind_1_4, thread);
                                    $within_assert$.rebind(_prev_bind_0_3, thread);
                                }
                            }
                        }
                    } finally {
                        $generate_readable_fi_results$.rebind(_prev_bind_3, thread);
                        $unique_inference_result_bindings$.rebind(_prev_bind_2, thread);
                        $compute_inference_results$.rebind(_prev_bind_1, thread);
                        $cache_inference_results$.rebind(_prev_bind_0, thread);
                    }
                }
                generalizations = reverse(generalizations);
                generalizations = Sort.stable_sort(generalizations, symbol_function($sym14$GENL_IN_ANY_MT_), UNPROVIDED);
                return max_to_return.isInteger() ? ((SubLObject) (first_n(max_to_return, generalizations))) : generalizations;
            }
        }
    }

    /**
     *
     *
     * @param ISAS-OR-GENLS?
     * 		keywordp; :ISAS, :GENLS, or :GENLS-FOR-COLLECTIONS.
     */
    @LispMethod(comment = "@param ISAS-OR-GENLS?\r\n\t\tkeywordp; :ISAS, :GENLS, or :GENLS-FOR-COLLECTIONS.")
    public static SubLObject rkf_salient_generalizations(final SubLObject v_term, final SubLObject domain_mt, SubLObject exclusiveP, SubLObject allow_redundantP, SubLObject max_to_return, SubLObject strict_clarification_checkingP, SubLObject isas_or_genlsP) {
        if (exclusiveP == UNPROVIDED) {
            exclusiveP = T;
        }
        if (allow_redundantP == UNPROVIDED) {
            allow_redundantP = NIL;
        }
        if (max_to_return == UNPROVIDED) {
            max_to_return = $ALL;
        }
        if (strict_clarification_checkingP == UNPROVIDED) {
            strict_clarification_checkingP = T;
        }
        if (isas_or_genlsP == UNPROVIDED) {
            isas_or_genlsP = $GENLS_FOR_COLLECTIONS;
        }
        SubLObject caching_state = $rkf_salient_generalizations_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RKF_SALIENT_GENERALIZATIONS, $rkf_salient_generalizations_caching_state$, $int$4096, EQL, SEVEN_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_RKF_SALIENT_GENERALIZATIONS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(v_term, domain_mt, exclusiveP, allow_redundantP, max_to_return, strict_clarification_checkingP, isas_or_genlsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (domain_mt.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (exclusiveP.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (allow_redundantP.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (max_to_return.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (strict_clarification_checkingP.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && isas_or_genlsP.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rkf_salient_generalizations_internal(v_term, domain_mt, exclusiveP, allow_redundantP, max_to_return, strict_clarification_checkingP, isas_or_genlsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, domain_mt, exclusiveP, allow_redundantP, max_to_return, strict_clarification_checkingP, isas_or_genlsP));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @unknown LISTP of #$mostNotableIsa values for TERM.
     */
    @LispMethod(comment = "@unknown LISTP of #$mostNotableIsa values for TERM.")
    public static final SubLObject rkf_most_notable_genls_alt(SubLObject v_term, SubLObject domain_mt, SubLObject allow_redundantP, SubLObject max_to_return) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject most_notable_genls = (NIL != narts_high.naut_p(v_term)) ? ((SubLObject) (genls.naut_genls(v_term, domain_mt))) : NIL != somewhere_cache.some_pred_assertion_somewhereP($$mostNotableGenls, v_term, ONE_INTEGER, UNPROVIDED) ? ((SubLObject) (inference_kernel.new_cyc_query(listS($$mostNotableGenls, v_term, $list_alt16), domain_mt, $list_alt17))) : NIL;
                SubLObject already_seen = new_set(UNPROVIDED, UNPROVIDED);
                SubLObject sorted = sort_by_generality_estimate(most_notable_genls, $ASCENDING);
                SubLObject generalizations = NIL;
                SubLObject enoughP = NIL;
                if (NIL == enoughP) {
                    {
                        SubLObject csome_list_var = sorted;
                        SubLObject notable = NIL;
                        for (notable = csome_list_var.first(); !((NIL != enoughP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , notable = csome_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_generalization_okP(notable, v_term, domain_mt, already_seen, NIL, allow_redundantP, NIL)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject generalizations_25 = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_update_generalizations(notable, generalizations, already_seen, max_to_return);
                                    SubLObject enoughP_26 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    generalizations = generalizations_25;
                                    enoughP = enoughP_26;
                                }
                            }
                        }
                    }
                }
                return values(generalizations, enoughP);
            }
        }
    }

    /**
     *
     *
     * @unknown LISTP of #$mostNotableIsa values for TERM.
     */
    @LispMethod(comment = "@unknown LISTP of #$mostNotableIsa values for TERM.")
    public static SubLObject rkf_most_notable_genls(final SubLObject v_term, final SubLObject domain_mt, final SubLObject allow_redundantP, final SubLObject max_to_return) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject most_notable_genls = (NIL != narts_high.naut_p(v_term)) ? genls.naut_genls(v_term, domain_mt) : NIL != somewhere_cache.some_pred_assertion_somewhereP($$mostNotableGenls, v_term, ONE_INTEGER, UNPROVIDED) ? inference_kernel.new_cyc_query(listS($$mostNotableGenls, v_term, $list20), domain_mt, $list21) : NIL;
        final SubLObject already_seen = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject sorted = cardinality_estimates.sort_by_generality_estimate(most_notable_genls, $ASCENDING);
        SubLObject generalizations = NIL;
        SubLObject enoughP = NIL;
        if (NIL == enoughP) {
            SubLObject csome_list_var = sorted;
            SubLObject notable = NIL;
            notable = csome_list_var.first();
            while ((NIL == enoughP) && (NIL != csome_list_var)) {
                if (NIL != rkf_generalization_okP(notable, v_term, domain_mt, already_seen, NIL, allow_redundantP, NIL)) {
                    thread.resetMultipleValues();
                    final SubLObject generalizations_$25 = rkf_update_generalizations(notable, generalizations, already_seen, max_to_return);
                    final SubLObject enoughP_$26 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    generalizations = generalizations_$25;
                    enoughP = enoughP_$26;
                }
                csome_list_var = csome_list_var.rest();
                notable = csome_list_var.first();
            } 
        }
        return values(generalizations, enoughP);
    }

    /**
     * Add #$mostNotableIsa values for TERM to GENERALIZATIONS.
     */
    @LispMethod(comment = "Add #$mostNotableIsa values for TERM to GENERALIZATIONS.")
    public static final SubLObject rkf_add_most_notable_isas_alt(SubLObject v_term, SubLObject generalizations, SubLObject domain_mt, SubLObject allow_redundantP, SubLObject max_to_return) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject most_notable_isas = ((NIL != forts.fort_p(v_term)) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$mostNotableIsa, v_term, ONE_INTEGER, UNPROVIDED))) ? ((SubLObject) (inference_kernel.new_cyc_query(listS($$mostNotableIsa, v_term, $list_alt20), domain_mt, $list_alt21))) : NIL;
                SubLObject already_seen = new_set(UNPROVIDED, UNPROVIDED);
                SubLObject sorted = sort_by_generality_estimate(most_notable_isas, $ASCENDING);
                SubLObject enoughP = NIL;
                if (NIL == enoughP) {
                    {
                        SubLObject csome_list_var = sorted;
                        SubLObject notable = NIL;
                        for (notable = csome_list_var.first(); !((NIL != enoughP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , notable = csome_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_generalization_okP(notable, v_term, domain_mt, already_seen, NIL, allow_redundantP, NIL)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject generalizations_27 = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_update_generalizations(notable, generalizations, already_seen, max_to_return);
                                    SubLObject enoughP_28 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    generalizations = generalizations_27;
                                    enoughP = enoughP_28;
                                }
                            }
                        }
                    }
                }
                return values(generalizations, enoughP);
            }
        }
    }

    /**
     * Add #$mostNotableIsa values for TERM to GENERALIZATIONS.
     */
    @LispMethod(comment = "Add #$mostNotableIsa values for TERM to GENERALIZATIONS.")
    public static SubLObject rkf_add_most_notable_isas(final SubLObject v_term, SubLObject generalizations, final SubLObject domain_mt, final SubLObject allow_redundantP, final SubLObject max_to_return) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject most_notable_isas = ((NIL != forts.fort_p(v_term)) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$mostNotableIsa, v_term, ONE_INTEGER, UNPROVIDED))) ? inference_kernel.new_cyc_query(listS($$mostNotableIsa, v_term, $list24), domain_mt, $list25) : NIL;
        final SubLObject already_seen = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject sorted = cardinality_estimates.sort_by_generality_estimate(most_notable_isas, $ASCENDING);
        SubLObject enoughP = NIL;
        if (NIL == enoughP) {
            SubLObject csome_list_var = sorted;
            SubLObject notable = NIL;
            notable = csome_list_var.first();
            while ((NIL == enoughP) && (NIL != csome_list_var)) {
                if (NIL != rkf_generalization_okP(notable, v_term, domain_mt, already_seen, NIL, allow_redundantP, NIL)) {
                    thread.resetMultipleValues();
                    final SubLObject generalizations_$27 = rkf_update_generalizations(notable, generalizations, already_seen, max_to_return);
                    final SubLObject enoughP_$28 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    generalizations = generalizations_$27;
                    enoughP = enoughP_$28;
                }
                csome_list_var = csome_list_var.rest();
                notable = csome_list_var.first();
            } 
        }
        return values(generalizations, enoughP);
    }

    public static final SubLObject rkf_add_most_specific_isa_alt(SubLObject v_term, SubLObject seen_set, SubLObject mt, SubLObject strict_clarification_checkingP, SubLObject count) {
        {
            SubLObject min_isas = min_isa(v_term, mt, UNPROVIDED);
            SubLObject min_isa = sort_by_generality_estimate(min_isas, UNPROVIDED).first();
            SubLObject okP = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_generalization_okP(min_isa, v_term, mt, seen_set, NIL, NIL, strict_clarification_checkingP);
            if (NIL != okP) {
                set_add(min_isa, seen_set);
                return values(list(min_isa), numE(count, ONE_INTEGER));
            }
            return values(NIL, NIL);
        }
    }

    public static SubLObject rkf_add_most_specific_isa(final SubLObject v_term, final SubLObject seen_set, final SubLObject mt, final SubLObject strict_clarification_checkingP, final SubLObject count) {
        final SubLObject min_isas = isa.min_isa(v_term, mt, UNPROVIDED);
        final SubLObject min_isa = cardinality_estimates.sort_by_generality_estimate(min_isas, UNPROVIDED).first();
        final SubLObject okP = rkf_generalization_okP(min_isa, v_term, mt, seen_set, NIL, NIL, strict_clarification_checkingP);
        if (NIL != okP) {
            set.set_add(min_isa, seen_set);
            return values(list(min_isa), numE(count, ONE_INTEGER));
        }
        return values(NIL, NIL);
    }

    public static final SubLObject rkf_add_most_specific_genl_alt(SubLObject v_term, SubLObject seen_set, SubLObject mt, SubLObject strict_clarification_checkingP, SubLObject count) {
        {
            SubLObject min_genls = genls.min_genls(v_term, mt, UNPROVIDED);
            SubLObject min_genl = sort_by_generality_estimate(min_genls, UNPROVIDED).first();
            SubLObject okP = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_generalization_okP(min_genl, v_term, mt, seen_set, NIL, NIL, strict_clarification_checkingP);
            if (NIL != okP) {
                set_add(min_genl, seen_set);
                return values(list(min_genl), numE(count, ONE_INTEGER));
            }
            return values(NIL, NIL);
        }
    }

    public static SubLObject rkf_add_most_specific_genl(final SubLObject v_term, final SubLObject seen_set, final SubLObject mt, final SubLObject strict_clarification_checkingP, final SubLObject count) {
        final SubLObject min_genls = genls.min_genls(v_term, mt, UNPROVIDED);
        final SubLObject min_genl = cardinality_estimates.sort_by_generality_estimate(min_genls, UNPROVIDED).first();
        final SubLObject okP = rkf_generalization_okP(min_genl, v_term, mt, seen_set, NIL, NIL, strict_clarification_checkingP);
        if (NIL != okP) {
            set.set_add(min_genl, seen_set);
            return values(list(min_genl), numE(count, ONE_INTEGER));
        }
        return values(NIL, NIL);
    }

    public static final SubLObject rkf_update_generalizations_alt(SubLObject v_new, SubLObject generalizations, SubLObject seen_set, SubLObject max_to_return) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject updated_generalizations = cons(v_new, generalizations);
                SubLObject enoughP = makeBoolean(max_to_return.isInteger() && (NIL != lengthGE(updated_generalizations, max_to_return, UNPROVIDED)));
                SubLObject node_var = v_new;
                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                SubLObject recur_deck = deck.create_deck(deck_type);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject tv_var = NIL;
                            {
                                SubLObject _prev_bind_0_29 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt27$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt27$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt27$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt32$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt27$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_30 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_31 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(v_new, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                {
                                                    SubLObject _prev_bind_0_32 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_33 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_34 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                        while (NIL != node_var) {
                                                            {
                                                                SubLObject genl = node_var;
                                                                set_add(genl, seen_set);
                                                            }
                                                            {
                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                SubLObject module_var = NIL;
                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                    {
                                                                        SubLObject _prev_bind_0_35 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_36 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                            {
                                                                                SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                    {
                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                        if (NIL != d_link) {
                                                                                            {
                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                if (NIL != mt_links) {
                                                                                                    {
                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            {
                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if (NIL != relevant_mtP(mt)) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                            {
                                                                                                                                SubLObject iteration_state_38 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_38)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_38);
                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                        SubLObject cdolist_list_var_40 = new_list;
                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest() , node_vars_link_node = cdolist_list_var_40.first()) {
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_39, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state_38 = dictionary_contents.do_dictionary_contents_next(iteration_state_38);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_38);
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_37, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                            }
                                                                                                        } 
                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt33$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                        {
                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                            SubLObject cdolist_list_var_41 = new_list;
                                                                                            SubLObject generating_fn = NIL;
                                                                                            for (generating_fn = cdolist_list_var_41.first(); NIL != cdolist_list_var_41; cdolist_list_var_41 = cdolist_list_var_41.rest() , generating_fn = cdolist_list_var_41.first()) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_42 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                        {
                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                            SubLObject new_list_43 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(link_nodes))) : link_nodes;
                                                                                                            SubLObject cdolist_list_var_44 = new_list_43;
                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                            for (node_vars_link_node = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest() , node_vars_link_node = cdolist_list_var_44.first()) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_42, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_36, thread);
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_35, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            node_var = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_34, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_33, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_32, thread);
                                                    }
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt34$Node__a_does_not_pass_sbhl_type_t, v_new, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_31, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_30, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_29, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(updated_generalizations, enoughP);
            }
        }
    }

    public static SubLObject rkf_update_generalizations(final SubLObject v_new, final SubLObject generalizations, final SubLObject seen_set, final SubLObject max_to_return) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject updated_generalizations = (NIL != member(v_new, generalizations, symbol_function(EQUAL), UNPROVIDED)) ? generalizations : cons(v_new, generalizations);
        final SubLObject enoughP = makeBoolean(max_to_return.isInteger() && (NIL != list_utilities.lengthGE(updated_generalizations, max_to_return, UNPROVIDED)));
        SubLObject node_var = v_new;
        final SubLObject deck_type = $STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$29 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$30 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$31 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(v_new, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$31 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$32 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$34 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                while (NIL != node_var) {
                                    final SubLObject genl = node_var;
                                    set.set_add(genl, seen_set);
                                    SubLObject cdolist_list_var;
                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                    SubLObject module_var = NIL;
                                    module_var = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$32 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$33 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                if (NIL != d_link) {
                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links) {
                                                        SubLObject iteration_state;
                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                    SubLObject iteration_state_$38;
                                                                    for (iteration_state_$38 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$38); iteration_state_$38 = dictionary_contents.do_dictionary_contents_next(iteration_state_$38)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$38);
                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                            final SubLObject _prev_bind_0_$34 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                final SubLObject sol = link_nodes;
                                                                                if (NIL != set.set_p(sol)) {
                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                    SubLObject basis_object;
                                                                                    SubLObject state;
                                                                                    SubLObject node_vars_link_node;
                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (NIL != csome_list_var) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str37$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$34, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$38);
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$33, thread);
                                                                }
                                                            }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } else
                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$40;
                                                    final SubLObject new_list = cdolist_list_var_$40 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    SubLObject generating_fn = NIL;
                                                    generating_fn = cdolist_list_var_$40.first();
                                                    while (NIL != cdolist_list_var_$40) {
                                                        final SubLObject _prev_bind_0_$35 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                            if (NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            } else
                                                                if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error($str37$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$35, thread);
                                                        }
                                                        cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                                                        generating_fn = cdolist_list_var_$40.first();
                                                    } 
                                                }

                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$33, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$32, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        module_var = cdolist_list_var.first();
                                    } 
                                    node_var = deck.deck_pop(recur_deck);
                                } 
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$34, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$32, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$31, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str39$Node__a_does_not_pass_sbhl_type_t, v_new, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$31, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$30, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$29, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return values(updated_generalizations, enoughP);
    }

    /**
     *
     *
     * @return BOOLEANP; Is GENERALIZATION an acceptable generalization for TERM?
     */
    @LispMethod(comment = "@return BOOLEANP; Is GENERALIZATION an acceptable generalization for TERM?")
    public static final SubLObject rkf_generalization_okP_alt(SubLObject generalization, SubLObject v_term, SubLObject domain_mt, SubLObject already_seen, SubLObject exclusiveP, SubLObject allow_redundantP, SubLObject strict_clarification_checkingP) {
        if ((NIL != exclusiveP) && v_term.equal(generalization)) {
            return NIL;
        } else {
            if ((NIL == allow_redundantP) && (NIL != set_memberP(generalization, already_seen))) {
                return NIL;
            } else {
                if (NIL != rkf_relevance_utilities.rkf_irrelevant_term(generalization, domain_mt)) {
                    return NIL;
                } else {
                    if (NIL != strict_clarification_checkingP) {
                        return com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_clarifying_collectionP(generalization, domain_mt);
                    } else {
                        return T;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is GENERALIZATION an acceptable generalization for TERM?
     */
    @LispMethod(comment = "@return BOOLEANP; Is GENERALIZATION an acceptable generalization for TERM?")
    public static SubLObject rkf_generalization_okP(final SubLObject generalization, final SubLObject v_term, final SubLObject domain_mt, final SubLObject already_seen, final SubLObject exclusiveP, final SubLObject allow_redundantP, final SubLObject strict_clarification_checkingP) {
        if ((NIL != exclusiveP) && v_term.equal(generalization)) {
            return NIL;
        }
        if ((NIL == allow_redundantP) && (NIL != set.set_memberP(generalization, already_seen))) {
            return NIL;
        }
        if (NIL != rkf_relevance_utilities.rkf_irrelevant_term(generalization, domain_mt)) {
            return NIL;
        }
        if (NIL != strict_clarification_checkingP) {
            return rkf_clarifying_collectionP(generalization, domain_mt);
        }
        return T;
    }

    public static final SubLObject rkf_clarifying_collectionP_alt(SubLObject generalization, SubLObject domain_mt) {
        return makeBoolean((NIL != forts.fort_p(generalization)) && (NIL != isaP(generalization, $$ClarifyingCollectionType, domain_mt, UNPROVIDED)));
    }

    public static SubLObject rkf_clarifying_collectionP(final SubLObject generalization, final SubLObject domain_mt) {
        return makeBoolean((NIL != forts.fort_p(generalization)) && (NIL != isa.isaP(generalization, $$ClarifyingCollectionType, domain_mt, UNPROVIDED)));
    }

    /**
     * Return a list of pathnames to the pictures that would distinguish these terms
     * from each other. Right now, this will just return any pictures that we can
     * possibly find.
     */
    @LispMethod(comment = "Return a list of pathnames to the pictures that would distinguish these terms\r\nfrom each other. Right now, this will just return any pictures that we can\r\npossibly find.\nReturn a list of pathnames to the pictures that would distinguish these terms\nfrom each other. Right now, this will just return any pictures that we can\npossibly find.")
    public static final SubLObject rkf_terms_distinguishing_pictures_alt(SubLObject terms, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                if (NIL != valid_constantP($$salientTermImagePathname, T)) {
                    {
                        SubLObject cdolist_list_var = terms;
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                            {
                                SubLObject image = NIL;
                                SubLObject images = NIL;
                                {
                                    SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = $check_arg_typesP$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = $at_check_arg_typesP$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = $check_wff_semanticsP$.currentBinding(thread);
                                    SubLObject _prev_bind_4 = $check_wff_coherenceP$.currentBinding(thread);
                                    SubLObject _prev_bind_5 = $check_var_typesP$.currentBinding(thread);
                                    SubLObject _prev_bind_6 = $simplify_literalP$.currentBinding(thread);
                                    SubLObject _prev_bind_7 = $at_check_relator_constraintsP$.currentBinding(thread);
                                    SubLObject _prev_bind_8 = $at_check_arg_formatP$.currentBinding(thread);
                                    SubLObject _prev_bind_9 = $validate_constantsP$.currentBinding(thread);
                                    SubLObject _prev_bind_10 = $suspend_sbhl_type_checkingP$.currentBinding(thread);
                                    try {
                                        $within_assert$.bind(NIL, thread);
                                        $check_arg_typesP$.bind(NIL, thread);
                                        $at_check_arg_typesP$.bind(NIL, thread);
                                        $check_wff_semanticsP$.bind(NIL, thread);
                                        $check_wff_coherenceP$.bind(NIL, thread);
                                        $check_var_typesP$.bind(NIL, thread);
                                        $simplify_literalP$.bind(NIL, thread);
                                        $at_check_relator_constraintsP$.bind(NIL, thread);
                                        $at_check_arg_formatP$.bind(NIL, thread);
                                        $validate_constantsP$.bind(NIL, thread);
                                        $suspend_sbhl_type_checkingP$.bind(T, thread);
                                        {
                                            SubLObject pathname = $sym37$_PATHNAME;
                                            images = fi.fi_ask_int(list($$salientTermImagePathname, v_term, pathname), domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            image = assoc(pathname, images.first(), UNPROVIDED, UNPROVIDED).rest();
                                        }
                                    } finally {
                                        $suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                                        $validate_constantsP$.rebind(_prev_bind_9, thread);
                                        $at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                                        $at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                                        $simplify_literalP$.rebind(_prev_bind_6, thread);
                                        $check_var_typesP$.rebind(_prev_bind_5, thread);
                                        $check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                                        $check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                                        $at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                                        $check_arg_typesP$.rebind(_prev_bind_1, thread);
                                        $within_assert$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (NIL != image) {
                                    {
                                        SubLObject root_url = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_terms_distinguishing_picture_database_url(domain_mt);
                                        SubLObject full_path = NIL;
                                        if (NIL != root_url) {
                                            full_path = cconcatenate(root_url, image);
                                            v_answer = cons(list(v_term, full_path), v_answer);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     * Return a list of pathnames to the pictures that would distinguish these terms
     * from each other. Right now, this will just return any pictures that we can
     * possibly find.
     */
    @LispMethod(comment = "Return a list of pathnames to the pictures that would distinguish these terms\r\nfrom each other. Right now, this will just return any pictures that we can\r\npossibly find.\nReturn a list of pathnames to the pictures that would distinguish these terms\nfrom each other. Right now, this will just return any pictures that we can\npossibly find.")
    public static SubLObject rkf_terms_distinguishing_pictures(final SubLObject terms, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if (NIL != valid_constantP($$salientTermImagePathname, T)) {
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject image = NIL;
                SubLObject images = NIL;
                final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                try {
                    $within_assert$.bind(NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                    wff_utilities.$check_var_typesP$.bind(NIL, thread);
                    czer_vars.$simplify_literalP$.bind(NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                    wff_vars.$validate_constantsP$.bind(NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                    final SubLObject pathname = $sym42$_PATHNAME;
                    images = fi.fi_ask_int(list($$salientTermImagePathname, v_term, pathname), domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    image = assoc(pathname, images.first(), UNPROVIDED, UNPROVIDED).rest();
                } finally {
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                    $within_assert$.rebind(_prev_bind_0, thread);
                }
                if (NIL != image) {
                    final SubLObject root_url = rkf_terms_distinguishing_picture_database_url(domain_mt);
                    SubLObject full_path = NIL;
                    if (NIL != root_url) {
                        full_path = cconcatenate(root_url, image);
                        v_answer = cons(list(v_term, full_path), v_answer);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        return v_answer;
    }

    /**
     * Return the URL for a database of pictures for the domain-mt provided
     * that can be employed in as the root of a pathname for looking up
     * #$salientTermImagePathnames.
     */
    @LispMethod(comment = "Return the URL for a database of pictures for the domain-mt provided\r\nthat can be employed in as the root of a pathname for looking up\r\n#$salientTermImagePathnames.\nReturn the URL for a database of pictures for the domain-mt provided\nthat can be employed in as the root of a pathname for looking up\n#$salientTermImagePathnames.")
    public static final SubLObject rkf_terms_distinguishing_picture_database_url_alt(SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                if (NIL != valid_constantP($$salientTermsImageRoot, T)) {
                    {
                        SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $check_arg_typesP$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $at_check_arg_typesP$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $check_wff_semanticsP$.currentBinding(thread);
                        SubLObject _prev_bind_4 = $check_wff_coherenceP$.currentBinding(thread);
                        SubLObject _prev_bind_5 = $check_var_typesP$.currentBinding(thread);
                        SubLObject _prev_bind_6 = $simplify_literalP$.currentBinding(thread);
                        SubLObject _prev_bind_7 = $at_check_relator_constraintsP$.currentBinding(thread);
                        SubLObject _prev_bind_8 = $at_check_arg_formatP$.currentBinding(thread);
                        SubLObject _prev_bind_9 = $validate_constantsP$.currentBinding(thread);
                        SubLObject _prev_bind_10 = $suspend_sbhl_type_checkingP$.currentBinding(thread);
                        try {
                            $within_assert$.bind(NIL, thread);
                            $check_arg_typesP$.bind(NIL, thread);
                            $at_check_arg_typesP$.bind(NIL, thread);
                            $check_wff_semanticsP$.bind(NIL, thread);
                            $check_wff_coherenceP$.bind(NIL, thread);
                            $check_var_typesP$.bind(NIL, thread);
                            $simplify_literalP$.bind(NIL, thread);
                            $at_check_relator_constraintsP$.bind(NIL, thread);
                            $at_check_arg_formatP$.bind(NIL, thread);
                            $validate_constantsP$.bind(NIL, thread);
                            $suspend_sbhl_type_checkingP$.bind(T, thread);
                            {
                                SubLObject url = $sym39$_URL;
                                SubLObject v_bindings = NIL;
                                v_bindings = fi.fi_ask_int(list($$salientTermsImageRoot, url), domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                v_answer = assoc(url, v_bindings.first(), UNPROVIDED, UNPROVIDED).rest();
                            }
                        } finally {
                            $suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                            $validate_constantsP$.rebind(_prev_bind_9, thread);
                            $at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                            $at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                            $simplify_literalP$.rebind(_prev_bind_6, thread);
                            $check_var_typesP$.rebind(_prev_bind_5, thread);
                            $check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                            $check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                            $at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                            $check_arg_typesP$.rebind(_prev_bind_1, thread);
                            $within_assert$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     * Return the URL for a database of pictures for the domain-mt provided
     * that can be employed in as the root of a pathname for looking up
     * #$salientTermImagePathnames.
     */
    @LispMethod(comment = "Return the URL for a database of pictures for the domain-mt provided\r\nthat can be employed in as the root of a pathname for looking up\r\n#$salientTermImagePathnames.\nReturn the URL for a database of pictures for the domain-mt provided\nthat can be employed in as the root of a pathname for looking up\n#$salientTermImagePathnames.")
    public static SubLObject rkf_terms_distinguishing_picture_database_url(final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if (NIL != valid_constantP($$salientTermsImageRoot, T)) {
            final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
            final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            try {
                $within_assert$.bind(NIL, thread);
                wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                wff_utilities.$check_var_typesP$.bind(NIL, thread);
                czer_vars.$simplify_literalP$.bind(NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                wff_vars.$validate_constantsP$.bind(NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                final SubLObject url = $sym44$_URL;
                SubLObject v_bindings = NIL;
                v_bindings = fi.fi_ask_int(list($$salientTermsImageRoot, url), domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                v_answer = assoc(url, v_bindings.first(), UNPROVIDED, UNPROVIDED).rest();
            } finally {
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                $within_assert$.rebind(_prev_bind_0, thread);
            }
        }
        return v_answer;
    }/**
     * Return the URL for a database of pictures for the domain-mt provided
     * that can be employed in as the root of a pathname for looking up
     * #$salientTermImagePathnames.
     */


    /**
     *
     *
     * @return CycL expression denoting a salient collection of which arg ARGNUM of RELATION
    is constrained to be an instance.
     * @unknown baxter
     */
    @LispMethod(comment = "@return CycL expression denoting a salient collection of which arg ARGNUM of RELATION\r\nis constrained to be an instance.\r\n@unknown baxter")
    public static final SubLObject rkf_salient_argn_isa_alt(SubLObject relation, SubLObject argnum, SubLObject domain_mt) {
        {
            SubLObject all_isa_cols = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_argn_isa(relation, argnum, domain_mt);
            SubLObject all_genl_cols = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_argn_genl(relation, argnum, domain_mt);
            {
                SubLObject csome_list_var = all_isa_cols;
                SubLObject col = NIL;
                for (col = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                    if (NIL == rkf_relevance_utilities.rkf_irrelevant_term(col, domain_mt)) {
                        return col;
                    }
                }
            }
            {
                SubLObject csome_list_var = all_genl_cols;
                SubLObject col = NIL;
                for (col = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                    if (NIL == rkf_relevance_utilities.rkf_irrelevant_term(col, domain_mt)) {
                        return com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_make_type_level(col);
                    }
                }
            }
            if (NIL != all_isa_cols) {
                return all_isa_cols.first();
            } else {
                if (NIL != all_genl_cols) {
                    return all_genl_cols.first();
                } else {
                    return $$Thing;
                }
            }
        }
    }

    /**
     *
     *
     * @return CycL expression denoting a salient collection of which arg ARGNUM of RELATION
    is constrained to be an instance.
     * @unknown baxter
     */
    @LispMethod(comment = "@return CycL expression denoting a salient collection of which arg ARGNUM of RELATION\r\nis constrained to be an instance.\r\n@unknown baxter")
    public static SubLObject rkf_salient_argn_isa(final SubLObject relation, final SubLObject argnum, final SubLObject domain_mt) {
        final SubLObject all_isa_cols = rkf_argn_isa(relation, argnum, domain_mt);
        final SubLObject all_genl_cols = rkf_argn_genl(relation, argnum, domain_mt);
        SubLObject csome_list_var = all_isa_cols;
        SubLObject col = NIL;
        col = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL == rkf_relevance_utilities.rkf_irrelevant_term(col, domain_mt)) {
                return col;
            }
            csome_list_var = csome_list_var.rest();
            col = csome_list_var.first();
        } 
        csome_list_var = all_genl_cols;
        col = NIL;
        col = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL == rkf_relevance_utilities.rkf_irrelevant_term(col, domain_mt)) {
                return rkf_make_type_level(col);
            }
            csome_list_var = csome_list_var.rest();
            col = csome_list_var.first();
        } 
        if (NIL != all_isa_cols) {
            return all_isa_cols.first();
        }
        if (NIL != all_genl_cols) {
            return all_genl_cols.first();
        }
        return $$Thing;
    }

    /**
     *
     *
     * @return LISTP of arg-isa constraint collections for ARGNUM of RELATION.
     */
    @LispMethod(comment = "@return LISTP of arg-isa constraint collections for ARGNUM of RELATION.")
    public static final SubLObject rkf_argn_isa_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (NIL != com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_quantified_binary_predicate_naut_p(relation)) {
            {
                SubLObject datum = cycl_utilities.nat_args(relation, UNPROVIDED);
                SubLObject current = datum;
                SubLObject rmp = NIL;
                SubLObject binpred = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt41);
                rmp = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt41);
                binpred = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject rmp_argnum = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_rmp_corresponding_argnum(rmp, argnum);
                        SubLObject type_levelP = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_reln_type_level_in_argP(rmp, rmp_argnum, mt);
                        SubLObject embedded_argn_isa = (NIL != type_levelP) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_argn_isa(binpred, argnum, mt);
                        return embedded_argn_isa;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt41);
                }
            }
        } else {
            return kb_accessors.argn_isa(relation, argnum, mt);
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of arg-isa constraint collections for ARGNUM of RELATION.
     */
    @LispMethod(comment = "@return LISTP of arg-isa constraint collections for ARGNUM of RELATION.")
    public static SubLObject rkf_argn_isa(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        if (NIL == rkf_quantified_binary_predicate_naut_p(relation)) {
            return kb_accessors.argn_isa(relation, argnum, mt);
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(relation, UNPROVIDED);
        SubLObject rmp = NIL;
        SubLObject binpred = NIL;
        destructuring_bind_must_consp(current, datum, $list46);
        rmp = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        binpred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject rmp_argnum = rkf_rmp_corresponding_argnum(rmp, argnum);
            final SubLObject type_levelP = rkf_reln_type_level_in_argP(rmp, rmp_argnum, mt);
            final SubLObject embedded_argn_isa = (NIL != type_levelP) ? NIL : rkf_argn_isa(binpred, argnum, mt);
            return embedded_argn_isa;
        }
        cdestructuring_bind_error(datum, $list46);
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of arg-genl constraint collections for ARGNUM of RELATION.
     */
    @LispMethod(comment = "@return LISTP of arg-genl constraint collections for ARGNUM of RELATION.")
    public static final SubLObject rkf_argn_genl_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (NIL != com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_quantified_binary_predicate_naut_p(relation)) {
            {
                SubLObject datum = cycl_utilities.nat_args(relation, UNPROVIDED);
                SubLObject current = datum;
                SubLObject rmp = NIL;
                SubLObject binpred = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt41);
                rmp = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt41);
                binpred = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject rmp_argnum = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_rmp_corresponding_argnum(rmp, argnum);
                        SubLObject type_levelP = com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_reln_type_level_in_argP(rmp, rmp_argnum, mt);
                        SubLObject embedded_argn_genl = (NIL != type_levelP) ? ((SubLObject) (com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_argn_isa(binpred, argnum, mt))) : com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_argn_genl(binpred, argnum, mt);
                        return embedded_argn_genl;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt41);
                }
            }
        } else {
            return kb_accessors.argn_genl(relation, argnum, mt);
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of arg-genl constraint collections for ARGNUM of RELATION.
     */
    @LispMethod(comment = "@return LISTP of arg-genl constraint collections for ARGNUM of RELATION.")
    public static SubLObject rkf_argn_genl(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        if (NIL == rkf_quantified_binary_predicate_naut_p(relation)) {
            return kb_accessors.argn_genl(relation, argnum, mt);
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(relation, UNPROVIDED);
        SubLObject rmp = NIL;
        SubLObject binpred = NIL;
        destructuring_bind_must_consp(current, datum, $list46);
        rmp = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        binpred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject rmp_argnum = rkf_rmp_corresponding_argnum(rmp, argnum);
            final SubLObject type_levelP = rkf_reln_type_level_in_argP(rmp, rmp_argnum, mt);
            final SubLObject embedded_argn_genl = (NIL != type_levelP) ? rkf_argn_isa(binpred, argnum, mt) : rkf_argn_genl(binpred, argnum, mt);
            return embedded_argn_genl;
        }
        cdestructuring_bind_error(datum, $list46);
        return NIL;
    }

    /**
     *
     *
     * @return POSITIVE-INTEGER-P; The argnum of RMP that corresponds to arg
    ARGNUM of its arg1.
     */
    @LispMethod(comment = "@return POSITIVE-INTEGER-P; The argnum of RMP that corresponds to arg\r\nARGNUM of its arg1.")
    public static final SubLObject rkf_rmp_corresponding_argnum_alt(SubLObject rmp, SubLObject argnum) {
        {
            SubLObject kb_answer = ask_utilities.ask_variable($sym42$_RMP_ARGNUM, list($$relatedArgPositions, rmp, $sym42$_RMP_ARGNUM, argnum), $$ParaphraseMt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != singletonP(kb_answer)) && (NIL != subl_promotions.positive_integer_p(kb_answer.first()))) {
                return kb_answer.first();
            } else {
                return number_utilities.f_1X(argnum);
            }
        }
    }

    /**
     *
     *
     * @return POSITIVE-INTEGER-P; The argnum of RMP that corresponds to arg
    ARGNUM of its arg1.
     */
    @LispMethod(comment = "@return POSITIVE-INTEGER-P; The argnum of RMP that corresponds to arg\r\nARGNUM of its arg1.")
    public static SubLObject rkf_rmp_corresponding_argnum(final SubLObject rmp, final SubLObject argnum) {
        final SubLObject kb_answer = ask_utilities.ask_variable($sym47$_RMP_ARGNUM, list($$relatedArgPositions, rmp, $sym47$_RMP_ARGNUM, argnum), $$ParaphraseMt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != list_utilities.singletonP(kb_answer)) && (NIL != subl_promotions.positive_integer_p(kb_answer.first()))) {
            return kb_answer.first();
        }
        return number_utilities.f_1X(argnum);
    }

    public static final SubLObject rkf_arity_alt(SubLObject reln) {
        if (NIL != com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_quantified_binary_predicate_naut_p(reln)) {
            return com.cyc.cycjava.cycl.rkf_concept_clarifier.rkf_arity(cycl_utilities.nat_arg2(reln, UNPROVIDED));
        } else {
            return NIL != arity.arity(reln) ? ((SubLObject) (arity.arity(reln))) : arity.arity_min(reln);
        }
    }

    public static SubLObject rkf_arity(final SubLObject reln) {
        if (NIL != rkf_quantified_binary_predicate_naut_p(reln)) {
            return rkf_arity(cycl_utilities.nat_arg2(reln, UNPROVIDED));
        }
        return NIL != arity.arity(reln) ? arity.arity(reln) : arity.arity_min(reln);
    }

    /**
     * Given an arg-genl constraint collection, convert it to an arg-isa constraint
     * collection.
     */
    @LispMethod(comment = "Given an arg-genl constraint collection, convert it to an arg-isa constraint\r\ncollection.\nGiven an arg-genl constraint collection, convert it to an arg-isa constraint\ncollection.")
    public static final SubLObject rkf_make_type_level_alt(SubLObject col) {
        return make_unary_formula($$SpecsFn, col);
    }

    /**
     * Given an arg-genl constraint collection, convert it to an arg-isa constraint
     * collection.
     */
    @LispMethod(comment = "Given an arg-genl constraint collection, convert it to an arg-isa constraint\r\ncollection.\nGiven an arg-genl constraint collection, convert it to an arg-isa constraint\ncollection.")
    public static SubLObject rkf_make_type_level(final SubLObject col) {
        return make_unary_formula($$SpecsFn, col);
    }/**
     * Given an arg-genl constraint collection, convert it to an arg-isa constraint
     * collection.
     */


    /**
     *
     *
     * @return BOOLEAN; Is RELN type-level in ARGNUM?
     */
    @LispMethod(comment = "@return BOOLEAN; Is RELN type-level in ARGNUM?")
    public static final SubLObject rkf_reln_type_level_in_argP_alt(SubLObject reln, SubLObject argnum, SubLObject mt) {
        return sublisp_boolean(find($$SetOrCollection, kb_accessors.argn_isa(reln, argnum, mt), $sym47$SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return BOOLEAN; Is RELN type-level in ARGNUM?
     */
    @LispMethod(comment = "@return BOOLEAN; Is RELN type-level in ARGNUM?")
    public static SubLObject rkf_reln_type_level_in_argP(final SubLObject reln, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(find($$SetOrCollection, kb_accessors.argn_isa(reln, argnum, mt), $sym52$SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return BOOLEAN; Is RELATION a #$QuantifiedBinaryPredicateFn NAUT?
     */
    @LispMethod(comment = "@return BOOLEAN; Is RELATION a #$QuantifiedBinaryPredicateFn NAUT?")
    public static final SubLObject rkf_quantified_binary_predicate_naut_p_alt(SubLObject relation) {
        return makeBoolean((NIL != possibly_naut_p(relation)) && cycl_utilities.nat_functor(relation).eql(constants_high.find_constant($$$QuantifiedBinaryPredicateFn)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is RELATION a #$QuantifiedBinaryPredicateFn NAUT?
     */
    @LispMethod(comment = "@return BOOLEAN; Is RELATION a #$QuantifiedBinaryPredicateFn NAUT?")
    public static SubLObject rkf_quantified_binary_predicate_naut_p(final SubLObject relation) {
        return makeBoolean((NIL != possibly_naut_p(relation)) && cycl_utilities.nat_functor(relation).eql(constants_high.find_constant($$$QuantifiedBinaryPredicateFn)));
    }

    public static SubLObject declare_rkf_concept_clarifier_file() {
        declareFunction("rkf_clarifying_sentences", "RKF-CLARIFYING-SENTENCES", 2, 3, false);
        declareFunction("rkf_interesting_clarifying_sentences", "RKF-INTERESTING-CLARIFYING-SENTENCES", 2, 3, false);
        declareFunction("separate_isa_or_genls_sentences_from_inference_answer", "SEPARATE-ISA-OR-GENLS-SENTENCES-FROM-INFERENCE-ANSWER", 1, 0, false);
        declareFunction("rkf_terms_distinguishing_sentences", "RKF-TERMS-DISTINGUISHING-SENTENCES", 2, 0, false);
        declareFunction("rkf_region_clarification", "RKF-REGION-CLARIFICATION", 2, 0, false);
        declareFunction("rkf_salient_generalization", "RKF-SALIENT-GENERALIZATION", 2, 0, false);
        declareFunction("clear_rkf_salient_generalizations", "CLEAR-RKF-SALIENT-GENERALIZATIONS", 0, 0, false);
        declareFunction("remove_rkf_salient_generalizations", "REMOVE-RKF-SALIENT-GENERALIZATIONS", 2, 5, false);
        declareFunction("rkf_salient_generalizations_internal", "RKF-SALIENT-GENERALIZATIONS-INTERNAL", 7, 0, false);
        declareFunction("rkf_salient_generalizations", "RKF-SALIENT-GENERALIZATIONS", 2, 5, false);
        declareFunction("rkf_most_notable_genls", "RKF-MOST-NOTABLE-GENLS", 4, 0, false);
        declareFunction("rkf_add_most_notable_isas", "RKF-ADD-MOST-NOTABLE-ISAS", 5, 0, false);
        declareFunction("rkf_add_most_specific_isa", "RKF-ADD-MOST-SPECIFIC-ISA", 5, 0, false);
        declareFunction("rkf_add_most_specific_genl", "RKF-ADD-MOST-SPECIFIC-GENL", 5, 0, false);
        declareFunction("rkf_update_generalizations", "RKF-UPDATE-GENERALIZATIONS", 4, 0, false);
        declareFunction("rkf_generalization_okP", "RKF-GENERALIZATION-OK?", 7, 0, false);
        declareFunction("rkf_clarifying_collectionP", "RKF-CLARIFYING-COLLECTION?", 2, 0, false);
        declareFunction("rkf_terms_distinguishing_pictures", "RKF-TERMS-DISTINGUISHING-PICTURES", 2, 0, false);
        declareFunction("rkf_terms_distinguishing_picture_database_url", "RKF-TERMS-DISTINGUISHING-PICTURE-DATABASE-URL", 1, 0, false);
        declareFunction("rkf_salient_argn_isa", "RKF-SALIENT-ARGN-ISA", 3, 0, false);
        declareFunction("rkf_argn_isa", "RKF-ARGN-ISA", 3, 0, false);
        declareFunction("rkf_argn_genl", "RKF-ARGN-GENL", 3, 0, false);
        declareFunction("rkf_rmp_corresponding_argnum", "RKF-RMP-CORRESPONDING-ARGNUM", 2, 0, false);
        declareFunction("rkf_arity", "RKF-ARITY", 1, 0, false);
        declareFunction("rkf_make_type_level", "RKF-MAKE-TYPE-LEVEL", 1, 0, false);
        declareFunction("rkf_reln_type_level_in_argP", "RKF-RELN-TYPE-LEVEL-IN-ARG?", 3, 0, false);
        declareFunction("rkf_quantified_binary_predicate_naut_p", "RKF-QUANTIFIED-BINARY-PREDICATE-NAUT-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_concept_clarifier_file() {
        deflexical("*MAX-RKF-CLARIFYING-SENTENCES*", ONE_INTEGER);
        deflexical("*RKF-SALIENT-GENERALIZATIONS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_concept_clarifier_file() {
        memoization_state.note_globally_cached_function(RKF_SALIENT_GENERALIZATIONS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_concept_clarifier_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_concept_clarifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_concept_clarifier_file();
    }

    static {
    }

    static private final SubLList $list_alt6 = list(makeSymbol("?SENT"));

    static private final SubLList $list_alt7 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), TWO_INTEGER);

    static private final SubLList $list_alt8 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLList $list_alt10 = list(reader_make_constant_shell("geographicalSubRegionsOfUSState"), reader_make_constant_shell("geographicalSubRegionsOfCountry"), reader_make_constant_shell("geographicalSubRegionsOfContinent"), reader_make_constant_shell("geographicalSubRegionsOfBodyOfWater"));

    static private final SubLSymbol $sym13$CLOSED_ = makeSymbol("CLOSED?");

    static private final SubLSymbol $sym14$GENL_IN_ANY_MT_ = makeSymbol("GENL-IN-ANY-MT?");

    static private final SubLList $list_alt16 = list(makeSymbol("?GENLS"));

    static private final SubLList $list_alt17 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?GENLS")), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    static private final SubLList $list_alt20 = list(makeSymbol("?ISA"));

    static private final SubLList $list_alt21 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?ISA")), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    static private final SubLString $str_alt27$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt32$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt33$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt34$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLSymbol $sym37$_PATHNAME = makeSymbol("?PATHNAME");

    static private final SubLSymbol $sym39$_URL = makeSymbol("?URL");

    static private final SubLList $list_alt41 = list(makeSymbol("RMP"), makeSymbol("BINPRED"));

    static private final SubLSymbol $sym42$_RMP_ARGNUM = makeSymbol("?RMP-ARGNUM");

    static private final SubLSymbol $sym47$SPEC_ = makeSymbol("SPEC?");
}

/**
 * Total time: 610 ms
 */
