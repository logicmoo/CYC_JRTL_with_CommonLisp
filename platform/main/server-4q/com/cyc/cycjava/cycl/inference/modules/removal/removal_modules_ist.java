package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_ist extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist";
    public static String myFingerPrint = "d3c43d39b7048bc7a7a66ffd63d9c37df6c08db240607eeffd14127ce2473fb9";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 1600L)
    private static SubLSymbol $default_ist_formula_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 7700L)
    private static SubLSymbol $estimated_mts_per_formula$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 7900L)
    private static SubLSymbol $default_ist_pos_gaf_mt_lookup_cost$;
    private static SubLObject $$ist;
    private static SubLSymbol $IST_MT_PROP_POS;
    private static SubLList $list2;
    private static SubLSymbol $IST_IN_WHAT_MTS_POS;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLSymbol $QUERY;
    private static SubLFloat $float$1_5;
    private static SubLSymbol $REMOVAL_IST_FORMULA_CHECK;
    private static SubLList $list9;
    private static SubLSymbol $POS;
    private static SubLSymbol $REMOVAL_IST_POS_GAF;
    private static SubLList $list12;
    private static SubLSymbol $REMOVAL_IST_PRED_UNBOUND_POS_GAF;
    private static SubLList $list14;
    private static SubLSymbol $TRUE;
    private static SubLSymbol $NEG;
    private static SubLSymbol $REMOVAL_IST_NEG_GAF;
    private static SubLList $list18;
    private static SubLSymbol $FALSE;
    private static SubLList $list20;
    private static SubLSymbol $REMOVAL_IST_POS_GAF_MT_LOOKUP;
    private static SubLList $list22;
    private static SubLSymbol $sym23$RELEVANT_MT_IS_EVERYTHING;
    private static SubLObject $$EverythingPSC;
    private static SubLObject $$InferencePSC;
    private static SubLSymbol $REMOVAL_IST_UNBOUND_MT_GAF_LOOKUP_POS;
    private static SubLList $list27;
    private static SubLObject $$ist_Asserted;
    private static SubLSymbol $sym29$RELEVANT_MT_IS_EQ;
    private static SubLSymbol $GAF_ARG;
    private static SubLSymbol $GAF;
    private static SubLSymbol $PREDICATE_EXTENT;
    private static SubLSymbol $OVERLAP;
    private static SubLSymbol $sym34$HL_VAR_;
    private static SubLObject $$not;
    private static SubLSymbol $REMOVAL_IST_ASSERTED_GAF_LOOKUP_POS;
    private static SubLList $list37;
    private static SubLSymbol $sym38$FORT_P;
    private static SubLSymbol $REMOVAL_IST_ASSERTED_UNBOUND_LOOKUP_POS;
    private static SubLList $list40;
    private static SubLSymbol $MT;
    private static SubLSymbol $BROAD_MT;
    private static SubLString $str43$do_broad_mt_index;
    private static SubLSymbol $sym44$STRINGP;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $REMOVAL_IST_ASSERTED_MT_CONTENTS;
    private static SubLList $list47;
    private static SubLSymbol $MINIMIZE;
    private static SubLSymbol $REMOVAL_IST_ASSERTED_GAF_LOOKUP_NEG;
    private static SubLList $list50;
    private static SubLSymbol $REMOVAL_IST_ASSERTED_UNBOUND_MT_GAF_LOOKUP_POS;
    private static SubLList $list52;
    private static SubLSymbol $REMOVAL_IST_ASSERTED_UNBOUND_MT_UNBOUND_PRED_LOOKUP_POS;
    private static SubLList $list54;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 1100L)
    public static SubLObject make_ist_supports(SubLObject mt, SubLObject sentence) {
        SubLObject current;
        SubLObject datum = current = make_ist_justification(mt, sentence);
        SubLObject support = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
        support = current.first();
        SubLObject more_supports;
        current = (more_supports = current.rest());
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 1300L)
    public static SubLObject make_ist_justification(SubLObject mt, SubLObject sentence) {
        return list(make_ist_support(mt, sentence));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 1400L)
    public static SubLObject make_ist_support(SubLObject mt, SubLObject sentence) {
        SubLObject ist_sentence = el_utilities.make_binary_formula($$ist, mt, sentence);
        return arguments.make_hl_support($QUERY, ist_sentence, mt_vars.$ist_mt$.getGlobalValue(), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 1800L)
    public static SubLObject removal_ist_formula_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != removal_ist_check_query(mt, sentence)) {
            SubLObject hl_support = make_ist_support(mt, sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 2900L)
    public static SubLObject removal_ist_check_query(SubLObject mt, SubLObject sentence) {
        return inference_trampolines.inference_known_sentence_recursive_query(sentence, mt, ONE_INTEGER);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 3000L)
    public static SubLObject removal_ist_pos_gaf_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean(!removal_ist_pos_gaf_cost(asent, sense).isZero());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 3400L)
    public static SubLObject removal_ist_pos_gaf_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cost = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            cost = inference_utilities.literal_removal_cost(gaf_sentence, $POS, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cost;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 3700L)
    public static SubLObject removal_ist_pos_gaf_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject results = removal_ist_pos_gaf_query(mt, gaf_sentence);
        if (NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject v_bindings = NIL;
            v_bindings = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject substituted_gaf_sentence = bindings.subst_bindings(v_bindings, gaf_sentence);
                SubLObject hl_support = make_ist_support(mt, substituted_gaf_sentence);
                backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_bindings = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 4200L)
    public static SubLObject removal_ist_pos_gaf_completeness(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject completeness = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            completeness = inference_utilities.literal_removal_completeness(gaf_sentence, $POS, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return completeness;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 5700L)
    public static SubLObject removal_ist_pos_gaf_query(SubLObject mt, SubLObject gaf_sentence) {
        return inference_trampolines.inference_known_sentence_removal_query(gaf_sentence, mt, $TRUE);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 5900L)
    public static SubLObject removal_ist_neg_gaf_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
        SubLObject cost = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            cost = inference_utilities.literal_removal_cost(gaf_sentence, $NEG, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cost;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 6400L)
    public static SubLObject removal_ist_neg_gaf_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
        SubLObject results = removal_ist_neg_gaf_query(mt, gaf_sentence);
        if (NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject v_bindings = NIL;
            v_bindings = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject substituted_gaf_sentence = bindings.subst_bindings(v_bindings, gaf_sentence);
                SubLObject hl_support = make_ist_support(mt, cycl_utilities.negate(substituted_gaf_sentence));
                backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_bindings = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 7500L)
    public static SubLObject removal_ist_neg_gaf_query(SubLObject mt, SubLObject gaf_sentence) {
        return inference_trampolines.inference_known_sentence_removal_query(gaf_sentence, mt, $FALSE);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 8000L)
    public static SubLObject removal_ist_pos_gaf_mt_lookup_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject mt_support_combinations = cdolist_list_var = inference_trampolines.inference_mts_where_gaf_sentence_true_justified_memoized(gaf_sentence);
        SubLObject mt_support_combination = NIL;
        mt_support_combination = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = mt_support_combination;
            SubLObject mts = NIL;
            SubLObject justification = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
            mts = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
            justification = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$1 = mts;
                SubLObject mt = NIL;
                mt = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    SubLObject v_bindings = unification_utilities.genl_mt_unify(arg1, mt, UNPROVIDED);
                    if (NIL != v_bindings) {
                        thread.resetMultipleValues();
                        SubLObject support = make_ist_supports(mt, gaf_sentence);
                        SubLObject more_supports = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        backward.removal_add_node(support, v_bindings, more_supports);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    mt = cdolist_list_var_$1.first();
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list20);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_support_combination = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 9300L)
    public static SubLObject removal_ist_unbound_mt_gaf_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject ist_formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject binding_cost = inference_utilities.literal_removal_cost(ist_formula, $POS, UNPROVIDED, UNPROVIDED);
            SubLObject mt_cost = $estimated_mts_per_formula$.getDynamicValue(thread);
            cost = Numbers.multiply(binding_cost, mt_cost);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return cost;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 9800L)
    public static SubLObject removal_ist_unbound_mt_gaf_lookup_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ist_mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject ist_formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject bindings_list = cdolist_list_var = removal_ist_pos_gaf_query($$InferencePSC, ist_formula);
        SubLObject formula_bindings = NIL;
        formula_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_formula = conses_high.sublis(formula_bindings, ist_formula, Symbols.symbol_function(EQL), UNPROVIDED);
            SubLObject cdolist_list_var_$2;
            SubLObject mt_support_combinations = cdolist_list_var_$2 = inference_trampolines.inference_mts_where_gaf_sentence_true_justified_memoized(new_formula);
            SubLObject mt_support_combination = NIL;
            mt_support_combination = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                SubLObject current;
                SubLObject datum = current = mt_support_combination;
                SubLObject mts = NIL;
                SubLObject justification = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
                mts = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
                justification = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject cdolist_list_var_$3 = mts;
                    SubLObject mt = NIL;
                    mt = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        SubLObject mt_bindings = unification_utilities.genl_mt_unify(ist_mt, mt, UNPROVIDED);
                        if (NIL != mt_bindings && NIL != formula_bindings) {
                            SubLObject v_bindings = list_utilities.fast_remove_duplicates(append(mt_bindings, formula_bindings), Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL == list_utilities.duplicates(bindings.bindings_variables(v_bindings), UNPROVIDED, UNPROVIDED)) {
                                thread.resetMultipleValues();
                                SubLObject support = make_ist_supports(mt, new_formula);
                                SubLObject more_supports = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                backward.removal_add_node(support, v_bindings, more_supports);
                            }
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        mt = cdolist_list_var_$3.first();
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list20);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                mt_support_combination = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula_bindings = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 11700L)
    public static SubLObject make_ist_asserted_justification(SubLObject assertion) {
        return list(make_ist_asserted_support(assertion));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 11800L)
    public static SubLObject make_ist_asserted_support(SubLObject assertion) {
        SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
        SubLObject ist_asserted_sentence = el_utilities.make_binary_formula($$ist_Asserted, mt, sentence);
        return arguments.make_hl_support($QUERY, ist_asserted_sentence, mt_vars.$ist_mt$.getGlobalValue(), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 12200L)
    public static SubLObject removal_ist_asserted_gaf_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_ist_asserted_gaf_lookup_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 12600L)
    public static SubLObject removal_ist_asserted_gaf_iterator(SubLObject mt, SubLObject formula) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject sub_literal = el_utilities.literal_atomic_sentence(formula);
        SubLObject sub_sense = el_utilities.literal_sense(formula);
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym29$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject source_formula_var = sub_literal;
            SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function($sym34$HL_VAR_), T);
            SubLObject permuted_literal = NIL;
            permuted_literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_literal, sub_sense);
                SubLObject pcase_var;
                SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                    SubLObject argnum = thread.secondMultipleValue();
                    SubLObject predicate = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != argnum) {
                        if (NIL != predicate) {
                            SubLObject pred_var = predicate;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                            SubLObject done_var_$4 = NIL;
                                            SubLObject token_var_$5 = NIL;
                                            while (NIL == done_var_$4) {
                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                                SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                                if (NIL != valid_$6 && NIL != backward_utilities.direction_is_relevant(assertion) && enumeration_types.truth_sense(assertions_high.assertion_truth(assertion)).eql(sub_sense)) {
                                                    thread.resetMultipleValues();
                                                    SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_literal, assertions_high.gaf_formula(assertion), T, T);
                                                    SubLObject gaf_asent = thread.secondMultipleValue();
                                                    SubLObject unify_justification = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != v_bindings) {
                                                        result = cons(list(v_bindings, assertion), result);
                                                    }
                                                }
                                                done_var_$4 = makeBoolean(NIL == valid_$6);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            }
                        } else {
                            SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                            SubLObject done_var_$5 = NIL;
                                            SubLObject token_var_$6 = NIL;
                                            while (NIL == done_var_$5) {
                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                                SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion));
                                                if (NIL != valid_$7 && NIL != backward_utilities.direction_is_relevant(assertion) && enumeration_types.truth_sense(assertions_high.assertion_truth(assertion)).eql(sub_sense)) {
                                                    thread.resetMultipleValues();
                                                    SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_literal, assertions_high.gaf_formula(assertion), T, T);
                                                    SubLObject gaf_asent = thread.secondMultipleValue();
                                                    SubLObject unify_justification = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != v_bindings) {
                                                        result = cons(list(v_bindings, assertion), result);
                                                    }
                                                }
                                                done_var_$5 = makeBoolean(NIL == valid_$7);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values2 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            }
                        }
                    } else if (NIL != predicate) {
                        SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                        SubLObject done_var_$6 = NIL;
                                        SubLObject token_var_$7 = NIL;
                                        while (NIL == done_var_$6) {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                            SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(assertion));
                                            if (NIL != valid_$8 && NIL != backward_utilities.direction_is_relevant(assertion) && enumeration_types.truth_sense(assertions_high.assertion_truth(assertion)).eql(sub_sense)) {
                                                thread.resetMultipleValues();
                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_literal, assertions_high.gaf_formula(assertion), T, T);
                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != v_bindings) {
                                                    result = cons(list(v_bindings, assertion), result);
                                                }
                                            }
                                            done_var_$6 = makeBoolean(NIL == valid_$8);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values3 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values3);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    } else {
                        SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                        SubLObject done_var_$7 = NIL;
                                        SubLObject token_var_$8 = NIL;
                                        while (NIL == done_var_$7) {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                                            SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(assertion));
                                            if (NIL != valid_$9 && NIL != backward_utilities.direction_is_relevant(assertion) && enumeration_types.truth_sense(assertions_high.assertion_truth(assertion)).eql(sub_sense)) {
                                                thread.resetMultipleValues();
                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_literal, assertions_high.gaf_formula(assertion), T, T);
                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != v_bindings) {
                                                    result = cons(list(v_bindings, assertion), result);
                                                }
                                            }
                                            done_var_$7 = makeBoolean(NIL == valid_$9);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values4 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values4);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    }
                } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                    SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        SubLObject str = NIL;
                        SubLObject _prev_bind_0_$11 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        SubLObject _prev_bind_1_$21 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                            SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = NIL;
                            SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                        SubLObject done_var_$8 = NIL;
                                        SubLObject token_var_$9 = NIL;
                                        while (NIL == done_var_$8) {
                                            SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$9);
                                            SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(assertion2));
                                            if (NIL != valid_$10 && NIL != backward_utilities.direction_is_relevant(assertion2) && enumeration_types.truth_sense(assertions_high.assertion_truth(assertion2)).eql(sub_sense)) {
                                                thread.resetMultipleValues();
                                                SubLObject v_bindings2 = unification_utilities.gaf_asent_unify(permuted_literal, assertions_high.gaf_formula(assertion2), T, T);
                                                SubLObject gaf_asent2 = thread.secondMultipleValue();
                                                SubLObject unify_justification2 = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != v_bindings2) {
                                                    result = cons(list(v_bindings2, assertion2), result);
                                                }
                                            }
                                            done_var_$8 = makeBoolean(NIL == valid_$10);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values5 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values5);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            }
                            utilities_macros.noting_progress_postamble();
                        } finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$21, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                } else if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var_$26 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var_$26.first();
                    while (NIL != cdolist_list_var_$26) {
                        if ((NIL == enumeration_types.sense_truth(sub_sense) || NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sub_sense))) && NIL != backward_utilities.direction_is_relevant(assertion3)
                                && enumeration_types.truth_sense(assertions_high.assertion_truth(assertion3)).eql(sub_sense)) {
                            thread.resetMultipleValues();
                            SubLObject v_bindings3 = unification_utilities.gaf_asent_unify(permuted_literal, assertions_high.gaf_formula(assertion3), T, T);
                            SubLObject gaf_asent3 = thread.secondMultipleValue();
                            SubLObject unify_justification3 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings3) {
                                result = cons(list(v_bindings3, assertion3), result);
                            }
                        }
                        cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                        assertion3 = cdolist_list_var_$26.first();
                    }
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }
                cdolist_list_var = cdolist_list_var.rest();
                permuted_literal = cdolist_list_var.first();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 13500L)
    public static SubLObject removal_ist_asserted_pred_fort(SubLObject v_object) {
        return makeBoolean(!v_object.eql($$not) && NIL != forts.fort_p(v_object));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 14800L)
    public static SubLObject removal_ist_asserted_gaf_lookup_cost(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject gaf_formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject sub_literal = el_utilities.literal_atomic_sentence(gaf_formula);
        SubLObject sub_sense = el_utilities.literal_sense(gaf_formula);
        SubLObject total = ZERO_INTEGER;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym29$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject source_formula_var = sub_literal;
            SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function($sym34$HL_VAR_), T);
            SubLObject permuted_literal = NIL;
            permuted_literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                total = Numbers.add(total, inference_trampolines.inference_relevant_num_gaf_lookup_index(mt, permuted_literal, sub_sense));
                cdolist_list_var = cdolist_list_var.rest();
                permuted_literal = cdolist_list_var.first();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 15300L)
    public static SubLObject removal_ist_asserted_unbound_lookup_pos_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject formula = el_utilities.literal_atomic_sentence(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
        return Sequences.find_if(Symbols.symbol_function($sym38$FORT_P), cycl_utilities.atomic_sentence_args(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 15700L)
    public static SubLObject removal_ist_asserted_unbound_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_ist_asserted_gaf_lookup_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 15900L)
    public static SubLObject removal_ist_asserted_unbound_lookup_iterator(SubLObject mt, SubLObject formula) {
        return removal_ist_asserted_gaf_iterator(mt, formula);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 17300L)
    public static SubLObject removal_ist_asserted_mt_contents_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject v_hlmt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject formula = el_utilities.literal_atomic_sentence(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
        return makeBoolean(NIL == kb_indexing.broad_mtP(hlmt.hlmt_monad_mt(v_hlmt)) && NIL == list_utilities.tree_find_if(Symbols.symbol_function($sym38$FORT_P), formula, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 17700L)
    public static SubLObject removal_ist_asserted_mt_contents_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return kb_indexing.num_mt_index(mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 17900L)
    public static SubLObject removal_ist_asserted_mt_contents_iterator(SubLObject mt, SubLObject formula) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
        if (pcase_var.eql($MT)) {
            if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, $GAF)) {
                SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(assertion));
                        if (NIL != valid && NIL != backward_utilities.direction_is_relevant(assertion)) {
                            SubLObject gaf_formula = assertions_high.gaf_el_formula(assertion);
                            thread.resetMultipleValues();
                            SubLObject v_bindings = unification_utilities.term_unify(formula, gaf_formula, UNPROVIDED, UNPROVIDED);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                result = cons(assertion, result);
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } finally {
                    SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values = Values.getValuesAsVector();
                        if (NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        Values.restoreValuesFromVector(_values);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        } else if (pcase_var.eql($BROAD_MT) && NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, $GAF)) {
            SubLObject idx = assertion_handles.do_assertions_table();
            SubLObject mess = $str43$do_broad_mt_index;
            SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != Types.stringp(mess) : mess;
            SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    SubLObject idx_$27 = idx;
                    if (NIL == id_index.id_index_objects_empty_p(idx_$27, $SKIP)) {
                        SubLObject idx_$28 = idx_$27;
                        if (NIL == id_index.id_index_dense_objects_empty_p(idx_$28, $SKIP)) {
                            SubLObject vector_var = id_index.id_index_dense_objects(idx_$28);
                            SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion2;
                            SubLObject gaf_formula2;
                            SubLObject v_bindings2;
                            SubLObject unify_justification2;
                            for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                                a_id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (NIL == id_index.id_index_tombstone_p(a_handle) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                    if (NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = $SKIP;
                                    }
                                    assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, $GAF, NIL) && NIL != backward_utilities.direction_is_relevant(assertion2)) {
                                        gaf_formula2 = assertions_high.gaf_el_formula(assertion2);
                                        thread.resetMultipleValues();
                                        v_bindings2 = unification_utilities.term_unify(formula, gaf_formula2, UNPROVIDED, UNPROVIDED);
                                        unify_justification2 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != v_bindings2) {
                                            result = cons(assertion2, result);
                                        }
                                    }
                                    sofar = Numbers.add(sofar, ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        SubLObject idx_$29 = idx_$27;
                        if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$29) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            SubLObject sparse = id_index.id_index_sparse_objects(idx_$29);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$29);
                            SubLObject end_id = id_index.id_index_next_id(idx_$29);
                            SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (a_id2.numL(end_id)) {
                                SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, $GAF, NIL) && NIL != backward_utilities.direction_is_relevant(assertion3)) {
                                        SubLObject gaf_formula3 = assertions_high.gaf_el_formula(assertion3);
                                        thread.resetMultipleValues();
                                        SubLObject v_bindings3 = unification_utilities.term_unify(formula, gaf_formula3, UNPROVIDED, UNPROVIDED);
                                        SubLObject unify_justification3 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != v_bindings3) {
                                            result = cons(assertion3, result);
                                        }
                                    }
                                    sofar = Numbers.add(sofar, ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                a_id2 = Numbers.add(a_id2, ONE_INTEGER);
                            }
                        }
                    }
                } finally {
                    SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                    }
                }
            } finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 19400L)
    public static SubLObject removal_ist_asserted_gaf_lookup_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return Numbers.subtract(ONE_INTEGER, Numbers.min(ONE_INTEGER, removal_ist_asserted_gaf_lookup_cost(asent)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 19800L)
    public static SubLObject removal_ist_asserted_gaf_lookup_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject sub_literal = el_utilities.literal_atomic_sentence(formula);
        SubLObject sub_sense = el_utilities.literal_sense(formula);
        SubLObject found = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym29$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject source_formula_var = sub_literal;
            SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function($sym34$HL_VAR_), T);
            SubLObject permuted_literal = NIL;
            permuted_literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_literal, sub_sense);
                SubLObject pcase_var;
                SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                    SubLObject argnum = thread.secondMultipleValue();
                    SubLObject predicate = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != argnum) {
                        if (NIL != predicate) {
                            SubLObject pred_var = predicate;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = found;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                            SubLObject done_var_$31 = found;
                                            SubLObject token_var_$32 = NIL;
                                            while (NIL == done_var_$31) {
                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$32);
                                                SubLObject valid_$33 = makeBoolean(!token_var_$32.eql(assertion));
                                                if (NIL != valid_$33) {
                                                    found = removal_ist_asserted_gaf_lookup_neg_expand_internal(assertion, permuted_literal);
                                                }
                                                done_var_$31 = makeBoolean(NIL == valid_$33 || NIL != found);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid || NIL != found);
                                }
                            }
                        } else {
                            SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = found;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                            SubLObject done_var_$32 = found;
                                            SubLObject token_var_$33 = NIL;
                                            while (NIL == done_var_$32) {
                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$33);
                                                SubLObject valid_$34 = makeBoolean(!token_var_$33.eql(assertion));
                                                if (NIL != valid_$34) {
                                                    found = removal_ist_asserted_gaf_lookup_neg_expand_internal(assertion, permuted_literal);
                                                }
                                                done_var_$32 = makeBoolean(NIL == valid_$34 || NIL != found);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values2 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid || NIL != found);
                                }
                            }
                        }
                    } else if (NIL != predicate) {
                        SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = found;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                        SubLObject done_var_$33 = found;
                                        SubLObject token_var_$34 = NIL;
                                        while (NIL == done_var_$33) {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$34);
                                            SubLObject valid_$35 = makeBoolean(!token_var_$34.eql(assertion));
                                            if (NIL != valid_$35) {
                                                found = removal_ist_asserted_gaf_lookup_neg_expand_internal(assertion, permuted_literal);
                                            }
                                            done_var_$33 = makeBoolean(NIL == valid_$35 || NIL != found);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values3 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values3);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid || NIL != found);
                            }
                        }
                    } else {
                        SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = found;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                        SubLObject done_var_$34 = found;
                                        SubLObject token_var_$35 = NIL;
                                        while (NIL == done_var_$34) {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                            SubLObject valid_$36 = makeBoolean(!token_var_$35.eql(assertion));
                                            if (NIL != valid_$36) {
                                                found = removal_ist_asserted_gaf_lookup_neg_expand_internal(assertion, permuted_literal);
                                            }
                                            done_var_$34 = makeBoolean(NIL == valid_$36 || NIL != found);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values4 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values4);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid || NIL != found);
                            }
                        }
                    }
                } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                    SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        SubLObject str = NIL;
                        SubLObject _prev_bind_0_$38 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        SubLObject _prev_bind_1_$48 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                            SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = found;
                            SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                        SubLObject done_var_$35 = found;
                                        SubLObject token_var_$36 = NIL;
                                        while (NIL == done_var_$35) {
                                            SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$36);
                                            SubLObject valid_$37 = makeBoolean(!token_var_$36.eql(assertion2));
                                            if (NIL != valid_$37) {
                                                found = removal_ist_asserted_gaf_lookup_neg_expand_internal(assertion2, permuted_literal);
                                            }
                                            done_var_$35 = makeBoolean(NIL == valid_$37 || NIL != found);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values5 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values5);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2 || NIL != found);
                            }
                            utilities_macros.noting_progress_postamble();
                        } finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$48, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$38, thread);
                        }
                    }
                } else if (pcase_var.eql($OVERLAP)) {
                    SubLObject rest;
                    SubLObject assertion3;
                    for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); NIL == found && NIL != rest; rest = rest.rest()) {
                        assertion3 = rest.first();
                        if (NIL == enumeration_types.sense_truth(sub_sense) || NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sub_sense))) {
                            found = removal_ist_asserted_gaf_lookup_neg_expand_internal(assertion3, permuted_literal);
                        }
                    }
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }
                cdolist_list_var = cdolist_list_var.rest();
                permuted_literal = cdolist_list_var.first();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == found) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 21200L)
    public static SubLObject removal_ist_asserted_gaf_lookup_neg_expand_internal(SubLObject assertion, SubLObject formula) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.gaf_asent_unify(formula, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
            SubLObject gaf_asent = thread.secondMultipleValue();
            SubLObject unify_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return list_utilities.sublisp_boolean(v_bindings);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 21600L)
    public static SubLObject removal_ist_asserted_unbound_mt_gaf_lookup_pos_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject ist_formula = el_utilities.literal_atomic_sentence(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
        SubLObject predicate = cycl_utilities.formula_arg0(ist_formula);
        return fort_types_interface.predicateP(predicate);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 22200L)
    public static SubLObject removal_ist_asserted_unbound_mt_gaf_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_ist_asserted_unbound_mt_gaf_lookup_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 22400L)
    public static SubLObject removal_ist_asserted_unbound_mt_gaf_lookup_iterator(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ist_formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject mt_overlap_cost = virtual_indexing.estimated_num_overlap_index_for_mt(mt);
        SubLObject sub_literal = el_utilities.literal_atomic_sentence(ist_formula);
        SubLObject sub_sense = el_utilities.literal_sense(ist_formula);
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject source_formula_var = sub_literal;
            SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function($sym34$HL_VAR_), T);
            SubLObject permuted_literal = NIL;
            permuted_literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject gaf_cost = inference_trampolines.inference_num_gaf_lookup_index(permuted_literal, sub_sense);
                if (mt_overlap_cost.numL(gaf_cost)) {
                    SubLObject cdolist_list_var_$53 = virtual_indexing.gather_overlap_index_for_mt(mt);
                    SubLObject assertion = NIL;
                    assertion = cdolist_list_var_$53.first();
                    while (NIL != cdolist_list_var_$53) {
                        SubLObject v_bindings = removal_ist_asserted_unify(assertion, permuted_literal, mt);
                        if (NIL != v_bindings) {
                            result = cons(list(v_bindings, assertion), result);
                        }
                        cdolist_list_var_$53 = cdolist_list_var_$53.rest();
                        assertion = cdolist_list_var_$53.first();
                    }
                } else {
                    SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_literal, sub_sense);
                    SubLObject pcase_var;
                    SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                    if (pcase_var.eql($GAF_ARG)) {
                        thread.resetMultipleValues();
                        SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        SubLObject argnum = thread.secondMultipleValue();
                        SubLObject predicate = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != argnum) {
                            if (NIL != predicate) {
                                SubLObject pred_var = predicate;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                SubLObject done_var_$54 = NIL;
                                                SubLObject token_var_$55 = NIL;
                                                while (NIL == done_var_$54) {
                                                    SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                                    SubLObject valid_$56 = makeBoolean(!token_var_$55.eql(assertion2));
                                                    if (NIL != valid_$56) {
                                                        SubLObject v_bindings2 = removal_ist_asserted_unify(assertion2, permuted_literal, mt);
                                                        if (NIL != v_bindings2) {
                                                            result = cons(list(v_bindings2, assertion2), result);
                                                        }
                                                    }
                                                    done_var_$54 = makeBoolean(NIL == valid_$56);
                                                }
                                            } finally {
                                                SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                    SubLObject _values = Values.getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values);
                                                } finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                }
                            } else {
                                SubLObject pred_var = NIL;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                SubLObject done_var_$55 = NIL;
                                                SubLObject token_var_$56 = NIL;
                                                while (NIL == done_var_$55) {
                                                    SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$56);
                                                    SubLObject valid_$57 = makeBoolean(!token_var_$56.eql(assertion2));
                                                    if (NIL != valid_$57) {
                                                        SubLObject v_bindings2 = removal_ist_asserted_unify(assertion2, permuted_literal, mt);
                                                        if (NIL != v_bindings2) {
                                                            result = cons(list(v_bindings2, assertion2), result);
                                                        }
                                                    }
                                                    done_var_$55 = makeBoolean(NIL == valid_$57);
                                                }
                                            } finally {
                                                SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                    SubLObject _values2 = Values.getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values2);
                                                } finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                }
                            }
                        } else if (NIL != predicate) {
                            SubLObject pred_var = predicate;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                            SubLObject done_var_$56 = NIL;
                                            SubLObject token_var_$57 = NIL;
                                            while (NIL == done_var_$56) {
                                                SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$57);
                                                SubLObject valid_$58 = makeBoolean(!token_var_$57.eql(assertion2));
                                                if (NIL != valid_$58) {
                                                    SubLObject v_bindings2 = removal_ist_asserted_unify(assertion2, permuted_literal, mt);
                                                    if (NIL != v_bindings2) {
                                                        result = cons(list(v_bindings2, assertion2), result);
                                                    }
                                                }
                                                done_var_$56 = makeBoolean(NIL == valid_$58);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values3 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values3);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            }
                        } else {
                            SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                            SubLObject done_var_$57 = NIL;
                                            SubLObject token_var_$58 = NIL;
                                            while (NIL == done_var_$57) {
                                                SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$58);
                                                SubLObject valid_$59 = makeBoolean(!token_var_$58.eql(assertion2));
                                                if (NIL != valid_$59) {
                                                    SubLObject v_bindings2 = removal_ist_asserted_unify(assertion2, permuted_literal, mt);
                                                    if (NIL != v_bindings2) {
                                                        result = cons(list(v_bindings2, assertion2), result);
                                                    }
                                                }
                                                done_var_$57 = makeBoolean(NIL == valid_$59);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values4 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values4);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            }
                        }
                    } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                        SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                            SubLObject str = NIL;
                            SubLObject _prev_bind_0_$61 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            SubLObject _prev_bind_1_$71 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                                SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                                SubLObject done_var2 = NIL;
                                SubLObject token_var2 = NIL;
                                while (NIL == done_var2) {
                                    SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (NIL != valid2) {
                                        utilities_macros.note_progress();
                                        SubLObject final_index_iterator2 = NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                            SubLObject done_var_$58 = NIL;
                                            SubLObject token_var_$59 = NIL;
                                            while (NIL == done_var_$58) {
                                                SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$59);
                                                SubLObject valid_$60 = makeBoolean(!token_var_$59.eql(assertion3));
                                                if (NIL != valid_$60) {
                                                    SubLObject v_bindings3 = removal_ist_asserted_unify(assertion3, permuted_literal, mt);
                                                    if (NIL != v_bindings3) {
                                                        result = cons(list(v_bindings3, assertion3), result);
                                                    }
                                                }
                                                done_var_$58 = makeBoolean(NIL == valid_$60);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values5 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                Values.restoreValuesFromVector(_values5);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                            }
                                        }
                                    }
                                    done_var2 = makeBoolean(NIL == valid2);
                                }
                                utilities_macros.noting_progress_postamble();
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$71, thread);
                                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$61, thread);
                            }
                        }
                    } else if (pcase_var.eql($OVERLAP)) {
                        SubLObject cdolist_list_var_$54 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                        SubLObject assertion4 = NIL;
                        assertion4 = cdolist_list_var_$54.first();
                        while (NIL != cdolist_list_var_$54) {
                            if (NIL == enumeration_types.sense_truth(sub_sense) || NIL != assertions_high.assertion_has_truth(assertion4, enumeration_types.sense_truth(sub_sense))) {
                                SubLObject v_bindings4 = removal_ist_asserted_unify(assertion4, permuted_literal, mt);
                                if (NIL != v_bindings4) {
                                    result = cons(list(v_bindings4, assertion4), result);
                                }
                            }
                            cdolist_list_var_$54 = cdolist_list_var_$54.rest();
                            assertion4 = cdolist_list_var_$54.first();
                        }
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                permuted_literal = cdolist_list_var.first();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 25000L)
    public static SubLObject removal_ist_asserted_unbound_mt_gaf_lookup_cost(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject ist_formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject sub_literal = el_utilities.literal_atomic_sentence(ist_formula);
        SubLObject sub_sense = el_utilities.literal_sense(ist_formula);
        SubLObject mt_overlap_cost = virtual_indexing.estimated_num_overlap_index_for_mt(mt);
        SubLObject total = ZERO_INTEGER;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject source_formula_var = sub_literal;
            SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function($sym34$HL_VAR_), T);
            SubLObject permuted_literal = NIL;
            permuted_literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject gaf_cost = inference_trampolines.inference_num_gaf_lookup_index(permuted_literal, sub_sense);
                SubLObject best_cost = Numbers.min(mt_overlap_cost, gaf_cost);
                total = Numbers.add(total, best_cost);
                cdolist_list_var = cdolist_list_var.rest();
                permuted_literal = cdolist_list_var.first();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 25600L)
    public static SubLObject removal_ist_asserted_unify(SubLObject assertion, SubLObject inference_literal, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            SubLObject gaf_mt = assertions_high.assertion_mt(assertion);
            SubLObject gaf_asent = el_utilities.make_binary_formula($$ist_Asserted, gaf_mt, gaf_formula);
            SubLObject inf_asent = el_utilities.make_binary_formula($$ist_Asserted, mt, inference_literal);
            thread.resetMultipleValues();
            SubLObject inf_asent_$77 = possibly_simplify_ist_sentences_for_unify(inf_asent, gaf_asent);
            SubLObject gaf_asent_$78 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inf_asent = inf_asent_$77;
            gaf_asent = gaf_asent_$78;
            SubLObject v_bindings = unification_utilities.gaf_asent_unify(inf_asent, gaf_asent, UNPROVIDED, UNPROVIDED);
            return v_bindings;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 26300L)
    public static SubLObject possibly_simplify_ist_sentences_for_unify(SubLObject inference_asent, SubLObject gaf_asent) {
        if (NIL != el_utilities.ist_sentence_p(inference_asent, T) && NIL != el_utilities.ist_sentence_p(gaf_asent, T)) {
            SubLObject inference_asent_predicate = cycl_utilities.atomic_sentence_predicate(inference_asent);
            SubLObject inference_asent_mt = el_utilities.designated_mt(inference_asent);
            SubLObject gaf_asent_predicate = cycl_utilities.atomic_sentence_predicate(gaf_asent);
            SubLObject gaf_asent_mt = el_utilities.designated_mt(gaf_asent);
            if (NIL != variables.fully_bound_p(gaf_asent_mt) && NIL != variables.fully_bound_p(inference_asent_mt) && NIL != genl_predicates.genl_predP(gaf_asent_predicate, inference_asent_predicate, UNPROVIDED, UNPROVIDED)
                    && (NIL != kb_utilities.kbeq(gaf_asent_mt, inference_asent_mt) || (NIL == kb_utilities.kbeq(inference_asent_predicate, $$ist_Asserted) && NIL != mt_relevance_macros.mt_relevant_to_mtP(gaf_asent_mt, inference_asent_mt)))) {
                inference_asent = el_utilities.designated_sentence(inference_asent);
                gaf_asent = el_utilities.designated_sentence(gaf_asent);
            }
        }
        return Values.values(inference_asent, gaf_asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 27200L)
    public static SubLObject removal_ist_asserted_unbound_mt_unbound_pred_lookup_pos_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject ist_formula = el_utilities.literal_atomic_sentence(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
        return Sequences.find_if(Symbols.symbol_function($sym38$FORT_P), cycl_utilities.atomic_sentence_args(ist_formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 27700L)
    public static SubLObject removal_ist_asserted_unbound_mt_unbound_pred_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_ist_asserted_unbound_mt_gaf_lookup_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-ist.lisp", position = 27900L)
    public static SubLObject removal_ist_asserted_unbound_mt_unbound_pred_lookup_pos_iterator(SubLObject asent) {
        return removal_ist_asserted_unbound_mt_gaf_lookup_iterator(asent);
    }

    public static SubLObject declare_removal_modules_ist_file() {
        declareFunction(myName, "make_ist_supports", "MAKE-IST-SUPPORTS", 2, 0, false);
        declareFunction(myName, "make_ist_justification", "MAKE-IST-JUSTIFICATION", 2, 0, false);
        declareFunction(myName, "make_ist_support", "MAKE-IST-SUPPORT", 2, 0, false);
        declareFunction(myName, "removal_ist_formula_check_expand", "REMOVAL-IST-FORMULA-CHECK-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_ist_check_query", "REMOVAL-IST-CHECK-QUERY", 2, 0, false);
        declareFunction(myName, "removal_ist_pos_gaf_required", "REMOVAL-IST-POS-GAF-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_ist_pos_gaf_cost", "REMOVAL-IST-POS-GAF-COST", 1, 1, false);
        declareFunction(myName, "removal_ist_pos_gaf_expand", "REMOVAL-IST-POS-GAF-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_ist_pos_gaf_completeness", "REMOVAL-IST-POS-GAF-COMPLETENESS", 1, 1, false);
        declareFunction(myName, "removal_ist_pos_gaf_query", "REMOVAL-IST-POS-GAF-QUERY", 2, 0, false);
        declareFunction(myName, "removal_ist_neg_gaf_cost", "REMOVAL-IST-NEG-GAF-COST", 1, 1, false);
        declareFunction(myName, "removal_ist_neg_gaf_expand", "REMOVAL-IST-NEG-GAF-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_ist_neg_gaf_query", "REMOVAL-IST-NEG-GAF-QUERY", 2, 0, false);
        declareFunction(myName, "removal_ist_pos_gaf_mt_lookup_expand", "REMOVAL-IST-POS-GAF-MT-LOOKUP-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_ist_unbound_mt_gaf_lookup_pos_cost", "REMOVAL-IST-UNBOUND-MT-GAF-LOOKUP-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_ist_unbound_mt_gaf_lookup_pos_expand", "REMOVAL-IST-UNBOUND-MT-GAF-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "make_ist_asserted_justification", "MAKE-IST-ASSERTED-JUSTIFICATION", 1, 0, false);
        declareFunction(myName, "make_ist_asserted_support", "MAKE-IST-ASSERTED-SUPPORT", 1, 0, false);
        declareFunction(myName, "removal_ist_asserted_gaf_lookup_pos_cost", "REMOVAL-IST-ASSERTED-GAF-LOOKUP-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_ist_asserted_gaf_iterator", "REMOVAL-IST-ASSERTED-GAF-ITERATOR", 2, 0, false);
        declareFunction(myName, "removal_ist_asserted_pred_fort", "REMOVAL-IST-ASSERTED-PRED-FORT", 1, 0, false);
        declareFunction(myName, "removal_ist_asserted_gaf_lookup_cost", "REMOVAL-IST-ASSERTED-GAF-LOOKUP-COST", 1, 0, false);
        declareFunction(myName, "removal_ist_asserted_unbound_lookup_pos_required", "REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-POS-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_ist_asserted_unbound_lookup_pos_cost", "REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_ist_asserted_unbound_lookup_iterator", "REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-ITERATOR", 2, 0, false);
        declareFunction(myName, "removal_ist_asserted_mt_contents_required", "REMOVAL-IST-ASSERTED-MT-CONTENTS-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_ist_asserted_mt_contents_cost", "REMOVAL-IST-ASSERTED-MT-CONTENTS-COST", 1, 1, false);
        declareFunction(myName, "removal_ist_asserted_mt_contents_iterator", "REMOVAL-IST-ASSERTED-MT-CONTENTS-ITERATOR", 2, 0, false);
        declareFunction(myName, "removal_ist_asserted_gaf_lookup_neg_cost", "REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction(myName, "removal_ist_asserted_gaf_lookup_neg_expand", "REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_ist_asserted_gaf_lookup_neg_expand_internal", "REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG-EXPAND-INTERNAL", 2, 0, false);
        declareFunction(myName, "removal_ist_asserted_unbound_mt_gaf_lookup_pos_required", "REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-POS-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_ist_asserted_unbound_mt_gaf_lookup_pos_cost", "REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_ist_asserted_unbound_mt_gaf_lookup_iterator", "REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_ist_asserted_unbound_mt_gaf_lookup_cost", "REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-COST", 1, 0, false);
        declareFunction(myName, "removal_ist_asserted_unify", "REMOVAL-IST-ASSERTED-UNIFY", 3, 0, false);
        declareFunction(myName, "possibly_simplify_ist_sentences_for_unify", "POSSIBLY-SIMPLIFY-IST-SENTENCES-FOR-UNIFY", 2, 0, false);
        declareFunction(myName, "removal_ist_asserted_unbound_mt_unbound_pred_lookup_pos_required", "REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_ist_asserted_unbound_mt_unbound_pred_lookup_pos_cost", "REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_ist_asserted_unbound_mt_unbound_pred_lookup_pos_iterator", "REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS-ITERATOR", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_ist_file() {
        $default_ist_formula_check_cost$ = defparameter("*DEFAULT-IST-FORMULA-CHECK-COST*", $float$1_5);
        $estimated_mts_per_formula$ = defparameter("*ESTIMATED-MTS-PER-FORMULA*", TWO_INTEGER);
        $default_ist_pos_gaf_mt_lookup_cost$ = defparameter("*DEFAULT-IST-POS-GAF-MT-LOOKUP-COST*", $estimated_mts_per_formula$.getDynamicValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_ist_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$ist);
        preference_modules.inference_preference_module($IST_MT_PROP_POS, $list2);
        preference_modules.inference_preference_module($IST_IN_WHAT_MTS_POS, $list4);
        inference_modules.inference_removal_module($REMOVAL_IST_FORMULA_CHECK, $list9);
        inference_modules.inference_removal_module($REMOVAL_IST_POS_GAF, $list12);
        inference_modules.inference_removal_module($REMOVAL_IST_PRED_UNBOUND_POS_GAF, $list14);
        inference_modules.inference_removal_module($REMOVAL_IST_NEG_GAF, $list18);
        inference_modules.inference_removal_module($REMOVAL_IST_POS_GAF_MT_LOOKUP, $list22);
        inference_modules.inference_removal_module($REMOVAL_IST_UNBOUND_MT_GAF_LOOKUP_POS, $list27);
        inference_modules.register_solely_specific_removal_module_predicate($$ist_Asserted);
        inference_modules.inference_removal_module($REMOVAL_IST_ASSERTED_GAF_LOOKUP_POS, $list37);
        inference_modules.inference_removal_module($REMOVAL_IST_ASSERTED_UNBOUND_LOOKUP_POS, $list40);
        inference_modules.inference_removal_module($REMOVAL_IST_ASSERTED_MT_CONTENTS, $list47);
        inference_modules.inference_removal_module($REMOVAL_IST_ASSERTED_GAF_LOOKUP_NEG, $list50);
        inference_modules.inference_removal_module($REMOVAL_IST_ASSERTED_UNBOUND_MT_GAF_LOOKUP_POS, $list52);
        inference_modules.inference_removal_module($REMOVAL_IST_ASSERTED_UNBOUND_MT_UNBOUND_PRED_LOOKUP_POS, $list54);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_ist_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_ist_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_ist_file();
    }

    static {
        me = new removal_modules_ist();
        $default_ist_formula_check_cost$ = null;
        $estimated_mts_per_formula$ = null;
        $default_ist_pos_gaf_mt_lookup_cost$ = null;
        $$ist = makeConstSym(("ist"));
        $IST_MT_PROP_POS = makeKeyword("IST-MT-PROP-POS");
        $list2 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("ist")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("VARIABLE")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
        $IST_IN_WHAT_MTS_POS = makeKeyword("IST-IN-WHAT-MTS-POS");
        $list4 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("ist")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("VARIABLE"))), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $list5 = list(makeSymbol("SUPPORT"), makeSymbol("&REST"), makeSymbol("MORE-SUPPORTS"));
        $QUERY = makeKeyword("QUERY");
        $float$1_5 = makeDouble(1.5);
        $REMOVAL_IST_FORMULA_CHECK = makeKeyword("REMOVAL-IST-FORMULA-CHECK");
        $list9 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("ist")), makeKeyword("CLOSED-HLMT"),
                        list(makeKeyword("AND"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))),
                                list(makeKeyword("NOT"), list(makeConstSym(("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")))))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-IST-FORMULA-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-IST-FORMULA-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$ist <mt> (<non-predicate> . <fully-bound>))\n    by recursively querying sentence in <mt>\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$ist #$BaseKB\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });
        $POS = makeKeyword("POS");
        $REMOVAL_IST_POS_GAF = makeKeyword("REMOVAL-IST-POS-GAF");
        $list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("ist")), makeKeyword("CLOSED-HLMT"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-IST-POS-GAF-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-IST-POS-GAF-COST"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-IST-POS-GAF-EXPAND"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-IST-POS-GAF-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$ist <mt> (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)\n    in <mt>"), makeKeyword("EXAMPLE"), makeString("(#$ist #$BaseKB\n     (#$genls ?SPEC #$BinaryRelation))") });
        $REMOVAL_IST_PRED_UNBOUND_POS_GAF = makeKeyword("REMOVAL-IST-PRED-UNBOUND-POS-GAF");
        $list14 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("ist")), makeKeyword("CLOSED-HLMT"), cons(makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"))),
                makeKeyword("REQUIRED"), makeSymbol("REMOVAL-IST-POS-GAF-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-IST-POS-GAF-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-IST-POS-GAF-EXPAND"), makeKeyword("COMPLETENESS-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-IST-POS-GAF-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$ist <mt> (<variable> . <whatever>))\n    by recursively querying sentence (<variable> . <whatever>)\n    in <mt>"), makeKeyword("EXAMPLE"),
                makeString("(#$ist #$BaseKB\n     (?PRED ?SPEC #$BinaryRelation))") });
        $TRUE = makeKeyword("TRUE");
        $NEG = makeKeyword("NEG");
        $REMOVAL_IST_NEG_GAF = makeKeyword("REMOVAL-IST-NEG-GAF");
        $list18 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("ist")), makeKeyword("CLOSED-HLMT"), list(makeConstSym(("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-IST-NEG-GAF-COST"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-IST-NEG-GAF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$ist <mt> (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    in <mt>"), makeKeyword("EXAMPLE"),
                makeString("(#$ist #$BaseKB\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });
        $FALSE = makeKeyword("FALSE");
        $list20 = list(makeSymbol("MTS"), makeSymbol("JUSTIFICATION"));
        $REMOVAL_IST_POS_GAF_MT_LOOKUP = makeKeyword("REMOVAL-IST-POS-GAF-MT-LOOKUP");
        $list22 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("ist")), makeKeyword("NOT-FULLY-BOUND"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-IST-POS-GAF-MT-LOOKUP-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-IST-POS-GAF-MT-LOOKUP-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$ist <not fully-bound> (<predicate> . <fully-bound>)))\n    by recursively querying formula in #$InferencePSC\n    and computing appropriate mts from the justification."), makeKeyword("EXAMPLE"), makeString("(#$ist ?MT (#$genls #$BinaryPredicate #$Relation))") });
        $sym23$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $$EverythingPSC = makeConstSym(("EverythingPSC"));
        $$InferencePSC = makeConstSym(("InferencePSC"));
        $REMOVAL_IST_UNBOUND_MT_GAF_LOOKUP_POS = makeKeyword("REMOVAL-IST-UNBOUND-MT-GAF-LOOKUP-POS");
        $list27 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("ist")), makeKeyword("NOT-FULLY-BOUND"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("REMOVAL-IST-UNBOUND-MT-GAF-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-IST-UNBOUND-MT-GAF-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$ist <not-fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$ist ?MT (#$acquaintedWith #$ThomasPynchon ?WHO))") });
        $$ist_Asserted = makeConstSym(("ist-Asserted"));
        $sym29$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
        $GAF_ARG = makeKeyword("GAF-ARG");
        $GAF = makeKeyword("GAF");
        $PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
        $OVERLAP = makeKeyword("OVERLAP");
        $sym34$HL_VAR_ = makeSymbol("HL-VAR?");
        $$not = makeConstSym(("not"));
        $REMOVAL_IST_ASSERTED_GAF_LOOKUP_POS = makeKeyword("REMOVAL-IST-ASSERTED-GAF-LOOKUP-POS");
        $list37 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist-Asserted")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("ist-Asserted")), makeKeyword("CLOSED-HLMT"), list(makeKeyword("OR"), cons(list(makeKeyword("TEST"), makeSymbol("REMOVAL-IST-ASSERTED-PRED-FORT")), makeKeyword("ANYTHING")), list(makeConstSym(("not")), cons(makeKeyword("FORT"), makeKeyword("ANYTHING"))))),
                makeKeyword("COST"), makeSymbol("REMOVAL-IST-ASSERTED-GAF-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("ist-Asserted")), list(makeKeyword("BIND"), makeSymbol("MT")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("MT")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-IST-ASSERTED-GAF-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("MT")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("ist-Asserted")), list(makeKeyword("VALUE"), makeSymbol("MT")), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("MAKE-IST-ASSERTED-JUSTIFICATION"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$ist-Asserted <mt> (<predicate> . <whatever>))\nusing only the KB GAF indexing and explicit assertions in ARG1 MT involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$ist-Asserted #$LogicalTruthMt (#$genls #$Predicate ?WHAT))") });
        $sym38$FORT_P = makeSymbol("FORT-P");
        $REMOVAL_IST_ASSERTED_UNBOUND_LOOKUP_POS = makeKeyword("REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-POS");
        $list40 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist-Asserted")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("ist-Asserted")), makeKeyword("CLOSED-HLMT"), list(makeKeyword("OR"), cons(list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("ANYTHING")), list(makeConstSym(("not")), cons(list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("ANYTHING"))))),
                makeKeyword("REQUIRED"), makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("ist-Asserted")), list(makeKeyword("BIND"), makeSymbol("MT")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("MT")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("MT")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("ist-Asserted")), list(makeKeyword("VALUE"), makeSymbol("MT")), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("MAKE-IST-ASSERTED-JUSTIFICATION"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$ist-Asserted <mt> (<not fully-bound> ... <fort> ...))\nwhere <mt> is a chlmt-p\nusing only the KB GAF indexing and explicit assertions involving <fort>"), makeKeyword("EXAMPLE"), makeString("(#$ist-Asserted #$LogicalTruthMt (?PRED #$Predicate ?WHAT))") });
        $MT = makeKeyword("MT");
        $BROAD_MT = makeKeyword("BROAD-MT");
        $str43$do_broad_mt_index = makeString("do-broad-mt-index");
        $sym44$STRINGP = makeSymbol("STRINGP");
        $SKIP = makeKeyword("SKIP");
        $REMOVAL_IST_ASSERTED_MT_CONTENTS = makeKeyword("REMOVAL-IST-ASSERTED-MT-CONTENTS");
        $list47 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist-Asserted")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("ist-Asserted")), makeKeyword("CLOSED-HLMT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"),
                makeSymbol("REMOVAL-IST-ASSERTED-MT-CONTENTS-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-IST-ASSERTED-MT-CONTENTS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("ist-Asserted")), list(makeKeyword("BIND"), makeSymbol("MT")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("MT")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-IST-ASSERTED-MT-CONTENTS-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("MT")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("ist-Asserted")), list(makeKeyword("VALUE"), makeSymbol("MT")), list(makeKeyword("CALL"), makeSymbol("GAF-EL-FORMULA"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("MAKE-IST-ASSERTED-JUSTIFICATION"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$ist-Asserted <fort> <variable>)\nusing only the KB MT indexing and explicit GAF assertions in ARG1 MT"),
                makeKeyword("EXAMPLE"), makeString("(#$ist-Asserted #$ChristmasMythologyMt ?FORMULA)") });
        $MINIMIZE = makeKeyword("MINIMIZE");
        $REMOVAL_IST_ASSERTED_GAF_LOOKUP_NEG = makeKeyword("REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG");
        $list50 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("ist-Asserted")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("ist-Asserted")), makeKeyword("FORT"), list(makeKeyword("OR"), cons(list(makeKeyword("TEST"), makeSymbol("REMOVAL-IST-ASSERTED-PRED-FORT")), makeKeyword("FULLY-BOUND")), list(makeConstSym(("not")), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"))))),
                makeKeyword("COST"), makeSymbol("REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$ist-Asserted <fort> (<predicate> . <fully-bound>)))\nusing only the KB GAF indexing and explicit assertions in ARG1 MT involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$ist-Asserted #$LogicalTruthMt (#$genls #$Predicate #$Thing)))") });
        $REMOVAL_IST_ASSERTED_UNBOUND_MT_GAF_LOOKUP_POS = makeKeyword("REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-POS");
        $list52 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist-Asserted")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("ist-Asserted")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("OR"), cons(list(makeKeyword("TEST"), makeSymbol("REMOVAL-IST-ASSERTED-PRED-FORT")), makeKeyword("ANYTHING")), list(makeConstSym(("not")), cons(makeKeyword("FORT"), makeKeyword("ANYTHING"))))),
                makeKeyword("REQUIRED"), makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("ist-Asserted")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-MT"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))),
                        list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("CALL"), makeSymbol("ATOMIC-SENTENCE-ARG2"), list(makeKeyword("VALUE"), makeSymbol("ASENT"))))),
                makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("MAKE-IST-ASSERTED-JUSTIFICATION"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$ist-Asserted <not fully-bound> (<predicate> . <anything>))\nusing only the KB GAF indexing and explicit assertions in ARG1 MT involving <predicate>"), makeKeyword("EXAMPLE"),
                makeString("(#$ist-Asserted ?MT (#$genls #$Dog #$CanineAnimal))\n    (#$ist-Asserted ?MT (#$genls #$Dog ?WHAT))") });
        $REMOVAL_IST_ASSERTED_UNBOUND_MT_UNBOUND_PRED_LOOKUP_POS = makeKeyword("REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS");
        $list54 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("ist-Asserted")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("ist-Asserted")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("OR"), cons(makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeConstSym(("not")), cons(makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"))))), makeKeyword("REQUIRED"),
                makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("ist-Asserted")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-MT"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))),
                        list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("CALL"), makeSymbol("ATOMIC-SENTENCE-ARG2"), list(makeKeyword("VALUE"), makeSymbol("ASENT"))))),
                makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("MAKE-IST-ASSERTED-JUSTIFICATION"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$ist-Asserted <not fully-bound> (<not fully-bound> ... <fort> ...))\nusing only the KB GAF indexing and explicit assertions in ARG1 MT with <fort> in its arg position."), makeKeyword("EXAMPLE"), makeString("(#$ist-Asserted ?MT (?PRED #$Madonna ?WHAT))") });
    }
}
/*
 *
 * Total time: 1885 ms
 *
 */