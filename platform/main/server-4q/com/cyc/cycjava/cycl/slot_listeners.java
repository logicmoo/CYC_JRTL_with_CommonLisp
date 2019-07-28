package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.slot_listeners;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.slot_listeners.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class slot_listeners extends SubLTranslatedFile {
    public static final SubLFile me = new slot_listeners();

    public static final String myName = "com.cyc.cycjava.cycl.slot_listeners";

    public static final String myFingerPrint = "8c9e62e466ab9e99c7423993df16a3f7a6cfd2629db56512b6775c2408d403b4";

    // defparameter
    private static final SubLSymbol $slot_listeners_slot_trigger_types$ = makeSymbol("*SLOT-LISTENERS-SLOT-TRIGGER-TYPES*");

    // defparameter
    private static final SubLSymbol $slot_listeners_registry_types$ = makeSymbol("*SLOT-LISTENERS-REGISTRY-TYPES*");

    // defparameter
    private static final SubLSymbol $slot_listeners_valid_demon_types$ = makeSymbol("*SLOT-LISTENERS-VALID-DEMON-TYPES*");

    // defparameter
    /**
     * This parameter is to be used only by code considered to be the base of
     * SubLOOP.
     */
    public static final SubLSymbol $active_slot_listener$ = makeSymbol("*ACTIVE-SLOT-LISTENER*");

    // Internal Constants
    public static final SubLList $list0 = list(NIL, makeKeyword("VALUE"), makeKeyword("RANGE"), makeKeyword("ENUM"));

    public static final SubLList $list1 = list(makeKeyword("SLOT-GETTER-REGISTRY"), makeKeyword("SLOT-SETTER-REGISTRY"));

    public static final SubLList $list2 = list(makeKeyword("SET"), makeKeyword("GET"));







    public static final SubLString $str6$Cannot_fire_slot_listeners_of_slo = makeString("Cannot fire slot listeners of slot ~S of illegal instance ~S.");

    public static final SubLString $str7$_S_is_not_a_valid_registry_type_ = makeString("~S is not a valid registry type.");

    private static final SubLSymbol $SLOT_GETTER_REGISTRY = makeKeyword("SLOT-GETTER-REGISTRY");

    private static final SubLSymbol $SLOT_SETTER_REGISTRY = makeKeyword("SLOT-SETTER-REGISTRY");

    public static final SubLString $str10$Cannot_add_a_slot_listener_to_ill = makeString("Cannot add a slot listener to illegal slot ~S of instance ~S");

    public static final SubLSymbol SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT = makeSymbol("SLOT-LISTENERS-NEW-SLOT-LISTENER-INTERNAL-REDUNDANT");

    public static final SubLString $str12$Cannot_add_listener__S_of_instanc = makeString("Cannot add listener ~S of instance ~S to slot ~S of instance ~S.");





    public static final SubLString $str15$Cannot_add_a_slot_listener_to_inv = makeString("Cannot add a slot listener to invalid instance ~S.");

    public static final SubLString $str16$_S_is_not_a_valid_slot_listener_t = makeString("~S is not a valid slot listener type.");

    public static final SubLString $str17$Slot_listener_functions_and_metho = makeString("Slot listener functions and methods must be symbols.  ~S is not a symbol.");

    public static final SubLString $str18$Slot_listener_targets_must_be_val = makeString("Slot listener targets must be valid instances.  ~S is not a valid instance.");

    public static SubLObject slot_listeners_valid_slot_trigger_type_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != member(v_object, $slot_listeners_slot_trigger_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static SubLObject slot_listeners_valid_slot_registry_type_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != member(v_object, $slot_listeners_registry_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static SubLObject slot_listeners_valid_demon_type_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != member(v_object, $slot_listeners_valid_demon_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static SubLObject slot_listeners_add_registry(final SubLObject instance_to_modify, final SubLObject registry_type) {
        if (NIL != subloop_structures.instance_p(instance_to_modify)) {
            final SubLObject new_slot_listener_registry = subloop_structures.make_slot_listener_registry(UNPROVIDED);
            final SubLObject v_class_$1;
            final SubLObject v_class = v_class_$1 = subloop_structures.instance_class(instance_to_modify);
            final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$1);
            final SubLObject slot_listener_registry = new_slot_listener_registry;
            SubLObject instance_$2 = subloop_structures.slr_instance(slot_listener_registry);
            SubLObject slot_count = subloop_structures.slr_slot_count(slot_listener_registry);
            SubLObject listeners_vector = subloop_structures.slr_listeners_vector(slot_listener_registry);
            try {
                instance_$2 = instance_to_modify;
                slot_count = length(compiled_instance_slot_access_alist);
                if (slot_count.numG(ZERO_INTEGER)) {
                    listeners_vector = make_vector(slot_count, UNPROVIDED);
                    SubLObject index;
                    for (index = NIL, index = ZERO_INTEGER; index.numL(slot_count); index = add(index, ONE_INTEGER)) {
                        set_aref(listeners_vector, index, NIL);
                    }
                } else {
                    listeners_vector = NIL;
                }
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    subloop_structures._csetf_slr_instance(slot_listener_registry, instance_$2);
                    subloop_structures._csetf_slr_slot_count(slot_listener_registry, slot_count);
                    subloop_structures._csetf_slr_listeners_vector(slot_listener_registry, listeners_vector);
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            instances.instance_set_property(instance_to_modify, registry_type, new_slot_listener_registry);
            return new_slot_listener_registry;
        }
        return NIL;
    }

    public static SubLObject slot_listeners_get_registry(final SubLObject instance, final SubLObject registry_type) {
        if (NIL != subloop_structures.instance_p(instance)) {
            return classes.classes_getf(subloop_structures.instance_plist(instance), registry_type);
        }
        return NIL;
    }

    public static SubLObject slot_listeners_value_trigger_type(final SubLObject value_trigger) {
        if (NIL == value_trigger) {
            return NIL;
        }
        if (value_trigger.isCons()) {
            return value_trigger.first();
        }
        return NIL;
    }

    public static SubLObject slot_listeners_value_trigger_value(final SubLObject value_trigger) {
        if (slot_listeners_value_trigger_type(value_trigger) == $VALUE) {
            return value_trigger.rest();
        }
        return NIL;
    }

    public static SubLObject slot_listeners_value_trigger_range(final SubLObject value_trigger) {
        if (slot_listeners_value_trigger_type(value_trigger) == $RANGE) {
            final SubLObject range = value_trigger.rest();
            return values(range.first(), range.rest());
        }
        return values(NIL, NIL);
    }

    public static SubLObject slot_listeners_value_trigger_enum(final SubLObject value_trigger) {
        if (slot_listeners_value_trigger_type(value_trigger) == $ENUM) {
            return value_trigger.rest();
        }
        return NIL;
    }

    public static SubLObject slot_listeners_slot_listener_match_p(final SubLObject slot_listener, final SubLObject target_slot_name, final SubLObject target_slot_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject slot_name = subloop_structures.sl_slot_name(slot_listener);
        final SubLObject value_trigger = subloop_structures.sl_value_trigger(slot_listener);
        if (!slot_name.eql(target_slot_name)) {
            return NIL;
        }
        final SubLObject pcase_var = slot_listeners_value_trigger_type(value_trigger);
        if (pcase_var.eql(NIL)) {
            return T;
        }
        if (pcase_var.eql($VALUE)) {
            return equal(slot_listeners_value_trigger_value(value_trigger), target_slot_value);
        }
        if (pcase_var.eql($RANGE)) {
            thread.resetMultipleValues();
            final SubLObject low_bound = slot_listeners_value_trigger_range(value_trigger);
            final SubLObject upper_bound = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values_are_strings = makeBoolean((low_bound.isString() && upper_bound.isString()) && target_slot_value.isString());
            final SubLObject values_are_numbers = makeBoolean((low_bound.isNumber() && upper_bound.isNumber()) && target_slot_value.isNumber());
            final SubLObject values_are_characters = makeBoolean((low_bound.isChar() && upper_bound.isChar()) && target_slot_value.isChar());
            if (NIL != values_are_strings) {
                return makeBoolean((NIL != Strings.stringGE(target_slot_value, low_bound, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != Strings.stringLE(target_slot_value, upper_bound)));
            }
            if (NIL != values_are_numbers) {
                return makeBoolean(target_slot_value.numGE(low_bound) && target_slot_value.numLE(upper_bound));
            }
            if (NIL != values_are_characters) {
                return makeBoolean((NIL != charGE(target_slot_value, low_bound)) && (NIL != charLE(target_slot_value, upper_bound)));
            }
            return NIL;
        } else {
            if (pcase_var.eql($ENUM)) {
                final SubLObject v_enum = slot_listeners_value_trigger_enum(value_trigger);
                return NIL != member(target_slot_value, v_enum, symbol_function(EQUAL), UNPROVIDED) ? T : NIL;
            }
            return NIL;
        }
    }

    public static SubLObject slot_listeners_fire_slot_listener(final SubLObject slot_listener, final SubLObject instance, final SubLObject target_slot_value) {
        final SubLObject functional_type = subloop_structures.sl_functional_type(slot_listener);
        final SubLObject isa_method = subloop_structures.sl_isa_method(slot_listener);
        final SubLObject target_instance = subloop_structures.sl_target_instance(slot_listener);
        if (NIL != isa_method) {
            if ((NIL != functional_type) && (NIL != target_instance)) {
                return methods.funcall_instance_method_with_2_args(target_instance, functional_type, instance, target_slot_value);
            }
        } else
            if (NIL != functional_type) {
                if (NIL != target_instance) {
                    return funcall(functional_type, target_instance, instance, target_slot_value);
                }
                return funcall(functional_type, instance, target_slot_value);
            }

        return NIL;
    }

    public static SubLObject slot_listeners_fast_fire_all_slot_listeners_stimulated_by_value(final SubLObject registry, final SubLObject slot_name, final SubLObject slot_index, final SubLObject target_slot_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject instance = subloop_structures.slr_instance(registry);
        final SubLObject listeners_vector = subloop_structures.slr_listeners_vector(registry);
        SubLObject cdolist_list_var;
        final SubLObject listeners_at_index = cdolist_list_var = aref(listeners_vector, slot_index);
        SubLObject listener = NIL;
        listener = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != slot_listeners_slot_listener_match_p(listener, slot_name, target_slot_value)) {
                final SubLObject _prev_bind_0 = $active_slot_listener$.currentBinding(thread);
                try {
                    $active_slot_listener$.bind(listener, thread);
                    slot_listeners_fire_slot_listener(listener, instance, target_slot_value);
                } finally {
                    $active_slot_listener$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            listener = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject slot_listeners_fast_fire_all_slot_listeners(final SubLObject instance, final SubLObject registry_type, final SubLObject slot_name, final SubLObject slot_index, final SubLObject target_slot_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(instance))) {
            Errors.error($str6$Cannot_fire_slot_listeners_of_slo, slot_name, instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == slot_listeners_valid_slot_registry_type_p(registry_type))) {
            Errors.error($str7$_S_is_not_a_valid_registry_type_, registry_type);
        }
        final SubLObject registry = slot_listeners_get_registry(instance, registry_type);
        if (NIL != registry) {
            slot_listeners_fast_fire_all_slot_listeners_stimulated_by_value(registry, slot_name, slot_index, target_slot_value);
            return T;
        }
        return NIL;
    }

    public static SubLObject slot_listeners_fire_all_get_slot_listeners(final SubLObject instance, final SubLObject slot_name, final SubLObject target_slot_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(instance))) {
            Errors.error($str6$Cannot_fire_slot_listeners_of_slo, slot_name, instance);
        }
        final SubLObject registry = slot_listeners_get_registry(instance, $SLOT_GETTER_REGISTRY);
        if (NIL != registry) {
            SubLObject slot_index = NIL;
            final SubLObject v_class = subloop_structures.instance_class(instance);
            final SubLObject association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
            if (NIL != association) {
                slot_index = slots.slot_index(association);
            }
            if (NIL != slot_index) {
                slot_listeners_fast_fire_all_slot_listeners_stimulated_by_value(registry, slot_name, slot_index, target_slot_value);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject slot_listeners_fire_all_set_slot_listeners(final SubLObject instance, final SubLObject slot_name, final SubLObject target_slot_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(instance))) {
            Errors.error($str6$Cannot_fire_slot_listeners_of_slo, slot_name, instance);
        }
        final SubLObject registry = slot_listeners_get_registry(instance, $SLOT_SETTER_REGISTRY);
        if (NIL != registry) {
            SubLObject slot_index = NIL;
            final SubLObject v_class = subloop_structures.instance_class(instance);
            final SubLObject association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
            if (NIL != association) {
                slot_index = slots.slot_index(association);
            }
            if (NIL != slot_index) {
                slot_listeners_fast_fire_all_slot_listeners_stimulated_by_value(registry, slot_name, slot_index, target_slot_value);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject slot_listeners_new_slot_listener_internal(final SubLObject slot_listener_registry, final SubLObject new_demon_type, final SubLObject new_slot_name, final SubLObject new_slot_index, final SubLObject new_function, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject new_value_trigger_type, SubLObject low_bound_value_or_values, SubLObject new_upper_bound) {
        if (low_bound_value_or_values == UNPROVIDED) {
            low_bound_value_or_values = NIL;
        }
        if (new_upper_bound == UNPROVIDED) {
            new_upper_bound = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject slot_count = subloop_structures.slr_slot_count(slot_listener_registry);
        final SubLObject listeners_vector = subloop_structures.slr_listeners_vector(slot_listener_registry);
        try {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!new_slot_index.numGE(ZERO_INTEGER)) || (!new_slot_index.numL(slot_count)))) {
                Errors.error($str10$Cannot_add_a_slot_listener_to_ill, new_slot_name, new_target_instance);
            }
            final SubLObject listener_list = aref(listeners_vector, new_slot_index);
            SubLObject redundant_listener = NIL;
            try {
                thread.throwStack.push(SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT);
                SubLObject cdolist_list_var = listener_list;
                SubLObject listener = NIL;
                listener = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject slot_listener = listener;
                    final SubLObject slot_name = subloop_structures.sl_slot_name(slot_listener);
                    final SubLObject demon_type = subloop_structures.sl_demon_type(slot_listener);
                    final SubLObject value_trigger = subloop_structures.sl_value_trigger(slot_listener);
                    final SubLObject functional_type = subloop_structures.sl_functional_type(slot_listener);
                    final SubLObject isa_method = subloop_structures.sl_isa_method(slot_listener);
                    final SubLObject target_instance = subloop_structures.sl_target_instance(slot_listener);
                    if (((slot_name.eql(new_slot_name) && (NIL != (NIL != isa_method ? eq(functional_type, new_method) : eq(functional_type, new_function)))) && target_instance.eql(new_target_instance)) && new_demon_type.eql(demon_type)) {
                        final SubLObject value_trigger_type = slot_listeners_value_trigger_type(value_trigger);
                        if (value_trigger_type.eql(new_value_trigger_type)) {
                            final SubLObject pcase_var = value_trigger_type;
                            if (pcase_var.eql(NIL)) {
                                if (NIL == low_bound_value_or_values) {
                                    sublisp_throw(SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT, T);
                                }
                            } else
                                if (pcase_var.eql($VALUE)) {
                                    if (slot_listeners_value_trigger_value(value_trigger).equal(low_bound_value_or_values)) {
                                        sublisp_throw(SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT, T);
                                    }
                                } else
                                    if (pcase_var.eql($RANGE)) {
                                        thread.resetMultipleValues();
                                        final SubLObject low_bound = slot_listeners_value_trigger_range(value_trigger);
                                        final SubLObject upper_bound = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (low_bound.equal(low_bound_value_or_values) && upper_bound.equal(new_upper_bound)) {
                                            sublisp_throw(SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT, T);
                                        }
                                    } else
                                        if (pcase_var.eql($ENUM)) {
                                            final SubLObject enumeration = slot_listeners_value_trigger_enum(value_trigger);
                                            if ((NIL != set_difference(enumeration, low_bound_value_or_values, symbol_function(EQUAL), UNPROVIDED)) || (NIL != set_difference(low_bound_value_or_values, enumeration, symbol_function(EQUAL), UNPROVIDED))) {
                                                sublisp_throw(SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT, T);
                                            }
                                        }



                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    listener = cdolist_list_var.first();
                } 
            } catch (final Throwable ccatch_env_var) {
                redundant_listener = Errors.handleThrowable(ccatch_env_var, SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL == redundant_listener) {
                final SubLObject slot_listener2;
                final SubLObject new_listener = slot_listener2 = subloop_structures.make_slot_listener(UNPROVIDED);
                SubLObject slot_name2 = subloop_structures.sl_slot_name(slot_listener2);
                SubLObject demon_type2 = subloop_structures.sl_demon_type(slot_listener2);
                SubLObject value_trigger2 = subloop_structures.sl_value_trigger(slot_listener2);
                SubLObject functional_type2 = subloop_structures.sl_functional_type(slot_listener2);
                SubLObject isa_method2 = subloop_structures.sl_isa_method(slot_listener2);
                SubLObject target_instance2 = subloop_structures.sl_target_instance(slot_listener2);
                try {
                    slot_name2 = new_slot_name;
                    demon_type2 = new_demon_type;
                    if (new_value_trigger_type == $RANGE) {
                        value_trigger2 = listS($RANGE, low_bound_value_or_values, new_upper_bound);
                    } else {
                        value_trigger2 = cons(new_value_trigger_type, low_bound_value_or_values);
                    }
                    if (NIL != new_function) {
                        functional_type2 = new_function;
                        isa_method2 = (NIL != target_instance2) ? T : NIL;
                    } else
                        if (NIL != new_method) {
                            functional_type2 = new_method;
                            isa_method2 = T;
                        }

                    target_instance2 = new_target_instance;
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        subloop_structures._csetf_sl_slot_name(slot_listener2, slot_name2);
                        subloop_structures._csetf_sl_demon_type(slot_listener2, demon_type2);
                        subloop_structures._csetf_sl_value_trigger(slot_listener2, value_trigger2);
                        subloop_structures._csetf_sl_functional_type(slot_listener2, functional_type2);
                        subloop_structures._csetf_sl_isa_method(slot_listener2, isa_method2);
                        subloop_structures._csetf_sl_target_instance(slot_listener2, target_instance2);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
                set_aref(listeners_vector, new_slot_index, cons(new_listener, listener_list));
                result = new_listener;
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                subloop_structures._csetf_slr_slot_count(slot_listener_registry, slot_count);
                subloop_structures._csetf_slr_listeners_vector(slot_listener_registry, listeners_vector);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }

    public static SubLObject slot_listeners_new_slot_listener_method_internal(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_demon_type, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject new_value_trigger_type, SubLObject low_bound_value_or_values, SubLObject new_upper_bound) {
        if (low_bound_value_or_values == UNPROVIDED) {
            low_bound_value_or_values = NIL;
        }
        if (new_upper_bound == UNPROVIDED) {
            new_upper_bound = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject slot_index = NIL;
        SubLObject resolved_method = NIL;
        SubLObject v_class = subloop_structures.instance_class(new_instance);
        final SubLObject slot_association = slots.slot_assoc(new_slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
        if (NIL != slot_association) {
            slot_index = slots.slot_index(slot_association);
        }
        v_class = subloop_structures.instance_class(new_target_instance);
        final SubLObject method_association = methods.method_assoc(new_method, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (NIL != method_association) {
            resolved_method = subloop_structures.method_function_name(method_association);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == slot_index)) {
            Errors.error($str12$Cannot_add_listener__S_of_instanc, new SubLObject[]{ new_method, new_target_instance, new_slot_name, new_instance });
        }
        return NIL != resolved_method ? slot_listeners_new_slot_listener_internal(slot_listener_registry, new_demon_type, new_slot_name, slot_index, resolved_method, NIL, new_target_instance, new_value_trigger_type, low_bound_value_or_values, new_upper_bound) : slot_listeners_new_slot_listener_internal(slot_listener_registry, new_demon_type, new_slot_name, slot_index, NIL, new_method, new_target_instance, new_value_trigger_type, low_bound_value_or_values, new_upper_bound);
    }

    public static SubLObject slot_listeners_new_get_slot_listener_method_generic(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, $GET, new_slot_name, new_method, new_target_instance, NIL, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject slot_listeners_new_get_slot_listener_method_by_value(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject target_value) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, $GET, new_slot_name, new_method, new_target_instance, $VALUE, target_value, UNPROVIDED);
    }

    public static SubLObject slot_listeners_new_get_slot_listener_method_by_range(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject target_value_lower_bound, final SubLObject target_value_upper_bound) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, $GET, new_slot_name, new_method, new_target_instance, $RANGE, target_value_lower_bound, target_value_upper_bound);
    }

    public static SubLObject slot_listeners_new_get_slot_listener_method_by_enum(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject target_enumeration) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, $GET, new_slot_name, new_method, new_target_instance, $ENUM, copy_list(target_enumeration), UNPROVIDED);
    }

    public static SubLObject slot_listeners_new_set_slot_listener_method_generic(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, $SET, new_slot_name, new_method, new_target_instance, NIL, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject slot_listeners_new_set_slot_listener_method_by_value(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject target_value) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, $SET, new_slot_name, new_method, new_target_instance, $VALUE, target_value, UNPROVIDED);
    }

    public static SubLObject slot_listeners_new_set_slot_listener_method_by_range(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject target_value_lower_bound, final SubLObject target_value_upper_bound) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, $SET, new_slot_name, new_method, new_target_instance, $RANGE, target_value_lower_bound, target_value_upper_bound);
    }

    public static SubLObject slot_listeners_new_set_slot_listener_method_by_enum(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject target_enumeration) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, $SET, new_slot_name, new_method, new_target_instance, $ENUM, copy_list(target_enumeration), UNPROVIDED);
    }

    public static SubLObject add_generic_slot_listener(final SubLObject instance, final SubLObject slot, final SubLObject type, final SubLObject function_or_method, SubLObject target_instance_if_method) {
        if (target_instance_if_method == UNPROVIDED) {
            target_instance_if_method = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(instance))) {
            Errors.error($str15$Cannot_add_a_slot_listener_to_inv, instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == slot_listeners_valid_demon_type_p(type))) {
            Errors.error($str16$_S_is_not_a_valid_slot_listener_t, type);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!function_or_method.isSymbol())) {
            Errors.error($str17$Slot_listener_functions_and_metho, function_or_method);
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != target_instance_if_method)) && (NIL == subloop_structures.instance_p(target_instance_if_method))) {
            Errors.error($str18$Slot_listener_targets_must_be_val, target_instance_if_method);
        }
        if (type.eql($GET)) {
            SubLObject registry = slot_listeners_get_registry(instance, $SLOT_GETTER_REGISTRY);
            if (NIL == registry) {
                registry = slot_listeners_add_registry(instance, $SLOT_GETTER_REGISTRY);
            }
            return slot_listeners_new_get_slot_listener_method_generic(registry, instance, slot, function_or_method, target_instance_if_method);
        }
        if (type.eql($SET)) {
            SubLObject registry = slot_listeners_get_registry(instance, $SLOT_SETTER_REGISTRY);
            if (NIL == registry) {
                registry = slot_listeners_add_registry(instance, $SLOT_SETTER_REGISTRY);
            }
            return slot_listeners_new_set_slot_listener_method_generic(registry, instance, slot, function_or_method, target_instance_if_method);
        }
        return NIL;
    }

    public static SubLObject add_generic_slot_listener_stimulated_by_value(final SubLObject instance, final SubLObject slot, final SubLObject type, final SubLObject function_or_method, SubLObject target_instance_if_method, SubLObject trigger_value) {
        if (target_instance_if_method == UNPROVIDED) {
            target_instance_if_method = NIL;
        }
        if (trigger_value == UNPROVIDED) {
            trigger_value = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(instance))) {
            Errors.error($str15$Cannot_add_a_slot_listener_to_inv, instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == slot_listeners_valid_demon_type_p(type))) {
            Errors.error($str16$_S_is_not_a_valid_slot_listener_t, type);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!function_or_method.isSymbol())) {
            Errors.error($str17$Slot_listener_functions_and_metho, function_or_method);
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != target_instance_if_method)) && (NIL == subloop_structures.instance_p(target_instance_if_method))) {
            Errors.error($str18$Slot_listener_targets_must_be_val, target_instance_if_method);
        }
        if (type.eql($GET)) {
            SubLObject registry = slot_listeners_get_registry(instance, $SLOT_GETTER_REGISTRY);
            if (NIL == registry) {
                registry = slot_listeners_add_registry(instance, $SLOT_GETTER_REGISTRY);
            }
            return slot_listeners_new_get_slot_listener_method_by_value(registry, instance, slot, function_or_method, target_instance_if_method, trigger_value);
        }
        if (type.eql($SET)) {
            SubLObject registry = slot_listeners_get_registry(instance, $SLOT_SETTER_REGISTRY);
            if (NIL == registry) {
                registry = slot_listeners_add_registry(instance, $SLOT_SETTER_REGISTRY);
            }
            return slot_listeners_new_set_slot_listener_method_by_value(registry, instance, slot, function_or_method, target_instance_if_method, trigger_value);
        }
        return NIL;
    }

    public static SubLObject add_generic_slot_listener_stimulated_by_range(final SubLObject instance, final SubLObject slot, final SubLObject type, final SubLObject function_or_method, SubLObject target_instance_if_method, SubLObject lower_bound, SubLObject upper_bound) {
        if (target_instance_if_method == UNPROVIDED) {
            target_instance_if_method = NIL;
        }
        if (lower_bound == UNPROVIDED) {
            lower_bound = NIL;
        }
        if (upper_bound == UNPROVIDED) {
            upper_bound = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(instance))) {
            Errors.error($str15$Cannot_add_a_slot_listener_to_inv, instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == slot_listeners_valid_demon_type_p(type))) {
            Errors.error($str16$_S_is_not_a_valid_slot_listener_t, type);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!function_or_method.isSymbol())) {
            Errors.error($str17$Slot_listener_functions_and_metho, function_or_method);
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != target_instance_if_method)) && (NIL == subloop_structures.instance_p(target_instance_if_method))) {
            Errors.error($str18$Slot_listener_targets_must_be_val, target_instance_if_method);
        }
        if (type.eql($GET)) {
            SubLObject registry = slot_listeners_get_registry(instance, $SLOT_GETTER_REGISTRY);
            if (NIL == registry) {
                registry = slot_listeners_add_registry(instance, $SLOT_GETTER_REGISTRY);
            }
            return slot_listeners_new_get_slot_listener_method_by_range(registry, instance, slot, function_or_method, target_instance_if_method, lower_bound, upper_bound);
        }
        if (type.eql($SET)) {
            SubLObject registry = slot_listeners_get_registry(instance, $SLOT_SETTER_REGISTRY);
            if (NIL == registry) {
                registry = slot_listeners_add_registry(instance, $SLOT_SETTER_REGISTRY);
            }
            return slot_listeners_new_set_slot_listener_method_by_range(registry, instance, slot, function_or_method, target_instance_if_method, lower_bound, upper_bound);
        }
        return NIL;
    }

    public static SubLObject add_generic_slot_listener_stimulated_by_enum(final SubLObject instance, final SubLObject slot, final SubLObject type, final SubLObject function_or_method, SubLObject target_instance_if_method, SubLObject v_enum) {
        if (target_instance_if_method == UNPROVIDED) {
            target_instance_if_method = NIL;
        }
        if (v_enum == UNPROVIDED) {
            v_enum = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(instance))) {
            Errors.error($str15$Cannot_add_a_slot_listener_to_inv, instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == slot_listeners_valid_demon_type_p(type))) {
            Errors.error($str16$_S_is_not_a_valid_slot_listener_t, type);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!function_or_method.isSymbol())) {
            Errors.error($str17$Slot_listener_functions_and_metho, function_or_method);
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != target_instance_if_method)) && (NIL == subloop_structures.instance_p(target_instance_if_method))) {
            Errors.error($str18$Slot_listener_targets_must_be_val, target_instance_if_method);
        }
        if (type.eql($GET)) {
            SubLObject registry = slot_listeners_get_registry(instance, $SLOT_GETTER_REGISTRY);
            if (NIL == registry) {
                registry = slot_listeners_add_registry(instance, $SLOT_GETTER_REGISTRY);
            }
            return slot_listeners_new_get_slot_listener_method_by_enum(registry, instance, slot, function_or_method, target_instance_if_method, v_enum);
        }
        if (type.eql($SET)) {
            SubLObject registry = slot_listeners_get_registry(instance, $SLOT_SETTER_REGISTRY);
            if (NIL == registry) {
                registry = slot_listeners_add_registry(instance, $SLOT_SETTER_REGISTRY);
            }
            return slot_listeners_new_set_slot_listener_method_by_enum(registry, instance, slot, function_or_method, target_instance_if_method, v_enum);
        }
        return NIL;
    }

    public static SubLObject slot_listeners_before_removal_hook(final SubLObject slot_listener) {
        return NIL;
    }

    public static SubLObject slot_listeners_remove_all_slot_listeners_internal(final SubLObject instance, final SubLObject registry_key) {
        final SubLObject registry = slot_listeners_get_registry(instance, registry_key);
        if (NIL != registry) {
            SubLObject listeners = NIL;
            final SubLObject slot_listener_registry = registry;
            final SubLObject slot_count = subloop_structures.slr_slot_count(slot_listener_registry);
            final SubLObject listeners_vector = subloop_structures.slr_listeners_vector(slot_listener_registry);
            SubLObject index;
            SubLObject cdolist_list_var;
            SubLObject listener;
            for (index = NIL, index = ZERO_INTEGER; index.numL(slot_count); index = add(index, ONE_INTEGER)) {
                listeners = cdolist_list_var = aref(listeners_vector, index);
                listener = NIL;
                listener = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    slot_listeners_before_removal_hook(listener);
                    cdolist_list_var = cdolist_list_var.rest();
                    listener = cdolist_list_var.first();
                } 
                set_aref(listeners_vector, index, NIL);
            }
        }
        return T;
    }

    public static SubLObject slot_listeners_remove_all_slot_listeners_with_target(final SubLObject instance, final SubLObject registry_key, final SubLObject target) {
        final SubLObject registry = slot_listeners_get_registry(instance, registry_key);
        if (NIL != registry) {
            SubLObject matched_listeners = NIL;
            SubLObject not_matched_listeners = NIL;
            final SubLObject slot_listener_registry = registry;
            final SubLObject slot_count = subloop_structures.slr_slot_count(slot_listener_registry);
            final SubLObject listeners_vector = subloop_structures.slr_listeners_vector(slot_listener_registry);
            SubLObject index;
            SubLObject match_list;
            SubLObject not_match_list;
            SubLObject next_cons_var;
            SubLObject sublist;
            SubLObject element;
            SubLObject cdolist_list_var;
            SubLObject listener;
            for (index = NIL, index = ZERO_INTEGER; index.numL(slot_count); index = add(index, ONE_INTEGER)) {
                match_list = NIL;
                not_match_list = NIL;
                next_cons_var = NIL;
                sublist = NIL;
                element = NIL;
                sublist = aref(listeners_vector, index);
                element = sublist.first();
                while (NIL != sublist) {
                    next_cons_var = sublist.rest();
                    if (subloop_structures.sl_target_instance(element).eql(target)) {
                        rplacd(sublist, match_list);
                        match_list = sublist;
                    } else {
                        rplacd(sublist, not_match_list);
                        not_match_list = sublist;
                    }
                    sublist = next_cons_var;
                    element = sublist.first();
                } 
                matched_listeners = nreverse(match_list);
                not_matched_listeners = nreverse(not_match_list);
                set_aref(listeners_vector, index, not_matched_listeners);
                cdolist_list_var = matched_listeners;
                listener = NIL;
                listener = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    slot_listeners_before_removal_hook(listener);
                    cdolist_list_var = cdolist_list_var.rest();
                    listener = cdolist_list_var.first();
                } 
            }
        }
        return T;
    }

    public static SubLObject slot_listeners_remove_all_slot_listeners_with_target_and_slot(final SubLObject instance, final SubLObject registry_key, final SubLObject target, final SubLObject slot) {
        final SubLObject registry = slot_listeners_get_registry(instance, registry_key);
        if (NIL != registry) {
            SubLObject matched_listeners = NIL;
            SubLObject matched_listeners_with_slot = NIL;
            SubLObject matched_listeners_without_slot = NIL;
            SubLObject not_matched_listeners = NIL;
            final SubLObject slot_listener_registry = registry;
            final SubLObject slot_count = subloop_structures.slr_slot_count(slot_listener_registry);
            final SubLObject listeners_vector = subloop_structures.slr_listeners_vector(slot_listener_registry);
            SubLObject index;
            SubLObject match_list;
            SubLObject not_match_list;
            SubLObject next_cons_var;
            SubLObject sublist;
            SubLObject element;
            SubLObject cdolist_list_var;
            SubLObject listener;
            for (index = NIL, index = ZERO_INTEGER; index.numL(slot_count); index = add(index, ONE_INTEGER)) {
                match_list = NIL;
                not_match_list = NIL;
                next_cons_var = NIL;
                sublist = NIL;
                element = NIL;
                sublist = aref(listeners_vector, index);
                element = sublist.first();
                while (NIL != sublist) {
                    next_cons_var = sublist.rest();
                    if (subloop_structures.sl_target_instance(element).eql(target)) {
                        rplacd(sublist, match_list);
                        match_list = sublist;
                    } else {
                        rplacd(sublist, not_match_list);
                        not_match_list = sublist;
                    }
                    sublist = next_cons_var;
                    element = sublist.first();
                } 
                matched_listeners = nreverse(match_list);
                not_matched_listeners = nreverse(not_match_list);
                if (NIL != matched_listeners) {
                    match_list = NIL;
                    not_match_list = NIL;
                    next_cons_var = NIL;
                    sublist = NIL;
                    element = NIL;
                    sublist = matched_listeners;
                    element = sublist.first();
                    while (NIL != sublist) {
                        next_cons_var = sublist.rest();
                        if (subloop_structures.sl_slot_name(element).eql(slot)) {
                            rplacd(sublist, match_list);
                            match_list = sublist;
                        } else {
                            rplacd(sublist, not_match_list);
                            not_match_list = sublist;
                        }
                        sublist = next_cons_var;
                        element = sublist.first();
                    } 
                    matched_listeners_with_slot = nreverse(match_list);
                    matched_listeners_without_slot = nreverse(not_match_list);
                    set_aref(listeners_vector, index, nconc(not_matched_listeners, matched_listeners_without_slot));
                    cdolist_list_var = matched_listeners_with_slot;
                    listener = NIL;
                    listener = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        slot_listeners_before_removal_hook(listener);
                        cdolist_list_var = cdolist_list_var.rest();
                        listener = cdolist_list_var.first();
                    } 
                } else {
                    set_aref(listeners_vector, index, not_matched_listeners);
                }
            }
        }
        return T;
    }

    public static SubLObject slot_listeners_remove_all_slot_listeners(final SubLObject instance, SubLObject target, SubLObject slot) {
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (slot == UNPROVIDED) {
            slot = NIL;
        }
        if (NIL != subloop_structures.instance_p(instance)) {
            if (NIL != target) {
                if (NIL != slot) {
                    slot_listeners_remove_all_slot_listeners_with_target_and_slot(instance, $SLOT_GETTER_REGISTRY, target, slot);
                    slot_listeners_remove_all_slot_listeners_with_target_and_slot(instance, $SLOT_SETTER_REGISTRY, target, slot);
                } else {
                    slot_listeners_remove_all_slot_listeners_with_target(instance, $SLOT_GETTER_REGISTRY, target);
                    slot_listeners_remove_all_slot_listeners_with_target(instance, $SLOT_SETTER_REGISTRY, target);
                }
            } else {
                slot_listeners_remove_all_slot_listeners_internal(instance, $SLOT_GETTER_REGISTRY);
                slot_listeners_remove_all_slot_listeners_internal(instance, $SLOT_SETTER_REGISTRY);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject slot_listeners_remove_all_get_slot_listeners(final SubLObject instance, SubLObject target, SubLObject slot) {
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (slot == UNPROVIDED) {
            slot = NIL;
        }
        if (NIL != subloop_structures.instance_p(instance)) {
            if (NIL != target) {
                if (NIL != slot) {
                    slot_listeners_remove_all_slot_listeners_with_target_and_slot(instance, $SLOT_GETTER_REGISTRY, target, slot);
                } else {
                    slot_listeners_remove_all_slot_listeners_with_target(instance, $SLOT_GETTER_REGISTRY, target);
                }
            } else {
                slot_listeners_remove_all_slot_listeners_internal(instance, $SLOT_GETTER_REGISTRY);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject slot_listeners_remove_all_set_slot_listeners(final SubLObject instance, SubLObject target, SubLObject slot) {
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (slot == UNPROVIDED) {
            slot = NIL;
        }
        if (NIL != subloop_structures.instance_p(instance)) {
            if (NIL != target) {
                if (NIL != slot) {
                    slot_listeners_remove_all_slot_listeners_with_target_and_slot(instance, $SLOT_SETTER_REGISTRY, target, slot);
                } else {
                    slot_listeners_remove_all_slot_listeners_with_target(instance, $SLOT_SETTER_REGISTRY, target);
                }
            } else {
                slot_listeners_remove_all_slot_listeners_internal(instance, $SLOT_SETTER_REGISTRY);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject declare_slot_listeners_file() {
        declareFunction(me, "slot_listeners_valid_slot_trigger_type_p", "SLOT-LISTENERS-VALID-SLOT-TRIGGER-TYPE-P", 1, 0, false);
        declareFunction(me, "slot_listeners_valid_slot_registry_type_p", "SLOT-LISTENERS-VALID-SLOT-REGISTRY-TYPE-P", 1, 0, false);
        declareFunction(me, "slot_listeners_valid_demon_type_p", "SLOT-LISTENERS-VALID-DEMON-TYPE-P", 1, 0, false);
        declareFunction(me, "slot_listeners_add_registry", "SLOT-LISTENERS-ADD-REGISTRY", 2, 0, false);
        declareFunction(me, "slot_listeners_get_registry", "SLOT-LISTENERS-GET-REGISTRY", 2, 0, false);
        declareFunction(me, "slot_listeners_value_trigger_type", "SLOT-LISTENERS-VALUE-TRIGGER-TYPE", 1, 0, false);
        declareFunction(me, "slot_listeners_value_trigger_value", "SLOT-LISTENERS-VALUE-TRIGGER-VALUE", 1, 0, false);
        declareFunction(me, "slot_listeners_value_trigger_range", "SLOT-LISTENERS-VALUE-TRIGGER-RANGE", 1, 0, false);
        declareFunction(me, "slot_listeners_value_trigger_enum", "SLOT-LISTENERS-VALUE-TRIGGER-ENUM", 1, 0, false);
        declareFunction(me, "slot_listeners_slot_listener_match_p", "SLOT-LISTENERS-SLOT-LISTENER-MATCH-P", 3, 0, false);
        declareFunction(me, "slot_listeners_fire_slot_listener", "SLOT-LISTENERS-FIRE-SLOT-LISTENER", 3, 0, false);
        declareFunction(me, "slot_listeners_fast_fire_all_slot_listeners_stimulated_by_value", "SLOT-LISTENERS-FAST-FIRE-ALL-SLOT-LISTENERS-STIMULATED-BY-VALUE", 4, 0, false);
        declareFunction(me, "slot_listeners_fast_fire_all_slot_listeners", "SLOT-LISTENERS-FAST-FIRE-ALL-SLOT-LISTENERS", 5, 0, false);
        declareFunction(me, "slot_listeners_fire_all_get_slot_listeners", "SLOT-LISTENERS-FIRE-ALL-GET-SLOT-LISTENERS", 3, 0, false);
        declareFunction(me, "slot_listeners_fire_all_set_slot_listeners", "SLOT-LISTENERS-FIRE-ALL-SET-SLOT-LISTENERS", 3, 0, false);
        declareFunction(me, "slot_listeners_new_slot_listener_internal", "SLOT-LISTENERS-NEW-SLOT-LISTENER-INTERNAL", 8, 2, false);
        declareFunction(me, "slot_listeners_new_slot_listener_method_internal", "SLOT-LISTENERS-NEW-SLOT-LISTENER-METHOD-INTERNAL", 7, 2, false);
        declareFunction(me, "slot_listeners_new_get_slot_listener_method_generic", "SLOT-LISTENERS-NEW-GET-SLOT-LISTENER-METHOD-GENERIC", 5, 0, false);
        declareFunction(me, "slot_listeners_new_get_slot_listener_method_by_value", "SLOT-LISTENERS-NEW-GET-SLOT-LISTENER-METHOD-BY-VALUE", 6, 0, false);
        declareFunction(me, "slot_listeners_new_get_slot_listener_method_by_range", "SLOT-LISTENERS-NEW-GET-SLOT-LISTENER-METHOD-BY-RANGE", 7, 0, false);
        declareFunction(me, "slot_listeners_new_get_slot_listener_method_by_enum", "SLOT-LISTENERS-NEW-GET-SLOT-LISTENER-METHOD-BY-ENUM", 6, 0, false);
        declareFunction(me, "slot_listeners_new_set_slot_listener_method_generic", "SLOT-LISTENERS-NEW-SET-SLOT-LISTENER-METHOD-GENERIC", 5, 0, false);
        declareFunction(me, "slot_listeners_new_set_slot_listener_method_by_value", "SLOT-LISTENERS-NEW-SET-SLOT-LISTENER-METHOD-BY-VALUE", 6, 0, false);
        declareFunction(me, "slot_listeners_new_set_slot_listener_method_by_range", "SLOT-LISTENERS-NEW-SET-SLOT-LISTENER-METHOD-BY-RANGE", 7, 0, false);
        declareFunction(me, "slot_listeners_new_set_slot_listener_method_by_enum", "SLOT-LISTENERS-NEW-SET-SLOT-LISTENER-METHOD-BY-ENUM", 6, 0, false);
        declareFunction(me, "add_generic_slot_listener", "ADD-GENERIC-SLOT-LISTENER", 4, 1, false);
        declareFunction(me, "add_generic_slot_listener_stimulated_by_value", "ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-VALUE", 4, 2, false);
        declareFunction(me, "add_generic_slot_listener_stimulated_by_range", "ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-RANGE", 4, 3, false);
        declareFunction(me, "add_generic_slot_listener_stimulated_by_enum", "ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-ENUM", 4, 2, false);
        declareFunction(me, "slot_listeners_before_removal_hook", "SLOT-LISTENERS-BEFORE-REMOVAL-HOOK", 1, 0, false);
        declareFunction(me, "slot_listeners_remove_all_slot_listeners_internal", "SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS-INTERNAL", 2, 0, false);
        declareFunction(me, "slot_listeners_remove_all_slot_listeners_with_target", "SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS-WITH-TARGET", 3, 0, false);
        declareFunction(me, "slot_listeners_remove_all_slot_listeners_with_target_and_slot", "SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS-WITH-TARGET-AND-SLOT", 4, 0, false);
        declareFunction(me, "slot_listeners_remove_all_slot_listeners", "SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS", 1, 2, false);
        declareFunction(me, "slot_listeners_remove_all_get_slot_listeners", "SLOT-LISTENERS-REMOVE-ALL-GET-SLOT-LISTENERS", 1, 2, false);
        declareFunction(me, "slot_listeners_remove_all_set_slot_listeners", "SLOT-LISTENERS-REMOVE-ALL-SET-SLOT-LISTENERS", 1, 2, false);
        return NIL;
    }

    public static SubLObject init_slot_listeners_file() {
        defparameter("*SLOT-LISTENERS-SLOT-TRIGGER-TYPES*", $list0);
        defparameter("*SLOT-LISTENERS-REGISTRY-TYPES*", $list1);
        defparameter("*SLOT-LISTENERS-VALID-DEMON-TYPES*", $list2);
        defparameter("*ACTIVE-SLOT-LISTENER*", NIL);
        return NIL;
    }

    public static SubLObject setup_slot_listeners_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_slot_listeners_file();
    }

    @Override
    public void initializeVariables() {
        init_slot_listeners_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_slot_listeners_file();
    }

    static {
























    }
}

/**
 * Total time: 297 ms
 */
