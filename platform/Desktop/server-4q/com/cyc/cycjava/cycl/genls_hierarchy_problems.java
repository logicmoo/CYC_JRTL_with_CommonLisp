package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class genls_hierarchy_problems extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.genls_hierarchy_problems";
    public static final String myFingerPrint = "16ab13d6460d342c092b84088b9bbcb6a1fbd67bd5d99088b9894380941ff26f";
    private static final SubLString $str0$mapping_Cyc_FORTs;
    private static final SubLSymbol $kw1$SKIP;
    private static final SubLSymbol $sym2$FORT_P;
    private static final SubLObject $const3$Thing;
    private static final SubLObject $const4$genls;
    
    @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 1384L)
    public static SubLObject forts_meeting_criterion(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)genls_hierarchy_problems.NIL;
        final SubLObject message = (SubLObject)genls_hierarchy_problems.$str0$mapping_Cyc_FORTs;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = (SubLObject)genls_hierarchy_problems.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)genls_hierarchy_problems.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)genls_hierarchy_problems.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)genls_hierarchy_problems.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = (SubLObject)genls_hierarchy_problems.NIL;
                table_var = cdolist_list_var.first();
                while (genls_hierarchy_problems.NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (genls_hierarchy_problems.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)genls_hierarchy_problems.$kw1$SKIP)) {
                        final SubLObject idx_$1 = idx;
                        if (genls_hierarchy_problems.NIL == id_index.id_index_dense_objects_empty_p(idx_$1, (SubLObject)genls_hierarchy_problems.$kw1$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                            final SubLObject backwardP_var = (SubLObject)genls_hierarchy_problems.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)genls_hierarchy_problems.NIL, v_iteration = (SubLObject)genls_hierarchy_problems.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)genls_hierarchy_problems.ONE_INTEGER)) {
                                id = ((genls_hierarchy_problems.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)genls_hierarchy_problems.ONE_INTEGER) : v_iteration);
                                fort = Vectors.aref(vector_var, id);
                                if (genls_hierarchy_problems.NIL == id_index.id_index_tombstone_p(fort) || genls_hierarchy_problems.NIL == id_index.id_index_skip_tombstones_p((SubLObject)genls_hierarchy_problems.$kw1$SKIP)) {
                                    if (genls_hierarchy_problems.NIL != id_index.id_index_tombstone_p(fort)) {
                                        fort = (SubLObject)genls_hierarchy_problems.$kw1$SKIP;
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)genls_hierarchy_problems.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    if (genls_hierarchy_problems.NIL != Functions.funcall(pred, fort)) {
                                        result = (SubLObject)ConsesLow.cons(fort, result);
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$2 = idx;
                        if (genls_hierarchy_problems.NIL == id_index.id_index_sparse_objects_empty_p(idx_$2) || genls_hierarchy_problems.NIL == id_index.id_index_skip_tombstones_p((SubLObject)genls_hierarchy_problems.$kw1$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$2);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$2);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$2);
                            final SubLObject v_default = (SubLObject)((genls_hierarchy_problems.NIL != id_index.id_index_skip_tombstones_p((SubLObject)genls_hierarchy_problems.$kw1$SKIP)) ? genls_hierarchy_problems.NIL : genls_hierarchy_problems.$kw1$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (genls_hierarchy_problems.NIL == id_index.id_index_skip_tombstones_p((SubLObject)genls_hierarchy_problems.$kw1$SKIP) || genls_hierarchy_problems.NIL == id_index.id_index_tombstone_p(fort2)) {
                                    sofar = Numbers.add(sofar, (SubLObject)genls_hierarchy_problems.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    if (genls_hierarchy_problems.NIL != Functions.funcall(pred, fort2)) {
                                        result = (SubLObject)ConsesLow.cons(fort2, result);
                                    }
                                }
                                id2 = Numbers.add(id2, (SubLObject)genls_hierarchy_problems.ONE_INTEGER);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genls_hierarchy_problems.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 1685L)
    public static SubLObject fort_not_a_thingP(final SubLObject fort) {
        assert genls_hierarchy_problems.NIL != forts.fort_p(fort) : fort;
        return (SubLObject)SubLObjectFactory.makeBoolean(genls_hierarchy_problems.NIL == kb_accessors.kb_thing_p(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 1787L)
    public static SubLObject fort_isa_collection_but_not_a_spec_of_thingP(final SubLObject fort) {
        assert genls_hierarchy_problems.NIL != forts.fort_p(fort) : fort;
        return (SubLObject)SubLObjectFactory.makeBoolean(genls_hierarchy_problems.NIL != fort_types_interface.collection_p(fort) && genls_hierarchy_problems.NIL == genls.genl_in_any_mtP(fort, genls_hierarchy_problems.$const3$Thing));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 1962L)
    public static SubLObject fort_not_a_collection_but_has_specs_or_genlsP(final SubLObject fort) {
        assert genls_hierarchy_problems.NIL != forts.fort_p(fort) : fort;
        return (SubLObject)SubLObjectFactory.makeBoolean(genls_hierarchy_problems.NIL == fort_types_interface.collection_p(fort) && (genls_hierarchy_problems.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(fort, genls_hierarchy_problems.$const4$genls, (SubLObject)genls_hierarchy_problems.ONE_INTEGER, (SubLObject)genls_hierarchy_problems.UNPROVIDED) || genls_hierarchy_problems.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(fort, genls_hierarchy_problems.$const4$genls, (SubLObject)genls_hierarchy_problems.TWO_INTEGER, (SubLObject)genls_hierarchy_problems.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 2203L)
    public static SubLObject fort_isa_thing_but_neither_a_set_or_collection_nor_individualP(final SubLObject fort) {
        assert genls_hierarchy_problems.NIL != forts.fort_p(fort) : fort;
        return (SubLObject)SubLObjectFactory.makeBoolean(genls_hierarchy_problems.NIL != kb_accessors.kb_thing_p(fort) && genls_hierarchy_problems.NIL == kb_accessors.kb_set_or_collection_p(fort) && genls_hierarchy_problems.NIL == kb_accessors.kb_individual_p(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 2429L)
    public static SubLObject fort_neither_a_set_or_collection_nor_individualP(final SubLObject fort) {
        assert genls_hierarchy_problems.NIL != forts.fort_p(fort) : fort;
        return (SubLObject)SubLObjectFactory.makeBoolean(genls_hierarchy_problems.NIL == kb_accessors.kb_set_or_collection_p(fort) && genls_hierarchy_problems.NIL == kb_accessors.kb_individual_p(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 2617L)
    public static SubLObject fort_both_a_set_or_collection_and_individualP(final SubLObject fort) {
        assert genls_hierarchy_problems.NIL != forts.fort_p(fort) : fort;
        return (SubLObject)SubLObjectFactory.makeBoolean(genls_hierarchy_problems.NIL != kb_accessors.kb_set_or_collection_p(fort) && genls_hierarchy_problems.NIL != kb_accessors.kb_individual_p(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 2788L)
    public static SubLObject fort_not_properly_in_genls_hierarchyP(final SubLObject fort) {
        assert genls_hierarchy_problems.NIL != forts.fort_p(fort) : fort;
        if (genls_hierarchy_problems.NIL != fort_types_interface.collection_p(fort)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(genls_hierarchy_problems.NIL == genls.genl_in_any_mtP(fort, genls_hierarchy_problems.$const3$Thing));
        }
        if (genls_hierarchy_problems.NIL != kb_accessors.kb_individual_p(fort)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(genls_hierarchy_problems.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(fort, genls_hierarchy_problems.$const4$genls, (SubLObject)genls_hierarchy_problems.ONE_INTEGER, (SubLObject)genls_hierarchy_problems.UNPROVIDED) || genls_hierarchy_problems.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(fort, genls_hierarchy_problems.$const4$genls, (SubLObject)genls_hierarchy_problems.TWO_INTEGER, (SubLObject)genls_hierarchy_problems.UNPROVIDED));
        }
        if (genls_hierarchy_problems.NIL != kb_accessors.kb_set_mathematical_p(fort)) {
            return (SubLObject)genls_hierarchy_problems.NIL;
        }
        return (SubLObject)genls_hierarchy_problems.T;
    }
    
    public static SubLObject declare_genls_hierarchy_problems_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls_hierarchy_problems", "forts_meeting_criterion", "FORTS-MEETING-CRITERION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls_hierarchy_problems", "fort_not_a_thingP", "FORT-NOT-A-THING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls_hierarchy_problems", "fort_isa_collection_but_not_a_spec_of_thingP", "FORT-ISA-COLLECTION-BUT-NOT-A-SPEC-OF-THING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls_hierarchy_problems", "fort_not_a_collection_but_has_specs_or_genlsP", "FORT-NOT-A-COLLECTION-BUT-HAS-SPECS-OR-GENLS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls_hierarchy_problems", "fort_isa_thing_but_neither_a_set_or_collection_nor_individualP", "FORT-ISA-THING-BUT-NEITHER-A-SET-OR-COLLECTION-NOR-INDIVIDUAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls_hierarchy_problems", "fort_neither_a_set_or_collection_nor_individualP", "FORT-NEITHER-A-SET-OR-COLLECTION-NOR-INDIVIDUAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls_hierarchy_problems", "fort_both_a_set_or_collection_and_individualP", "FORT-BOTH-A-SET-OR-COLLECTION-AND-INDIVIDUAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls_hierarchy_problems", "fort_not_properly_in_genls_hierarchyP", "FORT-NOT-PROPERLY-IN-GENLS-HIERARCHY?", 1, 0, false);
        return (SubLObject)genls_hierarchy_problems.NIL;
    }
    
    public static SubLObject init_genls_hierarchy_problems_file() {
        return (SubLObject)genls_hierarchy_problems.NIL;
    }
    
    public static SubLObject setup_genls_hierarchy_problems_file() {
        return (SubLObject)genls_hierarchy_problems.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_genls_hierarchy_problems_file();
    }
    
    @Override
	public void initializeVariables() {
        init_genls_hierarchy_problems_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_genls_hierarchy_problems_file();
    }
    
    static {
        me = (SubLFile)new genls_hierarchy_problems();
        $str0$mapping_Cyc_FORTs = SubLObjectFactory.makeString("mapping Cyc FORTs");
        $kw1$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym2$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const3$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const4$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
    }
}

/*

	Total time: 129 ms
	
*/