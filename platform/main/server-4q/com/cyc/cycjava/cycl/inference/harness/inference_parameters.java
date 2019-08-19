package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.proof_view;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.modules.transformation_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_parameters extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_parameters";
    public static String myFingerPrint = "e5b9b94ec29269dddbc0da7cbbafa4c9115167d6bd9980415cdfff340c9ad69e";
    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 7100L)
    private static SubLSymbol $gather_inference_answer_query_properties$;
    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 8500L)
    private static SubLSymbol $boolean_query_properties_to_include_on_merge$;
    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 9500L)
    private static SubLSymbol $query_properties_efficiency_hierarchy$;
    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 11100L)
    private static SubLSymbol $numeric_query_properties$;
    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 11500L)
    private static SubLSymbol $numeric_query_properties_that_max_out_at_positive_infinity$;
    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 22700L)
    private static SubLSymbol $proof_query_properties_to_override$;
    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 32700L)
    private static SubLSymbol $inference_mode_query_properties_table$;
    private static SubLSymbol $UNSPECIFIED;
    private static SubLSymbol $CONDITIONAL_SENTENCE_;
    private static SubLObject $$BaseKB;
    private static SubLSymbol $sym3$QUERY_PROPERTIES_P;
    private static SubLSymbol $INFERENCE_MODE;
    private static SubLSymbol $CUSTOM;
    private static SubLList $list6;
    private static SubLList $list7;
    private static SubLList $list8;
    private static SubLSymbol $sym9$CAR;
    private static SubLList $list10;
    private static SubLList $list11;
    private static SubLString $str12$Invalid_value_for_the_properties_;
    private static SubLString $str13$unexpected_property__s;
    private static SubLSymbol $sym14$PROBLEM_STORE_P;
    private static SubLSymbol $UNDETERMINED;
    private static SubLList $list16;
    private static SubLList $list17;
    private static SubLSymbol $BINDINGS;
    private static SubLSymbol $MAX_PROBLEM_COUNT;
    private static SubLSymbol $MAX_TIME;
    private static SubLSymbol $MAX_STEP;
    private static SubLSymbol $PROBABLY_APPROXIMATELY_DONE;
    private static SubLFloat $float$1_0;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $ILL_FORMED;
    private static SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL;
    private static SubLSymbol $MAX_NUMBER;
    private static SubLFloat $float$1_1;
    private static SubLSymbol $ALLOW_INDETERMINATE_RESULTS_;
    private static SubLSymbol $ANSWER_LANGUAGE;
    private static SubLSymbol $HL;
    private static SubLSymbol $EL;
    private static SubLList $list33;
    private static SubLSymbol $sym34$HL_SUPPORT_P;
    private static SubLSymbol $PRODUCTIVITY_LIMIT;
    private static SubLSymbol $MAX_TRANSFORMATION_DEPTH;
    private static SubLSymbol $TRANSFORMATION_ALLOWED_;
    private static SubLSymbol $ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $REWRITE_ALLOWED_;
    private static SubLSymbol $ABDUCTION_ALLOWED_;
    private static SubLSymbol $ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $TRANS_ISA_POS;
    private static SubLSymbol $ALLOW_HL_PREDICATE_TRANSFORMATION_;
    private static SubLSymbol $REMOVAL_TVA_UNIFY_CLOSURE;
    private static SubLSymbol $TRANSITIVE_CLOSURE_MODE;
    private static SubLSymbol $EVALUATE_SUBL_ALLOWED_;
    private static SubLSymbol $NEW_TERMS_ALLOWED_;
    private static SubLSymbol $MINIMIZE;
    private static SubLSymbol $NEGATION_BY_FAILURE_;
    private static SubLSymbol $ABNORMAL;
    private static SubLSymbol $ALLOW_ABNORMALITY_CHECKING_;
    private static SubLSymbol $COMPLETENESS_MINIMIZATION_ALLOWED_;
    private static SubLSymbol $MAX_PROOF_DEPTH;
    private static SubLList $list54;
    private static SubLSymbol $sym55$QUERY_PROPERTIES_MORE_EFFICIENT_;
    private static SubLSymbol $sym56$QUERY_PROPERTIES_LESS_EFFICIENT_;
    private static SubLList $list57;
    private static SubLSymbol $sym58$INFERENCE_MODE_P;
    private static SubLSymbol $MIN_RULE_UTILITY;
    private static SubLSymbol $sym60$INFERENCE_MERGE_QUERY_PROPERTIES;
    private static SubLSymbol $TEST;
    private static SubLSymbol $OWNER;
    private static SubLSymbol $CLASSES;
    private static SubLSymbol $KB;
    private static SubLSymbol $TINY;
    private static SubLSymbol $WORKING_;
    private static SubLList $list67;

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 1300L)
    public static SubLObject explicify_inference_engine_query_property_defaults(SubLObject query_properties) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject explicified_query_properties = NIL;
        SubLObject strengthened_query_properties = inference_strategist.explicify_inference_mode_defaults(query_properties);
        SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_query_properties();
        SubLObject query_property = NIL;
        query_property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_default = inference_datastructures_enumerated_types.inference_engine_default_for_property(query_property);
            SubLObject default_specifiedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject current = conses_high.getf(strengthened_query_properties, query_property, $UNSPECIFIED);
            if (current != $UNSPECIFIED) {
                explicified_query_properties = conses_high.putf(explicified_query_properties, query_property, current);
            } else if (NIL != default_specifiedP) {
                explicified_query_properties = conses_high.putf(explicified_query_properties, query_property, v_default);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_property = cdolist_list_var.first();
        }
        return explicified_query_properties;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 2500L)
    public static SubLObject explicify_query_tool_query_property_defaults(SubLObject query_properties, SubLObject sentence) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject explicified_query_properties = NIL;
        SubLObject strengthened_query_properties = inference_strategist.explicify_inference_mode_defaults(query_properties);
        SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_query_properties();
        SubLObject query_property = NIL;
        query_property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_default = cb_query.query_tool_default_for_property(query_property);
            SubLObject default_specifiedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ($CONDITIONAL_SENTENCE_ == query_property) {
                thread.resetMultipleValues();
                SubLObject right_sentence = czer_utilities.unwrap_if_ist_permissive(sentence, $$BaseKB);
                SubLObject right_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != el_utilities.el_implication_p(right_sentence)) {
                    v_default = T;
                    default_specifiedP = T;
                }
            }
            SubLObject current = conses_high.getf(strengthened_query_properties, query_property, $UNSPECIFIED);
            if (current != $UNSPECIFIED) {
                explicified_query_properties = conses_high.putf(explicified_query_properties, query_property, current);
            } else if (NIL != default_specifiedP) {
                explicified_query_properties = conses_high.putf(explicified_query_properties, query_property, v_default);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_property = cdolist_list_var.first();
        }
        return explicified_query_properties;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 4000L)
    public static SubLObject remove_inference_engine_query_property_defaults(SubLObject query_properties) {
        SubLObject implicified_query_properties = NIL;
        SubLObject weakened_query_properties = inference_strategist.implicify_inference_mode_defaults(query_properties);
        SubLObject remainder;
        SubLObject query_property;
        SubLObject value;
        for (remainder = NIL, remainder = weakened_query_properties; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            query_property = remainder.first();
            value = conses_high.cadr(remainder);
            if (!value.equal(inference_datastructures_enumerated_types.inference_engine_default_for_property(query_property))) {
                implicified_query_properties = conses_high.putf(implicified_query_properties, query_property, value);
            }
        }
        return implicified_query_properties;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 4800L)
    public static SubLObject inference_merge_query_properties(SubLObject query_properties_1, SubLObject query_properties_2) {
        assert NIL != inference_datastructures_enumerated_types.query_properties_p(query_properties_1) : query_properties_1;
        assert NIL != inference_datastructures_enumerated_types.query_properties_p(query_properties_2) : query_properties_2;
        SubLObject mode1 = inference_datastructures_enumerated_types.inference_query_property_lookup(query_properties_1, $INFERENCE_MODE);
        SubLObject mode2 = inference_datastructures_enumerated_types.inference_query_property_lookup(query_properties_2, $INFERENCE_MODE);
        if (!makeBoolean(mode1 != $CUSTOM).eql(makeBoolean(mode2 != $CUSTOM))) {
            query_properties_1 = inference_strategist.explicify_inference_mode_defaults(query_properties_1);
            query_properties_2 = inference_strategist.explicify_inference_mode_defaults(query_properties_2);
        }
        SubLObject relevant_properties = union_plist_properties(query_properties_1, query_properties_2);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = relevant_properties;
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject value1 = inference_datastructures_enumerated_types.inference_query_property_lookup(query_properties_1, property);
            SubLObject value2 = inference_datastructures_enumerated_types.inference_query_property_lookup(query_properties_2, property);
            SubLObject conservative_value = inference_conservatively_select_property_value_for_merge(property, value1, value2);
            result = conses_high.putf(result, property, conservative_value);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        result = list_utilities.sort_plist_via_position(result, inference_datastructures_enumerated_types.all_query_properties(), UNPROVIDED);
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 6500L)
    public static SubLObject union_plist_properties(SubLObject plist1, SubLObject plist2) {
        return conses_high.nunion(list_utilities.plist_properties(plist1), list_utilities.plist_properties(plist2), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 6800L)
    public static SubLObject inference_conservatively_select_property_value_for_merge(SubLObject property, SubLObject value1, SubLObject value2) {
        if (NIL != boolean_query_property_to_include_on_mergeP(property)) {
            return makeBoolean(NIL != value1 || NIL != value2);
        }
        return (NIL != query_property_value_at_least_as_completeP(property, value1, value2)) ? value1 : value2;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 8300L)
    public static SubLObject gather_inference_answer_query_propertyP(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $gather_inference_answer_query_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 8400L)
    public static SubLObject gather_inference_answer_query_properties() {
        return conses_high.copy_list($gather_inference_answer_query_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 9400L)
    public static SubLObject boolean_query_property_to_include_on_mergeP(SubLObject property) {
        return list_utilities.member_eqP(property, $boolean_query_properties_to_include_on_merge$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 10800L)
    public static SubLObject query_property_in_efficiency_hierarchyP(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $query_properties_efficiency_hierarchy$.getGlobalValue(), Symbols.symbol_function(EQ), Symbols.symbol_function($sym9$CAR));
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 11000L)
    public static SubLObject query_properties_efficiency_hierarchy() {
        return conses_high.copy_alist($query_properties_efficiency_hierarchy$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 11800L)
    public static SubLObject numeric_query_properties() {
        return conses_high.copy_list($numeric_query_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 11900L)
    public static SubLObject numeric_query_property_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $numeric_query_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 12000L)
    public static SubLObject numeric_query_property_max(SubLObject numeric_query_property) {
        if (NIL != list_utilities.member_eqP(numeric_query_property, $numeric_query_properties_that_max_out_at_positive_infinity$.getGlobalValue())) {
            return number_utilities.positive_infinity();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 12200L)
    public static SubLObject query_property_value_more_efficientP(SubLObject property, SubLObject value1, SubLObject value2) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.member_eqP(property, $numeric_query_properties$.getGlobalValue())) {
            if (NIL == value1) {
                value1 = number_utilities.positive_infinity();
            }
            if (NIL == value2) {
                value2 = number_utilities.positive_infinity();
            }
            return number_utilities.potentially_infinite_number_L(value1, value2);
        }
        SubLObject hierarchy = list_utilities.alist_lookup($query_properties_efficiency_hierarchy$.getGlobalValue(), property, UNPROVIDED, UNPROVIDED);
        if (NIL != hierarchy) {
            SubLObject value1_rank = Sequences.position(value1, hierarchy, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject value2_rank = Sequences.position(value2, hierarchy, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == value1_rank) {
                Errors.error($str12$Invalid_value_for_the_properties_, property, value1);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == value2_rank) {
                Errors.error($str12$Invalid_value_for_the_properties_, property, value2);
            }
            return Numbers.numL(value1_rank, value2_rank);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 13100L)
    public static SubLObject query_property_value_more_completeP(SubLObject property, SubLObject value1, SubLObject value2) {
        return query_property_value_more_efficientP(property, value2, value1);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 13200L)
    public static SubLObject query_property_value_at_least_as_efficientP(SubLObject property, SubLObject value1, SubLObject value2) {
        return makeBoolean(value1.equal(value2) || NIL != query_property_value_more_efficientP(property, value1, value2));
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 13400L)
    public static SubLObject query_property_value_at_least_as_completeP(SubLObject property, SubLObject value1, SubLObject value2) {
        return makeBoolean(value1.equal(value2) || NIL != query_property_value_more_completeP(property, value1, value2));
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 13600L)
    public static SubLObject most_efficient_value_for_query_property(SubLObject property) {
        if (NIL != query_property_in_efficiency_hierarchyP(property)) {
            SubLObject values = list_utilities.alist_lookup($query_properties_efficiency_hierarchy$.getGlobalValue(), property, UNPROVIDED, UNPROVIDED);
            return values.first();
        }
        if (NIL != numeric_query_property_p(property)) {
            return ZERO_INTEGER;
        }
        return Errors.error($str13$unexpected_property__s, property);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 14000L)
    public static SubLObject most_efficient_value_for_query_propertyP(SubLObject property, SubLObject value) {
        return Equality.equal(value, most_efficient_value_for_query_property(property));
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 14100L)
    public static SubLObject most_complete_value_for_query_property(SubLObject property) {
        if (NIL != query_property_in_efficiency_hierarchyP(property)) {
            SubLObject values = list_utilities.alist_lookup($query_properties_efficiency_hierarchy$.getGlobalValue(), property, UNPROVIDED, UNPROVIDED);
            return list_utilities.last_one(values);
        }
        if (NIL != numeric_query_property_p(property)) {
            return numeric_query_property_max(property);
        }
        return Errors.error($str13$unexpected_property__s, property);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 14500L)
    public static SubLObject most_complete_value_for_query_propertyP(SubLObject property, SubLObject value) {
        return Equality.equal(value, most_complete_value_for_query_property(property));
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 14700L)
    public static SubLObject problem_store_allows_reuse_wrt_query_propertiesP(SubLObject store, SubLObject query_properties) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject problem_store_static_properties = inference_datastructures_enumerated_types.extract_problem_store_static_properties(query_properties);
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = problem_store_static_properties; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            if (NIL == problem_store_allows_reuse_wrt_query_property(store, property, value)) {
                return NIL;
            }
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 15200L)
    public static SubLObject problem_store_allows_reuse_wrt_query_property(SubLObject store, SubLObject query_property, SubLObject value) {
        if (NIL != inference_datastructures_enumerated_types.problem_store_static_property_p(query_property)) {
            SubLObject store_value = inference_utilities.problem_store_property_lookup(store, query_property, $UNDETERMINED);
            if ($UNDETERMINED != store_value && !store_value.equal(value)) {
                if (NIL != boolean_query_property_to_include_on_mergeP(query_property)) {
                    return makeBoolean(NIL == value || NIL != store_value);
                }
                if (NIL != query_property_in_efficiency_hierarchyP(query_property)) {
                    return query_property_value_at_least_as_completeP(query_property, store_value, value);
                }
            }
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 15800L)
    public static SubLObject inference_compute_all_answers_query_properties(SubLObject inference) {
        SubLObject property_sets = inference_compute_inference_answer_query_properties(inference);
        if (NIL == property_sets) {
            return $list16;
        }
        SubLObject current;
        SubLObject datum = current = property_sets;
        SubLObject first = NIL;
        SubLObject rest = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
        first = current.first();
        current = (rest = current.rest());
        SubLObject running_result;
        SubLObject first_query_properties = running_result = conses_high.remf(first, $BINDINGS);
        SubLObject cdolist_list_var = rest;
        SubLObject next = NIL;
        next = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject next_query_properties = conses_high.remf(next, $BINDINGS);
            running_result = inference_merge_query_properties(running_result, next_query_properties);
            cdolist_list_var = cdolist_list_var.rest();
            next = cdolist_list_var.first();
        }
        SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        SubLObject max_problem_count = inference_datastructures_problem_store.problem_store_historical_problem_count(store);
        SubLObject max_time = inference_datastructures_inference.inference_last_answer_elapsed_time(inference);
        SubLObject max_step = inference_datastructures_inference.inference_last_answer_step_count(inference);
        max_time = Numbers.ceiling(max_time, UNPROVIDED);
        running_result = conses_high.putf(running_result, $MAX_PROBLEM_COUNT, max_problem_count);
        running_result = conses_high.putf(running_result, $MAX_TIME, max_time);
        running_result = conses_high.putf(running_result, $MAX_STEP, max_step);
        running_result = conses_high.putf(running_result, $PROBABLY_APPROXIMATELY_DONE, $float$1_0);
        return running_result;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 17500L)
    public static SubLObject inference_compute_some_answer_query_properties(SubLObject inference) {
        return compute_most_efficient_query_properties(inference_compute_inference_answer_query_properties(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 17800L)
    public static SubLObject inference_compute_proof_query_properties(SubLObject inference) {
        return inference_compute_inference_answer_query_properties_int(inference, T);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 17900L)
    public static SubLObject inference_compute_inference_answer_query_properties(SubLObject inference) {
        return inference_compute_inference_answer_query_properties_int(inference, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 18100L)
    public static SubLObject compute_most_complete_query_properties(SubLObject query_properties_list) {
        return compute_extremal_query_properties_int(query_properties_list, T);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 18400L)
    public static SubLObject compute_most_efficient_query_properties(SubLObject query_properties_list) {
        return compute_extremal_query_properties_int(query_properties_list, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 18600L)
    public static SubLObject compute_extremal_query_properties_int(SubLObject query_properties_list, SubLObject most_completeP) {
        SubLObject extremal_properties = NIL;
        SubLObject max_time = ZERO_INTEGER;
        SubLObject max_step = ZERO_INTEGER;
        SubLObject time = NIL;
        SubLObject step = NIL;
        SubLObject cdolist_list_var = conses_high.copy_tree(query_properties_list);
        SubLObject v_properties = NIL;
        v_properties = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            time = conses_high.getf(v_properties, $MAX_TIME, ZERO_INTEGER);
            step = conses_high.getf(v_properties, $MAX_STEP, ZERO_INTEGER);
            conses_high.remf(v_properties, $MAX_TIME);
            conses_high.remf(v_properties, $MAX_STEP);
            if (time.numG(max_time)) {
                max_time = time;
            }
            if (step.numG(max_step)) {
                max_step = step;
            }
            extremal_properties = ((NIL != most_completeP) ? get_least_efficient_query_properties(extremal_properties, v_properties) : get_most_efficient_query_properties(extremal_properties, v_properties));
            cdolist_list_var = cdolist_list_var.rest();
            v_properties = cdolist_list_var.first();
        }
        conses_high.putf(extremal_properties, $MAX_TIME, max_time);
        conses_high.putf(extremal_properties, $MAX_STEP, max_step);
        return conses_high.remf(conses_high.copy_list(extremal_properties), $BINDINGS);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 19600L)
    public static SubLObject inference_compute_inference_answer_query_properties_int(SubLObject inference, SubLObject include_proof_propertiesP) {
        SubLObject inference_answer_query_properties_list = NIL;
        SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$1 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference_answer;
                SubLObject answer_properties;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference_answer = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference_answer)) {
                            inference_answer = $SKIP;
                        }
                        answer_properties = inference_answer_compute_inference_answer_query_properties(inference_answer, inference, include_proof_propertiesP);
                        if (NIL != include_proof_propertiesP) {
                            inference_answer_query_properties_list = nconc(answer_properties, inference_answer_query_properties_list);
                        } else {
                            inference_answer_query_properties_list = cons(answer_properties, inference_answer_query_properties_list);
                        }
                    }
                }
            }
            SubLObject idx_$2 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$2)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$2);
                SubLObject id2 = NIL;
                SubLObject inference_answer2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject answer_properties2 = inference_answer_compute_inference_answer_query_properties(inference_answer2, inference, include_proof_propertiesP);
                        if (NIL != include_proof_propertiesP) {
                            inference_answer_query_properties_list = nconc(answer_properties2, inference_answer_query_properties_list);
                        } else {
                            inference_answer_query_properties_list = cons(answer_properties2, inference_answer_query_properties_list);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sequences.nreverse(inference_answer_query_properties_list);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 20200L)
    public static SubLObject inference_answer_compute_inference_answer_query_properties(SubLObject inference_answer, SubLObject inference, SubLObject include_proof_propertiesP) {
        SubLObject proof_properties_list = compute_proof_query_properties_list(inference_answer, inference);
        SubLObject answer_properties = inference_answer_compute_inference_answer_query_properties_int(proof_properties_list, inference_answer);
        if (NIL == include_proof_propertiesP) {
            return answer_properties;
        }
        return distribute_answer_properties_over_proof_properties_list(answer_properties, proof_properties_list);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 20700L)
    public static SubLObject inference_answer_compute_inference_answer_query_properties_int(SubLObject proof_properties_list, SubLObject inference_answer) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answer_properties = most_efficient_query_properties(proof_properties_list);
        SubLObject store = inference_datastructures_inference.inference_answer_problem_store(inference_answer);
        SubLObject rejected_proofs = NIL;
        SubLObject doneP = NIL;
        if (NIL != inference_datastructures_problem_store.problem_store_some_rejected_proofsP(store)) {
            rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(rejected_proofs)); NIL == doneP
                    && NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                SubLObject proof = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (reason == $ILL_FORMED) {
                    answer_properties = conses_high.putf(answer_properties, $INTERMEDIATE_STEP_VALIDATION_LEVEL, inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(store));
                    doneP = T;
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        answer_properties = conses_high.putf(answer_properties, $MAX_NUMBER, Numbers.add(ONE_INTEGER, inference_datastructures_inference.inference_answer_suid(inference_answer)));
        SubLObject elapsed_time = Numbers.add(ONE_INTEGER, Numbers.multiply($float$1_1, inference_datastructures_inference.inference_answer_elapsed_time(inference_answer, NIL)));
        SubLObject pad = inference_datastructures_inference.compute_pad_from_time(elapsed_time);
        answer_properties = conses_high.putf(answer_properties, $MAX_TIME, elapsed_time);
        if (NIL != pad) {
            answer_properties = conses_high.putf(answer_properties, $PROBABLY_APPROXIMATELY_DONE, pad);
        }
        SubLObject total_steps = inference_datastructures_inference.inference_answer_step_count(inference_answer);
        answer_properties = conses_high.putf(answer_properties, $MAX_STEP, total_steps);
        SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
        if (NIL != inference_strategist.some_answer_bindings_are_indeterminateP(v_bindings)) {
            answer_properties = conses_high.putf(answer_properties, $ALLOW_INDETERMINATE_RESULTS_, T);
        }
        if (NIL != inference_strategist.some_answer_bindings_are_hlP(v_bindings)) {
            answer_properties = conses_high.putf(answer_properties, $ANSWER_LANGUAGE, $HL);
        } else {
            answer_properties = conses_high.putf(answer_properties, $ANSWER_LANGUAGE, $EL);
        }
        answer_properties = conses_high.putf(answer_properties, $BINDINGS, v_bindings);
        return answer_properties;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 23100L)
    public static SubLObject distribute_answer_properties_over_proof_properties_list(SubLObject answer_properties, SubLObject proof_properties_list) {
        SubLObject new_proof_properties_list = NIL;
        SubLObject cdolist_list_var = proof_properties_list;
        SubLObject proof_properties = NIL;
        proof_properties = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            proof_properties = conses_high.copy_list(proof_properties);
            SubLObject cdolist_list_var_$3 = $proof_query_properties_to_override$.getGlobalValue();
            SubLObject property = NIL;
            property = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                SubLObject overriding_value = conses_high.getf(answer_properties, property, UNPROVIDED);
                proof_properties = conses_high.putf(proof_properties, property, overriding_value);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                property = cdolist_list_var_$3.first();
            }
            new_proof_properties_list = cons(proof_properties, new_proof_properties_list);
            cdolist_list_var = cdolist_list_var.rest();
            proof_properties = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_proof_properties_list);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 23700L)
    public static SubLObject compute_proof_query_properties_list(SubLObject inference_answer, SubLObject inference) {
        SubLObject proof_properties_list = NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
            SubLObject proof = NIL;
            proof = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                SubLObject proof_properties = proof_query_properties(proof, prepare_proof_query_properties(), inference);
                proof_properties_list = cons(proof_properties, proof_properties_list);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                proof = cdolist_list_var_$4.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return proof_properties_list;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 24400L)
    public static SubLObject proof_query_properties(SubLObject proof, SubLObject v_properties, SubLObject inference) {
        SubLObject v_hl_supports = list_utilities.tree_gather(inference_datastructures_proof.proof_supports(proof), Symbols.symbol_function($sym34$HL_SUPPORT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject link = inference_datastructures_proof.proof_link(proof);
        SubLObject tactic = NIL;
        SubLObject problem = NIL;
        SubLObject hl_module = NIL;
        SubLObject module_name = NIL;
        if (NIL != inference_worker.content_link_p(link)) {
            tactic = inference_worker.content_link_tactic(link);
        } else if (NIL != inference_worker.connected_conjunction_link_p(link)) {
            tactic = inference_worker.connected_conjunction_link_tactic(link);
        }
        problem = (NIL != tactic) ? inference_datastructures_tactic.tactic_problem(tactic) : NIL;
        hl_module = (NIL != tactic) ? inference_datastructures_tactic.tactic_hl_module(tactic) : NIL;
        module_name = (NIL != hl_module) ? inference_modules.hl_module_name(hl_module) : NIL;
        if (NIL != problem) {
            SubLObject max_problem_id = conses_high.getf(v_properties, $MAX_PROBLEM_COUNT, UNPROVIDED);
            SubLObject problem_id = Numbers.add(TWO_INTEGER, inference_datastructures_problem.problem_suid(problem));
            if (problem_id.numG(max_problem_id)) {
                v_properties = conses_high.putf(v_properties, $MAX_PROBLEM_COUNT, problem_id);
            }
        }
        if (NIL != tactic) {
            SubLObject max_productivity_limit = conses_high.getf(v_properties, $PRODUCTIVITY_LIMIT, UNPROVIDED);
            SubLObject tactic_productivity = inference_datastructures_tactic.tactic_original_productivity(tactic);
            if (NIL != list_utilities.safe_G(tactic_productivity, max_productivity_limit)) {
                v_properties = conses_high.putf(v_properties, $PRODUCTIVITY_LIMIT, tactic_productivity);
            }
            if (NIL != problem && NIL != hl_module && NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                SubLObject trans_tactic = NIL;
                trans_tactic = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(trans_tactic, hl_module) && NIL != inference_worker_transformation.transformation_tactic_p(trans_tactic) && NIL == inference_worker_transformation.transformation_rule_tactic_p(trans_tactic)) {
                        SubLObject max_productivity_limit2 = conses_high.getf(v_properties, $PRODUCTIVITY_LIMIT, UNPROVIDED);
                        SubLObject tactic_productivity2 = inference_datastructures_tactic.tactic_original_productivity(trans_tactic);
                        if (tactic_productivity2.numG(max_productivity_limit2)) {
                            v_properties = conses_high.putf(v_properties, $PRODUCTIVITY_LIMIT, tactic_productivity2);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    trans_tactic = cdolist_list_var.first();
                }
            }
        }
        SubLObject transformation_linkP = inference_worker_transformation.transformation_link_p(link);
        if (NIL != transformation_linkP || NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            v_properties = conses_high.putf(v_properties, $MAX_TRANSFORMATION_DEPTH, Numbers.add(inference_worker.transformation_depth_increment(link, inference), conses_high.getf(v_properties, $MAX_TRANSFORMATION_DEPTH, UNPROVIDED)));
            v_properties = conses_high.putf(v_properties, $TRANSFORMATION_ALLOWED_, T);
        }
        if (NIL != transformation_linkP && NIL != problem && NIL != inference_tactician_strategic_uninterestingness.problem_uses_hl_predicateP(problem)) {
            v_properties = conses_high.putf(v_properties, $ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, T);
        }
        if (NIL != inference_worker_rewrite.rewrite_link_p(link)) {
            v_properties = conses_high.putf(v_properties, $REWRITE_ALLOWED_, T);
        }
        if (NIL != hl_module) {
            if (NIL != removal_modules_abduction.abductive_removal_moduleP(module_name)) {
                v_properties = conses_high.putf(v_properties, $ABDUCTION_ALLOWED_, T);
            }
            if (NIL != transformation_modules.module_requires_unbound_predicate_transformationP(module_name)) {
                v_properties = conses_high.putf(v_properties, $ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, T);
            }
            if (NIL != transformation_modules.module_requires_hl_predicate_transformationP(module_name)
                    && ($TRANS_ISA_POS != module_name || NIL == inference_tactician_strategic_uninterestingness.problem_uses_hl_predicateP(problem) || NIL == inference_tactician_strategic_uninterestingness.collection_backchain_encouraged_problemP(problem))) {
                v_properties = conses_high.putf(v_properties, $ALLOW_HL_PREDICATE_TRANSFORMATION_, T);
            }
            if (NIL != removal_modules_abduction.abductive_removal_moduleP(module_name)) {
                v_properties = conses_high.putf(v_properties, $ABDUCTION_ALLOWED_, T);
            }
            if ($REMOVAL_TVA_UNIFY_CLOSURE == module_name) {
                v_properties = conses_high.putf(v_properties, $TRANSITIVE_CLOSURE_MODE, inference_datastructures_inference.inference_transitive_closure_mode(inference));
            }
            if (NIL != removal_module_utilities.module_requires_evaluate_sublP(module_name)) {
                v_properties = conses_high.putf(v_properties, $EVALUATE_SUBL_ALLOWED_, T);
            }
            if (NIL != removal_module_utilities.module_requires_new_terms_allowedP(module_name)) {
                v_properties = conses_high.putf(v_properties, $NEW_TERMS_ALLOWED_, T);
            }
            SubLObject cdolist_list_var = v_hl_supports;
            SubLObject hl_support = NIL;
            hl_support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject hl_support_module = arguments.hl_support_module(hl_support);
                if (hl_support_module == $MINIMIZE && NIL != removal_module_utilities.module_requires_negation_by_failureP(module_name)) {
                    v_properties = conses_high.putf(v_properties, $NEGATION_BY_FAILURE_, T);
                }
                if (hl_support_module == $ABNORMAL) {
                    v_properties = conses_high.putf(v_properties, $ALLOW_ABNORMALITY_CHECKING_, T);
                }
                if (NIL != removal_module_utilities.module_requires_completeness_minimization_for_supportP(module_name, hl_support_module)) {
                    v_properties = conses_high.putf(v_properties, $COMPLETENESS_MINIMIZATION_ALLOWED_, T);
                }
                cdolist_list_var = cdolist_list_var.rest();
                hl_support = cdolist_list_var.first();
            }
        }
        SubLObject proof_depth = proof_view.inference_proof_get_depth_memoized(proof);
        if (proof_depth.numG(conses_high.getf(v_properties, $MAX_PROOF_DEPTH, UNPROVIDED))) {
            v_properties = conses_high.putf(v_properties, $MAX_PROOF_DEPTH, proof_depth);
        }
        SubLObject cdolist_list_var2 = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            v_properties = proof_query_properties(subproof, v_properties, inference);
            cdolist_list_var2 = cdolist_list_var2.rest();
            subproof = cdolist_list_var2.first();
        }
        return v_properties;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 30100L)
    public static SubLObject prepare_proof_query_properties() {
        SubLObject proof_properties = NIL;
        SubLObject cdolist_list_var = numeric_query_properties();
        SubLObject numeric_property = NIL;
        numeric_property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            proof_properties = conses_high.putf(proof_properties, numeric_property, ZERO_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            numeric_property = cdolist_list_var.first();
        }
        proof_properties = conses_high.putf(proof_properties, $PROBABLY_APPROXIMATELY_DONE, ONE_INTEGER);
        cdolist_list_var = query_properties_efficiency_hierarchy();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = cons;
            SubLObject property = NIL;
            SubLObject hierarchy = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list54);
            property = current.first();
            current = (hierarchy = current.rest());
            proof_properties = conses_high.putf(proof_properties, property, hierarchy.first());
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return proof_properties;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 30600L)
    public static SubLObject get_most_efficient_query_properties(SubLObject properties1, SubLObject properties2) {
        SubLObject p1 = NIL;
        SubLObject p2 = NIL;
        if (Sequences.length(properties2).numG(Sequences.length(properties1))) {
            p1 = properties2;
            p2 = properties1;
        } else {
            p1 = properties1;
            p2 = properties2;
        }
        if (NIL == p2) {
            return p1;
        }
        if (NIL != query_properties_more_efficientP(p1, p2)) {
            return p1;
        }
        return p2;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 30900L)
    public static SubLObject get_least_efficient_query_properties(SubLObject properties1, SubLObject properties2) {
        SubLObject p1 = NIL;
        SubLObject p2 = NIL;
        if (Sequences.length(properties2).numG(Sequences.length(properties1))) {
            p1 = properties2;
            p2 = properties1;
        } else {
            p1 = properties1;
            p2 = properties2;
        }
        if (NIL == p2) {
            return p1;
        }
        if (NIL != query_properties_more_efficientP(p1, p2)) {
            return p2;
        }
        return p1;
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 31300L)
    public static SubLObject query_properties_more_efficientP(SubLObject p1, SubLObject p2) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject count1 = get_query_properties_efficiency_count(p1, p2);
        SubLObject count2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Numbers.numG(count1, count2);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 31500L)
    public static SubLObject query_properties_less_efficientP(SubLObject p1, SubLObject p2) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject count1 = get_query_properties_efficiency_count(p1, p2);
        SubLObject count2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Numbers.numL(count1, count2);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 31800L)
    public static SubLObject get_query_properties_efficiency_count(SubLObject p1, SubLObject p2) {
        SubLObject count1 = ZERO_INTEGER;
        SubLObject count2 = ZERO_INTEGER;
        SubLObject remainder;
        SubLObject property;
        SubLObject value1;
        SubLObject value2;
        for (remainder = NIL, remainder = p1; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value1 = conses_high.cadr(remainder);
            value2 = conses_high.getf(p2, property, UNPROVIDED);
            if (!value1.eql(value2)) {
                if (NIL != query_property_value_more_efficientP(property, value1, value2)) {
                    count1 = Numbers.add(count1, ONE_INTEGER);
                } else {
                    count2 = Numbers.add(count2, ONE_INTEGER);
                }
            }
        }
        return Values.values(count1, count2);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 32100L)
    public static SubLObject most_efficient_query_properties(SubLObject query_properties_list) {
        return list_utilities.extremal(query_properties_list, $sym55$QUERY_PROPERTIES_MORE_EFFICIENT_, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 32300L)
    public static SubLObject most_complete_query_properties(SubLObject query_properties_list) {
        return list_utilities.extremal(query_properties_list, $sym56$QUERY_PROPERTIES_LESS_EFFICIENT_, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 32400L)
    public static SubLObject least_efficient_query_properties(SubLObject query_properties_list) {
        return most_complete_query_properties(query_properties_list);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 32600L)
    public static SubLObject least_complete_query_properties(SubLObject query_properties_list) {
        return most_efficient_query_properties(query_properties_list);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 37000L)
    public static SubLObject query_properties_for_inference_mode(SubLObject inference_mode) {
        assert NIL != inference_datastructures_enumerated_types.inference_mode_p(inference_mode) : inference_mode;
        return list_utilities.alist_lookup_without_values($inference_mode_query_properties_table$.getGlobalValue(), inference_mode, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 37200L)
    public static SubLObject query_property_for_inference_mode(SubLObject inference_mode, SubLObject query_property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return conses_high.getf(query_properties_for_inference_mode(inference_mode), query_property, v_default);
    }

    @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 37400L)
    public static SubLObject min_rule_utility_for_inference_mode(SubLObject inference_mode) {
        return query_property_for_inference_mode(inference_mode, $MIN_RULE_UTILITY, UNPROVIDED);
    }

    public static SubLObject declare_inference_parameters_file() {
        declareFunction(myName, "explicify_inference_engine_query_property_defaults", "EXPLICIFY-INFERENCE-ENGINE-QUERY-PROPERTY-DEFAULTS", 1, 0, false);
        declareFunction(myName, "explicify_query_tool_query_property_defaults", "EXPLICIFY-QUERY-TOOL-QUERY-PROPERTY-DEFAULTS", 2, 0, false);
        declareFunction(myName, "remove_inference_engine_query_property_defaults", "REMOVE-INFERENCE-ENGINE-QUERY-PROPERTY-DEFAULTS", 1, 0, false);
        declareFunction(myName, "inference_merge_query_properties", "INFERENCE-MERGE-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(myName, "union_plist_properties", "UNION-PLIST-PROPERTIES", 2, 0, false);
        declareFunction(myName, "inference_conservatively_select_property_value_for_merge", "INFERENCE-CONSERVATIVELY-SELECT-PROPERTY-VALUE-FOR-MERGE", 3, 0, false);
        declareFunction(myName, "gather_inference_answer_query_propertyP", "GATHER-INFERENCE-ANSWER-QUERY-PROPERTY?", 1, 0, false);
        declareFunction(myName, "gather_inference_answer_query_properties", "GATHER-INFERENCE-ANSWER-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(myName, "boolean_query_property_to_include_on_mergeP", "BOOLEAN-QUERY-PROPERTY-TO-INCLUDE-ON-MERGE?", 1, 0, false);
        declareFunction(myName, "query_property_in_efficiency_hierarchyP", "QUERY-PROPERTY-IN-EFFICIENCY-HIERARCHY?", 1, 0, false);
        declareFunction(myName, "query_properties_efficiency_hierarchy", "QUERY-PROPERTIES-EFFICIENCY-HIERARCHY", 0, 0, false);
        declareFunction(myName, "numeric_query_properties", "NUMERIC-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(myName, "numeric_query_property_p", "NUMERIC-QUERY-PROPERTY-P", 1, 0, false);
        declareFunction(myName, "numeric_query_property_max", "NUMERIC-QUERY-PROPERTY-MAX", 1, 0, false);
        declareFunction(myName, "query_property_value_more_efficientP", "QUERY-PROPERTY-VALUE-MORE-EFFICIENT?", 3, 0, false);
        declareFunction(myName, "query_property_value_more_completeP", "QUERY-PROPERTY-VALUE-MORE-COMPLETE?", 3, 0, false);
        declareFunction(myName, "query_property_value_at_least_as_efficientP", "QUERY-PROPERTY-VALUE-AT-LEAST-AS-EFFICIENT?", 3, 0, false);
        declareFunction(myName, "query_property_value_at_least_as_completeP", "QUERY-PROPERTY-VALUE-AT-LEAST-AS-COMPLETE?", 3, 0, false);
        declareFunction(myName, "most_efficient_value_for_query_property", "MOST-EFFICIENT-VALUE-FOR-QUERY-PROPERTY", 1, 0, false);
        declareFunction(myName, "most_efficient_value_for_query_propertyP", "MOST-EFFICIENT-VALUE-FOR-QUERY-PROPERTY?", 2, 0, false);
        declareFunction(myName, "most_complete_value_for_query_property", "MOST-COMPLETE-VALUE-FOR-QUERY-PROPERTY", 1, 0, false);
        declareFunction(myName, "most_complete_value_for_query_propertyP", "MOST-COMPLETE-VALUE-FOR-QUERY-PROPERTY?", 2, 0, false);
        declareFunction(myName, "problem_store_allows_reuse_wrt_query_propertiesP", "PROBLEM-STORE-ALLOWS-REUSE-WRT-QUERY-PROPERTIES?", 2, 0, false);
        declareFunction(myName, "problem_store_allows_reuse_wrt_query_property", "PROBLEM-STORE-ALLOWS-REUSE-WRT-QUERY-PROPERTY", 3, 0, false);
        declareFunction(myName, "inference_compute_all_answers_query_properties", "INFERENCE-COMPUTE-ALL-ANSWERS-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "inference_compute_some_answer_query_properties", "INFERENCE-COMPUTE-SOME-ANSWER-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "inference_compute_proof_query_properties", "INFERENCE-COMPUTE-PROOF-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "inference_compute_inference_answer_query_properties", "INFERENCE-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "compute_most_complete_query_properties", "COMPUTE-MOST-COMPLETE-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "compute_most_efficient_query_properties", "COMPUTE-MOST-EFFICIENT-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "compute_extremal_query_properties_int", "COMPUTE-EXTREMAL-QUERY-PROPERTIES-INT", 2, 0, false);
        declareFunction(myName, "inference_compute_inference_answer_query_properties_int", "INFERENCE-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES-INT", 2, 0, false);
        declareFunction(myName, "inference_answer_compute_inference_answer_query_properties", "INFERENCE-ANSWER-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES", 3, 0, false);
        declareFunction(myName, "inference_answer_compute_inference_answer_query_properties_int", "INFERENCE-ANSWER-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES-INT", 2, 0, false);
        declareFunction(myName, "distribute_answer_properties_over_proof_properties_list", "DISTRIBUTE-ANSWER-PROPERTIES-OVER-PROOF-PROPERTIES-LIST", 2, 0, false);
        declareFunction(myName, "compute_proof_query_properties_list", "COMPUTE-PROOF-QUERY-PROPERTIES-LIST", 2, 0, false);
        declareFunction(myName, "proof_query_properties", "PROOF-QUERY-PROPERTIES", 3, 0, false);
        declareFunction(myName, "prepare_proof_query_properties", "PREPARE-PROOF-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(myName, "get_most_efficient_query_properties", "GET-MOST-EFFICIENT-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(myName, "get_least_efficient_query_properties", "GET-LEAST-EFFICIENT-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(myName, "query_properties_more_efficientP", "QUERY-PROPERTIES-MORE-EFFICIENT?", 2, 0, false);
        declareFunction(myName, "query_properties_less_efficientP", "QUERY-PROPERTIES-LESS-EFFICIENT?", 2, 0, false);
        declareFunction(myName, "get_query_properties_efficiency_count", "GET-QUERY-PROPERTIES-EFFICIENCY-COUNT", 2, 0, false);
        declareFunction(myName, "most_efficient_query_properties", "MOST-EFFICIENT-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "most_complete_query_properties", "MOST-COMPLETE-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "least_efficient_query_properties", "LEAST-EFFICIENT-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "least_complete_query_properties", "LEAST-COMPLETE-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "query_properties_for_inference_mode", "QUERY-PROPERTIES-FOR-INFERENCE-MODE", 1, 0, false);
        declareFunction(myName, "query_property_for_inference_mode", "QUERY-PROPERTY-FOR-INFERENCE-MODE", 2, 1, false);
        declareFunction(myName, "min_rule_utility_for_inference_mode", "MIN-RULE-UTILITY-FOR-INFERENCE-MODE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_parameters_file() {
        $gather_inference_answer_query_properties$ = deflexical("*GATHER-INFERENCE-ANSWER-QUERY-PROPERTIES*", $list6);
        $boolean_query_properties_to_include_on_merge$ = SubLFiles.deflexical("*BOOLEAN-QUERY-PROPERTIES-TO-INCLUDE-ON-MERGE*", $list7);
        $query_properties_efficiency_hierarchy$ = deflexical("*QUERY-PROPERTIES-EFFICIENCY-HIERARCHY*", $list8);
        $numeric_query_properties$ = deflexical("*NUMERIC-QUERY-PROPERTIES*", $list10);
        $numeric_query_properties_that_max_out_at_positive_infinity$ = SubLFiles.deflexical("*NUMERIC-QUERY-PROPERTIES-THAT-MAX-OUT-AT-POSITIVE-INFINITY*", $list11);
        $proof_query_properties_to_override$ = deflexical("*PROOF-QUERY-PROPERTIES-TO-OVERRIDE*", $list33);
        $inference_mode_query_properties_table$ = deflexical("*INFERENCE-MODE-QUERY-PROPERTIES-TABLE*", $list57);
        return NIL;
    }

    public static SubLObject setup_inference_parameters_file() {
        generic_testing.define_test_case_table_int($sym60$INFERENCE_MERGE_QUERY_PROPERTIES, list(new SubLObject[] { $TEST, Symbols.symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list67);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_parameters_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_parameters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_parameters_file();
    }

    static {
        me = new inference_parameters();
        $gather_inference_answer_query_properties$ = null;
        $boolean_query_properties_to_include_on_merge$ = null;
        $query_properties_efficiency_hierarchy$ = null;
        $numeric_query_properties$ = null;
        $numeric_query_properties_that_max_out_at_positive_infinity$ = null;
        $proof_query_properties_to_override$ = null;
        $inference_mode_query_properties_table$ = null;
        $UNSPECIFIED = makeKeyword("UNSPECIFIED");
        $CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
        $$BaseKB = makeConstSym(("BaseKB"));
        $sym3$QUERY_PROPERTIES_P = makeSymbol("QUERY-PROPERTIES-P");
        $INFERENCE_MODE = makeKeyword("INFERENCE-MODE");
        $CUSTOM = makeKeyword("CUSTOM");
        $list6 = list(new SubLObject[] { makeKeyword("BINDINGS"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"),
                makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"),
                makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"),
                makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PRODUCTIVITY-LIMIT") });
        $list7 = list(new SubLObject[] { makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"),
                makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("NEW-TERMS-ALLOWED?"),
                makeKeyword("REWRITE-ALLOWED?"), makeKeyword("TRANSFORMATION-ALLOWED?") });
        $list8 = list(new SubLObject[] { list(makeKeyword("ABDUCTION-ALLOWED?"), NIL, T), list(makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), NIL, T), list(makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), NIL, T), list(makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, T),
                list(makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, T), list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T, NIL), list(makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, T), list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("EL")),
                list(makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), T, NIL), list(makeKeyword("EVALUATE-SUBL-ALLOWED?"), NIL, T), list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("SHALLOW"), makeKeyword("EXTENDED"), makeKeyword("MAXIMAL"), makeKeyword("CUSTOM")),
                list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("NONE"), makeKeyword("MINIMAL"), makeKeyword("ARG-TYPE"), makeKeyword("ALL")), list(makeKeyword("NEGATION-BY-FAILURE?"), T, NIL), list(makeKeyword("NEW-TERMS-ALLOWED?"), NIL, T),
                list(makeKeyword("REWRITE-ALLOWED?"), NIL, T), list(makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, T), list(makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("FOCUSED"), makeKeyword("ALL")) });
        $sym9$CAR = makeSymbol("CAR");
        $list10 = list(new SubLObject[] { makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"),
                makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PRODUCTIVITY-LIMIT") });
        $list11 = list(makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"));
        $str12$Invalid_value_for_the_properties_ = makeString("Invalid value for the properties ~a : ~a");
        $str13$unexpected_property__s = makeString("unexpected property ~s");
        $sym14$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
        $UNDETERMINED = makeKeyword("UNDETERMINED");
        $list16 = list(makeKeyword("MAX-TIME"), ZERO_INTEGER);
        $list17 = cons(makeSymbol("FIRST"), makeSymbol("REST"));
        $BINDINGS = makeKeyword("BINDINGS");
        $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");
        $MAX_TIME = makeKeyword("MAX-TIME");
        $MAX_STEP = makeKeyword("MAX-STEP");
        $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $float$1_0 = makeDouble(1.0);
        $SKIP = makeKeyword("SKIP");
        $ILL_FORMED = makeKeyword("ILL-FORMED");
        $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $MAX_NUMBER = makeKeyword("MAX-NUMBER");
        $float$1_1 = makeDouble(1.1);
        $ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
        $HL = makeKeyword("HL");
        $EL = makeKeyword("EL");
        $list33 = list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("BINDINGS"));
        $sym34$HL_SUPPORT_P = makeSymbol("HL-SUPPORT-P");
        $PRODUCTIVITY_LIMIT = makeKeyword("PRODUCTIVITY-LIMIT");
        $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");
        $ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");
        $ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $TRANS_ISA_POS = makeKeyword("TRANS-ISA-POS");
        $ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $REMOVAL_TVA_UNIFY_CLOSURE = makeKeyword("REMOVAL-TVA-UNIFY-CLOSURE");
        $TRANSITIVE_CLOSURE_MODE = makeKeyword("TRANSITIVE-CLOSURE-MODE");
        $EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");
        $NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");
        $MINIMIZE = makeKeyword("MINIMIZE");
        $NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");
        $ABNORMAL = makeKeyword("ABNORMAL");
        $ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");
        $list54 = cons(makeSymbol("PROPERTY"), makeSymbol("HIERARCHY"));
        $sym55$QUERY_PROPERTIES_MORE_EFFICIENT_ = makeSymbol("QUERY-PROPERTIES-MORE-EFFICIENT?");
        $sym56$QUERY_PROPERTIES_LESS_EFFICIENT_ = makeSymbol("QUERY-PROPERTIES-LESS-EFFICIENT?");
        $list57 = list(
                list(new SubLObject[] { makeKeyword("MINIMAL"), makeKeyword("NEW-TERMS-ALLOWED?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), FIFTEEN_INTEGER, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T,
                        makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL,
                        makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL }),
                list(new SubLObject[] { makeKeyword("SHALLOW"), makeKeyword("NEW-TERMS-ALLOWED?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T,
                        makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL,
                        makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("TRANSFORMATION-ALLOWED?"), T }),
                list(new SubLObject[] { makeKeyword("EXTENDED"), makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T,
                        makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL,
                        makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), TWO_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("TRANSFORMATION-ALLOWED?"), T }),
                list(new SubLObject[] { makeKeyword("MAXIMAL"), makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T,
                        makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("ALL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), T,
                        makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), T, makeKeyword("MAX-TRANSFORMATION-DEPTH"), NIL, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("TRANSFORMATION-ALLOWED?"), T }));
        $sym58$INFERENCE_MODE_P = makeSymbol("INFERENCE-MODE-P");
        $MIN_RULE_UTILITY = makeKeyword("MIN-RULE-UTILITY");
        $sym60$INFERENCE_MERGE_QUERY_PROPERTIES = makeSymbol("INFERENCE-MERGE-QUERY-PROPERTIES");
        $TEST = makeKeyword("TEST");
        $OWNER = makeKeyword("OWNER");
        $CLASSES = makeKeyword("CLASSES");
        $KB = makeKeyword("KB");
        $TINY = makeKeyword("TINY");
        $WORKING_ = makeKeyword("WORKING?");
        $list67 = list(new SubLObject[] { list(list(list(makeKeyword("MAX-TIME"), TEN_INTEGER), list(makeKeyword("MAX-TIME"), TWENTY_INTEGER)), list(makeKeyword("MAX-TIME"), TWENTY_INTEGER)),
                list(list(list(makeKeyword("MAX-TIME"), TWENTY_INTEGER), list(makeKeyword("MAX-TIME"), TEN_INTEGER)), list(makeKeyword("MAX-TIME"), TWENTY_INTEGER)), list(list(list(makeKeyword("MAX-TIME"), TEN_INTEGER), NIL), list(makeKeyword("MAX-TIME"), NIL)),
                list(list(NIL, list(makeKeyword("MAX-TIME"), TEN_INTEGER)), list(makeKeyword("MAX-TIME"), NIL)), list(list(list(makeKeyword("MAX-STEP"), TEN_INTEGER), list(makeKeyword("MAX-STEP"), TWENTY_INTEGER)), list(makeKeyword("MAX-STEP"), TWENTY_INTEGER)),
                list(list(list(makeKeyword("MAX-STEP"), TWENTY_INTEGER), list(makeKeyword("MAX-STEP"), TEN_INTEGER)), list(makeKeyword("MAX-STEP"), TWENTY_INTEGER)), list(list(list(makeKeyword("MAX-STEP"), TEN_INTEGER), NIL), list(makeKeyword("MAX-STEP"), NIL)),
                list(list(NIL, list(makeKeyword("MAX-STEP"), TEN_INTEGER)), list(makeKeyword("MAX-STEP"), NIL)), list(list(list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T), list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL)), list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T)),
                list(list(list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL), list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T)), list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T)),
                list(list(list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL")), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"))), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"))),
                list(list(list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW")), list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"))), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"))),
                list(list(NIL, list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"))),
                        list(new SubLObject[] { makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"),
                                makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("TRANSFORMATION-ALLOWED?"), T, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER,
                                makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("INFERENCE-MODE"), makeKeyword("CUSTOM"), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000) })),
                list(list(list(makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T, makeKeyword("MAX-TIME"), makeInteger(60)), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"))),
                        list(new SubLObject[] { makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T,
                                makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("TRANSFORMATION-ALLOWED?"), T, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("NEW-TERMS-ALLOWED?"), T,
                                makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("MAX-TIME"), NIL,
                                makeKeyword("INFERENCE-MODE"), makeKeyword("CUSTOM"), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000) })) });
    }
}
/*
 *
 * Total time: 388 ms
 *
 */