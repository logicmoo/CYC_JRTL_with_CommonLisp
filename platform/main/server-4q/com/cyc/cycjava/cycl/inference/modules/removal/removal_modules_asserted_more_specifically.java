package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_gp_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.tva_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_asserted_more_specifically extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically";
    public static String myFingerPrint = "0e52cf033bda483b29ed4bd5f207f8ff37bbcf7bf4ff45be6e49fa434dfa1d79";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 900L)
    private static SubLSymbol $use_asserted_more_specifically_via_tva_supportP$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 8500L)
    private static SubLSymbol $assertion_under_consideration_for_asserted_more_specifically$;
    private static SubLObject $$assertedMoreSpecifically;
    private static SubLSymbol $BOTH;
    private static SubLObject $$not;
    private static SubLObject $$thereExists;
    private static SubLSymbol $sym4$_COL;
    private static SubLObject $$and;
    private static SubLObject $$assertedSentence;
    private static SubLList $list7;
    private static SubLObject $$different;
    private static SubLObject $$genls;
    private static SubLSymbol $OPAQUE;
    private static SubLString $str11$Inconsistent_operators__s_and__s;
    private static SubLList $list12;
    private static SubLObject $$WFFConstraintPredicate;
    private static SubLObject $$transitiveViaArg;
    private static SubLList $list15;
    private static SubLSymbol $GAF;
    private static SubLSymbol $TRUE;
    private static SubLSymbol $GENLMT;
    private static SubLObject $$genlMt;
    private static SubLSymbol $GENLS;
    private static SubLSymbol $sym21$RELEVANT_PRED_IS_SPEC_PRED;
    private static SubLSymbol $GENLPREDS;
    private static SubLObject $$genlInverse;
    private static SubLObject $$genlPreds;
    private static SubLSymbol $sym25$RELEVANT_PRED_IS_SPEC_INVERSE;
    private static SubLSymbol $FALSE;
    private static SubLList $list27;
    private static SubLList $list28;
    private static SubLList $list29;
    private static SubLList $list30;
    private static SubLSymbol $TVA;
    private static SubLSymbol $TVAI;
    private static SubLSymbol $sym33$NON_TVA_GAF_ASSERTION_P;
    private static SubLSymbol $QUERY;
    private static SubLString $str35$More_than_one_assertion_in_justif;
    private static SubLObject $$transitiveViaArgInverse;
    private static SubLObject $$isa;
    private static SubLSymbol $REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_POS;
    private static SubLList $list39;
    private static SubLSymbol $REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_NEG;
    private static SubLList $list41;
    private static SubLSymbol $REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_POS;
    private static SubLList $list43;
    private static SubLSymbol $REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_NEG;
    private static SubLList $list45;
    private static SubLSymbol $REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_POS;
    private static SubLList $list47;
    private static SubLSymbol $REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_NEG;
    private static SubLList $list49;
    private static SubLObject $$strongestAssertedSentence;
    private static SubLSymbol $REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS;
    private static SubLList $list52;
    private static SubLSymbol $sym53$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_COST;
    private static SubLList $list54;
    private static SubLSymbol $sym55$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_EXPAND;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 1000L)
    public static SubLObject removal_asserted_more_specifically_check_pos_internals(SubLObject operator, SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject more_specific_assertions = removal_more_specific_asserted_assertions(operator, asent);
        SubLObject more_supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject assertion = NIL;
        SubLObject assertion_$1 = NIL;
        SubLObject supports = NIL;
        SubLObject supports_$2 = NIL;
        assertion = more_specific_assertions;
        assertion_$1 = assertion.first();
        supports = more_supports;
        supports_$2 = supports.first();
        while (NIL != supports || NIL != assertion) {
            backward.removal_add_node(assertion_$1, NIL, supports_$2);
            assertion = assertion.rest();
            assertion_$1 = assertion.first();
            supports = supports.rest();
            supports_$2 = supports.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 1400L)
    public static SubLObject removal_asserted_more_specifically_check_neg_internals(SubLObject operator, SubLObject asent, SubLObject v_bindings, SubLObject more_supports) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (more_supports == UNPROVIDED) {
            more_supports = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject more_specific_assertions = removal_more_specific_asserted_assertions(operator, asent);
        SubLObject yet_more_supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        more_supports = append(more_supports, yet_more_supports);
        SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject v_term = cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED);
        SubLObject collection = cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED);
        SubLObject support = (NIL != transitive_via_genls_in_arg2P(operator))
                ? list($$not, list($$thereExists, $sym4$_COL, list($$and, list($$assertedSentence, listS(operator, v_term, $list7)), list($$different, $sym4$_COL, collection), list($$genls, $sym4$_COL, collection))))
                : asent;
        if (NIL == more_specific_assertions) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, support, UNPROVIDED, UNPROVIDED), v_bindings, more_supports);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 2400L)
    public static SubLObject removal_more_specific_asserted_assertions(SubLObject operator, SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !operator.eql(cycl_utilities.sentence_truth_function(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
            Errors.error($str11$Inconsistent_operators__s_and__s, operator, cycl_utilities.sentence_truth_function(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)));
        }
        SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject more_specific_assertions = NIL;
        SubLObject more_supports = NIL;
        thread.resetMultipleValues();
        SubLObject more_specific_assertions_raw = more_specific_asserted_assertions(sentence);
        SubLObject more_supports_raw = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject more_specific_assertion = NIL;
        SubLObject more_specific_assertion_$3 = NIL;
        SubLObject more_support = NIL;
        SubLObject more_support_$4 = NIL;
        more_specific_assertion = more_specific_assertions_raw;
        more_specific_assertion_$3 = more_specific_assertion.first();
        more_support = more_supports_raw;
        more_support_$4 = more_support.first();
        while (NIL != more_support || NIL != more_specific_assertion) {
            if (NIL == kb_utilities.kbeq(more_specific_assertion_$3, $assertion_under_consideration_for_asserted_more_specifically$.getDynamicValue(thread))) {
                more_specific_assertions = cons(more_specific_assertion_$3, more_specific_assertions);
                more_supports = cons(more_support_$4, more_supports);
            }
            more_specific_assertion = more_specific_assertion.rest();
            more_specific_assertion_$3 = more_specific_assertion.first();
            more_support = more_support.rest();
            more_support_$4 = more_support.first();
        }
        return Values.values(more_specific_assertions, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 3300L)
    public static SubLObject more_specific_asserted_assertions(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != subl_promotions.memberP(operator, $list12, UNPROVIDED, UNPROVIDED)) {
            return more_specific_asserted_assertions_for_isa_genls(operator, asent);
        }
        if (NIL != transitive_via_genls_in_arg2P(operator)) {
            return more_specific_asserted_assertions_for_isa_genls(operator, asent);
        }
        if (NIL != $use_asserted_more_specifically_via_tva_supportP$.getDynamicValue(thread) && NIL == kb_utilities.kbeq(operator, $$not) && NIL == isa.isa_in_any_mtP(operator, $$WFFConstraintPredicate)) {
            return more_specific_asserted_assertions_for_other_pred_via_tva(operator, asent);
        }
        return more_specific_asserted_assertions_for_other_pred(operator, asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 4200L)
    public static SubLObject transitive_via_genls_in_arg2P(SubLObject pred) {
        return kb_mapping_utilities.tuple_holds(listS($$transitiveViaArg, pred, $list15), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 4400L)
    public static SubLObject more_specific_asserted_assertions_for_isa_genls(SubLObject operator, SubLObject asent) {
        SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject more_specific_assertions = NIL;
        SubLObject more_supports = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, operator)) {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, operator);
            SubLObject done_var = NIL;
            SubLObject token_var = NIL;
            while (NIL == done_var) {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$5 = NIL;
                        SubLObject token_var_$6 = NIL;
                        while (NIL == done_var_$5) {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                            SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion));
                            if (NIL != valid_$7) {
                                SubLObject asserted_collection = assertions_high.gaf_arg2(assertion);
                                if (asserted_collection.equal(collection)) {
                                    SubLObject mt = assertions_high.assertion_mt(assertion);
                                    if (NIL != genl_mts.proper_genl_mtP(more_specific_asserted_assertion_asent_mt(), mt, UNPROVIDED, UNPROVIDED)) {
                                        SubLObject support = arguments.make_hl_support($GENLMT, list($$genlMt, more_specific_asserted_assertion_asent_mt(), mt), UNPROVIDED, UNPROVIDED);
                                        more_specific_assertions = cons(assertion, more_specific_assertions);
                                        more_supports = cons(support, more_supports);
                                    } else if (NIL != within_assertive_wff_forward_inferenceP()) {
                                        SubLObject stronger_argumentP = NIL;
                                        if (NIL == stronger_argumentP) {
                                            SubLObject csome_list_var = assertions_high.assertion_arguments(assertion);
                                            SubLObject argument = NIL;
                                            argument = csome_list_var.first();
                                            while (NIL == stronger_argumentP && NIL != csome_list_var) {
                                                if (NIL != arguments.asserted_argument_p(argument)) {
                                                    stronger_argumentP = T;
                                                } else if (NIL == wff.assertive_wff_deductionP(argument)) {
                                                    stronger_argumentP = T;
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                argument = csome_list_var.first();
                                            }
                                        }
                                        if (NIL != stronger_argumentP) {
                                            more_specific_assertions = cons(assertion, more_specific_assertions);
                                        }
                                    }
                                } else if (NIL != genls.genlsP(asserted_collection, collection, UNPROVIDED, UNPROVIDED)) {
                                    SubLObject support2 = arguments.make_hl_support($GENLS, list($$genls, asserted_collection, collection), UNPROVIDED, UNPROVIDED);
                                    more_specific_assertions = cons(assertion, more_specific_assertions);
                                    more_supports = cons(support2, more_supports);
                                }
                            }
                            done_var_$5 = makeBoolean(NIL == valid_$7);
                        }
                    } finally {
                        SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                            SubLObject _values = Values.getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            }
        }
        return Values.values(more_specific_assertions, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 6500L)
    public static SubLObject more_specific_asserted_assertions_for_other_pred(SubLObject operator, SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject rargs = Sequences.reverse(args);
        SubLObject base_mt = more_specific_asserted_assertion_asent_mt();
        SubLObject more_specific_assertions = NIL;
        SubLObject more_supports = NIL;
        if (NIL != forts.fort_p(args.first())) {
            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind($sym21$RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(operator, thread);
                SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(args.first(), ONE_INTEGER, pred_var)) {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(args.first(), ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$8 = NIL;
                                SubLObject token_var_$9 = NIL;
                                while (NIL == done_var_$8) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
                                    SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(assertion));
                                    if (NIL != valid_$10 && NIL != ((NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), rargs)
                                            : Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), args))) {
                                        SubLObject pred = assertions_high.gaf_arg0(assertion);
                                        SubLObject mt = assertions_high.assertion_mt(assertion);
                                        if (!pred.equal(operator)) {
                                            SubLObject support = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred, operator), UNPROVIDED, UNPROVIDED)
                                                    : arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred, operator), UNPROVIDED, UNPROVIDED);
                                            more_specific_assertions = cons(assertion, more_specific_assertions);
                                            more_supports = cons(support, more_supports);
                                        }
                                        if (NIL != genl_mts.proper_genl_mtP(base_mt, mt, UNPROVIDED, UNPROVIDED)) {
                                            SubLObject support = arguments.make_hl_support($GENLMT, el_utilities.make_binary_formula($$genlMt, base_mt, mt), UNPROVIDED, UNPROVIDED);
                                            more_specific_assertions = cons(assertion, more_specific_assertions);
                                            more_supports = cons(support, more_supports);
                                        }
                                    }
                                    done_var_$8 = makeBoolean(NIL == valid_$10);
                                }
                            } finally {
                                SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                }
            } finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
            if (NIL != kb_gp_mapping.dgaigp_binaryP(operator)) {
                _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind($sym25$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind(operator, thread);
                    SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(args.first(), arity.binary_arg_swap(ONE_INTEGER), pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(args.first(), arity.binary_arg_swap(ONE_INTEGER), pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$9 = NIL;
                                    SubLObject token_var_$10 = NIL;
                                    while (NIL == done_var_$9) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                        SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(assertion));
                                        if (NIL != valid_$11) {
                                            SubLObject _prev_bind_0_$12 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                if (NIL != ((NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), rargs)
                                                        : Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), args))) {
                                                    SubLObject pred2 = assertions_high.gaf_arg0(assertion);
                                                    SubLObject mt2 = assertions_high.assertion_mt(assertion);
                                                    if (!pred2.equal(operator)) {
                                                        SubLObject support2 = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred2, operator), UNPROVIDED, UNPROVIDED)
                                                                : arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred2, operator), UNPROVIDED, UNPROVIDED);
                                                        more_specific_assertions = cons(assertion, more_specific_assertions);
                                                        more_supports = cons(support2, more_supports);
                                                    }
                                                    if (NIL != genl_mts.proper_genl_mtP(base_mt, mt2, UNPROVIDED, UNPROVIDED)) {
                                                        SubLObject support2 = arguments.make_hl_support($GENLMT, el_utilities.make_binary_formula($$genlMt, base_mt, mt2), UNPROVIDED, UNPROVIDED);
                                                        more_specific_assertions = cons(assertion, more_specific_assertions);
                                                        more_supports = cons(support2, more_supports);
                                                    }
                                                }
                                            } finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$12, thread);
                                            }
                                        }
                                        done_var_$9 = makeBoolean(NIL == valid_$11);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values2 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                } finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            SubLObject cdolist_list_var = genl_predicates.all_spec_preds(operator, UNPROVIDED, UNPROVIDED);
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject pred_var = spec_pred;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    SubLObject str = NIL;
                    SubLObject _prev_bind_3 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    SubLObject _prev_bind_5 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    SubLObject _prev_bind_6 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    SubLObject _prev_bind_7 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    SubLObject _prev_bind_8 = utilities_macros.$progress_count$.currentBinding(thread);
                    SubLObject _prev_bind_9 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_10 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind(T, thread);
                        utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                        utilities_macros.noting_progress_preamble(str);
                        SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var2 = NIL;
                        SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$10 = NIL;
                                    SubLObject token_var_$11 = NIL;
                                    while (NIL == done_var_$10) {
                                        SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$11);
                                        SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(assertion2));
                                        if (NIL != valid_$12 && NIL != ((NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion2), UNPROVIDED), rargs)
                                                : Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion2), UNPROVIDED), args))) {
                                            SubLObject pred3 = assertions_high.gaf_arg0(assertion2);
                                            SubLObject mt3 = assertions_high.assertion_mt(assertion2);
                                            if (!pred3.equal(operator)) {
                                                SubLObject support3 = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred3, operator), UNPROVIDED, UNPROVIDED)
                                                        : arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred3, operator), UNPROVIDED, UNPROVIDED);
                                                more_specific_assertions = cons(assertion2, more_specific_assertions);
                                                more_supports = cons(support3, more_supports);
                                            }
                                            if (NIL != genl_mts.proper_genl_mtP(base_mt, mt3, UNPROVIDED, UNPROVIDED)) {
                                                SubLObject support3 = arguments.make_hl_support($GENLMT, el_utilities.make_binary_formula($$genlMt, base_mt, mt3), UNPROVIDED, UNPROVIDED);
                                                more_specific_assertions = cons(assertion2, more_specific_assertions);
                                                more_supports = cons(support3, more_supports);
                                            }
                                        }
                                        done_var_$10 = makeBoolean(NIL == valid_$12);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values3 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    } finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_10, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_8, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_3, thread);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            }
            if (NIL != arity.binaryP(operator)) {
                SubLObject _prev_bind_0 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                try {
                    kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                    SubLObject cdolist_list_var2 = genl_predicates.all_spec_inverses(operator, UNPROVIDED, UNPROVIDED);
                    SubLObject spec_pred2 = NIL;
                    spec_pred2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        SubLObject pred_var2 = spec_pred2;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                            SubLObject str2 = NIL;
                            SubLObject _prev_bind_0_$15 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            SubLObject _prev_bind_11 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                            SubLObject _prev_bind_12 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            SubLObject _prev_bind_13 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                            SubLObject _prev_bind_14 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                            SubLObject _prev_bind_15 = utilities_macros.$progress_count$.currentBinding(thread);
                            SubLObject _prev_bind_16 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                            SubLObject _prev_bind_17 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$is_noting_progressP$.bind(T, thread);
                                utilities_macros.$silent_progressP$.bind((NIL != str2) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                                utilities_macros.noting_progress_preamble(str2);
                                SubLObject iterator_var3 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                                SubLObject done_var3 = NIL;
                                SubLObject token_var3 = NIL;
                                while (NIL == done_var3) {
                                    SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                                    SubLObject valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                                    if (NIL != valid3) {
                                        utilities_macros.note_progress();
                                        SubLObject final_index_iterator3 = NIL;
                                        try {
                                            final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$11 = NIL;
                                            SubLObject token_var_$12 = NIL;
                                            while (NIL == done_var_$11) {
                                                SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$12);
                                                SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(assertion3));
                                                if (NIL != valid_$13 && NIL != ((NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion3), UNPROVIDED), rargs)
                                                        : Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion3), UNPROVIDED), args))) {
                                                    SubLObject pred4 = assertions_high.gaf_arg0(assertion3);
                                                    SubLObject mt4 = assertions_high.assertion_mt(assertion3);
                                                    if (!pred4.equal(operator)) {
                                                        SubLObject support4 = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred4, operator), UNPROVIDED, UNPROVIDED)
                                                                : arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred4, operator), UNPROVIDED, UNPROVIDED);
                                                        more_specific_assertions = cons(assertion3, more_specific_assertions);
                                                        more_supports = cons(support4, more_supports);
                                                    }
                                                    if (NIL != genl_mts.proper_genl_mtP(base_mt, mt4, UNPROVIDED, UNPROVIDED)) {
                                                        SubLObject support4 = arguments.make_hl_support($GENLMT, el_utilities.make_binary_formula($$genlMt, base_mt, mt4), UNPROVIDED, UNPROVIDED);
                                                        more_specific_assertions = cons(assertion3, more_specific_assertions);
                                                        more_supports = cons(support4, more_supports);
                                                    }
                                                }
                                                done_var_$11 = makeBoolean(NIL == valid_$13);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values4 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator3) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                                }
                                                Values.restoreValuesFromVector(_values4);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                            }
                                        }
                                    }
                                    done_var3 = makeBoolean(NIL == valid3);
                                }
                                utilities_macros.noting_progress_postamble();
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_17, thread);
                                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_16, thread);
                                utilities_macros.$progress_count$.rebind(_prev_bind_15, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_14, thread);
                                utilities_macros.$progress_notification_count$.rebind(_prev_bind_13, thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_12, thread);
                                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_11, thread);
                                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$15, thread);
                            }
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        spec_pred2 = cdolist_list_var2.first();
                    }
                } finally {
                    kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return Values.values(more_specific_assertions, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 8600L)
    public static SubLObject more_specific_asserted_assertion_asent_mt() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p($assertion_under_consideration_for_asserted_more_specifically$.getDynamicValue(thread))
                && NIL != genl_mts.genl_mtP(mt_relevance_macros.$mt$.getDynamicValue(thread), assertions_high.assertion_mt($assertion_under_consideration_for_asserted_more_specifically$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED)) {
            return assertions_high.assertion_mt($assertion_under_consideration_for_asserted_more_specifically$.getDynamicValue(thread));
        }
        if (NIL != assertion_handles.assertion_p(forward.current_forward_inference_assertion())) {
            return assertions_high.assertion_mt(forward.current_forward_inference_assertion());
        }
        return mt_relevance_macros.$mt$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 9100L)
    public static SubLObject within_assertive_wff_forward_inferenceP() {
        return wff.assertive_wff_ruleP(forward.current_forward_inference_rule());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 9200L)
    public static SubLObject more_specific_asserted_assertions_for_other_pred_via_tva(SubLObject operator, SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tva_pred_signature = tva_utilities.tva_pred_signature(operator);
        SubLObject more_specific_asents = NIL;
        SubLObject more_supports = NIL;
        SubLObject doneP = NIL;
        SubLObject negatedP = cycl_utilities.negatedP(asent);
        SubLObject truth = (NIL != negatedP) ? $FALSE : $TRUE;
        SubLObject real_asent = (NIL != negatedP) ? cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED) : asent;
        if (NIL == backward.removal_ask_justifications(real_asent, mt_relevance_macros.$mt$.getDynamicValue(thread), truth, $list27)) {
            return Values.values(NIL, NIL);
        }
        if (NIL == mt_relevance_macros.any_or_all_mts_are_relevantP()) {
            SubLObject cdolist_list_var = czer_meta.find_visible_assertions_cycl(asent, UNPROVIDED);
            SubLObject more_specific_assertion = NIL;
            more_specific_assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == equals.equalsP(assertions_high.assertion_mt(more_specific_assertion), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    return Values.values(list(more_specific_assertion), list(arguments.make_hl_support($GENLMT, el_utilities.make_binary_formula($$genlMt, mt_relevance_macros.$mt$.getDynamicValue(thread), assertions_high.assertion_mt(more_specific_assertion)), UNPROVIDED, UNPROVIDED)));
                }
                cdolist_list_var = cdolist_list_var.rest();
                more_specific_assertion = cdolist_list_var.first();
            }
        }
        tva_pred_signature = cons($list28, tva_pred_signature);
        if (NIL == doneP) {
            SubLObject csome_list_var = tva_pred_signature;
            SubLObject tva_arg_position_preds_tuple = NIL;
            tva_arg_position_preds_tuple = csome_list_var.first();
            while (NIL == doneP && NIL != csome_list_var) {
                SubLObject current;
                SubLObject datum = current = tva_arg_position_preds_tuple;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
                SubLObject temp = current.rest();
                current = current.first();
                SubLObject argnum = NIL;
                SubLObject tva_type = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
                argnum = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
                tva_type = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject tva_preds;
                    current = (tva_preds = temp);
                    SubLObject v_term = cycl_utilities.atomic_sentence_arg(asent, argnum, UNPROVIDED);
                    if (NIL == list_utilities.member_kbeqP(v_term, $list30) && NIL == doneP) {
                        SubLObject csome_list_var_$26 = tva_preds;
                        SubLObject tva_pred = NIL;
                        tva_pred = csome_list_var_$26.first();
                        while (NIL == doneP && NIL != csome_list_var_$26) {
                            SubLObject more_specific_terms = NIL;
                            SubLObject more_specific_supports = NIL;
                            SubLObject pcase_var = tva_type;
                            if (pcase_var.eql($TVA)) {
                                thread.resetMultipleValues();
                                SubLObject more_specific_terms_$27 = ghl_search_methods.ghl_max_inferiors(v_term, tva_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject more_specific_supports_$28 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                more_specific_terms = more_specific_terms_$27;
                                more_specific_supports = more_specific_supports_$28;
                            } else if (pcase_var.eql($TVAI)) {
                                thread.resetMultipleValues();
                                SubLObject more_specific_terms_$28 = ghl_search_methods.ghl_min_superiors(v_term, tva_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject more_specific_supports_$29 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                more_specific_terms = more_specific_terms_$28;
                                more_specific_supports = more_specific_supports_$29;
                            }
                            if (NIL == doneP) {
                                SubLObject more_specific_term = NIL;
                                SubLObject more_specific_term_$31 = NIL;
                                SubLObject more_specific_support = NIL;
                                SubLObject more_specific_support_$32 = NIL;
                                more_specific_term = more_specific_terms;
                                more_specific_term_$31 = more_specific_term.first();
                                more_specific_support = more_specific_supports;
                                more_specific_support_$32 = more_specific_support.first();
                                while (NIL == doneP && (NIL != more_specific_support || NIL != more_specific_term)) {
                                    SubLObject more_specific_asent = el_utilities.replace_formula_arg(argnum, more_specific_term_$31, asent);
                                    SubLObject tva_supports = backward.removal_ask_justifications(more_specific_asent, mt_relevance_macros.$mt$.getDynamicValue(thread), $TRUE, $list27).first();
                                    if (NIL != tva_supports) {
                                        if (NIL != list_utilities.singletonP(tva_supports) && NIL != arguments.hl_support_p(tva_supports.first()) && $TVA == arguments.hl_support_module(tva_supports.first())) {
                                            tva_supports = hl_supports.hl_justify(tva_supports.first());
                                        }
                                        SubLObject tva_support_assertions = list_utilities.find_all_if($sym33$NON_TVA_GAF_ASSERTION_P, tva_supports, UNPROVIDED);
                                        if (NIL != list_utilities.singletonP(tva_support_assertions)) {
                                            more_specific_asents = cons(tva_support_assertions.first(), more_specific_asents);
                                        } else if (NIL == tva_support_assertions) {
                                            more_specific_asents = cons(arguments.make_hl_support($QUERY, more_specific_asent, UNPROVIDED, UNPROVIDED), more_specific_asents);
                                        } else {
                                            Errors.warn($str35$More_than_one_assertion_in_justif, more_specific_asent);
                                            more_specific_asents = cons(tva_support_assertions.first(), more_specific_asents);
                                        }
                                        SubLObject supports = tva_supports;
                                        if (NIL != arguments.support_p(more_specific_support_$32)) {
                                            supports = cons(more_specific_support_$32, supports);
                                        }
                                        SubLObject tva_sentence = arguments.make_hl_support($QUERY, list((tva_type == $TVA) ? $$transitiveViaArg : $$transitiveViaArgInverse, operator, tva_pred, argnum), UNPROVIDED, UNPROVIDED);
                                        supports = cons(tva_sentence, supports);
                                        more_supports = cons(supports, more_supports);
                                        doneP = T;
                                    }
                                    more_specific_term = more_specific_term.rest();
                                    more_specific_term_$31 = more_specific_term.first();
                                    more_specific_support = more_specific_support.rest();
                                    more_specific_support_$32 = more_specific_support.first();
                                }
                            }
                            csome_list_var_$26 = csome_list_var_$26.rest();
                            tva_pred = csome_list_var_$26.first();
                        }
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list29);
                }
                csome_list_var = csome_list_var.rest();
                tva_arg_position_preds_tuple = csome_list_var.first();
            }
        }
        return Values.values(more_specific_asents, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 12900L)
    public static SubLObject non_tva_gaf_assertion_p(SubLObject assertion) {
        return makeBoolean(NIL != assertions_high.gaf_assertionP(assertion) && NIL == list_utilities.member_kbeqP(assertions_high.gaf_predicate(assertion), tva_utilities.get_tva_predicates()));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 13000L)
    public static SubLObject removal_asserted_more_specifically_isa_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_more_specifically_check_pos_internals($$isa, asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 14300L)
    public static SubLObject removal_asserted_more_specifically_isa_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_more_specifically_check_neg_internals($$isa, asent, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 15300L)
    public static SubLObject removal_asserted_more_specifically_genls_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_more_specifically_check_pos_internals($$genls, asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 16600L)
    public static SubLObject removal_asserted_more_specifically_genls_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_more_specifically_check_neg_internals($$genls, asent, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 17600L)
    public static SubLObject removal_asserted_more_specifically_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_more_specifically_check_pos_internals(cycl_utilities.atomic_sentence_predicate(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)), asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 18500L)
    public static SubLObject removal_asserted_more_specifically_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_more_specifically_check_neg_internals(cycl_utilities.atomic_sentence_predicate(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)), asent, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 20400L)
    public static SubLObject removal_strongest_asserted_sentence_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_modules_asserted_formula.removal_asserted_sentence_lookup_pos_cost(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 20600L)
    public static SubLObject removal_strongest_asserted_sentence_lookup_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iterator = removal_modules_asserted_formula.removal_asserted_sentence_lookup_iterator(asent);
        if (NIL != iterator) {
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                SubLObject tuple = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    SubLObject datum = current = tuple;
                    SubLObject v_bindings = NIL;
                    SubLObject gaf = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list54);
                    v_bindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list54);
                    gaf = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject _prev_bind_0 = $assertion_under_consideration_for_asserted_more_specifically$.currentBinding(thread);
                        try {
                            $assertion_under_consideration_for_asserted_more_specifically$.bind(gaf, thread);
                            SubLObject bound_asent = bindings.subst_bindings(v_bindings, asent);
                            SubLObject inner_asent = cycl_utilities.atomic_sentence_arg1(bound_asent, UNPROVIDED);
                            SubLObject operator = cycl_utilities.atomic_sentence_predicate(inner_asent);
                            removal_asserted_more_specifically_check_neg_internals(operator, bound_asent, v_bindings, list(gaf));
                        } finally {
                            $assertion_under_consideration_for_asserted_more_specifically$.rebind(_prev_bind_0, thread);
                        }
                    } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, $list54);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_asserted_more_specifically_file() {
        declareFunction(myName, "removal_asserted_more_specifically_check_pos_internals", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-INTERNALS", 2, 0, false);
        declareFunction(myName, "removal_asserted_more_specifically_check_neg_internals", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-INTERNALS", 2, 2, false);
        declareFunction(myName, "removal_more_specific_asserted_assertions", "REMOVAL-MORE-SPECIFIC-ASSERTED-ASSERTIONS", 2, 0, false);
        declareFunction(myName, "more_specific_asserted_assertions", "MORE-SPECIFIC-ASSERTED-ASSERTIONS", 1, 0, false);
        declareFunction(myName, "transitive_via_genls_in_arg2P", "TRANSITIVE-VIA-GENLS-IN-ARG2?", 1, 0, false);
        declareFunction(myName, "more_specific_asserted_assertions_for_isa_genls", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-ISA-GENLS", 2, 0, false);
        declareFunction(myName, "more_specific_asserted_assertions_for_other_pred", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-OTHER-PRED", 2, 0, false);
        declareFunction(myName, "more_specific_asserted_assertion_asent_mt", "MORE-SPECIFIC-ASSERTED-ASSERTION-ASENT-MT", 0, 0, false);
        declareFunction(myName, "within_assertive_wff_forward_inferenceP", "WITHIN-ASSERTIVE-WFF-FORWARD-INFERENCE?", 0, 0, false);
        declareFunction(myName, "more_specific_asserted_assertions_for_other_pred_via_tva", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-OTHER-PRED-VIA-TVA", 2, 0, false);
        declareFunction(myName, "non_tva_gaf_assertion_p", "NON-TVA-GAF-ASSERTION-P", 1, 0, false);
        declareFunction(myName, "removal_asserted_more_specifically_isa_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_asserted_more_specifically_isa_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_asserted_more_specifically_genls_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_asserted_more_specifically_genls_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_asserted_more_specifically_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_asserted_more_specifically_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_strongest_asserted_sentence_lookup_pos_cost", "REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_strongest_asserted_sentence_lookup_pos_expand", "REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_asserted_more_specifically_file() {
        $use_asserted_more_specifically_via_tva_supportP$ = SubLFiles.defparameter("*USE-ASSERTED-MORE-SPECIFICALLY-VIA-TVA-SUPPORT?*", T);
        $assertion_under_consideration_for_asserted_more_specifically$ = SubLFiles.defparameter("*ASSERTION-UNDER-CONSIDERATION-FOR-ASSERTED-MORE-SPECIFICALLY*", NIL);
        return NIL;
    }

    public static SubLObject setup_removal_modules_asserted_more_specifically_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertedMoreSpecifically);
        preference_modules.doomed_unless_all_args_bindable($BOTH, $$assertedMoreSpecifically);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_POS, $list39);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_NEG, $list41);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_POS, $list43);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_NEG, $list45);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_POS, $list47);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_NEG, $list49);
        inference_modules.register_solely_specific_removal_module_predicate($$strongestAssertedSentence);
        inference_modules.inference_removal_module($REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS, $list52);
        utilities_macros.note_funcall_helper_function($sym53$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_COST);
        utilities_macros.note_funcall_helper_function($sym55$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_EXPAND);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_asserted_more_specifically_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_asserted_more_specifically_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_asserted_more_specifically_file();
    }

    static {
        me = new removal_modules_asserted_more_specifically();
        $use_asserted_more_specifically_via_tva_supportP$ = null;
        $assertion_under_consideration_for_asserted_more_specifically$ = null;
        $$assertedMoreSpecifically = makeConstSym(("assertedMoreSpecifically"));
        $BOTH = makeKeyword("BOTH");
        $$not = makeConstSym(("not"));
        $$thereExists = makeConstSym(("thereExists"));
        $sym4$_COL = makeSymbol("?COL");
        $$and = makeConstSym(("and"));
        $$assertedSentence = makeConstSym(("assertedSentence"));
        $list7 = list(makeSymbol("?COL"));
        $$different = makeConstSym(("different"));
        $$genls = makeConstSym(("genls"));
        $OPAQUE = makeKeyword("OPAQUE");
        $str11$Inconsistent_operators__s_and__s = makeString("Inconsistent operators ~s and ~s");
        $list12 = list(makeConstSym(("isa")), makeConstSym(("genls")));
        $$WFFConstraintPredicate = makeConstSym(("WFFConstraintPredicate"));
        $$transitiveViaArg = makeConstSym(("transitiveViaArg"));
        $list15 = list(makeConstSym(("genls")), TWO_INTEGER);
        $GAF = makeKeyword("GAF");
        $TRUE = makeKeyword("TRUE");
        $GENLMT = makeKeyword("GENLMT");
        $$genlMt = makeConstSym(("genlMt"));
        $GENLS = makeKeyword("GENLS");
        $sym21$RELEVANT_PRED_IS_SPEC_PRED = makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
        $GENLPREDS = makeKeyword("GENLPREDS");
        $$genlInverse = makeConstSym(("genlInverse"));
        $$genlPreds = makeConstSym(("genlPreds"));
        $sym25$RELEVANT_PRED_IS_SPEC_INVERSE = makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
        $FALSE = makeKeyword("FALSE");
        $list27 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);
        $list28 = list(list(ZERO_INTEGER, makeKeyword("TVA")), makeConstSym(("genlPreds")));
        $list29 = cons(list(makeSymbol("ARGNUM"), makeSymbol("TVA-TYPE")), makeSymbol("TVA-PREDS"));
        $list30 = list(makeConstSym(("Thing")), makeConstSym(("Collection")));
        $TVA = makeKeyword("TVA");
        $TVAI = makeKeyword("TVAI");
        $sym33$NON_TVA_GAF_ASSERTION_P = makeSymbol("NON-TVA-GAF-ASSERTION-P");
        $QUERY = makeKeyword("QUERY");
        $str35$More_than_one_assertion_in_justif = makeString("More than one assertion in justification of ~S");
        $$transitiveViaArgInverse = makeConstSym(("transitiveViaArgInverse"));
        $$isa = makeConstSym(("isa"));
        $REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_POS = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS");
        $list39 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedMoreSpecifically")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedMoreSpecifically")), list(makeConstSym(("isa")), makeKeyword("FORT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedMoreSpecifically (#$isa <instance> <collection>)) where <instance> and <collection> are FORTs "),
                makeKeyword("EXAMPLE"), makeString("(#$assertedMoreSpecifically (#$isa #$genls #$Predicate)) \nfrom the asserted sentence in the KB (#isa #$genls #$VocabularyDefiningPredicate) ") });
        $REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_NEG = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG");
        $list41 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertedMoreSpecifically")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertedMoreSpecifically")), list(makeConstSym(("isa")), makeKeyword("FORT"), makeKeyword("FORT"))),
                        makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"),
                        makeString("(#$not (#$assertedMoreSpecifically (#$isa <instance> <collection>)) where <instance> and <collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedMoreSpecifically (#$isa #$genls #$VocabularyDefiningPredicate))) ") });
        $REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_POS = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS");
        $list43 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedMoreSpecifically")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedMoreSpecifically")), list(makeConstSym(("genls")), makeKeyword("FORT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertedMoreSpecifically (#$genls <spec-collection> <genl-collection>)) where <spec-collection> and <genl-collection> are FORTs "), makeKeyword("EXAMPLE"),
                makeString("(#$assertedMoreSpecifically (#$genls #$BinaryPredicate #$Individual)) \nfrom the asserted sentence in the KB (#genls #$BinaryPredicate #$Predicate) ") });
        $REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_NEG = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG");
        $list45 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertedMoreSpecifically")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedMoreSpecifically")), list(makeConstSym(("genls")), makeKeyword("FORT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$assertedMoreSpecifically (#$genls <spec-collection> <genl-collection>))) where <spec-collection> and <genl-collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedMoreSpecifically (#$genls #$BinaryPredicate #$BinaryRelation))) ") });
        $REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_POS = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS");
        $list47 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedMoreSpecifically")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedMoreSpecifically")), cons(list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeConstSym(("isa"))), list(makeKeyword("NOT"), makeConstSym(("genls")))), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertedMoreSpecifically (<pred> . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("") });
        $REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_NEG = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG");
        $list49 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertedMoreSpecifically")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedMoreSpecifically")), cons(list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeConstSym(("isa"))), list(makeKeyword("NOT"), makeConstSym(("genls")))), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$assertedMoreSpecifically (<pred> . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("") });
        $$strongestAssertedSentence = makeConstSym(("strongestAssertedSentence"));
        $REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS");
        $list52 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("strongestAssertedSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("strongestAssertedSentence")),
                        list(makeKeyword("OR"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeConstSym(("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))))),
                makeKeyword("COST"), makeSymbol("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$strongestAssertedSentence (<predicate> <anything>))"), makeKeyword("EXAMPLE"), makeString("") });
        $sym53$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_COST = makeSymbol("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-COST");
        $list54 = list(makeSymbol("BINDINGS"), makeSymbol("GAF"));
        $sym55$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_EXPAND = makeSymbol("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-EXPAND");
    }
}
/*
 *
 * Total time: 662 ms
 *
 */