/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-OWL
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-owl.lisp
 * created:     2019/07/03 17:37:47
 */
public final class removal_modules_owl extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_owl();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_owl";


    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLObject $const0$owlExportTermFromContextsWithIsaF = reader_make_constant_shell("owlExportTermFromContextsWithIsaFilters");

    private static final SubLString $str4$do_broad_mt_index = makeString("do-broad-mt-index");



    private static final SubLSymbol $REMOVAL_OWL_EXPORT_TERM_FROM_CONTEXTS_WITH_ISA_FILTERS = makeKeyword("REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS");

    private static final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("owlExportTermFromContextsWithIsaFilters"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("owlExportTermFromContextsWithIsaFilters"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-EXPAND") });

    // Definitions
    public static final SubLObject removal_owl_export_term_from_contexts_with_isa_filters_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject cost = ZERO_INTEGER;
            SubLObject mt_set = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject cdolist_list_var = quantities.set_extent(mt_set, UNPROVIDED, UNPROVIDED);
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                cost = add(cost, kb_indexing.num_mt_index(mt));
            }
            return cost;
        }
    }

    // Definitions
    public static SubLObject removal_owl_export_term_from_contexts_with_isa_filters_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject cost = ZERO_INTEGER;
        final SubLObject mt_set = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject cdolist_list_var = quantities.set_extent(mt_set, UNPROVIDED, UNPROVIDED);
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cost = add(cost, kb_indexing.num_mt_index(mt));
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return cost;
    }

    public static final SubLObject removal_owl_export_term_from_contexts_with_isa_filters_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
                SubLObject mt_set = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject col_set = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject mts = quantities.set_extent(mt_set, UNPROVIDED, UNPROVIDED);
                SubLObject cols = quantities.set_extent(col_set, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = mts;
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    {
                        SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
                        if (pcase_var.eql($MT)) {
                            if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                                {
                                    SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                        {
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                                    SubLObject valid = makeBoolean(token_var != ass);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject cdolist_list_var_1 = assertions_high.assertion_forts(ass, T, T, T, NIL);
                                                            SubLObject fort = NIL;
                                                            for (fort = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , fort = cdolist_list_var_1.first()) {
                                                                if (NIL != forts.fort_p(fort)) {
                                                                    if (NIL == isa.isa_anyP(fort, cols, mt, UNPROVIDED)) {
                                                                        set.set_add(fort, fort_set);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($BROAD_MT)) {
                                if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL)) {
                                    {
                                        SubLObject idx = assertion_handles.do_assertions_table();
                                        SubLObject total = id_index_count(idx);
                                        SubLObject sofar = ZERO_INTEGER;
                                        SubLTrampolineFile.checkType($str_alt3$do_broad_mt_index, STRINGP);
                                        {
                                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                $within_noting_percent_progress$.bind(T, thread);
                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                noting_percent_progress_preamble($str_alt3$do_broad_mt_index);
                                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                                    {
                                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                                        SubLObject ass = NIL;
                                                        while (NIL != id) {
                                                            ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                            if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                                                note_percent_progress(sofar, total);
                                                                sofar = add(sofar, ONE_INTEGER);
                                                                if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass, mt, NIL, NIL)) {
                                                                    {
                                                                        SubLObject cdolist_list_var_2 = assertions_high.assertion_forts(ass, T, T, T, NIL);
                                                                        SubLObject fort = NIL;
                                                                        for (fort = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , fort = cdolist_list_var_2.first()) {
                                                                            if (NIL != forts.fort_p(fort)) {
                                                                                if (NIL == isa.isa_anyP(fort, cols, mt, UNPROVIDED)) {
                                                                                    set.set_add(fort, fort_set);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            id = do_id_index_next_id(idx, T, id, state_var);
                                                            state_var = do_id_index_next_state(idx, T, id, state_var);
                                                        } 
                                                    }
                                                }
                                                noting_percent_progress_postamble();
                                            } finally {
                                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject set_contents_var = set.do_set_internal(fort_set);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject fort = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, fort)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_bindings = unification_utilities.term_unify(arg3, fort, T, T);
                                    SubLObject unify_justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != v_bindings) {
                                        {
                                            SubLObject unified_arg3 = bindings.subst_bindings(v_bindings, arg3);
                                            SubLObject support_asent = replace_formula_arg(THREE_INTEGER, unified_arg3, asent);
                                            backward.removal_add_node(arguments.make_hl_support($OPAQUE, support_asent, $$UniversalVocabularyMt, $TRUE_MON), v_bindings, unify_justification);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_owl_export_term_from_contexts_with_isa_filters_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort_set = set.new_set(symbol_function(EQL), UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject mt_set = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject col_set = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject mts = quantities.set_extent(mt_set, UNPROVIDED, UNPROVIDED);
        final SubLObject cols = quantities.set_extent(col_set, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
            if (pcase_var.eql($MT)) {
                if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                    final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(ass));
                            if (NIL != valid) {
                                SubLObject cdolist_list_var_$1 = assertions_high.assertion_forts(ass, T, T, T, NIL);
                                SubLObject fort = NIL;
                                fort = cdolist_list_var_$1.first();
                                while (NIL != cdolist_list_var_$1) {
                                    if ((NIL != forts.fort_p(fort)) && (NIL == isa.isa_anyP(fort, cols, mt, UNPROVIDED))) {
                                        set.set_add(fort, fort_set);
                                    }
                                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                    fort = cdolist_list_var_$1.first();
                                } 
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            } else
                if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = $str4$do_broad_mt_index;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                    final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$2 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$2, $SKIP)) {
                                final SubLObject idx_$3 = idx_$2;
                                if (NIL == id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$3);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject ass2;
                                    SubLObject cdolist_list_var_$2;
                                    SubLObject fort2;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        a_handle = aref(vector_var, a_id);
                                        if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(a_handle)) {
                                                a_handle = $SKIP;
                                            }
                                            ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass2, mt, NIL, NIL)) {
                                                cdolist_list_var_$2 = assertions_high.assertion_forts(ass2, T, T, T, NIL);
                                                fort2 = NIL;
                                                fort2 = cdolist_list_var_$2.first();
                                                while (NIL != cdolist_list_var_$2) {
                                                    if ((NIL != forts.fort_p(fort2)) && (NIL == isa.isa_anyP(fort2, cols, mt, UNPROVIDED))) {
                                                        set.set_add(fort2, fort_set);
                                                    }
                                                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                                    fort2 = cdolist_list_var_$2.first();
                                                } 
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$4 = idx_$2;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$4)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$4);
                                    SubLObject a_id2 = id_index_sparse_id_threshold(idx_$4);
                                    final SubLObject end_id = id_index_next_id(idx_$4);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                            final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass3, mt, NIL, NIL)) {
                                                SubLObject cdolist_list_var_$3 = assertions_high.assertion_forts(ass3, T, T, T, NIL);
                                                SubLObject fort3 = NIL;
                                                fort3 = cdolist_list_var_$3.first();
                                                while (NIL != cdolist_list_var_$3) {
                                                    if ((NIL != forts.fort_p(fort3)) && (NIL == isa.isa_anyP(fort3, cols, mt, UNPROVIDED))) {
                                                        set.set_add(fort3, fort_set);
                                                    }
                                                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                                    fort3 = cdolist_list_var_$3.first();
                                                } 
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        a_id2 = add(a_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        final SubLObject set_contents_var = set.do_set_internal(fort_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject fort4;
        SubLObject v_bindings;
        SubLObject unify_justification;
        SubLObject unified_arg3;
        SubLObject support_asent;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            fort4 = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, fort4)) {
                thread.resetMultipleValues();
                v_bindings = unification_utilities.term_unify(arg3, fort4, T, T);
                unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    unified_arg3 = bindings.subst_bindings(v_bindings, arg3);
                    support_asent = replace_formula_arg(THREE_INTEGER, unified_arg3, asent);
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, support_asent, $$UniversalVocabularyMt, $TRUE_MON), v_bindings, unify_justification);
                }
            }
        }
        return NIL;
    }

    static private final SubLString $str_alt3$do_broad_mt_index = makeString("do-broad-mt-index");

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("owlExportTermFromContextsWithIsaFilters"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("owlExportTermFromContextsWithIsaFilters"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-EXPAND") });

    public static SubLObject declare_removal_modules_owl_file() {
        declareFunction("removal_owl_export_term_from_contexts_with_isa_filters_cost", "REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-COST", 1, 1, false);
        declareFunction("removal_owl_export_term_from_contexts_with_isa_filters_expand", "REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_owl_file() {
        return NIL;
    }

    public static final SubLObject setup_removal_modules_owl_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($const0$owlExportTermFromContextsWithIsaF);
        inference_modules.inference_removal_module($REMOVAL_OWL_EXPORT_TERM_FROM_CONTEXTS_WITH_ISA_FILTERS, $list_alt10);
        return NIL;
    }

    public static SubLObject setup_removal_modules_owl_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($const0$owlExportTermFromContextsWithIsaF);
            preference_modules.doomed_unless_arg_bindable($POS, $const0$owlExportTermFromContextsWithIsaF, ONE_INTEGER);
            preference_modules.doomed_unless_arg_bindable($POS, $const0$owlExportTermFromContextsWithIsaF, TWO_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_OWL_EXPORT_TERM_FROM_CONTEXTS_WITH_ISA_FILTERS, $list11);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_OWL_EXPORT_TERM_FROM_CONTEXTS_WITH_ISA_FILTERS, $list_alt10);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_owl_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($const0$owlExportTermFromContextsWithIsaF);
        preference_modules.doomed_unless_arg_bindable($POS, $const0$owlExportTermFromContextsWithIsaF, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const0$owlExportTermFromContextsWithIsaF, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_OWL_EXPORT_TERM_FROM_CONTEXTS_WITH_ISA_FILTERS, $list11);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_owl_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_owl_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_owl_file();
    }

    static {
    }
}

/**
 * Total time: 242 ms
 */
