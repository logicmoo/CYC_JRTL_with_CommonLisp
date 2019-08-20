/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_normal_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.set_process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TYPICALITY-REFERENCE-SET
 *  source file: /cyc/top/cycl/typicality-reference-set.lisp
 *  created:     2019/07/03 17:39:05
 */
public final class typicality_reference_set extends SubLTranslatedFile implements V02 {
    // // Constructor
    private typicality_reference_set() {
    }

    public static final SubLFile me = new typicality_reference_set();




    public static final SubLObject find_or_create_typicality_problem_store() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject reusedP = NIL;
                if (NIL != inference_datastructures_problem_store.valid_problem_store_p($typicality_problem_store$.getDynamicValue(thread))) {
                    if (NIL != typicality_problem_store_size_okP()) {
                        reusedP = T;
                    } else {
                        inference_datastructures_problem_store.destroy_problem_store($typicality_problem_store$.getDynamicValue(thread));
                        $typicality_problem_store$.setDynamicValue(inference_datastructures_problem_store.new_problem_store(UNPROVIDED), thread);
                    }
                    return values($typicality_problem_store$.getDynamicValue(thread), reusedP);
                }
                return values(inference_datastructures_problem_store.new_problem_store(UNPROVIDED), reusedP);
            }
        }
    }

    public static final SubLObject typicality_problem_store_size_okP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return numL(inference_datastructures_problem_store.problem_store_size($typicality_problem_store$.getDynamicValue(thread)), $int$100000);
        }
    }

    public static final SubLObject with_typicality_problem_store(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject reusedP = $sym1$REUSED_;
            return list(CMULTIPLE_VALUE_BIND, list($typicality_problem_store$, reusedP), $list_alt4, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(PUNLESS, reusedP, $list_alt8)));
        }
    }

    // defparameter
    private static final SubLSymbol $transcript_prevalence_assertionsP$ = makeSymbol("*TRANSCRIPT-PREVALENCE-ASSERTIONS?*");

    public static final SubLObject transcript_prevalence_assertionsP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean($transcript_prevalence_assertionsP$.getDynamicValue(thread));
        }
    }

    public static final SubLObject transcripting_prevalence_assertions(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt10, append(body, NIL));
        }
    }

    // defparameter
    private static final SubLSymbol $default_typicality_backchain$ = makeSymbol("*DEFAULT-TYPICALITY-BACKCHAIN*");

    // defparameter
    private static final SubLSymbol $default_typicality_time_cutoff$ = makeSymbol("*DEFAULT-TYPICALITY-TIME-CUTOFF*");

    public static final SubLObject typicality_reference_set_members(SubLObject reference_set) {
        return kb_mapping_utilities.pred_values_in_any_mt(reference_set, $$typicalityReferenceSetMembers, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject typicality_reference_set_mt(SubLObject reference_set) {
        return kb_mapping_utilities.fpred_value_in_any_mt(reference_set, $$typicalityReferenceSetMicrotheory, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject typicality_reference_set_domain_property(SubLObject reference_set) {
        return kb_mapping_utilities.fpred_value_in_any_mt(reference_set, $const14$typicalityReferenceSetDomainPrope, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject typicality_reference_set_cardinality(SubLObject reference_set) {
        {
            SubLObject cardinality = kb_mapping_utilities.fpred_value_in_any_mt(reference_set, $$typicalityReferenceSetSize, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (!cardinality.isInteger()) {
                cardinality = length(typicality_reference_set_members(reference_set));
            }
            return cardinality;
        }
    }

    public static final SubLObject typicality_reference_set_properties_and_prevalences(SubLObject reference_set, SubLObject at_least, SubLObject less_than) {
        if (at_least == UNPROVIDED) {
            at_least = ZERO_INTEGER;
        }
        if (less_than == UNPROVIDED) {
            less_than = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = typicality_reference_set_mt(reference_set);
                SubLObject ans = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject problem_store = find_or_create_typicality_problem_store();
                    SubLObject reusedP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    ans = inference_kernel.new_cyc_query(list($$and, listS($$typicalityReferenceSetSize, reference_set, $list_alt17), list($$greaterThanOrEqualTo, $sym19$_PREVALENCE, listS($$TimesFn, at_least, $list_alt17)), list($$lessThan, $sym19$_PREVALENCE, listS($$TimesFn, less_than, $list_alt17)), listS($const22$prevalenceOfPropertyInReferenceSe, $sym23$_PROPERTY, reference_set, $list_alt24)), mt, list($RETURN, $list_alt26, $PROBLEM_STORE, problem_store));
                    if (NIL == reusedP) {
                        inference_datastructures_problem_store.destroy_problem_store(problem_store);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject lookup_prevalence(SubLObject property, SubLObject reference_set) {
        SubLTrampolineFile.checkType(property, $sym28$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_);
        if (NIL != properties.unknown_property_p(property)) {
            {
                SubLObject inverse_property = cycl_utilities.formula_arg1(property, UNPROVIDED);
                SubLObject cardinality = typicality_reference_set_cardinality(reference_set);
                SubLObject inverse_prevalence = lookup_prevalence(inverse_property, reference_set);
                return NIL != inverse_prevalence ? ((SubLObject) (subtract(cardinality, inverse_prevalence))) : NIL;
            }
        }
        {
            SubLObject mt = typicality_reference_set_mt(reference_set);
            return inference_kernel.new_cyc_query(listS($const22$prevalenceOfPropertyInReferenceSe, property, reference_set, $list_alt24), mt, list($RETURN, $list_alt29)).first();
        }
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; the prevalence of PROPERTY in REFERENCE-SET.
     */
    public static final SubLObject property_prevalence(SubLObject property, SubLObject reference_set) {
        {
            SubLObject prevalence = lookup_prevalence(property, reference_set);
            if (NIL != dont_use_property_for_typicalityP(property, typicality_reference_set_mt(reference_set))) {
                Errors.sublisp_break($str_alt30$Trying_to_get_prevalence_for__S, new SubLObject[]{ property });
            } else
                if (NIL != subl_promotions.non_negative_integer_p(prevalence)) {
                } else
                    if ((NIL == properties.unknown_property_p(property)) && (NIL != arbitrary_reference_set_member_has_propertyP(reference_set, property))) {
                        prevalence = typicality_reference_set_cardinality(reference_set);
                    } else {
                        prevalence = compute_and_assert_prevalence(property, reference_set, NIL);
                    }


            return prevalence;
        }
    }

    public static final SubLObject build_reference_set_for_collections(SubLObject collections, SubLObject mt, SubLObject target_set_size, SubLObject threshold) {
        if (target_set_size == UNPROVIDED) {
            target_set_size = $int$200;
        }
        if (threshold == UNPROVIDED) {
            threshold = ONE_INTEGER;
        }
        {
            SubLObject cdolist_list_var = collections;
            SubLObject collection = NIL;
            for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                try {
                                    build_reference_set_for_collection(collection, mt, target_set_size, threshold);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject build_reference_set_for_collection(SubLObject collection, SubLObject mt, SubLObject target_set_size, SubLObject threshold) {
        if (target_set_size == UNPROVIDED) {
            target_set_size = $int$200;
        }
        if (threshold == UNPROVIDED) {
            threshold = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(collection, CONSTANT_P);
            SubLTrampolineFile.checkType(collection, $sym35$COLLECTION_);
            {
                SubLObject reference_set = NIL;
                {
                    SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
                    try {
                        $package$.bind(find_package($$$CYC), thread);
                        $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                        $print_readably$.bind(NIL, thread);
                        $read_eval$.bind(NIL, thread);
                        {
                            SubLObject old_priority = process_priority(current_process());
                            try {
                                set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                                {
                                    SubLObject _prev_bind_0_1 = $package$.currentBinding(thread);
                                    SubLObject _prev_bind_1_2 = $print_readably$.currentBinding(thread);
                                    SubLObject _prev_bind_2_3 = $read_eval$.currentBinding(thread);
                                    SubLObject _prev_bind_3_4 = $read_default_float_format$.currentBinding(thread);
                                    try {
                                        $package$.bind(find_package($$$CYC), thread);
                                        $print_readably$.bind(NIL, thread);
                                        $read_eval$.bind(NIL, thread);
                                        $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                        {
                                            SubLObject reference_set_name = cconcatenate(constants_high.constant_name(collection), $$$ReferenceSet);
                                            SubLObject property = list($$isa, $TERM, collection);
                                            SubLObject defining_mt = $$UniversalVocabularyMt;
                                            reference_set = build_reference_set_for_property(property, mt, reference_set_name, target_set_size, threshold);
                                            typicality_assert(list($const42$typicalityReferenceSetDomainColle, reference_set, collection), defining_mt);
                                        }
                                    } finally {
                                        $read_default_float_format$.rebind(_prev_bind_3_4, thread);
                                        $read_eval$.rebind(_prev_bind_2_3, thread);
                                        $print_readably$.rebind(_prev_bind_1_2, thread);
                                        $package$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        set_process_priority(current_process(), old_priority);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $read_eval$.rebind(_prev_bind_3, thread);
                        $print_readably$.rebind(_prev_bind_2, thread);
                        $read_default_float_format$.rebind(_prev_bind_1, thread);
                        $package$.rebind(_prev_bind_0, thread);
                    }
                }
                return reference_set;
            }
        }
    }

    public static final SubLObject build_reference_set_for_property(SubLObject property, SubLObject mt, SubLObject reference_set_name, SubLObject target_set_size, SubLObject threshold) {
        if (reference_set_name == UNPROVIDED) {
            reference_set_name = NIL;
        }
        if (target_set_size == UNPROVIDED) {
            target_set_size = $int$200;
        }
        if (threshold == UNPROVIDED) {
            threshold = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!reference_set_name.isString()) {
                {
                    SubLObject base_name = $$$TypicalityReferenceSet;
                    SubLObject counter = ONE_INTEGER;
                    while ((!reference_set_name.isString()) || (NIL != constant_handles.valid_constantP(constants_high.find_constant(reference_set_name), UNPROVIDED))) {
                        reference_set_name = cconcatenate(base_name, format(NIL, $str_alt44$__3__0D, counter));
                    } 
                }
            }
            {
                SubLObject reference_set = NIL;
                {
                    SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
                    try {
                        $package$.bind(find_package($$$CYC), thread);
                        $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                        $print_readably$.bind(NIL, thread);
                        $read_eval$.bind(NIL, thread);
                        {
                            SubLObject old_priority = process_priority(current_process());
                            try {
                                set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                                {
                                    SubLObject _prev_bind_0_6 = $package$.currentBinding(thread);
                                    SubLObject _prev_bind_1_7 = $print_readably$.currentBinding(thread);
                                    SubLObject _prev_bind_2_8 = $read_eval$.currentBinding(thread);
                                    SubLObject _prev_bind_3_9 = $read_default_float_format$.currentBinding(thread);
                                    try {
                                        $package$.bind(find_package($$$CYC), thread);
                                        $print_readably$.bind(NIL, thread);
                                        $read_eval$.bind(NIL, thread);
                                        $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                        {
                                            SubLObject defining_mt = $$UniversalVocabularyMt;
                                            typicality_create(reference_set_name);
                                            reference_set = constants_high.find_constant(reference_set_name);
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if (NIL == constant_handles.valid_constantP(reference_set, UNPROVIDED)) {
                                                    Errors.error($str_alt45$Couldn_t_create__S, reference_set_name);
                                                }
                                            }
                                            typicality_assert(listS($$isa, reference_set, $list_alt46), defining_mt);
                                            typicality_assert(list($$typicalityReferenceSetMicrotheory, reference_set, mt), defining_mt);
                                            typicality_assert(list($const14$typicalityReferenceSetDomainPrope, reference_set, property), defining_mt);
                                            {
                                                SubLObject new_members = recruit_new_reference_set_members(reference_set, target_set_size);
                                                add_new_reference_set_members(reference_set, new_members, defining_mt);
                                            }
                                            compute_and_assert_all(reference_set, threshold, UNPROVIDED);
                                        }
                                    } finally {
                                        $read_default_float_format$.rebind(_prev_bind_3_9, thread);
                                        $read_eval$.rebind(_prev_bind_2_8, thread);
                                        $print_readably$.rebind(_prev_bind_1_7, thread);
                                        $package$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        set_process_priority(current_process(), old_priority);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $read_eval$.rebind(_prev_bind_3, thread);
                        $print_readably$.rebind(_prev_bind_2, thread);
                        $read_default_float_format$.rebind(_prev_bind_1, thread);
                        $package$.rebind(_prev_bind_0, thread);
                    }
                }
                return reference_set;
            }
        }
    }

    public static final SubLObject recruit_new_reference_set_members(SubLObject reference_set, SubLObject target_set_size) {
        {
            SubLObject domain_property = typicality_reference_set_domain_property(reference_set);
            SubLObject mt = typicality_reference_set_mt(reference_set);
            SubLObject var = $sym47$_TERM;
            SubLObject sentence = properties.property_to_sentence(domain_property, var);
            SubLObject existing_members = typicality_reference_set_members(reference_set);
            SubLObject max_number_to_add = subtract(target_set_size, length(existing_members));
            SubLObject new_members = list_utilities.first_n(max_number_to_add, list_utilities.randomize_list(set_difference(ask_utilities.ask_variable($sym47$_TERM, sentence, mt, ZERO_INTEGER, target_set_size, UNPROVIDED, UNPROVIDED), existing_members, UNPROVIDED, UNPROVIDED)));
            return new_members;
        }
    }

    public static final SubLObject add_new_reference_set_members(SubLObject reference_set, SubLObject new_members, SubLObject defining_mt) {
        if (defining_mt == UNPROVIDED) {
            defining_mt = $$UniversalVocabularyMt;
        }
        {
            SubLObject mt = typicality_reference_set_mt(reference_set);
            Errors.warn($str_alt48$Adding__S_new_members_to__S___, length(new_members), reference_set);
            {
                SubLObject cdolist_list_var = new_members;
                SubLObject new_member = NIL;
                for (new_member = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_member = cdolist_list_var.first()) {
                    typicality_assert(list($$typicalityReferenceSetMembers, reference_set, new_member), mt);
                }
            }
            update_typicality_reference_size(reference_set, defining_mt);
        }
        return new_members;
    }

    public static final SubLObject update_typicality_reference_size(SubLObject reference_set, SubLObject defining_mt) {
        if (defining_mt == UNPROVIDED) {
            defining_mt = $$UniversalVocabularyMt;
        }
        {
            SubLObject mt = typicality_reference_set_mt(reference_set);
            SubLObject set_size = kb_indexing.num_gaf_arg_index(reference_set, ONE_INTEGER, $$typicalityReferenceSetMembers, mt);
            typicality_update_asserted_value(TWO_INTEGER, list($$typicalityReferenceSetSize, reference_set, set_size), defining_mt);
            return set_size;
        }
    }

    public static final SubLObject typicality_create(SubLObject name) {
        if (NIL != transcript_prevalence_assertionsP()) {
            ke.ke_create_now(name, UNPROVIDED);
        } else {
            fi.fi_create_int(name, UNPROVIDED);
        }
        return name;
    }

    public static final SubLObject typicality_assert(SubLObject sentence, SubLObject mt) {
        {
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            if (NIL != transcript_prevalence_assertionsP()) {
                                fi.fi_assert(sentence, mt, UNPROVIDED, UNPROVIDED);
                                while (NIL == operation_queues.local_queue_empty()) {
                                    sleep(ONE_INTEGER);
                                } 
                            } else {
                                fi.fi_assert_int(sentence, mt, UNPROVIDED, UNPROVIDED);
                                if (NIL != fi.fi_error_signaledP()) {
                                    Errors.warn(fi.fi_error_string(fi.fi_get_error_int()));
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
        }
        return sentence;
    }

    public static final SubLObject typicality_unassert(SubLObject sentence, SubLObject mt) {
        if (NIL != transcript_prevalence_assertionsP()) {
            fi.fi_unassert(sentence, mt);
            while (NIL == operation_queues.local_queue_empty()) {
                sleep(ONE_INTEGER);
            } 
        } else {
            fi.fi_unassert_int(sentence, mt);
            if (NIL != fi.fi_error_signaledP()) {
                Errors.warn(fi.fi_error_string(fi.fi_get_error_int()));
            }
        }
        return sentence;
    }

    public static final SubLObject typicality_unassert_threaded(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
                    try {
                        $package$.bind(find_package($$$CYC), thread);
                        $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                        $print_readably$.bind(NIL, thread);
                        $read_eval$.bind(NIL, thread);
                        {
                            SubLObject old_priority = process_priority(current_process());
                            try {
                                set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                                {
                                    SubLObject _prev_bind_0_11 = $package$.currentBinding(thread);
                                    SubLObject _prev_bind_1_12 = $print_readably$.currentBinding(thread);
                                    SubLObject _prev_bind_2_13 = $read_eval$.currentBinding(thread);
                                    SubLObject _prev_bind_3_14 = $read_default_float_format$.currentBinding(thread);
                                    try {
                                        $package$.bind(find_package($$$CYC), thread);
                                        $print_readably$.bind(NIL, thread);
                                        $read_eval$.bind(NIL, thread);
                                        $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                        result = typicality_unassert(sentence, mt);
                                    } finally {
                                        $read_default_float_format$.rebind(_prev_bind_3_14, thread);
                                        $read_eval$.rebind(_prev_bind_2_13, thread);
                                        $print_readably$.rebind(_prev_bind_1_12, thread);
                                        $package$.rebind(_prev_bind_0_11, thread);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        set_process_priority(current_process(), old_priority);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $read_eval$.rebind(_prev_bind_3, thread);
                        $print_readably$.rebind(_prev_bind_2, thread);
                        $read_default_float_format$.rebind(_prev_bind_1, thread);
                        $package$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject typicality_update_asserted_value(SubLObject arg_num, SubLObject sentence, SubLObject mt) {
        {
            SubLObject index_arg = NIL;
            SubLObject index_arg_num = NIL;
            SubLObject this_arg_num = ZERO_INTEGER;
            SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject rest = NIL;
            for (rest = args; !((NIL != index_arg) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject this_arg = rest.first();
                    this_arg_num = add(this_arg_num, ONE_INTEGER);
                    if ((!this_arg_num.eql(arg_num)) && (NIL != kb_indexing_datastructures.indexed_term_p(this_arg))) {
                        index_arg = this_arg;
                        index_arg_num = this_arg_num;
                    }
                }
            }
            if (NIL != index_arg_num) {
                {
                    SubLObject already_thereP = NIL;
                    SubLObject value_var = $sym50$_X;
                    SubLObject mt_var = $sym51$_MT;
                    SubLObject query_sentence = list($$ist_Asserted, mt_var, el_utilities.replace_formula_arg(arg_num, value_var, sentence));
                    SubLObject existing_pairs = inference_kernel.new_cyc_query(query_sentence, mt, list($RETURN, list($TEMPLATE, list(mt_var, value_var))));
                    SubLObject new_value = cycl_utilities.atomic_sentence_arg(sentence, arg_num, UNPROVIDED);
                    SubLObject cdolist_list_var = existing_pairs;
                    SubLObject existing_pair = NIL;
                    for (existing_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , existing_pair = cdolist_list_var.first()) {
                        {
                            SubLObject datum = existing_pair;
                            SubLObject current = datum;
                            SubLObject mt_16 = NIL;
                            SubLObject existing_value = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt54);
                            mt_16 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt54);
                            existing_value = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (existing_value.equal(new_value)) {
                                    already_thereP = T;
                                } else {
                                    {
                                        SubLObject bad_sentence = el_utilities.replace_formula_arg(arg_num, existing_value, sentence);
                                        typicality_unassert(bad_sentence, mt_16);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt54);
                            }
                        }
                    }
                    if (NIL == already_thereP) {
                        typicality_assert(sentence, mt);
                    }
                }
            }
        }
        return sentence;
    }

    public static final SubLObject compute_prevalence(SubLObject property, SubLObject reference_set, SubLObject backchain_max, SubLObject seconds) {
        if (backchain_max == UNPROVIDED) {
            backchain_max = $default_typicality_backchain$.getDynamicValue();
        }
        if (seconds == UNPROVIDED) {
            seconds = $default_typicality_time_cutoff$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = typicality_reference_set_mt(reference_set);
                SubLObject property_sentence = properties.property_to_sentence(property, $sym47$_TERM);
                SubLObject query_sentence = simplifier.conjoin(list(property_sentence, listS($$typicalityReferenceSetMembers, reference_set, $list_alt55)), UNPROVIDED);
                SubLObject backchain = ZERO_INTEGER;
                SubLObject count = ZERO_INTEGER;
                SubLObject stopP = NIL;
                SubLObject status = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject problem_store = find_or_create_typicality_problem_store();
                    SubLObject reusedP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject query_properties = list(new SubLObject[]{ $RETURN, $list_alt56, $ANSWER_LANGUAGE, $HL, $MAX_TRANSFORMATION_DEPTH, backchain, $MAX_TIME, seconds, $RESULT_UNIQUENESS, $BINDINGS, $PROBLEM_STORE, problem_store });
                        SubLObject query_static_properties = list_utilities.filter_plist(query_properties, QUERY_STATIC_PROPERTY_P);
                        SubLObject query_dynamic_properties = list_utilities.filter_plist(query_properties, QUERY_DYNAMIC_PROPERTY_P);
                        SubLObject inference = inference_kernel.new_continuable_inference(query_sentence, mt, query_static_properties);
                        while ((NIL != inference_datastructures_inference.continuable_inference_p(inference)) && (NIL == stopP)) {
                            {
                                SubLObject _prev_bind_0 = control_vars.$inference_debugP$.currentBinding(thread);
                                try {
                                    control_vars.$inference_debugP$.bind(T, thread);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject results = inference_kernel.continue_inference(inference, query_dynamic_properties);
                                        SubLObject current_status = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        status = current_status;
                                        count = add(count, length(results));
                                        {
                                            SubLObject done_with_current_backchain_levelP = makeBoolean((NIL == results) || (current_status == $EXHAUST));
                                            if (NIL == done_with_current_backchain_levelP) {
                                            } else
                                                if (backchain.numL(backchain_max)) {
                                                    backchain = add(backchain, ONE_INTEGER);
                                                    query_dynamic_properties = putf(query_dynamic_properties, $MAX_TRANSFORMATION_DEPTH, backchain);
                                                } else {
                                                    stopP = T;
                                                }

                                        }
                                    }
                                } finally {
                                    control_vars.$inference_debugP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } 
                        if (NIL != reusedP) {
                            inference_datastructures_inference.destroy_inference(inference);
                        } else {
                            inference_datastructures_problem_store.destroy_problem_store(problem_store);
                        }
                    }
                }
                return values(count, status);
            }
        }
    }

    public static final SubLObject compute_and_assert_all(SubLObject reference_set, SubLObject threshold, SubLObject done_properties) {
        if (threshold == UNPROVIDED) {
            threshold = ZERO_INTEGER;
        }
        if (done_properties == UNPROVIDED) {
            done_properties = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
                SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
                try {
                    $package$.bind(find_package($$$CYC), thread);
                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                    $print_readably$.bind(NIL, thread);
                    $read_eval$.bind(NIL, thread);
                    {
                        SubLObject old_priority = process_priority(current_process());
                        try {
                            set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                            {
                                SubLObject _prev_bind_0_17 = $package$.currentBinding(thread);
                                SubLObject _prev_bind_1_18 = $print_readably$.currentBinding(thread);
                                SubLObject _prev_bind_2_19 = $read_eval$.currentBinding(thread);
                                SubLObject _prev_bind_3_20 = $read_default_float_format$.currentBinding(thread);
                                try {
                                    $package$.bind(find_package($$$CYC), thread);
                                    $print_readably$.bind(NIL, thread);
                                    $read_eval$.bind(NIL, thread);
                                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                    {
                                        SubLObject set_members = typicality_reference_set_members(reference_set);
                                        SubLObject member_count = length(set_members);
                                        SubLObject message = format(NIL, $str_alt66$Computing_prevalence_for__S___, reference_set);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject _prev_bind_0_21 = $typicality_problem_store$.currentBinding(thread);
                                            try {
                                                $typicality_problem_store$.bind(find_or_create_typicality_problem_store(), thread);
                                                {
                                                    SubLObject reusedP = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    try {
                                                        {
                                                            SubLObject _prev_bind_0_22 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_23 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_24 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                                            SubLObject _prev_bind_3_25 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                                            try {
                                                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                utilities_macros.noting_percent_progress_preamble(message);
                                                                {
                                                                    SubLObject list_var = NIL;
                                                                    SubLObject member = NIL;
                                                                    SubLObject i = NIL;
                                                                    for (list_var = set_members, member = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , member = list_var.first() , i = add(ONE_INTEGER, i)) {
                                                                        utilities_macros.note_percent_progress(i, member_count);
                                                                        compute_and_assert_all_for_member(member, reference_set, done_properties, threshold);
                                                                    }
                                                                }
                                                                utilities_macros.noting_percent_progress_postamble();
                                                            } finally {
                                                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_25, thread);
                                                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_24, thread);
                                                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_23, thread);
                                                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_22, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL == reusedP) {
                                                                    inference_datastructures_problem_store.destroy_problem_store($typicality_problem_store$.getDynamicValue(thread));
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                $typicality_problem_store$.rebind(_prev_bind_0_21, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    $read_default_float_format$.rebind(_prev_bind_3_20, thread);
                                    $read_eval$.rebind(_prev_bind_2_19, thread);
                                    $print_readably$.rebind(_prev_bind_1_18, thread);
                                    $package$.rebind(_prev_bind_0_17, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    set_process_priority(current_process(), old_priority);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_27, thread);
                                }
                            }
                        }
                    }
                } finally {
                    $read_eval$.rebind(_prev_bind_3, thread);
                    $print_readably$.rebind(_prev_bind_2, thread);
                    $read_default_float_format$.rebind(_prev_bind_1, thread);
                    $package$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject compute_and_assert_all_for_member(SubLObject member, SubLObject reference_set, SubLObject done_properties, SubLObject threshold) {
        if (done_properties == UNPROVIDED) {
            done_properties = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        }
        if (threshold == UNPROVIDED) {
            threshold = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject _prev_bind_0 = $typicality_problem_store$.currentBinding(thread);
                try {
                    $typicality_problem_store$.bind(find_or_create_typicality_problem_store(), thread);
                    {
                        SubLObject reusedP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        try {
                            {
                                SubLObject mt = typicality_reference_set_mt(reference_set);
                                SubLObject set_contents_var = set.do_set_internal(properties.asserted_gaf_properties_of_term_denot(member, mt));
                                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                SubLObject state = NIL;
                                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    {
                                        SubLObject property = set_contents.do_set_contents_next(basis_object, state);
                                        if (NIL != set_contents.do_set_contents_element_validP(state, property)) {
                                            {
                                                SubLObject doneP = maybe_compute_and_assert_prevalence(property, reference_set, done_properties, threshold);
                                                if (NIL != doneP) {
                                                    {
                                                        SubLObject prevalence = property_prevalence(property, reference_set);
                                                        SubLObject zeroP = zerop(prevalence);
                                                        SubLObject reference_set_cardinality = typicality_reference_set_cardinality(reference_set);
                                                        SubLObject universalP = makeBoolean((NIL == zeroP) && prevalence.eql(reference_set_cardinality));
                                                        if (NIL == universalP) {
                                                            {
                                                                SubLObject cdolist_list_var = properties.more_general_properties(property, mt, UNPROVIDED);
                                                                SubLObject more_general_property = NIL;
                                                                for (more_general_property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , more_general_property = cdolist_list_var.first()) {
                                                                    if (NIL != zeroP) {
                                                                        if (NIL == subl_promotions.non_negative_integer_p(threshold)) {
                                                                            assert_prevalence(more_general_property, reference_set, ZERO_INTEGER);
                                                                        }
                                                                    } else {
                                                                        {
                                                                            SubLObject more_general_doneP = maybe_compute_and_assert_prevalence(more_general_property, reference_set, done_properties, threshold);
                                                                            zeroP = makeBoolean((NIL != more_general_doneP) && property_prevalence(more_general_property, reference_set).isZero());
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL == reusedP) {
                                        inference_datastructures_problem_store.destroy_problem_store($typicality_problem_store$.getDynamicValue(thread));
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
                                }
                            }
                        }
                    }
                } finally {
                    $typicality_problem_store$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $uninteresting_property_preds$ = makeSymbol("*UNINTERESTING-PROPERTY-PREDS*");

    public static final SubLObject uninteresting_property_pred_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $uninteresting_property_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject uninteresting_property_p(SubLObject property, SubLObject mt) {
        return makeBoolean(((NIL != uninteresting_property_pred_p(cycl_utilities.formula_arg0(property))) || (NIL != uninteresting_canonical_property_p(property, mt))) || ((NIL != properties.unknown_property_p(property)) && (NIL != uninteresting_property_p(cycl_utilities.formula_arg1(property, UNPROVIDED), mt))));
    }

    public static final SubLObject uninteresting_canonical_property_p(SubLObject property, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_utilities.hl_to_el(property), $list_alt68);
                SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    {
                        SubLObject fn = list_utilities.alist_lookup_without_values(v_bindings, FN, UNPROVIDED, UNPROVIDED);
                        SubLObject pred = list_utilities.alist_lookup_without_values(v_bindings, PRED, UNPROVIDED, UNPROVIDED);
                        if (NIL != subl_promotions.memberP(fn, kb_mapping_utilities.pred_values_in_relevant_mts(pred, $const71$functionCorrespondingPredicate_Ca, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                            return T;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject dont_use_property_for_typicalityP(SubLObject property, SubLObject mt) {
        if ((((NIL != uninteresting_property_p(property, mt)) || (NIL != properties.bad_fan_out_property_p(property, mt))) || (NIL != genl_predicates.genl_predicateP(cycl_utilities.formula_arg0(property), $$spatiallyRelated, mt, UNPROVIDED))) || cycl_utilities.formula_arg0(property).eql($$temporallyRelated)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject maybe_compute_and_assert_prevalence(SubLObject property, SubLObject reference_set, SubLObject done_properties, SubLObject threshold) {
        {
            SubLObject doneP = NIL;
            if (NIL != set.set_memberP(property, done_properties)) {
            } else
                if (NIL != dont_use_property_for_typicalityP(property, typicality_reference_set_mt(reference_set))) {
                } else
                    if (NIL != lookup_prevalence(property, reference_set)) {
                        set.set_add(property, done_properties);
                    } else
                        if (NIL != properties.unknown_property_p(property)) {
                            {
                                SubLObject inverse_property = cycl_utilities.formula_arg1(property, UNPROVIDED);
                                maybe_compute_and_assert_prevalence(inverse_property, reference_set, done_properties, threshold);
                            }
                        } else {
                            compute_and_assert_prevalence(property, reference_set, threshold);
                            set.set_add(property, done_properties);
                            doneP = T;
                        }



            return doneP;
        }
    }

    public static final SubLObject compute_and_assert_prevalence(SubLObject property, SubLObject reference_set, SubLObject threshold) {
        if (threshold == UNPROVIDED) {
            threshold = NIL;
        }
        {
            SubLObject prevalence = compute_prevalence(property, reference_set, UNPROVIDED, UNPROVIDED);
            if ((NIL != subl_promotions.non_negative_integer_p(prevalence)) && ((!threshold.isInteger()) || prevalence.numG(threshold))) {
                assert_prevalence(property, reference_set, prevalence);
            }
            return prevalence;
        }
    }

    public static final SubLObject assert_prevalence(SubLObject property, SubLObject reference_set, SubLObject prevalence) {
        SubLTrampolineFile.checkType(prevalence, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject mt = typicality_reference_set_mt(reference_set);
            SubLObject sentence = list($const22$prevalenceOfPropertyInReferenceSe, property, reference_set, prevalence);
            typicality_update_asserted_value(THREE_INTEGER, sentence, mt);
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $arbitrary_reference_set_member_has_propertyP_caching_state$ = makeSymbol("*ARBITRARY-REFERENCE-SET-MEMBER-HAS-PROPERTY?-CACHING-STATE*");

    public static final SubLObject clear_arbitrary_reference_set_member_has_propertyP() {
        {
            SubLObject cs = $arbitrary_reference_set_member_has_propertyP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_arbitrary_reference_set_member_has_propertyP(SubLObject reference_set, SubLObject property) {
        return memoization_state.caching_state_remove_function_results_with_args($arbitrary_reference_set_member_has_propertyP_caching_state$.getGlobalValue(), list(reference_set, property), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject arbitrary_reference_set_member_has_propertyP_internal(SubLObject reference_set, SubLObject property) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (property.equal(listS($$typicalityReferenceSetMembers, reference_set, $list_alt76))) {
                return T;
            }
            {
                SubLObject arbitrary_member = find_or_create_arbitrary_reference_set_member(reference_set);
                SubLObject mt = typicality_reference_set_mt(reference_set);
                return properties.term_has_propertyP(arbitrary_member, property, mt, list($MAX_TRANSFORMATION_DEPTH, $default_typicality_backchain$.getDynamicValue(thread), $MAX_TIME, $default_typicality_time_cutoff$.getDynamicValue(thread)));
            }
        }
    }

    public static final SubLObject arbitrary_reference_set_member_has_propertyP(SubLObject reference_set, SubLObject property) {
        {
            SubLObject caching_state = $arbitrary_reference_set_member_has_propertyP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym75$ARBITRARY_REFERENCE_SET_MEMBER_HAS_PROPERTY_, $sym77$_ARBITRARY_REFERENCE_SET_MEMBER_HAS_PROPERTY__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(reference_set, property);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw78$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (reference_set.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && property.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(arbitrary_reference_set_member_has_propertyP_internal(reference_set, property)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(reference_set, property));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    // deflexical
    private static final SubLSymbol $arbitrary_reference_set_members$ = makeSymbol("*ARBITRARY-REFERENCE-SET-MEMBERS*");

    public static final SubLObject arbitrary_reference_set_member_lookup(SubLObject reference_set) {
        return dictionary.dictionary_lookup($arbitrary_reference_set_members$.getGlobalValue(), reference_set, UNPROVIDED);
    }

    public static final SubLObject create_arbitrary_reference_set_member(SubLObject reference_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_property = typicality_reference_set_domain_property(reference_set);
                SubLObject mt = typicality_reference_set_mt(reference_set);
                SubLObject var = $sym79$_ARBITRARY_MEMBER;
                SubLObject sentence = properties.property_to_sentence(domain_property, var);
                SubLObject v_bindings = prove.fi_hypothesize_int(sentence, mt, UNPROVIDED, UNPROVIDED);
                SubLObject ans = bindings.variable_lookup(var, v_bindings);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == constant_handles.constant_p(ans)) {
                        Errors.error($str_alt80$Couldn_t_create_arbitrary_member_, reference_set);
                    }
                }
                dictionary.dictionary_enter($arbitrary_reference_set_members$.getGlobalValue(), reference_set, ans);
                return ans;
            }
        }
    }

    public static final SubLObject find_or_create_arbitrary_reference_set_member(SubLObject reference_set) {
        {
            SubLObject ans = arbitrary_reference_set_member_lookup(reference_set);
            if (NIL == ans) {
                ans = create_arbitrary_reference_set_member(reference_set);
            }
            return ans;
        }
    }

    public static final SubLObject notable_missing_properties(SubLObject v_term, SubLObject reference_set) {
        {
            SubLObject common_properties = Sort.sort(typicality_reference_set_properties_and_prevalences(reference_set, $float$0_5, UNPROVIDED), symbol_function($sym82$_), symbol_function(SECOND));
            SubLObject mt = typicality_reference_set_mt(reference_set);
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = common_properties;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject property = NIL;
                    SubLObject prevalence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt84);
                    property = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt84);
                    prevalence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != properties.term_has_propertyP(v_term, property, mt, list($PROBLEM_STORE, find_or_create_typicality_problem_store()))) {
                        } else
                            if (NIL != properties.term_has_propertyP(v_term, el_utilities.make_negation(property), mt, list($PROBLEM_STORE, find_or_create_typicality_problem_store()))) {
                                ans = cons(el_utilities.make_negation(property), ans);
                            } else {
                                ans = cons(properties.make_unknown_property(property), ans);
                            }

                    } else {
                        cdestructuring_bind_error(datum, $list_alt84);
                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject most_typical_wrt_reference_set(SubLObject reference_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_property = typicality_reference_set_domain_property(reference_set);
                SubLObject mt = typicality_reference_set_mt(reference_set);
                SubLObject set_cardinality = typicality_reference_set_cardinality(reference_set);
                SubLObject extent = properties.property_extent(domain_property, mt, UNPROVIDED);
                SubLObject most_typicals = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject high_score = ZERO_INTEGER;
                SubLObject most_typical = NIL;
                SubLObject doneP = NIL;
                SubLObject all_properties = inference_kernel.new_cyc_query(listS($const22$prevalenceOfPropertyInReferenceSe, $sym23$_PROPERTY, reference_set, $list_alt24), mt, $list_alt85);
                all_properties = Sort.sort(all_properties, symbol_function($sym86$_), symbol_function(SECOND));
                all_properties = remove(set_cardinality, all_properties, symbol_function(EQL), symbol_function(SECOND), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = extent;
                    SubLObject element = NIL;
                    for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                        dictionary.dictionary_enter(most_typicals, element, ZERO_INTEGER);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject _prev_bind_0 = $typicality_problem_store$.currentBinding(thread);
                    try {
                        $typicality_problem_store$.bind(find_or_create_typicality_problem_store(), thread);
                        {
                            SubLObject reusedP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            try {
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var = all_properties;
                                        SubLObject pair = NIL;
                                        for (pair = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pair = csome_list_var.first()) {
                                            Errors.warn($str_alt87$doing_property___S__, pair);
                                            {
                                                SubLObject property = pair.first();
                                                SubLObject prevalence = second(pair);
                                                SubLObject updates = NIL;
                                                {
                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(most_typicals));
                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            SubLObject score = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != properties.term_has_propertyP(element, property, mt, list($PROBLEM_STORE, find_or_create_typicality_problem_store()))) {
                                                                {
                                                                    SubLObject new_score = add(score, prevalence);
                                                                    updates = cons(list(element, new_score), updates);
                                                                    if (new_score.numG(high_score)) {
                                                                        high_score = new_score;
                                                                        most_typical = element;
                                                                    }
                                                                }
                                                            }
                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                        }
                                                    } 
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                }
                                                {
                                                    SubLObject cdolist_list_var = updates;
                                                    SubLObject pair_29 = NIL;
                                                    for (pair_29 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair_29 = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject datum = pair_29;
                                                            SubLObject current = datum;
                                                            SubLObject element = NIL;
                                                            SubLObject new_score = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt88);
                                                            element = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt88);
                                                            new_score = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                dictionary.dictionary_enter(most_typicals, element, new_score);
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt88);
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject removals = NIL;
                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(most_typicals));
                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            SubLObject score = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (!score.numG(multiply(high_score, $float$0_5))) {
                                                                removals = cons(element, removals);
                                                            }
                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                        }
                                                    } 
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    {
                                                        SubLObject cdolist_list_var = removals;
                                                        SubLObject element = NIL;
                                                        for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                                                            dictionary.dictionary_remove(most_typicals, element);
                                                        }
                                                    }
                                                }
                                                format(T, $str_alt89$__Remaining___S__Most_typical___S, dictionary.dictionary_length(most_typicals), most_typical);
                                                doneP = numL(dictionary.dictionary_length(most_typicals), TWO_INTEGER);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL == reusedP) {
                                            inference_datastructures_problem_store.destroy_problem_store($typicality_problem_store$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_30, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $typicality_problem_store$.rebind(_prev_bind_0, thread);
                    }
                }
                return most_typical;
            }
        }
    }

    public static final SubLObject declare_typicality_reference_set_file() {
        declareFunction("find_or_create_typicality_problem_store", "FIND-OR-CREATE-TYPICALITY-PROBLEM-STORE", 0, 0, false);
        declareFunction("typicality_problem_store_size_okP", "TYPICALITY-PROBLEM-STORE-SIZE-OK?", 0, 0, false);
        declareMacro("with_typicality_problem_store", "WITH-TYPICALITY-PROBLEM-STORE");
        declareFunction("transcript_prevalence_assertionsP", "TRANSCRIPT-PREVALENCE-ASSERTIONS?", 0, 0, false);
        declareMacro("transcripting_prevalence_assertions", "TRANSCRIPTING-PREVALENCE-ASSERTIONS");
        declareFunction("typicality_reference_set_members", "TYPICALITY-REFERENCE-SET-MEMBERS", 1, 0, false);
        declareFunction("typicality_reference_set_mt", "TYPICALITY-REFERENCE-SET-MT", 1, 0, false);
        declareFunction("typicality_reference_set_domain_property", "TYPICALITY-REFERENCE-SET-DOMAIN-PROPERTY", 1, 0, false);
        declareFunction("typicality_reference_set_cardinality", "TYPICALITY-REFERENCE-SET-CARDINALITY", 1, 0, false);
        declareFunction("typicality_reference_set_properties_and_prevalences", "TYPICALITY-REFERENCE-SET-PROPERTIES-AND-PREVALENCES", 1, 2, false);
        declareFunction("lookup_prevalence", "LOOKUP-PREVALENCE", 2, 0, false);
        declareFunction("property_prevalence", "PROPERTY-PREVALENCE", 2, 0, false);
        declareFunction("build_reference_set_for_collections", "BUILD-REFERENCE-SET-FOR-COLLECTIONS", 2, 2, false);
        declareFunction("build_reference_set_for_collection", "BUILD-REFERENCE-SET-FOR-COLLECTION", 2, 2, false);
        declareFunction("build_reference_set_for_property", "BUILD-REFERENCE-SET-FOR-PROPERTY", 2, 3, false);
        declareFunction("recruit_new_reference_set_members", "RECRUIT-NEW-REFERENCE-SET-MEMBERS", 2, 0, false);
        declareFunction("add_new_reference_set_members", "ADD-NEW-REFERENCE-SET-MEMBERS", 2, 1, false);
        declareFunction("update_typicality_reference_size", "UPDATE-TYPICALITY-REFERENCE-SIZE", 1, 1, false);
        declareFunction("typicality_create", "TYPICALITY-CREATE", 1, 0, false);
        declareFunction("typicality_assert", "TYPICALITY-ASSERT", 2, 0, false);
        declareFunction("typicality_unassert", "TYPICALITY-UNASSERT", 2, 0, false);
        declareFunction("typicality_unassert_threaded", "TYPICALITY-UNASSERT-THREADED", 2, 0, false);
        declareFunction("typicality_update_asserted_value", "TYPICALITY-UPDATE-ASSERTED-VALUE", 3, 0, false);
        declareFunction("compute_prevalence", "COMPUTE-PREVALENCE", 2, 2, false);
        declareFunction("compute_and_assert_all", "COMPUTE-AND-ASSERT-ALL", 1, 2, false);
        declareFunction("compute_and_assert_all_for_member", "COMPUTE-AND-ASSERT-ALL-FOR-MEMBER", 2, 2, false);
        declareFunction("uninteresting_property_pred_p", "UNINTERESTING-PROPERTY-PRED-P", 1, 0, false);
        declareFunction("uninteresting_property_p", "UNINTERESTING-PROPERTY-P", 2, 0, false);
        declareFunction("uninteresting_canonical_property_p", "UNINTERESTING-CANONICAL-PROPERTY-P", 2, 0, false);
        declareFunction("dont_use_property_for_typicalityP", "DONT-USE-PROPERTY-FOR-TYPICALITY?", 2, 0, false);
        declareFunction("maybe_compute_and_assert_prevalence", "MAYBE-COMPUTE-AND-ASSERT-PREVALENCE", 4, 0, false);
        declareFunction("compute_and_assert_prevalence", "COMPUTE-AND-ASSERT-PREVALENCE", 2, 1, false);
        declareFunction("assert_prevalence", "ASSERT-PREVALENCE", 3, 0, false);
        declareFunction("clear_arbitrary_reference_set_member_has_propertyP", "CLEAR-ARBITRARY-REFERENCE-SET-MEMBER-HAS-PROPERTY?", 0, 0, false);
        declareFunction("remove_arbitrary_reference_set_member_has_propertyP", "REMOVE-ARBITRARY-REFERENCE-SET-MEMBER-HAS-PROPERTY?", 2, 0, false);
        declareFunction("arbitrary_reference_set_member_has_propertyP_internal", "ARBITRARY-REFERENCE-SET-MEMBER-HAS-PROPERTY?-INTERNAL", 2, 0, false);
        declareFunction("arbitrary_reference_set_member_has_propertyP", "ARBITRARY-REFERENCE-SET-MEMBER-HAS-PROPERTY?", 2, 0, false);
        declareFunction("arbitrary_reference_set_member_lookup", "ARBITRARY-REFERENCE-SET-MEMBER-LOOKUP", 1, 0, false);
        declareFunction("create_arbitrary_reference_set_member", "CREATE-ARBITRARY-REFERENCE-SET-MEMBER", 1, 0, false);
        declareFunction("find_or_create_arbitrary_reference_set_member", "FIND-OR-CREATE-ARBITRARY-REFERENCE-SET-MEMBER", 1, 0, false);
        declareFunction("notable_missing_properties", "NOTABLE-MISSING-PROPERTIES", 2, 0, false);
        declareFunction("most_typical_wrt_reference_set", "MOST-TYPICAL-WRT-REFERENCE-SET", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_typicality_reference_set_file() {
        defparameter("*TYPICALITY-PROBLEM-STORE*", NIL);
        defparameter("*TRANSCRIPT-PREVALENCE-ASSERTIONS?*", NIL);
        defparameter("*DEFAULT-TYPICALITY-BACKCHAIN*", ZERO_INTEGER);
        defparameter("*DEFAULT-TYPICALITY-TIME-CUTOFF*", $int$30);
        deflexical("*UNINTERESTING-PROPERTY-PREDS*", $list_alt67);
        deflexical("*ARBITRARY-REFERENCE-SET-MEMBER-HAS-PROPERTY?-CACHING-STATE*", NIL);
        deflexical("*ARBITRARY-REFERENCE-SET-MEMBERS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_typicality_reference_set_file() {
                memoization_state.note_globally_cached_function($sym75$ARBITRARY_REFERENCE_SET_MEMBER_HAS_PROPERTY_);
        return NIL;
    }

    // // Internal Constants
    public static final SubLInteger $int$100000 = makeInteger(100000);

    static private final SubLSymbol $sym1$REUSED_ = makeUninternedSymbol("REUSED?");



    public static final SubLSymbol $typicality_problem_store$ = makeSymbol("*TYPICALITY-PROBLEM-STORE*");

    static private final SubLList $list_alt4 = list(makeSymbol("FIND-OR-CREATE-TYPICALITY-PROBLEM-STORE"));







    static private final SubLList $list_alt8 = list(list(makeSymbol("DESTROY-PROBLEM-STORE"), makeSymbol("*TYPICALITY-PROBLEM-STORE*")));



    static private final SubLList $list_alt10 = list(list(makeSymbol("*TRANSCRIPT-PREVALENCE-ASSERTIONS?*"), T));

    public static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLObject $$typicalityReferenceSetMembers = constant_handles.reader_make_constant_shell(makeString("typicalityReferenceSetMembers"));

    public static final SubLObject $$typicalityReferenceSetMicrotheory = constant_handles.reader_make_constant_shell(makeString("typicalityReferenceSetMicrotheory"));

    public static final SubLObject $const14$typicalityReferenceSetDomainPrope = constant_handles.reader_make_constant_shell(makeString("typicalityReferenceSetDomainProperty"));

    public static final SubLObject $$typicalityReferenceSetSize = constant_handles.reader_make_constant_shell(makeString("typicalityReferenceSetSize"));

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    static private final SubLList $list_alt17 = list(makeSymbol("?SET-SIZE"));

    public static final SubLObject $$greaterThanOrEqualTo = constant_handles.reader_make_constant_shell(makeString("greaterThanOrEqualTo"));

    static private final SubLSymbol $sym19$_PREVALENCE = makeSymbol("?PREVALENCE");

    public static final SubLObject $$TimesFn = constant_handles.reader_make_constant_shell(makeString("TimesFn"));

    public static final SubLObject $$lessThan = constant_handles.reader_make_constant_shell(makeString("lessThan"));

    public static final SubLObject $const22$prevalenceOfPropertyInReferenceSe = constant_handles.reader_make_constant_shell(makeString("prevalenceOfPropertyInReferenceSet"));

    static private final SubLSymbol $sym23$_PROPERTY = makeSymbol("?PROPERTY");

    static private final SubLList $list_alt24 = list(makeSymbol("?PREVALENCE"));



    static private final SubLList $list_alt26 = list(makeKeyword("TEMPLATE"), list(makeSymbol("?PROPERTY"), makeSymbol("?PREVALENCE")));



    static private final SubLSymbol $sym28$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_ = makeSymbol("CYC-TYPICALITY-REFERENCE-SET-PROPERTY?");

    static private final SubLList $list_alt29 = list(makeKeyword("TEMPLATE"), makeSymbol("?PREVALENCE"));

    static private final SubLString $str_alt30$Trying_to_get_prevalence_for__S = makeString("Trying to get prevalence for ~S");

    public static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    static private final SubLSymbol $sym35$COLLECTION_ = makeSymbol("COLLECTION?");

    static private final SubLString $$$CYC = makeString("CYC");



    static private final SubLString $$$ReferenceSet = makeString("ReferenceSet");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));



    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    public static final SubLObject $const42$typicalityReferenceSetDomainColle = constant_handles.reader_make_constant_shell(makeString("typicalityReferenceSetDomainCollection"));

    static private final SubLString $$$TypicalityReferenceSet = makeString("TypicalityReferenceSet");

    static private final SubLString $str_alt44$__3__0D = makeString("-~3,'0D");

    static private final SubLString $str_alt45$Couldn_t_create__S = makeString("Couldn't create ~S");

    static private final SubLList $list_alt46 = list(constant_handles.reader_make_constant_shell(makeString("TypicalityReferenceSet")));

    static private final SubLSymbol $sym47$_TERM = makeSymbol("?TERM");

    static private final SubLString $str_alt48$Adding__S_new_members_to__S___ = makeString("Adding ~S new members to ~S...");



    static private final SubLSymbol $sym50$_X = makeSymbol("?X");

    static private final SubLSymbol $sym51$_MT = makeSymbol("?MT");

    public static final SubLObject $$ist_Asserted = constant_handles.reader_make_constant_shell(makeString("ist-Asserted"));



    static private final SubLList $list_alt54 = list(makeSymbol("MT"), makeSymbol("EXISTING-VALUE"));

    static private final SubLList $list_alt55 = list(makeSymbol("?TERM"));

    static private final SubLList $list_alt56 = list(makeKeyword("TEMPLATE"), makeSymbol("?TERM"));





    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");







    private static final SubLSymbol QUERY_STATIC_PROPERTY_P = makeSymbol("QUERY-STATIC-PROPERTY-P");

    private static final SubLSymbol QUERY_DYNAMIC_PROPERTY_P = makeSymbol("QUERY-DYNAMIC-PROPERTY-P");



    static private final SubLString $str_alt66$Computing_prevalence_for__S___ = makeString("Computing prevalence for ~S...");

    static private final SubLList $list_alt67 = list(constant_handles.reader_make_constant_shell(makeString("conceptuallyRelated")), constant_handles.reader_make_constant_shell(makeString("exactlyLocatedAt-Geographical")), constant_handles.reader_make_constant_shell(makeString("polityHasTransportMeans")), constant_handles.reader_make_constant_shell(makeString("temporalBoundsContain")));

    static private final SubLList $list_alt68 = list(list($BIND, makeSymbol("PRED")), $TERM, list(list($BIND, makeSymbol("FN")), makeKeyword("ANYTHING")));





    public static final SubLObject $const71$functionCorrespondingPredicate_Ca = constant_handles.reader_make_constant_shell(makeString("functionCorrespondingPredicate-Canonical"));

    public static final SubLObject $$spatiallyRelated = constant_handles.reader_make_constant_shell(makeString("spatiallyRelated"));

    public static final SubLObject $$temporallyRelated = constant_handles.reader_make_constant_shell(makeString("temporallyRelated"));



    static private final SubLSymbol $sym75$ARBITRARY_REFERENCE_SET_MEMBER_HAS_PROPERTY_ = makeSymbol("ARBITRARY-REFERENCE-SET-MEMBER-HAS-PROPERTY?");

    static private final SubLList $list_alt76 = list($TERM);

    static private final SubLSymbol $sym77$_ARBITRARY_REFERENCE_SET_MEMBER_HAS_PROPERTY__CACHING_STATE_ = makeSymbol("*ARBITRARY-REFERENCE-SET-MEMBER-HAS-PROPERTY?-CACHING-STATE*");

    public static final SubLSymbol $kw78$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym79$_ARBITRARY_MEMBER = makeSymbol("?ARBITRARY-MEMBER");

    static private final SubLString $str_alt80$Couldn_t_create_arbitrary_member_ = makeString("Couldn't create arbitrary member of ~S");

    public static final SubLFloat $float$0_5 = makeDouble(0.5);

    static private final SubLSymbol $sym82$_ = makeSymbol("<");



    static private final SubLList $list_alt84 = list(makeSymbol("PROPERTY"), makeSymbol("PREVALENCE"));

    static private final SubLList $list_alt85 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list(makeSymbol("?PROPERTY"), makeSymbol("?PREVALENCE"))));

    static private final SubLSymbol $sym86$_ = makeSymbol(">");

    static private final SubLString $str_alt87$doing_property___S__ = makeString("doing property: ~S~%");

    static private final SubLList $list_alt88 = list(makeSymbol("ELEMENT"), makeSymbol("NEW-SCORE"));

    static private final SubLString $str_alt89$__Remaining___S__Most_typical___S = makeString("~&Remaining: ~S~%Most typical: ~S");

    // // Initializers
    public void declareFunctions() {
        declare_typicality_reference_set_file();
    }

    public void initializeVariables() {
        init_typicality_reference_set_file();
    }

    public void runTopLevelForms() {
        setup_typicality_reference_set_file();
    }
}

