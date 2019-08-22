/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-HEURISTIC-AGENDA
 *  source file: /cyc/top/cycl/cyblack/cyblack-heuristic-agenda.lisp
 *  created:     2019/07/03 17:38:48
 */
public final class cyblack_heuristic_agenda extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_heuristic_agenda() {
    }

    public static final SubLFile me = new cyblack_heuristic_agenda();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_heuristic_agenda";

    // // Definitions
    public static final SubLObject cyblack_heuristic_evaluator_p(SubLObject cyblack_heuristic_evaluator) {
        return interfaces.subloop_instanceof_interface(cyblack_heuristic_evaluator, CYBLACK_HEURISTIC_EVALUATOR);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_heuristic_evaluator_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_heuristic_evaluator_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_heuristic_evaluator_p(SubLObject cyblack_basic_heuristic_evaluator) {
        return classes.subloop_instanceof_class(cyblack_basic_heuristic_evaluator, CYBLACK_BASIC_HEURISTIC_EVALUATOR);
    }

    public static final SubLObject cyblack_basic_heuristic_evaluator_applies_p_method(SubLObject self, SubLObject proposal) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_heuristic_evaluator_get_weight_method(SubLObject self, SubLObject proposal) {
        return $float$0_0;
    }

    public static final SubLObject cyblack_heuristic_evaluator_registry_p(SubLObject cyblack_heuristic_evaluator_registry) {
        return interfaces.subloop_instanceof_interface(cyblack_heuristic_evaluator_registry, CYBLACK_HEURISTIC_EVALUATOR_REGISTRY);
    }

    public static final SubLObject get_cyblack_basic_heuristic_evaluator_registry_evaluators(SubLObject cyblack_basic_heuristic_evaluator_registry) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_heuristic_evaluator_registry, THREE_INTEGER, EVALUATORS);
    }

    public static final SubLObject set_cyblack_basic_heuristic_evaluator_registry_evaluators(SubLObject cyblack_basic_heuristic_evaluator_registry, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_heuristic_evaluator_registry, value, THREE_INTEGER, EVALUATORS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_heuristic_evaluator_registry_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_heuristic_evaluator_registry_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, EVALUATORS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_heuristic_evaluator_registry_p(SubLObject cyblack_basic_heuristic_evaluator_registry) {
        return classes.subloop_instanceof_class(cyblack_basic_heuristic_evaluator_registry, CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY);
    }

    public static final SubLObject cyblack_basic_heuristic_evaluator_registry_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_heuristic_evaluator_registry_method = NIL;
            SubLObject evaluators = get_cyblack_basic_heuristic_evaluator_registry_evaluators(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    evaluators = NIL;
                    sublisp_throw($sym35$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_heuristic_evaluator_registry_evaluators(self, evaluators);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_heuristic_evaluator_registry_method = Errors.handleThrowable(ccatch_env_var, $sym35$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_METHOD);
            }
            return catch_var_for_cyblack_basic_heuristic_evaluator_registry_method;
        }
    }

    public static final SubLObject cyblack_basic_heuristic_evaluator_registry_set_application_method(SubLObject self, SubLObject new_application) {
        {
            SubLObject evaluators = get_cyblack_basic_heuristic_evaluator_registry_evaluators(self);
            cyblack_object.cyblack_object_set_application_method(self, new_application);
            {
                SubLObject cdolist_list_var = evaluators;
                SubLObject evaluator = NIL;
                for (evaluator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , evaluator = cdolist_list_var.first()) {
                    methods.funcall_instance_method_with_1_args(evaluator, SET_APPLICATION, new_application);
                }
            }
            return new_application;
        }
    }

    public static final SubLObject cyblack_basic_heuristic_evaluator_registry_add_method(SubLObject self, SubLObject heuristic_evaluator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_heuristic_evaluator_registry_method = NIL;
                SubLObject evaluators = get_cyblack_basic_heuristic_evaluator_registry_evaluators(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_heuristic_evaluator_p(heuristic_evaluator)) {
                                Errors.error($str_alt46$_ADD__S____S_is_not_an_instance_o, self, heuristic_evaluator);
                            }
                        }
                        {
                            SubLObject item_var = heuristic_evaluator;
                            if (NIL == member(item_var, evaluators, symbol_function(EQL), symbol_function(IDENTITY))) {
                                evaluators = cons(item_var, evaluators);
                            }
                        }
                        methods.funcall_instance_method_with_1_args(heuristic_evaluator, SET_APPLICATION, application);
                        sublisp_throw($sym45$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_METHOD, heuristic_evaluator);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_heuristic_evaluator_registry_evaluators(self, evaluators);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_heuristic_evaluator_registry_method = Errors.handleThrowable(ccatch_env_var, $sym45$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_METHOD);
                }
                return catch_var_for_cyblack_basic_heuristic_evaluator_registry_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_heuristic_evaluator_registry_get_applicable_heuristic_evaluators_method(SubLObject self, SubLObject proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_heuristic_evaluator_registry_method = NIL;
                SubLObject evaluators = get_cyblack_basic_heuristic_evaluator_registry_evaluators(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_proposal.cyblack_proposal_p(proposal)) {
                                Errors.error($str_alt51$_GET_APPLICABLE_HEURISTIC_EVALUAT, self, proposal);
                            }
                        }
                        {
                            SubLObject applicable_evaluators = NIL;
                            SubLObject list_expression = evaluators;
                            if (NIL == list_expression) {
                                applicable_evaluators = NIL;
                            } else
                                if (list_expression.isAtom()) {
                                    applicable_evaluators = list(list_expression);
                                } else
                                    if (NIL == list_expression.rest()) {
                                        {
                                            SubLObject evaluator = list_expression.first();
                                            applicable_evaluators = (NIL != methods.funcall_instance_method_with_1_args(evaluator, APPLIES_P, proposal)) ? ((SubLObject) (list(proposal))) : NIL;
                                        }
                                    } else {
                                        {
                                            SubLObject tail_cons = NIL;
                                            SubLObject result = NIL;
                                            applicable_evaluators = NIL;
                                            {
                                                SubLObject cdolist_list_var = list_expression;
                                                SubLObject evaluator = NIL;
                                                for (evaluator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , evaluator = cdolist_list_var.first()) {
                                                    result = (NIL != methods.funcall_instance_method_with_1_args(evaluator, APPLIES_P, proposal)) ? ((SubLObject) (list(proposal))) : NIL;
                                                    if (NIL != result) {
                                                        if (NIL != tail_cons) {
                                                            rplacd(tail_cons, result);
                                                            tail_cons = last(result, UNPROVIDED);
                                                        } else {
                                                            applicable_evaluators = (NIL != methods.funcall_instance_method_with_1_args(evaluator, APPLIES_P, proposal)) ? ((SubLObject) (list(proposal))) : NIL;
                                                            tail_cons = last(applicable_evaluators, UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }


                            sublisp_throw($sym50$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_METHOD, applicable_evaluators);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_heuristic_evaluator_registry_evaluators(self, evaluators);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_heuristic_evaluator_registry_method = Errors.handleThrowable(ccatch_env_var, $sym50$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_METHOD);
                }
                return catch_var_for_cyblack_basic_heuristic_evaluator_registry_method;
            }
        }
    }

    public static final SubLObject cyblack_heuristic_agenda_p(SubLObject v_cyblack_heuristic_agenda) {
        return interfaces.subloop_instanceof_interface(v_cyblack_heuristic_agenda, CYBLACK_HEURISTIC_AGENDA);
    }

    public static final SubLObject get_proposal_cached_weight(SubLObject proposal) {
        {
            SubLObject weight = NIL;
            SubLObject lock = instances.get_slot(proposal, LOCK);
            SubLObject lock_1 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_1);
                weight = instances.instance_get_property(proposal, $CACHED_WEIGHT);
            } finally {
                if (NIL != release) {
                    release_lock(lock_1);
                }
            }
            return weight;
        }
    }

    public static final SubLObject set_proposal_cached_weight(SubLObject proposal, SubLObject weight) {
        {
            SubLObject lock = instances.get_slot(proposal, LOCK);
            SubLObject lock_2 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_2);
                instances.instance_set_property(proposal, $CACHED_WEIGHT, weight);
            } finally {
                if (NIL != release) {
                    release_lock(lock_2);
                }
            }
        }
        return weight;
    }

    public static final SubLObject clear_proposal_cached_weight(SubLObject proposal) {
        set_proposal_cached_weight(proposal, NIL);
        return proposal;
    }

    public static final SubLObject get_cyblack_basic_heuristic_agenda_sorter_element_key(SubLObject cyblack_basic_heuristic_agenda_sorter) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_heuristic_agenda_sorter, FIVE_INTEGER, ELEMENT_KEY);
    }

    public static final SubLObject set_cyblack_basic_heuristic_agenda_sorter_element_key(SubLObject cyblack_basic_heuristic_agenda_sorter, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_heuristic_agenda_sorter, value, FIVE_INTEGER, ELEMENT_KEY);
    }

    public static final SubLObject get_cyblack_basic_heuristic_agenda_sorter_sort_predicate(SubLObject cyblack_basic_heuristic_agenda_sorter) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_heuristic_agenda_sorter, FOUR_INTEGER, SORT_PREDICATE);
    }

    public static final SubLObject set_cyblack_basic_heuristic_agenda_sorter_sort_predicate(SubLObject cyblack_basic_heuristic_agenda_sorter, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_heuristic_agenda_sorter, value, FOUR_INTEGER, SORT_PREDICATE);
    }

    public static final SubLObject get_cyblack_basic_heuristic_agenda_sorter_heuristic_evaluator_registry(SubLObject cyblack_basic_heuristic_agenda_sorter) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_heuristic_agenda_sorter, THREE_INTEGER, HEURISTIC_EVALUATOR_REGISTRY);
    }

    public static final SubLObject set_cyblack_basic_heuristic_agenda_sorter_heuristic_evaluator_registry(SubLObject cyblack_basic_heuristic_agenda_sorter, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_heuristic_agenda_sorter, value, THREE_INTEGER, HEURISTIC_EVALUATOR_REGISTRY);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_heuristic_agenda_sorter_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_heuristic_agenda_sorter_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, HEURISTIC_EVALUATOR_REGISTRY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, SORT_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, ELEMENT_KEY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_sorter_p(SubLObject cyblack_basic_heuristic_agenda_sorter) {
        return classes.subloop_instanceof_class(cyblack_basic_heuristic_agenda_sorter, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER);
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_sorter_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_heuristic_agenda_sorter_method = NIL;
            SubLObject element_key = get_cyblack_basic_heuristic_agenda_sorter_element_key(self);
            SubLObject sort_predicate = get_cyblack_basic_heuristic_agenda_sorter_sort_predicate(self);
            SubLObject heuristic_evaluator_registry = get_cyblack_basic_heuristic_agenda_sorter_heuristic_evaluator_registry(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    heuristic_evaluator_registry = NIL;
                    sort_predicate = symbol_function($sym73$_);
                    element_key = symbol_function(GET_PROPOSAL_CACHED_WEIGHT);
                    sublisp_throw($sym72$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_heuristic_agenda_sorter_element_key(self, element_key);
                            set_cyblack_basic_heuristic_agenda_sorter_sort_predicate(self, sort_predicate);
                            set_cyblack_basic_heuristic_agenda_sorter_heuristic_evaluator_registry(self, heuristic_evaluator_registry);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_heuristic_agenda_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym72$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD);
            }
            return catch_var_for_cyblack_basic_heuristic_agenda_sorter_method;
        }
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_sorter_set_heuristic_evaluator_registry_method(SubLObject self, SubLObject new_heuristic_evaluator_registry) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_heuristic_agenda_sorter_method = NIL;
                SubLObject heuristic_evaluator_registry = get_cyblack_basic_heuristic_agenda_sorter_heuristic_evaluator_registry(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_heuristic_evaluator_registry) || (NIL != cyblack_heuristic_evaluator_registry_p(new_heuristic_evaluator_registry)))) {
                                Errors.error($str_alt80$_SET_HEURISTIC_EVALUATOR_REGISTRY, self, new_heuristic_evaluator_registry);
                            }
                        }
                        heuristic_evaluator_registry = new_heuristic_evaluator_registry;
                        sublisp_throw($sym79$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD, new_heuristic_evaluator_registry);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_heuristic_agenda_sorter_heuristic_evaluator_registry(self, heuristic_evaluator_registry);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_heuristic_agenda_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym79$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD);
                }
                return catch_var_for_cyblack_basic_heuristic_agenda_sorter_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_sorter_get_sort_predicate_method(SubLObject self) {
        {
            SubLObject sort_predicate = get_cyblack_basic_heuristic_agenda_sorter_sort_predicate(self);
            return sort_predicate;
        }
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_sorter_set_sort_predicate_method(SubLObject self, SubLObject new_predicate) {
        {
            SubLObject catch_var_for_cyblack_basic_heuristic_agenda_sorter_method = NIL;
            SubLObject sort_predicate = get_cyblack_basic_heuristic_agenda_sorter_sort_predicate(self);
            try {
                try {
                    sort_predicate = new_predicate;
                    sublisp_throw($sym88$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD, new_predicate);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_heuristic_agenda_sorter_sort_predicate(self, sort_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_heuristic_agenda_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym88$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD);
            }
            return catch_var_for_cyblack_basic_heuristic_agenda_sorter_method;
        }
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_sorter_get_element_key_method(SubLObject self) {
        {
            SubLObject element_key = get_cyblack_basic_heuristic_agenda_sorter_element_key(self);
            return element_key;
        }
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_sorter_set_element_key_method(SubLObject self, SubLObject new_key_function) {
        {
            SubLObject catch_var_for_cyblack_basic_heuristic_agenda_sorter_method = NIL;
            SubLObject element_key = get_cyblack_basic_heuristic_agenda_sorter_element_key(self);
            try {
                try {
                    element_key = new_key_function;
                    sublisp_throw($sym96$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD, new_key_function);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_heuristic_agenda_sorter_element_key(self, element_key);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_heuristic_agenda_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym96$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD);
            }
            return catch_var_for_cyblack_basic_heuristic_agenda_sorter_method;
        }
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_sorter_order_queue_internal_method(SubLObject self, SubLObject contents) {
        {
            SubLObject catch_var_for_cyblack_basic_heuristic_agenda_sorter_method = NIL;
            SubLObject element_key = get_cyblack_basic_heuristic_agenda_sorter_element_key(self);
            SubLObject sort_predicate = get_cyblack_basic_heuristic_agenda_sorter_sort_predicate(self);
            SubLObject heuristic_evaluator_registry = get_cyblack_basic_heuristic_agenda_sorter_heuristic_evaluator_registry(self);
            try {
                try {
                    {
                        SubLObject evaluators = NIL;
                        SubLObject sum = ZERO_INTEGER;
                        SubLObject count = ZERO_INTEGER;
                        SubLObject cdolist_list_var = contents;
                        SubLObject proposal = NIL;
                        for (proposal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proposal = cdolist_list_var.first()) {
                            if (NIL == get_proposal_cached_weight(proposal)) {
                                evaluators = methods.funcall_instance_method_with_0_args(heuristic_evaluator_registry, GET_APPLICABLE_HEURISTIC_EVALUATORS);
                                sum = ZERO_INTEGER;
                                count = ZERO_INTEGER;
                                {
                                    SubLObject cdolist_list_var_3 = evaluators;
                                    SubLObject evaluator = NIL;
                                    for (evaluator = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , evaluator = cdolist_list_var_3.first()) {
                                        sum = add(sum, methods.funcall_instance_method_with_0_args(evaluator, GET_WEIGHT));
                                        count = add(count, ONE_INTEGER);
                                    }
                                }
                                set_proposal_cached_weight(proposal, divide(sum, count));
                            }
                        }
                        sublisp_throw($sym101$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD, Sort.sort(contents, sort_predicate, element_key));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_heuristic_agenda_sorter_element_key(self, element_key);
                            set_cyblack_basic_heuristic_agenda_sorter_sort_predicate(self, sort_predicate);
                            set_cyblack_basic_heuristic_agenda_sorter_heuristic_evaluator_registry(self, heuristic_evaluator_registry);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_heuristic_agenda_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym101$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD);
            }
            return catch_var_for_cyblack_basic_heuristic_agenda_sorter_method;
        }
    }

    public static final SubLObject get_cyblack_basic_heuristic_agenda_heuristic_evaluator_registry(SubLObject cyblack_basic_heuristic_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_heuristic_agenda, ELEVEN_INTEGER, HEURISTIC_EVALUATOR_REGISTRY);
    }

    public static final SubLObject set_cyblack_basic_heuristic_agenda_heuristic_evaluator_registry(SubLObject cyblack_basic_heuristic_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_heuristic_agenda, value, ELEVEN_INTEGER, HEURISTIC_EVALUATOR_REGISTRY);
    }

    public static final SubLObject get_cyblack_basic_heuristic_agenda_heuristic_evaluator_classes(SubLObject cyblack_basic_heuristic_agenda) {
        {
            SubLObject v_class = (cyblack_basic_heuristic_agenda.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_basic_heuristic_agenda))) : NIL != subloop_structures.class_p(cyblack_basic_heuristic_agenda) ? ((SubLObject) (cyblack_basic_heuristic_agenda)) : NIL != subloop_structures.instance_p(cyblack_basic_heuristic_agenda) ? ((SubLObject) (subloop_structures.instance_class(cyblack_basic_heuristic_agenda))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(HEURISTIC_EVALUATOR_CLASSES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_cyblack_basic_heuristic_agenda_heuristic_evaluator_classes(SubLObject cyblack_basic_heuristic_agenda, SubLObject value) {
        {
            SubLObject v_class = (cyblack_basic_heuristic_agenda.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_basic_heuristic_agenda))) : NIL != subloop_structures.class_p(cyblack_basic_heuristic_agenda) ? ((SubLObject) (cyblack_basic_heuristic_agenda)) : NIL != subloop_structures.instance_p(cyblack_basic_heuristic_agenda) ? ((SubLObject) (subloop_structures.instance_class(cyblack_basic_heuristic_agenda))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(HEURISTIC_EVALUATOR_CLASSES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_register_heuristic_evaluator_method(SubLObject self, SubLObject heuristic_evaluator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_heuristic_evaluator_p(heuristic_evaluator)) {
                    Errors.error($str_alt108$_REGISTER_HEURISTIC_EVALUATOR__S_, self, heuristic_evaluator);
                }
            }
            {
                SubLObject template_heuristic_evaluator_registry = cyblack_basic_heuristic_agenda_get_heuristic_evaluator_registry_internal_method(self);
                if (NIL == template_heuristic_evaluator_registry) {
                    template_heuristic_evaluator_registry = object.new_class_instance(CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY);
                    cyblack_basic_heuristic_agenda_set_heuristic_evaluator_registry_internal_method(self, template_heuristic_evaluator_registry);
                }
                methods.funcall_instance_method_with_1_args(template_heuristic_evaluator_registry, ADD, heuristic_evaluator);
                return heuristic_evaluator;
            }
        }
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_initialize_qua_heuristic_agenda_method(SubLObject self) {
        cyblack_basic_heuristic_agenda_set_heuristic_evaluator_registry_internal_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_heuristic_agenda_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_HEURISTIC_AGENDA, HEURISTIC_EVALUATOR_CLASSES, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_heuristic_agenda_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, SUSPENDED_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, ACTIVE_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, EXECUTABLE_KSI_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_HEURISTIC_AGENDA, HEURISTIC_EVALUATOR_REGISTRY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_p(SubLObject cyblack_basic_heuristic_agenda) {
        return classes.subloop_instanceof_class(cyblack_basic_heuristic_agenda, CYBLACK_BASIC_HEURISTIC_AGENDA);
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_add_heuristic_evaluator_class_method(SubLObject self, SubLObject new_class) {
        {
            SubLObject catch_var_for_cyblack_basic_heuristic_agenda_method = NIL;
            SubLObject heuristic_evaluator_classes = get_cyblack_basic_heuristic_agenda_heuristic_evaluator_classes(self);
            try {
                try {
                    {
                        SubLObject item_var = new_class;
                        if (NIL == member(item_var, heuristic_evaluator_classes, symbol_function(EQL), symbol_function(IDENTITY))) {
                            heuristic_evaluator_classes = cons(item_var, heuristic_evaluator_classes);
                        }
                        sublisp_throw($sym124$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_METHOD, new_class);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_heuristic_agenda_heuristic_evaluator_classes(self, heuristic_evaluator_classes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_heuristic_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym124$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_heuristic_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_get_all_heuristic_evaluator_classes_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_heuristic_agenda_method = NIL;
            SubLObject heuristic_evaluator_classes = get_cyblack_basic_heuristic_agenda_heuristic_evaluator_classes(self);
            try {
                try {
                    {
                        SubLObject actual_class = (self.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(self))) : self;
                        sublisp_throw($sym128$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_METHOD, subloop_structures.class_name(actual_class) == CYBLACK_BASIC_HEURISTIC_AGENDA ? ((SubLObject) (copy_list(heuristic_evaluator_classes))) : union(heuristic_evaluator_classes, methods.funcall_instance_super_method_with_0_args(self, GET_ALL_HEURISTIC_EVALUATOR_CLASSES), UNPROVIDED, UNPROVIDED));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_heuristic_agenda_heuristic_evaluator_classes(self, heuristic_evaluator_classes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_heuristic_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_heuristic_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_initialize_method(SubLObject self) {
        cyblack_agenda.cyblack_basic_simple_agenda_initialize_method(self);
        cyblack_basic_heuristic_agenda_initialize_qua_heuristic_agenda_method(self);
        cyblack_agenda.cyblack_basic_simple_agenda_set_prioritizer_internal_method(self, object.new_class_instance(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER));
        {
            SubLObject cdolist_list_var = cyblack_basic_heuristic_agenda_get_all_heuristic_evaluator_classes_method(self);
            SubLObject heuristic_evaluator_class = NIL;
            for (heuristic_evaluator_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , heuristic_evaluator_class = cdolist_list_var.first()) {
                cyblack_basic_heuristic_agenda_register_heuristic_evaluator_method(self, object.new_class_instance(heuristic_evaluator_class));
            }
        }
        return self;
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_set_application_method(SubLObject self, SubLObject new_application) {
        {
            SubLObject heuristic_evaluator_registry = get_cyblack_basic_heuristic_agenda_heuristic_evaluator_registry(self);
            cyblack_agenda.cyblack_basic_simple_agenda_set_application_method(self, new_application);
            if (NIL != heuristic_evaluator_registry) {
                methods.funcall_instance_method_with_1_args(heuristic_evaluator_registry, SET_APPLICATION, new_application);
            }
            {
                SubLObject prioritizer = cyblack_agenda.cyblack_basic_simple_agenda_get_prioritizer_internal_method(self);
                if ((NIL != prioritizer) && (NIL != cyblack_object.cyblack_object_p(prioritizer))) {
                    methods.funcall_instance_method_with_1_args(prioritizer, SET_APPLICATION, new_application);
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_get_heuristic_evaluator_registry_internal_method(SubLObject self) {
        {
            SubLObject heuristic_evaluator_registry = get_cyblack_basic_heuristic_agenda_heuristic_evaluator_registry(self);
            return heuristic_evaluator_registry;
        }
    }

    public static final SubLObject cyblack_basic_heuristic_agenda_set_heuristic_evaluator_registry_internal_method(SubLObject self, SubLObject new_heuristic_evaluator_registry) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_heuristic_agenda_method = NIL;
                SubLObject heuristic_evaluator_registry = get_cyblack_basic_heuristic_agenda_heuristic_evaluator_registry(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_heuristic_evaluator_registry) || (NIL != cyblack_heuristic_evaluator_registry_p(new_heuristic_evaluator_registry)))) {
                                Errors.error($str_alt141$_SET_HEURISTIC_EVALUATOR_REGISTRY, self, new_heuristic_evaluator_registry);
                            }
                        }
                        heuristic_evaluator_registry = new_heuristic_evaluator_registry;
                        sublisp_throw($sym140$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_METHOD, new_heuristic_evaluator_registry);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_heuristic_agenda_heuristic_evaluator_registry(self, heuristic_evaluator_registry);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_heuristic_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym140$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_METHOD);
                }
                return catch_var_for_cyblack_basic_heuristic_agenda_method;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_auto_locking_heuristic_agenda_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_auto_locking_heuristic_agenda_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, SUSPENDED_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, ACTIVE_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, EXECUTABLE_KSI_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_auto_locking_heuristic_agenda_p(SubLObject cyblack_basic_auto_locking_heuristic_agenda) {
        return classes.subloop_instanceof_class(cyblack_basic_auto_locking_heuristic_agenda, CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA);
    }

    public static final SubLObject cyblack_basic_auto_locking_heuristic_agenda_propose_method(SubLObject self, SubLObject proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_auto_locking_heuristic_agenda_method = NIL;
                SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_proposal.cyblack_proposal_p(proposal)) {
                                Errors.error($str_alt150$_PROPOSE__S____S_is_not_an_instan, self, proposal);
                            }
                        }
                        {
                            SubLObject lock_4 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_4);
                                cyblack_agenda.cyblack_basic_simple_agenda_enqueue_method(self, proposal);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_4);
                                }
                            }
                        }
                        sublisp_throw($sym149$OUTER_CATCH_FOR_CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA_METHO, proposal);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_auto_locking_heuristic_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym149$OUTER_CATCH_FOR_CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA_METHO);
                }
                return catch_var_for_cyblack_basic_auto_locking_heuristic_agenda_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_auto_locking_heuristic_agenda_retract_method(SubLObject self, SubLObject proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_auto_locking_heuristic_agenda_method = NIL;
                SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_proposal.cyblack_proposal_p(proposal)) {
                                Errors.error($str_alt155$_RETRACT__S____S_is_not_an_instan, self, proposal);
                            }
                        }
                        {
                            SubLObject lock_5 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_5);
                                cyblack_agenda.cyblack_basic_simple_agenda_remove_method(self, proposal);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_5);
                                }
                            }
                        }
                        sublisp_throw($sym154$OUTER_CATCH_FOR_CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA_METHO, proposal);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_auto_locking_heuristic_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym154$OUTER_CATCH_FOR_CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA_METHO);
                }
                return catch_var_for_cyblack_basic_auto_locking_heuristic_agenda_method;
            }
        }
    }

    public static final SubLObject cyblack_check_define_cyblack_heuristic_expression(SubLObject type, SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!expression.isCons()) {
                    Errors.error($str_alt157$DEFINE_CYBLACK_HEURISTIC___S_is_n, type, expression);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!expression.first().isList()) {
                    Errors.error($str_alt158$DEFINE_CYBLACK_HEURISTIC___S_is_n, type, expression.first());
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!expression.rest().isCons()) {
                    Errors.error($str_alt159$DEFINE_CYBLACK_HEURISTIC___S_is_n, type, expression.rest());
                }
            }
            return T;
        }
    }

    public static final SubLObject expand_define_cyblack_heuristic(SubLObject heuristic_name, SubLObject options, SubLObject slot_and_method_decls) {
        {
            SubLObject agenda_class = getf(options, $AGENDA_CLASS, UNPROVIDED);
            SubLObject applies_when_expression = getf(options, $APPLIES_WHEN, UNPROVIDED);
            SubLObject weight_expression = getf(options, $WEIGHT, UNPROVIDED);
            SubLObject options_sans_agenda_class = NIL;
            SubLObject slots_and_methods_sans_options = NIL;
            cyblack_check_define_cyblack_heuristic_expression($APPLIES_WHEN, applies_when_expression);
            cyblack_check_define_cyblack_heuristic_expression($WEIGHT, weight_expression);
            {
                SubLObject remainder = NIL;
                for (remainder = options; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject option = remainder.first();
                        SubLObject value = cadr(remainder);
                        if (NIL == subl_promotions.memberP(option, $list_alt163, UNPROVIDED, UNPROVIDED)) {
                            options_sans_agenda_class = cons(value, cons(option, options_sans_agenda_class));
                        }
                    }
                }
            }
            options_sans_agenda_class = nreverse(options_sans_agenda_class);
            {
                SubLObject list_expression = slot_and_method_decls;
                if (NIL == list_expression) {
                    slots_and_methods_sans_options = NIL;
                } else
                    if (list_expression.isAtom()) {
                        slots_and_methods_sans_options = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject slot_or_method_decl = list_expression.first();
                                slots_and_methods_sans_options = (((slot_or_method_decl.isCons() && (slot_or_method_decl.first() == DEF_INSTANCE_METHOD)) && slot_or_method_decl.rest().isCons()) && (((NIL != applies_when_expression) && (cadr(slot_or_method_decl) == APPLIES_P)) || ((NIL != weight_expression) && (cadr(slot_or_method_decl) == GET_WEIGHT)))) ? ((SubLObject) (NIL)) : list(slot_or_method_decl);
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                slots_and_methods_sans_options = NIL;
                                {
                                    SubLObject cdolist_list_var = list_expression;
                                    SubLObject slot_or_method_decl = NIL;
                                    for (slot_or_method_decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot_or_method_decl = cdolist_list_var.first()) {
                                        result = (((slot_or_method_decl.isCons() && (slot_or_method_decl.first() == DEF_INSTANCE_METHOD)) && slot_or_method_decl.rest().isCons()) && (((NIL != applies_when_expression) && (cadr(slot_or_method_decl) == APPLIES_P)) || ((NIL != weight_expression) && (cadr(slot_or_method_decl) == GET_WEIGHT)))) ? ((SubLObject) (NIL)) : list(slot_or_method_decl);
                                        if (NIL != result) {
                                            if (NIL != tail_cons) {
                                                rplacd(tail_cons, result);
                                                tail_cons = last(result, UNPROVIDED);
                                            } else {
                                                slots_and_methods_sans_options = (((slot_or_method_decl.isCons() && (slot_or_method_decl.first() == DEF_INSTANCE_METHOD)) && slot_or_method_decl.rest().isCons()) && (((NIL != applies_when_expression) && (cadr(slot_or_method_decl) == APPLIES_P)) || ((NIL != weight_expression) && (cadr(slot_or_method_decl) == GET_WEIGHT)))) ? ((SubLObject) (NIL)) : list(slot_or_method_decl);
                                                tail_cons = last(slots_and_methods_sans_options, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }


            }
            methods.funcall_class_method_with_1_args(agenda_class, ADD_HEURISTIC_EVALUATOR_CLASS, heuristic_name);
            return listS(PROGN, listS(DEFINE_CLASS, bq_cons(heuristic_name, append(options_sans_agenda_class, NIL)), append(slots_and_methods_sans_options, NIL != applies_when_expression ? ((SubLObject) (list(listS(DEF_INSTANCE_METHOD, APPLIES_P, applies_when_expression.first(), $list_alt16)))) : NIL, NIL != weight_expression ? ((SubLObject) (list(listS(DEF_INSTANCE_METHOD, GET_WEIGHT, weight_expression.first(), $list_alt16)))) : NIL, NIL)), append(NIL != applies_when_expression ? ((SubLObject) (list(listS(DEF_INSTANCE_METHOD, listS(APPLIES_P, heuristic_name, $list_alt16), applies_when_expression.first(), append(applies_when_expression.rest(), NIL))))) : NIL, NIL != weight_expression ? ((SubLObject) (list(listS(DEF_INSTANCE_METHOD, listS(GET_WEIGHT, heuristic_name, $list_alt16), weight_expression.first(), append(weight_expression.rest(), NIL))))) : NIL, list(list(FUNCALL_CLASS_METHOD, list(QUOTE, agenda_class), $list_alt169, list(QUOTE, heuristic_name)))));
        }
    }

    public static final SubLObject define_cyblack_heuristic(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt170);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject heuristic_name = NIL;
                    SubLObject options = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt170);
                    heuristic_name = current.first();
                    current = current.rest();
                    options = current;
                    current = temp;
                    {
                        SubLObject slot_and_method_decls = current;
                        return expand_define_cyblack_heuristic(heuristic_name, options, slot_and_method_decls);
                    }
                }
            }
        }
    }

    public static final SubLObject declare_cyblack_heuristic_agenda_file() {
        declareFunction("cyblack_heuristic_evaluator_p", "CYBLACK-HEURISTIC-EVALUATOR-P", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_heuristic_evaluator_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-EVALUATOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_heuristic_evaluator_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-EVALUATOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_evaluator_p", "CYBLACK-BASIC-HEURISTIC-EVALUATOR-P", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_evaluator_applies_p_method", "CYBLACK-BASIC-HEURISTIC-EVALUATOR-APPLIES-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_heuristic_evaluator_get_weight_method", "CYBLACK-BASIC-HEURISTIC-EVALUATOR-GET-WEIGHT-METHOD", 2, 0, false);
        declareFunction("cyblack_heuristic_evaluator_registry_p", "CYBLACK-HEURISTIC-EVALUATOR-REGISTRY-P", 1, 0, false);
        declareFunction("get_cyblack_basic_heuristic_evaluator_registry_evaluators", "GET-CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-EVALUATORS", 1, 0, false);
        declareFunction("set_cyblack_basic_heuristic_evaluator_registry_evaluators", "SET-CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-EVALUATORS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_heuristic_evaluator_registry_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_heuristic_evaluator_registry_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_evaluator_registry_p", "CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-P", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_evaluator_registry_initialize_method", "CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_evaluator_registry_set_application_method", "CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_heuristic_evaluator_registry_add_method", "CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_heuristic_evaluator_registry_get_applicable_heuristic_evaluators_method", "CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-GET-APPLICABLE-HEURISTIC-EVALUATORS-METHOD", 2, 0, false);
        declareFunction("cyblack_heuristic_agenda_p", "CYBLACK-HEURISTIC-AGENDA-P", 1, 0, false);
        declareFunction("get_proposal_cached_weight", "GET-PROPOSAL-CACHED-WEIGHT", 1, 0, false);
        declareFunction("set_proposal_cached_weight", "SET-PROPOSAL-CACHED-WEIGHT", 2, 0, false);
        declareFunction("clear_proposal_cached_weight", "CLEAR-PROPOSAL-CACHED-WEIGHT", 1, 0, false);
        declareFunction("get_cyblack_basic_heuristic_agenda_sorter_element_key", "GET-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-ELEMENT-KEY", 1, 0, false);
        declareFunction("set_cyblack_basic_heuristic_agenda_sorter_element_key", "SET-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-ELEMENT-KEY", 2, 0, false);
        declareFunction("get_cyblack_basic_heuristic_agenda_sorter_sort_predicate", "GET-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-SORT-PREDICATE", 1, 0, false);
        declareFunction("set_cyblack_basic_heuristic_agenda_sorter_sort_predicate", "SET-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-SORT-PREDICATE", 2, 0, false);
        declareFunction("get_cyblack_basic_heuristic_agenda_sorter_heuristic_evaluator_registry", "GET-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-HEURISTIC-EVALUATOR-REGISTRY", 1, 0, false);
        declareFunction("set_cyblack_basic_heuristic_agenda_sorter_heuristic_evaluator_registry", "SET-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-HEURISTIC-EVALUATOR-REGISTRY", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_heuristic_agenda_sorter_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_heuristic_agenda_sorter_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_sorter_p", "CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-P", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_sorter_initialize_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_sorter_set_heuristic_evaluator_registry_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-SET-HEURISTIC-EVALUATOR-REGISTRY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_sorter_get_sort_predicate_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-GET-SORT-PREDICATE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_sorter_set_sort_predicate_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-SET-SORT-PREDICATE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_sorter_get_element_key_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-GET-ELEMENT-KEY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_sorter_set_element_key_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-SET-ELEMENT-KEY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_sorter_order_queue_internal_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-ORDER-QUEUE-INTERNAL-METHOD", 2, 0, false);
        declareFunction("get_cyblack_basic_heuristic_agenda_heuristic_evaluator_registry", "GET-CYBLACK-BASIC-HEURISTIC-AGENDA-HEURISTIC-EVALUATOR-REGISTRY", 1, 0, false);
        declareFunction("set_cyblack_basic_heuristic_agenda_heuristic_evaluator_registry", "SET-CYBLACK-BASIC-HEURISTIC-AGENDA-HEURISTIC-EVALUATOR-REGISTRY", 2, 0, false);
        declareFunction("get_cyblack_basic_heuristic_agenda_heuristic_evaluator_classes", "GET-CYBLACK-BASIC-HEURISTIC-AGENDA-HEURISTIC-EVALUATOR-CLASSES", 1, 0, false);
        declareFunction("set_cyblack_basic_heuristic_agenda_heuristic_evaluator_classes", "SET-CYBLACK-BASIC-HEURISTIC-AGENDA-HEURISTIC-EVALUATOR-CLASSES", 2, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_register_heuristic_evaluator_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-REGISTER-HEURISTIC-EVALUATOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_initialize_qua_heuristic_agenda_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-INITIALIZE-QUA-HEURISTIC-AGENDA-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_heuristic_agenda_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-AGENDA-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_heuristic_agenda_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-AGENDA-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_p", "CYBLACK-BASIC-HEURISTIC-AGENDA-P", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_add_heuristic_evaluator_class_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-ADD-HEURISTIC-EVALUATOR-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_get_all_heuristic_evaluator_classes_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-GET-ALL-HEURISTIC-EVALUATOR-CLASSES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_initialize_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_set_application_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_get_heuristic_evaluator_registry_internal_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-GET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_heuristic_agenda_set_heuristic_evaluator_registry_internal_method", "CYBLACK-BASIC-HEURISTIC-AGENDA-SET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_auto_locking_heuristic_agenda_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-AUTO-LOCKING-HEURISTIC-AGENDA-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_auto_locking_heuristic_agenda_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-AUTO-LOCKING-HEURISTIC-AGENDA-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_auto_locking_heuristic_agenda_p", "CYBLACK-BASIC-AUTO-LOCKING-HEURISTIC-AGENDA-P", 1, 0, false);
        declareFunction("cyblack_basic_auto_locking_heuristic_agenda_propose_method", "CYBLACK-BASIC-AUTO-LOCKING-HEURISTIC-AGENDA-PROPOSE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_auto_locking_heuristic_agenda_retract_method", "CYBLACK-BASIC-AUTO-LOCKING-HEURISTIC-AGENDA-RETRACT-METHOD", 2, 0, false);
        declareFunction("cyblack_check_define_cyblack_heuristic_expression", "CYBLACK-CHECK-DEFINE-CYBLACK-HEURISTIC-EXPRESSION", 2, 0, false);
        declareFunction("expand_define_cyblack_heuristic", "EXPAND-DEFINE-CYBLACK-HEURISTIC", 3, 0, false);
        declareMacro("define_cyblack_heuristic", "DEFINE-CYBLACK-HEURISTIC");
        return NIL;
    }

    public static final SubLObject init_cyblack_heuristic_agenda_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_heuristic_agenda_file() {
                interfaces.new_interface(CYBLACK_HEURISTIC_EVALUATOR, $list_alt1, $list_alt2, $list_alt3);
        classes.subloop_new_class(CYBLACK_BASIC_HEURISTIC_EVALUATOR, CYBLACK_OBJECT, $list_alt6, NIL, $list_alt3);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_HEURISTIC_EVALUATOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_HEURISTIC_EVALUATOR, $sym9$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_EVALUATOR_CLA);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_HEURISTIC_EVALUATOR, $sym14$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_EVALUATOR_INS);
        subloop_reserved_initialize_cyblack_basic_heuristic_evaluator_class(CYBLACK_BASIC_HEURISTIC_EVALUATOR);
        methods.methods_incorporate_instance_method(APPLIES_P, CYBLACK_BASIC_HEURISTIC_EVALUATOR, $list_alt16, $list_alt17, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_EVALUATOR, APPLIES_P, CYBLACK_BASIC_HEURISTIC_EVALUATOR_APPLIES_P_METHOD);
        methods.methods_incorporate_instance_method(GET_WEIGHT, CYBLACK_BASIC_HEURISTIC_EVALUATOR, $list_alt16, $list_alt17, $list_alt21);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_EVALUATOR, GET_WEIGHT, CYBLACK_BASIC_HEURISTIC_EVALUATOR_GET_WEIGHT_METHOD);
        interfaces.new_interface(CYBLACK_HEURISTIC_EVALUATOR_REGISTRY, $list_alt1, $list_alt2, $list_alt25);
        classes.subloop_new_class(CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, CYBLACK_OBJECT, $list_alt27, NIL, $list_alt28);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, $sym30$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REG);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, $sym31$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REG);
        subloop_reserved_initialize_cyblack_basic_heuristic_evaluator_registry_class(CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, $list_alt33, NIL, $list_alt34);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, INITIALIZE, CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, $list_alt38, $list_alt39, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, SET_APPLICATION, CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(ADD, CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, $list_alt16, $list_alt43, $list_alt44);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, ADD, CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_ADD_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICABLE_HEURISTIC_EVALUATORS, CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, $list_alt16, $list_alt17, $list_alt49);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY, GET_APPLICABLE_HEURISTIC_EVALUATORS, $sym52$CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_GET_APPLICABLE_HEURIST);
        interfaces.new_interface(CYBLACK_HEURISTIC_AGENDA, $list_alt54, $list_alt55, $list_alt56);
        interfaces.interfaces_add_interface_instance_method(INITIALIZE_QUA_HEURISTIC_AGENDA, CYBLACK_HEURISTIC_AGENDA, $list_alt33, NIL, $list_alt58);
        interfaces.interfaces_add_interface_instance_method(REGISTER_HEURISTIC_EVALUATOR, CYBLACK_HEURISTIC_AGENDA, $list_alt16, $list_alt43, $list_alt60);
        classes.subloop_new_class(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, CYBLACK_OBJECT, $list_alt64, NIL, $list_alt65);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, $sym69$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, $sym70$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER);
        subloop_reserved_initialize_cyblack_basic_heuristic_agenda_sorter_class(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, $list_alt33, NIL, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, INITIALIZE, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_HEURISTIC_EVALUATOR_REGISTRY, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, $list_alt16, $list_alt77, $list_alt78);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, SET_HEURISTIC_EVALUATOR_REGISTRY, $sym81$CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_SET_HEURISTIC_EVALUATOR_REG);
        methods.methods_incorporate_instance_method(GET_SORT_PREDICATE, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, $list_alt38, NIL, $list_alt83);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, GET_SORT_PREDICATE, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_GET_SORT_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(SET_SORT_PREDICATE, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, $list_alt16, $list_alt86, $list_alt87);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, SET_SORT_PREDICATE, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_SET_SORT_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_KEY, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, $list_alt38, NIL, $list_alt91);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, GET_ELEMENT_KEY, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_GET_ELEMENT_KEY_METHOD);
        methods.methods_incorporate_instance_method(SET_ELEMENT_KEY, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, $list_alt16, $list_alt94, $list_alt95);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, SET_ELEMENT_KEY, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_SET_ELEMENT_KEY_METHOD);
        methods.methods_incorporate_instance_method(ORDER_QUEUE_INTERNAL, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, $list_alt33, $list_alt99, $list_alt100);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER, ORDER_QUEUE_INTERNAL, CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_ORDER_QUEUE_INTERNAL_METHOD);
        classes.subloop_new_class(CYBLACK_BASIC_HEURISTIC_AGENDA, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt105, NIL, $list_alt106);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_HEURISTIC_AGENDA, NIL);
        methods.methods_incorporate_instance_method(REGISTER_HEURISTIC_EVALUATOR, CYBLACK_BASIC_HEURISTIC_AGENDA, $list_alt16, $list_alt43, $list_alt60);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA, REGISTER_HEURISTIC_EVALUATOR, $sym109$CYBLACK_BASIC_HEURISTIC_AGENDA_REGISTER_HEURISTIC_EVALUATOR_METHO);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_HEURISTIC_AGENDA, CYBLACK_BASIC_HEURISTIC_AGENDA, $list_alt33, NIL, $list_alt58);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA, INITIALIZE_QUA_HEURISTIC_AGENDA, $sym110$CYBLACK_BASIC_HEURISTIC_AGENDA_INITIALIZE_QUA_HEURISTIC_AGENDA_ME);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_HEURISTIC_AGENDA, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_AGENDA_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_HEURISTIC_AGENDA, $sym120$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_AGENDA_INSTAN);
        subloop_reserved_initialize_cyblack_basic_heuristic_agenda_class(CYBLACK_BASIC_HEURISTIC_AGENDA);
        methods.methods_incorporate_class_method(ADD_HEURISTIC_EVALUATOR_CLASS, CYBLACK_BASIC_HEURISTIC_AGENDA, $list_alt16, $list_alt122, $list_alt123);
        methods.subloop_register_class_method(CYBLACK_BASIC_HEURISTIC_AGENDA, ADD_HEURISTIC_EVALUATOR_CLASS, $sym125$CYBLACK_BASIC_HEURISTIC_AGENDA_ADD_HEURISTIC_EVALUATOR_CLASS_METH);
        methods.methods_incorporate_class_method(GET_ALL_HEURISTIC_EVALUATOR_CLASSES, CYBLACK_BASIC_HEURISTIC_AGENDA, $list_alt16, NIL, $list_alt127);
        methods.subloop_register_class_method(CYBLACK_BASIC_HEURISTIC_AGENDA, GET_ALL_HEURISTIC_EVALUATOR_CLASSES, $sym129$CYBLACK_BASIC_HEURISTIC_AGENDA_GET_ALL_HEURISTIC_EVALUATOR_CLASSE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_HEURISTIC_AGENDA, $list_alt33, NIL, $list_alt130);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA, INITIALIZE, CYBLACK_BASIC_HEURISTIC_AGENDA_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_BASIC_HEURISTIC_AGENDA, $list_alt38, $list_alt39, $list_alt132);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA, SET_APPLICATION, CYBLACK_BASIC_HEURISTIC_AGENDA_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_HEURISTIC_EVALUATOR_REGISTRY_INTERNAL, CYBLACK_BASIC_HEURISTIC_AGENDA, $list_alt135, NIL, $list_alt136);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA, GET_HEURISTIC_EVALUATOR_REGISTRY_INTERNAL, $sym137$CYBLACK_BASIC_HEURISTIC_AGENDA_GET_HEURISTIC_EVALUATOR_REGISTRY_I);
        methods.methods_incorporate_instance_method(SET_HEURISTIC_EVALUATOR_REGISTRY_INTERNAL, CYBLACK_BASIC_HEURISTIC_AGENDA, $list_alt33, $list_alt77, $list_alt139);
        methods.subloop_register_instance_method(CYBLACK_BASIC_HEURISTIC_AGENDA, SET_HEURISTIC_EVALUATOR_REGISTRY_INTERNAL, $sym142$CYBLACK_BASIC_HEURISTIC_AGENDA_SET_HEURISTIC_EVALUATOR_REGISTRY_I);
        classes.subloop_new_class(CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA, CYBLACK_BASIC_SIMPLE_AGENDA, NIL, NIL, $list_alt144);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA, $sym145$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA, $sym146$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_);
        subloop_reserved_initialize_cyblack_basic_auto_locking_heuristic_agenda_class(CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA);
        methods.methods_incorporate_instance_method(PROPOSE, CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA, $list_alt16, $list_alt17, $list_alt148);
        methods.subloop_register_instance_method(CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA, PROPOSE, CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA_PROPOSE_METHOD);
        methods.methods_incorporate_instance_method(RETRACT, CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA, $list_alt16, $list_alt17, $list_alt153);
        methods.subloop_register_instance_method(CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA, RETRACT, CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA_RETRACT_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_HEURISTIC_EVALUATOR = makeSymbol("CYBLACK-HEURISTIC-EVALUATOR");

    static private final SubLList $list_alt1 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT")));

    static private final SubLList $list_alt3 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLIES-P"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-WEIGHT"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_EVALUATOR = makeSymbol("CYBLACK-BASIC-HEURISTIC-EVALUATOR");



    static private final SubLList $list_alt6 = list(makeSymbol("CYBLACK-HEURISTIC-EVALUATOR"));





    static private final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_EVALUATOR_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-EVALUATOR-CLASS");









    static private final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_EVALUATOR_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-EVALUATOR-INSTANCE");

    private static final SubLSymbol APPLIES_P = makeSymbol("APPLIES-P");

    static private final SubLList $list_alt16 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt17 = list(makeSymbol("PROPOSAL"));

    static private final SubLList $list_alt18 = list(list(makeSymbol("IGNORE"), makeSymbol("PROPOSAL")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_EVALUATOR_APPLIES_P_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-EVALUATOR-APPLIES-P-METHOD");

    private static final SubLSymbol GET_WEIGHT = makeSymbol("GET-WEIGHT");

    static private final SubLList $list_alt21 = list(list(makeSymbol("IGNORE"), makeSymbol("PROPOSAL")), list(RET, makeDouble(0.0)));

    public static final SubLFloat $float$0_0 = makeDouble(0.0);

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_EVALUATOR_GET_WEIGHT_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-EVALUATOR-GET-WEIGHT-METHOD");

    private static final SubLSymbol CYBLACK_HEURISTIC_EVALUATOR_REGISTRY = makeSymbol("CYBLACK-HEURISTIC-EVALUATOR-REGISTRY");

    static private final SubLList $list_alt25 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("HEURISTIC-EVALUATOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICABLE-HEURISTIC-EVALUATORS"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY = makeSymbol("CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY");

    static private final SubLList $list_alt27 = list(makeSymbol("CYBLACK-HEURISTIC-EVALUATOR-REGISTRY"));

    static private final SubLList $list_alt28 = list(list(makeSymbol("EVALUATORS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("HEURISTIC-EVALUATOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICABLE-HEURISTIC-EVALUATORS"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym30$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REG = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-CLASS");

    static private final SubLSymbol $sym31$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REG = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-INSTANCE");



    static private final SubLList $list_alt33 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt34 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("EVALUATORS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym35$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-INITIALIZE-METHOD");



    static private final SubLList $list_alt38 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt39 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt40 = list(list(makeSymbol("SET-APPLICATION"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CDOLIST"), list(makeSymbol("EVALUATOR"), makeSymbol("EVALUATORS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("EVALUATOR"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("NEW-APPLICATION"))), list(RET, makeSymbol("NEW-APPLICATION")));

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-SET-APPLICATION-METHOD");



    static private final SubLList $list_alt43 = list(makeSymbol("HEURISTIC-EVALUATOR"));

    static private final SubLList $list_alt44 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-HEURISTIC-EVALUATOR-P"), makeSymbol("HEURISTIC-EVALUATOR")), makeString("(ADD ~S): ~S is not an instance of CYBLACK-HEURISTIC-EVALUATOR."), makeSymbol("SELF"), makeSymbol("HEURISTIC-EVALUATOR")), list(makeSymbol("CPUSHNEW"), makeSymbol("HEURISTIC-EVALUATOR"), makeSymbol("EVALUATORS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("HEURISTIC-EVALUATOR"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(RET, makeSymbol("HEURISTIC-EVALUATOR")));

    static private final SubLSymbol $sym45$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-METHOD");

    static private final SubLString $str_alt46$_ADD__S____S_is_not_an_instance_o = makeString("(ADD ~S): ~S is not an instance of CYBLACK-HEURISTIC-EVALUATOR.");

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_ADD_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-ADD-METHOD");

    private static final SubLSymbol GET_APPLICABLE_HEURISTIC_EVALUATORS = makeSymbol("GET-APPLICABLE-HEURISTIC-EVALUATORS");

    static private final SubLList $list_alt49 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("PROPOSAL")), makeString("(GET-APPLICABLE-HEURISTIC-EVALUATORS ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("CLET"), list(list(makeSymbol("APPLICABLE-EVALUATORS"), NIL)), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("EVALUATOR"), makeSymbol("EVALUATORS"), makeSymbol("APPLICABLE-EVALUATORS")), list(makeSymbol("FIF"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("EVALUATOR"), list(QUOTE, makeSymbol("APPLIES-P")), makeSymbol("PROPOSAL")), list(makeSymbol("LIST"), makeSymbol("PROPOSAL")), NIL)), list(RET, makeSymbol("APPLICABLE-EVALUATORS"))));

    static private final SubLSymbol $sym50$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-METHOD");

    static private final SubLString $str_alt51$_GET_APPLICABLE_HEURISTIC_EVALUAT = makeString("(GET-APPLICABLE-HEURISTIC-EVALUATORS ~S): ~S is not an instance of CYBLACK-PROPOSAL.");

    static private final SubLSymbol $sym52$CYBLACK_BASIC_HEURISTIC_EVALUATOR_REGISTRY_GET_APPLICABLE_HEURIST = makeSymbol("CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY-GET-APPLICABLE-HEURISTIC-EVALUATORS-METHOD");

    private static final SubLSymbol CYBLACK_HEURISTIC_AGENDA = makeSymbol("CYBLACK-HEURISTIC-AGENDA");

    static private final SubLList $list_alt54 = list(makeSymbol("CYBLACK-AGENDA"));

    static private final SubLList $list_alt55 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-AGENDA")));

    static private final SubLList $list_alt56 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-HEURISTIC-AGENDA"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL"), list(makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REGISTER-HEURISTIC-EVALUATOR"), list(makeSymbol("HEURISTIC-EVALUATOR")), makeKeyword("PUBLIC")));

    private static final SubLSymbol INITIALIZE_QUA_HEURISTIC_AGENDA = makeSymbol("INITIALIZE-QUA-HEURISTIC-AGENDA");

    static private final SubLList $list_alt58 = list(list(makeSymbol("SET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol REGISTER_HEURISTIC_EVALUATOR = makeSymbol("REGISTER-HEURISTIC-EVALUATOR");

    static private final SubLList $list_alt60 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-HEURISTIC-EVALUATOR-P"), makeSymbol("HEURISTIC-EVALUATOR")), makeString("(REGISTER-HEURISTIC-EVALUATOR ~S): ~S is not an instance of CYBLACK-HEURISTIC-EVALUATOR."), makeSymbol("SELF"), makeSymbol("HEURISTIC-EVALUATOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-HEURISTIC-EVALUATOR-REGISTRY"), list(makeSymbol("GET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-HEURISTIC-EVALUATOR-REGISTRY"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-HEURISTIC-EVALUATOR-REGISTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-BASIC-HEURISTIC-EVALUATOR-REGISTRY")))), list(makeSymbol("SET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL"), makeSymbol("SELF"), makeSymbol("TEMPLATE-HEURISTIC-EVALUATOR-REGISTRY"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-HEURISTIC-EVALUATOR-REGISTRY"), list(QUOTE, makeSymbol("ADD")), makeSymbol("HEURISTIC-EVALUATOR")), list(RET, makeSymbol("HEURISTIC-EVALUATOR"))));



    private static final SubLSymbol $CACHED_WEIGHT = makeKeyword("CACHED-WEIGHT");

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER");

    static private final SubLList $list_alt64 = list(makeSymbol("QUEUE-SIMPLE-SORTER-TEMPLATE"));

    static private final SubLList $list_alt65 = list(new SubLObject[]{ list(makeSymbol("HEURISTIC-EVALUATOR-REGISTRY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SORT-PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ELEMENT-KEY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-HEURISTIC-EVALUATOR-REGISTRY"), list(makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SORT-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SORT-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-KEY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-KEY"), list(makeSymbol("NEW-KEY-FUNCTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE-INTERNAL"), list(makeSymbol("CONTENTS")), makeKeyword("PROTECTED")) });

    private static final SubLSymbol ELEMENT_KEY = makeSymbol("ELEMENT-KEY");





    static private final SubLSymbol $sym69$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-CLASS");

    static private final SubLSymbol $sym70$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-INSTANCE");

    static private final SubLList $list_alt71 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("HEURISTIC-EVALUATOR-REGISTRY"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SORT-PREDICATE"), list(makeSymbol("FUNCTION"), makeSymbol(">"))), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-KEY"), list(makeSymbol("FUNCTION"), makeSymbol("GET-PROPOSAL-CACHED-WEIGHT"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym72$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-METHOD");

    static private final SubLSymbol $sym73$_ = makeSymbol(">");

    private static final SubLSymbol GET_PROPOSAL_CACHED_WEIGHT = makeSymbol("GET-PROPOSAL-CACHED-WEIGHT");

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-INITIALIZE-METHOD");

    private static final SubLSymbol SET_HEURISTIC_EVALUATOR_REGISTRY = makeSymbol("SET-HEURISTIC-EVALUATOR-REGISTRY");

    static private final SubLList $list_alt77 = list(makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY"));

    static private final SubLList $list_alt78 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY")), list(makeSymbol("CYBLACK-HEURISTIC-EVALUATOR-REGISTRY-P"), makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY"))), makeString("(SET-HEURISTIC-EVALUATOR-REGISTRY ~S): ~S is not an instance of CYBLACK-HEURISTIC-EVALUATOR-REGISTRY."), makeSymbol("SELF"), makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY")), list(makeSymbol("CSETQ"), makeSymbol("HEURISTIC-EVALUATOR-REGISTRY"), makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY")), list(RET, makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY")));

    static private final SubLSymbol $sym79$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-METHOD");

    static private final SubLString $str_alt80$_SET_HEURISTIC_EVALUATOR_REGISTRY = makeString("(SET-HEURISTIC-EVALUATOR-REGISTRY ~S): ~S is not an instance of CYBLACK-HEURISTIC-EVALUATOR-REGISTRY.");

    static private final SubLSymbol $sym81$CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_SET_HEURISTIC_EVALUATOR_REG = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-SET-HEURISTIC-EVALUATOR-REGISTRY-METHOD");

    private static final SubLSymbol GET_SORT_PREDICATE = makeSymbol("GET-SORT-PREDICATE");

    static private final SubLList $list_alt83 = list(list(RET, makeSymbol("SORT-PREDICATE")));

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_GET_SORT_PREDICATE_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-GET-SORT-PREDICATE-METHOD");

    private static final SubLSymbol SET_SORT_PREDICATE = makeSymbol("SET-SORT-PREDICATE");

    static private final SubLList $list_alt86 = list(makeSymbol("NEW-PREDICATE"));

    static private final SubLList $list_alt87 = list(list(makeSymbol("CSETQ"), makeSymbol("SORT-PREDICATE"), makeSymbol("NEW-PREDICATE")), list(RET, makeSymbol("NEW-PREDICATE")));

    static private final SubLSymbol $sym88$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_SET_SORT_PREDICATE_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-SET-SORT-PREDICATE-METHOD");

    private static final SubLSymbol GET_ELEMENT_KEY = makeSymbol("GET-ELEMENT-KEY");

    static private final SubLList $list_alt91 = list(list(RET, makeSymbol("ELEMENT-KEY")));

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_GET_ELEMENT_KEY_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-GET-ELEMENT-KEY-METHOD");

    private static final SubLSymbol SET_ELEMENT_KEY = makeSymbol("SET-ELEMENT-KEY");

    static private final SubLList $list_alt94 = list(makeSymbol("NEW-KEY-FUNCTION"));

    static private final SubLList $list_alt95 = list(list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-KEY"), makeSymbol("NEW-KEY-FUNCTION")), list(RET, makeSymbol("NEW-KEY-FUNCTION")));

    static private final SubLSymbol $sym96$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_SET_ELEMENT_KEY_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-SET-ELEMENT-KEY-METHOD");

    private static final SubLSymbol ORDER_QUEUE_INTERNAL = makeSymbol("ORDER-QUEUE-INTERNAL");

    static private final SubLList $list_alt99 = list(makeSymbol("CONTENTS"));

    static private final SubLList $list_alt100 = list(list(makeSymbol("CLET"), list(list(makeSymbol("EVALUATORS"), NIL), list(makeSymbol("SUM"), ZERO_INTEGER), list(makeSymbol("COUNT"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("PROPOSAL"), makeSymbol("CONTENTS")), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-PROPOSAL-CACHED-WEIGHT"), makeSymbol("PROPOSAL")), list(makeSymbol("CSETQ"), makeSymbol("EVALUATORS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("HEURISTIC-EVALUATOR-REGISTRY"), list(QUOTE, makeSymbol("GET-APPLICABLE-HEURISTIC-EVALUATORS")))), list(makeSymbol("CSETQ"), makeSymbol("SUM"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("COUNT"), ZERO_INTEGER), list(makeSymbol("CDOLIST"), list(makeSymbol("EVALUATOR"), makeSymbol("EVALUATORS")), list(makeSymbol("CSETQ"), makeSymbol("SUM"), list(makeSymbol("+"), makeSymbol("SUM"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("EVALUATOR"), list(QUOTE, makeSymbol("GET-WEIGHT"))))), list(makeSymbol("CINC"), makeSymbol("COUNT"))), list(makeSymbol("SET-PROPOSAL-CACHED-WEIGHT"), makeSymbol("PROPOSAL"), list(makeSymbol("/"), makeSymbol("SUM"), makeSymbol("COUNT")))))), list(RET, list(makeSymbol("SORT"), makeSymbol("CONTENTS"), makeSymbol("SORT-PREDICATE"), makeSymbol("ELEMENT-KEY"))));

    static private final SubLSymbol $sym101$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_AGENDA_SORTER_ORDER_QUEUE_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER-ORDER-QUEUE-INTERNAL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_AGENDA = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA");

    static private final SubLList $list_alt105 = list(makeSymbol("CYBLACK-HEURISTIC-AGENDA"));

    static private final SubLList $list_alt106 = list(new SubLObject[]{ list(makeSymbol("HEURISTIC-EVALUATOR-CLASSES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), NIL), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ADD-HEURISTIC-EVALUATOR-CLASS"), list(makeSymbol("NEW-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-ALL-HEURISTIC-EVALUATOR-CLASSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("HEURISTIC-EVALUATOR-REGISTRY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL"), list(makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-HEURISTIC-AGENDA"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REGISTER-HEURISTIC-EVALUATOR"), list(makeSymbol("HEURISTIC-EVALUATOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    private static final SubLSymbol HEURISTIC_EVALUATOR_CLASSES = makeSymbol("HEURISTIC-EVALUATOR-CLASSES");

    static private final SubLString $str_alt108$_REGISTER_HEURISTIC_EVALUATOR__S_ = makeString("(REGISTER-HEURISTIC-EVALUATOR ~S): ~S is not an instance of CYBLACK-HEURISTIC-EVALUATOR.");

    static private final SubLSymbol $sym109$CYBLACK_BASIC_HEURISTIC_AGENDA_REGISTER_HEURISTIC_EVALUATOR_METHO = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-REGISTER-HEURISTIC-EVALUATOR-METHOD");

    static private final SubLSymbol $sym110$CYBLACK_BASIC_HEURISTIC_AGENDA_INITIALIZE_QUA_HEURISTIC_AGENDA_ME = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-INITIALIZE-QUA-HEURISTIC-AGENDA-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_AGENDA_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-AGENDA-CLASS");







    private static final SubLSymbol QUEUE_PRIORITIZER = makeSymbol("QUEUE-PRIORITIZER");









    static private final SubLSymbol $sym120$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_HEURISTIC_AGENDA_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-HEURISTIC-AGENDA-INSTANCE");

    private static final SubLSymbol ADD_HEURISTIC_EVALUATOR_CLASS = makeSymbol("ADD-HEURISTIC-EVALUATOR-CLASS");

    static private final SubLList $list_alt122 = list(makeSymbol("NEW-CLASS"));

    static private final SubLList $list_alt123 = list(list(makeSymbol("CPUSHNEW"), makeSymbol("NEW-CLASS"), makeSymbol("HEURISTIC-EVALUATOR-CLASSES")), list(RET, makeSymbol("NEW-CLASS")));

    static private final SubLSymbol $sym124$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-HEURISTIC-AGENDA-METHOD");

    static private final SubLSymbol $sym125$CYBLACK_BASIC_HEURISTIC_AGENDA_ADD_HEURISTIC_EVALUATOR_CLASS_METH = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-ADD-HEURISTIC-EVALUATOR-CLASS-METHOD");

    private static final SubLSymbol GET_ALL_HEURISTIC_EVALUATOR_CLASSES = makeSymbol("GET-ALL-HEURISTIC-EVALUATOR-CLASSES");

    static private final SubLList $list_alt127 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ACTUAL-CLASS"), list(makeSymbol("FIF"), list(makeSymbol("SYMBOLP"), makeSymbol("SELF")), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("SELF")), makeSymbol("SELF")))), list(RET, list(makeSymbol("FIF"), list(EQ, list(makeSymbol("CLASS-NAME"), makeSymbol("ACTUAL-CLASS")), list(QUOTE, makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA"))), list(makeSymbol("COPY-LIST"), makeSymbol("HEURISTIC-EVALUATOR-CLASSES")), list(makeSymbol("UNION"), makeSymbol("HEURISTIC-EVALUATOR-CLASSES"), list(makeSymbol("GET-ALL-HEURISTIC-EVALUATOR-CLASSES"), makeSymbol("SUPER")))))));

    static private final SubLSymbol $sym128$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-HEURISTIC-AGENDA-METHOD");

    static private final SubLSymbol $sym129$CYBLACK_BASIC_HEURISTIC_AGENDA_GET_ALL_HEURISTIC_EVALUATOR_CLASSE = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-GET-ALL-HEURISTIC-EVALUATOR-CLASSES-METHOD");

    static private final SubLList $list_alt130 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-HEURISTIC-AGENDA"), makeSymbol("SELF")), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-SORTER")))), list(makeSymbol("CDOLIST"), list(makeSymbol("HEURISTIC-EVALUATOR-CLASS"), list(makeSymbol("GET-ALL-HEURISTIC-EVALUATOR-CLASSES"), makeSymbol("SELF"))), list(makeSymbol("REGISTER-HEURISTIC-EVALUATOR"), makeSymbol("SELF"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("HEURISTIC-EVALUATOR-CLASS")))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_AGENDA_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-INITIALIZE-METHOD");

    static private final SubLList $list_alt132 = list(list(makeSymbol("SET-APPLICATION"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("PWHEN"), makeSymbol("HEURISTIC-EVALUATOR-REGISTRY"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("HEURISTIC-EVALUATOR-REGISTRY"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("NEW-APPLICATION"))), list(makeSymbol("CLET"), list(list(makeSymbol("PRIORITIZER"), list(makeSymbol("GET-PRIORITIZER-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("PRIORITIZER"), list(makeSymbol("CYBLACK-OBJECT-P"), makeSymbol("PRIORITIZER"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PRIORITIZER"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("NEW-APPLICATION")))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_AGENDA_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-SET-APPLICATION-METHOD");

    private static final SubLSymbol GET_HEURISTIC_EVALUATOR_REGISTRY_INTERNAL = makeSymbol("GET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL");

    static private final SubLList $list_alt135 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt136 = list(list(RET, makeSymbol("HEURISTIC-EVALUATOR-REGISTRY")));

    static private final SubLSymbol $sym137$CYBLACK_BASIC_HEURISTIC_AGENDA_GET_HEURISTIC_EVALUATOR_REGISTRY_I = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-GET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL-METHOD");

    private static final SubLSymbol SET_HEURISTIC_EVALUATOR_REGISTRY_INTERNAL = makeSymbol("SET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL");

    static private final SubLList $list_alt139 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY")), list(makeSymbol("CYBLACK-HEURISTIC-EVALUATOR-REGISTRY-P"), makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY"))), makeString("(SET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL ~S): ~S is not an instance of CYBLACK-HEURISTIC-EVALUATOR-REGISTRY."), makeSymbol("SELF"), makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY")), list(makeSymbol("CSETQ"), makeSymbol("HEURISTIC-EVALUATOR-REGISTRY"), makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY")), list(RET, makeSymbol("NEW-HEURISTIC-EVALUATOR-REGISTRY")));

    static private final SubLSymbol $sym140$OUTER_CATCH_FOR_CYBLACK_BASIC_HEURISTIC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-HEURISTIC-AGENDA-METHOD");

    static private final SubLString $str_alt141$_SET_HEURISTIC_EVALUATOR_REGISTRY = makeString("(SET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL ~S): ~S is not an instance of CYBLACK-HEURISTIC-EVALUATOR-REGISTRY.");

    static private final SubLSymbol $sym142$CYBLACK_BASIC_HEURISTIC_AGENDA_SET_HEURISTIC_EVALUATOR_REGISTRY_I = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA-SET-HEURISTIC-EVALUATOR-REGISTRY-INTERNAL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA = makeSymbol("CYBLACK-BASIC-AUTO-LOCKING-HEURISTIC-AGENDA");

    static private final SubLList $list_alt144 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROPOSE"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRACT"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym145$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-AUTO-LOCKING-HEURISTIC-AGENDA-CLASS");

    static private final SubLSymbol $sym146$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-AUTO-LOCKING-HEURISTIC-AGENDA-INSTANCE");



    static private final SubLList $list_alt148 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("PROPOSAL")), makeString("(PROPOSE ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("ENQUEUE"), makeSymbol("SELF"), makeSymbol("PROPOSAL"))), list(RET, makeSymbol("PROPOSAL")));

    static private final SubLSymbol $sym149$OUTER_CATCH_FOR_CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA_METHO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-AUTO-LOCKING-HEURISTIC-AGENDA-METHOD");

    static private final SubLString $str_alt150$_PROPOSE__S____S_is_not_an_instan = makeString("(PROPOSE ~S): ~S is not an instance of CYBLACK-PROPOSAL.");

    private static final SubLSymbol CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA_PROPOSE_METHOD = makeSymbol("CYBLACK-BASIC-AUTO-LOCKING-HEURISTIC-AGENDA-PROPOSE-METHOD");



    static private final SubLList $list_alt153 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("PROPOSAL")), makeString("(RETRACT ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("PROPOSAL"))), list(RET, makeSymbol("PROPOSAL")));

    static private final SubLSymbol $sym154$OUTER_CATCH_FOR_CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA_METHO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-AUTO-LOCKING-HEURISTIC-AGENDA-METHOD");

    static private final SubLString $str_alt155$_RETRACT__S____S_is_not_an_instan = makeString("(RETRACT ~S): ~S is not an instance of CYBLACK-PROPOSAL.");

    private static final SubLSymbol CYBLACK_BASIC_AUTO_LOCKING_HEURISTIC_AGENDA_RETRACT_METHOD = makeSymbol("CYBLACK-BASIC-AUTO-LOCKING-HEURISTIC-AGENDA-RETRACT-METHOD");

    static private final SubLString $str_alt157$DEFINE_CYBLACK_HEURISTIC___S_is_n = makeString("DEFINE-CYBLACK-HEURISTIC: ~S is not a valid ~S expression. ~\n     A list of the form (<lambda list> [<expression>*] (ret <expression>)) ~\n     was expected.");

    static private final SubLString $str_alt158$DEFINE_CYBLACK_HEURISTIC___S_is_n = makeString("DEFINE-CYBLACK-HEURISTIC: ~S is not a valid ~S expression. ~\n     ~S is not a valid lambda list.");

    static private final SubLString $str_alt159$DEFINE_CYBLACK_HEURISTIC___S_is_n = makeString("DEFINE-CYBLACK-HEURISTIC: ~S is not a valid ~S expression. ~\n     ~S is not a valid body.");

    private static final SubLSymbol $AGENDA_CLASS = makeKeyword("AGENDA-CLASS");

    private static final SubLSymbol $APPLIES_WHEN = makeKeyword("APPLIES-WHEN");



    static private final SubLList $list_alt163 = list(makeKeyword("AGENDA-CLASS"), makeKeyword("APPLIES-WHEN"), makeKeyword("WEIGHT"));











    static private final SubLList $list_alt169 = list(QUOTE, makeSymbol("ADD-HEURISTIC-EVALUATOR-CLASS"));

    static private final SubLList $list_alt170 = list(cons(makeSymbol("HEURISTIC-NAME"), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("SLOT-AND-METHOD-DECLS"));

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_heuristic_agenda_file();
    }

    public void initializeVariables() {
        init_cyblack_heuristic_agenda_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_heuristic_agenda_file();
    }
}

