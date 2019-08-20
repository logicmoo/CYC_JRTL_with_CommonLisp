package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_subset_of extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "d858e5df7b3a48113aa127e4351ba14762b1a95c30ec588b671b6258bc4c40d6";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 4000L)
    private static SubLSymbol $removal_subsetof_theset_theset_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 7100L)
    private static SubLSymbol $removal_subsetof_theset_thesetof_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 10000L)
    private static SubLSymbol $default_subsetof_thesetof_hypothesize_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 11400L)
    private static SubLSymbol $default_genls_thecollectionof_hypothesize_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 15300L)
    private static SubLSymbol $default_subsetof_thesetof_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 16300L)
    private static SubLSymbol $default_genls_thecollectionof_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 20100L)
    private static SubLSymbol $default_subsetof_unbound_theset_max_cardinality$;
    private static SubLSymbol $TRUE_DEF;
    private static SubLSymbol $SUBSETOF;
    private static SubLObject $$subsetOf;
    private static SubLSymbol $BOTH;
    private static SubLSymbol $TRUE_MON;
    private static SubLSymbol $REMOVAL_SUBSETOF_THESET_THESET_POS;
    private static SubLList $list6;
    private static SubLSymbol $REMOVAL_SUBSETOF_THESET_THESET_NEG;
    private static SubLList $list8;
    private static SubLSymbol $REMOVAL_SUBSETOF_THESET_THESETOF_POS;
    private static SubLList $list10;
    private static SubLSymbol $REMOVAL_SUBSETOF_THESET_THESETOF_NEG;
    private static SubLList $list12;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $REMOVAL_SUBSETOF_THESETOF_FORT_POS;
    private static SubLList $list16;
    private static SubLSymbol $REMOVAL_SUBSETOF_THESETOF_FORT_NEG;
    private static SubLList $list18;
    private static SubLSymbol $REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS;
    private static SubLList $list20;
    private static SubLSymbol $REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG;
    private static SubLList $list22;
    private static SubLSymbol $REMOVAL_SUBSETOF_THESETOF_THESETOF_POS;
    private static SubLList $list24;
    private static SubLSymbol $REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG;
    private static SubLList $list26;
    private static SubLSymbol $REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS;
    private static SubLList $list28;
    private static SubLSymbol $REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG;
    private static SubLList $list30;
    private static SubLObject $$TheSet;
    private static SubLObject $$UniversalVocabularyMt;
    private static SubLSymbol $REMOVAL_SUBSETOF_VARIABLE_THESET_POS;
    private static SubLList $list34;
    private static SubLSymbol $sym35$VARIABLE_P;
    private static SubLObject $$rewriteOf;
    private static SubLSymbol $CODE;
    private static SubLSymbol $REMOVAL_SUBSETOF_NOT_FULLY_BOUND_THESET_POS;
    private static SubLList $list39;
    private static SubLList $list40;
    private static SubLObject $$BaseKB;
    private static SubLSymbol $REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION;
    private static SubLList $list43;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 1500L)
    public static SubLObject make_subsetof_hl_support(SubLObject formula, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        return arguments.make_hl_support($SUBSETOF, formula, mt, tv);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 1800L)
    public static SubLObject removal_subsetof_theset_theset_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject superset = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject subset_elements = cycl_utilities.nat_args(subset, UNPROVIDED);
        SubLObject superset_elements = cycl_utilities.nat_args(superset, UNPROVIDED);
        if (NIL != conses_high.subsetp(subset_elements, superset_elements, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
            backward.removal_add_node(make_subsetof_hl_support(asent, mt_vars.$subset_of_defining_mt$.getGlobalValue(), $TRUE_MON), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 2600L)
    public static SubLObject removal_subsetof_theset_theset_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject superset = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject subset_elements = cycl_utilities.nat_args(subset, UNPROVIDED);
        SubLObject superset_elements = cycl_utilities.nat_args(superset, UNPROVIDED);
        if (NIL == conses_high.subsetp(subset_elements, superset_elements, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
            backward.removal_add_node(make_subsetof_hl_support(cycl_utilities.negate(asent), mt_vars.$subset_of_defining_mt$.getGlobalValue(), $TRUE_MON), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 4200L)
    public static SubLObject removal_subsetof_theset_thesetof_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1_set = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject arg1_elements = cdolist_list_var = cycl_utilities.nat_args(arg1_set, UNPROVIDED);
        SubLObject arg1_element = NIL;
        arg1_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject result = removal_modules_isa.inference_elementof_thesetof_check(arg1_element, arg2_set_of, UNPROVIDED);
            SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == result && NIL != validP) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg1_element = cdolist_list_var.first();
        }
        backward.removal_add_node(make_subsetof_hl_support(asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 5200L)
    public static SubLObject removal_subsetof_theset_thesetof_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1_set = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject arg1_elements = cdolist_list_var = cycl_utilities.nat_args(arg1_set, UNPROVIDED);
        SubLObject arg1_element = NIL;
        arg1_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject result = removal_modules_isa.inference_elementof_thesetof_check(arg1_element, arg2_set_of, UNPROVIDED);
            SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == result && NIL != validP) {
                backward.removal_add_node(make_subsetof_hl_support(cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg1_element = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 7200L)
    public static SubLObject removal_subsetof_thesetof_fort_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_fort_expand(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 8700L)
    public static SubLObject removal_subsetof_thesetof_fort_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_fort_expand(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 10100L)
    public static SubLObject removal_subsetof_thesetof_fort_expand(SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject the_set_of = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject set_formula = cycl_utilities.nat_arg2(the_set_of, UNPROVIDED);
        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject hypothetical_mt = inference_hypothesize_element(set_formula, UNPROVIDED);
        SubLObject hypothetical_element = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject subset = makeBoolean(NIL != hypothetical_mt && NIL != hypothetical_element && NIL != isa.isaP(hypothetical_element, collection, hypothetical_mt, UNPROVIDED));
        if (NIL != ((NIL != subset) ? Equality.eq($POS, sense) : Equality.eq($NEG, sense))) {
            SubLObject support_formula = asent;
            if ($NEG == sense) {
                support_formula = cycl_utilities.negate(support_formula);
            }
            backward.removal_add_node(make_subsetof_hl_support(support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 10800L)
    public static SubLObject inference_hypothesize_element(SubLObject set_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothetical_mt = NIL;
        SubLObject hypothetical_element = NIL;
        SubLObject _prev_bind_0 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
        try {
            at_vars.$at_apply_necessary_defnsP$.bind(NIL, thread);
            thread.resetMultipleValues();
            SubLObject hyp_mt = prove.prepare_hypothesis_mt(set_formula, mt, ZERO_INTEGER);
            SubLObject term_bindings = thread.secondMultipleValue();
            SubLObject failure_reasons = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL == failure_reasons) {
                SubLObject binding = term_bindings.first();
                SubLObject hyp_element = bindings.variable_binding_value(binding);
                if (NIL != forts.fort_p(hyp_element)) {
                    hypothetical_mt = hyp_mt;
                    hypothetical_element = hyp_element;
                }
            }
        } finally {
            at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != hypothetical_element) {
            return Values.values(hypothetical_mt, hypothetical_element);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 11600L)
    public static SubLObject removal_genls_thecollectionof_fort_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_fort_expand(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 11800L)
    public static SubLObject removal_genls_thecollectionof_fort_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_fort_expand(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 13200L)
    public static SubLObject removal_subsetof_thesetof_thesetof_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_thesetof_expand(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 13700L)
    public static SubLObject removal_subsetof_thesetof_thesetof_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_thesetof_expand(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 15400L)
    public static SubLObject removal_subsetof_thesetof_thesetof_expand(SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject the_set_of_sub = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject set_formula_sub = cycl_utilities.nat_arg2(the_set_of_sub, UNPROVIDED);
        SubLObject the_set_of_super = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject hypothetical_mt = inference_hypothesize_element(set_formula_sub, UNPROVIDED);
        SubLObject hypothetical_element = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != hypothetical_mt && NIL != hypothetical_element) {
            thread.resetMultipleValues();
            SubLObject subset = removal_modules_isa.inference_elementof_thesetof_check(hypothetical_element, the_set_of_super, hypothetical_mt);
            SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != validP && NIL != ((NIL != subset) ? Equality.eq($POS, sense) : Equality.eq($NEG, sense))) {
                SubLObject support_formula = asent;
                if ($NEG == sense) {
                    support_formula = cycl_utilities.negate(support_formula);
                }
                backward.removal_add_node(arguments.make_hl_support($SUBSETOF, support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 16400L)
    public static SubLObject removal_genls_thecollectionof_thecollectionof_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_thesetof_expand(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 16600L)
    public static SubLObject removal_genls_thecollectionof_thecollectionof_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_thesetof_expand(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 18500L)
    public static SubLObject removal_subsetof_variable_theset_cost(SubLObject asent) {
        return Numbers.expt(TWO_INTEGER, Sequences.length(cycl_utilities.nat_args(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 18900L)
    public static SubLObject removal_subsetof_variable_theset_expand(SubLObject asent, SubLObject sense) {
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject superset = cycl_utilities.nat_args(arg2, UNPROVIDED);
        SubLObject cdolist_list_var = list_utilities.powerset(superset);
        SubLObject subset = NIL;
        subset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject v_bindings = unification_utilities.term_unify(arg1, reader.bq_cons($$TheSet, append(subset, NIL)), UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                SubLObject unify_arg1 = bindings.subst_bindings(v_bindings, arg1);
                SubLObject formula = list($$subsetOf, unify_arg1, arg2);
                backward.removal_add_node(arguments.make_hl_support($SUBSETOF, formula, $$UniversalVocabularyMt, $TRUE_MON), v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subset = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 20200L)
    public static SubLObject small_extensional_set_wrt_powersetP(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_utilities.el_extensional_set_p(v_object)) {
            return Numbers.numLE(Sequences.length(el_utilities.extensional_set_elements(v_object)), $default_subsetof_unbound_theset_max_cardinality$.getDynamicValue(thread));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 20500L)
    public static SubLObject all_extensional_set_elements_unboundP(SubLObject v_object) {
        if (NIL != el_utilities.el_extensional_set_p(v_object)) {
            return list_utilities.every_in_list(Symbols.symbol_function($sym35$VARIABLE_P), el_utilities.extensional_set_elements(v_object), UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 20700L)
    public static SubLObject removal_subsetof_not_fully_bound_theset_expand(SubLObject asent, SubLObject sense) {
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject superset = cycl_utilities.nat_args(arg2, UNPROVIDED);
        SubLObject cdolist_list_var = list_utilities.powerset(superset);
        SubLObject subset = NIL;
        subset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = list_utilities.permute_list(subset, UNPROVIDED);
            SubLObject perm = NIL;
            perm = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                SubLObject candidate = reader.bq_cons($$TheSet, append(perm, NIL));
                SubLObject v_bindings = unification_utilities.term_unify(arg1, candidate, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    SubLObject unify_arg1 = bindings.subst_bindings(v_bindings, arg1);
                    SubLObject formula = list($$subsetOf, unify_arg1, arg2);
                    SubLObject canonical_candidate = el_utilities.canonicalize_extensional_set(candidate);
                    SubLObject rewrite_formula = list($$rewriteOf, canonical_candidate, candidate);
                    SubLObject additional_supports = (NIL != el_utilities.canonical_extensional_set_p(candidate)) ? NIL : list(arguments.make_hl_support($CODE, rewrite_formula, $$UniversalVocabularyMt, $TRUE_MON));
                    backward.removal_add_node(arguments.make_hl_support($SUBSETOF, formula, $$UniversalVocabularyMt, $TRUE_MON), v_bindings, additional_supports);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                perm = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            subset = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 22600L)
    public static SubLObject make_empty_set_support() {
        return arguments.make_hl_support($CODE, $list40, $$BaseKB, $TRUE_MON);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 24600L)
    public static SubLObject removal_subsetof_theemptyset_set_or_collection_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        backward.removal_add_node(make_subsetof_hl_support(asent, UNPROVIDED, UNPROVIDED), NIL, list(make_empty_set_support()));
        return NIL;
    }

    public static SubLObject declare_removal_modules_subset_of_file() {
        declareFunction("make_subsetof_hl_support", "MAKE-SUBSETOF-HL-SUPPORT", 1, 2, false);
        declareFunction("removal_subsetof_theset_theset_pos_expand", "REMOVAL-SUBSETOF-THESET-THESET-POS-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_theset_theset_neg_expand", "REMOVAL-SUBSETOF-THESET-THESET-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_theset_thesetof_pos_expand", "REMOVAL-SUBSETOF-THESET-THESETOF-POS-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_theset_thesetof_neg_expand", "REMOVAL-SUBSETOF-THESET-THESETOF-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_thesetof_fort_pos_expand", "REMOVAL-SUBSETOF-THESETOF-FORT-POS-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_thesetof_fort_neg_expand", "REMOVAL-SUBSETOF-THESETOF-FORT-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_thesetof_fort_expand", "REMOVAL-SUBSETOF-THESETOF-FORT-EXPAND", 2, 0, false);
        declareFunction("inference_hypothesize_element", "INFERENCE-HYPOTHESIZE-ELEMENT", 1, 1, false);
        declareFunction("removal_genls_thecollectionof_fort_pos_expand", "REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS-EXPAND", 1, 1, false);
        declareFunction("removal_genls_thecollectionof_fort_neg_expand", "REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_thesetof_thesetof_pos_expand", "REMOVAL-SUBSETOF-THESETOF-THESETOF-POS-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_thesetof_thesetof_neg_expand", "REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_thesetof_thesetof_expand", "REMOVAL-SUBSETOF-THESETOF-THESETOF-EXPAND", 2, 0, false);
        declareFunction("removal_genls_thecollectionof_thecollectionof_pos_expand", "REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS-EXPAND", 1, 1, false);
        declareFunction("removal_genls_thecollectionof_thecollectionof_neg_expand", "REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_variable_theset_cost", "REMOVAL-SUBSETOF-VARIABLE-THESET-COST", 1, 0, false);
        declareFunction("removal_subsetof_variable_theset_expand", "REMOVAL-SUBSETOF-VARIABLE-THESET-EXPAND", 2, 0, false);
        declareFunction("small_extensional_set_wrt_powersetP", "SMALL-EXTENSIONAL-SET-WRT-POWERSET?", 1, 0, false);
        declareFunction("all_extensional_set_elements_unboundP", "ALL-EXTENSIONAL-SET-ELEMENTS-UNBOUND?", 1, 0, false);
        declareFunction("removal_subsetof_not_fully_bound_theset_expand", "REMOVAL-SUBSETOF-NOT-FULLY-BOUND-THESET-EXPAND", 2, 0, false);
        declareFunction("make_empty_set_support", "MAKE-EMPTY-SET-SUPPORT", 0, 0, false);
        declareFunction("removal_subsetof_theemptyset_set_or_collection_expand", "REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_subset_of_file() {
        $removal_subsetof_theset_theset_cost$ = defparameter("*REMOVAL-SUBSETOF-THESET-THESET-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $removal_subsetof_theset_thesetof_cost$ = defparameter("*REMOVAL-SUBSETOF-THESET-THESETOF-COST*", TWO_INTEGER);
        $default_subsetof_thesetof_hypothesize_cost$ = SubLFiles.defparameter("*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*", TWO_INTEGER);
        $default_genls_thecollectionof_hypothesize_cost$ = defparameter("*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*", $default_subsetof_thesetof_hypothesize_cost$.getDynamicValue());
        $default_subsetof_thesetof_check_cost$ = defparameter("*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*", TWO_INTEGER);
        $default_genls_thecollectionof_check_cost$ = defparameter("*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*", $default_subsetof_thesetof_check_cost$.getDynamicValue());
        $default_subsetof_unbound_theset_max_cardinality$ = SubLFiles.defparameter("*DEFAULT-SUBSETOF-UNBOUND-THESET-MAX-CARDINALITY*", TEN_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_subset_of_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$subsetOf);
        preference_modules.doomed_unless_all_args_bindable($BOTH, $$subsetOf);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESET_POS, $list6);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESET_NEG, $list8);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESETOF_POS, $list10);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESETOF_NEG, $list12);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_FORT_POS, $list16);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_FORT_NEG, $list18);
        inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS, $list20);
        inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG, $list22);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_THESETOF_POS, $list24);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG, $list26);
        inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS, $list28);
        inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG, $list30);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_VARIABLE_THESET_POS, $list34);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_NOT_FULLY_BOUND_THESET_POS, $list39);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION, $list43);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_subset_of_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_subset_of_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_subset_of_file();
    }

    static {
        me = new removal_modules_subset_of();
        $removal_subsetof_theset_theset_cost$ = null;
        $removal_subsetof_theset_thesetof_cost$ = null;
        $default_subsetof_thesetof_hypothesize_cost$ = null;
        $default_genls_thecollectionof_hypothesize_cost$ = null;
        $default_subsetof_thesetof_check_cost$ = null;
        $default_genls_thecollectionof_check_cost$ = null;
        $default_subsetof_unbound_theset_max_cardinality$ = null;
        $TRUE_DEF = makeKeyword("TRUE-DEF");
        $SUBSETOF = makeKeyword("SUBSETOF");
        $$subsetOf = makeConstSym(("subsetOf"));
        $BOTH = makeKeyword("BOTH");
        $TRUE_MON = makeKeyword("TRUE-MON");
        $REMOVAL_SUBSETOF_THESET_THESET_POS = makeKeyword("REMOVAL-SUBSETOF-THESET-THESET-POS");
        $list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("subsetOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("subsetOf")), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-SUBSETOF-THESET-THESET-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESET-THESET-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf (#$TheSet . <fully-bound>)(#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"),
                makeString("(#$subsetOf (#$TheSet 1 2)(#$TheSet 1 2 3))") });
        $REMOVAL_SUBSETOF_THESET_THESET_NEG = makeKeyword("REMOVAL-SUBSETOF-THESET-THESET-NEG");
        $list8 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("subsetOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("subsetOf")), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-SUBSETOF-THESET-THESET-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESET-THESET-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$subsetOf (#$TheSet . <fully-bound>)(#$TheSet . <fully-bound>)))"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$subsetOf (#$TheSet 1 2 3)(#$TheSet 1 2)))") });
        $REMOVAL_SUBSETOF_THESET_THESETOF_POS = makeKeyword("REMOVAL-SUBSETOF-THESET-THESETOF-POS");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("subsetOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("subsetOf")), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-SUBSETOF-THESET-THESETOF-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESET-THESETOF-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf\n  (#$TheSet . <fully-bound>)\n  (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"),
                makeString("(#$subsetOf\n  (#$TheSet #$France #$Austria)\n  (#$TheSetOf ?COUNTRY\n    (#$bordersOn #$Germany ?COUNTRY)))") });
        $REMOVAL_SUBSETOF_THESET_THESETOF_NEG = makeKeyword("REMOVAL-SUBSETOF-THESET-THESETOF-NEG");
        $list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("subsetOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("subsetOf")), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-SUBSETOF-THESET-THESETOF-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESET-THESETOF-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not \n (#$subsetOf\n  (#$TheSet . <fully-bound>)\n  (#$TheSetOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"),
                makeString("(#$not\n (#$subsetOf\n  (#$TheSet #$France #$Canada)\n  (#$TheSetOf ?COUNTRY\n    (#$bordersOn #$Germany ?COUNTRY))))") });
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $REMOVAL_SUBSETOF_THESETOF_FORT_POS = makeKeyword("REMOVAL-SUBSETOF-THESETOF-FORT-POS");
        $list16 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("subsetOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("subsetOf")), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND")), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESETOF-FORT-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$subsetOf (#$TheSetOf <variable> <fully-bound>) <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf \n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  #$Mammal)") });
        $REMOVAL_SUBSETOF_THESETOF_FORT_NEG = makeKeyword("REMOVAL-SUBSETOF-THESETOF-FORT-NEG");
        $list18 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("subsetOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("subsetOf")), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND")), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESETOF-FORT-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not\n  (#$subsetOf (#$TheSetOf <variable> <fully-bound>) <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$subsetOf \n    (#$TheSetOf ?MAMMAL \n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    #$Dog))") });
        $REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS = makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS");
        $list20 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("genls")), list(makeKeyword("NAT"), cons(makeConstSym(("TheCollectionOf")), makeKeyword("FULLY-BOUND"))), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (#$TheCollectionOf <variable> <fully-bound>) <fort>)"), makeKeyword("EXAMPLE"),
                makeString("(#$genls \n  (#$TheCollectionOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  #$Mammal)") });
        $REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG = makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG");
        $list22 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("genls")), list(makeKeyword("NAT"), cons(makeConstSym(("TheCollectionOf")), makeKeyword("FULLY-BOUND"))), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not\n  (#$genls (#$TheCollectionOf <variable> <fully-bound>) <fort>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not\n  (#$genls \n    (#$TheCollectionOf ?MAMMAL \n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    #$Dog))") });
        $REMOVAL_SUBSETOF_THESETOF_THESETOF_POS = makeKeyword("REMOVAL-SUBSETOF-THESETOF-THESETOF-POS");
        $list24 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("subsetOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("subsetOf")), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND")), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESETOF-THESETOF-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf \n  (#$TheSetOf <variable> <fully-bound>) \n  (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"),
                makeString("(#$subsetOf \n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$TheSetOf ?MAMMAL\n    (#$and \n      (#$isa ?MAMMAL #$Mammal)\n      (#$colorOfObject ?MAMMAL #$RedColor))))") });
        $REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG = makeKeyword("REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG");
        $list26 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("subsetOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("subsetOf")), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND")), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not \n  (#$subsetOf \n    (#$TheSetOf <variable> <fully-bound>) \n    (#$TheSetOf <variable> <fully-bound>)))"),
                makeKeyword("EXAMPLE"),
                makeString("(#$not\n  (#$subsetOf \n    (#$TheSetOf ?MAMMAL\n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    (#$TheSetOf ?DOG \n      (#$and \n        (#$isa ?DOG #$Dog)\n        (#$colorOfObject ?DOG #$RedColor)))))") });
        $REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS = makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS");
        $list28 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("genls")), list(makeKeyword("NAT"), cons(makeConstSym(("TheCollectionOf")), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(makeConstSym(("TheCollectionOf")), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"),
                makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls \n  (#$TheCollectionOf <variable> <fully-bound>) \n  (#$TheCollectionOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"),
                makeString("(#$genls \n  (#$TheCollectionOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$TheCollectionOf ?MAMMAL\n    (#$and \n      (#$isa ?MAMMAL #$Mammal)\n      (#$colorOfObject ?MAMMAL #$RedColor))))") });
        $REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG = makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG");
        $list30 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("genls")), list(makeKeyword("NAT"), cons(makeConstSym(("TheCollectionOf")), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(makeConstSym(("TheCollectionOf")), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"),
                makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not \n  (#$genls \n    (#$TheCollectionOf <variable> <fully-bound>) \n    (#$TheCollectionOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString(
                        "(#$not\n  (#$genls \n    (#$TheCollectionOf ?MAMMAL\n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    (#$TheCollectionOf ?DOG \n      (#$and \n        (#$isa ?DOG #$Dog)\n        (#$colorOfObject ?DOG #$RedColor)))))") });
        $$TheSet = makeConstSym(("TheSet"));
        $$UniversalVocabularyMt = makeConstSym(("UniversalVocabularyMt"));
        $REMOVAL_SUBSETOF_VARIABLE_THESET_POS = makeKeyword("REMOVAL-SUBSETOF-VARIABLE-THESET-POS");
        $list34 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("subsetOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("subsetOf")), list(makeKeyword("OR"), makeKeyword("VARIABLE"), list(makeKeyword("AND"), cons(makeConstSym(("TheSet")), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("TEST"), makeSymbol("ALL-EXTENSIONAL-SET-ELEMENTS-UNBOUND?")))),
                        list(makeKeyword("AND"), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), list(makeKeyword("TEST"), makeSymbol("SMALL-EXTENSIONAL-SET-WRT-POWERSET?")))),
                makeKeyword("COST"), makeSymbol("REMOVAL-SUBSETOF-VARIABLE-THESET-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-VARIABLE-THESET-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$subsetOf (<variable> or (#$TheSet . <all-unbound>) (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf ?SUBSET (#$TheSet 1 2 3))") });
        $sym35$VARIABLE_P = makeSymbol("VARIABLE-P");
        $$rewriteOf = makeConstSym(("rewriteOf"));
        $CODE = makeKeyword("CODE");
        $REMOVAL_SUBSETOF_NOT_FULLY_BOUND_THESET_POS = makeKeyword("REMOVAL-SUBSETOF-NOT-FULLY-BOUND-THESET-POS");
        $list39 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("subsetOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("subsetOf")),
                        list(makeKeyword("AND"), list(makeKeyword("NOT"), makeKeyword("VARIABLE")), list(makeKeyword("AND"), cons(makeConstSym(("TheSet")), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("ALL-EXTENSIONAL-SET-ELEMENTS-UNBOUND?"))))),
                        list(makeKeyword("AND"), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), list(makeKeyword("TEST"), makeSymbol("SMALL-EXTENSIONAL-SET-WRT-POWERSET?")))),
                makeKeyword("COST"), makeSymbol("REMOVAL-SUBSETOF-VARIABLE-THESET-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-NOT-FULLY-BOUND-THESET-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$subsetOf (#$TheSet . <not-fully-bound>) (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf (#$TheSet 1 ?X 3) (#$TheSet 1 2 3 4))") });
        $list40 = list(makeConstSym(("subsetOf")), makeConstSym(("TheEmptySet")), makeSymbol("?SET"));
        $$BaseKB = makeConstSym(("BaseKB"));
        $REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION = makeKeyword("REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION");
        $list43 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("subsetOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("subsetOf")), makeConstSym(("TheEmptySet")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SET-OR-COLLECTION?")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf #$TheEmptySet <fully-bound>)\n    where <fully-bound> arg2 is also a #$Set-Mathematical or a #$Collection"), makeKeyword("EXAMPLE"),
                makeString(" (#$subsetOf #$TheEmptySet #$TheEmptySet)\n\n  (#$subsetOf \n  #$TheEmptySet\n  (#$TheSet #$isa #$Thing #$Collection))\n\n  (#$subsetOf \n  #$TheEmptySet\n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor))))\n") });
    }
}
/*
 *
 * Total time: 245 ms
 *
 */