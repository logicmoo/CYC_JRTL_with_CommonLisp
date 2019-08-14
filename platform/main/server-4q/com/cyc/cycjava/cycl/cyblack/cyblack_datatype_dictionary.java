/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.subloop_collections;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-DATATYPE-DICTIONARY
 *  source file: /cyc/top/cycl/cyblack/cyblack-datatype-dictionary.lisp
 *  created:     2019/07/03 17:38:48
 */
public final class cyblack_datatype_dictionary extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_datatype_dictionary() {
    }

    public static final SubLFile me = new cyblack_datatype_dictionary();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_datatype_dictionary";

    // // Definitions
    public static final SubLObject cyblack_datatype_dictionary_p(SubLObject v_cyblack_datatype_dictionary) {
        return interfaces.subloop_instanceof_interface(v_cyblack_datatype_dictionary, CYBLACK_DATATYPE_DICTIONARY);
    }

    // defparameter
    private static final SubLSymbol $cyblack_datatype_dictionary_invalid_dictionary_message$ = makeSymbol("*CYBLACK-DATATYPE-DICTIONARY-INVALID-DICTIONARY-MESSAGE*");

    // defparameter
    private static final SubLSymbol $cyblack_datatype_dictionary_invalid_datatype_name_message$ = makeSymbol("*CYBLACK-DATATYPE-DICTIONARY-INVALID-DATATYPE-NAME-MESSAGE*");

    public static final SubLObject cyblack_declare_root_type(SubLObject datatype_dictionary, SubLObject datatype_name, SubLObject root_posting_class, SubLObject root_panel_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_dictionary_p(datatype_dictionary)) {
                    Errors.error($str_alt4$CYBLACK_DECLARE_ROOT_TYPE___S_is_, datatype_dictionary);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!datatype_name.isString()) {
                    Errors.error($str_alt5$CYBLACK_DECLARE_ROOT_TYPE___S_is_, datatype_name);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != root_posting_class) && root_posting_class.isSymbol())) {
                    Errors.error($str_alt6$CYBLACK_DECLARE_ROOT_TYPE___S_is_, root_posting_class);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != root_panel_class) && root_panel_class.isSymbol())) {
                    Errors.error($str_alt7$CYBLACK_DECLARE_ROOT_TYPE___S_is_, root_panel_class);
                }
            }
            {
                SubLObject datatype = cyblack_datatype_dictionary_intern(datatype_dictionary, datatype_name, UNPROVIDED);
                cyblack_datatype.cyblack_datatype_set_posting_type(datatype, root_posting_class);
                cyblack_datatype.cyblack_datatype_set_panel_type(datatype, root_panel_class);
                return datatype;
            }
        }
    }

    public static final SubLObject cyblack_subtype_relation_tree_p(SubLObject v_object) {
        if (v_object.isCons()) {
            {
                SubLObject head = v_object.first();
                SubLObject tail = v_object.rest();
                if (head.isString()) {
                    if (tail.isList()) {
                        {
                            SubLObject cdolist_list_var = tail;
                            SubLObject subtree = NIL;
                            for (subtree = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subtree = cdolist_list_var.first()) {
                                if (subtree.isList()) {
                                    if (NIL == cyblack_subtype_relation_tree_p(subtree)) {
                                        return NIL;
                                    }
                                } else
                                    if (!subtree.isString()) {
                                        return NIL;
                                    }

                            }
                            return T;
                        }
                    } else {
                        return NIL;
                    }
                } else {
                    return NIL;
                }
            }
        } else {
            return NIL;
        }
    }

    public static final SubLObject cyblack_declare_subtype_relation_by_names(SubLObject datatype_dictionary, SubLObject sub_datatype_name, SubLObject super_datatype_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_dictionary_p(datatype_dictionary)) {
                    Errors.error($cyblack_datatype_dictionary_invalid_dictionary_message$.getDynamicValue(thread), CYBLACK_DECLARE_SUBTYPE_RELATION_BY_NAMES, datatype_dictionary);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!sub_datatype_name.isString()) {
                    Errors.error($cyblack_datatype_dictionary_invalid_datatype_name_message$.getDynamicValue(thread), CYBLACK_DECLARE_SUBTYPE_RELATION_BY_NAMES, sub_datatype_name);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!super_datatype_name.isString()) {
                    Errors.error($cyblack_datatype_dictionary_invalid_datatype_name_message$.getDynamicValue(thread), CYBLACK_DECLARE_SUBTYPE_RELATION_BY_NAMES, super_datatype_name);
                }
            }
            {
                SubLObject sub_datatype = cyblack_datatype_dictionary_intern(datatype_dictionary, sub_datatype_name, UNPROVIDED);
                SubLObject super_datatype = cyblack_datatype_dictionary_intern(datatype_dictionary, super_datatype_name, UNPROVIDED);
                return cyblack_datatype.cyblack_declare_subtype_relation(sub_datatype, super_datatype);
            }
        }
    }

    public static final SubLObject cyblack_declare_subtype_relation_tree_by_names(SubLObject datatype_dictionary, SubLObject subtype_relation_tree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_dictionary_p(datatype_dictionary)) {
                    Errors.error($cyblack_datatype_dictionary_invalid_dictionary_message$.getDynamicValue(thread), CYBLACK_DECLARE_SUBTYPE_RELATION_TREE_BY_NAMES, datatype_dictionary);
                }
            }
            return cyblack_declare_subtype_relation_tree_by_names_internal(datatype_dictionary, subtype_relation_tree);
        }
    }

    public static final SubLObject cyblack_declare_subtype_relation_tree_by_names_internal(SubLObject datatype_dictionary, SubLObject subtype_relation_tree) {
        if (subtype_relation_tree.isCons()) {
            {
                SubLObject supertype = subtype_relation_tree.first();
                SubLObject subtype_trees = subtype_relation_tree.rest();
                SubLObject cdolist_list_var = subtype_trees;
                SubLObject subtype_tree = NIL;
                for (subtype_tree = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subtype_tree = cdolist_list_var.first()) {
                    if (subtype_tree.isString()) {
                        cyblack_declare_subtype_relation_by_names(datatype_dictionary, subtype_tree, supertype);
                    } else
                        if (subtype_tree.isCons()) {
                            cyblack_declare_subtype_relation_by_names(datatype_dictionary, subtype_tree.first(), supertype);
                            cyblack_declare_subtype_relation_tree_by_names_internal(datatype_dictionary, subtype_tree);
                        }

                }
                return T;
            }
        } else {
            return NIL;
        }
    }

    public static final SubLObject cyblack_datatype_name_set_panel_and_posting_types(SubLObject v_dictionary, SubLObject datatype_name, SubLObject panel_type, SubLObject posting_type) {
        {
            SubLObject datatype = cyblack_datatype_dictionary_intern(v_dictionary, datatype_name, UNPROVIDED);
            return cyblack_datatype.cyblack_datatype_set_panel_and_posting_types(datatype, panel_type, posting_type);
        }
    }

    public static final SubLObject cyblack_datatype_name_set_panel_and_posting_type_triplets(SubLObject v_dictionary, SubLObject triplets) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datatype_name = NIL;
                SubLObject panel_type = NIL;
                SubLObject posting_type = NIL;
                SubLObject cdolist_list_var = triplets;
                SubLObject triplet = NIL;
                for (triplet = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triplet = cdolist_list_var.first()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!((((((triplet.isCons() && triplet.first().isString()) && triplet.rest().isCons()) && (NIL != cyblack_utilities.non_null_symbol_p(triplet.rest().first()))) && triplet.rest().rest().isCons()) && (NIL != cyblack_utilities.non_null_symbol_p(triplet.rest().rest().first()))) && (NIL == triplet.rest().rest().rest()))) {
                            Errors.error($str_alt10$CYBLACK_DATATYPE_NAME_SET_PANEL_A, triplet);
                        }
                    }
                    datatype_name = triplet.first();
                    panel_type = second(triplet);
                    posting_type = third(triplet);
                    cyblack_datatype_name_set_panel_and_posting_types(v_dictionary, datatype_name, panel_type, posting_type);
                }
            }
            return T;
        }
    }

    public static final SubLObject get_cyblack_basic_datatype_dictionary_dictionary(SubLObject cyblack_basic_datatype_dictionary) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_datatype_dictionary, FIVE_INTEGER, DICTIONARY);
    }

    public static final SubLObject set_cyblack_basic_datatype_dictionary_dictionary(SubLObject cyblack_basic_datatype_dictionary, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_datatype_dictionary, value, FIVE_INTEGER, DICTIONARY);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_datatype_dictionary_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_datatype_dictionary_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DATATYPE_DICTIONARY, DICTIONARY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_datatype_dictionary_p(SubLObject cyblack_basic_datatype_dictionary) {
        return classes.subloop_instanceof_class(cyblack_basic_datatype_dictionary, CYBLACK_BASIC_DATATYPE_DICTIONARY);
    }

    public static final SubLObject cyblack_basic_datatype_dictionary_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_dictionary_method = NIL;
            SubLObject v_dictionary = get_cyblack_basic_datatype_dictionary_dictionary(self);
            try {
                try {
                    cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
                    v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                    sublisp_throw($sym30$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_dictionary_dictionary(self, v_dictionary);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_dictionary_method = Errors.handleThrowable(ccatch_env_var, $sym30$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD);
            }
            return catch_var_for_cyblack_basic_datatype_dictionary_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_dictionary_intern_method(SubLObject self, SubLObject name, SubLObject datatype) {
        if (datatype == UNPROVIDED) {
            datatype = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_basic_datatype_dictionary_method = NIL;
            SubLObject v_dictionary = get_cyblack_basic_datatype_dictionary_dictionary(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (NIL != datatype) {
                        {
                            SubLObject lockable = self;
                            SubLObject seizer = self;
                            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(lockable);
                            try {
                                {
                                    SubLObject lock_1 = lock;
                                    SubLObject release = NIL;
                                    try {
                                        release = seize_lock(lock_1);
                                        cyblack_lockable.set_cyblack_basic_lockable_owner(lockable, seizer);
                                        cyblack_datatype.cyblack_basic_datatype_set_typename_method(datatype, name);
                                        dictionary.dictionary_enter(v_dictionary, name, datatype);
                                    } finally {
                                        if (NIL != release) {
                                            release_lock(lock_1);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        cyblack_lockable.set_cyblack_basic_lockable_owner(lockable, NIL);
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                            sublisp_throw($sym36$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD, datatype);
                        }
                    } else {
                        {
                            SubLObject in_dictionary = dictionary.dictionary_lookup(v_dictionary, name, NIL);
                            if (NIL == in_dictionary) {
                                if (NIL != application) {
                                    in_dictionary = methods.funcall_instance_method_with_1_args(application, NEW_COMPONENT, CYBLACK_BASIC_DATATYPE);
                                } else {
                                    in_dictionary = object.object_new_method(CYBLACK_BASIC_DATATYPE);
                                }
                                cyblack_datatype.cyblack_basic_datatype_set_typename_method(in_dictionary, name);
                                dictionary.dictionary_enter(v_dictionary, name, in_dictionary);
                            }
                            sublisp_throw($sym36$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD, in_dictionary);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_dictionary_dictionary(self, v_dictionary);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_dictionary_method = Errors.handleThrowable(ccatch_env_var, $sym36$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD);
            }
            return catch_var_for_cyblack_basic_datatype_dictionary_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_dictionary_interned_p_method(SubLObject self, SubLObject name) {
        {
            SubLObject v_dictionary = get_cyblack_basic_datatype_dictionary_dictionary(self);
            return NIL != dictionary.dictionary_lookup(v_dictionary, name, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
        }
    }

    public static final SubLObject cyblack_basic_datatype_dictionary_remove_by_name_method(SubLObject self, SubLObject name) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_dictionary_method = NIL;
            SubLObject v_dictionary = get_cyblack_basic_datatype_dictionary_dictionary(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        SubLObject lockable = self;
                        SubLObject seizer = self;
                        SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(lockable);
                        try {
                            {
                                SubLObject lock_2 = lock;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock_2);
                                    cyblack_lockable.set_cyblack_basic_lockable_owner(lockable, seizer);
                                    result = dictionary.dictionary_remove(v_dictionary, name);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock_2);
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    cyblack_lockable.set_cyblack_basic_lockable_owner(lockable, NIL);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        sublisp_throw($sym47$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_dictionary_dictionary(self, v_dictionary);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_dictionary_method = Errors.handleThrowable(ccatch_env_var, $sym47$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD);
            }
            return catch_var_for_cyblack_basic_datatype_dictionary_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_dictionary_remove_method(SubLObject self, SubLObject datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype.cyblack_basic_datatype_p(datatype)) {
                    Errors.error($str_alt52$_REMOVE__S____S_must_be_an_instan, self, datatype);
                }
            }
            {
                SubLObject result = NIL;
                result = cyblack_basic_datatype_dictionary_remove_by_name_method(self, cyblack_datatype.cyblack_basic_datatype_get_typename_method(datatype));
                return result;
            }
        }
    }

    public static final SubLObject cyblack_basic_datatype_dictionary_clear_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_dictionary_method = NIL;
            SubLObject v_dictionary = get_cyblack_basic_datatype_dictionary_dictionary(self);
            try {
                try {
                    {
                        SubLObject lockable = self;
                        SubLObject seizer = self;
                        SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(lockable);
                        try {
                            {
                                SubLObject lock_3 = lock;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock_3);
                                    cyblack_lockable.set_cyblack_basic_lockable_owner(lockable, seizer);
                                    dictionary.clear_dictionary(v_dictionary);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock_3);
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    cyblack_lockable.set_cyblack_basic_lockable_owner(lockable, NIL);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        sublisp_throw($sym56$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_dictionary_dictionary(self, v_dictionary);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_dictionary_method = Errors.handleThrowable(ccatch_env_var, $sym56$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD);
            }
            return catch_var_for_cyblack_basic_datatype_dictionary_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_dictionary_instantiate_panels_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_datatype_dictionary_method = NIL;
                SubLObject v_dictionary = get_cyblack_basic_datatype_dictionary_dictionary(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                            format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt61$__Entered__INSTANTIATE_PANELS__S_, self);
                        }
                        if (NIL != v_dictionary) {
                            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt62$___INSTANTIATE_PANELS__S___Has_di, self);
                            }
                            {
                                SubLObject root_panels = NIL;
                                SubLObject instantiated_panels = NIL;
                                SubLObject application_4 = cyblack_object.cyblack_object_get_application_method(self);
                                SubLObject blackboard = (NIL != application_4) ? ((SubLObject) (cyblack_application.cyblack_application_get_blackboard(application_4))) : NIL;
                                SubLObject instantiated_panel = NIL;
                                SubLObject superpanel = NIL;
                                SubLObject subpanel = NIL;
                                SubLObject supertypes = NIL;
                                SubLObject subtypes = NIL;
                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject datatype_name = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        SubLObject datatype = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        instantiated_panel = cyblack_panel.cyblack_panel_given_datatype(datatype, instantiated_panels);
                                        if (NIL == instantiated_panel) {
                                            instantiated_panel = cyblack_datatype.cyblack_datatype_create_panel(datatype, blackboard);
                                            instantiated_panels = cons(instantiated_panel, instantiated_panels);
                                            supertypes = cyblack_datatype.cyblack_datatype_get_supertypes(datatype);
                                            if (NIL == supertypes) {
                                                root_panels = cons(instantiated_panel, root_panels);
                                            }
                                            subtypes = cyblack_datatype.cyblack_datatype_get_subtypes(datatype);
                                            {
                                                SubLObject cdolist_list_var = supertypes;
                                                SubLObject supertype = NIL;
                                                for (supertype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supertype = cdolist_list_var.first()) {
                                                    superpanel = cyblack_panel.cyblack_panel_given_datatype(supertype, instantiated_panels);
                                                    if (NIL != superpanel) {
                                                        cyblack_panel_dispatch_functions.cyblack_panel_add_super_panel(instantiated_panel, superpanel);
                                                        cyblack_panel_dispatch_functions.cyblack_panel_add_sub_panel(superpanel, instantiated_panel);
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = subtypes;
                                                SubLObject subtype = NIL;
                                                for (subtype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subtype = cdolist_list_var.first()) {
                                                    subpanel = cyblack_panel.cyblack_panel_given_datatype(subtype, instantiated_panels);
                                                    if (NIL != subpanel) {
                                                        cyblack_panel_dispatch_functions.cyblack_panel_add_sub_panel(instantiated_panel, subpanel);
                                                        cyblack_panel_dispatch_functions.cyblack_panel_add_super_panel(subpanel, instantiated_panel);
                                                    }
                                                }
                                            }
                                        }
                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                    }
                                } 
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                sublisp_throw($sym60$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD, root_panels);
                            }
                        }
                        sublisp_throw($sym60$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_datatype_dictionary_dictionary(self, v_dictionary);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_datatype_dictionary_method = Errors.handleThrowable(ccatch_env_var, $sym60$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD);
                }
                return catch_var_for_cyblack_basic_datatype_dictionary_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_datatype_dictionary_instantiate_panel_method(SubLObject self, SubLObject type_name) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_dictionary_method = NIL;
            SubLObject v_dictionary = get_cyblack_basic_datatype_dictionary_dictionary(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (NIL != v_dictionary) {
                        {
                            SubLObject datatype = dictionary.dictionary_lookup(v_dictionary, type_name, UNPROVIDED);
                            SubLObject blackboard = (NIL != application) ? ((SubLObject) (cyblack_application.cyblack_application_get_blackboard(application))) : NIL;
                            SubLObject new_panel = NIL;
                            SubLObject subtypes = NIL;
                            SubLObject subpanel = NIL;
                            SubLObject supertypes = NIL;
                            SubLObject superpanel = NIL;
                            if ((NIL != datatype) && (NIL != blackboard)) {
                                new_panel = cyblack_datatype.cyblack_datatype_create_panel(datatype, blackboard);
                                supertypes = cyblack_datatype.cyblack_datatype_get_supertypes(datatype);
                                {
                                    SubLObject cdolist_list_var = supertypes;
                                    SubLObject supertype = NIL;
                                    for (supertype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supertype = cdolist_list_var.first()) {
                                        superpanel = cyblack_datatype.cyblack_datatype_get_panel(supertype, blackboard, UNPROVIDED);
                                        if (NIL != superpanel) {
                                            cyblack_panel_dispatch_functions.cyblack_panel_add_super_panel(new_panel, superpanel);
                                            cyblack_panel_dispatch_functions.cyblack_panel_add_sub_panel(superpanel, new_panel);
                                        }
                                    }
                                }
                                subtypes = cyblack_datatype.cyblack_datatype_get_subtypes(datatype);
                                {
                                    SubLObject cdolist_list_var = subtypes;
                                    SubLObject subtype = NIL;
                                    for (subtype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subtype = cdolist_list_var.first()) {
                                        subpanel = cyblack_datatype.cyblack_datatype_get_panel(subtype, blackboard, UNPROVIDED);
                                        if (NIL != subpanel) {
                                            cyblack_panel_dispatch_functions.cyblack_panel_add_sub_panel(new_panel, subpanel);
                                            cyblack_panel_dispatch_functions.cyblack_panel_add_super_panel(subpanel, new_panel);
                                        }
                                    }
                                }
                                sublisp_throw($sym67$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD, new_panel);
                            }
                        }
                    }
                    sublisp_throw($sym67$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_dictionary_dictionary(self, v_dictionary);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_dictionary_method = Errors.handleThrowable(ccatch_env_var, $sym67$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD);
            }
            return catch_var_for_cyblack_basic_datatype_dictionary_method;
        }
    }

    public static final SubLObject cyblack_listified_dt_bag_to_true_dt_bag(SubLObject datatype_dictionary, SubLObject listified_bag) {
        if (NIL == listified_bag) {
            return object.new_object_instance(BASIC_BAG);
        }
        {
            SubLObject head = listified_bag.first();
            SubLObject tail = listified_bag.rest();
            SubLObject true_bag = cyblack_listified_dt_bag_to_true_dt_bag(datatype_dictionary, tail);
            if (NIL != cyblack_datatype.cyblack_datatype_p(head)) {
                subloop_collections.basic_bag_add_method(true_bag, head);
                return true_bag;
            }
            if (head.isString()) {
                subloop_collections.basic_bag_add_method(true_bag, cyblack_datatype_dictionary_intern(datatype_dictionary, head, UNPROVIDED));
                return true_bag;
            }
            return true_bag;
        }
    }

    public static final SubLObject cyblack_datatype_dictionary_intern(SubLObject v_cyblack_datatype_dictionary, SubLObject name, SubLObject datatype) {
        if (datatype == UNPROVIDED) {
            datatype = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_dictionary_p(v_cyblack_datatype_dictionary)) {
                    Errors.error($str_alt70$CYBLACK_DATATYPE_DICTIONARY_INTER, v_cyblack_datatype_dictionary);
                }
            }
            if (NIL != cyblack_basic_datatype_dictionary_p(v_cyblack_datatype_dictionary)) {
                return cyblack_basic_datatype_dictionary_intern_method(v_cyblack_datatype_dictionary, name, datatype);
            } else {
                return methods.funcall_instance_method_with_2_args(v_cyblack_datatype_dictionary, INTERN, name, datatype);
            }
        }
    }

    public static final SubLObject cyblack_datatype_dictionary_interned_p(SubLObject v_cyblack_datatype_dictionary, SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_dictionary_p(v_cyblack_datatype_dictionary)) {
                    Errors.error($str_alt71$CYBLACK_DATATYPE_DICTIONARY_INTER, v_cyblack_datatype_dictionary);
                }
            }
            if (NIL != cyblack_basic_datatype_dictionary_p(v_cyblack_datatype_dictionary)) {
                return cyblack_basic_datatype_dictionary_interned_p_method(v_cyblack_datatype_dictionary, name);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_datatype_dictionary, INTERNED_P, name);
            }
        }
    }

    public static final SubLObject cyblack_datatype_dictionary_instantiate_panels(SubLObject v_cyblack_datatype_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_dictionary_p(v_cyblack_datatype_dictionary)) {
                    Errors.error($str_alt72$CYBLACK_DATATYPE_DICTIONARY_INSTA, v_cyblack_datatype_dictionary);
                }
            }
            if (NIL != cyblack_basic_datatype_dictionary_p(v_cyblack_datatype_dictionary)) {
                return cyblack_basic_datatype_dictionary_instantiate_panels_method(v_cyblack_datatype_dictionary);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_datatype_dictionary, INSTANTIATE_PANELS);
            }
        }
    }

    public static final SubLObject cyblack_datatype_dictionary_instantiate_panel(SubLObject v_cyblack_datatype_dictionary, SubLObject type_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_dictionary_p(v_cyblack_datatype_dictionary)) {
                    Errors.error($str_alt73$CYBLACK_DATATYPE_DICTIONARY_INSTA, v_cyblack_datatype_dictionary);
                }
            }
            if (NIL != cyblack_basic_datatype_dictionary_p(v_cyblack_datatype_dictionary)) {
                return cyblack_basic_datatype_dictionary_instantiate_panel_method(v_cyblack_datatype_dictionary, type_name);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_datatype_dictionary, INSTANTIATE_PANEL, type_name);
            }
        }
    }

    public static final SubLObject declare_cyblack_datatype_dictionary_file() {
        declareFunction("cyblack_datatype_dictionary_p", "CYBLACK-DATATYPE-DICTIONARY-P", 1, 0, false);
        declareFunction("cyblack_declare_root_type", "CYBLACK-DECLARE-ROOT-TYPE", 4, 0, false);
        declareFunction("cyblack_subtype_relation_tree_p", "CYBLACK-SUBTYPE-RELATION-TREE-P", 1, 0, false);
        declareFunction("cyblack_declare_subtype_relation_by_names", "CYBLACK-DECLARE-SUBTYPE-RELATION-BY-NAMES", 3, 0, false);
        declareFunction("cyblack_declare_subtype_relation_tree_by_names", "CYBLACK-DECLARE-SUBTYPE-RELATION-TREE-BY-NAMES", 2, 0, false);
        declareFunction("cyblack_declare_subtype_relation_tree_by_names_internal", "CYBLACK-DECLARE-SUBTYPE-RELATION-TREE-BY-NAMES-INTERNAL", 2, 0, false);
        declareFunction("cyblack_datatype_name_set_panel_and_posting_types", "CYBLACK-DATATYPE-NAME-SET-PANEL-AND-POSTING-TYPES", 4, 0, false);
        declareFunction("cyblack_datatype_name_set_panel_and_posting_type_triplets", "CYBLACK-DATATYPE-NAME-SET-PANEL-AND-POSTING-TYPE-TRIPLETS", 2, 0, false);
        declareFunction("get_cyblack_basic_datatype_dictionary_dictionary", "GET-CYBLACK-BASIC-DATATYPE-DICTIONARY-DICTIONARY", 1, 0, false);
        declareFunction("set_cyblack_basic_datatype_dictionary_dictionary", "SET-CYBLACK-BASIC-DATATYPE-DICTIONARY-DICTIONARY", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_datatype_dictionary_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DATATYPE-DICTIONARY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_datatype_dictionary_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DATATYPE-DICTIONARY-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_datatype_dictionary_p", "CYBLACK-BASIC-DATATYPE-DICTIONARY-P", 1, 0, false);
        declareFunction("cyblack_basic_datatype_dictionary_initialize_method", "CYBLACK-BASIC-DATATYPE-DICTIONARY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_datatype_dictionary_intern_method", "CYBLACK-BASIC-DATATYPE-DICTIONARY-INTERN-METHOD", 2, 1, false);
        declareFunction("cyblack_basic_datatype_dictionary_interned_p_method", "CYBLACK-BASIC-DATATYPE-DICTIONARY-INTERNED-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_dictionary_remove_by_name_method", "CYBLACK-BASIC-DATATYPE-DICTIONARY-REMOVE-BY-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_dictionary_remove_method", "CYBLACK-BASIC-DATATYPE-DICTIONARY-REMOVE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_dictionary_clear_method", "CYBLACK-BASIC-DATATYPE-DICTIONARY-CLEAR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_datatype_dictionary_instantiate_panels_method", "CYBLACK-BASIC-DATATYPE-DICTIONARY-INSTANTIATE-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_datatype_dictionary_instantiate_panel_method", "CYBLACK-BASIC-DATATYPE-DICTIONARY-INSTANTIATE-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_listified_dt_bag_to_true_dt_bag", "CYBLACK-LISTIFIED-DT-BAG-TO-TRUE-DT-BAG", 2, 0, false);
        declareFunction("cyblack_datatype_dictionary_intern", "CYBLACK-DATATYPE-DICTIONARY-INTERN", 2, 1, false);
        declareFunction("cyblack_datatype_dictionary_interned_p", "CYBLACK-DATATYPE-DICTIONARY-INTERNED-P", 2, 0, false);
        declareFunction("cyblack_datatype_dictionary_instantiate_panels", "CYBLACK-DATATYPE-DICTIONARY-INSTANTIATE-PANELS", 1, 0, false);
        declareFunction("cyblack_datatype_dictionary_instantiate_panel", "CYBLACK-DATATYPE-DICTIONARY-INSTANTIATE-PANEL", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_datatype_dictionary_file() {
        defparameter("*CYBLACK-DATATYPE-DICTIONARY-INVALID-DICTIONARY-MESSAGE*", $str_alt2$_S___S_is_not_a_valid_datatype_di);
        defparameter("*CYBLACK-DATATYPE-DICTIONARY-INVALID-DATATYPE-NAME-MESSAGE*", $str_alt3$_S___S_is_not_a_valid_datatype_na);
        return NIL;
    }

    public static final SubLObject setup_cyblack_datatype_dictionary_file() {
                interfaces.new_interface(CYBLACK_DATATYPE_DICTIONARY, NIL, NIL, $list_alt1);
        classes.subloop_new_class(CYBLACK_BASIC_DATATYPE_DICTIONARY, CYBLACK_BASIC_LOCKABLE, $list_alt13, NIL, $list_alt14);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_DATATYPE_DICTIONARY, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_DATATYPE_DICTIONARY, $sym18$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DATATYPE_DICTIONARY_CLA);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_DATATYPE_DICTIONARY, $sym26$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DATATYPE_DICTIONARY_INS);
        subloop_reserved_initialize_cyblack_basic_datatype_dictionary_class(CYBLACK_BASIC_DATATYPE_DICTIONARY);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_DATATYPE_DICTIONARY, $list_alt28, NIL, $list_alt29);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE_DICTIONARY, INITIALIZE, CYBLACK_BASIC_DATATYPE_DICTIONARY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(INTERN, CYBLACK_BASIC_DATATYPE_DICTIONARY, $list_alt33, $list_alt34, $list_alt35);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE_DICTIONARY, INTERN, CYBLACK_BASIC_DATATYPE_DICTIONARY_INTERN_METHOD);
        methods.methods_incorporate_instance_method(INTERNED_P, CYBLACK_BASIC_DATATYPE_DICTIONARY, $list_alt41, $list_alt42, $list_alt43);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE_DICTIONARY, INTERNED_P, CYBLACK_BASIC_DATATYPE_DICTIONARY_INTERNED_P_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_BY_NAME, CYBLACK_BASIC_DATATYPE_DICTIONARY, $list_alt33, $list_alt42, $list_alt46);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE_DICTIONARY, REMOVE_BY_NAME, CYBLACK_BASIC_DATATYPE_DICTIONARY_REMOVE_BY_NAME_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, CYBLACK_BASIC_DATATYPE_DICTIONARY, $list_alt33, $list_alt50, $list_alt51);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE_DICTIONARY, REMOVE, CYBLACK_BASIC_DATATYPE_DICTIONARY_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, CYBLACK_BASIC_DATATYPE_DICTIONARY, $list_alt33, NIL, $list_alt55);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE_DICTIONARY, CLEAR, CYBLACK_BASIC_DATATYPE_DICTIONARY_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(INSTANTIATE_PANELS, CYBLACK_BASIC_DATATYPE_DICTIONARY, $list_alt33, NIL, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE_DICTIONARY, INSTANTIATE_PANELS, CYBLACK_BASIC_DATATYPE_DICTIONARY_INSTANTIATE_PANELS_METHOD);
        methods.methods_incorporate_instance_method(INSTANTIATE_PANEL, CYBLACK_BASIC_DATATYPE_DICTIONARY, $list_alt33, $list_alt65, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE_DICTIONARY, INSTANTIATE_PANEL, CYBLACK_BASIC_DATATYPE_DICTIONARY_INSTANTIATE_PANEL_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_DATATYPE_DICTIONARY = makeSymbol("CYBLACK-DATATYPE-DICTIONARY");

    static private final SubLList $list_alt1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERN"), list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("DATATYPE"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNED-P"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-BY-NAME"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTANTIATE-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTANTIATE-PANEL"), list(makeSymbol("TYPE")), makeKeyword("PUBLIC")));

    static private final SubLString $str_alt2$_S___S_is_not_a_valid_datatype_di = makeString("~S: ~S is not a valid datatype dictionary.");

    static private final SubLString $str_alt3$_S___S_is_not_a_valid_datatype_na = makeString("~S: ~S is not a valid datatype name.  A string was expected.");

    static private final SubLString $str_alt4$CYBLACK_DECLARE_ROOT_TYPE___S_is_ = makeString("CYBLACK-DECLARE-ROOT-TYPE: ~S is not an instance of CYBLACK-DATYPE-DICTIONARY.");

    static private final SubLString $str_alt5$CYBLACK_DECLARE_ROOT_TYPE___S_is_ = makeString("CYBLACK-DECLARE-ROOT-TYPE: ~S is not a valid datatype name.  A string was expected.");

    static private final SubLString $str_alt6$CYBLACK_DECLARE_ROOT_TYPE___S_is_ = makeString("CYBLACK-DECLARE-ROOT-TYPE: ~S is not a valid posting class name.  A symbol was expected.");

    static private final SubLString $str_alt7$CYBLACK_DECLARE_ROOT_TYPE___S_is_ = makeString("CYBLACK-DECLARE-ROOT-TYPE: ~S is not a valid panel class name.  A symbol was expected.");

    private static final SubLSymbol CYBLACK_DECLARE_SUBTYPE_RELATION_BY_NAMES = makeSymbol("CYBLACK-DECLARE-SUBTYPE-RELATION-BY-NAMES");

    private static final SubLSymbol CYBLACK_DECLARE_SUBTYPE_RELATION_TREE_BY_NAMES = makeSymbol("CYBLACK-DECLARE-SUBTYPE-RELATION-TREE-BY-NAMES");

    static private final SubLString $str_alt10$CYBLACK_DATATYPE_NAME_SET_PANEL_A = makeString("CYBLACK-DATATYPE-NAME-SET-PANEL-AND-POSTING-TYPE-TRIPLETS: ~S is not a valid triplet.~%~\n         A triplet must be of the form (<string> <non null symbol> <non null symbol>).");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_DICTIONARY = makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY");



    static private final SubLList $list_alt13 = list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY"));

    static private final SubLList $list_alt14 = list(new SubLObject[]{ list(makeSymbol("DICTIONARY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERN"), list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("DATATYPE"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNED-P"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-BY-NAME"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTANTIATE-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTANTIATE-PANEL"), list(makeSymbol("TYPE")), makeKeyword("PUBLIC")) });







    static private final SubLSymbol $sym18$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DATATYPE_DICTIONARY_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DATATYPE-DICTIONARY-CLASS");















    static private final SubLSymbol $sym26$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DATATYPE_DICTIONARY_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DATATYPE-DICTIONARY-INSTANCE");



    static private final SubLList $list_alt28 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("DICTIONARY"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUAL))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym30$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-DICTIONARY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_DICTIONARY_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY-INITIALIZE-METHOD");



    static private final SubLList $list_alt33 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt34 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("DATATYPE"), NIL));

    static private final SubLList $list_alt35 = list(list(makeSymbol("PIF"), makeSymbol("DATATYPE"), list(makeSymbol("PROGN"), list(makeSymbol("WITH-CYBLACK-BASIC-LOCKABLE"), list(makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TYPENAME"), makeSymbol("CYBLACK-BASIC-DATATYPE")), makeSymbol("DATATYPE"), makeSymbol("NAME")), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("DICTIONARY"), makeSymbol("NAME"), makeSymbol("DATATYPE"))), list(RET, makeSymbol("DATATYPE"))), list(makeSymbol("CLET"), list(list(makeSymbol("IN-DICTIONARY"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("DICTIONARY"), makeSymbol("NAME"), NIL))), list(makeSymbol("PUNLESS"), makeSymbol("IN-DICTIONARY"), list(makeSymbol("PIF"), makeSymbol("APPLICATION"), list(makeSymbol("CSETQ"), makeSymbol("IN-DICTIONARY"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("NEW-COMPONENT")), list(QUOTE, makeSymbol("CYBLACK-BASIC-DATATYPE")))), list(makeSymbol("CSETQ"), makeSymbol("IN-DICTIONARY"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-BASIC-DATATYPE")), list(QUOTE, makeSymbol("CYBLACK-BASIC-DATATYPE"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TYPENAME"), makeSymbol("CYBLACK-BASIC-DATATYPE")), makeSymbol("IN-DICTIONARY"), makeSymbol("NAME")), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("DICTIONARY"), makeSymbol("NAME"), makeSymbol("IN-DICTIONARY"))), list(RET, makeSymbol("IN-DICTIONARY")))));

    static private final SubLSymbol $sym36$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-DICTIONARY-METHOD");

    private static final SubLSymbol NEW_COMPONENT = makeSymbol("NEW-COMPONENT");



    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_DICTIONARY_INTERN_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY-INTERN-METHOD");

    private static final SubLSymbol INTERNED_P = makeSymbol("INTERNED-P");

    static private final SubLList $list_alt41 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt42 = list(makeSymbol("NAME"));

    static private final SubLList $list_alt43 = list(list(RET, list(makeSymbol("FIF"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("DICTIONARY"), makeSymbol("NAME")), T, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_DICTIONARY_INTERNED_P_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY-INTERNED-P-METHOD");

    private static final SubLSymbol REMOVE_BY_NAME = makeSymbol("REMOVE-BY-NAME");

    static private final SubLList $list_alt46 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-CYBLACK-BASIC-LOCKABLE"), list(makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("DICTIONARY-REMOVE"), makeSymbol("DICTIONARY"), makeSymbol("NAME")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym47$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-DICTIONARY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_DICTIONARY_REMOVE_BY_NAME_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY-REMOVE-BY-NAME-METHOD");



    static private final SubLList $list_alt50 = list(makeSymbol("DATATYPE"));

    static private final SubLList $list_alt51 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-BASIC-DATATYPE-P"), makeSymbol("DATATYPE")), makeString("(REMOVE ~S): ~S must be an instance of CYBLACK-BASIC-DATATYPE."), makeSymbol("SELF"), makeSymbol("DATATYPE")), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("REMOVE-BY-NAME"), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TYPENAME"), makeSymbol("CYBLACK-BASIC-DATATYPE")), makeSymbol("DATATYPE")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLString $str_alt52$_REMOVE__S____S_must_be_an_instan = makeString("(REMOVE ~S): ~S must be an instance of CYBLACK-BASIC-DATATYPE.");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_DICTIONARY_REMOVE_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY-REMOVE-METHOD");



    static private final SubLList $list_alt55 = list(list(makeSymbol("WITH-CYBLACK-BASIC-LOCKABLE"), list(makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("CLEAR-DICTIONARY"), makeSymbol("DICTIONARY"))), list(RET, NIL));

    static private final SubLSymbol $sym56$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-DICTIONARY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_DICTIONARY_CLEAR_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY-CLEAR-METHOD");

    private static final SubLSymbol INSTANTIATE_PANELS = makeSymbol("INSTANTIATE-PANELS");

    static private final SubLList $list_alt59 = list(list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%Entered (INSTANTIATE-PANELS ~S)"), makeSymbol("SELF")), list(makeSymbol("PWHEN"), makeSymbol("DICTIONARY"), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(INSTANTIATE-PANELS ~S): Has dictionary."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("ROOT-PANELS"), NIL), list(makeSymbol("INSTANTIATED-PANELS"), NIL), list(makeSymbol("APPLICATION"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeSymbol("BLACKBOARD"), list(makeSymbol("FIF"), makeSymbol("APPLICATION"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION")), NIL)), makeSymbol("INSTANTIATED-PANEL"), makeSymbol("SUPERPANEL"), makeSymbol("SUBPANEL"), makeSymbol("SUPERTYPES"), makeSymbol("SUBTYPES") }), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("DATATYPE-NAME"), makeSymbol("DATATYPE"), makeSymbol("DICTIONARY")), list(makeSymbol("IGNORE"), makeSymbol("DATATYPE-NAME")), list(makeSymbol("CSETQ"), makeSymbol("INSTANTIATED-PANEL"), list(makeSymbol("CYBLACK-PANEL-GIVEN-DATATYPE"), makeSymbol("DATATYPE"), makeSymbol("INSTANTIATED-PANELS"))), list(new SubLObject[]{ makeSymbol("PUNLESS"), makeSymbol("INSTANTIATED-PANEL"), list(makeSymbol("CSETQ"), makeSymbol("INSTANTIATED-PANEL"), list(makeSymbol("CYBLACK-DATATYPE-CREATE-PANEL"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD"))), list(makeSymbol("CPUSH"), makeSymbol("INSTANTIATED-PANEL"), makeSymbol("INSTANTIATED-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("SUPERTYPES"), list(makeSymbol("CYBLACK-DATATYPE-GET-SUPERTYPES"), makeSymbol("DATATYPE"))), list(makeSymbol("PUNLESS"), makeSymbol("SUPERTYPES"), list(makeSymbol("CPUSH"), makeSymbol("INSTANTIATED-PANEL"), makeSymbol("ROOT-PANELS"))), list(makeSymbol("CSETQ"), makeSymbol("SUBTYPES"), list(makeSymbol("CYBLACK-DATATYPE-GET-SUBTYPES"), makeSymbol("DATATYPE"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SUPERTYPE"), makeSymbol("SUPERTYPES")), list(makeSymbol("CSETQ"), makeSymbol("SUPERPANEL"), list(makeSymbol("CYBLACK-PANEL-GIVEN-DATATYPE"), makeSymbol("SUPERTYPE"), makeSymbol("INSTANTIATED-PANELS"))), list(makeSymbol("PWHEN"), makeSymbol("SUPERPANEL"), list(makeSymbol("CYBLACK-PANEL-ADD-SUPER-PANEL"), makeSymbol("INSTANTIATED-PANEL"), makeSymbol("SUPERPANEL")), list(makeSymbol("CYBLACK-PANEL-ADD-SUB-PANEL"), makeSymbol("SUPERPANEL"), makeSymbol("INSTANTIATED-PANEL")))), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBTYPE"), makeSymbol("SUBTYPES")), list(makeSymbol("CSETQ"), makeSymbol("SUBPANEL"), list(makeSymbol("CYBLACK-PANEL-GIVEN-DATATYPE"), makeSymbol("SUBTYPE"), makeSymbol("INSTANTIATED-PANELS"))), list(makeSymbol("PWHEN"), makeSymbol("SUBPANEL"), list(makeSymbol("CYBLACK-PANEL-ADD-SUB-PANEL"), makeSymbol("INSTANTIATED-PANEL"), makeSymbol("SUBPANEL")), list(makeSymbol("CYBLACK-PANEL-ADD-SUPER-PANEL"), makeSymbol("SUBPANEL"), makeSymbol("INSTANTIATED-PANEL")))) })), list(RET, makeSymbol("ROOT-PANELS")))), list(RET, NIL));

    static private final SubLSymbol $sym60$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-DICTIONARY-METHOD");

    static private final SubLString $str_alt61$__Entered__INSTANTIATE_PANELS__S_ = makeString("~%Entered (INSTANTIATE-PANELS ~S)");

    static private final SubLString $str_alt62$___INSTANTIATE_PANELS__S___Has_di = makeString("~%(INSTANTIATE-PANELS ~S): Has dictionary.");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_DICTIONARY_INSTANTIATE_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY-INSTANTIATE-PANELS-METHOD");

    private static final SubLSymbol INSTANTIATE_PANEL = makeSymbol("INSTANTIATE-PANEL");

    static private final SubLList $list_alt65 = list(makeSymbol("TYPE-NAME"));

    static private final SubLList $list_alt66 = list(list(makeSymbol("PWHEN"), makeSymbol("DICTIONARY"), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("DICTIONARY"), makeSymbol("TYPE-NAME"))), list(makeSymbol("BLACKBOARD"), list(makeSymbol("FIF"), makeSymbol("APPLICATION"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION")), NIL)), list(makeSymbol("NEW-PANEL"), NIL), list(makeSymbol("SUBTYPES"), NIL), list(makeSymbol("SUBPANEL"), NIL), list(makeSymbol("SUPERTYPES"), NIL), list(makeSymbol("SUPERPANEL"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD")), list(makeSymbol("CSETQ"), makeSymbol("NEW-PANEL"), list(makeSymbol("CYBLACK-DATATYPE-CREATE-PANEL"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD"))), list(makeSymbol("CSETQ"), makeSymbol("SUPERTYPES"), list(makeSymbol("CYBLACK-DATATYPE-GET-SUPERTYPES"), makeSymbol("DATATYPE"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SUPERTYPE"), makeSymbol("SUPERTYPES")), list(makeSymbol("CSETQ"), makeSymbol("SUPERPANEL"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("SUPERTYPE"), makeSymbol("BLACKBOARD"))), list(makeSymbol("PWHEN"), makeSymbol("SUPERPANEL"), list(makeSymbol("CYBLACK-PANEL-ADD-SUPER-PANEL"), makeSymbol("NEW-PANEL"), makeSymbol("SUPERPANEL")), list(makeSymbol("CYBLACK-PANEL-ADD-SUB-PANEL"), makeSymbol("SUPERPANEL"), makeSymbol("NEW-PANEL")))), list(makeSymbol("CSETQ"), makeSymbol("SUBTYPES"), list(makeSymbol("CYBLACK-DATATYPE-GET-SUBTYPES"), makeSymbol("DATATYPE"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBTYPE"), makeSymbol("SUBTYPES")), list(makeSymbol("CSETQ"), makeSymbol("SUBPANEL"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("SUBTYPE"), makeSymbol("BLACKBOARD"))), list(makeSymbol("PWHEN"), makeSymbol("SUBPANEL"), list(makeSymbol("CYBLACK-PANEL-ADD-SUB-PANEL"), makeSymbol("NEW-PANEL"), makeSymbol("SUBPANEL")), list(makeSymbol("CYBLACK-PANEL-ADD-SUPER-PANEL"), makeSymbol("SUBPANEL"), makeSymbol("NEW-PANEL")))), list(RET, makeSymbol("NEW-PANEL"))))), list(RET, NIL));

    static private final SubLSymbol $sym67$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_DICTIONARY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-DICTIONARY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_DICTIONARY_INSTANTIATE_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY-INSTANTIATE-PANEL-METHOD");



    static private final SubLString $str_alt70$CYBLACK_DATATYPE_DICTIONARY_INTER = makeString("CYBLACK-DATATYPE-DICTIONARY-INTERN: ~S is not an instance of CYBLACK-DATATYPE-DICTIONARY.");

    static private final SubLString $str_alt71$CYBLACK_DATATYPE_DICTIONARY_INTER = makeString("CYBLACK-DATATYPE-DICTIONARY-INTERNED-P: ~S is not an instance of CYBLACK-DATATYPE-DICTIONARY.");

    static private final SubLString $str_alt72$CYBLACK_DATATYPE_DICTIONARY_INSTA = makeString("CYBLACK-DATATYPE-DICTIONARY-INSTANTIATE-PANELS: ~S is not an instance of CYBLACK-DATATYPE-DICTIONARY.");

    static private final SubLString $str_alt73$CYBLACK_DATATYPE_DICTIONARY_INSTA = makeString("CYBLACK-DATATYPE-DICTIONARY-INSTANTIATE-PANEL: ~S is not an instance of CYBLACK-DATATYPE-DICTIONARY.");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_datatype_dictionary_file();
    }

    public void initializeVariables() {
        init_cyblack_datatype_dictionary_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_datatype_dictionary_file();
    }
}

