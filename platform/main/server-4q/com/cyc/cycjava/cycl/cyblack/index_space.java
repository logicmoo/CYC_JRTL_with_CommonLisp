/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.method_listeners;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.object_monitor;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      INDEX-SPACE
 *  source file: /cyc/top/cycl/cyblack/index-space.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class index_space extends SubLTranslatedFile implements V02 {
    // // Constructor
    private index_space() {
    }

    public static final SubLFile me = new index_space();


    // // Definitions
    // defconstant
    public static final SubLSymbol $index_space_initial_storage_size$ = makeSymbol("*INDEX-SPACE-INITIAL-STORAGE-SIZE*");

    public static final SubLObject spatial_index_p(SubLObject spatial_index) {
        return interfaces.subloop_instanceof_interface(spatial_index, SPATIAL_INDEX);
    }

    public static final SubLObject indexed_space_p(SubLObject indexed_space) {
        return interfaces.subloop_instanceof_interface(indexed_space, INDEXED_SPACE);
    }

    public static final SubLObject spatial_element_p(SubLObject spatial_element) {
        return interfaces.subloop_instanceof_interface(spatial_element, SPATIAL_ELEMENT);
    }

    public static final SubLObject spatial_slice_p(SubLObject spatial_slice) {
        return interfaces.subloop_instanceof_interface(spatial_slice, SPATIAL_SLICE);
    }

    public static final SubLObject get_sparse_spatial_index_parent_slices(SubLObject sparse_spatial_index) {
        return classes.subloop_get_instance_slot(sparse_spatial_index, TWO_INTEGER);
    }

    public static final SubLObject set_sparse_spatial_index_parent_slices(SubLObject sparse_spatial_index, SubLObject value) {
        return classes.subloop_set_instance_slot(sparse_spatial_index, value, TWO_INTEGER);
    }

    public static final SubLObject get_sparse_spatial_index_index_value(SubLObject sparse_spatial_index) {
        return classes.subloop_get_access_protected_instance_slot(sparse_spatial_index, ONE_INTEGER, INDEX_VALUE);
    }

    public static final SubLObject set_sparse_spatial_index_index_value(SubLObject sparse_spatial_index, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sparse_spatial_index, value, ONE_INTEGER, INDEX_VALUE);
    }

    public static final SubLObject get_sparse_spatial_index_last_allocated_index(SubLObject sparse_spatial_index) {
        {
            SubLObject v_class = (sparse_spatial_index.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(sparse_spatial_index))) : NIL != subloop_structures.class_p(sparse_spatial_index) ? ((SubLObject) (sparse_spatial_index)) : NIL != subloop_structures.instance_p(sparse_spatial_index) ? ((SubLObject) (subloop_structures.instance_class(sparse_spatial_index))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LAST_ALLOCATED_INDEX, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_sparse_spatial_index_last_allocated_index(SubLObject sparse_spatial_index, SubLObject value) {
        {
            SubLObject v_class = (sparse_spatial_index.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(sparse_spatial_index))) : NIL != subloop_structures.class_p(sparse_spatial_index) ? ((SubLObject) (sparse_spatial_index)) : NIL != subloop_structures.instance_p(sparse_spatial_index) ? ((SubLObject) (subloop_structures.instance_class(sparse_spatial_index))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LAST_ALLOCATED_INDEX, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_sparse_spatial_index_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_INDEX, LAST_ALLOCATED_INDEX, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_sparse_spatial_index_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_INDEX, INDEX_VALUE, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_INDEX, PARENT_SLICES, NIL);
        return NIL;
    }

    public static final SubLObject sparse_spatial_index_p(SubLObject sparse_spatial_index) {
        return classes.subloop_instanceof_class(sparse_spatial_index, SPARSE_SPATIAL_INDEX);
    }

    public static final SubLObject get_sparse_index_space_root_slices(SubLObject sparse_index_space) {
        return classes.subloop_get_access_protected_instance_slot(sparse_index_space, ONE_INTEGER, ROOT_SLICES);
    }

    public static final SubLObject set_sparse_index_space_root_slices(SubLObject sparse_index_space, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sparse_index_space, value, ONE_INTEGER, ROOT_SLICES);
    }

    public static final SubLObject subloop_reserved_initialize_sparse_index_space_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_sparse_index_space_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_INDEX_SPACE, ROOT_SLICES, NIL);
        return NIL;
    }

    public static final SubLObject sparse_index_space_p(SubLObject sparse_index_space) {
        return classes.subloop_instanceof_class(sparse_index_space, SPARSE_INDEX_SPACE);
    }

    public static final SubLObject get_sparse_spatial_element_parent_slice(SubLObject sparse_spatial_element) {
        return classes.subloop_get_access_protected_instance_slot(sparse_spatial_element, TWO_INTEGER, PARENT_SLICE);
    }

    public static final SubLObject set_sparse_spatial_element_parent_slice(SubLObject sparse_spatial_element, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sparse_spatial_element, value, TWO_INTEGER, PARENT_SLICE);
    }

    public static final SubLObject get_sparse_spatial_element_space(SubLObject sparse_spatial_element) {
        return classes.subloop_get_access_protected_instance_slot(sparse_spatial_element, ONE_INTEGER, SPACE);
    }

    public static final SubLObject set_sparse_spatial_element_space(SubLObject sparse_spatial_element, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sparse_spatial_element, value, ONE_INTEGER, SPACE);
    }

    public static final SubLObject get_sparse_spatial_element_removing_self(SubLObject sparse_spatial_element) {
        {
            SubLObject v_class = subloop_structures.instance_class(sparse_spatial_element);
            SubLObject slot = slots.slot_assoc(REMOVING_SELF, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, sparse_spatial_element, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(sparse_spatial_element));
    }

    public static final SubLObject set_sparse_spatial_element_removing_self(SubLObject sparse_spatial_element, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(sparse_spatial_element);
            SubLObject slot = slots.slot_assoc(REMOVING_SELF, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, sparse_spatial_element, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(sparse_spatial_element, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(sparse_spatial_element)));
        return value;
    }

    public static final SubLObject subloop_reserved_initialize_sparse_spatial_element_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_sparse_spatial_element_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_ELEMENT, REMOVING_SELF, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_ELEMENT, SPACE, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_ELEMENT, PARENT_SLICE, NIL);
        return NIL;
    }

    public static final SubLObject sparse_spatial_element_p(SubLObject sparse_spatial_element) {
        return classes.subloop_instanceof_class(sparse_spatial_element, SPARSE_SPATIAL_ELEMENT);
    }

    public static final SubLObject get_sparse_spatial_slice_storage(SubLObject sparse_spatial_slice) {
        return classes.subloop_get_access_protected_instance_slot(sparse_spatial_slice, FOUR_INTEGER, STORAGE);
    }

    public static final SubLObject set_sparse_spatial_slice_storage(SubLObject sparse_spatial_slice, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sparse_spatial_slice, value, FOUR_INTEGER, STORAGE);
    }

    public static final SubLObject get_sparse_spatial_slice_ordered_sub_slices(SubLObject sparse_spatial_slice) {
        return classes.subloop_get_access_protected_instance_slot(sparse_spatial_slice, THREE_INTEGER, ORDERED_SUB_SLICES);
    }

    public static final SubLObject set_sparse_spatial_slice_ordered_sub_slices(SubLObject sparse_spatial_slice, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sparse_spatial_slice, value, THREE_INTEGER, ORDERED_SUB_SLICES);
    }

    public static final SubLObject get_sparse_spatial_slice_parent_slice(SubLObject sparse_spatial_slice) {
        return classes.subloop_get_instance_slot(sparse_spatial_slice, TWO_INTEGER);
    }

    public static final SubLObject set_sparse_spatial_slice_parent_slice(SubLObject sparse_spatial_slice, SubLObject value) {
        return classes.subloop_set_instance_slot(sparse_spatial_slice, value, TWO_INTEGER);
    }

    public static final SubLObject get_sparse_spatial_slice_spatial_index(SubLObject sparse_spatial_slice) {
        return classes.subloop_get_instance_slot(sparse_spatial_slice, ONE_INTEGER);
    }

    public static final SubLObject set_sparse_spatial_slice_spatial_index(SubLObject sparse_spatial_slice, SubLObject value) {
        return classes.subloop_set_instance_slot(sparse_spatial_slice, value, ONE_INTEGER);
    }

    public static final SubLObject subloop_reserved_initialize_sparse_spatial_slice_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_sparse_spatial_slice_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_SLICE, SPATIAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_SLICE, PARENT_SLICE, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_SLICE, ORDERED_SUB_SLICES, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_SLICE, STORAGE, NIL);
        return NIL;
    }

    public static final SubLObject sparse_spatial_slice_p(SubLObject sparse_spatial_slice) {
        return classes.subloop_instanceof_class(sparse_spatial_slice, SPARSE_SPATIAL_SLICE);
    }

    public static final SubLObject sparse_spatial_index_allocate_ordered_indices_method(SubLObject self, SubLObject count) {
        {
            SubLObject indices = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                indices = cons(object.object_new_method(self), indices);
            }
            return nreverse(indices);
        }
    }

    public static final SubLObject sparse_spatial_index_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_sparse_spatial_index_method = NIL;
            SubLObject listed_args = NIL;
            SubLObject last_allocated_index = get_sparse_spatial_index_last_allocated_index(self);
            SubLObject parent_slices = get_sparse_spatial_index_parent_slices(self);
            SubLObject index_value = get_sparse_spatial_index_index_value(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(INITIALIZE, self, listed_args);
                    if (NIL == last_allocated_index) {
                        last_allocated_index = ZERO_INTEGER;
                    } else {
                        last_allocated_index = add(last_allocated_index, ONE_INTEGER);
                    }
                    index_value = last_allocated_index;
                    parent_slices = NIL;
                    sublisp_throw($sym51$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_index_last_allocated_index(self, last_allocated_index);
                            set_sparse_spatial_index_parent_slices(self, parent_slices);
                            set_sparse_spatial_index_index_value(self, index_value);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_index_method = Errors.handleThrowable(ccatch_env_var, $sym51$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(INITIALIZE, self, listed_args, catch_var_for_sparse_spatial_index_method);
            return catch_var_for_sparse_spatial_index_method;
        }
    }

    public static final SubLObject sparse_spatial_index_set_index_value_method(SubLObject self, SubLObject new_index_value) {
        {
            SubLObject catch_var_for_sparse_spatial_index_method = NIL;
            SubLObject listed_args = list(new_index_value);
            SubLObject index_value = get_sparse_spatial_index_index_value(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(SET_INDEX_VALUE, self, listed_args);
                    index_value = new_index_value;
                    sublisp_throw($sym57$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD, new_index_value);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_index_index_value(self, index_value);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_index_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(SET_INDEX_VALUE, self, listed_args, catch_var_for_sparse_spatial_index_method);
            return catch_var_for_sparse_spatial_index_method;
        }
    }

    public static final SubLObject sparse_spatial_index_equal_p_method(SubLObject self, SubLObject other_index) {
        {
            SubLObject catch_var_for_sparse_spatial_index_method = NIL;
            SubLObject listed_args = list(other_index);
            SubLObject index_value = get_sparse_spatial_index_index_value(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(EQUAL_P, self, listed_args);
                    sublisp_throw($sym62$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD, numE(index_value, get_sparse_spatial_index_index_value(other_index)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_index_index_value(self, index_value);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_index_method = Errors.handleThrowable(ccatch_env_var, $sym62$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(EQUAL_P, self, listed_args, catch_var_for_sparse_spatial_index_method);
            return catch_var_for_sparse_spatial_index_method;
        }
    }

    public static final SubLObject sparse_spatial_index_less_p_method(SubLObject self, SubLObject other_index) {
        {
            SubLObject catch_var_for_sparse_spatial_index_method = NIL;
            SubLObject listed_args = list(other_index);
            SubLObject index_value = get_sparse_spatial_index_index_value(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(LESS_P, self, listed_args);
                    sublisp_throw($sym66$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD, numL(index_value, get_sparse_spatial_index_index_value(other_index)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_index_index_value(self, index_value);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_index_method = Errors.handleThrowable(ccatch_env_var, $sym66$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(LESS_P, self, listed_args, catch_var_for_sparse_spatial_index_method);
            return catch_var_for_sparse_spatial_index_method;
        }
    }

    public static final SubLObject sparse_spatial_index_greater_p_method(SubLObject self, SubLObject other_index) {
        {
            SubLObject catch_var_for_sparse_spatial_index_method = NIL;
            SubLObject listed_args = list(other_index);
            SubLObject index_value = get_sparse_spatial_index_index_value(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(GREATER_P, self, listed_args);
                    sublisp_throw($sym70$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD, numG(index_value, get_sparse_spatial_index_index_value(other_index)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_index_index_value(self, index_value);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_index_method = Errors.handleThrowable(ccatch_env_var, $sym70$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(GREATER_P, self, listed_args, catch_var_for_sparse_spatial_index_method);
            return catch_var_for_sparse_spatial_index_method;
        }
    }

    public static final SubLObject sparse_spatial_index_register_parent_slice_method(SubLObject self, SubLObject new_parent_slice) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_sparse_spatial_index_method = NIL;
                SubLObject listed_args = list(new_parent_slice);
                SubLObject parent_slices = get_sparse_spatial_index_parent_slices(self);
                try {
                    try {
                        method_listeners.method_listeners_invoke_before_listeners(REGISTER_PARENT_SLICE, self, listed_args);
                        if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                            format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt76$__PARENT_SLICES_____S, parent_slices);
                        }
                        if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                            format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt77$__NEW_PARENT_SLICE_____S, new_parent_slice);
                        }
                        if (NIL == subl_promotions.memberP(new_parent_slice, parent_slices, UNPROVIDED, UNPROVIDED)) {
                            parent_slices = cons(new_parent_slice, parent_slices);
                        }
                        sublisp_throw($sym75$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD, new_parent_slice);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_sparse_spatial_index_parent_slices(self, parent_slices);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_sparse_spatial_index_method = Errors.handleThrowable(ccatch_env_var, $sym75$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD);
                }
                method_listeners.method_listeners_invoke_after_listeners(REGISTER_PARENT_SLICE, self, listed_args, catch_var_for_sparse_spatial_index_method);
                return catch_var_for_sparse_spatial_index_method;
            }
        }
    }

    public static final SubLObject sparse_index_space_set_indices_method(SubLObject self, SubLObject indices, SubLObject order_as_sequenced) {
        if (order_as_sequenced == UNPROVIDED) {
            order_as_sequenced = T;
        }
        {
            SubLObject catch_var_for_sparse_index_space_method = NIL;
            SubLObject listed_args = list(indices, order_as_sequenced);
            SubLObject root_slices = get_sparse_index_space_root_slices(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(SET_INDICES, self, listed_args);
                    if (NIL != order_as_sequenced) {
                        {
                            SubLObject count = ZERO_INTEGER;
                            SubLObject cdolist_list_var = indices;
                            SubLObject index = NIL;
                            for (index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index = cdolist_list_var.first()) {
                                sparse_spatial_index_set_index_value_method(index, count);
                                count = add(count, ONE_INTEGER);
                            }
                        }
                    }
                    {
                        SubLObject ordered_indices = (NIL != order_as_sequenced) ? ((SubLObject) (indices)) : sparse_index_space_order_indices_method(self, indices);
                        SubLObject new_slice = NIL;
                        root_slices = NIL;
                        {
                            SubLObject cdolist_list_var = ordered_indices;
                            SubLObject index = NIL;
                            for (index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index = cdolist_list_var.first()) {
                                new_slice = object.object_new_method(SPARSE_SPATIAL_SLICE);
                                set_sparse_spatial_slice_parent_slice(new_slice, self);
                                sparse_spatial_slice_set_spatial_index_method(new_slice, index);
                                root_slices = cons(new_slice, root_slices);
                            }
                        }
                        root_slices = nreverse(root_slices);
                        sublisp_throw($sym82$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD, ordered_indices);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_index_space_root_slices(self, root_slices);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_index_space_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(SET_INDICES, self, listed_args, catch_var_for_sparse_index_space_method);
            return catch_var_for_sparse_index_space_method;
        }
    }

    public static final SubLObject sparse_index_space_get_indices_method(SubLObject self) {
        {
            SubLObject catch_var_for_sparse_index_space_method = NIL;
            SubLObject listed_args = NIL;
            SubLObject root_slices = get_sparse_index_space_root_slices(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(GET_INDICES, self, listed_args);
                    {
                        SubLObject indices = NIL;
                        SubLObject cdolist_list_var = root_slices;
                        SubLObject slice = NIL;
                        for (slice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slice = cdolist_list_var.first()) {
                            indices = cons(get_sparse_spatial_slice_spatial_index(slice), indices);
                        }
                        sublisp_throw($sym86$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD, nreverse(indices));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_index_space_root_slices(self, root_slices);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_index_space_method = Errors.handleThrowable(ccatch_env_var, $sym86$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(GET_INDICES, self, listed_args, catch_var_for_sparse_index_space_method);
            return catch_var_for_sparse_index_space_method;
        }
    }

    public static final SubLObject sparse_index_space_order_indices_method(SubLObject self, SubLObject indices) {
        {
            SubLObject catch_var_for_sparse_index_space_method = NIL;
            SubLObject listed_args = list(indices);
            try {
                method_listeners.method_listeners_invoke_before_listeners(ORDER_INDICES, self, listed_args);
                sublisp_throw($sym91$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD, Sort.sort(indices, SPARSE_SPATIAL_INDEX_LESS_P_METHOD, UNPROVIDED));
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_index_space_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(ORDER_INDICES, self, listed_args, catch_var_for_sparse_index_space_method);
            return catch_var_for_sparse_index_space_method;
        }
    }

    public static final SubLObject sparse_index_space_add_at_coordinate_method(SubLObject self, SubLObject indices, SubLObject spatial_element) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_sparse_index_space_method = NIL;
                SubLObject listed_args = list(indices, spatial_element);
                SubLObject root_slices = get_sparse_index_space_root_slices(self);
                try {
                    try {
                        method_listeners.method_listeners_invoke_before_listeners(ADD_AT_COORDINATE, self, listed_args);
                        if ((NIL != indices) && (NIL != spatial_element)) {
                            {
                                SubLObject ordered_indices = sparse_index_space_order_indices_method(self, indices);
                                SubLObject first_index = ordered_indices.first();
                                SubLObject cdolist_list_var = root_slices;
                                SubLObject slice = NIL;
                                for (slice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slice = cdolist_list_var.first()) {
                                    if (NIL != sparse_spatial_index_equal_p_method(get_sparse_spatial_slice_spatial_index(slice), first_index)) {
                                        if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                                            format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt97$__ADDING_SPATIAL_ELEMENT_);
                                        }
                                        sublisp_throw($sym96$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD, sparse_spatial_slice_add_spatial_element_method(slice, ordered_indices, slice));
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym96$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_sparse_index_space_root_slices(self, root_slices);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_sparse_index_space_method = Errors.handleThrowable(ccatch_env_var, $sym96$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD);
                }
                method_listeners.method_listeners_invoke_after_listeners(ADD_AT_COORDINATE, self, listed_args, catch_var_for_sparse_index_space_method);
                return catch_var_for_sparse_index_space_method;
            }
        }
    }

    public static final SubLObject sparse_index_space_get_at_coordinate_method(SubLObject self, SubLObject indices, SubLObject spatial_element) {
        {
            SubLObject catch_var_for_sparse_index_space_method = NIL;
            SubLObject listed_args = list(indices, spatial_element);
            SubLObject root_slices = get_sparse_index_space_root_slices(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(GET_AT_COORDINATE, self, listed_args);
                    if ((NIL != indices) && (NIL != spatial_element)) {
                        {
                            SubLObject ordered_indices = sparse_index_space_order_indices_method(self, indices);
                            SubLObject first_index = ordered_indices.first();
                            SubLObject cdolist_list_var = root_slices;
                            SubLObject slice = NIL;
                            for (slice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slice = cdolist_list_var.first()) {
                                if (NIL != sparse_spatial_index_equal_p_method(get_sparse_spatial_slice_spatial_index(slice), first_index)) {
                                    sublisp_throw($sym101$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD, sparse_spatial_slice_get_spatial_elements_method(slice, ordered_indices));
                                }
                            }
                        }
                    }
                    sublisp_throw($sym101$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_index_space_root_slices(self, root_slices);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_index_space_method = Errors.handleThrowable(ccatch_env_var, $sym101$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(GET_AT_COORDINATE, self, listed_args, catch_var_for_sparse_index_space_method);
            return catch_var_for_sparse_index_space_method;
        }
    }

    public static final SubLObject sparse_index_space_clear_at_coordinate_method(SubLObject self, SubLObject indices) {
        {
            SubLObject catch_var_for_sparse_index_space_method = NIL;
            SubLObject listed_args = list(indices);
            SubLObject root_slices = get_sparse_index_space_root_slices(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(CLEAR_AT_COORDINATE, self, listed_args);
                    if (NIL != indices) {
                        {
                            SubLObject ordered_indices = sparse_index_space_order_indices_method(self, indices);
                            SubLObject first_index = ordered_indices.first();
                            SubLObject cdolist_list_var = root_slices;
                            SubLObject slice = NIL;
                            for (slice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slice = cdolist_list_var.first()) {
                                if (NIL != sparse_spatial_index_equal_p_method(get_sparse_spatial_slice_spatial_index(slice), first_index)) {
                                    sparse_spatial_slice_clear_method(slice, indices);
                                }
                            }
                        }
                    }
                    sublisp_throw($sym105$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_index_space_root_slices(self, root_slices);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_index_space_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(CLEAR_AT_COORDINATE, self, listed_args, catch_var_for_sparse_index_space_method);
            return catch_var_for_sparse_index_space_method;
        }
    }

    public static final SubLObject sparse_index_space_display_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_sparse_index_space_method = NIL;
            SubLObject root_slices = get_sparse_index_space_root_slices(self);
            try {
                try {
                    format(stream, $str_alt112$__Root_Slices___S, root_slices);
                    {
                        SubLObject cdolist_list_var = root_slices;
                        SubLObject root_slice = NIL;
                        for (root_slice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , root_slice = cdolist_list_var.first()) {
                            sparse_spatial_slice_display_method(root_slice, stream);
                        }
                    }
                    sublisp_throw($sym111$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_index_space_root_slices(self, root_slices);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_index_space_method = Errors.handleThrowable(ccatch_env_var, $sym111$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD);
            }
            return catch_var_for_sparse_index_space_method;
        }
    }

    public static final SubLObject sparse_spatial_element_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_sparse_spatial_element_method = NIL;
            SubLObject listed_args = NIL;
            SubLObject parent_slice = get_sparse_spatial_element_parent_slice(self);
            SubLObject space = get_sparse_spatial_element_space(self);
            SubLObject removing_self = get_sparse_spatial_element_removing_self(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(INITIALIZE, self, listed_args);
                    removing_self = NIL;
                    space = NIL;
                    parent_slice = NIL;
                    sublisp_throw($sym115$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_element_parent_slice(self, parent_slice);
                            set_sparse_spatial_element_space(self, space);
                            set_sparse_spatial_element_removing_self(self, removing_self);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_element_method = Errors.handleThrowable(ccatch_env_var, $sym115$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(INITIALIZE, self, listed_args, catch_var_for_sparse_spatial_element_method);
            return catch_var_for_sparse_spatial_element_method;
        }
    }

    public static final SubLObject sparse_spatial_element_set_parent_slice_method(SubLObject self, SubLObject new_parent_slice) {
        {
            SubLObject catch_var_for_sparse_spatial_element_method = NIL;
            SubLObject listed_args = list(new_parent_slice);
            SubLObject parent_slice = get_sparse_spatial_element_parent_slice(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(SET_PARENT_SLICE, self, listed_args);
                    if (NIL != parent_slice) {
                        sparse_spatial_element_remove_from_indexed_space_method(self);
                    }
                    parent_slice = new_parent_slice;
                    sublisp_throw($sym119$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD, new_parent_slice);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_element_parent_slice(self, parent_slice);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_element_method = Errors.handleThrowable(ccatch_env_var, $sym119$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(SET_PARENT_SLICE, self, listed_args, catch_var_for_sparse_spatial_element_method);
            return catch_var_for_sparse_spatial_element_method;
        }
    }

    public static final SubLObject sparse_spatial_element_get_indices_method(SubLObject self) {
        {
            SubLObject catch_var_for_sparse_spatial_element_method = NIL;
            SubLObject listed_args = NIL;
            SubLObject parent_slice = get_sparse_spatial_element_parent_slice(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(GET_INDICES, self, listed_args);
                    {
                        SubLObject indices = NIL;
                        SubLObject current_parent = parent_slice;
                        while (NIL != current_parent) {
                            indices = cons(get_sparse_spatial_slice_spatial_index(current_parent), indices);
                            current_parent = get_sparse_spatial_slice_parent_slice(current_parent);
                        } 
                        sublisp_throw($sym122$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD, indices);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_element_parent_slice(self, parent_slice);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_element_method = Errors.handleThrowable(ccatch_env_var, $sym122$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(GET_INDICES, self, listed_args, catch_var_for_sparse_spatial_element_method);
            return catch_var_for_sparse_spatial_element_method;
        }
    }

    public static final SubLObject sparse_spatial_element_has_index_p_method(SubLObject self, SubLObject spatial_index) {
        {
            SubLObject catch_var_for_sparse_spatial_element_method = NIL;
            SubLObject listed_args = list(spatial_index);
            SubLObject parent_slice = get_sparse_spatial_element_parent_slice(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(HAS_INDEX_P, self, listed_args);
                    {
                        SubLObject current_parent = parent_slice;
                        while (NIL != current_parent) {
                            if (NIL != sparse_spatial_index_equal_p_method(get_sparse_spatial_slice_parent_slice(current_parent), spatial_index)) {
                                sublisp_throw($sym126$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD, T);
                            }
                            current_parent = get_sparse_spatial_slice_parent_slice(current_parent);
                        } 
                        sublisp_throw($sym126$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_element_parent_slice(self, parent_slice);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_element_method = Errors.handleThrowable(ccatch_env_var, $sym126$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(HAS_INDEX_P, self, listed_args, catch_var_for_sparse_spatial_element_method);
            return catch_var_for_sparse_spatial_element_method;
        }
    }

    public static final SubLObject sparse_spatial_element_remove_from_indexed_space_method(SubLObject self) {
        {
            SubLObject catch_var_for_sparse_spatial_element_method = NIL;
            SubLObject listed_args = NIL;
            SubLObject parent_slice = get_sparse_spatial_element_parent_slice(self);
            SubLObject removing_self = get_sparse_spatial_element_removing_self(self);
            try {
                method_listeners.method_listeners_invoke_before_listeners(REMOVE_FROM_INDEXED_SPACE, self, listed_args);
                if (NIL == removing_self) {
                    removing_self = T;
                    set_sparse_spatial_element_removing_self(self, removing_self);
                    if (NIL != parent_slice) {
                        sparse_spatial_slice_remove_spatial_element_method(parent_slice, self);
                    }
                    removing_self = NIL;
                    set_sparse_spatial_element_removing_self(self, removing_self);
                }
                parent_slice = NIL;
                set_sparse_spatial_element_parent_slice(self, parent_slice);
                sublisp_throw($sym131$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD, self);
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_element_method = Errors.handleThrowable(ccatch_env_var, $sym131$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(REMOVE_FROM_INDEXED_SPACE, self, listed_args, catch_var_for_sparse_spatial_element_method);
            return catch_var_for_sparse_spatial_element_method;
        }
    }

    public static final SubLObject sparse_spatial_slice_set_spatial_index_method(SubLObject self, SubLObject new_spatial_index) {
        {
            SubLObject catch_var_for_sparse_spatial_slice_method = NIL;
            SubLObject listed_args = list(new_spatial_index);
            SubLObject spatial_index = get_sparse_spatial_slice_spatial_index(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(SET_SPATIAL_INDEX, self, listed_args);
                    spatial_index = new_spatial_index;
                    sparse_spatial_index_register_parent_slice_method(new_spatial_index, self);
                    sublisp_throw($sym136$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, new_spatial_index);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_slice_spatial_index(self, spatial_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_slice_method = Errors.handleThrowable(ccatch_env_var, $sym136$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(SET_SPATIAL_INDEX, self, listed_args, catch_var_for_sparse_spatial_slice_method);
            return catch_var_for_sparse_spatial_slice_method;
        }
    }

    public static final SubLObject sparse_spatial_slice_get_spatial_index_method(SubLObject self) {
        {
            SubLObject catch_var_for_sparse_spatial_slice_method = NIL;
            SubLObject listed_args = NIL;
            SubLObject spatial_index = get_sparse_spatial_slice_spatial_index(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(GET_SPATIAL_INDEX, self, listed_args);
                    sublisp_throw($sym140$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, spatial_index);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_slice_spatial_index(self, spatial_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_slice_method = Errors.handleThrowable(ccatch_env_var, $sym140$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(GET_SPATIAL_INDEX, self, listed_args, catch_var_for_sparse_spatial_slice_method);
            return catch_var_for_sparse_spatial_slice_method;
        }
    }

    public static final SubLObject sparse_spatial_slice_add_spatial_element_method(SubLObject self, SubLObject indices, SubLObject spatial_element) {
        {
            SubLObject catch_var_for_sparse_spatial_slice_method = NIL;
            SubLObject listed_args = list(indices, spatial_element);
            SubLObject storage = get_sparse_spatial_slice_storage(self);
            SubLObject ordered_sub_slices = get_sparse_spatial_slice_ordered_sub_slices(self);
            SubLObject spatial_index = get_sparse_spatial_slice_spatial_index(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(ADD_SPATIAL_ELEMENT, self, listed_args);
                    if (indices.isCons()) {
                        {
                            SubLObject first_index = indices.first();
                            if (NIL != sparse_spatial_index_equal_p_method(spatial_index, first_index)) {
                                {
                                    SubLObject sub_indices = indices.rest();
                                    if (NIL == sub_indices) {
                                        if (NIL == storage) {
                                            storage = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                                            dictionary.dictionary_enter(storage, spatial_element, T);
                                            sparse_spatial_element_set_parent_slice_method(spatial_element, self);
                                            sublisp_throw($sym144$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, spatial_element);
                                        } else {
                                            dictionary.dictionary_enter(storage, spatial_element, T);
                                            sparse_spatial_element_set_parent_slice_method(spatial_element, self);
                                            sublisp_throw($sym144$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, spatial_element);
                                        }
                                    } else {
                                        {
                                            SubLObject second_index = sub_indices.first();
                                            if (NIL != ordered_sub_slices) {
                                                {
                                                    SubLObject current_sub_slice = ordered_sub_slices.first();
                                                    SubLObject current_index = get_sparse_spatial_slice_spatial_index(current_sub_slice);
                                                    if (NIL != sparse_spatial_index_equal_p_method(second_index, current_index)) {
                                                        sparse_spatial_slice_add_spatial_element_method(current_sub_slice, sub_indices, spatial_element);
                                                    } else {
                                                        {
                                                            SubLObject previous_cons = ordered_sub_slices;
                                                            SubLObject current_sublist = ordered_sub_slices.rest();
                                                            while (NIL != current_sublist) {
                                                                current_index = get_sparse_spatial_slice_spatial_index(current_sublist.first());
                                                                if (NIL != sparse_spatial_index_less_p_method(second_index, current_index)) {
                                                                    previous_cons = current_sublist;
                                                                    current_sublist = current_sublist.rest();
                                                                } else {
                                                                    {
                                                                        SubLObject new_slice = object.object_new_method(SPARSE_SPATIAL_SLICE);
                                                                        set_sparse_spatial_slice_parent_slice(new_slice, self);
                                                                        sparse_spatial_slice_set_spatial_index_method(new_slice, second_index);
                                                                        rplacd(previous_cons, cons(new_slice, current_sublist));
                                                                        sparse_spatial_slice_add_spatial_element_method(new_slice, sub_indices.rest(), spatial_element);
                                                                        sublisp_throw($sym144$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, spatial_element);
                                                                    }
                                                                }
                                                            } 
                                                            {
                                                                SubLObject new_slice = object.object_new_method(SPARSE_SPATIAL_SLICE);
                                                                set_sparse_spatial_slice_parent_slice(new_slice, self);
                                                                sparse_spatial_slice_set_spatial_index_method(new_slice, second_index);
                                                                rplacd(previous_cons, cons(new_slice, current_sublist));
                                                                sparse_spatial_slice_add_spatial_element_method(new_slice, sub_indices.rest(), spatial_element);
                                                                sublisp_throw($sym144$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, spatial_element);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                {
                                                    SubLObject new_slice = object.object_new_method(SPARSE_SPATIAL_SLICE);
                                                    set_sparse_spatial_slice_parent_slice(new_slice, self);
                                                    sparse_spatial_slice_set_spatial_index_method(new_slice, second_index);
                                                    ordered_sub_slices = list(new_slice);
                                                    sparse_spatial_slice_add_spatial_element_method(new_slice, sub_indices.rest(), spatial_element);
                                                    sublisp_throw($sym144$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, spatial_element);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    sublisp_throw($sym144$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_slice_storage(self, storage);
                            set_sparse_spatial_slice_ordered_sub_slices(self, ordered_sub_slices);
                            set_sparse_spatial_slice_spatial_index(self, spatial_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_slice_method = Errors.handleThrowable(ccatch_env_var, $sym144$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(ADD_SPATIAL_ELEMENT, self, listed_args, catch_var_for_sparse_spatial_slice_method);
            return catch_var_for_sparse_spatial_slice_method;
        }
    }

    public static final SubLObject sparse_spatial_slice_remove_spatial_element_method(SubLObject self, SubLObject spatial_element) {
        {
            SubLObject catch_var_for_sparse_spatial_slice_method = NIL;
            SubLObject listed_args = list(spatial_element);
            SubLObject storage = get_sparse_spatial_slice_storage(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(REMOVE_SPATIAL_ELEMENT, self, listed_args);
                    if (NIL != spatial_element) {
                        if (NIL != storage) {
                            dictionary.dictionary_remove(storage, spatial_element);
                        }
                        sparse_spatial_element_remove_from_indexed_space_method(spatial_element);
                        sublisp_throw($sym148$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, spatial_element);
                    }
                    sublisp_throw($sym148$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_slice_storage(self, storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_slice_method = Errors.handleThrowable(ccatch_env_var, $sym148$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(REMOVE_SPATIAL_ELEMENT, self, listed_args, catch_var_for_sparse_spatial_slice_method);
            return catch_var_for_sparse_spatial_slice_method;
        }
    }

    public static final SubLObject sparse_spatial_slice_get_spatial_elements_method(SubLObject self, SubLObject indices) {
        {
            SubLObject catch_var_for_sparse_spatial_slice_method = NIL;
            SubLObject listed_args = list(indices);
            SubLObject spatial_index = get_sparse_spatial_slice_spatial_index(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(GET_SPATIAL_ELEMENTS, self, listed_args);
                    {
                        SubLObject all_slices_with_index = get_sparse_spatial_index_parent_slices(spatial_index);
                        SubLObject satisfied_elements = NIL;
                        SubLObject cdolist_list_var = all_slices_with_index;
                        SubLObject slice = NIL;
                        for (slice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slice = cdolist_list_var.first()) {
                            satisfied_elements = nconc(sparse_spatial_slice_get_spatial_elements_internal_method(slice, indices), satisfied_elements);
                        }
                        sublisp_throw($sym152$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, satisfied_elements);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_slice_spatial_index(self, spatial_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_slice_method = Errors.handleThrowable(ccatch_env_var, $sym152$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(GET_SPATIAL_ELEMENTS, self, listed_args, catch_var_for_sparse_spatial_slice_method);
            return catch_var_for_sparse_spatial_slice_method;
        }
    }

    public static final SubLObject sparse_spatial_slice_clear_method(SubLObject self, SubLObject indices) {
        {
            SubLObject catch_var_for_sparse_spatial_slice_method = NIL;
            SubLObject listed_args = list(indices);
            SubLObject storage = get_sparse_spatial_slice_storage(self);
            SubLObject ordered_sub_slices = get_sparse_spatial_slice_ordered_sub_slices(self);
            SubLObject spatial_index = get_sparse_spatial_slice_spatial_index(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(CLEAR, self, listed_args);
                    if (NIL != indices) {
                        {
                            SubLObject first_index = indices.first();
                            SubLObject other_indices = indices.rest();
                            if (NIL == other_indices) {
                                if ((NIL != storage) && (NIL != sparse_spatial_index_equal_p_method(spatial_index, first_index))) {
                                    dictionary.clear_dictionary(storage);
                                }
                            } else {
                                if (NIL != ordered_sub_slices) {
                                    {
                                        SubLObject second_index = other_indices.first();
                                        SubLObject cdolist_list_var = ordered_sub_slices;
                                        SubLObject slice = NIL;
                                        for (slice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slice = cdolist_list_var.first()) {
                                            if (NIL != sparse_spatial_index_equal_p_method(get_sparse_spatial_slice_spatial_index(slice), second_index)) {
                                                sparse_spatial_slice_clear_method(slice, other_indices);
                                                sublisp_throw($sym156$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, NIL);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    sublisp_throw($sym156$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sparse_spatial_slice_storage(self, storage);
                            set_sparse_spatial_slice_ordered_sub_slices(self, ordered_sub_slices);
                            set_sparse_spatial_slice_spatial_index(self, spatial_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_slice_method = Errors.handleThrowable(ccatch_env_var, $sym156$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(CLEAR, self, listed_args, catch_var_for_sparse_spatial_slice_method);
            return catch_var_for_sparse_spatial_slice_method;
        }
    }

    public static final SubLObject sparse_spatial_slice_satisfies_p_method(SubLObject self, SubLObject indices) {
        {
            SubLObject catch_var_for_sparse_spatial_slice_method = NIL;
            SubLObject listed_args = list(indices);
            try {
                method_listeners.method_listeners_invoke_before_listeners(SATISFIES_P, self, listed_args);
                {
                    SubLObject copy_of_indices = copy_list(indices);
                    SubLObject current_slice = self;
                    while (NIL != current_slice) {
                        copy_of_indices = delete(get_sparse_spatial_slice_spatial_index(current_slice), copy_of_indices, symbol_function(SPARSE_SPATIAL_INDEX_EQUAL_P_METHOD), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == copy_of_indices) {
                            sublisp_throw($sym160$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, T);
                        }
                        current_slice = get_sparse_spatial_slice_parent_slice(current_slice);
                    } 
                    sublisp_throw($sym160$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, NIL);
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sparse_spatial_slice_method = Errors.handleThrowable(ccatch_env_var, $sym160$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(SATISFIES_P, self, listed_args, catch_var_for_sparse_spatial_slice_method);
            return catch_var_for_sparse_spatial_slice_method;
        }
    }

    public static final SubLObject sparse_spatial_slice_get_spatial_elements_internal_method(SubLObject self, SubLObject indices) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_sparse_spatial_slice_method = NIL;
                SubLObject listed_args = list(indices);
                SubLObject storage = get_sparse_spatial_slice_storage(self);
                SubLObject ordered_sub_slices = get_sparse_spatial_slice_ordered_sub_slices(self);
                try {
                    try {
                        method_listeners.method_listeners_invoke_before_listeners(GET_SPATIAL_ELEMENTS_INTERNAL, self, listed_args);
                        {
                            SubLObject satisfied_elements = NIL;
                            SubLObject cdolist_list_var = ordered_sub_slices;
                            SubLObject sub_slice = NIL;
                            for (sub_slice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_slice = cdolist_list_var.first()) {
                                satisfied_elements = nconc(sparse_spatial_slice_get_spatial_elements_internal_method(sub_slice, indices), satisfied_elements);
                            }
                            if (NIL != sparse_spatial_slice_satisfies_p_method(self, indices)) {
                                if (NIL != storage) {
                                    {
                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(storage));
                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                SubLObject value = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                satisfied_elements = cons(element, satisfied_elements);
                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                            }
                                        } 
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                }
                            }
                            sublisp_throw($sym164$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, satisfied_elements);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_sparse_spatial_slice_storage(self, storage);
                                set_sparse_spatial_slice_ordered_sub_slices(self, ordered_sub_slices);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_sparse_spatial_slice_method = Errors.handleThrowable(ccatch_env_var, $sym164$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD);
                }
                method_listeners.method_listeners_invoke_after_listeners(GET_SPATIAL_ELEMENTS_INTERNAL, self, listed_args, catch_var_for_sparse_spatial_slice_method);
                return catch_var_for_sparse_spatial_slice_method;
            }
        }
    }

    public static final SubLObject sparse_spatial_slice_compute_index_path_method(SubLObject self) {
        {
            SubLObject path = NIL;
            SubLObject current_slice = self;
            while (NIL != current_slice) {
                path = cons(get_sparse_spatial_slice_spatial_index(current_slice), path);
                current_slice = get_sparse_spatial_slice_parent_slice(current_slice);
            } 
            return nreverse(path);
        }
    }

    public static final SubLObject sparse_spatial_slice_display_method(SubLObject self, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_sparse_spatial_slice_method = NIL;
                SubLObject storage = get_sparse_spatial_slice_storage(self);
                SubLObject ordered_sub_slices = get_sparse_spatial_slice_ordered_sub_slices(self);
                try {
                    try {
                        if (NIL == storage) {
                            format(stream, $str_alt171$__Slice__S_has_no_storage_, self);
                        }
                        if (NIL != storage) {
                            format(stream, $str_alt172$__Elements_at_index___S, sparse_spatial_slice_compute_index_path_method(self));
                            {
                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(storage));
                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        SubLObject value = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        format(stream, $str_alt173$_____S, element);
                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                    }
                                } 
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                        if (NIL == ordered_sub_slices) {
                            format(stream, $str_alt174$__Slice__S_has_no_sub_slices_, self);
                        }
                        {
                            SubLObject cdolist_list_var = ordered_sub_slices;
                            SubLObject sub_slice = NIL;
                            for (sub_slice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_slice = cdolist_list_var.first()) {
                                sparse_spatial_slice_display_method(sub_slice, stream);
                            }
                        }
                        sublisp_throw($sym170$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD, self);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_sparse_spatial_slice_storage(self, storage);
                                set_sparse_spatial_slice_ordered_sub_slices(self, ordered_sub_slices);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_sparse_spatial_slice_method = Errors.handleThrowable(ccatch_env_var, $sym170$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD);
                }
                return catch_var_for_sparse_spatial_slice_method;
            }
        }
    }

    public static final SubLObject get_test_index_name(SubLObject test_index) {
        return classes.subloop_get_access_protected_instance_slot(test_index, THREE_INTEGER, NAME);
    }

    public static final SubLObject set_test_index_name(SubLObject test_index, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_index, value, THREE_INTEGER, NAME);
    }

    public static final SubLObject subloop_reserved_initialize_test_index_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_INDEX, LAST_ALLOCATED_INDEX, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_test_index_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_INDEX, INDEX_VALUE, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_INDEX, PARENT_SLICES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_INDEX, NAME, NIL);
        return NIL;
    }

    public static final SubLObject test_index_p(SubLObject test_index) {
        return classes.subloop_instanceof_class(test_index, TEST_INDEX);
    }

    public static final SubLObject test_index_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_test_index_method = NIL;
            SubLObject name = get_test_index_name(self);
            try {
                try {
                    format(stream, $str_alt185$_S, name);
                    sublisp_throw($sym184$OUTER_CATCH_FOR_TEST_INDEX_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_index_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_index_method = Errors.handleThrowable(ccatch_env_var, $sym184$OUTER_CATCH_FOR_TEST_INDEX_METHOD);
            }
            return catch_var_for_test_index_method;
        }
    }

    public static final SubLObject test_index_set_name_method(SubLObject self, SubLObject new_name) {
        {
            SubLObject catch_var_for_test_index_method = NIL;
            SubLObject listed_args = list(new_name);
            SubLObject name = get_test_index_name(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(SET_NAME, self, listed_args);
                    if (NIL != name) {
                        remprop(name, $TEST_INDEX);
                    }
                    if (NIL != new_name) {
                        put(new_name, $TEST_INDEX, self);
                    }
                    name = new_name;
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_index_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_index_method = Errors.handleThrowable(ccatch_env_var, $sym191$OUTER_CATCH_FOR_TEST_INDEX_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(SET_NAME, self, listed_args, catch_var_for_test_index_method);
            return catch_var_for_test_index_method;
        }
    }

    public static final SubLObject test_index_given_name(SubLObject symbol, SubLObject monitor) {
        {
            SubLObject index = get(symbol, $TEST_INDEX, UNPROVIDED);
            if (NIL != index) {
                return index;
            }
            index = object.object_new_method(TEST_INDEX);
            test_index_set_name_method(index, symbol);
            object_monitor.object_monitor_monitor_method(monitor, index);
            return index;
        }
    }

    public static final SubLObject get_test_element_name(SubLObject test_element) {
        return classes.subloop_get_access_protected_instance_slot(test_element, THREE_INTEGER, NAME);
    }

    public static final SubLObject set_test_element_name(SubLObject test_element, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_element, value, THREE_INTEGER, NAME);
    }

    public static final SubLObject subloop_reserved_initialize_test_element_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_test_element_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_ELEMENT, REMOVING_SELF, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_ELEMENT, SPACE, NIL);
        classes.subloop_initialize_slot(new_instance, SPARSE_SPATIAL_ELEMENT, PARENT_SLICE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_ELEMENT, NAME, NIL);
        return NIL;
    }

    public static final SubLObject test_element_p(SubLObject test_element) {
        return classes.subloop_instanceof_class(test_element, TEST_ELEMENT);
    }

    public static final SubLObject test_element_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_test_element_method = NIL;
            SubLObject name = get_test_element_name(self);
            try {
                try {
                    format(stream, $str_alt185$_S, name);
                    sublisp_throw($sym197$OUTER_CATCH_FOR_TEST_ELEMENT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_element_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_element_method = Errors.handleThrowable(ccatch_env_var, $sym197$OUTER_CATCH_FOR_TEST_ELEMENT_METHOD);
            }
            return catch_var_for_test_element_method;
        }
    }

    public static final SubLObject test_element_set_name_method(SubLObject self, SubLObject new_name) {
        {
            SubLObject catch_var_for_test_element_method = NIL;
            SubLObject listed_args = list(new_name);
            SubLObject name = get_test_element_name(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(SET_NAME, self, listed_args);
                    if (NIL != name) {
                        remprop(name, $TEST_ELEMENT);
                    }
                    if (NIL != new_name) {
                        put(new_name, $TEST_ELEMENT, self);
                    }
                    name = new_name;
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_element_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_element_method = Errors.handleThrowable(ccatch_env_var, $sym200$OUTER_CATCH_FOR_TEST_ELEMENT_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(SET_NAME, self, listed_args, catch_var_for_test_element_method);
            return catch_var_for_test_element_method;
        }
    }

    public static final SubLObject test_element_given_name(SubLObject symbol, SubLObject monitor) {
        {
            SubLObject element = get(symbol, $TEST_ELEMENT, UNPROVIDED);
            if (NIL != element) {
                return element;
            }
            element = object.object_new_method(TEST_ELEMENT);
            test_element_set_name_method(element, symbol);
            object_monitor.object_monitor_monitor_method(monitor, element);
            return element;
        }
    }

    public static final SubLObject translate_test_input(SubLObject test_input, SubLObject monitor) {
        if (test_input.isCons()) {
            {
                SubLObject first_name = test_input.first();
                SubLObject element = NIL;
                SubLObject index_names = test_input.rest();
                SubLObject indices = NIL;
                element = test_element_given_name(first_name, monitor);
                {
                    SubLObject cdolist_list_var = index_names;
                    SubLObject index_name = NIL;
                    for (index_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index_name = cdolist_list_var.first()) {
                        indices = cons(test_index_given_name(index_name, monitor), indices);
                    }
                }
                return cons(element, nreverse(indices));
            }
        }
        return test_input;
    }

    public static final SubLObject monitor_test_input(SubLObject monitor, SubLObject translated_test_input) {
        if (translated_test_input.isCons()) {
            {
                SubLObject element = translated_test_input.first();
                methods.funcall_instance_method_with_1_args(monitor, MONITOR, element);
                {
                    SubLObject cdolist_list_var = translated_test_input.rest();
                    SubLObject index = NIL;
                    for (index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index = cdolist_list_var.first()) {
                        methods.funcall_instance_method_with_1_args(monitor, MONITOR, index);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject index_space_loop_get_input() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt204$____);
            }
            force_output(UNPROVIDED);
            return read(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject make_infinte(SubLObject list) {
        if (!list.isCons()) {
            return NIL;
        }
        {
            SubLObject last_cons = last(list, UNPROVIDED);
            rplacd(last_cons, list);
            return list;
        }
    }

    public static final SubLObject index_space_loop() {
        {
            SubLObject monitor = methods.funcall_class_method_with_0_args(OBJECT_MONITOR, NEW);
            SubLObject space = methods.funcall_class_method_with_0_args(SPARSE_INDEX_SPACE, NEW);
            SubLObject input = index_space_loop_get_input();
            SubLObject translated_input = translate_test_input(input, monitor);
            methods.funcall_instance_method_with_0_args(monitor, START_MONITORING);
            methods.funcall_instance_method_with_1_args(monitor, MONITOR, space);
            methods.funcall_instance_method_with_1_args(space, SET_INDICES, Mapping.mapcar(symbol_function(TEST_INDEX_GIVEN_NAME), $list_alt209, new SubLObject[]{ make_infinte(list(monitor)) }));
            while (translated_input != $QUIT) {
                monitor_test_input(monitor, translated_input);
                methods.funcall_instance_method_with_2_args(space, ADD_AT_COORDINATE, translated_input.rest(), translated_input.first());
                input = index_space_loop_get_input();
                translated_input = translate_test_input(input, monitor);
            } 
            methods.funcall_instance_method_with_0_args(monitor, STOP_MONITORING);
            sparse_index_space_display_method(space, T);
        }
        return NIL;
    }

    public static final SubLObject declare_index_space_file() {
        declareFunction("spatial_index_p", "SPATIAL-INDEX-P", 1, 0, false);
        declareFunction("indexed_space_p", "INDEXED-SPACE-P", 1, 0, false);
        declareFunction("spatial_element_p", "SPATIAL-ELEMENT-P", 1, 0, false);
        declareFunction("spatial_slice_p", "SPATIAL-SLICE-P", 1, 0, false);
        declareFunction("get_sparse_spatial_index_parent_slices", "GET-SPARSE-SPATIAL-INDEX-PARENT-SLICES", 1, 0, false);
        declareFunction("set_sparse_spatial_index_parent_slices", "SET-SPARSE-SPATIAL-INDEX-PARENT-SLICES", 2, 0, false);
        declareFunction("get_sparse_spatial_index_index_value", "GET-SPARSE-SPATIAL-INDEX-INDEX-VALUE", 1, 0, false);
        declareFunction("set_sparse_spatial_index_index_value", "SET-SPARSE-SPATIAL-INDEX-INDEX-VALUE", 2, 0, false);
        declareFunction("get_sparse_spatial_index_last_allocated_index", "GET-SPARSE-SPATIAL-INDEX-LAST-ALLOCATED-INDEX", 1, 0, false);
        declareFunction("set_sparse_spatial_index_last_allocated_index", "SET-SPARSE-SPATIAL-INDEX-LAST-ALLOCATED-INDEX", 2, 0, false);
        declareFunction("subloop_reserved_initialize_sparse_spatial_index_class", "SUBLOOP-RESERVED-INITIALIZE-SPARSE-SPATIAL-INDEX-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sparse_spatial_index_instance", "SUBLOOP-RESERVED-INITIALIZE-SPARSE-SPATIAL-INDEX-INSTANCE", 1, 0, false);
        declareFunction("sparse_spatial_index_p", "SPARSE-SPATIAL-INDEX-P", 1, 0, false);
        declareFunction("get_sparse_index_space_root_slices", "GET-SPARSE-INDEX-SPACE-ROOT-SLICES", 1, 0, false);
        declareFunction("set_sparse_index_space_root_slices", "SET-SPARSE-INDEX-SPACE-ROOT-SLICES", 2, 0, false);
        declareFunction("subloop_reserved_initialize_sparse_index_space_class", "SUBLOOP-RESERVED-INITIALIZE-SPARSE-INDEX-SPACE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sparse_index_space_instance", "SUBLOOP-RESERVED-INITIALIZE-SPARSE-INDEX-SPACE-INSTANCE", 1, 0, false);
        declareFunction("sparse_index_space_p", "SPARSE-INDEX-SPACE-P", 1, 0, false);
        declareFunction("get_sparse_spatial_element_parent_slice", "GET-SPARSE-SPATIAL-ELEMENT-PARENT-SLICE", 1, 0, false);
        declareFunction("set_sparse_spatial_element_parent_slice", "SET-SPARSE-SPATIAL-ELEMENT-PARENT-SLICE", 2, 0, false);
        declareFunction("get_sparse_spatial_element_space", "GET-SPARSE-SPATIAL-ELEMENT-SPACE", 1, 0, false);
        declareFunction("set_sparse_spatial_element_space", "SET-SPARSE-SPATIAL-ELEMENT-SPACE", 2, 0, false);
        declareFunction("get_sparse_spatial_element_removing_self", "GET-SPARSE-SPATIAL-ELEMENT-REMOVING-SELF", 1, 0, false);
        declareFunction("set_sparse_spatial_element_removing_self", "SET-SPARSE-SPATIAL-ELEMENT-REMOVING-SELF", 2, 0, false);
        declareFunction("subloop_reserved_initialize_sparse_spatial_element_class", "SUBLOOP-RESERVED-INITIALIZE-SPARSE-SPATIAL-ELEMENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sparse_spatial_element_instance", "SUBLOOP-RESERVED-INITIALIZE-SPARSE-SPATIAL-ELEMENT-INSTANCE", 1, 0, false);
        declareFunction("sparse_spatial_element_p", "SPARSE-SPATIAL-ELEMENT-P", 1, 0, false);
        declareFunction("get_sparse_spatial_slice_storage", "GET-SPARSE-SPATIAL-SLICE-STORAGE", 1, 0, false);
        declareFunction("set_sparse_spatial_slice_storage", "SET-SPARSE-SPATIAL-SLICE-STORAGE", 2, 0, false);
        declareFunction("get_sparse_spatial_slice_ordered_sub_slices", "GET-SPARSE-SPATIAL-SLICE-ORDERED-SUB-SLICES", 1, 0, false);
        declareFunction("set_sparse_spatial_slice_ordered_sub_slices", "SET-SPARSE-SPATIAL-SLICE-ORDERED-SUB-SLICES", 2, 0, false);
        declareFunction("get_sparse_spatial_slice_parent_slice", "GET-SPARSE-SPATIAL-SLICE-PARENT-SLICE", 1, 0, false);
        declareFunction("set_sparse_spatial_slice_parent_slice", "SET-SPARSE-SPATIAL-SLICE-PARENT-SLICE", 2, 0, false);
        declareFunction("get_sparse_spatial_slice_spatial_index", "GET-SPARSE-SPATIAL-SLICE-SPATIAL-INDEX", 1, 0, false);
        declareFunction("set_sparse_spatial_slice_spatial_index", "SET-SPARSE-SPATIAL-SLICE-SPATIAL-INDEX", 2, 0, false);
        declareFunction("subloop_reserved_initialize_sparse_spatial_slice_class", "SUBLOOP-RESERVED-INITIALIZE-SPARSE-SPATIAL-SLICE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sparse_spatial_slice_instance", "SUBLOOP-RESERVED-INITIALIZE-SPARSE-SPATIAL-SLICE-INSTANCE", 1, 0, false);
        declareFunction("sparse_spatial_slice_p", "SPARSE-SPATIAL-SLICE-P", 1, 0, false);
        declareFunction("sparse_spatial_index_allocate_ordered_indices_method", "SPARSE-SPATIAL-INDEX-ALLOCATE-ORDERED-INDICES-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_index_initialize_method", "SPARSE-SPATIAL-INDEX-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("sparse_spatial_index_set_index_value_method", "SPARSE-SPATIAL-INDEX-SET-INDEX-VALUE-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_index_equal_p_method", "SPARSE-SPATIAL-INDEX-EQUAL-P-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_index_less_p_method", "SPARSE-SPATIAL-INDEX-LESS-P-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_index_greater_p_method", "SPARSE-SPATIAL-INDEX-GREATER-P-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_index_register_parent_slice_method", "SPARSE-SPATIAL-INDEX-REGISTER-PARENT-SLICE-METHOD", 2, 0, false);
        declareFunction("sparse_index_space_set_indices_method", "SPARSE-INDEX-SPACE-SET-INDICES-METHOD", 2, 1, false);
        declareFunction("sparse_index_space_get_indices_method", "SPARSE-INDEX-SPACE-GET-INDICES-METHOD", 1, 0, false);
        declareFunction("sparse_index_space_order_indices_method", "SPARSE-INDEX-SPACE-ORDER-INDICES-METHOD", 2, 0, false);
        declareFunction("sparse_index_space_add_at_coordinate_method", "SPARSE-INDEX-SPACE-ADD-AT-COORDINATE-METHOD", 3, 0, false);
        declareFunction("sparse_index_space_get_at_coordinate_method", "SPARSE-INDEX-SPACE-GET-AT-COORDINATE-METHOD", 3, 0, false);
        declareFunction("sparse_index_space_clear_at_coordinate_method", "SPARSE-INDEX-SPACE-CLEAR-AT-COORDINATE-METHOD", 2, 0, false);
        declareFunction("sparse_index_space_display_method", "SPARSE-INDEX-SPACE-DISPLAY-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_element_initialize_method", "SPARSE-SPATIAL-ELEMENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("sparse_spatial_element_set_parent_slice_method", "SPARSE-SPATIAL-ELEMENT-SET-PARENT-SLICE-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_element_get_indices_method", "SPARSE-SPATIAL-ELEMENT-GET-INDICES-METHOD", 1, 0, false);
        declareFunction("sparse_spatial_element_has_index_p_method", "SPARSE-SPATIAL-ELEMENT-HAS-INDEX-P-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_element_remove_from_indexed_space_method", "SPARSE-SPATIAL-ELEMENT-REMOVE-FROM-INDEXED-SPACE-METHOD", 1, 0, false);
        declareFunction("sparse_spatial_slice_set_spatial_index_method", "SPARSE-SPATIAL-SLICE-SET-SPATIAL-INDEX-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_slice_get_spatial_index_method", "SPARSE-SPATIAL-SLICE-GET-SPATIAL-INDEX-METHOD", 1, 0, false);
        declareFunction("sparse_spatial_slice_add_spatial_element_method", "SPARSE-SPATIAL-SLICE-ADD-SPATIAL-ELEMENT-METHOD", 3, 0, false);
        declareFunction("sparse_spatial_slice_remove_spatial_element_method", "SPARSE-SPATIAL-SLICE-REMOVE-SPATIAL-ELEMENT-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_slice_get_spatial_elements_method", "SPARSE-SPATIAL-SLICE-GET-SPATIAL-ELEMENTS-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_slice_clear_method", "SPARSE-SPATIAL-SLICE-CLEAR-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_slice_satisfies_p_method", "SPARSE-SPATIAL-SLICE-SATISFIES-P-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_slice_get_spatial_elements_internal_method", "SPARSE-SPATIAL-SLICE-GET-SPATIAL-ELEMENTS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("sparse_spatial_slice_compute_index_path_method", "SPARSE-SPATIAL-SLICE-COMPUTE-INDEX-PATH-METHOD", 1, 0, false);
        declareFunction("sparse_spatial_slice_display_method", "SPARSE-SPATIAL-SLICE-DISPLAY-METHOD", 2, 0, false);
        declareFunction("get_test_index_name", "GET-TEST-INDEX-NAME", 1, 0, false);
        declareFunction("set_test_index_name", "SET-TEST-INDEX-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_test_index_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-INDEX-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_index_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-INDEX-INSTANCE", 1, 0, false);
        declareFunction("test_index_p", "TEST-INDEX-P", 1, 0, false);
        declareFunction("test_index_print_method", "TEST-INDEX-PRINT-METHOD", 3, 0, false);
        declareFunction("test_index_set_name_method", "TEST-INDEX-SET-NAME-METHOD", 2, 0, false);
        declareFunction("test_index_given_name", "TEST-INDEX-GIVEN-NAME", 2, 0, false);
        declareFunction("get_test_element_name", "GET-TEST-ELEMENT-NAME", 1, 0, false);
        declareFunction("set_test_element_name", "SET-TEST-ELEMENT-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_test_element_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-ELEMENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_element_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-ELEMENT-INSTANCE", 1, 0, false);
        declareFunction("test_element_p", "TEST-ELEMENT-P", 1, 0, false);
        declareFunction("test_element_print_method", "TEST-ELEMENT-PRINT-METHOD", 3, 0, false);
        declareFunction("test_element_set_name_method", "TEST-ELEMENT-SET-NAME-METHOD", 2, 0, false);
        declareFunction("test_element_given_name", "TEST-ELEMENT-GIVEN-NAME", 2, 0, false);
        declareFunction("translate_test_input", "TRANSLATE-TEST-INPUT", 2, 0, false);
        declareFunction("monitor_test_input", "MONITOR-TEST-INPUT", 2, 0, false);
        declareFunction("index_space_loop_get_input", "INDEX-SPACE-LOOP-GET-INPUT", 0, 0, false);
        declareFunction("make_infinte", "MAKE-INFINTE", 1, 0, false);
        declareFunction("index_space_loop", "INDEX-SPACE-LOOP", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_index_space_file() {
        defconstant("*INDEX-SPACE-INITIAL-STORAGE-SIZE*", $int$50);
        return NIL;
    }

    public static final SubLObject setup_index_space_file() {
                interfaces.new_interface(SPATIAL_INDEX, NIL, NIL, $list_alt2);
        interfaces.new_interface(INDEXED_SPACE, NIL, NIL, $list_alt4);
        interfaces.new_interface(SPATIAL_ELEMENT, NIL, NIL, $list_alt6);
        interfaces.new_interface(SPATIAL_SLICE, NIL, NIL, $list_alt8);
        classes.subloop_new_class(SPARSE_SPATIAL_INDEX, OBJECT, $list_alt11, NIL, $list_alt12);
        classes.class_set_implements_slot_listeners(SPARSE_SPATIAL_INDEX, NIL);
        classes.subloop_note_class_initialization_function(SPARSE_SPATIAL_INDEX, SUBLOOP_RESERVED_INITIALIZE_SPARSE_SPATIAL_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function(SPARSE_SPATIAL_INDEX, SUBLOOP_RESERVED_INITIALIZE_SPARSE_SPATIAL_INDEX_INSTANCE);
        subloop_reserved_initialize_sparse_spatial_index_class(SPARSE_SPATIAL_INDEX);
        classes.subloop_new_class(SPARSE_INDEX_SPACE, OBJECT, $list_alt22, NIL, $list_alt23);
        classes.class_set_implements_slot_listeners(SPARSE_INDEX_SPACE, NIL);
        classes.subloop_note_class_initialization_function(SPARSE_INDEX_SPACE, SUBLOOP_RESERVED_INITIALIZE_SPARSE_INDEX_SPACE_CLASS);
        classes.subloop_note_instance_initialization_function(SPARSE_INDEX_SPACE, SUBLOOP_RESERVED_INITIALIZE_SPARSE_INDEX_SPACE_INSTANCE);
        subloop_reserved_initialize_sparse_index_space_class(SPARSE_INDEX_SPACE);
        classes.subloop_new_class(SPARSE_SPATIAL_ELEMENT, OBJECT, $list_alt28, NIL, $list_alt29);
        classes.class_set_implements_slot_listeners(SPARSE_SPATIAL_ELEMENT, NIL);
        classes.subloop_note_class_initialization_function(SPARSE_SPATIAL_ELEMENT, SUBLOOP_RESERVED_INITIALIZE_SPARSE_SPATIAL_ELEMENT_CLASS);
        classes.subloop_note_instance_initialization_function(SPARSE_SPATIAL_ELEMENT, SUBLOOP_RESERVED_INITIALIZE_SPARSE_SPATIAL_ELEMENT_INSTANCE);
        subloop_reserved_initialize_sparse_spatial_element_class(SPARSE_SPATIAL_ELEMENT);
        classes.subloop_new_class(SPARSE_SPATIAL_SLICE, OBJECT, $list_alt37, NIL, $list_alt38);
        classes.class_set_implements_slot_listeners(SPARSE_SPATIAL_SLICE, NIL);
        classes.subloop_note_class_initialization_function(SPARSE_SPATIAL_SLICE, SUBLOOP_RESERVED_INITIALIZE_SPARSE_SPATIAL_SLICE_CLASS);
        classes.subloop_note_instance_initialization_function(SPARSE_SPATIAL_SLICE, SUBLOOP_RESERVED_INITIALIZE_SPARSE_SPATIAL_SLICE_INSTANCE);
        subloop_reserved_initialize_sparse_spatial_slice_class(SPARSE_SPATIAL_SLICE);
        methods.methods_incorporate_class_method(ALLOCATE_ORDERED_INDICES, SPARSE_SPATIAL_INDEX, $list_alt44, $list_alt45, $list_alt46);
        methods.subloop_register_class_method(SPARSE_SPATIAL_INDEX, ALLOCATE_ORDERED_INDICES, SPARSE_SPATIAL_INDEX_ALLOCATE_ORDERED_INDICES_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SPARSE_SPATIAL_INDEX, $list_alt49, NIL, $list_alt50);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_INDEX, INITIALIZE, SPARSE_SPATIAL_INDEX_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_INDEX_VALUE, SPARSE_SPATIAL_INDEX, $list_alt54, $list_alt55, $list_alt56);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_INDEX, SET_INDEX_VALUE, SPARSE_SPATIAL_INDEX_SET_INDEX_VALUE_METHOD);
        methods.methods_incorporate_instance_method(EQUAL_P, SPARSE_SPATIAL_INDEX, $list_alt54, $list_alt60, $list_alt61);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_INDEX, EQUAL_P, SPARSE_SPATIAL_INDEX_EQUAL_P_METHOD);
        methods.methods_incorporate_instance_method(LESS_P, SPARSE_SPATIAL_INDEX, $list_alt54, $list_alt60, $list_alt65);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_INDEX, LESS_P, SPARSE_SPATIAL_INDEX_LESS_P_METHOD);
        methods.methods_incorporate_instance_method(GREATER_P, SPARSE_SPATIAL_INDEX, $list_alt54, $list_alt60, $list_alt69);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_INDEX, GREATER_P, SPARSE_SPATIAL_INDEX_GREATER_P_METHOD);
        methods.methods_incorporate_instance_method(REGISTER_PARENT_SLICE, SPARSE_SPATIAL_INDEX, $list_alt54, $list_alt73, $list_alt74);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_INDEX, REGISTER_PARENT_SLICE, SPARSE_SPATIAL_INDEX_REGISTER_PARENT_SLICE_METHOD);
        methods.methods_incorporate_instance_method(SET_INDICES, SPARSE_INDEX_SPACE, $list_alt54, $list_alt80, $list_alt81);
        methods.subloop_register_instance_method(SPARSE_INDEX_SPACE, SET_INDICES, SPARSE_INDEX_SPACE_SET_INDICES_METHOD);
        methods.methods_incorporate_instance_method(GET_INDICES, SPARSE_INDEX_SPACE, $list_alt54, NIL, $list_alt85);
        methods.subloop_register_instance_method(SPARSE_INDEX_SPACE, GET_INDICES, SPARSE_INDEX_SPACE_GET_INDICES_METHOD);
        methods.methods_incorporate_instance_method(ORDER_INDICES, SPARSE_INDEX_SPACE, $list_alt49, $list_alt89, $list_alt90);
        methods.subloop_register_instance_method(SPARSE_INDEX_SPACE, ORDER_INDICES, SPARSE_INDEX_SPACE_ORDER_INDICES_METHOD);
        methods.methods_incorporate_instance_method(ADD_AT_COORDINATE, SPARSE_INDEX_SPACE, $list_alt54, $list_alt94, $list_alt95);
        methods.subloop_register_instance_method(SPARSE_INDEX_SPACE, ADD_AT_COORDINATE, SPARSE_INDEX_SPACE_ADD_AT_COORDINATE_METHOD);
        methods.methods_incorporate_instance_method(GET_AT_COORDINATE, SPARSE_INDEX_SPACE, $list_alt54, $list_alt94, $list_alt100);
        methods.subloop_register_instance_method(SPARSE_INDEX_SPACE, GET_AT_COORDINATE, SPARSE_INDEX_SPACE_GET_AT_COORDINATE_METHOD);
        methods.methods_incorporate_instance_method(CLEAR_AT_COORDINATE, SPARSE_INDEX_SPACE, $list_alt54, $list_alt89, $list_alt104);
        methods.subloop_register_instance_method(SPARSE_INDEX_SPACE, CLEAR_AT_COORDINATE, SPARSE_INDEX_SPACE_CLEAR_AT_COORDINATE_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY, SPARSE_INDEX_SPACE, $list_alt108, $list_alt109, $list_alt110);
        methods.subloop_register_instance_method(SPARSE_INDEX_SPACE, DISPLAY, SPARSE_INDEX_SPACE_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SPARSE_SPATIAL_ELEMENT, $list_alt49, NIL, $list_alt114);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_ELEMENT, INITIALIZE, SPARSE_SPATIAL_ELEMENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT_SLICE, SPARSE_SPATIAL_ELEMENT, $list_alt54, $list_alt73, $list_alt118);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_ELEMENT, SET_PARENT_SLICE, SPARSE_SPATIAL_ELEMENT_SET_PARENT_SLICE_METHOD);
        methods.methods_incorporate_instance_method(GET_INDICES, SPARSE_SPATIAL_ELEMENT, $list_alt54, NIL, $list_alt121);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_ELEMENT, GET_INDICES, SPARSE_SPATIAL_ELEMENT_GET_INDICES_METHOD);
        methods.methods_incorporate_instance_method(HAS_INDEX_P, SPARSE_SPATIAL_ELEMENT, $list_alt54, $list_alt11, $list_alt125);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_ELEMENT, HAS_INDEX_P, SPARSE_SPATIAL_ELEMENT_HAS_INDEX_P_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_FROM_INDEXED_SPACE, SPARSE_SPATIAL_ELEMENT, $list_alt129, NIL, $list_alt130);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_ELEMENT, REMOVE_FROM_INDEXED_SPACE, SPARSE_SPATIAL_ELEMENT_REMOVE_FROM_INDEXED_SPACE_METHOD);
        methods.methods_incorporate_instance_method(SET_SPATIAL_INDEX, SPARSE_SPATIAL_SLICE, $list_alt54, $list_alt134, $list_alt135);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_SLICE, SET_SPATIAL_INDEX, SPARSE_SPATIAL_SLICE_SET_SPATIAL_INDEX_METHOD);
        methods.methods_incorporate_instance_method(GET_SPATIAL_INDEX, SPARSE_SPATIAL_SLICE, $list_alt54, NIL, $list_alt139);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_SLICE, GET_SPATIAL_INDEX, SPARSE_SPATIAL_SLICE_GET_SPATIAL_INDEX_METHOD);
        methods.methods_incorporate_instance_method(ADD_SPATIAL_ELEMENT, SPARSE_SPATIAL_SLICE, $list_alt54, $list_alt94, $list_alt143);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_SLICE, ADD_SPATIAL_ELEMENT, SPARSE_SPATIAL_SLICE_ADD_SPATIAL_ELEMENT_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_SPATIAL_ELEMENT, SPARSE_SPATIAL_SLICE, $list_alt54, $list_alt28, $list_alt147);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_SLICE, REMOVE_SPATIAL_ELEMENT, SPARSE_SPATIAL_SLICE_REMOVE_SPATIAL_ELEMENT_METHOD);
        methods.methods_incorporate_instance_method(GET_SPATIAL_ELEMENTS, SPARSE_SPATIAL_SLICE, $list_alt54, $list_alt89, $list_alt151);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_SLICE, GET_SPATIAL_ELEMENTS, SPARSE_SPATIAL_SLICE_GET_SPATIAL_ELEMENTS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, SPARSE_SPATIAL_SLICE, $list_alt54, $list_alt89, $list_alt155);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_SLICE, CLEAR, SPARSE_SPATIAL_SLICE_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(SATISFIES_P, SPARSE_SPATIAL_SLICE, $list_alt49, $list_alt89, $list_alt159);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_SLICE, SATISFIES_P, SPARSE_SPATIAL_SLICE_SATISFIES_P_METHOD);
        methods.methods_incorporate_instance_method(GET_SPATIAL_ELEMENTS_INTERNAL, SPARSE_SPATIAL_SLICE, $list_alt49, $list_alt89, $list_alt163);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_SLICE, GET_SPATIAL_ELEMENTS_INTERNAL, SPARSE_SPATIAL_SLICE_GET_SPATIAL_ELEMENTS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(COMPUTE_INDEX_PATH, SPARSE_SPATIAL_SLICE, $list_alt44, NIL, $list_alt167);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_SLICE, COMPUTE_INDEX_PATH, SPARSE_SPATIAL_SLICE_COMPUTE_INDEX_PATH_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY, SPARSE_SPATIAL_SLICE, $list_alt44, $list_alt109, $list_alt169);
        methods.subloop_register_instance_method(SPARSE_SPATIAL_SLICE, DISPLAY, SPARSE_SPATIAL_SLICE_DISPLAY_METHOD);
        classes.subloop_new_class(TEST_INDEX, SPARSE_SPATIAL_INDEX, NIL, NIL, $list_alt177);
        classes.class_set_implements_slot_listeners(TEST_INDEX, NIL);
        classes.subloop_note_class_initialization_function(TEST_INDEX, SUBLOOP_RESERVED_INITIALIZE_TEST_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function(TEST_INDEX, SUBLOOP_RESERVED_INITIALIZE_TEST_INDEX_INSTANCE);
        subloop_reserved_initialize_test_index_class(TEST_INDEX);
        methods.methods_incorporate_instance_method(PRINT, TEST_INDEX, NIL, $list_alt182, $list_alt183);
        methods.subloop_register_instance_method(TEST_INDEX, PRINT, TEST_INDEX_PRINT_METHOD);
        methods.methods_incorporate_instance_method(SET_NAME, TEST_INDEX, $list_alt188, $list_alt189, $list_alt190);
        methods.subloop_register_instance_method(TEST_INDEX, SET_NAME, TEST_INDEX_SET_NAME_METHOD);
        classes.subloop_new_class(TEST_ELEMENT, SPARSE_SPATIAL_ELEMENT, NIL, NIL, $list_alt177);
        classes.class_set_implements_slot_listeners(TEST_ELEMENT, NIL);
        classes.subloop_note_class_initialization_function(TEST_ELEMENT, SUBLOOP_RESERVED_INITIALIZE_TEST_ELEMENT_CLASS);
        classes.subloop_note_instance_initialization_function(TEST_ELEMENT, SUBLOOP_RESERVED_INITIALIZE_TEST_ELEMENT_INSTANCE);
        subloop_reserved_initialize_test_element_class(TEST_ELEMENT);
        methods.methods_incorporate_instance_method(PRINT, TEST_ELEMENT, NIL, $list_alt182, $list_alt183);
        methods.subloop_register_instance_method(TEST_ELEMENT, PRINT, TEST_ELEMENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(SET_NAME, TEST_ELEMENT, $list_alt188, $list_alt189, $list_alt199);
        methods.subloop_register_instance_method(TEST_ELEMENT, SET_NAME, TEST_ELEMENT_SET_NAME_METHOD);
        return NIL;
    }

    // // Internal Constants
    public static final SubLInteger $int$50 = makeInteger(50);



    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EQUAL-P"), list(makeSymbol("OTHER-INDEX")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LESS-P"), list(makeSymbol("OTHER-INDEX")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GREATER-P"), list(makeSymbol("OTHER-INDEX")), makeKeyword("PUBLIC")));

    private static final SubLSymbol INDEXED_SPACE = makeSymbol("INDEXED-SPACE");

    static private final SubLList $list_alt4 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INDICES"), list(makeSymbol("INDICES"), makeSymbol("&OPTIONAL"), list(makeSymbol("ORDER-AS-SEQUENCED"), T)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDICES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-INDICES"), list(makeSymbol("INDICES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-AT-COORDINATE"), list(makeSymbol("INDICES"), makeSymbol("SPATIAL-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AT-COORDINATE"), list(makeSymbol("INDICES"), makeSymbol("SPATIAL-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-AT-COORDINATE"), list(makeSymbol("INDICES")), makeKeyword("PUBLIC")));



    static private final SubLList $list_alt6 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDICES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-INDEX-P"), list(makeSymbol("SPATIAL-INDEX")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-FROM-INDEXED-SPACE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SPATIAL_SLICE = makeSymbol("SPATIAL-SLICE");

    static private final SubLList $list_alt8 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SPATIAL-ELEMENT"), list(makeSymbol("INDICES"), makeSymbol("SPATIAL-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SPATIAL-ELEMENT"), list(makeSymbol("SPATIAL-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SPATIAL-ELEMENTS"), list(makeSymbol("INDICES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), list(makeSymbol("INDICES")), makeKeyword("PUBLIC")));





    static private final SubLList $list_alt11 = list(makeSymbol("SPATIAL-INDEX"));

    static private final SubLList $list_alt12 = list(new SubLObject[]{ list(makeSymbol("LAST-ALLOCATED-INDEX"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("INDEX-VALUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARENT-SLICES"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ALLOCATE-ORDERED-INDICES"), list(makeSymbol("COUNT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INDEX-VALUE"), list(makeSymbol("NEW-INDEX-VALUE")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EQUAL-P"), list(makeSymbol("OTHER-INDEX")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LESS-P"), list(makeSymbol("OTHER-INDEX")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GREATER-P"), list(makeSymbol("OTHER-INDEX")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REGISTER-PARENT-SLICE"), list(makeSymbol("NEW-PARENT-SLICE")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")) });

    private static final SubLSymbol INDEX_VALUE = makeSymbol("INDEX-VALUE");

    private static final SubLSymbol LAST_ALLOCATED_INDEX = makeSymbol("LAST-ALLOCATED-INDEX");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SPARSE_SPATIAL_INDEX_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPARSE-SPATIAL-INDEX-CLASS");





    private static final SubLSymbol PARENT_SLICES = makeSymbol("PARENT-SLICES");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SPARSE_SPATIAL_INDEX_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPARSE-SPATIAL-INDEX-INSTANCE");

    private static final SubLSymbol SPARSE_INDEX_SPACE = makeSymbol("SPARSE-INDEX-SPACE");

    static private final SubLList $list_alt22 = list(makeSymbol("INDEXED-SPACE"));

    static private final SubLList $list_alt23 = list(list(makeSymbol("ROOT-SLICES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INDICES"), list(makeSymbol("INDICES"), makeSymbol("&OPTIONAL"), list(makeSymbol("ORDER-AS-SEQUENCED"), T)), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDICES"), NIL, makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-INDICES"), list(makeSymbol("INDICES")), makeKeyword("PROTECTED"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-AT-COORDINATE"), list(makeSymbol("INDICES"), makeSymbol("SPATIAL-ELEMENT")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AT-COORDINATE"), list(makeSymbol("INDICES"), makeSymbol("SPATIAL-ELEMENT")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-AT-COORDINATE"), list(makeSymbol("INDICES")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY"), list(makeSymbol("STREAM")), makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SPARSE_INDEX_SPACE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPARSE-INDEX-SPACE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SPARSE_INDEX_SPACE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPARSE-INDEX-SPACE-INSTANCE");

    private static final SubLSymbol SPARSE_SPATIAL_ELEMENT = makeSymbol("SPARSE-SPATIAL-ELEMENT");

    static private final SubLList $list_alt28 = list(makeSymbol("SPATIAL-ELEMENT"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("REMOVING-SELF"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("SPACE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARENT-SLICE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT-SLICE"), list(makeSymbol("NEW-PARENT-SLICE")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDICES"), NIL, makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-INDEX-P"), list(makeSymbol("SPATIAL-INDEX")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-FROM-INDEXED-SPACE"), NIL, makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")));



    private static final SubLSymbol SPACE = makeSymbol("SPACE");

    private static final SubLSymbol REMOVING_SELF = makeSymbol("REMOVING-SELF");

    public static final SubLInteger $int$4097 = makeInteger(4097);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SPARSE_SPATIAL_ELEMENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPARSE-SPATIAL-ELEMENT-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SPARSE_SPATIAL_ELEMENT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPARSE-SPATIAL-ELEMENT-INSTANCE");



    static private final SubLList $list_alt37 = list(makeSymbol("SPATIAL-SLICE"));

    static private final SubLList $list_alt38 = list(new SubLObject[]{ list(makeSymbol("SPATIAL-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PARENT-SLICE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("ORDERED-SUB-SLICES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STORAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SPATIAL-INDEX"), list(makeSymbol("NEW-SPATIAL-INDEX")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SPATIAL-INDEX"), NIL, makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SPATIAL-ELEMENT"), list(makeSymbol("INDICES"), makeSymbol("SPATIAL-ELEMENT")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SPATIAL-ELEMENT"), list(makeSymbol("SPATIAL-ELEMENT")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SPATIAL-ELEMENTS"), list(makeSymbol("INDICES")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), list(makeSymbol("INDICES")), makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SATISFIES-P"), list(makeSymbol("INDICES")), makeKeyword("PROTECTED"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SPATIAL-ELEMENTS-INTERNAL"), list(makeSymbol("INDICES")), makeKeyword("PROTECTED"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-INDEX-PATH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY"), list(makeSymbol("STREAM")), makeKeyword("PUBLIC")) });





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SPARSE_SPATIAL_SLICE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPARSE-SPATIAL-SLICE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SPARSE_SPATIAL_SLICE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPARSE-SPATIAL-SLICE-INSTANCE");

    private static final SubLSymbol ALLOCATE_ORDERED_INDICES = makeSymbol("ALLOCATE-ORDERED-INDICES");

    static private final SubLList $list_alt44 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt45 = list(makeSymbol("COUNT"));

    static private final SubLList $list_alt46 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INDICES"), NIL)), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("COUNT")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW"), makeSymbol("SELF")), makeSymbol("INDICES"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("INDICES")))));

    private static final SubLSymbol SPARSE_SPATIAL_INDEX_ALLOCATE_ORDERED_INDICES_METHOD = makeSymbol("SPARSE-SPATIAL-INDEX-ALLOCATE-ORDERED-INDICES-METHOD");



    static private final SubLList $list_alt49 = list(makeKeyword("PROTECTED"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"));

    static private final SubLList $list_alt50 = list(list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("LAST-ALLOCATED-INDEX")), list(makeSymbol("CSETQ"), makeSymbol("LAST-ALLOCATED-INDEX"), ZERO_INTEGER), list(makeSymbol("CINC"), makeSymbol("LAST-ALLOCATED-INDEX"))), list(makeSymbol("CSETQ"), makeSymbol("INDEX-VALUE"), makeSymbol("LAST-ALLOCATED-INDEX")), list(makeSymbol("CSETQ"), makeSymbol("PARENT-SLICES"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym51$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-INDEX-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_INDEX_INITIALIZE_METHOD = makeSymbol("SPARSE-SPATIAL-INDEX-INITIALIZE-METHOD");

    private static final SubLSymbol SET_INDEX_VALUE = makeSymbol("SET-INDEX-VALUE");

    static private final SubLList $list_alt54 = list(makeKeyword("PUBLIC"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"));

    static private final SubLList $list_alt55 = list(makeSymbol("NEW-INDEX-VALUE"));

    static private final SubLList $list_alt56 = list(list(makeSymbol("CSETQ"), makeSymbol("INDEX-VALUE"), makeSymbol("NEW-INDEX-VALUE")), list(RET, makeSymbol("NEW-INDEX-VALUE")));

    static private final SubLSymbol $sym57$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-INDEX-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_INDEX_SET_INDEX_VALUE_METHOD = makeSymbol("SPARSE-SPATIAL-INDEX-SET-INDEX-VALUE-METHOD");



    static private final SubLList $list_alt60 = list(makeSymbol("OTHER-INDEX"));

    static private final SubLList $list_alt61 = list(list(RET, list(makeSymbol("="), makeSymbol("INDEX-VALUE"), list(makeSymbol("GET-SPARSE-SPATIAL-INDEX-INDEX-VALUE"), makeSymbol("OTHER-INDEX")))));

    static private final SubLSymbol $sym62$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-INDEX-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_INDEX_EQUAL_P_METHOD = makeSymbol("SPARSE-SPATIAL-INDEX-EQUAL-P-METHOD");

    private static final SubLSymbol LESS_P = makeSymbol("LESS-P");

    static private final SubLList $list_alt65 = list(list(RET, list(makeSymbol("<"), makeSymbol("INDEX-VALUE"), list(makeSymbol("GET-SPARSE-SPATIAL-INDEX-INDEX-VALUE"), makeSymbol("OTHER-INDEX")))));

    static private final SubLSymbol $sym66$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-INDEX-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_INDEX_LESS_P_METHOD = makeSymbol("SPARSE-SPATIAL-INDEX-LESS-P-METHOD");

    private static final SubLSymbol GREATER_P = makeSymbol("GREATER-P");

    static private final SubLList $list_alt69 = list(list(RET, list(makeSymbol(">"), makeSymbol("INDEX-VALUE"), list(makeSymbol("GET-SPARSE-SPATIAL-INDEX-INDEX-VALUE"), makeSymbol("OTHER-INDEX")))));

    static private final SubLSymbol $sym70$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-INDEX-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_INDEX_GREATER_P_METHOD = makeSymbol("SPARSE-SPATIAL-INDEX-GREATER-P-METHOD");

    private static final SubLSymbol REGISTER_PARENT_SLICE = makeSymbol("REGISTER-PARENT-SLICE");

    static private final SubLList $list_alt73 = list(makeSymbol("NEW-PARENT-SLICE"));

    static private final SubLList $list_alt74 = list(list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%PARENT SLICES -> ~S"), makeSymbol("PARENT-SLICES")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%NEW PARENT SLICE -> ~S"), makeSymbol("NEW-PARENT-SLICE")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-PARENT-SLICE"), makeSymbol("PARENT-SLICES")), list(makeSymbol("CPUSH"), makeSymbol("NEW-PARENT-SLICE"), makeSymbol("PARENT-SLICES"))), list(RET, makeSymbol("NEW-PARENT-SLICE")));

    static private final SubLSymbol $sym75$OUTER_CATCH_FOR_SPARSE_SPATIAL_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-INDEX-METHOD");

    static private final SubLString $str_alt76$__PARENT_SLICES_____S = makeString("~%PARENT SLICES -> ~S");

    static private final SubLString $str_alt77$__NEW_PARENT_SLICE_____S = makeString("~%NEW PARENT SLICE -> ~S");

    private static final SubLSymbol SPARSE_SPATIAL_INDEX_REGISTER_PARENT_SLICE_METHOD = makeSymbol("SPARSE-SPATIAL-INDEX-REGISTER-PARENT-SLICE-METHOD");

    private static final SubLSymbol SET_INDICES = makeSymbol("SET-INDICES");

    static private final SubLList $list_alt80 = list(makeSymbol("INDICES"), makeSymbol("&OPTIONAL"), list(makeSymbol("ORDER-AS-SEQUENCED"), T));

    static private final SubLList $list_alt81 = list(list(makeSymbol("PWHEN"), makeSymbol("ORDER-AS-SEQUENCED"), list(makeSymbol("CLET"), list(list(makeSymbol("COUNT"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("INDEX"), makeSymbol("INDICES")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INDEX-VALUE"), makeSymbol("SPARSE-SPATIAL-INDEX")), makeSymbol("INDEX"), makeSymbol("COUNT")), list(makeSymbol("CINC"), makeSymbol("COUNT"))))), list(makeSymbol("CLET"), list(list(makeSymbol("ORDERED-INDICES"), list(makeSymbol("FIF"), makeSymbol("ORDER-AS-SEQUENCED"), makeSymbol("INDICES"), list(makeSymbol("ORDER-INDICES"), makeSymbol("SELF"), makeSymbol("INDICES")))), list(makeSymbol("NEW-SLICE"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("ROOT-SLICES"), NIL), list(makeSymbol("CDOLIST"), list(makeSymbol("INDEX"), makeSymbol("ORDERED-INDICES")), list(makeSymbol("CSETQ"), makeSymbol("NEW-SLICE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SPARSE-SPATIAL-SLICE")), list(QUOTE, makeSymbol("SPARSE-SPATIAL-SLICE")))), list(makeSymbol("SET-SPARSE-SPATIAL-SLICE-PARENT-SLICE"), makeSymbol("NEW-SLICE"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SPATIAL-INDEX"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("NEW-SLICE"), makeSymbol("INDEX")), list(makeSymbol("CPUSH"), makeSymbol("NEW-SLICE"), makeSymbol("ROOT-SLICES"))), list(makeSymbol("CSETQ"), makeSymbol("ROOT-SLICES"), list(makeSymbol("NREVERSE"), makeSymbol("ROOT-SLICES"))), list(RET, makeSymbol("ORDERED-INDICES"))));

    static private final SubLSymbol $sym82$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-INDEX-SPACE-METHOD");

    private static final SubLSymbol SPARSE_INDEX_SPACE_SET_INDICES_METHOD = makeSymbol("SPARSE-INDEX-SPACE-SET-INDICES-METHOD");

    private static final SubLSymbol GET_INDICES = makeSymbol("GET-INDICES");

    static private final SubLList $list_alt85 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INDICES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SLICE"), makeSymbol("ROOT-SLICES")), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-SPATIAL-INDEX"), makeSymbol("SLICE")), makeSymbol("INDICES"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("INDICES")))));

    static private final SubLSymbol $sym86$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-INDEX-SPACE-METHOD");

    private static final SubLSymbol SPARSE_INDEX_SPACE_GET_INDICES_METHOD = makeSymbol("SPARSE-INDEX-SPACE-GET-INDICES-METHOD");

    private static final SubLSymbol ORDER_INDICES = makeSymbol("ORDER-INDICES");

    static private final SubLList $list_alt89 = list(makeSymbol("INDICES"));

    static private final SubLList $list_alt90 = list(list(RET, list(makeSymbol("SORT"), makeSymbol("INDICES"), list(makeSymbol("FQUOTE-METHOD"), list(makeSymbol("LESS-P"), makeSymbol("SPARSE-SPATIAL-INDEX"))))));

    static private final SubLSymbol $sym91$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-INDEX-SPACE-METHOD");

    private static final SubLSymbol SPARSE_INDEX_SPACE_ORDER_INDICES_METHOD = makeSymbol("SPARSE-INDEX-SPACE-ORDER-INDICES-METHOD");

    private static final SubLSymbol ADD_AT_COORDINATE = makeSymbol("ADD-AT-COORDINATE");

    static private final SubLList $list_alt94 = list(makeSymbol("INDICES"), makeSymbol("SPATIAL-ELEMENT"));

    static private final SubLList $list_alt95 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("INDICES"), makeSymbol("SPATIAL-ELEMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("ORDERED-INDICES"), list(makeSymbol("ORDER-INDICES"), makeSymbol("SELF"), makeSymbol("INDICES"))), list(makeSymbol("FIRST-INDEX"), list(makeSymbol("CAR"), makeSymbol("ORDERED-INDICES")))), list(makeSymbol("CDOLIST"), list(makeSymbol("SLICE"), makeSymbol("ROOT-SLICES")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EQUAL-P"), makeSymbol("SPARSE-SPATIAL-INDEX")), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-SPATIAL-INDEX"), makeSymbol("SLICE")), makeSymbol("FIRST-INDEX")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%ADDING SPATIAL-ELEMENT.")), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-SPATIAL-ELEMENT"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("SLICE"), makeSymbol("ORDERED-INDICES"), makeSymbol("SLICE"))))))), list(RET, NIL));

    static private final SubLSymbol $sym96$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-INDEX-SPACE-METHOD");

    static private final SubLString $str_alt97$__ADDING_SPATIAL_ELEMENT_ = makeString("~%ADDING SPATIAL-ELEMENT.");

    private static final SubLSymbol SPARSE_INDEX_SPACE_ADD_AT_COORDINATE_METHOD = makeSymbol("SPARSE-INDEX-SPACE-ADD-AT-COORDINATE-METHOD");

    private static final SubLSymbol GET_AT_COORDINATE = makeSymbol("GET-AT-COORDINATE");

    static private final SubLList $list_alt100 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("INDICES"), makeSymbol("SPATIAL-ELEMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("ORDERED-INDICES"), list(makeSymbol("ORDER-INDICES"), makeSymbol("SELF"), makeSymbol("INDICES"))), list(makeSymbol("FIRST-INDEX"), list(makeSymbol("CAR"), makeSymbol("ORDERED-INDICES")))), list(makeSymbol("CDOLIST"), list(makeSymbol("SLICE"), makeSymbol("ROOT-SLICES")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EQUAL-P"), makeSymbol("SPARSE-SPATIAL-INDEX")), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-SPATIAL-INDEX"), makeSymbol("SLICE")), makeSymbol("FIRST-INDEX")), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SPATIAL-ELEMENTS"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("SLICE"), makeSymbol("ORDERED-INDICES"))))))), list(RET, NIL));

    static private final SubLSymbol $sym101$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-INDEX-SPACE-METHOD");

    private static final SubLSymbol SPARSE_INDEX_SPACE_GET_AT_COORDINATE_METHOD = makeSymbol("SPARSE-INDEX-SPACE-GET-AT-COORDINATE-METHOD");

    private static final SubLSymbol CLEAR_AT_COORDINATE = makeSymbol("CLEAR-AT-COORDINATE");

    static private final SubLList $list_alt104 = list(list(makeSymbol("PWHEN"), makeSymbol("INDICES"), list(makeSymbol("CLET"), list(list(makeSymbol("ORDERED-INDICES"), list(makeSymbol("ORDER-INDICES"), makeSymbol("SELF"), makeSymbol("INDICES"))), list(makeSymbol("FIRST-INDEX"), list(makeSymbol("CAR"), makeSymbol("ORDERED-INDICES")))), list(makeSymbol("CDOLIST"), list(makeSymbol("SLICE"), makeSymbol("ROOT-SLICES")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EQUAL-P"), makeSymbol("SPARSE-SPATIAL-INDEX")), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-SPATIAL-INDEX"), makeSymbol("SLICE")), makeSymbol("FIRST-INDEX")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("SLICE"), makeSymbol("INDICES")))))), list(RET, NIL));

    static private final SubLSymbol $sym105$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-INDEX-SPACE-METHOD");

    private static final SubLSymbol SPARSE_INDEX_SPACE_CLEAR_AT_COORDINATE_METHOD = makeSymbol("SPARSE-INDEX-SPACE-CLEAR-AT-COORDINATE-METHOD");

    private static final SubLSymbol DISPLAY = makeSymbol("DISPLAY");

    static private final SubLList $list_alt108 = list(makeKeyword("PRINT"));

    static private final SubLList $list_alt109 = list(makeSymbol("STREAM"));

    static private final SubLList $list_alt110 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%Root Slices: ~S"), makeSymbol("ROOT-SLICES")), list(makeSymbol("CDOLIST"), list(makeSymbol("ROOT-SLICE"), makeSymbol("ROOT-SLICES")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DISPLAY"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("ROOT-SLICE"), makeSymbol("STREAM"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym111$OUTER_CATCH_FOR_SPARSE_INDEX_SPACE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-INDEX-SPACE-METHOD");

    static private final SubLString $str_alt112$__Root_Slices___S = makeString("~%Root Slices: ~S");

    private static final SubLSymbol SPARSE_INDEX_SPACE_DISPLAY_METHOD = makeSymbol("SPARSE-INDEX-SPACE-DISPLAY-METHOD");

    static private final SubLList $list_alt114 = list(list(makeSymbol("CSETQ"), makeSymbol("REMOVING-SELF"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SPACE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PARENT-SLICE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym115$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-ELEMENT-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_ELEMENT_INITIALIZE_METHOD = makeSymbol("SPARSE-SPATIAL-ELEMENT-INITIALIZE-METHOD");

    private static final SubLSymbol SET_PARENT_SLICE = makeSymbol("SET-PARENT-SLICE");

    static private final SubLList $list_alt118 = list(list(makeSymbol("PWHEN"), makeSymbol("PARENT-SLICE"), list(makeSymbol("REMOVE-FROM-INDEXED-SPACE"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("PARENT-SLICE"), makeSymbol("NEW-PARENT-SLICE")), list(RET, makeSymbol("NEW-PARENT-SLICE")));

    static private final SubLSymbol $sym119$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-ELEMENT-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_ELEMENT_SET_PARENT_SLICE_METHOD = makeSymbol("SPARSE-SPATIAL-ELEMENT-SET-PARENT-SLICE-METHOD");

    static private final SubLList $list_alt121 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INDICES"), NIL), list(makeSymbol("CURRENT-PARENT"), makeSymbol("PARENT-SLICE"))), list(makeSymbol("WHILE"), makeSymbol("CURRENT-PARENT"), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-SPATIAL-INDEX"), makeSymbol("CURRENT-PARENT")), makeSymbol("INDICES")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-PARENT"), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-PARENT-SLICE"), makeSymbol("CURRENT-PARENT")))), list(RET, makeSymbol("INDICES"))));

    static private final SubLSymbol $sym122$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-ELEMENT-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_ELEMENT_GET_INDICES_METHOD = makeSymbol("SPARSE-SPATIAL-ELEMENT-GET-INDICES-METHOD");

    private static final SubLSymbol HAS_INDEX_P = makeSymbol("HAS-INDEX-P");

    static private final SubLList $list_alt125 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-PARENT"), makeSymbol("PARENT-SLICE"))), list(makeSymbol("WHILE"), makeSymbol("CURRENT-PARENT"), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EQUAL-P"), makeSymbol("SPARSE-SPATIAL-INDEX")), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-PARENT-SLICE"), makeSymbol("CURRENT-PARENT")), makeSymbol("SPATIAL-INDEX")), list(RET, T)), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-PARENT"), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-PARENT-SLICE"), makeSymbol("CURRENT-PARENT")))), list(RET, NIL)));

    static private final SubLSymbol $sym126$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-ELEMENT-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_ELEMENT_HAS_INDEX_P_METHOD = makeSymbol("SPARSE-SPATIAL-ELEMENT-HAS-INDEX-P-METHOD");

    private static final SubLSymbol REMOVE_FROM_INDEXED_SPACE = makeSymbol("REMOVE-FROM-INDEXED-SPACE");

    static private final SubLList $list_alt129 = list(makeKeyword("PUBLIC"), makeKeyword("AUTO-UPDATE"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"));

    static private final SubLList $list_alt130 = list(list(makeSymbol("PUNLESS"), makeSymbol("REMOVING-SELF"), list(makeSymbol("CSETQ"), makeSymbol("REMOVING-SELF"), T), list(makeSymbol("PWHEN"), makeSymbol("PARENT-SLICE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE-SPATIAL-ELEMENT"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("PARENT-SLICE"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("REMOVING-SELF"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("PARENT-SLICE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym131$OUTER_CATCH_FOR_SPARSE_SPATIAL_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-ELEMENT-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_ELEMENT_REMOVE_FROM_INDEXED_SPACE_METHOD = makeSymbol("SPARSE-SPATIAL-ELEMENT-REMOVE-FROM-INDEXED-SPACE-METHOD");

    private static final SubLSymbol SET_SPATIAL_INDEX = makeSymbol("SET-SPATIAL-INDEX");

    static private final SubLList $list_alt134 = list(makeSymbol("NEW-SPATIAL-INDEX"));

    static private final SubLList $list_alt135 = list(list(makeSymbol("CSETQ"), makeSymbol("SPATIAL-INDEX"), makeSymbol("NEW-SPATIAL-INDEX")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REGISTER-PARENT-SLICE"), makeSymbol("SPARSE-SPATIAL-INDEX")), makeSymbol("NEW-SPATIAL-INDEX"), makeSymbol("SELF")), list(RET, makeSymbol("NEW-SPATIAL-INDEX")));

    static private final SubLSymbol $sym136$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-SLICE-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_SLICE_SET_SPATIAL_INDEX_METHOD = makeSymbol("SPARSE-SPATIAL-SLICE-SET-SPATIAL-INDEX-METHOD");

    private static final SubLSymbol GET_SPATIAL_INDEX = makeSymbol("GET-SPATIAL-INDEX");

    static private final SubLList $list_alt139 = list(list(RET, makeSymbol("SPATIAL-INDEX")));

    static private final SubLSymbol $sym140$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-SLICE-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_SLICE_GET_SPATIAL_INDEX_METHOD = makeSymbol("SPARSE-SPATIAL-SLICE-GET-SPATIAL-INDEX-METHOD");

    private static final SubLSymbol ADD_SPATIAL_ELEMENT = makeSymbol("ADD-SPATIAL-ELEMENT");

    static private final SubLList $list_alt143 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("INDICES")), list(makeSymbol("CLET"), list(list(makeSymbol("FIRST-INDEX"), list(makeSymbol("CAR"), makeSymbol("INDICES")))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EQUAL-P"), makeSymbol("SPARSE-SPATIAL-INDEX")), makeSymbol("SPATIAL-INDEX"), makeSymbol("FIRST-INDEX")), list(makeSymbol("CLET"), list(list(makeSymbol("SUB-INDICES"), list(makeSymbol("CDR"), makeSymbol("INDICES")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("SUB-INDICES")), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("STORAGE")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("STORAGE"), list(makeSymbol("NEW-DICTIONARY"))), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("STORAGE"), makeSymbol("SPATIAL-ELEMENT"), T), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT-SLICE"), makeSymbol("SPARSE-SPATIAL-ELEMENT")), makeSymbol("SPATIAL-ELEMENT"), makeSymbol("SELF")), list(RET, makeSymbol("SPATIAL-ELEMENT"))), list(makeSymbol("PROGN"), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("STORAGE"), makeSymbol("SPATIAL-ELEMENT"), T), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT-SLICE"), makeSymbol("SPARSE-SPATIAL-ELEMENT")), makeSymbol("SPATIAL-ELEMENT"), makeSymbol("SELF")), list(RET, makeSymbol("SPATIAL-ELEMENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("SECOND-INDEX"), list(makeSymbol("CAR"), makeSymbol("SUB-INDICES")))), list(makeSymbol("PIF"), makeSymbol("ORDERED-SUB-SLICES"), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-SUB-SLICE"), list(makeSymbol("CAR"), makeSymbol("ORDERED-SUB-SLICES"))), list(makeSymbol("CURRENT-INDEX"), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-SPATIAL-INDEX"), makeSymbol("CURRENT-SUB-SLICE")))), list(makeSymbol("PIF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EQUAL-P"), makeSymbol("SPARSE-SPATIAL-INDEX")), makeSymbol("SECOND-INDEX"), makeSymbol("CURRENT-INDEX")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-SPATIAL-ELEMENT"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("CURRENT-SUB-SLICE"), makeSymbol("SUB-INDICES"), makeSymbol("SPATIAL-ELEMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("PREVIOUS-CONS"), makeSymbol("ORDERED-SUB-SLICES")), list(makeSymbol("CURRENT-SUBLIST"), list(makeSymbol("CDR"), makeSymbol("ORDERED-SUB-SLICES")))), list(makeSymbol("WHILE"), makeSymbol("CURRENT-SUBLIST"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-SPATIAL-INDEX"), list(makeSymbol("CAR"), makeSymbol("CURRENT-SUBLIST")))), list(makeSymbol("PIF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LESS-P"), makeSymbol("SPARSE-SPATIAL-INDEX")), makeSymbol("SECOND-INDEX"), makeSymbol("CURRENT-INDEX")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("PREVIOUS-CONS"), makeSymbol("CURRENT-SUBLIST")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SUBLIST"), list(makeSymbol("CDR"), makeSymbol("CURRENT-SUBLIST")))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-SLICE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SPARSE-SPATIAL-SLICE")), list(QUOTE, makeSymbol("SPARSE-SPATIAL-SLICE"))))), list(makeSymbol("SET-SPARSE-SPATIAL-SLICE-PARENT-SLICE"), makeSymbol("NEW-SLICE"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SPATIAL-INDEX"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("NEW-SLICE"), makeSymbol("SECOND-INDEX")), list(makeSymbol("RPLACD"), makeSymbol("PREVIOUS-CONS"), list(makeSymbol("CONS"), makeSymbol("NEW-SLICE"), makeSymbol("CURRENT-SUBLIST"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-SPATIAL-ELEMENT"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("NEW-SLICE"), list(makeSymbol("CDR"), makeSymbol("SUB-INDICES")), makeSymbol("SPATIAL-ELEMENT")), list(RET, makeSymbol("SPATIAL-ELEMENT"))))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-SLICE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SPARSE-SPATIAL-SLICE")), list(QUOTE, makeSymbol("SPARSE-SPATIAL-SLICE"))))), list(makeSymbol("SET-SPARSE-SPATIAL-SLICE-PARENT-SLICE"), makeSymbol("NEW-SLICE"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SPATIAL-INDEX"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("NEW-SLICE"), makeSymbol("SECOND-INDEX")), list(makeSymbol("RPLACD"), makeSymbol("PREVIOUS-CONS"), list(makeSymbol("CONS"), makeSymbol("NEW-SLICE"), makeSymbol("CURRENT-SUBLIST"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-SPATIAL-ELEMENT"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("NEW-SLICE"), list(makeSymbol("CDR"), makeSymbol("SUB-INDICES")), makeSymbol("SPATIAL-ELEMENT")), list(RET, makeSymbol("SPATIAL-ELEMENT")))))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-SLICE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SPARSE-SPATIAL-SLICE")), list(QUOTE, makeSymbol("SPARSE-SPATIAL-SLICE"))))), list(makeSymbol("SET-SPARSE-SPATIAL-SLICE-PARENT-SLICE"), makeSymbol("NEW-SLICE"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SPATIAL-INDEX"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("NEW-SLICE"), makeSymbol("SECOND-INDEX")), list(makeSymbol("CSETQ"), makeSymbol("ORDERED-SUB-SLICES"), list(makeSymbol("LIST"), makeSymbol("NEW-SLICE"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-SPATIAL-ELEMENT"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("NEW-SLICE"), list(makeSymbol("CDR"), makeSymbol("SUB-INDICES")), makeSymbol("SPATIAL-ELEMENT")), list(RET, makeSymbol("SPATIAL-ELEMENT")))))))))), list(RET, NIL));

    static private final SubLSymbol $sym144$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-SLICE-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_SLICE_ADD_SPATIAL_ELEMENT_METHOD = makeSymbol("SPARSE-SPATIAL-SLICE-ADD-SPATIAL-ELEMENT-METHOD");

    private static final SubLSymbol REMOVE_SPATIAL_ELEMENT = makeSymbol("REMOVE-SPATIAL-ELEMENT");

    static private final SubLList $list_alt147 = list(list(makeSymbol("PWHEN"), makeSymbol("SPATIAL-ELEMENT"), list(makeSymbol("PWHEN"), makeSymbol("STORAGE"), list(makeSymbol("DICTIONARY-REMOVE"), makeSymbol("STORAGE"), makeSymbol("SPATIAL-ELEMENT"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE-FROM-INDEXED-SPACE"), makeSymbol("SPARSE-SPATIAL-ELEMENT")), makeSymbol("SPATIAL-ELEMENT")), list(RET, makeSymbol("SPATIAL-ELEMENT"))), list(RET, NIL));

    static private final SubLSymbol $sym148$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-SLICE-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_SLICE_REMOVE_SPATIAL_ELEMENT_METHOD = makeSymbol("SPARSE-SPATIAL-SLICE-REMOVE-SPATIAL-ELEMENT-METHOD");

    private static final SubLSymbol GET_SPATIAL_ELEMENTS = makeSymbol("GET-SPATIAL-ELEMENTS");

    static private final SubLList $list_alt151 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-SLICES-WITH-INDEX"), list(makeSymbol("GET-SPARSE-SPATIAL-INDEX-PARENT-SLICES"), makeSymbol("SPATIAL-INDEX"))), list(makeSymbol("SATISFIED-ELEMENTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SLICE"), makeSymbol("ALL-SLICES-WITH-INDEX")), list(makeSymbol("CSETQ"), makeSymbol("SATISFIED-ELEMENTS"), list(makeSymbol("NCONC"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SPATIAL-ELEMENTS-INTERNAL"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("SLICE"), makeSymbol("INDICES")), makeSymbol("SATISFIED-ELEMENTS")))), list(RET, makeSymbol("SATISFIED-ELEMENTS"))));

    static private final SubLSymbol $sym152$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-SLICE-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_SLICE_GET_SPATIAL_ELEMENTS_METHOD = makeSymbol("SPARSE-SPATIAL-SLICE-GET-SPATIAL-ELEMENTS-METHOD");



    static private final SubLList $list_alt155 = list(list(makeSymbol("PWHEN"), makeSymbol("INDICES"), list(makeSymbol("CLET"), list(list(makeSymbol("FIRST-INDEX"), list(makeSymbol("CAR"), makeSymbol("INDICES"))), list(makeSymbol("OTHER-INDICES"), list(makeSymbol("CDR"), makeSymbol("INDICES")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("OTHER-INDICES")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("STORAGE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EQUAL-P"), makeSymbol("SPARSE-SPATIAL-INDEX")), makeSymbol("SPATIAL-INDEX"), makeSymbol("FIRST-INDEX"))), list(makeSymbol("CLEAR-DICTIONARY"), makeSymbol("STORAGE"))), list(makeSymbol("PWHEN"), makeSymbol("ORDERED-SUB-SLICES"), list(makeSymbol("CLET"), list(list(makeSymbol("SECOND-INDEX"), list(makeSymbol("CAR"), makeSymbol("OTHER-INDICES")))), list(makeSymbol("CDOLIST"), list(makeSymbol("SLICE"), makeSymbol("ORDERED-SUB-SLICES")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EQUAL-P"), makeSymbol("SPARSE-SPATIAL-INDEX")), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-SPATIAL-INDEX"), makeSymbol("SLICE")), makeSymbol("SECOND-INDEX")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("SLICE"), makeSymbol("OTHER-INDICES")), list(RET, NIL)))))))), list(RET, NIL));

    static private final SubLSymbol $sym156$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-SLICE-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_SLICE_CLEAR_METHOD = makeSymbol("SPARSE-SPATIAL-SLICE-CLEAR-METHOD");

    private static final SubLSymbol SATISFIES_P = makeSymbol("SATISFIES-P");

    static private final SubLList $list_alt159 = list(list(makeSymbol("CLET"), list(list(makeSymbol("COPY-OF-INDICES"), list(makeSymbol("COPY-LIST"), makeSymbol("INDICES"))), list(makeSymbol("CURRENT-SLICE"), makeSymbol("SELF"))), list(makeSymbol("WHILE"), makeSymbol("CURRENT-SLICE"), list(makeSymbol("CSETQ"), makeSymbol("COPY-OF-INDICES"), list(makeSymbol("DELETE"), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-SPATIAL-INDEX"), makeSymbol("CURRENT-SLICE")), makeSymbol("COPY-OF-INDICES"), list(makeSymbol("FUNCTION"), makeSymbol("SPARSE-SPATIAL-INDEX-EQUAL-P-METHOD")))), list(makeSymbol("PUNLESS"), makeSymbol("COPY-OF-INDICES"), list(RET, T)), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SLICE"), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-PARENT-SLICE"), makeSymbol("CURRENT-SLICE")))), list(RET, NIL)));

    static private final SubLSymbol $sym160$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-SLICE-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_SLICE_SATISFIES_P_METHOD = makeSymbol("SPARSE-SPATIAL-SLICE-SATISFIES-P-METHOD");

    private static final SubLSymbol GET_SPATIAL_ELEMENTS_INTERNAL = makeSymbol("GET-SPATIAL-ELEMENTS-INTERNAL");

    static private final SubLList $list_alt163 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SATISFIED-ELEMENTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SUB-SLICE"), makeSymbol("ORDERED-SUB-SLICES")), list(makeSymbol("CSETQ"), makeSymbol("SATISFIED-ELEMENTS"), list(makeSymbol("NCONC"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SPATIAL-ELEMENTS-INTERNAL"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("SUB-SLICE"), makeSymbol("INDICES")), makeSymbol("SATISFIED-ELEMENTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("SATISFIES-P"), makeSymbol("SELF"), makeSymbol("INDICES")), list(makeSymbol("PWHEN"), makeSymbol("STORAGE"), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("ELEMENT"), makeSymbol("VALUE"), makeSymbol("STORAGE")), list(makeSymbol("IGNORE"), makeSymbol("VALUE")), list(makeSymbol("CPUSH"), makeSymbol("ELEMENT"), makeSymbol("SATISFIED-ELEMENTS"))))), list(RET, makeSymbol("SATISFIED-ELEMENTS"))));

    static private final SubLSymbol $sym164$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-SLICE-METHOD");

    private static final SubLSymbol SPARSE_SPATIAL_SLICE_GET_SPATIAL_ELEMENTS_INTERNAL_METHOD = makeSymbol("SPARSE-SPATIAL-SLICE-GET-SPATIAL-ELEMENTS-INTERNAL-METHOD");

    private static final SubLSymbol COMPUTE_INDEX_PATH = makeSymbol("COMPUTE-INDEX-PATH");

    static private final SubLList $list_alt167 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PATH"), NIL), list(makeSymbol("CURRENT-SLICE"), makeSymbol("SELF"))), list(makeSymbol("WHILE"), makeSymbol("CURRENT-SLICE"), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-SPATIAL-INDEX"), makeSymbol("CURRENT-SLICE")), makeSymbol("PATH")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SLICE"), list(makeSymbol("GET-SPARSE-SPATIAL-SLICE-PARENT-SLICE"), makeSymbol("CURRENT-SLICE")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("PATH")))));

    private static final SubLSymbol SPARSE_SPATIAL_SLICE_COMPUTE_INDEX_PATH_METHOD = makeSymbol("SPARSE-SPATIAL-SLICE-COMPUTE-INDEX-PATH-METHOD");

    static private final SubLList $list_alt169 = list(list(makeSymbol("PUNLESS"), makeSymbol("STORAGE"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%Slice ~S has no storage."), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), makeSymbol("STORAGE"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%Elements at index: ~S"), list(makeSymbol("COMPUTE-INDEX-PATH"), makeSymbol("SELF"))), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("ELEMENT"), makeSymbol("VALUE"), makeSymbol("STORAGE")), list(makeSymbol("IGNORE"), makeSymbol("VALUE")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%  ~S"), makeSymbol("ELEMENT")))), list(makeSymbol("PUNLESS"), makeSymbol("ORDERED-SUB-SLICES"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%Slice ~S has no sub-slices."), makeSymbol("SELF"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SUB-SLICE"), makeSymbol("ORDERED-SUB-SLICES")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DISPLAY"), makeSymbol("SPARSE-SPATIAL-SLICE")), makeSymbol("SUB-SLICE"), makeSymbol("STREAM"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym170$OUTER_CATCH_FOR_SPARSE_SPATIAL_SLICE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPARSE-SPATIAL-SLICE-METHOD");

    static private final SubLString $str_alt171$__Slice__S_has_no_storage_ = makeString("~%Slice ~S has no storage.");

    static private final SubLString $str_alt172$__Elements_at_index___S = makeString("~%Elements at index: ~S");

    static private final SubLString $str_alt173$_____S = makeString("~%  ~S");

    static private final SubLString $str_alt174$__Slice__S_has_no_sub_slices_ = makeString("~%Slice ~S has no sub-slices.");

    private static final SubLSymbol SPARSE_SPATIAL_SLICE_DISPLAY_METHOD = makeSymbol("SPARSE-SPATIAL-SLICE-DISPLAY-METHOD");

    private static final SubLSymbol TEST_INDEX = makeSymbol("TEST-INDEX");

    static private final SubLList $list_alt177 = list(list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NAME"), list(makeSymbol("NEW-NAME"))));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_INDEX_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-INDEX-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_INDEX_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-INDEX-INSTANCE");



    static private final SubLList $list_alt182 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt183 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S"), makeSymbol("NAME")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym184$OUTER_CATCH_FOR_TEST_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-INDEX-METHOD");

    static private final SubLString $str_alt185$_S = makeString("~S");

    private static final SubLSymbol TEST_INDEX_PRINT_METHOD = makeSymbol("TEST-INDEX-PRINT-METHOD");



    static private final SubLList $list_alt188 = list(makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"));

    static private final SubLList $list_alt189 = list(makeSymbol("NEW-NAME"));

    static private final SubLList $list_alt190 = list(list(makeSymbol("PWHEN"), makeSymbol("NAME"), list(makeSymbol("REMPROP"), makeSymbol("NAME"), makeKeyword("TEST-INDEX"))), list(makeSymbol("PWHEN"), makeSymbol("NEW-NAME"), list(makeSymbol("PUT"), makeSymbol("NEW-NAME"), makeKeyword("TEST-INDEX"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeSymbol("NEW-NAME")));

    static private final SubLSymbol $sym191$OUTER_CATCH_FOR_TEST_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-INDEX-METHOD");

    private static final SubLSymbol $TEST_INDEX = makeKeyword("TEST-INDEX");

    private static final SubLSymbol TEST_INDEX_SET_NAME_METHOD = makeSymbol("TEST-INDEX-SET-NAME-METHOD");

    private static final SubLSymbol TEST_ELEMENT = makeSymbol("TEST-ELEMENT");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_ELEMENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-ELEMENT-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_ELEMENT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-ELEMENT-INSTANCE");

    static private final SubLSymbol $sym197$OUTER_CATCH_FOR_TEST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-ELEMENT-METHOD");

    private static final SubLSymbol TEST_ELEMENT_PRINT_METHOD = makeSymbol("TEST-ELEMENT-PRINT-METHOD");

    static private final SubLList $list_alt199 = list(list(makeSymbol("PWHEN"), makeSymbol("NAME"), list(makeSymbol("REMPROP"), makeSymbol("NAME"), makeKeyword("TEST-ELEMENT"))), list(makeSymbol("PWHEN"), makeSymbol("NEW-NAME"), list(makeSymbol("PUT"), makeSymbol("NEW-NAME"), makeKeyword("TEST-ELEMENT"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeSymbol("NEW-NAME")));

    static private final SubLSymbol $sym200$OUTER_CATCH_FOR_TEST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-ELEMENT-METHOD");

    private static final SubLSymbol $TEST_ELEMENT = makeKeyword("TEST-ELEMENT");

    private static final SubLSymbol TEST_ELEMENT_SET_NAME_METHOD = makeSymbol("TEST-ELEMENT-SET-NAME-METHOD");



    static private final SubLString $str_alt204$____ = makeString("~%> ");





    private static final SubLSymbol START_MONITORING = makeSymbol("START-MONITORING");

    private static final SubLSymbol TEST_INDEX_GIVEN_NAME = makeSymbol("TEST-INDEX-GIVEN-NAME");

    static private final SubLList $list_alt209 = list(new SubLObject[]{ makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E"), makeSymbol("F"), makeSymbol("G"), makeSymbol("H"), makeSymbol("I"), makeSymbol("J"), makeSymbol("K"), makeSymbol("L"), makeSymbol("M"), makeSymbol("N"), makeSymbol("O"), makeSymbol("P"), makeSymbol("Q"), makeSymbol("R"), makeSymbol("S"), T, makeSymbol("U"), makeSymbol("V"), makeSymbol("W"), makeSymbol("X"), makeSymbol("Y"), makeSymbol("Z") });



    private static final SubLSymbol STOP_MONITORING = makeSymbol("STOP-MONITORING");

    // // Initializers
    public void declareFunctions() {
        declare_index_space_file();
    }

    public void initializeVariables() {
        init_index_space_file();
    }

    public void runTopLevelForms() {
        setup_index_space_file();
    }
}

