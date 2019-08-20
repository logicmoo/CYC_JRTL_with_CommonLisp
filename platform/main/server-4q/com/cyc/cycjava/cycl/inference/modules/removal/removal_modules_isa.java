package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_grammar;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_iterators;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_isa extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "72637670105c1fe957953398107292be7a90b882811e59f2fbf7ac38804173dd";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 3700L)
    private static SubLSymbol $isa_fort_collection_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 4000L)
    private static SubLSymbol $isa_non_fort_collection_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 6000L)
    private static SubLSymbol $default_not_isa_collection_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 8500L)
    private static SubLSymbol $isa_fort_defn_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 8800L)
    private static SubLSymbol $isa_non_fort_defn_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 13600L)
    private static SubLSymbol $all_instances_lazy_iteration_threshold$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 43300L)
    private static SubLSymbol $subcollection_functors$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 59000L)
    private static SubLSymbol $quoted_isa_fort_collection_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 59300L)
    private static SubLSymbol $quoted_isa_non_fort_collection_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 61300L)
    private static SubLSymbol $default_not_quoted_isa_collection_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 62100L)
    private static SubLSymbol $quoted_isa_fort_defn_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 62400L)
    private static SubLSymbol $quoted_isa_non_fort_defn_cost$;
    private static SubLObject $$isa;
    private static SubLSymbol $META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
    private static SubLSymbol $META_REMOVAL_COMPLETELY_DECIDABLE_POS;
    private static SubLSymbol $REMOVAL_COMPLETELY_DECIDABLE_NEG;
    private static SubLSymbol $REMOVAL_ABDUCTION_POS_CHECK;
    private static SubLSymbol $REMOVAL_ABDUCTION_POS_UNIFY;
    private static SubLSymbol $REMOVAL_RELATION_ALL_EXISTS_CHECK;
    private static SubLSymbol $REMOVAL_RELATION_ALL_EXISTS_UNIFY;
    private static SubLSymbol $REMOVAL_RELATION_EXISTS_ALL_CHECK;
    private static SubLSymbol $REMOVAL_BACKCHAIN_REQUIRED_PRUNE;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $ALL_INSTANCES_POS;
    private static SubLList $list13;
    private static SubLSymbol $PREFERRED;
    private static SubLSymbol $DISPREFERRED;
    private static SubLSymbol $DISALLOWED;
    private static SubLSymbol $GROSSLY_DISPREFERRED;
    private static SubLSymbol $ALL_ISA_POS;
    private static SubLList $list19;
    private static SubLSymbol $ALL_ELEMENTOF_POS;
    private static SubLList $list21;
    private static SubLFloat $float$0_1;
    private static SubLSymbol $REMOVAL_ISA_COLLECTION_CHECK_POS;
    private static SubLList $list24;
    private static SubLSymbol $REMOVAL_ISA_COLLECTION_CHECK_NEG;
    private static SubLList $list26;
    private static SubLInteger $int$30;
    private static SubLSymbol $ISA;
    private static SubLList $list29;
    private static SubLSymbol $MINIMIZE;
    private static SubLSymbol $REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS;
    private static SubLList $list32;
    private static SubLSymbol $REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS;
    private static SubLList $list34;
    private static SubLSymbol $TRUE;
    private static SubLSymbol $GAF_ARG;
    private static SubLSymbol $GAF;
    private static SubLSymbol $PREDICATE_EXTENT;
    private static SubLSymbol $OVERLAP;
    private static SubLSymbol $REMOVAL_ISA_DEFN_POS;
    private static SubLList $list41;
    private static SubLSymbol $REMOVAL_ISA_DEFN_NEG;
    private static SubLList $list43;
    private static SubLSymbol $DEFN;
    private static SubLSymbol $REMOVAL_ALL_ISA;
    private static SubLList $list46;
    private static SubLSymbol $sym47$GENERALITY_ESTIMATE_;
    private static SubLSymbol $sym48$REMOVAL_ALL_ISA_EXPAND;
    private static SubLSymbol $GROSSLY_INCOMPLETE;
    private static SubLSymbol $COMPLETE;
    private static SubLInteger $int$2300;
    private static SubLSymbol $REMOVAL_ALL_INSTANCES;
    private static SubLList $list53;
    private static SubLObject $$elementOf;
    private static SubLList $list55;
    private static SubLSymbol $ELEMENTOF;
    private static SubLSymbol $TRUE_MON;
    private static SubLSymbol $REMOVAL_ELEMENTOF_CHECK;
    private static SubLList $list59;
    private static SubLSymbol $REMOVAL_NOT_ELEMENTOF_CHECK;
    private static SubLList $list61;
    private static SubLSymbol $REMOVAL_ELEMENTOF_COLLECTION_CHECK;
    private static SubLList $list63;
    private static SubLSymbol $REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK;
    private static SubLList $list65;
    private static SubLSymbol $REMOVAL_ELEMENTOF_SET_CHECK;
    private static SubLList $list67;
    private static SubLSymbol $REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK;
    private static SubLList $list69;
    private static SubLSymbol $REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK;
    private static SubLList $list71;
    private static SubLSymbol $REMOVAL_NOT_ELEMENTOF_SET_CHECK;
    private static SubLList $list73;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $REMOVAL_ELEMENTOF_THESETOF_CHECK;
    private static SubLList $list76;
    private static SubLSymbol $REMOVAL_ISA_THECOLLECTIONOF_CHECK;
    private static SubLList $list78;
    private static SubLSymbol $QUERY;
    private static SubLSymbol $REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK;
    private static SubLList $list81;
    private static SubLSymbol $REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK;
    private static SubLList $list83;
    private static SubLSymbol $REMOVAL_ALL_ELEMENTOF;
    private static SubLList $list85;
    private static SubLSymbol $REMOVAL_NAT_ALL_ELEMENTOF;
    private static SubLList $list87;
    private static SubLList $list88;
    private static SubLList $list89;
    private static SubLSymbol $REMOVAL_ELEMENTOF_UNIFY;
    private static SubLList $list91;
    private static SubLSymbol $REMOVAL_ELEMENTOF_COLLECTION_UNIFY;
    private static SubLList $list93;
    private static SubLSymbol $REMOVAL_ELEMENTOF_SET_UNIFY;
    private static SubLList $list95;
    private static SubLSymbol $sym96$EL_LITERAL_P;
    private static SubLSymbol $HL;
    private static SubLSymbol $REMOVAL_ELEMENTOF_THESETOF_UNIFY;
    private static SubLList $list99;
    private static SubLSymbol $REMOVAL_ISA_THECOLLECTIONOF_UNIFY;
    private static SubLList $list101;
    private static SubLObject $$TheSetOf;
    private static SubLObject $$subcollectionFunctionDefiningRule;
    private static SubLString $str104$Expected__s_to_have_only_one_free;
    private static SubLString $str105$Expected_exactly_one_poslit_in__S;
    private static SubLString $str106$Expected_exactly_one___termOfUnit;
    private static SubLList $list107;
    private static SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY;
    private static SubLList $list109;
    private static SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK;
    private static SubLList $list111;
    private static SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY;
    private static SubLList $list113;
    private static SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK;
    private static SubLList $list115;
    private static SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY;
    private static SubLList $list117;
    private static SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK;
    private static SubLList $list119;
    private static SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY;
    private static SubLList $list121;
    private static SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK;
    private static SubLList $list123;
    private static SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY;
    private static SubLList $list125;
    private static SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK;
    private static SubLList $list127;
    private static SubLSymbol $REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY;
    private static SubLList $list129;
    private static SubLSymbol $REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK;
    private static SubLList $list131;
    private static SubLSymbol $REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY;
    private static SubLList $list133;
    private static SubLSymbol $REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK;
    private static SubLList $list135;
    private static SubLSymbol $REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY;
    private static SubLList $list137;
    private static SubLSymbol $REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK;
    private static SubLList $list139;
    private static SubLSymbol $REMOVAL_ALL_ISA_OF_TYPE;
    private static SubLList $list141;
    private static SubLSymbol $sym142$BINARY_CLAUSE_P;
    private static SubLList $list143;
    private static SubLSymbol $sym144$FORT_P;
    private static SubLList $list145;
    private static SubLList $list146;
    private static SubLList $list147;
    private static SubLObject $$quotedIsa;
    private static SubLSymbol $ALL_QUOTED_INSTANCES_POS;
    private static SubLList $list150;
    private static SubLSymbol $ALL_QUOTED_ISA_POS;
    private static SubLList $list152;
    private static SubLSymbol $REMOVAL_QUOTED_ISA_COLLECTION_CHECK_POS;
    private static SubLList $list154;
    private static SubLSymbol $REMOVAL_QUOTED_ISA_COLLECTION_CHECK_NEG;
    private static SubLList $list156;
    private static SubLSymbol $REMOVAL_QUOTED_ISA_DEFN_POS;
    private static SubLList $list158;
    private static SubLSymbol $REMOVAL_QUOTED_ISA_DEFN_NEG;
    private static SubLList $list160;
    private static SubLSymbol $REMOVAL_NAT_QUOTED_ISA;
    private static SubLList $list162;
    private static SubLSymbol $REMOVAL_ALL_QUOTED_ISA;
    private static SubLList $list164;
    private static SubLSymbol $REMOVAL_NAT_ALL_QUOTED_ISA;
    private static SubLList $list166;
    private static SubLSymbol $REMOVAL_ALL_QUOTED_INSTANCES;
    private static SubLList $list168;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 2200L)
    public static SubLObject all_instances_pos_preference(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        SubLObject var = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject arg_bindableP = list_utilities.member_eqP(var, bindable_vars);
        if (NIL != cycl_grammar.cycl_nat_p(col) && NIL != subcollection_functor_p(cycl_utilities.nat_functor(col))) {
            return $PREFERRED;
        }
        if (NIL != fort_types_interface.collection_p(col)) {
            SubLObject completeness = inference_collection_iteration_completeness(col);
            SubLObject preference = preference_modules.completeness_to_preference_level(completeness);
            if (NIL != arg_bindableP && NIL != preference_modules.preference_level_LE(preference, $DISPREFERRED) && NIL != kb_accessors.check_preferred_collectionP(col, UNPROVIDED)) {
                preference = $DISALLOWED;
            }
            return preference;
        }
        return $GROSSLY_DISPREFERRED;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 3500L)
    public static SubLObject inference_all_isas_of_type(SubLObject ins, SubLObject type_col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != forts.fort_p(ins) && NIL != inference_trampolines.inference_collectionP(type_col, UNPROVIDED)) {
                result = isa.all_isas_wrt(ins, type_col, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 4200L)
    public static SubLObject removal_isa_collection_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $isa_fort_collection_cost$.getGlobalValue();
        }
        return $isa_non_fort_collection_cost$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 4400L)
    public static SubLObject removal_isa_collection_check_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_isa_collection_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 4500L)
    public static SubLObject removal_isa_collection_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_collection_check_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 4700L)
    public static SubLObject removal_isa_collection_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_isa_collection_check_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 5600L)
    public static SubLObject removal_isa_collection_check_expand(SubLObject asent) {
        SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (!function_terms.term_functional_complexity(v_object).numGE($int$30) && NIL != isa.isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($ISA, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 6100L)
    public static SubLObject removal_not_isa_collection_check_cost(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread)) {
            return removal_isa_collection_check_pos_cost(asent, UNPROVIDED);
        }
        return $default_not_isa_collection_check_cost$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 6300L)
    public static SubLObject removal_not_isa_collection_check_expand(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_object = NIL;
        SubLObject collection = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
        collection = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == isa.isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else if (NIL != isa.not_isa_by_sbhlP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($ISA, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list29);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 7300L)
    public static SubLObject removal_isa_naut_collection_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$hl_module_check_cost$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 7400L)
    public static SubLObject removal_isa_naut_collection_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_naut_collection_lookup_pos_expand(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 8100L)
    public static SubLObject removal_isa_naut_collection_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return control_vars.$hl_module_check_cost$.getDynamicValue(thread);
        }
        return kb_indexing.num_best_gaf_lookup_index(asent, $TRUE, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 8300L)
    public static SubLObject removal_isa_naut_collection_lookup_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, sense);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$1 = NIL;
                                    SubLObject token_var_$2 = NIL;
                                    while (NIL == done_var_$1) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                        SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                        if (NIL != valid_$3) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                        }
                                        done_var_$1 = makeBoolean(NIL == valid_$3);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$2 = NIL;
                                    SubLObject token_var_$3 = NIL;
                                    while (NIL == done_var_$2) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                        if (NIL != valid_$4) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                        }
                                        done_var_$2 = makeBoolean(NIL == valid_$4);
                                    }
                                } finally {
                                    SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values2 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                SubLObject done_var_$3 = NIL;
                                SubLObject token_var_$4 = NIL;
                                while (NIL == done_var_$3) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                    if (NIL != valid_$5) {
                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                    }
                                    done_var_$3 = makeBoolean(NIL == valid_$5);
                                }
                            } finally {
                                SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values3 = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                SubLObject done_var_$4 = NIL;
                                SubLObject token_var_$5 = NIL;
                                while (NIL == done_var_$4) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                    if (NIL != valid_$6) {
                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                    }
                                    done_var_$4 = makeBoolean(NIL == valid_$6);
                                }
                            } finally {
                                SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values4 = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
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
                SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
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
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                SubLObject done_var_$5 = NIL;
                                SubLObject token_var_$6 = NIL;
                                while (NIL == done_var_$5) {
                                    SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                    SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion2));
                                    if (NIL != valid_$7) {
                                        removal_modules_lookup.removal_lookup_expand_internal(assertion2, asent);
                                    }
                                    done_var_$5 = makeBoolean(NIL == valid_$7);
                                }
                            } finally {
                                SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values5 = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                        }
                        done_var2 = makeBoolean(NIL == valid2);
                    }
                    utilities_macros.noting_progress_postamble();
                } finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        } else if (pcase_var.eql($OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
            SubLObject assertion3 = NIL;
            assertion3 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == enumeration_types.sense_truth(sense) || NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sense))) {
                    removal_modules_lookup.removal_lookup_expand_internal(assertion3, asent);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        } else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 8900L)
    public static SubLObject removal_isa_defn_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $isa_fort_defn_cost$.getGlobalValue();
        }
        return $isa_non_fort_defn_cost$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 9100L)
    public static SubLObject removal_isa_defn_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_isa_defn_pos_cost(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 9300L)
    public static SubLObject removal_isa_defn_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_defn_check_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 9400L)
    public static SubLObject removal_isa_defn_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_defn_reject_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 9500L)
    public static SubLObject removal_isa_defn_pos_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean(NIL != at_defns.any_sufficient_defn_anywhereP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)) || NIL != at_defns.any_sufficient_quoted_defn_anywhereP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 10600L)
    public static SubLObject removal_isa_defn_check_expand(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_object = NIL;
        SubLObject collection = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
        collection = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == isa.isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                try {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                    if (NIL != at_defns.quiet_defns_admitP(collection, v_object, NIL)) {
                        backward.removal_add_node(arguments.make_hl_support($DEFN, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    }
                } finally {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list29);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 11200L)
    public static SubLObject removal_isa_defn_reject_expand(SubLObject asent) {
        SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != at_defns.quiet_defns_rejectP(collection, v_object, NIL)) {
            backward.removal_add_node(arguments.make_hl_support($DEFN, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 11900L)
    public static SubLObject removal_all_isa_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject collections = cdolist_list_var = Sort.sort(isa.all_isa(v_object, UNPROVIDED, UNPROVIDED), $sym47$GENERALITY_ESTIMATE_, UNPROVIDED);
        SubLObject collection = NIL;
        collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(arg2, collection, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                SubLObject unified_arg2 = bindings.subst_bindings(v_bindings, arg2);
                SubLObject formula = el_utilities.make_binary_formula(predicate, v_object, unified_arg2);
                backward.removal_add_node(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 12600L)
    public static SubLObject removal_all_instances_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_all_instances_cost(collection);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 12900L)
    public static SubLObject removal_all_instances_completeness(SubLObject asent) {
        return inference_collection_iteration_completeness(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 13100L)
    public static SubLObject inference_collection_iteration_completeness(SubLObject collection) {
        if (NIL == forts.fort_p(collection)) {
            return $GROSSLY_INCOMPLETE;
        }
        if (NIL != at_defns.any_sufficient_defn_anywhereP(collection) || NIL != at_defns.any_sufficient_quoted_defn_anywhereP(collection)) {
            return $GROSSLY_INCOMPLETE;
        }
        if (NIL != kb_accessors.completely_enumerable_collectionP(collection, UNPROVIDED)) {
            return $COMPLETE;
        }
        return $GROSSLY_INCOMPLETE;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 13800L)
    public static SubLObject removal_all_instances_iterator(SubLObject collection) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (cardinality_estimates.instance_cardinality(collection).numG($all_instances_lazy_iteration_threshold$.getDynamicValue(thread))) {
            return kb_iterators.new_instances_iterator(collection);
        }
        return iteration.new_list_iterator(isa.all_instances(collection, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 14800L)
    public static SubLObject inference_all_instances_cost(SubLObject collection) {
        SubLObject instance_iteration_cost = cardinality_estimates.instance_iteration_cost(collection);
        return instance_iteration_cost.isZero() ? kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$isa) : instance_iteration_cost;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 15800L)
    public static SubLObject removal_elementof_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject element = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list55);
        element = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list55);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject theset = NIL;
        SubLObject elements = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list55);
        theset = current.first();
        current = (elements = current.rest());
        current = temp;
        if (NIL == current) {
            if (NIL != subl_promotions.memberP(element, elements, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($ELEMENTOF, asent, mt_relevance_macros.inference_relevant_mt(), $TRUE_MON), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list55);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 17300L)
    public static SubLObject removal_not_elementof_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject element = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list55);
        element = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list55);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject theset = NIL;
        SubLObject elements = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list55);
        theset = current.first();
        current = (elements = current.rest());
        current = temp;
        if (NIL == current) {
            if (NIL == subl_promotions.memberP(element, elements, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($ELEMENTOF, cycl_utilities.negate(asent), mt_relevance_macros.inference_relevant_mt(), $TRUE_MON), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list55);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 18300L)
    public static SubLObject removal_elementof_collection_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_collection_check_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 19100L)
    public static SubLObject removal_elementof_collection_defn_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_defn_check_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 19900L)
    public static SubLObject removal_elementof_set_check_iterator(SubLObject asent) {
        return removal_modules_lookup.removal_lookup_pos_iterator(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 21000L)
    public static SubLObject removal_not_elementof_collection_check_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_isa_collection_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 21400L)
    public static SubLObject removal_not_elementof_collection_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_isa_collection_check_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 22000L)
    public static SubLObject removal_not_elementof_collection_defn_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_defn_reject_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 22800L)
    public static SubLObject removal_not_elementof_set_check_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_modules_lookup.removal_lookup_neg_cost(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 23100L)
    public static SubLObject removal_not_elementof_set_check_completeness(SubLObject asent) {
        return removal_modules_lookup.removal_lookup_neg_completeness(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 23300L)
    public static SubLObject removal_not_elementof_set_check_iterator(SubLObject asent) {
        return removal_modules_lookup.removal_lookup_neg_iterator(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 24300L)
    public static SubLObject removal_elementof_thesetof_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject element = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject the_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject results = inference_elementof_thesetof_check(element, the_set_of, UNPROVIDED);
        SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != results && NIL != validP) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 25700L)
    public static SubLObject inference_elementof_thesetof_check(SubLObject element, SubLObject the_set_of, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject variable = cycl_utilities.nat_arg1(the_set_of, UNPROVIDED);
        SubLObject formula = cycl_utilities.nat_arg2(the_set_of, UNPROVIDED);
        SubLObject ask_formula = conses_high.subst(element, variable, formula, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject results = inference_trampolines.inference_true_sentence_recursive_query(ask_formula, mt, UNPROVIDED, UNPROVIDED);
        SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason)) {
            Errors.error(inference_datastructures_enumerated_types.inference_error_suspend_status_message(halt_reason));
            return NIL;
        }
        if (NIL != inference_datastructures_enumerated_types.exhausted_query_halt_reason_p(halt_reason)) {
            return Values.values(results, T);
        }
        return Values.values(results, NIL);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 26300L)
    public static SubLObject removal_isa_thecollectionof_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_elementof_thesetof_check_expand(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 27300L)
    public static SubLObject removal_not_elementof_thesetof_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject element = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject the_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject results = inference_elementof_thesetof_check(element, the_set_of, UNPROVIDED);
        SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == results && NIL != validP) {
            SubLObject bound_the_set_of = cycl_utilities.expression_subst(element, cycl_utilities.formula_arg1(the_set_of, UNPROVIDED), cycl_utilities.formula_arg2(the_set_of, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(arguments.make_hl_support($QUERY, cycl_utilities.negate(bound_the_set_of), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 28900L)
    public static SubLObject removal_not_isa_thecollectionof_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_elementof_thesetof_check_expand(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 29800L)
    public static SubLObject removal_all_elementof_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_all_isa_expand(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 30500L)
    public static SubLObject removal_nat_all_elementof_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_all_isa_expand(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 31300L)
    public static SubLObject removal_elementof_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return Sequences.length(cycl_utilities.nat_args(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 31700L)
    public static SubLObject removal_elementof_unify_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list88);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list88);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$18;
            SubLObject datum_$17 = current_$18 = arg2;
            SubLObject theset = NIL;
            SubLObject elements = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, $list89);
            theset = current_$18.first();
            current_$18 = current_$18.rest();
            SubLObject cdolist_list_var;
            elements = (cdolist_list_var = current_$18);
            SubLObject element = NIL;
            element = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                SubLObject v_bindings = unification_utilities.term_unify(arg1, element, T, T);
                SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    SubLObject formula = el_utilities.make_binary_formula($$elementOf, bindings.subst_bindings(v_bindings, arg1), arg2);
                    backward.removal_add_node(arguments.make_hl_support($ELEMENTOF, formula, mt_relevance_macros.inference_relevant_mt(), $TRUE_MON), v_bindings, unify_justification);
                }
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list88);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 32700L)
    public static SubLObject removal_elementof_collection_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_all_instances_cost(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 33100L)
    public static SubLObject removal_elementof_collection_unify_completeness(SubLObject asent) {
        return removal_all_instances_completeness(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 33200L)
    public static SubLObject removal_elementof_collection_unify_iterator(SubLObject collection) {
        return removal_all_instances_iterator(collection);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 34200L)
    public static SubLObject removal_elementof_set_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_modules_lookup.removal_lookup_pos_cost(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 34500L)
    public static SubLObject removal_elementof_set_unify_iterator(SubLObject asent) {
        return removal_modules_lookup.removal_lookup_pos_iterator(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 35400L)
    public static SubLObject removal_elementof_thesetof_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject elementof = el_utilities.unmake_binary_formula(asent);
        SubLObject arg1 = thread.secondMultipleValue();
        SubLObject thesetof_nat = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject thesetof = el_utilities.unmake_binary_formula(thesetof_nat);
        SubLObject var = thread.secondMultipleValue();
        SubLObject such_that = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject smart_cost = removal_elementof_thesetof_unify_cost_smart(var, such_that);
        return (NIL != smart_cost) ? smart_cost : backward_utilities.$inference_recursive_query_overhead$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 36100L)
    public static SubLObject removal_elementof_thesetof_unify_cost_smart(SubLObject el_var, SubLObject such_that) {
        if (NIL != el_grammar.el_literal_p(such_that)) {
            such_that = el_utilities.make_conjunction(list(such_that));
        }
        if (NIL != el_utilities.el_conjunction_p(such_that)) {
            SubLObject el_literals = cycl_utilities.formula_args(such_that, UNPROVIDED);
            if (NIL != el_literals && NIL != list_utilities.every_in_list($sym96$EL_LITERAL_P, cycl_utilities.formula_args(such_that, UNPROVIDED), UNPROVIDED)) {
                SubLObject cheapest_literal_cost = number_utilities.positive_infinity();
                SubLObject cdolist_list_var = el_literals;
                SubLObject el_literal = NIL;
                el_literal = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject hl_literal = cycl_utilities.expression_subst(variables.find_variable_by_id(ZERO_INTEGER), el_var, el_literal, UNPROVIDED, UNPROVIDED);
                    SubLObject asent = el_utilities.literal_atomic_sentence(hl_literal);
                    SubLObject sense = el_utilities.literal_sense(hl_literal);
                    SubLObject cost = inference_utilities.literal_removal_cost(asent, sense, UNPROVIDED, UNPROVIDED);
                    if (NIL != number_utilities.potentially_infinite_number_LE(cost, cheapest_literal_cost)) {
                        cheapest_literal_cost = cost;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    el_literal = cdolist_list_var.first();
                }
                if (cheapest_literal_cost.isNumber()) {
                    return cheapest_literal_cost;
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 37100L)
    public static SubLObject removal_elementof_thesetof_unify_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject the_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject elements = cdolist_list_var = ask_utilities.the_set_of_elements(the_set_of, $HL, UNPROVIDED);
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(arg1, element, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                SubLObject unified_arg1 = bindings.subst_bindings(v_bindings, arg1);
                SubLObject formula = el_utilities.make_binary_formula(pred, unified_arg1, the_set_of);
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 38300L)
    public static SubLObject removal_isa_thecollectionof_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_elementof_thesetof_unify_cost(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 38500L)
    public static SubLObject removal_isa_thecollectionof_unify_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_elementof_thesetof_unify_expand(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 39300L)
    public static SubLObject removal_collection_subset_fn_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subcol_nat = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject collectionsubsetfn = el_utilities.unmake_binary_formula(subcol_nat);
        SubLObject col = thread.secondMultipleValue();
        SubLObject thesetof_nat = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != el_utilities.el_formula_with_operator_p(thesetof_nat, $$TheSetOf)) {
            thread.resetMultipleValues();
            SubLObject thesetof = el_utilities.unmake_binary_formula(thesetof_nat);
            SubLObject var = thread.secondMultipleValue();
            SubLObject explicit_such_that = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            SubLObject additional_isa_literal = list($$isa, var, col);
            SubLObject such_that = simplifier.conjoin(list(additional_isa_literal, explicit_such_that), T);
            SubLObject smart_cost = removal_elementof_thesetof_unify_cost_smart(var, such_that);
            if (NIL != smart_cost) {
                return smart_cost;
            }
        }
        return removal_isa_subcollection_cost(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 40500L)
    public static SubLObject removal_isa_subcollection_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject subcol_nat = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject col = cycl_utilities.nat_arg1(subcol_nat, UNPROVIDED);
        return Numbers.ceiling(inference_all_instances_cost(col), TEN_INTEGER);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 40800L)
    public static SubLObject removal_isa_subcollection_unify_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_isa = el_utilities.unmake_binary_formula(asent);
        SubLObject arg1 = thread.secondMultipleValue();
        SubLObject subcol_nat = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject subcol_fn = cycl_utilities.nat_functor(subcol_nat);
        SubLObject rule = kb_mapping_utilities.fpred_value(subcol_fn, $$subcollectionFunctionDefiningRule, ONE_INTEGER, TWO_INTEGER, $TRUE);
        if (NIL != rule) {
            SubLObject query = removal_isa_subcollection_construct_query(rule, asent);
            SubLObject recursive_results = ask_utilities.inference_recursive_query_unique_bindings(query, mt_relevance_macros.$mt$.getDynamicValue(thread), ask_utilities.filter_query_properties_for_recursive_query(inference_utilities.current_query_properties()));
            if (NIL != recursive_results) {
                SubLObject more_supports = list(rule);
                if (NIL != cyc_kernel.closed_query_success_token_p(recursive_results)) {
                    SubLObject hl_support = arguments.make_hl_support($QUERY, query, UNPROVIDED, UNPROVIDED);
                    backward.removal_add_node(hl_support, NIL, more_supports);
                } else {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL != conses_high.second(recursive_results.first())) {
                        Errors.error($str104$Expected__s_to_have_only_one_free, rule);
                    }
                    SubLObject cdolist_list_var = recursive_results;
                    SubLObject v_bindings = NIL;
                    v_bindings = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject fully_bound_query = bindings.apply_bindings(v_bindings, query);
                        SubLObject hl_support2 = arguments.make_hl_support($QUERY, fully_bound_query, UNPROVIDED, UNPROVIDED);
                        SubLObject binding = v_bindings.first();
                        SubLObject ins = bindings.variable_binding_value(binding);
                        thread.resetMultipleValues();
                        SubLObject v_bindings_$19 = unification_utilities.term_unify(ins, arg1, NIL, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings_$19) {
                            backward.removal_add_node(hl_support2, v_bindings_$19, append(more_supports, unify_justification));
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        v_bindings = cdolist_list_var.first();
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 42200L)
    public static SubLObject removal_isa_subcollection_construct_query(SubLObject rule, SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnf = assertions_high.assertion_cnf(rule);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == list_utilities.singletonP(clauses.pos_lits(cnf))) {
            Errors.error($str105$Expected_exactly_one_poslit_in__S, rule);
        }
        SubLObject pos_lit = clauses.pos_lits(cnf).first();
        SubLObject neg_lits = clauses.neg_lits(cnf);
        SubLObject tou_lits = el_utilities.tou_lits(neg_lits);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == list_utilities.singletonP(tou_lits)) {
            Errors.error($str106$Expected_exactly_one___termOfUnit, rule);
        }
        SubLObject tou_lit = tou_lits.first();
        SubLObject query_neg_lits = Sequences.remove(tou_lit, neg_lits, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject termofunit = el_utilities.unmake_binary_formula(tou_lit);
        SubLObject var = thread.secondMultipleValue();
        SubLObject unbound_subcol_naut = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject tou_binding = bindings.make_variable_binding(var, unbound_subcol_naut);
        SubLObject tou_bindings = list(tou_binding);
        SubLObject fixed_cnf = bindings.apply_bindings(tou_bindings, pos_lit);
        thread.resetMultipleValues();
        SubLObject unify_bindings = unification.unify(asent, fixed_cnf, NIL, UNPROVIDED);
        SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject query_lits = bindings.apply_bindings(unify_bindings, query_neg_lits);
        SubLObject query = simplifier.conjoin(query_lits, UNPROVIDED);
        return query;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 43900L)
    public static SubLObject subcollection_functor_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $subcollection_functors$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 53900L)
    public static SubLObject removal_all_isa_of_type_completeness(SubLObject asent_1, SubLObject mt_1, SubLObject asent_2, SubLObject mt_2) {
        SubLObject result = NIL;
        SubLObject completeness_1 = inference_utilities.literal_removal_completeness(asent_1, $POS, mt_1);
        if ($COMPLETE == completeness_1) {
            result = $COMPLETE;
        } else {
            SubLObject completeness_2 = inference_utilities.literal_removal_completeness(asent_2, $POS, mt_2);
            result = inference_datastructures_enumerated_types.max2_completeness(completeness_1, completeness_2);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 54300L)
    public static SubLObject removal_all_isa_of_type_applicability(SubLObject contextualized_dnf_clause) {
        return removal_modules_genls.removal_sbhl_between_applicability(contextualized_dnf_clause, $$isa);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 54400L)
    public static SubLObject removal_all_isa_of_type_cost(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != clause_utilities.binary_clause_p(contextualized_dnf_clause) : contextualized_dnf_clause;
        SubLObject ins = NIL;
        SubLObject type_col = NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list143);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list143);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != variables.variable_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) {
                    ins = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                } else {
                    type_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list143);
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        assert NIL != forts.fort_p(ins) : ins;
        assert NIL != forts.fort_p(type_col) : type_col;
        SubLObject all_isa_cardinality = control_vars.$average_all_isa_count$.getDynamicValue(thread);
        SubLObject all_instances_cardinality = inference_all_instances_cost(type_col);
        SubLObject max_col_cardinality = Numbers.min(all_isa_cardinality, all_instances_cardinality);
        return Numbers.integerDivide(max_col_cardinality, TWO_INTEGER);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 55300L)
    public static SubLObject removal_all_isa_of_type_expand(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent0 = NIL;
        SubLObject contextualized_asent2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list145);
        contextualized_asent0 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list145);
        contextualized_asent2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$21;
            SubLObject datum_$20 = current_$21 = contextualized_asent0;
            SubLObject mt0 = NIL;
            SubLObject asent0 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, $list146);
            mt0 = current_$21.first();
            current_$21 = current_$21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, $list146);
            asent0 = current_$21.first();
            current_$21 = current_$21.rest();
            if (NIL == current_$21) {
                SubLObject current_$22;
                SubLObject datum_$21 = current_$22 = contextualized_asent2;
                SubLObject mt2 = NIL;
                SubLObject asent2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, $list147);
                mt2 = current_$22.first();
                current_$22 = current_$22.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, $list147);
                asent2 = current_$22.first();
                current_$22 = current_$22.rest();
                if (NIL == current_$22) {
                    if (mt0.equal(mt2)) {
                        thread.resetMultipleValues();
                        SubLObject ins_asent = removal_all_isa_of_type_categorize_asents(asent0, asent2);
                        SubLObject type_col_asent = thread.secondMultipleValue();
                        SubLObject ins_firstP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject ins = cycl_utilities.atomic_sentence_arg1(ins_asent, UNPROVIDED);
                        SubLObject variable = cycl_utilities.atomic_sentence_arg2(ins_asent, UNPROVIDED);
                        SubLObject type_col = cycl_utilities.atomic_sentence_arg2(type_col_asent, UNPROVIDED);
                        SubLObject cdolist_list_var = inference_all_isas_of_type(ins, type_col, mt0);
                        SubLObject col = NIL;
                        col = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            thread.resetMultipleValues();
                            SubLObject v_bindings = unification_utilities.term_unify(variable, col, UNPROVIDED, UNPROVIDED);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                SubLObject ins_support_formula = el_utilities.make_binary_formula($$isa, ins, col);
                                SubLObject type_col_support_formula = el_utilities.make_binary_formula($$isa, col, type_col);
                                SubLObject ins_support = arguments.make_hl_support($ISA, ins_support_formula, mt0, UNPROVIDED);
                                SubLObject type_col_support = arguments.make_hl_support($ISA, type_col_support_formula, mt0, UNPROVIDED);
                                SubLObject ins_supports = list(ins_support);
                                SubLObject type_col_supports = list(type_col_support);
                                SubLObject justifications = (NIL != ins_firstP) ? list(ins_supports, type_col_supports) : list(type_col_supports, ins_supports);
                                inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            col = cdolist_list_var.first();
                        }
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$21, $list147);
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$20, $list146);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list145);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 56900L)
    public static SubLObject removal_all_isa_of_type_categorize_asents(SubLObject asent0, SubLObject asent1) {
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent0, UNPROVIDED))) {
            return Values.values(asent0, asent1, T);
        }
        return Values.values(asent1, asent0, NIL);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 58100L)
    public static SubLObject all_quoted_instances_pos_preference(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        SubLObject var = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject arg_bindableP = list_utilities.member_eqP(var, bindable_vars);
        if (NIL != fort_types_interface.collection_p(col)) {
            SubLObject completeness = inference_quoted_collection_iteration_completeness(col);
            SubLObject preference = preference_modules.completeness_to_preference_level(completeness);
            if (NIL != arg_bindableP && NIL != preference_modules.preference_level_LE(preference, $DISPREFERRED) && NIL != kb_accessors.check_preferred_collectionP(col, UNPROVIDED)) {
                preference = $DISALLOWED;
            }
            return preference;
        }
        return $GROSSLY_DISPREFERRED;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 59500L)
    public static SubLObject removal_quoted_isa_collection_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $quoted_isa_fort_collection_cost$.getGlobalValue();
        }
        return $quoted_isa_non_fort_collection_cost$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 59700L)
    public static SubLObject removal_quoted_isa_collection_check_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_quoted_isa_collection_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 59900L)
    public static SubLObject removal_quoted_isa_collection_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_quoted_isa_collection_check_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 60100L)
    public static SubLObject removal_quoted_isa_collection_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_quoted_isa_collection_check_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 61000L)
    public static SubLObject removal_quoted_isa_collection_check_expand(SubLObject asent) {
        SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != isa.quoted_isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($ISA, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 61400L)
    public static SubLObject removal_not_quoted_isa_collection_check_cost(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread)) {
            return removal_quoted_isa_collection_check_pos_cost(asent, UNPROVIDED);
        }
        return $default_not_quoted_isa_collection_check_cost$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 61600L)
    public static SubLObject removal_not_quoted_isa_collection_check_expand(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_object = NIL;
        SubLObject collection = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
        collection = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == isa.quoted_isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else if (NIL != isa.not_quoted_isa_by_sbhlP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($ISA, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list29);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 62500L)
    public static SubLObject removal_quoted_isa_defn_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $quoted_isa_fort_defn_cost$.getGlobalValue();
        }
        return $quoted_isa_non_fort_defn_cost$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 62800L)
    public static SubLObject removal_quoted_isa_defn_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_quoted_isa_defn_pos_cost(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 62900L)
    public static SubLObject removal_quoted_isa_defn_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_quoted_isa_defn_check_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 63100L)
    public static SubLObject removal_quoted_isa_defn_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_quoted_isa_defn_reject_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 63200L)
    public static SubLObject removal_quoted_isa_defn_pos_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return at_defns.any_sufficient_quoted_defn_anywhereP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 64400L)
    public static SubLObject removal_quoted_isa_defn_check_expand(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_object = NIL;
        SubLObject collection = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
        collection = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == forts.fort_p(v_object) || NIL == isa.quoted_isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                try {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                    if (NIL != at_defns.quiet_quoted_defns_admitP(collection, v_object, NIL)) {
                        backward.removal_add_node(arguments.make_hl_support($DEFN, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    }
                } finally {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list29);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 64900L)
    public static SubLObject removal_quoted_isa_defn_reject_expand(SubLObject asent) {
        SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != at_defns.quiet_quoted_defns_rejectP(collection, v_object, NIL)) {
            backward.removal_add_node(arguments.make_hl_support($DEFN, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 65300L)
    public static SubLObject removal_nat_quoted_isa_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_object = NIL;
        SubLObject collection = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
        collection = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != isa.quoted_isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($ISA, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list29);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 66100L)
    public static SubLObject removal_all_quoted_isa_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_fort_all_quoted_isa_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 66700L)
    public static SubLObject removal_fort_all_quoted_isa_expand(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject collections = cdolist_list_var = isa.all_quoted_isa(v_object, UNPROVIDED, UNPROVIDED);
        SubLObject collection = NIL;
        collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(arg2, collection, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                SubLObject unified_arg2 = bindings.subst_bindings(v_bindings, arg2);
                SubLObject formula = el_utilities.make_binary_formula(predicate, v_object, unified_arg2);
                backward.removal_add_node(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 67300L)
    public static SubLObject removal_nat_all_quoted_isa_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_all_quoted_isa_expand(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 68000L)
    public static SubLObject removal_all_quoted_instances_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_all_quoted_instances_cost(collection);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 68300L)
    public static SubLObject removal_all_quoted_instances_completeness(SubLObject asent) {
        return inference_quoted_collection_iteration_completeness(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 68500L)
    public static SubLObject inference_quoted_collection_iteration_completeness(SubLObject collection) {
        if (NIL == forts.fort_p(collection)) {
            return $GROSSLY_INCOMPLETE;
        }
        if (NIL != at_defns.any_sufficient_quoted_defn_anywhereP(collection)) {
            return $GROSSLY_INCOMPLETE;
        }
        if (NIL != kb_accessors.completely_enumerable_collectionP(collection, UNPROVIDED)) {
            return $COMPLETE;
        }
        return $GROSSLY_INCOMPLETE;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 69000L)
    public static SubLObject removal_all_quoted_instances_iterator(SubLObject collection) {
        return iteration.new_list_iterator(isa.all_quoted_instances(collection, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 70100L)
    public static SubLObject inference_all_quoted_instances_cost(SubLObject collection) {
        return Numbers.max(cardinality_estimates.quoted_instance_iteration_cost(collection), kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$quotedIsa));
    }

    public static SubLObject declare_removal_modules_isa_file() {
        declareFunction("all_instances_pos_preference", "ALL-INSTANCES-POS-PREFERENCE", 3, 0, false);
        declareFunction("inference_all_isas_of_type", "INFERENCE-ALL-ISAS-OF-TYPE", 2, 1, false);
        declareFunction("removal_isa_collection_check_pos_cost", "REMOVAL-ISA-COLLECTION-CHECK-POS-COST", 1, 1, false);
        new $removal_isa_collection_check_pos_cost$UnaryFunction();
        new $removal_isa_collection_check_pos_cost$BinaryFunction();
        declareFunction("removal_isa_collection_check_neg_cost", "REMOVAL-ISA-COLLECTION-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_isa_collection_check_pos_expand", "REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_isa_collection_check_neg_expand", "REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_isa_collection_check_expand", "REMOVAL-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false);
        declareFunction("removal_not_isa_collection_check_cost", "REMOVAL-NOT-ISA-COLLECTION-CHECK-COST", 1, 0, false);
        declareFunction("removal_not_isa_collection_check_expand", "REMOVAL-NOT-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false);
        declareFunction("removal_isa_naut_collection_check_pos_cost", "REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_isa_naut_collection_check_pos_expand", "REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_isa_naut_collection_lookup_pos_cost", "REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_isa_naut_collection_lookup_pos_expand", "REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction("removal_isa_defn_pos_cost", "REMOVAL-ISA-DEFN-POS-COST", 1, 1, false);
        declareFunction("removal_isa_defn_neg_cost", "REMOVAL-ISA-DEFN-NEG-COST", 1, 1, false);
        declareFunction("removal_isa_defn_pos_expand", "REMOVAL-ISA-DEFN-POS-EXPAND", 1, 1, false);
        declareFunction("removal_isa_defn_neg_expand", "REMOVAL-ISA-DEFN-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_isa_defn_pos_required", "REMOVAL-ISA-DEFN-POS-REQUIRED", 1, 1, false);
        declareFunction("removal_isa_defn_check_expand", "REMOVAL-ISA-DEFN-CHECK-EXPAND", 1, 0, false);
        declareFunction("removal_isa_defn_reject_expand", "REMOVAL-ISA-DEFN-REJECT-EXPAND", 1, 0, false);
        declareFunction("removal_all_isa_expand", "REMOVAL-ALL-ISA-EXPAND", 1, 1, false);
        declareFunction("removal_all_instances_cost", "REMOVAL-ALL-INSTANCES-COST", 1, 1, false);
        new $removal_all_instances_cost$UnaryFunction();
        new $removal_all_instances_cost$BinaryFunction();
        declareFunction("removal_all_instances_completeness", "REMOVAL-ALL-INSTANCES-COMPLETENESS", 1, 0, false);
        new $removal_all_instances_completeness$UnaryFunction();
        declareFunction("inference_collection_iteration_completeness", "INFERENCE-COLLECTION-ITERATION-COMPLETENESS", 1, 0, false);
        declareFunction("removal_all_instances_iterator", "REMOVAL-ALL-INSTANCES-ITERATOR", 1, 0, false);
        declareFunction("inference_all_instances_cost", "INFERENCE-ALL-INSTANCES-COST", 1, 0, false);
        declareFunction("removal_elementof_check_expand", "REMOVAL-ELEMENTOF-CHECK-EXPAND", 1, 1, false);
        new $removal_elementof_check_expand$UnaryFunction();
        new $removal_elementof_check_expand$BinaryFunction();
        declareFunction("removal_not_elementof_check_expand", "REMOVAL-NOT-ELEMENTOF-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_elementof_collection_check_expand", "REMOVAL-ELEMENTOF-COLLECTION-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_elementof_collection_defn_check_expand", "REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_elementof_set_check_iterator", "REMOVAL-ELEMENTOF-SET-CHECK-ITERATOR", 1, 0, false);
        declareFunction("removal_not_elementof_collection_check_cost", "REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-COST", 1, 1, false);
        declareFunction("removal_not_elementof_collection_check_expand", "REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_not_elementof_collection_defn_check_expand", "REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_not_elementof_set_check_cost", "REMOVAL-NOT-ELEMENTOF-SET-CHECK-COST", 1, 1, false);
        declareFunction("removal_not_elementof_set_check_completeness", "REMOVAL-NOT-ELEMENTOF-SET-CHECK-COMPLETENESS", 1, 0, false);
        declareFunction("removal_not_elementof_set_check_iterator", "REMOVAL-NOT-ELEMENTOF-SET-CHECK-ITERATOR", 1, 0, false);
        declareFunction("removal_elementof_thesetof_check_expand", "REMOVAL-ELEMENTOF-THESETOF-CHECK-EXPAND", 1, 1, false);
        declareFunction("inference_elementof_thesetof_check", "INFERENCE-ELEMENTOF-THESETOF-CHECK", 2, 1, false);
        declareFunction("removal_isa_thecollectionof_check_expand", "REMOVAL-ISA-THECOLLECTIONOF-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_not_elementof_thesetof_check_expand", "REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_not_isa_thecollectionof_check_expand", "REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_all_elementof_expand", "REMOVAL-ALL-ELEMENTOF-EXPAND", 1, 1, false);
        declareFunction("removal_nat_all_elementof_expand", "REMOVAL-NAT-ALL-ELEMENTOF-EXPAND", 1, 1, false);
        declareFunction("removal_elementof_unify_cost", "REMOVAL-ELEMENTOF-UNIFY-COST", 1, 1, false);
        declareFunction("removal_elementof_unify_expand", "REMOVAL-ELEMENTOF-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_elementof_collection_unify_cost", "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COST", 1, 1, false);
        declareFunction("removal_elementof_collection_unify_completeness", "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COMPLETENESS", 1, 0, false);
        declareFunction("removal_elementof_collection_unify_iterator", "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-ITERATOR", 1, 0, false);
        declareFunction("removal_elementof_set_unify_cost", "REMOVAL-ELEMENTOF-SET-UNIFY-COST", 1, 1, false);
        declareFunction("removal_elementof_set_unify_iterator", "REMOVAL-ELEMENTOF-SET-UNIFY-ITERATOR", 1, 0, false);
        declareFunction("removal_elementof_thesetof_unify_cost", "REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST", 1, 1, false);
        declareFunction("removal_elementof_thesetof_unify_cost_smart", "REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST-SMART", 2, 0, false);
        declareFunction("removal_elementof_thesetof_unify_expand", "REMOVAL-ELEMENTOF-THESETOF-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_isa_thecollectionof_unify_cost", "REMOVAL-ISA-THECOLLECTIONOF-UNIFY-COST", 1, 1, false);
        declareFunction("removal_isa_thecollectionof_unify_expand", "REMOVAL-ISA-THECOLLECTIONOF-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_collection_subset_fn_cost", "REMOVAL-COLLECTION-SUBSET-FN-COST", 1, 1, false);
        declareFunction("removal_isa_subcollection_cost", "REMOVAL-ISA-SUBCOLLECTION-COST", 1, 1, false);
        declareFunction("removal_isa_subcollection_unify_expand", "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_isa_subcollection_construct_query", "REMOVAL-ISA-SUBCOLLECTION-CONSTRUCT-QUERY", 2, 0, false);
        declareFunction("subcollection_functor_p", "SUBCOLLECTION-FUNCTOR-P", 1, 0, false);
        declareFunction("removal_all_isa_of_type_completeness", "REMOVAL-ALL-ISA-OF-TYPE-COMPLETENESS", 4, 0, false);
        declareFunction("removal_all_isa_of_type_applicability", "REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY", 1, 0, false);
        new $removal_all_isa_of_type_applicability$UnaryFunction();
        declareFunction("removal_all_isa_of_type_cost", "REMOVAL-ALL-ISA-OF-TYPE-COST", 1, 0, false);
        declareFunction("removal_all_isa_of_type_expand", "REMOVAL-ALL-ISA-OF-TYPE-EXPAND", 1, 0, false);
        declareFunction("removal_all_isa_of_type_categorize_asents", "REMOVAL-ALL-ISA-OF-TYPE-CATEGORIZE-ASENTS", 2, 0, false);
        declareFunction("all_quoted_instances_pos_preference", "ALL-QUOTED-INSTANCES-POS-PREFERENCE", 3, 0, false);
        declareFunction("removal_quoted_isa_collection_check_pos_cost", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST", 1, 1, false);
        new $removal_quoted_isa_collection_check_pos_cost$UnaryFunction();
        new $removal_quoted_isa_collection_check_pos_cost$BinaryFunction();
        declareFunction("removal_quoted_isa_collection_check_neg_cost", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_quoted_isa_collection_check_pos_expand", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND", 1, 1, false);
        new $removal_quoted_isa_collection_check_pos_expand$UnaryFunction();
        new $removal_quoted_isa_collection_check_pos_expand$BinaryFunction();
        declareFunction("removal_quoted_isa_collection_check_neg_expand", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_quoted_isa_collection_check_expand", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false);
        declareFunction("removal_not_quoted_isa_collection_check_cost", "REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK-COST", 1, 0, false);
        declareFunction("removal_not_quoted_isa_collection_check_expand", "REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false);
        declareFunction("removal_quoted_isa_defn_pos_cost", "REMOVAL-QUOTED-ISA-DEFN-POS-COST", 1, 1, false);
        declareFunction("removal_quoted_isa_defn_neg_cost", "REMOVAL-QUOTED-ISA-DEFN-NEG-COST", 1, 1, false);
        declareFunction("removal_quoted_isa_defn_pos_expand", "REMOVAL-QUOTED-ISA-DEFN-POS-EXPAND", 1, 1, false);
        declareFunction("removal_quoted_isa_defn_neg_expand", "REMOVAL-QUOTED-ISA-DEFN-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_quoted_isa_defn_pos_required", "REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED", 1, 1, false);
        new $removal_quoted_isa_defn_pos_required$UnaryFunction();
        new $removal_quoted_isa_defn_pos_required$BinaryFunction();
        declareFunction("removal_quoted_isa_defn_check_expand", "REMOVAL-QUOTED-ISA-DEFN-CHECK-EXPAND", 1, 0, false);
        declareFunction("removal_quoted_isa_defn_reject_expand", "REMOVAL-QUOTED-ISA-DEFN-REJECT-EXPAND", 1, 0, false);
        declareFunction("removal_nat_quoted_isa_expand", "REMOVAL-NAT-QUOTED-ISA-EXPAND", 1, 1, false);
        declareFunction("removal_all_quoted_isa_expand", "REMOVAL-ALL-QUOTED-ISA-EXPAND", 1, 1, false);
        declareFunction("removal_fort_all_quoted_isa_expand", "REMOVAL-FORT-ALL-QUOTED-ISA-EXPAND", 1, 0, false);
        declareFunction("removal_nat_all_quoted_isa_expand", "REMOVAL-NAT-ALL-QUOTED-ISA-EXPAND", 1, 1, false);
        declareFunction("removal_all_quoted_instances_cost", "REMOVAL-ALL-QUOTED-INSTANCES-COST", 1, 1, false);
        declareFunction("removal_all_quoted_instances_completeness", "REMOVAL-ALL-QUOTED-INSTANCES-COMPLETENESS", 1, 0, false);
        declareFunction("inference_quoted_collection_iteration_completeness", "INFERENCE-QUOTED-COLLECTION-ITERATION-COMPLETENESS", 1, 0, false);
        declareFunction("removal_all_quoted_instances_iterator", "REMOVAL-ALL-QUOTED-INSTANCES-ITERATOR", 1, 0, false);
        declareFunction("inference_all_quoted_instances_cost", "INFERENCE-ALL-QUOTED-INSTANCES-COST", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_isa_file() {
        $isa_fort_collection_cost$ = deflexical("*ISA-FORT-COLLECTION-COST*", Numbers.subtract(control_vars.$cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        $isa_non_fort_collection_cost$ = deflexical("*ISA-NON-FORT-COLLECTION-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_not_isa_collection_check_cost$ = defparameter("*DEFAULT-NOT-ISA-COLLECTION-CHECK-COST*", ONE_INTEGER);
        $isa_fort_defn_cost$ = deflexical("*ISA-FORT-DEFN-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $isa_non_fort_defn_cost$ = deflexical("*ISA-NON-FORT-DEFN-COST*", Numbers.subtract(control_vars.$cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        $all_instances_lazy_iteration_threshold$ = defparameter("*ALL-INSTANCES-LAZY-ITERATION-THRESHOLD*", $int$2300);
        $subcollection_functors$ = deflexical("*SUBCOLLECTION-FUNCTORS*", $list107);
        $quoted_isa_fort_collection_cost$ = deflexical("*QUOTED-ISA-FORT-COLLECTION-COST*", Numbers.subtract(control_vars.$cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        $quoted_isa_non_fort_collection_cost$ = deflexical("*QUOTED-ISA-NON-FORT-COLLECTION-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_not_quoted_isa_collection_check_cost$ = SubLFiles.defparameter("*DEFAULT-NOT-QUOTED-ISA-COLLECTION-CHECK-COST*", ONE_INTEGER);
        $quoted_isa_fort_defn_cost$ = deflexical("*QUOTED-ISA-FORT-DEFN-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $quoted_isa_non_fort_defn_cost$ = deflexical("*QUOTED-ISA-NON-FORT-DEFN-COST*", Numbers.subtract(control_vars.$cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        return NIL;
    }

    public static SubLObject setup_removal_modules_isa_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$isa);
        inference_modules.inference_removal_module_use_meta_removal($$isa, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal($$isa, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_COMPLETELY_DECIDABLE_NEG);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_ABDUCTION_POS_CHECK);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_ABDUCTION_POS_UNIFY);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_RELATION_ALL_EXISTS_CHECK);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_RELATION_ALL_EXISTS_UNIFY);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_RELATION_EXISTS_ALL_CHECK);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_BACKCHAIN_REQUIRED_PRUNE);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$isa);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$isa);
        preference_modules.inference_preference_module($ALL_INSTANCES_POS, $list13);
        preference_modules.inference_preference_module($ALL_ISA_POS, $list19);
        preference_modules.inference_preference_module($ALL_ELEMENTOF_POS, $list21);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_CHECK_POS, $list24);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_CHECK_NEG, $list26);
        inference_modules.inference_removal_module($REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS, $list32);
        inference_modules.inference_removal_module($REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS, $list34);
        inference_modules.inference_removal_module($REMOVAL_ISA_DEFN_POS, $list41);
        inference_modules.inference_removal_module($REMOVAL_ISA_DEFN_NEG, $list43);
        inference_modules.inference_removal_module($REMOVAL_ALL_ISA, $list46);
        utilities_macros.note_funcall_helper_function($sym48$REMOVAL_ALL_ISA_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_ALL_INSTANCES, $list53);
        inference_modules.register_solely_specific_removal_module_predicate($$elementOf);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$elementOf);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$elementOf);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_CHECK, $list59);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_CHECK, $list61);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_CHECK, $list63);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK, $list65);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_SET_CHECK, $list67);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK, $list69);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK, $list71);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_SET_CHECK, $list73);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_THESETOF_CHECK, $list76);
        inference_modules.inference_removal_module($REMOVAL_ISA_THECOLLECTIONOF_CHECK, $list78);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK, $list81);
        inference_modules.inference_removal_module($REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK, $list83);
        inference_modules.inference_removal_module($REMOVAL_ALL_ELEMENTOF, $list85);
        inference_modules.inference_removal_module($REMOVAL_NAT_ALL_ELEMENTOF, $list87);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_UNIFY, $list91);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_UNIFY, $list93);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_SET_UNIFY, $list95);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_THESETOF_UNIFY, $list99);
        inference_modules.inference_removal_module($REMOVAL_ISA_THECOLLECTIONOF_UNIFY, $list101);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY, $list109);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK, $list111);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY, $list113);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK, $list115);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY, $list117);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK, $list119);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY, $list121);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK, $list123);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY, $list125);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK, $list127);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY, $list129);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK, $list131);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY, $list133);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK, $list135);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY, $list137);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK, $list139);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_ALL_ISA_OF_TYPE, $list141);
        inference_modules.register_solely_specific_removal_module_predicate($$quotedIsa);
        inference_modules.inference_removal_module_use_meta_removal($$quotedIsa, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal($$quotedIsa, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        inference_modules.inference_removal_module_use_generic($$quotedIsa, $REMOVAL_COMPLETELY_DECIDABLE_NEG);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$quotedIsa);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$quotedIsa);
        preference_modules.inference_preference_module($ALL_QUOTED_INSTANCES_POS, $list150);
        preference_modules.inference_preference_module($ALL_QUOTED_ISA_POS, $list152);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_COLLECTION_CHECK_POS, $list154);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_COLLECTION_CHECK_NEG, $list156);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_DEFN_POS, $list158);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_DEFN_NEG, $list160);
        inference_modules.inference_removal_module($REMOVAL_NAT_QUOTED_ISA, $list162);
        inference_modules.inference_removal_module($REMOVAL_ALL_QUOTED_ISA, $list164);
        inference_modules.inference_removal_module($REMOVAL_NAT_ALL_QUOTED_ISA, $list166);
        inference_modules.inference_removal_module($REMOVAL_ALL_QUOTED_INSTANCES, $list168);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_isa_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_isa_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_isa_file();
    }

    static {
        me = new removal_modules_isa();
        $isa_fort_collection_cost$ = null;
        $isa_non_fort_collection_cost$ = null;
        $default_not_isa_collection_check_cost$ = null;
        $isa_fort_defn_cost$ = null;
        $isa_non_fort_defn_cost$ = null;
        $all_instances_lazy_iteration_threshold$ = null;
        $subcollection_functors$ = null;
        $quoted_isa_fort_collection_cost$ = null;
        $quoted_isa_non_fort_collection_cost$ = null;
        $default_not_quoted_isa_collection_check_cost$ = null;
        $quoted_isa_fort_defn_cost$ = null;
        $quoted_isa_non_fort_defn_cost$ = null;
        $$isa = makeConstSym(("isa"));
        $META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $REMOVAL_COMPLETELY_DECIDABLE_NEG = makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");
        $REMOVAL_ABDUCTION_POS_CHECK = makeKeyword("REMOVAL-ABDUCTION-POS-CHECK");
        $REMOVAL_ABDUCTION_POS_UNIFY = makeKeyword("REMOVAL-ABDUCTION-POS-UNIFY");
        $REMOVAL_RELATION_ALL_EXISTS_CHECK = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-CHECK");
        $REMOVAL_RELATION_ALL_EXISTS_UNIFY = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY");
        $REMOVAL_RELATION_EXISTS_ALL_CHECK = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-CHECK");
        $REMOVAL_BACKCHAIN_REQUIRED_PRUNE = makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $ALL_INSTANCES_POS = makeKeyword("ALL-INSTANCES-POS");
        $list13 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE"),
                makeSymbol("ALL-INSTANCES-POS-PREFERENCE"));
        $PREFERRED = makeKeyword("PREFERRED");
        $DISPREFERRED = makeKeyword("DISPREFERRED");
        $DISALLOWED = makeKeyword("DISALLOWED");
        $GROSSLY_DISPREFERRED = makeKeyword("GROSSLY-DISPREFERRED");
        $ALL_ISA_POS = makeKeyword("ALL-ISA-POS");
        $list19 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));
        $ALL_ELEMENTOF_POS = makeKeyword("ALL-ELEMENTOF-POS");
        $list21 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $float$0_1 = makeDouble(0.1);
        $REMOVAL_ISA_COLLECTION_CHECK_POS = makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS");
        $list24 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> <fort>)"), makeKeyword("EXAMPLE"),
                makeString("(#$isa #$Dog #$Collection)\n(#$isa (#$JuvenileFn #$Dog) #$Collection)") });
        $REMOVAL_ISA_COLLECTION_CHECK_NEG = makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-NEG");
        $list26 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fort> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa #$Dog #$Predicate))") });
        $int$30 = makeInteger(30);
        $ISA = makeKeyword("ISA");
        $list29 = list(makeSymbol("OBJECT"), makeSymbol("COLLECTION"));
        $MINIMIZE = makeKeyword("MINIMIZE");
        $REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS = makeKeyword("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS");
        $list32 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), makeKeyword("FORT"), makeKeyword("CLOSED-NAUT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });
        $REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS = makeKeyword("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS");
        $list34 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("CLOSED-NAUT")), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"),
                makeString("") });
        $TRUE = makeKeyword("TRUE");
        $GAF_ARG = makeKeyword("GAF-ARG");
        $GAF = makeKeyword("GAF");
        $PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
        $OVERLAP = makeKeyword("OVERLAP");
        $REMOVAL_ISA_DEFN_POS = makeKeyword("REMOVAL-ISA-DEFN-POS");
        $list41 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("REQUIRED"),
                makeSymbol("REMOVAL-ISA-DEFN-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-DEFN-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-DEFN-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$isa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient"), makeKeyword("EXAMPLE"), makeString("(#$isa 42 #$Integer)") });
        $REMOVAL_ISA_DEFN_NEG = makeKeyword("REMOVAL-ISA-DEFN-NEG");
        $list43 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-DEFN-NEG-COST"),
                        makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-DEFN-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa 42 #$SubLString))") });
        $DEFN = makeKeyword("DEFN");
        $REMOVAL_ALL_ISA = makeKeyword("REMOVAL-ALL-ISA");
        $list46 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$isa #$Dog ?COL)\n(#$isa (#$JuvenileFn #$Cougar) ?COL)") });
        $sym47$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");
        $sym48$REMOVAL_ALL_ISA_EXPAND = makeSymbol("REMOVAL-ALL-ISA-EXPAND");
        $GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
        $COMPLETE = makeKeyword("COMPLETE");
        $int$2300 = makeInteger(2300);
        $REMOVAL_ALL_INSTANCES = makeKeyword("REMOVAL-ALL-INSTANCES");
        $list53 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("isa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ALL-INSTANCES-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-INSTANCES-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("isa")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-INSTANCES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("isa")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$isa ?DOG #$Dog)") });
        $$elementOf = makeConstSym(("elementOf"));
        $list55 = list(makeSymbol("ELEMENT"), cons(makeSymbol("THESET"), makeSymbol("ELEMENTS")));
        $ELEMENTOF = makeKeyword("ELEMENTOF");
        $TRUE_MON = makeKeyword("TRUE-MON");
        $REMOVAL_ELEMENTOF_CHECK = makeKeyword("REMOVAL-ELEMENTOF-CHECK");
        $list59 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("FULLY-BOUND"), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND"))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$elementOf <fully-bound> (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog (#$TheSet #$Dog #$Cat))") });
        $REMOVAL_NOT_ELEMENTOF_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-CHECK");
        $list61 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("FULLY-BOUND"), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND"))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$elementOf <fully-bound> (#$TheSet . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$Bird (#$TheSet #$Dog #$Cat)))") });
        $REMOVAL_ELEMENTOF_COLLECTION_CHECK = makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-CHECK");
        $list63 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("FORT"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fort> <fort>)\n where <fort> is a collection "), makeKeyword("EXAMPLE"),
                makeString("(#$elementOf #$Dog #$Collection)") });
        $REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK = makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK");
        $list65 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> <fort>)\n where <fort> is a collection"), makeKeyword("EXAMPLE"),
                makeString("(#$elementOf 42 #$Integer))\nvia passing a #$defnIff or a #$defnSufficient") });
        $REMOVAL_ELEMENTOF_SET_CHECK = makeKeyword("REMOVAL-ELEMENTOF-SET-CHECK");
        $list67 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("elementOf")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("COLLECTION-P"))))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"),
                makeKeyword("COMPLETE-PATTERN"), list(makeKeyword("TEST"), makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ELEMENTOF-SET-CHECK-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"),
                list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> <fort>)\n where <fort> is fort set but not a collection"), makeKeyword("EXAMPLE"),
                makeString("(#$elementOf #$GrayColor #$BlackAndWhiteColorScheme) \nvia the KB assertion (#$elementOf #$GrayColor #$BlackAndWhiteColorScheme)") });
        $REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK");
        $list69 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("FORT"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fort> <fort>))\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$elementOf #$Dog #$Predicate))") });
        $REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK");
        $list71 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> <fort>))\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$elementOf 42 #$SubLString))\nvia failing a #$defnIff or a #$defnNecessary") });
        $REMOVAL_NOT_ELEMENTOF_SET_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-SET-CHECK");
        $list73 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("elementOf")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("COLLECTION-P"))))), makeKeyword("COST"), makeSymbol("REMOVAL-NOT-ELEMENTOF-SET-CHECK-COST"),
                makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NOT-ELEMENTOF-SET-CHECK-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NOT-ELEMENTOF-SET-CHECK-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$elementOf <fully-bound> <fort>))\nwhere <fort> is a set but not a collection"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))\nvia the KB assertion\n (#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))") });
        $OPAQUE = makeKeyword("OPAQUE");
        $REMOVAL_ELEMENTOF_THESETOF_CHECK = makeKeyword("REMOVAL-ELEMENTOF-THESETOF-CHECK");
        $list76 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("FULLY-BOUND"), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND"))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-THESETOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>))"),
                makeKeyword("EXAMPLE"), makeString("(#$elementOf #$France \n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))") });
        $REMOVAL_ISA_THECOLLECTIONOF_CHECK = makeKeyword("REMOVAL-ISA-THECOLLECTIONOF-CHECK");
        $list78 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("TheCollectionOf")), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-ALL-INSTANCES")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-THECOLLECTIONOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>))"),
                makeKeyword("EXAMPLE"), makeString("(#$isa #$France \n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))") });
        $QUERY = makeKeyword("QUERY");
        $REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK");
        $list81 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("FULLY-BOUND"), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND"))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*INFERENCE-RECURSIVE-QUERY-OVERHEAD*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>)))"),
                makeKeyword("EXAMPLE"), makeString("(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$bordersOn ?COUNTRY #$Germany))))") });
        $REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK = makeKeyword("REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK");
        $list83 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("TheCollectionOf")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*INFERENCE-RECURSIVE-QUERY-OVERHEAD*"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"),
                makeString("(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$politiesBorderEachOther ?COUNTRY #$Germany))))") });
        $REMOVAL_ALL_ELEMENTOF = makeKeyword("REMOVAL-ALL-ELEMENTOF");
        $list85 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-ELEMENTOF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$elementOf #$Dog ?WHAT)") });
        $REMOVAL_NAT_ALL_ELEMENTOF = makeKeyword("REMOVAL-NAT-ALL-ELEMENTOF");
        $list87 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ALL-ELEMENTOF-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$elementOf (<fully-bound> . <fully-bound>) <not fully-bound>)\nvia #$resultIsa and #$resultIsaArg"), makeKeyword("EXAMPLE"), makeString("(#$elementOf (#$JuvenileFn #$Cougar) ?WHAT)") });
        $list88 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));
        $list89 = cons(makeSymbol("THESET"), makeSymbol("ELEMENTS"));
        $REMOVAL_ELEMENTOF_UNIFY = makeKeyword("REMOVAL-ELEMENTOF-UNIFY");
        $list91 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("NOT-FULLY-BOUND"), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-ELEMENTOF-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$elementOf <not fully-bound> (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?WHAT (#$TheSet #$Dog #$Cat))") });
        $REMOVAL_ELEMENTOF_COLLECTION_UNIFY = makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-UNIFY");
        $list93 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("elementOf")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-UNIFY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"),
                makeString("(#$elementOf ?DOG #$Dog)") });
        $REMOVAL_ELEMENTOF_SET_UNIFY = makeKeyword("REMOVAL-ELEMENTOF-SET-UNIFY");
        $list95 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("elementOf")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("COLLECTION-P"))))), makeKeyword("COST"), makeSymbol("REMOVAL-ELEMENTOF-SET-UNIFY-COST"),
                makeKeyword("COMPLETE-PATTERN"), list(makeKeyword("TEST"), makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ELEMENTOF-SET-UNIFY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"),
                list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is not a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?ELEM #$BlackAndWhiteColorScheme)") });
        $sym96$EL_LITERAL_P = makeSymbol("EL-LITERAL-P");
        $HL = makeKeyword("HL");
        $REMOVAL_ELEMENTOF_THESETOF_UNIFY = makeKeyword("REMOVAL-ELEMENTOF-THESETOF-UNIFY");
        $list99 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("elementOf")), makeKeyword("NOT-FULLY-BOUND"), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-THESETOF-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> (#$TheSetOf <variable> <fully-bound>))"),
                makeKeyword("EXAMPLE"), makeString("(#$elementOf ?WHAT\n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))") });
        $REMOVAL_ISA_THECOLLECTIONOF_UNIFY = makeKeyword("REMOVAL-ISA-THECOLLECTIONOF-UNIFY");
        $list101 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("TheCollectionOf")), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-ALL-INSTANCES")),
                makeKeyword("COST"), makeSymbol("REMOVAL-ISA-THECOLLECTIONOF-UNIFY-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-THECOLLECTIONOF-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$TheCollectionOf <variable> <fully-bound>))"),
                makeKeyword("EXAMPLE"), makeString("(#$isa ?WHAT\n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))") });
        $$TheSetOf = makeConstSym(("TheSetOf"));
        $$subcollectionFunctionDefiningRule = makeConstSym(("subcollectionFunctionDefiningRule"));
        $str104$Expected__s_to_have_only_one_free = makeString("Expected ~s to have only one free variable");
        $str105$Expected_exactly_one_poslit_in__S = makeString("Expected exactly one poslit in ~S");
        $str106$Expected_exactly_one___termOfUnit = makeString("Expected exactly one #$termOfUnit neglit in ~S");
        $list107 = list(makeConstSym(("SubcollectionOfWithRelationToFn")), makeConstSym(("SubcollectionOfWithRelationFromFn")), makeConstSym(("SubcollectionOfWithRelationToTypeFn")), makeConstSym(("SubcollectionOfWithRelationFromTypeFn")), makeConstSym(("SubcollectionOccursAtFn")),
                makeConstSym(("CollectionSubsetFn")), makeConstSym(("CollectionIntersection2Fn")), makeConstSym(("CollectionDifferenceFn")));
        $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-FN-UNIFY");
        $list109 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("SubcollectionOfWithRelationToFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))") });
        $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-FN-CHECK");
        $list111 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("SubcollectionOfWithRelationToFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))") });
        $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-FN-UNIFY");
        $list113 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("SubcollectionOfWithRelationFromFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))") });
        $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-FN-CHECK");
        $list115 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("SubcollectionOfWithRelationFromFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))") });
        $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-TYPE-FN-UNIFY");
        $list117 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("SubcollectionOfWithRelationToTypeFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))") });
        $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-TYPE-FN-CHECK");
        $list119 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("SubcollectionOfWithRelationToTypeFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))") });
        $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-TYPE-FN-UNIFY");
        $list121 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("SubcollectionOfWithRelationFromTypeFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))") });
        $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-TYPE-FN-CHECK");
        $list123 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("SubcollectionOfWithRelationFromTypeFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))") });
        $REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OCCURS-AT-FN-UNIFY");
        $list125 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("SubcollectionOccursAtFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))") });
        $REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OCCURS-AT-FN-CHECK");
        $list127 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("SubcollectionOccursAtFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))") });
        $REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY = makeKeyword("REMOVAL-ISA-COLLECTION-SUBSET-FN-UNIFY");
        $list129 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("CollectionSubsetFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-COLLECTION-SUBSET-FN-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionSubsetFn . <fully-bound>))") });
        $REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK = makeKeyword("REMOVAL-ISA-COLLECTION-SUBSET-FN-CHECK");
        $list131 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("CollectionSubsetFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionSubsetFn . <fully-bound>))") });
        $REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY = makeKeyword("REMOVAL-ISA-COLLECTION-INTERSECTION-2-FN-UNIFY");
        $list133 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("CollectionIntersection2Fn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))") });
        $REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK = makeKeyword("REMOVAL-ISA-COLLECTION-INTERSECTION-2-FN-CHECK");
        $list135 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("CollectionIntersection2Fn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))") });
        $REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY = makeKeyword("REMOVAL-ISA-COLLECTION-DIFFERENCE-FN-UNIFY");
        $list137 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("CollectionDifferenceFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionDifferenceFn . <fully-bound>))") });
        $REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK = makeKeyword("REMOVAL-ISA-COLLECTION-DIFFERENCE-FN-CHECK");
        $list139 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(makeConstSym(("CollectionDifferenceFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionDifferenceFn . <fully-bound>))") });
        $REMOVAL_ALL_ISA_OF_TYPE = makeKeyword("REMOVAL-ALL-ISA-OF-TYPE");
        $list141 = list(new SubLObject[] { makeKeyword("EVERY-PREDICATES"), list(makeConstSym(("isa"))), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY"), makeKeyword("COMPLETENESS-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(NIL, list(list(list(makeKeyword("BIND"), makeSymbol("MT-1")), list(makeKeyword("BIND"), makeSymbol("ASENT-1"))), list(list(makeKeyword("BIND"), makeSymbol("MT-2")), list(makeKeyword("BIND"), makeSymbol("ASENT-2"))))),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-COMPLETENESS"), list(makeKeyword("VALUE"), makeSymbol("ASENT-1")), list(makeKeyword("VALUE"), makeSymbol("MT-1")), list(makeKeyword("VALUE"), makeSymbol("ASENT-2")),
                                list(makeKeyword("VALUE"), makeSymbol("MT-2")))),
                makeKeyword("COST"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$isa <fort1> <varN>)\n           (#$isa <varN> <fort2>))"), makeKeyword("EXAMPLE"),
                makeString("(#$and (#$isa #$AbrahamLincoln ?OCCUPATION)\n           (#$isa ?OCCUPATION #$PersonTypeByOccupation))") });
        $sym142$BINARY_CLAUSE_P = makeSymbol("BINARY-CLAUSE-P");
        $list143 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $sym144$FORT_P = makeSymbol("FORT-P");
        $list145 = list(makeSymbol("CONTEXTUALIZED-ASENT0"), makeSymbol("CONTEXTUALIZED-ASENT1"));
        $list146 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));
        $list147 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));
        $$quotedIsa = makeConstSym(("quotedIsa"));
        $ALL_QUOTED_INSTANCES_POS = makeKeyword("ALL-QUOTED-INSTANCES-POS");
        $list150 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("quotedIsa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE"),
                makeSymbol("ALL-QUOTED-INSTANCES-POS-PREFERENCE"));
        $ALL_QUOTED_ISA_POS = makeKeyword("ALL-QUOTED-ISA-POS");
        $list152 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("quotedIsa")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("DISPREFERRED"));
        $REMOVAL_QUOTED_ISA_COLLECTION_CHECK_POS = makeKeyword("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS");
        $list154 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("quotedIsa")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fort> <fort>)") });
        $REMOVAL_QUOTED_ISA_COLLECTION_CHECK_NEG = makeKeyword("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG");
        $list156 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("quotedIsa")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$quotedIsa <fort> <fort>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$quotedIsa #$Dog #$Predicate))") });
        $REMOVAL_QUOTED_ISA_DEFN_POS = makeKeyword("REMOVAL-QUOTED-ISA-DEFN-POS");
        $list158 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("quotedIsa")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("REQUIRED"),
                makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$quotedIsa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa 42 #$SubLInteger)") });
        $REMOVAL_QUOTED_ISA_DEFN_NEG = makeKeyword("REMOVAL-QUOTED-ISA-DEFN-NEG");
        $list160 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("quotedIsa")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-QUOTED-ISA-DEFN-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$quotedIsa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$quotedIsa 42 #$SubLString))") });
        $REMOVAL_NAT_QUOTED_ISA = makeKeyword("REMOVAL-NAT-QUOTED-ISA");
        $list162 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("quotedIsa")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-QUOTED-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa (<fully-bound> . <fully-bound>) <fort>)") });
        $REMOVAL_ALL_QUOTED_ISA = makeKeyword("REMOVAL-ALL-QUOTED-ISA");
        $list164 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("quotedIsa")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-QUOTED-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa #$Dog ?COL)") });
        $REMOVAL_NAT_ALL_QUOTED_ISA = makeKeyword("REMOVAL-NAT-ALL-QUOTED-ISA");
        $list166 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("quotedIsa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("quotedIsa")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ALL-QUOTED-ISA-EXPAND"),
                makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa (<fully-bound> . <fully-bound>) <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa (#$JuvenileFn #$Cougar) ?COL)") });
        $REMOVAL_ALL_QUOTED_INSTANCES = makeKeyword("REMOVAL-ALL-QUOTED-INSTANCES");
        $list168 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("quotedIsa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ALL-QUOTED-INSTANCES-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-QUOTED-INSTANCES-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("quotedIsa")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-QUOTED-INSTANCES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("quotedIsa")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <not fully-bound> <fort>)") });
    }

    public static class $removal_isa_collection_check_pos_cost$UnaryFunction extends UnaryFunction {
        public $removal_isa_collection_check_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-ISA-COLLECTION-CHECK-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_isa_collection_check_pos_cost(arg1, $removal_isa_collection_check_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_isa_collection_check_pos_cost$BinaryFunction extends BinaryFunction {
        public $removal_isa_collection_check_pos_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-ISA-COLLECTION-CHECK-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_isa_collection_check_pos_cost(arg1, arg2);
        }
    }

    public static class $removal_all_instances_cost$UnaryFunction extends UnaryFunction {
        public $removal_all_instances_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-ALL-INSTANCES-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_all_instances_cost(arg1, $removal_all_instances_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_all_instances_cost$BinaryFunction extends BinaryFunction {
        public $removal_all_instances_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-ALL-INSTANCES-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_all_instances_cost(arg1, arg2);
        }
    }

    public static class $removal_all_instances_completeness$UnaryFunction extends UnaryFunction {
        public $removal_all_instances_completeness$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-ALL-INSTANCES-COMPLETENESS"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_all_instances_completeness(arg1);
        }
    }

    public static class $removal_elementof_check_expand$UnaryFunction extends UnaryFunction {
        public $removal_elementof_check_expand$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-ELEMENTOF-CHECK-EXPAND"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_elementof_check_expand(arg1, $removal_elementof_check_expand$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_elementof_check_expand$BinaryFunction extends BinaryFunction {
        public $removal_elementof_check_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-ELEMENTOF-CHECK-EXPAND"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_elementof_check_expand(arg1, arg2);
        }
    }

    public static class $removal_all_isa_of_type_applicability$UnaryFunction extends UnaryFunction {
        public $removal_all_isa_of_type_applicability$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_all_isa_of_type_applicability(arg1);
        }
    }

    public static class $removal_quoted_isa_collection_check_pos_cost$UnaryFunction extends UnaryFunction {
        public $removal_quoted_isa_collection_check_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_quoted_isa_collection_check_pos_cost(arg1, $removal_quoted_isa_collection_check_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_quoted_isa_collection_check_pos_cost$BinaryFunction extends BinaryFunction {
        public $removal_quoted_isa_collection_check_pos_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_quoted_isa_collection_check_pos_cost(arg1, arg2);
        }
    }

    public static class $removal_quoted_isa_collection_check_pos_expand$UnaryFunction extends UnaryFunction {
        public $removal_quoted_isa_collection_check_pos_expand$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_quoted_isa_collection_check_pos_expand(arg1, $removal_quoted_isa_collection_check_pos_expand$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_quoted_isa_collection_check_pos_expand$BinaryFunction extends BinaryFunction {
        public $removal_quoted_isa_collection_check_pos_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_quoted_isa_collection_check_pos_expand(arg1, arg2);
        }
    }

    public static class $removal_quoted_isa_defn_pos_required$UnaryFunction extends UnaryFunction {
        public $removal_quoted_isa_defn_pos_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_quoted_isa_defn_pos_required(arg1, $removal_quoted_isa_defn_pos_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_quoted_isa_defn_pos_required$BinaryFunction extends BinaryFunction {
        public $removal_quoted_isa_defn_pos_required$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_quoted_isa_defn_pos_required(arg1, arg2);
        }
    }
}
/*
 *
 * Total time: 925 ms
 *
 */