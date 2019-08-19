package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_asserted_arg1_binary_preds extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds";
    public static String myFingerPrint = "a33045c12a715bc7eae56796bd2098f7788709aacf17730db25677f6cf80c7b5";
    private static SubLObject $$assertedArg1BinaryPreds;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_POS_CHECK;
    private static SubLList $list4;
    private static SubLSymbol $MINIMIZE;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_NEG_CHECK;
    private static SubLList $list7;
    private static SubLList $list8;
    private static SubLInteger $int$200;
    private static SubLSymbol $sym10$ALL_FORT_INSTANCES;
    private static SubLSymbol $sym11$SAMPLED_INSTANCES;
    private static SubLSymbol $sym12$CLET;
    private static SubLSymbol $sym13$ALL_FORT_INSTANCES;
    private static SubLList $list14;
    private static SubLSymbol $sym15$CSETQ;
    private static SubLSymbol $sym16$LENGTH__;
    private static SubLSymbol $sym17$FIF;
    private static SubLSymbol $sym18$RANDOM_N;
    private static SubLSymbol $sym19$CDOLIST;
    private static SubLList $list20;
    private static SubLObject $$True_JustificationTruth;
    private static SubLSymbol $GAF;
    private static SubLSymbol $ISA;
    private static SubLObject $$isa;
    private static SubLObject $$assertedSentence;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $CODE;
    private static SubLList $list28;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PRED_VAR;
    private static SubLList $list30;
    private static SubLList $list31;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COLLECTION_VAR;
    private static SubLList $list33;
    private static SubLObject $$assertedArg1BinaryPreds_Count;
    private static SubLSymbol $ASSERTED_ARG1_BINARY_PREDS_COUNT_POS;
    private static SubLList $list36;
    private static SubLSymbol $VERIFIED;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_POS_CHECK;
    private static SubLList $list39;
    private static SubLList $list40;
    private static SubLInteger $int$1000;
    private static SubLObject $$BinaryPredicate;
    private static SubLObject $$cardinality;
    private static SubLObject $$TheSetOf;
    private static SubLSymbol $sym45$_INSTANCE;
    private static SubLObject $$and;
    private static SubLObject $$assertedPredicateArg;
    private static SubLList $list48;
    private static SubLSymbol $sym49$RELEVANT_MT_IS_EVERYTHING;
    private static SubLObject $$EverythingPSC;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_NEG_CHECK;
    private static SubLList $list52;
    private static SubLList $list53;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_COUNT_VAR;
    private static SubLList $list55;
    private static SubLList $list56;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_PRED_VAR;
    private static SubLList $list58;
    private static SubLList $list59;
    private static SubLList $list60;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_COLLECTION_VAR;
    private static SubLList $list62;
    private static SubLList $list63;
    private static SubLSymbol $BREADTH;
    private static SubLSymbol $QUEUE;
    private static SubLSymbol $STACK;
    private static SubLSymbol $sym67$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static SubLSymbol $ERROR;
    private static SubLString $str69$_A_is_not_a__A;
    private static SubLSymbol $sym70$SBHL_TRUE_TV_P;
    private static SubLSymbol $CERROR;
    private static SubLString $str72$continue_anyway;
    private static SubLSymbol $WARN;
    private static SubLString $str74$_A_is_not_a_valid__sbhl_type_erro;
    private static SubLString $str75$_A_is_neither_SET_P_nor_LISTP_;
    private static SubLString $str76$attempting_to_bind_direction_link;
    private static SubLList $list77;
    private static SubLString $str78$Node__a_does_not_pass_sbhl_type_t;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_PRED_AND_COUNT_VAR;
    private static SubLList $list80;
    private static SubLObject $$assertedArg1BinaryPreds_CountMin;
    private static SubLSymbol $ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_ARG1_OR_ARG2_POS;
    private static SubLList $list83;
    private static SubLSymbol $OVER;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_POS_CHECK;
    private static SubLList $list86;
    private static SubLSymbol $ASSERTED_ARG1_BINARY_PREDS;
    private static SubLSymbol $sym88$_N;
    private static SubLSymbol $sym89$_COL;
    private static SubLSymbol $sym90$_PRED;
    private static SubLObject $$implies;
    private static SubLList $list92;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_NEG_CHECK;
    private static SubLList $list94;
    private static SubLList $list95;
    private static SubLList $list96;
    private static SubLList $list97;
    private static SubLSymbol $sym98$_;
    private static SubLSymbol $sym99$CDR;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_PRED_VAR;
    private static SubLList $list101;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_COLLECTION_VAR;
    private static SubLList $list103;
    private static SubLObject $$assertedArg1BinaryPreds_PercentMi;
    private static SubLSymbol $ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_ARG1_OR_ARG2_POS;
    private static SubLList $list106;
    private static SubLList $list107;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_POS_CHECK;
    private static SubLList $list109;
    private static SubLObject $$evaluate;
    private static SubLObject $$CardinalityOfFn;
    private static SubLSymbol $EVAL;
    private static SubLObject $$TimesFn;
    private static SubLSymbol $sym114$_TIMESFN;
    private static SubLList $list115;
    private static SubLList $list116;
    private static SubLObject $$cardinalityAtLeast;
    private static SubLSymbol $FORT;
    private static SubLSymbol $INTEGER;
    private static SubLList $list120;
    private static SubLList $list121;
    private static SubLList $list122;
    private static SubLSymbol $sym123$_VALUE;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_NEG_CHECK;
    private static SubLList $list125;
    private static SubLList $list126;
    private static SubLInteger $int$100;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_PRED_VAR;
    private static SubLList $list129;
    private static SubLList $list130;
    private static SubLList $list131;
    private static SubLSymbol $sym132$SPEC_;
    private static SubLSymbol $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_COLLECTION_VAR;
    private static SubLList $list134;
    private static SubLList $list135;
    private static SubLList $list136;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 1200L)
    public static SubLObject removal_asserted_arg1_binary_preds_pos_check_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_arg1_binary_preds_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 1500L)
    public static SubLObject removal_asserted_arg1_binary_preds_pos_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject assertion = removal_asserted_arg1_binary_preds_check(asent);
        if (NIL != assertion) {
            SubLObject support = removal_asserted_arg1_binary_preds_main_support(asent);
            backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 2400L)
    public static SubLObject removal_asserted_arg1_binary_preds_check_cost(SubLObject asent) {
        SubLObject col = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return removal_asserted_arg1_binary_preds_cost_from_raw_cost(Numbers.min(ONE_INTEGER, cardinality_estimates.instance_cardinality(col)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 2600L)
    public static SubLObject removal_asserted_arg1_binary_preds_neg_check_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_asserted_arg1_binary_preds_check_cost(asent));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 2900L)
    public static SubLObject removal_asserted_arg1_binary_preds_neg_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL == removal_asserted_arg1_binary_preds_check(asent)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 3800L)
    public static SubLObject removal_asserted_arg1_binary_preds_pred_var_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject col = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return cardinality_estimates.instance_cardinality(col);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 4100L)
    public static SubLObject do_sampled_instances(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list8);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance = NIL;
        SubLObject col = NIL;
        SubLObject full_sampleP = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list8);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list8);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list8);
        full_sampleP = current.first();
        current = current.rest();
        SubLObject number = current.isCons() ? current.first() : $int$200;
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list8);
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject all_fort_instances = $sym10$ALL_FORT_INSTANCES;
            SubLObject sampled_instances = $sym11$SAMPLED_INSTANCES;
            return list($sym12$CLET, list(list(all_fort_instances, listS($sym13$ALL_FORT_INSTANCES, col, $list14))), list($sym15$CSETQ, full_sampleP, list($sym16$LENGTH__, all_fort_instances, number)),
                    list($sym12$CLET, list(list(sampled_instances, list($sym17$FIF, full_sampleP, all_fort_instances, list($sym18$RANDOM_N, number, all_fort_instances)))), listS($sym19$CDOLIST, list(instance, sampled_instances), append(body, NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list8);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 4700L)
    public static SubLObject removal_asserted_arg1_binary_preds_pred_var_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col = NIL;
        SubLObject pred_var = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        pred_var = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject sbhl_tv = $$True_JustificationTruth;
            SubLObject index_tv = sbhl_search_vars.sbhl_translate_to_old_tv(sbhl_tv);
            SubLObject done_preds = NIL;
            SubLObject full_sampleP = NIL;
            SubLObject all_fort_instances = isa.all_fort_instances(col, NIL, $$True_JustificationTruth);
            full_sampleP = list_utilities.lengthLE(all_fort_instances, $int$200, UNPROVIDED);
            SubLObject cdolist_list_var;
            SubLObject sampled_instances = cdolist_list_var = ((NIL != full_sampleP) ? all_fort_instances : list_utilities.random_n($int$200, all_fort_instances));
            SubLObject instance = NIL;
            instance = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1;
                SubLObject preds = cdolist_list_var_$1 = inference_trampolines.inference_key_gaf_arg_index(instance, ONE_INTEGER, UNPROVIDED);
                SubLObject pred = NIL;
                pred = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    if (NIL == subl_promotions.memberP(pred, done_preds, UNPROVIDED, UNPROVIDED) && NIL != kb_accessors.binary_predicateP(pred) && NIL != some_asserted_pred_value(instance, pred, ONE_INTEGER, index_tv)) {
                        thread.resetMultipleValues();
                        SubLObject v_bindings = unification_utilities.term_unify(pred_var, pred, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            SubLObject support_sentence = el_utilities.replace_formula_arg(TWO_INTEGER, pred, asent);
                            SubLObject main_support = removal_asserted_arg1_binary_preds_main_support(support_sentence);
                            backward.removal_add_node(main_support, v_bindings, unify_justification);
                            done_preds = cons(pred, done_preds);
                        }
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    pred = cdolist_list_var_$1.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list20);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 5600L)
    public static SubLObject some_asserted_pred_value(SubLObject v_term, SubLObject pred, SubLObject index_arg, SubLObject truth) {
        SubLObject ans = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
            SubLObject done_var = ans;
            SubLObject token_var = NIL;
            while (NIL == done_var) {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$2 = ans;
                        SubLObject token_var_$3 = NIL;
                        while (NIL == done_var_$2) {
                            SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                            SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(as));
                            if (NIL != valid_$4) {
                                ans = assertions_high.asserted_assertionP(as);
                            }
                            done_var_$2 = makeBoolean(NIL == valid_$4 || NIL != ans);
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
                done_var = makeBoolean(NIL == valid || NIL != ans);
            }
        }
        return ans;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 5900L)
    public static SubLObject asserted_arg1_binary_preds_justify(SubLObject asent, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        SubLObject col = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject pred_as = removal_asserted_arg1_binary_preds_check(asent);
            if (NIL != pred_as) {
                SubLObject code_support = removal_asserted_arg1_binary_preds_code_support();
                SubLObject instance = assertions_high.gaf_arg1(pred_as);
                SubLObject isa_support = arguments.make_hl_support($ISA, el_utilities.make_binary_formula($$isa, instance, col), UNPROVIDED, UNPROVIDED);
                SubLObject pred_support_sentence = el_utilities.make_unary_formula($$assertedSentence, assertions_high.gaf_formula(pred_as));
                SubLObject pred_support = arguments.make_hl_support($OPAQUE, pred_support_sentence, UNPROVIDED, UNPROVIDED);
                supports = list(isa_support, pred_as, pred_support, code_support);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 6600L)
    public static SubLObject removal_asserted_arg1_binary_preds_code_support() {
        return arguments.make_hl_support($CODE, $list28, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 7400L)
    public static SubLObject removal_asserted_arg1_binary_preds_collection_var_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 7700L)
    public static SubLObject removal_asserted_arg1_binary_preds_collection_var_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject collection_var = NIL;
        SubLObject pred = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
        collection_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != kb_accessors.binary_predicateP(pred)) {
                SubLObject sbhl_tv = $$True_JustificationTruth;
                SubLObject index_tv = sbhl_search_vars.sbhl_translate_to_old_tv(sbhl_tv);
                SubLObject done_cols = NIL;
                SubLObject cdolist_list_var = asserted_pred_refs(pred, ONE_INTEGER, index_tv);
                SubLObject instance = NIL;
                instance = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$5 = isa.isa(instance, mt_relevance_macros.$mt$.getDynamicValue(thread), sbhl_tv);
                    SubLObject col = NIL;
                    col = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        if (NIL == subl_promotions.memberP(col, done_cols, UNPROVIDED, UNPROVIDED)) {
                            thread.resetMultipleValues();
                            SubLObject v_bindings = unification_utilities.term_unify(collection_var, col, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                SubLObject support_sentence = el_utilities.replace_formula_arg(ONE_INTEGER, col, asent);
                                SubLObject main_support = removal_asserted_arg1_binary_preds_main_support(support_sentence);
                                backward.removal_add_node(main_support, v_bindings, unify_justification);
                                done_cols = cons(col, done_cols);
                            }
                        }
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        col = cdolist_list_var_$5.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    instance = cdolist_list_var.first();
                }
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list31);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 9800L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_pos_check_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_arg1_binary_preds_count_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 10200L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_pos_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject result = removal_asserted_arg1_binary_preds_count_check(asent);
        if ($VERIFIED == result) {
            SubLObject support = removal_asserted_arg1_binary_preds_main_support(asent);
            backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 11100L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_check_cost(SubLObject asent) {
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col = NIL;
        SubLObject pred = NIL;
        SubLObject count = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
        count = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_asserted_arg1_binary_preds_cost_from_raw_cost(number_utilities.minimum(list(cardinality_estimates.instance_cardinality(col), count, kb_indexing.num_predicate_extent_index(pred, UNPROVIDED)), UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list40);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 11500L)
    public static SubLObject removal_asserted_arg1_binary_preds_cost_from_raw_cost(SubLObject raw_cost) {
        if (raw_cost.numL(TEN_INTEGER)) {
            return control_vars.$cheap_hl_module_check_cost$.getGlobalValue();
        }
        if (raw_cost.numG($int$1000)) {
            return control_vars.$expensive_hl_module_check_cost$.getGlobalValue();
        }
        return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 11700L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_check(SubLObject asent) {
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col = NIL;
        SubLObject pred = NIL;
        SubLObject count = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
        count = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_asserted_arg1_binary_preds_count(col, pred, count);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list40);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 12000L)
    public static SubLObject asserted_arg1_binary_preds_count_justify(SubLObject asent, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject result = removal_asserted_arg1_binary_preds_count_check(asent);
            if (result == $VERIFIED) {
                SubLObject current;
                SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject col = NIL;
                SubLObject pred = NIL;
                SubLObject count = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
                col = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
                count = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject code_support = removal_asserted_arg1_binary_preds_count_code_support();
                    SubLObject isa_support = arguments.make_hl_support($ISA, el_utilities.make_binary_formula($$isa, pred, $$BinaryPredicate), UNPROVIDED, UNPROVIDED);
                    SubLObject cardinality_support_sentence = el_utilities.make_binary_formula($$cardinality,
                            list($$TheSetOf, $sym45$_INSTANCE, list($$and, list($$isa, $sym45$_INSTANCE, col), ConsesLow.list($$assertedPredicateArg, $sym45$_INSTANCE, ONE_INTEGER, pred))), count);
                    SubLObject cardinality_support = arguments.make_hl_support($OPAQUE, cardinality_support_sentence, UNPROVIDED, UNPROVIDED);
                    supports = list(isa_support, cardinality_support, code_support);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list40);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 12900L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_code_support() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rule_formula = $list48;
        SubLObject support = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym49$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject rule_assertion = czer_meta.find_assertion_cycl(rule_formula, UNPROVIDED);
            support = ((NIL != rule_assertion) ? rule_assertion : arguments.make_hl_support($CODE, rule_formula, UNPROVIDED, UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return support;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 13500L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_neg_check_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_asserted_arg1_binary_preds_count_check_cost(asent));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 13800L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_neg_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if ($VERIFIED != removal_asserted_arg1_binary_preds_count_check(asent)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 14800L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_count_var_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return ONE_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 15000L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_count_var_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col = NIL;
        SubLObject pred = NIL;
        SubLObject count_var = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list53);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list53);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list53);
        count_var = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject count = removal_asserted_arg1_binary_preds_count(col, pred, count_var);
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(count_var, count, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                SubLObject support_sentence = el_utilities.replace_formula_arg(THREE_INTEGER, count, asent);
                SubLObject main_support = removal_asserted_arg1_binary_preds_main_support(support_sentence);
                backward.removal_add_node(main_support, v_bindings, unify_justification);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list53);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 16300L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_pred_var_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject col = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return cardinality_estimates.instance_cardinality(col);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 16600L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_pred_var_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col = NIL;
        SubLObject pred_var = NIL;
        SubLObject count = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list56);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list56);
        pred_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list56);
        count = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject done_preds = NIL;
            SubLObject full_sampleP = NIL;
            SubLObject all_fort_instances = isa.all_fort_instances(col, NIL, $$True_JustificationTruth);
            full_sampleP = list_utilities.lengthLE(all_fort_instances, $int$200, UNPROVIDED);
            SubLObject cdolist_list_var;
            SubLObject sampled_instances = cdolist_list_var = ((NIL != full_sampleP) ? all_fort_instances : list_utilities.random_n($int$200, all_fort_instances));
            SubLObject instance = NIL;
            instance = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$6;
                SubLObject preds = cdolist_list_var_$6 = inference_trampolines.inference_key_gaf_arg_index(instance, ONE_INTEGER, UNPROVIDED);
                SubLObject pred = NIL;
                pred = cdolist_list_var_$6.first();
                while (NIL != cdolist_list_var_$6) {
                    if (NIL == subl_promotions.memberP(pred, done_preds, UNPROVIDED, UNPROVIDED)) {
                        done_preds = cons(pred, done_preds);
                        if ($VERIFIED == removal_asserted_arg1_binary_preds_count(col, pred, count)) {
                            thread.resetMultipleValues();
                            SubLObject v_bindings = unification_utilities.term_unify(pred_var, pred, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                SubLObject support_sentence = el_utilities.replace_formula_arg(TWO_INTEGER, pred, asent);
                                SubLObject main_support = removal_asserted_arg1_binary_preds_main_support(support_sentence);
                                backward.removal_add_node(main_support, v_bindings, unify_justification);
                            }
                        }
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    pred = cdolist_list_var_$6.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list56);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 18200L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_collection_var_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col_var = NIL;
        SubLObject pred = NIL;
        SubLObject count = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
        col_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
        count = current.first();
        current = current.rest();
        if (NIL == current) {
            return number_utilities.minimum(list(count, kb_indexing.num_predicate_extent_index(pred, UNPROVIDED)), UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list59);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 18600L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_collection_var_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_arg1_binary_preds_count_collection_var_expand_int(asent, $list60);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 19500L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_pred_and_count_var_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject col = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return cardinality_estimates.instance_cardinality(col);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 19800L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_pred_and_count_var_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col = NIL;
        SubLObject pred_var = NIL;
        SubLObject count_var = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
        pred_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
        count_var = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject sbhl_tv = $$True_JustificationTruth;
            SubLObject done_preds = NIL;
            SubLObject node_var = col;
            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$7 = node_var;
                    SubLObject deck_type = $STACK;
                    SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject _prev_bind_0_$8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            SubLObject tv_var = sbhl_tv;
                            SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            SubLObject _prev_bind_1_$10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym67$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str72$continue_anyway, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else if (pcase_var.eql($WARN)) {
                                        Errors.warn($str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str74$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($str72$continue_anyway, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P);
                                    }
                                }
                                SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                        SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        SubLObject _prev_bind_2_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(
                                                    sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$7, UNPROVIDED);
                                            while (NIL != node_var_$7) {
                                                SubLObject tt_node_var = node_var_$7;
                                                SubLObject cdolist_list_var;
                                                SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    SubLObject _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                                (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                            iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$19;
                                                                                for (iteration_state_$19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                        iteration_state_$19); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next(iteration_state_$19)) {
                                                                                    thread.resetMultipleValues();
                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$19);
                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject instance;
                                                                                                SubLObject cdolist_list_var_$21;
                                                                                                SubLObject preds;
                                                                                                SubLObject pred;
                                                                                                SubLObject count;
                                                                                                SubLObject support_formula;
                                                                                                SubLObject v_bindings;
                                                                                                SubLObject gaf_asent;
                                                                                                SubLObject unify_justification;
                                                                                                SubLObject main_support;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object,
                                                                                                        set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, instance)
                                                                                                            && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(instance)) {
                                                                                                            preds = (cdolist_list_var_$21 = inference_trampolines.inference_key_gaf_arg_index(instance, ONE_INTEGER, UNPROVIDED));
                                                                                                            pred = NIL;
                                                                                                            pred = cdolist_list_var_$21.first();
                                                                                                            while (NIL != cdolist_list_var_$21) {
                                                                                                                done_preds = ConsesLow.cons(pred, done_preds);
                                                                                                                count = removal_asserted_arg1_binary_preds_count(col, pred, count_var);
                                                                                                                if (count.isPositive()) {
                                                                                                                    support_formula = el_utilities.replace_formula_arg(TWO_INTEGER, pred, el_utilities.replace_formula_arg(THREE_INTEGER, count, asent));
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    v_bindings = unification_utilities.gaf_asent_unify(asent, support_formula, T, T);
                                                                                                                    gaf_asent = thread.secondMultipleValue();
                                                                                                                    unify_justification = thread.thirdMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    if (NIL != v_bindings) {
                                                                                                                        main_support = removal_asserted_arg1_binary_preds_main_support(support_formula);
                                                                                                                        backward.removal_add_node(main_support, v_bindings, unify_justification);
                                                                                                                    }
                                                                                                                }
                                                                                                                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                                                                                                pred = cdolist_list_var_$21.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject instance2 = NIL;
                                                                                                instance2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(instance2)) {
                                                                                                            SubLObject cdolist_list_var_$22;
                                                                                                            SubLObject preds2 = cdolist_list_var_$22 = inference_trampolines.inference_key_gaf_arg_index(instance2, ONE_INTEGER, UNPROVIDED);
                                                                                                            SubLObject pred2 = NIL;
                                                                                                            pred2 = cdolist_list_var_$22.first();
                                                                                                            while (NIL != cdolist_list_var_$22) {
                                                                                                                done_preds = ConsesLow.cons(pred2, done_preds);
                                                                                                                SubLObject count2 = removal_asserted_arg1_binary_preds_count(col, pred2, count_var);
                                                                                                                if (count2.isPositive()) {
                                                                                                                    SubLObject support_formula2 = el_utilities.replace_formula_arg(TWO_INTEGER, pred2, el_utilities.replace_formula_arg(THREE_INTEGER, count2, asent));
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    SubLObject v_bindings2 = unification_utilities.gaf_asent_unify(asent, support_formula2, T, T);
                                                                                                                    SubLObject gaf_asent2 = thread.secondMultipleValue();
                                                                                                                    SubLObject unify_justification2 = thread.thirdMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    if (NIL != v_bindings2) {
                                                                                                                        SubLObject main_support2 = removal_asserted_arg1_binary_preds_main_support(support_formula2);
                                                                                                                        backward.removal_add_node(main_support2, v_bindings2, unify_justification2);
                                                                                                                    }
                                                                                                                }
                                                                                                                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                                                                                                                pred2 = cdolist_list_var_$22.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    instance2 = csome_list_var.first();
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$14, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$19);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$13, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str76$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current_$24;
                                                                    SubLObject datum_$23 = current_$24 = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt2 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current_$24, datum_$23, $list77);
                                                                    link_node = current_$24.first();
                                                                    current_$24 = current_$24.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current_$24, datum_$23, $list77);
                                                                    mt2 = current_$24.first();
                                                                    current_$24 = current_$24.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current_$24, datum_$23, $list77);
                                                                    tv2 = current_$24.first();
                                                                    current_$24 = current_$24.rest();
                                                                    if (NIL == current_$24) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        SubLObject sol;
                                                                                        SubLObject link_nodes2 = sol = ConsesLow.list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject instance;
                                                                                            SubLObject preds;
                                                                                            SubLObject pred;
                                                                                            SubLObject count;
                                                                                            SubLObject support_formula;
                                                                                            SubLObject v_bindings;
                                                                                            SubLObject gaf_asent;
                                                                                            SubLObject unify_justification;
                                                                                            SubLObject main_support;
                                                                                            SubLObject cdolist_list_var_$23;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object,
                                                                                                    set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, instance)
                                                                                                        && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(instance)) {
                                                                                                        preds = (cdolist_list_var_$23 = inference_trampolines.inference_key_gaf_arg_index(instance, ONE_INTEGER, UNPROVIDED));
                                                                                                        pred = NIL;
                                                                                                        pred = cdolist_list_var_$23.first();
                                                                                                        while (NIL != cdolist_list_var_$23) {
                                                                                                            done_preds = ConsesLow.cons(pred, done_preds);
                                                                                                            count = removal_asserted_arg1_binary_preds_count(col, pred, count_var);
                                                                                                            if (count.isPositive()) {
                                                                                                                support_formula = el_utilities.replace_formula_arg(TWO_INTEGER, pred, el_utilities.replace_formula_arg(THREE_INTEGER, count, asent));
                                                                                                                thread.resetMultipleValues();
                                                                                                                v_bindings = unification_utilities.gaf_asent_unify(asent, support_formula, T, T);
                                                                                                                gaf_asent = thread.secondMultipleValue();
                                                                                                                unify_justification = thread.thirdMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if (NIL != v_bindings) {
                                                                                                                    main_support = removal_asserted_arg1_binary_preds_main_support(support_formula);
                                                                                                                    backward.removal_add_node(main_support, v_bindings, unify_justification);
                                                                                                                }
                                                                                                            }
                                                                                                            cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                                                                                                            pred = cdolist_list_var_$23.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$28 = sol;
                                                                                            SubLObject instance2 = NIL;
                                                                                            instance2 = csome_list_var_$28.first();
                                                                                            while (NIL != csome_list_var_$28) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(instance2)) {
                                                                                                        SubLObject cdolist_list_var_$24;
                                                                                                        SubLObject preds2 = cdolist_list_var_$24 = inference_trampolines.inference_key_gaf_arg_index(instance2, ONE_INTEGER, UNPROVIDED);
                                                                                                        SubLObject pred2 = NIL;
                                                                                                        pred2 = cdolist_list_var_$24.first();
                                                                                                        while (NIL != cdolist_list_var_$24) {
                                                                                                            done_preds = ConsesLow.cons(pred2, done_preds);
                                                                                                            SubLObject count2 = removal_asserted_arg1_binary_preds_count(col, pred2, count_var);
                                                                                                            if (count2.isPositive()) {
                                                                                                                SubLObject support_formula2 = el_utilities.replace_formula_arg(TWO_INTEGER, pred2, el_utilities.replace_formula_arg(THREE_INTEGER, count2, asent));
                                                                                                                thread.resetMultipleValues();
                                                                                                                SubLObject v_bindings2 = unification_utilities.gaf_asent_unify(asent, support_formula2, T, T);
                                                                                                                SubLObject gaf_asent2 = thread.secondMultipleValue();
                                                                                                                SubLObject unify_justification2 = thread.thirdMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if (NIL != v_bindings2) {
                                                                                                                    SubLObject main_support2 = removal_asserted_arg1_binary_preds_main_support(support_formula2);
                                                                                                                    backward.removal_add_node(main_support2, v_bindings2, unify_justification2);
                                                                                                                }
                                                                                                            }
                                                                                                            cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                                                                                                            pred2 = cdolist_list_var_$24.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$28 = csome_list_var_$28.rest();
                                                                                                instance2 = csome_list_var_$28.first();
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$16, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$15, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum_$23, $list77);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$25;
                                                            SubLObject new_list = cdolist_list_var_$25 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                    ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)),
                                                                            sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread),
                                                                            sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$25.first();
                                                            while (NIL != cdolist_list_var_$25) {
                                                                SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    SubLObject sol2;
                                                                    SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject instance3;
                                                                        SubLObject cdolist_list_var_$26;
                                                                        SubLObject preds3;
                                                                        SubLObject pred3;
                                                                        SubLObject count3;
                                                                        SubLObject support_formula3;
                                                                        SubLObject v_bindings3;
                                                                        SubLObject gaf_asent3;
                                                                        SubLObject unify_justification3;
                                                                        SubLObject main_support3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2,
                                                                                set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, instance3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (NIL != forts.fort_p(instance3)) {
                                                                                    preds3 = (cdolist_list_var_$26 = inference_trampolines.inference_key_gaf_arg_index(instance3, ONE_INTEGER, UNPROVIDED));
                                                                                    pred3 = NIL;
                                                                                    pred3 = cdolist_list_var_$26.first();
                                                                                    while (NIL != cdolist_list_var_$26) {
                                                                                        done_preds = cons(pred3, done_preds);
                                                                                        count3 = removal_asserted_arg1_binary_preds_count(col, pred3, count_var);
                                                                                        if (count3.isPositive()) {
                                                                                            support_formula3 = el_utilities.replace_formula_arg(TWO_INTEGER, pred3, el_utilities.replace_formula_arg(THREE_INTEGER, count3, asent));
                                                                                            thread.resetMultipleValues();
                                                                                            v_bindings3 = unification_utilities.gaf_asent_unify(asent, support_formula3, T, T);
                                                                                            gaf_asent3 = thread.secondMultipleValue();
                                                                                            unify_justification3 = thread.thirdMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != v_bindings3) {
                                                                                                main_support3 = removal_asserted_arg1_binary_preds_main_support(support_formula3);
                                                                                                backward.removal_add_node(main_support3, v_bindings3, unify_justification3);
                                                                                            }
                                                                                        }
                                                                                        cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                                                                        pred3 = cdolist_list_var_$26.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject instance4 = NIL;
                                                                        instance4 = csome_list_var3.first();
                                                                        while (NIL != csome_list_var3) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (NIL != forts.fort_p(instance4)) {
                                                                                    SubLObject cdolist_list_var_$27;
                                                                                    SubLObject preds4 = cdolist_list_var_$27 = inference_trampolines.inference_key_gaf_arg_index(instance4, ONE_INTEGER, UNPROVIDED);
                                                                                    SubLObject pred4 = NIL;
                                                                                    pred4 = cdolist_list_var_$27.first();
                                                                                    while (NIL != cdolist_list_var_$27) {
                                                                                        done_preds = cons(pred4, done_preds);
                                                                                        SubLObject count4 = removal_asserted_arg1_binary_preds_count(col, pred4, count_var);
                                                                                        if (count4.isPositive()) {
                                                                                            SubLObject support_formula4 = el_utilities.replace_formula_arg(TWO_INTEGER, pred4, el_utilities.replace_formula_arg(THREE_INTEGER, count4, asent));
                                                                                            thread.resetMultipleValues();
                                                                                            SubLObject v_bindings4 = unification_utilities.gaf_asent_unify(asent, support_formula4, T, T);
                                                                                            SubLObject gaf_asent4 = thread.secondMultipleValue();
                                                                                            SubLObject unify_justification4 = thread.thirdMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != v_bindings4) {
                                                                                                SubLObject main_support4 = removal_asserted_arg1_binary_preds_main_support(support_formula4);
                                                                                                backward.removal_add_node(main_support4, v_bindings4, unify_justification4);
                                                                                            }
                                                                                        }
                                                                                        cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                                                                        pred4 = cdolist_list_var_$27.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            instance4 = csome_list_var3.first();
                                                                        }
                                                                    } else {
                                                                        Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$17, thread);
                                                                }
                                                                cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                                                                generating_fn = cdolist_list_var_$25.first();
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$13, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$12, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    SubLObject _prev_bind_0_$18 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                                (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        SubLObject node2 = function_terms.naut_to_nart(node_var_$7);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                            iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            SubLObject _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$20;
                                                                                for (iteration_state_$20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                        iteration_state_$20); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(iteration_state_$20)) {
                                                                                    thread.resetMultipleValues();
                                                                                    SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$20);
                                                                                    SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        SubLObject _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            SubLObject sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3,
                                                                                                        set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (NIL != csome_list_var4) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$20, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$20);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$19, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str76$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$28;
                                                            SubLObject new_list2 = cdolist_list_var_$28 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                    ? list_utilities.randomize_list(
                                                                            sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$28.first();
                                                            while (NIL != cdolist_list_var_$28) {
                                                                SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    SubLObject sol4;
                                                                    SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4,
                                                                                set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (NIL != csome_list_var5) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    } else {
                                                                        Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$21, thread);
                                                                }
                                                                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                                                generating_fn2 = cdolist_list_var_$28.first();
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$14, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$18, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$7 = deck.deck_pop(recur_deck);
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$15, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$12, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$11, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str78$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$11, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$10, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$10, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$9, thread);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$8, thread);
                    }
                } finally {
                    SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list63);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 22200L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_min_pos_check_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_arg1_binary_preds_count_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 22600L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_min_pos_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject result = removal_asserted_arg1_binary_preds_count_check(asent);
        if ($VERIFIED == result || $OVER == result) {
            SubLObject support = removal_asserted_arg1_binary_preds_main_support(asent);
            backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 23600L)
    public static SubLObject asserted_arg1_binary_preds_count_min_justify(SubLObject asent, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject result = removal_asserted_arg1_binary_preds_count_check(asent);
            if (result == $VERIFIED || result == $OVER) {
                SubLObject current;
                SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject col = NIL;
                SubLObject pred = NIL;
                SubLObject count = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
                col = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
                count = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject code_support = removal_asserted_arg1_binary_preds_count_min_code_support();
                    SubLObject isa_support = arguments.make_hl_support($ISA, el_utilities.make_binary_formula($$isa, pred, $$BinaryPredicate), UNPROVIDED, UNPROVIDED);
                    SubLObject cardinality_support_sentence = asserted_arg1_binary_preds_cardinality_sentence(col, pred, count);
                    SubLObject cardinality_support = arguments.make_hl_support($ASSERTED_ARG1_BINARY_PREDS, cardinality_support_sentence, UNPROVIDED, UNPROVIDED);
                    supports = list(isa_support, cardinality_support, code_support);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list40);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 24400L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_min_code_support() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count_var = $sym88$_N;
        SubLObject cardinality_conjunct = asserted_arg1_binary_preds_cardinality_sentence($sym89$_COL, $sym90$_PRED, count_var);
        SubLObject rule_formula = list($$implies, list($$and, $list92, cardinality_conjunct), list($$assertedArg1BinaryPreds_CountMin, $sym89$_COL, $sym90$_PRED, count_var));
        SubLObject support = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym49$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject rule_assertion = czer_meta.find_assertion_cycl(rule_formula, UNPROVIDED);
            support = ((NIL != rule_assertion) ? rule_assertion : arguments.make_hl_support($CODE, rule_formula, UNPROVIDED, UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return support;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 25000L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_min_neg_check_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_asserted_arg1_binary_preds_check_cost(asent));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 25400L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_min_neg_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if ($VERIFIED != removal_asserted_arg1_binary_preds_count_check(asent)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 26400L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_min_pred_var_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col = NIL;
        SubLObject pred_var = NIL;
        SubLObject count_min = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list95);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list95);
        pred_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list95);
        count_min = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list95);
            return NIL;
        }
        if (count_min.isZero()) {
            return isa.count_all_instances($$BinaryPredicate, UNPROVIDED, UNPROVIDED);
        }
        SubLObject instance_count = isa.count_all_instances(col, UNPROVIDED, UNPROVIDED);
        return removal_asserted_arg1_binary_preds_foo_min_pred_var_cost(instance_count, count_min);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 27000L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_min_pred_var_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col = NIL;
        SubLObject pred_var = NIL;
        SubLObject count = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list56);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list56);
        pred_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list56);
        count = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject done_preds = NIL;
            SubLObject full_sampleP = NIL;
            SubLObject all_fort_instances = isa.all_fort_instances(col, NIL, $$True_JustificationTruth);
            full_sampleP = list_utilities.lengthLE(all_fort_instances, $int$200, UNPROVIDED);
            SubLObject cdolist_list_var;
            SubLObject sampled_instances = cdolist_list_var = ((NIL != full_sampleP) ? all_fort_instances : list_utilities.random_n($int$200, all_fort_instances));
            SubLObject instance = NIL;
            instance = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$43;
                SubLObject preds = cdolist_list_var_$43 = inference_trampolines.inference_key_gaf_arg_index(instance, ONE_INTEGER, UNPROVIDED);
                SubLObject pred = NIL;
                pred = cdolist_list_var_$43.first();
                while (NIL != cdolist_list_var_$43) {
                    SubLObject sofar = list_utilities.alist_lookup(done_preds, pred, Symbols.symbol_function(EQL), ZERO_INTEGER);
                    done_preds = list_utilities.alist_enter(done_preds, pred, number_utilities.f_1X(sofar), UNPROVIDED);
                    cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                    pred = cdolist_list_var_$43.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            }
            SubLObject cdolist_list_var2 = Sort.sort(done_preds, Symbols.symbol_function($sym98$_), Symbols.symbol_function($sym99$CDR));
            SubLObject cons = NIL;
            cons = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject current_$45;
                SubLObject datum_$44 = current_$45 = cons;
                SubLObject pred2 = NIL;
                SubLObject pred_count = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$45, datum_$44, $list96);
                pred2 = current_$45.first();
                current_$45 = (pred_count = current_$45.rest());
                if (pred_count.numGE(count) || (NIL == full_sampleP && NIL != conses_high.member(removal_asserted_arg1_binary_preds_count(col, pred2, count), $list97, UNPROVIDED, UNPROVIDED))) {
                    thread.resetMultipleValues();
                    SubLObject v_bindings = unification_utilities.term_unify(pred_var, pred2, T, T);
                    SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        SubLObject support_sentence = el_utilities.replace_formula_arg(TWO_INTEGER, pred2, asent);
                        SubLObject main_support = removal_asserted_arg1_binary_preds_main_support(support_sentence);
                        backward.removal_add_node(main_support, v_bindings, unify_justification);
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                cons = cdolist_list_var2.first();
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list56);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 28700L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_min_collection_var_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col_var = NIL;
        SubLObject pred = NIL;
        SubLObject count = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
        col_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
        count = current.first();
        current = current.rest();
        if (NIL == current) {
            return number_utilities.minimum(list(count, kb_indexing.num_predicate_extent_index(pred, UNPROVIDED)), UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list59);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 29100L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_min_collection_var_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_arg1_binary_preds_count_collection_var_expand_int(asent, $list97);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 30800L)
    public static SubLObject removal_asserted_arg1_binary_preds_percent_min_pos_check_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_arg1_binary_preds_count_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 31100L)
    public static SubLObject removal_asserted_arg1_binary_preds_percent_min_pos_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_asserted_arg1_binary_preds_percent_min_pos_check(asent)) {
            SubLObject support = removal_asserted_arg1_binary_preds_main_support(asent);
            backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 31500L)
    public static SubLObject removal_asserted_arg1_binary_preds_percent_min_pos_check(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col = NIL;
        SubLObject pred = NIL;
        SubLObject percent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list107);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list107);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list107);
        percent = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            SubLObject int_count = col_percent_to_count(col, percent);
            SubLObject float_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject test_sentence = el_utilities.make_ternary_formula($$assertedArg1BinaryPreds_CountMin, col, pred, int_count);
            SubLObject result = removal_asserted_arg1_binary_preds_count_check(test_sentence);
            return Values.values(makeBoolean($VERIFIED == result || $OVER == result), float_count);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list107);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 32000L)
    public static SubLObject col_percent_to_count(SubLObject col, SubLObject percent) {
        SubLObject cardinality = cardinality_estimates.instance_cardinality(col);
        SubLObject float_count = Numbers.multiply(percent, cardinality);
        SubLObject int_count = float_count.isInteger() ? float_count : Numbers.floor(number_utilities.f_1X(float_count), UNPROVIDED);
        return Values.values(int_count, float_count);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 32900L)
    public static SubLObject asserted_arg1_binary_preds_percent_min_justify(SubLObject asent, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            thread.resetMultipleValues();
            SubLObject passP = removal_asserted_arg1_binary_preds_percent_min_pos_check(asent);
            SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != passP) {
                SubLObject current;
                SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject col = NIL;
                SubLObject pred = NIL;
                SubLObject percent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list107);
                col = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list107);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list107);
                percent = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject code_support = removal_asserted_arg1_binary_preds_percent_min_code_support();
                    SubLObject isa_support = arguments.make_hl_support($ISA, el_utilities.make_binary_formula($$isa, pred, $$BinaryPredicate), UNPROVIDED, UNPROVIDED);
                    SubLObject instance_card = cardinality_estimates.instance_cardinality(col);
                    SubLObject instance_card_support_sentence = el_utilities.make_binary_formula($$evaluate, list($$CardinalityOfFn, col), instance_card);
                    SubLObject instance_card_support = arguments.make_hl_support($EVAL, instance_card_support_sentence, UNPROVIDED, UNPROVIDED);
                    SubLObject times_support_sentence = el_utilities.make_binary_formula($$evaluate, list($$TimesFn, percent, instance_card), count);
                    SubLObject times_support = arguments.make_hl_support($EVAL, times_support_sentence, UNPROVIDED, UNPROVIDED);
                    SubLObject cardinality_support_sentence = asserted_arg1_binary_preds_cardinality_sentence(col, pred, count);
                    SubLObject cardinality_support = arguments.make_hl_support($OPAQUE, cardinality_support_sentence, UNPROVIDED, UNPROVIDED);
                    supports = list(isa_support, instance_card_support, times_support, cardinality_support, code_support);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list107);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 34200L)
    public static SubLObject removal_asserted_arg1_binary_preds_percent_min_code_support() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count_var = $sym114$_TIMESFN;
        SubLObject cardinality_conjunct = asserted_arg1_binary_preds_cardinality_sentence($sym89$_COL, $sym90$_PRED, count_var);
        SubLObject rule_formula = listS($$implies, list($$and, $list92, cardinality_conjunct, listS($$evaluate, count_var, $list115)), $list116);
        SubLObject support = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym49$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject rule_assertion = czer_meta.find_assertion_cycl(rule_formula, UNPROVIDED);
            support = ((NIL != rule_assertion) ? rule_assertion : arguments.make_hl_support($CODE, rule_formula, UNPROVIDED, UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return support;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 34900L)
    public static SubLObject asserted_arg1_binary_preds_cardinality_sentence(SubLObject col, SubLObject pred, SubLObject count) {
        return el_utilities.make_binary_formula($$cardinalityAtLeast, list($$TheSetOf, $sym45$_INSTANCE, list($$and, list($$isa, $sym45$_INSTANCE, col), list($$assertedPredicateArg, $sym45$_INSTANCE, ONE_INTEGER, pred))), count);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 35100L)
    public static SubLObject asserted_arg1_binary_preds_cardinality_justify(SubLObject asent, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        if (NIL != formula_pattern_match.formula_matches_pattern(asent, asserted_arg1_binary_preds_cardinality_sentence($FORT, $FORT, $INTEGER))) {
            SubLObject col = cycl_utilities.formula_arg_position(asent, $list120, UNPROVIDED);
            SubLObject pred = cycl_utilities.formula_arg_position(asent, $list121, UNPROVIDED);
            SubLObject count = cycl_utilities.formula_arg_position(asent, $list122, UNPROVIDED);
            thread.resetMultipleValues();
            SubLObject result = removal_asserted_arg1_binary_preds_count_int(col, pred, count, T);
            SubLObject exemplars = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (result == $VERIFIED || result == $OVER) {
                SubLObject cdolist_list_var = exemplars;
                SubLObject exemplar = NIL;
                exemplar = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        SubLObject support_sentence = el_utilities.make_existential($sym123$_VALUE, el_utilities.make_binary_formula(pred, exemplar, $sym123$_VALUE));
                        SubLObject isa_sentence = el_utilities.make_binary_formula($$isa, exemplar, col);
                        supports = append(supports, asserted_arg1_binary_preds_boolean_supports(isa_sentence, mt), asserted_arg1_binary_preds_boolean_supports(support_sentence, mt));
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    exemplar = cdolist_list_var.first();
                }
            }
        }
        return supports;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 36300L)
    public static SubLObject asserted_arg1_binary_preds_boolean_supports(SubLObject sentence, SubLObject mt) {
        SubLObject ask_results = ask_utilities.ask_justified(sentence, mt, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
        SubLObject first_result = ask_results.first();
        SubLObject supports = conses_high.second(first_result);
        return supports;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 36500L)
    public static SubLObject removal_asserted_arg1_binary_preds_percent_min_neg_check_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_asserted_arg1_binary_preds_count_check_cost(asent));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 36900L)
    public static SubLObject removal_asserted_arg1_binary_preds_percent_min_neg_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL == removal_asserted_arg1_binary_preds_percent_min_pos_check(asent)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 37900L)
    public static SubLObject removal_asserted_arg1_binary_preds_percent_min_pred_var_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col = NIL;
        SubLObject pred_var = NIL;
        SubLObject percent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list126);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list126);
        pred_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list126);
        percent = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list126);
            return NIL;
        }
        if (percent.isZero()) {
            return isa.count_all_instances($$BinaryPredicate, UNPROVIDED, UNPROVIDED);
        }
        SubLObject instance_count = isa.count_all_instances(col, UNPROVIDED, UNPROVIDED);
        SubLObject count_min = Numbers.floor(Numbers.multiply(percent, instance_count), UNPROVIDED);
        return removal_asserted_arg1_binary_preds_foo_min_pred_var_cost(instance_count, count_min);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 38500L)
    public static SubLObject removal_asserted_arg1_binary_preds_foo_min_pred_var_cost(SubLObject instance_count, SubLObject count_min) {
        if (count_min.isZero()) {
            return isa.count_all_instances($$BinaryPredicate, UNPROVIDED, UNPROVIDED);
        }
        SubLObject scaling_factor = $int$100;
        return Numbers.integerDivide(instance_count, Numbers.multiply(count_min, scaling_factor));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 39000L)
    public static SubLObject removal_asserted_arg1_binary_preds_percent_min_pred_var_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col = NIL;
        SubLObject pred_var = NIL;
        SubLObject percent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list126);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list126);
        pred_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list126);
        percent = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject count = col_percent_to_count(col, percent);
            SubLObject full_sampleP = NIL;
            SubLObject done_preds = NIL;
            SubLObject all_fort_instances = isa.all_fort_instances(col, NIL, $$True_JustificationTruth);
            full_sampleP = list_utilities.lengthLE(all_fort_instances, $int$200, UNPROVIDED);
            SubLObject cdolist_list_var;
            SubLObject sampled_instances = cdolist_list_var = ((NIL != full_sampleP) ? all_fort_instances : list_utilities.random_n($int$200, all_fort_instances));
            SubLObject instance = NIL;
            instance = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$46;
                SubLObject preds = cdolist_list_var_$46 = inference_trampolines.inference_key_gaf_arg_index(instance, ONE_INTEGER, UNPROVIDED);
                SubLObject pred = NIL;
                pred = cdolist_list_var_$46.first();
                while (NIL != cdolist_list_var_$46) {
                    if (NIL == subl_promotions.memberP(pred, done_preds, UNPROVIDED, UNPROVIDED)) {
                        done_preds = cons(pred, done_preds);
                        if (NIL != subl_promotions.memberP(removal_asserted_arg1_binary_preds_count(col, pred, count), $list97, UNPROVIDED, UNPROVIDED)) {
                            thread.resetMultipleValues();
                            SubLObject v_bindings = unification_utilities.term_unify(pred_var, pred, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                SubLObject support_sentence = el_utilities.replace_formula_arg(TWO_INTEGER, pred, asent);
                                SubLObject main_support = removal_asserted_arg1_binary_preds_main_support(support_sentence);
                                backward.removal_add_node(main_support, v_bindings, unify_justification);
                            }
                        }
                    }
                    cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                    pred = cdolist_list_var_$46.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list126);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 40600L)
    public static SubLObject removal_asserted_arg1_binary_preds_percent_min_collection_var_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col_var = NIL;
        SubLObject pred = NIL;
        SubLObject percent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list130);
        col_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list130);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list130);
        percent = current.first();
        current = current.rest();
        if (NIL == current) {
            return kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list130);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 41000L)
    public static SubLObject removal_asserted_arg1_binary_preds_percent_min_collection_var_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject collection_var = NIL;
        SubLObject pred = NIL;
        SubLObject percent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list131);
        collection_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list131);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list131);
        percent = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != kb_accessors.binary_predicateP(pred)) {
                SubLObject sbhl_tv = $$True_JustificationTruth;
                SubLObject index_tv = sbhl_search_vars.sbhl_translate_to_old_tv(sbhl_tv);
                SubLObject no_cols = NIL;
                SubLObject yes_cols = NIL;
                SubLObject cdolist_list_var = asserted_pred_refs(pred, ONE_INTEGER, index_tv);
                SubLObject instance = NIL;
                instance = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$47 = isa.isa(instance, mt_relevance_macros.$mt$.getDynamicValue(thread), sbhl_tv);
                    SubLObject col = NIL;
                    col = cdolist_list_var_$47.first();
                    while (NIL != cdolist_list_var_$47) {
                        if (NIL != conses_high.member(col, yes_cols, Symbols.symbol_function($sym132$SPEC_), UNPROVIDED)) {
                            SubLObject item_var = col;
                            if (NIL == conses_high.member(item_var, yes_cols, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                yes_cols = cons(item_var, yes_cols);
                            }
                        } else if (NIL != conses_high.member(col, no_cols, Symbols.symbol_function($sym132$SPEC_), UNPROVIDED)) {
                            SubLObject item_var = col;
                            if (NIL == conses_high.member(item_var, no_cols, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                no_cols = cons(item_var, no_cols);
                            }
                        } else if (NIL != conses_high.member(removal_asserted_arg1_binary_preds_count(col, pred, col_percent_to_count(col, percent)), $list97, UNPROVIDED, UNPROVIDED)) {
                            yes_cols = cons(col, yes_cols);
                            thread.resetMultipleValues();
                            SubLObject v_bindings = unification_utilities.term_unify(collection_var, col, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                SubLObject support_sentence = el_utilities.replace_formula_arg(ONE_INTEGER, col, asent);
                                SubLObject main_support = removal_asserted_arg1_binary_preds_main_support(support_sentence);
                                backward.removal_add_node(main_support, v_bindings, unify_justification);
                            }
                        } else {
                            no_cols = cons(col, no_cols);
                        }
                        cdolist_list_var_$47 = cdolist_list_var_$47.rest();
                        col = cdolist_list_var_$47.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    instance = cdolist_list_var.first();
                }
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list131);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 42900L)
    public static SubLObject asserted_arg1_binary_preds_justify_general(SubLObject asent, SubLObject mt) {
        SubLObject pcase_var = cycl_utilities.atomic_sentence_arg0(asent);
        if (pcase_var.eql($$assertedArg1BinaryPreds)) {
            return asserted_arg1_binary_preds_justify(asent, mt);
        }
        if (pcase_var.eql($$assertedArg1BinaryPreds_Count)) {
            return asserted_arg1_binary_preds_count_justify(asent, mt);
        }
        if (pcase_var.eql($$assertedArg1BinaryPreds_CountMin)) {
            return asserted_arg1_binary_preds_count_min_justify(asent, mt);
        }
        if (pcase_var.eql($$assertedArg1BinaryPreds_PercentMi)) {
            return asserted_arg1_binary_preds_percent_min_justify(asent, mt);
        }
        if (pcase_var.eql($$cardinalityAtLeast)) {
            return asserted_arg1_binary_preds_cardinality_justify(asent, mt);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 43600L)
    public static SubLObject asserted_arg1_binary_preds_verify_general(SubLObject asent, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject pcase_var = cycl_utilities.atomic_sentence_arg0(asent);
            if (pcase_var.eql($$assertedArg1BinaryPreds)) {
                ans = removal_asserted_arg1_binary_preds_check(asent);
            } else if (pcase_var.eql($$assertedArg1BinaryPreds_Count)) {
                SubLObject current;
                SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject col = NIL;
                SubLObject pred = NIL;
                SubLObject count = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
                col = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
                count = current.first();
                current = current.rest();
                if (NIL == current) {
                    ans = Equality.eq($VERIFIED, removal_asserted_arg1_binary_preds_count(col, pred, count));
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list40);
                }
            } else if (pcase_var.eql($$assertedArg1BinaryPreds_CountMin)) {
                SubLObject current;
                SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject col = NIL;
                SubLObject pred = NIL;
                SubLObject count = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
                col = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
                count = current.first();
                current = current.rest();
                if (NIL == current) {
                    ans = conses_high.member(removal_asserted_arg1_binary_preds_count(col, pred, count), $list97, UNPROVIDED, UNPROVIDED);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list40);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 44300L)
    public static SubLObject removal_asserted_arg1_binary_preds_check(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject col = NIL;
        SubLObject pred = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list135);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list135);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject sbhl_tv = $$True_JustificationTruth;
            SubLObject index_tv = sbhl_search_vars.sbhl_translate_to_old_tv(sbhl_tv);
            SubLObject ans = NIL;
            if (NIL != kb_accessors.binary_predicateP(pred) && NIL != fort_types_interface.collectionP(col)) {
                SubLObject node_var = col;
                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        if (NIL == ans) {
                            SubLObject node_var_$48 = node_var;
                            SubLObject deck_type = $STACK;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    SubLObject tv_var = sbhl_tv;
                                    SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    SubLObject _prev_bind_1_$51 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym67$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                        if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql($ERROR)) {
                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str72$continue_anyway, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else if (pcase_var.eql($WARN)) {
                                                Errors.warn($str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str74$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($str72$continue_anyway, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P);
                                            }
                                        }
                                        SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_$52 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                            if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                SubLObject _prev_bind_0_$52 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                SubLObject _prev_bind_1_$53 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                SubLObject _prev_bind_2_$56 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(
                                                            sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$48, UNPROVIDED);
                                                    while (NIL != node_var_$48 && NIL == ans) {
                                                        SubLObject tt_node_var = node_var_$48;
                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                        SubLObject rest;
                                                        SubLObject module_var;
                                                        SubLObject _prev_bind_0_$53;
                                                        SubLObject _prev_bind_1_$54;
                                                        SubLObject node;
                                                        SubLObject d_link;
                                                        SubLObject mt_links;
                                                        SubLObject iteration_state;
                                                        SubLObject mt;
                                                        SubLObject tv_links;
                                                        SubLObject _prev_bind_0_$54;
                                                        SubLObject iteration_state_$60;
                                                        SubLObject tv;
                                                        SubLObject link_nodes;
                                                        SubLObject _prev_bind_0_$55;
                                                        SubLObject sol;
                                                        SubLObject set_contents_var;
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject instance;
                                                        SubLObject pred_var;
                                                        SubLObject iterator_var;
                                                        SubLObject done_var;
                                                        SubLObject token_var;
                                                        SubLObject final_index_spec;
                                                        SubLObject valid;
                                                        SubLObject final_index_iterator;
                                                        SubLObject done_var_$62;
                                                        SubLObject token_var_$63;
                                                        SubLObject as;
                                                        SubLObject valid_$64;
                                                        SubLObject _prev_bind_0_$56;
                                                        SubLObject _values;
                                                        SubLObject csome_list_var;
                                                        SubLObject instance2;
                                                        SubLObject pred_var2;
                                                        SubLObject iterator_var2;
                                                        SubLObject done_var2;
                                                        SubLObject token_var2;
                                                        SubLObject final_index_spec2;
                                                        SubLObject valid2;
                                                        SubLObject final_index_iterator2;
                                                        SubLObject done_var_$63;
                                                        SubLObject token_var_$64;
                                                        SubLObject as2;
                                                        SubLObject valid_$65;
                                                        SubLObject _prev_bind_0_$57;
                                                        SubLObject _values2;
                                                        SubLObject csome_list_var2;
                                                        SubLObject instance_tuple;
                                                        SubLObject current_$71;
                                                        SubLObject datum_$70;
                                                        SubLObject link_node;
                                                        SubLObject mt2;
                                                        SubLObject tv2;
                                                        SubLObject _prev_bind_0_$58;
                                                        SubLObject _prev_bind_0_$59;
                                                        SubLObject link_nodes2;
                                                        SubLObject done_var_$64;
                                                        SubLObject token_var_$65;
                                                        SubLObject valid_$66;
                                                        SubLObject _prev_bind_0_$60;
                                                        SubLObject _values3;
                                                        SubLObject csome_list_var_$78;
                                                        SubLObject done_var_$65;
                                                        SubLObject token_var_$66;
                                                        SubLObject valid_$67;
                                                        SubLObject _prev_bind_0_$61;
                                                        SubLObject _values4;
                                                        SubLObject new_list;
                                                        SubLObject rest_$83;
                                                        SubLObject generating_fn;
                                                        SubLObject _prev_bind_0_$62;
                                                        SubLObject sol2;
                                                        SubLObject link_nodes3;
                                                        SubLObject set_contents_var2;
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject instance3;
                                                        SubLObject pred_var3;
                                                        SubLObject iterator_var3;
                                                        SubLObject done_var3;
                                                        SubLObject token_var3;
                                                        SubLObject final_index_spec3;
                                                        SubLObject valid3;
                                                        SubLObject final_index_iterator3;
                                                        SubLObject done_var_$66;
                                                        SubLObject token_var_$67;
                                                        SubLObject as3;
                                                        SubLObject valid_$68;
                                                        SubLObject _prev_bind_0_$63;
                                                        SubLObject _values5;
                                                        SubLObject csome_list_var3;
                                                        SubLObject instance4;
                                                        SubLObject pred_var4;
                                                        SubLObject iterator_var4;
                                                        SubLObject done_var4;
                                                        SubLObject token_var4;
                                                        SubLObject final_index_spec4;
                                                        SubLObject valid4;
                                                        SubLObject final_index_iterator4;
                                                        SubLObject done_var_$67;
                                                        SubLObject token_var_$68;
                                                        SubLObject as4;
                                                        SubLObject valid_$69;
                                                        SubLObject _prev_bind_0_$64;
                                                        SubLObject _values6;
                                                        for (rest = NIL, rest = accessible_modules; NIL == ans && NIL != rest; rest = rest.rest()) {
                                                            module_var = rest.first();
                                                            _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            _prev_bind_1_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                                        (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread),
                                                                        thread);
                                                                node = function_terms.naut_to_nart(tt_node_var);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link) {
                                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links) {
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == ans
                                                                                    && NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                    _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        for (iteration_state_$60 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == ans
                                                                                                && NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$60); iteration_state_$60 = dictionary_contents.do_dictionary_contents_next(iteration_state_$60)) {
                                                                                            thread.resetMultipleValues();
                                                                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$60);
                                                                                            link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    sol = link_nodes;
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == ans
                                                                                                                && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if (NIL != set_contents.do_set_contents_element_validP(state, instance)
                                                                                                                    && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(instance)) {
                                                                                                                    pred_var = pred;
                                                                                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(instance, NIL, pred_var)) {
                                                                                                                        iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(instance, NIL, pred_var);
                                                                                                                        done_var = ans;
                                                                                                                        token_var = NIL;
                                                                                                                        while (NIL == done_var) {
                                                                                                                            final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                                                            valid = makeBoolean(!token_var.eql(final_index_spec));
                                                                                                                            if (NIL != valid) {
                                                                                                                                final_index_iterator = NIL;
                                                                                                                                try {
                                                                                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, index_tv, NIL);
                                                                                                                                    done_var_$62 = ans;
                                                                                                                                    token_var_$63 = NIL;
                                                                                                                                    while (NIL == done_var_$62) {
                                                                                                                                        as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$63);
                                                                                                                                        valid_$64 = makeBoolean(!token_var_$63.eql(as));
                                                                                                                                        if (NIL != valid_$64) {
                                                                                                                                            ans = as;
                                                                                                                                        }
                                                                                                                                        done_var_$62 = makeBoolean(NIL == valid_$64 || NIL != ans);
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                        _values = Values.getValuesAsVector();
                                                                                                                                        if (NIL != final_index_iterator) {
                                                                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                                        }
                                                                                                                                        Values.restoreValuesFromVector(_values);
                                                                                                                                    } finally {
                                                                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            done_var = makeBoolean(NIL == valid || NIL != ans);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else if (sol.isList()) {
                                                                                                        if (NIL == ans) {
                                                                                                            csome_list_var = sol;
                                                                                                            instance2 = NIL;
                                                                                                            instance2 = csome_list_var.first();
                                                                                                            while (NIL == ans && NIL != csome_list_var) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    if (NIL != forts.fort_p(instance2)) {
                                                                                                                        pred_var2 = pred;
                                                                                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(instance2, NIL, pred_var2)) {
                                                                                                                            iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(instance2, NIL, pred_var2);
                                                                                                                            done_var2 = ans;
                                                                                                                            token_var2 = NIL;
                                                                                                                            while (NIL == done_var2) {
                                                                                                                                final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                                                                                                valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                                                                                                if (NIL != valid2) {
                                                                                                                                    final_index_iterator2 = NIL;
                                                                                                                                    try {
                                                                                                                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, index_tv, NIL);
                                                                                                                                        done_var_$63 = ans;
                                                                                                                                        token_var_$64 = NIL;
                                                                                                                                        while (NIL == done_var_$63) {
                                                                                                                                            as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$64);
                                                                                                                                            valid_$65 = makeBoolean(!token_var_$64.eql(as2));
                                                                                                                                            if (NIL != valid_$65) {
                                                                                                                                                ans = as2;
                                                                                                                                            }
                                                                                                                                            done_var_$63 = makeBoolean(NIL == valid_$65 || NIL != ans);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                            _values2 = Values.getValuesAsVector();
                                                                                                                                            if (NIL != final_index_iterator2) {
                                                                                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                                                                                            }
                                                                                                                                            Values.restoreValuesFromVector(_values2);
                                                                                                                                        } finally {
                                                                                                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                done_var2 = makeBoolean(NIL == valid2 || NIL != ans);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                instance2 = csome_list_var.first();
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$55, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$60);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$54, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str76$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                    if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED)) && NIL == ans) {
                                                                        csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                        instance_tuple = NIL;
                                                                        instance_tuple = csome_list_var2.first();
                                                                        while (NIL == ans && NIL != csome_list_var2) {
                                                                            datum_$70 = (current_$71 = instance_tuple);
                                                                            link_node = NIL;
                                                                            mt2 = NIL;
                                                                            tv2 = NIL;
                                                                            cdestructuring_bind.destructuring_bind_must_consp(current_$71, datum_$70, $list77);
                                                                            link_node = current_$71.first();
                                                                            current_$71 = current_$71.rest();
                                                                            cdestructuring_bind.destructuring_bind_must_consp(current_$71, datum_$70, $list77);
                                                                            mt2 = current_$71.first();
                                                                            current_$71 = current_$71.rest();
                                                                            cdestructuring_bind.destructuring_bind_must_consp(current_$71, datum_$70, $list77);
                                                                            tv2 = current_$71.first();
                                                                            current_$71 = current_$71.rest();
                                                                            if (NIL == current_$71) {
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                    _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                link_nodes2 = (sol = ConsesLow.list(link_node));
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == ans
                                                                                                            && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (NIL != set_contents.do_set_contents_element_validP(state, instance)
                                                                                                                && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(instance)) {
                                                                                                                pred_var = pred;
                                                                                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(instance, NIL, pred_var)) {
                                                                                                                    iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(instance, NIL, pred_var);
                                                                                                                    done_var = ans;
                                                                                                                    token_var = NIL;
                                                                                                                    while (NIL == done_var) {
                                                                                                                        final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                                                        valid = makeBoolean(!token_var.eql(final_index_spec));
                                                                                                                        if (NIL != valid) {
                                                                                                                            final_index_iterator = NIL;
                                                                                                                            try {
                                                                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, index_tv, NIL);
                                                                                                                                done_var_$64 = ans;
                                                                                                                                token_var_$65 = NIL;
                                                                                                                                while (NIL == done_var_$64) {
                                                                                                                                    as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$65);
                                                                                                                                    valid_$66 = makeBoolean(!token_var_$65.eql(as));
                                                                                                                                    if (NIL != valid_$66) {
                                                                                                                                        ans = as;
                                                                                                                                    }
                                                                                                                                    done_var_$64 = makeBoolean(NIL == valid_$66 || NIL != ans);
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                    _values3 = Values.getValuesAsVector();
                                                                                                                                    if (NIL != final_index_iterator) {
                                                                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                                    }
                                                                                                                                    Values.restoreValuesFromVector(_values3);
                                                                                                                                } finally {
                                                                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        done_var = makeBoolean(NIL == valid || NIL != ans);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else if (sol.isList()) {
                                                                                                    if (NIL == ans) {
                                                                                                        csome_list_var_$78 = sol;
                                                                                                        instance2 = NIL;
                                                                                                        instance2 = csome_list_var_$78.first();
                                                                                                        while (NIL == ans && NIL != csome_list_var_$78) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(instance2)) {
                                                                                                                    pred_var2 = pred;
                                                                                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(instance2, NIL, pred_var2)) {
                                                                                                                        iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(instance2, NIL, pred_var2);
                                                                                                                        done_var2 = ans;
                                                                                                                        token_var2 = NIL;
                                                                                                                        while (NIL == done_var2) {
                                                                                                                            final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                                                                                            valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                                                                                            if (NIL != valid2) {
                                                                                                                                final_index_iterator2 = NIL;
                                                                                                                                try {
                                                                                                                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, index_tv, NIL);
                                                                                                                                    done_var_$65 = ans;
                                                                                                                                    token_var_$66 = NIL;
                                                                                                                                    while (NIL == done_var_$65) {
                                                                                                                                        as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$66);
                                                                                                                                        valid_$67 = makeBoolean(!token_var_$66.eql(as2));
                                                                                                                                        if (NIL != valid_$67) {
                                                                                                                                            ans = as2;
                                                                                                                                        }
                                                                                                                                        done_var_$65 = makeBoolean(NIL == valid_$67 || NIL != ans);
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                        _values4 = Values.getValuesAsVector();
                                                                                                                                        if (NIL != final_index_iterator2) {
                                                                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                                                                                        }
                                                                                                                                        Values.restoreValuesFromVector(_values4);
                                                                                                                                    } finally {
                                                                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            done_var2 = makeBoolean(NIL == valid2 || NIL != ans);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var_$78 = csome_list_var_$78.rest();
                                                                                                            instance2 = csome_list_var_$78.first();
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$59, thread);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$58, thread);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                cdestructuring_bind.cdestructuring_bind_error(datum_$70, $list77);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            instance_tuple = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                            ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)),
                                                                                    sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)),
                                                                                    sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                                    for (rest_$83 = NIL, rest_$83 = new_list; NIL == ans && NIL != rest_$83; rest_$83 = rest_$83.rest()) {
                                                                        generating_fn = rest_$83.first();
                                                                        _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes3 = (sol2 = Functions.funcall(generating_fn, node));
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == ans
                                                                                        && NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state2, instance3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(instance3)) {
                                                                                            pred_var3 = pred;
                                                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(instance3, NIL, pred_var3)) {
                                                                                                iterator_var3 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(instance3, NIL, pred_var3);
                                                                                                done_var3 = ans;
                                                                                                token_var3 = NIL;
                                                                                                while (NIL == done_var3) {
                                                                                                    final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                                                                                                    valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                                                                                                    if (NIL != valid3) {
                                                                                                        final_index_iterator3 = NIL;
                                                                                                        try {
                                                                                                            final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, $GAF, index_tv, NIL);
                                                                                                            done_var_$66 = ans;
                                                                                                            token_var_$67 = NIL;
                                                                                                            while (NIL == done_var_$66) {
                                                                                                                as3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$67);
                                                                                                                valid_$68 = makeBoolean(!token_var_$67.eql(as3));
                                                                                                                if (NIL != valid_$68) {
                                                                                                                    ans = as3;
                                                                                                                }
                                                                                                                done_var_$66 = makeBoolean(NIL == valid_$68 || NIL != ans);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                _values5 = Values.getValuesAsVector();
                                                                                                                if (NIL != final_index_iterator3) {
                                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                                                                                                }
                                                                                                                Values.restoreValuesFromVector(_values5);
                                                                                                            } finally {
                                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    done_var3 = makeBoolean(NIL == valid3 || NIL != ans);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (sol2.isList()) {
                                                                                if (NIL == ans) {
                                                                                    csome_list_var3 = sol2;
                                                                                    instance4 = NIL;
                                                                                    instance4 = csome_list_var3.first();
                                                                                    while (NIL == ans && NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if (NIL != forts.fort_p(instance4)) {
                                                                                                pred_var4 = pred;
                                                                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(instance4, NIL, pred_var4)) {
                                                                                                    iterator_var4 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(instance4, NIL, pred_var4);
                                                                                                    done_var4 = ans;
                                                                                                    token_var4 = NIL;
                                                                                                    while (NIL == done_var4) {
                                                                                                        final_index_spec4 = iteration.iteration_next_without_values_macro_helper(iterator_var4, token_var4);
                                                                                                        valid4 = makeBoolean(!token_var4.eql(final_index_spec4));
                                                                                                        if (NIL != valid4) {
                                                                                                            final_index_iterator4 = NIL;
                                                                                                            try {
                                                                                                                final_index_iterator4 = kb_mapping_macros.new_final_index_iterator(final_index_spec4, $GAF, index_tv, NIL);
                                                                                                                done_var_$67 = ans;
                                                                                                                token_var_$68 = NIL;
                                                                                                                while (NIL == done_var_$67) {
                                                                                                                    as4 = iteration.iteration_next_without_values_macro_helper(final_index_iterator4, token_var_$68);
                                                                                                                    valid_$69 = makeBoolean(!token_var_$68.eql(as4));
                                                                                                                    if (NIL != valid_$69) {
                                                                                                                        ans = as4;
                                                                                                                    }
                                                                                                                    done_var_$67 = makeBoolean(NIL == valid_$69 || NIL != ans);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                    _values6 = Values.getValuesAsVector();
                                                                                                                    if (NIL != final_index_iterator4) {
                                                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator4);
                                                                                                                    }
                                                                                                                    Values.restoreValuesFromVector(_values6);
                                                                                                                } finally {
                                                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        done_var4 = makeBoolean(NIL == valid4 || NIL != ans);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        instance4 = csome_list_var3.first();
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$62, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$54, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$53, thread);
                                                            }
                                                        }
                                                        SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                        SubLObject rest2;
                                                        SubLObject module_var2;
                                                        SubLObject _prev_bind_0_$65;
                                                        SubLObject _prev_bind_1_$55;
                                                        SubLObject node2;
                                                        SubLObject d_link2;
                                                        SubLObject mt_links2;
                                                        SubLObject iteration_state2;
                                                        SubLObject mt3;
                                                        SubLObject tv_links2;
                                                        SubLObject _prev_bind_0_$66;
                                                        SubLObject iteration_state_$61;
                                                        SubLObject link_nodes4;
                                                        SubLObject _prev_bind_0_$67;
                                                        SubLObject sol3;
                                                        SubLObject set_contents_var3;
                                                        SubLObject basis_object3;
                                                        SubLObject state3;
                                                        SubLObject node_vars_link_node;
                                                        SubLObject csome_list_var4;
                                                        SubLObject node_vars_link_node2;
                                                        SubLObject new_list2;
                                                        SubLObject rest_$84;
                                                        SubLObject generating_fn2;
                                                        SubLObject _prev_bind_0_$68;
                                                        SubLObject sol4;
                                                        SubLObject link_nodes5;
                                                        SubLObject set_contents_var4;
                                                        SubLObject basis_object4;
                                                        SubLObject state4;
                                                        SubLObject node_vars_link_node3;
                                                        SubLObject csome_list_var5;
                                                        SubLObject node_vars_link_node4;
                                                        for (rest2 = NIL, rest2 = accessible_modules2; NIL == ans && NIL != rest2; rest2 = rest2.rest()) {
                                                            module_var2 = rest2.first();
                                                            _prev_bind_0_$65 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            _prev_bind_1_$55 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                                        (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread),
                                                                        thread);
                                                                node2 = function_terms.naut_to_nart(node_var_$48);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                    d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link2) {
                                                                        mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links2) {
                                                                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == ans
                                                                                    && NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                                thread.resetMultipleValues();
                                                                                mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                                tv_links2 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                    _prev_bind_0_$66 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                        for (iteration_state_$61 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == ans
                                                                                                && NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$61); iteration_state_$61 = dictionary_contents.do_dictionary_contents_next(iteration_state_$61)) {
                                                                                            thread.resetMultipleValues();
                                                                                            tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$61);
                                                                                            link_nodes4 = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                _prev_bind_0_$67 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                    sol3 = link_nodes4;
                                                                                                    if (NIL != set.set_p(sol3)) {
                                                                                                        set_contents_var3 = set.do_set_internal(sol3);
                                                                                                        for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == ans
                                                                                                                && NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                            if (NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    } else if (sol3.isList()) {
                                                                                                        if (NIL == ans) {
                                                                                                            csome_list_var4 = sol3;
                                                                                                            node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                            while (NIL == ans && NIL != csome_list_var4) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$67, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$61);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$66, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str76$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } else if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    new_list2 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                            ? list_utilities.randomize_list(
                                                                                    sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                                    for (rest_$84 = NIL, rest_$84 = new_list2; NIL == ans && NIL != rest_$84; rest_$84 = rest_$84.rest()) {
                                                                        generating_fn2 = rest_$84.first();
                                                                        _prev_bind_0_$68 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            link_nodes5 = (sol4 = Functions.funcall(generating_fn2, node2));
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                set_contents_var4 = set.do_set_internal(sol4);
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == ans
                                                                                        && NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else if (sol4.isList()) {
                                                                                if (NIL == ans) {
                                                                                    csome_list_var5 = sol4;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                    while (NIL == ans && NIL != csome_list_var5) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$68, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$55, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$65, thread);
                                                            }
                                                        }
                                                        node_var_$48 = deck.deck_pop(recur_deck);
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$56, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$53, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$52, thread);
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str78$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$52, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$51, thread);
                                        }
                                    } finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$51, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$50, thread);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values7 = Values.getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        Values.restoreValuesFromVector(_values7);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$49, thread);
                            }
                        }
                    } finally {
                        SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                            SubLObject _values8 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values8);
                        } finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
            return ans;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list135);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 44800L)
    public static SubLObject removal_asserted_arg1_binary_preds_count(SubLObject col, SubLObject pred, SubLObject count) {
        return (NIL != kb_accessors.binary_predicateP(pred) && NIL != fort_types_interface.collectionP(col) && (!count.isInteger() || kb_indexing.num_predicate_extent_index(pred, UNPROVIDED).numGE(count))) ? removal_asserted_arg1_binary_preds_count_int(col, pred, count, UNPROVIDED) : ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 45200L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_int(SubLObject col, SubLObject pred, SubLObject count, SubLObject gather_exemplarsP) {
        if (gather_exemplarsP == UNPROVIDED) {
            gather_exemplarsP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sofar = NIL;
        SubLObject overP = NIL;
        SubLObject exemplars = NIL;
        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            thread.resetMultipleValues();
            SubLObject count_$102 = removal_asserted_arg1_binary_preds_count_helper(col, pred, count, gather_exemplarsP);
            SubLObject overP_$103 = thread.secondMultipleValue();
            SubLObject sofar_$104 = thread.thirdMultipleValue();
            SubLObject exemplars_$105 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            count = count_$102;
            overP = overP_$103;
            sofar = sofar_$104;
            exemplars = exemplars_$105;
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        if (NIL != overP) {
            return Values.values($OVER, exemplars);
        }
        if (sofar.eql(count)) {
            return Values.values($VERIFIED, exemplars);
        }
        return Values.values(sofar, exemplars);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 45700L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_helper(SubLObject col, SubLObject pred, SubLObject count, SubLObject gather_exemplarsP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sbhl_tv = $$True_JustificationTruth;
        SubLObject index_tv = sbhl_search_vars.sbhl_translate_to_old_tv(sbhl_tv);
        SubLObject sofar = ZERO_INTEGER;
        SubLObject overP = NIL;
        SubLObject exemplars = NIL;
        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                if (NIL == overP) {
                    SubLObject node_var_$106 = col;
                    SubLObject deck_type = $STACK;
                    SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject _prev_bind_0_$107 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            SubLObject tv_var = sbhl_tv;
                            SubLObject _prev_bind_0_$108 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            SubLObject _prev_bind_1_$109 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym67$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str72$continue_anyway, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else if (pcase_var.eql($WARN)) {
                                        Errors.warn($str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str74$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($str72$continue_anyway, $str69$_A_is_not_a__A, tv_var, $sym70$SBHL_TRUE_TV_P);
                                    }
                                }
                                SubLObject _prev_bind_0_$109 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                SubLObject _prev_bind_1_$110 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                        SubLObject _prev_bind_0_$110 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        SubLObject _prev_bind_1_$111 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        SubLObject _prev_bind_2_$114 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(
                                                    sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$106, UNPROVIDED);
                                            while (NIL != node_var_$106 && NIL == overP) {
                                                SubLObject tt_node_var = node_var_$106;
                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$111;
                                                SubLObject _prev_bind_1_$112;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$112;
                                                SubLObject iteration_state_$118;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$113;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject instance;
                                                SubLObject csome_list_var;
                                                SubLObject instance2;
                                                SubLObject csome_list_var2;
                                                SubLObject instance_tuple;
                                                SubLObject current;
                                                SubLObject datum;
                                                SubLObject link_node;
                                                SubLObject mt2;
                                                SubLObject tv2;
                                                SubLObject _prev_bind_0_$114;
                                                SubLObject _prev_bind_0_$115;
                                                SubLObject link_nodes2;
                                                SubLObject csome_list_var_$122;
                                                SubLObject new_list;
                                                SubLObject rest_$123;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$116;
                                                SubLObject sol2;
                                                SubLObject link_nodes3;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject instance3;
                                                SubLObject csome_list_var3;
                                                SubLObject instance4;
                                                for (rest = NIL, rest = accessible_modules; NIL == overP && NIL != rest; rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$111 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$112 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                                (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == overP
                                                                            && NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$112 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$118 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == overP
                                                                                        && NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$118); iteration_state_$118 = dictionary_contents.do_dictionary_contents_next(iteration_state_$118)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$118);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$113 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == overP
                                                                                                        && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, instance)
                                                                                                            && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(instance) && NIL != some_asserted_pred_value(instance, pred, ONE_INTEGER, index_tv)) {
                                                                                                            if (NIL != gather_exemplarsP) {
                                                                                                                exemplars = ConsesLow.cons(instance, exemplars);
                                                                                                            }
                                                                                                            sofar = Numbers.add(sofar, ONE_INTEGER);
                                                                                                            overP = makeBoolean(count.isInteger() && sofar.numG(count));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else if (sol.isList()) {
                                                                                                if (NIL == overP) {
                                                                                                    csome_list_var = sol;
                                                                                                    instance2 = NIL;
                                                                                                    instance2 = csome_list_var.first();
                                                                                                    while (NIL == overP && NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(instance2) && NIL != some_asserted_pred_value(instance2, pred, ONE_INTEGER, index_tv)) {
                                                                                                                if (NIL != gather_exemplarsP) {
                                                                                                                    exemplars = ConsesLow.cons(instance2, exemplars);
                                                                                                                }
                                                                                                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                                                                                                overP = makeBoolean(count.isInteger() && sofar.numG(count));
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        instance2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$113, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$118);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$112, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str76$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED)) && NIL == overP) {
                                                                csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL == overP && NIL != csome_list_var2) {
                                                                    datum = (current = instance_tuple);
                                                                    link_node = NIL;
                                                                    mt2 = NIL;
                                                                    tv2 = NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list77);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list77);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list77);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            _prev_bind_0_$114 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    _prev_bind_0_$115 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        link_nodes2 = (sol = ConsesLow.list(link_node));
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == overP
                                                                                                    && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, instance)
                                                                                                        && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(instance) && NIL != some_asserted_pred_value(instance, pred, ONE_INTEGER, index_tv)) {
                                                                                                        if (NIL != gather_exemplarsP) {
                                                                                                            exemplars = ConsesLow.cons(instance, exemplars);
                                                                                                        }
                                                                                                        sofar = Numbers.add(sofar, ONE_INTEGER);
                                                                                                        overP = makeBoolean(count.isInteger() && sofar.numG(count));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (sol.isList()) {
                                                                                            if (NIL == overP) {
                                                                                                csome_list_var_$122 = sol;
                                                                                                instance2 = NIL;
                                                                                                instance2 = csome_list_var_$122.first();
                                                                                                while (NIL == overP && NIL != csome_list_var_$122) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(instance2) && NIL != some_asserted_pred_value(instance2, pred, ONE_INTEGER, index_tv)) {
                                                                                                            if (NIL != gather_exemplarsP) {
                                                                                                                exemplars = ConsesLow.cons(instance2, exemplars);
                                                                                                            }
                                                                                                            sofar = Numbers.add(sofar, ONE_INTEGER);
                                                                                                            overP = makeBoolean(count.isInteger() && sofar.numG(count));
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$122 = csome_list_var_$122.rest();
                                                                                                    instance2 = csome_list_var_$122.first();
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$115, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$114, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, $list77);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                    ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)),
                                                                            sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread),
                                                                            sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                            for (rest_$123 = NIL, rest_$123 = new_list; NIL == overP && NIL != rest_$123; rest_$123 = rest_$123.rest()) {
                                                                generating_fn = rest_$123.first();
                                                                _prev_bind_0_$116 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes3 = (sol2 = Functions.funcall(generating_fn, node));
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == overP
                                                                                && NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, instance3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (NIL != forts.fort_p(instance3) && NIL != some_asserted_pred_value(instance3, pred, ONE_INTEGER, index_tv)) {
                                                                                    if (NIL != gather_exemplarsP) {
                                                                                        exemplars = cons(instance3, exemplars);
                                                                                    }
                                                                                    sofar = Numbers.add(sofar, ONE_INTEGER);
                                                                                    overP = makeBoolean(count.isInteger() && sofar.numG(count));
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (sol2.isList()) {
                                                                        if (NIL == overP) {
                                                                            csome_list_var3 = sol2;
                                                                            instance4 = NIL;
                                                                            instance4 = csome_list_var3.first();
                                                                            while (NIL == overP && NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(instance4) && NIL != some_asserted_pred_value(instance4, pred, ONE_INTEGER, index_tv)) {
                                                                                        if (NIL != gather_exemplarsP) {
                                                                                            exemplars = cons(instance4, exemplars);
                                                                                        }
                                                                                        sofar = Numbers.add(sofar, ONE_INTEGER);
                                                                                        overP = makeBoolean(count.isInteger() && sofar.numG(count));
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                instance4 = csome_list_var3.first();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$116, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$112, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$111, thread);
                                                    }
                                                }
                                                SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject rest2;
                                                SubLObject module_var2;
                                                SubLObject _prev_bind_0_$117;
                                                SubLObject _prev_bind_1_$113;
                                                SubLObject node2;
                                                SubLObject d_link2;
                                                SubLObject mt_links2;
                                                SubLObject iteration_state2;
                                                SubLObject mt3;
                                                SubLObject tv_links2;
                                                SubLObject _prev_bind_0_$118;
                                                SubLObject iteration_state_$119;
                                                SubLObject link_nodes4;
                                                SubLObject _prev_bind_0_$119;
                                                SubLObject sol3;
                                                SubLObject set_contents_var3;
                                                SubLObject basis_object3;
                                                SubLObject state3;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var4;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list2;
                                                SubLObject rest_$124;
                                                SubLObject generating_fn2;
                                                SubLObject _prev_bind_0_$120;
                                                SubLObject sol4;
                                                SubLObject link_nodes5;
                                                SubLObject set_contents_var4;
                                                SubLObject basis_object4;
                                                SubLObject state4;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var5;
                                                SubLObject node_vars_link_node4;
                                                for (rest2 = NIL, rest2 = accessible_modules2; NIL == overP && NIL != rest2; rest2 = rest2.rest()) {
                                                    module_var2 = rest2.first();
                                                    _prev_bind_0_$117 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$113 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                                (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node2 = function_terms.naut_to_nart(node_var_$106);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == overP
                                                                            && NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            _prev_bind_0_$118 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                for (iteration_state_$119 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == overP
                                                                                        && NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$119); iteration_state_$119 = dictionary_contents.do_dictionary_contents_next(iteration_state_$119)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$119);
                                                                                    link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        _prev_bind_0_$119 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                set_contents_var3 = set.do_set_internal(sol3);
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == overP
                                                                                                        && NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else if (sol3.isList()) {
                                                                                                if (NIL == overP) {
                                                                                                    csome_list_var4 = sol3;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (NIL == overP && NIL != csome_list_var4) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$119, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$119);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$118, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str76$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            new_list2 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                    ? list_utilities.randomize_list(
                                                                            sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                            for (rest_$124 = NIL, rest_$124 = new_list2; NIL == overP && NIL != rest_$124; rest_$124 = rest_$124.rest()) {
                                                                generating_fn2 = rest_$124.first();
                                                                _prev_bind_0_$120 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    link_nodes5 = (sol4 = Functions.funcall(generating_fn2, node2));
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        set_contents_var4 = set.do_set_internal(sol4);
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == overP
                                                                                && NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else if (sol4.isList()) {
                                                                        if (NIL == overP) {
                                                                            csome_list_var5 = sol4;
                                                                            node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (NIL == overP && NIL != csome_list_var5) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$120, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$113, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$117, thread);
                                                    }
                                                }
                                                node_var_$106 = deck.deck_pop(recur_deck);
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$114, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$111, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$110, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str78$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$110, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$109, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$109, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$108, thread);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$121 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$121, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$107, thread);
                    }
                }
            } finally {
                SubLObject _prev_bind_0_$122 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$122, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return Values.values(count, overP, sofar, exemplars);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 46200L)
    public static SubLObject asserted_pred_refs(SubLObject pred, SubLObject gather_arg, SubLObject truth) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
            SubLObject str = NIL;
            SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
            SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
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
                SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        utilities_macros.note_progress();
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                            SubLObject done_var_$134 = NIL;
                            SubLObject token_var_$135 = NIL;
                            while (NIL == done_var_$134) {
                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$135);
                                SubLObject valid_$136 = makeBoolean(!token_var_$135.eql(assertion));
                                if (NIL != valid_$136) {
                                    SubLObject item_var = assertions_high.gaf_arg(assertion, gather_arg);
                                    if (NIL == conses_high.member(item_var, v_answer, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                        v_answer = cons(item_var, v_answer);
                                    }
                                }
                                done_var_$134 = makeBoolean(NIL == valid_$136);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$137 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                }
                utilities_macros.noting_progress_postamble();
            } finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
            }
        }
        return v_answer;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 46400L)
    public static SubLObject removal_asserted_arg1_binary_preds_count_collection_var_expand_int(SubLObject asent, SubLObject ok_keys) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject collection_var = NIL;
        SubLObject pred = NIL;
        SubLObject count = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list136);
        collection_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list136);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list136);
        count = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != kb_accessors.binary_predicateP(pred)) {
                SubLObject sbhl_tv = $$True_JustificationTruth;
                SubLObject index_tv = sbhl_search_vars.sbhl_translate_to_old_tv(sbhl_tv);
                SubLObject no_cols = NIL;
                SubLObject yes_cols = NIL;
                SubLObject cdolist_list_var = asserted_pred_refs(pred, ONE_INTEGER, index_tv);
                SubLObject instance = NIL;
                instance = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$138 = isa.isa(instance, mt_relevance_macros.$mt$.getDynamicValue(thread), sbhl_tv);
                    SubLObject col = NIL;
                    col = cdolist_list_var_$138.first();
                    while (NIL != cdolist_list_var_$138) {
                        if (NIL != conses_high.member(col, yes_cols, Symbols.symbol_function($sym132$SPEC_), UNPROVIDED)) {
                            SubLObject item_var = col;
                            if (NIL == conses_high.member(item_var, yes_cols, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                yes_cols = cons(item_var, yes_cols);
                            }
                        } else if (NIL != conses_high.member(col, no_cols, Symbols.symbol_function($sym132$SPEC_), UNPROVIDED)) {
                            SubLObject item_var = col;
                            if (NIL == conses_high.member(item_var, no_cols, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                no_cols = cons(item_var, no_cols);
                            }
                        } else if (NIL != conses_high.member(removal_asserted_arg1_binary_preds_count(col, pred, count), ok_keys, UNPROVIDED, UNPROVIDED)) {
                            yes_cols = cons(col, yes_cols);
                            thread.resetMultipleValues();
                            SubLObject v_bindings = unification_utilities.term_unify(collection_var, col, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                SubLObject support_sentence = el_utilities.replace_formula_arg(ONE_INTEGER, col, asent);
                                SubLObject main_support = removal_asserted_arg1_binary_preds_main_support(support_sentence);
                                backward.removal_add_node(main_support, v_bindings, unify_justification);
                            }
                        } else {
                            no_cols = cons(col, no_cols);
                        }
                        cdolist_list_var_$138 = cdolist_list_var_$138.rest();
                        col = cdolist_list_var_$138.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    instance = cdolist_list_var.first();
                }
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list136);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-arg1-binary-preds.lisp", position = 47500L)
    public static SubLObject removal_asserted_arg1_binary_preds_main_support(SubLObject asent) {
        SubLObject main_support = arguments.make_hl_support($ASSERTED_ARG1_BINARY_PREDS, asent, UNPROVIDED, UNPROVIDED);
        return main_support;
    }

    public static SubLObject declare_removal_modules_asserted_arg1_binary_preds_file() {
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_pos_check_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-POS-CHECK-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_pos_check_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-POS-CHECK-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_check_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-CHECK-COST", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_neg_check_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-NEG-CHECK-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_neg_check_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-NEG-CHECK-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_pred_var_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PRED-VAR-COST", 1, 1, false);
        declareMacro("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "do_sampled_instances", "DO-SAMPLED-INSTANCES");
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_pred_var_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PRED-VAR-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "some_asserted_pred_value", "SOME-ASSERTED-PRED-VALUE", 4, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "asserted_arg1_binary_preds_justify", "ASSERTED-ARG1-BINARY-PREDS-JUSTIFY", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_code_support", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-CODE-SUPPORT", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_collection_var_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COLLECTION-VAR-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_collection_var_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COLLECTION-VAR-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_pos_check_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-POS-CHECK-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_pos_check_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-POS-CHECK-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_check_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-CHECK-COST", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_cost_from_raw_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COST-FROM-RAW-COST", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_check", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-CHECK", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "asserted_arg1_binary_preds_count_justify", "ASSERTED-ARG1-BINARY-PREDS-COUNT-JUSTIFY", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_code_support", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-CODE-SUPPORT", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_neg_check_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-NEG-CHECK-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_neg_check_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-NEG-CHECK-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_count_var_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COUNT-VAR-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_count_var_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COUNT-VAR-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_pred_var_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-PRED-VAR-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_pred_var_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-PRED-VAR-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_collection_var_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COLLECTION-VAR-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_collection_var_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COLLECTION-VAR-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_pred_and_count_var_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-PRED-AND-COUNT-VAR-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_pred_and_count_var_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-PRED-AND-COUNT-VAR-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_min_pos_check_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-POS-CHECK-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_min_pos_check_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-POS-CHECK-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "asserted_arg1_binary_preds_count_min_justify", "ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-JUSTIFY", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_min_code_support", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-CODE-SUPPORT", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_min_neg_check_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-NEG-CHECK-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_min_neg_check_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-NEG-CHECK-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_min_pred_var_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-PRED-VAR-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_min_pred_var_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-PRED-VAR-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_min_collection_var_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-COLLECTION-VAR-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_min_collection_var_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-COLLECTION-VAR-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_percent_min_pos_check_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-POS-CHECK-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_percent_min_pos_check_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-POS-CHECK-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_percent_min_pos_check", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-POS-CHECK", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "col_percent_to_count", "COL-PERCENT-TO-COUNT", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "asserted_arg1_binary_preds_percent_min_justify", "ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-JUSTIFY", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_percent_min_code_support", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-CODE-SUPPORT", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "asserted_arg1_binary_preds_cardinality_sentence", "ASSERTED-ARG1-BINARY-PREDS-CARDINALITY-SENTENCE", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "asserted_arg1_binary_preds_cardinality_justify", "ASSERTED-ARG1-BINARY-PREDS-CARDINALITY-JUSTIFY", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "asserted_arg1_binary_preds_boolean_supports", "ASSERTED-ARG1-BINARY-PREDS-BOOLEAN-SUPPORTS", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_percent_min_neg_check_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-NEG-CHECK-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_percent_min_neg_check_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-NEG-CHECK-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_percent_min_pred_var_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-PRED-VAR-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_foo_min_pred_var_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-FOO-MIN-PRED-VAR-COST", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_percent_min_pred_var_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-PRED-VAR-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_percent_min_collection_var_cost", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-COLLECTION-VAR-COST", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_percent_min_collection_var_expand", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-COLLECTION-VAR-EXPAND", 1, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "asserted_arg1_binary_preds_justify_general", "ASSERTED-ARG1-BINARY-PREDS-JUSTIFY-GENERAL", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "asserted_arg1_binary_preds_verify_general", "ASSERTED-ARG1-BINARY-PREDS-VERIFY-GENERAL", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_check", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-CHECK", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_int", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-INT", 3, 1, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_helper", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-HELPER", 4, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "asserted_pred_refs", "ASSERTED-PRED-REFS", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_count_collection_var_expand_int", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COLLECTION-VAR-EXPAND-INT", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds", "removal_asserted_arg1_binary_preds_main_support", "REMOVAL-ASSERTED-ARG1-BINARY-PREDS-MAIN-SUPPORT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_asserted_arg1_binary_preds_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_asserted_arg1_binary_preds_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertedArg1BinaryPreds);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertedArg1BinaryPreds);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertedArg1BinaryPreds);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_POS_CHECK, $list4);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_NEG_CHECK, $list7);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PRED_VAR, $list30);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COLLECTION_VAR, $list33);
        inference_modules.register_solely_specific_removal_module_predicate($$assertedArg1BinaryPreds_Count);
        preference_modules.inference_preference_module($ASSERTED_ARG1_BINARY_PREDS_COUNT_POS, $list36);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertedArg1BinaryPreds_Count);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_POS_CHECK, $list39);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_NEG_CHECK, $list52);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_COUNT_VAR, $list55);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_PRED_VAR, $list58);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_COLLECTION_VAR, $list62);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_PRED_AND_COUNT_VAR, $list80);
        inference_modules.register_solely_specific_removal_module_predicate($$assertedArg1BinaryPreds_CountMin);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertedArg1BinaryPreds_CountMin, THREE_INTEGER);
        preference_modules.inference_preference_module($ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_ARG1_OR_ARG2_POS, $list83);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertedArg1BinaryPreds_CountMin);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_POS_CHECK, $list86);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_NEG_CHECK, $list94);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_PRED_VAR, $list101);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_COLLECTION_VAR, $list103);
        inference_modules.register_solely_specific_removal_module_predicate($$assertedArg1BinaryPreds_PercentMi);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertedArg1BinaryPreds_PercentMi, THREE_INTEGER);
        preference_modules.inference_preference_module($ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_ARG1_OR_ARG2_POS, $list106);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertedArg1BinaryPreds_PercentMi);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_POS_CHECK, $list109);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_NEG_CHECK, $list125);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_PRED_VAR, $list129);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_COLLECTION_VAR, $list134);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_asserted_arg1_binary_preds_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_asserted_arg1_binary_preds_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_asserted_arg1_binary_preds_file();
    }

    static {
        me = new removal_modules_asserted_arg1_binary_preds();
        $$assertedArg1BinaryPreds = makeConstSym(("assertedArg1BinaryPreds"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_POS_CHECK = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-POS-CHECK");
        $list4 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertedArg1BinaryPreds")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-POS-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-POS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertedArg1BinaryPreds <fort> <fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds #$Predicate #$genlPreds)") });
        $MINIMIZE = makeKeyword("MINIMIZE");
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_NEG_CHECK = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-NEG-CHECK");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertedArg1BinaryPreds")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-NEG-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-NEG-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$assertedArg1BinaryPreds <fort> <fort>))\n     using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedArg1BinaryPreds #$Collection #$arity))") });
        $list8 = list(list(makeSymbol("INSTANCE"), makeSymbol("COL"), makeSymbol("FULL-SAMPLE?"), makeSymbol("&OPTIONAL"), list(makeSymbol("NUMBER"), makeInteger(200))), makeSymbol("&BODY"), makeSymbol("BODY"));
        $int$200 = makeInteger(200);
        $sym10$ALL_FORT_INSTANCES = makeUninternedSymbol("ALL-FORT-INSTANCES");
        $sym11$SAMPLED_INSTANCES = makeUninternedSymbol("SAMPLED-INSTANCES");
        $sym12$CLET = makeSymbol("CLET");
        $sym13$ALL_FORT_INSTANCES = makeSymbol("ALL-FORT-INSTANCES");
        $list14 = list(NIL, makeConstSym(("True-JustificationTruth")));
        $sym15$CSETQ = makeSymbol("CSETQ");
        $sym16$LENGTH__ = makeSymbol("LENGTH<=");
        $sym17$FIF = makeSymbol("FIF");
        $sym18$RANDOM_N = makeSymbol("RANDOM-N");
        $sym19$CDOLIST = makeSymbol("CDOLIST");
        $list20 = list(makeSymbol("COL"), makeSymbol("PRED-VAR"));
        $$True_JustificationTruth = makeConstSym(("True-JustificationTruth"));
        $GAF = makeKeyword("GAF");
        $ISA = makeKeyword("ISA");
        $$isa = makeConstSym(("isa"));
        $$assertedSentence = makeConstSym(("assertedSentence"));
        $OPAQUE = makeKeyword("OPAQUE");
        $CODE = makeKeyword("CODE");
        $list28 = list(makeConstSym(("implies")), list(makeConstSym(("and")), list(makeConstSym(("isa")), makeSymbol("?INSTANCE"), makeSymbol("?COL")), list(makeConstSym(("assertedSentence")), list(makeSymbol("?PRED"), makeSymbol("?INSTANCE"), makeSymbol("?VALUE")))),
                list(makeConstSym(("assertedArg1BinaryPreds")), makeSymbol("?COL"), makeSymbol("?PRED")));
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PRED_VAR = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PRED-VAR");
        $list30 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertedArg1BinaryPreds")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))),
                        makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PRED-VAR-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PRED-VAR-EXPAND"), makeKeyword("DOCUMENTATION"),
                        makeString("(#$assertedArg1BinaryPreds <fort> <non-fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds #$Predicate ?WHAT)") });
        $list31 = list(makeSymbol("COLLECTION-VAR"), makeSymbol("PRED"));
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COLLECTION_VAR = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COLLECTION-VAR");
        $list33 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertedArg1BinaryPreds")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT")),
                        makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COLLECTION-VAR-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COLLECTION-VAR-EXPAND"), makeKeyword("DOCUMENTATION"),
                        makeString("(#$assertedArg1BinaryPreds <non-fort> <fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds ?WHAT #$arity)") });
        $$assertedArg1BinaryPreds_Count = makeConstSym(("assertedArg1BinaryPreds-Count"));
        $ASSERTED_ARG1_BINARY_PREDS_COUNT_POS = makeKeyword("ASSERTED-ARG1-BINARY-PREDS-COUNT-POS");
        $list36 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"),
                list(makeSymbol("QUOTE"), list(makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1-OR-ARG2"));
        $VERIFIED = makeKeyword("VERIFIED");
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_POS_CHECK = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-POS-CHECK");
        $list39 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-POS-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-POS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-Count <fort> <fort> <integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"),
                makeString("(#$assertedArg1BinaryPreds-Count #$Predicate #$genlPreds 99)") });
        $list40 = list(makeSymbol("COL"), makeSymbol("PRED"), makeSymbol("COUNT"));
        $int$1000 = makeInteger(1000);
        $$BinaryPredicate = makeConstSym(("BinaryPredicate"));
        $$cardinality = makeConstSym(("cardinality"));
        $$TheSetOf = makeConstSym(("TheSetOf"));
        $sym45$_INSTANCE = makeSymbol("?INSTANCE");
        $$and = makeConstSym(("and"));
        $$assertedPredicateArg = makeConstSym(("assertedPredicateArg"));
        $list48 = list(makeConstSym(("implies")),
                list(makeConstSym(("and")), list(makeConstSym(("isa")), makeSymbol("?PRED"), makeConstSym(("BinaryPredicate"))),
                        list(makeConstSym(("cardinality")),
                                list(makeConstSym(("TheSetOf")), makeSymbol("?INSTANCE"), list(makeConstSym(("and")), list(makeConstSym(("isa")), makeSymbol("?INSTANCE"), makeSymbol("?COL")), list(makeConstSym(("assertedPredicateArg")), makeSymbol("?INSTANCE"), ONE_INTEGER, makeSymbol("?PRED")))),
                                makeSymbol("?N"))),
                list(makeConstSym(("assertedArg1BinaryPreds-Count")), makeSymbol("?COL"), makeSymbol("?PRED"), makeSymbol("?N")));
        $sym49$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $$EverythingPSC = makeConstSym(("EverythingPSC"));
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_NEG_CHECK = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-NEG-CHECK");
        $list52 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-NEG-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-NEG-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedArg1BinaryPreds-Count <fort> <fort> <integer>))\n     using only the KB GAF indexing and explicit assertions"),
                makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedArg1BinaryPreds-Count #$Predicate #$arity 2))") });
        $list53 = list(makeSymbol("COL"), makeSymbol("PRED"), makeSymbol("COUNT-VAR"));
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_COUNT_VAR = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COUNT-VAR");
        $list55 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("INTEGER"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COUNT-VAR-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COUNT-VAR-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertedArg1BinaryPreds-Count <fort> <fort> <non-integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-Count #$Predicate #$arity ?N)") });
        $list56 = list(makeSymbol("COL"), makeSymbol("PRED-VAR"), makeSymbol("COUNT"));
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_PRED_VAR = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-PRED-VAR");
        $list58 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-PRED-VAR-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-PRED-VAR-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertedArg1BinaryPreds-Count <fort> <non-fort> <integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-Count #$Predicate ?WHAT 3)") });
        $list59 = list(makeSymbol("COL-VAR"), makeSymbol("PRED"), makeSymbol("COUNT"));
        $list60 = list(makeKeyword("VERIFIED"));
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_COLLECTION_VAR = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COLLECTION-VAR");
        $list62 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-Count")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT"), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COLLECTION-VAR-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COLLECTION-VAR-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertedArg1BinaryPreds-Count <non-fort> <fort> <integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-Count ?WHAT #$arity 2)") });
        $list63 = list(makeSymbol("COL"), makeSymbol("PRED-VAR"), makeSymbol("COUNT-VAR"));
        $BREADTH = makeKeyword("BREADTH");
        $QUEUE = makeKeyword("QUEUE");
        $STACK = makeKeyword("STACK");
        $sym67$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $ERROR = makeKeyword("ERROR");
        $str69$_A_is_not_a__A = makeString("~A is not a ~A");
        $sym70$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
        $CERROR = makeKeyword("CERROR");
        $str72$continue_anyway = makeString("continue anyway");
        $WARN = makeKeyword("WARN");
        $str74$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
        $str75$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");
        $str76$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list77 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));
        $str78$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_PRED_AND_COUNT_VAR = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-PRED-AND-COUNT-VAR");
        $list80 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-Count")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT")), list(makeKeyword("NOT"), makeKeyword("INTEGER"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-PRED-AND-COUNT-VAR-COST"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-PRED-AND-COUNT-VAR-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertedArg1BinaryPreds-Count <fort> <non-fort> <non-integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-Count ?WHAT #$arity 2)") });
        $$assertedArg1BinaryPreds_CountMin = makeConstSym(("assertedArg1BinaryPreds-CountMin"));
        $ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_ARG1_OR_ARG2_POS = makeKeyword("ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-ARG1-OR-ARG2-POS");
        $list83 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-CountMin")), makeKeyword("REQUIRED-PATTERN"),
                list(makeSymbol("QUOTE"), list(makeConstSym(("assertedArg1BinaryPreds-CountMin")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1-OR-ARG2"));
        $OVER = makeKeyword("OVER");
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_POS_CHECK = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-POS-CHECK");
        $list86 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-CountMin")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-CountMin")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-POS-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-POS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-CountMin <fort> <fort> <integer>)\n    using only the KB GAF indexing and explicit assertions"),
                makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-CountMin #$Predicate #$genlPreds 99)") });
        $ASSERTED_ARG1_BINARY_PREDS = makeKeyword("ASSERTED-ARG1-BINARY-PREDS");
        $sym88$_N = makeSymbol("?N");
        $sym89$_COL = makeSymbol("?COL");
        $sym90$_PRED = makeSymbol("?PRED");
        $$implies = makeConstSym(("implies"));
        $list92 = list(makeConstSym(("isa")), makeSymbol("?PRED"), makeConstSym(("BinaryPredicate")));
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_NEG_CHECK = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-NEG-CHECK");
        $list94 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-CountMin")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-CountMin")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-NEG-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-NEG-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedArg1BinaryPreds-CountMin <fort> <fort> <integer>))\n     using only the KB GAF indexing and explicit assertions"),
                makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedArg1BinaryPreds-CountMin #$Predicate #$arity 2))") });
        $list95 = list(makeSymbol("COL"), makeSymbol("PRED-VAR"), makeSymbol("COUNT-MIN"));
        $list96 = cons(makeSymbol("PRED"), makeSymbol("PRED-COUNT"));
        $list97 = list(makeKeyword("VERIFIED"), makeKeyword("OVER"));
        $sym98$_ = makeSymbol(">");
        $sym99$CDR = makeSymbol("CDR");
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_PRED_VAR = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-PRED-VAR");
        $list101 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-CountMin")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-CountMin")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-PRED-VAR-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-PRED-VAR-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertedArg1BinaryPreds-CountMin <fort> <non-fort> <integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-CountMin #$Predicate ?WHAT 3)") });
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_COUNT_MIN_COLLECTION_VAR = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-COLLECTION-VAR");
        $list103 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-CountMin")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-CountMin")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT"), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-COLLECTION-VAR-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-COLLECTION-VAR-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertedArg1BinaryPreds-CountMin <non-fort> <fort> <integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-CountMin ?WHAT #$arity 2)") });
        $$assertedArg1BinaryPreds_PercentMi = makeConstSym(("assertedArg1BinaryPreds-PercentMin"));
        $ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_ARG1_OR_ARG2_POS = makeKeyword("ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-ARG1-OR-ARG2-POS");
        $list106 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-PercentMin")), makeKeyword("REQUIRED-PATTERN"),
                list(makeSymbol("QUOTE"), list(makeConstSym(("assertedArg1BinaryPreds-PercentMin")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1-OR-ARG2"));
        $list107 = list(makeSymbol("COL"), makeSymbol("PRED"), makeSymbol("PERCENT"));
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_POS_CHECK = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-POS-CHECK");
        $list109 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-PercentMin")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-PercentMin")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("NUMBERP"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-POS-CHECK-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-POS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertedArg1BinaryPreds-PercentMin <fort> <fort> <float>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-PercentMin #$Predicate #$genlPreds .25)") });
        $$evaluate = makeConstSym(("evaluate"));
        $$CardinalityOfFn = makeConstSym(("CardinalityOfFn"));
        $EVAL = makeKeyword("EVAL");
        $$TimesFn = makeConstSym(("TimesFn"));
        $sym114$_TIMESFN = makeSymbol("?TIMESFN");
        $list115 = list(list(makeConstSym(("TimesFn")), makeSymbol("?P"), list(makeConstSym(("CardinalityOfFn")), makeSymbol("?COL"))));
        $list116 = list(list(makeConstSym(("assertedArg1BinaryPreds-PercentMin")), makeSymbol("?COL"), makeSymbol("?PRED"), makeSymbol("?P")));
        $$cardinalityAtLeast = makeConstSym(("cardinalityAtLeast"));
        $FORT = makeKeyword("FORT");
        $INTEGER = makeKeyword("INTEGER");
        $list120 = list(ONE_INTEGER, TWO_INTEGER, ONE_INTEGER, TWO_INTEGER);
        $list121 = list(ONE_INTEGER, TWO_INTEGER, TWO_INTEGER, THREE_INTEGER);
        $list122 = list(TWO_INTEGER);
        $sym123$_VALUE = makeSymbol("?VALUE");
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_NEG_CHECK = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-NEG-CHECK");
        $list125 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-PercentMin")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-PercentMin")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("NUMBERP"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-NEG-CHECK-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-NEG-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$assertedArg1BinaryPreds-PercentMin <fort> <fort> <float>))\n     using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedArg1BinaryPreds-PercentMin #$Predicate #$arity .25))") });
        $list126 = list(makeSymbol("COL"), makeSymbol("PRED-VAR"), makeSymbol("PERCENT"));
        $int$100 = makeInteger(100);
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_PRED_VAR = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-PRED-VAR");
        $list129 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-PercentMin")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-PercentMin")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT")), list(makeKeyword("TEST"), makeSymbol("NUMBERP"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-PRED-VAR-COST"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-PRED-VAR-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertedArg1BinaryPreds-PercentMin <fort> <non-fort> <float>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-PercentMin #$Predicate ?WHAT .3)") });
        $list130 = list(makeSymbol("COL-VAR"), makeSymbol("PRED"), makeSymbol("PERCENT"));
        $list131 = list(makeSymbol("COLLECTION-VAR"), makeSymbol("PRED"), makeSymbol("PERCENT"));
        $sym132$SPEC_ = makeSymbol("SPEC?");
        $REMOVAL_ASSERTED_ARG1_BINARY_PREDS_PERCENT_MIN_COLLECTION_VAR = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-COLLECTION-VAR");
        $list134 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertedArg1BinaryPreds-PercentMin")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertedArg1BinaryPreds-PercentMin")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("NUMBERP"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-COLLECTION-VAR-COST"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-COLLECTION-VAR-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertedArg1BinaryPreds-PercentMin <non-fort> <fort> <number>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-PercentMin ?WHAT #$arity .25)") });
        $list135 = list(makeSymbol("COL"), makeSymbol("PRED"));
        $list136 = list(makeSymbol("COLLECTION-VAR"), makeSymbol("PRED"), makeSymbol("COUNT"));
    }
}
/*
 *
 * Total time: 5228 ms
 *
 */