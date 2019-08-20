/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols_simple;
import static com.cyc.cycjava.cycl.constant_handles.constant_count;
import static com.cyc.cycjava.cycl.control_vars.$average_all_isa_count$;
import static com.cyc.cycjava.cycl.control_vars.$table_area$;
import static com.cyc.cycjava.cycl.forts.do_forts_tables;
import static com.cyc.cycjava.cycl.forts.fort_count;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.hlmt.fort_or_chlmt_p;
import static com.cyc.cycjava.cycl.hlmt.hlmt_monad_mt;
import static com.cyc.cycjava.cycl.hlmt.hlmt_naut_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.number_utilities.f_1X;
import static com.cyc.cycjava.cycl.set.do_set_internal;
import static com.cyc.cycjava.cycl.set.new_set;
import static com.cyc.cycjava.cycl.set.set_add;
import static com.cyc.cycjava.cycl.set.set_remove;
import static com.cyc.cycjava.cycl.set.set_size;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_basis_object;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_doneP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_element_validP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_initial_state;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_next;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_update_state;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CARDINALITY-ESTIMATES
 * source file: /cyc/top/cycl/cardinality-estimates.lisp
 * created:     2019/07/03 17:37:48
 */
public final class cardinality_estimates extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cardinality_estimates();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $generality_estimate_scale_factor$ = makeSymbol("*GENERALITY-ESTIMATE-SCALE-FACTOR*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol FORT_OR_CHLMT_P = makeSymbol("FORT-OR-CHLMT-P");

    static private final SubLSymbol $sym3$_ = makeSymbol("<");

    static private final SubLSymbol $sym6$_ = makeSymbol(">");

    public static final SubLSymbol $local_instance_cardinality$ = makeSymbol("*LOCAL-INSTANCE-CARDINALITY*");

    public static final SubLSymbol $local_quoted_instance_cardinality$ = makeSymbol("*LOCAL-QUOTED-INSTANCE-CARDINALITY*");

    public static final SubLSymbol $local_spec_cardinality$ = makeSymbol("*LOCAL-SPEC-CARDINALITY*");

    public static final SubLSymbol $total_instance_cardinality$ = makeSymbol("*TOTAL-INSTANCE-CARDINALITY*");

    public static final SubLSymbol $total_quoted_instance_cardinality$ = makeSymbol("*TOTAL-QUOTED-INSTANCE-CARDINALITY*");

    public static final SubLSymbol $total_spec_cardinality$ = makeSymbol("*TOTAL-SPEC-CARDINALITY*");

    public static final SubLSymbol $total_genl_cardinality$ = makeSymbol("*TOTAL-GENL-CARDINALITY*");

    public static final SubLSymbol $generality_estimate_table$ = makeSymbol("*GENERALITY-ESTIMATE-TABLE*");

    static private final SubLList $list16 = list(list(makeSymbol("NODE-VAR"), makeSymbol("MODULE"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list17 = list(makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym21$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    private static final SubLSymbol $sym22$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");

    private static final SubLSymbol $sym23$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLSymbol $sym24$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol GET_SBHL_MODULE_SIZE = makeSymbol("GET-SBHL-MODULE-SIZE");

    private static final SubLList $list27 = list(ZERO_INTEGER);

    private static final SubLSymbol DO_SBHL_MODULE_NODES = makeSymbol("DO-SBHL-MODULE-NODES");

    private static final SubLSymbol $sym32$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");

    private static final SubLSymbol $sym33$LINK_VAR = makeUninternedSymbol("LINK-VAR");

    private static final SubLSymbol DO_SBHL_GRAPH_LINKS = makeSymbol("DO-SBHL-GRAPH-LINKS");

    private static final SubLString $str37$Calculating_collection_local_spec = makeString("Calculating collection local spec cardinalities");





    private static final SubLList $list41 = list(makeSymbol("TERM"), makeUninternedSymbol("IMPL-VALUE"));

    private static final SubLString $str42$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str43$Calculating_collection_local_inst = makeString("Calculating collection local instance cardinalities");



    private static final SubLString $str45$Calculating_collection_local_quot = makeString("Calculating collection local quoted instance cardinalities");



    private static final SubLString $str47$Calculating_predicate_local_spec_ = makeString("Calculating predicate local spec cardinalities");



    private static final SubLString $str49$Calculating_microtheory_local_spe = makeString("Calculating microtheory local spec cardinalities");



    private static final SubLString $str51$Calculating_other_local_instance_ = makeString("Calculating other local instance cardinalities");

    private static final SubLString $str53$Calculating_collection_total_card = makeString("Calculating collection total cardinalities");

    static private final SubLList $list54 = list(makeSymbol("COL"), makeUninternedSymbol("IMPL-VALUE"));

    private static final SubLString $str55$Calculating_predicate_total_cardi = makeString("Calculating predicate total cardinalities");

    static private final SubLList $list56 = list(makeSymbol("PREDICATE"), makeUninternedSymbol("IMPL-VALUE"));

    private static final SubLString $str57$Calculating_microtheory_total_car = makeString("Calculating microtheory total cardinalities");

    private static final SubLList $list58 = list(makeSymbol("MT"), makeUninternedSymbol("IMPL-VALUE"));

    private static final SubLString $$$Calculating_generality_estimates = makeString("Calculating generality estimates");

    private static final SubLSymbol $sym61$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");



    private static final SubLString $str68$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str73$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str74$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str75$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    // Definitions
    public static final SubLObject cardinality_estimates_initializedP_alt() {
        return makeBoolean(!((((((((((((((((((NIL == $local_instance_cardinality$.getGlobalValue()) || (NIL != hash_table_utilities.hash_table_empty_p($local_instance_cardinality$.getGlobalValue()))) || (NIL == $local_instance_cardinality$.getGlobalValue())) || (NIL != hash_table_utilities.hash_table_empty_p($local_instance_cardinality$.getGlobalValue()))) || (NIL == $total_instance_cardinality$.getGlobalValue())) || (NIL != hash_table_utilities.hash_table_empty_p($total_instance_cardinality$.getGlobalValue()))) || (NIL == $local_quoted_instance_cardinality$.getGlobalValue())) || (NIL != hash_table_utilities.hash_table_empty_p($local_quoted_instance_cardinality$.getGlobalValue()))) || (NIL == $total_quoted_instance_cardinality$.getGlobalValue())) || (NIL != hash_table_utilities.hash_table_empty_p($total_quoted_instance_cardinality$.getGlobalValue()))) || (NIL == $local_spec_cardinality$.getGlobalValue())) || (NIL != hash_table_utilities.hash_table_empty_p($local_spec_cardinality$.getGlobalValue()))) || (NIL == $total_spec_cardinality$.getGlobalValue())) || (NIL != hash_table_utilities.hash_table_empty_p($total_spec_cardinality$.getGlobalValue()))) || (NIL == $total_genl_cardinality$.getGlobalValue())) || (NIL != hash_table_utilities.hash_table_empty_p($total_genl_cardinality$.getGlobalValue()))) || (NIL == $generality_estimate_table$.getGlobalValue())) || (NIL != hash_table_utilities.hash_table_empty_p($generality_estimate_table$.getGlobalValue()))));
    }

    // Definitions
    public static SubLObject cardinality_estimates_initializedP() {
        return makeBoolean((((((((((((((((((NIL != $local_instance_cardinality$.getGlobalValue()) && (NIL == hash_table_utilities.hash_table_empty_p($local_instance_cardinality$.getGlobalValue()))) && (NIL != $local_instance_cardinality$.getGlobalValue())) && (NIL == hash_table_utilities.hash_table_empty_p($local_instance_cardinality$.getGlobalValue()))) && (NIL != $total_instance_cardinality$.getGlobalValue())) && (NIL == hash_table_utilities.hash_table_empty_p($total_instance_cardinality$.getGlobalValue()))) && (NIL != $local_quoted_instance_cardinality$.getGlobalValue())) && (NIL == hash_table_utilities.hash_table_empty_p($local_quoted_instance_cardinality$.getGlobalValue()))) && (NIL != $total_quoted_instance_cardinality$.getGlobalValue())) && (NIL == hash_table_utilities.hash_table_empty_p($total_quoted_instance_cardinality$.getGlobalValue()))) && (NIL != $local_spec_cardinality$.getGlobalValue())) && (NIL == hash_table_utilities.hash_table_empty_p($local_spec_cardinality$.getGlobalValue()))) && (NIL != $total_spec_cardinality$.getGlobalValue())) && (NIL == hash_table_utilities.hash_table_empty_p($total_spec_cardinality$.getGlobalValue()))) && (NIL != $total_genl_cardinality$.getGlobalValue())) && (NIL == hash_table_utilities.hash_table_empty_p($total_genl_cardinality$.getGlobalValue()))) && (NIL != $generality_estimate_table$.getGlobalValue())) && (NIL == hash_table_utilities.hash_table_empty_p($generality_estimate_table$.getGlobalValue())));
    }

    public static final SubLObject rebuild_cardinality_estimates_alt() {
        com.cyc.cycjava.cycl.cardinality_estimates.initialize_cardinalities();
        return NIL;
    }

    public static SubLObject rebuild_cardinality_estimates() {
        initialize_cardinalities();
        return NIL;
    }

    /**
     * Initialize the cardinality estimates.
     */
    @LispMethod(comment = "Initialize the cardinality estimates.")
    public static final SubLObject initialize_cardinalities_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.cardinality_estimates.setup_cardinality_tables(constant_count());
            {
                SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(SIX_INTEGER);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                        com.cyc.cycjava.cycl.cardinality_estimates.initialize_local_cardinalities();
                        com.cyc.cycjava.cycl.cardinality_estimates.initialize_total_cardinalities();
                        com.cyc.cycjava.cycl.cardinality_estimates.initialize_generality_estimates();
                        sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    } finally {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Initialize the cardinality estimates.
     */
    @LispMethod(comment = "Initialize the cardinality estimates.")
    public static SubLObject initialize_cardinalities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        setup_cardinality_tables(constant_count());
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(SIX_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                initialize_local_cardinalities();
                initialize_total_cardinalities();
                initialize_generality_estimates();
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Return an estimate of the number of types for TERM.
     */
    @LispMethod(comment = "Return an estimate of the number of types for TERM.")
    public static final SubLObject isa_cardinality_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, FORT_OR_CHLMT_P);
            return $average_all_isa_count$.getDynamicValue(thread);
        }
    }

    /**
     * Return an estimate of the number of types for TERM.
     */
    @LispMethod(comment = "Return an estimate of the number of types for TERM.")
    public static SubLObject isa_cardinality(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.fort_or_chlmt_p(v_term) : "! hlmt.fort_or_chlmt_p(v_term) " + ("hlmt.fort_or_chlmt_p(v_term) " + "CommonSymbols.NIL != hlmt.fort_or_chlmt_p(v_term) ") + v_term;
        return $average_all_isa_count$.getDynamicValue(thread);
    }

    /**
     * Return an estimate of the number of instances of TERM.
     */
    @LispMethod(comment = "Return an estimate of the number of instances of TERM.")
    public static final SubLObject instance_cardinality_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_P);
        return com.cyc.cycjava.cycl.cardinality_estimates.total_instance_cardinality(v_term);
    }

    /**
     * Return an estimate of the number of instances of TERM.
     */
    @LispMethod(comment = "Return an estimate of the number of instances of TERM.")
    public static SubLObject instance_cardinality(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        return total_instance_cardinality(v_term);
    }

    /**
     * Return an estimate of the number of instances of TERM.
     */
    @LispMethod(comment = "Return an estimate of the number of instances of TERM.")
    public static final SubLObject quoted_instance_cardinality_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_P);
        return com.cyc.cycjava.cycl.cardinality_estimates.total_quoted_instance_cardinality(v_term);
    }

    /**
     * Return an estimate of the number of instances of TERM.
     */
    @LispMethod(comment = "Return an estimate of the number of instances of TERM.")
    public static SubLObject quoted_instance_cardinality(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        return total_quoted_instance_cardinality(v_term);
    }

    /**
     * Return an estimate of the number of generalizations of TERM.
     */
    @LispMethod(comment = "Return an estimate of the number of generalizations of TERM.")
    public static final SubLObject genl_cardinality_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_OR_CHLMT_P);
        return com.cyc.cycjava.cycl.cardinality_estimates.total_genl_cardinality(v_term);
    }

    /**
     * Return an estimate of the number of generalizations of TERM.
     */
    @LispMethod(comment = "Return an estimate of the number of generalizations of TERM.")
    public static SubLObject genl_cardinality(final SubLObject v_term) {
        assert NIL != hlmt.fort_or_chlmt_p(v_term) : "! hlmt.fort_or_chlmt_p(v_term) " + ("hlmt.fort_or_chlmt_p(v_term) " + "CommonSymbols.NIL != hlmt.fort_or_chlmt_p(v_term) ") + v_term;
        return total_genl_cardinality(v_term);
    }

    /**
     * Return an estimate of the number of specializations of TERM.
     */
    @LispMethod(comment = "Return an estimate of the number of specializations of TERM.")
    public static final SubLObject spec_cardinality_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_OR_CHLMT_P);
        if (NIL != hlmt_naut_p(v_term)) {
            v_term = hlmt_monad_mt(v_term);
        }
        return com.cyc.cycjava.cycl.cardinality_estimates.total_spec_cardinality(v_term);
    }

    /**
     * Return an estimate of the number of specializations of TERM.
     */
    @LispMethod(comment = "Return an estimate of the number of specializations of TERM.")
    public static SubLObject spec_cardinality(SubLObject v_term) {
        assert NIL != hlmt.fort_or_chlmt_p(v_term) : "! hlmt.fort_or_chlmt_p(v_term) " + ("hlmt.fort_or_chlmt_p(v_term) " + "CommonSymbols.NIL != hlmt.fort_or_chlmt_p(v_term) ") + v_term;
        if (NIL != hlmt.hlmt_naut_p(v_term)) {
            v_term = hlmt.hlmt_monad_mt(v_term);
        }
        return total_spec_cardinality(v_term);
    }

    /**
     * Return an estimate of the number of uses generalized by TERM.
     */
    @LispMethod(comment = "Return an estimate of the number of uses generalized by TERM.")
    public static final SubLObject use_cardinality_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_OR_CHLMT_P);
        return add(com.cyc.cycjava.cycl.cardinality_estimates.instance_cardinality(v_term), com.cyc.cycjava.cycl.cardinality_estimates.spec_cardinality(v_term));
    }

    /**
     * Return an estimate of the number of uses generalized by TERM.
     */
    @LispMethod(comment = "Return an estimate of the number of uses generalized by TERM.")
    public static SubLObject use_cardinality(final SubLObject v_term) {
        assert NIL != hlmt.fort_or_chlmt_p(v_term) : "! hlmt.fort_or_chlmt_p(v_term) " + ("hlmt.fort_or_chlmt_p(v_term) " + "CommonSymbols.NIL != hlmt.fort_or_chlmt_p(v_term) ") + v_term;
        return add(instance_cardinality(v_term), spec_cardinality(v_term));
    }

    /**
     * return node-b iff it has fewer inferiors than node-a, else return node-a
     */
    @LispMethod(comment = "return node-b iff it has fewer inferiors than node-a, else return node-a")
    public static final SubLObject lightest_node_alt(SubLObject node_a, SubLObject node_b) {
        {
            SubLObject weight_a = com.cyc.cycjava.cycl.cardinality_estimates.spec_cardinality(node_a);
            SubLObject weight_b = com.cyc.cycjava.cycl.cardinality_estimates.spec_cardinality(node_b);
            if ((weight_a.isNumber() && weight_b.isNumber()) && weight_a.numG(weight_b)) {
                return node_b;
            } else {
                return node_a;
            }
        }
    }

    /**
     * return node-b iff it has fewer inferiors than node-a, else return node-a
     */
    @LispMethod(comment = "return node-b iff it has fewer inferiors than node-a, else return node-a")
    public static SubLObject lightest_node(final SubLObject node_a, final SubLObject node_b) {
        final SubLObject weight_a = spec_cardinality(node_a);
        final SubLObject weight_b = spec_cardinality(node_b);
        if ((weight_a.isNumber() && weight_b.isNumber()) && weight_a.numG(weight_b)) {
            return node_b;
        }
        return node_a;
    }

    /**
     * return node-b iff it has fewer superiors than node-a, else return node-a
     */
    @LispMethod(comment = "return node-b iff it has fewer superiors than node-a, else return node-a")
    public static final SubLObject shallowest_node_alt(SubLObject node_a, SubLObject node_b) {
        {
            SubLObject depth_a = com.cyc.cycjava.cycl.cardinality_estimates.genl_cardinality(node_a);
            SubLObject depth_b = com.cyc.cycjava.cycl.cardinality_estimates.genl_cardinality(node_b);
            if ((depth_a.isNumber() && depth_b.isNumber()) && depth_a.numG(depth_b)) {
                return node_b;
            } else {
                return node_a;
            }
        }
    }

    /**
     * return node-b iff it has fewer superiors than node-a, else return node-a
     */
    @LispMethod(comment = "return node-b iff it has fewer superiors than node-a, else return node-a")
    public static SubLObject shallowest_node(final SubLObject node_a, final SubLObject node_b) {
        final SubLObject depth_a = genl_cardinality(node_a);
        final SubLObject depth_b = genl_cardinality(node_b);
        if ((depth_a.isNumber() && depth_b.isNumber()) && depth_a.numG(depth_b)) {
            return node_b;
        }
        return node_a;
    }

    /**
     * Return a non-negative integer heuristic estimate of the generality of TERM.
     * Larger values represent increasing generality.
     * A leaf concept will return a value of 0.
     */
    @LispMethod(comment = "Return a non-negative integer heuristic estimate of the generality of TERM.\r\nLarger values represent increasing generality.\r\nA leaf concept will return a value of 0.\nReturn a non-negative integer heuristic estimate of the generality of TERM.\nLarger values represent increasing generality.\nA leaf concept will return a value of 0.")
    public static final SubLObject generality_estimate_alt(SubLObject v_term) {
        if (NIL == fort_or_chlmt_p(v_term)) {
            return ZERO_INTEGER;
        }
        return com.cyc.cycjava.cycl.cardinality_estimates.get_generality_estimate(v_term);
    }

    /**
     * Return a non-negative integer heuristic estimate of the generality of TERM.
     * Larger values represent increasing generality.
     * A leaf concept will return a value of 0.
     */
    @LispMethod(comment = "Return a non-negative integer heuristic estimate of the generality of TERM.\r\nLarger values represent increasing generality.\r\nA leaf concept will return a value of 0.\nReturn a non-negative integer heuristic estimate of the generality of TERM.\nLarger values represent increasing generality.\nA leaf concept will return a value of 0.")
    public static SubLObject generality_estimate(final SubLObject v_term) {
        if (NIL == hlmt.fort_or_chlmt_p(v_term)) {
            return ZERO_INTEGER;
        }
        return get_generality_estimate(v_term);
    }

    /**
     * Sort TERMS by generality estimate.
     * Mode is one of :ASCENDING or :DESCENDING, which determines the sort odering.
     */
    @LispMethod(comment = "Sort TERMS by generality estimate.\r\nMode is one of :ASCENDING or :DESCENDING, which determines the sort odering.\nSort TERMS by generality estimate.\nMode is one of :ASCENDING or :DESCENDING, which determines the sort odering.")
    public static final SubLObject sort_by_generality_estimate_alt(SubLObject terms, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $ASCENDING;
        }
        {
            SubLObject pcase_var = mode;
            if (pcase_var.eql($ASCENDING)) {
                return Sort.sort(terms, symbol_function($sym3$_), symbol_function(GENERALITY_ESTIMATE));
            } else {
                if (pcase_var.eql($DESCENDING)) {
                    return Sort.sort(terms, symbol_function($sym6$_), symbol_function(GENERALITY_ESTIMATE));
                } else {
                    return terms;
                }
            }
        }
    }

    /**
     * Sort TERMS by generality estimate.
     * Mode is one of :ASCENDING or :DESCENDING, which determines the sort odering.
     */
    @LispMethod(comment = "Sort TERMS by generality estimate.\r\nMode is one of :ASCENDING or :DESCENDING, which determines the sort odering.\nSort TERMS by generality estimate.\nMode is one of :ASCENDING or :DESCENDING, which determines the sort odering.")
    public static SubLObject sort_by_generality_estimate(final SubLObject terms, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $ASCENDING;
        }
        final SubLObject pcase_var = mode;
        if (pcase_var.eql($ASCENDING)) {
            return Sort.sort(terms, symbol_function($sym3$_), symbol_function(GENERALITY_ESTIMATE));
        }
        if (pcase_var.eql($DESCENDING)) {
            return Sort.sort(terms, symbol_function($sym6$_), symbol_function(GENERALITY_ESTIMATE));
        }
        return terms;
    }

    /**
     * Stably sort TERMS by generality estimate.
     * Mode is one of :ASCENDING or :DESCENDING, which determines the sort odering.
     */
    @LispMethod(comment = "Stably sort TERMS by generality estimate.\r\nMode is one of :ASCENDING or :DESCENDING, which determines the sort odering.\nStably sort TERMS by generality estimate.\nMode is one of :ASCENDING or :DESCENDING, which determines the sort odering.")
    public static final SubLObject stable_sort_by_generality_estimate_alt(SubLObject terms, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $ASCENDING;
        }
        {
            SubLObject pcase_var = mode;
            if (pcase_var.eql($ASCENDING)) {
                return Sort.stable_sort(terms, symbol_function($sym3$_), symbol_function(GENERALITY_ESTIMATE));
            } else {
                if (pcase_var.eql($DESCENDING)) {
                    return Sort.stable_sort(terms, symbol_function($sym6$_), symbol_function(GENERALITY_ESTIMATE));
                } else {
                    return terms;
                }
            }
        }
    }

    /**
     * Stably sort TERMS by generality estimate.
     * Mode is one of :ASCENDING or :DESCENDING, which determines the sort odering.
     */
    @LispMethod(comment = "Stably sort TERMS by generality estimate.\r\nMode is one of :ASCENDING or :DESCENDING, which determines the sort odering.\nStably sort TERMS by generality estimate.\nMode is one of :ASCENDING or :DESCENDING, which determines the sort odering.")
    public static SubLObject stable_sort_by_generality_estimate(final SubLObject terms, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $ASCENDING;
        }
        final SubLObject pcase_var = mode;
        if (pcase_var.eql($ASCENDING)) {
            return Sort.stable_sort(terms, symbol_function($sym3$_), symbol_function(GENERALITY_ESTIMATE));
        }
        if (pcase_var.eql($DESCENDING)) {
            return Sort.stable_sort(terms, symbol_function($sym6$_), symbol_function(GENERALITY_ESTIMATE));
        }
        return terms;
    }

    /**
     * Compare the generality-estimate of two terms TERM1 and TERM2 and return t if TERM1 is less general than TERM2.
     *
     * @return boolean ;; t if TERM1 is more general than TERM2, o/w nil
     * @param TERM1
    collection
     * 		
     * @param TERM2
    collection
     * 		
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Compare the generality-estimate of two terms TERM1 and TERM2 and return t if TERM1 is less general than TERM2.\r\n\r\n@return boolean ;; t if TERM1 is more general than TERM2, o/w nil\r\n@param TERM1\ncollection\r\n\t\t\r\n@param TERM2\ncollection\r\n\t\t\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject generality_estimateL_alt(SubLObject term1, SubLObject term2) {
        return numL(com.cyc.cycjava.cycl.cardinality_estimates.generality_estimate(term1), com.cyc.cycjava.cycl.cardinality_estimates.generality_estimate(term2));
    }

    /**
     * Compare the generality-estimate of two terms TERM1 and TERM2 and return t if TERM1 is less general than TERM2.
     *
     * @return boolean ;; t if TERM1 is more general than TERM2, o/w nil
     * @param TERM1
    		collection
     * 		
     * @param TERM2
    		collection
     * 		
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Compare the generality-estimate of two terms TERM1 and TERM2 and return t if TERM1 is less general than TERM2.\r\n\r\n@return boolean ;; t if TERM1 is more general than TERM2, o/w nil\r\n@param TERM1\n\t\tcollection\r\n\t\t\r\n@param TERM2\n\t\tcollection\r\n\t\t\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject generality_estimateL(final SubLObject term1, final SubLObject term2) {
        return numL(generality_estimate(term1), generality_estimate(term2));
    }

    /**
     * Compare the generality-estimate of two terms TERM1 and TERM2 and return t if TERM1 is more general than TERM2.
     *
     * @return boolean ;; t if TERM1 is more general than TERM2, o/w nil
     * @param TERM1
    collection
     * 		
     * @param TERM2
    collection
     * 		
     * @unknown This is redundant with generality-estimate<, but saves an nreverse if we're using it to sort a list.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Compare the generality-estimate of two terms TERM1 and TERM2 and return t if TERM1 is more general than TERM2.\r\n\r\n@return boolean ;; t if TERM1 is more general than TERM2, o/w nil\r\n@param TERM1\ncollection\r\n\t\t\r\n@param TERM2\ncollection\r\n\t\t\r\n@unknown This is redundant with generality-estimate<, but saves an nreverse if we\'re using it to sort a list.\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject generality_estimateG_alt(SubLObject term1, SubLObject term2) {
        return numG(com.cyc.cycjava.cycl.cardinality_estimates.generality_estimate(term1), com.cyc.cycjava.cycl.cardinality_estimates.generality_estimate(term2));
    }

    /**
     * Compare the generality-estimate of two terms TERM1 and TERM2 and return t if TERM1 is more general than TERM2.
     *
     * @return boolean ;; t if TERM1 is more general than TERM2, o/w nil
     * @param TERM1
    		collection
     * 		
     * @param TERM2
    		collection
     * 		
     * @unknown This is redundant with generality-estimate<, but saves an nreverse if we're using it to sort a list.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Compare the generality-estimate of two terms TERM1 and TERM2 and return t if TERM1 is more general than TERM2.\r\n\r\n@return boolean ;; t if TERM1 is more general than TERM2, o/w nil\r\n@param TERM1\n\t\tcollection\r\n\t\t\r\n@param TERM2\n\t\tcollection\r\n\t\t\r\n@unknown This is redundant with generality-estimate<, but saves an nreverse if we\'re using it to sort a list.\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject generality_estimateG(final SubLObject term1, final SubLObject term2) {
        return numG(generality_estimate(term1), generality_estimate(term2));
    }

    public static SubLObject most_general_term(final SubLObject terms) {
        return number_utilities.maximum(terms, GENERALITY_ESTIMATE);
    }

    public static SubLObject least_general_term(final SubLObject terms) {
        return number_utilities.minimum(terms, GENERALITY_ESTIMATE);
    }

    public static final SubLObject instance_iteration_cost_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_P);
        return com.cyc.cycjava.cycl.cardinality_estimates.instance_cardinality(v_term);
    }

    public static SubLObject instance_iteration_cost(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        return instance_cardinality(v_term);
    }

    public static final SubLObject quoted_instance_iteration_cost_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_P);
        return com.cyc.cycjava.cycl.cardinality_estimates.quoted_instance_cardinality(v_term);
    }

    public static SubLObject quoted_instance_iteration_cost(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        return quoted_instance_cardinality(v_term);
    }

    public static final SubLObject clear_cardinalities_alt() {
        com.cyc.cycjava.cycl.cardinality_estimates.clear_local_cardinalities();
        com.cyc.cycjava.cycl.cardinality_estimates.clear_total_cardinalities();
        com.cyc.cycjava.cycl.cardinality_estimates.clear_generality_estimates();
        return NIL;
    }

    public static SubLObject clear_cardinalities() {
        clear_local_cardinalities();
        clear_total_cardinalities();
        clear_generality_estimates();
        return NIL;
    }

    public static final SubLObject local_instance_cardinality_alt(SubLObject v_term) {
        return gethash_without_values(v_term, $local_instance_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static SubLObject local_instance_cardinality(final SubLObject v_term) {
        return gethash_without_values(v_term, $local_instance_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static final SubLObject set_local_instance_cardinality_alt(SubLObject v_term, SubLObject count) {
        sethash(v_term, $local_instance_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static SubLObject set_local_instance_cardinality(final SubLObject v_term, final SubLObject count) {
        sethash(v_term, $local_instance_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static final SubLObject increment_local_instance_cardinality_alt(SubLObject v_term, SubLObject delta) {
        return com.cyc.cycjava.cycl.cardinality_estimates.set_local_instance_cardinality(v_term, add(com.cyc.cycjava.cycl.cardinality_estimates.local_instance_cardinality(v_term), delta));
    }

    public static SubLObject increment_local_instance_cardinality(final SubLObject v_term, final SubLObject delta) {
        return set_local_instance_cardinality(v_term, add(local_instance_cardinality(v_term), delta));
    }

    public static final SubLObject local_quoted_instance_cardinality_alt(SubLObject v_term) {
        return gethash_without_values(v_term, $local_quoted_instance_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static SubLObject local_quoted_instance_cardinality(final SubLObject v_term) {
        return gethash_without_values(v_term, $local_quoted_instance_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static final SubLObject set_local_quoted_instance_cardinality_alt(SubLObject v_term, SubLObject count) {
        sethash(v_term, $local_quoted_instance_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static SubLObject set_local_quoted_instance_cardinality(final SubLObject v_term, final SubLObject count) {
        sethash(v_term, $local_quoted_instance_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static final SubLObject increment_local_quoted_instance_cardinality_alt(SubLObject v_term, SubLObject delta) {
        return com.cyc.cycjava.cycl.cardinality_estimates.set_local_quoted_instance_cardinality(v_term, add(com.cyc.cycjava.cycl.cardinality_estimates.local_quoted_instance_cardinality(v_term), delta));
    }

    public static SubLObject increment_local_quoted_instance_cardinality(final SubLObject v_term, final SubLObject delta) {
        return set_local_quoted_instance_cardinality(v_term, add(local_quoted_instance_cardinality(v_term), delta));
    }

    public static final SubLObject local_spec_cardinality_alt(SubLObject v_term) {
        return gethash_without_values(v_term, $local_spec_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static SubLObject local_spec_cardinality(final SubLObject v_term) {
        return gethash_without_values(v_term, $local_spec_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static final SubLObject set_local_spec_cardinality_alt(SubLObject v_term, SubLObject count) {
        sethash(v_term, $local_spec_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static SubLObject set_local_spec_cardinality(final SubLObject v_term, final SubLObject count) {
        sethash(v_term, $local_spec_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static final SubLObject total_instance_cardinality_alt(SubLObject v_term) {
        return gethash_without_values(v_term, $total_instance_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static SubLObject total_instance_cardinality(final SubLObject v_term) {
        return gethash_without_values(v_term, $total_instance_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static final SubLObject set_total_instance_cardinality_alt(SubLObject v_term, SubLObject count) {
        sethash(v_term, $total_instance_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static SubLObject set_total_instance_cardinality(final SubLObject v_term, final SubLObject count) {
        sethash(v_term, $total_instance_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static final SubLObject increment_total_instance_cardinality_alt(SubLObject v_term, SubLObject delta) {
        return com.cyc.cycjava.cycl.cardinality_estimates.set_total_instance_cardinality(v_term, add(com.cyc.cycjava.cycl.cardinality_estimates.total_instance_cardinality(v_term), delta));
    }

    public static SubLObject increment_total_instance_cardinality(final SubLObject v_term, final SubLObject delta) {
        return set_total_instance_cardinality(v_term, add(total_instance_cardinality(v_term), delta));
    }

    public static final SubLObject total_quoted_instance_cardinality_alt(SubLObject v_term) {
        return gethash_without_values(v_term, $total_quoted_instance_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static SubLObject total_quoted_instance_cardinality(final SubLObject v_term) {
        return gethash_without_values(v_term, $total_quoted_instance_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static final SubLObject set_total_quoted_instance_cardinality_alt(SubLObject v_term, SubLObject count) {
        sethash(v_term, $total_quoted_instance_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static SubLObject set_total_quoted_instance_cardinality(final SubLObject v_term, final SubLObject count) {
        sethash(v_term, $total_quoted_instance_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static final SubLObject increment_total_quoted_instance_cardinality_alt(SubLObject v_term, SubLObject delta) {
        return com.cyc.cycjava.cycl.cardinality_estimates.set_total_quoted_instance_cardinality(v_term, add(com.cyc.cycjava.cycl.cardinality_estimates.total_quoted_instance_cardinality(v_term), delta));
    }

    public static SubLObject increment_total_quoted_instance_cardinality(final SubLObject v_term, final SubLObject delta) {
        return set_total_quoted_instance_cardinality(v_term, add(total_quoted_instance_cardinality(v_term), delta));
    }

    public static final SubLObject total_spec_cardinality_alt(SubLObject v_term) {
        return gethash_without_values(v_term, $total_spec_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static SubLObject total_spec_cardinality(final SubLObject v_term) {
        return gethash_without_values(v_term, $total_spec_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static final SubLObject set_total_spec_cardinality_alt(SubLObject v_term, SubLObject count) {
        sethash(v_term, $total_spec_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static SubLObject set_total_spec_cardinality(final SubLObject v_term, final SubLObject count) {
        sethash(v_term, $total_spec_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static final SubLObject increment_total_spec_cardinality_alt(SubLObject v_term, SubLObject delta) {
        return com.cyc.cycjava.cycl.cardinality_estimates.set_total_spec_cardinality(v_term, add(com.cyc.cycjava.cycl.cardinality_estimates.total_spec_cardinality(v_term), delta));
    }

    public static SubLObject increment_total_spec_cardinality(final SubLObject v_term, final SubLObject delta) {
        return set_total_spec_cardinality(v_term, add(total_spec_cardinality(v_term), delta));
    }

    public static final SubLObject total_genl_cardinality_alt(SubLObject v_term) {
        return gethash_without_values(v_term, $total_genl_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static SubLObject total_genl_cardinality(final SubLObject v_term) {
        return gethash_without_values(v_term, $total_genl_cardinality$.getGlobalValue(), ZERO_INTEGER);
    }

    public static final SubLObject set_total_genl_cardinality_alt(SubLObject v_term, SubLObject count) {
        sethash(v_term, $total_genl_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static SubLObject set_total_genl_cardinality(final SubLObject v_term, final SubLObject count) {
        sethash(v_term, $total_genl_cardinality$.getGlobalValue(), count);
        return v_term;
    }

    public static final SubLObject get_generality_estimate_alt(SubLObject v_term) {
        if (!$generality_estimate_table$.getGlobalValue().isHashtable()) {
            return com.cyc.cycjava.cycl.cardinality_estimates.compute_generality_estimate(v_term);
        }
        return gethash_without_values(v_term, $generality_estimate_table$.getGlobalValue(), ZERO_INTEGER);
    }

    public static SubLObject get_generality_estimate(final SubLObject v_term) {
        if (!$generality_estimate_table$.getGlobalValue().isHashtable()) {
            return compute_generality_estimate(v_term);
        }
        return gethash_without_values(v_term, $generality_estimate_table$.getGlobalValue(), ZERO_INTEGER);
    }

    public static final SubLObject set_generality_estimate_alt(SubLObject v_term, SubLObject estimate) {
        sethash(v_term, $generality_estimate_table$.getGlobalValue(), estimate);
        return v_term;
    }

    public static SubLObject set_generality_estimate(final SubLObject v_term, final SubLObject estimate) {
        sethash(v_term, $generality_estimate_table$.getGlobalValue(), estimate);
        return v_term;
    }

    public static final SubLObject setup_cardinality_tables_alt(SubLObject estimated_size) {
        {
            SubLObject local_instance_cardinality_size = integerDivide(estimated_size, TEN_INTEGER);
            SubLObject total_instance_cardinality_size = local_instance_cardinality_size;
            SubLObject local_quoted_instance_cardinality_size = integerDivide(estimated_size, TEN_INTEGER);
            SubLObject total_quoted_instance_cardinality_size = local_quoted_instance_cardinality_size;
            SubLObject local_spec_cardinality_size = integerDivide(estimated_size, TEN_INTEGER);
            SubLObject total_spec_cardinality_size = local_spec_cardinality_size;
            SubLObject total_genl_cardinality_size = total_spec_cardinality_size;
            SubLObject generality_estimate_size = total_genl_cardinality_size;
            if (!$local_instance_cardinality$.getGlobalValue().isHashtable()) {
                $local_instance_cardinality$.setGlobalValue(make_hash_table(local_instance_cardinality_size, symbol_function(EQ), $table_area$.getGlobalValue()));
            }
            if (!$total_instance_cardinality$.getGlobalValue().isHashtable()) {
                $total_instance_cardinality$.setGlobalValue(make_hash_table(total_instance_cardinality_size, symbol_function(EQ), $table_area$.getGlobalValue()));
            }
            if (!$local_quoted_instance_cardinality$.getGlobalValue().isHashtable()) {
                $local_quoted_instance_cardinality$.setGlobalValue(make_hash_table(local_quoted_instance_cardinality_size, symbol_function(EQ), $table_area$.getGlobalValue()));
            }
            if (!$total_quoted_instance_cardinality$.getGlobalValue().isHashtable()) {
                $total_quoted_instance_cardinality$.setGlobalValue(make_hash_table(total_quoted_instance_cardinality_size, symbol_function(EQ), $table_area$.getGlobalValue()));
            }
            if (!$local_spec_cardinality$.getGlobalValue().isHashtable()) {
                $local_spec_cardinality$.setGlobalValue(make_hash_table(local_spec_cardinality_size, symbol_function(EQ), $table_area$.getGlobalValue()));
            }
            if (!$total_spec_cardinality$.getGlobalValue().isHashtable()) {
                $total_spec_cardinality$.setGlobalValue(make_hash_table(total_spec_cardinality_size, symbol_function(EQ), $table_area$.getGlobalValue()));
            }
            if (!$total_genl_cardinality$.getGlobalValue().isHashtable()) {
                $total_genl_cardinality$.setGlobalValue(make_hash_table(total_genl_cardinality_size, symbol_function(EQ), $table_area$.getGlobalValue()));
            }
            if (!$generality_estimate_table$.getGlobalValue().isHashtable()) {
                $generality_estimate_table$.setGlobalValue(make_hash_table(generality_estimate_size, symbol_function(EQ), $table_area$.getGlobalValue()));
            }
        }
        return estimated_size;
    }

    public static SubLObject setup_cardinality_tables(final SubLObject estimated_size) {
        final SubLObject total_instance_cardinality_size;
        final SubLObject local_instance_cardinality_size = total_instance_cardinality_size = integerDivide(estimated_size, TEN_INTEGER);
        final SubLObject total_quoted_instance_cardinality_size;
        final SubLObject local_quoted_instance_cardinality_size = total_quoted_instance_cardinality_size = integerDivide(estimated_size, TEN_INTEGER);
        final SubLObject total_spec_cardinality_size;
        final SubLObject local_spec_cardinality_size = total_spec_cardinality_size = integerDivide(estimated_size, TEN_INTEGER);
        final SubLObject generality_estimate_size;
        final SubLObject total_genl_cardinality_size = generality_estimate_size = total_spec_cardinality_size;
        if (!$local_instance_cardinality$.getGlobalValue().isHashtable()) {
            $local_instance_cardinality$.setGlobalValue(make_hash_table(local_instance_cardinality_size, symbol_function(EQL), list($AREA, $table_area$.getGlobalValue())));
        }
        if (!$total_instance_cardinality$.getGlobalValue().isHashtable()) {
            $total_instance_cardinality$.setGlobalValue(make_hash_table(total_instance_cardinality_size, symbol_function(EQL), list($AREA, $table_area$.getGlobalValue())));
        }
        if (!$local_quoted_instance_cardinality$.getGlobalValue().isHashtable()) {
            $local_quoted_instance_cardinality$.setGlobalValue(make_hash_table(local_quoted_instance_cardinality_size, symbol_function(EQL), list($AREA, $table_area$.getGlobalValue())));
        }
        if (!$total_quoted_instance_cardinality$.getGlobalValue().isHashtable()) {
            $total_quoted_instance_cardinality$.setGlobalValue(make_hash_table(total_quoted_instance_cardinality_size, symbol_function(EQL), list($AREA, $table_area$.getGlobalValue())));
        }
        if (!$local_spec_cardinality$.getGlobalValue().isHashtable()) {
            $local_spec_cardinality$.setGlobalValue(make_hash_table(local_spec_cardinality_size, symbol_function(EQL), list($AREA, $table_area$.getGlobalValue())));
        }
        if (!$total_spec_cardinality$.getGlobalValue().isHashtable()) {
            $total_spec_cardinality$.setGlobalValue(make_hash_table(total_spec_cardinality_size, symbol_function(EQL), list($AREA, $table_area$.getGlobalValue())));
        }
        if (!$total_genl_cardinality$.getGlobalValue().isHashtable()) {
            $total_genl_cardinality$.setGlobalValue(make_hash_table(total_genl_cardinality_size, symbol_function(EQL), list($AREA, $table_area$.getGlobalValue())));
        }
        if (!$generality_estimate_table$.getGlobalValue().isHashtable()) {
            $generality_estimate_table$.setGlobalValue(make_hash_table(generality_estimate_size, symbol_function(EQL), list($AREA, $table_area$.getGlobalValue())));
        }
        return estimated_size;
    }

    public static final SubLObject clear_local_cardinalities_alt() {
        clrhash($local_instance_cardinality$.getGlobalValue());
        clrhash($local_quoted_instance_cardinality$.getGlobalValue());
        clrhash($local_spec_cardinality$.getGlobalValue());
        return NIL;
    }

    public static SubLObject clear_local_cardinalities() {
        clrhash($local_instance_cardinality$.getGlobalValue());
        clrhash($local_quoted_instance_cardinality$.getGlobalValue());
        clrhash($local_spec_cardinality$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject initialize_local_cardinalities_alt() {
        com.cyc.cycjava.cycl.cardinality_estimates.clear_local_cardinalities();
        com.cyc.cycjava.cycl.cardinality_estimates.initialize_collection_local_spec_cardinalities();
        com.cyc.cycjava.cycl.cardinality_estimates.initialize_collection_local_instance_cardinalities();
        com.cyc.cycjava.cycl.cardinality_estimates.initialize_collection_local_quoted_instance_cardinalities();
        com.cyc.cycjava.cycl.cardinality_estimates.initialize_predicate_local_spec_cardinalities();
        com.cyc.cycjava.cycl.cardinality_estimates.initialize_microtheory_local_spec_cardinalities();
        com.cyc.cycjava.cycl.cardinality_estimates.initialize_other_local_instance_cardinalities();
        return NIL;
    }

    public static SubLObject initialize_local_cardinalities() {
        clear_local_cardinalities();
        initialize_collection_local_spec_cardinalities();
        initialize_collection_local_instance_cardinalities();
        initialize_collection_local_quoted_instance_cardinalities();
        initialize_predicate_local_spec_cardinalities();
        initialize_microtheory_local_spec_cardinalities();
        initialize_other_local_instance_cardinalities();
        return NIL;
    }

    public static final SubLObject do_sbhl_module_nodes_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject node_var = NIL;
                    SubLObject module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    node_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    module = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt15);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt15);
                            if (NIL == member(current_1, $list_alt16, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt15);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != progress_message) {
                                    {
                                        SubLObject message_var = $sym20$MESSAGE_VAR;
                                        SubLObject module_var = $sym21$MODULE_VAR;
                                        SubLObject total = $sym22$TOTAL;
                                        SubLObject sofar = $sym23$SOFAR;
                                        return list(CLET, list(list(message_var, progress_message), list(module_var, module), list(total, list(GET_SBHL_MODULE_SIZE, module_var)), bq_cons(sofar, $list_alt26)), list(NOTING_PERCENT_PROGRESS, message_var, listS(DO_SBHL_MODULE_NODES, list(node_var, module_var, $DONE, done), list(NOTE_PERCENT_PROGRESS, sofar, total), list(CINC, total), append(body, NIL))));
                                    }
                                }
                                if (!module.isSymbol()) {
                                    {
                                        SubLObject module_var = $sym31$MODULE_VAR;
                                        return list(CLET, list(list(module_var, module)), listS(DO_SBHL_MODULE_NODES, list(node_var, module_var, $DONE, done), append(body, NIL)));
                                    }
                                }
                                {
                                    SubLObject link_var = $sym32$LINK_VAR;
                                    return listS(DO_SBHL_GRAPH_LINKS, list(node_var, link_var, $MODULE, module, $DONE, done), list(IGNORE, link_var), append(body, NIL));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_sbhl_module_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list16);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list16);
            if (NIL == member(current_$2, $list17, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list16);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != progress_message) {
            final SubLObject message_var = $sym21$MESSAGE_VAR;
            final SubLObject module_var = $sym22$MODULE_VAR;
            final SubLObject total = $sym23$TOTAL;
            final SubLObject sofar = $sym24$SOFAR;
            return list(CLET, list(list(message_var, progress_message), list(module_var, module), list(total, list(GET_SBHL_MODULE_SIZE, module_var)), bq_cons(sofar, $list27)), list(NOTING_PERCENT_PROGRESS, message_var, listS(DO_SBHL_MODULE_NODES, list(node_var, module_var, $DONE, done), list(NOTE_PERCENT_PROGRESS, sofar, total), list(CINC, total), append(body, NIL))));
        }
        if (!module.isSymbol()) {
            final SubLObject module_var2 = $sym32$MODULE_VAR;
            return list(CLET, list(list(module_var2, module)), listS(DO_SBHL_MODULE_NODES, list(node_var, module_var2, $DONE, done), append(body, NIL)));
        }
        final SubLObject link_var = $sym33$LINK_VAR;
        return listS(DO_SBHL_GRAPH_LINKS, list(node_var, link_var, $MODULE, module, $DONE, done), list(IGNORE, link_var), append(body, NIL));
    }

    public static final SubLObject get_sbhl_module_size_alt(SubLObject module) {
        return hash_table_count(sbhl_module_utilities.get_sbhl_graph(module));
    }

    public static SubLObject get_sbhl_module_size(final SubLObject module) {
        return hash_table_count(sbhl_module_utilities.get_sbhl_graph(module));
    }

    public static final SubLObject initialize_collection_local_spec_cardinalities_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = $str_alt36$Calculating_collection_local_spec;
                SubLObject module = sbhl_module_vars.get_sbhl_module($$genls);
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject message_var = message;
                            SubLObject module_var = module;
                            SubLObject total = com.cyc.cycjava.cycl.cardinality_estimates.get_sbhl_module_size(module_var);
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_2 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_3 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message_var);
                                    {
                                        SubLObject _prev_bind_0_4 = $cfasl_common_symbols$.currentBinding(thread);
                                        try {
                                            $cfasl_common_symbols$.bind(NIL, thread);
                                            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                                            {
                                                SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                                                SubLObject link_var = NIL;
                                                SubLObject iterator = map_utilities.new_map_iterator(map);
                                                SubLObject done_var = NIL;
                                                while (NIL == done_var) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject var = iteration.iteration_next(iterator);
                                                        SubLObject valid = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject datum = var;
                                                                SubLObject current = datum;
                                                                SubLObject v_term = NIL;
                                                                SubLObject impl_value = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                v_term = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                impl_value = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (!((NIL != file_vector_utilities.file_vector_reference_p(impl_value)) && (NIL != file_vector_utilities.file_vector_reference_deletedP(impl_value)))) {
                                                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED);
                                                                        note_percent_progress(sofar, total);
                                                                        total = add(total, ONE_INTEGER);
                                                                        if (NIL != fort_types_interface.collection_p(v_term)) {
                                                                            {
                                                                                SubLObject local_specs = ZERO_INTEGER;
                                                                                {
                                                                                    SubLObject _prev_bind_0_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genls))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$genls));
                                                                                            if (NIL != d_link) {
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                                    SubLObject direction = NIL;
                                                                                                    for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genls));
                                                                                                            if (NIL != mt_links) {
                                                                                                                if (direction == sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genls))) {
                                                                                                                    {
                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                {
                                                                                                                                    SubLObject iteration_state_6 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_6)) {
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        {
                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_6);
                                                                                                                                            SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                                                                                    SubLObject cdolist_list_var_7 = new_list;
                                                                                                                                                    SubLObject spec = NIL;
                                                                                                                                                    for (spec = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , spec = cdolist_list_var_7.first()) {
                                                                                                                                                        local_specs = add(local_specs, ONE_INTEGER);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            iteration_state_6 = dictionary_contents.do_dictionary_contents_next(iteration_state_6);
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_6);
                                                                                                                                }
                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_5, thread);
                                                                                    }
                                                                                }
                                                                                if (local_specs.isPositive()) {
                                                                                    count = add(count, ONE_INTEGER);
                                                                                    com.cyc.cycjava.cycl.cardinality_estimates.set_local_spec_cardinality(v_term, local_specs);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list_alt40);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            $cfasl_common_symbols$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_3, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject initialize_collection_local_spec_cardinalities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $str37$Calculating_collection_local_spec;
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$genls);
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message_var = message;
            final SubLObject module_var = module;
            SubLObject total = get_sbhl_module_size(module_var);
            final SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$3 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$4 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    final SubLObject _prev_bind_0_$4 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$5 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
                        final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                        SubLObject link_var = NIL;
                        final SubLObject iterator = map_utilities.new_map_iterator(map);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject var = iteration.iteration_next(iterator);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                SubLObject current;
                                final SubLObject datum = current = var;
                                SubLObject v_term = NIL;
                                SubLObject impl_value = NIL;
                                destructuring_bind_must_consp(current, datum, $list41);
                                v_term = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list41);
                                impl_value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((NIL == file_vector_utilities.file_vector_reference_p(impl_value)) || (NIL == file_vector_utilities.file_vector_reference_deletedP(impl_value))) {
                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED);
                                        note_percent_progress(sofar, total);
                                        total = add(total, ONE_INTEGER);
                                        if (NIL != fort_types_interface.collection_p(v_term)) {
                                            SubLObject local_specs = ZERO_INTEGER;
                                            final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? sbhl_module_vars.get_sbhl_module($$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$genls));
                                                if (NIL != d_link) {
                                                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genls));
                                                    SubLObject direction = NIL;
                                                    direction = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genls));
                                                        if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genls)))) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                SubLObject iteration_state_$8;
                                                                for (iteration_state_$8 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$8); iteration_state_$8 = dictionary_contents.do_dictionary_contents_next(iteration_state_$8)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$8);
                                                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                                                        final SubLObject sol = link_nodes_var;
                                                                        if (NIL != set.set_p(sol)) {
                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                            SubLObject basis_object;
                                                                            SubLObject state;
                                                                            SubLObject spec;
                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                spec = set_contents.do_set_contents_next(basis_object, state);
                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, spec)) {
                                                                                    local_specs = add(local_specs, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol.isList()) {
                                                                                SubLObject csome_list_var = sol;
                                                                                SubLObject spec2 = NIL;
                                                                                spec2 = csome_list_var.first();
                                                                                while (NIL != csome_list_var) {
                                                                                    local_specs = add(local_specs, ONE_INTEGER);
                                                                                    csome_list_var = csome_list_var.rest();
                                                                                    spec2 = csome_list_var.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                            }

                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$8);
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        direction = cdolist_list_var.first();
                                                    } 
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$5, thread);
                                            }
                                            if (local_specs.isPositive()) {
                                                count = add(count, ONE_INTEGER);
                                                set_local_spec_cardinality(v_term, local_specs);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list41);
                                }
                            }
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_1_$5, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$4, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$4, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject initialize_collection_local_instance_cardinalities_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = $str_alt41$Calculating_collection_local_inst;
                SubLObject module = sbhl_module_vars.get_sbhl_module($$isa);
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject message_var = message;
                            SubLObject module_var = module;
                            SubLObject total = com.cyc.cycjava.cycl.cardinality_estimates.get_sbhl_module_size(module_var);
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_8 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_9 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message_var);
                                    {
                                        SubLObject _prev_bind_0_10 = $cfasl_common_symbols$.currentBinding(thread);
                                        try {
                                            $cfasl_common_symbols$.bind(NIL, thread);
                                            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                                            {
                                                SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                                                SubLObject link_var = NIL;
                                                SubLObject iterator = map_utilities.new_map_iterator(map);
                                                SubLObject done_var = NIL;
                                                while (NIL == done_var) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject var = iteration.iteration_next(iterator);
                                                        SubLObject valid = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject datum = var;
                                                                SubLObject current = datum;
                                                                SubLObject v_term = NIL;
                                                                SubLObject impl_value = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                v_term = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                impl_value = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (!((NIL != file_vector_utilities.file_vector_reference_p(impl_value)) && (NIL != file_vector_utilities.file_vector_reference_deletedP(impl_value)))) {
                                                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED);
                                                                        note_percent_progress(sofar, total);
                                                                        total = add(total, ONE_INTEGER);
                                                                        if (NIL != fort_types_interface.collection_p(v_term)) {
                                                                            {
                                                                                SubLObject local_instances = ZERO_INTEGER;
                                                                                {
                                                                                    SubLObject _prev_bind_0_11 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$isa) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$isa))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$isa));
                                                                                            if (NIL != d_link) {
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                                    SubLObject direction = NIL;
                                                                                                    for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$isa));
                                                                                                            if (NIL != mt_links) {
                                                                                                                if (direction == sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa))) {
                                                                                                                    {
                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                {
                                                                                                                                    SubLObject iteration_state_12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_12)) {
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        {
                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_12);
                                                                                                                                            SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                                                                                    SubLObject cdolist_list_var_13 = new_list;
                                                                                                                                                    SubLObject instance = NIL;
                                                                                                                                                    for (instance = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , instance = cdolist_list_var_13.first()) {
                                                                                                                                                        local_instances = add(local_instances, ONE_INTEGER);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            iteration_state_12 = dictionary_contents.do_dictionary_contents_next(iteration_state_12);
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_12);
                                                                                                                                }
                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_11, thread);
                                                                                    }
                                                                                }
                                                                                if (local_instances.isPositive()) {
                                                                                    count = add(count, ONE_INTEGER);
                                                                                    com.cyc.cycjava.cycl.cardinality_estimates.set_local_instance_cardinality(v_term, local_instances);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list_alt40);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            $cfasl_common_symbols$.rebind(_prev_bind_0_10, thread);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_9, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_8, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject initialize_collection_local_instance_cardinalities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $str43$Calculating_collection_local_inst;
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$isa);
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message_var = message;
            final SubLObject module_var = module;
            SubLObject total = get_sbhl_module_size(module_var);
            final SubLObject sofar = ZERO_INTEGER;
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
                    noting_percent_progress_preamble(message_var);
                    final SubLObject _prev_bind_0_$11 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$12 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
                        final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                        SubLObject link_var = NIL;
                        final SubLObject iterator = map_utilities.new_map_iterator(map);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject var = iteration.iteration_next(iterator);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                SubLObject current;
                                final SubLObject datum = current = var;
                                SubLObject v_term = NIL;
                                SubLObject impl_value = NIL;
                                destructuring_bind_must_consp(current, datum, $list41);
                                v_term = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list41);
                                impl_value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((NIL == file_vector_utilities.file_vector_reference_p(impl_value)) || (NIL == file_vector_utilities.file_vector_reference_deletedP(impl_value))) {
                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED);
                                        note_percent_progress(sofar, total);
                                        total = add(total, ONE_INTEGER);
                                        if (NIL != fort_types_interface.collection_p(v_term)) {
                                            SubLObject local_instances = ZERO_INTEGER;
                                            final SubLObject _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$isa) ? sbhl_module_vars.get_sbhl_module($$isa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$isa));
                                                if (NIL != d_link) {
                                                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject direction = NIL;
                                                    direction = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$isa));
                                                        if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)))) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                SubLObject iteration_state_$15;
                                                                for (iteration_state_$15 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$15); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next(iteration_state_$15)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$15);
                                                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                                                        final SubLObject sol = link_nodes_var;
                                                                        if (NIL != set.set_p(sol)) {
                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                            SubLObject basis_object;
                                                                            SubLObject state;
                                                                            SubLObject instance;
                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, instance)) {
                                                                                    local_instances = add(local_instances, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol.isList()) {
                                                                                SubLObject csome_list_var = sol;
                                                                                SubLObject instance2 = NIL;
                                                                                instance2 = csome_list_var.first();
                                                                                while (NIL != csome_list_var) {
                                                                                    local_instances = add(local_instances, ONE_INTEGER);
                                                                                    csome_list_var = csome_list_var.rest();
                                                                                    instance2 = csome_list_var.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                            }

                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$15);
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        direction = cdolist_list_var.first();
                                                    } 
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$12, thread);
                                            }
                                            if (local_instances.isPositive()) {
                                                count = add(count, ONE_INTEGER);
                                                set_local_instance_cardinality(v_term, local_instances);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list41);
                                }
                            }
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_1_$12, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$11, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
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
        return count;
    }

    public static final SubLObject initialize_collection_local_quoted_instance_cardinalities_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = $str_alt43$Calculating_collection_local_quot;
                SubLObject module = sbhl_module_vars.get_sbhl_module($$quotedIsa);
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject message_var = message;
                            SubLObject module_var = module;
                            SubLObject total = com.cyc.cycjava.cycl.cardinality_estimates.get_sbhl_module_size(module_var);
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_14 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_15 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message_var);
                                    {
                                        SubLObject _prev_bind_0_16 = $cfasl_common_symbols$.currentBinding(thread);
                                        try {
                                            $cfasl_common_symbols$.bind(NIL, thread);
                                            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                                            {
                                                SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                                                SubLObject link_var = NIL;
                                                SubLObject iterator = map_utilities.new_map_iterator(map);
                                                SubLObject done_var = NIL;
                                                while (NIL == done_var) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject var = iteration.iteration_next(iterator);
                                                        SubLObject valid = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject datum = var;
                                                                SubLObject current = datum;
                                                                SubLObject v_term = NIL;
                                                                SubLObject impl_value = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                v_term = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                impl_value = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (!((NIL != file_vector_utilities.file_vector_reference_p(impl_value)) && (NIL != file_vector_utilities.file_vector_reference_deletedP(impl_value)))) {
                                                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED);
                                                                        note_percent_progress(sofar, total);
                                                                        total = add(total, ONE_INTEGER);
                                                                        if (NIL != fort_types_interface.collection_p(v_term)) {
                                                                            {
                                                                                SubLObject local_quoted_instances = ZERO_INTEGER;
                                                                                {
                                                                                    SubLObject _prev_bind_0_17 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$quotedIsa) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$quotedIsa))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                                                            if (NIL != d_link) {
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                                                                    SubLObject direction = NIL;
                                                                                                    for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                                                                            if (NIL != mt_links) {
                                                                                                                if (direction == sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa))) {
                                                                                                                    {
                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                {
                                                                                                                                    SubLObject iteration_state_18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_18)) {
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        {
                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_18);
                                                                                                                                            SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                                                                                    SubLObject cdolist_list_var_19 = new_list;
                                                                                                                                                    SubLObject quoted_instance = NIL;
                                                                                                                                                    for (quoted_instance = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest() , quoted_instance = cdolist_list_var_19.first()) {
                                                                                                                                                        local_quoted_instances = add(local_quoted_instances, ONE_INTEGER);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            iteration_state_18 = dictionary_contents.do_dictionary_contents_next(iteration_state_18);
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_18);
                                                                                                                                }
                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_17, thread);
                                                                                    }
                                                                                }
                                                                                if (local_quoted_instances.isPositive()) {
                                                                                    count = add(count, ONE_INTEGER);
                                                                                    com.cyc.cycjava.cycl.cardinality_estimates.set_local_quoted_instance_cardinality(v_term, local_quoted_instances);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list_alt40);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            $cfasl_common_symbols$.rebind(_prev_bind_0_16, thread);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_15, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_14, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject initialize_collection_local_quoted_instance_cardinalities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $str45$Calculating_collection_local_quot;
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$quotedIsa);
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message_var = message;
            final SubLObject module_var = module;
            SubLObject total = get_sbhl_module_size(module_var);
            final SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$17 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$18 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    final SubLObject _prev_bind_0_$18 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$19 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
                        final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                        SubLObject link_var = NIL;
                        final SubLObject iterator = map_utilities.new_map_iterator(map);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject var = iteration.iteration_next(iterator);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                SubLObject current;
                                final SubLObject datum = current = var;
                                SubLObject v_term = NIL;
                                SubLObject impl_value = NIL;
                                destructuring_bind_must_consp(current, datum, $list41);
                                v_term = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list41);
                                impl_value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((NIL == file_vector_utilities.file_vector_reference_p(impl_value)) || (NIL == file_vector_utilities.file_vector_reference_deletedP(impl_value))) {
                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED);
                                        note_percent_progress(sofar, total);
                                        total = add(total, ONE_INTEGER);
                                        if (NIL != fort_types_interface.collection_p(v_term)) {
                                            SubLObject local_quoted_instances = ZERO_INTEGER;
                                            final SubLObject _prev_bind_0_$19 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$quotedIsa) ? sbhl_module_vars.get_sbhl_module($$quotedIsa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                if (NIL != d_link) {
                                                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                    SubLObject direction = NIL;
                                                    direction = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                        if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)))) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                SubLObject iteration_state_$22;
                                                                for (iteration_state_$22 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$22); iteration_state_$22 = dictionary_contents.do_dictionary_contents_next(iteration_state_$22)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$22);
                                                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                                                        final SubLObject sol = link_nodes_var;
                                                                        if (NIL != set.set_p(sol)) {
                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                            SubLObject basis_object;
                                                                            SubLObject state;
                                                                            SubLObject quoted_instance;
                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                quoted_instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, quoted_instance)) {
                                                                                    local_quoted_instances = add(local_quoted_instances, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol.isList()) {
                                                                                SubLObject csome_list_var = sol;
                                                                                SubLObject quoted_instance2 = NIL;
                                                                                quoted_instance2 = csome_list_var.first();
                                                                                while (NIL != csome_list_var) {
                                                                                    local_quoted_instances = add(local_quoted_instances, ONE_INTEGER);
                                                                                    csome_list_var = csome_list_var.rest();
                                                                                    quoted_instance2 = csome_list_var.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                            }

                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$22);
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        direction = cdolist_list_var.first();
                                                    } 
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$19, thread);
                                            }
                                            if (local_quoted_instances.isPositive()) {
                                                count = add(count, ONE_INTEGER);
                                                set_local_quoted_instance_cardinality(v_term, local_quoted_instances);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list41);
                                }
                            }
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_1_$19, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$18, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$18, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$17, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject initialize_predicate_local_spec_cardinalities_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = $str_alt45$Calculating_predicate_local_spec_;
                SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject message_var = message;
                            SubLObject module_var = module;
                            SubLObject total = com.cyc.cycjava.cycl.cardinality_estimates.get_sbhl_module_size(module_var);
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_20 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_21 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message_var);
                                    {
                                        SubLObject _prev_bind_0_22 = $cfasl_common_symbols$.currentBinding(thread);
                                        try {
                                            $cfasl_common_symbols$.bind(NIL, thread);
                                            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                                            {
                                                SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                                                SubLObject link_var = NIL;
                                                SubLObject iterator = map_utilities.new_map_iterator(map);
                                                SubLObject done_var = NIL;
                                                while (NIL == done_var) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject var = iteration.iteration_next(iterator);
                                                        SubLObject valid = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject datum = var;
                                                                SubLObject current = datum;
                                                                SubLObject v_term = NIL;
                                                                SubLObject impl_value = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                v_term = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                impl_value = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (!((NIL != file_vector_utilities.file_vector_reference_p(impl_value)) && (NIL != file_vector_utilities.file_vector_reference_deletedP(impl_value)))) {
                                                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED);
                                                                        note_percent_progress(sofar, total);
                                                                        total = add(total, ONE_INTEGER);
                                                                        if (NIL != fort_types_interface.predicate_p(v_term)) {
                                                                            count = add(count, ONE_INTEGER);
                                                                            {
                                                                                SubLObject local_specs = ZERO_INTEGER;
                                                                                {
                                                                                    SubLObject _prev_bind_0_23 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlPreds) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genlPreds))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                            if (NIL != d_link) {
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                                    SubLObject direction = NIL;
                                                                                                    for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                                            if (NIL != mt_links) {
                                                                                                                if (direction == sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds))) {
                                                                                                                    {
                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                {
                                                                                                                                    SubLObject iteration_state_24 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_24)) {
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        {
                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_24);
                                                                                                                                            SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                                                                                    SubLObject cdolist_list_var_25 = new_list;
                                                                                                                                                    SubLObject spec_pred = NIL;
                                                                                                                                                    for (spec_pred = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , spec_pred = cdolist_list_var_25.first()) {
                                                                                                                                                        local_specs = add(local_specs, ONE_INTEGER);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            iteration_state_24 = dictionary_contents.do_dictionary_contents_next(iteration_state_24);
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_24);
                                                                                                                                }
                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_23, thread);
                                                                                    }
                                                                                }
                                                                                com.cyc.cycjava.cycl.cardinality_estimates.set_local_spec_cardinality(v_term, local_specs);
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list_alt40);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            $cfasl_common_symbols$.rebind(_prev_bind_0_22, thread);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_21, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_20, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject initialize_predicate_local_spec_cardinalities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $str47$Calculating_predicate_local_spec_;
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message_var = message;
            final SubLObject module_var = module;
            SubLObject total = get_sbhl_module_size(module_var);
            final SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$24 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$25 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    final SubLObject _prev_bind_0_$25 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$26 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
                        final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                        SubLObject link_var = NIL;
                        final SubLObject iterator = map_utilities.new_map_iterator(map);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject var = iteration.iteration_next(iterator);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                SubLObject current;
                                final SubLObject datum = current = var;
                                SubLObject v_term = NIL;
                                SubLObject impl_value = NIL;
                                destructuring_bind_must_consp(current, datum, $list41);
                                v_term = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list41);
                                impl_value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((NIL == file_vector_utilities.file_vector_reference_p(impl_value)) || (NIL == file_vector_utilities.file_vector_reference_deletedP(impl_value))) {
                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED);
                                        note_percent_progress(sofar, total);
                                        total = add(total, ONE_INTEGER);
                                        if (NIL != fort_types_interface.predicate_p(v_term)) {
                                            count = add(count, ONE_INTEGER);
                                            SubLObject local_specs = ZERO_INTEGER;
                                            final SubLObject _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlPreds) ? sbhl_module_vars.get_sbhl_module($$genlPreds) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                if (NIL != d_link) {
                                                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                    SubLObject direction = NIL;
                                                    direction = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                        if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)))) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                SubLObject iteration_state_$29;
                                                                for (iteration_state_$29 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$29); iteration_state_$29 = dictionary_contents.do_dictionary_contents_next(iteration_state_$29)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$29);
                                                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                                                        final SubLObject sol = link_nodes_var;
                                                                        if (NIL != set.set_p(sol)) {
                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                            SubLObject basis_object;
                                                                            SubLObject state;
                                                                            SubLObject spec_pred;
                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                spec_pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, spec_pred)) {
                                                                                    local_specs = add(local_specs, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol.isList()) {
                                                                                SubLObject csome_list_var = sol;
                                                                                SubLObject spec_pred2 = NIL;
                                                                                spec_pred2 = csome_list_var.first();
                                                                                while (NIL != csome_list_var) {
                                                                                    local_specs = add(local_specs, ONE_INTEGER);
                                                                                    csome_list_var = csome_list_var.rest();
                                                                                    spec_pred2 = csome_list_var.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                            }

                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$29);
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        direction = cdolist_list_var.first();
                                                    } 
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$26, thread);
                                            }
                                            set_local_spec_cardinality(v_term, local_specs);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list41);
                                }
                            }
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_1_$26, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$25, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$25, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$24, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject initialize_microtheory_local_spec_cardinalities_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = $str_alt47$Calculating_microtheory_local_spe;
                SubLObject module = sbhl_module_vars.get_sbhl_module($$genlMt);
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject message_var = message;
                            SubLObject module_var = module;
                            SubLObject total = com.cyc.cycjava.cycl.cardinality_estimates.get_sbhl_module_size(module_var);
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_26 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_27 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message_var);
                                    {
                                        SubLObject _prev_bind_0_28 = $cfasl_common_symbols$.currentBinding(thread);
                                        try {
                                            $cfasl_common_symbols$.bind(NIL, thread);
                                            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                                            {
                                                SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                                                SubLObject link_var = NIL;
                                                SubLObject iterator = map_utilities.new_map_iterator(map);
                                                SubLObject done_var = NIL;
                                                while (NIL == done_var) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject var = iteration.iteration_next(iterator);
                                                        SubLObject valid = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject datum = var;
                                                                SubLObject current = datum;
                                                                SubLObject v_term = NIL;
                                                                SubLObject impl_value = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                v_term = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                impl_value = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (!((NIL != file_vector_utilities.file_vector_reference_p(impl_value)) && (NIL != file_vector_utilities.file_vector_reference_deletedP(impl_value)))) {
                                                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED);
                                                                        note_percent_progress(sofar, total);
                                                                        total = add(total, ONE_INTEGER);
                                                                        if (NIL != fort_types_interface.microtheory_p(v_term)) {
                                                                            count = add(count, ONE_INTEGER);
                                                                            {
                                                                                SubLObject local_specs = ZERO_INTEGER;
                                                                                {
                                                                                    SubLObject _prev_bind_0_29 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlMt) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genlMt))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$genlMt));
                                                                                            if (NIL != d_link) {
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genlMt));
                                                                                                    SubLObject direction = NIL;
                                                                                                    for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genlMt));
                                                                                                            if (NIL != mt_links) {
                                                                                                                if (direction == sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlMt))) {
                                                                                                                    {
                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                {
                                                                                                                                    SubLObject iteration_state_30 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_30)) {
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        {
                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_30);
                                                                                                                                            SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                                                                                    SubLObject cdolist_list_var_31 = new_list;
                                                                                                                                                    SubLObject spec = NIL;
                                                                                                                                                    for (spec = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , spec = cdolist_list_var_31.first()) {
                                                                                                                                                        local_specs = add(local_specs, ONE_INTEGER);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            iteration_state_30 = dictionary_contents.do_dictionary_contents_next(iteration_state_30);
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_30);
                                                                                                                                }
                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_29, thread);
                                                                                    }
                                                                                }
                                                                                com.cyc.cycjava.cycl.cardinality_estimates.set_local_spec_cardinality(v_term, local_specs);
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list_alt40);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            $cfasl_common_symbols$.rebind(_prev_bind_0_28, thread);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_27, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_26, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject initialize_microtheory_local_spec_cardinalities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $str49$Calculating_microtheory_local_spe;
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlMt);
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message_var = message;
            final SubLObject module_var = module;
            SubLObject total = get_sbhl_module_size(module_var);
            final SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$31 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$32 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    final SubLObject _prev_bind_0_$32 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$33 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
                        final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                        SubLObject link_var = NIL;
                        final SubLObject iterator = map_utilities.new_map_iterator(map);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject var = iteration.iteration_next(iterator);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                SubLObject current;
                                final SubLObject datum = current = var;
                                SubLObject v_term = NIL;
                                SubLObject impl_value = NIL;
                                destructuring_bind_must_consp(current, datum, $list41);
                                v_term = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list41);
                                impl_value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((NIL == file_vector_utilities.file_vector_reference_p(impl_value)) || (NIL == file_vector_utilities.file_vector_reference_deletedP(impl_value))) {
                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, v_term, UNPROVIDED);
                                        note_percent_progress(sofar, total);
                                        total = add(total, ONE_INTEGER);
                                        if (NIL != fort_types_interface.microtheory_p(v_term)) {
                                            count = add(count, ONE_INTEGER);
                                            SubLObject local_specs = ZERO_INTEGER;
                                            final SubLObject _prev_bind_0_$33 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlMt) ? sbhl_module_vars.get_sbhl_module($$genlMt) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$genlMt));
                                                if (NIL != d_link) {
                                                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genlMt));
                                                    SubLObject direction = NIL;
                                                    direction = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genlMt));
                                                        if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlMt)))) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                SubLObject iteration_state_$36;
                                                                for (iteration_state_$36 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$36); iteration_state_$36 = dictionary_contents.do_dictionary_contents_next(iteration_state_$36)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$36);
                                                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                                                        final SubLObject sol = link_nodes_var;
                                                                        if (NIL != set.set_p(sol)) {
                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                            SubLObject basis_object;
                                                                            SubLObject state;
                                                                            SubLObject spec;
                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                spec = set_contents.do_set_contents_next(basis_object, state);
                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, spec)) {
                                                                                    local_specs = add(local_specs, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol.isList()) {
                                                                                SubLObject csome_list_var = sol;
                                                                                SubLObject spec2 = NIL;
                                                                                spec2 = csome_list_var.first();
                                                                                while (NIL != csome_list_var) {
                                                                                    local_specs = add(local_specs, ONE_INTEGER);
                                                                                    csome_list_var = csome_list_var.rest();
                                                                                    spec2 = csome_list_var.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                            }

                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$36);
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        direction = cdolist_list_var.first();
                                                    } 
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$33, thread);
                                            }
                                            set_local_spec_cardinality(v_term, local_specs);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list41);
                                }
                            }
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_1_$33, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$32, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$32, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$31, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject initialize_other_local_instance_cardinalities_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = $str_alt49$Calculating_other_local_instance_;
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject message_32 = message;
                            SubLObject total = fort_count();
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_33 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_34 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message_32);
                                    {
                                        SubLObject cdolist_list_var = do_forts_tables();
                                        SubLObject table_var = NIL;
                                        for (table_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_var = cdolist_list_var.first()) {
                                            if (NIL == do_id_index_empty_p(table_var, $SKIP)) {
                                                {
                                                    SubLObject id = do_id_index_next_id(table_var, T, NIL, NIL);
                                                    SubLObject state_var = do_id_index_next_state(table_var, T, id, NIL);
                                                    SubLObject v_term = NIL;
                                                    while (NIL != id) {
                                                        v_term = do_id_index_state_object(table_var, $SKIP, id, state_var);
                                                        if (NIL != do_id_index_id_and_object_validP(id, v_term, $SKIP)) {
                                                            sofar = add(sofar, ONE_INTEGER);
                                                            note_percent_progress(sofar, total);
                                                            {
                                                                SubLObject uses = ZERO_INTEGER;
                                                                if (NIL != fort_types_interface.predicate_p(v_term)) {
                                                                    uses = kb_indexing.num_predicate_extent_index(v_term, UNPROVIDED);
                                                                } else {
                                                                    if (NIL != fort_types_interface.microtheory_p(v_term)) {
                                                                        uses = kb_indexing.num_mt_index(v_term);
                                                                    } else {
                                                                        if (NIL != fort_types_interface.functionP(v_term)) {
                                                                            uses = kb_indexing.num_function_extent_index(v_term);
                                                                        }
                                                                    }
                                                                }
                                                                if (uses.numG(ZERO_INTEGER)) {
                                                                    count = add(count, ONE_INTEGER);
                                                                    com.cyc.cycjava.cycl.cardinality_estimates.set_local_instance_cardinality(v_term, uses);
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
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_34, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_33, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject initialize_other_local_instance_cardinalities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $str51$Calculating_other_local_instance_;
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message_$38 = message;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$39 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$40 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_$38);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = NIL;
                    table_var = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                            final SubLObject idx_$41 = idx;
                            if (NIL == id_index_dense_objects_empty_p(idx_$41, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$41);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject v_term;
                                SubLObject uses;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    v_term = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(v_term)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(v_term)) {
                                            v_term = $SKIP;
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        uses = ZERO_INTEGER;
                                        if (NIL != fort_types_interface.predicate_p(v_term)) {
                                            uses = kb_indexing.num_predicate_extent_index(v_term, UNPROVIDED);
                                        } else
                                            if (NIL != fort_types_interface.microtheory_p(v_term)) {
                                                uses = kb_indexing.num_mt_index(v_term);
                                            } else
                                                if (NIL != fort_types_interface.functionP(v_term)) {
                                                    uses = kb_indexing.num_function_extent_index(v_term);
                                                }


                                        if (uses.numG(ZERO_INTEGER)) {
                                            count = add(count, ONE_INTEGER);
                                            set_local_instance_cardinality(v_term, uses);
                                        }
                                    }
                                }
                            }
                            final SubLObject idx_$42 = idx;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$42)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$42);
                                SubLObject id2 = id_index_sparse_id_threshold(idx_$42);
                                final SubLObject end_id = id_index_next_id(idx_$42);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (id2.numL(end_id)) {
                                    final SubLObject v_term2 = gethash_without_values(id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_term2))) {
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        SubLObject uses2 = ZERO_INTEGER;
                                        if (NIL != fort_types_interface.predicate_p(v_term2)) {
                                            uses2 = kb_indexing.num_predicate_extent_index(v_term2, UNPROVIDED);
                                        } else
                                            if (NIL != fort_types_interface.microtheory_p(v_term2)) {
                                                uses2 = kb_indexing.num_mt_index(v_term2);
                                            } else
                                                if (NIL != fort_types_interface.functionP(v_term2)) {
                                                    uses2 = kb_indexing.num_function_extent_index(v_term2);
                                                }


                                        if (uses2.numG(ZERO_INTEGER)) {
                                            count = add(count, ONE_INTEGER);
                                            set_local_instance_cardinality(v_term2, uses2);
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
                    final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$40, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$39, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject clear_total_cardinalities_alt() {
        clrhash($total_instance_cardinality$.getGlobalValue());
        clrhash($total_quoted_instance_cardinality$.getGlobalValue());
        clrhash($total_spec_cardinality$.getGlobalValue());
        clrhash($total_genl_cardinality$.getGlobalValue());
        return NIL;
    }

    public static SubLObject clear_total_cardinalities() {
        clrhash($total_instance_cardinality$.getGlobalValue());
        clrhash($total_quoted_instance_cardinality$.getGlobalValue());
        clrhash($total_spec_cardinality$.getGlobalValue());
        clrhash($total_genl_cardinality$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject initialize_total_cardinalities_alt() {
        com.cyc.cycjava.cycl.cardinality_estimates.clear_total_cardinalities();
        com.cyc.cycjava.cycl.cardinality_estimates.initialize_collection_total_cardinalities();
        com.cyc.cycjava.cycl.cardinality_estimates.initialize_predicate_total_cardinalities();
        com.cyc.cycjava.cycl.cardinality_estimates.initialize_microtheory_total_cardinalities();
        return NIL;
    }

    public static SubLObject initialize_total_cardinalities() {
        clear_total_cardinalities();
        initialize_collection_total_cardinalities();
        initialize_predicate_total_cardinalities();
        initialize_microtheory_total_cardinalities();
        return NIL;
    }

    public static final SubLObject initialize_collection_total_cardinalities_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = $str_alt51$Calculating_collection_total_card;
                SubLObject module = sbhl_module_vars.get_sbhl_module($$genls);
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject message_var = message;
                            SubLObject module_var = module;
                            SubLObject total = com.cyc.cycjava.cycl.cardinality_estimates.get_sbhl_module_size(module_var);
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_35 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_36 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message_var);
                                    {
                                        SubLObject _prev_bind_0_37 = $cfasl_common_symbols$.currentBinding(thread);
                                        try {
                                            $cfasl_common_symbols$.bind(NIL, thread);
                                            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                                            {
                                                SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                                                SubLObject link_var = NIL;
                                                SubLObject iterator = map_utilities.new_map_iterator(map);
                                                SubLObject done_var = NIL;
                                                while (NIL == done_var) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject var = iteration.iteration_next(iterator);
                                                        SubLObject valid = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject datum = var;
                                                                SubLObject current = datum;
                                                                SubLObject col = NIL;
                                                                SubLObject impl_value = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list_alt52);
                                                                col = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list_alt52);
                                                                impl_value = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (!((NIL != file_vector_utilities.file_vector_reference_p(impl_value)) && (NIL != file_vector_utilities.file_vector_reference_deletedP(impl_value)))) {
                                                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, col, UNPROVIDED);
                                                                        note_percent_progress(sofar, total);
                                                                        total = add(total, ONE_INTEGER);
                                                                        if (NIL != fort_types_interface.collection_p(col)) {
                                                                            count = add(count, ONE_INTEGER);
                                                                            {
                                                                                SubLObject v_genls = sbhl_search_methods.sbhl_all_forward_true_nodes(module, col, UNPROVIDED, UNPROVIDED);
                                                                                SubLObject genl_count = length(v_genls);
                                                                                com.cyc.cycjava.cycl.cardinality_estimates.set_total_genl_cardinality(col, genl_count);
                                                                                {
                                                                                    SubLObject local_spec_count = com.cyc.cycjava.cycl.cardinality_estimates.local_spec_cardinality(col);
                                                                                    if (!local_spec_count.isZero()) {
                                                                                        {
                                                                                            SubLObject cdolist_list_var = v_genls;
                                                                                            SubLObject genl = NIL;
                                                                                            for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                                                                                com.cyc.cycjava.cycl.cardinality_estimates.increment_total_spec_cardinality(genl, local_spec_count);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    com.cyc.cycjava.cycl.cardinality_estimates.increment_total_spec_cardinality(col, ONE_INTEGER);
                                                                                }
                                                                                {
                                                                                    SubLObject local_instance_count = com.cyc.cycjava.cycl.cardinality_estimates.local_instance_cardinality(col);
                                                                                    if (!local_instance_count.isZero()) {
                                                                                        {
                                                                                            SubLObject cdolist_list_var = v_genls;
                                                                                            SubLObject genl = NIL;
                                                                                            for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                                                                                com.cyc.cycjava.cycl.cardinality_estimates.increment_total_instance_cardinality(genl, local_instance_count);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject local_quoted_instance_count = com.cyc.cycjava.cycl.cardinality_estimates.local_quoted_instance_cardinality(col);
                                                                                    if (!local_quoted_instance_count.isZero()) {
                                                                                        {
                                                                                            SubLObject cdolist_list_var = v_genls;
                                                                                            SubLObject genl = NIL;
                                                                                            for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                                                                                com.cyc.cycjava.cycl.cardinality_estimates.increment_total_quoted_instance_cardinality(genl, local_quoted_instance_count);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list_alt52);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            $cfasl_common_symbols$.rebind(_prev_bind_0_37, thread);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_36, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_35, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject initialize_collection_total_cardinalities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $str53$Calculating_collection_total_card;
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$genls);
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message_var = message;
            final SubLObject module_var = module;
            SubLObject total = get_sbhl_module_size(module_var);
            final SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$44 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$45 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    final SubLObject _prev_bind_0_$45 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$46 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
                        final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                        SubLObject link_var = NIL;
                        final SubLObject iterator = map_utilities.new_map_iterator(map);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject var = iteration.iteration_next(iterator);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                SubLObject current;
                                final SubLObject datum = current = var;
                                SubLObject col = NIL;
                                SubLObject impl_value = NIL;
                                destructuring_bind_must_consp(current, datum, $list54);
                                col = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list54);
                                impl_value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((NIL == file_vector_utilities.file_vector_reference_p(impl_value)) || (NIL == file_vector_utilities.file_vector_reference_deletedP(impl_value))) {
                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, col, UNPROVIDED);
                                        note_percent_progress(sofar, total);
                                        total = add(total, ONE_INTEGER);
                                        if (NIL != fort_types_interface.collection_p(col)) {
                                            count = add(count, ONE_INTEGER);
                                            final SubLObject v_genls = sbhl_search_methods.sbhl_all_forward_true_nodes(module, col, UNPROVIDED, UNPROVIDED);
                                            final SubLObject genl_count = length(v_genls);
                                            set_total_genl_cardinality(col, genl_count);
                                            final SubLObject local_spec_count = local_spec_cardinality(col);
                                            if (!local_spec_count.isZero()) {
                                                SubLObject cdolist_list_var = v_genls;
                                                SubLObject genl = NIL;
                                                genl = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    increment_total_spec_cardinality(genl, local_spec_count);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    genl = cdolist_list_var.first();
                                                } 
                                            }
                                            increment_total_spec_cardinality(col, ONE_INTEGER);
                                            final SubLObject local_instance_count = local_instance_cardinality(col);
                                            if (!local_instance_count.isZero()) {
                                                SubLObject cdolist_list_var = v_genls;
                                                SubLObject genl = NIL;
                                                genl = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    increment_total_instance_cardinality(genl, local_instance_count);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    genl = cdolist_list_var.first();
                                                } 
                                            }
                                            final SubLObject local_quoted_instance_count = local_quoted_instance_cardinality(col);
                                            if (!local_quoted_instance_count.isZero()) {
                                                SubLObject cdolist_list_var = v_genls;
                                                SubLObject genl = NIL;
                                                genl = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    increment_total_quoted_instance_cardinality(genl, local_quoted_instance_count);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    genl = cdolist_list_var.first();
                                                } 
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list54);
                                }
                            }
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_1_$46, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$45, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$45, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$44, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject initialize_predicate_total_cardinalities_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = $str_alt53$Calculating_predicate_total_cardi;
                SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject message_var = message;
                            SubLObject module_var = module;
                            SubLObject total = com.cyc.cycjava.cycl.cardinality_estimates.get_sbhl_module_size(module_var);
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_38 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_39 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message_var);
                                    {
                                        SubLObject _prev_bind_0_40 = $cfasl_common_symbols$.currentBinding(thread);
                                        try {
                                            $cfasl_common_symbols$.bind(NIL, thread);
                                            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                                            {
                                                SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                                                SubLObject link_var = NIL;
                                                SubLObject iterator = map_utilities.new_map_iterator(map);
                                                SubLObject done_var = NIL;
                                                while (NIL == done_var) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject var = iteration.iteration_next(iterator);
                                                        SubLObject valid = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject datum = var;
                                                                SubLObject current = datum;
                                                                SubLObject predicate = NIL;
                                                                SubLObject impl_value = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list_alt54);
                                                                predicate = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list_alt54);
                                                                impl_value = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (!((NIL != file_vector_utilities.file_vector_reference_p(impl_value)) && (NIL != file_vector_utilities.file_vector_reference_deletedP(impl_value)))) {
                                                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, predicate, UNPROVIDED);
                                                                        note_percent_progress(sofar, total);
                                                                        total = add(total, ONE_INTEGER);
                                                                        if (NIL != fort_types_interface.predicate_p(predicate)) {
                                                                            count = add(count, ONE_INTEGER);
                                                                            {
                                                                                SubLObject v_genl_predicates = sbhl_search_methods.sbhl_all_forward_true_nodes(module, predicate, UNPROVIDED, UNPROVIDED);
                                                                                SubLObject genl_count = length(v_genl_predicates);
                                                                                com.cyc.cycjava.cycl.cardinality_estimates.set_total_genl_cardinality(predicate, genl_count);
                                                                                {
                                                                                    SubLObject local_spec_count = com.cyc.cycjava.cycl.cardinality_estimates.local_spec_cardinality(predicate);
                                                                                    if (!local_spec_count.isZero()) {
                                                                                        {
                                                                                            SubLObject cdolist_list_var = v_genl_predicates;
                                                                                            SubLObject genl_predicate = NIL;
                                                                                            for (genl_predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_predicate = cdolist_list_var.first()) {
                                                                                                com.cyc.cycjava.cycl.cardinality_estimates.increment_total_spec_cardinality(genl_predicate, local_spec_count);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    com.cyc.cycjava.cycl.cardinality_estimates.increment_total_spec_cardinality(predicate, ONE_INTEGER);
                                                                                }
                                                                                {
                                                                                    SubLObject local_instance_count = com.cyc.cycjava.cycl.cardinality_estimates.local_instance_cardinality(predicate);
                                                                                    if (!local_instance_count.isZero()) {
                                                                                        {
                                                                                            SubLObject cdolist_list_var = v_genl_predicates;
                                                                                            SubLObject genl_predicate = NIL;
                                                                                            for (genl_predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_predicate = cdolist_list_var.first()) {
                                                                                                com.cyc.cycjava.cycl.cardinality_estimates.increment_total_instance_cardinality(genl_predicate, local_instance_count);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list_alt54);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            $cfasl_common_symbols$.rebind(_prev_bind_0_40, thread);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_39, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_38, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject initialize_predicate_total_cardinalities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $str55$Calculating_predicate_total_cardi;
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message_var = message;
            final SubLObject module_var = module;
            SubLObject total = get_sbhl_module_size(module_var);
            final SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$49 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$50 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    final SubLObject _prev_bind_0_$50 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$51 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
                        final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                        SubLObject link_var = NIL;
                        final SubLObject iterator = map_utilities.new_map_iterator(map);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject var = iteration.iteration_next(iterator);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                SubLObject current;
                                final SubLObject datum = current = var;
                                SubLObject predicate = NIL;
                                SubLObject impl_value = NIL;
                                destructuring_bind_must_consp(current, datum, $list56);
                                predicate = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list56);
                                impl_value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((NIL == file_vector_utilities.file_vector_reference_p(impl_value)) || (NIL == file_vector_utilities.file_vector_reference_deletedP(impl_value))) {
                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, predicate, UNPROVIDED);
                                        note_percent_progress(sofar, total);
                                        total = add(total, ONE_INTEGER);
                                        if (NIL != fort_types_interface.predicate_p(predicate)) {
                                            count = add(count, ONE_INTEGER);
                                            final SubLObject v_genl_predicates = sbhl_search_methods.sbhl_all_forward_true_nodes(module, predicate, UNPROVIDED, UNPROVIDED);
                                            final SubLObject genl_count = length(v_genl_predicates);
                                            set_total_genl_cardinality(predicate, genl_count);
                                            final SubLObject local_spec_count = local_spec_cardinality(predicate);
                                            if (!local_spec_count.isZero()) {
                                                SubLObject cdolist_list_var = v_genl_predicates;
                                                SubLObject genl_predicate = NIL;
                                                genl_predicate = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    increment_total_spec_cardinality(genl_predicate, local_spec_count);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    genl_predicate = cdolist_list_var.first();
                                                } 
                                            }
                                            increment_total_spec_cardinality(predicate, ONE_INTEGER);
                                            final SubLObject local_instance_count = local_instance_cardinality(predicate);
                                            if (!local_instance_count.isZero()) {
                                                SubLObject cdolist_list_var = v_genl_predicates;
                                                SubLObject genl_predicate = NIL;
                                                genl_predicate = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    increment_total_instance_cardinality(genl_predicate, local_instance_count);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    genl_predicate = cdolist_list_var.first();
                                                } 
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list56);
                                }
                            }
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_1_$51, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$50, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$50, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$49, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject initialize_microtheory_total_cardinalities_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = $str_alt55$Calculating_microtheory_total_car;
                SubLObject module = sbhl_module_vars.get_sbhl_module($$genlMt);
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject message_var = message;
                            SubLObject module_var = module;
                            SubLObject total = com.cyc.cycjava.cycl.cardinality_estimates.get_sbhl_module_size(module_var);
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_41 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_42 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message_var);
                                    {
                                        SubLObject _prev_bind_0_43 = $cfasl_common_symbols$.currentBinding(thread);
                                        try {
                                            $cfasl_common_symbols$.bind(NIL, thread);
                                            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                                            {
                                                SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                                                SubLObject link_var = NIL;
                                                SubLObject iterator = map_utilities.new_map_iterator(map);
                                                SubLObject done_var = NIL;
                                                while (NIL == done_var) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject var = iteration.iteration_next(iterator);
                                                        SubLObject valid = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject datum = var;
                                                                SubLObject current = datum;
                                                                SubLObject mt = NIL;
                                                                SubLObject impl_value = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list_alt56);
                                                                mt = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list_alt56);
                                                                impl_value = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (!((NIL != file_vector_utilities.file_vector_reference_p(impl_value)) && (NIL != file_vector_utilities.file_vector_reference_deletedP(impl_value)))) {
                                                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, mt, UNPROVIDED);
                                                                        note_percent_progress(sofar, total);
                                                                        total = add(total, ONE_INTEGER);
                                                                        if (NIL != fort_types_interface.microtheory_p(mt)) {
                                                                            count = add(count, ONE_INTEGER);
                                                                            {
                                                                                SubLObject v_genl_mts = sbhl_search_methods.sbhl_all_forward_true_nodes(module, mt, UNPROVIDED, UNPROVIDED);
                                                                                SubLObject genl_count = length(v_genl_mts);
                                                                                com.cyc.cycjava.cycl.cardinality_estimates.set_total_genl_cardinality(mt, genl_count);
                                                                                {
                                                                                    SubLObject local_spec_count = com.cyc.cycjava.cycl.cardinality_estimates.local_spec_cardinality(mt);
                                                                                    if (!local_spec_count.isZero()) {
                                                                                        {
                                                                                            SubLObject cdolist_list_var = v_genl_mts;
                                                                                            SubLObject genl_mt = NIL;
                                                                                            for (genl_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_mt = cdolist_list_var.first()) {
                                                                                                com.cyc.cycjava.cycl.cardinality_estimates.increment_total_spec_cardinality(genl_mt, local_spec_count);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    com.cyc.cycjava.cycl.cardinality_estimates.increment_total_spec_cardinality(mt, ONE_INTEGER);
                                                                                }
                                                                                {
                                                                                    SubLObject local_instance_count = com.cyc.cycjava.cycl.cardinality_estimates.local_instance_cardinality(mt);
                                                                                    if (!local_instance_count.isZero()) {
                                                                                        {
                                                                                            SubLObject cdolist_list_var = v_genl_mts;
                                                                                            SubLObject genl_mt = NIL;
                                                                                            for (genl_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_mt = cdolist_list_var.first()) {
                                                                                                com.cyc.cycjava.cycl.cardinality_estimates.increment_total_instance_cardinality(genl_mt, local_instance_count);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list_alt56);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            $cfasl_common_symbols$.rebind(_prev_bind_0_43, thread);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_42, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_41, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject initialize_microtheory_total_cardinalities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $str57$Calculating_microtheory_total_car;
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlMt);
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message_var = message;
            final SubLObject module_var = module;
            SubLObject total = get_sbhl_module_size(module_var);
            final SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$54 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$55 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    final SubLObject _prev_bind_0_$55 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$56 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
                        final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module_var);
                        SubLObject link_var = NIL;
                        final SubLObject iterator = map_utilities.new_map_iterator(map);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject var = iteration.iteration_next(iterator);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                SubLObject current;
                                final SubLObject datum = current = var;
                                SubLObject mt = NIL;
                                SubLObject impl_value = NIL;
                                destructuring_bind_must_consp(current, datum, $list58);
                                mt = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list58);
                                impl_value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((NIL == file_vector_utilities.file_vector_reference_p(impl_value)) || (NIL == file_vector_utilities.file_vector_reference_deletedP(impl_value))) {
                                        link_var = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, mt, UNPROVIDED);
                                        note_percent_progress(sofar, total);
                                        total = add(total, ONE_INTEGER);
                                        if (NIL != fort_types_interface.microtheory_p(mt)) {
                                            count = add(count, ONE_INTEGER);
                                            final SubLObject v_genl_mts = sbhl_search_methods.sbhl_all_forward_true_nodes(module, mt, UNPROVIDED, UNPROVIDED);
                                            final SubLObject genl_count = length(v_genl_mts);
                                            set_total_genl_cardinality(mt, genl_count);
                                            final SubLObject local_spec_count = local_spec_cardinality(mt);
                                            if (!local_spec_count.isZero()) {
                                                SubLObject cdolist_list_var = v_genl_mts;
                                                SubLObject genl_mt = NIL;
                                                genl_mt = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    increment_total_spec_cardinality(genl_mt, local_spec_count);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    genl_mt = cdolist_list_var.first();
                                                } 
                                            }
                                            increment_total_spec_cardinality(mt, ONE_INTEGER);
                                            final SubLObject local_instance_count = local_instance_cardinality(mt);
                                            if (!local_instance_count.isZero()) {
                                                SubLObject cdolist_list_var = v_genl_mts;
                                                SubLObject genl_mt = NIL;
                                                genl_mt = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    increment_total_instance_cardinality(genl_mt, local_instance_count);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    genl_mt = cdolist_list_var.first();
                                                } 
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list58);
                                }
                            }
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_1_$56, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$55, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$55, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$54, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject clear_generality_estimates_alt() {
        clrhash($generality_estimate_table$.getGlobalValue());
        return NIL;
    }

    public static SubLObject clear_generality_estimates() {
        clrhash($generality_estimate_table$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject initialize_generality_estimates_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.cardinality_estimates.clear_generality_estimates();
            {
                SubLObject table_var = $total_genl_cardinality$.getGlobalValue();
                $progress_note$.setDynamicValue($$$Calculating_generality_estimates, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject v_term = NIL;
                            SubLObject genl_count = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        v_term = getEntryKey(cdohash_entry);
                                        genl_count = getEntryValue(cdohash_entry);
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        com.cyc.cycjava.cycl.cardinality_estimates.update_generality_estimate(v_term);
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
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
            return NIL;
        }
    }

    public static SubLObject initialize_generality_estimates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_generality_estimates();
        final SubLObject table_var = $total_genl_cardinality$.getGlobalValue();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Calculating_generality_estimates, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(hash_table_count(table_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject v_term = NIL;
                SubLObject genl_count = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        v_term = getEntryKey(cdohash_entry);
                        genl_count = getEntryValue(cdohash_entry);
                        update_generality_estimate(v_term);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject dump_cardinality_estimates_to_stream_alt(SubLObject stream) {
        cfasl_output($local_instance_cardinality$.getGlobalValue(), stream);
        cfasl_output($local_quoted_instance_cardinality$.getGlobalValue(), stream);
        cfasl_output($local_spec_cardinality$.getGlobalValue(), stream);
        cfasl_output($total_instance_cardinality$.getGlobalValue(), stream);
        cfasl_output($total_quoted_instance_cardinality$.getGlobalValue(), stream);
        cfasl_output($total_spec_cardinality$.getGlobalValue(), stream);
        cfasl_output($total_genl_cardinality$.getGlobalValue(), stream);
        cfasl_output($generality_estimate_table$.getGlobalValue(), stream);
        return NIL;
    }

    public static SubLObject dump_cardinality_estimates_to_stream(final SubLObject stream) {
        cfasl_output($local_instance_cardinality$.getGlobalValue(), stream);
        cfasl_output($local_quoted_instance_cardinality$.getGlobalValue(), stream);
        cfasl_output($local_spec_cardinality$.getGlobalValue(), stream);
        cfasl_output($total_instance_cardinality$.getGlobalValue(), stream);
        cfasl_output($total_quoted_instance_cardinality$.getGlobalValue(), stream);
        cfasl_output($total_spec_cardinality$.getGlobalValue(), stream);
        cfasl_output($total_genl_cardinality$.getGlobalValue(), stream);
        cfasl_output($generality_estimate_table$.getGlobalValue(), stream);
        return NIL;
    }

    public static final SubLObject load_cardinality_estimates_from_stream_alt(SubLObject stream) {
        $local_instance_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $local_quoted_instance_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $local_spec_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $total_instance_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $total_quoted_instance_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $total_spec_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $total_genl_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $generality_estimate_table$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject load_cardinality_estimates_from_stream(final SubLObject stream) {
        $local_instance_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $local_quoted_instance_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $local_spec_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $total_instance_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $total_quoted_instance_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $total_spec_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $total_genl_cardinality$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $generality_estimate_table$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Conservatively update the cardinality estimates of SPEC and GENL due to a new
     * link between them.
     */
    @LispMethod(comment = "Conservatively update the cardinality estimates of SPEC and GENL due to a new\r\nlink between them.\nConservatively update the cardinality estimates of SPEC and GENL due to a new\nlink between them.")
    public static final SubLObject update_cardinality_estimates_wrt_genls_alt(SubLObject spec, SubLObject genl) {
        SubLTrampolineFile.checkType(spec, FORT_OR_CHLMT_P);
        SubLTrampolineFile.checkType(genl, FORT_OR_CHLMT_P);
        com.cyc.cycjava.cycl.cardinality_estimates.update_instance_cardinality(spec, genl);
        com.cyc.cycjava.cycl.cardinality_estimates.update_spec_cardinality(spec, genl);
        com.cyc.cycjava.cycl.cardinality_estimates.update_genl_cardinality(spec, genl);
        com.cyc.cycjava.cycl.cardinality_estimates.update_generality_estimate(spec);
        com.cyc.cycjava.cycl.cardinality_estimates.update_generality_estimate(genl);
        return NIL;
    }

    /**
     * Conservatively update the cardinality estimates of SPEC and GENL due to a new
     * link between them.
     */
    @LispMethod(comment = "Conservatively update the cardinality estimates of SPEC and GENL due to a new\r\nlink between them.\nConservatively update the cardinality estimates of SPEC and GENL due to a new\nlink between them.")
    public static SubLObject update_cardinality_estimates_wrt_genls(final SubLObject spec, final SubLObject genl) {
        assert NIL != hlmt.fort_or_chlmt_p(spec) : "! hlmt.fort_or_chlmt_p(spec) " + ("hlmt.fort_or_chlmt_p(spec) " + "CommonSymbols.NIL != hlmt.fort_or_chlmt_p(spec) ") + spec;
        assert NIL != hlmt.fort_or_chlmt_p(genl) : "! hlmt.fort_or_chlmt_p(genl) " + ("hlmt.fort_or_chlmt_p(genl) " + "CommonSymbols.NIL != hlmt.fort_or_chlmt_p(genl) ") + genl;
        update_instance_cardinality(spec, genl);
        update_spec_cardinality(spec, genl);
        update_genl_cardinality(spec, genl);
        update_generality_estimate(spec);
        update_generality_estimate(genl);
        return NIL;
    }/**
     * Conservatively update the cardinality estimates of SPEC and GENL due to a new
     * link between them.
     */


    /**
     * Remove TERM from any of the cardinality estimate tables
     */
    @LispMethod(comment = "Remove TERM from any of the cardinality estimate tables")
    public static final SubLObject clear_cardinality_estimates_alt(SubLObject v_term) {
        remhash(v_term, $local_instance_cardinality$.getGlobalValue());
        remhash(v_term, $local_quoted_instance_cardinality$.getGlobalValue());
        remhash(v_term, $local_spec_cardinality$.getGlobalValue());
        remhash(v_term, $total_instance_cardinality$.getGlobalValue());
        remhash(v_term, $total_quoted_instance_cardinality$.getGlobalValue());
        remhash(v_term, $total_spec_cardinality$.getGlobalValue());
        remhash(v_term, $total_genl_cardinality$.getGlobalValue());
        remhash(v_term, $generality_estimate_table$.getGlobalValue());
        return v_term;
    }

    /**
     * Remove TERM from any of the cardinality estimate tables
     */
    @LispMethod(comment = "Remove TERM from any of the cardinality estimate tables")
    public static SubLObject clear_cardinality_estimates(final SubLObject v_term) {
        remhash(v_term, $local_instance_cardinality$.getGlobalValue());
        remhash(v_term, $local_quoted_instance_cardinality$.getGlobalValue());
        remhash(v_term, $local_spec_cardinality$.getGlobalValue());
        remhash(v_term, $total_instance_cardinality$.getGlobalValue());
        remhash(v_term, $total_quoted_instance_cardinality$.getGlobalValue());
        remhash(v_term, $total_spec_cardinality$.getGlobalValue());
        remhash(v_term, $total_genl_cardinality$.getGlobalValue());
        remhash(v_term, $generality_estimate_table$.getGlobalValue());
        return v_term;
    }/**
     * Remove TERM from any of the cardinality estimate tables
     */


    /**
     * Conservatively update the instance cardinality estimate due to SPEC GENL link.
     */
    @LispMethod(comment = "Conservatively update the instance cardinality estimate due to SPEC GENL link.")
    public static final SubLObject update_instance_cardinality_alt(SubLObject spec, SubLObject genl) {
        {
            SubLObject spec_card = com.cyc.cycjava.cycl.cardinality_estimates.total_instance_cardinality(spec);
            SubLObject genl_card = com.cyc.cycjava.cycl.cardinality_estimates.total_instance_cardinality(genl);
            if (spec_card.numG(genl_card)) {
                com.cyc.cycjava.cycl.cardinality_estimates.set_total_instance_cardinality(genl, spec_card);
            }
        }
        {
            SubLObject spec_card = com.cyc.cycjava.cycl.cardinality_estimates.total_quoted_instance_cardinality(spec);
            SubLObject genl_card = com.cyc.cycjava.cycl.cardinality_estimates.total_quoted_instance_cardinality(genl);
            if (spec_card.numG(genl_card)) {
                com.cyc.cycjava.cycl.cardinality_estimates.set_total_quoted_instance_cardinality(genl, spec_card);
            }
        }
        return NIL;
    }

    /**
     * Conservatively update the instance cardinality estimate due to SPEC GENL link.
     */
    @LispMethod(comment = "Conservatively update the instance cardinality estimate due to SPEC GENL link.")
    public static SubLObject update_instance_cardinality(final SubLObject spec, final SubLObject genl) {
        SubLObject spec_card = total_instance_cardinality(spec);
        SubLObject genl_card = total_instance_cardinality(genl);
        if (spec_card.numG(genl_card)) {
            set_total_instance_cardinality(genl, spec_card);
        }
        spec_card = total_quoted_instance_cardinality(spec);
        genl_card = total_quoted_instance_cardinality(genl);
        if (spec_card.numG(genl_card)) {
            set_total_quoted_instance_cardinality(genl, spec_card);
        }
        return NIL;
    }/**
     * Conservatively update the instance cardinality estimate due to SPEC GENL link.
     */


    /**
     * Conservatively update the spec cardinality estimate due to SPEC GENL link.
     */
    @LispMethod(comment = "Conservatively update the spec cardinality estimate due to SPEC GENL link.")
    public static final SubLObject update_spec_cardinality_alt(SubLObject spec, SubLObject genl) {
        {
            SubLObject spec_card = com.cyc.cycjava.cycl.cardinality_estimates.total_spec_cardinality(spec);
            SubLObject genl_card = com.cyc.cycjava.cycl.cardinality_estimates.total_spec_cardinality(genl);
            SubLObject conservative_new_genl_card = f_1X(spec_card);
            if (conservative_new_genl_card.numG(genl_card)) {
                com.cyc.cycjava.cycl.cardinality_estimates.set_total_spec_cardinality(genl, conservative_new_genl_card);
            }
        }
        return NIL;
    }

    /**
     * Conservatively update the spec cardinality estimate due to SPEC GENL link.
     */
    @LispMethod(comment = "Conservatively update the spec cardinality estimate due to SPEC GENL link.")
    public static SubLObject update_spec_cardinality(final SubLObject spec, final SubLObject genl) {
        SubLObject spec_card = total_spec_cardinality(spec);
        if (spec_card.isZero()) {
            set_total_spec_cardinality(spec, ONE_INTEGER);
            spec_card = ONE_INTEGER;
        }
        final SubLObject genl_card = total_spec_cardinality(genl);
        final SubLObject conservative_new_genl_card = number_utilities.f_1X(spec_card);
        if (conservative_new_genl_card.numG(genl_card)) {
            set_total_spec_cardinality(genl, conservative_new_genl_card);
        }
        return NIL;
    }/**
     * Conservatively update the spec cardinality estimate due to SPEC GENL link.
     */


    /**
     * Conservatively update the genl cardinality estimate due to SPEC GENL link.
     */
    @LispMethod(comment = "Conservatively update the genl cardinality estimate due to SPEC GENL link.")
    public static final SubLObject update_genl_cardinality_alt(SubLObject spec, SubLObject genl) {
        {
            SubLObject spec_card = com.cyc.cycjava.cycl.cardinality_estimates.total_genl_cardinality(spec);
            SubLObject genl_card = com.cyc.cycjava.cycl.cardinality_estimates.total_genl_cardinality(genl);
            SubLObject conservative_new_spec_card = f_1X(genl_card);
            if (conservative_new_spec_card.numG(spec_card)) {
                com.cyc.cycjava.cycl.cardinality_estimates.set_total_genl_cardinality(spec, conservative_new_spec_card);
            }
        }
        return NIL;
    }

    /**
     * Conservatively update the genl cardinality estimate due to SPEC GENL link.
     */
    @LispMethod(comment = "Conservatively update the genl cardinality estimate due to SPEC GENL link.")
    public static SubLObject update_genl_cardinality(final SubLObject spec, final SubLObject genl) {
        final SubLObject spec_card = total_genl_cardinality(spec);
        final SubLObject genl_card = total_genl_cardinality(genl);
        final SubLObject conservative_new_spec_card = number_utilities.f_1X(genl_card);
        if (conservative_new_spec_card.numG(spec_card)) {
            set_total_genl_cardinality(spec, conservative_new_spec_card);
        }
        return NIL;
    }/**
     * Conservatively update the genl cardinality estimate due to SPEC GENL link.
     */


    /**
     * Update the generality estimate for TERM.
     */
    @LispMethod(comment = "Update the generality estimate for TERM.")
    public static final SubLObject update_generality_estimate_alt(SubLObject v_term) {
        {
            SubLObject new_estimate = com.cyc.cycjava.cycl.cardinality_estimates.compute_generality_estimate(v_term);
            com.cyc.cycjava.cycl.cardinality_estimates.set_generality_estimate(v_term, new_estimate);
            return new_estimate;
        }
    }

    /**
     * Update the generality estimate for TERM.
     */
    @LispMethod(comment = "Update the generality estimate for TERM.")
    public static SubLObject update_generality_estimate(final SubLObject v_term) {
        final SubLObject new_estimate = compute_generality_estimate(v_term);
        set_generality_estimate(v_term, new_estimate);
        return new_estimate;
    }/**
     * Update the generality estimate for TERM.
     */


    public static final SubLObject compute_generality_estimate_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject scale = $generality_estimate_scale_factor$.getDynamicValue(thread);
                SubLObject numerator = multiply(scale, com.cyc.cycjava.cycl.cardinality_estimates.use_cardinality(v_term));
                SubLObject denominator = max(com.cyc.cycjava.cycl.cardinality_estimates.genl_cardinality(v_term), ONE_INTEGER);
                return values(truncate(numerator, denominator));
            }
        }
    }

    public static SubLObject compute_generality_estimate(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject scale = $generality_estimate_scale_factor$.getDynamicValue(thread);
        final SubLObject numerator = multiply(scale, use_cardinality(v_term));
        final SubLObject denominator = max(genl_cardinality(v_term), ONE_INTEGER);
        return values(truncate(numerator, denominator));
    }

    public static final SubLObject initialize_inference_test_cardinalities_alt(SubLObject terms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject cdolist_list_var = terms;
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.cardinality_estimates.increment_local_instance_cardinality(v_term, length(remove_duplicates(isa.instances(v_term, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                            com.cyc.cycjava.cycl.cardinality_estimates.increment_local_quoted_instance_cardinality(v_term, length(remove_duplicates(isa.quoted_instances(v_term, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                            com.cyc.cycjava.cycl.cardinality_estimates.set_total_instance_cardinality(v_term, length(isa.all_fort_instances(v_term, UNPROVIDED, UNPROVIDED)));
                            com.cyc.cycjava.cycl.cardinality_estimates.set_total_quoted_instance_cardinality(v_term, length(isa.all_quoted_instances(v_term, UNPROVIDED, UNPROVIDED)));
                            {
                                SubLObject sbhl_module = sbhl_module_utilities.determine_sbhl_module_from_fort_type(v_term, UNPROVIDED);
                                com.cyc.cycjava.cycl.cardinality_estimates.set_local_spec_cardinality(v_term, length(sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                                com.cyc.cycjava.cycl.cardinality_estimates.set_total_spec_cardinality(v_term, length(sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module, v_term, UNPROVIDED, UNPROVIDED)));
                                com.cyc.cycjava.cycl.cardinality_estimates.set_total_genl_cardinality(v_term, length(sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module, v_term, UNPROVIDED, UNPROVIDED)));
                            }
                            com.cyc.cycjava.cycl.cardinality_estimates.update_generality_estimate(v_term);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject initialize_inference_test_cardinalities(final SubLObject terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                increment_local_instance_cardinality(v_term, length(remove_duplicates(isa.instances(v_term, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                increment_local_quoted_instance_cardinality(v_term, length(remove_duplicates(isa.quoted_instances(v_term, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                set_total_instance_cardinality(v_term, length(isa.all_fort_instances(v_term, UNPROVIDED, UNPROVIDED)));
                set_total_quoted_instance_cardinality(v_term, length(isa.all_quoted_instances(v_term, UNPROVIDED, UNPROVIDED)));
                final SubLObject sbhl_module = sbhl_module_utilities.determine_sbhl_module_from_fort_type(v_term, UNPROVIDED);
                set_local_spec_cardinality(v_term, length(sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                set_total_spec_cardinality(v_term, length(sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module, v_term, UNPROVIDED, UNPROVIDED)));
                set_total_genl_cardinality(v_term, length(sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module, v_term, UNPROVIDED, UNPROVIDED)));
                update_generality_estimate(v_term);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Return an estimate of the power of a disjointness between COL1 and COL2.
     * Here power = number of (#$not (#$isa OBJ COL)) and (#$disjointWith OBJ COL))
     * assertions entailed by the disjointness
     */
    @LispMethod(comment = "Return an estimate of the power of a disjointness between COL1 and COL2.\r\nHere power = number of (#$not (#$isa OBJ COL)) and (#$disjointWith OBJ COL))\r\nassertions entailed by the disjointness\nReturn an estimate of the power of a disjointness between COL1 and COL2.\nHere power = number of (#$not (#$isa OBJ COL)) and (#$disjointWith OBJ COL))\nassertions entailed by the disjointness")
    public static final SubLObject disjointness_power_alt(SubLObject col1, SubLObject col2) {
        {
            SubLObject instance_cardinality_1 = com.cyc.cycjava.cycl.cardinality_estimates.instance_cardinality(col1);
            SubLObject instance_cardinality_2 = com.cyc.cycjava.cycl.cardinality_estimates.instance_cardinality(col2);
            SubLObject spec_cardinality_1 = f_1X(com.cyc.cycjava.cycl.cardinality_estimates.spec_cardinality(col1));
            SubLObject spec_cardinality_2 = f_1X(com.cyc.cycjava.cycl.cardinality_estimates.spec_cardinality(col2));
            SubLObject power = add(multiply(instance_cardinality_1, spec_cardinality_2), multiply(instance_cardinality_2, spec_cardinality_1), multiply(spec_cardinality_1, spec_cardinality_2));
            return power;
        }
    }

    /**
     * Return an estimate of the power of a disjointness between COL1 and COL2.
     * Here power = number of (#$not (#$isa OBJ COL)) and (#$disjointWith OBJ COL))
     * assertions entailed by the disjointness
     */
    @LispMethod(comment = "Return an estimate of the power of a disjointness between COL1 and COL2.\r\nHere power = number of (#$not (#$isa OBJ COL)) and (#$disjointWith OBJ COL))\r\nassertions entailed by the disjointness\nReturn an estimate of the power of a disjointness between COL1 and COL2.\nHere power = number of (#$not (#$isa OBJ COL)) and (#$disjointWith OBJ COL))\nassertions entailed by the disjointness")
    public static SubLObject disjointness_power(final SubLObject col1, final SubLObject col2) {
        final SubLObject instance_cardinality_1 = instance_cardinality(col1);
        final SubLObject instance_cardinality_2 = instance_cardinality(col2);
        final SubLObject spec_cardinality_1 = number_utilities.f_1X(spec_cardinality(col1));
        final SubLObject spec_cardinality_2 = number_utilities.f_1X(spec_cardinality(col2));
        final SubLObject power = add(multiply(instance_cardinality_1, spec_cardinality_2), multiply(instance_cardinality_2, spec_cardinality_1), multiply(spec_cardinality_1, spec_cardinality_2));
        return power;
    }/**
     * Return an estimate of the power of a disjointness between COL1 and COL2.
     * Here power = number of (#$not (#$isa OBJ COL)) and (#$disjointWith OBJ COL))
     * assertions entailed by the disjointness
     */


    public static SubLObject disjoint_with_assertion_power(final SubLObject gaf) {
        assert NIL != assertions_high.gaf_assertionP(gaf) : "! assertions_high.gaf_assertionP(gaf) " + ("assertions_high.gaf_assertionP(gaf) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(gaf) ") + gaf;
        final SubLObject pred = assertions_high.gaf_predicate(gaf);
        if (NIL != kb_utilities.kbeq(pred, $$disjointWith)) {
            final SubLObject col1 = assertions_high.gaf_arg1(gaf);
            final SubLObject col2 = assertions_high.gaf_arg2(gaf);
            return disjointness_power(col1, col2);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject gt_inverse_cardinality_alt(SubLObject pred, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == fort_p(node)) {
                return ZERO_INTEGER;
            }
            {
                SubLObject count = (NIL != fort_types_interface.reflexive_binary_predicate_p(pred)) ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER;
                SubLObject node_var = pred;
                SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject tv_var = NIL;
                            {
                                SubLObject _prev_bind_0_44 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt69$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_45 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_46 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                {
                                                    SubLObject _prev_bind_0_47 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_48 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_49 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                        node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                        while (NIL != node_and_predicate_mode) {
                                                            {
                                                                SubLObject node_var_50 = node_and_predicate_mode.first();
                                                                SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                SubLObject spec = node_var_50;
                                                                {
                                                                    SubLObject _prev_bind_0_51 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                        {
                                                                            SubLObject inverseP = predicate_mode;
                                                                            if (NIL != inverseP) {
                                                                                count = add(count, kb_indexing.num_gaf_arg_index(node, ONE_INTEGER, spec, UNPROVIDED));
                                                                            } else {
                                                                                count = add(count, kb_indexing.num_gaf_arg_index(node, TWO_INTEGER, spec, UNPROVIDED));
                                                                            }
                                                                            {
                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                SubLObject module_var = NIL;
                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_52 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                            {
                                                                                                SubLObject node_54 = function_terms.naut_to_nart(node_var_50);
                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_54)) {
                                                                                                    {
                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_54, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        if (NIL != d_link) {
                                                                                                            {
                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != mt_links) {
                                                                                                                    {
                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_55 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject iteration_state_56 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_56)) {
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    {
                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_56);
                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0_57 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                        SubLObject cdolist_list_var_58 = new_list;
                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_58.first(); NIL != cdolist_list_var_58; cdolist_list_var_58 = cdolist_list_var_58.rest() , node_vars_link_node = cdolist_list_var_58.first()) {
                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_57, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        iteration_state_56 = dictionary_contents.do_dictionary_contents_next(iteration_state_56);
                                                                                                                                                    }
                                                                                                                                                } 
                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_56);
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_55, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt70$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    if (NIL != obsolete.cnat_p(node_54, UNPROVIDED)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            SubLObject cdolist_list_var_59 = new_list;
                                                                                                            SubLObject generating_fn = NIL;
                                                                                                            for (generating_fn = cdolist_list_var_59.first(); NIL != cdolist_list_var_59; cdolist_list_var_59 = cdolist_list_var_59.rest() , generating_fn = cdolist_list_var_59.first()) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_60 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                        {
                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node_54);
                                                                                                                            SubLObject new_list_61 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                            SubLObject cdolist_list_var_62 = new_list_61;
                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                            for (node_vars_link_node = cdolist_list_var_62.first(); NIL != cdolist_list_var_62; cdolist_list_var_62 = cdolist_list_var_62.rest() , node_vars_link_node = cdolist_list_var_62.first()) {
                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_60, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_53, thread);
                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_52, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_51, thread);
                                                                    }
                                                                }
                                                            }
                                                            node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_49, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_48, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_47, thread);
                                                    }
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt71$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_46, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_45, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_44, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject gt_inverse_cardinality(final SubLObject pred, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == forts.fort_p(node)) {
            return ZERO_INTEGER;
        }
        SubLObject count = (NIL != fort_types_interface.reflexive_binary_predicate_p(pred)) ? ONE_INTEGER : ZERO_INTEGER;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$60 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str73$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$61 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$62 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$62 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$63 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$65 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$66 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject spec = node_var_$66;
                                    final SubLObject _prev_bind_0_$63 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        final SubLObject inverseP = predicate_mode;
                                        if (NIL != inverseP) {
                                            count = add(count, kb_indexing.num_gaf_arg_index(node, ONE_INTEGER, spec, UNPROVIDED));
                                        } else {
                                            count = add(count, kb_indexing.num_gaf_arg_index(node, TWO_INTEGER, spec, UNPROVIDED));
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$64 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$64 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node_$70 = function_terms.naut_to_nart(node_var_$66);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$70)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$70, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$65 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$72;
                                                                        for (iteration_state_$72 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$72); iteration_state_$72 = dictionary_contents.do_dictionary_contents_next(iteration_state_$72)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$72);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$66 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$66, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$72);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$65, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str74$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node_$70, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$74;
                                                        final SubLObject new_list = cdolist_list_var_$74 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$74.first();
                                                        while (NIL != cdolist_list_var_$74) {
                                                            final SubLObject _prev_bind_0_$67 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node_$70);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$67, thread);
                                                            }
                                                            cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                                                            generating_fn = cdolist_list_var_$74.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$64, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$64, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$63, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$65, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$63, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$62, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str75$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$62, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$61, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$60, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject gt_predicate_cardinality_alt(SubLObject pred, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == fort_p(node)) {
                return ZERO_INTEGER;
            }
            {
                SubLObject count = (NIL != fort_types_interface.reflexive_binary_predicate_p(pred)) ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER;
                SubLObject node_var = pred;
                SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject tv_var = NIL;
                            {
                                SubLObject _prev_bind_0_63 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt69$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_64 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_65 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                {
                                                    SubLObject _prev_bind_0_66 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_67 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_68 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                        node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                        while (NIL != node_and_predicate_mode) {
                                                            {
                                                                SubLObject node_var_69 = node_and_predicate_mode.first();
                                                                SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                SubLObject spec = node_var_69;
                                                                {
                                                                    SubLObject _prev_bind_0_70 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                        {
                                                                            SubLObject inverseP = predicate_mode;
                                                                            if (NIL != inverseP) {
                                                                                count = add(count, kb_indexing.num_gaf_arg_index(node, TWO_INTEGER, spec, UNPROVIDED));
                                                                            } else {
                                                                                count = add(count, kb_indexing.num_gaf_arg_index(node, ONE_INTEGER, spec, UNPROVIDED));
                                                                            }
                                                                            {
                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                SubLObject module_var = NIL;
                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_71 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_72 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                            {
                                                                                                SubLObject node_73 = function_terms.naut_to_nart(node_var_69);
                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_73)) {
                                                                                                    {
                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_73, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        if (NIL != d_link) {
                                                                                                            {
                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != mt_links) {
                                                                                                                    {
                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_74 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject iteration_state_75 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_75)) {
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    {
                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_75);
                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0_76 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                        SubLObject cdolist_list_var_77 = new_list;
                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_77.first(); NIL != cdolist_list_var_77; cdolist_list_var_77 = cdolist_list_var_77.rest() , node_vars_link_node = cdolist_list_var_77.first()) {
                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_76, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        iteration_state_75 = dictionary_contents.do_dictionary_contents_next(iteration_state_75);
                                                                                                                                                    }
                                                                                                                                                } 
                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_75);
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_74, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt70$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    if (NIL != obsolete.cnat_p(node_73, UNPROVIDED)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            SubLObject cdolist_list_var_78 = new_list;
                                                                                                            SubLObject generating_fn = NIL;
                                                                                                            for (generating_fn = cdolist_list_var_78.first(); NIL != cdolist_list_var_78; cdolist_list_var_78 = cdolist_list_var_78.rest() , generating_fn = cdolist_list_var_78.first()) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_79 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                        {
                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node_73);
                                                                                                                            SubLObject new_list_80 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                            SubLObject cdolist_list_var_81 = new_list_80;
                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                            for (node_vars_link_node = cdolist_list_var_81.first(); NIL != cdolist_list_var_81; cdolist_list_var_81 = cdolist_list_var_81.rest() , node_vars_link_node = cdolist_list_var_81.first()) {
                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_79, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_72, thread);
                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_71, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_70, thread);
                                                                    }
                                                                }
                                                            }
                                                            node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_68, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_67, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_66, thread);
                                                    }
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt71$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_65, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_64, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_63, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject gt_predicate_cardinality(final SubLObject pred, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == forts.fort_p(node)) {
            return ZERO_INTEGER;
        }
        SubLObject count = (NIL != fort_types_interface.reflexive_binary_predicate_p(pred)) ? ONE_INTEGER : ZERO_INTEGER;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$77 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str73$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$79 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$79 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$80 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$83 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject spec = node_var_$83;
                                    final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        final SubLObject inverseP = predicate_mode;
                                        if (NIL != inverseP) {
                                            count = add(count, kb_indexing.num_gaf_arg_index(node, TWO_INTEGER, spec, UNPROVIDED));
                                        } else {
                                            count = add(count, kb_indexing.num_gaf_arg_index(node, ONE_INTEGER, spec, UNPROVIDED));
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$81 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node_$87 = function_terms.naut_to_nart(node_var_$83);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$87)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$87, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$82 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$89;
                                                                        for (iteration_state_$89 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$89); iteration_state_$89 = dictionary_contents.do_dictionary_contents_next(iteration_state_$89)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$89);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$83 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$83, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$89);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$82, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str74$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node_$87, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$91;
                                                        final SubLObject new_list = cdolist_list_var_$91 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$91.first();
                                                        while (NIL != cdolist_list_var_$91) {
                                                            final SubLObject _prev_bind_0_$84 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node_$87);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$84, thread);
                                                            }
                                                            cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                            generating_fn = cdolist_list_var_$91.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$81, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$81, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$80, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$82, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$80, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$79, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str75$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$79, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$78, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$77, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$85 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject gt_pred_extent_cardinality_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == fort_p(pred)) {
                return ZERO_INTEGER;
            }
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject node_var = pred;
                SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject tv_var = NIL;
                            {
                                SubLObject _prev_bind_0_82 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt69$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_83 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_84 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                {
                                                    SubLObject _prev_bind_0_85 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_86 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_87 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                        node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                        while (NIL != node_and_predicate_mode) {
                                                            {
                                                                SubLObject node_var_88 = node_and_predicate_mode.first();
                                                                SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                SubLObject spec = node_var_88;
                                                                {
                                                                    SubLObject _prev_bind_0_89 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                        {
                                                                            SubLObject inverseP = predicate_mode;
                                                                            count = add(count, kb_indexing.num_predicate_extent_index(spec, UNPROVIDED));
                                                                            {
                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                SubLObject module_var = NIL;
                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_90 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_91 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                            {
                                                                                                SubLObject node = function_terms.naut_to_nart(node_var_88);
                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                    {
                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        if (NIL != d_link) {
                                                                                                            {
                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != mt_links) {
                                                                                                                    {
                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_92 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject iteration_state_93 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_93)) {
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    {
                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_93);
                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0_94 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                        SubLObject cdolist_list_var_95 = new_list;
                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_95.first(); NIL != cdolist_list_var_95; cdolist_list_var_95 = cdolist_list_var_95.rest() , node_vars_link_node = cdolist_list_var_95.first()) {
                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_94, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        iteration_state_93 = dictionary_contents.do_dictionary_contents_next(iteration_state_93);
                                                                                                                                                    }
                                                                                                                                                } 
                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_93);
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_92, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt70$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            SubLObject cdolist_list_var_96 = new_list;
                                                                                                            SubLObject generating_fn = NIL;
                                                                                                            for (generating_fn = cdolist_list_var_96.first(); NIL != cdolist_list_var_96; cdolist_list_var_96 = cdolist_list_var_96.rest() , generating_fn = cdolist_list_var_96.first()) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_97 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                        {
                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                            SubLObject new_list_98 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                            SubLObject cdolist_list_var_99 = new_list_98;
                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                            for (node_vars_link_node = cdolist_list_var_99.first(); NIL != cdolist_list_var_99; cdolist_list_var_99 = cdolist_list_var_99.rest() , node_vars_link_node = cdolist_list_var_99.first()) {
                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_97, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_91, thread);
                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_90, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_89, thread);
                                                                    }
                                                                }
                                                            }
                                                            node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_87, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_86, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_85, thread);
                                                    }
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt71$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_84, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_83, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_82, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject gt_pred_extent_cardinality(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == forts.fort_p(pred)) {
            return ZERO_INTEGER;
        }
        SubLObject count = ZERO_INTEGER;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$94 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str73$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$95 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$96 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$96 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$97 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$99 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$100 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject spec = node_var_$100;
                                    final SubLObject _prev_bind_0_$97 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        final SubLObject inverseP = predicate_mode;
                                        count = add(count, kb_indexing.num_predicate_extent_index(spec, UNPROVIDED));
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$98 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$98 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$100);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$99 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$105;
                                                                        for (iteration_state_$105 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$105); iteration_state_$105 = dictionary_contents.do_dictionary_contents_next(iteration_state_$105)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$105);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$100 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$100, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$105);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$99, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str74$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$107;
                                                        final SubLObject new_list = cdolist_list_var_$107 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$107.first();
                                                        while (NIL != cdolist_list_var_$107) {
                                                            final SubLObject _prev_bind_0_$101 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$101, thread);
                                                            }
                                                            cdolist_list_var_$107 = cdolist_list_var_$107.rest();
                                                            generating_fn = cdolist_list_var_$107.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$98, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$98, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$97, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$99, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$97, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$96, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str75$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$96, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$95, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$94, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$102 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$102, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    /**
     * Count all the assertions that include COL or any of COL's specs.
     */
    @LispMethod(comment = "Count all the assertions that include COL or any of COL\'s specs.")
    public static final SubLObject collection_and_specs_assertion_count_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject assertion_set = new_set(symbol_function(EQ), UNPROVIDED);
                            SubLObject node_var = col;
                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            {
                                SubLObject _prev_bind_0_100 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_101 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_102 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt69$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt64$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_103 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_104 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_105 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_106 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_107 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_108 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    while (NIL != node_var) {
                                                                        {
                                                                            SubLObject spec = node_var;
                                                                            if (NIL != kb_mapping_macros.do_term_index_key_validator(spec, NIL)) {
                                                                                {
                                                                                    SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(spec, NIL);
                                                                                    SubLObject done_var = NIL;
                                                                                    SubLObject token_var = NIL;
                                                                                    while (NIL == done_var) {
                                                                                        {
                                                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                            if (NIL != valid) {
                                                                                                {
                                                                                                    SubLObject final_index_iterator = NIL;
                                                                                                    try {
                                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                                                                        {
                                                                                                            SubLObject done_var_109 = NIL;
                                                                                                            SubLObject token_var_110 = NIL;
                                                                                                            while (NIL == done_var_109) {
                                                                                                                {
                                                                                                                    SubLObject a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_110);
                                                                                                                    SubLObject valid_111 = makeBoolean(token_var_110 != a);
                                                                                                                    if (NIL != valid_111) {
                                                                                                                        if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(a, final_index_spec)) {
                                                                                                                            set_add(a, assertion_set);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    done_var_109 = makeBoolean(NIL == valid_111);
                                                                                                                }
                                                                                                            } 
                                                                                                        }
                                                                                                    } finally {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_112 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                if (NIL != final_index_iterator) {
                                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_112, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            done_var = makeBoolean(NIL == valid);
                                                                                        }
                                                                                    } 
                                                                                }
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_113 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_114 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt_115 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_115)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_116 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_115, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_117 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_117)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_117);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_118 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_119 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_119.first(); NIL != cdolist_list_var_119; cdolist_list_var_119 = cdolist_list_var_119.rest() , node_vars_link_node = cdolist_list_var_119.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_118, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_117 = dictionary_contents.do_dictionary_contents_next(iteration_state_117);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_117);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_116, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt70$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_120 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_120.first(); NIL != cdolist_list_var_120; cdolist_list_var_120 = cdolist_list_var_120.rest() , generating_fn = cdolist_list_var_120.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_121 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_122 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_123 = new_list_122;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_123.first(); NIL != cdolist_list_var_123; cdolist_list_var_123 = cdolist_list_var_123.rest() , node_vars_link_node = cdolist_list_var_123.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_121, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_114, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_113, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_108, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_107, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_106, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt71$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_105, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_104, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_103, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_102, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_101, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_100, thread);
                                }
                            }
                            count = set_size(assertion_set);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    /**
     * Count all the assertions that include COL or any of COL's specs.
     */
    @LispMethod(comment = "Count all the assertions that include COL or any of COL\'s specs.")
    public static SubLObject collection_and_specs_assertion_count(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject assertion_set = set.new_set(symbol_function(EQL), UNPROVIDED);
            SubLObject node_var = col;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0_$110 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$111 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$112 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str73$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str68$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$112 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$113 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$115 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$113 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$114 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$116 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    while (NIL != node_var) {
                                        final SubLObject spec = node_var;
                                        if (NIL != kb_mapping_macros.do_term_index_key_validator(spec, NIL)) {
                                            final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(spec, NIL);
                                            SubLObject done_var = NIL;
                                            final SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                if (NIL != valid) {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                        SubLObject done_var_$119 = NIL;
                                                        final SubLObject token_var_$120 = NIL;
                                                        while (NIL == done_var_$119) {
                                                            final SubLObject a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$120);
                                                            final SubLObject valid_$121 = makeBoolean(!token_var_$120.eql(a));
                                                            if ((NIL != valid_$121) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(a, final_index_spec))) {
                                                                set.set_add(a, assertion_set);
                                                            }
                                                            done_var_$119 = makeBoolean(NIL == valid_$121);
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$114 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            } 
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$115 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$115 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$125 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$125)) {
                                                                    final SubLObject _prev_bind_0_$116 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$125, thread);
                                                                        SubLObject iteration_state_$127;
                                                                        for (iteration_state_$127 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$127); iteration_state_$127 = dictionary_contents.do_dictionary_contents_next(iteration_state_$127)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$127);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$117 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$117, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$127);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$116, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str74$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$129;
                                                        final SubLObject new_list = cdolist_list_var_$129 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$129.first();
                                                        while (NIL != cdolist_list_var_$129) {
                                                            final SubLObject _prev_bind_0_$118 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$118, thread);
                                                            }
                                                            cdolist_list_var_$129 = cdolist_list_var_$129.rest();
                                                            generating_fn = cdolist_list_var_$129.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$115, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$115, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                        node_var = deck.deck_pop(recur_deck);
                                    } 
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$116, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$114, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$113, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str75$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$115, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$113, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$112, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$112, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$111, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$119 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$110, thread);
            }
            count = set.set_size(assertion_set);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return count;
    }/**
     * Count all the assertions that include COL or any of COL's specs.
     */


    public static final SubLObject terms_assertion_count_alt(SubLObject terms, SubLObject mt, SubLObject assertion_exclusion_fn) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (assertion_exclusion_fn == UNPROVIDED) {
            assertion_exclusion_fn = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject assertion_set = new_set(symbol_function(EQ), UNPROVIDED);
                            SubLObject cdolist_list_var = terms;
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                            {
                                                                SubLObject done_var_124 = NIL;
                                                                SubLObject token_var_125 = NIL;
                                                                while (NIL == done_var_124) {
                                                                    {
                                                                        SubLObject a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_125);
                                                                        SubLObject valid_126 = makeBoolean(token_var_125 != a);
                                                                        if (NIL != valid_126) {
                                                                            if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(a, final_index_spec)) {
                                                                                set_add(a, assertion_set);
                                                                            }
                                                                        }
                                                                        done_var_124 = makeBoolean(NIL == valid_126);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_127 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_127, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                            if (assertion_exclusion_fn.isFunctionSpec()) {
                                {
                                    SubLObject set_contents_var = do_set_internal(assertion_set);
                                    SubLObject basis_object = do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                                        {
                                            SubLObject a = do_set_contents_next(basis_object, state);
                                            if (NIL != do_set_contents_element_validP(state, a)) {
                                                if (NIL != funcall(assertion_exclusion_fn, a)) {
                                                    set_remove(a, assertion_set);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            count = set_size(assertion_set);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject terms_assertion_count(final SubLObject terms, SubLObject mt, SubLObject assertion_exclusion_fn) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (assertion_exclusion_fn == UNPROVIDED) {
            assertion_exclusion_fn = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject assertion_set = set.new_set(symbol_function(EQL), UNPROVIDED);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                SubLObject done_var_$132 = NIL;
                                final SubLObject token_var_$133 = NIL;
                                while (NIL == done_var_$132) {
                                    final SubLObject a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$133);
                                    final SubLObject valid_$134 = makeBoolean(!token_var_$133.eql(a));
                                    if ((NIL != valid_$134) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(a, final_index_spec))) {
                                        set.set_add(a, assertion_set);
                                    }
                                    done_var_$132 = makeBoolean(NIL == valid_$134);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$135 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$135, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
            if (assertion_exclusion_fn.isFunctionSpec()) {
                final SubLObject set_contents_var = set.do_set_internal(assertion_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject a2;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    a2 = set_contents.do_set_contents_next(basis_object, state);
                    if ((NIL != set_contents.do_set_contents_element_validP(state, a2)) && (NIL != funcall(assertion_exclusion_fn, a2))) {
                        set.set_remove(a2, assertion_set);
                    }
                }
            }
            count = set.set_size(assertion_set);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject declare_cardinality_estimates_file() {
        declareFunction("cardinality_estimates_initializedP", "CARDINALITY-ESTIMATES-INITIALIZED?", 0, 0, false);
        declareFunction("rebuild_cardinality_estimates", "REBUILD-CARDINALITY-ESTIMATES", 0, 0, false);
        declareFunction("initialize_cardinalities", "INITIALIZE-CARDINALITIES", 0, 0, false);
        declareFunction("isa_cardinality", "ISA-CARDINALITY", 1, 0, false);
        declareFunction("instance_cardinality", "INSTANCE-CARDINALITY", 1, 0, false);
        declareFunction("quoted_instance_cardinality", "QUOTED-INSTANCE-CARDINALITY", 1, 0, false);
        declareFunction("genl_cardinality", "GENL-CARDINALITY", 1, 0, false);
        declareFunction("spec_cardinality", "SPEC-CARDINALITY", 1, 0, false);
        declareFunction("use_cardinality", "USE-CARDINALITY", 1, 0, false);
        declareFunction("lightest_node", "LIGHTEST-NODE", 2, 0, false);
        declareFunction("shallowest_node", "SHALLOWEST-NODE", 2, 0, false);
        declareFunction("generality_estimate", "GENERALITY-ESTIMATE", 1, 0, false);
        new cardinality_estimates.$generality_estimate$UnaryFunction();
        declareFunction("sort_by_generality_estimate", "SORT-BY-GENERALITY-ESTIMATE", 1, 1, false);
        declareFunction("stable_sort_by_generality_estimate", "STABLE-SORT-BY-GENERALITY-ESTIMATE", 1, 1, false);
        declareFunction("generality_estimateL", "GENERALITY-ESTIMATE<", 2, 0, false);
        declareFunction("generality_estimateG", "GENERALITY-ESTIMATE>", 2, 0, false);
        declareFunction("most_general_term", "MOST-GENERAL-TERM", 1, 0, false);
        declareFunction("least_general_term", "LEAST-GENERAL-TERM", 1, 0, false);
        declareFunction("instance_iteration_cost", "INSTANCE-ITERATION-COST", 1, 0, false);
        declareFunction("quoted_instance_iteration_cost", "QUOTED-INSTANCE-ITERATION-COST", 1, 0, false);
        declareFunction("clear_cardinalities", "CLEAR-CARDINALITIES", 0, 0, false);
        declareFunction("local_instance_cardinality", "LOCAL-INSTANCE-CARDINALITY", 1, 0, false);
        declareFunction("set_local_instance_cardinality", "SET-LOCAL-INSTANCE-CARDINALITY", 2, 0, false);
        declareFunction("increment_local_instance_cardinality", "INCREMENT-LOCAL-INSTANCE-CARDINALITY", 2, 0, false);
        declareFunction("local_quoted_instance_cardinality", "LOCAL-QUOTED-INSTANCE-CARDINALITY", 1, 0, false);
        declareFunction("set_local_quoted_instance_cardinality", "SET-LOCAL-QUOTED-INSTANCE-CARDINALITY", 2, 0, false);
        declareFunction("increment_local_quoted_instance_cardinality", "INCREMENT-LOCAL-QUOTED-INSTANCE-CARDINALITY", 2, 0, false);
        declareFunction("local_spec_cardinality", "LOCAL-SPEC-CARDINALITY", 1, 0, false);
        declareFunction("set_local_spec_cardinality", "SET-LOCAL-SPEC-CARDINALITY", 2, 0, false);
        declareFunction("total_instance_cardinality", "TOTAL-INSTANCE-CARDINALITY", 1, 0, false);
        declareFunction("set_total_instance_cardinality", "SET-TOTAL-INSTANCE-CARDINALITY", 2, 0, false);
        declareFunction("increment_total_instance_cardinality", "INCREMENT-TOTAL-INSTANCE-CARDINALITY", 2, 0, false);
        declareFunction("total_quoted_instance_cardinality", "TOTAL-QUOTED-INSTANCE-CARDINALITY", 1, 0, false);
        declareFunction("set_total_quoted_instance_cardinality", "SET-TOTAL-QUOTED-INSTANCE-CARDINALITY", 2, 0, false);
        declareFunction("increment_total_quoted_instance_cardinality", "INCREMENT-TOTAL-QUOTED-INSTANCE-CARDINALITY", 2, 0, false);
        declareFunction("total_spec_cardinality", "TOTAL-SPEC-CARDINALITY", 1, 0, false);
        declareFunction("set_total_spec_cardinality", "SET-TOTAL-SPEC-CARDINALITY", 2, 0, false);
        declareFunction("increment_total_spec_cardinality", "INCREMENT-TOTAL-SPEC-CARDINALITY", 2, 0, false);
        declareFunction("total_genl_cardinality", "TOTAL-GENL-CARDINALITY", 1, 0, false);
        declareFunction("set_total_genl_cardinality", "SET-TOTAL-GENL-CARDINALITY", 2, 0, false);
        declareFunction("get_generality_estimate", "GET-GENERALITY-ESTIMATE", 1, 0, false);
        declareFunction("set_generality_estimate", "SET-GENERALITY-ESTIMATE", 2, 0, false);
        declareFunction("setup_cardinality_tables", "SETUP-CARDINALITY-TABLES", 1, 0, false);
        declareFunction("clear_local_cardinalities", "CLEAR-LOCAL-CARDINALITIES", 0, 0, false);
        declareFunction("initialize_local_cardinalities", "INITIALIZE-LOCAL-CARDINALITIES", 0, 0, false);
        declareMacro("do_sbhl_module_nodes", "DO-SBHL-MODULE-NODES");
        declareFunction("get_sbhl_module_size", "GET-SBHL-MODULE-SIZE", 1, 0, false);
        declareFunction("initialize_collection_local_spec_cardinalities", "INITIALIZE-COLLECTION-LOCAL-SPEC-CARDINALITIES", 0, 0, false);
        declareFunction("initialize_collection_local_instance_cardinalities", "INITIALIZE-COLLECTION-LOCAL-INSTANCE-CARDINALITIES", 0, 0, false);
        declareFunction("initialize_collection_local_quoted_instance_cardinalities", "INITIALIZE-COLLECTION-LOCAL-QUOTED-INSTANCE-CARDINALITIES", 0, 0, false);
        declareFunction("initialize_predicate_local_spec_cardinalities", "INITIALIZE-PREDICATE-LOCAL-SPEC-CARDINALITIES", 0, 0, false);
        declareFunction("initialize_microtheory_local_spec_cardinalities", "INITIALIZE-MICROTHEORY-LOCAL-SPEC-CARDINALITIES", 0, 0, false);
        declareFunction("initialize_other_local_instance_cardinalities", "INITIALIZE-OTHER-LOCAL-INSTANCE-CARDINALITIES", 0, 0, false);
        declareFunction("clear_total_cardinalities", "CLEAR-TOTAL-CARDINALITIES", 0, 0, false);
        declareFunction("initialize_total_cardinalities", "INITIALIZE-TOTAL-CARDINALITIES", 0, 0, false);
        declareFunction("initialize_collection_total_cardinalities", "INITIALIZE-COLLECTION-TOTAL-CARDINALITIES", 0, 0, false);
        declareFunction("initialize_predicate_total_cardinalities", "INITIALIZE-PREDICATE-TOTAL-CARDINALITIES", 0, 0, false);
        declareFunction("initialize_microtheory_total_cardinalities", "INITIALIZE-MICROTHEORY-TOTAL-CARDINALITIES", 0, 0, false);
        declareFunction("clear_generality_estimates", "CLEAR-GENERALITY-ESTIMATES", 0, 0, false);
        declareFunction("initialize_generality_estimates", "INITIALIZE-GENERALITY-ESTIMATES", 0, 0, false);
        declareFunction("dump_cardinality_estimates_to_stream", "DUMP-CARDINALITY-ESTIMATES-TO-STREAM", 1, 0, false);
        declareFunction("load_cardinality_estimates_from_stream", "LOAD-CARDINALITY-ESTIMATES-FROM-STREAM", 1, 0, false);
        declareFunction("update_cardinality_estimates_wrt_genls", "UPDATE-CARDINALITY-ESTIMATES-WRT-GENLS", 2, 0, false);
        declareFunction("clear_cardinality_estimates", "CLEAR-CARDINALITY-ESTIMATES", 1, 0, false);
        declareFunction("update_instance_cardinality", "UPDATE-INSTANCE-CARDINALITY", 2, 0, false);
        declareFunction("update_spec_cardinality", "UPDATE-SPEC-CARDINALITY", 2, 0, false);
        declareFunction("update_genl_cardinality", "UPDATE-GENL-CARDINALITY", 2, 0, false);
        declareFunction("update_generality_estimate", "UPDATE-GENERALITY-ESTIMATE", 1, 0, false);
        declareFunction("compute_generality_estimate", "COMPUTE-GENERALITY-ESTIMATE", 1, 0, false);
        declareFunction("initialize_inference_test_cardinalities", "INITIALIZE-INFERENCE-TEST-CARDINALITIES", 1, 0, false);
        declareFunction("disjointness_power", "DISJOINTNESS-POWER", 2, 0, false);
        declareFunction("disjoint_with_assertion_power", "DISJOINT-WITH-ASSERTION-POWER", 1, 0, false);
        declareFunction("gt_inverse_cardinality", "GT-INVERSE-CARDINALITY", 2, 0, false);
        declareFunction("gt_predicate_cardinality", "GT-PREDICATE-CARDINALITY", 2, 0, false);
        declareFunction("gt_pred_extent_cardinality", "GT-PRED-EXTENT-CARDINALITY", 1, 0, false);
        declareFunction("collection_and_specs_assertion_count", "COLLECTION-AND-SPECS-ASSERTION-COUNT", 1, 1, false);
        declareFunction("terms_assertion_count", "TERMS-ASSERTION-COUNT", 1, 2, false);
        return NIL;
    }

    public static final SubLObject init_cardinality_estimates_file_alt() {
        deflexical("*LOCAL-INSTANCE-CARDINALITY*", NIL != boundp($local_instance_cardinality$) ? ((SubLObject) ($local_instance_cardinality$.getGlobalValue())) : NIL);
        deflexical("*LOCAL-QUOTED-INSTANCE-CARDINALITY*", NIL != boundp($local_quoted_instance_cardinality$) ? ((SubLObject) ($local_quoted_instance_cardinality$.getGlobalValue())) : NIL);
        deflexical("*LOCAL-SPEC-CARDINALITY*", NIL != boundp($local_spec_cardinality$) ? ((SubLObject) ($local_spec_cardinality$.getGlobalValue())) : NIL);
        deflexical("*TOTAL-INSTANCE-CARDINALITY*", NIL != boundp($total_instance_cardinality$) ? ((SubLObject) ($total_instance_cardinality$.getGlobalValue())) : NIL);
        deflexical("*TOTAL-QUOTED-INSTANCE-CARDINALITY*", NIL != boundp($total_quoted_instance_cardinality$) ? ((SubLObject) ($total_quoted_instance_cardinality$.getGlobalValue())) : NIL);
        deflexical("*TOTAL-SPEC-CARDINALITY*", NIL != boundp($total_spec_cardinality$) ? ((SubLObject) ($total_spec_cardinality$.getGlobalValue())) : NIL);
        deflexical("*TOTAL-GENL-CARDINALITY*", NIL != boundp($total_genl_cardinality$) ? ((SubLObject) ($total_genl_cardinality$.getGlobalValue())) : NIL);
        deflexical("*GENERALITY-ESTIMATE-TABLE*", NIL != boundp($generality_estimate_table$) ? ((SubLObject) ($generality_estimate_table$.getGlobalValue())) : NIL);
        defparameter("*GENERALITY-ESTIMATE-SCALE-FACTOR*", $int$100);
        return NIL;
    }

    public static SubLObject init_cardinality_estimates_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*LOCAL-INSTANCE-CARDINALITY*", SubLTrampolineFile.maybeDefault($local_instance_cardinality$, $local_instance_cardinality$, NIL));
            deflexical("*LOCAL-QUOTED-INSTANCE-CARDINALITY*", SubLTrampolineFile.maybeDefault($local_quoted_instance_cardinality$, $local_quoted_instance_cardinality$, NIL));
            deflexical("*LOCAL-SPEC-CARDINALITY*", SubLTrampolineFile.maybeDefault($local_spec_cardinality$, $local_spec_cardinality$, NIL));
            deflexical("*TOTAL-INSTANCE-CARDINALITY*", SubLTrampolineFile.maybeDefault($total_instance_cardinality$, $total_instance_cardinality$, NIL));
            deflexical("*TOTAL-QUOTED-INSTANCE-CARDINALITY*", SubLTrampolineFile.maybeDefault($total_quoted_instance_cardinality$, $total_quoted_instance_cardinality$, NIL));
            deflexical("*TOTAL-SPEC-CARDINALITY*", SubLTrampolineFile.maybeDefault($total_spec_cardinality$, $total_spec_cardinality$, NIL));
            deflexical("*TOTAL-GENL-CARDINALITY*", SubLTrampolineFile.maybeDefault($total_genl_cardinality$, $total_genl_cardinality$, NIL));
            deflexical("*GENERALITY-ESTIMATE-TABLE*", SubLTrampolineFile.maybeDefault($generality_estimate_table$, $generality_estimate_table$, NIL));
            defparameter("*GENERALITY-ESTIMATE-SCALE-FACTOR*", $int$100);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*LOCAL-INSTANCE-CARDINALITY*", NIL != boundp($local_instance_cardinality$) ? ((SubLObject) ($local_instance_cardinality$.getGlobalValue())) : NIL);
            deflexical("*LOCAL-QUOTED-INSTANCE-CARDINALITY*", NIL != boundp($local_quoted_instance_cardinality$) ? ((SubLObject) ($local_quoted_instance_cardinality$.getGlobalValue())) : NIL);
            deflexical("*LOCAL-SPEC-CARDINALITY*", NIL != boundp($local_spec_cardinality$) ? ((SubLObject) ($local_spec_cardinality$.getGlobalValue())) : NIL);
            deflexical("*TOTAL-INSTANCE-CARDINALITY*", NIL != boundp($total_instance_cardinality$) ? ((SubLObject) ($total_instance_cardinality$.getGlobalValue())) : NIL);
            deflexical("*TOTAL-QUOTED-INSTANCE-CARDINALITY*", NIL != boundp($total_quoted_instance_cardinality$) ? ((SubLObject) ($total_quoted_instance_cardinality$.getGlobalValue())) : NIL);
            deflexical("*TOTAL-SPEC-CARDINALITY*", NIL != boundp($total_spec_cardinality$) ? ((SubLObject) ($total_spec_cardinality$.getGlobalValue())) : NIL);
            deflexical("*TOTAL-GENL-CARDINALITY*", NIL != boundp($total_genl_cardinality$) ? ((SubLObject) ($total_genl_cardinality$.getGlobalValue())) : NIL);
            deflexical("*GENERALITY-ESTIMATE-TABLE*", NIL != boundp($generality_estimate_table$) ? ((SubLObject) ($generality_estimate_table$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_cardinality_estimates_file_Previous() {
        deflexical("*LOCAL-INSTANCE-CARDINALITY*", SubLTrampolineFile.maybeDefault($local_instance_cardinality$, $local_instance_cardinality$, NIL));
        deflexical("*LOCAL-QUOTED-INSTANCE-CARDINALITY*", SubLTrampolineFile.maybeDefault($local_quoted_instance_cardinality$, $local_quoted_instance_cardinality$, NIL));
        deflexical("*LOCAL-SPEC-CARDINALITY*", SubLTrampolineFile.maybeDefault($local_spec_cardinality$, $local_spec_cardinality$, NIL));
        deflexical("*TOTAL-INSTANCE-CARDINALITY*", SubLTrampolineFile.maybeDefault($total_instance_cardinality$, $total_instance_cardinality$, NIL));
        deflexical("*TOTAL-QUOTED-INSTANCE-CARDINALITY*", SubLTrampolineFile.maybeDefault($total_quoted_instance_cardinality$, $total_quoted_instance_cardinality$, NIL));
        deflexical("*TOTAL-SPEC-CARDINALITY*", SubLTrampolineFile.maybeDefault($total_spec_cardinality$, $total_spec_cardinality$, NIL));
        deflexical("*TOTAL-GENL-CARDINALITY*", SubLTrampolineFile.maybeDefault($total_genl_cardinality$, $total_genl_cardinality$, NIL));
        deflexical("*GENERALITY-ESTIMATE-TABLE*", SubLTrampolineFile.maybeDefault($generality_estimate_table$, $generality_estimate_table$, NIL));
        defparameter("*GENERALITY-ESTIMATE-SCALE-FACTOR*", $int$100);
        return NIL;
    }

    public static SubLObject setup_cardinality_estimates_file() {
        declare_defglobal($local_instance_cardinality$);
        declare_defglobal($local_quoted_instance_cardinality$);
        declare_defglobal($local_spec_cardinality$);
        declare_defglobal($total_instance_cardinality$);
        declare_defglobal($total_quoted_instance_cardinality$);
        declare_defglobal($total_spec_cardinality$);
        declare_defglobal($total_genl_cardinality$);
        declare_defglobal($generality_estimate_table$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cardinality_estimates_file();
    }

    @Override
    public void initializeVariables() {
        init_cardinality_estimates_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cardinality_estimates_file();
    }

    static {
    }

    public static final class $generality_estimate$UnaryFunction extends UnaryFunction {
        public $generality_estimate$UnaryFunction() {
            super(extractFunctionNamed("GENERALITY-ESTIMATE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return generality_estimate(arg1);
        }
    }

    static private final SubLList $list_alt15 = list(list(makeSymbol("NODE-VAR"), makeSymbol("MODULE"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt16 = list(makeKeyword("PROGRESS-MESSAGE"), $DONE);

    static private final SubLSymbol $sym20$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    static private final SubLSymbol $sym21$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");

    static private final SubLSymbol $sym22$TOTAL = makeUninternedSymbol("TOTAL");

    static private final SubLSymbol $sym23$SOFAR = makeUninternedSymbol("SOFAR");

    static private final SubLList $list_alt26 = list(ZERO_INTEGER);

    static private final SubLSymbol $sym31$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");

    static private final SubLSymbol $sym32$LINK_VAR = makeUninternedSymbol("LINK-VAR");

    static private final SubLString $str_alt36$Calculating_collection_local_spec = makeString("Calculating collection local spec cardinalities");

    static private final SubLList $list_alt40 = list(makeSymbol("TERM"), makeUninternedSymbol("IMPL-VALUE"));

    static private final SubLString $str_alt41$Calculating_collection_local_inst = makeString("Calculating collection local instance cardinalities");

    static private final SubLString $str_alt43$Calculating_collection_local_quot = makeString("Calculating collection local quoted instance cardinalities");

    static private final SubLString $str_alt45$Calculating_predicate_local_spec_ = makeString("Calculating predicate local spec cardinalities");

    static private final SubLString $str_alt47$Calculating_microtheory_local_spe = makeString("Calculating microtheory local spec cardinalities");

    static private final SubLString $str_alt49$Calculating_other_local_instance_ = makeString("Calculating other local instance cardinalities");

    static private final SubLString $str_alt51$Calculating_collection_total_card = makeString("Calculating collection total cardinalities");

    static private final SubLList $list_alt52 = list(makeSymbol("COL"), makeUninternedSymbol("IMPL-VALUE"));

    static private final SubLString $str_alt53$Calculating_predicate_total_cardi = makeString("Calculating predicate total cardinalities");

    static private final SubLList $list_alt54 = list(makeSymbol("PREDICATE"), makeUninternedSymbol("IMPL-VALUE"));

    static private final SubLString $str_alt55$Calculating_microtheory_total_car = makeString("Calculating microtheory total cardinalities");

    static private final SubLList $list_alt56 = list(makeSymbol("MT"), makeUninternedSymbol("IMPL-VALUE"));

    static private final SubLString $str_alt64$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt69$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt70$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt71$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
}

/**
 * Total time: 2320 ms
 */
