/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.assertions_high.assertion_mt;
import static com.cyc.cycjava.cycl.assertions_high.assertion_strength;
import static com.cyc.cycjava.cycl.assertions_high.assertion_truth;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg1;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg2;
import static com.cyc.cycjava.cycl.assertions_high.gaf_assertionP;
import static com.cyc.cycjava.cycl.assertions_high.gaf_predicate;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$ignore_conflictsP$;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.el_list_p;
import static com.cyc.cycjava.cycl.el_utilities.el_set_items;
import static com.cyc.cycjava.cycl.el_utilities.el_set_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.format_nil.force_format;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.iteration.iteration_next_without_values_macro_helper;
import static com.cyc.cycjava.cycl.kb_mapping_macros.destroy_final_index_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.do_predicate_extent_index_key_validator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_final_index_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_predicate_extent_final_index_spec_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_utilities.pred_values_in_relevant_mts;
import static com.cyc.cycjava.cycl.kb_mapping_utilities.some_pred_value_in_relevant_mts;
import static com.cyc.cycjava.cycl.sbhl.sbhl_time_vars.$sbhl_extended_universal_date_list$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_time_vars.$sbhl_temporal_link_support_table$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.alexandria_iterators;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertions_low;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-LINK-METHODS
 * source file: /cyc/top/cycl/sbhl/sbhl-link-methods.lisp
 * created:     2019/07/03 17:37:26
 */
public final class sbhl_link_methods extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_link_methods();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_link_methods";


    // deflexical
    // Store for isa links that have the a NAUT in the arg2 position.
    /**
     * Store for isa links that have the a NAUT in the arg2 position.
     */
    @LispMethod(comment = "Store for isa links that have the a NAUT in the arg2 position.\ndeflexical")
    public static final SubLSymbol $isa_arg2_naut_table$ = makeSymbol("*ISA-ARG2-NAUT-TABLE*");

    // deflexical
    // Store for quotedIsa links that have the a NAUT in the arg2 position.
    /**
     * Store for quotedIsa links that have the a NAUT in the arg2 position.
     */
    @LispMethod(comment = "Store for quotedIsa links that have the a NAUT in the arg2 position.\ndeflexical")
    public static final SubLSymbol $quoted_isa_arg2_naut_table$ = makeSymbol("*QUOTED-ISA-ARG2-NAUT-TABLE*");

    private static final SubLString $str3$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str4$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str8$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol SBHL_SEARCH_TRUTH_VALUE_P = makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str13$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLString $str15$tv___a__does_not_satisfy_sbhl_tru = makeString("tv, ~a, does not satisfy sbhl-true-tv-p");

    private static final SubLString $str16$sbhl_link_nodes_never_called_ = makeString("sbhl-link-nodes never called.");

    private static final SubLObject $$False_JustificationTruth = reader_make_constant_shell("False-JustificationTruth");

    private static final SubLString $str18$tv___a__does_not_satisfy_sbhl_fal = makeString("tv, ~a, does not satisfy sbhl-false-tv-p");











    private static final SubLSymbol MAKE_SBHL_GRAPH_LINK_ISA = makeSymbol("MAKE-SBHL-GRAPH-LINK-ISA");

    private static final SubLSymbol $make_sbhl_graph_link_isa_caching_state$ = makeSymbol("*MAKE-SBHL-GRAPH-LINK-ISA-CACHING-STATE*");

    private static final SubLSymbol CLEAR_MAKE_SBHL_GRAPH_LINK_ISA = makeSymbol("CLEAR-MAKE-SBHL-GRAPH-LINK-ISA");

    private static final SubLSymbol MAKE_SBHL_GRAPH_LINK_QUOTED_ISA = makeSymbol("MAKE-SBHL-GRAPH-LINK-QUOTED-ISA");

    private static final SubLSymbol $make_sbhl_graph_link_quoted_isa_caching_state$ = makeSymbol("*MAKE-SBHL-GRAPH-LINK-QUOTED-ISA-CACHING-STATE*");

    private static final SubLSymbol CLEAR_MAKE_SBHL_GRAPH_LINK_QUOTED_ISA = makeSymbol("CLEAR-MAKE-SBHL-GRAPH-LINK-QUOTED-ISA");

    private static final SubLSymbol MAKE_SBHL_GRAPH_LINK_GENLS = makeSymbol("MAKE-SBHL-GRAPH-LINK-GENLS");

    private static final SubLSymbol $make_sbhl_graph_link_genls_caching_state$ = makeSymbol("*MAKE-SBHL-GRAPH-LINK-GENLS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_MAKE_SBHL_GRAPH_LINK_GENLS = makeSymbol("CLEAR-MAKE-SBHL-GRAPH-LINK-GENLS");

    private static final SubLSymbol MAKE_SBHL_GRAPH_LINK_GENL_PREDS = makeSymbol("MAKE-SBHL-GRAPH-LINK-GENL-PREDS");

    private static final SubLSymbol $make_sbhl_graph_link_genl_preds_caching_state$ = makeSymbol("*MAKE-SBHL-GRAPH-LINK-GENL-PREDS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_MAKE_SBHL_GRAPH_LINK_GENL_PREDS = makeSymbol("CLEAR-MAKE-SBHL-GRAPH-LINK-GENL-PREDS");

    private static final SubLSymbol MAKE_SBHL_GRAPH_LINK_GENL_MT = makeSymbol("MAKE-SBHL-GRAPH-LINK-GENL-MT");

    private static final SubLSymbol $make_sbhl_graph_link_genl_mt_caching_state$ = makeSymbol("*MAKE-SBHL-GRAPH-LINK-GENL-MT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_MAKE_SBHL_GRAPH_LINK_GENL_MT = makeSymbol("CLEAR-MAKE-SBHL-GRAPH-LINK-GENL-MT");

    private static final SubLSymbol MAKE_SBHL_GRAPH_LINK_OTHER = makeSymbol("MAKE-SBHL-GRAPH-LINK-OTHER");

    private static final SubLSymbol $make_sbhl_graph_link_other_caching_state$ = makeSymbol("*MAKE-SBHL-GRAPH-LINK-OTHER-CACHING-STATE*");

    private static final SubLSymbol CLEAR_MAKE_SBHL_GRAPH_LINK_OTHER = makeSymbol("CLEAR-MAKE-SBHL-GRAPH-LINK-OTHER");

    private static final SubLString $$$Initializing_all_SBHL_Graph_Links = makeString("Initializing all SBHL Graph Links");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str45$_______A = makeString("~%    ~A");



    private static final SubLString $$$Initializing_ = makeString("Initializing ");

    private static final SubLString $$$_SBHL_Graph_Links = makeString(" SBHL Graph Links");

    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell("Always-TimeInterval");

    private static final SubLString $$$Initializing_SBHL_Time_Links = makeString("Initializing SBHL Time Links");

    private static final SubLList $list56 = cons(makeUninternedSymbol("KEY"), makeUninternedSymbol("MODULE"));

    private static final SubLString $str57$adding_sbhl_links_for___a_with_tr = makeString("adding sbhl links for: ~a with truth ~a.~%");

    private static final SubLString $str58$Link_node___a__not_present_in_for = makeString("Link node, ~a, not present in forward links after performing (store-in-sbhl-graph ~a ~a ~a ~a). ~%");

    private static final SubLString $str59$Link_node___a__not_present_in_bac = makeString("Link node, ~a, not present in backward links after performing (store-in-sbhl-graph ~a ~a ~a ~a). ~%");

    private static final SubLString $str60$Cannot_remove_link_node___a__not_ = makeString("Cannot remove link node, ~a, not within links specified by node ~a, direction ~a, mt ~a, tv ~a, within *sbhl-module*~%");

    private static final SubLString $str61$Removing__a_from__a_forward_direc = makeString("Removing ~a from ~a forward direction link");

    private static final SubLString $str62$Removing__a_from__a_backward_dire = makeString("Removing ~a from ~a backward direction link");

    private static final SubLSymbol $sym63$_ISA_ARG2_NAUT_TABLE_ = makeSymbol("*ISA-ARG2-NAUT-TABLE*");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLList $list66 = list(makeSymbol("NAUT"), makeSymbol("ISA-MT"), makeSymbol("ISA-TV"));

    private static final SubLList $list67 = list(list(makeSymbol("ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym68$MODULE = makeUninternedSymbol("MODULE");

    private static final SubLSymbol $sym69$ISA_TUPLE = makeUninternedSymbol("ISA-TUPLE");

    private static final SubLSymbol $sym70$NAUT = makeUninternedSymbol("NAUT");

    private static final SubLSymbol $sym71$ISA_MT = makeUninternedSymbol("ISA-MT");

    private static final SubLSymbol $sym72$ISA_TV = makeUninternedSymbol("ISA-TV");

    static private final SubLList $list74 = list(list(makeSymbol("GET-SBHL-MODULE"), reader_make_constant_shell("genls")));

    private static final SubLSymbol POSSIBLY_WITH_SBHL_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-SBHL-MT-RELEVANCE");

    private static final SubLSymbol POSSIBLY_WITH_SBHL_TRUE_TV = makeSymbol("POSSIBLY-WITH-SBHL-TRUE-TV");

    private static final SubLSymbol WITH_SBHL_MODULE = makeSymbol("WITH-SBHL-MODULE");

    private static final SubLList $list80 = list(makeSymbol("*ISA-ARG2-NAUT-TABLE*"));

    private static final SubLSymbol $sym84$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");

    private static final SubLSymbol $sym85$RELEVANT_SBHL_TV_ = makeSymbol("RELEVANT-SBHL-TV?");

    private static final SubLSymbol DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS = makeSymbol("DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS");

    private static final SubLList $list87 = list(makeSymbol("GET-SBHL-FORWARD-DIRECTED-DIRECTION"));

    private static final SubLSymbol $sym88$_QUOTED_ISA_ARG2_NAUT_TABLE_ = makeSymbol("*QUOTED-ISA-ARG2-NAUT-TABLE*");

    static private final SubLList $list89 = list(makeSymbol("NAUT"), makeSymbol("QUOTED-ISA-MT"), makeSymbol("QUOTED-ISA-TV"));

    static private final SubLList $list90 = list(list(makeSymbol("QUOTED-ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym91$MODULE = makeUninternedSymbol("MODULE");

    private static final SubLSymbol $sym92$QUOTED_ISA_TUPLE = makeUninternedSymbol("QUOTED-ISA-TUPLE");

    private static final SubLSymbol $sym93$NAUT = makeUninternedSymbol("NAUT");

    private static final SubLSymbol $sym94$QUOTED_ISA_MT = makeUninternedSymbol("QUOTED-ISA-MT");

    private static final SubLSymbol $sym95$QUOTED_ISA_TV = makeUninternedSymbol("QUOTED-ISA-TV");

    private static final SubLList $list96 = list(makeSymbol("*QUOTED-ISA-ARG2-NAUT-TABLE*"));

    private static final SubLSymbol $non_fort_isa_table$ = makeSymbol("*NON-FORT-ISA-TABLE*");

    private static final SubLSymbol $non_fort_instance_table$ = makeSymbol("*NON-FORT-INSTANCE-TABLE*");

    private static final SubLList $list99 = list(list(makeSymbol("COL-VAR"), makeSymbol("INS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym100$ISA_TUPLE = makeUninternedSymbol("ISA-TUPLE");

    private static final SubLSymbol $sym101$TABLE_MT = makeUninternedSymbol("TABLE-MT");

    private static final SubLSymbol $sym102$TABLE_TV = makeUninternedSymbol("TABLE-TV");

    private static final SubLSymbol POSSIBLY_WITH_SBHL_TV = makeSymbol("POSSIBLY-WITH-SBHL-TV");

    private static final SubLList $list107 = list(list(makeSymbol("NON-FORT-ISA-TABLE")));

    private static final SubLString $str110$Rebuilding_non_fort___isa_tables_ = makeString("Rebuilding non-fort #$isa tables...");

    private static final SubLSymbol NON_FORT_P = makeSymbol("NON-FORT-P");







    private static final SubLList $list116 = list(makeSymbol("CANDIDATE-COL"), makeUninternedSymbol("TABLE-MT"), makeUninternedSymbol("TABLE-TV"));

    private static final SubLList $list117 = list(makeSymbol("COL"), makeUninternedSymbol("TABLE-MT"), makeUninternedSymbol("TABLE-TV"));

    private static final SubLList $list118 = cons(makeUninternedSymbol("KEY"), makeSymbol("MODULE"));

    // Definitions
    /**
     * Accessor: Takes NODE and DIRECTION, determines sbhl-graph from *sbhl-module*,
     * returns mt-links dictionary from DIRECTION field of direction-link.
     */
    @LispMethod(comment = "Accessor: Takes NODE and DIRECTION, determines sbhl-graph from *sbhl-module*,\r\nreturns mt-links dictionary from DIRECTION field of direction-link.\nAccessor: Takes NODE and DIRECTION, determines sbhl-graph from *sbhl-module*,\nreturns mt-links dictionary from DIRECTION field of direction-link.")
    public static final SubLObject sbhl_access_links_alt(SubLObject node, SubLObject direction) {
        {
            SubLObject result = NIL;
            SubLObject link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            result = sbhl_links.get_sbhl_mt_links(link, direction, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            return result;
        }
    }

    // Definitions
    /**
     * Accessor: Takes NODE and DIRECTION, determines sbhl-graph from *sbhl-module*,
     * returns mt-links dictionary from DIRECTION field of direction-link.
     */
    @LispMethod(comment = "Accessor: Takes NODE and DIRECTION, determines sbhl-graph from *sbhl-module*,\r\nreturns mt-links dictionary from DIRECTION field of direction-link.\nAccessor: Takes NODE and DIRECTION, determines sbhl-graph from *sbhl-module*,\nreturns mt-links dictionary from DIRECTION field of direction-link.")
    public static SubLObject sbhl_access_links(final SubLObject node, final SubLObject direction) {
        SubLObject result = NIL;
        final SubLObject link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        result = sbhl_links.get_sbhl_mt_links(link, direction, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        return result;
    }

    /**
     * Accessor: Takes NODE, determines sbhl-graph from *sbhl-module*,
     * returns mt-links dictionary from predicate-links field of direction-link,
     * which needs be an sbhl-directed-link. (@see get-sbhl-graph-link)
     */
    @LispMethod(comment = "Accessor: Takes NODE, determines sbhl-graph from *sbhl-module*,\r\nreturns mt-links dictionary from predicate-links field of direction-link,\r\nwhich needs be an sbhl-directed-link. (@see get-sbhl-graph-link)\nAccessor: Takes NODE, determines sbhl-graph from *sbhl-module*,\nreturns mt-links dictionary from predicate-links field of direction-link,\nwhich needs be an sbhl-directed-link. (@see get-sbhl-graph-link)")
    public static final SubLObject sbhl_predicate_links_alt(SubLObject node) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_access_links(node, $PREDICATE);
    }

    /**
     * Accessor: Takes NODE, determines sbhl-graph from *sbhl-module*,
     * returns mt-links dictionary from predicate-links field of direction-link,
     * which needs be an sbhl-directed-link. (@see get-sbhl-graph-link)
     */
    @LispMethod(comment = "Accessor: Takes NODE, determines sbhl-graph from *sbhl-module*,\r\nreturns mt-links dictionary from predicate-links field of direction-link,\r\nwhich needs be an sbhl-directed-link. (@see get-sbhl-graph-link)\nAccessor: Takes NODE, determines sbhl-graph from *sbhl-module*,\nreturns mt-links dictionary from predicate-links field of direction-link,\nwhich needs be an sbhl-directed-link. (@see get-sbhl-graph-link)")
    public static SubLObject sbhl_predicate_links(final SubLObject node) {
        return sbhl_access_links(node, $PREDICATE);
    }

    /**
     * Accessor: Takes NODE, determines sbhl-graph from *sbhl-module*,
     * returns mt-links dictionary from inverse-links field of direction-link,
     * which needs be an sbhl-directed-link. (@see get-sbhl-graph-link)
     */
    @LispMethod(comment = "Accessor: Takes NODE, determines sbhl-graph from *sbhl-module*,\r\nreturns mt-links dictionary from inverse-links field of direction-link,\r\nwhich needs be an sbhl-directed-link. (@see get-sbhl-graph-link)\nAccessor: Takes NODE, determines sbhl-graph from *sbhl-module*,\nreturns mt-links dictionary from inverse-links field of direction-link,\nwhich needs be an sbhl-directed-link. (@see get-sbhl-graph-link)")
    public static final SubLObject sbhl_inverse_links_alt(SubLObject node) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_access_links(node, $INVERSE);
    }

    /**
     * Accessor: Takes NODE, determines sbhl-graph from *sbhl-module*,
     * returns mt-links dictionary from inverse-links field of direction-link,
     * which needs be an sbhl-directed-link. (@see get-sbhl-graph-link)
     */
    @LispMethod(comment = "Accessor: Takes NODE, determines sbhl-graph from *sbhl-module*,\r\nreturns mt-links dictionary from inverse-links field of direction-link,\r\nwhich needs be an sbhl-directed-link. (@see get-sbhl-graph-link)\nAccessor: Takes NODE, determines sbhl-graph from *sbhl-module*,\nreturns mt-links dictionary from inverse-links field of direction-link,\nwhich needs be an sbhl-directed-link. (@see get-sbhl-graph-link)")
    public static SubLObject sbhl_inverse_links(final SubLObject node) {
        return sbhl_access_links(node, $INVERSE);
    }

    /**
     * Accessor: Takes NODE, determines sbhl-graph from *sbhl-module*,
     * returns mt-links (list) from links field of direction-link, which needs
     * be an sbhl-undirected-link. (@see get-sbhl-graph-link)
     */
    @LispMethod(comment = "Accessor: Takes NODE, determines sbhl-graph from *sbhl-module*,\r\nreturns mt-links (list) from links field of direction-link, which needs\r\nbe an sbhl-undirected-link. (@see get-sbhl-graph-link)\nAccessor: Takes NODE, determines sbhl-graph from *sbhl-module*,\nreturns mt-links (list) from links field of direction-link, which needs\nbe an sbhl-undirected-link. (@see get-sbhl-graph-link)")
    public static final SubLObject sbhl_undirected_links_alt(SubLObject node) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_access_links(node, $LINK);
    }

    /**
     * Accessor: Takes NODE, determines sbhl-graph from *sbhl-module*,
     * returns mt-links (list) from links field of direction-link, which needs
     * be an sbhl-undirected-link. (@see get-sbhl-graph-link)
     */
    @LispMethod(comment = "Accessor: Takes NODE, determines sbhl-graph from *sbhl-module*,\r\nreturns mt-links (list) from links field of direction-link, which needs\r\nbe an sbhl-undirected-link. (@see get-sbhl-graph-link)\nAccessor: Takes NODE, determines sbhl-graph from *sbhl-module*,\nreturns mt-links (list) from links field of direction-link, which needs\nbe an sbhl-undirected-link. (@see get-sbhl-graph-link)")
    public static SubLObject sbhl_undirected_links(final SubLObject node) {
        return sbhl_access_links(node, $LINK);
    }

    /**
     * Accessor: Takes NODE, DIRECTION, MT, and TV. Returns list of nodes for
     * TV field of tv-link specified by MT and DIRECTION. Requires *sbhl-module*
     * to be defined.
     */
    @LispMethod(comment = "Accessor: Takes NODE, DIRECTION, MT, and TV. Returns list of nodes for\r\nTV field of tv-link specified by MT and DIRECTION. Requires *sbhl-module*\r\nto be defined.\nAccessor: Takes NODE, DIRECTION, MT, and TV. Returns list of nodes for\nTV field of tv-link specified by MT and DIRECTION. Requires *sbhl-module*\nto be defined.")
    public static final SubLObject get_sbhl_graph_link_nodes_alt(SubLObject node, SubLObject direction, SubLObject mt, SubLObject tv) {
        {
            SubLObject mt_links = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_access_links(node, direction);
            if (NIL != mt_links) {
                {
                    SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
                    if (NIL != tv_links) {
                        return sbhl_links.get_sbhl_link_nodes(tv_links, tv);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Accessor: Takes NODE, DIRECTION, MT, and TV. Returns list of nodes for
     * TV field of tv-link specified by MT and DIRECTION. Requires *sbhl-module*
     * to be defined.
     */
    @LispMethod(comment = "Accessor: Takes NODE, DIRECTION, MT, and TV. Returns list of nodes for\r\nTV field of tv-link specified by MT and DIRECTION. Requires *sbhl-module*\r\nto be defined.\nAccessor: Takes NODE, DIRECTION, MT, and TV. Returns list of nodes for\nTV field of tv-link specified by MT and DIRECTION. Requires *sbhl-module*\nto be defined.")
    public static SubLObject get_sbhl_graph_link_nodes(final SubLObject node, final SubLObject direction, final SubLObject mt, final SubLObject tv) {
        final SubLObject mt_links = sbhl_access_links(node, direction);
        if (NIL != mt_links) {
            final SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
            if (NIL != tv_links) {
                return sbhl_links.get_sbhl_link_nodes(tv_links, tv);
            }
        }
        return NIL;
    }

    /**
     * Accessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of
     * tv-link specified by MT, and in either direction :predicate or :links,
     * depending on whether the module specifies directed or undirected links.
     * Requires *sbhl-module* to be defined. @see get-sbhl-link
     */
    @LispMethod(comment = "Accessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of\r\ntv-link specified by MT, and in either direction :predicate or :links,\r\ndepending on whether the module specifies directed or undirected links.\r\nRequires *sbhl-module* to be defined. @see get-sbhl-link\nAccessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of\ntv-link specified by MT, and in either direction :predicate or :links,\ndepending on whether the module specifies directed or undirected links.\nRequires *sbhl-module* to be defined. @see get-sbhl-link")
    public static final SubLObject get_sbhl_forward_link_nodes_alt(SubLObject node, SubLObject mt, SubLObject tv) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.get_sbhl_graph_link_nodes(node, sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), mt, tv);
    }

    /**
     * Accessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of
     * tv-link specified by MT, and in either direction :predicate or :links,
     * depending on whether the module specifies directed or undirected links.
     * Requires *sbhl-module* to be defined. @see get-sbhl-link
     */
    @LispMethod(comment = "Accessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of\r\ntv-link specified by MT, and in either direction :predicate or :links,\r\ndepending on whether the module specifies directed or undirected links.\r\nRequires *sbhl-module* to be defined. @see get-sbhl-link\nAccessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of\ntv-link specified by MT, and in either direction :predicate or :links,\ndepending on whether the module specifies directed or undirected links.\nRequires *sbhl-module* to be defined. @see get-sbhl-link")
    public static SubLObject get_sbhl_forward_link_nodes(final SubLObject node, final SubLObject mt, final SubLObject tv) {
        return get_sbhl_graph_link_nodes(node, sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), mt, tv);
    }

    /**
     * Accessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of
     * tv-link specified by MT, and in either direction :inverse or :link,
     * depending on whether the module specifies directed or undirected links.
     * Requires *sbhl-module* to be defined. @see get-sbhl-link
     */
    @LispMethod(comment = "Accessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of\r\ntv-link specified by MT, and in either direction :inverse or :link,\r\ndepending on whether the module specifies directed or undirected links.\r\nRequires *sbhl-module* to be defined. @see get-sbhl-link\nAccessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of\ntv-link specified by MT, and in either direction :inverse or :link,\ndepending on whether the module specifies directed or undirected links.\nRequires *sbhl-module* to be defined. @see get-sbhl-link")
    public static final SubLObject get_sbhl_backward_link_nodes_alt(SubLObject node, SubLObject mt, SubLObject tv) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.get_sbhl_graph_link_nodes(node, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), mt, tv);
    }

    /**
     * Accessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of
     * tv-link specified by MT, and in either direction :inverse or :link,
     * depending on whether the module specifies directed or undirected links.
     * Requires *sbhl-module* to be defined. @see get-sbhl-link
     */
    @LispMethod(comment = "Accessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of\r\ntv-link specified by MT, and in either direction :inverse or :link,\r\ndepending on whether the module specifies directed or undirected links.\r\nRequires *sbhl-module* to be defined. @see get-sbhl-link\nAccessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of\ntv-link specified by MT, and in either direction :inverse or :link,\ndepending on whether the module specifies directed or undirected links.\nRequires *sbhl-module* to be defined. @see get-sbhl-link")
    public static SubLObject get_sbhl_backward_link_nodes(final SubLObject node, final SubLObject mt, final SubLObject tv) {
        return get_sbhl_graph_link_nodes(node, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), mt, tv);
    }

    /**
     * Accessor: Takes NODE, DIRECTION, MT, and TV. Returns whether LINK-NODE
     * is a member of the list of nodes for TV field of tv-link specified by MT
     * and DIRECTION. Requires *sbhl-module* to be defined.
     */
    @LispMethod(comment = "Accessor: Takes NODE, DIRECTION, MT, and TV. Returns whether LINK-NODE\r\nis a member of the list of nodes for TV field of tv-link specified by MT\r\nand DIRECTION. Requires *sbhl-module* to be defined.\nAccessor: Takes NODE, DIRECTION, MT, and TV. Returns whether LINK-NODE\nis a member of the list of nodes for TV field of tv-link specified by MT\nand DIRECTION. Requires *sbhl-module* to be defined.")
    public static final SubLObject member_of_sbhl_link_nodesP_alt(SubLObject link_node, SubLObject node, SubLObject direction, SubLObject mt, SubLObject tv) {
        {
            SubLObject mt_links = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_access_links(node, direction);
            if (NIL != mt_links) {
                {
                    SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
                    if (NIL != tv_links) {
                        return subl_promotions.memberP(link_node, sbhl_links.get_sbhl_link_nodes(tv_links, tv), UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Accessor: Takes NODE, DIRECTION, MT, and TV. Returns whether LINK-NODE
     * is a member of the list of nodes for TV field of tv-link specified by MT
     * and DIRECTION. Requires *sbhl-module* to be defined.
     */
    @LispMethod(comment = "Accessor: Takes NODE, DIRECTION, MT, and TV. Returns whether LINK-NODE\r\nis a member of the list of nodes for TV field of tv-link specified by MT\r\nand DIRECTION. Requires *sbhl-module* to be defined.\nAccessor: Takes NODE, DIRECTION, MT, and TV. Returns whether LINK-NODE\nis a member of the list of nodes for TV field of tv-link specified by MT\nand DIRECTION. Requires *sbhl-module* to be defined.")
    public static SubLObject member_of_sbhl_link_nodesP(final SubLObject link_node, final SubLObject node, final SubLObject direction, final SubLObject mt, final SubLObject tv) {
        final SubLObject mt_links = sbhl_access_links(node, direction);
        if (NIL != mt_links) {
            final SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
            if (NIL != tv_links) {
                return subl_promotions.memberP(link_node, sbhl_links.get_sbhl_link_nodes(tv_links, tv), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Accessor: @return booleanp; whether NODE has no accessible links.
     *
     * @see do-accessible-sbhl-link-nodes
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE has no accessible links.\r\n\r\n@see do-accessible-sbhl-link-nodes")
    public static final SubLObject no_accessible_sbhl_nodes_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject rest = NIL;
                for (rest = accessible_modules; !((NIL != foundP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject module_var = rest.first();
                        {
                            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                {
                                    SubLObject node_1 = function_terms.naut_to_nart(node);
                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node_1)) {
                                        {
                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_1, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                            if (NIL != d_link) {
                                                {
                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links) {
                                                        {
                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                            while (!((NIL != foundP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        {
                                                                            SubLObject _prev_bind_0_2 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                {
                                                                                    SubLObject iteration_state_3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                    while (!((NIL != foundP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_3)))) {
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_3);
                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_4 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                            SubLObject rest_5 = NIL;
                                                                                                            for (rest_5 = new_list; !((NIL != foundP) || (NIL == rest_5)); rest_5 = rest_5.rest()) {
                                                                                                                {
                                                                                                                    SubLObject link_node = rest_5.first();
                                                                                                                    if (NIL != link_node) {
                                                                                                                        foundP = T;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_4, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            iteration_state_3 = dictionary_contents.do_dictionary_contents_next(iteration_state_3);
                                                                                        }
                                                                                    } 
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_3);
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_2, thread);
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
                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt3$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                    } else {
                                        if (NIL != obsolete.cnat_p(node_1, UNPROVIDED)) {
                                            {
                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                SubLObject rest_6 = NIL;
                                                for (rest_6 = new_list; !((NIL != foundP) || (NIL == rest_6)); rest_6 = rest_6.rest()) {
                                                    {
                                                        SubLObject generating_fn = rest_6.first();
                                                        {
                                                            SubLObject _prev_bind_0_7 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                {
                                                                    SubLObject link_nodes = funcall(generating_fn, node_1);
                                                                    SubLObject new_list_8 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                    SubLObject rest_9 = NIL;
                                                                    for (rest_9 = new_list_8; !((NIL != foundP) || (NIL == rest_9)); rest_9 = rest_9.rest()) {
                                                                        {
                                                                            SubLObject link_node = rest_9.first();
                                                                            if (NIL != link_node) {
                                                                                foundP = T;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_7, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return makeBoolean(NIL == foundP);
            }
        }
    }

    /**
     * Accessor: @return booleanp; whether NODE has no accessible links.
     *
     * @see do-accessible-sbhl-link-nodes
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE has no accessible links.\r\n\r\n@see do-accessible-sbhl-link-nodes")
    public static SubLObject no_accessible_sbhl_nodes_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject rest;
        SubLObject module_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject node_$1;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$2;
        SubLObject iteration_state_$3;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$3;
        SubLObject sol;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject link_node;
        SubLObject csome_list_var;
        SubLObject link_node2;
        SubLObject new_list;
        SubLObject rest_$5;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$4;
        SubLObject sol2;
        SubLObject link_nodes2;
        SubLObject set_contents_var2;
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject link_node3;
        SubLObject csome_list_var2;
        SubLObject link_node4;
        for (rest = NIL, rest = accessible_modules; (NIL == foundP) && (NIL != rest); rest = rest.rest()) {
            module_var = rest.first();
            _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                node_$1 = function_terms.naut_to_nart(node);
                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$1)) {
                    d_link = sbhl_graphs.get_sbhl_graph_link(node_$1, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                    if (NIL != d_link) {
                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        if (NIL != mt_links) {
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == foundP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                    _prev_bind_0_$2 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                        for (iteration_state_$3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == foundP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$3)); iteration_state_$3 = dictionary_contents.do_dictionary_contents_next(iteration_state_$3)) {
                                            thread.resetMultipleValues();
                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$3);
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                _prev_bind_0_$3 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                    sol = link_nodes;
                                                    if (NIL != set.set_p(sol)) {
                                                        set_contents_var = set.do_set_internal(sol);
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                            link_node = set_contents.do_set_contents_next(basis_object, state);
                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, link_node)) && (NIL != link_node)) {
                                                                foundP = T;
                                                            }
                                                        }
                                                    } else
                                                        if (sol.isList()) {
                                                            if (NIL == foundP) {
                                                                csome_list_var = sol;
                                                                link_node2 = NIL;
                                                                link_node2 = csome_list_var.first();
                                                                while ((NIL == foundP) && (NIL != csome_list_var)) {
                                                                    if (NIL != link_node2) {
                                                                        foundP = T;
                                                                    }
                                                                    csome_list_var = csome_list_var.rest();
                                                                    link_node2 = csome_list_var.first();
                                                                } 
                                                            }
                                                        } else {
                                                            Errors.error($str3$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$3, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$3);
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$2, thread);
                                    }
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    } else {
                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str4$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else
                    if (NIL != obsolete.cnat_p(node_$1, UNPROVIDED)) {
                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        for (rest_$5 = NIL, rest_$5 = new_list; (NIL == foundP) && (NIL != rest_$5); rest_$5 = rest_$5.rest()) {
                            generating_fn = rest_$5.first();
                            _prev_bind_0_$4 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                link_nodes2 = sol2 = funcall(generating_fn, node_$1);
                                if (NIL != set.set_p(sol2)) {
                                    set_contents_var2 = set.do_set_internal(sol2);
                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                        link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) && (NIL != link_node3)) {
                                            foundP = T;
                                        }
                                    }
                                } else
                                    if (sol2.isList()) {
                                        if (NIL == foundP) {
                                            csome_list_var2 = sol2;
                                            link_node4 = NIL;
                                            link_node4 = csome_list_var2.first();
                                            while ((NIL == foundP) && (NIL != csome_list_var2)) {
                                                if (NIL != link_node4) {
                                                    foundP = T;
                                                }
                                                csome_list_var2 = csome_list_var2.rest();
                                                link_node4 = csome_list_var2.first();
                                            } 
                                        }
                                    } else {
                                        Errors.error($str3$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                    }

                            } finally {
                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }

            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean(NIL == foundP);
    }

    /**
     * Accessor: @return listp; the microtheories in the link corresponding
     * to MODULE and NODE.
     */
    @LispMethod(comment = "Accessor: @return listp; the microtheories in the link corresponding\r\nto MODULE and NODE.\nAccessor: @return listp; the microtheories in the link corresponding\nto MODULE and NODE.")
    public static final SubLObject sbhl_link_mts_alt(SubLObject module, SubLObject node) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return list_utilities.remove_duplicate_forts(nconc(com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_forward_mts(module, node), com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_backward_mts(module, node)));
        } else {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_forward_mts(module, node);
        }
    }

    /**
     * Accessor: @return listp; the microtheories in the link corresponding
     * to MODULE and NODE.
     */
    @LispMethod(comment = "Accessor: @return listp; the microtheories in the link corresponding\r\nto MODULE and NODE.\nAccessor: @return listp; the microtheories in the link corresponding\nto MODULE and NODE.")
    public static SubLObject sbhl_link_mts(final SubLObject module, final SubLObject node) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return list_utilities.remove_duplicate_forts(nconc(sbhl_forward_mts(module, node), sbhl_backward_mts(module, node)));
        }
        return sbhl_forward_mts(module, node);
    }

    /**
     * Accessor: @return listp; the microtheories in the forward link
     * corresponding to MODULE and NODE.
     */
    @LispMethod(comment = "Accessor: @return listp; the microtheories in the forward link\r\ncorresponding to MODULE and NODE.\nAccessor: @return listp; the microtheories in the forward link\ncorresponding to MODULE and NODE.")
    public static final SubLObject sbhl_forward_mts_alt(SubLObject module, SubLObject node) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_links.get_sbhl_graph_link_mts(node, sbhl_module_utilities.get_sbhl_module_forward_direction(module), module);
    }

    /**
     * Accessor: @return listp; the microtheories in the forward link
     * corresponding to MODULE and NODE.
     */
    @LispMethod(comment = "Accessor: @return listp; the microtheories in the forward link\r\ncorresponding to MODULE and NODE.\nAccessor: @return listp; the microtheories in the forward link\ncorresponding to MODULE and NODE.")
    public static SubLObject sbhl_forward_mts(final SubLObject module, final SubLObject node) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_links.get_sbhl_graph_link_mts(node, sbhl_module_utilities.get_sbhl_module_forward_direction(module), module);
    }

    /**
     * Accessor: @return listp; the microtheories in the backward link
     * corresponding to MODULE and NODE.
     */
    @LispMethod(comment = "Accessor: @return listp; the microtheories in the backward link\r\ncorresponding to MODULE and NODE.\nAccessor: @return listp; the microtheories in the backward link\ncorresponding to MODULE and NODE.")
    public static final SubLObject sbhl_backward_mts_alt(SubLObject module, SubLObject node) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_links.get_sbhl_graph_link_mts(node, sbhl_module_utilities.get_sbhl_module_backward_direction(module), module);
    }

    /**
     * Accessor: @return listp; the microtheories in the backward link
     * corresponding to MODULE and NODE.
     */
    @LispMethod(comment = "Accessor: @return listp; the microtheories in the backward link\r\ncorresponding to MODULE and NODE.\nAccessor: @return listp; the microtheories in the backward link\ncorresponding to MODULE and NODE.")
    public static SubLObject sbhl_backward_mts(final SubLObject module, final SubLObject node) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_links.get_sbhl_graph_link_mts(node, sbhl_module_utilities.get_sbhl_module_backward_direction(module), module);
    }

    public static final SubLObject sbhl_link_nodes_by_iteration_alt(SubLObject node, SubLObject direction) {
        return NIL;
    }

    public static SubLObject sbhl_link_nodes_by_iteration(final SubLObject node, final SubLObject direction) {
        return NIL;
    }

    /**
     *
     *
     * @return listp; the asserted link nodes accessible by NODE via one
    sbhl-link-pred link, as specified by (get-sbhl-module), with
    sbhl-true? truth value. When MT is specified, returns those links
    within MT or one of its spec-mts; otherwise, uses current value of
    mt*, @see possibly-with-sbhl-mt-relevance. When TV is specified, check that it is
    #$ArbitraryTruth-JustificationTruth or one of its spec-attributes,
    and returns those links with relevant truth value; otherwise,
    assumes TV to be *sbhl-tv*; @see possibly-with-sbhl-tv. When
    WITH-CUTOFF-SUPPORT? is non-nil, calls
     * @see predicate-true-links-by-iteration.
     */
    @LispMethod(comment = "@return listp; the asserted link nodes accessible by NODE via one\r\nsbhl-link-pred link, as specified by (get-sbhl-module), with\r\nsbhl-true? truth value. When MT is specified, returns those links\r\nwithin MT or one of its spec-mts; otherwise, uses current value of\r\nmt*, @see possibly-with-sbhl-mt-relevance. When TV is specified, check that it is\r\n#$ArbitraryTruth-JustificationTruth or one of its spec-attributes,\r\nand returns those links with relevant truth value; otherwise,\r\nassumes TV to be *sbhl-tv*; @see possibly-with-sbhl-tv. When\r\nWITH-CUTOFF-SUPPORT? is non-nil, calls\r\n@see predicate-true-links-by-iteration.")
    public static final SubLObject sbhl_link_nodes_alt(SubLObject module, SubLObject node, SubLObject direction, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (with_cutoff_supportP == UNPROVIDED) {
            with_cutoff_supportP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_10 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = tv;
                                        {
                                            SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_12 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_search_truth_value_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                                                        } else {
                                                                            Errors.warn($str_alt12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if (NIL != with_cutoff_supportP) {
                                                    result = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_link_nodes_by_iteration(node, direction);
                                                } else {
                                                    {
                                                        SubLObject node_13 = function_terms.naut_to_nart(node);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_13)) {
                                                            {
                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_13, module);
                                                                if (NIL != d_link) {
                                                                    {
                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                                                                        if (NIL != mt_links) {
                                                                            {
                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject mt_14 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_14)) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_14, thread);
                                                                                                    {
                                                                                                        SubLObject iteration_state_16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_16)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            {
                                                                                                                SubLObject tv_17 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_16);
                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_17)) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_17, thread);
                                                                                                                            result = nconc(copy_list(link_nodes), result);
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_18, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                iteration_state_16 = dictionary_contents.do_dictionary_contents_next(iteration_state_16);
                                                                                                            }
                                                                                                        } 
                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_16);
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_15, thread);
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
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt3$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            }
                                                        } else {
                                                            if (NIL != obsolete.cnat_p(node_13, UNPROVIDED)) {
                                                                {
                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(direction, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module)))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(direction, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module);
                                                                    SubLObject cdolist_list_var = new_list;
                                                                    SubLObject generating_fn = NIL;
                                                                    for (generating_fn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , generating_fn = cdolist_list_var.first()) {
                                                                        {
                                                                            SubLObject _prev_bind_0_19 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                {
                                                                                    SubLObject link_nodes = funcall(generating_fn, node_13);
                                                                                    result = nconc(copy_list(link_nodes), result);
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_19, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_12, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_11, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_10, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @return listp; the asserted link nodes accessible by NODE via one
    sbhl-link-pred link, as specified by (get-sbhl-module), with
    sbhl-true? truth value. When MT is specified, returns those links
    within MT or one of its spec-mts; otherwise, uses current value of
    mt*, @see possibly-with-sbhl-mt-relevance. When TV is specified, check that it is
    #$ArbitraryTruth-JustificationTruth or one of its spec-attributes,
    and returns those links with relevant truth value; otherwise,
    assumes TV to be *sbhl-tv*; @see possibly-with-sbhl-tv. When
    WITH-CUTOFF-SUPPORT? is non-nil, calls
     * @see predicate-true-links-by-iteration.
     */
    @LispMethod(comment = "@return listp; the asserted link nodes accessible by NODE via one\r\nsbhl-link-pred link, as specified by (get-sbhl-module), with\r\nsbhl-true? truth value. When MT is specified, returns those links\r\nwithin MT or one of its spec-mts; otherwise, uses current value of\r\nmt*, @see possibly-with-sbhl-mt-relevance. When TV is specified, check that it is\r\n#$ArbitraryTruth-JustificationTruth or one of its spec-attributes,\r\nand returns those links with relevant truth value; otherwise,\r\nassumes TV to be *sbhl-tv*; @see possibly-with-sbhl-tv. When\r\nWITH-CUTOFF-SUPPORT? is non-nil, calls\r\n@see predicate-true-links-by-iteration.")
    public static SubLObject sbhl_link_nodes(final SubLObject module, final SubLObject node, final SubLObject direction, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (with_cutoff_supportP == UNPROVIDED) {
            with_cutoff_supportP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(direction, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_search_truth_value_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                } else {
                                    Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                }


                    }
                    if (NIL != with_cutoff_supportP) {
                        result = sbhl_link_nodes_by_iteration(node, direction);
                    } else {
                        final SubLObject node_$11 = function_terms.naut_to_nart(node);
                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$11)) {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$11, module);
                            if (NIL != d_link) {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                                if (NIL != mt_links) {
                                    SubLObject iteration_state;
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        final SubLObject mt_$12 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        final SubLObject tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$12)) {
                                            final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$12, thread);
                                                SubLObject iteration_state_$14;
                                                for (iteration_state_$14 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$14); iteration_state_$14 = dictionary_contents.do_dictionary_contents_next(iteration_state_$14)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject tv_$15 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$14);
                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$15)) {
                                                        final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_$15, thread);
                                                            result = nconc(link_nodes.isList() ? copy_list(link_nodes) : set.set_element_list(link_nodes), result);
                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$10, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$14);
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$9, thread);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str4$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != obsolete.cnat_p(node_$11, UNPROVIDED)) {
                                SubLObject cdolist_list_var;
                                final SubLObject new_list = cdolist_list_var = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(direction, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module)) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(direction, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module);
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        final SubLObject link_nodes2 = funcall(generating_fn, node_$11);
                                        result = nconc(link_nodes2.isList() ? copy_list(link_nodes2) : set.set_element_list(link_nodes2), result);
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$11, thread);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    generating_fn = cdolist_list_var.first();
                                } 
                            }

                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$9, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$8, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$8, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$7, thread);
            }
        } finally {
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether there are any sbhl-link-nodes
     */
    @LispMethod(comment = "@return booleanp; whether there are any sbhl-link-nodes")
    public static final SubLObject sbhl_link_nodes_p_alt(SubLObject module, SubLObject node, SubLObject direction, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_20 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = tv;
                                        {
                                            SubLObject _prev_bind_0_21 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_22 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_search_truth_value_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                                                        } else {
                                                                            Errors.warn($str_alt12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject node_23 = function_terms.naut_to_nart(node);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node_23)) {
                                                        {
                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_23, module);
                                                            if (NIL != d_link) {
                                                                {
                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                                                                    if (NIL != mt_links) {
                                                                        {
                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject mt_24 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_24)) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_24, thread);
                                                                                                {
                                                                                                    SubLObject iteration_state_26 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_26)) {
                                                                                                        thread.resetMultipleValues();
                                                                                                        {
                                                                                                            SubLObject tv_27 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_26);
                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_27)) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_27, thread);
                                                                                                                        result = list_utilities.sublisp_boolean(link_nodes);
                                                                                                                    } finally {
                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_28, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            iteration_state_26 = dictionary_contents.do_dictionary_contents_next(iteration_state_26);
                                                                                                        }
                                                                                                    } 
                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_26);
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_25, thread);
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
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt3$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        }
                                                    } else {
                                                        if (NIL != obsolete.cnat_p(node_23, UNPROVIDED)) {
                                                            {
                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(direction, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module)))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(direction, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module);
                                                                SubLObject cdolist_list_var = new_list;
                                                                SubLObject generating_fn = NIL;
                                                                for (generating_fn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , generating_fn = cdolist_list_var.first()) {
                                                                    {
                                                                        SubLObject _prev_bind_0_29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            {
                                                                                SubLObject link_nodes = funcall(generating_fn, node_23);
                                                                                result = list_utilities.sublisp_boolean(link_nodes);
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_29, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_22, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_21, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_20, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether there are any sbhl-link-nodes
     */
    @LispMethod(comment = "@return booleanp; whether there are any sbhl-link-nodes")
    public static SubLObject sbhl_link_nodes_p(final SubLObject module, final SubLObject node, final SubLObject direction, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(direction, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$18 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$19 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_search_truth_value_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                } else {
                                    Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                }


                    }
                    final SubLObject node_$22 = function_terms.naut_to_nart(node);
                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$22)) {
                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$22, module);
                        if (NIL != d_link) {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                            if (NIL != mt_links) {
                                SubLObject iteration_state;
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    final SubLObject mt_$23 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$23)) {
                                        final SubLObject _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                        try {
                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$23, thread);
                                            SubLObject iteration_state_$25;
                                            for (iteration_state_$25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$25); iteration_state_$25 = dictionary_contents.do_dictionary_contents_next(iteration_state_$25)) {
                                                thread.resetMultipleValues();
                                                final SubLObject tv_$26 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$25);
                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$26)) {
                                                    final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                    try {
                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$26, thread);
                                                        result = list_utilities.sublisp_boolean(link_nodes);
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$21, thread);
                                                    }
                                                }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$25);
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$20, thread);
                                        }
                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        } else {
                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str4$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } else
                        if (NIL != obsolete.cnat_p(node_$22, UNPROVIDED)) {
                            SubLObject cdolist_list_var;
                            final SubLObject new_list = cdolist_list_var = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(direction, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module)) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(direction, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module);
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                try {
                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                    final SubLObject link_nodes2 = funcall(generating_fn, node_$22);
                                    result = list_utilities.sublisp_boolean(link_nodes2);
                                } finally {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$22, thread);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                generating_fn = cdolist_list_var.first();
                            } 
                        }

                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$20, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$19, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$19, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$18, thread);
            }
        } finally {
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sbhl_forward_true_link_nodes_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (with_cutoff_supportP == UNPROVIDED) {
            with_cutoff_supportP = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject direction = sbhl_module_utilities.get_sbhl_module_forward_direction(module);
            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_link_nodes(module, node, direction, mt, tv, with_cutoff_supportP);
            } else {
                if (NIL == tv) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_link_nodes(module, node, direction, mt, $$True_JustificationTruth, with_cutoff_supportP);
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt14$tv___a__does_not_satisfy_sbhl_tru, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt15$sbhl_link_nodes_never_called_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_forward_true_link_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (with_cutoff_supportP == UNPROVIDED) {
            with_cutoff_supportP = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject direction = sbhl_module_utilities.get_sbhl_module_forward_direction(module);
        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
            return sbhl_link_nodes(module, node, direction, mt, tv, with_cutoff_supportP);
        }
        if (NIL == tv) {
            return sbhl_link_nodes(module, node, direction, mt, $$True_JustificationTruth, with_cutoff_supportP);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str15$tv___a__does_not_satisfy_sbhl_tru, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str16$sbhl_link_nodes_never_called_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject sbhl_forward_false_link_nodes_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (with_cutoff_supportP == UNPROVIDED) {
            with_cutoff_supportP = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject direction = sbhl_module_utilities.get_sbhl_module_forward_direction(module);
            if (NIL != sbhl_search_vars.sbhl_false_tv_p(tv)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_link_nodes(module, node, direction, mt, tv, with_cutoff_supportP);
            } else {
                if (NIL == tv) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_link_nodes(module, node, direction, mt, $$False_JustificationTruth, with_cutoff_supportP);
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt17$tv___a__does_not_satisfy_sbhl_fal, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt15$sbhl_link_nodes_never_called_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_forward_false_link_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (with_cutoff_supportP == UNPROVIDED) {
            with_cutoff_supportP = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject direction = sbhl_module_utilities.get_sbhl_module_forward_direction(module);
        if (NIL != sbhl_search_vars.sbhl_false_tv_p(tv)) {
            return sbhl_link_nodes(module, node, direction, mt, tv, with_cutoff_supportP);
        }
        if (NIL == tv) {
            return sbhl_link_nodes(module, node, direction, mt, $$False_JustificationTruth, with_cutoff_supportP);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str18$tv___a__does_not_satisfy_sbhl_fal, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str16$sbhl_link_nodes_never_called_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject sbhl_backward_true_link_nodes_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (with_cutoff_supportP == UNPROVIDED) {
            with_cutoff_supportP = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_link_nodes(module, node, direction, mt, tv, with_cutoff_supportP);
            } else {
                if (NIL == tv) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_link_nodes(module, node, direction, mt, $$True_JustificationTruth, with_cutoff_supportP);
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt14$tv___a__does_not_satisfy_sbhl_tru, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt15$sbhl_link_nodes_never_called_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_backward_true_link_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (with_cutoff_supportP == UNPROVIDED) {
            with_cutoff_supportP = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
            return sbhl_link_nodes(module, node, direction, mt, tv, with_cutoff_supportP);
        }
        if (NIL == tv) {
            return sbhl_link_nodes(module, node, direction, mt, $$True_JustificationTruth, with_cutoff_supportP);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str15$tv___a__does_not_satisfy_sbhl_tru, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str16$sbhl_link_nodes_never_called_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject sbhl_backward_true_link_nodes_p_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_link_nodes_p(module, node, direction, mt, tv);
            } else {
                if (NIL == tv) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_link_nodes_p(module, node, direction, mt, $$True_JustificationTruth);
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt14$tv___a__does_not_satisfy_sbhl_tru, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt15$sbhl_link_nodes_never_called_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_backward_true_link_nodes_p(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
            return sbhl_link_nodes_p(module, node, direction, mt, tv);
        }
        if (NIL == tv) {
            return sbhl_link_nodes_p(module, node, direction, mt, $$True_JustificationTruth);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str15$tv___a__does_not_satisfy_sbhl_tru, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str16$sbhl_link_nodes_never_called_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject sbhl_backward_false_link_nodes_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (with_cutoff_supportP == UNPROVIDED) {
            with_cutoff_supportP = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
            if (NIL != sbhl_search_vars.sbhl_false_tv_p(tv)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_link_nodes(module, node, direction, mt, tv, with_cutoff_supportP);
            } else {
                if (NIL == tv) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_link_nodes(module, node, direction, mt, $$False_JustificationTruth, with_cutoff_supportP);
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt17$tv___a__does_not_satisfy_sbhl_fal, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt15$sbhl_link_nodes_never_called_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_backward_false_link_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (with_cutoff_supportP == UNPROVIDED) {
            with_cutoff_supportP = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
        if (NIL != sbhl_search_vars.sbhl_false_tv_p(tv)) {
            return sbhl_link_nodes(module, node, direction, mt, tv, with_cutoff_supportP);
        }
        if (NIL == tv) {
            return sbhl_link_nodes(module, node, direction, mt, $$False_JustificationTruth, with_cutoff_supportP);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str18$tv___a__does_not_satisfy_sbhl_fal, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str16$sbhl_link_nodes_never_called_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @return listp; Assumes TRUE tv, and forward direction and returns
    the link-nodes of NODE in MODULE which match MT
     */
    @LispMethod(comment = "@return listp; Assumes TRUE tv, and forward direction and returns\r\nthe link-nodes of NODE in MODULE which match MT")
    public static final SubLObject sbhl_mt_matching_link_nodes_alt(SubLObject module, SubLObject node, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        {
                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
                            if (NIL != d_link) {
                                {
                                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(module);
                                    SubLObject direction = NIL;
                                    for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                        {
                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                                            if (NIL != mt_links) {
                                                if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) {
                                                    {
                                                        SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
                                                        if (NIL != tv_links) {
                                                            {
                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                                                            {
                                                                                SubLObject cdolist_list_var_30 = link_nodes;
                                                                                SubLObject link_node = NIL;
                                                                                for (link_node = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest() , link_node = cdolist_list_var_30.first()) {
                                                                                    result = cons(link_node, result);
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
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @return listp; Assumes TRUE tv, and forward direction and returns
    the link-nodes of NODE in MODULE which match MT
     */
    @LispMethod(comment = "@return listp; Assumes TRUE tv, and forward direction and returns\r\nthe link-nodes of NODE in MODULE which match MT")
    public static SubLObject sbhl_mt_matching_link_nodes(final SubLObject module, final SubLObject node, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
            if (NIL != d_link) {
                SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(module);
                SubLObject direction = NIL;
                direction = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                    if ((NIL != mt_links) && (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction))) {
                        final SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
                        if (NIL != tv_links) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject link_nodes = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                    final SubLObject sol = link_nodes;
                                    if (NIL != set.set_p(sol)) {
                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                        SubLObject basis_object;
                                        SubLObject state;
                                        SubLObject link_node;
                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                            link_node = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                result = cons(link_node, result);
                                            }
                                        }
                                    } else
                                        if (sol.isList()) {
                                            SubLObject csome_list_var = sol;
                                            SubLObject link_node2 = NIL;
                                            link_node2 = csome_list_var.first();
                                            while (NIL != csome_list_var) {
                                                result = cons(link_node2, result);
                                                csome_list_var = csome_list_var.rest();
                                                link_node2 = csome_list_var.first();
                                            } 
                                        } else {
                                            Errors.error($str3$_A_is_neither_SET_P_nor_LISTP_, sol);
                                        }

                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    direction = cdolist_list_var.first();
                } 
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp. Entry function for @see sbhl-siblings. Steps
    backwards then forwards over links.
     */
    @LispMethod(comment = "@return listp. Entry function for @see sbhl-siblings. Steps\r\nbackwards then forwards over links.")
    public static final SubLObject sbhl_siblings_forward_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject backward_nodes = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_backward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = backward_nodes;
            SubLObject back_node = NIL;
            for (back_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , back_node = cdolist_list_var.first()) {
                result = nconc(com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_forward_true_link_nodes(module, back_node, mt, tv, UNPROVIDED), result);
            }
            result = remove(node, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return listp. Entry function for @see sbhl-siblings. Steps
    backwards then forwards over links.
     */
    @LispMethod(comment = "@return listp. Entry function for @see sbhl-siblings. Steps\r\nbackwards then forwards over links.")
    public static SubLObject sbhl_siblings_forward(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject backward_nodes = sbhl_backward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject sol = backward_nodes;
        if (NIL != set.set_p(sol)) {
            final SubLObject set_contents_var = set.do_set_internal(sol);
            SubLObject basis_object;
            SubLObject state;
            SubLObject back_node;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                back_node = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, back_node)) {
                    result = nconc(sbhl_forward_true_link_nodes(module, back_node, mt, tv, UNPROVIDED), result);
                }
            }
        } else
            if (sol.isList()) {
                SubLObject csome_list_var = sol;
                SubLObject back_node2 = NIL;
                back_node2 = csome_list_var.first();
                while (NIL != csome_list_var) {
                    result = nconc(sbhl_forward_true_link_nodes(module, back_node2, mt, tv, UNPROVIDED), result);
                    csome_list_var = csome_list_var.rest();
                    back_node2 = csome_list_var.first();
                } 
            } else {
                Errors.error($str3$_A_is_neither_SET_P_nor_LISTP_, sol);
            }

        result = remove(node, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp. Entry function for @see sbhl-siblings. Steps
    forwards then backwards over links.
     */
    @LispMethod(comment = "@return listp. Entry function for @see sbhl-siblings. Steps\r\nforwards then backwards over links.")
    public static final SubLObject sbhl_siblings_backward_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject forward_nodes = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = forward_nodes;
            SubLObject forward_node = NIL;
            for (forward_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , forward_node = cdolist_list_var.first()) {
                result = nconc(com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_backward_true_link_nodes(module, forward_node, mt, tv, UNPROVIDED), result);
            }
            result = remove(node, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return listp. Entry function for @see sbhl-siblings. Steps
    forwards then backwards over links.
     */
    @LispMethod(comment = "@return listp. Entry function for @see sbhl-siblings. Steps\r\nforwards then backwards over links.")
    public static SubLObject sbhl_siblings_backward(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject forward_nodes = sbhl_forward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject sol = forward_nodes;
        if (NIL != set.set_p(sol)) {
            final SubLObject set_contents_var = set.do_set_internal(sol);
            SubLObject basis_object;
            SubLObject state;
            SubLObject forward_node;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                forward_node = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, forward_node)) {
                    result = nconc(sbhl_backward_true_link_nodes(module, forward_node, mt, tv, UNPROVIDED), result);
                }
            }
        } else
            if (sol.isList()) {
                SubLObject csome_list_var = sol;
                SubLObject forward_node2 = NIL;
                forward_node2 = csome_list_var.first();
                while (NIL != csome_list_var) {
                    result = nconc(sbhl_backward_true_link_nodes(module, forward_node2, mt, tv, UNPROVIDED), result);
                    csome_list_var = csome_list_var.rest();
                    forward_node2 = csome_list_var.first();
                } 
            } else {
                Errors.error($str3$_A_is_neither_SET_P_nor_LISTP_, sol);
            }

        result = remove(node, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_sbhl_graph_link(final SubLObject node, final SubLObject module, final SubLObject direction) {
        if (module.eql(sbhl_module_vars.get_sbhl_module($$isa))) {
            return make_sbhl_graph_link_isa(node, module, direction);
        }
        if (module.eql(sbhl_module_vars.get_sbhl_module($$quotedIsa))) {
            return make_sbhl_graph_link_quoted_isa(node, module, direction);
        }
        if (module.eql(sbhl_module_vars.get_sbhl_module($$genls))) {
            return make_sbhl_graph_link_genls(node, module, direction);
        }
        if (module.eql(sbhl_module_vars.get_sbhl_module($$genlPreds))) {
            return make_sbhl_graph_link_genl_preds(node, module, direction);
        }
        if (module.eql(sbhl_module_vars.get_sbhl_module($$genlMt))) {
            return make_sbhl_graph_link_genl_mt(node, module, direction);
        }
        return make_sbhl_graph_link_other(node, module, direction);
    }

    public static SubLObject clear_make_sbhl_graph_link_isa() {
        final SubLObject cs = $make_sbhl_graph_link_isa_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_make_sbhl_graph_link_isa(final SubLObject node, final SubLObject module, final SubLObject direction) {
        return memoization_state.caching_state_remove_function_results_with_args($make_sbhl_graph_link_isa_caching_state$.getGlobalValue(), list(node, module, direction), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_sbhl_graph_link_isa_internal(final SubLObject node, final SubLObject module, final SubLObject direction) {
        return make_sbhl_graph_link_int(node, module, direction);
    }

    public static SubLObject make_sbhl_graph_link_isa(final SubLObject node, final SubLObject module, final SubLObject direction) {
        SubLObject caching_state = $make_sbhl_graph_link_isa_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MAKE_SBHL_GRAPH_LINK_ISA, $make_sbhl_graph_link_isa_caching_state$, NIL, EQL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback(CLEAR_MAKE_SBHL_GRAPH_LINK_ISA);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(node, module, direction);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (node.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (module.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && direction.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(make_sbhl_graph_link_isa_internal(node, module, direction)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(node, module, direction));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_make_sbhl_graph_link_quoted_isa() {
        final SubLObject cs = $make_sbhl_graph_link_quoted_isa_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_make_sbhl_graph_link_quoted_isa(final SubLObject node, final SubLObject module, final SubLObject direction) {
        return memoization_state.caching_state_remove_function_results_with_args($make_sbhl_graph_link_quoted_isa_caching_state$.getGlobalValue(), list(node, module, direction), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_sbhl_graph_link_quoted_isa_internal(final SubLObject node, final SubLObject module, final SubLObject direction) {
        return make_sbhl_graph_link_int(node, module, direction);
    }

    public static SubLObject make_sbhl_graph_link_quoted_isa(final SubLObject node, final SubLObject module, final SubLObject direction) {
        SubLObject caching_state = $make_sbhl_graph_link_quoted_isa_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MAKE_SBHL_GRAPH_LINK_QUOTED_ISA, $make_sbhl_graph_link_quoted_isa_caching_state$, NIL, EQL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_quoted_isa_dependent_cache_clear_callback(CLEAR_MAKE_SBHL_GRAPH_LINK_QUOTED_ISA);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(node, module, direction);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (node.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (module.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && direction.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(make_sbhl_graph_link_quoted_isa_internal(node, module, direction)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(node, module, direction));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_make_sbhl_graph_link_genls() {
        final SubLObject cs = $make_sbhl_graph_link_genls_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_make_sbhl_graph_link_genls(final SubLObject node, final SubLObject module, final SubLObject direction) {
        return memoization_state.caching_state_remove_function_results_with_args($make_sbhl_graph_link_genls_caching_state$.getGlobalValue(), list(node, module, direction), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_sbhl_graph_link_genls_internal(final SubLObject node, final SubLObject module, final SubLObject direction) {
        return make_sbhl_graph_link_int(node, module, direction);
    }

    public static SubLObject make_sbhl_graph_link_genls(final SubLObject node, final SubLObject module, final SubLObject direction) {
        SubLObject caching_state = $make_sbhl_graph_link_genls_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MAKE_SBHL_GRAPH_LINK_GENLS, $make_sbhl_graph_link_genls_caching_state$, NIL, EQL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback(CLEAR_MAKE_SBHL_GRAPH_LINK_GENLS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(node, module, direction);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (node.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (module.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && direction.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(make_sbhl_graph_link_genls_internal(node, module, direction)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(node, module, direction));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_make_sbhl_graph_link_genl_preds() {
        final SubLObject cs = $make_sbhl_graph_link_genl_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_make_sbhl_graph_link_genl_preds(final SubLObject node, final SubLObject module, final SubLObject direction) {
        return memoization_state.caching_state_remove_function_results_with_args($make_sbhl_graph_link_genl_preds_caching_state$.getGlobalValue(), list(node, module, direction), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_sbhl_graph_link_genl_preds_internal(final SubLObject node, final SubLObject module, final SubLObject direction) {
        return make_sbhl_graph_link_int(node, module, direction);
    }

    public static SubLObject make_sbhl_graph_link_genl_preds(final SubLObject node, final SubLObject module, final SubLObject direction) {
        SubLObject caching_state = $make_sbhl_graph_link_genl_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MAKE_SBHL_GRAPH_LINK_GENL_PREDS, $make_sbhl_graph_link_genl_preds_caching_state$, NIL, EQL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_MAKE_SBHL_GRAPH_LINK_GENL_PREDS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(node, module, direction);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (node.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (module.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && direction.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(make_sbhl_graph_link_genl_preds_internal(node, module, direction)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(node, module, direction));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_make_sbhl_graph_link_genl_mt() {
        final SubLObject cs = $make_sbhl_graph_link_genl_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_make_sbhl_graph_link_genl_mt(final SubLObject node, final SubLObject module, final SubLObject direction) {
        return memoization_state.caching_state_remove_function_results_with_args($make_sbhl_graph_link_genl_mt_caching_state$.getGlobalValue(), list(node, module, direction), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_sbhl_graph_link_genl_mt_internal(final SubLObject node, final SubLObject module, final SubLObject direction) {
        return make_sbhl_graph_link_int(node, module, direction);
    }

    public static SubLObject make_sbhl_graph_link_genl_mt(final SubLObject node, final SubLObject module, final SubLObject direction) {
        SubLObject caching_state = $make_sbhl_graph_link_genl_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MAKE_SBHL_GRAPH_LINK_GENL_MT, $make_sbhl_graph_link_genl_mt_caching_state$, NIL, EQL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback(CLEAR_MAKE_SBHL_GRAPH_LINK_GENL_MT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(node, module, direction);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (node.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (module.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && direction.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(make_sbhl_graph_link_genl_mt_internal(node, module, direction)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(node, module, direction));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_make_sbhl_graph_link_other() {
        final SubLObject cs = $make_sbhl_graph_link_other_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_make_sbhl_graph_link_other(final SubLObject node, final SubLObject module, final SubLObject direction) {
        return memoization_state.caching_state_remove_function_results_with_args($make_sbhl_graph_link_other_caching_state$.getGlobalValue(), list(node, module, direction), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_sbhl_graph_link_other_internal(final SubLObject node, final SubLObject module, final SubLObject direction) {
        return make_sbhl_graph_link_int(node, module, direction);
    }

    public static SubLObject make_sbhl_graph_link_other(final SubLObject node, final SubLObject module, final SubLObject direction) {
        SubLObject caching_state = $make_sbhl_graph_link_other_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MAKE_SBHL_GRAPH_LINK_OTHER, $make_sbhl_graph_link_other_caching_state$, NIL, EQL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_MAKE_SBHL_GRAPH_LINK_OTHER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(node, module, direction);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (node.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (module.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && direction.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(make_sbhl_graph_link_other_internal(node, module, direction)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(node, module, direction));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject make_sbhl_graph_link_int(final SubLObject node, final SubLObject module, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = sbhl_module_vars.get_sbhl_module_link_pred(module);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            if (direction.eql(sbhl_link_vars.get_sbhl_forward_directed_direction())) {
                SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(node, pred, ONE_INTEGER, UNPROVIDED);
                SubLObject sbhl_gaf = NIL;
                sbhl_gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject mt = assertions_high.assertion_mt(sbhl_gaf);
                    final SubLObject tv = sbhl_link_vars.support_tv_to_sbhl_tv(assertions_low.assertion_tv(sbhl_gaf));
                    final SubLObject arg2 = assertions_high.gaf_arg2(sbhl_gaf);
                    result = (NIL != result) ? add_to_sbhl_link(result, mt, direction, tv, arg2) : create_new_sbhl_link(direction, mt, tv, arg2, module);
                    cdolist_list_var = cdolist_list_var.rest();
                    sbhl_gaf = cdolist_list_var.first();
                } 
            } else
                if (direction.eql(sbhl_link_vars.get_sbhl_backward_directed_direction())) {
                    SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(node, pred, TWO_INTEGER, UNPROVIDED);
                    SubLObject sbhl_gaf = NIL;
                    sbhl_gaf = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject mt = assertions_high.assertion_mt(sbhl_gaf);
                        final SubLObject tv = sbhl_link_vars.support_tv_to_sbhl_tv(assertions_low.assertion_tv(sbhl_gaf));
                        final SubLObject arg3 = assertions_high.gaf_arg1(sbhl_gaf);
                        result = (NIL != result) ? add_to_sbhl_link(result, mt, direction, tv, arg3) : create_new_sbhl_link(direction, mt, tv, arg3, module);
                        cdolist_list_var = cdolist_list_var.rest();
                        sbhl_gaf = cdolist_list_var.first();
                    } 
                }

        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns a new sbhl direction link created from scratch from args.
     */
    @LispMethod(comment = "Returns a new sbhl direction link created from scratch from args.")
    public static final SubLObject create_new_sbhl_link_alt(SubLObject direction, SubLObject mt, SubLObject tv, SubLObject node, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        if (NIL != module) {
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        }
        {
            SubLObject link = NIL;
            link = sbhl_links.create_sbhl_direction_link(direction, sbhl_links.create_sbhl_mt_links(mt, sbhl_links.create_sbhl_tv_links(tv, node)), module);
            return link;
        }
    }

    /**
     * Returns a new sbhl direction link created from scratch from args.
     */
    @LispMethod(comment = "Returns a new sbhl direction link created from scratch from args.")
    public static SubLObject create_new_sbhl_link(final SubLObject direction, final SubLObject mt, final SubLObject tv, final SubLObject node, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        if (((NIL != module) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sbhl_module_vars.sbhl_module_p(module))) {
            throw new AssertionError(module);
        }
        SubLObject link = NIL;
        link = sbhl_links.create_sbhl_direction_link(direction, sbhl_links.create_sbhl_mt_links(mt, sbhl_links.create_sbhl_tv_links(tv, node)), module);
        return link;
    }

    /**
     * stores a new link in the graph corresponding to MODULE using args to initialize the link
     */
    @LispMethod(comment = "stores a new link in the graph corresponding to MODULE using args to initialize the link")
    public static final SubLObject create_and_store_sbhl_link_alt(SubLObject arg1, SubLObject arg2, SubLObject direction, SubLObject mt, SubLObject tv, SubLObject module) {
        if (NIL != module) {
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        }
        sbhl_graphs.set_sbhl_graph_link(arg1, com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.create_new_sbhl_link(direction, mt, tv, arg2, module), module);
        return NIL;
    }

    /**
     * stores a new link in the graph corresponding to MODULE using args to initialize the link
     */
    @LispMethod(comment = "stores a new link in the graph corresponding to MODULE using args to initialize the link")
    public static SubLObject create_and_store_sbhl_link(final SubLObject arg1, final SubLObject arg2, final SubLObject direction, final SubLObject mt, final SubLObject tv, final SubLObject module) {
        if (((NIL != module) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sbhl_module_vars.sbhl_module_p(module))) {
            throw new AssertionError(module);
        }
        sbhl_graphs.set_sbhl_graph_link(arg1, create_new_sbhl_link(direction, mt, tv, arg2, module), module);
        return NIL;
    }

    /**
     * Workhorse of link creation. Checks OLD-LINK and creates the necessary link substructures,
     * returns the new direction link
     */
    @LispMethod(comment = "Workhorse of link creation. Checks OLD-LINK and creates the necessary link substructures,\r\nreturns the new direction link\nWorkhorse of link creation. Checks OLD-LINK and creates the necessary link substructures,\nreturns the new direction link")
    public static final SubLObject add_to_sbhl_link_alt(SubLObject old_link, SubLObject mt, SubLObject direction, SubLObject tv, SubLObject node) {
        {
            SubLObject link = old_link;
            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(link, direction, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            if (NIL != mt_links) {
                {
                    SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
                    if (NIL != tv_links) {
                        sbhl_links.push_onto_sbhl_tv_links(tv_links, tv, node);
                    } else {
                        sbhl_links.set_sbhl_mt_links(mt_links, mt, sbhl_links.create_sbhl_tv_links(tv, node));
                    }
                }
            } else {
                sbhl_links.set_sbhl_direction_link(link, direction, sbhl_links.create_sbhl_mt_links(mt, sbhl_links.create_sbhl_tv_links(tv, node)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            }
            return link;
        }
    }

    /**
     * Workhorse of link creation. Checks OLD-LINK and creates the necessary link substructures,
     * returns the new direction link
     */
    @LispMethod(comment = "Workhorse of link creation. Checks OLD-LINK and creates the necessary link substructures,\r\nreturns the new direction link\nWorkhorse of link creation. Checks OLD-LINK and creates the necessary link substructures,\nreturns the new direction link")
    public static SubLObject add_to_sbhl_link(final SubLObject old_link, final SubLObject mt, final SubLObject direction, final SubLObject tv, final SubLObject node) {
        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(old_link, direction, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (NIL != mt_links) {
            final SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
            if (NIL != tv_links) {
                sbhl_links.push_onto_sbhl_tv_links(tv_links, tv, node);
            } else {
                sbhl_links.set_sbhl_mt_links(mt_links, mt, sbhl_links.create_sbhl_tv_links(tv, node));
            }
        } else {
            sbhl_links.set_sbhl_direction_link(old_link, direction, sbhl_links.create_sbhl_mt_links(mt, sbhl_links.create_sbhl_tv_links(tv, node)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        }
        return old_link;
    }

    /**
     * Calculates forward and backward links relevant to GAF specified by the arguments.
     * Store the link, creating proper substructures through @see add-to-sbhl-link,
     * create-and-store-sbhl-link. Will not add redundant links. Determines direction of
     * link with @see get-sbhl-index-arg. Requires *sbhl-module* to be defined.
     */
    @LispMethod(comment = "Calculates forward and backward links relevant to GAF specified by the arguments.\r\nStore the link, creating proper substructures through @see add-to-sbhl-link,\r\ncreate-and-store-sbhl-link. Will not add redundant links. Determines direction of\r\nlink with @see get-sbhl-index-arg. Requires *sbhl-module* to be defined.\nCalculates forward and backward links relevant to GAF specified by the arguments.\nStore the link, creating proper substructures through @see add-to-sbhl-link,\ncreate-and-store-sbhl-link. Will not add redundant links. Determines direction of\nlink with @see get-sbhl-index-arg. Requires *sbhl-module* to be defined.")
    public static final SubLObject store_in_sbhl_graph_alt(SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject tv) {
        if ((NIL != sbhl_link_vars.sbhl_node_object_p(arg1)) && (NIL != sbhl_link_vars.sbhl_node_object_p(arg2))) {
            if (tv != $UNKNOWN) {
                {
                    SubLObject module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
                    if (!((NIL != sbhl_module_utilities.sbhl_reflexive_module_p(module)) && arg1.equal(arg2))) {
                        {
                            SubLObject module_index_arg = sbhl_module_utilities.get_sbhl_index_arg(module);
                            SubLObject index_arg = (module_index_arg == ONE_INTEGER) ? ((SubLObject) (arg1)) : arg2;
                            SubLObject gather_arg = (module_index_arg == ONE_INTEGER) ? ((SubLObject) (arg2)) : arg1;
                            SubLObject forward_direction = sbhl_module_utilities.get_sbhl_module_forward_direction(module);
                            SubLObject backward_direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
                            SubLObject forward_link = sbhl_graphs.get_sbhl_graph_link(index_arg, module);
                            SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                            SubLObject needs_to_releaseP = NIL;
                            try {
                                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                                if (NIL != forward_link) {
                                    {
                                        SubLObject forward_link_nodes = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.get_sbhl_forward_link_nodes(index_arg, mt, tv);
                                        if (NIL == list_utilities.member_eqP(gather_arg, forward_link_nodes)) {
                                            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.add_to_sbhl_link(forward_link, mt, forward_direction, tv, gather_arg);
                                            sbhl_graphs.touch_sbhl_graph_link(index_arg, forward_link, module);
                                        }
                                    }
                                } else {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.create_and_store_sbhl_link(index_arg, gather_arg, forward_direction, mt, tv, module);
                                }
                                {
                                    SubLObject backward_link = sbhl_graphs.get_sbhl_graph_link(gather_arg, module);
                                    if (NIL != backward_link) {
                                        {
                                            SubLObject backward_link_nodes = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.get_sbhl_backward_link_nodes(gather_arg, mt, tv);
                                            if (NIL == list_utilities.member_eqP(index_arg, backward_link_nodes)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.add_to_sbhl_link(backward_link, mt, backward_direction, tv, index_arg);
                                                sbhl_graphs.touch_sbhl_graph_link(gather_arg, backward_link, module);
                                            }
                                        }
                                    } else {
                                        com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.create_and_store_sbhl_link(gather_arg, index_arg, backward_direction, mt, tv, module);
                                    }
                                }
                            } finally {
                                if (NIL != needs_to_releaseP) {
                                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.isa_to_naut_conditionsP(arg1, arg2)) {
                {
                    SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                        com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.store_isa_arg2_naut(arg1, arg2, mt, tv);
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Calculates forward and backward links relevant to GAF specified by the arguments.
     * Store the link, creating proper substructures through @see add-to-sbhl-link,
     * create-and-store-sbhl-link. Will not add redundant links. Determines direction of
     * link with @see get-sbhl-index-arg. Requires *sbhl-module* to be defined.
     */
    @LispMethod(comment = "Calculates forward and backward links relevant to GAF specified by the arguments.\r\nStore the link, creating proper substructures through @see add-to-sbhl-link,\r\ncreate-and-store-sbhl-link. Will not add redundant links. Determines direction of\r\nlink with @see get-sbhl-index-arg. Requires *sbhl-module* to be defined.\nCalculates forward and backward links relevant to GAF specified by the arguments.\nStore the link, creating proper substructures through @see add-to-sbhl-link,\ncreate-and-store-sbhl-link. Will not add redundant links. Determines direction of\nlink with @see get-sbhl-index-arg. Requires *sbhl-module* to be defined.")
    public static SubLObject store_in_sbhl_graph(final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        if ((NIL != sbhl_link_vars.sbhl_node_object_p(arg1)) && (NIL != sbhl_link_vars.sbhl_node_object_p(arg2))) {
            if (tv != $UNKNOWN) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
                if ((NIL == sbhl_module_utilities.sbhl_reflexive_module_p(module)) || (!arg1.equal(arg2))) {
                    final SubLObject module_index_arg = sbhl_module_utilities.get_sbhl_index_arg(module);
                    final SubLObject index_arg = (module_index_arg.eql(ONE_INTEGER)) ? arg1 : arg2;
                    final SubLObject gather_arg = (module_index_arg.eql(ONE_INTEGER)) ? arg2 : arg1;
                    final SubLObject forward_direction = sbhl_module_utilities.get_sbhl_module_forward_direction(module);
                    final SubLObject backward_direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
                    final SubLObject forward_link = sbhl_graphs.get_sbhl_graph_link(index_arg, module);
                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                        if (NIL != forward_link) {
                            final SubLObject forward_link_nodes = get_sbhl_forward_link_nodes(index_arg, mt, tv);
                            if (NIL == set.set_or_list_memberP(gather_arg, forward_link_nodes)) {
                                add_to_sbhl_link(forward_link, mt, forward_direction, tv, gather_arg);
                                sbhl_graphs.touch_sbhl_graph_link(index_arg, forward_link, module);
                            }
                        } else {
                            create_and_store_sbhl_link(index_arg, gather_arg, forward_direction, mt, tv, module);
                        }
                        final SubLObject backward_link = sbhl_graphs.get_sbhl_graph_link(gather_arg, module);
                        if (NIL != backward_link) {
                            final SubLObject backward_link_nodes = get_sbhl_backward_link_nodes(gather_arg, mt, tv);
                            if (NIL == set.set_or_list_memberP(index_arg, backward_link_nodes)) {
                                add_to_sbhl_link(backward_link, mt, backward_direction, tv, index_arg);
                                sbhl_graphs.touch_sbhl_graph_link(gather_arg, backward_link, module);
                            }
                        } else {
                            create_and_store_sbhl_link(gather_arg, index_arg, backward_direction, mt, tv, module);
                        }
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                        }
                    }
                }
            }
        } else
            if (NIL != isa_to_naut_conditionsP(arg1, arg2)) {
                final SubLObject rw_lock_var2 = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                SubLObject needs_to_releaseP2 = NIL;
                try {
                    needs_to_releaseP2 = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var2);
                    store_isa_arg2_naut(arg1, arg2, mt, tv);
                } finally {
                    if (NIL != needs_to_releaseP2) {
                        ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var2);
                    }
                }
            }

        return NIL;
    }

    /**
     * Top level iterator to create all sbhl-links (except for sbhl-time links).
     */
    @LispMethod(comment = "Top level iterator to create all sbhl-links (except for sbhl-time links).")
    public static final SubLObject make_all_sbhl_links_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.clear_all_sbhl_non_time_data();
            {
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$Initializing_SBHL_Graph_Links, STRINGP);
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
                        noting_percent_progress_preamble($$$Initializing_SBHL_Graph_Links);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject assertion = NIL;
                                while (NIL != id) {
                                    assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != gaf_assertionP(assertion)) {
                                            {
                                                SubLObject pred = gaf_arg(assertion, ZERO_INTEGER);
                                                if (NIL != sbhl_module_utilities.sbhl_non_time_predicate_p(pred)) {
                                                    {
                                                        SubLObject _prev_bind_0_31 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred), thread);
                                                            {
                                                                SubLObject sbhl_tv = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.assertion_sbhl_tv(assertion);
                                                                SubLObject mt = assertion_mt(assertion);
                                                                SubLObject arg1 = gaf_arg(assertion, ONE_INTEGER);
                                                                SubLObject arg2 = gaf_arg(assertion, TWO_INTEGER);
                                                                com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.store_in_sbhl_graph(arg1, arg2, mt, sbhl_tv);
                                                            }
                                                        } finally {
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_31, thread);
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
            sbhl_graphs.optimize_sbhl_store();
            return NIL;
        }
    }

    /**
     * Top level iterator to create all sbhl-links (except for sbhl-time links).
     */
    @LispMethod(comment = "Top level iterator to create all sbhl-links (except for sbhl-time links).")
    public static SubLObject make_all_sbhl_links() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_all_sbhl_non_time_data();
        final SubLObject list_var = sbhl_module_utilities.get_sbhl_predicates();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Initializing_all_SBHL_Graph_Links, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject pred = NIL;
                pred = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL != sbhl_module_utilities.sbhl_non_time_predicate_p(pred)) {
                        format(T, $str45$_______A, pred);
                        alexandria_iterators.clear_alexandria_caches();
                        final SubLObject _prev_bind_0_$29 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$30 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            final SubLObject pred_var = pred;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                final SubLObject str = NIL;
                                final SubLObject _prev_bind_0_$30 = $progress_start_time$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$31 = $progress_last_pacification_time$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$33 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$34 = $progress_notification_count$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$35 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                                final SubLObject _prev_bind_5_$36 = $progress_count$.currentBinding(thread);
                                final SubLObject _prev_bind_6_$37 = $is_noting_progressP$.currentBinding(thread);
                                final SubLObject _prev_bind_7_$38 = $silent_progressP$.currentBinding(thread);
                                try {
                                    $progress_start_time$.bind(get_universal_time(), thread);
                                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                    $progress_count$.bind(ZERO_INTEGER, thread);
                                    $is_noting_progressP$.bind(T, thread);
                                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                                    noting_progress_preamble(str);
                                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            note_progress();
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                SubLObject done_var_$39 = NIL;
                                                final SubLObject token_var_$40 = NIL;
                                                while (NIL == done_var_$39) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                                                    final SubLObject valid_$41 = makeBoolean(!token_var_$40.eql(assertion));
                                                    if (NIL != valid_$41) {
                                                        final SubLObject _prev_bind_0_$31 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred), thread);
                                                            final SubLObject sbhl_tv = assertion_sbhl_tv(assertion);
                                                            final SubLObject mt = assertions_high.assertion_mt(assertion);
                                                            final SubLObject arg1 = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                                            final SubLObject arg2 = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                            store_in_sbhl_graph(arg1, arg2, mt, sbhl_tv);
                                                        } finally {
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$31, thread);
                                                        }
                                                    }
                                                    done_var_$39 = makeBoolean(NIL == valid_$41);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                    noting_progress_postamble();
                                } finally {
                                    $silent_progressP$.rebind(_prev_bind_7_$38, thread);
                                    $is_noting_progressP$.rebind(_prev_bind_6_$37, thread);
                                    $progress_count$.rebind(_prev_bind_5_$36, thread);
                                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$35, thread);
                                    $progress_notification_count$.rebind(_prev_bind_3_$34, thread);
                                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$33, thread);
                                    $progress_last_pacification_time$.rebind(_prev_bind_1_$31, thread);
                                    $progress_start_time$.rebind(_prev_bind_0_$30, thread);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$30, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    pred = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
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
        sbhl_graphs.optimize_sbhl_store();
        return NIL;
    }

    public static SubLObject make_sbhl_links_for_module(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        sbhl_module_utilities.new_sbhl_module_graph(module);
        final SubLObject pred = sbhl_module_vars.get_sbhl_module_link_pred(module);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject pred_var = pred;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = cconcatenate($$$Initializing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(pred), $$$_SBHL_Graph_Links });
                final SubLObject _prev_bind_0_$45 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$46 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$47 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$48 = NIL;
                                final SubLObject token_var_$49 = NIL;
                                while (NIL == done_var_$48) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$49);
                                    final SubLObject valid_$50 = makeBoolean(!token_var_$49.eql(assertion));
                                    if (NIL != valid_$50) {
                                        final SubLObject sbhl_tv = assertion_sbhl_tv(assertion);
                                        final SubLObject mt = assertions_high.assertion_mt(assertion);
                                        final SubLObject arg1 = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                        final SubLObject arg2 = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                        store_in_sbhl_graph(arg1, arg2, mt, sbhl_tv);
                                    }
                                    done_var_$48 = makeBoolean(NIL == valid_$50);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$47, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$46, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$45, thread);
                }
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        sbhl_graphs.optimize_sbhl_store();
        return NIL;
    }

    public static final SubLObject assertion_sbhl_tv_alt(SubLObject assertion) {
        {
            SubLObject truth = assertion_truth(assertion);
            SubLObject strength = assertion_strength(assertion);
            return sbhl_link_vars.truth_strength_to_sbhl_tv(truth, strength);
        }
    }

    public static SubLObject assertion_sbhl_tv(final SubLObject assertion) {
        final SubLObject truth = assertions_high.assertion_truth(assertion);
        final SubLObject strength = assertions_high.assertion_strength(assertion);
        return sbhl_link_vars.truth_strength_to_sbhl_tv(truth, strength);
    }

    /**
     * Top level iterator to create all sbhl-time links
     */
    @LispMethod(comment = "Top level iterator to create all sbhl-time links")
    public static final SubLObject make_all_sbhl_time_links_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.clear_all_sbhl_time_data();
            sbhl_time_assertion_processing.add_temporal_link($DEFINITIONAL, $COORDINATE, sbhl_time_utilities.hl_start($$Always_TimeInterval), sbhl_time_utilities.hl_start(date_utilities.$beginning_of_time$.getGlobalValue()), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
            sbhl_time_assertion_processing.add_temporal_link($DEFINITIONAL, $COORDINATE, sbhl_time_utilities.hl_end($$Always_TimeInterval), sbhl_time_utilities.hl_end(date_utilities.$end_of_time$.getGlobalValue()), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
            sbhl_time_assertion_processing.add_temporal_link($DEFINITIONAL, $WEAK, sbhl_time_utilities.hl_start($$Always_TimeInterval), sbhl_time_utilities.hl_end($$Always_TimeInterval), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = $ignore_conflictsP$.currentBinding(thread);
                try {
                    $ignore_conflictsP$.bind(T, thread);
                    {
                        SubLObject idx = assertion_handles.do_assertions_table();
                        SubLObject total = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        SubLTrampolineFile.checkType($$$Initializing_SBHL_Time_Links, STRINGP);
                        {
                            SubLObject _prev_bind_0_32 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($$$Initializing_SBHL_Time_Links);
                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                        SubLObject assertion = NIL;
                                        while (NIL != id) {
                                            assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                note_percent_progress(sofar, total);
                                                sofar = add(sofar, ONE_INTEGER);
                                                if (NIL != gaf_assertionP(assertion)) {
                                                    {
                                                        SubLObject pred = gaf_predicate(assertion);
                                                        if (NIL != sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
                                                            sbhl_time_assertion_processing.add_wff_temporal_relation(NIL, assertion, NIL);
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
                                $last_percent_progress_index$.rebind(_prev_bind_0_32, thread);
                            }
                        }
                    }
                } finally {
                    $ignore_conflictsP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Top level iterator to create all sbhl-time links
     */
    @LispMethod(comment = "Top level iterator to create all sbhl-time links")
    public static SubLObject make_all_sbhl_time_links() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_all_sbhl_time_data();
        sbhl_time_assertion_processing.add_temporal_link($DEFINITIONAL, $COORDINATE, sbhl_time_utilities.hl_start($$Always_TimeInterval), sbhl_time_utilities.hl_start(date_utilities.$beginning_of_time$.getGlobalValue()), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        sbhl_time_assertion_processing.add_temporal_link($DEFINITIONAL, $COORDINATE, sbhl_time_utilities.hl_end($$Always_TimeInterval), sbhl_time_utilities.hl_end(date_utilities.$end_of_time$.getGlobalValue()), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        sbhl_time_assertion_processing.add_temporal_link($DEFINITIONAL, $WEAK, sbhl_time_utilities.hl_start($$Always_TimeInterval), sbhl_time_utilities.hl_end($$Always_TimeInterval), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = $ignore_conflictsP$.currentBinding(thread);
        try {
            $ignore_conflictsP$.bind(T, thread);
            final SubLObject list_var = sbhl_time_vars.$sbhl_time_predicates$.getGlobalValue();
            final SubLObject _prev_bind_0_$52 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$Initializing_SBHL_Time_Links, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject pred = NIL;
                    pred = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        format(T, $str45$_______A, pred);
                        alexandria_iterators.clear_alexandria_caches();
                        final SubLObject _prev_bind_0_$53 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$54 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            final SubLObject pred_var = pred;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                final SubLObject str = NIL;
                                final SubLObject _prev_bind_0_$54 = $progress_start_time$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$55 = $progress_last_pacification_time$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$57 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$58 = $progress_notification_count$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$59 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                                final SubLObject _prev_bind_5_$60 = $progress_count$.currentBinding(thread);
                                final SubLObject _prev_bind_6_$61 = $is_noting_progressP$.currentBinding(thread);
                                final SubLObject _prev_bind_7_$62 = $silent_progressP$.currentBinding(thread);
                                try {
                                    $progress_start_time$.bind(get_universal_time(), thread);
                                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                    $progress_count$.bind(ZERO_INTEGER, thread);
                                    $is_noting_progressP$.bind(T, thread);
                                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                                    noting_progress_preamble(str);
                                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            note_progress();
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                SubLObject done_var_$63 = NIL;
                                                final SubLObject token_var_$64 = NIL;
                                                while (NIL == done_var_$63) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$64);
                                                    final SubLObject valid_$65 = makeBoolean(!token_var_$64.eql(assertion));
                                                    if (NIL != valid_$65) {
                                                        sbhl_time_assertion_processing.add_wff_temporal_relation(NIL, assertion, NIL);
                                                    }
                                                    done_var_$63 = makeBoolean(NIL == valid_$65);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                    noting_progress_postamble();
                                } finally {
                                    $silent_progressP$.rebind(_prev_bind_7_$62, thread);
                                    $is_noting_progressP$.rebind(_prev_bind_6_$61, thread);
                                    $progress_count$.rebind(_prev_bind_5_$60, thread);
                                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$59, thread);
                                    $progress_notification_count$.rebind(_prev_bind_3_$58, thread);
                                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$57, thread);
                                    $progress_last_pacification_time$.rebind(_prev_bind_1_$55, thread);
                                    $progress_start_time$.rebind(_prev_bind_0_$54, thread);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$54, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$53, thread);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
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
                $progress_note$.rebind(_prev_bind_0_$52, thread);
            }
        } finally {
            $ignore_conflictsP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Modifier. recomputes and stores links for *sbhl-module* / MODULE wrt NODE and MT.
     */
    @LispMethod(comment = "Modifier. recomputes and stores links for *sbhl-module* / MODULE wrt NODE and MT.")
    public static final SubLObject sbhl_recompute_links_alt(SubLObject node, SubLObject mt, SubLObject module) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (module == UNPROVIDED) {
            module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject pred = sbhl_module_vars.get_sbhl_module_link_pred(module);
                SubLObject forward_assertions = kb_mapping.gather_gaf_arg_index(node, ONE_INTEGER, pred, mt, NIL);
                SubLObject backward_assertions = kb_mapping.gather_gaf_arg_index(node, TWO_INTEGER, pred, mt, NIL);
                SubLObject all_assertions = nconc(forward_assertions, backward_assertions);
                {
                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        {
                            SubLObject cdolist_list_var = all_assertions;
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                {
                                    SubLObject sbhl_tv = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.assertion_sbhl_tv(assertion);
                                    SubLObject mt_33 = assertion_mt(assertion);
                                    SubLObject arg1 = gaf_arg(assertion, ONE_INTEGER);
                                    SubLObject arg2 = gaf_arg(assertion, TWO_INTEGER);
                                    com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.store_in_sbhl_graph(arg1, arg2, mt_33, sbhl_tv);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier. recomputes and stores links for *sbhl-module* / MODULE wrt NODE and MT.
     */
    @LispMethod(comment = "Modifier. recomputes and stores links for *sbhl-module* / MODULE wrt NODE and MT.")
    public static SubLObject sbhl_recompute_links(final SubLObject node, SubLObject mt, SubLObject module) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (module == UNPROVIDED) {
            module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject pred = sbhl_module_vars.get_sbhl_module_link_pred(module);
        final SubLObject forward_assertions = kb_mapping.gather_gaf_arg_index(node, ONE_INTEGER, pred, mt, NIL);
        final SubLObject backward_assertions = kb_mapping.gather_gaf_arg_index(node, TWO_INTEGER, pred, mt, NIL);
        final SubLObject all_assertions = nconc(forward_assertions, backward_assertions);
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            SubLObject cdolist_list_var = all_assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sbhl_tv = assertion_sbhl_tv(assertion);
                final SubLObject mt_$68 = assertions_high.assertion_mt(assertion);
                final SubLObject arg1 = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                final SubLObject arg2 = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                store_in_sbhl_graph(arg1, arg2, mt_$68, sbhl_tv);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Modifier. recomputes and stores all links for MODULE
     */
    @LispMethod(comment = "Modifier. recomputes and stores all links for MODULE")
    public static final SubLObject sbhl_recompute_graph_links_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject assertions = kb_mapping.gather_predicate_extent_index(sbhl_module_utilities.get_sbhl_link_pred(module), NIL, NIL);
                        {
                            SubLObject _prev_bind_0_34 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                {
                                    SubLObject cdolist_list_var = assertions;
                                    SubLObject assertion = NIL;
                                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                        {
                                            SubLObject sbhl_tv = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.assertion_sbhl_tv(assertion);
                                            SubLObject mt = assertion_mt(assertion);
                                            SubLObject arg1 = gaf_arg(assertion, ONE_INTEGER);
                                            SubLObject arg2 = gaf_arg(assertion, TWO_INTEGER);
                                            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.store_in_sbhl_graph(arg1, arg2, mt, sbhl_tv);
                                        }
                                    }
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_34, thread);
                            }
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

    /**
     * Modifier. recomputes and stores all links for MODULE
     */
    @LispMethod(comment = "Modifier. recomputes and stores all links for MODULE")
    public static SubLObject sbhl_recompute_graph_links(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject assertions = kb_mapping.gather_predicate_extent_index(sbhl_module_utilities.get_sbhl_link_pred(module), NIL, NIL);
            final SubLObject _prev_bind_0_$69 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                SubLObject cdolist_list_var = assertions;
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject sbhl_tv = assertion_sbhl_tv(assertion);
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject arg1 = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                    final SubLObject arg2 = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                    store_in_sbhl_graph(arg1, arg2, mt, sbhl_tv);
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$69, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Modifier. recomputes and stores all the sbhl links for all predicates for NODE.
     */
    @LispMethod(comment = "Modifier. recomputes and stores all the sbhl links for all predicates for NODE.")
    public static final SubLObject sbhl_recompute_links_of_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject module = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL == sbhl_module_utilities.sbhl_time_module_p(module)) {
                                    {
                                        SubLObject module_35 = module;
                                        com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_recompute_links(node, NIL, module_35);
                                    }
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier. recomputes and stores all the sbhl links for all predicates for NODE.
     */
    @LispMethod(comment = "Modifier. recomputes and stores all the sbhl links for all predicates for NODE.")
    public static SubLObject sbhl_recompute_links_of_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject key = NIL;
                SubLObject module = NIL;
                destructuring_bind_must_consp(current, datum, $list56);
                key = current.first();
                current = module = current.rest();
                if (NIL == sbhl_module_utilities.sbhl_time_module_p(module)) {
                    final SubLObject module_$70 = module;
                    sbhl_recompute_links(node, NIL, module_$70);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Modifer. recomputes and stores all the sbhl links for all predicates for each of NODES.
     */
    @LispMethod(comment = "Modifer. recomputes and stores all the sbhl links for all predicates for each of NODES.")
    public static final SubLObject sbhl_recompute_links_of_nodes_alt(SubLObject nodes) {
        {
            SubLObject cdolist_list_var = nodes;
            SubLObject node = NIL;
            for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_recompute_links_of_node(node);
            }
        }
        return NIL;
    }

    /**
     * Modifer. recomputes and stores all the sbhl links for all predicates for each of NODES.
     */
    @LispMethod(comment = "Modifer. recomputes and stores all the sbhl links for all predicates for each of NODES.")
    public static SubLObject sbhl_recompute_links_of_nodes(final SubLObject nodes) {
        if (NIL != set.set_p(nodes)) {
            final SubLObject set_contents_var = set.do_set_internal(nodes);
            SubLObject basis_object;
            SubLObject state;
            SubLObject node;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                node = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, node)) {
                    sbhl_recompute_links_of_node(node);
                }
            }
        } else
            if (nodes.isList()) {
                SubLObject csome_list_var = nodes;
                SubLObject node2 = NIL;
                node2 = csome_list_var.first();
                while (NIL != csome_list_var) {
                    sbhl_recompute_links_of_node(node2);
                    csome_list_var = csome_list_var.rest();
                    node2 = csome_list_var.first();
                } 
            } else {
                Errors.error($str3$_A_is_neither_SET_P_nor_LISTP_, nodes);
            }

        return NIL;
    }

    public static final SubLObject reset_sbhl_links_alt(SubLObject node) {
        com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_recompute_links_of_node(node);
        return NIL;
    }

    public static SubLObject reset_sbhl_links(final SubLObject node) {
        sbhl_recompute_links_of_node(node);
        return NIL;
    }

    /**
     * after adding support. adds necessary link structure and data to store
     * gaf assertion specified by the arguments. @see store-in-sbhl-graph. requires
     * (get-sbhl-module) to be bound for the (get-sbhl-link-pred .. ) reference.
     */
    @LispMethod(comment = "after adding support. adds necessary link structure and data to store\r\ngaf assertion specified by the arguments. @see store-in-sbhl-graph. requires\r\n(get-sbhl-module) to be bound for the (get-sbhl-link-pred .. ) reference.\nafter adding support. adds necessary link structure and data to store\ngaf assertion specified by the arguments. @see store-in-sbhl-graph. requires\n(get-sbhl-module) to be bound for the (get-sbhl-link-pred .. ) reference.")
    public static final SubLObject add_sbhl_link_alt(SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject tv) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.store_in_sbhl_graph(arg1, arg2, mt, tv);
            if (!((tv == $UNKNOWN) || ((NIL != sbhl_module_utilities.sbhl_reflexive_module_p(sbhl_module_vars.get_sbhl_module(UNPROVIDED))) && arg1.equal(arg2)))) {
                if (sbhl_paranoia.$sbhl_trace_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
                    sbhl_paranoia.sbhl_note(FIVE_INTEGER, $str_alt29$adding_sbhl_links_for___a_with_tr, kb_indexing.find_gaf(list(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), arg1, arg2), mt), tv, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (sbhl_paranoia.$sbhl_test_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
                    {
                        SubLObject module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
                        SubLObject module_index_arg = sbhl_module_utilities.get_sbhl_index_arg(module);
                        SubLObject index_arg = (module_index_arg == ONE_INTEGER) ? ((SubLObject) (arg1)) : arg2;
                        SubLObject gather_arg = (module_index_arg == ONE_INTEGER) ? ((SubLObject) (arg2)) : arg1;
                        if (NIL == subl_promotions.memberP(gather_arg, com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.get_sbhl_graph_link_nodes(index_arg, sbhl_module_utilities.get_sbhl_module_forward_direction(module), mt, tv), UNPROVIDED, UNPROVIDED)) {
                            sbhl_paranoia.sbhl_error(THREE_INTEGER, $str_alt30$Link_node___a__not_present_in_for, gather_arg, arg1, arg2, mt, tv);
                        }
                        if (NIL == subl_promotions.memberP(index_arg, com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.get_sbhl_graph_link_nodes(gather_arg, sbhl_module_utilities.get_sbhl_module_backward_direction(module), mt, tv), UNPROVIDED, UNPROVIDED)) {
                            sbhl_paranoia.sbhl_error(THREE_INTEGER, $str_alt31$Link_node___a__not_present_in_bac, index_arg, arg1, arg2, mt, tv);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * after adding support. adds necessary link structure and data to store
     * gaf assertion specified by the arguments. @see store-in-sbhl-graph. requires
     * (get-sbhl-module) to be bound for the (get-sbhl-link-pred .. ) reference.
     */
    @LispMethod(comment = "after adding support. adds necessary link structure and data to store\r\ngaf assertion specified by the arguments. @see store-in-sbhl-graph. requires\r\n(get-sbhl-module) to be bound for the (get-sbhl-link-pred .. ) reference.\nafter adding support. adds necessary link structure and data to store\ngaf assertion specified by the arguments. @see store-in-sbhl-graph. requires\n(get-sbhl-module) to be bound for the (get-sbhl-link-pred .. ) reference.")
    public static SubLObject add_sbhl_link(final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        store_in_sbhl_graph(arg1, arg2, mt, tv);
        if ((tv != $UNKNOWN) && ((NIL == sbhl_module_utilities.sbhl_reflexive_module_p(sbhl_module_vars.get_sbhl_module(UNPROVIDED))) || (!arg1.equal(arg2)))) {
            if (sbhl_paranoia.$sbhl_trace_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
                sbhl_paranoia.sbhl_note(FIVE_INTEGER, $str57$adding_sbhl_links_for___a_with_tr, kb_indexing.find_gaf(list(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), arg1, arg2), mt), tv, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (sbhl_paranoia.$sbhl_test_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
                final SubLObject module_index_arg = sbhl_module_utilities.get_sbhl_index_arg(module);
                final SubLObject index_arg = (module_index_arg.eql(ONE_INTEGER)) ? arg1 : arg2;
                final SubLObject gather_arg = (module_index_arg.eql(ONE_INTEGER)) ? arg2 : arg1;
                if (NIL == set.set_or_list_memberP(gather_arg, get_sbhl_graph_link_nodes(index_arg, sbhl_module_utilities.get_sbhl_module_forward_direction(module), mt, tv))) {
                    sbhl_paranoia.sbhl_error(THREE_INTEGER, $str58$Link_node___a__not_present_in_for, gather_arg, arg1, arg2, mt, tv);
                }
                if (NIL == set.set_or_list_memberP(index_arg, get_sbhl_graph_link_nodes(gather_arg, sbhl_module_utilities.get_sbhl_module_backward_direction(module), mt, tv))) {
                    sbhl_paranoia.sbhl_error(THREE_INTEGER, $str59$Link_node___a__not_present_in_bac, index_arg, arg1, arg2, mt, tv);
                }
            }
        }
        return NIL;
    }

    /**
     * more indirection on top of after adding procedure. @see add-sbhl-link. binds the sbhl pred data corresponding to MODULE.
     */
    @LispMethod(comment = "more indirection on top of after adding procedure. @see add-sbhl-link. binds the sbhl pred data corresponding to MODULE.")
    public static final SubLObject sbhl_after_adding_alt(SubLObject source, SubLObject assertion, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
                try {
                    sbhl_link_vars.$added_source$.bind(source, thread);
                    sbhl_link_vars.$added_assertion$.bind(assertion, thread);
                    {
                        SubLObject tv = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.assertion_sbhl_tv(assertion);
                        SubLObject mt = assertion_mt(assertion);
                        SubLObject arg1 = gaf_arg(assertion, ONE_INTEGER);
                        SubLObject arg2 = gaf_arg(assertion, TWO_INTEGER);
                        {
                            SubLObject _prev_bind_0_36 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.add_sbhl_link(arg1, arg2, mt, tv);
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_36, thread);
                            }
                        }
                    }
                } finally {
                    sbhl_link_vars.$added_assertion$.rebind(_prev_bind_1, thread);
                    sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * more indirection on top of after adding procedure. @see add-sbhl-link. binds the sbhl pred data corresponding to MODULE.
     */
    @LispMethod(comment = "more indirection on top of after adding procedure. @see add-sbhl-link. binds the sbhl pred data corresponding to MODULE.")
    public static SubLObject sbhl_after_adding(SubLObject source, final SubLObject assertion, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject tv = assertion_sbhl_tv(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject arg1 = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            final SubLObject arg2 = assertions_high.gaf_arg(assertion, TWO_INTEGER);
            final SubLObject _prev_bind_0_$71 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                add_sbhl_link(arg1, arg2, mt, tv);
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$71, thread);
            }
        } finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Modifier: sets the links corresponding to NODE and MODULE / *sbhl-module* to D-LINK
     */
    @LispMethod(comment = "Modifier: sets the links corresponding to NODE and MODULE / *sbhl-module* to D-LINK")
    public static final SubLObject set_sbhl_links_alt(SubLObject node, SubLObject d_link, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        if (NIL != module) {
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        }
        sbhl_graphs.set_sbhl_graph_link(node, d_link, module);
        return NIL;
    }

    /**
     * Modifier: sets the links corresponding to NODE and MODULE / *sbhl-module* to D-LINK
     */
    @LispMethod(comment = "Modifier: sets the links corresponding to NODE and MODULE / *sbhl-module* to D-LINK")
    public static SubLObject set_sbhl_links(final SubLObject node, final SubLObject d_link, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        if (((NIL != module) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sbhl_module_vars.sbhl_module_p(module))) {
            throw new AssertionError(module);
        }
        sbhl_graphs.set_sbhl_graph_link(node, d_link, module);
        return NIL;
    }

    /**
     * Removes just the offending entry, LINK-NODE, from the link structure specified
     * by the other args.
     */
    @LispMethod(comment = "Removes just the offending entry, LINK-NODE, from the link structure specified\r\nby the other args.\nRemoves just the offending entry, LINK-NODE, from the link structure specified\nby the other args.")
    public static final SubLObject remove_sbhl_link_node_alt(SubLObject node, SubLObject direction, SubLObject mt, SubLObject tv, SubLObject link_node, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        if (NIL != module) {
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        }
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.member_of_sbhl_link_nodesP(link_node, node, direction, mt, tv)) {
            sbhl_links.remove_sbhl_tv_link_node(sbhl_links.get_sbhl_graph_tv_links(node, direction, mt, module), tv, link_node);
        } else {
            sbhl_paranoia.sbhl_error(THREE_INTEGER, $str_alt32$Cannot_remove_link_node___a__not_, link_node, node, direction, mt, tv);
        }
        return NIL;
    }

    /**
     * Removes just the offending entry, LINK-NODE, from the link structure specified
     * by the other args.
     */
    @LispMethod(comment = "Removes just the offending entry, LINK-NODE, from the link structure specified\r\nby the other args.\nRemoves just the offending entry, LINK-NODE, from the link structure specified\nby the other args.")
    public static SubLObject remove_sbhl_link_node(final SubLObject node, final SubLObject direction, final SubLObject mt, final SubLObject tv, final SubLObject link_node, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        if (((NIL != module) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sbhl_module_vars.sbhl_module_p(module))) {
            throw new AssertionError(module);
        }
        if (NIL != member_of_sbhl_link_nodesP(link_node, node, direction, mt, tv)) {
            sbhl_links.remove_sbhl_tv_link_node(sbhl_links.get_sbhl_graph_tv_links(node, direction, mt, module), tv, link_node);
        } else {
            sbhl_paranoia.sbhl_error(THREE_INTEGER, $str60$Cannot_remove_link_node___a__not_, link_node, node, direction, mt, tv);
        }
        return NIL;
    }

    /**
     * Removes the forward link from NODE to LINK-NODE within MT and TV. Also remove backward
     * link from LINK-NODE to NODE within MT and TV. requires *sbhl-module* to be defined.
     */
    @LispMethod(comment = "Removes the forward link from NODE to LINK-NODE within MT and TV. Also remove backward\r\nlink from LINK-NODE to NODE within MT and TV. requires *sbhl-module* to be defined.\nRemoves the forward link from NODE to LINK-NODE within MT and TV. Also remove backward\nlink from LINK-NODE to NODE within MT and TV. requires *sbhl-module* to be defined.")
    public static final SubLObject remove_sbhl_forward_and_backward_link_node_alt(SubLObject node, SubLObject mt, SubLObject tv, SubLObject link_node, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        if (NIL != module) {
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        }
        {
            SubLObject forward_direction = sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            SubLObject backward_direction = sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            sbhl_paranoia.sbhl_note(THREE_INTEGER, $str_alt33$Removing__a_from__a_forward_direc, link_node, node, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.remove_sbhl_link_node(node, forward_direction, mt, tv, link_node, module);
            sbhl_paranoia.sbhl_note(THREE_INTEGER, $str_alt34$Removing__a_from__a_backward_dire, node, link_node, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.remove_sbhl_link_node(link_node, backward_direction, mt, tv, node, module);
        }
        return NIL;
    }

    /**
     * Removes the forward link from NODE to LINK-NODE within MT and TV. Also remove backward
     * link from LINK-NODE to NODE within MT and TV. requires *sbhl-module* to be defined.
     */
    @LispMethod(comment = "Removes the forward link from NODE to LINK-NODE within MT and TV. Also remove backward\r\nlink from LINK-NODE to NODE within MT and TV. requires *sbhl-module* to be defined.\nRemoves the forward link from NODE to LINK-NODE within MT and TV. Also remove backward\nlink from LINK-NODE to NODE within MT and TV. requires *sbhl-module* to be defined.")
    public static SubLObject remove_sbhl_forward_and_backward_link_node(final SubLObject node, final SubLObject mt, final SubLObject tv, final SubLObject link_node, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        if (((NIL != module) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sbhl_module_vars.sbhl_module_p(module))) {
            throw new AssertionError(module);
        }
        final SubLObject forward_direction = sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        final SubLObject backward_direction = sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_paranoia.sbhl_note(THREE_INTEGER, $str61$Removing__a_from__a_forward_direc, link_node, node, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        remove_sbhl_link_node(node, forward_direction, mt, tv, link_node, module);
        sbhl_paranoia.sbhl_note(THREE_INTEGER, $str62$Removing__a_from__a_backward_dire, node, link_node, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        remove_sbhl_link_node(link_node, backward_direction, mt, tv, node, module);
        return NIL;
    }

    public static final SubLObject remove_sbhl_link_alt(SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject tv) {
        {
            SubLObject module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
            SubLObject forward_direction = sbhl_module_utilities.get_sbhl_module_forward_direction(module);
            SubLObject backward_direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
            SubLObject arg1_graph_link = sbhl_graphs.get_sbhl_graph_link(arg1, module);
            SubLObject arg2_graph_link = sbhl_graphs.get_sbhl_graph_link(arg2, module);
            SubLObject arg1_mt_links = (NIL != arg1_graph_link) ? ((SubLObject) (sbhl_links.get_sbhl_mt_links(arg1_graph_link, forward_direction, module))) : NIL;
            SubLObject arg2_mt_links = (NIL != arg2_graph_link) ? ((SubLObject) (sbhl_links.get_sbhl_mt_links(arg2_graph_link, backward_direction, module))) : NIL;
            SubLObject arg1_tv_links = (NIL != arg1_mt_links) ? ((SubLObject) (sbhl_links.get_sbhl_tv_links(arg1_mt_links, mt))) : NIL;
            SubLObject arg2_tv_links = (NIL != arg2_mt_links) ? ((SubLObject) (sbhl_links.get_sbhl_tv_links(arg2_mt_links, mt))) : NIL;
            if (NIL != sbhl_links.member_of_tv_linksP(arg2, tv, arg1_tv_links)) {
                sbhl_links.remove_sbhl_tv_link_node(arg1_tv_links, tv, arg2);
                if (NIL != sbhl_link_utilities.empty_tv_link_p(tv, arg1_tv_links)) {
                    sbhl_links.remove_sbhl_tv_link(arg1_tv_links, tv);
                }
                if (NIL != sbhl_link_utilities.empty_mt_link_p(mt, arg1_mt_links)) {
                    sbhl_links.remove_sbhl_mt_link(arg1_mt_links, mt);
                }
                if (NIL != sbhl_link_utilities.empty_direction_link_p(forward_direction, arg1_graph_link)) {
                    sbhl_links.remove_sbhl_direction_link(arg1_graph_link, forward_direction, module);
                }
                if (NIL != sbhl_link_utilities.empty_graph_link_p(arg1, module)) {
                    sbhl_graphs.remove_sbhl_graph_link(arg1, module);
                } else {
                    sbhl_graphs.touch_sbhl_graph_link(arg1, arg1_graph_link, module);
                }
            }
            if (NIL != sbhl_links.member_of_tv_linksP(arg1, tv, arg2_tv_links)) {
                sbhl_links.remove_sbhl_tv_link_node(arg2_tv_links, tv, arg1);
                if (NIL != sbhl_link_utilities.empty_tv_link_p(tv, arg2_tv_links)) {
                    sbhl_links.remove_sbhl_tv_link(arg2_tv_links, tv);
                }
                if (NIL != sbhl_link_utilities.empty_mt_link_p(mt, arg2_mt_links)) {
                    sbhl_links.remove_sbhl_mt_link(arg2_mt_links, mt);
                }
                if (NIL != sbhl_link_utilities.empty_direction_link_p(backward_direction, arg2_graph_link)) {
                    sbhl_links.remove_sbhl_direction_link(arg2_graph_link, backward_direction, module);
                }
                if (NIL != sbhl_link_utilities.empty_graph_link_p(arg2, module)) {
                    sbhl_graphs.remove_sbhl_graph_link(arg2, module);
                } else {
                    sbhl_graphs.touch_sbhl_graph_link(arg2, arg2_graph_link, module);
                }
            }
        }
        return NIL;
    }

    public static SubLObject remove_sbhl_link(final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        final SubLObject module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        final SubLObject forward_direction = sbhl_module_utilities.get_sbhl_module_forward_direction(module);
        final SubLObject backward_direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
        final SubLObject arg1_graph_link = sbhl_graphs.get_sbhl_graph_link(arg1, module);
        final SubLObject arg2_graph_link = sbhl_graphs.get_sbhl_graph_link(arg2, module);
        final SubLObject arg1_mt_links = (NIL != arg1_graph_link) ? sbhl_links.get_sbhl_mt_links(arg1_graph_link, forward_direction, module) : NIL;
        final SubLObject arg2_mt_links = (NIL != arg2_graph_link) ? sbhl_links.get_sbhl_mt_links(arg2_graph_link, backward_direction, module) : NIL;
        final SubLObject arg1_tv_links = (NIL != arg1_mt_links) ? sbhl_links.get_sbhl_tv_links(arg1_mt_links, mt) : NIL;
        final SubLObject arg2_tv_links = (NIL != arg2_mt_links) ? sbhl_links.get_sbhl_tv_links(arg2_mt_links, mt) : NIL;
        if (NIL != sbhl_links.member_of_tv_linksP(arg2, tv, arg1_tv_links)) {
            sbhl_links.remove_sbhl_tv_link_node(arg1_tv_links, tv, arg2);
            if (NIL != sbhl_link_utilities.empty_tv_link_p(tv, arg1_tv_links)) {
                sbhl_links.remove_sbhl_tv_link(arg1_tv_links, tv);
            }
            if (NIL != sbhl_link_utilities.empty_mt_link_p(mt, arg1_mt_links)) {
                sbhl_links.remove_sbhl_mt_link(arg1_mt_links, mt);
            }
            if (NIL != sbhl_link_utilities.empty_direction_link_p(forward_direction, arg1_graph_link)) {
                sbhl_links.remove_sbhl_direction_link(arg1_graph_link, forward_direction, module);
            }
            if (NIL != sbhl_link_utilities.empty_graph_link_p(arg1, module)) {
                sbhl_graphs.remove_sbhl_graph_link(arg1, module);
            } else {
                sbhl_graphs.touch_sbhl_graph_link(arg1, arg1_graph_link, module);
            }
        }
        if (NIL != sbhl_links.member_of_tv_linksP(arg1, tv, arg2_tv_links)) {
            sbhl_links.remove_sbhl_tv_link_node(arg2_tv_links, tv, arg1);
            if (NIL != sbhl_link_utilities.empty_tv_link_p(tv, arg2_tv_links)) {
                sbhl_links.remove_sbhl_tv_link(arg2_tv_links, tv);
            }
            if (NIL != sbhl_link_utilities.empty_mt_link_p(mt, arg2_mt_links)) {
                sbhl_links.remove_sbhl_mt_link(arg2_mt_links, mt);
            }
            if (NIL != sbhl_link_utilities.empty_direction_link_p(backward_direction, arg2_graph_link)) {
                sbhl_links.remove_sbhl_direction_link(arg2_graph_link, backward_direction, module);
            }
            if (NIL != sbhl_link_utilities.empty_graph_link_p(arg2, module)) {
                sbhl_graphs.remove_sbhl_graph_link(arg2, module);
            } else {
                sbhl_graphs.touch_sbhl_graph_link(arg2, arg2_graph_link, module);
            }
        }
        return NIL;
    }

    public static final SubLObject sbhl_after_removing_alt(SubLObject source, SubLObject assertion, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            if (NIL == kb_accessors.assertion_still_thereP(assertion, assertion_truth(assertion))) {
                {
                    SubLObject tv = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.assertion_sbhl_tv(assertion);
                    SubLObject mt = assertion_mt(assertion);
                    SubLObject arg1 = gaf_arg(assertion, ONE_INTEGER);
                    SubLObject arg2 = gaf_arg(assertion, TWO_INTEGER);
                    {
                        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(module, thread);
                            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.isa_to_naut_conditionsP(arg1, arg2)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.remove_isa_arg2_naut(arg1, arg2, mt, tv);
                            } else {
                                com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.remove_sbhl_link(arg1, arg2, mt, tv);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sbhl_after_removing(SubLObject source, final SubLObject assertion, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL == kb_accessors.assertion_still_thereP(assertion, assertions_high.assertion_truth(assertion))) {
            final SubLObject tv = assertion_sbhl_tv(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject arg1 = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            final SubLObject arg2 = assertions_high.gaf_arg(assertion, TWO_INTEGER);
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                if (NIL != isa_to_naut_conditionsP(arg1, arg2)) {
                    remove_isa_arg2_naut(arg1, arg2, mt, tv);
                } else {
                    remove_sbhl_link(arg1, arg2, mt, tv);
                }
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject possibly_update_sbhl_links_tv_alt(SubLObject assertion, SubLObject old_tv) {
        if (NIL != gaf_assertionP(assertion)) {
            {
                SubLObject new_tv = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.assertion_sbhl_tv(assertion);
                old_tv = sbhl_link_vars.support_tv_to_sbhl_tv(old_tv);
                if (new_tv != old_tv) {
                    {
                        SubLObject pred = gaf_predicate(assertion);
                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.sbhl_after_tv_modification(assertion, old_tv, sbhl_module_vars.get_sbhl_module(pred));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_update_sbhl_links_tv(final SubLObject assertion, SubLObject old_tv) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject new_tv = assertion_sbhl_tv(assertion);
            old_tv = sbhl_link_vars.support_tv_to_sbhl_tv(old_tv);
            if (!new_tv.eql(old_tv)) {
                final SubLObject pred = assertions_high.gaf_predicate(assertion);
                if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
                    sbhl_after_tv_modification(assertion, old_tv, sbhl_module_vars.get_sbhl_module(pred));
                }
            }
        }
        return NIL;
    }

    public static final SubLObject sbhl_after_tv_modification_alt(SubLObject assertion, SubLObject old_tv, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tv = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.assertion_sbhl_tv(assertion);
                SubLObject mt = assertion_mt(assertion);
                SubLObject arg1 = gaf_arg(assertion, ONE_INTEGER);
                SubLObject arg2 = gaf_arg(assertion, TWO_INTEGER);
                {
                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.isa_to_naut_conditionsP(arg1, arg2)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.remove_isa_arg2_naut(arg1, arg2, mt, old_tv);
                        } else {
                            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.remove_sbhl_link(arg1, arg2, mt, old_tv);
                        }
                        com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.add_sbhl_link(arg1, arg2, mt, tv);
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sbhl_after_tv_modification(final SubLObject assertion, final SubLObject old_tv, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tv = assertion_sbhl_tv(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject arg1 = assertions_high.gaf_arg(assertion, ONE_INTEGER);
        final SubLObject arg2 = assertions_high.gaf_arg(assertion, TWO_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            if (NIL != isa_to_naut_conditionsP(arg1, arg2)) {
                remove_isa_arg2_naut(arg1, arg2, mt, old_tv);
            } else {
                remove_sbhl_link(arg1, arg2, mt, old_tv);
            }
            add_sbhl_link(arg1, arg2, mt, tv);
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Initializes *isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Initializes *isa-arg2-naut-table*.")
    public static final SubLObject initialize_isa_arg2_naut_table_alt() {
        $isa_arg2_naut_table$.setGlobalValue(make_hash_table($int$200, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Initializes *isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Initializes *isa-arg2-naut-table*.")
    public static SubLObject initialize_isa_arg2_naut_table() {
        $isa_arg2_naut_table$.setGlobalValue(make_hash_table($int$200, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Clears all data from *isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Clears all data from *isa-arg2-naut-table*.")
    public static final SubLObject clear_isa_arg2_naut_table_alt() {
        if ($isa_arg2_naut_table$.getGlobalValue().isHashtable()) {
            clrhash($isa_arg2_naut_table$.getGlobalValue());
        } else {
            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.initialize_isa_arg2_naut_table();
        }
        return NIL;
    }

    /**
     * Clears all data from *isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Clears all data from *isa-arg2-naut-table*.")
    public static SubLObject clear_isa_arg2_naut_table() {
        if ($isa_arg2_naut_table$.getGlobalValue().isHashtable()) {
            clrhash($isa_arg2_naut_table$.getGlobalValue());
        } else {
            initialize_isa_arg2_naut_table();
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; Whether TERM has any direct isas which are NAUTs.
     */
    @LispMethod(comment = "@return booleanp; Whether TERM has any direct isas which are NAUTs.")
    public static final SubLObject isa_stored_naut_arg2_p_alt(SubLObject v_term) {
        return makeBoolean($isa_arg2_naut_table$.getGlobalValue().isHashtable() && (NIL != list_utilities.sublisp_boolean(gethash(v_term, $isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED))));
    }

    /**
     *
     *
     * @return booleanp; Whether TERM has any direct isas which are NAUTs.
     */
    @LispMethod(comment = "@return booleanp; Whether TERM has any direct isas which are NAUTs.")
    public static SubLObject isa_stored_naut_arg2_p(final SubLObject v_term) {
        return makeBoolean($isa_arg2_naut_table$.getGlobalValue().isHashtable() && (NIL != list_utilities.sublisp_boolean(gethash(v_term, $isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED))));
    }

    /**
     * Modifier.  Stores the isa relation (isa ARG1 ARG2):MT,TV in the *isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Modifier.  Stores the isa relation (isa ARG1 ARG2):MT,TV in the *isa-arg2-naut-table*.")
    public static final SubLObject store_isa_arg2_naut_alt(SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject tv) {
        hash_table_utilities.pushnew_hash(arg1, list(arg2, mt, tv), $isa_arg2_naut_table$.getGlobalValue(), EQUAL);
        return NIL;
    }

    /**
     * Modifier.  Stores the isa relation (isa ARG1 ARG2):MT,TV in the *isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Modifier.  Stores the isa relation (isa ARG1 ARG2):MT,TV in the *isa-arg2-naut-table*.")
    public static SubLObject store_isa_arg2_naut(final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        hash_table_utilities.pushnew_hash(arg1, list(arg2, mt, tv), $isa_arg2_naut_table$.getGlobalValue(), EQUAL);
        return NIL;
    }

    /**
     * Modifier.  Removes the isa relation (isa ARG1 ARG2):MT,TV from the *isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Modifier.  Removes the isa relation (isa ARG1 ARG2):MT,TV from the *isa-arg2-naut-table*.")
    public static final SubLObject remove_isa_arg2_naut_alt(SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject tv) {
        {
            SubLObject tuple = list(arg2, mt, tv);
            hash_table_utilities.delete_hash(arg1, tuple, $isa_arg2_naut_table$.getGlobalValue(), EQUAL, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Modifier.  Removes the isa relation (isa ARG1 ARG2):MT,TV from the *isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Modifier.  Removes the isa relation (isa ARG1 ARG2):MT,TV from the *isa-arg2-naut-table*.")
    public static SubLObject remove_isa_arg2_naut(final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        final SubLObject tuple = list(arg2, mt, tv);
        hash_table_utilities.delete_hash(arg1, tuple, $isa_arg2_naut_table$.getGlobalValue(), EQUAL, UNPROVIDED);
        return NIL;
    }

    /**
     * Return booleanp;  Returns whether looking for (isa ARG1 ARG2) in the NAUT table is applicable.
     */
    @LispMethod(comment = "Return booleanp;  Returns whether looking for (isa ARG1 ARG2) in the NAUT table is applicable.")
    public static final SubLObject isa_to_naut_conditionsP_alt(SubLObject arg1, SubLObject arg2) {
        return makeBoolean(((sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)) == $$isa) && (NIL != sbhl_link_vars.sbhl_node_object_p(arg1))) && (NIL != possibly_naut_p(arg2)));
    }

    /**
     * Return booleanp;  Returns whether looking for (isa ARG1 ARG2) in the NAUT table is applicable.
     */
    @LispMethod(comment = "Return booleanp;  Returns whether looking for (isa ARG1 ARG2) in the NAUT table is applicable.")
    public static SubLObject isa_to_naut_conditionsP(final SubLObject arg1, final SubLObject arg2) {
        return makeBoolean((sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)).eql($$isa) && (NIL != sbhl_link_vars.sbhl_node_object_p(arg1))) && (NIL != possibly_naut_p(arg2)));
    }

    /**
     *
     *
     * @return listp; The isas of TERM from all assertions that have (isa TERM <naut>)
     */
    @LispMethod(comment = "@return listp; The isas of TERM from all assertions that have (isa TERM <naut>)")
    public static final SubLObject isas_from_naut_arg2_alt(SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject module = sbhl_module_vars.get_sbhl_module($$genls);
                SubLObject result = NIL;
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
                            SubLObject tv_var = tv;
                            {
                                SubLObject _prev_bind_0_37 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1_38 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_39 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                            {
                                                SubLObject cdolist_list_var = gethash(v_term, $isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED);
                                                SubLObject isa_tuple = NIL;
                                                for (isa_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_tuple = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject datum = isa_tuple;
                                                        SubLObject current = datum;
                                                        SubLObject naut = NIL;
                                                        SubLObject isa_mt = NIL;
                                                        SubLObject isa_tv = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt40);
                                                        naut = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list_alt40);
                                                        isa_mt = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list_alt40);
                                                        isa_tv = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            if ((NIL != mt_relevance_macros.relevant_mtP(isa_mt)) && (NIL != sbhl_search_vars.relevant_sbhl_tvP(isa_tv))) {
                                                                result = cons(naut, result);
                                                                {
                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module)))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module);
                                                                    SubLObject cdolist_list_var_40 = new_list;
                                                                    SubLObject generating_fn = NIL;
                                                                    for (generating_fn = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest() , generating_fn = cdolist_list_var_40.first()) {
                                                                        {
                                                                            SubLObject _prev_bind_0_41 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                {
                                                                                    SubLObject link_nodes = funcall(generating_fn, naut);
                                                                                    SubLObject cdolist_list_var_42 = link_nodes;
                                                                                    SubLObject link_node = NIL;
                                                                                    for (link_node = cdolist_list_var_42.first(); NIL != cdolist_list_var_42; cdolist_list_var_42 = cdolist_list_var_42.rest() , link_node = cdolist_list_var_42.first()) {
                                                                                        result = cons(link_node, result);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_41, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list_alt40);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_39, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_38, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_37, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return delete_duplicates(result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @return listp; The isas of TERM from all assertions that have (isa TERM <naut>)
     */
    @LispMethod(comment = "@return listp; The isas of TERM from all assertions that have (isa TERM <naut>)")
    public static SubLObject isas_from_naut_arg2(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$genls);
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            } else {
                                Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$73 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                    SubLObject cdolist_list_var = gethash(v_term, $isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED);
                    SubLObject isa_tuple = NIL;
                    isa_tuple = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = isa_tuple;
                        SubLObject naut = NIL;
                        SubLObject isa_mt = NIL;
                        SubLObject isa_tv = NIL;
                        destructuring_bind_must_consp(current, datum, $list66);
                        naut = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list66);
                        isa_mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list66);
                        isa_tv = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if ((NIL != mt_relevance_macros.relevant_mtP(isa_mt)) && (NIL != sbhl_search_vars.relevant_sbhl_tvP(isa_tv))) {
                                result = cons(naut, result);
                                SubLObject cdolist_list_var_$75;
                                final SubLObject new_list = cdolist_list_var_$75 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module)) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module);
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$75.first();
                                while (NIL != cdolist_list_var_$75) {
                                    final SubLObject _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        final SubLObject sol;
                                        final SubLObject link_nodes = sol = funcall(generating_fn, naut);
                                        if (NIL != set.set_p(sol)) {
                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject link_node;
                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                link_node = set_contents.do_set_contents_next(basis_object, state);
                                                if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                    result = cons(link_node, result);
                                                }
                                            }
                                        } else
                                            if (sol.isList()) {
                                                SubLObject csome_list_var = sol;
                                                SubLObject link_node2 = NIL;
                                                link_node2 = csome_list_var.first();
                                                while (NIL != csome_list_var) {
                                                    result = cons(link_node2, result);
                                                    csome_list_var = csome_list_var.rest();
                                                    link_node2 = csome_list_var.first();
                                                } 
                                            } else {
                                                Errors.error($str3$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }

                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$74, thread);
                                    }
                                    cdolist_list_var_$75 = cdolist_list_var_$75.rest();
                                    generating_fn = cdolist_list_var_$75.first();
                                } 
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list66);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        isa_tuple = cdolist_list_var.first();
                    } 
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$73, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$73, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$72, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return delete_duplicates(result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp;  The isas of all of TERMS, from assertions (isa term <naut>).
     */
    @LispMethod(comment = "@return listp;  The isas of all of TERMS, from assertions (isa term <naut>).")
    public static final SubLObject union_isas_from_naut_arg2_alt(SubLObject terms, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                result = nconc(com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.isas_from_naut_arg2(v_term, mt, tv), result);
            }
            return delete_duplicates(result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return listp;  The isas of all of TERMS, from assertions (isa term <naut>).
     */
    @LispMethod(comment = "@return listp;  The isas of all of TERMS, from assertions (isa term <naut>).")
    public static SubLObject union_isas_from_naut_arg2(final SubLObject terms, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nconc(isas_from_naut_arg2(v_term, mt, tv), result);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return delete_duplicates(result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Iterator. Iterates over the isas accessible to TERM from (isa TERM <naut>).
     */
    @LispMethod(comment = "Iterator. Iterates over the isas accessible to TERM from (isa TERM <naut>).")
    public static final SubLObject do_isas_from_naut_arg2_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt41);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject isa_var = NIL;
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    isa_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    v_term = current.first();
                    current = current.rest();
                    {
                        SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt41);
                        current = current.rest();
                        {
                            SubLObject tv = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt41);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                {
                                    SubLObject body = current;
                                    SubLObject module = $sym42$MODULE;
                                    SubLObject isa_tuple = $sym43$ISA_TUPLE;
                                    SubLObject naut = $sym44$NAUT;
                                    SubLObject isa_mt = $sym45$ISA_MT;
                                    SubLObject isa_tv = $sym46$ISA_TV;
                                    return list(CLET, list(bq_cons(module, $list_alt48)), list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_MODULE, module, list(CDOLIST, list(isa_tuple, listS(GETHASH, v_term, $list_alt54)), list(CDESTRUCTURING_BIND, list(naut, isa_mt, isa_tv), isa_tuple, list(PWHEN, list(CAND, list($sym58$RELEVANT_MT_, isa_mt), list($sym59$RELEVANT_SBHL_TV_, isa_tv)), listS(CLET, list(list(isa_var, naut)), append(body, NIL)), listS(DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, list(isa_var, naut, $list_alt61, module), append(body, NIL)))))))));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt41);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterator. Iterates over the isas accessible to TERM from (isa TERM <naut>).
     */
    @LispMethod(comment = "Iterator. Iterates over the isas accessible to TERM from (isa TERM <naut>).")
    public static SubLObject do_isas_from_naut_arg2(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list67);
        isa_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list67);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list67);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module = $sym68$MODULE;
            final SubLObject isa_tuple = $sym69$ISA_TUPLE;
            final SubLObject naut = $sym70$NAUT;
            final SubLObject isa_mt = $sym71$ISA_MT;
            final SubLObject isa_tv = $sym72$ISA_TV;
            return list(CLET, list(bq_cons(module, $list74)), list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_MODULE, module, list(CDOLIST, list(isa_tuple, listS(GETHASH, v_term, $list80)), list(CDESTRUCTURING_BIND, list(naut, isa_mt, isa_tv), isa_tuple, list(PWHEN, list(CAND, list($sym84$RELEVANT_MT_, isa_mt), list($sym85$RELEVANT_SBHL_TV_, isa_tv)), listS(CLET, list(list(isa_var, naut)), append(body, NIL)), listS(DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, list(isa_var, naut, $list87, module), append(body, NIL)))))))));
        }
        cdestructuring_bind_error(datum, $list67);
        return NIL;
    }

    /**
     * Initializes *quoted-isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Initializes *quoted-isa-arg2-naut-table*.")
    public static final SubLObject initialize_quoted_isa_arg2_naut_table_alt() {
        $quoted_isa_arg2_naut_table$.setGlobalValue(make_hash_table($int$200, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Initializes *quoted-isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Initializes *quoted-isa-arg2-naut-table*.")
    public static SubLObject initialize_quoted_isa_arg2_naut_table() {
        $quoted_isa_arg2_naut_table$.setGlobalValue(make_hash_table($int$200, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Clears all data from *quoted-isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Clears all data from *quoted-isa-arg2-naut-table*.")
    public static final SubLObject clear_quoted_isa_arg2_naut_table_alt() {
        if ($quoted_isa_arg2_naut_table$.getGlobalValue().isHashtable()) {
            clrhash($quoted_isa_arg2_naut_table$.getGlobalValue());
        } else {
            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.initialize_quoted_isa_arg2_naut_table();
        }
        return NIL;
    }

    /**
     * Clears all data from *quoted-isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Clears all data from *quoted-isa-arg2-naut-table*.")
    public static SubLObject clear_quoted_isa_arg2_naut_table() {
        if ($quoted_isa_arg2_naut_table$.getGlobalValue().isHashtable()) {
            clrhash($quoted_isa_arg2_naut_table$.getGlobalValue());
        } else {
            initialize_quoted_isa_arg2_naut_table();
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; Whether TERM has any direct isas which are NAUTs.
     */
    @LispMethod(comment = "@return booleanp; Whether TERM has any direct isas which are NAUTs.")
    public static final SubLObject quoted_isa_stored_naut_arg2_p_alt(SubLObject v_term) {
        return makeBoolean($quoted_isa_arg2_naut_table$.getGlobalValue().isHashtable() && (NIL != list_utilities.sublisp_boolean(gethash(v_term, $quoted_isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED))));
    }

    /**
     *
     *
     * @return booleanp; Whether TERM has any direct isas which are NAUTs.
     */
    @LispMethod(comment = "@return booleanp; Whether TERM has any direct isas which are NAUTs.")
    public static SubLObject quoted_isa_stored_naut_arg2_p(final SubLObject v_term) {
        return makeBoolean($quoted_isa_arg2_naut_table$.getGlobalValue().isHashtable() && (NIL != list_utilities.sublisp_boolean(gethash(v_term, $quoted_isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED))));
    }

    /**
     * Modifier.  Stores the isa relation (isa ARG1 ARG2):MT,TV in the *quoted-isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Modifier.  Stores the isa relation (isa ARG1 ARG2):MT,TV in the *quoted-isa-arg2-naut-table*.")
    public static final SubLObject store_quoted_isa_arg2_naut_alt(SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject tv) {
        hash_table_utilities.pushnew_hash(arg1, list(arg2, mt, tv), $quoted_isa_arg2_naut_table$.getGlobalValue(), EQUAL);
        return NIL;
    }

    /**
     * Modifier.  Stores the isa relation (isa ARG1 ARG2):MT,TV in the *quoted-isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Modifier.  Stores the isa relation (isa ARG1 ARG2):MT,TV in the *quoted-isa-arg2-naut-table*.")
    public static SubLObject store_quoted_isa_arg2_naut(final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        hash_table_utilities.pushnew_hash(arg1, list(arg2, mt, tv), $quoted_isa_arg2_naut_table$.getGlobalValue(), EQUAL);
        return NIL;
    }

    /**
     * Modifier.  Removes the isa relation (isa ARG1 ARG2):MT,TV from the *quoted-isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Modifier.  Removes the isa relation (isa ARG1 ARG2):MT,TV from the *quoted-isa-arg2-naut-table*.")
    public static final SubLObject remove_quoted_isa_arg2_naut_alt(SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject tv) {
        {
            SubLObject tuple = list(arg2, mt, tv);
            hash_table_utilities.delete_hash(arg1, tuple, $quoted_isa_arg2_naut_table$.getGlobalValue(), EQUAL, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Modifier.  Removes the isa relation (isa ARG1 ARG2):MT,TV from the *quoted-isa-arg2-naut-table*.
     */
    @LispMethod(comment = "Modifier.  Removes the isa relation (isa ARG1 ARG2):MT,TV from the *quoted-isa-arg2-naut-table*.")
    public static SubLObject remove_quoted_isa_arg2_naut(final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        final SubLObject tuple = list(arg2, mt, tv);
        hash_table_utilities.delete_hash(arg1, tuple, $quoted_isa_arg2_naut_table$.getGlobalValue(), EQUAL, UNPROVIDED);
        return NIL;
    }

    /**
     * Return booleanp;  Returns whether looking for (isa ARG1 ARG2) in the NAUT table is applicable.
     */
    @LispMethod(comment = "Return booleanp;  Returns whether looking for (isa ARG1 ARG2) in the NAUT table is applicable.")
    public static final SubLObject quoted_isa_to_naut_conditionsP_alt(SubLObject arg1, SubLObject arg2) {
        return makeBoolean(((sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)) == $$quotedIsa) && (NIL != sbhl_link_vars.sbhl_node_object_p(arg1))) && (NIL != possibly_naut_p(arg2)));
    }

    /**
     * Return booleanp;  Returns whether looking for (isa ARG1 ARG2) in the NAUT table is applicable.
     */
    @LispMethod(comment = "Return booleanp;  Returns whether looking for (isa ARG1 ARG2) in the NAUT table is applicable.")
    public static SubLObject quoted_isa_to_naut_conditionsP(final SubLObject arg1, final SubLObject arg2) {
        return makeBoolean((sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)).eql($$quotedIsa) && (NIL != sbhl_link_vars.sbhl_node_object_p(arg1))) && (NIL != possibly_naut_p(arg2)));
    }

    /**
     *
     *
     * @return listp; The isas of TERM from all assertions that have (isa TERM <naut>)
     */
    @LispMethod(comment = "@return listp; The isas of TERM from all assertions that have (isa TERM <naut>)")
    public static final SubLObject quoted_isas_from_naut_arg2_alt(SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject module = sbhl_module_vars.get_sbhl_module($$genls);
                SubLObject result = NIL;
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
                            SubLObject tv_var = tv;
                            {
                                SubLObject _prev_bind_0_43 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1_44 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_45 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                            {
                                                SubLObject cdolist_list_var = gethash(v_term, $quoted_isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED);
                                                SubLObject quoted_isa_tuple = NIL;
                                                for (quoted_isa_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , quoted_isa_tuple = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject datum = quoted_isa_tuple;
                                                        SubLObject current = datum;
                                                        SubLObject naut = NIL;
                                                        SubLObject quoted_isa_mt = NIL;
                                                        SubLObject quoted_isa_tv = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt64);
                                                        naut = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list_alt64);
                                                        quoted_isa_mt = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list_alt64);
                                                        quoted_isa_tv = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            if ((NIL != mt_relevance_macros.relevant_mtP(quoted_isa_mt)) && (NIL != sbhl_search_vars.relevant_sbhl_tvP(quoted_isa_tv))) {
                                                                result = cons(naut, result);
                                                                {
                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module)))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module);
                                                                    SubLObject cdolist_list_var_46 = new_list;
                                                                    SubLObject generating_fn = NIL;
                                                                    for (generating_fn = cdolist_list_var_46.first(); NIL != cdolist_list_var_46; cdolist_list_var_46 = cdolist_list_var_46.rest() , generating_fn = cdolist_list_var_46.first()) {
                                                                        {
                                                                            SubLObject _prev_bind_0_47 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                {
                                                                                    SubLObject link_nodes = funcall(generating_fn, naut);
                                                                                    SubLObject cdolist_list_var_48 = link_nodes;
                                                                                    SubLObject link_node = NIL;
                                                                                    for (link_node = cdolist_list_var_48.first(); NIL != cdolist_list_var_48; cdolist_list_var_48 = cdolist_list_var_48.rest() , link_node = cdolist_list_var_48.first()) {
                                                                                        result = cons(link_node, result);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_47, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list_alt64);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_45, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_44, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_43, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return delete_duplicates(result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @return listp; The isas of TERM from all assertions that have (isa TERM <naut>)
     */
    @LispMethod(comment = "@return listp; The isas of TERM from all assertions that have (isa TERM <naut>)")
    public static SubLObject quoted_isas_from_naut_arg2(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$genls);
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$77 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$78 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            } else {
                                Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$78 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                    SubLObject cdolist_list_var = gethash(v_term, $quoted_isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED);
                    SubLObject quoted_isa_tuple = NIL;
                    quoted_isa_tuple = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = quoted_isa_tuple;
                        SubLObject naut = NIL;
                        SubLObject quoted_isa_mt = NIL;
                        SubLObject quoted_isa_tv = NIL;
                        destructuring_bind_must_consp(current, datum, $list89);
                        naut = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list89);
                        quoted_isa_mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list89);
                        quoted_isa_tv = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if ((NIL != mt_relevance_macros.relevant_mtP(quoted_isa_mt)) && (NIL != sbhl_search_vars.relevant_sbhl_tvP(quoted_isa_tv))) {
                                result = cons(naut, result);
                                SubLObject cdolist_list_var_$80;
                                final SubLObject new_list = cdolist_list_var_$80 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module)) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_forward_directed_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), module);
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$80.first();
                                while (NIL != cdolist_list_var_$80) {
                                    final SubLObject _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        final SubLObject sol;
                                        final SubLObject link_nodes = sol = funcall(generating_fn, naut);
                                        if (NIL != set.set_p(sol)) {
                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject link_node;
                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                link_node = set_contents.do_set_contents_next(basis_object, state);
                                                if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                    result = cons(link_node, result);
                                                }
                                            }
                                        } else
                                            if (sol.isList()) {
                                                SubLObject csome_list_var = sol;
                                                SubLObject link_node2 = NIL;
                                                link_node2 = csome_list_var.first();
                                                while (NIL != csome_list_var) {
                                                    result = cons(link_node2, result);
                                                    csome_list_var = csome_list_var.rest();
                                                    link_node2 = csome_list_var.first();
                                                } 
                                            } else {
                                                Errors.error($str3$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }

                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$79, thread);
                                    }
                                    cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                                    generating_fn = cdolist_list_var_$80.first();
                                } 
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list89);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        quoted_isa_tuple = cdolist_list_var.first();
                    } 
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$78, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$78, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$77, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return delete_duplicates(result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp;  The isas of all of TERMS, from assertions (isa term <naut>).
     */
    @LispMethod(comment = "@return listp;  The isas of all of TERMS, from assertions (isa term <naut>).")
    public static final SubLObject union_quoted_isas_from_naut_arg2_alt(SubLObject terms, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                result = nconc(com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.isas_from_naut_arg2(v_term, mt, tv), result);
            }
            return delete_duplicates(result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return listp;  The isas of all of TERMS, from assertions (isa term <naut>).
     */
    @LispMethod(comment = "@return listp;  The isas of all of TERMS, from assertions (isa term <naut>).")
    public static SubLObject union_quoted_isas_from_naut_arg2(final SubLObject terms, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nconc(isas_from_naut_arg2(v_term, mt, tv), result);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return delete_duplicates(result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Iterator. Iterates over the isas accessible to TERM from (isa TERM <naut>).
     */
    @LispMethod(comment = "Iterator. Iterates over the isas accessible to TERM from (isa TERM <naut>).")
    public static final SubLObject do_quoted_isas_from_naut_arg2_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt65);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject quoted_isa_var = NIL;
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    quoted_isa_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    v_term = current.first();
                    current = current.rest();
                    {
                        SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt65);
                        current = current.rest();
                        {
                            SubLObject tv = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt65);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                {
                                    SubLObject body = current;
                                    SubLObject module = $sym66$MODULE;
                                    SubLObject quoted_isa_tuple = $sym67$QUOTED_ISA_TUPLE;
                                    SubLObject naut = $sym68$NAUT;
                                    SubLObject quoted_isa_mt = $sym69$QUOTED_ISA_MT;
                                    SubLObject quoted_isa_tv = $sym70$QUOTED_ISA_TV;
                                    return list(CLET, list(bq_cons(module, $list_alt48)), list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_MODULE, module, list(CDOLIST, list(quoted_isa_tuple, listS(GETHASH, v_term, $list_alt71)), list(CDESTRUCTURING_BIND, list(naut, quoted_isa_mt, quoted_isa_tv), quoted_isa_tuple, list(PWHEN, list(CAND, list($sym58$RELEVANT_MT_, quoted_isa_mt), list($sym59$RELEVANT_SBHL_TV_, quoted_isa_tv)), listS(CLET, list(list(quoted_isa_var, naut)), append(body, NIL)), listS(DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, list(quoted_isa_var, naut, $list_alt61, module), append(body, NIL)))))))));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt65);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterator. Iterates over the isas accessible to TERM from (isa TERM <naut>).
     */
    @LispMethod(comment = "Iterator. Iterates over the isas accessible to TERM from (isa TERM <naut>).")
    public static SubLObject do_quoted_isas_from_naut_arg2(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list90);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject quoted_isa_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list90);
        quoted_isa_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list90);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list90);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list90);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module = $sym91$MODULE;
            final SubLObject quoted_isa_tuple = $sym92$QUOTED_ISA_TUPLE;
            final SubLObject naut = $sym93$NAUT;
            final SubLObject quoted_isa_mt = $sym94$QUOTED_ISA_MT;
            final SubLObject quoted_isa_tv = $sym95$QUOTED_ISA_TV;
            return list(CLET, list(bq_cons(module, $list74)), list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_MODULE, module, list(CDOLIST, list(quoted_isa_tuple, listS(GETHASH, v_term, $list96)), list(CDESTRUCTURING_BIND, list(naut, quoted_isa_mt, quoted_isa_tv), quoted_isa_tuple, list(PWHEN, list(CAND, list($sym84$RELEVANT_MT_, quoted_isa_mt), list($sym85$RELEVANT_SBHL_TV_, quoted_isa_tv)), listS(CLET, list(list(quoted_isa_var, naut)), append(body, NIL)), listS(DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, list(quoted_isa_var, naut, $list87, module), append(body, NIL)))))))));
        }
        cdestructuring_bind_error(datum, $list90);
        return NIL;
    }

    public static final SubLObject do_non_fort_isas_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt74);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject col_var = NIL;
                    SubLObject ins = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    col_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    ins = current.first();
                    current = current.rest();
                    {
                        SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt74);
                        current = current.rest();
                        {
                            SubLObject tv = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt74);
                            current = current.rest();
                            {
                                SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt74);
                                current = current.rest();
                                if (NIL == current) {
                                    current = temp;
                                    {
                                        SubLObject body = current;
                                        SubLObject isa_tuple = $sym75$ISA_TUPLE;
                                        SubLObject table_mt = $sym76$TABLE_MT;
                                        SubLObject table_tv = $sym77$TABLE_TV;
                                        return list(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TV, tv, list(CSOME, list(isa_tuple, listS(GETHASH_WITHOUT_VALUES, ins, $list_alt82), done_var), list(CDESTRUCTURING_BIND, list(col_var, table_mt, table_tv), isa_tuple, listS(PWHEN, list(CAND, list($sym58$RELEVANT_MT_, table_mt), list($sym59$RELEVANT_SBHL_TV_, table_tv)), append(body, NIL))))));
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt74);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_non_fort_isas(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject col_var = NIL;
        SubLObject ins = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        col_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        ins = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list99);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list99);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list99);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject isa_tuple = $sym100$ISA_TUPLE;
            final SubLObject table_mt = $sym101$TABLE_MT;
            final SubLObject table_tv = $sym102$TABLE_TV;
            return list(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TV, tv, list(CSOME, list(isa_tuple, listS(GETHASH_WITHOUT_VALUES, ins, $list107), done_var), list(CDESTRUCTURING_BIND, list(col_var, table_mt, table_tv), isa_tuple, listS(PWHEN, list(CAND, list($sym84$RELEVANT_MT_, table_mt), list($sym85$RELEVANT_SBHL_TV_, table_tv)), append(body, NIL))))));
        }
        cdestructuring_bind_error(datum, $list99);
        return NIL;
    }

    /**
     * For use by the dumper ONLY
     */
    @LispMethod(comment = "For use by the dumper ONLY")
    public static final SubLObject set_non_fort_isa_table_alt(SubLObject table) {
        SubLTrampolineFile.checkType(table, HASH_TABLE_P);
        $non_fort_isa_table$.setGlobalValue(table);
        return NIL;
    }

    /**
     * For use by the dumper ONLY
     */
    @LispMethod(comment = "For use by the dumper ONLY")
    public static SubLObject set_non_fort_isa_table(final SubLObject table) {
        assert NIL != hash_table_p(table) : "! hash_table_p(table) " + ("Types.hash_table_p(table) " + "CommonSymbols.NIL != Types.hash_table_p(table) ") + table;
        $non_fort_isa_table$.setGlobalValue(table);
        return NIL;
    }

    /**
     * For use by the dumper ONLY
     */
    @LispMethod(comment = "For use by the dumper ONLY")
    public static final SubLObject set_non_fort_instance_table_alt(SubLObject table) {
        SubLTrampolineFile.checkType(table, HASH_TABLE_P);
        $non_fort_instance_table$.setGlobalValue(table);
        return NIL;
    }

    /**
     * For use by the dumper ONLY
     */
    @LispMethod(comment = "For use by the dumper ONLY")
    public static SubLObject set_non_fort_instance_table(final SubLObject table) {
        assert NIL != hash_table_p(table) : "! hash_table_p(table) " + ("Types.hash_table_p(table) " + "CommonSymbols.NIL != Types.hash_table_p(table) ") + table;
        $non_fort_instance_table$.setGlobalValue(table);
        return NIL;
    }

    /**
     * For use by ONLY the dumper.
     */
    @LispMethod(comment = "For use by ONLY the dumper.")
    public static final SubLObject non_fort_isa_table_alt() {
        return $non_fort_isa_table$.getGlobalValue();
    }

    /**
     * For use by ONLY the dumper.
     */
    @LispMethod(comment = "For use by ONLY the dumper.")
    public static SubLObject non_fort_isa_table() {
        return $non_fort_isa_table$.getGlobalValue();
    }

    /**
     * For use by ONLY the dumper and the macro do-non-fort-direct-instance-links.
     */
    @LispMethod(comment = "For use by ONLY the dumper and the macro do-non-fort-direct-instance-links.")
    public static final SubLObject non_fort_instance_table_alt() {
        return $non_fort_instance_table$.getGlobalValue();
    }

    /**
     * For use by ONLY the dumper and the macro do-non-fort-direct-instance-links.
     */
    @LispMethod(comment = "For use by ONLY the dumper and the macro do-non-fort-direct-instance-links.")
    public static SubLObject non_fort_instance_table() {
        return $non_fort_instance_table$.getGlobalValue();
    }

    public static final SubLObject non_fort_isa_tables_unbuiltP_alt() {
        return makeBoolean((NIL != misc_utilities.uninitialized_p($non_fort_isa_table$.getGlobalValue())) || (NIL != misc_utilities.uninitialized_p($non_fort_instance_table$.getGlobalValue())));
    }

    public static SubLObject non_fort_isa_tables_unbuiltP() {
        return makeBoolean((NIL != misc_utilities.uninitialized_p($non_fort_isa_table$.getGlobalValue())) || (NIL != misc_utilities.uninitialized_p($non_fort_instance_table$.getGlobalValue())));
    }

    /**
     * For use by core-kb loading ONLY
     */
    @LispMethod(comment = "For use by core-kb loading ONLY")
    public static final SubLObject initialize_non_fort_isa_tables_alt() {
        $non_fort_isa_table$.setGlobalValue(make_hash_table($int$256, symbol_function(EQUAL), UNPROVIDED));
        $non_fort_instance_table$.setGlobalValue(make_hash_table($int$256, symbol_function(EQ), UNPROVIDED));
        return NIL;
    }

    /**
     * For use by core-kb loading ONLY
     */
    @LispMethod(comment = "For use by core-kb loading ONLY")
    public static SubLObject initialize_non_fort_isa_tables() {
        $non_fort_isa_table$.setGlobalValue(make_hash_table($int$256, symbol_function(EQUAL), UNPROVIDED));
        $non_fort_instance_table$.setGlobalValue(make_hash_table($int$256, symbol_function(EQL), UNPROVIDED));
        return NIL;
    }

    /**
     * For use by the dumper ONLY
     */
    @LispMethod(comment = "For use by the dumper ONLY")
    public static final SubLObject rebuild_non_fort_isa_tables_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.initialize_non_fort_isa_tables();
            {
                SubLObject count = ZERO_INTEGER;
                force_format(T, $str_alt85$__Rebuilding_non_fort___isa_table, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = $$isa;
                            if (NIL != do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_49 = NIL;
                                                            SubLObject token_var_50 = NIL;
                                                            while (NIL == done_var_49) {
                                                                {
                                                                    SubLObject gaf = iteration_next_without_values_macro_helper(final_index_iterator, token_var_50);
                                                                    SubLObject valid_51 = makeBoolean(token_var_50 != gaf);
                                                                    if (NIL != valid_51) {
                                                                        {
                                                                            SubLObject ins = gaf_arg1(gaf);
                                                                            if (NIL != forts.non_fort_p(ins)) {
                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.add_non_fort_isa(gaf);
                                                                                count = add(count, ONE_INTEGER);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_49 = makeBoolean(NIL == valid_51);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_52, thread);
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
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    /**
     * For use by the dumper ONLY
     */
    @LispMethod(comment = "For use by the dumper ONLY")
    public static SubLObject rebuild_non_fort_isa_tables() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        initialize_non_fort_isa_tables();
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$isa;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = $str110$Rebuilding_non_fort___isa_tables_;
                final SubLObject _prev_bind_0_$82 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$83 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$84 = NIL;
                                final SubLObject token_var_$85 = NIL;
                                while (NIL == done_var_$84) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$85);
                                    final SubLObject valid_$86 = makeBoolean(!token_var_$85.eql(gaf));
                                    if (NIL != valid_$86) {
                                        final SubLObject ins = assertions_high.gaf_arg1(gaf);
                                        if (NIL != forts.non_fort_p(ins)) {
                                            add_non_fort_isa(gaf);
                                            count = add(count, ONE_INTEGER);
                                        }
                                    }
                                    done_var_$84 = makeBoolean(NIL == valid_$86);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$83, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$82, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject non_fort_isaP_alt(SubLObject ins, SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(ins, NON_FORT_P);
            {
                SubLObject resultP = NIL;
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
                            SubLObject tv_var = tv;
                            {
                                SubLObject _prev_bind_0_53 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1_54 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_search_truth_value_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                                            } else {
                                                                Errors.warn($str_alt12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL == resultP) {
                                        {
                                            SubLObject csome_list_var = gethash_without_values(ins, com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.non_fort_isa_table(), UNPROVIDED);
                                            SubLObject isa_tuple = NIL;
                                            for (isa_tuple = csome_list_var.first(); !((NIL != resultP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , isa_tuple = csome_list_var.first()) {
                                                {
                                                    SubLObject datum = isa_tuple;
                                                    SubLObject current = datum;
                                                    SubLObject candidate_col = NIL;
                                                    SubLObject table_mt = NIL;
                                                    SubLObject table_tv = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt89);
                                                    candidate_col = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt89);
                                                    table_mt = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt89);
                                                    table_tv = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if ((NIL != mt_relevance_macros.relevant_mtP(table_mt)) && (NIL != sbhl_search_vars.relevant_sbhl_tvP(table_tv))) {
                                                            if (NIL != genls.genlsP(candidate_col, col, mt, tv)) {
                                                                resultP = T;
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt89);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_54, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_53, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return resultP;
            }
        }
    }

    public static SubLObject non_fort_isaP(final SubLObject ins, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.non_fort_p(ins) : "! forts.non_fort_p(ins) " + ("forts.non_fort_p(ins) " + "CommonSymbols.NIL != forts.non_fort_p(ins) ") + ins;
        SubLObject resultP = NIL;
        if ((NIL != possibly_naut_p(ins)) && (NIL != genls.any_specP(col, kb_accessors.result_isa(cycl_utilities.formula_arg0(ins), UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
            resultP = T;
        } else
            if ((NIL != el_set_p(ins)) && (NIL != narts_high.nart_with_functor_p($$SetOfTypeFn, col))) {
                final SubLObject set_of_instances_col = cycl_utilities.nat_arg1(col, UNPROVIDED);
                SubLObject failureP = NIL;
                if (NIL == failureP) {
                    SubLObject csome_list_var = el_set_items(ins);
                    SubLObject ins_elem = NIL;
                    ins_elem = csome_list_var.first();
                    while ((NIL == failureP) && (NIL != csome_list_var)) {
                        if (NIL == isa.isaP(ins_elem, set_of_instances_col, UNPROVIDED, UNPROVIDED)) {
                            failureP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        ins_elem = csome_list_var.first();
                    } 
                }
                if (NIL == failureP) {
                    resultP = T;
                }
            } else
                if ((NIL != el_list_p(ins)) && (NIL != narts_high.nart_with_functor_p($$ListOfSpecsFn, col))) {
                    final SubLObject list_of_specs_col = cycl_utilities.nat_arg1(col, UNPROVIDED);
                    SubLObject failureP = NIL;
                    if (NIL == failureP) {
                        SubLObject csome_list_var = el_list_items(ins);
                        SubLObject ins_elem = NIL;
                        ins_elem = csome_list_var.first();
                        while ((NIL == failureP) && (NIL != csome_list_var)) {
                            if (NIL == genls.genlsP(ins_elem, list_of_specs_col, UNPROVIDED, UNPROVIDED)) {
                                failureP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            ins_elem = csome_list_var.first();
                        } 
                    }
                    if (NIL == failureP) {
                        resultP = T;
                    }
                } else
                    if ((NIL != el_set_p(ins)) && (NIL != narts_high.nart_with_functor_p($$SetOfSpecsFn, col))) {
                        final SubLObject set_of_specs_col = cycl_utilities.nat_arg1(col, UNPROVIDED);
                        SubLObject failureP = NIL;
                        if (NIL == failureP) {
                            SubLObject csome_list_var = el_set_items(ins);
                            SubLObject ins_elem = NIL;
                            ins_elem = csome_list_var.first();
                            while ((NIL == failureP) && (NIL != csome_list_var)) {
                                if (NIL == genls.genlsP(ins_elem, set_of_specs_col, UNPROVIDED, UNPROVIDED)) {
                                    failureP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                ins_elem = csome_list_var.first();
                            } 
                        }
                        if (NIL == failureP) {
                            resultP = T;
                        }
                    } else {
                        final SubLObject mt_var = mt;
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject tv_var = tv;
                            final SubLObject _prev_bind_0_$88 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$89 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_search_truth_value_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                            } else {
                                                Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                            }


                                }
                                if (NIL == resultP) {
                                    SubLObject csome_list_var2 = gethash_without_values(ins, non_fort_isa_table(), UNPROVIDED);
                                    SubLObject isa_tuple = NIL;
                                    isa_tuple = csome_list_var2.first();
                                    while ((NIL == resultP) && (NIL != csome_list_var2)) {
                                        SubLObject current;
                                        final SubLObject datum = current = isa_tuple;
                                        SubLObject candidate_col = NIL;
                                        SubLObject table_mt = NIL;
                                        SubLObject table_tv = NIL;
                                        destructuring_bind_must_consp(current, datum, $list116);
                                        candidate_col = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list116);
                                        table_mt = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list116);
                                        table_tv = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (((NIL != mt_relevance_macros.relevant_mtP(table_mt)) && (NIL != sbhl_search_vars.relevant_sbhl_tvP(table_tv))) && (NIL != genls.genlsP(candidate_col, col, mt, tv))) {
                                                resultP = T;
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list116);
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        isa_tuple = csome_list_var2.first();
                                    } 
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$89, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$88, thread);
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }



        return resultP;
    }

    public static final SubLObject non_fort_isa_anyP_alt(SubLObject ins, SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(ins, NON_FORT_P);
        {
            SubLObject cdolist_list_var = cols;
            SubLObject col = NIL;
            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.non_fort_isaP(ins, col, mt, tv)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject non_fort_isa_anyP(final SubLObject ins, final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.non_fort_p(ins) : "! forts.non_fort_p(ins) " + ("forts.non_fort_p(ins) " + "CommonSymbols.NIL != forts.non_fort_p(ins) ") + ins;
        SubLObject cdolist_list_var = cols;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != non_fort_isaP(ins, col, mt, tv)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject non_fort_isa_allP_alt(SubLObject ins, SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(ins, NON_FORT_P);
        {
            SubLObject cdolist_list_var = cols;
            SubLObject col = NIL;
            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.non_fort_isaP(ins, col, mt, tv)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject non_fort_isa_allP(final SubLObject ins, final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.non_fort_p(ins) : "! forts.non_fort_p(ins) " + ("forts.non_fort_p(ins) " + "CommonSymbols.NIL != forts.non_fort_p(ins) ") + ins;
        SubLObject cdolist_list_var = cols;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == non_fort_isaP(ins, col, mt, tv)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject non_fort_isas_alt(SubLObject ins, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cols = NIL;
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
                            SubLObject tv_var = tv;
                            {
                                SubLObject _prev_bind_0_55 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1_56 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_search_truth_value_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                                            } else {
                                                                Errors.warn($str_alt12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject csome_list_var = gethash_without_values(ins, com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.non_fort_isa_table(), UNPROVIDED);
                                        SubLObject isa_tuple = NIL;
                                        for (isa_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , isa_tuple = csome_list_var.first()) {
                                            {
                                                SubLObject datum = isa_tuple;
                                                SubLObject current = datum;
                                                SubLObject col = NIL;
                                                SubLObject table_mt = NIL;
                                                SubLObject table_tv = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt90);
                                                col = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt90);
                                                table_mt = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt90);
                                                table_tv = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    if ((NIL != mt_relevance_macros.relevant_mtP(table_mt)) && (NIL != sbhl_search_vars.relevant_sbhl_tvP(table_tv))) {
                                                        cols = cons(col, cols);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt90);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_56, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_55, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return cols;
            }
        }
    }

    public static SubLObject non_fort_isas(final SubLObject ins, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cols = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$90 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$91 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_search_truth_value_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                            } else {
                                Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_SEARCH_TRUTH_VALUE_P);
                            }


                }
                SubLObject csome_list_var = gethash_without_values(ins, non_fort_isa_table(), UNPROVIDED);
                SubLObject isa_tuple = NIL;
                isa_tuple = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = isa_tuple;
                    SubLObject col = NIL;
                    SubLObject table_mt = NIL;
                    SubLObject table_tv = NIL;
                    destructuring_bind_must_consp(current, datum, $list117);
                    col = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list117);
                    table_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list117);
                    table_tv = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((NIL != mt_relevance_macros.relevant_mtP(table_mt)) && (NIL != sbhl_search_vars.relevant_sbhl_tvP(table_tv))) {
                            cols = cons(col, cols);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list117);
                    }
                    csome_list_var = csome_list_var.rest();
                    isa_tuple = csome_list_var.first();
                } 
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$91, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$90, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cols;
    }

    public static final SubLObject non_fort_all_isa_alt(SubLObject ins, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(ins, NON_FORT_P);
        return genls.union_all_genls(com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.non_fort_isas(ins, mt, tv), mt, tv);
    }

    public static SubLObject non_fort_all_isa(final SubLObject ins, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.non_fort_p(ins) : "! forts.non_fort_p(ins) " + ("forts.non_fort_p(ins) " + "CommonSymbols.NIL != forts.non_fort_p(ins) ") + ins;
        return genls.union_all_genls(non_fort_isas(ins, mt, tv), mt, tv);
    }

    public static final SubLObject non_fort_instance_table_lookup_alt(SubLObject col) {
        return gethash_without_values(col, $non_fort_instance_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject non_fort_instance_table_lookup(final SubLObject col) {
        return gethash_without_values(col, $non_fort_instance_table$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Called by the afterAdding for #$isa
     */
    @LispMethod(comment = "Called by the afterAdding for #$isa")
    public static final SubLObject possibly_add_non_fort_isa_alt(SubLObject gaf) {
        {
            SubLObject ins = gaf_arg1(gaf);
            if (NIL != forts.non_fort_p(ins)) {
                if (NIL != assertion_utilities.true_assertionP(gaf)) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.add_non_fort_isa(gaf);
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     * Called by the afterAdding for #$isa
     */
    @LispMethod(comment = "Called by the afterAdding for #$isa")
    public static SubLObject possibly_add_non_fort_isa(final SubLObject gaf) {
        final SubLObject ins = assertions_high.gaf_arg1(gaf);
        if ((NIL != forts.non_fort_p(ins)) && (NIL != assertion_utilities.true_assertionP(gaf))) {
            add_non_fort_isa(gaf);
            return T;
        }
        return NIL;
    }

    /**
     * Called by the afterRemoving for #$isa
     */
    @LispMethod(comment = "Called by the afterRemoving for #$isa")
    public static final SubLObject possibly_remove_non_fort_isa_alt(SubLObject gaf) {
        {
            SubLObject ins = gaf_arg1(gaf);
            if (NIL != forts.non_fort_p(ins)) {
                if (NIL != assertion_utilities.true_assertionP(gaf)) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.remove_non_fort_isa(gaf);
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     * Called by the afterRemoving for #$isa
     */
    @LispMethod(comment = "Called by the afterRemoving for #$isa")
    public static SubLObject possibly_remove_non_fort_isa(final SubLObject gaf) {
        final SubLObject ins = assertions_high.gaf_arg1(gaf);
        if ((NIL != forts.non_fort_p(ins)) && (NIL != assertion_utilities.true_assertionP(gaf))) {
            remove_non_fort_isa(gaf);
            return T;
        }
        return NIL;
    }

    public static final SubLObject add_non_fort_isa_alt(SubLObject gaf) {
        {
            SubLObject ins = gaf_arg1(gaf);
            SubLObject col = gaf_arg2(gaf);
            SubLObject mt = assertion_mt(gaf);
            SubLObject tv = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.assertion_sbhl_tv(gaf);
            SubLObject isa_tuple = list(col, mt, tv);
            SubLObject instance_tuple = list(ins, mt, tv);
            hash_table_utilities.pushnew_hash(ins, isa_tuple, $non_fort_isa_table$.getGlobalValue(), symbol_function(EQUAL));
            hash_table_utilities.pushnew_hash(col, instance_tuple, $non_fort_instance_table$.getGlobalValue(), symbol_function(EQUAL));
        }
        return NIL;
    }

    public static SubLObject add_non_fort_isa(final SubLObject gaf) {
        final SubLObject ins = assertions_high.gaf_arg1(gaf);
        final SubLObject col = assertions_high.gaf_arg2(gaf);
        final SubLObject mt = assertions_high.assertion_mt(gaf);
        final SubLObject tv = assertion_sbhl_tv(gaf);
        final SubLObject isa_tuple = list(col, mt, tv);
        final SubLObject instance_tuple = list(ins, mt, tv);
        hash_table_utilities.pushnew_hash(ins, isa_tuple, $non_fort_isa_table$.getGlobalValue(), symbol_function(EQUAL));
        hash_table_utilities.pushnew_hash(col, instance_tuple, $non_fort_instance_table$.getGlobalValue(), symbol_function(EQUAL));
        return NIL;
    }

    public static final SubLObject remove_non_fort_isa_alt(SubLObject gaf) {
        {
            SubLObject ins = gaf_arg1(gaf);
            SubLObject col = gaf_arg2(gaf);
            SubLObject mt = assertion_mt(gaf);
            SubLObject tv = com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.assertion_sbhl_tv(gaf);
            SubLObject isa_tuple = list(col, mt, tv);
            SubLObject instance_tuple = list(ins, mt, tv);
            hash_table_utilities.delete_hash(ins, isa_tuple, $non_fort_isa_table$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
            hash_table_utilities.delete_hash(col, instance_tuple, $non_fort_instance_table$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject remove_non_fort_isa(final SubLObject gaf) {
        final SubLObject ins = assertions_high.gaf_arg1(gaf);
        final SubLObject col = assertions_high.gaf_arg2(gaf);
        final SubLObject mt = assertions_high.assertion_mt(gaf);
        final SubLObject tv = assertion_sbhl_tv(gaf);
        final SubLObject isa_tuple = list(col, mt, tv);
        final SubLObject instance_tuple = list(ins, mt, tv);
        hash_table_utilities.delete_hash(ins, isa_tuple, $non_fort_isa_table$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
        hash_table_utilities.delete_hash(col, instance_tuple, $non_fort_instance_table$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
        return NIL;
    }

    /**
     * Removes all links from NODE within MT leaving only the top-level
     * direction-link in MODULE / *sbhl-module*.
     *
     * @see remove-sbhl-mt-link-from-relevant-directions
     */
    @LispMethod(comment = "Removes all links from NODE within MT leaving only the top-level\r\ndirection-link in MODULE / *sbhl-module*.\r\n\r\n@see remove-sbhl-mt-link-from-relevant-directions\nRemoves all links from NODE within MT leaving only the top-level\ndirection-link in MODULE / *sbhl-module*.")
    public static final SubLObject clear_sbhl_links_within_mt_alt(SubLObject node, SubLObject mt, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        sbhl_links.remove_sbhl_mt_link_from_relevant_directions(node, mt, module);
        return NIL;
    }

    /**
     * Removes all links from NODE within MT leaving only the top-level
     * direction-link in MODULE / *sbhl-module*.
     *
     * @see remove-sbhl-mt-link-from-relevant-directions
     */
    @LispMethod(comment = "Removes all links from NODE within MT leaving only the top-level\r\ndirection-link in MODULE / *sbhl-module*.\r\n\r\n@see remove-sbhl-mt-link-from-relevant-directions\nRemoves all links from NODE within MT leaving only the top-level\ndirection-link in MODULE / *sbhl-module*.")
    public static SubLObject clear_sbhl_links_within_mt(final SubLObject node, final SubLObject mt, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        sbhl_links.remove_sbhl_mt_link_from_relevant_directions(node, mt, module);
        return NIL;
    }

    /**
     * Removes all link data from slot in graph corresponding to NODE and
     * MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Removes all link data from slot in graph corresponding to NODE and\r\nMODULE / *sbhl-module*\nRemoves all link data from slot in graph corresponding to NODE and\nMODULE / *sbhl-module*")
    public static final SubLObject clear_sbhl_links_alt(SubLObject node, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        sbhl_graphs.remove_sbhl_graph_link(node, module);
        return NIL;
    }

    /**
     * Removes all link data from slot in graph corresponding to NODE and
     * MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Removes all link data from slot in graph corresponding to NODE and\r\nMODULE / *sbhl-module*\nRemoves all link data from slot in graph corresponding to NODE and\nMODULE / *sbhl-module*")
    public static SubLObject clear_sbhl_links(final SubLObject node, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        sbhl_graphs.remove_sbhl_graph_link(node, module);
        return NIL;
    }

    /**
     * Removes all sbhl links associated with node, for all sbhl predicates
     */
    @LispMethod(comment = "Removes all sbhl links associated with node, for all sbhl predicates")
    public static final SubLObject clear_all_sbhl_links_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.clear_sbhl_links(node, UNPROVIDED);
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    /**
     * Removes all sbhl links associated with node, for all sbhl predicates
     */
    @LispMethod(comment = "Removes all sbhl links associated with node, for all sbhl predicates")
    public static SubLObject clear_all_sbhl_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list118);
            key = current.first();
            current = module = current.rest();
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                clear_sbhl_links(node, UNPROVIDED);
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Removes all link data for NODE within MT, for all sbhl predicates
     */
    @LispMethod(comment = "Removes all link data for NODE within MT, for all sbhl predicates")
    public static final SubLObject clear_all_sbhl_links_within_mt_alt(SubLObject node, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.clear_sbhl_links_within_mt(node, mt, UNPROVIDED);
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    /**
     * Removes all link data for NODE within MT, for all sbhl predicates
     */
    @LispMethod(comment = "Removes all link data for NODE within MT, for all sbhl predicates")
    public static SubLObject clear_all_sbhl_links_within_mt(final SubLObject node, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list118);
            key = current.first();
            current = module = current.rest();
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                clear_sbhl_links_within_mt(node, mt, UNPROVIDED);
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject remove_node_from_sbhl_graphs_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                {
                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
                                    if (NIL != d_link) {
                                        {
                                            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(module);
                                            SubLObject direction = NIL;
                                            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                {
                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                                                    if (NIL != mt_links) {
                                                        {
                                                            SubLObject iteration_state_57 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_57)) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state_57);
                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject iteration_state_58 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_58)) {
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_58);
                                                                                SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                    SubLObject cdolist_list_var_59 = new_list;
                                                                                    SubLObject link_node = NIL;
                                                                                    for (link_node = cdolist_list_var_59.first(); NIL != cdolist_list_var_59; cdolist_list_var_59 = cdolist_list_var_59.rest() , link_node = cdolist_list_var_59.first()) {
                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.remove_sbhl_link(node, link_node, mt, tv);
                                                                                    }
                                                                                }
                                                                                iteration_state_58 = dictionary_contents.do_dictionary_contents_next(iteration_state_58);
                                                                            }
                                                                        } 
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_58);
                                                                    }
                                                                    iteration_state_57 = dictionary_contents.do_dictionary_contents_next(iteration_state_57);
                                                                }
                                                            } 
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_57);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    public static SubLObject remove_node_from_sbhl_graphs(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list118);
            key = current.first();
            current = module = current.rest();
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
                if (NIL != d_link) {
                    SubLObject cdolist_list_var_$92 = sbhl_module_utilities.get_relevant_sbhl_directions(module);
                    SubLObject direction = NIL;
                    direction = cdolist_list_var_$92.first();
                    while (NIL != cdolist_list_var_$92) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                        if (NIL != mt_links) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$93;
                                for (iteration_state_$93 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$93); iteration_state_$93 = dictionary_contents.do_dictionary_contents_next(iteration_state_$93)) {
                                    thread.resetMultipleValues();
                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$93);
                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    final SubLObject sol = link_nodes_var;
                                    if (NIL != set.set_p(sol)) {
                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                        SubLObject basis_object;
                                        SubLObject state;
                                        SubLObject link_node;
                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                            link_node = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                remove_sbhl_link(node, link_node, mt, tv);
                                            }
                                        }
                                    } else
                                        if (sol.isList()) {
                                            SubLObject csome_list_var = sol;
                                            SubLObject link_node2 = NIL;
                                            link_node2 = csome_list_var.first();
                                            while (NIL != csome_list_var) {
                                                remove_sbhl_link(node, link_node2, mt, tv);
                                                csome_list_var = csome_list_var.rest();
                                                link_node2 = csome_list_var.first();
                                            } 
                                        } else {
                                            Errors.error($str3$_A_is_neither_SET_P_nor_LISTP_, sol);
                                        }

                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$93);
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                        direction = cdolist_list_var_$92.first();
                    } 
                }
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLString $str_alt3$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt7$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt12$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt14$tv___a__does_not_satisfy_sbhl_tru = makeString("tv, ~a, does not satisfy sbhl-true-tv-p");

    static private final SubLString $str_alt15$sbhl_link_nodes_never_called_ = makeString("sbhl-link-nodes never called.");

    static private final SubLString $str_alt17$tv___a__does_not_satisfy_sbhl_fal = makeString("tv, ~a, does not satisfy sbhl-false-tv-p");

    static private final SubLString $$$Initializing_SBHL_Graph_Links = makeString("Initializing SBHL Graph Links");

    static private final SubLString $str_alt29$adding_sbhl_links_for___a_with_tr = makeString("adding sbhl links for: ~a with truth ~a.~%");

    static private final SubLString $str_alt30$Link_node___a__not_present_in_for = makeString("Link node, ~a, not present in forward links after performing (store-in-sbhl-graph ~a ~a ~a ~a). ~%");

    static private final SubLString $str_alt31$Link_node___a__not_present_in_bac = makeString("Link node, ~a, not present in backward links after performing (store-in-sbhl-graph ~a ~a ~a ~a). ~%");

    static private final SubLString $str_alt32$Cannot_remove_link_node___a__not_ = makeString("Cannot remove link node, ~a, not within links specified by node ~a, direction ~a, mt ~a, tv ~a, within *sbhl-module*~%");

    /**
     * Removes all data from graph associated with MODULE.
     */
    @LispMethod(comment = "Removes all data from graph associated with MODULE.")
    public static final SubLObject clear_sbhl_module_graph_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        sbhl_graphs.clear_sbhl_graph(sbhl_module_utilities.get_sbhl_graph(module));
        return NIL;
    }

    /**
     * Removes all data from graph associated with MODULE.
     */
    @LispMethod(comment = "Removes all data from graph associated with MODULE.")
    public static SubLObject clear_sbhl_module_graph(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        sbhl_graphs.clear_sbhl_graph(sbhl_module_utilities.get_sbhl_graph(module));
        return NIL;
    }

    static private final SubLString $str_alt33$Removing__a_from__a_forward_direc = makeString("Removing ~a from ~a forward direction link");

    static private final SubLString $str_alt34$Removing__a_from__a_backward_dire = makeString("Removing ~a from ~a backward direction link");

    /**
     * Clears each of the sbhl graphs
     */
    @LispMethod(comment = "Clears each of the sbhl graphs")
    public static final SubLObject clear_all_sbhl_data_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject v_graph = sbhl_module_vars.get_sbhl_module_graph(module);
                            sbhl_graphs.clear_sbhl_graph(v_graph);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    /**
     * Clears each of the sbhl graphs
     */
    @LispMethod(comment = "Clears each of the sbhl graphs")
    public static SubLObject clear_all_sbhl_data() {
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list118);
            key = current.first();
            current = module = current.rest();
            final SubLObject v_graph = sbhl_module_vars.get_sbhl_module_graph(module);
            sbhl_graphs.clear_sbhl_graph(v_graph);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLSymbol $sym35$_ISA_ARG2_NAUT_TABLE_ = makeSymbol("*ISA-ARG2-NAUT-TABLE*");

    static private final SubLList $list_alt40 = list(makeSymbol("NAUT"), makeSymbol("ISA-MT"), makeSymbol("ISA-TV"));

    static private final SubLList $list_alt41 = list(list(makeSymbol("ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym42$MODULE = makeUninternedSymbol("MODULE");

    static private final SubLSymbol $sym43$ISA_TUPLE = makeUninternedSymbol("ISA-TUPLE");

    /**
     * performs clrhash on each of the sbhl graphs which does not
     * correspond to a time predicate
     */
    @LispMethod(comment = "performs clrhash on each of the sbhl graphs which does not\r\ncorrespond to a time predicate\nperforms clrhash on each of the sbhl graphs which does not\ncorrespond to a time predicate")
    public static final SubLObject clear_all_sbhl_non_time_data_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject v_graph = sbhl_module_vars.get_sbhl_module_graph(module);
                            if (NIL != sbhl_module_utilities.sbhl_non_time_module_p(module)) {
                                sbhl_graphs.clear_sbhl_graph(v_graph);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.clear_isa_arg2_naut_table();
            return NIL;
        }
    }

    /**
     * performs clrhash on each of the sbhl graphs which does not
     * correspond to a time predicate
     */
    @LispMethod(comment = "performs clrhash on each of the sbhl graphs which does not\r\ncorrespond to a time predicate\nperforms clrhash on each of the sbhl graphs which does not\ncorrespond to a time predicate")
    public static SubLObject clear_all_sbhl_non_time_data() {
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list118);
            key = current.first();
            current = module = current.rest();
            final SubLObject v_graph = sbhl_module_vars.get_sbhl_module_graph(module);
            if (NIL != sbhl_module_utilities.sbhl_non_time_module_p(module)) {
                sbhl_graphs.clear_sbhl_graph(v_graph);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        clear_isa_arg2_naut_table();
        return NIL;
    }

    static private final SubLSymbol $sym44$NAUT = makeUninternedSymbol("NAUT");

    static private final SubLSymbol $sym45$ISA_MT = makeUninternedSymbol("ISA-MT");

    static private final SubLSymbol $sym46$ISA_TV = makeUninternedSymbol("ISA-TV");

    static private final SubLList $list_alt48 = list(list(makeSymbol("GET-SBHL-MODULE"), reader_make_constant_shell("genls")));

    static private final SubLList $list_alt54 = list(makeSymbol("*ISA-ARG2-NAUT-TABLE*"));

    static private final SubLSymbol $sym58$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");

    static private final SubLSymbol $sym59$RELEVANT_SBHL_TV_ = makeSymbol("RELEVANT-SBHL-TV?");

    /**
     * performs clrhash on each of the sbhl graphs which corresponds to
     * a time predicate
     */
    @LispMethod(comment = "performs clrhash on each of the sbhl graphs which corresponds to\r\na time predicate\nperforms clrhash on each of the sbhl graphs which corresponds to\na time predicate")
    public static final SubLObject clear_all_sbhl_time_data_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clrhash($sbhl_temporal_link_support_table$.getGlobalValue());
            clrhash($sbhl_temporal_link_disjunction_support_table$.getGlobalValue());
            clrhash($sbhl_temporal_link_disjunction_term_table$.getGlobalValue());
            $sbhl_extended_universal_date_list$.setGlobalValue(NIL);
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject v_graph = sbhl_module_vars.get_sbhl_module_graph(module);
                            if (NIL == sbhl_module_utilities.sbhl_non_time_module_p(module)) {
                                sbhl_graphs.clear_sbhl_graph(v_graph);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            sbhl_time_dates.clear_sbhl_time_dates();
            sbhl_time_dates.clear_sbhl_time_date_link_tables();
            return NIL;
        }
    }

    /**
     * performs clrhash on each of the sbhl graphs which corresponds to
     * a time predicate
     */
    @LispMethod(comment = "performs clrhash on each of the sbhl graphs which corresponds to\r\na time predicate\nperforms clrhash on each of the sbhl graphs which corresponds to\na time predicate")
    public static SubLObject clear_all_sbhl_time_data() {
        clrhash(sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue());
        clrhash(sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue());
        clrhash(sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue());
        sbhl_time_vars.$sbhl_extended_universal_date_list$.setGlobalValue(NIL);
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list118);
            key = current.first();
            current = module = current.rest();
            final SubLObject v_graph = sbhl_module_vars.get_sbhl_module_graph(module);
            if (NIL == sbhl_module_utilities.sbhl_non_time_module_p(module)) {
                sbhl_graphs.clear_sbhl_graph(v_graph);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        sbhl_time_dates.clear_sbhl_time_dates();
        sbhl_time_dates.clear_sbhl_time_date_link_tables();
        return NIL;
    }

    static private final SubLList $list_alt61 = list(makeSymbol("GET-SBHL-FORWARD-DIRECTED-DIRECTION"));

    static private final SubLSymbol $sym62$_QUOTED_ISA_ARG2_NAUT_TABLE_ = makeSymbol("*QUOTED-ISA-ARG2-NAUT-TABLE*");

    static private final SubLList $list_alt64 = list(makeSymbol("NAUT"), makeSymbol("QUOTED-ISA-MT"), makeSymbol("QUOTED-ISA-TV"));

    static private final SubLList $list_alt65 = list(list(makeSymbol("QUOTED-ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym66$MODULE = makeUninternedSymbol("MODULE");

    static private final SubLSymbol $sym67$QUOTED_ISA_TUPLE = makeUninternedSymbol("QUOTED-ISA-TUPLE");

    static private final SubLSymbol $sym68$NAUT = makeUninternedSymbol("NAUT");

    static private final SubLSymbol $sym69$QUOTED_ISA_MT = makeUninternedSymbol("QUOTED-ISA-MT");

    static private final SubLSymbol $sym70$QUOTED_ISA_TV = makeUninternedSymbol("QUOTED-ISA-TV");

    static private final SubLList $list_alt71 = list(makeSymbol("*QUOTED-ISA-ARG2-NAUT-TABLE*"));

    /**
     *
     *
     * @return fort-p; the first term found that appears in the arg 2
    position of a gaf with predicate of MODULE, arg1 NODE, and mt
    relevance MT.
     */
    @LispMethod(comment = "@return fort-p; the first term found that appears in the arg 2\r\nposition of a gaf with predicate of MODULE, arg1 NODE, and mt\r\nrelevance MT.")
    public static final SubLObject sbhl_any_asserted_true_links_alt(SubLObject module, SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return some_pred_value_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return fort-p; the first term found that appears in the arg 2
    position of a gaf with predicate of MODULE, arg1 NODE, and mt
    relevance MT.
     */
    @LispMethod(comment = "@return fort-p; the first term found that appears in the arg 2\r\nposition of a gaf with predicate of MODULE, arg1 NODE, and mt\r\nrelevance MT.")
    public static SubLObject sbhl_any_asserted_true_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return kb_mapping_utilities.some_pred_value_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, $TRUE);
    }

    static private final SubLList $list_alt74 = list(list(makeSymbol("COL-VAR"), makeSymbol("INS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym75$ISA_TUPLE = makeUninternedSymbol("ISA-TUPLE");

    public static SubLObject sbhl_any_asserted_true_inverse_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return kb_mapping_utilities.some_pred_value_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, $TRUE);
    }

    static private final SubLSymbol $sym76$TABLE_MT = makeUninternedSymbol("TABLE-MT");

    static private final SubLSymbol $sym77$TABLE_TV = makeUninternedSymbol("TABLE-TV");

    static private final SubLList $list_alt82 = list(list(makeSymbol("NON-FORT-ISA-TABLE")));

    static private final SubLString $str_alt85$__Rebuilding_non_fort___isa_table = makeString("~&Rebuilding non-fort #$isa tables...~%");

    /**
     *
     *
     * @return listp; the link-nodes in assertions satisfying
    (PRED NODE link-node) where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp; the link-nodes in assertions satisfying\r\n(PRED NODE link-node) where PRED is MODULE\'s link predicate.")
    public static final SubLObject sbhl_asserted_true_links_alt(SubLObject module, SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
        } else {
            return nconc(pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $TRUE), pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $TRUE));
        }
    }

    /**
     *
     *
     * @return listp; the link-nodes in assertions satisfying
    (PRED NODE link-node) where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp; the link-nodes in assertions satisfying\r\n(PRED NODE link-node) where PRED is MODULE\'s link predicate.")
    public static SubLObject sbhl_asserted_true_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
        }
        return nconc(kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $TRUE), kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $TRUE));
    }

    static private final SubLList $list_alt89 = list(makeSymbol("CANDIDATE-COL"), makeUninternedSymbol("TABLE-MT"), makeUninternedSymbol("TABLE-TV"));

    static private final SubLList $list_alt90 = list(makeSymbol("COL"), makeUninternedSymbol("TABLE-MT"), makeUninternedSymbol("TABLE-TV"));

    /**
     *
     *
     * @return listp; the link-nodes in assertions satisfying
    (not (PRED NODE link-node)) where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp; the link-nodes in assertions satisfying\r\n(not (PRED NODE link-node)) where PRED is MODULE\'s link predicate.")
    public static final SubLObject sbhl_asserted_false_links_alt(SubLObject module, SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $FALSE);
        } else {
            return nconc(pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $FALSE), pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $FALSE));
        }
    }

    /**
     *
     *
     * @return listp; the link-nodes in assertions satisfying
    (not (PRED NODE link-node)) where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp; the link-nodes in assertions satisfying\r\n(not (PRED NODE link-node)) where PRED is MODULE\'s link predicate.")
    public static SubLObject sbhl_asserted_false_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $FALSE);
        }
        return nconc(kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $FALSE), kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $FALSE));
    }

    /**
     *
     *
     * @return listp; the index-nodes assertions satisfying
    (PRED index-node NODE) where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp; the index-nodes assertions satisfying\r\n(PRED index-node NODE) where PRED is MODULE\'s link predicate.")
    public static final SubLObject sbhl_asserted_true_inverse_links_alt(SubLObject module, SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return listp; the index-nodes assertions satisfying
    (PRED index-node NODE) where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp; the index-nodes assertions satisfying\r\n(PRED index-node NODE) where PRED is MODULE\'s link predicate.")
    public static SubLObject sbhl_asserted_true_inverse_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return listp; the index-nodes assertions satisfying
    (not (PRED index-node NODE) where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp; the index-nodes assertions satisfying\r\n(not (PRED index-node NODE) where PRED is MODULE\'s link predicate.")
    public static final SubLObject sbhl_asserted_false_inverse_links_alt(SubLObject module, SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $FALSE);
    }

    /**
     *
     *
     * @return listp; the index-nodes assertions satisfying
    (not (PRED index-node NODE) where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp; the index-nodes assertions satisfying\r\n(not (PRED index-node NODE) where PRED is MODULE\'s link predicate.")
    public static SubLObject sbhl_asserted_false_inverse_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $FALSE);
    }

    /**
     *
     *
     * @return listp. the link-nodes in assertions satisfying
    (PRED NODE link-node) with sources, where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp. the link-nodes in assertions satisfying\r\n(PRED NODE link-node) with sources, where PRED is MODULE\'s link predicate.")
    public static final SubLObject sbhl_supported_true_links_alt(SubLObject module, SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
        } else {
            return nconc(kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $TRUE), kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $TRUE));
        }
    }

    /**
     *
     *
     * @return listp. the link-nodes in assertions satisfying
    (PRED NODE link-node) with sources, where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp. the link-nodes in assertions satisfying\r\n(PRED NODE link-node) with sources, where PRED is MODULE\'s link predicate.")
    public static SubLObject sbhl_supported_true_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
        }
        return nconc(kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $TRUE), kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $TRUE));
    }

    /**
     *
     *
     * @return listp. the link-nodes in assertions satisfying
    (not (PRED NODE link-node)) with sources, where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp. the link-nodes in assertions satisfying\r\n(not (PRED NODE link-node)) with sources, where PRED is MODULE\'s link predicate.")
    public static final SubLObject sbhl_supported_false_links_alt(SubLObject module, SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $FALSE);
        } else {
            return nconc(kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $FALSE), kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $FALSE));
        }
    }

    /**
     *
     *
     * @return listp. the link-nodes in assertions satisfying
    (not (PRED NODE link-node)) with sources, where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp. the link-nodes in assertions satisfying\r\n(not (PRED NODE link-node)) with sources, where PRED is MODULE\'s link predicate.")
    public static SubLObject sbhl_supported_false_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $FALSE);
        }
        return nconc(kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $FALSE), kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $FALSE));
    }

    /**
     *
     *
     * @return listp; the index-nodes assertions satisfying
    (PRED index-node NODE) with sources, where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp; the index-nodes assertions satisfying\r\n(PRED index-node NODE) with sources, where PRED is MODULE\'s link predicate.")
    public static final SubLObject sbhl_supported_true_inverse_links_alt(SubLObject module, SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return listp; the index-nodes assertions satisfying
    (PRED index-node NODE) with sources, where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp; the index-nodes assertions satisfying\r\n(PRED index-node NODE) with sources, where PRED is MODULE\'s link predicate.")
    public static SubLObject sbhl_supported_true_inverse_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return listp; the index-nodes assertions satisfying
    (not (PRED index-node NODE) with sources, where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp; the index-nodes assertions satisfying\r\n(not (PRED index-node NODE) with sources, where PRED is MODULE\'s link predicate.")
    public static final SubLObject sbhl_supported_false_inverse_links_alt(SubLObject module, SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $FALSE);
    }

    /**
     *
     *
     * @return listp; the index-nodes assertions satisfying
    (not (PRED index-node NODE) with sources, where PRED is MODULE's link predicate.
     */
    @LispMethod(comment = "@return listp; the index-nodes assertions satisfying\r\n(not (PRED index-node NODE) with sources, where PRED is MODULE\'s link predicate.")
    public static SubLObject sbhl_supported_false_inverse_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $FALSE);
    }

    public static SubLObject declare_sbhl_link_methods_file() {
        declareFunction("sbhl_access_links", "SBHL-ACCESS-LINKS", 2, 0, false);
        declareFunction("sbhl_predicate_links", "SBHL-PREDICATE-LINKS", 1, 0, false);
        declareFunction("sbhl_inverse_links", "SBHL-INVERSE-LINKS", 1, 0, false);
        declareFunction("sbhl_undirected_links", "SBHL-UNDIRECTED-LINKS", 1, 0, false);
        declareFunction("get_sbhl_graph_link_nodes", "GET-SBHL-GRAPH-LINK-NODES", 4, 0, false);
        declareFunction("get_sbhl_forward_link_nodes", "GET-SBHL-FORWARD-LINK-NODES", 3, 0, false);
        declareFunction("get_sbhl_backward_link_nodes", "GET-SBHL-BACKWARD-LINK-NODES", 3, 0, false);
        declareFunction("member_of_sbhl_link_nodesP", "MEMBER-OF-SBHL-LINK-NODES?", 5, 0, false);
        declareFunction("no_accessible_sbhl_nodes_p", "NO-ACCESSIBLE-SBHL-NODES-P", 1, 0, false);
        declareFunction("sbhl_link_mts", "SBHL-LINK-MTS", 2, 0, false);
        declareFunction("sbhl_forward_mts", "SBHL-FORWARD-MTS", 2, 0, false);
        declareFunction("sbhl_backward_mts", "SBHL-BACKWARD-MTS", 2, 0, false);
        declareFunction("sbhl_link_nodes_by_iteration", "SBHL-LINK-NODES-BY-ITERATION", 2, 0, false);
        declareFunction("sbhl_link_nodes", "SBHL-LINK-NODES", 3, 3, false);
        declareFunction("sbhl_link_nodes_p", "SBHL-LINK-NODES-P", 3, 2, false);
        declareFunction("sbhl_forward_true_link_nodes", "SBHL-FORWARD-TRUE-LINK-NODES", 2, 3, false);
        declareFunction("sbhl_forward_false_link_nodes", "SBHL-FORWARD-FALSE-LINK-NODES", 2, 3, false);
        declareFunction("sbhl_backward_true_link_nodes", "SBHL-BACKWARD-TRUE-LINK-NODES", 2, 3, false);
        declareFunction("sbhl_backward_true_link_nodes_p", "SBHL-BACKWARD-TRUE-LINK-NODES-P", 2, 2, false);
        declareFunction("sbhl_backward_false_link_nodes", "SBHL-BACKWARD-FALSE-LINK-NODES", 2, 3, false);
        declareFunction("sbhl_mt_matching_link_nodes", "SBHL-MT-MATCHING-LINK-NODES", 3, 0, false);
        declareFunction("sbhl_siblings_forward", "SBHL-SIBLINGS-FORWARD", 2, 2, false);
        declareFunction("sbhl_siblings_backward", "SBHL-SIBLINGS-BACKWARD", 2, 2, false);
        declareFunction("make_sbhl_graph_link", "MAKE-SBHL-GRAPH-LINK", 3, 0, false);
        declareFunction("clear_make_sbhl_graph_link_isa", "CLEAR-MAKE-SBHL-GRAPH-LINK-ISA", 0, 0, false);
        declareFunction("remove_make_sbhl_graph_link_isa", "REMOVE-MAKE-SBHL-GRAPH-LINK-ISA", 3, 0, false);
        declareFunction("make_sbhl_graph_link_isa_internal", "MAKE-SBHL-GRAPH-LINK-ISA-INTERNAL", 3, 0, false);
        declareFunction("make_sbhl_graph_link_isa", "MAKE-SBHL-GRAPH-LINK-ISA", 3, 0, false);
        declareFunction("clear_make_sbhl_graph_link_quoted_isa", "CLEAR-MAKE-SBHL-GRAPH-LINK-QUOTED-ISA", 0, 0, false);
        declareFunction("remove_make_sbhl_graph_link_quoted_isa", "REMOVE-MAKE-SBHL-GRAPH-LINK-QUOTED-ISA", 3, 0, false);
        declareFunction("make_sbhl_graph_link_quoted_isa_internal", "MAKE-SBHL-GRAPH-LINK-QUOTED-ISA-INTERNAL", 3, 0, false);
        declareFunction("make_sbhl_graph_link_quoted_isa", "MAKE-SBHL-GRAPH-LINK-QUOTED-ISA", 3, 0, false);
        declareFunction("clear_make_sbhl_graph_link_genls", "CLEAR-MAKE-SBHL-GRAPH-LINK-GENLS", 0, 0, false);
        declareFunction("remove_make_sbhl_graph_link_genls", "REMOVE-MAKE-SBHL-GRAPH-LINK-GENLS", 3, 0, false);
        declareFunction("make_sbhl_graph_link_genls_internal", "MAKE-SBHL-GRAPH-LINK-GENLS-INTERNAL", 3, 0, false);
        declareFunction("make_sbhl_graph_link_genls", "MAKE-SBHL-GRAPH-LINK-GENLS", 3, 0, false);
        declareFunction("clear_make_sbhl_graph_link_genl_preds", "CLEAR-MAKE-SBHL-GRAPH-LINK-GENL-PREDS", 0, 0, false);
        declareFunction("remove_make_sbhl_graph_link_genl_preds", "REMOVE-MAKE-SBHL-GRAPH-LINK-GENL-PREDS", 3, 0, false);
        declareFunction("make_sbhl_graph_link_genl_preds_internal", "MAKE-SBHL-GRAPH-LINK-GENL-PREDS-INTERNAL", 3, 0, false);
        declareFunction("make_sbhl_graph_link_genl_preds", "MAKE-SBHL-GRAPH-LINK-GENL-PREDS", 3, 0, false);
        declareFunction("clear_make_sbhl_graph_link_genl_mt", "CLEAR-MAKE-SBHL-GRAPH-LINK-GENL-MT", 0, 0, false);
        declareFunction("remove_make_sbhl_graph_link_genl_mt", "REMOVE-MAKE-SBHL-GRAPH-LINK-GENL-MT", 3, 0, false);
        declareFunction("make_sbhl_graph_link_genl_mt_internal", "MAKE-SBHL-GRAPH-LINK-GENL-MT-INTERNAL", 3, 0, false);
        declareFunction("make_sbhl_graph_link_genl_mt", "MAKE-SBHL-GRAPH-LINK-GENL-MT", 3, 0, false);
        declareFunction("clear_make_sbhl_graph_link_other", "CLEAR-MAKE-SBHL-GRAPH-LINK-OTHER", 0, 0, false);
        declareFunction("remove_make_sbhl_graph_link_other", "REMOVE-MAKE-SBHL-GRAPH-LINK-OTHER", 3, 0, false);
        declareFunction("make_sbhl_graph_link_other_internal", "MAKE-SBHL-GRAPH-LINK-OTHER-INTERNAL", 3, 0, false);
        declareFunction("make_sbhl_graph_link_other", "MAKE-SBHL-GRAPH-LINK-OTHER", 3, 0, false);
        declareFunction("make_sbhl_graph_link_int", "MAKE-SBHL-GRAPH-LINK-INT", 3, 0, false);
        declareFunction("create_new_sbhl_link", "CREATE-NEW-SBHL-LINK", 4, 1, false);
        declareFunction("create_and_store_sbhl_link", "CREATE-AND-STORE-SBHL-LINK", 6, 0, false);
        declareFunction("add_to_sbhl_link", "ADD-TO-SBHL-LINK", 5, 0, false);
        declareFunction("store_in_sbhl_graph", "STORE-IN-SBHL-GRAPH", 4, 0, false);
        declareFunction("make_all_sbhl_links", "MAKE-ALL-SBHL-LINKS", 0, 0, false);
        declareFunction("make_sbhl_links_for_module", "MAKE-SBHL-LINKS-FOR-MODULE", 1, 0, false);
        declareFunction("assertion_sbhl_tv", "ASSERTION-SBHL-TV", 1, 0, false);
        declareFunction("make_all_sbhl_time_links", "MAKE-ALL-SBHL-TIME-LINKS", 0, 0, false);
        declareFunction("sbhl_recompute_links", "SBHL-RECOMPUTE-LINKS", 1, 2, false);
        declareFunction("sbhl_recompute_graph_links", "SBHL-RECOMPUTE-GRAPH-LINKS", 1, 0, false);
        declareFunction("sbhl_recompute_links_of_node", "SBHL-RECOMPUTE-LINKS-OF-NODE", 1, 0, false);
        declareFunction("sbhl_recompute_links_of_nodes", "SBHL-RECOMPUTE-LINKS-OF-NODES", 1, 0, false);
        declareFunction("reset_sbhl_links", "RESET-SBHL-LINKS", 1, 0, false);
        declareFunction("add_sbhl_link", "ADD-SBHL-LINK", 4, 0, false);
        declareFunction("sbhl_after_adding", "SBHL-AFTER-ADDING", 3, 0, false);
        declareFunction("set_sbhl_links", "SET-SBHL-LINKS", 2, 1, false);
        declareFunction("remove_sbhl_link_node", "REMOVE-SBHL-LINK-NODE", 5, 1, false);
        declareFunction("remove_sbhl_forward_and_backward_link_node", "REMOVE-SBHL-FORWARD-AND-BACKWARD-LINK-NODE", 4, 1, false);
        declareFunction("remove_sbhl_link", "REMOVE-SBHL-LINK", 4, 0, false);
        declareFunction("sbhl_after_removing", "SBHL-AFTER-REMOVING", 3, 0, false);
        declareFunction("possibly_update_sbhl_links_tv", "POSSIBLY-UPDATE-SBHL-LINKS-TV", 2, 0, false);
        declareFunction("sbhl_after_tv_modification", "SBHL-AFTER-TV-MODIFICATION", 3, 0, false);
        declareFunction("initialize_isa_arg2_naut_table", "INITIALIZE-ISA-ARG2-NAUT-TABLE", 0, 0, false);
        declareFunction("clear_isa_arg2_naut_table", "CLEAR-ISA-ARG2-NAUT-TABLE", 0, 0, false);
        declareFunction("isa_stored_naut_arg2_p", "ISA-STORED-NAUT-ARG2-P", 1, 0, false);
        declareFunction("store_isa_arg2_naut", "STORE-ISA-ARG2-NAUT", 4, 0, false);
        declareFunction("remove_isa_arg2_naut", "REMOVE-ISA-ARG2-NAUT", 4, 0, false);
        declareFunction("isa_to_naut_conditionsP", "ISA-TO-NAUT-CONDITIONS?", 2, 0, false);
        declareFunction("isas_from_naut_arg2", "ISAS-FROM-NAUT-ARG2", 1, 2, false);
        declareFunction("union_isas_from_naut_arg2", "UNION-ISAS-FROM-NAUT-ARG2", 1, 2, false);
        declareMacro("do_isas_from_naut_arg2", "DO-ISAS-FROM-NAUT-ARG2");
        declareFunction("initialize_quoted_isa_arg2_naut_table", "INITIALIZE-QUOTED-ISA-ARG2-NAUT-TABLE", 0, 0, false);
        declareFunction("clear_quoted_isa_arg2_naut_table", "CLEAR-QUOTED-ISA-ARG2-NAUT-TABLE", 0, 0, false);
        declareFunction("quoted_isa_stored_naut_arg2_p", "QUOTED-ISA-STORED-NAUT-ARG2-P", 1, 0, false);
        declareFunction("store_quoted_isa_arg2_naut", "STORE-QUOTED-ISA-ARG2-NAUT", 4, 0, false);
        declareFunction("remove_quoted_isa_arg2_naut", "REMOVE-QUOTED-ISA-ARG2-NAUT", 4, 0, false);
        declareFunction("quoted_isa_to_naut_conditionsP", "QUOTED-ISA-TO-NAUT-CONDITIONS?", 2, 0, false);
        declareFunction("quoted_isas_from_naut_arg2", "QUOTED-ISAS-FROM-NAUT-ARG2", 1, 2, false);
        declareFunction("union_quoted_isas_from_naut_arg2", "UNION-QUOTED-ISAS-FROM-NAUT-ARG2", 1, 2, false);
        declareMacro("do_quoted_isas_from_naut_arg2", "DO-QUOTED-ISAS-FROM-NAUT-ARG2");
        declareMacro("do_non_fort_isas", "DO-NON-FORT-ISAS");
        declareFunction("set_non_fort_isa_table", "SET-NON-FORT-ISA-TABLE", 1, 0, false);
        declareFunction("set_non_fort_instance_table", "SET-NON-FORT-INSTANCE-TABLE", 1, 0, false);
        declareFunction("non_fort_isa_table", "NON-FORT-ISA-TABLE", 0, 0, false);
        declareFunction("non_fort_instance_table", "NON-FORT-INSTANCE-TABLE", 0, 0, false);
        declareFunction("non_fort_isa_tables_unbuiltP", "NON-FORT-ISA-TABLES-UNBUILT?", 0, 0, false);
        declareFunction("initialize_non_fort_isa_tables", "INITIALIZE-NON-FORT-ISA-TABLES", 0, 0, false);
        declareFunction("rebuild_non_fort_isa_tables", "REBUILD-NON-FORT-ISA-TABLES", 0, 0, false);
        declareFunction("non_fort_isaP", "NON-FORT-ISA?", 2, 2, false);
        declareFunction("non_fort_isa_anyP", "NON-FORT-ISA-ANY?", 2, 2, false);
        declareFunction("non_fort_isa_allP", "NON-FORT-ISA-ALL?", 2, 2, false);
        declareFunction("non_fort_isas", "NON-FORT-ISAS", 1, 2, false);
        declareFunction("non_fort_all_isa", "NON-FORT-ALL-ISA", 1, 2, false);
        declareFunction("non_fort_instance_table_lookup", "NON-FORT-INSTANCE-TABLE-LOOKUP", 1, 0, false);
        declareFunction("possibly_add_non_fort_isa", "POSSIBLY-ADD-NON-FORT-ISA", 1, 0, false);
        declareFunction("possibly_remove_non_fort_isa", "POSSIBLY-REMOVE-NON-FORT-ISA", 1, 0, false);
        declareFunction("add_non_fort_isa", "ADD-NON-FORT-ISA", 1, 0, false);
        declareFunction("remove_non_fort_isa", "REMOVE-NON-FORT-ISA", 1, 0, false);
        declareFunction("clear_sbhl_links_within_mt", "CLEAR-SBHL-LINKS-WITHIN-MT", 2, 1, false);
        declareFunction("clear_sbhl_links", "CLEAR-SBHL-LINKS", 1, 1, false);
        declareFunction("clear_all_sbhl_links", "CLEAR-ALL-SBHL-LINKS", 1, 0, false);
        declareFunction("clear_all_sbhl_links_within_mt", "CLEAR-ALL-SBHL-LINKS-WITHIN-MT", 2, 0, false);
        declareFunction("remove_node_from_sbhl_graphs", "REMOVE-NODE-FROM-SBHL-GRAPHS", 1, 0, false);
        declareFunction("clear_sbhl_module_graph", "CLEAR-SBHL-MODULE-GRAPH", 1, 0, false);
        declareFunction("clear_all_sbhl_data", "CLEAR-ALL-SBHL-DATA", 0, 0, false);
        declareFunction("clear_all_sbhl_non_time_data", "CLEAR-ALL-SBHL-NON-TIME-DATA", 0, 0, false);
        declareFunction("clear_all_sbhl_time_data", "CLEAR-ALL-SBHL-TIME-DATA", 0, 0, false);
        declareFunction("sbhl_any_asserted_true_links", "SBHL-ANY-ASSERTED-TRUE-LINKS", 2, 1, false);
        declareFunction("sbhl_any_asserted_true_inverse_links", "SBHL-ANY-ASSERTED-TRUE-INVERSE-LINKS", 2, 1, false);
        declareFunction("sbhl_asserted_true_links", "SBHL-ASSERTED-TRUE-LINKS", 2, 1, false);
        declareFunction("sbhl_asserted_false_links", "SBHL-ASSERTED-FALSE-LINKS", 2, 1, false);
        declareFunction("sbhl_asserted_true_inverse_links", "SBHL-ASSERTED-TRUE-INVERSE-LINKS", 2, 1, false);
        declareFunction("sbhl_asserted_false_inverse_links", "SBHL-ASSERTED-FALSE-INVERSE-LINKS", 2, 1, false);
        declareFunction("sbhl_supported_true_links", "SBHL-SUPPORTED-TRUE-LINKS", 2, 1, false);
        declareFunction("sbhl_supported_false_links", "SBHL-SUPPORTED-FALSE-LINKS", 2, 1, false);
        declareFunction("sbhl_supported_true_inverse_links", "SBHL-SUPPORTED-TRUE-INVERSE-LINKS", 2, 1, false);
        declareFunction("sbhl_supported_false_inverse_links", "SBHL-SUPPORTED-FALSE-INVERSE-LINKS", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_sbhl_link_methods_file_alt() {
        deflexical("*ISA-ARG2-NAUT-TABLE*", NIL != boundp($sym35$_ISA_ARG2_NAUT_TABLE_) ? ((SubLObject) ($isa_arg2_naut_table$.getGlobalValue())) : NIL);
        deflexical("*QUOTED-ISA-ARG2-NAUT-TABLE*", NIL != boundp($sym62$_QUOTED_ISA_ARG2_NAUT_TABLE_) ? ((SubLObject) ($quoted_isa_arg2_naut_table$.getGlobalValue())) : NIL);
        deflexical("*NON-FORT-ISA-TABLE*", NIL != boundp($non_fort_isa_table$) ? ((SubLObject) ($non_fort_isa_table$.getGlobalValue())) : misc_utilities.uninitialized());
        deflexical("*NON-FORT-INSTANCE-TABLE*", NIL != boundp($non_fort_instance_table$) ? ((SubLObject) ($non_fort_instance_table$.getGlobalValue())) : misc_utilities.uninitialized());
        return NIL;
    }

    public static SubLObject init_sbhl_link_methods_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*MAKE-SBHL-GRAPH-LINK-ISA-CACHING-STATE*", NIL);
            deflexical("*MAKE-SBHL-GRAPH-LINK-QUOTED-ISA-CACHING-STATE*", NIL);
            deflexical("*MAKE-SBHL-GRAPH-LINK-GENLS-CACHING-STATE*", NIL);
            deflexical("*MAKE-SBHL-GRAPH-LINK-GENL-PREDS-CACHING-STATE*", NIL);
            deflexical("*MAKE-SBHL-GRAPH-LINK-GENL-MT-CACHING-STATE*", NIL);
            deflexical("*MAKE-SBHL-GRAPH-LINK-OTHER-CACHING-STATE*", NIL);
            deflexical("*ISA-ARG2-NAUT-TABLE*", SubLTrampolineFile.maybeDefault($sym63$_ISA_ARG2_NAUT_TABLE_, $isa_arg2_naut_table$, NIL));
            deflexical("*QUOTED-ISA-ARG2-NAUT-TABLE*", SubLTrampolineFile.maybeDefault($sym88$_QUOTED_ISA_ARG2_NAUT_TABLE_, $quoted_isa_arg2_naut_table$, NIL));
            deflexical("*NON-FORT-ISA-TABLE*", SubLTrampolineFile.maybeDefault($non_fort_isa_table$, $non_fort_isa_table$, () -> misc_utilities.uninitialized()));
            deflexical("*NON-FORT-INSTANCE-TABLE*", SubLTrampolineFile.maybeDefault($non_fort_instance_table$, $non_fort_instance_table$, () -> misc_utilities.uninitialized()));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ISA-ARG2-NAUT-TABLE*", NIL != boundp($sym35$_ISA_ARG2_NAUT_TABLE_) ? ((SubLObject) ($isa_arg2_naut_table$.getGlobalValue())) : NIL);
            deflexical("*QUOTED-ISA-ARG2-NAUT-TABLE*", NIL != boundp($sym62$_QUOTED_ISA_ARG2_NAUT_TABLE_) ? ((SubLObject) ($quoted_isa_arg2_naut_table$.getGlobalValue())) : NIL);
            deflexical("*NON-FORT-ISA-TABLE*", NIL != boundp($non_fort_isa_table$) ? ((SubLObject) ($non_fort_isa_table$.getGlobalValue())) : misc_utilities.uninitialized());
            deflexical("*NON-FORT-INSTANCE-TABLE*", NIL != boundp($non_fort_instance_table$) ? ((SubLObject) ($non_fort_instance_table$.getGlobalValue())) : misc_utilities.uninitialized());
        }
        return NIL;
    }

    public static SubLObject init_sbhl_link_methods_file_Previous() {
        deflexical("*MAKE-SBHL-GRAPH-LINK-ISA-CACHING-STATE*", NIL);
        deflexical("*MAKE-SBHL-GRAPH-LINK-QUOTED-ISA-CACHING-STATE*", NIL);
        deflexical("*MAKE-SBHL-GRAPH-LINK-GENLS-CACHING-STATE*", NIL);
        deflexical("*MAKE-SBHL-GRAPH-LINK-GENL-PREDS-CACHING-STATE*", NIL);
        deflexical("*MAKE-SBHL-GRAPH-LINK-GENL-MT-CACHING-STATE*", NIL);
        deflexical("*MAKE-SBHL-GRAPH-LINK-OTHER-CACHING-STATE*", NIL);
        deflexical("*ISA-ARG2-NAUT-TABLE*", SubLTrampolineFile.maybeDefault($sym63$_ISA_ARG2_NAUT_TABLE_, $isa_arg2_naut_table$, NIL));
        deflexical("*QUOTED-ISA-ARG2-NAUT-TABLE*", SubLTrampolineFile.maybeDefault($sym88$_QUOTED_ISA_ARG2_NAUT_TABLE_, $quoted_isa_arg2_naut_table$, NIL));
        deflexical("*NON-FORT-ISA-TABLE*", SubLTrampolineFile.maybeDefault($non_fort_isa_table$, $non_fort_isa_table$, () -> misc_utilities.uninitialized()));
        deflexical("*NON-FORT-INSTANCE-TABLE*", SubLTrampolineFile.maybeDefault($non_fort_instance_table$, $non_fort_instance_table$, () -> misc_utilities.uninitialized()));
        return NIL;
    }

    public static final SubLObject setup_sbhl_link_methods_file_alt() {
        declare_defglobal($sym35$_ISA_ARG2_NAUT_TABLE_);
        declare_defglobal($sym62$_QUOTED_ISA_ARG2_NAUT_TABLE_);
        declare_defglobal($non_fort_isa_table$);
        declare_defglobal($non_fort_instance_table$);
        return NIL;
    }

    public static SubLObject setup_sbhl_link_methods_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function(MAKE_SBHL_GRAPH_LINK_ISA);
            memoization_state.note_globally_cached_function(MAKE_SBHL_GRAPH_LINK_QUOTED_ISA);
            memoization_state.note_globally_cached_function(MAKE_SBHL_GRAPH_LINK_GENLS);
            memoization_state.note_globally_cached_function(MAKE_SBHL_GRAPH_LINK_GENL_PREDS);
            memoization_state.note_globally_cached_function(MAKE_SBHL_GRAPH_LINK_GENL_MT);
            memoization_state.note_globally_cached_function(MAKE_SBHL_GRAPH_LINK_OTHER);
            declare_defglobal($sym63$_ISA_ARG2_NAUT_TABLE_);
            declare_defglobal($sym88$_QUOTED_ISA_ARG2_NAUT_TABLE_);
            declare_defglobal($non_fort_isa_table$);
            declare_defglobal($non_fort_instance_table$);
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($sym35$_ISA_ARG2_NAUT_TABLE_);
            declare_defglobal($sym62$_QUOTED_ISA_ARG2_NAUT_TABLE_);
        }
        return NIL;
    }

    public static SubLObject setup_sbhl_link_methods_file_Previous() {
        memoization_state.note_globally_cached_function(MAKE_SBHL_GRAPH_LINK_ISA);
        memoization_state.note_globally_cached_function(MAKE_SBHL_GRAPH_LINK_QUOTED_ISA);
        memoization_state.note_globally_cached_function(MAKE_SBHL_GRAPH_LINK_GENLS);
        memoization_state.note_globally_cached_function(MAKE_SBHL_GRAPH_LINK_GENL_PREDS);
        memoization_state.note_globally_cached_function(MAKE_SBHL_GRAPH_LINK_GENL_MT);
        memoization_state.note_globally_cached_function(MAKE_SBHL_GRAPH_LINK_OTHER);
        declare_defglobal($sym63$_ISA_ARG2_NAUT_TABLE_);
        declare_defglobal($sym88$_QUOTED_ISA_ARG2_NAUT_TABLE_);
        declare_defglobal($non_fort_isa_table$);
        declare_defglobal($non_fort_instance_table$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_link_methods_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_link_methods_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_link_methods_file();
    }

    
}

/**
 * Total time: 1281 ms synthetic
 */
