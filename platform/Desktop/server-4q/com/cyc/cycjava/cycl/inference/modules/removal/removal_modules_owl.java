package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_owl extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_owl";
    public static final String myFingerPrint = "f40be090bfa082d89be83a0b3d5015dc1053c86df662e226c5121077c6888ea3";
    private static final SubLObject $const0$owlExportTermFromContextsWithIsaF;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$MT;
    private static final SubLSymbol $kw3$BROAD_MT;
    private static final SubLString $str4$do_broad_mt_index;
    private static final SubLSymbol $sym5$STRINGP;
    private static final SubLSymbol $kw6$SKIP;
    private static final SubLSymbol $kw7$OPAQUE;
    private static final SubLObject $const8$UniversalVocabularyMt;
    private static final SubLSymbol $kw9$TRUE_MON;
    private static final SubLSymbol $kw10$REMOVAL_OWL_EXPORT_TERM_FROM_CONTEXTS_WITH_ISA_FILTERS;
    private static final SubLList $list11;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-owl.lisp", position = 1092L)
    public static SubLObject removal_owl_export_term_from_contexts_with_isa_filters_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_owl.UNPROVIDED) {
            sense = (SubLObject)removal_modules_owl.NIL;
        }
        SubLObject cost = (SubLObject)removal_modules_owl.ZERO_INTEGER;
        final SubLObject mt_set = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_owl.UNPROVIDED);
        SubLObject cdolist_list_var = quantities.set_extent(mt_set, (SubLObject)removal_modules_owl.UNPROVIDED, (SubLObject)removal_modules_owl.UNPROVIDED);
        SubLObject mt = (SubLObject)removal_modules_owl.NIL;
        mt = cdolist_list_var.first();
        while (removal_modules_owl.NIL != cdolist_list_var) {
            cost = Numbers.add(cost, kb_indexing.num_mt_index(mt));
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-owl.lisp", position = 1369L)
    public static SubLObject removal_owl_export_term_from_contexts_with_isa_filters_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_owl.UNPROVIDED) {
            sense = (SubLObject)removal_modules_owl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort_set = set.new_set(Symbols.symbol_function((SubLObject)removal_modules_owl.EQL), (SubLObject)removal_modules_owl.UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_owl.UNPROVIDED);
        final SubLObject mt_set = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_owl.UNPROVIDED);
        final SubLObject col_set = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_owl.UNPROVIDED);
        final SubLObject mts = quantities.set_extent(mt_set, (SubLObject)removal_modules_owl.UNPROVIDED, (SubLObject)removal_modules_owl.UNPROVIDED);
        final SubLObject cols = quantities.set_extent(col_set, (SubLObject)removal_modules_owl.UNPROVIDED, (SubLObject)removal_modules_owl.UNPROVIDED);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = (SubLObject)removal_modules_owl.NIL;
        mt = cdolist_list_var.first();
        while (removal_modules_owl.NIL != cdolist_list_var) {
            final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
            if (pcase_var.eql((SubLObject)removal_modules_owl.$kw2$MT)) {
                if (removal_modules_owl.NIL != kb_mapping_macros.do_mt_index_key_validator(mt, (SubLObject)removal_modules_owl.NIL)) {
                    final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                    SubLObject final_index_iterator = (SubLObject)removal_modules_owl.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_owl.NIL, (SubLObject)removal_modules_owl.NIL, (SubLObject)removal_modules_owl.NIL);
                        SubLObject done_var = (SubLObject)removal_modules_owl.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_owl.NIL;
                        while (removal_modules_owl.NIL == done_var) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(ass));
                            if (removal_modules_owl.NIL != valid) {
                                SubLObject cdolist_list_var_$1 = assertions_high.assertion_forts(ass, (SubLObject)removal_modules_owl.T, (SubLObject)removal_modules_owl.T, (SubLObject)removal_modules_owl.T, (SubLObject)removal_modules_owl.NIL);
                                SubLObject fort = (SubLObject)removal_modules_owl.NIL;
                                fort = cdolist_list_var_$1.first();
                                while (removal_modules_owl.NIL != cdolist_list_var_$1) {
                                    if (removal_modules_owl.NIL != forts.fort_p(fort) && removal_modules_owl.NIL == isa.isa_anyP(fort, cols, mt, (SubLObject)removal_modules_owl.UNPROVIDED)) {
                                        set.set_add(fort, fort_set);
                                    }
                                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                    fort = cdolist_list_var_$1.first();
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_owl.NIL == valid);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_owl.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (removal_modules_owl.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_owl.$kw3$BROAD_MT) && removal_modules_owl.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, (SubLObject)removal_modules_owl.NIL)) {
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = (SubLObject)removal_modules_owl.$str4$do_broad_mt_index;
                final SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = (SubLObject)removal_modules_owl.ZERO_INTEGER;
                assert removal_modules_owl.NIL != Types.stringp(mess) : mess;
                final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)removal_modules_owl.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)removal_modules_owl.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)removal_modules_owl.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess);
                        final SubLObject idx_$2 = idx;
                        if (removal_modules_owl.NIL == id_index.id_index_objects_empty_p(idx_$2, (SubLObject)removal_modules_owl.$kw6$SKIP)) {
                            final SubLObject idx_$3 = idx_$2;
                            if (removal_modules_owl.NIL == id_index.id_index_dense_objects_empty_p(idx_$3, (SubLObject)removal_modules_owl.$kw6$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$3);
                                final SubLObject backwardP_var = (SubLObject)removal_modules_owl.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject ass2;
                                SubLObject cdolist_list_var_$2;
                                SubLObject fort2;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)removal_modules_owl.NIL, v_iteration = (SubLObject)removal_modules_owl.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)removal_modules_owl.ONE_INTEGER)) {
                                    a_id = ((removal_modules_owl.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)removal_modules_owl.ONE_INTEGER) : v_iteration);
                                    a_handle = Vectors.aref(vector_var, a_id);
                                    if (removal_modules_owl.NIL == id_index.id_index_tombstone_p(a_handle) || removal_modules_owl.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_owl.$kw6$SKIP)) {
                                        if (removal_modules_owl.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                            a_handle = (SubLObject)removal_modules_owl.$kw6$SKIP;
                                        }
                                        ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (removal_modules_owl.NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass2, mt, (SubLObject)removal_modules_owl.NIL, (SubLObject)removal_modules_owl.NIL)) {
                                            cdolist_list_var_$2 = assertions_high.assertion_forts(ass2, (SubLObject)removal_modules_owl.T, (SubLObject)removal_modules_owl.T, (SubLObject)removal_modules_owl.T, (SubLObject)removal_modules_owl.NIL);
                                            fort2 = (SubLObject)removal_modules_owl.NIL;
                                            fort2 = cdolist_list_var_$2.first();
                                            while (removal_modules_owl.NIL != cdolist_list_var_$2) {
                                                if (removal_modules_owl.NIL != forts.fort_p(fort2) && removal_modules_owl.NIL == isa.isa_anyP(fort2, cols, mt, (SubLObject)removal_modules_owl.UNPROVIDED)) {
                                                    set.set_add(fort2, fort_set);
                                                }
                                                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                                fort2 = cdolist_list_var_$2.first();
                                            }
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)removal_modules_owl.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$4 = idx_$2;
                            if (removal_modules_owl.NIL == id_index.id_index_sparse_objects_empty_p(idx_$4) || removal_modules_owl.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_owl.$kw6$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$4);
                                SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$4);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$4);
                                final SubLObject v_default = (SubLObject)((removal_modules_owl.NIL != id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_owl.$kw6$SKIP)) ? removal_modules_owl.NIL : removal_modules_owl.$kw6$SKIP);
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                    if (removal_modules_owl.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_owl.$kw6$SKIP) || removal_modules_owl.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                        final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (removal_modules_owl.NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass3, mt, (SubLObject)removal_modules_owl.NIL, (SubLObject)removal_modules_owl.NIL)) {
                                            SubLObject cdolist_list_var_$3 = assertions_high.assertion_forts(ass3, (SubLObject)removal_modules_owl.T, (SubLObject)removal_modules_owl.T, (SubLObject)removal_modules_owl.T, (SubLObject)removal_modules_owl.NIL);
                                            SubLObject fort3 = (SubLObject)removal_modules_owl.NIL;
                                            fort3 = cdolist_list_var_$3.first();
                                            while (removal_modules_owl.NIL != cdolist_list_var_$3) {
                                                if (removal_modules_owl.NIL != forts.fort_p(fort3) && removal_modules_owl.NIL == isa.isa_anyP(fort3, cols, mt, (SubLObject)removal_modules_owl.UNPROVIDED)) {
                                                    set.set_add(fort3, fort_set);
                                                }
                                                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                                fort3 = cdolist_list_var_$3.first();
                                            }
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)removal_modules_owl.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                    a_id2 = Numbers.add(a_id2, (SubLObject)removal_modules_owl.ONE_INTEGER);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_owl.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_owl.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_owl.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            fort4 = set_contents.do_set_contents_next(basis_object, state);
            if (removal_modules_owl.NIL != set_contents.do_set_contents_element_validP(state, fort4)) {
                thread.resetMultipleValues();
                v_bindings = unification_utilities.term_unify(arg3, fort4, (SubLObject)removal_modules_owl.T, (SubLObject)removal_modules_owl.T);
                unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_owl.NIL != v_bindings) {
                    unified_arg3 = bindings.subst_bindings(v_bindings, arg3);
                    support_asent = el_utilities.replace_formula_arg((SubLObject)removal_modules_owl.THREE_INTEGER, unified_arg3, asent);
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_owl.$kw7$OPAQUE, support_asent, removal_modules_owl.$const8$UniversalVocabularyMt, (SubLObject)removal_modules_owl.$kw9$TRUE_MON), v_bindings, unify_justification);
                }
            }
        }
        return (SubLObject)removal_modules_owl.NIL;
    }
    
    public static SubLObject declare_removal_modules_owl_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_owl", "removal_owl_export_term_from_contexts_with_isa_filters_cost", "REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_owl", "removal_owl_export_term_from_contexts_with_isa_filters_expand", "REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_owl.NIL;
    }
    
    public static SubLObject init_removal_modules_owl_file() {
        return (SubLObject)removal_modules_owl.NIL;
    }
    
    public static SubLObject setup_removal_modules_owl_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_owl.$const0$owlExportTermFromContextsWithIsaF);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_owl.$kw1$POS, removal_modules_owl.$const0$owlExportTermFromContextsWithIsaF, (SubLObject)removal_modules_owl.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_owl.$kw1$POS, removal_modules_owl.$const0$owlExportTermFromContextsWithIsaF, (SubLObject)removal_modules_owl.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_owl.$kw10$REMOVAL_OWL_EXPORT_TERM_FROM_CONTEXTS_WITH_ISA_FILTERS, (SubLObject)removal_modules_owl.$list11);
        return (SubLObject)removal_modules_owl.NIL;
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
        me = (SubLFile)new removal_modules_owl();
        $const0$owlExportTermFromContextsWithIsaF = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owlExportTermFromContextsWithIsaFilters"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$MT = SubLObjectFactory.makeKeyword("MT");
        $kw3$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
        $str4$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
        $sym5$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw6$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw7$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const8$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $kw9$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw10$REMOVAL_OWL_EXPORT_TERM_FROM_CONTEXTS_WITH_ISA_FILTERS = SubLObjectFactory.makeKeyword("REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owlExportTermFromContextsWithIsaFilters")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owlExportTermFromContextsWithIsaFilters")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-EXPAND") });
    }
}

/*

	Total time: 242 ms
	
*/