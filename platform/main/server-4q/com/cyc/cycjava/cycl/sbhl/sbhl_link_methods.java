package com.cyc.cycjava.cycl.sbhl;


import com.cyc.cycjava.cycl.alexandria_iterators;
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
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$ignore_conflictsP$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_methods.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
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
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sbhl_link_methods extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_link_methods();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_link_methods";

    public static final String myFingerPrint = "5acd969ba0a7e5ad39721c9158b44d947f3a94e9e4b2e373c7cccecd7f64a837";













    // deflexical
    // Store for isa links that have the a NAUT in the arg2 position.
    public static final SubLSymbol $isa_arg2_naut_table$ = makeSymbol("*ISA-ARG2-NAUT-TABLE*");

    // deflexical
    // Store for quotedIsa links that have the a NAUT in the arg2 position.
    public static final SubLSymbol $quoted_isa_arg2_naut_table$ = makeSymbol("*QUOTED-ISA-ARG2-NAUT-TABLE*");











    private static final SubLString $str3$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str4$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");







    private static final SubLString $str8$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol SBHL_SEARCH_TRUTH_VALUE_P = makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P");



    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str13$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));

    private static final SubLString $str15$tv___a__does_not_satisfy_sbhl_tru = makeString("tv, ~a, does not satisfy sbhl-true-tv-p");

    private static final SubLString $str16$sbhl_link_nodes_never_called_ = makeString("sbhl-link-nodes never called.");

    private static final SubLObject $$False_JustificationTruth = reader_make_constant_shell(makeString("False-JustificationTruth"));

    private static final SubLString $str18$tv___a__does_not_satisfy_sbhl_fal = makeString("tv, ~a, does not satisfy sbhl-false-tv-p");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

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



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLString $$$Initializing_ = makeString("Initializing ");

    private static final SubLString $$$_SBHL_Graph_Links = makeString(" SBHL Graph Links");





    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell(makeString("Always-TimeInterval"));



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



    public static final SubLList $list74 = list(list(makeSymbol("GET-SBHL-MODULE"), reader_make_constant_shell(makeString("genls"))));

    private static final SubLSymbol POSSIBLY_WITH_SBHL_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-SBHL-MT-RELEVANCE");

    private static final SubLSymbol POSSIBLY_WITH_SBHL_TRUE_TV = makeSymbol("POSSIBLY-WITH-SBHL-TRUE-TV");

    private static final SubLSymbol WITH_SBHL_MODULE = makeSymbol("WITH-SBHL-MODULE");





    private static final SubLList $list80 = list(makeSymbol("*ISA-ARG2-NAUT-TABLE*"));







    private static final SubLSymbol $sym84$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");

    private static final SubLSymbol $sym85$RELEVANT_SBHL_TV_ = makeSymbol("RELEVANT-SBHL-TV?");

    private static final SubLSymbol DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS = makeSymbol("DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS");

    private static final SubLList $list87 = list(makeSymbol("GET-SBHL-FORWARD-DIRECTED-DIRECTION"));

    private static final SubLSymbol $sym88$_QUOTED_ISA_ARG2_NAUT_TABLE_ = makeSymbol("*QUOTED-ISA-ARG2-NAUT-TABLE*");

    public static final SubLList $list89 = list(makeSymbol("NAUT"), makeSymbol("QUOTED-ISA-MT"), makeSymbol("QUOTED-ISA-TV"));

    public static final SubLList $list90 = list(list(makeSymbol("QUOTED-ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV")), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    private static final SubLObject $$SetOfTypeFn = reader_make_constant_shell(makeString("SetOfTypeFn"));

    private static final SubLObject $$ListOfSpecsFn = reader_make_constant_shell(makeString("ListOfSpecsFn"));

    private static final SubLObject $$SetOfSpecsFn = reader_make_constant_shell(makeString("SetOfSpecsFn"));

    private static final SubLList $list116 = list(makeSymbol("CANDIDATE-COL"), makeUninternedSymbol("TABLE-MT"), makeUninternedSymbol("TABLE-TV"));

    private static final SubLList $list117 = list(makeSymbol("COL"), makeUninternedSymbol("TABLE-MT"), makeUninternedSymbol("TABLE-TV"));

    private static final SubLList $list118 = cons(makeUninternedSymbol("KEY"), makeSymbol("MODULE"));



    public static SubLObject sbhl_access_links(final SubLObject node, final SubLObject direction) {
        SubLObject result = NIL;
        final SubLObject link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        result = sbhl_links.get_sbhl_mt_links(link, direction, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        return result;
    }

    public static SubLObject sbhl_predicate_links(final SubLObject node) {
        return sbhl_access_links(node, $PREDICATE);
    }

    public static SubLObject sbhl_inverse_links(final SubLObject node) {
        return sbhl_access_links(node, $INVERSE);
    }

    public static SubLObject sbhl_undirected_links(final SubLObject node) {
        return sbhl_access_links(node, $LINK);
    }

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

    public static SubLObject get_sbhl_forward_link_nodes(final SubLObject node, final SubLObject mt, final SubLObject tv) {
        return get_sbhl_graph_link_nodes(node, sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), mt, tv);
    }

    public static SubLObject get_sbhl_backward_link_nodes(final SubLObject node, final SubLObject mt, final SubLObject tv) {
        return get_sbhl_graph_link_nodes(node, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), mt, tv);
    }

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

    public static SubLObject sbhl_link_mts(final SubLObject module, final SubLObject node) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return list_utilities.remove_duplicate_forts(nconc(sbhl_forward_mts(module, node), sbhl_backward_mts(module, node)));
        }
        return sbhl_forward_mts(module, node);
    }

    public static SubLObject sbhl_forward_mts(final SubLObject module, final SubLObject node) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_links.get_sbhl_graph_link_mts(node, sbhl_module_utilities.get_sbhl_module_forward_direction(module), module);
    }

    public static SubLObject sbhl_backward_mts(final SubLObject module, final SubLObject node) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_links.get_sbhl_graph_link_mts(node, sbhl_module_utilities.get_sbhl_module_backward_direction(module), module);
    }

    public static SubLObject sbhl_link_nodes_by_iteration(final SubLObject node, final SubLObject direction) {
        return NIL;
    }

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
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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

    public static SubLObject sbhl_link_nodes_p(final SubLObject module, final SubLObject node, final SubLObject direction, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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

    public static SubLObject sbhl_backward_true_link_nodes_p(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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

    public static SubLObject sbhl_mt_matching_link_nodes(final SubLObject module, final SubLObject node, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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

    public static SubLObject sbhl_siblings_forward(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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

    public static SubLObject sbhl_siblings_backward(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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

    public static SubLObject create_and_store_sbhl_link(final SubLObject arg1, final SubLObject arg2, final SubLObject direction, final SubLObject mt, final SubLObject tv, final SubLObject module) {
        if (((NIL != module) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sbhl_module_vars.sbhl_module_p(module))) {
            throw new AssertionError(module);
        }
        sbhl_graphs.set_sbhl_graph_link(arg1, create_new_sbhl_link(direction, mt, tv, arg2, module), module);
        return NIL;
    }

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
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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

    public static SubLObject assertion_sbhl_tv(final SubLObject assertion) {
        final SubLObject truth = assertions_high.assertion_truth(assertion);
        final SubLObject strength = assertions_high.assertion_strength(assertion);
        return sbhl_link_vars.truth_strength_to_sbhl_tv(truth, strength);
    }

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

    public static SubLObject sbhl_recompute_links(final SubLObject node, SubLObject mt, SubLObject module) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (module == UNPROVIDED) {
            module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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

    public static SubLObject sbhl_recompute_graph_links(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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

    public static SubLObject reset_sbhl_links(final SubLObject node) {
        sbhl_recompute_links_of_node(node);
        return NIL;
    }

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

    public static SubLObject sbhl_after_adding(SubLObject source, final SubLObject assertion, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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

    public static SubLObject sbhl_after_removing(SubLObject source, final SubLObject assertion, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
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

    public static SubLObject initialize_isa_arg2_naut_table() {
        $isa_arg2_naut_table$.setGlobalValue(make_hash_table($int$200, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject clear_isa_arg2_naut_table() {
        if ($isa_arg2_naut_table$.getGlobalValue().isHashtable()) {
            clrhash($isa_arg2_naut_table$.getGlobalValue());
        } else {
            initialize_isa_arg2_naut_table();
        }
        return NIL;
    }

    public static SubLObject isa_stored_naut_arg2_p(final SubLObject v_term) {
        return makeBoolean($isa_arg2_naut_table$.getGlobalValue().isHashtable() && (NIL != list_utilities.sublisp_boolean(gethash(v_term, $isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED))));
    }

    public static SubLObject store_isa_arg2_naut(final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        hash_table_utilities.pushnew_hash(arg1, list(arg2, mt, tv), $isa_arg2_naut_table$.getGlobalValue(), EQUAL);
        return NIL;
    }

    public static SubLObject remove_isa_arg2_naut(final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        final SubLObject tuple = list(arg2, mt, tv);
        hash_table_utilities.delete_hash(arg1, tuple, $isa_arg2_naut_table$.getGlobalValue(), EQUAL, UNPROVIDED);
        return NIL;
    }

    public static SubLObject isa_to_naut_conditionsP(final SubLObject arg1, final SubLObject arg2) {
        return makeBoolean((sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)).eql($$isa) && (NIL != sbhl_link_vars.sbhl_node_object_p(arg1))) && (NIL != possibly_naut_p(arg2)));
    }

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

    public static SubLObject initialize_quoted_isa_arg2_naut_table() {
        $quoted_isa_arg2_naut_table$.setGlobalValue(make_hash_table($int$200, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject clear_quoted_isa_arg2_naut_table() {
        if ($quoted_isa_arg2_naut_table$.getGlobalValue().isHashtable()) {
            clrhash($quoted_isa_arg2_naut_table$.getGlobalValue());
        } else {
            initialize_quoted_isa_arg2_naut_table();
        }
        return NIL;
    }

    public static SubLObject quoted_isa_stored_naut_arg2_p(final SubLObject v_term) {
        return makeBoolean($quoted_isa_arg2_naut_table$.getGlobalValue().isHashtable() && (NIL != list_utilities.sublisp_boolean(gethash(v_term, $quoted_isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED))));
    }

    public static SubLObject store_quoted_isa_arg2_naut(final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        hash_table_utilities.pushnew_hash(arg1, list(arg2, mt, tv), $quoted_isa_arg2_naut_table$.getGlobalValue(), EQUAL);
        return NIL;
    }

    public static SubLObject remove_quoted_isa_arg2_naut(final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        final SubLObject tuple = list(arg2, mt, tv);
        hash_table_utilities.delete_hash(arg1, tuple, $quoted_isa_arg2_naut_table$.getGlobalValue(), EQUAL, UNPROVIDED);
        return NIL;
    }

    public static SubLObject quoted_isa_to_naut_conditionsP(final SubLObject arg1, final SubLObject arg2) {
        return makeBoolean((sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)).eql($$quotedIsa) && (NIL != sbhl_link_vars.sbhl_node_object_p(arg1))) && (NIL != possibly_naut_p(arg2)));
    }

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

    public static SubLObject set_non_fort_isa_table(final SubLObject table) {
        assert NIL != hash_table_p(table) : "Types.hash_table_p(table) " + "CommonSymbols.NIL != Types.hash_table_p(table) " + table;
        $non_fort_isa_table$.setGlobalValue(table);
        return NIL;
    }

    public static SubLObject set_non_fort_instance_table(final SubLObject table) {
        assert NIL != hash_table_p(table) : "Types.hash_table_p(table) " + "CommonSymbols.NIL != Types.hash_table_p(table) " + table;
        $non_fort_instance_table$.setGlobalValue(table);
        return NIL;
    }

    public static SubLObject non_fort_isa_table() {
        return $non_fort_isa_table$.getGlobalValue();
    }

    public static SubLObject non_fort_instance_table() {
        return $non_fort_instance_table$.getGlobalValue();
    }

    public static SubLObject non_fort_isa_tables_unbuiltP() {
        return makeBoolean((NIL != misc_utilities.uninitialized_p($non_fort_isa_table$.getGlobalValue())) || (NIL != misc_utilities.uninitialized_p($non_fort_instance_table$.getGlobalValue())));
    }

    public static SubLObject initialize_non_fort_isa_tables() {
        $non_fort_isa_table$.setGlobalValue(make_hash_table($int$256, symbol_function(EQUAL), UNPROVIDED));
        $non_fort_instance_table$.setGlobalValue(make_hash_table($int$256, symbol_function(EQL), UNPROVIDED));
        return NIL;
    }

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

    public static SubLObject non_fort_isaP(final SubLObject ins, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.non_fort_p(ins) : "forts.non_fort_p(ins) " + "CommonSymbols.NIL != forts.non_fort_p(ins) " + ins;
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

    public static SubLObject non_fort_isa_anyP(final SubLObject ins, final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.non_fort_p(ins) : "forts.non_fort_p(ins) " + "CommonSymbols.NIL != forts.non_fort_p(ins) " + ins;
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

    public static SubLObject non_fort_isa_allP(final SubLObject ins, final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.non_fort_p(ins) : "forts.non_fort_p(ins) " + "CommonSymbols.NIL != forts.non_fort_p(ins) " + ins;
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

    public static SubLObject non_fort_all_isa(final SubLObject ins, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.non_fort_p(ins) : "forts.non_fort_p(ins) " + "CommonSymbols.NIL != forts.non_fort_p(ins) " + ins;
        return genls.union_all_genls(non_fort_isas(ins, mt, tv), mt, tv);
    }

    public static SubLObject non_fort_instance_table_lookup(final SubLObject col) {
        return gethash_without_values(col, $non_fort_instance_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject possibly_add_non_fort_isa(final SubLObject gaf) {
        final SubLObject ins = assertions_high.gaf_arg1(gaf);
        if ((NIL != forts.non_fort_p(ins)) && (NIL != assertion_utilities.true_assertionP(gaf))) {
            add_non_fort_isa(gaf);
            return T;
        }
        return NIL;
    }

    public static SubLObject possibly_remove_non_fort_isa(final SubLObject gaf) {
        final SubLObject ins = assertions_high.gaf_arg1(gaf);
        if ((NIL != forts.non_fort_p(ins)) && (NIL != assertion_utilities.true_assertionP(gaf))) {
            remove_non_fort_isa(gaf);
            return T;
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

    public static SubLObject clear_sbhl_links_within_mt(final SubLObject node, final SubLObject mt, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        sbhl_links.remove_sbhl_mt_link_from_relevant_directions(node, mt, module);
        return NIL;
    }

    public static SubLObject clear_sbhl_links(final SubLObject node, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        sbhl_graphs.remove_sbhl_graph_link(node, module);
        return NIL;
    }

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

    public static SubLObject clear_sbhl_module_graph(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        sbhl_graphs.clear_sbhl_graph(sbhl_module_utilities.get_sbhl_graph(module));
        return NIL;
    }

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

    public static SubLObject sbhl_any_asserted_true_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return kb_mapping_utilities.some_pred_value_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, $TRUE);
    }

    public static SubLObject sbhl_any_asserted_true_inverse_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return kb_mapping_utilities.some_pred_value_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, $TRUE);
    }

    public static SubLObject sbhl_asserted_true_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
        }
        return nconc(kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $TRUE), kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $TRUE));
    }

    public static SubLObject sbhl_asserted_false_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $FALSE);
        }
        return nconc(kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $FALSE), kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $FALSE));
    }

    public static SubLObject sbhl_asserted_true_inverse_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    public static SubLObject sbhl_asserted_false_inverse_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $FALSE);
    }

    public static SubLObject sbhl_supported_true_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
        }
        return nconc(kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $TRUE), kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $TRUE));
    }

    public static SubLObject sbhl_supported_false_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $FALSE);
        }
        return nconc(kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $FALSE), kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $FALSE));
    }

    public static SubLObject sbhl_supported_true_inverse_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    public static SubLObject sbhl_supported_false_inverse_links(final SubLObject module, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return kb_accessors.supported_entries(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $FALSE);
    }

    public static SubLObject declare_sbhl_link_methods_file() {
        declareFunction(me, "sbhl_access_links", "SBHL-ACCESS-LINKS", 2, 0, false);
        declareFunction(me, "sbhl_predicate_links", "SBHL-PREDICATE-LINKS", 1, 0, false);
        declareFunction(me, "sbhl_inverse_links", "SBHL-INVERSE-LINKS", 1, 0, false);
        declareFunction(me, "sbhl_undirected_links", "SBHL-UNDIRECTED-LINKS", 1, 0, false);
        declareFunction(me, "get_sbhl_graph_link_nodes", "GET-SBHL-GRAPH-LINK-NODES", 4, 0, false);
        declareFunction(me, "get_sbhl_forward_link_nodes", "GET-SBHL-FORWARD-LINK-NODES", 3, 0, false);
        declareFunction(me, "get_sbhl_backward_link_nodes", "GET-SBHL-BACKWARD-LINK-NODES", 3, 0, false);
        declareFunction(me, "member_of_sbhl_link_nodesP", "MEMBER-OF-SBHL-LINK-NODES?", 5, 0, false);
        declareFunction(me, "no_accessible_sbhl_nodes_p", "NO-ACCESSIBLE-SBHL-NODES-P", 1, 0, false);
        declareFunction(me, "sbhl_link_mts", "SBHL-LINK-MTS", 2, 0, false);
        declareFunction(me, "sbhl_forward_mts", "SBHL-FORWARD-MTS", 2, 0, false);
        declareFunction(me, "sbhl_backward_mts", "SBHL-BACKWARD-MTS", 2, 0, false);
        declareFunction(me, "sbhl_link_nodes_by_iteration", "SBHL-LINK-NODES-BY-ITERATION", 2, 0, false);
        declareFunction(me, "sbhl_link_nodes", "SBHL-LINK-NODES", 3, 3, false);
        declareFunction(me, "sbhl_link_nodes_p", "SBHL-LINK-NODES-P", 3, 2, false);
        declareFunction(me, "sbhl_forward_true_link_nodes", "SBHL-FORWARD-TRUE-LINK-NODES", 2, 3, false);
        declareFunction(me, "sbhl_forward_false_link_nodes", "SBHL-FORWARD-FALSE-LINK-NODES", 2, 3, false);
        declareFunction(me, "sbhl_backward_true_link_nodes", "SBHL-BACKWARD-TRUE-LINK-NODES", 2, 3, false);
        declareFunction(me, "sbhl_backward_true_link_nodes_p", "SBHL-BACKWARD-TRUE-LINK-NODES-P", 2, 2, false);
        declareFunction(me, "sbhl_backward_false_link_nodes", "SBHL-BACKWARD-FALSE-LINK-NODES", 2, 3, false);
        declareFunction(me, "sbhl_mt_matching_link_nodes", "SBHL-MT-MATCHING-LINK-NODES", 3, 0, false);
        declareFunction(me, "sbhl_siblings_forward", "SBHL-SIBLINGS-FORWARD", 2, 2, false);
        declareFunction(me, "sbhl_siblings_backward", "SBHL-SIBLINGS-BACKWARD", 2, 2, false);
        declareFunction(me, "make_sbhl_graph_link", "MAKE-SBHL-GRAPH-LINK", 3, 0, false);
        declareFunction(me, "clear_make_sbhl_graph_link_isa", "CLEAR-MAKE-SBHL-GRAPH-LINK-ISA", 0, 0, false);
        declareFunction(me, "remove_make_sbhl_graph_link_isa", "REMOVE-MAKE-SBHL-GRAPH-LINK-ISA", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_isa_internal", "MAKE-SBHL-GRAPH-LINK-ISA-INTERNAL", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_isa", "MAKE-SBHL-GRAPH-LINK-ISA", 3, 0, false);
        declareFunction(me, "clear_make_sbhl_graph_link_quoted_isa", "CLEAR-MAKE-SBHL-GRAPH-LINK-QUOTED-ISA", 0, 0, false);
        declareFunction(me, "remove_make_sbhl_graph_link_quoted_isa", "REMOVE-MAKE-SBHL-GRAPH-LINK-QUOTED-ISA", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_quoted_isa_internal", "MAKE-SBHL-GRAPH-LINK-QUOTED-ISA-INTERNAL", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_quoted_isa", "MAKE-SBHL-GRAPH-LINK-QUOTED-ISA", 3, 0, false);
        declareFunction(me, "clear_make_sbhl_graph_link_genls", "CLEAR-MAKE-SBHL-GRAPH-LINK-GENLS", 0, 0, false);
        declareFunction(me, "remove_make_sbhl_graph_link_genls", "REMOVE-MAKE-SBHL-GRAPH-LINK-GENLS", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_genls_internal", "MAKE-SBHL-GRAPH-LINK-GENLS-INTERNAL", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_genls", "MAKE-SBHL-GRAPH-LINK-GENLS", 3, 0, false);
        declareFunction(me, "clear_make_sbhl_graph_link_genl_preds", "CLEAR-MAKE-SBHL-GRAPH-LINK-GENL-PREDS", 0, 0, false);
        declareFunction(me, "remove_make_sbhl_graph_link_genl_preds", "REMOVE-MAKE-SBHL-GRAPH-LINK-GENL-PREDS", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_genl_preds_internal", "MAKE-SBHL-GRAPH-LINK-GENL-PREDS-INTERNAL", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_genl_preds", "MAKE-SBHL-GRAPH-LINK-GENL-PREDS", 3, 0, false);
        declareFunction(me, "clear_make_sbhl_graph_link_genl_mt", "CLEAR-MAKE-SBHL-GRAPH-LINK-GENL-MT", 0, 0, false);
        declareFunction(me, "remove_make_sbhl_graph_link_genl_mt", "REMOVE-MAKE-SBHL-GRAPH-LINK-GENL-MT", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_genl_mt_internal", "MAKE-SBHL-GRAPH-LINK-GENL-MT-INTERNAL", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_genl_mt", "MAKE-SBHL-GRAPH-LINK-GENL-MT", 3, 0, false);
        declareFunction(me, "clear_make_sbhl_graph_link_other", "CLEAR-MAKE-SBHL-GRAPH-LINK-OTHER", 0, 0, false);
        declareFunction(me, "remove_make_sbhl_graph_link_other", "REMOVE-MAKE-SBHL-GRAPH-LINK-OTHER", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_other_internal", "MAKE-SBHL-GRAPH-LINK-OTHER-INTERNAL", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_other", "MAKE-SBHL-GRAPH-LINK-OTHER", 3, 0, false);
        declareFunction(me, "make_sbhl_graph_link_int", "MAKE-SBHL-GRAPH-LINK-INT", 3, 0, false);
        declareFunction(me, "create_new_sbhl_link", "CREATE-NEW-SBHL-LINK", 4, 1, false);
        declareFunction(me, "create_and_store_sbhl_link", "CREATE-AND-STORE-SBHL-LINK", 6, 0, false);
        declareFunction(me, "add_to_sbhl_link", "ADD-TO-SBHL-LINK", 5, 0, false);
        declareFunction(me, "store_in_sbhl_graph", "STORE-IN-SBHL-GRAPH", 4, 0, false);
        declareFunction(me, "make_all_sbhl_links", "MAKE-ALL-SBHL-LINKS", 0, 0, false);
        declareFunction(me, "make_sbhl_links_for_module", "MAKE-SBHL-LINKS-FOR-MODULE", 1, 0, false);
        declareFunction(me, "assertion_sbhl_tv", "ASSERTION-SBHL-TV", 1, 0, false);
        declareFunction(me, "make_all_sbhl_time_links", "MAKE-ALL-SBHL-TIME-LINKS", 0, 0, false);
        declareFunction(me, "sbhl_recompute_links", "SBHL-RECOMPUTE-LINKS", 1, 2, false);
        declareFunction(me, "sbhl_recompute_graph_links", "SBHL-RECOMPUTE-GRAPH-LINKS", 1, 0, false);
        declareFunction(me, "sbhl_recompute_links_of_node", "SBHL-RECOMPUTE-LINKS-OF-NODE", 1, 0, false);
        declareFunction(me, "sbhl_recompute_links_of_nodes", "SBHL-RECOMPUTE-LINKS-OF-NODES", 1, 0, false);
        declareFunction(me, "reset_sbhl_links", "RESET-SBHL-LINKS", 1, 0, false);
        declareFunction(me, "add_sbhl_link", "ADD-SBHL-LINK", 4, 0, false);
        declareFunction(me, "sbhl_after_adding", "SBHL-AFTER-ADDING", 3, 0, false);
        declareFunction(me, "set_sbhl_links", "SET-SBHL-LINKS", 2, 1, false);
        declareFunction(me, "remove_sbhl_link_node", "REMOVE-SBHL-LINK-NODE", 5, 1, false);
        declareFunction(me, "remove_sbhl_forward_and_backward_link_node", "REMOVE-SBHL-FORWARD-AND-BACKWARD-LINK-NODE", 4, 1, false);
        declareFunction(me, "remove_sbhl_link", "REMOVE-SBHL-LINK", 4, 0, false);
        declareFunction(me, "sbhl_after_removing", "SBHL-AFTER-REMOVING", 3, 0, false);
        declareFunction(me, "possibly_update_sbhl_links_tv", "POSSIBLY-UPDATE-SBHL-LINKS-TV", 2, 0, false);
        declareFunction(me, "sbhl_after_tv_modification", "SBHL-AFTER-TV-MODIFICATION", 3, 0, false);
        declareFunction(me, "initialize_isa_arg2_naut_table", "INITIALIZE-ISA-ARG2-NAUT-TABLE", 0, 0, false);
        declareFunction(me, "clear_isa_arg2_naut_table", "CLEAR-ISA-ARG2-NAUT-TABLE", 0, 0, false);
        declareFunction(me, "isa_stored_naut_arg2_p", "ISA-STORED-NAUT-ARG2-P", 1, 0, false);
        declareFunction(me, "store_isa_arg2_naut", "STORE-ISA-ARG2-NAUT", 4, 0, false);
        declareFunction(me, "remove_isa_arg2_naut", "REMOVE-ISA-ARG2-NAUT", 4, 0, false);
        declareFunction(me, "isa_to_naut_conditionsP", "ISA-TO-NAUT-CONDITIONS?", 2, 0, false);
        declareFunction(me, "isas_from_naut_arg2", "ISAS-FROM-NAUT-ARG2", 1, 2, false);
        declareFunction(me, "union_isas_from_naut_arg2", "UNION-ISAS-FROM-NAUT-ARG2", 1, 2, false);
        declareMacro(me, "do_isas_from_naut_arg2", "DO-ISAS-FROM-NAUT-ARG2");
        declareFunction(me, "initialize_quoted_isa_arg2_naut_table", "INITIALIZE-QUOTED-ISA-ARG2-NAUT-TABLE", 0, 0, false);
        declareFunction(me, "clear_quoted_isa_arg2_naut_table", "CLEAR-QUOTED-ISA-ARG2-NAUT-TABLE", 0, 0, false);
        declareFunction(me, "quoted_isa_stored_naut_arg2_p", "QUOTED-ISA-STORED-NAUT-ARG2-P", 1, 0, false);
        declareFunction(me, "store_quoted_isa_arg2_naut", "STORE-QUOTED-ISA-ARG2-NAUT", 4, 0, false);
        declareFunction(me, "remove_quoted_isa_arg2_naut", "REMOVE-QUOTED-ISA-ARG2-NAUT", 4, 0, false);
        declareFunction(me, "quoted_isa_to_naut_conditionsP", "QUOTED-ISA-TO-NAUT-CONDITIONS?", 2, 0, false);
        declareFunction(me, "quoted_isas_from_naut_arg2", "QUOTED-ISAS-FROM-NAUT-ARG2", 1, 2, false);
        declareFunction(me, "union_quoted_isas_from_naut_arg2", "UNION-QUOTED-ISAS-FROM-NAUT-ARG2", 1, 2, false);
        declareMacro(me, "do_quoted_isas_from_naut_arg2", "DO-QUOTED-ISAS-FROM-NAUT-ARG2");
        declareMacro(me, "do_non_fort_isas", "DO-NON-FORT-ISAS");
        declareFunction(me, "set_non_fort_isa_table", "SET-NON-FORT-ISA-TABLE", 1, 0, false);
        declareFunction(me, "set_non_fort_instance_table", "SET-NON-FORT-INSTANCE-TABLE", 1, 0, false);
        declareFunction(me, "non_fort_isa_table", "NON-FORT-ISA-TABLE", 0, 0, false);
        declareFunction(me, "non_fort_instance_table", "NON-FORT-INSTANCE-TABLE", 0, 0, false);
        declareFunction(me, "non_fort_isa_tables_unbuiltP", "NON-FORT-ISA-TABLES-UNBUILT?", 0, 0, false);
        declareFunction(me, "initialize_non_fort_isa_tables", "INITIALIZE-NON-FORT-ISA-TABLES", 0, 0, false);
        declareFunction(me, "rebuild_non_fort_isa_tables", "REBUILD-NON-FORT-ISA-TABLES", 0, 0, false);
        declareFunction(me, "non_fort_isaP", "NON-FORT-ISA?", 2, 2, false);
        declareFunction(me, "non_fort_isa_anyP", "NON-FORT-ISA-ANY?", 2, 2, false);
        declareFunction(me, "non_fort_isa_allP", "NON-FORT-ISA-ALL?", 2, 2, false);
        declareFunction(me, "non_fort_isas", "NON-FORT-ISAS", 1, 2, false);
        declareFunction(me, "non_fort_all_isa", "NON-FORT-ALL-ISA", 1, 2, false);
        declareFunction(me, "non_fort_instance_table_lookup", "NON-FORT-INSTANCE-TABLE-LOOKUP", 1, 0, false);
        declareFunction(me, "possibly_add_non_fort_isa", "POSSIBLY-ADD-NON-FORT-ISA", 1, 0, false);
        declareFunction(me, "possibly_remove_non_fort_isa", "POSSIBLY-REMOVE-NON-FORT-ISA", 1, 0, false);
        declareFunction(me, "add_non_fort_isa", "ADD-NON-FORT-ISA", 1, 0, false);
        declareFunction(me, "remove_non_fort_isa", "REMOVE-NON-FORT-ISA", 1, 0, false);
        declareFunction(me, "clear_sbhl_links_within_mt", "CLEAR-SBHL-LINKS-WITHIN-MT", 2, 1, false);
        declareFunction(me, "clear_sbhl_links", "CLEAR-SBHL-LINKS", 1, 1, false);
        declareFunction(me, "clear_all_sbhl_links", "CLEAR-ALL-SBHL-LINKS", 1, 0, false);
        declareFunction(me, "clear_all_sbhl_links_within_mt", "CLEAR-ALL-SBHL-LINKS-WITHIN-MT", 2, 0, false);
        declareFunction(me, "remove_node_from_sbhl_graphs", "REMOVE-NODE-FROM-SBHL-GRAPHS", 1, 0, false);
        declareFunction(me, "clear_sbhl_module_graph", "CLEAR-SBHL-MODULE-GRAPH", 1, 0, false);
        declareFunction(me, "clear_all_sbhl_data", "CLEAR-ALL-SBHL-DATA", 0, 0, false);
        declareFunction(me, "clear_all_sbhl_non_time_data", "CLEAR-ALL-SBHL-NON-TIME-DATA", 0, 0, false);
        declareFunction(me, "clear_all_sbhl_time_data", "CLEAR-ALL-SBHL-TIME-DATA", 0, 0, false);
        declareFunction(me, "sbhl_any_asserted_true_links", "SBHL-ANY-ASSERTED-TRUE-LINKS", 2, 1, false);
        declareFunction(me, "sbhl_any_asserted_true_inverse_links", "SBHL-ANY-ASSERTED-TRUE-INVERSE-LINKS", 2, 1, false);
        declareFunction(me, "sbhl_asserted_true_links", "SBHL-ASSERTED-TRUE-LINKS", 2, 1, false);
        declareFunction(me, "sbhl_asserted_false_links", "SBHL-ASSERTED-FALSE-LINKS", 2, 1, false);
        declareFunction(me, "sbhl_asserted_true_inverse_links", "SBHL-ASSERTED-TRUE-INVERSE-LINKS", 2, 1, false);
        declareFunction(me, "sbhl_asserted_false_inverse_links", "SBHL-ASSERTED-FALSE-INVERSE-LINKS", 2, 1, false);
        declareFunction(me, "sbhl_supported_true_links", "SBHL-SUPPORTED-TRUE-LINKS", 2, 1, false);
        declareFunction(me, "sbhl_supported_false_links", "SBHL-SUPPORTED-FALSE-LINKS", 2, 1, false);
        declareFunction(me, "sbhl_supported_true_inverse_links", "SBHL-SUPPORTED-TRUE-INVERSE-LINKS", 2, 1, false);
        declareFunction(me, "sbhl_supported_false_inverse_links", "SBHL-SUPPORTED-FALSE-INVERSE-LINKS", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_sbhl_link_methods_file() {
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

    public static SubLObject setup_sbhl_link_methods_file() {
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

    static {



































































































































    }
}

/**
 * Total time: 1281 ms synthetic
 */
