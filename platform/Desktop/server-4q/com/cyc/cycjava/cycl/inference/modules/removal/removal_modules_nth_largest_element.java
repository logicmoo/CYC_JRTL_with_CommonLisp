package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_quantification;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_nth_largest_element extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element";
    public static final String myFingerPrint = "4e0ed3816b2fc8e5c8ade5a044d7b97fd9d8c8fed14c26c67abd82cbe4621fea";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 4636L)
    private static SubLSymbol $default_removal_nth_extremal_n_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 18400L)
    private static SubLSymbol $default_the_set_of_cardinality_estimate$;
    private static final SubLSymbol $sym0$CYC_GREATER_THAN;
    private static final SubLSymbol $sym1$CYC_LESS_THAN;
    private static final SubLObject $const2$nthLargestElement;
    private static final SubLSymbol $kw3$POS;
    private static final SubLObject $const4$nthSmallestElement;
    private static final SubLSymbol $kw5$REMOVAL_NTH_LARGEST_N_COLLECTION;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$REMOVAL_NTH_SMALLEST_N_COLLECTION;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$HL;
    private static final SubLSymbol $sym10$CDR;
    private static final SubLSymbol $sym11$CAR;
    private static final SubLSymbol $kw12$REMOVAL_NTH_LARGEST_N_THE_SET;
    private static final SubLList $list13;
    private static final SubLSymbol $kw14$REMOVAL_NTH_SMALLEST_N_THE_SET;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$REMOVAL_NTH_LARGEST_N_THE_SET_OF;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$REMOVAL_NTH_SMALLEST_N_THE_SET_OF;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$REMOVAL_NTH_LARGEST_ITERATE_COLLECTION;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$REMOVAL_NTH_SMALLEST_ITERATE_COLLECTION;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $kw25$OPAQUE;
    private static final SubLSymbol $kw26$REMOVAL_NTH_LARGEST_ITERATE_THE_SET;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$REMOVAL_NTH_SMALLEST_ITERATE_THE_SET;
    private static final SubLList $list29;
    private static final SubLInteger $int30$100;
    private static final SubLSymbol $kw31$REMOVAL_NTH_LARGEST_ITERATE_THE_SET_OF;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$REMOVAL_NTH_SMALLEST_ITERATE_THE_SET_OF;
    private static final SubLList $list34;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 716L)
    public static SubLObject cyc_quantity_decreasing_sort(final SubLObject sequence, SubLObject key) {
        if (key == removal_modules_nth_largest_element.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)removal_modules_nth_largest_element.IDENTITY);
        }
        return relation_evaluation.cyc_evaluate_sort(sequence, Symbols.symbol_function((SubLObject)removal_modules_nth_largest_element.$sym0$CYC_GREATER_THAN), key, (SubLObject)removal_modules_nth_largest_element.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 922L)
    public static SubLObject cyc_quantity_increasing_sort(final SubLObject sequence, SubLObject key) {
        if (key == removal_modules_nth_largest_element.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)removal_modules_nth_largest_element.IDENTITY);
        }
        return relation_evaluation.cyc_evaluate_sort(sequence, Symbols.symbol_function((SubLObject)removal_modules_nth_largest_element.$sym1$CYC_LESS_THAN), key, (SubLObject)removal_modules_nth_largest_element.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 1436L)
    public static SubLObject removal_nth_largest_n_collection_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return removal_nth_extremal_n_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 1697L)
    public static SubLObject removal_nth_largest_n_collection_output_generate(final SubLObject rank, final SubLObject collection, final SubLObject function) {
        return removal_nth_extremal_n_output_generate(removal_modules_nth_largest_element.$const2$nthLargestElement, rank, collection, function);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 2963L)
    public static SubLObject removal_nth_smallest_n_collection_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return removal_nth_extremal_n_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 3228L)
    public static SubLObject removal_nth_smallest_n_collection_output_generate(final SubLObject rank, final SubLObject collection, final SubLObject function) {
        return removal_nth_extremal_n_output_generate(removal_modules_nth_largest_element.$const4$nthSmallestElement, rank, collection, function);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 4499L)
    public static SubLObject removal_nth_extremal_n_required(final SubLObject asent) {
        return subl_promotions.positive_integer_p(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nth_largest_element.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 4708L)
    public static SubLObject removal_nth_extremal_n_output_generate(final SubLObject predicate, final SubLObject rank, final SubLObject v_set, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject elements = quantities.evaluate_set_elements(v_set, (SubLObject)removal_modules_nth_largest_element.$kw9$HL);
        SubLObject items = (SubLObject)removal_modules_nth_largest_element.NIL;
        thread.resetMultipleValues();
        SubLObject evaluation_pairs = numeric_quantification.numeric_evaluate_all_unary(function, elements);
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_nth_largest_element.NIL != valid) {
            if (predicate.eql(removal_modules_nth_largest_element.$const2$nthLargestElement)) {
                evaluation_pairs = cyc_quantity_decreasing_sort(evaluation_pairs, Symbols.symbol_function((SubLObject)removal_modules_nth_largest_element.$sym10$CDR));
            }
            else if (predicate.eql(removal_modules_nth_largest_element.$const4$nthSmallestElement)) {
                evaluation_pairs = cyc_quantity_increasing_sort(evaluation_pairs, Symbols.symbol_function((SubLObject)removal_modules_nth_largest_element.$sym10$CDR));
            }
            final SubLObject nth_item_pairs = list_utilities.nth_rank_items(rank, evaluation_pairs, Symbols.symbol_function((SubLObject)removal_modules_nth_largest_element.EQUAL), Symbols.symbol_function((SubLObject)removal_modules_nth_largest_element.$sym10$CDR));
            items = Mapping.mapcar(Symbols.symbol_function((SubLObject)removal_modules_nth_largest_element.$sym11$CAR), nth_item_pairs);
        }
        return iteration.new_list_iterator(items);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 5465L)
    public static SubLObject removal_nth_largest_n_the_set_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return removal_nth_extremal_n_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 5799L)
    public static SubLObject removal_nth_largest_n_the_set_output_generate(final SubLObject rank, final SubLObject v_set, final SubLObject function) {
        return removal_nth_extremal_n_output_generate(removal_modules_nth_largest_element.$const2$nthLargestElement, rank, v_set, function);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 7007L)
    public static SubLObject removal_nth_smallest_n_the_set_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return removal_nth_extremal_n_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 7345L)
    public static SubLObject removal_nth_smallest_n_the_set_output_generate(final SubLObject rank, final SubLObject v_set, final SubLObject function) {
        return removal_nth_extremal_n_output_generate(removal_modules_nth_largest_element.$const4$nthSmallestElement, rank, v_set, function);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 8565L)
    public static SubLObject removal_nth_largest_n_the_set_of_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return removal_nth_extremal_n_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 8916L)
    public static SubLObject removal_nth_largest_n_the_set_of_output_generate(final SubLObject rank, final SubLObject v_set, final SubLObject function) {
        return removal_nth_extremal_n_output_generate(removal_modules_nth_largest_element.$const2$nthLargestElement, rank, v_set, function);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 10213L)
    public static SubLObject removal_nth_smallest_n_the_set_of_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return removal_nth_extremal_n_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 10569L)
    public static SubLObject removal_nth_smallest_n_the_set_of_output_generate(final SubLObject rank, final SubLObject v_set, final SubLObject function) {
        return removal_nth_extremal_n_output_generate(removal_modules_nth_largest_element.$const4$nthSmallestElement, rank, v_set, function);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 11876L)
    public static SubLObject removal_nth_largest_iterate_collection_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return cardinality_estimates.instance_cardinality(cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nth_largest_element.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 12261L)
    public static SubLObject removal_nth_largest_iterate_collection_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return removal_nth_extremal_iterate_expand(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 13028L)
    public static SubLObject removal_nth_smallest_iterate_collection_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return cardinality_estimates.instance_cardinality(cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nth_largest_element.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 13417L)
    public static SubLObject removal_nth_smallest_iterate_collection_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return removal_nth_extremal_iterate_expand(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 14175L)
    public static SubLObject removal_nth_extremal_iterate_expand(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_nth_largest_element.UNPROVIDED);
        SubLObject v_object = (SubLObject)removal_modules_nth_largest_element.NIL;
        SubLObject rank = (SubLObject)removal_modules_nth_largest_element.NIL;
        SubLObject v_set = (SubLObject)removal_modules_nth_largest_element.NIL;
        SubLObject function = (SubLObject)removal_modules_nth_largest_element.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_nth_largest_element.$list24);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_nth_largest_element.$list24);
        rank = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_nth_largest_element.$list24);
        v_set = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_nth_largest_element.$list24);
        function = current.first();
        current = current.rest();
        if (removal_modules_nth_largest_element.NIL == current) {
            final SubLObject elements = quantities.evaluate_set_elements(v_set, (SubLObject)removal_modules_nth_largest_element.$kw9$HL);
            thread.resetMultipleValues();
            SubLObject evaluation_pairs = numeric_quantification.numeric_evaluate_all_unary(function, elements);
            final SubLObject valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_nth_largest_element.NIL != valid) {
                final SubLObject pcase_var = predicate;
                if (pcase_var.eql(removal_modules_nth_largest_element.$const2$nthLargestElement)) {
                    evaluation_pairs = cyc_quantity_decreasing_sort(evaluation_pairs, Symbols.symbol_function((SubLObject)removal_modules_nth_largest_element.$sym10$CDR));
                }
                else if (pcase_var.eql(removal_modules_nth_largest_element.$const4$nthSmallestElement)) {
                    evaluation_pairs = cyc_quantity_increasing_sort(evaluation_pairs, Symbols.symbol_function((SubLObject)removal_modules_nth_largest_element.$sym10$CDR));
                }
                SubLObject cdolist_list_var;
                evaluation_pairs = (cdolist_list_var = removal_nth_extremal_convert_to_rankings(evaluation_pairs));
                SubLObject nth_item_pair = (SubLObject)removal_modules_nth_largest_element.NIL;
                nth_item_pair = cdolist_list_var.first();
                while (removal_modules_nth_largest_element.NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.term_unify((SubLObject)ConsesLow.cons(v_object, rank), nth_item_pair, (SubLObject)removal_modules_nth_largest_element.T, (SubLObject)removal_modules_nth_largest_element.T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_nth_largest_element.NIL != v_bindings) {
                        final SubLObject subst_rank = bindings.subst_bindings(v_bindings, rank);
                        final SubLObject subst_object = bindings.subst_bindings(v_bindings, v_object);
                        final SubLObject hl_formula = (SubLObject)ConsesLow.list(predicate, subst_object, subst_rank, v_set, function);
                        final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_nth_largest_element.$kw25$OPAQUE, hl_formula, (SubLObject)removal_modules_nth_largest_element.UNPROVIDED, (SubLObject)removal_modules_nth_largest_element.UNPROVIDED);
                        backward.removal_add_node(hl_support, v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    nth_item_pair = cdolist_list_var.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_nth_largest_element.$list24);
        }
        return (SubLObject)removal_modules_nth_largest_element.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 15552L)
    public static SubLObject removal_nth_extremal_convert_to_rankings(final SubLObject evaluation_pairs) {
        if (removal_modules_nth_largest_element.NIL != evaluation_pairs) {
            final SubLObject first_pair = evaluation_pairs.first();
            SubLObject last_value = first_pair.rest();
            SubLObject current_rank = (SubLObject)removal_modules_nth_largest_element.ONE_INTEGER;
            SubLObject current_index = (SubLObject)removal_modules_nth_largest_element.ONE_INTEGER;
            ConsesLow.rplacd(first_pair, current_rank);
            SubLObject cdolist_list_var = evaluation_pairs.rest();
            SubLObject rest_pair = (SubLObject)removal_modules_nth_largest_element.NIL;
            rest_pair = cdolist_list_var.first();
            while (removal_modules_nth_largest_element.NIL != cdolist_list_var) {
                current_index = Numbers.add(current_index, (SubLObject)removal_modules_nth_largest_element.ONE_INTEGER);
                final SubLObject rest_value = rest_pair.rest();
                if (!last_value.equal(rest_value)) {
                    current_rank = current_index;
                }
                ConsesLow.rplacd(rest_pair, current_rank);
                last_value = rest_value;
                cdolist_list_var = cdolist_list_var.rest();
                rest_pair = cdolist_list_var.first();
            }
        }
        return evaluation_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 16173L)
    public static SubLObject removal_nth_largest_iterate_the_set_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return cycl_utilities.nat_arity(cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nth_largest_element.UNPROVIDED), (SubLObject)removal_modules_nth_largest_element.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 16541L)
    public static SubLObject removal_nth_largest_iterate_the_set_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return removal_nth_extremal_iterate_expand(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 17279L)
    public static SubLObject removal_nth_smallest_iterate_the_set_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return cycl_utilities.nat_arity(cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nth_largest_element.UNPROVIDED), (SubLObject)removal_modules_nth_largest_element.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 17652L)
    public static SubLObject removal_nth_smallest_iterate_the_set_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return removal_nth_extremal_iterate_expand(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 18704L)
    public static SubLObject removal_nth_largest_iterate_the_set_of_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return removal_nth_extremal_iterate_expand(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 19549L)
    public static SubLObject removal_nth_smallest_iterate_the_set_of_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nth_largest_element.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nth_largest_element.NIL;
        }
        return removal_nth_extremal_iterate_expand(asent);
    }
    
    public static SubLObject declare_removal_modules_nth_largest_element_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "cyc_quantity_decreasing_sort", "CYC-QUANTITY-DECREASING-SORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "cyc_quantity_increasing_sort", "CYC-QUANTITY-INCREASING-SORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_largest_n_collection_required", "REMOVAL-NTH-LARGEST-N-COLLECTION-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_largest_n_collection_output_generate", "REMOVAL-NTH-LARGEST-N-COLLECTION-OUTPUT-GENERATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_smallest_n_collection_required", "REMOVAL-NTH-SMALLEST-N-COLLECTION-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_smallest_n_collection_output_generate", "REMOVAL-NTH-SMALLEST-N-COLLECTION-OUTPUT-GENERATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_extremal_n_required", "REMOVAL-NTH-EXTREMAL-N-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_extremal_n_output_generate", "REMOVAL-NTH-EXTREMAL-N-OUTPUT-GENERATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_largest_n_the_set_required", "REMOVAL-NTH-LARGEST-N-THE-SET-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_largest_n_the_set_output_generate", "REMOVAL-NTH-LARGEST-N-THE-SET-OUTPUT-GENERATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_smallest_n_the_set_required", "REMOVAL-NTH-SMALLEST-N-THE-SET-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_smallest_n_the_set_output_generate", "REMOVAL-NTH-SMALLEST-N-THE-SET-OUTPUT-GENERATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_largest_n_the_set_of_required", "REMOVAL-NTH-LARGEST-N-THE-SET-OF-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_largest_n_the_set_of_output_generate", "REMOVAL-NTH-LARGEST-N-THE-SET-OF-OUTPUT-GENERATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_smallest_n_the_set_of_required", "REMOVAL-NTH-SMALLEST-N-THE-SET-OF-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_smallest_n_the_set_of_output_generate", "REMOVAL-NTH-SMALLEST-N-THE-SET-OF-OUTPUT-GENERATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_largest_iterate_collection_cost", "REMOVAL-NTH-LARGEST-ITERATE-COLLECTION-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_largest_iterate_collection_expand", "REMOVAL-NTH-LARGEST-ITERATE-COLLECTION-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_smallest_iterate_collection_cost", "REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_smallest_iterate_collection_expand", "REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_extremal_iterate_expand", "REMOVAL-NTH-EXTREMAL-ITERATE-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_extremal_convert_to_rankings", "REMOVAL-NTH-EXTREMAL-CONVERT-TO-RANKINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_largest_iterate_the_set_cost", "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_largest_iterate_the_set_expand", "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_smallest_iterate_the_set_cost", "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_smallest_iterate_the_set_expand", "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_largest_iterate_the_set_of_expand", "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-OF-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element", "removal_nth_smallest_iterate_the_set_of_expand", "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-OF-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_nth_largest_element.NIL;
    }
    
    public static SubLObject init_removal_modules_nth_largest_element_file() {
        removal_modules_nth_largest_element.$default_removal_nth_extremal_n_cost$ = SubLFiles.defparameter("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*", (SubLObject)removal_modules_nth_largest_element.ONE_INTEGER);
        removal_modules_nth_largest_element.$default_the_set_of_cardinality_estimate$ = SubLFiles.defparameter("*DEFAULT-THE-SET-OF-CARDINALITY-ESTIMATE*", (SubLObject)removal_modules_nth_largest_element.$int30$100);
        return (SubLObject)removal_modules_nth_largest_element.NIL;
    }
    
    public static SubLObject setup_removal_modules_nth_largest_element_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nth_largest_element.$const2$nthLargestElement);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nth_largest_element.$kw3$POS, removal_modules_nth_largest_element.$const2$nthLargestElement, (SubLObject)removal_modules_nth_largest_element.THREE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nth_largest_element.$kw3$POS, removal_modules_nth_largest_element.$const2$nthLargestElement, (SubLObject)removal_modules_nth_largest_element.FOUR_INTEGER);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nth_largest_element.$const4$nthSmallestElement);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nth_largest_element.$kw3$POS, removal_modules_nth_largest_element.$const4$nthSmallestElement, (SubLObject)removal_modules_nth_largest_element.THREE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nth_largest_element.$kw3$POS, removal_modules_nth_largest_element.$const4$nthSmallestElement, (SubLObject)removal_modules_nth_largest_element.FOUR_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nth_largest_element.$kw5$REMOVAL_NTH_LARGEST_N_COLLECTION, (SubLObject)removal_modules_nth_largest_element.$list6);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nth_largest_element.$kw7$REMOVAL_NTH_SMALLEST_N_COLLECTION, (SubLObject)removal_modules_nth_largest_element.$list8);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nth_largest_element.$kw12$REMOVAL_NTH_LARGEST_N_THE_SET, (SubLObject)removal_modules_nth_largest_element.$list13);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nth_largest_element.$kw14$REMOVAL_NTH_SMALLEST_N_THE_SET, (SubLObject)removal_modules_nth_largest_element.$list15);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nth_largest_element.$kw16$REMOVAL_NTH_LARGEST_N_THE_SET_OF, (SubLObject)removal_modules_nth_largest_element.$list17);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nth_largest_element.$kw18$REMOVAL_NTH_SMALLEST_N_THE_SET_OF, (SubLObject)removal_modules_nth_largest_element.$list19);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nth_largest_element.$kw20$REMOVAL_NTH_LARGEST_ITERATE_COLLECTION, (SubLObject)removal_modules_nth_largest_element.$list21);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nth_largest_element.$kw22$REMOVAL_NTH_SMALLEST_ITERATE_COLLECTION, (SubLObject)removal_modules_nth_largest_element.$list23);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nth_largest_element.$kw26$REMOVAL_NTH_LARGEST_ITERATE_THE_SET, (SubLObject)removal_modules_nth_largest_element.$list27);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nth_largest_element.$kw28$REMOVAL_NTH_SMALLEST_ITERATE_THE_SET, (SubLObject)removal_modules_nth_largest_element.$list29);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nth_largest_element.$kw31$REMOVAL_NTH_LARGEST_ITERATE_THE_SET_OF, (SubLObject)removal_modules_nth_largest_element.$list32);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nth_largest_element.$kw33$REMOVAL_NTH_SMALLEST_ITERATE_THE_SET_OF, (SubLObject)removal_modules_nth_largest_element.$list34);
        return (SubLObject)removal_modules_nth_largest_element.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_nth_largest_element_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_nth_largest_element_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_nth_largest_element_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_nth_largest_element();
        removal_modules_nth_largest_element.$default_removal_nth_extremal_n_cost$ = null;
        removal_modules_nth_largest_element.$default_the_set_of_cardinality_estimate$ = null;
        $sym0$CYC_GREATER_THAN = SubLObjectFactory.makeSymbol("CYC-GREATER-THAN");
        $sym1$CYC_LESS_THAN = SubLObjectFactory.makeSymbol("CYC-LESS-THAN");
        $const2$nthLargestElement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement"));
        $kw3$POS = SubLObjectFactory.makeKeyword("POS");
        $const4$nthSmallestElement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement"));
        $kw5$REMOVAL_NTH_LARGEST_N_COLLECTION = SubLObjectFactory.makeKeyword("REMOVAL-NTH-LARGEST-N-COLLECTION");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-LARGEST-N-COLLECTION-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NTH-LARGEST-N-COLLECTION-OUTPUT-GENERATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthLargestElement <whatever> <n> <collection> <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthLargestElement #$Alaska-State 1 \n       #$State-UnitedStates\n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $kw7$REMOVAL_NTH_SMALLEST_N_COLLECTION = SubLObjectFactory.makeKeyword("REMOVAL-NTH-SMALLEST-N-COLLECTION");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-SMALLEST-N-COLLECTION-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NTH-SMALLEST-N-COLLECTION-OUTPUT-GENERATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthSmallestElement <whatever> <n> <collection> <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthSmallestElement #$Alaska-State 50 \n       #$State-UnitedStates\n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $kw9$HL = SubLObjectFactory.makeKeyword("HL");
        $sym10$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym11$CAR = SubLObjectFactory.makeSymbol("CAR");
        $kw12$REMOVAL_NTH_LARGEST_N_THE_SET = SubLObjectFactory.makeKeyword("REMOVAL-NTH-LARGEST-N-THE-SET");
        $list13 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-LARGEST-N-THE-SET-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NTH-LARGEST-N-THE-SET-OUTPUT-GENERATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthLargestElement <whatever> <n> (#$TheSet . <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthLargestElement ?WHAT 1 \n       (#$TheSet 1 2 3 -3)\n       #$AbsoluteValueFn)") });
        $kw14$REMOVAL_NTH_SMALLEST_N_THE_SET = SubLObjectFactory.makeKeyword("REMOVAL-NTH-SMALLEST-N-THE-SET");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-SMALLEST-N-THE-SET-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NTH-SMALLEST-N-THE-SET-OUTPUT-GENERATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthSmallestElement <whatever> <n> (#$TheSet . <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthSmallestElement ?WHAT 1\n       (#$TheSet 1 2 3 -3)\n       #$AbsoluteValueFn)") });
        $kw16$REMOVAL_NTH_LARGEST_N_THE_SET_OF = SubLObjectFactory.makeKeyword("REMOVAL-NTH-LARGEST-N-THE-SET-OF");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-LARGEST-N-THE-SET-OF-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NTH-LARGEST-N-THE-SET-OF-OUTPUT-GENERATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthLargestElement  <whatever> <n> (#$TheSetOf <var> <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthLargestElement ?COUNTRY 1 \n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $kw18$REMOVAL_NTH_SMALLEST_N_THE_SET_OF = SubLObjectFactory.makeKeyword("REMOVAL-NTH-SMALLEST-N-THE-SET-OF");
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-SMALLEST-N-THE-SET-OF-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NTH-SMALLEST-N-THE-SET-OF-OUTPUT-GENERATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthSmallestElement <whatever> <n> (#$TheSetOf <var> <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthSmallestElement ?COUNTRY 1 \n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $kw20$REMOVAL_NTH_LARGEST_ITERATE_COLLECTION = SubLObjectFactory.makeKeyword("REMOVAL-NTH-LARGEST-ITERATE-COLLECTION");
        $list21 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-LARGEST-ITERATE-COLLECTION-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-LARGEST-ITERATE-COLLECTION-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthLargestElement <whatever> <not-fully-bound> <collection> <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthLargestElement #$China-PeoplesRepublic ?NTH\n       #$IndependentCountry\n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $kw22$REMOVAL_NTH_SMALLEST_ITERATE_COLLECTION = SubLObjectFactory.makeKeyword("REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthSmallestElement <whatever> <not-fully-bound> <collection> <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthSmallestElement #$Belgium ?NTH\n       #$IndependentCountry\n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"));
        $kw25$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw26$REMOVAL_NTH_LARGEST_ITERATE_THE_SET = SubLObjectFactory.makeKeyword("REMOVAL-NTH-LARGEST-ITERATE-THE-SET");
        $list27 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-LARGEST-ITERATE-THE-SET-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-LARGEST-ITERATE-THE-SET-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthLargestElement <whatever> <not-fully-bound> (TheSet . <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthLargestElement 3 ?WHAT\n      (#$TheSet 1 2 3 -3)\n      #$AbsoluteValueFn)") });
        $kw28$REMOVAL_NTH_SMALLEST_ITERATE_THE_SET = SubLObjectFactory.makeKeyword("REMOVAL-NTH-SMALLEST-ITERATE-THE-SET");
        $list29 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthSmallestElement <whatever> <not-fully-bound> (TheSet . <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthSmallestElement 3 ?WHAT\n       (#$TheSet 1 2 3 -3)\n       #$AbsoluteValueFn)") });
        $int30$100 = SubLObjectFactory.makeInteger(100);
        $kw31$REMOVAL_NTH_LARGEST_ITERATE_THE_SET_OF = SubLObjectFactory.makeKeyword("REMOVAL-NTH-LARGEST-ITERATE-THE-SET-OF");
        $list32 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-THE-SET-OF-CARDINALITY-ESTIMATE*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-LARGEST-ITERATE-THE-SET-OF-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthLargestElement  <whatever> <not-fully-bound> (#$TheSetOf <var> <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthLargestElement #$France ?NTH\n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))") });
        $kw33$REMOVAL_NTH_SMALLEST_ITERATE_THE_SET_OF = SubLObjectFactory.makeKeyword("REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-OF");
        $list34 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthSmallestElement")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-THE-SET-OF-CARDINALITY-ESTIMATE*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-OF-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nthSmallestElement <whatever> <not-fully-bound> (#$TheSetOf <var> <closed>) <function>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nthSmallestElement #$Denmark ?NTH\n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))") });
    }
}

/*

	Total time: 187 ms
	
*/