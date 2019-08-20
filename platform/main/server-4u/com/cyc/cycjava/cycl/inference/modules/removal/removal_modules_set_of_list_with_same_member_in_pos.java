/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_set_of_list_with_same_member_in_pos extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_set_of_list_with_same_member_in_pos();





    private static final SubLSymbol $REMOVAL_SET_OF_LIST_WITH_SAME_MEMBER_IN_POS_UNIFY_ARG1 = makeKeyword("REMOVAL-SET-OF-LIST-WITH-SAME-MEMBER-IN-POS-UNIFY-ARG1");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("setOfListWithSameMemberInPos"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("setOfListWithSameMemberInPos"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-SET-OF-LIST-WITH-SAME-MEMBER-IN-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("SET-OF-LIST-WITH-SAME-MEMBER-IN-POS"), makeKeyword("DOCUMENTATION"), makeString("(#$setOfListWithSameMemberInPos :not-fully-bound :fully-bound :fully-bound)"), makeKeyword("EXAMPLE"), makeString("(#$setOfListWithSameMemberInPos ?X 1 (#$TheList (#$TheList 1 2) (#$TheList 1 4) (#$TheList 3 4) (#$TheList 3 5) (#$TheList 1 6) (#$TheList 2 3)) \nwill bind ?X to (#$TheSet (#$TheList 1 2) (#$TheList 1 4) (#$TheList 1 6)), (#$TheSet (#$TheList 3 4) (#$TheList 3 5)) and (#$TheSet (#$TheList 2 3))") });



    private static final SubLSymbol SET_OF_LIST_WITH_SAME_MEMBER_IN_POS = makeSymbol("SET-OF-LIST-WITH-SAME-MEMBER-IN-POS");

    // Definitions
    public static final SubLObject set_of_list_with_same_member_in_pos_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_of_lists = cycl_utilities.formula_arg3(asent, UNPROVIDED);
                SubLObject n = cycl_utilities.formula_arg2(asent, UNPROVIDED);
                SubLObject result = NIL;
                SubLObject found = make_hash_table(EIGHT_INTEGER, EQL, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = list_of_lists.rest();
                    SubLObject list = NIL;
                    for (list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , list = cdolist_list_var.first()) {
                        {
                            SubLObject element = nth(n, list);
                            SubLObject value = gethash(element, found, UNPROVIDED);
                            value = cons(list, value);
                            sethash(element, found, value);
                        }
                    }
                }
                {
                    SubLObject key = NIL;
                    SubLObject val = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(found);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                key = getEntryKey(cdohash_entry);
                                val = getEntryValue(cdohash_entry);
                                result = cons(cons($$TheSet, val), result);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = result;
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(binding, cycl_utilities.formula_arg1(asent, UNPROVIDED), T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject bound_arg1 = bindings.subst_bindings(v_bindings, cycl_utilities.formula_arg1(asent, UNPROVIDED));
                                    SubLObject unified_asent = replace_formula_arg(ONE_INTEGER, bound_arg1, asent);
                                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, unified_asent, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    // Definitions
    public static SubLObject set_of_list_with_same_member_in_pos(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_of_lists = cycl_utilities.formula_arg3(asent, UNPROVIDED);
        final SubLObject n = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject found = make_hash_table(EIGHT_INTEGER, EQUAL, UNPROVIDED);
        SubLObject cdolist_list_var = list_of_lists.rest();
        SubLObject list = NIL;
        list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject element = nth(n, list);
            SubLObject value = gethash(element, found, UNPROVIDED);
            value = cons(list, value);
            sethash(element, found, value);
            cdolist_list_var = cdolist_list_var.rest();
            list = cdolist_list_var.first();
        } 
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(found);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                result = cons(cons($$TheSet, val), result);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        cdolist_list_var = result;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(binding, cycl_utilities.formula_arg1(asent, UNPROVIDED), T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject bound_arg1 = bindings.subst_bindings(v_bindings, cycl_utilities.formula_arg1(asent, UNPROVIDED));
                final SubLObject unified_asent = replace_formula_arg(ONE_INTEGER, bound_arg1, asent);
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, unified_asent, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_set_of_list_with_same_member_in_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return divide(length(cycl_utilities.formula_arg3(asent, UNPROVIDED)), TWO_INTEGER);
    }

    public static SubLObject removal_set_of_list_with_same_member_in_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return divide(length(cycl_utilities.formula_arg3(asent, UNPROVIDED)), TWO_INTEGER);
    }

    public static SubLObject declare_removal_modules_set_of_list_with_same_member_in_pos_file() {
        declareFunction("set_of_list_with_same_member_in_pos", "SET-OF-LIST-WITH-SAME-MEMBER-IN-POS", 1, 1, false);
        declareFunction("removal_set_of_list_with_same_member_in_pos_cost", "REMOVAL-SET-OF-LIST-WITH-SAME-MEMBER-IN-POS-COST", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_set_of_list_with_same_member_in_pos_file() {
        return NIL;
    }

    public static final SubLObject setup_removal_modules_set_of_list_with_same_member_in_pos_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$setOfListWithSameMemberInPos);
        inference_modules.inference_removal_module($REMOVAL_SET_OF_LIST_WITH_SAME_MEMBER_IN_POS_UNIFY_ARG1, $list_alt2);
        note_funcall_helper_function(SET_OF_LIST_WITH_SAME_MEMBER_IN_POS);
        return NIL;
    }

    public static SubLObject setup_removal_modules_set_of_list_with_same_member_in_pos_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$setOfListWithSameMemberInPos);
            preference_modules.doomed_unless_arg_bindable($POS, $$setOfListWithSameMemberInPos, TWO_INTEGER);
            preference_modules.doomed_unless_arg_bindable($POS, $$setOfListWithSameMemberInPos, THREE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_SET_OF_LIST_WITH_SAME_MEMBER_IN_POS_UNIFY_ARG1, $list3);
            note_funcall_helper_function(SET_OF_LIST_WITH_SAME_MEMBER_IN_POS);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_SET_OF_LIST_WITH_SAME_MEMBER_IN_POS_UNIFY_ARG1, $list_alt2);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_set_of_list_with_same_member_in_pos_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$setOfListWithSameMemberInPos);
        preference_modules.doomed_unless_arg_bindable($POS, $$setOfListWithSameMemberInPos, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$setOfListWithSameMemberInPos, THREE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SET_OF_LIST_WITH_SAME_MEMBER_IN_POS_UNIFY_ARG1, $list3);
        note_funcall_helper_function(SET_OF_LIST_WITH_SAME_MEMBER_IN_POS);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("setOfListWithSameMemberInPos"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("setOfListWithSameMemberInPos"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-SET-OF-LIST-WITH-SAME-MEMBER-IN-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("SET-OF-LIST-WITH-SAME-MEMBER-IN-POS"), makeKeyword("DOCUMENTATION"), makeString("(#$setOfListWithSameMemberInPos :not-fully-bound :fully-bound :fully-bound)"), makeKeyword("EXAMPLE"), makeString("(#$setOfListWithSameMemberInPos ?X 1 (#$TheList (#$TheList 1 2) (#$TheList 1 4) (#$TheList 3 4) (#$TheList 3 5) (#$TheList 1 6) (#$TheList 2 3)) \nwill bind ?X to (#$TheSet (#$TheList 1 2) (#$TheList 1 4) (#$TheList 1 6)), (#$TheSet (#$TheList 3 4) (#$TheList 3 5)) and (#$TheSet (#$TheList 2 3))") });

    @Override
    public void declareFunctions() {
        declare_removal_modules_set_of_list_with_same_member_in_pos_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_set_of_list_with_same_member_in_pos_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_set_of_list_with_same_member_in_pos_file();
    }

    static {
    }
}

/**
 * Total time: 96 ms
 */
