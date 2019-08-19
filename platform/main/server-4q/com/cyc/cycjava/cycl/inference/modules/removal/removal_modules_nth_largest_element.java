package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_quantification;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_nth_largest_element extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element";
    public static String myFingerPrint = "4e0ed3816b2fc8e5c8ade5a044d7b97fd9d8c8fed14c26c67abd82cbe4621fea";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 4600L)
    private static SubLSymbol $default_removal_nth_extremal_n_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 18400L)
    private static SubLSymbol $default_the_set_of_cardinality_estimate$;
    private static SubLSymbol $sym0$CYC_GREATER_THAN;
    private static SubLSymbol $sym1$CYC_LESS_THAN;
    private static SubLObject $$nthLargestElement;
    private static SubLSymbol $POS;
    private static SubLObject $$nthSmallestElement;
    private static SubLSymbol $REMOVAL_NTH_LARGEST_N_COLLECTION;
    private static SubLList $list6;
    private static SubLSymbol $REMOVAL_NTH_SMALLEST_N_COLLECTION;
    private static SubLList $list8;
    private static SubLSymbol $HL;
    private static SubLSymbol $sym10$CDR;
    private static SubLSymbol $sym11$CAR;
    private static SubLSymbol $REMOVAL_NTH_LARGEST_N_THE_SET;
    private static SubLList $list13;
    private static SubLSymbol $REMOVAL_NTH_SMALLEST_N_THE_SET;
    private static SubLList $list15;
    private static SubLSymbol $REMOVAL_NTH_LARGEST_N_THE_SET_OF;
    private static SubLList $list17;
    private static SubLSymbol $REMOVAL_NTH_SMALLEST_N_THE_SET_OF;
    private static SubLList $list19;
    private static SubLSymbol $REMOVAL_NTH_LARGEST_ITERATE_COLLECTION;
    private static SubLList $list21;
    private static SubLSymbol $REMOVAL_NTH_SMALLEST_ITERATE_COLLECTION;
    private static SubLList $list23;
    private static SubLList $list24;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $REMOVAL_NTH_LARGEST_ITERATE_THE_SET;
    private static SubLList $list27;
    private static SubLSymbol $REMOVAL_NTH_SMALLEST_ITERATE_THE_SET;
    private static SubLList $list29;
    private static SubLInteger $int$100;
    private static SubLSymbol $REMOVAL_NTH_LARGEST_ITERATE_THE_SET_OF;
    private static SubLList $list32;
    private static SubLSymbol $REMOVAL_NTH_SMALLEST_ITERATE_THE_SET_OF;
    private static SubLList $list34;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 700L)
    public static SubLObject cyc_quantity_decreasing_sort(SubLObject sequence, SubLObject key) {
        if (key == UNPROVIDED) {
            key = Symbols.symbol_function(IDENTITY);
        }
        return relation_evaluation.cyc_evaluate_sort(sequence, Symbols.symbol_function($sym0$CYC_GREATER_THAN), key, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 900L)
    public static SubLObject cyc_quantity_increasing_sort(SubLObject sequence, SubLObject key) {
        if (key == UNPROVIDED) {
            key = Symbols.symbol_function(IDENTITY);
        }
        return relation_evaluation.cyc_evaluate_sort(sequence, Symbols.symbol_function($sym1$CYC_LESS_THAN), key, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 1400L)
    public static SubLObject removal_nth_largest_n_collection_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nth_extremal_n_required(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 1600L)
    public static SubLObject removal_nth_largest_n_collection_output_generate(SubLObject rank, SubLObject collection, SubLObject function) {
        return removal_nth_extremal_n_output_generate($$nthLargestElement, rank, collection, function);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 2900L)
    public static SubLObject removal_nth_smallest_n_collection_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nth_extremal_n_required(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 3200L)
    public static SubLObject removal_nth_smallest_n_collection_output_generate(SubLObject rank, SubLObject collection, SubLObject function) {
        return removal_nth_extremal_n_output_generate($$nthSmallestElement, rank, collection, function);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 4400L)
    public static SubLObject removal_nth_extremal_n_required(SubLObject asent) {
        return subl_promotions.positive_integer_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 4700L)
    public static SubLObject removal_nth_extremal_n_output_generate(SubLObject predicate, SubLObject rank, SubLObject v_set, SubLObject function) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject elements = quantities.evaluate_set_elements(v_set, $HL);
        SubLObject items = NIL;
        thread.resetMultipleValues();
        SubLObject evaluation_pairs = numeric_quantification.numeric_evaluate_all_unary(function, elements);
        SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != valid) {
            if (predicate.eql($$nthLargestElement)) {
                evaluation_pairs = cyc_quantity_decreasing_sort(evaluation_pairs, Symbols.symbol_function($sym10$CDR));
            } else if (predicate.eql($$nthSmallestElement)) {
                evaluation_pairs = cyc_quantity_increasing_sort(evaluation_pairs, Symbols.symbol_function($sym10$CDR));
            }
            SubLObject nth_item_pairs = list_utilities.nth_rank_items(rank, evaluation_pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function($sym10$CDR));
            items = Mapping.mapcar(Symbols.symbol_function($sym11$CAR), nth_item_pairs);
        }
        return iteration.new_list_iterator(items);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 5400L)
    public static SubLObject removal_nth_largest_n_the_set_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nth_extremal_n_required(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 5700L)
    public static SubLObject removal_nth_largest_n_the_set_output_generate(SubLObject rank, SubLObject v_set, SubLObject function) {
        return removal_nth_extremal_n_output_generate($$nthLargestElement, rank, v_set, function);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 7000L)
    public static SubLObject removal_nth_smallest_n_the_set_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nth_extremal_n_required(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 7300L)
    public static SubLObject removal_nth_smallest_n_the_set_output_generate(SubLObject rank, SubLObject v_set, SubLObject function) {
        return removal_nth_extremal_n_output_generate($$nthSmallestElement, rank, v_set, function);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 8500L)
    public static SubLObject removal_nth_largest_n_the_set_of_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nth_extremal_n_required(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 8900L)
    public static SubLObject removal_nth_largest_n_the_set_of_output_generate(SubLObject rank, SubLObject v_set, SubLObject function) {
        return removal_nth_extremal_n_output_generate($$nthLargestElement, rank, v_set, function);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 10200L)
    public static SubLObject removal_nth_smallest_n_the_set_of_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nth_extremal_n_required(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 10500L)
    public static SubLObject removal_nth_smallest_n_the_set_of_output_generate(SubLObject rank, SubLObject v_set, SubLObject function) {
        return removal_nth_extremal_n_output_generate($$nthSmallestElement, rank, v_set, function);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 11800L)
    public static SubLObject removal_nth_largest_iterate_collection_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.instance_cardinality(cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 12200L)
    public static SubLObject removal_nth_largest_iterate_collection_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nth_extremal_iterate_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 13000L)
    public static SubLObject removal_nth_smallest_iterate_collection_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.instance_cardinality(cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 13400L)
    public static SubLObject removal_nth_smallest_iterate_collection_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nth_extremal_iterate_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 14100L)
    public static SubLObject removal_nth_extremal_iterate_expand(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_object = NIL;
        SubLObject rank = NIL;
        SubLObject v_set = NIL;
        SubLObject function = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
        rank = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
        v_set = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
        function = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject elements = quantities.evaluate_set_elements(v_set, $HL);
            thread.resetMultipleValues();
            SubLObject evaluation_pairs = numeric_quantification.numeric_evaluate_all_unary(function, elements);
            SubLObject valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject pcase_var = predicate;
                if (pcase_var.eql($$nthLargestElement)) {
                    evaluation_pairs = cyc_quantity_decreasing_sort(evaluation_pairs, Symbols.symbol_function($sym10$CDR));
                } else if (pcase_var.eql($$nthSmallestElement)) {
                    evaluation_pairs = cyc_quantity_increasing_sort(evaluation_pairs, Symbols.symbol_function($sym10$CDR));
                }
                SubLObject cdolist_list_var;
                evaluation_pairs = (cdolist_list_var = removal_nth_extremal_convert_to_rankings(evaluation_pairs));
                SubLObject nth_item_pair = NIL;
                nth_item_pair = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    SubLObject v_bindings = unification_utilities.term_unify(cons(v_object, rank), nth_item_pair, T, T);
                    SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        SubLObject subst_rank = bindings.subst_bindings(v_bindings, rank);
                        SubLObject subst_object = bindings.subst_bindings(v_bindings, v_object);
                        SubLObject hl_formula = list(predicate, subst_object, subst_rank, v_set, function);
                        SubLObject hl_support = arguments.make_hl_support($OPAQUE, hl_formula, UNPROVIDED, UNPROVIDED);
                        backward.removal_add_node(hl_support, v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    nth_item_pair = cdolist_list_var.first();
                }
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list24);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 15500L)
    public static SubLObject removal_nth_extremal_convert_to_rankings(SubLObject evaluation_pairs) {
        if (NIL != evaluation_pairs) {
            SubLObject first_pair = evaluation_pairs.first();
            SubLObject last_value = first_pair.rest();
            SubLObject current_rank = ONE_INTEGER;
            SubLObject current_index = ONE_INTEGER;
            rplacd(first_pair, current_rank);
            SubLObject cdolist_list_var = evaluation_pairs.rest();
            SubLObject rest_pair = NIL;
            rest_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                current_index = Numbers.add(current_index, ONE_INTEGER);
                SubLObject rest_value = rest_pair.rest();
                if (!last_value.equal(rest_value)) {
                    current_rank = current_index;
                }
                rplacd(rest_pair, current_rank);
                last_value = rest_value;
                cdolist_list_var = cdolist_list_var.rest();
                rest_pair = cdolist_list_var.first();
            }
        }
        return evaluation_pairs;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 16100L)
    public static SubLObject removal_nth_largest_iterate_the_set_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cycl_utilities.nat_arity(cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 16500L)
    public static SubLObject removal_nth_largest_iterate_the_set_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nth_extremal_iterate_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 17200L)
    public static SubLObject removal_nth_smallest_iterate_the_set_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cycl_utilities.nat_arity(cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 17600L)
    public static SubLObject removal_nth_smallest_iterate_the_set_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nth_extremal_iterate_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 18700L)
    public static SubLObject removal_nth_largest_iterate_the_set_of_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nth_extremal_iterate_expand(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 19500L)
    public static SubLObject removal_nth_smallest_iterate_the_set_of_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nth_extremal_iterate_expand(asent);
    }

    public static SubLObject declare_removal_modules_nth_largest_element_file() {
        declareFunction(myName, "cyc_quantity_decreasing_sort", "CYC-QUANTITY-DECREASING-SORT", 1, 1, false);
        declareFunction(myName, "cyc_quantity_increasing_sort", "CYC-QUANTITY-INCREASING-SORT", 1, 1, false);
        declareFunction(myName, "removal_nth_largest_n_collection_required", "REMOVAL-NTH-LARGEST-N-COLLECTION-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_nth_largest_n_collection_output_generate", "REMOVAL-NTH-LARGEST-N-COLLECTION-OUTPUT-GENERATE", 3, 0, false);
        declareFunction(myName, "removal_nth_smallest_n_collection_required", "REMOVAL-NTH-SMALLEST-N-COLLECTION-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_nth_smallest_n_collection_output_generate", "REMOVAL-NTH-SMALLEST-N-COLLECTION-OUTPUT-GENERATE", 3, 0, false);
        declareFunction(myName, "removal_nth_extremal_n_required", "REMOVAL-NTH-EXTREMAL-N-REQUIRED", 1, 0, false);
        declareFunction(myName, "removal_nth_extremal_n_output_generate", "REMOVAL-NTH-EXTREMAL-N-OUTPUT-GENERATE", 4, 0, false);
        declareFunction(myName, "removal_nth_largest_n_the_set_required", "REMOVAL-NTH-LARGEST-N-THE-SET-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_nth_largest_n_the_set_output_generate", "REMOVAL-NTH-LARGEST-N-THE-SET-OUTPUT-GENERATE", 3, 0, false);
        declareFunction(myName, "removal_nth_smallest_n_the_set_required", "REMOVAL-NTH-SMALLEST-N-THE-SET-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_nth_smallest_n_the_set_output_generate", "REMOVAL-NTH-SMALLEST-N-THE-SET-OUTPUT-GENERATE", 3, 0, false);
        declareFunction(myName, "removal_nth_largest_n_the_set_of_required", "REMOVAL-NTH-LARGEST-N-THE-SET-OF-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_nth_largest_n_the_set_of_output_generate", "REMOVAL-NTH-LARGEST-N-THE-SET-OF-OUTPUT-GENERATE", 3, 0, false);
        declareFunction(myName, "removal_nth_smallest_n_the_set_of_required", "REMOVAL-NTH-SMALLEST-N-THE-SET-OF-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_nth_smallest_n_the_set_of_output_generate", "REMOVAL-NTH-SMALLEST-N-THE-SET-OF-OUTPUT-GENERATE", 3, 0, false);
        declareFunction(myName, "removal_nth_largest_iterate_collection_cost", "REMOVAL-NTH-LARGEST-ITERATE-COLLECTION-COST", 1, 1, false);
        declareFunction(myName, "removal_nth_largest_iterate_collection_expand", "REMOVAL-NTH-LARGEST-ITERATE-COLLECTION-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_nth_smallest_iterate_collection_cost", "REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION-COST", 1, 1, false);
        declareFunction(myName, "removal_nth_smallest_iterate_collection_expand", "REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_nth_extremal_iterate_expand", "REMOVAL-NTH-EXTREMAL-ITERATE-EXPAND", 1, 0, false);
        declareFunction(myName, "removal_nth_extremal_convert_to_rankings", "REMOVAL-NTH-EXTREMAL-CONVERT-TO-RANKINGS", 1, 0, false);
        declareFunction(myName, "removal_nth_largest_iterate_the_set_cost", "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-COST", 1, 1, false);
        declareFunction(myName, "removal_nth_largest_iterate_the_set_expand", "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_nth_smallest_iterate_the_set_cost", "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-COST", 1, 1, false);
        declareFunction(myName, "removal_nth_smallest_iterate_the_set_expand", "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_nth_largest_iterate_the_set_of_expand", "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-OF-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_nth_smallest_iterate_the_set_of_expand", "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-OF-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_nth_largest_element_file() {
        $default_removal_nth_extremal_n_cost$ = defparameter("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*", ONE_INTEGER);
        $default_the_set_of_cardinality_estimate$ = defparameter("*DEFAULT-THE-SET-OF-CARDINALITY-ESTIMATE*", $int$100);
        return NIL;
    }

    public static SubLObject setup_removal_modules_nth_largest_element_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$nthLargestElement);
        preference_modules.doomed_unless_arg_bindable($POS, $$nthLargestElement, THREE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nthLargestElement, FOUR_INTEGER);
        inference_modules.register_solely_specific_removal_module_predicate($$nthSmallestElement);
        preference_modules.doomed_unless_arg_bindable($POS, $$nthSmallestElement, THREE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nthSmallestElement, FOUR_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NTH_LARGEST_N_COLLECTION, $list6);
        inference_modules.inference_removal_module($REMOVAL_NTH_SMALLEST_N_COLLECTION, $list8);
        inference_modules.inference_removal_module($REMOVAL_NTH_LARGEST_N_THE_SET, $list13);
        inference_modules.inference_removal_module($REMOVAL_NTH_SMALLEST_N_THE_SET, $list15);
        inference_modules.inference_removal_module($REMOVAL_NTH_LARGEST_N_THE_SET_OF, $list17);
        inference_modules.inference_removal_module($REMOVAL_NTH_SMALLEST_N_THE_SET_OF, $list19);
        inference_modules.inference_removal_module($REMOVAL_NTH_LARGEST_ITERATE_COLLECTION, $list21);
        inference_modules.inference_removal_module($REMOVAL_NTH_SMALLEST_ITERATE_COLLECTION, $list23);
        inference_modules.inference_removal_module($REMOVAL_NTH_LARGEST_ITERATE_THE_SET, $list27);
        inference_modules.inference_removal_module($REMOVAL_NTH_SMALLEST_ITERATE_THE_SET, $list29);
        inference_modules.inference_removal_module($REMOVAL_NTH_LARGEST_ITERATE_THE_SET_OF, $list32);
        inference_modules.inference_removal_module($REMOVAL_NTH_SMALLEST_ITERATE_THE_SET_OF, $list34);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_nth_largest_element_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_nth_largest_element_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_nth_largest_element_file();
    }

    static {
        me = new removal_modules_nth_largest_element();
        $default_removal_nth_extremal_n_cost$ = null;
        $default_the_set_of_cardinality_estimate$ = null;
        $sym0$CYC_GREATER_THAN = makeSymbol("CYC-GREATER-THAN");
        $sym1$CYC_LESS_THAN = makeSymbol("CYC-LESS-THAN");
        $$nthLargestElement = makeConstSym(("nthLargestElement"));
        $POS = makeKeyword("POS");
        $$nthSmallestElement = makeConstSym(("nthSmallestElement"));
        $REMOVAL_NTH_LARGEST_N_COLLECTION = makeKeyword("REMOVAL-NTH-LARGEST-N-COLLECTION");
        $list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nthLargestElement")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nthLargestElement")), makeKeyword("ANYTHING"), makeKeyword("INTEGER"), makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-NTH-LARGEST-N-COLLECTION-REQUIRED"), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nthLargestElement")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("RANK")), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), list(makeKeyword("BIND"), makeSymbol("FUNCTION"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("RANK"), makeSymbol("SET"), makeSymbol("FUNCTION")),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-NTH-LARGEST-N-COLLECTION-OUTPUT-GENERATE"), list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nthLargestElement")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("DOCUMENTATION"), makeString("(#$nthLargestElement <whatever> <n> <collection> <function>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nthLargestElement #$Alaska-State 1 \n       #$State-UnitedStates\n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $REMOVAL_NTH_SMALLEST_N_COLLECTION = makeKeyword("REMOVAL-NTH-SMALLEST-N-COLLECTION");
        $list8 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nthSmallestElement")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nthSmallestElement")), makeKeyword("ANYTHING"), makeKeyword("INTEGER"), makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-NTH-SMALLEST-N-COLLECTION-REQUIRED"), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nthSmallestElement")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("RANK")), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), list(makeKeyword("BIND"), makeSymbol("FUNCTION"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("RANK"), makeSymbol("SET"), makeSymbol("FUNCTION")),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-NTH-SMALLEST-N-COLLECTION-OUTPUT-GENERATE"), list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nthSmallestElement")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("DOCUMENTATION"), makeString("(#$nthSmallestElement <whatever> <n> <collection> <function>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nthSmallestElement #$Alaska-State 50 \n       #$State-UnitedStates\n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $HL = makeKeyword("HL");
        $sym10$CDR = makeSymbol("CDR");
        $sym11$CAR = makeSymbol("CAR");
        $REMOVAL_NTH_LARGEST_N_THE_SET = makeKeyword("REMOVAL-NTH-LARGEST-N-THE-SET");
        $list13 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nthLargestElement")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nthLargestElement")), makeKeyword("ANYTHING"), makeKeyword("INTEGER"), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-NTH-LARGEST-N-THE-SET-REQUIRED"),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nthLargestElement")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("RANK")), list(makeKeyword("BIND"), makeSymbol("SET")), list(makeKeyword("BIND"), makeSymbol("FUNCTION"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("RANK"), makeSymbol("SET"), makeSymbol("FUNCTION")),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-NTH-LARGEST-N-THE-SET-OUTPUT-GENERATE"), list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nthLargestElement")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION"))), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("OPAQUE"), makeKeyword("DOCUMENTATION"), makeString("(#$nthLargestElement <whatever> <n> (#$TheSet . <closed>) <function>)"), makeKeyword("EXAMPLE"), makeString("(#$nthLargestElement ?WHAT 1 \n       (#$TheSet 1 2 3 -3)\n       #$AbsoluteValueFn)") });
        $REMOVAL_NTH_SMALLEST_N_THE_SET = makeKeyword("REMOVAL-NTH-SMALLEST-N-THE-SET");
        $list15 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nthSmallestElement")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nthSmallestElement")), makeKeyword("ANYTHING"), makeKeyword("INTEGER"), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-NTH-SMALLEST-N-THE-SET-REQUIRED"),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nthSmallestElement")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("RANK")), list(makeKeyword("BIND"), makeSymbol("SET")), list(makeKeyword("BIND"), makeSymbol("FUNCTION"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("RANK"), makeSymbol("SET"), makeSymbol("FUNCTION")),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-NTH-SMALLEST-N-THE-SET-OUTPUT-GENERATE"), list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nthSmallestElement")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION"))), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("OPAQUE"), makeKeyword("DOCUMENTATION"), makeString("(#$nthSmallestElement <whatever> <n> (#$TheSet . <closed>) <function>)"), makeKeyword("EXAMPLE"), makeString("(#$nthSmallestElement ?WHAT 1\n       (#$TheSet 1 2 3 -3)\n       #$AbsoluteValueFn)") });
        $REMOVAL_NTH_LARGEST_N_THE_SET_OF = makeKeyword("REMOVAL-NTH-LARGEST-N-THE-SET-OF");
        $list17 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nthLargestElement")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nthLargestElement")), makeKeyword("ANYTHING"), makeKeyword("INTEGER"), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-NTH-LARGEST-N-THE-SET-OF-REQUIRED"),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nthLargestElement")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("RANK")), list(makeKeyword("BIND"), makeSymbol("SET")), list(makeKeyword("BIND"), makeSymbol("FUNCTION"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("RANK"), makeSymbol("SET"), makeSymbol("FUNCTION")),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-NTH-LARGEST-N-THE-SET-OF-OUTPUT-GENERATE"), list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nthLargestElement")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION"))), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("OPAQUE"), makeKeyword("DOCUMENTATION"), makeString("(#$nthLargestElement  <whatever> <n> (#$TheSetOf <var> <closed>) <function>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nthLargestElement ?COUNTRY 1 \n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $REMOVAL_NTH_SMALLEST_N_THE_SET_OF = makeKeyword("REMOVAL-NTH-SMALLEST-N-THE-SET-OF");
        $list19 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nthSmallestElement")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nthSmallestElement")), makeKeyword("ANYTHING"), makeKeyword("INTEGER"), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-NTH-SMALLEST-N-THE-SET-OF-REQUIRED"),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nthSmallestElement")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("RANK")), list(makeKeyword("BIND"), makeSymbol("SET")), list(makeKeyword("BIND"), makeSymbol("FUNCTION"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("RANK"), makeSymbol("SET"), makeSymbol("FUNCTION")),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-NTH-SMALLEST-N-THE-SET-OF-OUTPUT-GENERATE"), list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nthSmallestElement")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("RANK")), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("FUNCTION"))), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("OPAQUE"), makeKeyword("DOCUMENTATION"), makeString("(#$nthSmallestElement <whatever> <n> (#$TheSetOf <var> <closed>) <function>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nthSmallestElement ?COUNTRY 1 \n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $REMOVAL_NTH_LARGEST_ITERATE_COLLECTION = makeKeyword("REMOVAL-NTH-LARGEST-ITERATE-COLLECTION");
        $list21 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nthLargestElement")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nthLargestElement")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NTH-LARGEST-ITERATE-COLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NTH-LARGEST-ITERATE-COLLECTION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nthLargestElement <whatever> <not-fully-bound> <collection> <function>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nthLargestElement #$China-PeoplesRepublic ?NTH\n       #$IndependentCountry\n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $REMOVAL_NTH_SMALLEST_ITERATE_COLLECTION = makeKeyword("REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION");
        $list23 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nthSmallestElement")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nthSmallestElement")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nthSmallestElement <whatever> <not-fully-bound> <collection> <function>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nthSmallestElement #$Belgium ?NTH\n       #$IndependentCountry\n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $list24 = list(makeSymbol("OBJECT"), makeSymbol("RANK"), makeSymbol("SET"), makeSymbol("FUNCTION"));
        $OPAQUE = makeKeyword("OPAQUE");
        $REMOVAL_NTH_LARGEST_ITERATE_THE_SET = makeKeyword("REMOVAL-NTH-LARGEST-ITERATE-THE-SET");
        $list27 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nthLargestElement")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nthLargestElement")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NTH-LARGEST-ITERATE-THE-SET-COST"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NTH-LARGEST-ITERATE-THE-SET-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nthLargestElement <whatever> <not-fully-bound> (TheSet . <closed>) <function>)"),
                makeKeyword("EXAMPLE"), makeString("(#$nthLargestElement 3 ?WHAT\n      (#$TheSet 1 2 3 -3)\n      #$AbsoluteValueFn)") });
        $REMOVAL_NTH_SMALLEST_ITERATE_THE_SET = makeKeyword("REMOVAL-NTH-SMALLEST-ITERATE-THE-SET");
        $list29 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nthSmallestElement")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nthSmallestElement")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-COST"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nthSmallestElement <whatever> <not-fully-bound> (TheSet . <closed>) <function>)"),
                makeKeyword("EXAMPLE"), makeString("(#$nthSmallestElement 3 ?WHAT\n       (#$TheSet 1 2 3 -3)\n       #$AbsoluteValueFn)") });
        $int$100 = makeInteger(100);
        $REMOVAL_NTH_LARGEST_ITERATE_THE_SET_OF = makeKeyword("REMOVAL-NTH-LARGEST-ITERATE-THE-SET-OF");
        $list32 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nthLargestElement")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nthLargestElement")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-THE-SET-OF-CARDINALITY-ESTIMATE*"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NTH-LARGEST-ITERATE-THE-SET-OF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nthLargestElement  <whatever> <not-fully-bound> (#$TheSetOf <var> <closed>) <function>)"),
                makeKeyword("EXAMPLE"), makeString("(#$nthLargestElement #$France ?NTH\n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $REMOVAL_NTH_SMALLEST_ITERATE_THE_SET_OF = makeKeyword("REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-OF");
        $list34 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nthSmallestElement")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nthSmallestElement")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), cons(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-THE-SET-OF-CARDINALITY-ESTIMATE*"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-OF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nthSmallestElement <whatever> <not-fully-bound> (#$TheSetOf <var> <closed>) <function>)"),
                makeKeyword("EXAMPLE"), makeString("(#$nthSmallestElement #$Denmark ?NTH\n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))") });
    }
}
/*
 *
 * Total time: 187 ms
 *
 */