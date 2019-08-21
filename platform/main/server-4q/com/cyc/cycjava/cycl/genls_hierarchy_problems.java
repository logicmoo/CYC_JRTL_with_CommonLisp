package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.genls_hierarchy_problems;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.genls_hierarchy_problems.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class genls_hierarchy_problems extends SubLTranslatedFile {
    public static final SubLFile me = new genls_hierarchy_problems();

    public static final String myName = "com.cyc.cycjava.cycl.genls_hierarchy_problems";

    public static final String myFingerPrint = "16ab13d6460d342c092b84088b9bbcb6a1fbd67bd5d99088b9894380941ff26f";

    // Internal Constants
    public static final SubLString $$$mapping_Cyc_FORTs = makeString("mapping Cyc FORTs");





    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static SubLObject forts_meeting_criterion(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject message = $$$mapping_Cyc_FORTs;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = NIL;
                table_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$1 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$1);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                fort = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(fort)) {
                                        fort = $SKIP;
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    if (NIL != funcall(pred, fort)) {
                                        result = cons(fort, result);
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$2 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$2);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$2);
                            final SubLObject end_id = id_index_next_id(idx_$2);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    if (NIL != funcall(pred, fort2)) {
                                        result = cons(fort2, result);
                                    }
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject fort_not_a_thingP(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return makeBoolean(NIL == kb_accessors.kb_thing_p(fort));
    }

    public static SubLObject fort_isa_collection_but_not_a_spec_of_thingP(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return makeBoolean((NIL != fort_types_interface.collection_p(fort)) && (NIL == genls.genl_in_any_mtP(fort, $$Thing)));
    }

    public static SubLObject fort_not_a_collection_but_has_specs_or_genlsP(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return makeBoolean((NIL == fort_types_interface.collection_p(fort)) && ((NIL != kb_mapping_utilities.some_pred_value_in_any_mt(fort, $$genls, ONE_INTEGER, UNPROVIDED)) || (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(fort, $$genls, TWO_INTEGER, UNPROVIDED))));
    }

    public static SubLObject fort_isa_thing_but_neither_a_set_or_collection_nor_individualP(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return makeBoolean(((NIL != kb_accessors.kb_thing_p(fort)) && (NIL == kb_accessors.kb_set_or_collection_p(fort))) && (NIL == kb_accessors.kb_individual_p(fort)));
    }

    public static SubLObject fort_neither_a_set_or_collection_nor_individualP(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return makeBoolean((NIL == kb_accessors.kb_set_or_collection_p(fort)) && (NIL == kb_accessors.kb_individual_p(fort)));
    }

    public static SubLObject fort_both_a_set_or_collection_and_individualP(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return makeBoolean((NIL != kb_accessors.kb_set_or_collection_p(fort)) && (NIL != kb_accessors.kb_individual_p(fort)));
    }

    public static SubLObject fort_not_properly_in_genls_hierarchyP(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        if (NIL != fort_types_interface.collection_p(fort)) {
            return makeBoolean(NIL == genls.genl_in_any_mtP(fort, $$Thing));
        }
        if (NIL != kb_accessors.kb_individual_p(fort)) {
            return makeBoolean((NIL != kb_mapping_utilities.some_pred_value_in_any_mt(fort, $$genls, ONE_INTEGER, UNPROVIDED)) || (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(fort, $$genls, TWO_INTEGER, UNPROVIDED)));
        }
        if (NIL != kb_accessors.kb_set_mathematical_p(fort)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject declare_genls_hierarchy_problems_file() {
        declareFunction(me, "forts_meeting_criterion", "FORTS-MEETING-CRITERION", 1, 0, false);
        declareFunction(me, "fort_not_a_thingP", "FORT-NOT-A-THING?", 1, 0, false);
        declareFunction(me, "fort_isa_collection_but_not_a_spec_of_thingP", "FORT-ISA-COLLECTION-BUT-NOT-A-SPEC-OF-THING?", 1, 0, false);
        declareFunction(me, "fort_not_a_collection_but_has_specs_or_genlsP", "FORT-NOT-A-COLLECTION-BUT-HAS-SPECS-OR-GENLS?", 1, 0, false);
        declareFunction(me, "fort_isa_thing_but_neither_a_set_or_collection_nor_individualP", "FORT-ISA-THING-BUT-NEITHER-A-SET-OR-COLLECTION-NOR-INDIVIDUAL?", 1, 0, false);
        declareFunction(me, "fort_neither_a_set_or_collection_nor_individualP", "FORT-NEITHER-A-SET-OR-COLLECTION-NOR-INDIVIDUAL?", 1, 0, false);
        declareFunction(me, "fort_both_a_set_or_collection_and_individualP", "FORT-BOTH-A-SET-OR-COLLECTION-AND-INDIVIDUAL?", 1, 0, false);
        declareFunction(me, "fort_not_properly_in_genls_hierarchyP", "FORT-NOT-PROPERLY-IN-GENLS-HIERARCHY?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_genls_hierarchy_problems_file() {
        return NIL;
    }

    public static SubLObject setup_genls_hierarchy_problems_file() {
        return NIL;
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






    }
}

/**
 * Total time: 129 ms
 */
