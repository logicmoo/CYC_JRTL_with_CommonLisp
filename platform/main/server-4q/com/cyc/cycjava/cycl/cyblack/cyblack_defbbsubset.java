/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.subl_promotions;
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
 *  module:      CYBLACK-DEFBBSUBSET
 *  source file: /cyc/top/cycl/cyblack/cyblack-defbbsubset.lisp
 *  created:     2019/07/03 17:38:50
 */
public final class cyblack_defbbsubset extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_defbbsubset() {
    }

    public static final SubLFile me = new cyblack_defbbsubset();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_defbbsubset";

    // // Definitions
    // defconstant
    private static final SubLSymbol $cyblack_bb_subset_initial_hashtable_size$ = makeSymbol("*CYBLACK-BB-SUBSET-INITIAL-HASHTABLE-SIZE*");

    // defparameter
    private static final SubLSymbol $cyblack_bb_subset_hashtable_update_lock$ = makeSymbol("*CYBLACK-BB-SUBSET-HASHTABLE-UPDATE-LOCK*");

    // defvar
    private static final SubLSymbol $cyblack_bb_subset_hashtable$ = makeSymbol("*CYBLACK-BB-SUBSET-HASHTABLE*");

    public static final SubLObject cyblack_bb_subset_register_subset(SubLObject bb_subset) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_bb_subset_p(bb_subset)) {
                    Errors.error($str_alt1$CYBLACK_BB_SUBSET_REGISTER_SUBSET, bb_subset);
                }
            }
            {
                SubLObject subset_name = get_cyblack_bb_subset_subset_name(bb_subset);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL != subset_name) && subset_name.isSymbol())) {
                        Errors.error($str_alt2$CYBLACK_BB_SUBSET_REGISTER_SUBSET, bb_subset, subset_name);
                    }
                }
                {
                    SubLObject lock = $cyblack_bb_subset_hashtable_update_lock$.getDynamicValue(thread);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        sethash(subset_name, $cyblack_bb_subset_hashtable$.getDynamicValue(thread), bb_subset);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return bb_subset;
        }
    }

    public static final SubLObject cyblack_bb_subset_retrieve_subset(SubLObject bb_subset_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bb_subset = NIL;
                SubLObject lock = $cyblack_bb_subset_hashtable_update_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    bb_subset = gethash(bb_subset_name, $cyblack_bb_subset_hashtable$.getDynamicValue(thread), NIL);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return bb_subset;
            }
        }
    }

    public static final SubLObject cyblack_bb_subset_intern(SubLObject bb_subset_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != bb_subset_name) && bb_subset_name.isSymbol())) {
                    Errors.error($str_alt3$CYBLACK_BB_SUBSET_INTERN___S_is_n, bb_subset_name);
                }
            }
            {
                SubLObject subset = cyblack_bb_subset_retrieve_subset(bb_subset_name);
                if (NIL != subset) {
                    return subset;
                }
                subset = object.new_class_instance(CYBLACK_BB_SUBSET);
                cyblack_bb_subset_set_subset_name_method(subset, bb_subset_name);
                cyblack_bb_subset_register_subset(subset);
                return subset;
            }
        }
    }

    public static final SubLObject get_cyblack_bb_subset_options(SubLObject cyblack_bb_subset) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_bb_subset, SIX_INTEGER, OPTIONS);
    }

    public static final SubLObject set_cyblack_bb_subset_options(SubLObject cyblack_bb_subset, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_bb_subset, value, SIX_INTEGER, OPTIONS);
    }

    public static final SubLObject get_cyblack_bb_subset_type_to_panel_class_map_decls(SubLObject cyblack_bb_subset) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_bb_subset, FIVE_INTEGER, TYPE_TO_PANEL_CLASS_MAP_DECLS);
    }

    public static final SubLObject set_cyblack_bb_subset_type_to_panel_class_map_decls(SubLObject cyblack_bb_subset, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_bb_subset, value, FIVE_INTEGER, TYPE_TO_PANEL_CLASS_MAP_DECLS);
    }

    public static final SubLObject get_cyblack_bb_subset_type_to_posting_class_map_decls(SubLObject cyblack_bb_subset) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_bb_subset, FOUR_INTEGER, TYPE_TO_POSTING_CLASS_MAP_DECLS);
    }

    public static final SubLObject set_cyblack_bb_subset_type_to_posting_class_map_decls(SubLObject cyblack_bb_subset, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_bb_subset, value, FOUR_INTEGER, TYPE_TO_POSTING_CLASS_MAP_DECLS);
    }

    public static final SubLObject get_cyblack_bb_subset_type_graph_decls(SubLObject cyblack_bb_subset) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_bb_subset, THREE_INTEGER, TYPE_GRAPH_DECLS);
    }

    public static final SubLObject set_cyblack_bb_subset_type_graph_decls(SubLObject cyblack_bb_subset, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_bb_subset, value, THREE_INTEGER, TYPE_GRAPH_DECLS);
    }

    public static final SubLObject get_cyblack_bb_subset_included_bb_subsets(SubLObject cyblack_bb_subset) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_bb_subset, TWO_INTEGER, INCLUDED_BB_SUBSETS);
    }

    public static final SubLObject set_cyblack_bb_subset_included_bb_subsets(SubLObject cyblack_bb_subset, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_bb_subset, value, TWO_INTEGER, INCLUDED_BB_SUBSETS);
    }

    public static final SubLObject get_cyblack_bb_subset_subset_name(SubLObject cyblack_bb_subset) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_bb_subset, ONE_INTEGER, SUBSET_NAME);
    }

    public static final SubLObject set_cyblack_bb_subset_subset_name(SubLObject cyblack_bb_subset, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_bb_subset, value, ONE_INTEGER, SUBSET_NAME);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_bb_subset_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_bb_subset_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BB_SUBSET, SUBSET_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BB_SUBSET, INCLUDED_BB_SUBSETS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BB_SUBSET, TYPE_GRAPH_DECLS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BB_SUBSET, TYPE_TO_POSTING_CLASS_MAP_DECLS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BB_SUBSET, TYPE_TO_PANEL_CLASS_MAP_DECLS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BB_SUBSET, OPTIONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_bb_subset_p(SubLObject cyblack_bb_subset) {
        return classes.subloop_instanceof_class(cyblack_bb_subset, CYBLACK_BB_SUBSET);
    }

    public static final SubLObject cyblack_bb_subset_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject type_to_panel_class_map_decls = get_cyblack_bb_subset_type_to_panel_class_map_decls(self);
            SubLObject type_to_posting_class_map_decls = get_cyblack_bb_subset_type_to_posting_class_map_decls(self);
            SubLObject type_graph_decls = get_cyblack_bb_subset_type_graph_decls(self);
            SubLObject included_bb_subsets = get_cyblack_bb_subset_included_bb_subsets(self);
            SubLObject subset_name = get_cyblack_bb_subset_subset_name(self);
            try {
                try {
                    object.object_initialize_method(self);
                    subset_name = NIL;
                    included_bb_subsets = NIL;
                    type_graph_decls = NIL;
                    type_to_posting_class_map_decls = NIL;
                    type_to_panel_class_map_decls = NIL;
                    sublisp_throw($sym21$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_type_to_panel_class_map_decls(self, type_to_panel_class_map_decls);
                            set_cyblack_bb_subset_type_to_posting_class_map_decls(self, type_to_posting_class_map_decls);
                            set_cyblack_bb_subset_type_graph_decls(self, type_graph_decls);
                            set_cyblack_bb_subset_included_bb_subsets(self, included_bb_subsets);
                            set_cyblack_bb_subset_subset_name(self, subset_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym21$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_get_subset_name_method(SubLObject self) {
        {
            SubLObject subset_name = get_cyblack_bb_subset_subset_name(self);
            return subset_name;
        }
    }

    public static final SubLObject cyblack_bb_subset_set_subset_name_method(SubLObject self, SubLObject new_subset_name) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject subset_name = get_cyblack_bb_subset_subset_name(self);
            try {
                try {
                    subset_name = new_subset_name;
                    sublisp_throw($sym31$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, new_subset_name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_subset_name(self, subset_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym31$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_get_included_bb_subsets_method(SubLObject self) {
        {
            SubLObject included_bb_subsets = get_cyblack_bb_subset_included_bb_subsets(self);
            return included_bb_subsets;
        }
    }

    public static final SubLObject cyblack_bb_subset_set_included_bb_subsets_method(SubLObject self, SubLObject new_included_bb_subsets) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject included_bb_subsets = get_cyblack_bb_subset_included_bb_subsets(self);
            try {
                try {
                    included_bb_subsets = copy_list(new_included_bb_subsets);
                    sublisp_throw($sym39$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, new_included_bb_subsets);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_included_bb_subsets(self, included_bb_subsets);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_add_included_bb_subset_method(SubLObject self, SubLObject bb_subset_name) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject included_bb_subsets = get_cyblack_bb_subset_included_bb_subsets(self);
            try {
                try {
                    included_bb_subsets = nreverse(cons(bb_subset_name, nreverse(included_bb_subsets)));
                    sublisp_throw($sym44$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, bb_subset_name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_included_bb_subsets(self, included_bb_subsets);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym44$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_remove_included_bb_subset_method(SubLObject self, SubLObject bb_subset_name) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject included_bb_subsets = get_cyblack_bb_subset_included_bb_subsets(self);
            try {
                try {
                    included_bb_subsets = delete(bb_subset_name, included_bb_subsets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym48$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, bb_subset_name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_included_bb_subsets(self, included_bb_subsets);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_get_type_graph_decls_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject type_graph_decls = get_cyblack_bb_subset_type_graph_decls(self);
            SubLObject included_bb_subsets = get_cyblack_bb_subset_included_bb_subsets(self);
            try {
                try {
                    {
                        SubLObject inherited_decls = NIL;
                        if (NIL != included_bb_subsets) {
                            {
                                SubLObject actual_bb_subset = NIL;
                                SubLObject cdolist_list_var = included_bb_subsets;
                                SubLObject bb_subset = NIL;
                                for (bb_subset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bb_subset = cdolist_list_var.first()) {
                                    actual_bb_subset = cyblack_bb_subset_retrieve_subset(bb_subset);
                                    if (NIL != actual_bb_subset) {
                                        included_bb_subsets = nconc(included_bb_subsets, cyblack_bb_subset_get_type_graph_decls_method(actual_bb_subset));
                                    } else {
                                        Errors.warn($str_alt53$_GET_TYPE_GRAPH_DECLS__S____S_has, self, bb_subset);
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym52$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, nconc(inherited_decls, copy_list(type_graph_decls)));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_type_graph_decls(self, type_graph_decls);
                            set_cyblack_bb_subset_included_bb_subsets(self, included_bb_subsets);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_set_type_graph_decls_method(SubLObject self, SubLObject new_type_graph_decls) {
        {
            SubLObject cdolist_list_var = new_type_graph_decls;
            SubLObject type_graph_decl = NIL;
            for (type_graph_decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type_graph_decl = cdolist_list_var.first()) {
                cyblack_bb_subset_add_type_graph_decl_method(self, type_graph_decl);
            }
            return new_type_graph_decls;
        }
    }

    public static final SubLObject cyblack_bb_subset_add_type_graph_decl_method(SubLObject self, SubLObject decl) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject type_graph_decls = get_cyblack_bb_subset_type_graph_decls(self);
            try {
                try {
                    type_graph_decls = nreverse(cons(copy_list(decl), nreverse(type_graph_decls)));
                    sublisp_throw($sym62$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, decl);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_type_graph_decls(self, type_graph_decls);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym62$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_remove_type_graph_decl_method(SubLObject self, SubLObject type_name_string) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject type_graph_decls = get_cyblack_bb_subset_type_graph_decls(self);
            try {
                try {
                    type_graph_decls = delete(type_name_string, type_graph_decls, symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym67$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, type_name_string);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_type_graph_decls(self, type_graph_decls);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym67$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_get_type_to_posting_class_map_decls_method(SubLObject self) {
        {
            SubLObject type_to_posting_class_map_decls = get_cyblack_bb_subset_type_to_posting_class_map_decls(self);
            return copy_list(type_to_posting_class_map_decls);
        }
    }

    public static final SubLObject cyblack_bb_subset_set_type_to_posting_class_map_decls_method(SubLObject self, SubLObject new_type_to_posting_class_map_decls) {
        {
            SubLObject cdolist_list_var = new_type_to_posting_class_map_decls;
            SubLObject decl = NIL;
            for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , decl = cdolist_list_var.first()) {
                cyblack_bb_subset_add_type_to_posting_class_map_decl_method(self, decl);
            }
            return new_type_to_posting_class_map_decls;
        }
    }

    public static final SubLObject cyblack_bb_subset_add_type_to_posting_class_map_decl_method(SubLObject self, SubLObject decl) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject type_to_posting_class_map_decls = get_cyblack_bb_subset_type_to_posting_class_map_decls(self);
            try {
                try {
                    type_to_posting_class_map_decls = nreverse(cons(copy_list(decl), nreverse(type_to_posting_class_map_decls)));
                    sublisp_throw($sym79$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, decl);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_type_to_posting_class_map_decls(self, type_to_posting_class_map_decls);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym79$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_remove_type_to_posting_class_map_decl_method(SubLObject self, SubLObject type_name_string) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject type_to_posting_class_map_decls = get_cyblack_bb_subset_type_to_posting_class_map_decls(self);
            try {
                try {
                    type_to_posting_class_map_decls = delete(type_name_string, type_to_posting_class_map_decls, symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym83$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, type_name_string);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_type_to_posting_class_map_decls(self, type_to_posting_class_map_decls);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym83$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_get_type_to_panel_class_map_decls_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject type_to_panel_class_map_decls = get_cyblack_bb_subset_type_to_panel_class_map_decls(self);
            try {
                try {
                    sublisp_throw($sym87$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, copy_list(type_to_panel_class_map_decls));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_type_to_panel_class_map_decls(self, type_to_panel_class_map_decls);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_set_type_to_panel_class_map_decls_method(SubLObject self, SubLObject new_type_to_panel_class_map_decls) {
        {
            SubLObject cdolist_list_var = new_type_to_panel_class_map_decls;
            SubLObject decl = NIL;
            for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , decl = cdolist_list_var.first()) {
                cyblack_bb_subset_add_type_to_panel_class_map_decl_method(self, decl);
            }
            return new_type_to_panel_class_map_decls;
        }
    }

    public static final SubLObject cyblack_bb_subset_add_type_to_panel_class_map_decl_method(SubLObject self, SubLObject decl) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject type_to_panel_class_map_decls = get_cyblack_bb_subset_type_to_panel_class_map_decls(self);
            try {
                try {
                    type_to_panel_class_map_decls = nreverse(cons(copy_list(decl), nreverse(type_to_panel_class_map_decls)));
                    sublisp_throw($sym95$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, decl);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_type_to_panel_class_map_decls(self, type_to_panel_class_map_decls);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym95$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_remove_type_to_panel_class_map_decl_method(SubLObject self, SubLObject type_name_string) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject type_to_panel_class_map_decls = get_cyblack_bb_subset_type_to_panel_class_map_decls(self);
            try {
                try {
                    type_to_panel_class_map_decls = delete(type_name_string, type_to_panel_class_map_decls, symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym99$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, type_name_string);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_type_to_panel_class_map_decls(self, type_to_panel_class_map_decls);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym99$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject cyblack_bb_subset_add_type_method(SubLObject self, SubLObject type_name_string, SubLObject super_type_name_string, SubLObject posting_class, SubLObject panel_class) {
        cyblack_bb_subset_add_type_graph_decl_method(self, list($SUBTYPE, type_name_string, super_type_name_string));
        cyblack_bb_subset_add_type_to_posting_class_map_decl_method(self, list($POSTING_CLASS, type_name_string, posting_class));
        cyblack_bb_subset_add_type_to_panel_class_map_decl_method(self, list($PANEL_CLASS, type_name_string, panel_class));
        return self;
    }

    public static final SubLObject cyblack_bb_subset_remove_type_method(SubLObject self, SubLObject type_name_string) {
        cyblack_bb_subset_remove_type_graph_decl_method(self, type_name_string);
        cyblack_bb_subset_remove_type_to_posting_class_map_decl_method(self, type_name_string);
        cyblack_bb_subset_remove_type_to_panel_class_map_decl_method(self, type_name_string);
        return type_name_string;
    }

    public static final SubLObject cyblack_bb_subset_get_options_method(SubLObject self) {
        {
            SubLObject options = get_cyblack_bb_subset_options(self);
            return options;
        }
    }

    public static final SubLObject cyblack_bb_subset_set_options_method(SubLObject self, SubLObject new_options) {
        {
            SubLObject catch_var_for_cyblack_bb_subset_method = NIL;
            SubLObject options = get_cyblack_bb_subset_options(self);
            try {
                try {
                    options = copy_tree(new_options);
                    sublisp_throw($sym117$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD, new_options);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_bb_subset_options(self, options);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_bb_subset_method = Errors.handleThrowable(ccatch_env_var, $sym117$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD);
            }
            return catch_var_for_cyblack_bb_subset_method;
        }
    }

    public static final SubLObject construct_and_register_blackboard_subset(SubLObject blackboard_name, SubLObject options, SubLObject body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != blackboard_name) && blackboard_name.isSymbol())) {
                    Errors.error($str_alt119$DEFINE_BLACKBOARD_SUBSET___S_is_n, blackboard_name);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == list_utilities.valid_and_conformant_alist_p(body, $list_alt120, UNPROVIDED)) {
                    Errors.error($str_alt121$DEFINE_BLACKBOARD_SUBSET___S_is_n, body);
                }
            }
            {
                SubLObject type_graph_decls = assoc($TYPE_GRAPH, body, UNPROVIDED, UNPROVIDED);
                SubLObject type_to_posting_class_map_decls = assoc($TYPE_TO_POSTING_CLASS_MAP, body, UNPROVIDED, UNPROVIDED);
                SubLObject type_to_panel_class_map = assoc($TYPE_TO_PANEL_CLASS_MAP, body, UNPROVIDED, UNPROVIDED);
                if (NIL != type_graph_decls) {
                    type_graph_decls = type_graph_decls.rest();
                }
                if (NIL != type_to_posting_class_map_decls) {
                    type_to_posting_class_map_decls = type_to_posting_class_map_decls.rest();
                }
                if (NIL != type_to_panel_class_map) {
                    type_to_panel_class_map = type_to_panel_class_map.rest();
                }
                {
                    SubLObject subset = cyblack_bb_subset_intern(blackboard_name);
                    cyblack_bb_subset_set_type_graph_decls_method(subset, type_graph_decls);
                    cyblack_bb_subset_set_type_to_posting_class_map_decls_method(subset, type_to_posting_class_map_decls);
                    cyblack_bb_subset_set_type_to_panel_class_map_decls_method(subset, type_to_panel_class_map);
                    return subset;
                }
            }
        }
    }

    public static final SubLObject expand_define_blackboard_subset(SubLObject blackboard_name, SubLObject options, SubLObject body) {
        return list(CONSTRUCT_AND_REGISTER_BLACKBOARD_SUBSET, list(QUOTE, blackboard_name), list(QUOTE, options), list(QUOTE, body));
    }

    public static final SubLObject define_blackboard_subset(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt127);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject blackboard_name = NIL;
                    SubLObject options = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt127);
                    blackboard_name = current.first();
                    current = current.rest();
                    options = current;
                    current = temp;
                    {
                        SubLObject body = current;
                        return expand_define_blackboard_subset(blackboard_name, options, body);
                    }
                }
            }
        }
    }

    /**
     * Given a list of bbsubsets, returns three values.  The first value is
     * the union of all type-graph decls, the second is the union of all
     * posting map decls, and the third is the union of all panel map decls.
     */
    public static final SubLObject merge_bbsubsets(SubLObject bbsubsets) {
        {
            SubLObject type_graph = NIL;
            SubLObject posting_map = NIL;
            SubLObject panel_map = NIL;
            SubLObject actual_subset = NIL;
            SubLObject cdolist_list_var = bbsubsets;
            SubLObject bbsubset = NIL;
            for (bbsubset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bbsubset = cdolist_list_var.first()) {
                if (bbsubset.isSymbol()) {
                    actual_subset = cyblack_bb_subset_retrieve_subset(bbsubset);
                } else
                    if (NIL != cyblack_bb_subset_p(bbsubset)) {
                        actual_subset = bbsubset;
                    } else {
                        actual_subset = NIL;
                    }

                if (NIL != actual_subset) {
                    {
                        SubLObject cdolist_list_var_1 = cyblack_bb_subset_get_type_graph_decls_method(actual_subset);
                        SubLObject type_decl = NIL;
                        for (type_decl = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , type_decl = cdolist_list_var_1.first()) {
                            if (NIL == subl_promotions.memberP(cadr(type_decl), type_graph, symbol_function(EQUAL), symbol_function(CADR))) {
                                type_graph = cons(type_decl, type_graph);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var_2 = cyblack_bb_subset_get_type_to_posting_class_map_decls_method(actual_subset);
                        SubLObject posting_decl = NIL;
                        for (posting_decl = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , posting_decl = cdolist_list_var_2.first()) {
                            if (NIL == subl_promotions.memberP(cadr(posting_decl), posting_map, symbol_function(EQUAL), symbol_function(CADR))) {
                                posting_map = cons(posting_decl, posting_map);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var_3 = cyblack_bb_subset_get_type_to_panel_class_map_decls_method(actual_subset);
                        SubLObject panel_decl = NIL;
                        for (panel_decl = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , panel_decl = cdolist_list_var_3.first()) {
                            if (NIL == subl_promotions.memberP(cadr(panel_decl), panel_map, symbol_function(EQUAL), symbol_function(CADR))) {
                                panel_map = cons(panel_decl, panel_map);
                            }
                        }
                    }
                }
            }
            return values(nreverse(type_graph), nreverse(posting_map), nreverse(panel_map));
        }
    }

    public static final SubLObject declare_cyblack_defbbsubset_file() {
        declareFunction("cyblack_bb_subset_register_subset", "CYBLACK-BB-SUBSET-REGISTER-SUBSET", 1, 0, false);
        declareFunction("cyblack_bb_subset_retrieve_subset", "CYBLACK-BB-SUBSET-RETRIEVE-SUBSET", 1, 0, false);
        declareFunction("cyblack_bb_subset_intern", "CYBLACK-BB-SUBSET-INTERN", 1, 0, false);
        declareFunction("get_cyblack_bb_subset_options", "GET-CYBLACK-BB-SUBSET-OPTIONS", 1, 0, false);
        declareFunction("set_cyblack_bb_subset_options", "SET-CYBLACK-BB-SUBSET-OPTIONS", 2, 0, false);
        declareFunction("get_cyblack_bb_subset_type_to_panel_class_map_decls", "GET-CYBLACK-BB-SUBSET-TYPE-TO-PANEL-CLASS-MAP-DECLS", 1, 0, false);
        declareFunction("set_cyblack_bb_subset_type_to_panel_class_map_decls", "SET-CYBLACK-BB-SUBSET-TYPE-TO-PANEL-CLASS-MAP-DECLS", 2, 0, false);
        declareFunction("get_cyblack_bb_subset_type_to_posting_class_map_decls", "GET-CYBLACK-BB-SUBSET-TYPE-TO-POSTING-CLASS-MAP-DECLS", 1, 0, false);
        declareFunction("set_cyblack_bb_subset_type_to_posting_class_map_decls", "SET-CYBLACK-BB-SUBSET-TYPE-TO-POSTING-CLASS-MAP-DECLS", 2, 0, false);
        declareFunction("get_cyblack_bb_subset_type_graph_decls", "GET-CYBLACK-BB-SUBSET-TYPE-GRAPH-DECLS", 1, 0, false);
        declareFunction("set_cyblack_bb_subset_type_graph_decls", "SET-CYBLACK-BB-SUBSET-TYPE-GRAPH-DECLS", 2, 0, false);
        declareFunction("get_cyblack_bb_subset_included_bb_subsets", "GET-CYBLACK-BB-SUBSET-INCLUDED-BB-SUBSETS", 1, 0, false);
        declareFunction("set_cyblack_bb_subset_included_bb_subsets", "SET-CYBLACK-BB-SUBSET-INCLUDED-BB-SUBSETS", 2, 0, false);
        declareFunction("get_cyblack_bb_subset_subset_name", "GET-CYBLACK-BB-SUBSET-SUBSET-NAME", 1, 0, false);
        declareFunction("set_cyblack_bb_subset_subset_name", "SET-CYBLACK-BB-SUBSET-SUBSET-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_bb_subset_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BB-SUBSET-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_bb_subset_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BB-SUBSET-INSTANCE", 1, 0, false);
        declareFunction("cyblack_bb_subset_p", "CYBLACK-BB-SUBSET-P", 1, 0, false);
        declareFunction("cyblack_bb_subset_initialize_method", "CYBLACK-BB-SUBSET-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_bb_subset_get_subset_name_method", "CYBLACK-BB-SUBSET-GET-SUBSET-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_bb_subset_set_subset_name_method", "CYBLACK-BB-SUBSET-SET-SUBSET-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_get_included_bb_subsets_method", "CYBLACK-BB-SUBSET-GET-INCLUDED-BB-SUBSETS-METHOD", 1, 0, false);
        declareFunction("cyblack_bb_subset_set_included_bb_subsets_method", "CYBLACK-BB-SUBSET-SET-INCLUDED-BB-SUBSETS-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_add_included_bb_subset_method", "CYBLACK-BB-SUBSET-ADD-INCLUDED-BB-SUBSET-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_remove_included_bb_subset_method", "CYBLACK-BB-SUBSET-REMOVE-INCLUDED-BB-SUBSET-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_get_type_graph_decls_method", "CYBLACK-BB-SUBSET-GET-TYPE-GRAPH-DECLS-METHOD", 1, 0, false);
        declareFunction("cyblack_bb_subset_set_type_graph_decls_method", "CYBLACK-BB-SUBSET-SET-TYPE-GRAPH-DECLS-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_add_type_graph_decl_method", "CYBLACK-BB-SUBSET-ADD-TYPE-GRAPH-DECL-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_remove_type_graph_decl_method", "CYBLACK-BB-SUBSET-REMOVE-TYPE-GRAPH-DECL-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_get_type_to_posting_class_map_decls_method", "CYBLACK-BB-SUBSET-GET-TYPE-TO-POSTING-CLASS-MAP-DECLS-METHOD", 1, 0, false);
        declareFunction("cyblack_bb_subset_set_type_to_posting_class_map_decls_method", "CYBLACK-BB-SUBSET-SET-TYPE-TO-POSTING-CLASS-MAP-DECLS-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_add_type_to_posting_class_map_decl_method", "CYBLACK-BB-SUBSET-ADD-TYPE-TO-POSTING-CLASS-MAP-DECL-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_remove_type_to_posting_class_map_decl_method", "CYBLACK-BB-SUBSET-REMOVE-TYPE-TO-POSTING-CLASS-MAP-DECL-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_get_type_to_panel_class_map_decls_method", "CYBLACK-BB-SUBSET-GET-TYPE-TO-PANEL-CLASS-MAP-DECLS-METHOD", 1, 0, false);
        declareFunction("cyblack_bb_subset_set_type_to_panel_class_map_decls_method", "CYBLACK-BB-SUBSET-SET-TYPE-TO-PANEL-CLASS-MAP-DECLS-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_add_type_to_panel_class_map_decl_method", "CYBLACK-BB-SUBSET-ADD-TYPE-TO-PANEL-CLASS-MAP-DECL-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_remove_type_to_panel_class_map_decl_method", "CYBLACK-BB-SUBSET-REMOVE-TYPE-TO-PANEL-CLASS-MAP-DECL-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_add_type_method", "CYBLACK-BB-SUBSET-ADD-TYPE-METHOD", 5, 0, false);
        declareFunction("cyblack_bb_subset_remove_type_method", "CYBLACK-BB-SUBSET-REMOVE-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_bb_subset_get_options_method", "CYBLACK-BB-SUBSET-GET-OPTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_bb_subset_set_options_method", "CYBLACK-BB-SUBSET-SET-OPTIONS-METHOD", 2, 0, false);
        declareFunction("construct_and_register_blackboard_subset", "CONSTRUCT-AND-REGISTER-BLACKBOARD-SUBSET", 3, 0, false);
        declareFunction("expand_define_blackboard_subset", "EXPAND-DEFINE-BLACKBOARD-SUBSET", 3, 0, false);
        declareMacro("define_blackboard_subset", "DEFINE-BLACKBOARD-SUBSET");
        declareFunction("merge_bbsubsets", "MERGE-BBSUBSETS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_defbbsubset_file() {
        defconstant("*CYBLACK-BB-SUBSET-INITIAL-HASHTABLE-SIZE*", TWENTY_INTEGER);
        defparameter("*CYBLACK-BB-SUBSET-HASHTABLE-UPDATE-LOCK*", make_lock($$$Blackboard_Subset_Hashtable_Lock));
        defvar("*CYBLACK-BB-SUBSET-HASHTABLE*", make_hash_table($cyblack_bb_subset_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_cyblack_defbbsubset_file() {
                classes.subloop_new_class(CYBLACK_BB_SUBSET, OBJECT, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(CYBLACK_BB_SUBSET, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BB_SUBSET, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BB_SUBSET_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BB_SUBSET, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BB_SUBSET_INSTANCE);
        subloop_reserved_initialize_cyblack_bb_subset_class(CYBLACK_BB_SUBSET);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BB_SUBSET, $list_alt19, NIL, $list_alt20);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, INITIALIZE, CYBLACK_BB_SUBSET_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_SUBSET_NAME, CYBLACK_BB_SUBSET, $list_alt24, NIL, $list_alt25);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, GET_SUBSET_NAME, CYBLACK_BB_SUBSET_GET_SUBSET_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_SUBSET_NAME, CYBLACK_BB_SUBSET, $list_alt28, $list_alt29, $list_alt30);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, SET_SUBSET_NAME, CYBLACK_BB_SUBSET_SET_SUBSET_NAME_METHOD);
        methods.methods_incorporate_instance_method(GET_INCLUDED_BB_SUBSETS, CYBLACK_BB_SUBSET, $list_alt24, NIL, $list_alt34);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, GET_INCLUDED_BB_SUBSETS, CYBLACK_BB_SUBSET_GET_INCLUDED_BB_SUBSETS_METHOD);
        methods.methods_incorporate_instance_method(SET_INCLUDED_BB_SUBSETS, CYBLACK_BB_SUBSET, $list_alt28, $list_alt37, $list_alt38);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, SET_INCLUDED_BB_SUBSETS, CYBLACK_BB_SUBSET_SET_INCLUDED_BB_SUBSETS_METHOD);
        methods.methods_incorporate_instance_method(ADD_INCLUDED_BB_SUBSET, CYBLACK_BB_SUBSET, $list_alt28, $list_alt42, $list_alt43);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, ADD_INCLUDED_BB_SUBSET, CYBLACK_BB_SUBSET_ADD_INCLUDED_BB_SUBSET_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_INCLUDED_BB_SUBSET, CYBLACK_BB_SUBSET, $list_alt28, $list_alt42, $list_alt47);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, REMOVE_INCLUDED_BB_SUBSET, CYBLACK_BB_SUBSET_REMOVE_INCLUDED_BB_SUBSET_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE_GRAPH_DECLS, CYBLACK_BB_SUBSET, $list_alt28, NIL, $list_alt51);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, GET_TYPE_GRAPH_DECLS, CYBLACK_BB_SUBSET_GET_TYPE_GRAPH_DECLS_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPE_GRAPH_DECLS, CYBLACK_BB_SUBSET, $list_alt28, $list_alt56, $list_alt57);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, SET_TYPE_GRAPH_DECLS, CYBLACK_BB_SUBSET_SET_TYPE_GRAPH_DECLS_METHOD);
        methods.methods_incorporate_instance_method(ADD_TYPE_GRAPH_DECL, CYBLACK_BB_SUBSET, $list_alt28, $list_alt60, $list_alt61);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, ADD_TYPE_GRAPH_DECL, CYBLACK_BB_SUBSET_ADD_TYPE_GRAPH_DECL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_TYPE_GRAPH_DECL, CYBLACK_BB_SUBSET, $list_alt28, $list_alt65, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, REMOVE_TYPE_GRAPH_DECL, CYBLACK_BB_SUBSET_REMOVE_TYPE_GRAPH_DECL_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE_TO_POSTING_CLASS_MAP_DECLS, CYBLACK_BB_SUBSET, $list_alt24, NIL, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, GET_TYPE_TO_POSTING_CLASS_MAP_DECLS, CYBLACK_BB_SUBSET_GET_TYPE_TO_POSTING_CLASS_MAP_DECLS_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPE_TO_POSTING_CLASS_MAP_DECLS, CYBLACK_BB_SUBSET, $list_alt28, $list_alt74, $list_alt75);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, SET_TYPE_TO_POSTING_CLASS_MAP_DECLS, CYBLACK_BB_SUBSET_SET_TYPE_TO_POSTING_CLASS_MAP_DECLS_METHOD);
        methods.methods_incorporate_instance_method(ADD_TYPE_TO_POSTING_CLASS_MAP_DECL, CYBLACK_BB_SUBSET, $list_alt28, $list_alt60, $list_alt78);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, ADD_TYPE_TO_POSTING_CLASS_MAP_DECL, CYBLACK_BB_SUBSET_ADD_TYPE_TO_POSTING_CLASS_MAP_DECL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_TYPE_TO_POSTING_CLASS_MAP_DECL, CYBLACK_BB_SUBSET, $list_alt28, $list_alt65, $list_alt82);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, REMOVE_TYPE_TO_POSTING_CLASS_MAP_DECL, CYBLACK_BB_SUBSET_REMOVE_TYPE_TO_POSTING_CLASS_MAP_DECL_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE_TO_PANEL_CLASS_MAP_DECLS, CYBLACK_BB_SUBSET, $list_alt28, NIL, $list_alt86);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, GET_TYPE_TO_PANEL_CLASS_MAP_DECLS, CYBLACK_BB_SUBSET_GET_TYPE_TO_PANEL_CLASS_MAP_DECLS_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPE_TO_PANEL_CLASS_MAP_DECLS, CYBLACK_BB_SUBSET, $list_alt28, $list_alt90, $list_alt91);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, SET_TYPE_TO_PANEL_CLASS_MAP_DECLS, CYBLACK_BB_SUBSET_SET_TYPE_TO_PANEL_CLASS_MAP_DECLS_METHOD);
        methods.methods_incorporate_instance_method(ADD_TYPE_TO_PANEL_CLASS_MAP_DECL, CYBLACK_BB_SUBSET, $list_alt28, $list_alt60, $list_alt94);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, ADD_TYPE_TO_PANEL_CLASS_MAP_DECL, CYBLACK_BB_SUBSET_ADD_TYPE_TO_PANEL_CLASS_MAP_DECL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_TYPE_TO_PANEL_CLASS_MAP_DECL, CYBLACK_BB_SUBSET, $list_alt28, $list_alt65, $list_alt98);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, REMOVE_TYPE_TO_PANEL_CLASS_MAP_DECL, CYBLACK_BB_SUBSET_REMOVE_TYPE_TO_PANEL_CLASS_MAP_DECL_METHOD);
        methods.methods_incorporate_instance_method(ADD_TYPE, CYBLACK_BB_SUBSET, $list_alt28, $list_alt102, $list_alt103);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, ADD_TYPE, CYBLACK_BB_SUBSET_ADD_TYPE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_TYPE, CYBLACK_BB_SUBSET, $list_alt28, $list_alt65, $list_alt109);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, REMOVE_TYPE, CYBLACK_BB_SUBSET_REMOVE_TYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_OPTIONS, CYBLACK_BB_SUBSET, $list_alt24, NIL, $list_alt112);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, GET_OPTIONS, CYBLACK_BB_SUBSET_GET_OPTIONS_METHOD);
        methods.methods_incorporate_instance_method(SET_OPTIONS, CYBLACK_BB_SUBSET, $list_alt28, $list_alt115, $list_alt116);
        methods.subloop_register_instance_method(CYBLACK_BB_SUBSET, SET_OPTIONS, CYBLACK_BB_SUBSET_SET_OPTIONS_METHOD);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $$$Blackboard_Subset_Hashtable_Lock = makeString("Blackboard Subset Hashtable Lock");

    static private final SubLString $str_alt1$CYBLACK_BB_SUBSET_REGISTER_SUBSET = makeString("CYBLACK-BB-SUBSET-REGISTER-SUBSET: ~S is not an instance of CYBLACK-BB-SUBSET.");

    static private final SubLString $str_alt2$CYBLACK_BB_SUBSET_REGISTER_SUBSET = makeString("CYBLACK-BB-SUBSET-REGISTER-SUBSET: ~S is not a well formed CYBLACK-BB-SUBSET instance. ~\n       It\'s associated name ~S is not a non NIL symbol.");

    static private final SubLString $str_alt3$CYBLACK_BB_SUBSET_INTERN___S_is_n = makeString("CYBLACK-BB-SUBSET-INTERN: ~S is not a valid subset name.  A non NIL symbol was expected.");

    private static final SubLSymbol CYBLACK_BB_SUBSET = makeSymbol("CYBLACK-BB-SUBSET");



    static private final SubLList $list_alt6 = list(new SubLObject[]{ list(makeSymbol("SUBSET-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INCLUDED-BB-SUBSETS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TYPE-GRAPH-DECLS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TYPE-TO-POSTING-CLASS-MAP-DECLS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TYPE-TO-PANEL-CLASS-MAP-DECLS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OPTIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSET-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUBSET-NAME"), list(makeSymbol("NEW-SUBSET-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INCLUDED-BB-SUBSETS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INCLUDED-BB-SUBSETS"), list(makeSymbol("NEW-INCLUDED-BB-SUBSETS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-INCLUDED-BB-SUBSET"), list(makeSymbol("BB-SUBSET-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-INCLUDED-BB-SUBSET"), list(makeSymbol("BB-SUBSET-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPE-GRAPH-DECLS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TYPE-GRAPH-DECLS"), list(makeSymbol("NEW-TYPE-GRAPH-DECLS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TYPE-GRAPH-DECL"), list(makeSymbol("DECL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-TYPE-GRAPH-DECL"), list(makeSymbol("TYPE-NAME-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPE-TO-POSTING-CLASS-MAP-DECLS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TYPE-TO-POSTING-CLASS-MAP-DECLS"), list(makeSymbol("NEW-TYPE-TO-POSTING-CLASS-MAP-DECLS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TYPE-TO-POSTING-CLASS-MAP-DECL"), list(makeSymbol("DECL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-TYPE-TO-POSTING-CLASS-MAP-DECL"), list(makeSymbol("TYPE-NAME-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPE-TO-PANEL-CLASS-MAP-DECLS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TYPE-TO-PANEL-CLASS-MAP-DECLS"), list(makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP-DECLS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TYPE-TO-PANEL-CLASS-MAP-DECL"), list(makeSymbol("DECL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-TYPE-TO-PANEL-CLASS-MAP-DECL"), list(makeSymbol("TYPE-NAME-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TYPE"), list(makeSymbol("TYPE-NAME-STRING"), makeSymbol("SUPER-TYPE-NAME-STRING"), makeSymbol("POSTING-CLASS"), makeSymbol("PANEL-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-TYPE"), list(makeSymbol("TYPE-NAME-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OPTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-OPTIONS"), list(makeSymbol("NEW-OPTIONS")), makeKeyword("PUBLIC")) });





    private static final SubLSymbol TYPE_TO_POSTING_CLASS_MAP_DECLS = makeSymbol("TYPE-TO-POSTING-CLASS-MAP-DECLS");





    private static final SubLSymbol SUBSET_NAME = makeSymbol("SUBSET-NAME");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BB_SUBSET_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BB-SUBSET-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BB_SUBSET_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BB-SUBSET-INSTANCE");



    static private final SubLList $list_alt19 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt20 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SUBSET-NAME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("INCLUDED-BB-SUBSETS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TYPE-GRAPH-DECLS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TYPE-TO-POSTING-CLASS-MAP-DECLS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TYPE-TO-PANEL-CLASS-MAP-DECLS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym21$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    private static final SubLSymbol CYBLACK_BB_SUBSET_INITIALIZE_METHOD = makeSymbol("CYBLACK-BB-SUBSET-INITIALIZE-METHOD");

    private static final SubLSymbol GET_SUBSET_NAME = makeSymbol("GET-SUBSET-NAME");

    static private final SubLList $list_alt24 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt25 = list(list(RET, makeSymbol("SUBSET-NAME")));

    private static final SubLSymbol CYBLACK_BB_SUBSET_GET_SUBSET_NAME_METHOD = makeSymbol("CYBLACK-BB-SUBSET-GET-SUBSET-NAME-METHOD");

    private static final SubLSymbol SET_SUBSET_NAME = makeSymbol("SET-SUBSET-NAME");

    static private final SubLList $list_alt28 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt29 = list(makeSymbol("NEW-SUBSET-NAME"));

    static private final SubLList $list_alt30 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-SUBSET-NAME"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-SUBSET-NAME"))), makeString("(SET-SUBSET-NAME ~S): ~S is not a proper blackboard subset name.  A non NIL symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-SUBSET-NAME")), list(makeSymbol("CSETQ"), makeSymbol("SUBSET-NAME"), makeSymbol("NEW-SUBSET-NAME")), list(RET, makeSymbol("NEW-SUBSET-NAME")));

    static private final SubLSymbol $sym31$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    private static final SubLSymbol CYBLACK_BB_SUBSET_SET_SUBSET_NAME_METHOD = makeSymbol("CYBLACK-BB-SUBSET-SET-SUBSET-NAME-METHOD");

    private static final SubLSymbol GET_INCLUDED_BB_SUBSETS = makeSymbol("GET-INCLUDED-BB-SUBSETS");

    static private final SubLList $list_alt34 = list(list(RET, makeSymbol("INCLUDED-BB-SUBSETS")));

    private static final SubLSymbol CYBLACK_BB_SUBSET_GET_INCLUDED_BB_SUBSETS_METHOD = makeSymbol("CYBLACK-BB-SUBSET-GET-INCLUDED-BB-SUBSETS-METHOD");

    private static final SubLSymbol SET_INCLUDED_BB_SUBSETS = makeSymbol("SET-INCLUDED-BB-SUBSETS");

    static private final SubLList $list_alt37 = list(makeSymbol("NEW-INCLUDED-BB-SUBSETS"));

    static private final SubLList $list_alt38 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("MUST"), list(makeSymbol("PROPER-LIST-P"), makeSymbol("NEW-INCLUDED-BB-SUBSETS")), makeString("(SET-INCLUDED-BB-SUBSETS ~S): ~S is not a proper list of blackboard subsets. ~\n         A list of symbols was expected."), makeSymbol("SELF"), makeSymbol("NEW-INCLUDED-BB-SUBSETS")), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBSET"), makeSymbol("NEW-INCLUDED-BB-SUBSETS")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("SUBSET"), list(makeSymbol("SYMBOLP"), makeSymbol("SUBSET"))), makeString("(SET-INCLUDED-BB-SUBSETS ~S): ~S is not a proper blackboard subset.  A non NIL symbol was expected."), makeSymbol("SELF"), makeSymbol("SUBSET")))), list(makeSymbol("CSETQ"), makeSymbol("INCLUDED-BB-SUBSETS"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-INCLUDED-BB-SUBSETS"))), list(RET, makeSymbol("NEW-INCLUDED-BB-SUBSETS")));

    static private final SubLSymbol $sym39$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    private static final SubLSymbol CYBLACK_BB_SUBSET_SET_INCLUDED_BB_SUBSETS_METHOD = makeSymbol("CYBLACK-BB-SUBSET-SET-INCLUDED-BB-SUBSETS-METHOD");

    private static final SubLSymbol ADD_INCLUDED_BB_SUBSET = makeSymbol("ADD-INCLUDED-BB-SUBSET");

    static private final SubLList $list_alt42 = list(makeSymbol("BB-SUBSET-NAME"));

    static private final SubLList $list_alt43 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("BB-SUBSET-NAME"), list(makeSymbol("SYMBOLP"), makeSymbol("BB-SUBSET-NAME"))), makeString("(ADD-INCLUDED-BB-SUBSET ~S): ~S is not a propert blackboard subset.  A non NIL symbol was expected."), makeSymbol("SELF"), makeSymbol("BB-SUBSET-NAME")), list(makeSymbol("CSETQ"), makeSymbol("INCLUDED-BB-SUBSETS"), list(makeSymbol("NREVERSE"), list(makeSymbol("CONS"), makeSymbol("BB-SUBSET-NAME"), list(makeSymbol("NREVERSE"), makeSymbol("INCLUDED-BB-SUBSETS"))))), list(RET, makeSymbol("BB-SUBSET-NAME")));

    static private final SubLSymbol $sym44$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    private static final SubLSymbol CYBLACK_BB_SUBSET_ADD_INCLUDED_BB_SUBSET_METHOD = makeSymbol("CYBLACK-BB-SUBSET-ADD-INCLUDED-BB-SUBSET-METHOD");

    private static final SubLSymbol REMOVE_INCLUDED_BB_SUBSET = makeSymbol("REMOVE-INCLUDED-BB-SUBSET");

    static private final SubLList $list_alt47 = list(list(makeSymbol("CSETQ"), makeSymbol("INCLUDED-BB-SUBSETS"), list(makeSymbol("DELETE"), makeSymbol("BB-SUBSET-NAME"), makeSymbol("INCLUDED-BB-SUBSETS"))), list(RET, makeSymbol("BB-SUBSET-NAME")));

    static private final SubLSymbol $sym48$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    private static final SubLSymbol CYBLACK_BB_SUBSET_REMOVE_INCLUDED_BB_SUBSET_METHOD = makeSymbol("CYBLACK-BB-SUBSET-REMOVE-INCLUDED-BB-SUBSET-METHOD");

    private static final SubLSymbol GET_TYPE_GRAPH_DECLS = makeSymbol("GET-TYPE-GRAPH-DECLS");

    static private final SubLList $list_alt51 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INHERITED-DECLS"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("INCLUDED-BB-SUBSETS"), list(makeSymbol("CLET"), list(list(makeSymbol("ACTUAL-BB-SUBSET"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("BB-SUBSET"), makeSymbol("INCLUDED-BB-SUBSETS")), list(makeSymbol("CSETQ"), makeSymbol("ACTUAL-BB-SUBSET"), list(makeSymbol("CYBLACK-BB-SUBSET-RETRIEVE-SUBSET"), makeSymbol("BB-SUBSET"))), list(makeSymbol("PIF"), makeSymbol("ACTUAL-BB-SUBSET"), list(makeSymbol("CSETQ"), makeSymbol("INCLUDED-BB-SUBSETS"), list(makeSymbol("NCONC"), makeSymbol("INCLUDED-BB-SUBSETS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TYPE-GRAPH-DECLS"), makeSymbol("CYBLACK-BB-SUBSET")), makeSymbol("ACTUAL-BB-SUBSET")))), list(makeSymbol("WARN"), makeString("(GET-TYPE-GRAPH-DECLS ~S): ~S has not been defined."), makeSymbol("SELF"), makeSymbol("BB-SUBSET")))))), list(RET, list(makeSymbol("NCONC"), makeSymbol("INHERITED-DECLS"), list(makeSymbol("COPY-LIST"), makeSymbol("TYPE-GRAPH-DECLS"))))));

    static private final SubLSymbol $sym52$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    static private final SubLString $str_alt53$_GET_TYPE_GRAPH_DECLS__S____S_has = makeString("(GET-TYPE-GRAPH-DECLS ~S): ~S has not been defined.");

    private static final SubLSymbol CYBLACK_BB_SUBSET_GET_TYPE_GRAPH_DECLS_METHOD = makeSymbol("CYBLACK-BB-SUBSET-GET-TYPE-GRAPH-DECLS-METHOD");

    private static final SubLSymbol SET_TYPE_GRAPH_DECLS = makeSymbol("SET-TYPE-GRAPH-DECLS");

    static private final SubLList $list_alt56 = list(makeSymbol("NEW-TYPE-GRAPH-DECLS"));

    static private final SubLList $list_alt57 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("PROPER-LIST-P"), makeSymbol("NEW-TYPE-GRAPH-DECLS")), makeString("(SET-TYPE-GRAPH-DECLS ~S): ~S is not a valid list of type graph decls."), makeSymbol("SELF"), makeSymbol("NEW-TYPE-GRAPH-DECLS")), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE-GRAPH-DECL"), makeSymbol("NEW-TYPE-GRAPH-DECLS")), list(makeSymbol("ADD-TYPE-GRAPH-DECL"), makeSymbol("SELF"), makeSymbol("TYPE-GRAPH-DECL"))), list(RET, makeSymbol("NEW-TYPE-GRAPH-DECLS")));

    private static final SubLSymbol CYBLACK_BB_SUBSET_SET_TYPE_GRAPH_DECLS_METHOD = makeSymbol("CYBLACK-BB-SUBSET-SET-TYPE-GRAPH-DECLS-METHOD");

    private static final SubLSymbol ADD_TYPE_GRAPH_DECL = makeSymbol("ADD-TYPE-GRAPH-DECL");

    static private final SubLList $list_alt60 = list(makeSymbol("DECL"));

    static private final SubLList $list_alt61 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("CONSP"), makeSymbol("DECL")), list(makeSymbol("PROPER-LIST-P"), makeSymbol("DECL"))), makeString("(ADD-TYPE-GRAPH-DECL ~S): ~S is not a valid type graph declaration.  A proper list was expected."), makeSymbol("SELF"), makeSymbol("DECL")), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("PCOND"), list(list(EQ, list(makeSymbol("CAR"), makeSymbol("DECL")), makeKeyword("ROOT-TYPE")), list(makeSymbol("MUST"), list(makeSymbol("DESTRUCTURING-PREDICATION-GENERATOR"), list(makeSymbol("STRINGP")), list(makeSymbol("CDR"), makeSymbol("DECL"))), makeString("(ADD-TYPE-GRAPH-DECL ~S): ~S is an incorrect formulation of a root type type graph declaration. ~\n               A list of the form (:ROOT-TYPE <string>) was expected."), makeSymbol("SELF"), makeSymbol("DECL"))), list(list(EQ, list(makeSymbol("CAR"), makeSymbol("DECL")), makeKeyword("SUBTYPE")), list(makeSymbol("MUST"), list(makeSymbol("DESTRUCTURING-PREDICATION-GENERATOR"), list(makeSymbol("STRINGP"), makeSymbol("STRINGP")), list(makeSymbol("CDR"), makeSymbol("DECL"))), makeString("(ADD-TYPE-GRAPH-DECL ~S): ~S is an incorrect formulation of a subtype type graph declaration. ~\n               A list of the form (:SUBTYPE <string> <string>) was expected."), makeSymbol("SELF"), makeSymbol("DECL"))), list(T, list(makeSymbol("ERROR"), makeString("(ADD-TYPE-GRAPH-DECL ~S): ~S is an incorrect formulation of a type graph declaration. ~\n                    A list of the form (:ROOT-TYPE <string>) or (:SUBTYPE <string> <string>) was expected."), makeSymbol("SELF"), makeSymbol("DECL"))))), list(makeSymbol("CSETQ"), makeSymbol("TYPE-GRAPH-DECLS"), list(makeSymbol("NREVERSE"), list(makeSymbol("CONS"), list(makeSymbol("COPY-LIST"), makeSymbol("DECL")), list(makeSymbol("NREVERSE"), makeSymbol("TYPE-GRAPH-DECLS"))))), list(RET, makeSymbol("DECL")));

    static private final SubLSymbol $sym62$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    private static final SubLSymbol CYBLACK_BB_SUBSET_ADD_TYPE_GRAPH_DECL_METHOD = makeSymbol("CYBLACK-BB-SUBSET-ADD-TYPE-GRAPH-DECL-METHOD");

    private static final SubLSymbol REMOVE_TYPE_GRAPH_DECL = makeSymbol("REMOVE-TYPE-GRAPH-DECL");

    static private final SubLList $list_alt65 = list(makeSymbol("TYPE-NAME-STRING"));

    static private final SubLList $list_alt66 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("STRINGP"), makeSymbol("TYPE-NAME-STRING")), makeString("(REMOVE-TYPE-GRAPH-DECL ~S): ~S is not a valid type name string."), makeSymbol("SELF"), makeSymbol("TYPE-NAME-STRING")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-GRAPH-DECLS"), list(makeSymbol("DELETE"), makeSymbol("TYPE-NAME-STRING"), makeSymbol("TYPE-GRAPH-DECLS"), list(makeSymbol("FUNCTION"), EQUAL), list(makeSymbol("FUNCTION"), makeSymbol("CAR")))), list(RET, makeSymbol("TYPE-NAME-STRING")));

    static private final SubLSymbol $sym67$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");



    private static final SubLSymbol CYBLACK_BB_SUBSET_REMOVE_TYPE_GRAPH_DECL_METHOD = makeSymbol("CYBLACK-BB-SUBSET-REMOVE-TYPE-GRAPH-DECL-METHOD");

    private static final SubLSymbol GET_TYPE_TO_POSTING_CLASS_MAP_DECLS = makeSymbol("GET-TYPE-TO-POSTING-CLASS-MAP-DECLS");

    static private final SubLList $list_alt71 = list(list(RET, list(makeSymbol("COPY-LIST"), makeSymbol("TYPE-TO-POSTING-CLASS-MAP-DECLS"))));

    private static final SubLSymbol CYBLACK_BB_SUBSET_GET_TYPE_TO_POSTING_CLASS_MAP_DECLS_METHOD = makeSymbol("CYBLACK-BB-SUBSET-GET-TYPE-TO-POSTING-CLASS-MAP-DECLS-METHOD");

    private static final SubLSymbol SET_TYPE_TO_POSTING_CLASS_MAP_DECLS = makeSymbol("SET-TYPE-TO-POSTING-CLASS-MAP-DECLS");

    static private final SubLList $list_alt74 = list(makeSymbol("NEW-TYPE-TO-POSTING-CLASS-MAP-DECLS"));

    static private final SubLList $list_alt75 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("PROPER-LIST-P"), makeSymbol("NEW-TYPE-TO-POSTING-CLASS-MAP-DECLS")), makeString("(SET-TYPE-TO-POSTING-CLASS-MAP-DECLS ~S): ~S is not a proper list.  A proper list was expected."), makeSymbol("SELF"), makeSymbol("NEW-TYPE-TO-POSTING-CLASS-MAP-DECLS")), list(makeSymbol("CDOLIST"), list(makeSymbol("DECL"), makeSymbol("NEW-TYPE-TO-POSTING-CLASS-MAP-DECLS")), list(makeSymbol("ADD-TYPE-TO-POSTING-CLASS-MAP-DECL"), makeSymbol("SELF"), makeSymbol("DECL"))), list(RET, makeSymbol("NEW-TYPE-TO-POSTING-CLASS-MAP-DECLS")));

    private static final SubLSymbol CYBLACK_BB_SUBSET_SET_TYPE_TO_POSTING_CLASS_MAP_DECLS_METHOD = makeSymbol("CYBLACK-BB-SUBSET-SET-TYPE-TO-POSTING-CLASS-MAP-DECLS-METHOD");

    private static final SubLSymbol ADD_TYPE_TO_POSTING_CLASS_MAP_DECL = makeSymbol("ADD-TYPE-TO-POSTING-CLASS-MAP-DECL");

    static private final SubLList $list_alt78 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("PROPER-LIST-P"), makeSymbol("DECL")), list(EQ, list(makeSymbol("CAR"), makeSymbol("DECL")), makeKeyword("POSTING-CLASS")), list(makeSymbol("DESTRUCTURING-PREDICATION-GENERATOR"), list(makeSymbol("STRINGP"), makeSymbol("SYMBOLP")), makeSymbol("DECL"))), makeString("(ADD-TYPE-TO-POSTING-CLASS-MAP-DECL ~S): ~S is not a valid posting class map declaration. ~\n    A list of the form (:POSTING-CLASS <type string> <posting class>) was expected."), makeSymbol("SELF"), makeSymbol("DECL")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-TO-POSTING-CLASS-MAP-DECLS"), list(makeSymbol("NREVERSE"), list(makeSymbol("CONS"), list(makeSymbol("COPY-LIST"), makeSymbol("DECL")), list(makeSymbol("NREVERSE"), makeSymbol("TYPE-TO-POSTING-CLASS-MAP-DECLS"))))), list(RET, makeSymbol("DECL")));

    static private final SubLSymbol $sym79$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    private static final SubLSymbol CYBLACK_BB_SUBSET_ADD_TYPE_TO_POSTING_CLASS_MAP_DECL_METHOD = makeSymbol("CYBLACK-BB-SUBSET-ADD-TYPE-TO-POSTING-CLASS-MAP-DECL-METHOD");

    private static final SubLSymbol REMOVE_TYPE_TO_POSTING_CLASS_MAP_DECL = makeSymbol("REMOVE-TYPE-TO-POSTING-CLASS-MAP-DECL");

    static private final SubLList $list_alt82 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("STRINGP"), makeSymbol("TYPE-NAME-STRING")), makeString("(REMOVE-TYPE-TO-POSTING-CLASS-MAP-DECL ~S): ~S is not a valid type name string.  A string was expected."), makeSymbol("SELF"), makeSymbol("TYPE-NAME-STRING")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-TO-POSTING-CLASS-MAP-DECLS"), list(makeSymbol("DELETE"), makeSymbol("TYPE-NAME-STRING"), makeSymbol("TYPE-TO-POSTING-CLASS-MAP-DECLS"), list(makeSymbol("FUNCTION"), EQUAL), list(makeSymbol("FUNCTION"), makeSymbol("CAR")))), list(RET, makeSymbol("TYPE-NAME-STRING")));

    static private final SubLSymbol $sym83$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    private static final SubLSymbol CYBLACK_BB_SUBSET_REMOVE_TYPE_TO_POSTING_CLASS_MAP_DECL_METHOD = makeSymbol("CYBLACK-BB-SUBSET-REMOVE-TYPE-TO-POSTING-CLASS-MAP-DECL-METHOD");

    private static final SubLSymbol GET_TYPE_TO_PANEL_CLASS_MAP_DECLS = makeSymbol("GET-TYPE-TO-PANEL-CLASS-MAP-DECLS");

    static private final SubLList $list_alt86 = list(list(RET, list(makeSymbol("COPY-LIST"), makeSymbol("TYPE-TO-PANEL-CLASS-MAP-DECLS"))));

    static private final SubLSymbol $sym87$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    private static final SubLSymbol CYBLACK_BB_SUBSET_GET_TYPE_TO_PANEL_CLASS_MAP_DECLS_METHOD = makeSymbol("CYBLACK-BB-SUBSET-GET-TYPE-TO-PANEL-CLASS-MAP-DECLS-METHOD");

    private static final SubLSymbol SET_TYPE_TO_PANEL_CLASS_MAP_DECLS = makeSymbol("SET-TYPE-TO-PANEL-CLASS-MAP-DECLS");

    static private final SubLList $list_alt90 = list(makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP-DECLS"));

    static private final SubLList $list_alt91 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("PROPER-LIST-P"), makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP-DECLS")), makeString("(SET-TYPE-TO-PANEL-CLASS-MAP-DECLS ~S): ~S is not a proper list.  A proper list was expected."), makeSymbol("SELF"), makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP-DECLS")), list(makeSymbol("CDOLIST"), list(makeSymbol("DECL"), makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP-DECLS")), list(makeSymbol("ADD-TYPE-TO-PANEL-CLASS-MAP-DECL"), makeSymbol("SELF"), makeSymbol("DECL"))), list(RET, makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP-DECLS")));

    private static final SubLSymbol CYBLACK_BB_SUBSET_SET_TYPE_TO_PANEL_CLASS_MAP_DECLS_METHOD = makeSymbol("CYBLACK-BB-SUBSET-SET-TYPE-TO-PANEL-CLASS-MAP-DECLS-METHOD");

    private static final SubLSymbol ADD_TYPE_TO_PANEL_CLASS_MAP_DECL = makeSymbol("ADD-TYPE-TO-PANEL-CLASS-MAP-DECL");

    static private final SubLList $list_alt94 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("PROPER-LIST-P"), makeSymbol("DECL")), list(EQ, list(makeSymbol("CAR"), makeSymbol("DECL")), makeKeyword("PANEL-CLASS")), list(makeSymbol("DESTRUCTURING-PREDICATION-GENERATOR"), list(makeSymbol("STRINGP"), makeSymbol("SYMBOLP")), makeSymbol("DECL"))), makeString("(ADD-TYPE-TO-PANEL-CLASS-MAP-DECL ~S): ~S is not a valid panel class map declaration. ~\n    A list of the form (:PANEL-CLASS <type string> <posting class>) was expected."), makeSymbol("SELF"), makeSymbol("DECL")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-TO-PANEL-CLASS-MAP-DECLS"), list(makeSymbol("NREVERSE"), list(makeSymbol("CONS"), list(makeSymbol("COPY-LIST"), makeSymbol("DECL")), list(makeSymbol("NREVERSE"), makeSymbol("TYPE-TO-PANEL-CLASS-MAP-DECLS"))))), list(RET, makeSymbol("DECL")));

    static private final SubLSymbol $sym95$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    private static final SubLSymbol CYBLACK_BB_SUBSET_ADD_TYPE_TO_PANEL_CLASS_MAP_DECL_METHOD = makeSymbol("CYBLACK-BB-SUBSET-ADD-TYPE-TO-PANEL-CLASS-MAP-DECL-METHOD");

    private static final SubLSymbol REMOVE_TYPE_TO_PANEL_CLASS_MAP_DECL = makeSymbol("REMOVE-TYPE-TO-PANEL-CLASS-MAP-DECL");

    static private final SubLList $list_alt98 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("STRINGP"), makeSymbol("TYPE-NAME-STRING")), makeString("(REMOVE-TYPE-TO-PANEL-CLASS-MAP-DECL ~S): ~S is not a valid type name string.  A string was expected."), makeSymbol("SELF"), makeSymbol("TYPE-NAME-STRING")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-TO-PANEL-CLASS-MAP-DECLS"), list(makeSymbol("DELETE"), makeSymbol("TYPE-NAME-STRING"), makeSymbol("TYPE-TO-PANEL-CLASS-MAP-DECLS"), list(makeSymbol("FUNCTION"), EQUAL), list(makeSymbol("FUNCTION"), makeSymbol("CAR")))), list(RET, makeSymbol("TYPE-NAME-STRING")));

    static private final SubLSymbol $sym99$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    private static final SubLSymbol CYBLACK_BB_SUBSET_REMOVE_TYPE_TO_PANEL_CLASS_MAP_DECL_METHOD = makeSymbol("CYBLACK-BB-SUBSET-REMOVE-TYPE-TO-PANEL-CLASS-MAP-DECL-METHOD");

    private static final SubLSymbol ADD_TYPE = makeSymbol("ADD-TYPE");

    static private final SubLList $list_alt102 = list(makeSymbol("TYPE-NAME-STRING"), makeSymbol("SUPER-TYPE-NAME-STRING"), makeSymbol("POSTING-CLASS"), makeSymbol("PANEL-CLASS"));

    static private final SubLList $list_alt103 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("TYPE-NAME-STRING")), makeString("(ADD-TYPE ~S): ~S is not a valid type name string.  A string was expected."), makeSymbol("SELF"), makeSymbol("TYPE-NAME-STRING")), list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("SUPER-TYPE-NAME-STRING")), makeString("(ADD-TYPE ~S): ~S is not a valid type name string.  A string was expected."), makeSymbol("SELF"), makeSymbol("SUPER-TYPE-NAME-STRING")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("POSTING-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("POSTING-CLASS"))), makeString("(ADD-TYPE ~S): ~S is not a valid posting class symbolic name.  A non NIL symbol was expected."), makeSymbol("SELF"), makeSymbol("POSTING-CLASS")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("PANEL-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("PANEL-CLASS"))), makeString("(ADD-TYPE ~S): ~S is not a valid panel class symbolic name.  A non NIL symbol was expected."), makeSymbol("SELF"), makeSymbol("PANEL-CLASS"))), list(makeSymbol("ADD-TYPE-GRAPH-DECL"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("SUBTYPE"), makeSymbol("TYPE-NAME-STRING"), makeSymbol("SUPER-TYPE-NAME-STRING"))), list(makeSymbol("ADD-TYPE-TO-POSTING-CLASS-MAP-DECL"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("POSTING-CLASS"), makeSymbol("TYPE-NAME-STRING"), makeSymbol("POSTING-CLASS"))), list(makeSymbol("ADD-TYPE-TO-PANEL-CLASS-MAP-DECL"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeKeyword("PANEL-CLASS"), makeSymbol("TYPE-NAME-STRING"), makeSymbol("PANEL-CLASS"))), list(RET, makeSymbol("SELF")));



    private static final SubLSymbol $POSTING_CLASS = makeKeyword("POSTING-CLASS");

    private static final SubLSymbol $PANEL_CLASS = makeKeyword("PANEL-CLASS");

    private static final SubLSymbol CYBLACK_BB_SUBSET_ADD_TYPE_METHOD = makeSymbol("CYBLACK-BB-SUBSET-ADD-TYPE-METHOD");

    private static final SubLSymbol REMOVE_TYPE = makeSymbol("REMOVE-TYPE");

    static private final SubLList $list_alt109 = list(list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TYPE-NAME-STRING")), makeString("(REMOVE-TYPE ~S): ~S is not a valid type name string.  A string was expected."), makeSymbol("SELF"), makeSymbol("TYPE-NAME-STRING")), list(makeSymbol("REMOVE-TYPE-GRAPH-DECL"), makeSymbol("SELF"), makeSymbol("TYPE-NAME-STRING")), list(makeSymbol("REMOVE-TYPE-TO-POSTING-CLASS-MAP-DECL"), makeSymbol("SELF"), makeSymbol("TYPE-NAME-STRING")), list(makeSymbol("REMOVE-TYPE-TO-PANEL-CLASS-MAP-DECL"), makeSymbol("SELF"), makeSymbol("TYPE-NAME-STRING")), list(RET, makeSymbol("TYPE-NAME-STRING")));

    private static final SubLSymbol CYBLACK_BB_SUBSET_REMOVE_TYPE_METHOD = makeSymbol("CYBLACK-BB-SUBSET-REMOVE-TYPE-METHOD");

    private static final SubLSymbol GET_OPTIONS = makeSymbol("GET-OPTIONS");

    static private final SubLList $list_alt112 = list(list(RET, makeSymbol("OPTIONS")));

    private static final SubLSymbol CYBLACK_BB_SUBSET_GET_OPTIONS_METHOD = makeSymbol("CYBLACK-BB-SUBSET-GET-OPTIONS-METHOD");

    private static final SubLSymbol SET_OPTIONS = makeSymbol("SET-OPTIONS");

    static private final SubLList $list_alt115 = list(makeSymbol("NEW-OPTIONS"));

    static private final SubLList $list_alt116 = list(list(makeSymbol("CSETQ"), makeSymbol("OPTIONS"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-OPTIONS"))), list(RET, makeSymbol("NEW-OPTIONS")));

    static private final SubLSymbol $sym117$OUTER_CATCH_FOR_CYBLACK_BB_SUBSET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BB-SUBSET-METHOD");

    private static final SubLSymbol CYBLACK_BB_SUBSET_SET_OPTIONS_METHOD = makeSymbol("CYBLACK-BB-SUBSET-SET-OPTIONS-METHOD");

    static private final SubLString $str_alt119$DEFINE_BLACKBOARD_SUBSET___S_is_n = makeString("DEFINE-BLACKBOARD-SUBSET: ~S is not a valid blackboard subset name.  A non NIL symbol was expected.");

    static private final SubLList $list_alt120 = list(makeKeyword("TYPE-GRAPH"), makeKeyword("TYPE-TO-POSTING-CLASS-MAP"), makeKeyword("TYPE-TO-PANEL-CLASS-MAP"));

    static private final SubLString $str_alt121$DEFINE_BLACKBOARD_SUBSET___S_is_n = makeString("DEFINE-BLACKBOARD-SUBSET: ~S is not a valid blackboard subset body.  An alist with ~\n     keys limited to :TYPE-GRAPH, :TYPE-TO-POSTING-CLASS-MAP, :TYPE-TO-PANEL-CLASS-MAP was ~\n     expected.");

    private static final SubLSymbol $TYPE_GRAPH = makeKeyword("TYPE-GRAPH");

    private static final SubLSymbol $TYPE_TO_POSTING_CLASS_MAP = makeKeyword("TYPE-TO-POSTING-CLASS-MAP");

    private static final SubLSymbol $TYPE_TO_PANEL_CLASS_MAP = makeKeyword("TYPE-TO-PANEL-CLASS-MAP");

    private static final SubLSymbol CONSTRUCT_AND_REGISTER_BLACKBOARD_SUBSET = makeSymbol("CONSTRUCT-AND-REGISTER-BLACKBOARD-SUBSET");



    static private final SubLList $list_alt127 = list(cons(makeSymbol("BLACKBOARD-NAME"), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("BODY"));



    // // Initializers
    public void declareFunctions() {
        declare_cyblack_defbbsubset_file();
    }

    public void initializeVariables() {
        init_cyblack_defbbsubset_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_defbbsubset_file();
    }
}

