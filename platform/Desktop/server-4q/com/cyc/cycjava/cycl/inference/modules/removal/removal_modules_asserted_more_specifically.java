package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.tva_utilities;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.kb_gp_mapping;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_asserted_more_specifically extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically";
    public static final String myFingerPrint = "0e52cf033bda483b29ed4bd5f207f8ff37bbcf7bf4ff45be6e49fa434dfa1d79";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 970L)
    private static SubLSymbol $use_asserted_more_specifically_via_tva_supportP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 8595L)
    private static SubLSymbol $assertion_under_consideration_for_asserted_more_specifically$;
    private static final SubLObject $const0$assertedMoreSpecifically;
    private static final SubLSymbol $kw1$BOTH;
    private static final SubLObject $const2$not;
    private static final SubLObject $const3$thereExists;
    private static final SubLSymbol $sym4$_COL;
    private static final SubLObject $const5$and;
    private static final SubLObject $const6$assertedSentence;
    private static final SubLList $list7;
    private static final SubLObject $const8$different;
    private static final SubLObject $const9$genls;
    private static final SubLSymbol $kw10$OPAQUE;
    private static final SubLString $str11$Inconsistent_operators__s_and__s;
    private static final SubLList $list12;
    private static final SubLObject $const13$WFFConstraintPredicate;
    private static final SubLObject $const14$transitiveViaArg;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$GAF;
    private static final SubLSymbol $kw17$TRUE;
    private static final SubLSymbol $kw18$GENLMT;
    private static final SubLObject $const19$genlMt;
    private static final SubLSymbol $kw20$GENLS;
    private static final SubLSymbol $sym21$RELEVANT_PRED_IS_SPEC_PRED;
    private static final SubLSymbol $kw22$GENLPREDS;
    private static final SubLObject $const23$genlInverse;
    private static final SubLObject $const24$genlPreds;
    private static final SubLSymbol $sym25$RELEVANT_PRED_IS_SPEC_INVERSE;
    private static final SubLSymbol $kw26$FALSE;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$TVA;
    private static final SubLSymbol $kw32$TVAI;
    private static final SubLSymbol $sym33$NON_TVA_GAF_ASSERTION_P;
    private static final SubLSymbol $kw34$QUERY;
    private static final SubLString $str35$More_than_one_assertion_in_justif;
    private static final SubLObject $const36$transitiveViaArgInverse;
    private static final SubLObject $const37$isa;
    private static final SubLSymbol $kw38$REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_POS;
    private static final SubLList $list39;
    private static final SubLSymbol $kw40$REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_NEG;
    private static final SubLList $list41;
    private static final SubLSymbol $kw42$REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_POS;
    private static final SubLList $list43;
    private static final SubLSymbol $kw44$REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_NEG;
    private static final SubLList $list45;
    private static final SubLSymbol $kw46$REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_POS;
    private static final SubLList $list47;
    private static final SubLSymbol $kw48$REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_NEG;
    private static final SubLList $list49;
    private static final SubLObject $const50$strongestAssertedSentence;
    private static final SubLSymbol $kw51$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_COST;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_EXPAND;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 1046L)
    public static SubLObject removal_asserted_more_specifically_check_pos_internals(final SubLObject operator, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject more_specific_assertions = removal_more_specific_asserted_assertions(operator, asent);
        final SubLObject more_supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject assertion = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        SubLObject assertion_$1 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        SubLObject supports = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        SubLObject supports_$2 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        assertion = more_specific_assertions;
        assertion_$1 = assertion.first();
        supports = more_supports;
        supports_$2 = supports.first();
        while (removal_modules_asserted_more_specifically.NIL != supports || removal_modules_asserted_more_specifically.NIL != assertion) {
            backward.removal_add_node(assertion_$1, (SubLObject)removal_modules_asserted_more_specifically.NIL, supports_$2);
            assertion = assertion.rest();
            assertion_$1 = assertion.first();
            supports = supports.rest();
            supports_$2 = supports.first();
        }
        return (SubLObject)removal_modules_asserted_more_specifically.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 1485L)
    public static SubLObject removal_asserted_more_specifically_check_neg_internals(final SubLObject operator, final SubLObject asent, SubLObject v_bindings, SubLObject more_supports) {
        if (v_bindings == removal_modules_asserted_more_specifically.UNPROVIDED) {
            v_bindings = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        }
        if (more_supports == removal_modules_asserted_more_specifically.UNPROVIDED) {
            more_supports = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject more_specific_assertions = removal_more_specific_asserted_assertions(operator, asent);
        final SubLObject yet_more_supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        more_supports = ConsesLow.append(more_supports, yet_more_supports);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(sentence, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(sentence, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
        final SubLObject support = (SubLObject)((removal_modules_asserted_more_specifically.NIL != transitive_via_genls_in_arg2P(operator)) ? ConsesLow.list(removal_modules_asserted_more_specifically.$const2$not, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const3$thereExists, (SubLObject)removal_modules_asserted_more_specifically.$sym4$_COL, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const5$and, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const6$assertedSentence, (SubLObject)ConsesLow.listS(operator, v_term, (SubLObject)removal_modules_asserted_more_specifically.$list7)), (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const8$different, (SubLObject)removal_modules_asserted_more_specifically.$sym4$_COL, collection), (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const9$genls, (SubLObject)removal_modules_asserted_more_specifically.$sym4$_COL, collection)))) : asent);
        if (removal_modules_asserted_more_specifically.NIL == more_specific_assertions) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw10$OPAQUE, support, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED), v_bindings, more_supports);
        }
        return (SubLObject)removal_modules_asserted_more_specifically.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 2492L)
    public static SubLObject removal_more_specific_asserted_assertions(final SubLObject operator, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_asserted_more_specifically.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !operator.eql(cycl_utilities.sentence_truth_function(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)))) {
            Errors.error((SubLObject)removal_modules_asserted_more_specifically.$str11$Inconsistent_operators__s_and__s, operator, cycl_utilities.sentence_truth_function(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)));
        }
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
        SubLObject more_specific_assertions = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        SubLObject more_supports = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        thread.resetMultipleValues();
        final SubLObject more_specific_assertions_raw = more_specific_asserted_assertions(sentence);
        final SubLObject more_supports_raw = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject more_specific_assertion = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        SubLObject more_specific_assertion_$3 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        SubLObject more_support = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        SubLObject more_support_$4 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        more_specific_assertion = more_specific_assertions_raw;
        more_specific_assertion_$3 = more_specific_assertion.first();
        more_support = more_supports_raw;
        more_support_$4 = more_support.first();
        while (removal_modules_asserted_more_specifically.NIL != more_support || removal_modules_asserted_more_specifically.NIL != more_specific_assertion) {
            if (removal_modules_asserted_more_specifically.NIL == kb_utilities.kbeq(more_specific_assertion_$3, removal_modules_asserted_more_specifically.$assertion_under_consideration_for_asserted_more_specifically$.getDynamicValue(thread))) {
                more_specific_assertions = (SubLObject)ConsesLow.cons(more_specific_assertion_$3, more_specific_assertions);
                more_supports = (SubLObject)ConsesLow.cons(more_support_$4, more_supports);
            }
            more_specific_assertion = more_specific_assertion.rest();
            more_specific_assertion_$3 = more_specific_assertion.first();
            more_support = more_support.rest();
            more_support_$4 = more_support.first();
        }
        return Values.values(more_specific_assertions, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 3349L)
    public static SubLObject more_specific_asserted_assertions(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.atomic_sentence_predicate(asent);
        if (removal_modules_asserted_more_specifically.NIL != subl_promotions.memberP(operator, (SubLObject)removal_modules_asserted_more_specifically.$list12, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)) {
            return more_specific_asserted_assertions_for_isa_genls(operator, asent);
        }
        if (removal_modules_asserted_more_specifically.NIL != transitive_via_genls_in_arg2P(operator)) {
            return more_specific_asserted_assertions_for_isa_genls(operator, asent);
        }
        if (removal_modules_asserted_more_specifically.NIL != removal_modules_asserted_more_specifically.$use_asserted_more_specifically_via_tva_supportP$.getDynamicValue(thread) && removal_modules_asserted_more_specifically.NIL == kb_utilities.kbeq(operator, removal_modules_asserted_more_specifically.$const2$not) && removal_modules_asserted_more_specifically.NIL == isa.isa_in_any_mtP(operator, removal_modules_asserted_more_specifically.$const13$WFFConstraintPredicate)) {
            return more_specific_asserted_assertions_for_other_pred_via_tva(operator, asent);
        }
        return more_specific_asserted_assertions_for_other_pred(operator, asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 4294L)
    public static SubLObject transitive_via_genls_in_arg2P(final SubLObject pred) {
        return kb_mapping_utilities.tuple_holds((SubLObject)ConsesLow.listS(removal_modules_asserted_more_specifically.$const14$transitiveViaArg, pred, (SubLObject)removal_modules_asserted_more_specifically.$list15), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 4476L)
    public static SubLObject more_specific_asserted_assertions_for_isa_genls(final SubLObject operator, final SubLObject asent) {
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
        SubLObject more_specific_assertions = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        SubLObject more_supports = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        if (removal_modules_asserted_more_specifically.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_asserted_more_specifically.ONE_INTEGER, operator)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_asserted_more_specifically.ONE_INTEGER, operator);
            SubLObject done_var = (SubLObject)removal_modules_asserted_more_specifically.NIL;
            final SubLObject token_var = (SubLObject)removal_modules_asserted_more_specifically.NIL;
            while (removal_modules_asserted_more_specifically.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (removal_modules_asserted_more_specifically.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_more_specifically.$kw16$GAF, (SubLObject)removal_modules_asserted_more_specifically.$kw17$TRUE, (SubLObject)removal_modules_asserted_more_specifically.NIL);
                        SubLObject done_var_$5 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                        final SubLObject token_var_$6 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                        while (removal_modules_asserted_more_specifically.NIL == done_var_$5) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                            final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(assertion));
                            if (removal_modules_asserted_more_specifically.NIL != valid_$7) {
                                final SubLObject asserted_collection = assertions_high.gaf_arg2(assertion);
                                if (asserted_collection.equal(collection)) {
                                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                                    if (removal_modules_asserted_more_specifically.NIL != genl_mts.proper_genl_mtP(more_specific_asserted_assertion_asent_mt(), mt, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)) {
                                        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw18$GENLMT, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const19$genlMt, more_specific_asserted_assertion_asent_mt(), mt), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                        more_specific_assertions = (SubLObject)ConsesLow.cons(assertion, more_specific_assertions);
                                        more_supports = (SubLObject)ConsesLow.cons(support, more_supports);
                                    }
                                    else if (removal_modules_asserted_more_specifically.NIL != within_assertive_wff_forward_inferenceP()) {
                                        SubLObject stronger_argumentP = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                        if (removal_modules_asserted_more_specifically.NIL == stronger_argumentP) {
                                            SubLObject csome_list_var = assertions_high.assertion_arguments(assertion);
                                            SubLObject argument = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                            argument = csome_list_var.first();
                                            while (removal_modules_asserted_more_specifically.NIL == stronger_argumentP && removal_modules_asserted_more_specifically.NIL != csome_list_var) {
                                                if (removal_modules_asserted_more_specifically.NIL != arguments.asserted_argument_p(argument)) {
                                                    stronger_argumentP = (SubLObject)removal_modules_asserted_more_specifically.T;
                                                }
                                                else if (removal_modules_asserted_more_specifically.NIL == wff.assertive_wff_deductionP(argument)) {
                                                    stronger_argumentP = (SubLObject)removal_modules_asserted_more_specifically.T;
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                argument = csome_list_var.first();
                                            }
                                        }
                                        if (removal_modules_asserted_more_specifically.NIL != stronger_argumentP) {
                                            more_specific_assertions = (SubLObject)ConsesLow.cons(assertion, more_specific_assertions);
                                        }
                                    }
                                }
                                else if (removal_modules_asserted_more_specifically.NIL != genls.genlsP(asserted_collection, collection, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)) {
                                    final SubLObject support2 = arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw20$GENLS, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const9$genls, asserted_collection, collection), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                    more_specific_assertions = (SubLObject)ConsesLow.cons(assertion, more_specific_assertions);
                                    more_supports = (SubLObject)ConsesLow.cons(support2, more_supports);
                                }
                            }
                            done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == valid_$7);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_asserted_more_specifically.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (removal_modules_asserted_more_specifically.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == valid);
            }
        }
        return Values.values(more_specific_assertions, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 6545L)
    public static SubLObject more_specific_asserted_assertions_for_other_pred(final SubLObject operator, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject args = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
        final SubLObject rargs = Sequences.reverse(args);
        final SubLObject base_mt = more_specific_asserted_assertion_asent_mt();
        SubLObject more_specific_assertions = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        SubLObject more_supports = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        if (removal_modules_asserted_more_specifically.NIL != forts.fort_p(args.first())) {
            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_asserted_more_specifically.$sym21$RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(operator, thread);
                final SubLObject pred_var = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                if (removal_modules_asserted_more_specifically.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(args.first(), (SubLObject)removal_modules_asserted_more_specifically.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(args.first(), (SubLObject)removal_modules_asserted_more_specifically.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                    while (removal_modules_asserted_more_specifically.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_asserted_more_specifically.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_more_specifically.$kw16$GAF, (SubLObject)removal_modules_asserted_more_specifically.$kw17$TRUE, (SubLObject)removal_modules_asserted_more_specifically.NIL);
                                SubLObject done_var_$8 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                final SubLObject token_var_$9 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                while (removal_modules_asserted_more_specifically.NIL == done_var_$8) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
                                    final SubLObject valid_$10 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$9.eql(assertion));
                                    if (removal_modules_asserted_more_specifically.NIL != valid_$10 && removal_modules_asserted_more_specifically.NIL != ((removal_modules_asserted_more_specifically.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED), rargs) : Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED), args))) {
                                        final SubLObject pred = assertions_high.gaf_arg0(assertion);
                                        final SubLObject mt = assertions_high.assertion_mt(assertion);
                                        if (!pred.equal(operator)) {
                                            final SubLObject support = (removal_modules_asserted_more_specifically.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw22$GENLPREDS, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const23$genlInverse, pred, operator), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED) : arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw22$GENLPREDS, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const24$genlPreds, pred, operator), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                            more_specific_assertions = (SubLObject)ConsesLow.cons(assertion, more_specific_assertions);
                                            more_supports = (SubLObject)ConsesLow.cons(support, more_supports);
                                        }
                                        if (removal_modules_asserted_more_specifically.NIL != genl_mts.proper_genl_mtP(base_mt, mt, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)) {
                                            final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw18$GENLMT, el_utilities.make_binary_formula(removal_modules_asserted_more_specifically.$const19$genlMt, base_mt, mt), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                            more_specific_assertions = (SubLObject)ConsesLow.cons(assertion, more_specific_assertions);
                                            more_supports = (SubLObject)ConsesLow.cons(support, more_supports);
                                        }
                                    }
                                    done_var_$8 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == valid_$10);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_more_specifically.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (removal_modules_asserted_more_specifically.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == valid);
                    }
                }
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
            if (removal_modules_asserted_more_specifically.NIL != kb_gp_mapping.dgaigp_binaryP(operator)) {
                _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_asserted_more_specifically.$sym25$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind(operator, thread);
                    final SubLObject pred_var = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                    if (removal_modules_asserted_more_specifically.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(args.first(), arity.binary_arg_swap((SubLObject)removal_modules_asserted_more_specifically.ONE_INTEGER), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(args.first(), arity.binary_arg_swap((SubLObject)removal_modules_asserted_more_specifically.ONE_INTEGER), pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                        while (removal_modules_asserted_more_specifically.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_asserted_more_specifically.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_asserted_more_specifically.$kw16$GAF, (SubLObject)removal_modules_asserted_more_specifically.$kw17$TRUE, (SubLObject)removal_modules_asserted_more_specifically.NIL);
                                    SubLObject done_var_$9 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                    final SubLObject token_var_$10 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                    while (removal_modules_asserted_more_specifically.NIL == done_var_$9) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                        final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(assertion));
                                        if (removal_modules_asserted_more_specifically.NIL != valid_$11) {
                                            final SubLObject _prev_bind_0_$12 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                if (removal_modules_asserted_more_specifically.NIL != ((removal_modules_asserted_more_specifically.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED), rargs) : Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED), args))) {
                                                    final SubLObject pred2 = assertions_high.gaf_arg0(assertion);
                                                    final SubLObject mt2 = assertions_high.assertion_mt(assertion);
                                                    if (!pred2.equal(operator)) {
                                                        final SubLObject support2 = (removal_modules_asserted_more_specifically.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw22$GENLPREDS, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const23$genlInverse, pred2, operator), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED) : arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw22$GENLPREDS, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const24$genlPreds, pred2, operator), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                                        more_specific_assertions = (SubLObject)ConsesLow.cons(assertion, more_specific_assertions);
                                                        more_supports = (SubLObject)ConsesLow.cons(support2, more_supports);
                                                    }
                                                    if (removal_modules_asserted_more_specifically.NIL != genl_mts.proper_genl_mtP(base_mt, mt2, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)) {
                                                        final SubLObject support2 = arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw18$GENLMT, el_utilities.make_binary_formula(removal_modules_asserted_more_specifically.$const19$genlMt, base_mt, mt2), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                                        more_specific_assertions = (SubLObject)ConsesLow.cons(assertion, more_specific_assertions);
                                                        more_supports = (SubLObject)ConsesLow.cons(support2, more_supports);
                                                    }
                                                }
                                            }
                                            finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$12, thread);
                                            }
                                        }
                                        done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == valid_$11);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_more_specifically.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_more_specifically.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == valid);
                        }
                    }
                }
                finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            SubLObject cdolist_list_var = genl_predicates.all_spec_preds(operator, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
            SubLObject spec_pred = (SubLObject)removal_modules_asserted_more_specifically.NIL;
            spec_pred = cdolist_list_var.first();
            while (removal_modules_asserted_more_specifically.NIL != cdolist_list_var) {
                final SubLObject pred_var = spec_pred;
                if (removal_modules_asserted_more_specifically.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_more_specifically.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_more_specifically.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_more_specifically.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_more_specifically.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_more_specifically.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_more_specifically.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var2 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                        while (removal_modules_asserted_more_specifically.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_asserted_more_specifically.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_asserted_more_specifically.$kw16$GAF, (SubLObject)removal_modules_asserted_more_specifically.$kw17$TRUE, (SubLObject)removal_modules_asserted_more_specifically.NIL);
                                    SubLObject done_var_$10 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                    final SubLObject token_var_$11 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                    while (removal_modules_asserted_more_specifically.NIL == done_var_$10) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$11);
                                        final SubLObject valid_$12 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$11.eql(assertion2));
                                        if (removal_modules_asserted_more_specifically.NIL != valid_$12 && removal_modules_asserted_more_specifically.NIL != ((removal_modules_asserted_more_specifically.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion2), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED), rargs) : Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion2), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED), args))) {
                                            final SubLObject pred3 = assertions_high.gaf_arg0(assertion2);
                                            final SubLObject mt3 = assertions_high.assertion_mt(assertion2);
                                            if (!pred3.equal(operator)) {
                                                final SubLObject support3 = (removal_modules_asserted_more_specifically.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw22$GENLPREDS, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const23$genlInverse, pred3, operator), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED) : arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw22$GENLPREDS, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const24$genlPreds, pred3, operator), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                                more_specific_assertions = (SubLObject)ConsesLow.cons(assertion2, more_specific_assertions);
                                                more_supports = (SubLObject)ConsesLow.cons(support3, more_supports);
                                            }
                                            if (removal_modules_asserted_more_specifically.NIL != genl_mts.proper_genl_mtP(base_mt, mt3, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)) {
                                                final SubLObject support3 = arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw18$GENLMT, el_utilities.make_binary_formula(removal_modules_asserted_more_specifically.$const19$genlMt, base_mt, mt3), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                                more_specific_assertions = (SubLObject)ConsesLow.cons(assertion2, more_specific_assertions);
                                                more_supports = (SubLObject)ConsesLow.cons(support3, more_supports);
                                            }
                                        }
                                        done_var_$10 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == valid_$12);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_more_specifically.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_asserted_more_specifically.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
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
            if (removal_modules_asserted_more_specifically.NIL != arity.binaryP(operator)) {
                final SubLObject _prev_bind_0 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                try {
                    kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                    SubLObject cdolist_list_var2 = genl_predicates.all_spec_inverses(operator, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                    SubLObject spec_pred2 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                    spec_pred2 = cdolist_list_var2.first();
                    while (removal_modules_asserted_more_specifically.NIL != cdolist_list_var2) {
                        final SubLObject pred_var2 = spec_pred2;
                        if (removal_modules_asserted_more_specifically.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                            final SubLObject str2 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                            final SubLObject _prev_bind_0_$15 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_11 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_12 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_13 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                            final SubLObject _prev_bind_14 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                            final SubLObject _prev_bind_15 = utilities_macros.$progress_count$.currentBinding(thread);
                            final SubLObject _prev_bind_16 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                            final SubLObject _prev_bind_17 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_asserted_more_specifically.ZERO_INTEGER, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_asserted_more_specifically.ZERO_INTEGER, thread);
                                utilities_macros.$progress_count$.bind((SubLObject)removal_modules_asserted_more_specifically.ZERO_INTEGER, thread);
                                utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_asserted_more_specifically.T, thread);
                                utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_asserted_more_specifically.NIL != str2) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_asserted_more_specifically.T), thread);
                                utilities_macros.noting_progress_preamble(str2);
                                final SubLObject iterator_var3 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                                SubLObject done_var3 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                final SubLObject token_var3 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                while (removal_modules_asserted_more_specifically.NIL == done_var3) {
                                    final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                                    final SubLObject valid3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var3.eql(final_index_spec3));
                                    if (removal_modules_asserted_more_specifically.NIL != valid3) {
                                        utilities_macros.note_progress();
                                        SubLObject final_index_iterator3 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                        try {
                                            final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, (SubLObject)removal_modules_asserted_more_specifically.$kw16$GAF, (SubLObject)removal_modules_asserted_more_specifically.$kw17$TRUE, (SubLObject)removal_modules_asserted_more_specifically.NIL);
                                            SubLObject done_var_$11 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                            final SubLObject token_var_$12 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                            while (removal_modules_asserted_more_specifically.NIL == done_var_$11) {
                                                final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$12);
                                                final SubLObject valid_$13 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$12.eql(assertion3));
                                                if (removal_modules_asserted_more_specifically.NIL != valid_$13 && removal_modules_asserted_more_specifically.NIL != ((removal_modules_asserted_more_specifically.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion3), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED), rargs) : Equality.equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion3), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED), args))) {
                                                    final SubLObject pred4 = assertions_high.gaf_arg0(assertion3);
                                                    final SubLObject mt4 = assertions_high.assertion_mt(assertion3);
                                                    if (!pred4.equal(operator)) {
                                                        final SubLObject support4 = (removal_modules_asserted_more_specifically.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw22$GENLPREDS, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const23$genlInverse, pred4, operator), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED) : arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw22$GENLPREDS, (SubLObject)ConsesLow.list(removal_modules_asserted_more_specifically.$const24$genlPreds, pred4, operator), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                                        more_specific_assertions = (SubLObject)ConsesLow.cons(assertion3, more_specific_assertions);
                                                        more_supports = (SubLObject)ConsesLow.cons(support4, more_supports);
                                                    }
                                                    if (removal_modules_asserted_more_specifically.NIL != genl_mts.proper_genl_mtP(base_mt, mt4, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)) {
                                                        final SubLObject support4 = arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw18$GENLMT, el_utilities.make_binary_formula(removal_modules_asserted_more_specifically.$const19$genlMt, base_mt, mt4), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                                        more_specific_assertions = (SubLObject)ConsesLow.cons(assertion3, more_specific_assertions);
                                                        more_supports = (SubLObject)ConsesLow.cons(support4, more_supports);
                                                    }
                                                }
                                                done_var_$11 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == valid_$13);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_asserted_more_specifically.T, thread);
                                                final SubLObject _values4 = Values.getValuesAsVector();
                                                if (removal_modules_asserted_more_specifically.NIL != final_index_iterator3) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                                }
                                                Values.restoreValuesFromVector(_values4);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                            }
                                        }
                                    }
                                    done_var3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == valid3);
                                }
                                utilities_macros.noting_progress_postamble();
                            }
                            finally {
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
                }
                finally {
                    kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return Values.values(more_specific_assertions, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 8686L)
    public static SubLObject more_specific_asserted_assertion_asent_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_asserted_more_specifically.NIL != assertion_handles.assertion_p(removal_modules_asserted_more_specifically.$assertion_under_consideration_for_asserted_more_specifically$.getDynamicValue(thread)) && removal_modules_asserted_more_specifically.NIL != genl_mts.genl_mtP(mt_relevance_macros.$mt$.getDynamicValue(thread), assertions_high.assertion_mt(removal_modules_asserted_more_specifically.$assertion_under_consideration_for_asserted_more_specifically$.getDynamicValue(thread)), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)) {
            return assertions_high.assertion_mt(removal_modules_asserted_more_specifically.$assertion_under_consideration_for_asserted_more_specifically$.getDynamicValue(thread));
        }
        if (removal_modules_asserted_more_specifically.NIL != assertion_handles.assertion_p(forward.current_forward_inference_assertion())) {
            return assertions_high.assertion_mt(forward.current_forward_inference_assertion());
        }
        return mt_relevance_macros.$mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 9175L)
    public static SubLObject within_assertive_wff_forward_inferenceP() {
        return wff.assertive_wff_ruleP(forward.current_forward_inference_rule());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 9299L)
    public static SubLObject more_specific_asserted_assertions_for_other_pred_via_tva(final SubLObject operator, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tva_pred_signature = tva_utilities.tva_pred_signature(operator);
        SubLObject more_specific_asents = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        SubLObject more_supports = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        SubLObject doneP = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        final SubLObject negatedP = cycl_utilities.negatedP(asent);
        final SubLObject truth = (SubLObject)((removal_modules_asserted_more_specifically.NIL != negatedP) ? removal_modules_asserted_more_specifically.$kw26$FALSE : removal_modules_asserted_more_specifically.$kw17$TRUE);
        final SubLObject real_asent = (removal_modules_asserted_more_specifically.NIL != negatedP) ? cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED) : asent;
        if (removal_modules_asserted_more_specifically.NIL == backward.removal_ask_justifications(real_asent, mt_relevance_macros.$mt$.getDynamicValue(thread), truth, (SubLObject)removal_modules_asserted_more_specifically.$list27)) {
            return Values.values((SubLObject)removal_modules_asserted_more_specifically.NIL, (SubLObject)removal_modules_asserted_more_specifically.NIL);
        }
        if (removal_modules_asserted_more_specifically.NIL == mt_relevance_macros.any_or_all_mts_are_relevantP()) {
            SubLObject cdolist_list_var = czer_meta.find_visible_assertions_cycl(asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
            SubLObject more_specific_assertion = (SubLObject)removal_modules_asserted_more_specifically.NIL;
            more_specific_assertion = cdolist_list_var.first();
            while (removal_modules_asserted_more_specifically.NIL != cdolist_list_var) {
                if (removal_modules_asserted_more_specifically.NIL == equals.equalsP(assertions_high.assertion_mt(more_specific_assertion), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)) {
                    return Values.values((SubLObject)ConsesLow.list(more_specific_assertion), (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw18$GENLMT, el_utilities.make_binary_formula(removal_modules_asserted_more_specifically.$const19$genlMt, mt_relevance_macros.$mt$.getDynamicValue(thread), assertions_high.assertion_mt(more_specific_assertion)), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)));
                }
                cdolist_list_var = cdolist_list_var.rest();
                more_specific_assertion = cdolist_list_var.first();
            }
        }
        tva_pred_signature = (SubLObject)ConsesLow.cons((SubLObject)removal_modules_asserted_more_specifically.$list28, tva_pred_signature);
        if (removal_modules_asserted_more_specifically.NIL == doneP) {
            SubLObject csome_list_var = tva_pred_signature;
            SubLObject tva_arg_position_preds_tuple = (SubLObject)removal_modules_asserted_more_specifically.NIL;
            tva_arg_position_preds_tuple = csome_list_var.first();
            while (removal_modules_asserted_more_specifically.NIL == doneP && removal_modules_asserted_more_specifically.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = tva_arg_position_preds_tuple;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_asserted_more_specifically.$list29);
                final SubLObject temp = current.rest();
                current = current.first();
                SubLObject argnum = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                SubLObject tva_type = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_asserted_more_specifically.$list29);
                argnum = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_asserted_more_specifically.$list29);
                tva_type = current.first();
                current = current.rest();
                if (removal_modules_asserted_more_specifically.NIL == current) {
                    final SubLObject tva_preds;
                    current = (tva_preds = temp);
                    final SubLObject v_term = cycl_utilities.atomic_sentence_arg(asent, argnum, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                    if (removal_modules_asserted_more_specifically.NIL == list_utilities.member_kbeqP(v_term, (SubLObject)removal_modules_asserted_more_specifically.$list30) && removal_modules_asserted_more_specifically.NIL == doneP) {
                        SubLObject csome_list_var_$26 = tva_preds;
                        SubLObject tva_pred = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                        tva_pred = csome_list_var_$26.first();
                        while (removal_modules_asserted_more_specifically.NIL == doneP && removal_modules_asserted_more_specifically.NIL != csome_list_var_$26) {
                            SubLObject more_specific_terms = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                            SubLObject more_specific_supports = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                            final SubLObject pcase_var = tva_type;
                            if (pcase_var.eql((SubLObject)removal_modules_asserted_more_specifically.$kw31$TVA)) {
                                thread.resetMultipleValues();
                                final SubLObject more_specific_terms_$27 = ghl_search_methods.ghl_max_inferiors(v_term, tva_pred, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                final SubLObject more_specific_supports_$28 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                more_specific_terms = more_specific_terms_$27;
                                more_specific_supports = more_specific_supports_$28;
                            }
                            else if (pcase_var.eql((SubLObject)removal_modules_asserted_more_specifically.$kw32$TVAI)) {
                                thread.resetMultipleValues();
                                final SubLObject more_specific_terms_$28 = ghl_search_methods.ghl_min_superiors(v_term, tva_pred, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                final SubLObject more_specific_supports_$29 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                more_specific_terms = more_specific_terms_$28;
                                more_specific_supports = more_specific_supports_$29;
                            }
                            if (removal_modules_asserted_more_specifically.NIL == doneP) {
                                SubLObject more_specific_term = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                SubLObject more_specific_term_$31 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                SubLObject more_specific_support = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                SubLObject more_specific_support_$32 = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                                more_specific_term = more_specific_terms;
                                more_specific_term_$31 = more_specific_term.first();
                                more_specific_support = more_specific_supports;
                                more_specific_support_$32 = more_specific_support.first();
                                while (removal_modules_asserted_more_specifically.NIL == doneP && (removal_modules_asserted_more_specifically.NIL != more_specific_support || removal_modules_asserted_more_specifically.NIL != more_specific_term)) {
                                    final SubLObject more_specific_asent = el_utilities.replace_formula_arg(argnum, more_specific_term_$31, asent);
                                    SubLObject tva_supports = backward.removal_ask_justifications(more_specific_asent, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_asserted_more_specifically.$kw17$TRUE, (SubLObject)removal_modules_asserted_more_specifically.$list27).first();
                                    if (removal_modules_asserted_more_specifically.NIL != tva_supports) {
                                        if (removal_modules_asserted_more_specifically.NIL != list_utilities.singletonP(tva_supports) && removal_modules_asserted_more_specifically.NIL != arguments.hl_support_p(tva_supports.first()) && removal_modules_asserted_more_specifically.$kw31$TVA == arguments.hl_support_module(tva_supports.first())) {
                                            tva_supports = hl_supports.hl_justify(tva_supports.first());
                                        }
                                        final SubLObject tva_support_assertions = list_utilities.find_all_if((SubLObject)removal_modules_asserted_more_specifically.$sym33$NON_TVA_GAF_ASSERTION_P, tva_supports, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                        if (removal_modules_asserted_more_specifically.NIL != list_utilities.singletonP(tva_support_assertions)) {
                                            more_specific_asents = (SubLObject)ConsesLow.cons(tva_support_assertions.first(), more_specific_asents);
                                        }
                                        else if (removal_modules_asserted_more_specifically.NIL == tva_support_assertions) {
                                            more_specific_asents = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw34$QUERY, more_specific_asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED), more_specific_asents);
                                        }
                                        else {
                                            Errors.warn((SubLObject)removal_modules_asserted_more_specifically.$str35$More_than_one_assertion_in_justif, more_specific_asent);
                                            more_specific_asents = (SubLObject)ConsesLow.cons(tva_support_assertions.first(), more_specific_asents);
                                        }
                                        SubLObject supports = tva_supports;
                                        if (removal_modules_asserted_more_specifically.NIL != arguments.support_p(more_specific_support_$32)) {
                                            supports = (SubLObject)ConsesLow.cons(more_specific_support_$32, supports);
                                        }
                                        final SubLObject tva_sentence = arguments.make_hl_support((SubLObject)removal_modules_asserted_more_specifically.$kw34$QUERY, (SubLObject)ConsesLow.list((tva_type == removal_modules_asserted_more_specifically.$kw31$TVA) ? removal_modules_asserted_more_specifically.$const14$transitiveViaArg : removal_modules_asserted_more_specifically.$const36$transitiveViaArgInverse, operator, tva_pred, argnum), (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                                        supports = (SubLObject)ConsesLow.cons(tva_sentence, supports);
                                        more_supports = (SubLObject)ConsesLow.cons(supports, more_supports);
                                        doneP = (SubLObject)removal_modules_asserted_more_specifically.T;
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
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_asserted_more_specifically.$list29);
                }
                csome_list_var = csome_list_var.rest();
                tva_arg_position_preds_tuple = csome_list_var.first();
            }
        }
        return Values.values(more_specific_asents, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 12906L)
    public static SubLObject non_tva_gaf_assertion_p(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL != assertions_high.gaf_assertionP(assertion) && removal_modules_asserted_more_specifically.NIL == list_utilities.member_kbeqP(assertions_high.gaf_predicate(assertion), tva_utilities.get_tva_predicates()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 13077L)
    public static SubLObject removal_asserted_more_specifically_isa_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_more_specifically.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        }
        return removal_asserted_more_specifically_check_pos_internals(removal_modules_asserted_more_specifically.$const37$isa, asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 14321L)
    public static SubLObject removal_asserted_more_specifically_isa_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_more_specifically.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        }
        return removal_asserted_more_specifically_check_neg_internals(removal_modules_asserted_more_specifically.$const37$isa, asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 15339L)
    public static SubLObject removal_asserted_more_specifically_genls_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_more_specifically.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        }
        return removal_asserted_more_specifically_check_pos_internals(removal_modules_asserted_more_specifically.$const9$genls, asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 16634L)
    public static SubLObject removal_asserted_more_specifically_genls_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_more_specifically.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        }
        return removal_asserted_more_specifically_check_neg_internals(removal_modules_asserted_more_specifically.$const9$genls, asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 17693L)
    public static SubLObject removal_asserted_more_specifically_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_more_specifically.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        }
        return removal_asserted_more_specifically_check_pos_internals(cycl_utilities.atomic_sentence_predicate(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)), asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 18590L)
    public static SubLObject removal_asserted_more_specifically_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_more_specifically.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        }
        return removal_asserted_more_specifically_check_neg_internals(cycl_utilities.atomic_sentence_predicate(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED)), asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 20483L)
    public static SubLObject removal_strongest_asserted_sentence_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_more_specifically.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        }
        return removal_modules_asserted_formula.removal_asserted_sentence_lookup_pos_cost(asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp", position = 20660L)
    public static SubLObject removal_strongest_asserted_sentence_lookup_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_asserted_more_specifically.UNPROVIDED) {
            sense = (SubLObject)removal_modules_asserted_more_specifically.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = removal_modules_asserted_formula.removal_asserted_sentence_lookup_iterator(asent);
        if (removal_modules_asserted_more_specifically.NIL != iterator) {
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)removal_modules_asserted_more_specifically.NIL; removal_modules_asserted_more_specifically.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_asserted_more_specifically.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject tuple = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_asserted_more_specifically.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = tuple;
                    SubLObject v_bindings = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                    SubLObject gaf = (SubLObject)removal_modules_asserted_more_specifically.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_asserted_more_specifically.$list54);
                    v_bindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_asserted_more_specifically.$list54);
                    gaf = current.first();
                    current = current.rest();
                    if (removal_modules_asserted_more_specifically.NIL == current) {
                        final SubLObject _prev_bind_0 = removal_modules_asserted_more_specifically.$assertion_under_consideration_for_asserted_more_specifically$.currentBinding(thread);
                        try {
                            removal_modules_asserted_more_specifically.$assertion_under_consideration_for_asserted_more_specifically$.bind(gaf, thread);
                            final SubLObject bound_asent = bindings.subst_bindings(v_bindings, asent);
                            final SubLObject inner_asent = cycl_utilities.atomic_sentence_arg1(bound_asent, (SubLObject)removal_modules_asserted_more_specifically.UNPROVIDED);
                            final SubLObject operator = cycl_utilities.atomic_sentence_predicate(inner_asent);
                            removal_asserted_more_specifically_check_neg_internals(operator, bound_asent, v_bindings, (SubLObject)ConsesLow.list(gaf));
                        }
                        finally {
                            removal_modules_asserted_more_specifically.$assertion_under_consideration_for_asserted_more_specifically$.rebind(_prev_bind_0, thread);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_asserted_more_specifically.$list54);
                    }
                }
            }
        }
        return (SubLObject)removal_modules_asserted_more_specifically.NIL;
    }
    
    public static SubLObject declare_removal_modules_asserted_more_specifically_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "removal_asserted_more_specifically_check_pos_internals", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-INTERNALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "removal_asserted_more_specifically_check_neg_internals", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-INTERNALS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "removal_more_specific_asserted_assertions", "REMOVAL-MORE-SPECIFIC-ASSERTED-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "more_specific_asserted_assertions", "MORE-SPECIFIC-ASSERTED-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "transitive_via_genls_in_arg2P", "TRANSITIVE-VIA-GENLS-IN-ARG2?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "more_specific_asserted_assertions_for_isa_genls", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-ISA-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "more_specific_asserted_assertions_for_other_pred", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-OTHER-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "more_specific_asserted_assertion_asent_mt", "MORE-SPECIFIC-ASSERTED-ASSERTION-ASENT-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "within_assertive_wff_forward_inferenceP", "WITHIN-ASSERTIVE-WFF-FORWARD-INFERENCE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "more_specific_asserted_assertions_for_other_pred_via_tva", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-OTHER-PRED-VIA-TVA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "non_tva_gaf_assertion_p", "NON-TVA-GAF-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "removal_asserted_more_specifically_isa_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "removal_asserted_more_specifically_isa_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "removal_asserted_more_specifically_genls_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "removal_asserted_more_specifically_genls_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "removal_asserted_more_specifically_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "removal_asserted_more_specifically_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "removal_strongest_asserted_sentence_lookup_pos_cost", "REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically", "removal_strongest_asserted_sentence_lookup_pos_expand", "REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_asserted_more_specifically.NIL;
    }
    
    public static SubLObject init_removal_modules_asserted_more_specifically_file() {
        removal_modules_asserted_more_specifically.$use_asserted_more_specifically_via_tva_supportP$ = SubLFiles.defparameter("*USE-ASSERTED-MORE-SPECIFICALLY-VIA-TVA-SUPPORT?*", (SubLObject)removal_modules_asserted_more_specifically.T);
        removal_modules_asserted_more_specifically.$assertion_under_consideration_for_asserted_more_specifically$ = SubLFiles.defparameter("*ASSERTION-UNDER-CONSIDERATION-FOR-ASSERTED-MORE-SPECIFICALLY*", (SubLObject)removal_modules_asserted_more_specifically.NIL);
        return (SubLObject)removal_modules_asserted_more_specifically.NIL;
    }
    
    public static SubLObject setup_removal_modules_asserted_more_specifically_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_asserted_more_specifically.$const0$assertedMoreSpecifically);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_asserted_more_specifically.$kw1$BOTH, removal_modules_asserted_more_specifically.$const0$assertedMoreSpecifically);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_more_specifically.$kw38$REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_POS, (SubLObject)removal_modules_asserted_more_specifically.$list39);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_more_specifically.$kw40$REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_NEG, (SubLObject)removal_modules_asserted_more_specifically.$list41);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_more_specifically.$kw42$REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_POS, (SubLObject)removal_modules_asserted_more_specifically.$list43);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_more_specifically.$kw44$REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_NEG, (SubLObject)removal_modules_asserted_more_specifically.$list45);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_more_specifically.$kw46$REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_POS, (SubLObject)removal_modules_asserted_more_specifically.$list47);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_more_specifically.$kw48$REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_NEG, (SubLObject)removal_modules_asserted_more_specifically.$list49);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_asserted_more_specifically.$const50$strongestAssertedSentence);
        inference_modules.inference_removal_module((SubLObject)removal_modules_asserted_more_specifically.$kw51$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS, (SubLObject)removal_modules_asserted_more_specifically.$list52);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_asserted_more_specifically.$sym53$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_COST);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_asserted_more_specifically.$sym55$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_EXPAND);
        return (SubLObject)removal_modules_asserted_more_specifically.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_asserted_more_specifically_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_asserted_more_specifically_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_asserted_more_specifically_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_asserted_more_specifically();
        removal_modules_asserted_more_specifically.$use_asserted_more_specifically_via_tva_supportP$ = null;
        removal_modules_asserted_more_specifically.$assertion_under_consideration_for_asserted_more_specifically$ = null;
        $const0$assertedMoreSpecifically = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically"));
        $kw1$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $const2$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $const3$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym4$_COL = SubLObjectFactory.makeSymbol("?COL");
        $const5$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const6$assertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COL"));
        $const8$different = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"));
        $const9$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw10$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $str11$Inconsistent_operators__s_and__s = SubLObjectFactory.makeString("Inconsistent operators ~s and ~s");
        $list12 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $const13$WFFConstraintPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WFFConstraintPredicate"));
        $const14$transitiveViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $list15 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)removal_modules_asserted_more_specifically.TWO_INTEGER);
        $kw16$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw17$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw18$GENLMT = SubLObjectFactory.makeKeyword("GENLMT");
        $const19$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $kw20$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $sym21$RELEVANT_PRED_IS_SPEC_PRED = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
        $kw22$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $const23$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $const24$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $sym25$RELEVANT_PRED_IS_SPEC_INVERSE = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
        $kw26$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)removal_modules_asserted_more_specifically.ONE_INTEGER);
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)removal_modules_asserted_more_specifically.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("TVA")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")));
        $list29 = (SubLList)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("TVA-PREDS"));
        $list30 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")));
        $kw31$TVA = SubLObjectFactory.makeKeyword("TVA");
        $kw32$TVAI = SubLObjectFactory.makeKeyword("TVAI");
        $sym33$NON_TVA_GAF_ASSERTION_P = SubLObjectFactory.makeSymbol("NON-TVA-GAF-ASSERTION-P");
        $kw34$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $str35$More_than_one_assertion_in_justif = SubLObjectFactory.makeString("More than one assertion in justification of ~S");
        $const36$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $const37$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw38$REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS");
        $list39 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedMoreSpecifically (#$isa <instance> <collection>)) where <instance> and <collection> are FORTs "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedMoreSpecifically (#$isa #$genls #$Predicate)) \nfrom the asserted sentence in the KB (#isa #$genls #$VocabularyDefiningPredicate) ") });
        $kw40$REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG");
        $list41 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertedMoreSpecifically (#$isa <instance> <collection>)) where <instance> and <collection> are FORTs "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$assertedMoreSpecifically (#$isa #$genls #$VocabularyDefiningPredicate))) ") });
        $kw42$REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS");
        $list43 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedMoreSpecifically (#$genls <spec-collection> <genl-collection>)) where <spec-collection> and <genl-collection> are FORTs "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedMoreSpecifically (#$genls #$BinaryPredicate #$Individual)) \nfrom the asserted sentence in the KB (#genls #$BinaryPredicate #$Predicate) ") });
        $kw44$REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG");
        $list45 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertedMoreSpecifically (#$genls <spec-collection> <genl-collection>))) where <spec-collection> and <genl-collection> are FORTs "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$assertedMoreSpecifically (#$genls #$BinaryPredicate #$BinaryRelation))) ") });
        $kw46$REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS");
        $list47 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")))), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedMoreSpecifically (<pred> . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("") });
        $kw48$REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG");
        $list49 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")))), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertedMoreSpecifically (<pred> . <fully-bound>)))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("") });
        $const50$strongestAssertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strongestAssertedSentence"));
        $kw51$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS");
        $list52 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strongestAssertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strongestAssertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$strongestAssertedSentence (<predicate> <anything>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("") });
        $sym53$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_COST = SubLObjectFactory.makeSymbol("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-COST");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("GAF"));
        $sym55$REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-EXPAND");
    }
}

/*

	Total time: 662 ms
	
*/