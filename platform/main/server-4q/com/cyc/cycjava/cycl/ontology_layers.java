/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_externalized;
import static com.cyc.cycjava.cycl.forts.do_forts_tables;
import static com.cyc.cycjava.cycl.forts.fort_count;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ONTOLOGY-LAYERS
 * source file: /cyc/top/cycl/ontology-layers.lisp
 * created:     2019/07/03 17:37:49
 */
public final class ontology_layers extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new ontology_layers();



    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ontology_layers$ = makeSymbol("*ONTOLOGY-LAYERS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeKeyword("UPPER"), makeKeyword("MIDDLE"), makeKeyword("LOWER"));

    public static final SubLSymbol $upper_ontology_core_terms$ = makeSymbol("*UPPER-ONTOLOGY-CORE-TERMS*");

    public static final SubLSymbol $upper_ontology_collections$ = makeSymbol("*UPPER-ONTOLOGY-COLLECTIONS*");

    public static final SubLSymbol $middle_ontology_collections$ = makeSymbol("*MIDDLE-ONTOLOGY-COLLECTIONS*");

    public static final SubLSymbol $upper_ontology_relations$ = makeSymbol("*UPPER-ONTOLOGY-RELATIONS*");

    public static final SubLSymbol $middle_ontology_relations$ = makeSymbol("*MIDDLE-ONTOLOGY-RELATIONS*");



    static private final SubLString $str13$Computing_collection_generalizati = makeString("Computing collection generalization counts");

    static private final SubLSymbol $sym15$_ = makeSymbol(">");

    private static final SubLFloat $float$0_9 = makeDouble(0.9);

    private static final SubLFloat $float$0_99 = makeDouble(0.99);

    static private final SubLList $list19 = cons(makeSymbol("FORT"), makeSymbol("COUNT"));

    static private final SubLList $list20 = list(makeSymbol("UPPER-COLLECTIONS"), makeSymbol("MIDDLE-COLLECTIONS"), makeSymbol("LOWER-COLLECTIONS"));

    static private final SubLString $str21$Computing_relation_ontology_layer = makeString("Computing relation ontology layers");



    private static final SubLString $str25$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol $kw26$INCLUDE_INDIVIDUALS_ = makeKeyword("INCLUDE-INDIVIDUALS?");

    private static final SubLSymbol $UPPER_CORE_TERMS = makeKeyword("UPPER-CORE-TERMS");

    private static final SubLString $str35$Skipping_unrecognized_marker__A_f = makeString("Skipping unrecognized marker ~A for set ~A.~%");

    private static final SubLString $str36$Expected_set__got__A_of_type__A_i = makeString("Expected set, got ~A of type ~A instead ... bad file format?");

    private static final SubLList $list37 = list(makeKeyword("UPPER-CORE-TERMS"), makeKeyword("UPPER-COLS"), makeKeyword("UPPER-RELS"), makeKeyword("MIDDLE-COLS"), makeKeyword("MIDDLE-RELS"));

    private static final SubLList $list38 = list(makeSymbol("UPPER-RELATIONS"), makeSymbol("MIDDLE-RELATIONS"), makeSymbol("LOWER-RELATIONS"));

    private static final SubLString $str39$Computing_assertion_ontology_laye = makeString("Computing assertion ontology layer");

    public static final SubLObject ontology_layer_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $ontology_layers$.getGlobalValue());
    }

    public static SubLObject ontology_layer_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $ontology_layers$.getGlobalValue());
    }

    public static final SubLObject lower_ontology_layer_alt(SubLObject layer1, SubLObject layer2) {
        if (layer1 == $UNKNOWN) {
            return layer2;
        } else {
            if (layer2 == $UNKNOWN) {
                return layer1;
            } else {
                if (layer1 == layer2) {
                    return layer1;
                } else {
                    if (NIL != list_utilities.position_L(layer1, layer2, $ontology_layers$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)) {
                        return layer2;
                    } else {
                        return layer1;
                    }
                }
            }
        }
    }

    public static SubLObject lower_ontology_layer(final SubLObject layer1, final SubLObject layer2) {
        if (layer1 == $UNKNOWN) {
            return layer2;
        }
        if (layer2 == $UNKNOWN) {
            return layer1;
        }
        if (layer1.eql(layer2)) {
            return layer1;
        }
        if (NIL != list_utilities.position_L(layer1, layer2, $ontology_layers$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)) {
            return layer2;
        }
        return layer1;
    }

    public static final SubLObject fort_ontology_layer_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        if (NIL == $upper_ontology_core_terms$.getGlobalValue()) {
            return $UNKNOWN;
        } else {
            if (NIL != set.set_memberP(fort, $upper_ontology_core_terms$.getGlobalValue())) {
                return $UPPER;
            } else {
                if (NIL != fort_types_interface.collectionP(fort)) {
                    if (NIL != set.set_memberP(fort, $upper_ontology_collections$.getGlobalValue())) {
                        return $UPPER;
                    } else {
                        if (NIL != set.set_memberP(fort, $middle_ontology_collections$.getGlobalValue())) {
                            return $MIDDLE;
                        } else {
                            return $LOWER;
                        }
                    }
                } else {
                    if (NIL != kb_accessors.relationP(fort)) {
                        if (NIL != set.set_memberP(fort, $upper_ontology_relations$.getGlobalValue())) {
                            return $UPPER;
                        } else {
                            if (NIL != set.set_memberP(fort, $middle_ontology_relations$.getGlobalValue())) {
                                return $MIDDLE;
                            } else {
                                return $LOWER;
                            }
                        }
                    } else {
                        return $LOWER;
                    }
                }
            }
        }
    }

    public static SubLObject fort_ontology_layer(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        if (NIL == $upper_ontology_core_terms$.getGlobalValue()) {
            return $UNKNOWN;
        }
        if (NIL != set.set_memberP(fort, $upper_ontology_core_terms$.getGlobalValue())) {
            return $UPPER;
        }
        if (NIL != fort_types_interface.collectionP(fort)) {
            if (NIL != set.set_memberP(fort, $upper_ontology_collections$.getGlobalValue())) {
                return $UPPER;
            }
            if (NIL != set.set_memberP(fort, $middle_ontology_collections$.getGlobalValue())) {
                return $MIDDLE;
            }
            return $LOWER;
        } else {
            if (NIL == kb_accessors.relationP(fort)) {
                return $LOWER;
            }
            if (NIL != set.set_memberP(fort, $upper_ontology_relations$.getGlobalValue())) {
                return $UPPER;
            }
            if (NIL != set.set_memberP(fort, $middle_ontology_relations$.getGlobalValue())) {
                return $MIDDLE;
            }
            return $LOWER;
        }
    }

    public static final SubLObject assertion_ontology_layer_alt(SubLObject assertion) {
        return com.cyc.cycjava.cycl.ontology_layers.assertion_ontology_layer_recursive(assertion, $UNKNOWN);
    }

    public static SubLObject assertion_ontology_layer(final SubLObject assertion) {
        return assertion_ontology_layer_recursive(assertion, $UNKNOWN);
    }

    public static final SubLObject assertion_ontology_layer_recursive_alt(SubLObject v_object, SubLObject layer) {
        if (layer == $LOWER) {
        } else {
            if (NIL != fort_p(v_object)) {
                layer = com.cyc.cycjava.cycl.ontology_layers.lower_ontology_layer(layer, com.cyc.cycjava.cycl.ontology_layers.fort_ontology_layer(v_object));
            } else {
                if (v_object.isCons()) {
                    layer = com.cyc.cycjava.cycl.ontology_layers.assertion_ontology_layer_recursive(v_object.first(), layer);
                    layer = com.cyc.cycjava.cycl.ontology_layers.assertion_ontology_layer_recursive(v_object.rest(), layer);
                } else {
                    if (NIL != assertion_handles.assertion_p(v_object)) {
                        layer = com.cyc.cycjava.cycl.ontology_layers.assertion_ontology_layer_recursive(assertions_high.assertion_cons(v_object), layer);
                    }
                }
            }
        }
        return layer;
    }

    public static SubLObject assertion_ontology_layer_recursive(final SubLObject v_object, SubLObject layer) {
        if (layer != $LOWER) {
            if (NIL != forts.fort_p(v_object)) {
                layer = lower_ontology_layer(layer, fort_ontology_layer(v_object));
            } else
                if (v_object.isCons()) {
                    layer = assertion_ontology_layer_recursive(v_object.first(), layer);
                    layer = assertion_ontology_layer_recursive(v_object.rest(), layer);
                } else
                    if (NIL != assertion_handles.assertion_p(v_object)) {
                        layer = assertion_ontology_layer_recursive(assertions_high.assertion_cons(v_object), layer);
                    }


        }
        return layer;
    }

    public static final SubLObject compute_collection_generalization_counts_alt(SubLObject include_individualsP) {
        if (include_individualsP == UNPROVIDED) {
            include_individualsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject estimated_collection_count = integerDivide(fort_count(), FIVE_INTEGER);
                SubLObject generalization_count_table = make_hash_table(estimated_collection_count, symbol_function(EQ), UNPROVIDED);
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject message = $str_alt13$Computing_collection_generalizati;
                            SubLObject total = fort_count();
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_1 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_2 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2_3 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3_4 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message);
                                    {
                                        SubLObject cdolist_list_var = do_forts_tables();
                                        SubLObject table_var = NIL;
                                        for (table_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_var = cdolist_list_var.first()) {
                                            if (NIL == do_id_index_empty_p(table_var, $SKIP)) {
                                                {
                                                    SubLObject id = do_id_index_next_id(table_var, T, NIL, NIL);
                                                    SubLObject state_var = do_id_index_next_state(table_var, T, id, NIL);
                                                    SubLObject fort = NIL;
                                                    while (NIL != id) {
                                                        fort = do_id_index_state_object(table_var, $SKIP, id, state_var);
                                                        if (NIL != do_id_index_id_and_object_validP(id, fort, $SKIP)) {
                                                            sofar = add(sofar, ONE_INTEGER);
                                                            note_percent_progress(sofar, total);
                                                            {
                                                                SubLObject generalizations = (NIL != fort_types_interface.collectionP(fort)) ? ((SubLObject) (genls.all_genls(fort, UNPROVIDED, UNPROVIDED))) : NIL != include_individualsP ? ((SubLObject) (isa.all_isa(fort, UNPROVIDED, UNPROVIDED))) : NIL;
                                                                SubLObject cdolist_list_var_5 = generalizations;
                                                                SubLObject generalization = NIL;
                                                                for (generalization = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , generalization = cdolist_list_var_5.first()) {
                                                                    if (NIL != fort_p(generalization)) {
                                                                        sethash(generalization, generalization_count_table, add(gethash_without_values(generalization, generalization_count_table, ZERO_INTEGER), ONE_INTEGER));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        id = do_id_index_next_id(table_var, T, id, state_var);
                                                        state_var = do_id_index_next_state(table_var, T, id, state_var);
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3_4, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2_3, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_2, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject generalization_count_pairs = hash_table_utilities.hash_table_to_alist(generalization_count_table);
                    generalization_count_pairs = Sort.sort(generalization_count_pairs, symbol_function($sym15$_), symbol_function(CDR));
                    {
                        SubLObject total_generalizations = ZERO_INTEGER;
                        SubLObject cdolist_list_var = generalization_count_pairs;
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            total_generalizations = add(total_generalizations, pair.rest());
                        }
                        return values(generalization_count_pairs, total_generalizations);
                    }
                }
            }
        }
    }

    public static SubLObject compute_collection_generalization_counts(SubLObject include_individualsP) {
        if (include_individualsP == UNPROVIDED) {
            include_individualsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject estimated_collection_count = integerDivide(forts.fort_count(), FIVE_INTEGER);
        final SubLObject generalization_count_table = make_hash_table(estimated_collection_count, symbol_function(EQ), UNPROVIDED);
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message = $str13$Computing_collection_generalizati;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$1 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_2_$3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_3_$4 = $percent_progress_start_time$.currentBinding(thread);
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
                            final SubLObject idx_$5 = idx;
                            if (NIL == id_index_dense_objects_empty_p(idx_$5, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$5);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject fort;
                                SubLObject cdolist_list_var_$6;
                                SubLObject generalizations;
                                SubLObject generalization;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    fort = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(fort)) {
                                            fort = $SKIP;
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        generalizations = cdolist_list_var_$6 = (NIL != fort_types_interface.collectionP(fort)) ? genls.all_genls(fort, UNPROVIDED, UNPROVIDED) : NIL != include_individualsP ? isa.all_isa(fort, UNPROVIDED, UNPROVIDED) : NIL;
                                        generalization = NIL;
                                        generalization = cdolist_list_var_$6.first();
                                        while (NIL != cdolist_list_var_$6) {
                                            if (NIL != forts.fort_p(generalization)) {
                                                sethash(generalization, generalization_count_table, add(gethash_without_values(generalization, generalization_count_table, ZERO_INTEGER), ONE_INTEGER));
                                            }
                                            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                            generalization = cdolist_list_var_$6.first();
                                        } 
                                    }
                                }
                            }
                            final SubLObject idx_$6 = idx;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$6)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$6);
                                SubLObject id2 = id_index_sparse_id_threshold(idx_$6);
                                final SubLObject end_id = id_index_next_id(idx_$6);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        SubLObject cdolist_list_var_$7;
                                        final SubLObject generalizations2 = cdolist_list_var_$7 = (NIL != fort_types_interface.collectionP(fort2)) ? genls.all_genls(fort2, UNPROVIDED, UNPROVIDED) : NIL != include_individualsP ? isa.all_isa(fort2, UNPROVIDED, UNPROVIDED) : NIL;
                                        SubLObject generalization2 = NIL;
                                        generalization2 = cdolist_list_var_$7.first();
                                        while (NIL != cdolist_list_var_$7) {
                                            if (NIL != forts.fort_p(generalization2)) {
                                                sethash(generalization2, generalization_count_table, add(gethash_without_values(generalization2, generalization_count_table, ZERO_INTEGER), ONE_INTEGER));
                                            }
                                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                            generalization2 = cdolist_list_var_$7.first();
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
                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_3_$4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_2_$3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        SubLObject generalization_count_pairs = hash_table_utilities.hash_table_to_alist(generalization_count_table);
        generalization_count_pairs = Sort.sort(generalization_count_pairs, symbol_function($sym15$_), symbol_function(CDR));
        SubLObject total_generalizations = ZERO_INTEGER;
        SubLObject cdolist_list_var2 = generalization_count_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            total_generalizations = add(total_generalizations, pair.rest());
            cdolist_list_var2 = cdolist_list_var2.rest();
            pair = cdolist_list_var2.first();
        } 
        return values(generalization_count_pairs, total_generalizations);
    }

    public static final SubLObject compute_collection_ontology_layer_sets_alt(SubLObject generalization_count_pairs, SubLObject upper_threshold, SubLObject middle_threshold) {
        if (upper_threshold == UNPROVIDED) {
            upper_threshold = $float$0_9;
        }
        if (middle_threshold == UNPROVIDED) {
            middle_threshold = $float$0_99;
        }
        {
            SubLObject total_generalizations = ZERO_INTEGER;
            {
                SubLObject cdolist_list_var = generalization_count_pairs;
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    total_generalizations = add(total_generalizations, pair.rest());
                }
            }
            {
                SubLObject upper = NIL;
                SubLObject middle = NIL;
                SubLObject lower = NIL;
                SubLObject upper_limit = floor(multiply(total_generalizations, upper_threshold), UNPROVIDED);
                SubLObject middle_limit = floor(multiply(total_generalizations, middle_threshold), UNPROVIDED);
                SubLObject layer = $UPPER;
                SubLObject sofar = ZERO_INTEGER;
                SubLObject cdolist_list_var = generalization_count_pairs;
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    {
                        SubLObject datum = pair;
                        SubLObject current = datum;
                        SubLObject fort = NIL;
                        SubLObject count = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt19);
                        fort = current.first();
                        current = current.rest();
                        count = current;
                        {
                            SubLObject pcase_var = layer;
                            if (pcase_var.eql($LOWER)) {
                                lower = cons(fort, lower);
                            } else {
                                if (pcase_var.eql($MIDDLE)) {
                                    middle = cons(fort, middle);
                                    sofar = add(sofar, count);
                                    if (sofar.numG(middle_limit)) {
                                        layer = $LOWER;
                                    }
                                } else {
                                    if (pcase_var.eql($UPPER)) {
                                        upper = cons(fort, upper);
                                        sofar = add(sofar, count);
                                        if (sofar.numG(upper_limit)) {
                                            layer = $MIDDLE;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                upper = nreverse(upper);
                middle = nreverse(middle);
                lower = nreverse(lower);
                return values(list(upper, middle, lower), list(length(upper), length(middle), length(lower)));
            }
        }
    }

    public static SubLObject compute_collection_ontology_layer_sets(final SubLObject generalization_count_pairs, SubLObject upper_threshold, SubLObject middle_threshold) {
        if (upper_threshold == UNPROVIDED) {
            upper_threshold = $float$0_9;
        }
        if (middle_threshold == UNPROVIDED) {
            middle_threshold = $float$0_99;
        }
        SubLObject total_generalizations = ZERO_INTEGER;
        SubLObject cdolist_list_var = generalization_count_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            total_generalizations = add(total_generalizations, pair.rest());
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        SubLObject upper = NIL;
        SubLObject middle = NIL;
        SubLObject lower = NIL;
        final SubLObject upper_limit = floor(multiply(total_generalizations, upper_threshold), UNPROVIDED);
        final SubLObject middle_limit = floor(multiply(total_generalizations, middle_threshold), UNPROVIDED);
        SubLObject layer = $UPPER;
        SubLObject sofar = ZERO_INTEGER;
        SubLObject cdolist_list_var2 = generalization_count_pairs;
        SubLObject pair2 = NIL;
        pair2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = pair2;
            SubLObject fort = NIL;
            SubLObject count = NIL;
            destructuring_bind_must_consp(current, datum, $list19);
            fort = current.first();
            current = count = current.rest();
            final SubLObject pcase_var = layer;
            if (pcase_var.eql($LOWER)) {
                lower = cons(fort, lower);
            } else
                if (pcase_var.eql($MIDDLE)) {
                    middle = cons(fort, middle);
                    sofar = add(sofar, count);
                    if (sofar.numG(middle_limit)) {
                        layer = $LOWER;
                    }
                } else
                    if (pcase_var.eql($UPPER)) {
                        upper = cons(fort, upper);
                        sofar = add(sofar, count);
                        if (sofar.numG(upper_limit)) {
                            layer = $MIDDLE;
                        }
                    }


            cdolist_list_var2 = cdolist_list_var2.rest();
            pair2 = cdolist_list_var2.first();
        } 
        upper = nreverse(upper);
        middle = nreverse(middle);
        lower = nreverse(lower);
        return values(list(upper, middle, lower), list(length(upper), length(middle), length(lower)));
    }

    public static final SubLObject compute_relation_ontology_layer_sets_alt(SubLObject collection_ontology_layer_sets) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = collection_ontology_layer_sets;
                SubLObject current = datum;
                SubLObject upper_collections = NIL;
                SubLObject middle_collections = NIL;
                SubLObject lower_collections = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt20);
                upper_collections = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt20);
                middle_collections = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt20);
                lower_collections = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject upper_collection_set = set_utilities.construct_set_from_list(upper_collections, symbol_function(EQ), UNPROVIDED);
                        SubLObject middle_collection_set = set_utilities.construct_set_from_list(middle_collections, symbol_function(EQ), UNPROVIDED);
                        SubLObject upper_relations = NIL;
                        SubLObject middle_relations = NIL;
                        SubLObject lower_relations = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                {
                                    SubLObject message = $str_alt21$Computing_relation_ontology_layer;
                                    SubLObject total = fort_count();
                                    SubLObject sofar = ZERO_INTEGER;
                                    {
                                        SubLObject _prev_bind_0_6 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1_7 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble(message);
                                            {
                                                SubLObject cdolist_list_var = do_forts_tables();
                                                SubLObject table_var = NIL;
                                                for (table_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_var = cdolist_list_var.first()) {
                                                    if (NIL == do_id_index_empty_p(table_var, $SKIP)) {
                                                        {
                                                            SubLObject id = do_id_index_next_id(table_var, T, NIL, NIL);
                                                            SubLObject state_var = do_id_index_next_state(table_var, T, id, NIL);
                                                            SubLObject relation = NIL;
                                                            while (NIL != id) {
                                                                relation = do_id_index_state_object(table_var, $SKIP, id, state_var);
                                                                if (NIL != do_id_index_id_and_object_validP(id, relation, $SKIP)) {
                                                                    sofar = add(sofar, ONE_INTEGER);
                                                                    note_percent_progress(sofar, total);
                                                                    if (NIL != kb_accessors.relationP(relation)) {
                                                                        {
                                                                            SubLObject collections = com.cyc.cycjava.cycl.ontology_layers.relation_constraining_collections(relation, UNPROVIDED);
                                                                            if (NIL != collections) {
                                                                                {
                                                                                    SubLObject layer = $UPPER;
                                                                                    SubLObject doneP = NIL;
                                                                                    SubLObject rest = NIL;
                                                                                    for (rest = collections; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                        {
                                                                                            SubLObject collection = rest.first();
                                                                                            SubLObject collection_layer = NIL;
                                                                                            if (NIL != set.set_memberP(collection, upper_collection_set)) {
                                                                                                collection_layer = $UPPER;
                                                                                            } else {
                                                                                                if (NIL != set.set_memberP(collection, middle_collection_set)) {
                                                                                                    collection_layer = $MIDDLE;
                                                                                                } else {
                                                                                                    collection_layer = $LOWER;
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject pcase_var = collection_layer;
                                                                                                if (pcase_var.eql($LOWER)) {
                                                                                                    layer = $LOWER;
                                                                                                    doneP = T;
                                                                                                } else {
                                                                                                    if (pcase_var.eql($MIDDLE)) {
                                                                                                        layer = $MIDDLE;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject pcase_var = layer;
                                                                                        if (pcase_var.eql($UPPER)) {
                                                                                            upper_relations = cons(relation, upper_relations);
                                                                                        } else {
                                                                                            if (pcase_var.eql($MIDDLE)) {
                                                                                                middle_relations = cons(relation, middle_relations);
                                                                                            } else {
                                                                                                if (pcase_var.eql($LOWER)) {
                                                                                                    lower_relations = cons(relation, lower_relations);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                lower_relations = cons(relation, lower_relations);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                id = do_id_index_next_id(table_var, T, id, state_var);
                                                                state_var = do_id_index_next_state(table_var, T, id, state_var);
                                                            } 
                                                        }
                                                    }
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1_7, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_6, thread);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                        upper_relations = Sort.sort(upper_relations, symbol_function($sym15$_), symbol_function(NUM_INDEX));
                        middle_relations = Sort.sort(middle_relations, symbol_function($sym15$_), symbol_function(NUM_INDEX));
                        lower_relations = Sort.sort(lower_relations, symbol_function($sym15$_), symbol_function(NUM_INDEX));
                        return values(list(upper_relations, middle_relations, lower_relations), list(length(upper_relations), length(middle_relations), length(lower_relations)));
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt20);
                }
            }
            return NIL;
        }
    }

    public static SubLObject compute_relation_ontology_layer_sets(final SubLObject collection_ontology_layer_sets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject upper_collections = NIL;
        SubLObject middle_collections = NIL;
        SubLObject lower_collections = NIL;
        destructuring_bind_must_consp(collection_ontology_layer_sets, collection_ontology_layer_sets, $list20);
        upper_collections = collection_ontology_layer_sets.first();
        SubLObject current = collection_ontology_layer_sets.rest();
        destructuring_bind_must_consp(current, collection_ontology_layer_sets, $list20);
        middle_collections = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, collection_ontology_layer_sets, $list20);
        lower_collections = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject upper_collection_set = set_utilities.construct_set_from_list(upper_collections, symbol_function(EQ), UNPROVIDED);
            final SubLObject middle_collection_set = set_utilities.construct_set_from_list(middle_collections, symbol_function(EQ), UNPROVIDED);
            SubLObject upper_relations = NIL;
            SubLObject middle_relations = NIL;
            SubLObject lower_relations = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject message = $str21$Computing_relation_ontology_layer;
                final SubLObject total = forts.fort_count();
                SubLObject sofar = ZERO_INTEGER;
                final SubLObject _prev_bind_0_$10 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$11 = $last_percent_progress_prediction$.currentBinding(thread);
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
                                final SubLObject idx_$12 = idx;
                                if (NIL == id_index_dense_objects_empty_p(idx_$12, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$12);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject relation;
                                    SubLObject collections;
                                    SubLObject layer;
                                    SubLObject doneP;
                                    SubLObject rest;
                                    SubLObject collection;
                                    SubLObject collection_layer;
                                    SubLObject pcase_var;
                                    SubLObject pcase_var2;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        relation = aref(vector_var, id);
                                        if ((NIL == id_index_tombstone_p(relation)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(relation)) {
                                                relation = $SKIP;
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                            if (NIL != kb_accessors.relationP(relation)) {
                                                collections = relation_constraining_collections(relation, UNPROVIDED);
                                                if (NIL != collections) {
                                                    layer = $UPPER;
                                                    for (doneP = NIL, rest = NIL, rest = collections; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                                                        collection = rest.first();
                                                        collection_layer = NIL;
                                                        if (NIL != set.set_memberP(collection, upper_collection_set)) {
                                                            collection_layer = $UPPER;
                                                        } else
                                                            if (NIL != set.set_memberP(collection, middle_collection_set)) {
                                                                collection_layer = $MIDDLE;
                                                            } else {
                                                                collection_layer = $LOWER;
                                                            }

                                                        pcase_var = collection_layer;
                                                        if (pcase_var.eql($LOWER)) {
                                                            layer = $LOWER;
                                                            doneP = T;
                                                        } else
                                                            if (pcase_var.eql($MIDDLE)) {
                                                                layer = $MIDDLE;
                                                            }

                                                    }
                                                    pcase_var2 = layer;
                                                    if (pcase_var2.eql($UPPER)) {
                                                        upper_relations = cons(relation, upper_relations);
                                                    } else
                                                        if (pcase_var2.eql($MIDDLE)) {
                                                            middle_relations = cons(relation, middle_relations);
                                                        } else
                                                            if (pcase_var2.eql($LOWER)) {
                                                                lower_relations = cons(relation, lower_relations);
                                                            }


                                                } else {
                                                    lower_relations = cons(relation, lower_relations);
                                                }
                                            }
                                        }
                                    }
                                }
                                final SubLObject idx_$13 = idx;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$13)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$13);
                                    SubLObject id2 = id_index_sparse_id_threshold(idx_$13);
                                    final SubLObject end_id = id_index_next_id(idx_$13);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (id2.numL(end_id)) {
                                        final SubLObject relation2 = gethash_without_values(id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(relation2))) {
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                            if (NIL != kb_accessors.relationP(relation2)) {
                                                final SubLObject collections2 = relation_constraining_collections(relation2, UNPROVIDED);
                                                if (NIL != collections2) {
                                                    SubLObject layer2 = $UPPER;
                                                    SubLObject doneP2;
                                                    SubLObject rest2;
                                                    SubLObject collection2;
                                                    SubLObject collection_layer2;
                                                    SubLObject pcase_var3;
                                                    for (doneP2 = NIL, rest2 = NIL, rest2 = collections2; (NIL == doneP2) && (NIL != rest2); rest2 = rest2.rest()) {
                                                        collection2 = rest2.first();
                                                        collection_layer2 = NIL;
                                                        if (NIL != set.set_memberP(collection2, upper_collection_set)) {
                                                            collection_layer2 = $UPPER;
                                                        } else
                                                            if (NIL != set.set_memberP(collection2, middle_collection_set)) {
                                                                collection_layer2 = $MIDDLE;
                                                            } else {
                                                                collection_layer2 = $LOWER;
                                                            }

                                                        pcase_var3 = collection_layer2;
                                                        if (pcase_var3.eql($LOWER)) {
                                                            layer2 = $LOWER;
                                                            doneP2 = T;
                                                        } else
                                                            if (pcase_var3.eql($MIDDLE)) {
                                                                layer2 = $MIDDLE;
                                                            }

                                                    }
                                                    final SubLObject pcase_var4 = layer2;
                                                    if (pcase_var4.eql($UPPER)) {
                                                        upper_relations = cons(relation2, upper_relations);
                                                    } else
                                                        if (pcase_var4.eql($MIDDLE)) {
                                                            middle_relations = cons(relation2, middle_relations);
                                                        } else
                                                            if (pcase_var4.eql($LOWER)) {
                                                                lower_relations = cons(relation2, lower_relations);
                                                            }


                                                } else {
                                                    lower_relations = cons(relation2, lower_relations);
                                                }
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
                        final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$11, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$10, thread);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            upper_relations = Sort.sort(upper_relations, symbol_function($sym15$_), symbol_function(NUM_INDEX));
            middle_relations = Sort.sort(middle_relations, symbol_function($sym15$_), symbol_function(NUM_INDEX));
            lower_relations = Sort.sort(lower_relations, symbol_function($sym15$_), symbol_function(NUM_INDEX));
            return values(list(upper_relations, middle_relations, lower_relations), list(length(upper_relations), length(middle_relations), length(lower_relations)));
        }
        cdestructuring_bind_error(collection_ontology_layer_sets, $list20);
        return NIL;
    }

    public static final SubLObject relation_constraining_collections_alt(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject arg_isa = kb_accessors.arg_isa(relation, mt);
            SubLObject arg_genl = kb_accessors.arg_genls(relation, mt);
            SubLObject result_isa = NIL;
            SubLObject result_genl = NIL;
            if (NIL != fort_types_interface.functionP(relation)) {
                result_isa = kb_accessors.result_isa(relation, mt);
                result_genl = kb_accessors.result_genl(relation, mt, UNPROVIDED);
            }
            return nconc(new SubLObject[]{ arg_isa, arg_genl, result_isa, result_genl });
        }
    }

    public static SubLObject relation_constraining_collections(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject arg_isa = kb_accessors.arg_isa(relation, mt);
        final SubLObject arg_genl = kb_accessors.arg_genls(relation, mt);
        SubLObject result_isa = NIL;
        SubLObject result_genl = NIL;
        if (NIL != fort_types_interface.functionP(relation)) {
            result_isa = kb_accessors.result_isa(relation, mt);
            result_genl = kb_accessors.result_genl(relation, mt, UNPROVIDED);
        }
        return nconc(new SubLObject[]{ arg_isa, arg_genl, result_isa, result_genl });
    }

    public static final SubLObject all_core_union_constants_alt() {
        return isa.all_quoted_instances_in_all_mts($$CoreUnionConstant);
    }

    public static SubLObject all_core_union_constants() {
        return isa.all_quoted_instances_in_all_mts($$CoreUnionConstant);
    }

    public static final SubLObject initialize_ontology_layers_alt(SubLObject include_individualsP, SubLObject upper_threshold, SubLObject middle_threshold) {
        if (include_individualsP == UNPROVIDED) {
            include_individualsP = T;
        }
        if (upper_threshold == UNPROVIDED) {
            upper_threshold = $float$0_9;
        }
        if (middle_threshold == UNPROVIDED) {
            middle_threshold = $float$0_99;
        }
        {
            SubLObject generalization_count_pairs = com.cyc.cycjava.cycl.ontology_layers.compute_collection_generalization_counts(include_individualsP);
            SubLObject collection_ontology_layers = com.cyc.cycjava.cycl.ontology_layers.compute_collection_ontology_layer_sets(generalization_count_pairs, upper_threshold, middle_threshold);
            SubLObject relation_ontology_layers = com.cyc.cycjava.cycl.ontology_layers.compute_relation_ontology_layer_sets(collection_ontology_layers);
            SubLObject core_terms = com.cyc.cycjava.cycl.ontology_layers.all_core_union_constants();
            return com.cyc.cycjava.cycl.ontology_layers.initialize_ontology_layers_internal(collection_ontology_layers, relation_ontology_layers, core_terms);
        }
    }

    public static SubLObject initialize_ontology_layers(SubLObject include_individualsP, SubLObject upper_threshold, SubLObject middle_threshold) {
        if (include_individualsP == UNPROVIDED) {
            include_individualsP = T;
        }
        if (upper_threshold == UNPROVIDED) {
            upper_threshold = $float$0_9;
        }
        if (middle_threshold == UNPROVIDED) {
            middle_threshold = $float$0_99;
        }
        final SubLObject generalization_count_pairs = compute_collection_generalization_counts(include_individualsP);
        final SubLObject collection_ontology_layers = compute_collection_ontology_layer_sets(generalization_count_pairs, upper_threshold, middle_threshold);
        final SubLObject relation_ontology_layers = compute_relation_ontology_layer_sets(collection_ontology_layers);
        final SubLObject core_terms = all_core_union_constants();
        return initialize_ontology_layers_internal(collection_ontology_layers, relation_ontology_layers, core_terms);
    }

    public static final SubLObject possibly_initialize_ontology_layers_alt() {
        {
            SubLObject initializedP = NIL;
            if (!(((((NIL != set.set_p($upper_ontology_core_terms$.getGlobalValue())) && (NIL != set.set_p($upper_ontology_collections$.getGlobalValue()))) && (NIL != set.set_p($middle_ontology_collections$.getGlobalValue()))) && (NIL != set.set_p($upper_ontology_relations$.getGlobalValue()))) && (NIL != set.set_p($middle_ontology_relations$.getGlobalValue())))) {
                com.cyc.cycjava.cycl.ontology_layers.initialize_ontology_layers(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                initializedP = T;
            }
            return initializedP;
        }
    }

    public static SubLObject possibly_initialize_ontology_layers() {
        SubLObject initializedP = NIL;
        if (NIL == ontology_layers_initializedP()) {
            initialize_ontology_layers(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            initializedP = T;
        }
        return initializedP;
    }

    public static SubLObject ontology_layers_initializedP() {
        return makeBoolean(((((NIL != set.set_p($upper_ontology_core_terms$.getGlobalValue())) && (NIL != set.set_p($upper_ontology_collections$.getGlobalValue()))) && (NIL != set.set_p($middle_ontology_collections$.getGlobalValue()))) && (NIL != set.set_p($upper_ontology_relations$.getGlobalValue()))) && (NIL != set.set_p($middle_ontology_relations$.getGlobalValue())));
    }

    public static SubLObject save_ontology_layers(final SubLObject filename, SubLObject include_individualsP, SubLObject upper_threshold, SubLObject middle_threshold) {
        if (include_individualsP == UNPROVIDED) {
            include_individualsP = T;
        }
        if (upper_threshold == UNPROVIDED) {
            upper_threshold = $float$0_9;
        }
        if (middle_threshold == UNPROVIDED) {
            middle_threshold = $float$0_99;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        initialize_ontology_layers(include_individualsP, upper_threshold, middle_threshold);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str25$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            cfasl_output_externalized(list($kw26$INCLUDE_INDIVIDUALS_, include_individualsP, $UPPER_THRESHOLD, upper_threshold, $MIDDLE_THRESHOLD, middle_threshold), s);
            cfasl_output_externalized(list(new SubLObject[]{ $UPPER_CORE_TERMS, $upper_ontology_core_terms$.getGlobalValue(), $UPPER_COLS, $upper_ontology_collections$.getGlobalValue(), $MIDDLE_COLS, $middle_ontology_collections$.getGlobalValue(), $UPPER_RELS, $upper_ontology_relations$.getGlobalValue(), $MIDDLE_RELS, $middle_ontology_relations$.getGlobalValue() }), s);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return filename;
    }

    public static SubLObject load_ontology_layers(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != Filesys.probe_file(filename)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(filename, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str25$Unable_to_open__S, filename);
                }
                final SubLObject s = stream;
                cfasl_input(s, UNPROVIDED, UNPROVIDED);
                final SubLObject sets = cfasl_input(s, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = $list37;
                SubLObject marker = NIL;
                marker = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject v_set = getf(sets, marker, UNPROVIDED);
                    if (NIL != set.set_p(v_set)) {
                        final SubLObject pcase_var = marker;
                        if (pcase_var.eql($UPPER_CORE_TERMS)) {
                            $upper_ontology_core_terms$.setGlobalValue(v_set);
                        } else
                            if (pcase_var.eql($UPPER_COLS)) {
                                $upper_ontology_collections$.setGlobalValue(v_set);
                            } else
                                if (pcase_var.eql($UPPER_RELS)) {
                                    $upper_ontology_relations$.setGlobalValue(v_set);
                                } else
                                    if (pcase_var.eql($MIDDLE_COLS)) {
                                        $middle_ontology_collections$.setGlobalValue(v_set);
                                    } else
                                        if (pcase_var.eql($MIDDLE_RELS)) {
                                            $middle_ontology_relations$.setGlobalValue(v_set);
                                        } else {
                                            Errors.warn($str35$Skipping_unrecognized_marker__A_f, marker, v_set);
                                        }




                    } else {
                        Errors.warn($str36$Expected_set__got__A_of_type__A_i, v_set, type_of(v_set));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    marker = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            return ontology_layers_initializedP();
        }
        return NIL;
    }

    public static final SubLObject initialize_ontology_layers_internal_alt(SubLObject collection_ontology_layers, SubLObject relation_ontology_layers, SubLObject core_terms) {
        $upper_ontology_core_terms$.setGlobalValue(set_utilities.construct_set_from_list(core_terms, symbol_function(EQ), UNPROVIDED));
        {
            SubLObject datum = collection_ontology_layers;
            SubLObject current = datum;
            SubLObject upper_collections = NIL;
            SubLObject middle_collections = NIL;
            SubLObject lower_collections = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            upper_collections = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            middle_collections = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            lower_collections = current.first();
            current = current.rest();
            if (NIL == current) {
                $upper_ontology_collections$.setGlobalValue(set_utilities.construct_set_from_list(upper_collections, symbol_function(EQ), UNPROVIDED));
                $middle_ontology_collections$.setGlobalValue(set_utilities.construct_set_from_list(middle_collections, symbol_function(EQ), UNPROVIDED));
            } else {
                cdestructuring_bind_error(datum, $list_alt20);
            }
        }
        {
            SubLObject datum = relation_ontology_layers;
            SubLObject current = datum;
            SubLObject upper_relations = NIL;
            SubLObject middle_relations = NIL;
            SubLObject lower_relations = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            upper_relations = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt24);
            middle_relations = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt24);
            lower_relations = current.first();
            current = current.rest();
            if (NIL == current) {
                $upper_ontology_relations$.setGlobalValue(set_utilities.construct_set_from_list(upper_relations, symbol_function(EQ), UNPROVIDED));
                $middle_ontology_relations$.setGlobalValue(set_utilities.construct_set_from_list(middle_relations, symbol_function(EQ), UNPROVIDED));
            } else {
                cdestructuring_bind_error(datum, $list_alt24);
            }
        }
        {
            SubLObject core_upper_collection_count = ZERO_INTEGER;
            SubLObject core_middle_collection_count = ZERO_INTEGER;
            SubLObject core_lower_collection_count = ZERO_INTEGER;
            SubLObject core_upper_relation_count = ZERO_INTEGER;
            SubLObject core_middle_relation_count = ZERO_INTEGER;
            SubLObject core_lower_relation_count = ZERO_INTEGER;
            SubLObject core_lower_individual_count = ZERO_INTEGER;
            SubLObject set_contents_var = set.do_set_internal($upper_ontology_core_terms$.getGlobalValue());
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject v_term = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                        if (NIL != fort_types_interface.collectionP(v_term)) {
                            if (NIL != set.set_memberP(v_term, $upper_ontology_collections$.getGlobalValue())) {
                                core_upper_collection_count = add(core_upper_collection_count, ONE_INTEGER);
                                set.set_remove(v_term, $upper_ontology_collections$.getGlobalValue());
                            } else {
                                if (NIL != set.set_memberP(v_term, $middle_ontology_collections$.getGlobalValue())) {
                                    core_middle_collection_count = add(core_middle_collection_count, ONE_INTEGER);
                                    set.set_remove(v_term, $middle_ontology_collections$.getGlobalValue());
                                } else {
                                    core_lower_collection_count = add(core_lower_collection_count, ONE_INTEGER);
                                }
                            }
                        } else {
                            if (NIL != kb_accessors.relationP(v_term)) {
                                if (NIL != set.set_memberP(v_term, $upper_ontology_relations$.getGlobalValue())) {
                                    core_upper_relation_count = add(core_upper_relation_count, ONE_INTEGER);
                                    set.set_remove(v_term, $upper_ontology_relations$.getGlobalValue());
                                } else {
                                    if (NIL != set.set_memberP(v_term, $middle_ontology_relations$.getGlobalValue())) {
                                        core_middle_relation_count = add(core_middle_relation_count, ONE_INTEGER);
                                        set.set_remove(v_term, $middle_ontology_relations$.getGlobalValue());
                                    } else {
                                        core_lower_relation_count = add(core_lower_relation_count, ONE_INTEGER);
                                    }
                                }
                            } else {
                                core_lower_individual_count = add(core_lower_individual_count, ONE_INTEGER);
                            }
                        }
                    }
                }
            }
            {
                SubLObject upper_count = add(set.set_size($upper_ontology_core_terms$.getGlobalValue()), set.set_size($upper_ontology_collections$.getGlobalValue()), set.set_size($upper_ontology_relations$.getGlobalValue()));
                SubLObject middle_count = add(set.set_size($middle_ontology_collections$.getGlobalValue()), set.set_size($middle_ontology_relations$.getGlobalValue()));
                SubLObject lower_count = subtract(fort_count(), add(upper_count, middle_count));
                return values(list(upper_count, middle_count, lower_count), list(list(core_upper_collection_count, core_upper_relation_count), list(core_middle_collection_count, core_middle_relation_count), list(core_lower_collection_count, core_lower_relation_count, core_lower_individual_count)));
            }
        }
    }

    public static SubLObject initialize_ontology_layers_internal(final SubLObject collection_ontology_layers, final SubLObject relation_ontology_layers, final SubLObject core_terms) {
        $upper_ontology_core_terms$.setGlobalValue(set_utilities.construct_set_from_list(core_terms, symbol_function(EQ), UNPROVIDED));
        SubLObject upper_collections = NIL;
        SubLObject middle_collections = NIL;
        SubLObject lower_collections = NIL;
        destructuring_bind_must_consp(collection_ontology_layers, collection_ontology_layers, $list20);
        upper_collections = collection_ontology_layers.first();
        SubLObject current = collection_ontology_layers.rest();
        destructuring_bind_must_consp(current, collection_ontology_layers, $list20);
        middle_collections = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, collection_ontology_layers, $list20);
        lower_collections = current.first();
        current = current.rest();
        if (NIL == current) {
            $upper_ontology_collections$.setGlobalValue(set_utilities.construct_set_from_list(upper_collections, symbol_function(EQ), UNPROVIDED));
            $middle_ontology_collections$.setGlobalValue(set_utilities.construct_set_from_list(middle_collections, symbol_function(EQ), UNPROVIDED));
        } else {
            cdestructuring_bind_error(collection_ontology_layers, $list20);
        }
        SubLObject upper_relations = NIL;
        SubLObject middle_relations = NIL;
        SubLObject lower_relations = NIL;
        destructuring_bind_must_consp(relation_ontology_layers, relation_ontology_layers, $list38);
        upper_relations = relation_ontology_layers.first();
        current = relation_ontology_layers.rest();
        destructuring_bind_must_consp(current, relation_ontology_layers, $list38);
        middle_relations = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, relation_ontology_layers, $list38);
        lower_relations = current.first();
        current = current.rest();
        if (NIL == current) {
            $upper_ontology_relations$.setGlobalValue(set_utilities.construct_set_from_list(upper_relations, symbol_function(EQ), UNPROVIDED));
            $middle_ontology_relations$.setGlobalValue(set_utilities.construct_set_from_list(middle_relations, symbol_function(EQ), UNPROVIDED));
        } else {
            cdestructuring_bind_error(relation_ontology_layers, $list38);
        }
        SubLObject core_upper_collection_count = ZERO_INTEGER;
        SubLObject core_middle_collection_count = ZERO_INTEGER;
        SubLObject core_lower_collection_count = ZERO_INTEGER;
        SubLObject core_upper_relation_count = ZERO_INTEGER;
        SubLObject core_middle_relation_count = ZERO_INTEGER;
        SubLObject core_lower_relation_count = ZERO_INTEGER;
        SubLObject core_lower_individual_count = ZERO_INTEGER;
        final SubLObject set_contents_var = set.do_set_internal($upper_ontology_core_terms$.getGlobalValue());
        SubLObject basis_object;
        SubLObject state;
        SubLObject v_term;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            v_term = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                if (NIL != fort_types_interface.collectionP(v_term)) {
                    if (NIL != set.set_memberP(v_term, $upper_ontology_collections$.getGlobalValue())) {
                        core_upper_collection_count = add(core_upper_collection_count, ONE_INTEGER);
                        set.set_remove(v_term, $upper_ontology_collections$.getGlobalValue());
                    } else
                        if (NIL != set.set_memberP(v_term, $middle_ontology_collections$.getGlobalValue())) {
                            core_middle_collection_count = add(core_middle_collection_count, ONE_INTEGER);
                            set.set_remove(v_term, $middle_ontology_collections$.getGlobalValue());
                        } else {
                            core_lower_collection_count = add(core_lower_collection_count, ONE_INTEGER);
                        }

                } else
                    if (NIL != kb_accessors.relationP(v_term)) {
                        if (NIL != set.set_memberP(v_term, $upper_ontology_relations$.getGlobalValue())) {
                            core_upper_relation_count = add(core_upper_relation_count, ONE_INTEGER);
                            set.set_remove(v_term, $upper_ontology_relations$.getGlobalValue());
                        } else
                            if (NIL != set.set_memberP(v_term, $middle_ontology_relations$.getGlobalValue())) {
                                core_middle_relation_count = add(core_middle_relation_count, ONE_INTEGER);
                                set.set_remove(v_term, $middle_ontology_relations$.getGlobalValue());
                            } else {
                                core_lower_relation_count = add(core_lower_relation_count, ONE_INTEGER);
                            }

                    } else {
                        core_lower_individual_count = add(core_lower_individual_count, ONE_INTEGER);
                    }

            }
        }
        final SubLObject upper_count = add(set.set_size($upper_ontology_core_terms$.getGlobalValue()), set.set_size($upper_ontology_collections$.getGlobalValue()), set.set_size($upper_ontology_relations$.getGlobalValue()));
        final SubLObject middle_count = add(set.set_size($middle_ontology_collections$.getGlobalValue()), set.set_size($middle_ontology_relations$.getGlobalValue()));
        final SubLObject lower_count = subtract(forts.fort_count(), add(upper_count, middle_count));
        return values(list(upper_count, middle_count, lower_count), list(list(core_upper_collection_count, core_upper_relation_count), list(core_middle_collection_count, core_middle_relation_count), list(core_lower_collection_count, core_lower_relation_count, core_lower_individual_count)));
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeKeyword("UPPER"), makeKeyword("MIDDLE"), makeKeyword("LOWER"));

    static private final SubLString $str_alt13$Computing_collection_generalizati = makeString("Computing collection generalization counts");

    static private final SubLList $list_alt19 = cons(makeSymbol("FORT"), makeSymbol("COUNT"));

    static private final SubLList $list_alt20 = list(makeSymbol("UPPER-COLLECTIONS"), makeSymbol("MIDDLE-COLLECTIONS"), makeSymbol("LOWER-COLLECTIONS"));

    static private final SubLString $str_alt21$Computing_relation_ontology_layer = makeString("Computing relation ontology layers");

    static private final SubLList $list_alt24 = list(makeSymbol("UPPER-RELATIONS"), makeSymbol("MIDDLE-RELATIONS"), makeSymbol("LOWER-RELATIONS"));

    static private final SubLString $str_alt25$Computing_assertion_ontology_laye = makeString("Computing assertion ontology layer");

    public static final SubLObject compute_assertion_ontology_layer_statistics_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject upper_count = ZERO_INTEGER;
                SubLObject middle_count = ZERO_INTEGER;
                SubLObject lower_count = ZERO_INTEGER;
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt25$Computing_assertion_ontology_laye, STRINGP);
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
                        noting_percent_progress_preamble($str_alt25$Computing_assertion_ontology_laye);
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
                                        {
                                            SubLObject pcase_var = com.cyc.cycjava.cycl.ontology_layers.assertion_ontology_layer(ass);
                                            if (pcase_var.eql($UPPER)) {
                                                upper_count = add(upper_count, ONE_INTEGER);
                                            } else {
                                                if (pcase_var.eql($MIDDLE)) {
                                                    middle_count = add(middle_count, ONE_INTEGER);
                                                } else {
                                                    if (pcase_var.eql($LOWER)) {
                                                        lower_count = add(lower_count, ONE_INTEGER);
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
                return list(upper_count, middle_count, lower_count);
            }
        }
    }

    public static SubLObject compute_assertion_ontology_layer_statistics() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject upper_count = ZERO_INTEGER;
        SubLObject middle_count = ZERO_INTEGER;
        SubLObject lower_count = ZERO_INTEGER;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str39$Computing_assertion_ontology_laye;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
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
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$15 = idx;
                if (NIL == id_index_objects_empty_p(idx_$15, $SKIP)) {
                    final SubLObject idx_$16 = idx_$15;
                    if (NIL == id_index_dense_objects_empty_p(idx_$16, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$16);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        SubLObject pcase_var;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                pcase_var = assertion_ontology_layer(ass);
                                if (pcase_var.eql($UPPER)) {
                                    upper_count = add(upper_count, ONE_INTEGER);
                                } else
                                    if (pcase_var.eql($MIDDLE)) {
                                        middle_count = add(middle_count, ONE_INTEGER);
                                    } else
                                        if (pcase_var.eql($LOWER)) {
                                            lower_count = add(lower_count, ONE_INTEGER);
                                        }


                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$17 = idx_$15;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$17)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$17);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$17);
                        final SubLObject end_id = id_index_next_id(idx_$17);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                final SubLObject pcase_var2 = assertion_ontology_layer(ass2);
                                if (pcase_var2.eql($UPPER)) {
                                    upper_count = add(upper_count, ONE_INTEGER);
                                } else
                                    if (pcase_var2.eql($MIDDLE)) {
                                        middle_count = add(middle_count, ONE_INTEGER);
                                    } else
                                        if (pcase_var2.eql($LOWER)) {
                                            lower_count = add(lower_count, ONE_INTEGER);
                                        }


                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return list(upper_count, middle_count, lower_count);
    }

    /**
     * Return a list of all the collections of the upper ontology
     * in descending order from most to least general.
     */
    @LispMethod(comment = "Return a list of all the collections of the upper ontology\r\nin descending order from most to least general.\nReturn a list of all the collections of the upper ontology\nin descending order from most to least general.")
    public static final SubLObject all_upper_ontology_layer_collections_alt() {
        com.cyc.cycjava.cycl.ontology_layers.possibly_initialize_ontology_layers();
        {
            SubLObject upper_core_terms = set.set_element_list($upper_ontology_core_terms$.getGlobalValue());
            SubLObject upper_core_collections = list_utilities.delete_if_not(symbol_function(COLLECTION_P), upper_core_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject upper_non_core_collections = set.set_element_list($upper_ontology_collections$.getGlobalValue());
            SubLObject upper_collections = nconc(upper_core_collections, upper_non_core_collections);
            return cardinality_estimates.sort_by_generality_estimate(upper_collections, $DESCENDING);
        }
    }

    /**
     * Return a list of all the collections of the upper ontology
     * in descending order from most to least general.
     */
    @LispMethod(comment = "Return a list of all the collections of the upper ontology\r\nin descending order from most to least general.\nReturn a list of all the collections of the upper ontology\nin descending order from most to least general.")
    public static SubLObject all_upper_ontology_layer_collections() {
        possibly_initialize_ontology_layers();
        final SubLObject upper_core_terms = set.set_element_list($upper_ontology_core_terms$.getGlobalValue());
        final SubLObject upper_core_collections = list_utilities.delete_if_not(symbol_function(COLLECTION_P), upper_core_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject upper_non_core_collections = set.set_element_list($upper_ontology_collections$.getGlobalValue());
        final SubLObject upper_collections = nconc(upper_core_collections, upper_non_core_collections);
        return cardinality_estimates.sort_by_generality_estimate(upper_collections, $DESCENDING);
    }

    public static SubLObject declare_ontology_layers_file() {
        declareFunction("ontology_layer_p", "ONTOLOGY-LAYER-P", 1, 0, false);
        declareFunction("lower_ontology_layer", "LOWER-ONTOLOGY-LAYER", 2, 0, false);
        declareFunction("fort_ontology_layer", "FORT-ONTOLOGY-LAYER", 1, 0, false);
        declareFunction("assertion_ontology_layer", "ASSERTION-ONTOLOGY-LAYER", 1, 0, false);
        declareFunction("assertion_ontology_layer_recursive", "ASSERTION-ONTOLOGY-LAYER-RECURSIVE", 2, 0, false);
        declareFunction("compute_collection_generalization_counts", "COMPUTE-COLLECTION-GENERALIZATION-COUNTS", 0, 1, false);
        declareFunction("compute_collection_ontology_layer_sets", "COMPUTE-COLLECTION-ONTOLOGY-LAYER-SETS", 1, 2, false);
        declareFunction("compute_relation_ontology_layer_sets", "COMPUTE-RELATION-ONTOLOGY-LAYER-SETS", 1, 0, false);
        declareFunction("relation_constraining_collections", "RELATION-CONSTRAINING-COLLECTIONS", 1, 1, false);
        declareFunction("all_core_union_constants", "ALL-CORE-UNION-CONSTANTS", 0, 0, false);
        declareFunction("initialize_ontology_layers", "INITIALIZE-ONTOLOGY-LAYERS", 0, 3, false);
        declareFunction("possibly_initialize_ontology_layers", "POSSIBLY-INITIALIZE-ONTOLOGY-LAYERS", 0, 0, false);
        declareFunction("ontology_layers_initializedP", "ONTOLOGY-LAYERS-INITIALIZED?", 0, 0, false);
        declareFunction("save_ontology_layers", "SAVE-ONTOLOGY-LAYERS", 1, 3, false);
        declareFunction("load_ontology_layers", "LOAD-ONTOLOGY-LAYERS", 1, 0, false);
        declareFunction("initialize_ontology_layers_internal", "INITIALIZE-ONTOLOGY-LAYERS-INTERNAL", 3, 0, false);
        declareFunction("compute_assertion_ontology_layer_statistics", "COMPUTE-ASSERTION-ONTOLOGY-LAYER-STATISTICS", 0, 0, false);
        declareFunction("all_upper_ontology_layer_collections", "ALL-UPPER-ONTOLOGY-LAYER-COLLECTIONS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_ontology_layers_file_alt() {
        deflexical("*ONTOLOGY-LAYERS*", $list_alt0);
        deflexical("*UPPER-ONTOLOGY-CORE-TERMS*", NIL != boundp($upper_ontology_core_terms$) ? ((SubLObject) ($upper_ontology_core_terms$.getGlobalValue())) : NIL);
        deflexical("*UPPER-ONTOLOGY-COLLECTIONS*", NIL != boundp($upper_ontology_collections$) ? ((SubLObject) ($upper_ontology_collections$.getGlobalValue())) : NIL);
        deflexical("*MIDDLE-ONTOLOGY-COLLECTIONS*", NIL != boundp($middle_ontology_collections$) ? ((SubLObject) ($middle_ontology_collections$.getGlobalValue())) : NIL);
        deflexical("*UPPER-ONTOLOGY-RELATIONS*", NIL != boundp($upper_ontology_relations$) ? ((SubLObject) ($upper_ontology_relations$.getGlobalValue())) : NIL);
        deflexical("*MIDDLE-ONTOLOGY-RELATIONS*", NIL != boundp($middle_ontology_relations$) ? ((SubLObject) ($middle_ontology_relations$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_ontology_layers_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*ONTOLOGY-LAYERS*", $list0);
            deflexical("*UPPER-ONTOLOGY-CORE-TERMS*", SubLTrampolineFile.maybeDefault($upper_ontology_core_terms$, $upper_ontology_core_terms$, NIL));
            deflexical("*UPPER-ONTOLOGY-COLLECTIONS*", SubLTrampolineFile.maybeDefault($upper_ontology_collections$, $upper_ontology_collections$, NIL));
            deflexical("*MIDDLE-ONTOLOGY-COLLECTIONS*", SubLTrampolineFile.maybeDefault($middle_ontology_collections$, $middle_ontology_collections$, NIL));
            deflexical("*UPPER-ONTOLOGY-RELATIONS*", SubLTrampolineFile.maybeDefault($upper_ontology_relations$, $upper_ontology_relations$, NIL));
            deflexical("*MIDDLE-ONTOLOGY-RELATIONS*", SubLTrampolineFile.maybeDefault($middle_ontology_relations$, $middle_ontology_relations$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*UPPER-ONTOLOGY-CORE-TERMS*", NIL != boundp($upper_ontology_core_terms$) ? ((SubLObject) ($upper_ontology_core_terms$.getGlobalValue())) : NIL);
            deflexical("*UPPER-ONTOLOGY-COLLECTIONS*", NIL != boundp($upper_ontology_collections$) ? ((SubLObject) ($upper_ontology_collections$.getGlobalValue())) : NIL);
            deflexical("*MIDDLE-ONTOLOGY-COLLECTIONS*", NIL != boundp($middle_ontology_collections$) ? ((SubLObject) ($middle_ontology_collections$.getGlobalValue())) : NIL);
            deflexical("*UPPER-ONTOLOGY-RELATIONS*", NIL != boundp($upper_ontology_relations$) ? ((SubLObject) ($upper_ontology_relations$.getGlobalValue())) : NIL);
            deflexical("*MIDDLE-ONTOLOGY-RELATIONS*", NIL != boundp($middle_ontology_relations$) ? ((SubLObject) ($middle_ontology_relations$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_ontology_layers_file_Previous() {
        deflexical("*ONTOLOGY-LAYERS*", $list0);
        deflexical("*UPPER-ONTOLOGY-CORE-TERMS*", SubLTrampolineFile.maybeDefault($upper_ontology_core_terms$, $upper_ontology_core_terms$, NIL));
        deflexical("*UPPER-ONTOLOGY-COLLECTIONS*", SubLTrampolineFile.maybeDefault($upper_ontology_collections$, $upper_ontology_collections$, NIL));
        deflexical("*MIDDLE-ONTOLOGY-COLLECTIONS*", SubLTrampolineFile.maybeDefault($middle_ontology_collections$, $middle_ontology_collections$, NIL));
        deflexical("*UPPER-ONTOLOGY-RELATIONS*", SubLTrampolineFile.maybeDefault($upper_ontology_relations$, $upper_ontology_relations$, NIL));
        deflexical("*MIDDLE-ONTOLOGY-RELATIONS*", SubLTrampolineFile.maybeDefault($middle_ontology_relations$, $middle_ontology_relations$, NIL));
        return NIL;
    }

    public static SubLObject setup_ontology_layers_file() {
        declare_defglobal($upper_ontology_core_terms$);
        declare_defglobal($upper_ontology_collections$);
        declare_defglobal($middle_ontology_collections$);
        declare_defglobal($upper_ontology_relations$);
        declare_defglobal($middle_ontology_relations$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ontology_layers_file();
    }

    @Override
    public void initializeVariables() {
        init_ontology_layers_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ontology_layers_file();
    }

    static {
    }
}

/**
 * Total time: 421 ms
 */
