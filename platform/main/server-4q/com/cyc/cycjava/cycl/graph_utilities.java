/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
 * module:      GRAPH-UTILITIES
 * source file: /cyc/top/cycl/graph-utilities.lisp
 * created:     2019/07/03 17:37:16
 */
public final class graph_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new graph_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.graph_utilities";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $extract_link_nodes_nodes$ = makeSymbol("*EXTRACT-LINK-NODES-NODES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $extract_link_nodes_test$ = makeSymbol("*EXTRACT-LINK-NODES-TEST*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("GROUP-NODES"), makeSymbol("GROUP-LINKS"));

    private static final SubLSymbol EXTRACT_LINK_NODES_INT = makeSymbol("EXTRACT-LINK-NODES-INT");

    static private final SubLList $list2 = list(makeSymbol("NODES"), makeSymbol("LINKS"));

    static private final SubLSymbol $sym4$_ = makeSymbol("<");

    private static final SubLSymbol LENGTH_FIRST = makeSymbol("LENGTH-FIRST");

    static private final SubLList $list6 = list(list(makeSymbol("START"), makeSymbol("CURRENT"), makeSymbol("CHILDREN"), makeSymbol("&KEY"), list(makeSymbol("TESTFN"), list(QUOTE, list(QUOTE, EQL)))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list7 = list(makeKeyword("TESTFN"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLList $list10 = list(QUOTE, EQL);

    static private final SubLSymbol $sym11$SEEN = makeUninternedSymbol("SEEN");

    static private final SubLSymbol $sym12$TODO = makeUninternedSymbol("TODO");

    static private final SubLSymbol $sym13$CHILD = makeUninternedSymbol("CHILD");

    static private final SubLList $list16 = list(list(makeSymbol("CREATE-QUEUE")));

    static private final SubLSymbol $sym27$SET_MEMBER_ = makeSymbol("SET-MEMBER?");

    private static final SubLSymbol TEST_COMPUTE_GRAPH_RANK_ESTIMATE = makeSymbol("TEST-COMPUTE-GRAPH-RANK-ESTIMATE");

    private static final SubLList $list35 = list(list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(cons(makeSymbol("A"), SEVEN_INTEGER), cons(makeSymbol("B"), FIVE_INTEGER), cons(makeSymbol("C"), FIVE_INTEGER), cons(makeSymbol("D"), FOUR_INTEGER), cons(makeSymbol("E"), ONE_INTEGER), cons(makeSymbol("F"), ONE_INTEGER), cons(makeSymbol("G"), ONE_INTEGER))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(cons(makeSymbol("A"), TEN_INTEGER), cons(makeSymbol("B"), EIGHT_INTEGER), cons(makeSymbol("C"), EIGHT_INTEGER), cons(makeSymbol("D"), SEVEN_INTEGER), cons(makeSymbol("E"), THREE_INTEGER), cons(makeSymbol("F"), TWO_INTEGER), cons(makeSymbol("G"), ONE_INTEGER)), list(cons(makeSymbol("E"), THREE_INTEGER), cons(makeSymbol("F"), TWO_INTEGER), cons(makeSymbol("G"), ONE_INTEGER))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D"))), list(cons(makeSymbol("E"), ONE_INTEGER), cons(makeSymbol("F"), ONE_INTEGER), cons(makeSymbol("G"), ONE_INTEGER), cons(makeSymbol("D"), FOUR_INTEGER))), makeKeyword("SUCCESS")));

    private static final SubLString $str36$The_expected_map_size__A_differs_ = makeString("The expected map size ~A differs from the generated size ~A.");

    private static final SubLList $list37 = list(makeSymbol("NODE"), makeSymbol("EXPECTED-VALUE"));

    private static final SubLString $str38$Expected_rank_estimate__A_for__A_ = makeString("Expected rank estimate ~A for ~A, got ~A.");

    private static final SubLSymbol MAP_P = makeSymbol("MAP-P");

    private static final SubLList $list41 = list(makeSymbol("NODE"), makeSymbol("SUPER-NODES"));

    private static final SubLSymbol TEST_DAG_IDENTIFY_LEAFS = makeSymbol("TEST-DAG-IDENTIFY-LEAFS");

    private static final SubLList $list43 = list(list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(makeSymbol("E"), makeSymbol("F"), makeSymbol("G"))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), cons(makeSymbol("A"), makeSymbol("G"))), list(makeSymbol("E"), makeSymbol("F"))), makeKeyword("SUCCESS")));

    private static final SubLString $str44$Expected__A_leafs__got__A_leafs_i = makeString("Expected ~A leafs, got ~A leafs instead.");

    private static final SubLString $str45$The_expected_leaf_set__A_differs_ = makeString("The expected leaf set ~A differs from the computed leaf set ~A.");

    private static final SubLSymbol TEST_DAG_IDENTIFY_ROOTS = makeSymbol("TEST-DAG-IDENTIFY-ROOTS");

    private static final SubLList $list47 = list(list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(makeSymbol("A"))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), list(makeSymbol("A"))), list(makeSymbol("A"))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), cons(makeSymbol("A"), makeSymbol("G"))), NIL), makeKeyword("SUCCESS")));

    private static final SubLString $str48$Expected__A_roots__got__A_roots_i = makeString("Expected ~A roots, got ~A roots instead.");

    private static final SubLString $str49$The_expected_roots_set__A_differs = makeString("The expected roots set ~A differs from the computed roots set ~A.");

    private static final SubLList $list51 = list(makeSymbol("NODE"), makeSymbol("SUPERIOR"));

    private static final SubLSymbol TEST_DAG_ELIDE_FROM_GRAPH = makeSymbol("TEST-DAG-ELIDE-FROM-GRAPH");

    private static final SubLList $list53 = list(list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(makeSymbol("D")), list(list(makeSymbol("E"), makeSymbol("B"), makeSymbol("C")), list(makeSymbol("F"), makeSymbol("B"), makeSymbol("C")), list(makeSymbol("G"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), cons(makeSymbol("A"), makeSymbol("G"))), list(makeSymbol("D"), makeSymbol("G")), list(list(makeSymbol("E"), makeSymbol("B"), makeSymbol("C")), list(makeSymbol("F"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C")))), makeKeyword("SUCCESS")), list(list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"))), list(makeSymbol("C")), list(cons(makeSymbol("A"), makeSymbol("B")))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(makeSymbol("A")), list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")))), makeKeyword("SUCCESS")));

    private static final SubLString $str54$_A_is_not_of_the_expected_size__A = makeString("~A is not of the expected size ~A, as ~A is.");

    private static final SubLList $list55 = list(makeSymbol("NODE"), makeSymbol("SUPERIORS"));

    private static final SubLString $str56$_A_does_not_contain_the_expected_ = makeString("~A does not contain the expected key ~A, whose value should be ~A.");

    private static final SubLString $str57$The_superiors_for_node__A_are__A_ = makeString("The superiors for node ~A are ~A, not ~A.");

    private static final SubLString $str58$The_superior_for_node__A_is__A__n = makeString("The superior for node ~A is ~A, not ~A.");

    // Definitions
    /**
     * Given a list of NODES, and a list of LINKS which relate these nodes,
     * categorize the nodes into island-groups, where each group consists of a list of
     * connected nodes, and a list of links involving these nodes.
     * Returns 3 values :
     * CONNECTED-GROUPS -- list of island groups with multiple nodes.
     * ISOLATED-GROUPS  -- list of island groups with single nodes and some links.
     * NAKED-GROUPS     -- list of island groups with single nodes and no links.
     */
    @LispMethod(comment = "Given a list of NODES, and a list of LINKS which relate these nodes,\r\ncategorize the nodes into island-groups, where each group consists of a list of\r\nconnected nodes, and a list of links involving these nodes.\r\nReturns 3 values :\r\nCONNECTED-GROUPS -- list of island groups with multiple nodes.\r\nISOLATED-GROUPS  -- list of island groups with single nodes and some links.\r\nNAKED-GROUPS     -- list of island groups with single nodes and no links.\nGiven a list of NODES, and a list of LINKS which relate these nodes,\ncategorize the nodes into island-groups, where each group consists of a list of\nconnected nodes, and a list of links involving these nodes.\nReturns 3 values :\nCONNECTED-GROUPS -- list of island groups with multiple nodes.\nISOLATED-GROUPS  -- list of island groups with single nodes and some links.\nNAKED-GROUPS     -- list of island groups with single nodes and no links.")
    public static final SubLObject categorize_nodes_via_links_alt(SubLObject nodes, SubLObject links, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject all_island_groups = NIL;
            {
                SubLObject cdolist_list_var = nodes;
                SubLObject node = NIL;
                for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                    all_island_groups = cons(list(list(node), NIL), all_island_groups);
                }
            }
            {
                SubLObject cdolist_list_var = links;
                SubLObject link = NIL;
                for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                    {
                        SubLObject link_nodes = com.cyc.cycjava.cycl.graph_utilities.extract_link_nodes(link, nodes, test);
                        SubLObject island_groups = com.cyc.cycjava.cycl.graph_utilities.extract_island_groups(link_nodes, all_island_groups, test);
                        SubLObject island_group = NIL;
                        if (NIL != list_utilities.singletonP(island_groups)) {
                            island_group = island_groups.first();
                        } else {
                            {
                                SubLObject merged_island_group = com.cyc.cycjava.cycl.graph_utilities.merge_island_groups(island_groups);
                                all_island_groups = set_difference(all_island_groups, island_groups, UNPROVIDED, UNPROVIDED);
                                all_island_groups = cons(merged_island_group, all_island_groups);
                                island_group = merged_island_group;
                            }
                        }
                        {
                            SubLObject datum = island_group;
                            SubLObject current = datum;
                            SubLObject group_nodes = NIL;
                            SubLObject group_links = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt0);
                            group_nodes = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt0);
                            group_links = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                set_nth(ONE_INTEGER, island_group, cons(link, group_links));
                            } else {
                                cdestructuring_bind_error(datum, $list_alt0);
                            }
                        }
                    }
                }
            }
            {
                SubLObject connected_groups = NIL;
                SubLObject isolated_groups = NIL;
                SubLObject naked_groups = NIL;
                SubLObject cdolist_list_var = all_island_groups;
                SubLObject island_group = NIL;
                for (island_group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , island_group = cdolist_list_var.first()) {
                    {
                        SubLObject datum = island_group;
                        SubLObject current = datum;
                        SubLObject group_nodes = NIL;
                        SubLObject group_links = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        group_nodes = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        group_links = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != list_utilities.singletonP(group_nodes)) {
                                if (NIL == group_links) {
                                    naked_groups = cons(island_group, naked_groups);
                                } else {
                                    isolated_groups = cons(island_group, isolated_groups);
                                }
                            } else {
                                connected_groups = cons(island_group, connected_groups);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                    }
                }
                if (ONE_INTEGER.numE(length(nodes))) {
                    connected_groups = isolated_groups;
                    isolated_groups = NIL;
                }
                connected_groups = com.cyc.cycjava.cycl.graph_utilities.sort_connected_groups(connected_groups, nodes, links, test);
                isolated_groups = com.cyc.cycjava.cycl.graph_utilities.sort_isolated_groups(isolated_groups, nodes, links, test);
                naked_groups = com.cyc.cycjava.cycl.graph_utilities.sort_naked_groups(naked_groups, nodes, test);
                return values(connected_groups, isolated_groups, naked_groups);
            }
        }
    }

    // Definitions
    /**
     * Given a list of NODES, and a list of LINKS which relate these nodes,
     * categorize the nodes into island-groups, where each group consists of a list of
     * connected nodes, and a list of links involving these nodes.
     * Returns 3 values :
     * CONNECTED-GROUPS -- list of island groups with multiple nodes.
     * ISOLATED-GROUPS  -- list of island groups with single nodes and some links.
     * NAKED-GROUPS     -- list of island groups with single nodes and no links.
     */
    @LispMethod(comment = "Given a list of NODES, and a list of LINKS which relate these nodes,\r\ncategorize the nodes into island-groups, where each group consists of a list of\r\nconnected nodes, and a list of links involving these nodes.\r\nReturns 3 values :\r\nCONNECTED-GROUPS -- list of island groups with multiple nodes.\r\nISOLATED-GROUPS  -- list of island groups with single nodes and some links.\r\nNAKED-GROUPS     -- list of island groups with single nodes and no links.\nGiven a list of NODES, and a list of LINKS which relate these nodes,\ncategorize the nodes into island-groups, where each group consists of a list of\nconnected nodes, and a list of links involving these nodes.\nReturns 3 values :\nCONNECTED-GROUPS -- list of island groups with multiple nodes.\nISOLATED-GROUPS  -- list of island groups with single nodes and some links.\nNAKED-GROUPS     -- list of island groups with single nodes and no links.")
    public static SubLObject categorize_nodes_via_links(final SubLObject nodes, final SubLObject links, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject all_island_groups = NIL;
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            all_island_groups = cons(list(list(node), NIL), all_island_groups);
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        cdolist_list_var = links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject link_nodes = extract_link_nodes(link, nodes, test);
            final SubLObject island_groups = extract_island_groups(link_nodes, all_island_groups, test);
            SubLObject island_group = NIL;
            if (NIL != list_utilities.singletonP(island_groups)) {
                island_group = island_groups.first();
            } else {
                final SubLObject merged_island_group = merge_island_groups(island_groups);
                all_island_groups = set_difference(all_island_groups, island_groups, UNPROVIDED, UNPROVIDED);
                all_island_groups = cons(merged_island_group, all_island_groups);
                island_group = merged_island_group;
            }
            SubLObject current;
            final SubLObject datum = current = island_group;
            SubLObject group_nodes = NIL;
            SubLObject group_links = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            group_nodes = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list0);
            group_links = current.first();
            current = current.rest();
            if (NIL == current) {
                set_nth(ONE_INTEGER, island_group, cons(link, group_links));
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        SubLObject connected_groups = NIL;
        SubLObject isolated_groups = NIL;
        SubLObject naked_groups = NIL;
        SubLObject cdolist_list_var2 = all_island_groups;
        SubLObject island_group = NIL;
        island_group = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = island_group;
            SubLObject group_nodes = NIL;
            SubLObject group_links = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            group_nodes = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list0);
            group_links = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != list_utilities.singletonP(group_nodes)) {
                    if (NIL == group_links) {
                        naked_groups = cons(island_group, naked_groups);
                    } else {
                        isolated_groups = cons(island_group, isolated_groups);
                    }
                } else {
                    connected_groups = cons(island_group, connected_groups);
                }
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            island_group = cdolist_list_var2.first();
        } 
        if (ONE_INTEGER.numE(length(nodes))) {
            connected_groups = isolated_groups;
            isolated_groups = NIL;
        }
        connected_groups = sort_connected_groups(connected_groups, nodes, links, test);
        isolated_groups = sort_isolated_groups(isolated_groups, nodes, links, test);
        naked_groups = sort_naked_groups(naked_groups, nodes, test);
        return values(connected_groups, isolated_groups, naked_groups);
    }

    /**
     * Extract a subset of CANDIDATE-NODES mentioned in LINK.
     */
    @LispMethod(comment = "Extract a subset of CANDIDATE-NODES mentioned in LINK.")
    public static final SubLObject extract_link_nodes_alt(SubLObject link, SubLObject candidate_nodes, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $extract_link_nodes_nodes$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $extract_link_nodes_test$.currentBinding(thread);
                    try {
                        $extract_link_nodes_nodes$.bind(candidate_nodes, thread);
                        $extract_link_nodes_test$.bind(test, thread);
                        v_answer = list_utilities.tree_gather(link, EXTRACT_LINK_NODES_INT, test, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $extract_link_nodes_test$.rebind(_prev_bind_1, thread);
                        $extract_link_nodes_nodes$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     * Extract a subset of CANDIDATE-NODES mentioned in LINK.
     */
    @LispMethod(comment = "Extract a subset of CANDIDATE-NODES mentioned in LINK.")
    public static SubLObject extract_link_nodes(final SubLObject link, final SubLObject candidate_nodes, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $extract_link_nodes_nodes$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $extract_link_nodes_test$.currentBinding(thread);
        try {
            $extract_link_nodes_nodes$.bind(candidate_nodes, thread);
            $extract_link_nodes_test$.bind(test, thread);
            v_answer = list_utilities.tree_gather(link, EXTRACT_LINK_NODES_INT, test, UNPROVIDED, UNPROVIDED);
        } finally {
            $extract_link_nodes_test$.rebind(_prev_bind_2, thread);
            $extract_link_nodes_nodes$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static final SubLObject extract_link_nodes_int_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(v_object, $extract_link_nodes_nodes$.getDynamicValue(thread), $extract_link_nodes_test$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject extract_link_nodes_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, $extract_link_nodes_nodes$.getDynamicValue(thread), $extract_link_nodes_test$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     * Extract a subset of CANDIDATE-ISLAND-GROUPS whose nodes intersect NODES.
     */
    @LispMethod(comment = "Extract a subset of CANDIDATE-ISLAND-GROUPS whose nodes intersect NODES.")
    public static final SubLObject extract_island_groups_alt(SubLObject nodes, SubLObject candidate_island_groups, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject island_groups = NIL;
            SubLObject cdolist_list_var = nodes;
            SubLObject node = NIL;
            for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                {
                    SubLObject island_group = com.cyc.cycjava.cycl.graph_utilities.island_group_for_node(node, candidate_island_groups, test);
                    SubLObject item_var = island_group;
                    if (NIL == member(item_var, island_groups, symbol_function(EQL), symbol_function(IDENTITY))) {
                        island_groups = cons(item_var, island_groups);
                    }
                }
            }
            return island_groups;
        }
    }

    /**
     * Extract a subset of CANDIDATE-ISLAND-GROUPS whose nodes intersect NODES.
     */
    @LispMethod(comment = "Extract a subset of CANDIDATE-ISLAND-GROUPS whose nodes intersect NODES.")
    public static SubLObject extract_island_groups(final SubLObject nodes, final SubLObject candidate_island_groups, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject island_groups = NIL;
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var;
            final SubLObject island_group = item_var = island_group_for_node(node, candidate_island_groups, test);
            if (NIL == member(item_var, island_groups, symbol_function(EQL), symbol_function(IDENTITY))) {
                island_groups = cons(item_var, island_groups);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return island_groups;
    }

    /**
     * Return the associated island-group for NODE from ISLAND-GROUPS.
     */
    @LispMethod(comment = "Return the associated island-group for NODE from ISLAND-GROUPS.")
    public static final SubLObject island_group_for_node_alt(SubLObject node, SubLObject island_groups, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject v_answer = NIL;
            if (NIL == v_answer) {
                {
                    SubLObject csome_list_var = island_groups;
                    SubLObject island_group = NIL;
                    for (island_group = csome_list_var.first(); !((NIL != v_answer) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , island_group = csome_list_var.first()) {
                        {
                            SubLObject datum = island_group;
                            SubLObject current = datum;
                            SubLObject nodes = NIL;
                            SubLObject links = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt2);
                            nodes = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt2);
                            links = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != subl_promotions.memberP(node, nodes, test, UNPROVIDED)) {
                                    v_answer = island_group;
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt2);
                            }
                        }
                    }
                }
            }
            return v_answer;
        }
    }

    /**
     * Return the associated island-group for NODE from ISLAND-GROUPS.
     */
    @LispMethod(comment = "Return the associated island-group for NODE from ISLAND-GROUPS.")
    public static SubLObject island_group_for_node(final SubLObject node, final SubLObject island_groups, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject v_answer = NIL;
        if (NIL == v_answer) {
            SubLObject csome_list_var = island_groups;
            SubLObject island_group = NIL;
            island_group = csome_list_var.first();
            while ((NIL == v_answer) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = island_group;
                SubLObject nodes = NIL;
                SubLObject links = NIL;
                destructuring_bind_must_consp(current, datum, $list2);
                nodes = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list2);
                links = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != subl_promotions.memberP(node, nodes, test, UNPROVIDED)) {
                        v_answer = island_group;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list2);
                }
                csome_list_var = csome_list_var.rest();
                island_group = csome_list_var.first();
            } 
        }
        return v_answer;
    }

    /**
     * Merge every island-group in ISLAND-GROUPS into a single resulting group.
     */
    @LispMethod(comment = "Merge every island-group in ISLAND-GROUPS into a single resulting group.")
    public static final SubLObject merge_island_groups_alt(SubLObject island_groups) {
        {
            SubLObject merged_group_nodes = NIL;
            SubLObject merged_group_links = NIL;
            SubLObject cdolist_list_var = island_groups;
            SubLObject island_group = NIL;
            for (island_group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , island_group = cdolist_list_var.first()) {
                {
                    SubLObject datum = island_group;
                    SubLObject current = datum;
                    SubLObject group_nodes = NIL;
                    SubLObject group_links = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    group_nodes = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    group_links = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject cdolist_list_var_1 = group_nodes;
                            SubLObject node = NIL;
                            for (node = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , node = cdolist_list_var_1.first()) {
                                merged_group_nodes = cons(node, merged_group_nodes);
                            }
                        }
                        {
                            SubLObject cdolist_list_var_2 = group_links;
                            SubLObject link = NIL;
                            for (link = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , link = cdolist_list_var_2.first()) {
                                merged_group_links = cons(link, merged_group_links);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
            {
                SubLObject merged_island_group = list(merged_group_nodes, merged_group_links);
                return merged_island_group;
            }
        }
    }

    /**
     * Merge every island-group in ISLAND-GROUPS into a single resulting group.
     */
    @LispMethod(comment = "Merge every island-group in ISLAND-GROUPS into a single resulting group.")
    public static SubLObject merge_island_groups(final SubLObject island_groups) {
        SubLObject merged_group_nodes = NIL;
        SubLObject merged_group_links = NIL;
        SubLObject cdolist_list_var = island_groups;
        SubLObject island_group = NIL;
        island_group = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = island_group;
            SubLObject group_nodes = NIL;
            SubLObject group_links = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            group_nodes = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list0);
            group_links = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$1 = group_nodes;
                SubLObject node = NIL;
                node = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    merged_group_nodes = cons(node, merged_group_nodes);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    node = cdolist_list_var_$1.first();
                } 
                SubLObject cdolist_list_var_$2 = group_links;
                SubLObject link = NIL;
                link = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    merged_group_links = cons(link, merged_group_links);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    link = cdolist_list_var_$2.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            island_group = cdolist_list_var.first();
        } 
        final SubLObject merged_island_group = list(merged_group_nodes, merged_group_links);
        return merged_island_group;
    }

    /**
     * Sort CONNECTED-GROUPS based on ALL-NODES and ALL-LNIKS.
     */
    @LispMethod(comment = "Sort CONNECTED-GROUPS based on ALL-NODES and ALL-LNIKS.")
    public static final SubLObject sort_connected_groups_alt(SubLObject connected_groups, SubLObject all_nodes, SubLObject all_links, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject cdolist_list_var = connected_groups;
            SubLObject island_group = NIL;
            for (island_group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , island_group = cdolist_list_var.first()) {
                {
                    SubLObject datum = island_group;
                    SubLObject current = datum;
                    SubLObject nodes = NIL;
                    SubLObject links = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    nodes = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    links = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        set_nth(ZERO_INTEGER, island_group, list_utilities.sort_via_position(nodes, all_nodes, symbol_function(EQL), UNPROVIDED));
                        set_nth(ONE_INTEGER, island_group, list_utilities.sort_via_position(links, all_links, symbol_function(EQL), UNPROVIDED));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt2);
                    }
                }
            }
        }
        connected_groups = list_utilities.sort_via_position(connected_groups, all_nodes, test, symbol_function(CAAR));
        return Sort.stable_sort(connected_groups, symbol_function($sym4$_), symbol_function(LENGTH_FIRST));
    }

    /**
     * Sort CONNECTED-GROUPS based on ALL-NODES and ALL-LNIKS.
     */
    @LispMethod(comment = "Sort CONNECTED-GROUPS based on ALL-NODES and ALL-LNIKS.")
    public static SubLObject sort_connected_groups(SubLObject connected_groups, final SubLObject all_nodes, final SubLObject all_links, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject cdolist_list_var = connected_groups;
        SubLObject island_group = NIL;
        island_group = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = island_group;
            SubLObject nodes = NIL;
            SubLObject links = NIL;
            destructuring_bind_must_consp(current, datum, $list2);
            nodes = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list2);
            links = current.first();
            current = current.rest();
            if (NIL == current) {
                set_nth(ZERO_INTEGER, island_group, list_utilities.sort_via_position(nodes, all_nodes, symbol_function(EQL), UNPROVIDED));
                set_nth(ONE_INTEGER, island_group, list_utilities.sort_via_position(links, all_links, symbol_function(EQL), UNPROVIDED));
            } else {
                cdestructuring_bind_error(datum, $list2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            island_group = cdolist_list_var.first();
        } 
        connected_groups = list_utilities.sort_via_position(connected_groups, all_nodes, test, symbol_function(CAAR));
        return Sort.stable_sort(connected_groups, symbol_function($sym4$_), symbol_function(LENGTH_FIRST));
    }

    public static final SubLObject length_first_alt(SubLObject v_object) {
        return length(v_object.first());
    }

    public static SubLObject length_first(final SubLObject v_object) {
        return length(v_object.first());
    }

    /**
     * Sort ISOLATED-GROUPS based on ALL-NODES and ALL-LNIKS.
     */
    @LispMethod(comment = "Sort ISOLATED-GROUPS based on ALL-NODES and ALL-LNIKS.")
    public static final SubLObject sort_isolated_groups_alt(SubLObject isolated_groups, SubLObject all_nodes, SubLObject all_links, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject cdolist_list_var = isolated_groups;
            SubLObject island_group = NIL;
            for (island_group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , island_group = cdolist_list_var.first()) {
                {
                    SubLObject datum = island_group;
                    SubLObject current = datum;
                    SubLObject nodes = NIL;
                    SubLObject links = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    nodes = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    links = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        set_nth(ONE_INTEGER, island_group, list_utilities.sort_via_position(links, all_links, symbol_function(EQL), UNPROVIDED));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt2);
                    }
                }
            }
        }
        return list_utilities.sort_via_position(isolated_groups, all_nodes, test, symbol_function(CAAR));
    }

    /**
     * Sort ISOLATED-GROUPS based on ALL-NODES and ALL-LNIKS.
     */
    @LispMethod(comment = "Sort ISOLATED-GROUPS based on ALL-NODES and ALL-LNIKS.")
    public static SubLObject sort_isolated_groups(final SubLObject isolated_groups, final SubLObject all_nodes, final SubLObject all_links, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject cdolist_list_var = isolated_groups;
        SubLObject island_group = NIL;
        island_group = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = island_group;
            SubLObject nodes = NIL;
            SubLObject links = NIL;
            destructuring_bind_must_consp(current, datum, $list2);
            nodes = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list2);
            links = current.first();
            current = current.rest();
            if (NIL == current) {
                set_nth(ONE_INTEGER, island_group, list_utilities.sort_via_position(links, all_links, symbol_function(EQL), UNPROVIDED));
            } else {
                cdestructuring_bind_error(datum, $list2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            island_group = cdolist_list_var.first();
        } 
        return list_utilities.sort_via_position(isolated_groups, all_nodes, test, symbol_function(CAAR));
    }

    /**
     * Sort NAKED-GROUPS based on ALL-NODES.
     */
    @LispMethod(comment = "Sort NAKED-GROUPS based on ALL-NODES.")
    public static final SubLObject sort_naked_groups_alt(SubLObject naked_groups, SubLObject all_nodes, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return list_utilities.sort_via_position(naked_groups, all_nodes, test, symbol_function(CAAR));
    }

    /**
     * Sort NAKED-GROUPS based on ALL-NODES.
     */
    @LispMethod(comment = "Sort NAKED-GROUPS based on ALL-NODES.")
    public static SubLObject sort_naked_groups(final SubLObject naked_groups, final SubLObject all_nodes, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return list_utilities.sort_via_position(naked_groups, all_nodes, test, symbol_function(CAAR));
    }

    /**
     * This macro sets up the infrastructure for a breadth first generic graph walk.
     * START is used to initialize the queue, and after each completion of body,
     * CHILDREN is assumed to contain the set of nodes to consider next. The
     * macro is guaranteed to visit each child only once.
     */
    @LispMethod(comment = "This macro sets up the infrastructure for a breadth first generic graph walk.\r\nSTART is used to initialize the queue, and after each completion of body,\r\nCHILDREN is assumed to contain the set of nodes to consider next. The\r\nmacro is guaranteed to visit each child only once.\nThis macro sets up the infrastructure for a breadth first generic graph walk.\nSTART is used to initialize the queue, and after each completion of body,\nCHILDREN is assumed to contain the set of nodes to consider next. The\nmacro is guaranteed to visit each child only once.")
    public static final SubLObject walk_graph_breadth_first_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject start = NIL;
                    SubLObject current_3 = NIL;
                    SubLObject children = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    start = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    current_3 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    children = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt6);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt6);
                            if (NIL == member(current_4, $list_alt7, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt6);
                        }
                        {
                            SubLObject testfn_tail = property_list_member($TESTFN, current);
                            SubLObject testfn = (NIL != testfn_tail) ? ((SubLObject) (cadr(testfn_tail))) : $list_alt10;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject seen = $sym11$SEEN;
                                SubLObject todo = $sym12$TODO;
                                SubLObject child = $sym13$CHILD;
                                return list(CLET, list(list(seen, list(NEW_SET, testfn)), bq_cons(todo, $list_alt16)), list(ENQUEUE, start, todo), list(SET_ADD, start, seen), list(WHILE, list(CNOT, list(QUEUE_EMPTY_P, todo)), list(CLET, list(current_3, children), list(CSETQ, current_3, list(DEQUEUE, todo)), bq_cons(PROGN, append(body, NIL)), list(CDOLIST, list(child, children), list(PUNLESS, list($sym27$SET_MEMBER_, child, seen), list(SET_ADD, child, seen), list(ENQUEUE, child, todo))))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * This macro sets up the infrastructure for a breadth first generic graph walk.
     * START is used to initialize the queue, and after each completion of body,
     * CHILDREN is assumed to contain the set of nodes to consider next. The
     * macro is guaranteed to visit each child only once.
     */
    @LispMethod(comment = "This macro sets up the infrastructure for a breadth first generic graph walk.\r\nSTART is used to initialize the queue, and after each completion of body,\r\nCHILDREN is assumed to contain the set of nodes to consider next. The\r\nmacro is guaranteed to visit each child only once.\nThis macro sets up the infrastructure for a breadth first generic graph walk.\nSTART is used to initialize the queue, and after each completion of body,\nCHILDREN is assumed to contain the set of nodes to consider next. The\nmacro is guaranteed to visit each child only once.")
    public static SubLObject walk_graph_breadth_first(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject start = NIL;
        SubLObject current_$3 = NIL;
        SubLObject children = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        start = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        current_$3 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        children = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list6);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list6);
            if (NIL == member(current_$4, $list7, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list6);
        }
        final SubLObject testfn_tail = property_list_member($TESTFN, current);
        final SubLObject testfn = (NIL != testfn_tail) ? cadr(testfn_tail) : $list10;
        final SubLObject body;
        current = body = temp;
        final SubLObject seen = $sym11$SEEN;
        final SubLObject todo = $sym12$TODO;
        final SubLObject child = $sym13$CHILD;
        return list(CLET, list(list(seen, list(NEW_SET, testfn)), bq_cons(todo, $list16)), list(ENQUEUE, start, todo), list(SET_ADD, start, seen), list(WHILE, list(CNOT, list(QUEUE_EMPTY_P, todo)), list(CLET, list(current_$3, children), list(CSETQ, current_$3, list(DEQUEUE, todo)), bq_cons(PROGN, append(body, NIL)), list(CDOLIST, list(child, children), list(PUNLESS, list($sym27$SET_MEMBER_, child, seen), list(SET_ADD, child, seen), list(ENQUEUE, child, todo))))));
    }

    /**
     * Given a graph map, that is, a set of entities pointing to other entities, of the
     * form KEY -> (LISTP of KEY) of the parents, compute the generality estimate of the nodes in
     * the graph. During each traversal, each node is guaranteed to be only visited once,
     * even in the face of a loop; notice that this penalizes diamonds.
     *
     * @see REVERSE-INDEX-MAP if the graph is built around a parents -> children assumption
    The algorithm traverses the graph from the bottom to the top, adding one to each
    node for each child.
     * @param ESTIMATES-MAP
     * 		if not provided, CLONE-MAP is used to generate one from the graph map
     * @param LEAF-DELTAS
     * 		MAP-P that provides starting counts for leafs; assume starting count
     * 		of 1, if not provided.
     * @return ESTIMATES-MAP
     */
    @LispMethod(comment = "Given a graph map, that is, a set of entities pointing to other entities, of the\r\nform KEY -> (LISTP of KEY) of the parents, compute the generality estimate of the nodes in\r\nthe graph. During each traversal, each node is guaranteed to be only visited once,\r\neven in the face of a loop; notice that this penalizes diamonds.\r\n\r\n@see REVERSE-INDEX-MAP if the graph is built around a parents -> children assumption\r\nThe algorithm traverses the graph from the bottom to the top, adding one to each\r\nnode for each child.\r\n@param ESTIMATES-MAP\r\n\t\tif not provided, CLONE-MAP is used to generate one from the graph map\r\n@param LEAF-DELTAS\r\n\t\tMAP-P that provides starting counts for leafs; assume starting count\r\n\t\tof 1, if not provided.\r\n@return ESTIMATES-MAP\nGiven a graph map, that is, a set of entities pointing to other entities, of the\nform KEY -> (LISTP of KEY) of the parents, compute the generality estimate of the nodes in\nthe graph. During each traversal, each node is guaranteed to be only visited once,\neven in the face of a loop; notice that this penalizes diamonds.")
    public static final SubLObject compute_graph_rank_estimate_alt(SubLObject graph_map, SubLObject estimates_map, SubLObject leaf_deltas) {
        if (estimates_map == UNPROVIDED) {
            estimates_map = NIL;
        }
        if (leaf_deltas == UNPROVIDED) {
            leaf_deltas = NIL;
        }
        if (NIL == map_utilities.map_p(estimates_map)) {
            estimates_map = map_utilities.clone_map(graph_map, NIL);
        }
        {
            SubLObject singleton = list(NIL);
            SubLObject key_test = map_utilities.map_test(graph_map);
            SubLObject key_set = set_utilities.construct_set_from_list(map_utilities.map_keys(graph_map), key_test, map_utilities.map_size(graph_map));
            SubLObject implied_roots = set.new_set(map_utilities.map_test(graph_map), UNPROVIDED);
            {
                SubLObject set_contents_var = set.do_set_internal(key_set);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject node = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, node)) {
                            {
                                SubLObject delta = ONE_INTEGER;
                                if (NIL != map_utilities.map_p(leaf_deltas)) {
                                    delta = map_utilities.map_get(leaf_deltas, node, delta);
                                }
                                {
                                    SubLObject seen = set.new_set(EQL, UNPROVIDED);
                                    SubLObject todo = queues.create_queue();
                                    queues.enqueue(node, todo);
                                    set.set_add(node, seen);
                                    while (NIL == queues.queue_empty_p(todo)) {
                                        {
                                            SubLObject current = NIL;
                                            SubLObject super_nodes = NIL;
                                            current = queues.dequeue(todo);
                                            map_utilities.map_increment(estimates_map, current, delta);
                                            super_nodes = map_utilities.map_get(graph_map, current, UNPROVIDED);
                                            if (NIL == super_nodes) {
                                                if (NIL == set.set_memberP(current, key_set)) {
                                                    set.set_add(current, implied_roots);
                                                }
                                            } else {
                                                if (!super_nodes.isCons()) {
                                                    rplaca(singleton, super_nodes);
                                                    super_nodes = singleton;
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = super_nodes;
                                                SubLObject child = NIL;
                                                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                                    if (NIL == set.set_memberP(child, seen)) {
                                                        set.set_add(child, seen);
                                                        queues.enqueue(child, todo);
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
            }
            {
                SubLObject set_contents_var = set.do_set_internal(implied_roots);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject node = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, node)) {
                            {
                                SubLObject delta = ONE_INTEGER;
                                if (NIL != map_utilities.map_p(leaf_deltas)) {
                                    delta = map_utilities.map_get(leaf_deltas, node, delta);
                                }
                                map_utilities.map_increment(estimates_map, node, delta);
                            }
                        }
                    }
                }
            }
        }
        return estimates_map;
    }

    /**
     * Given a graph map, that is, a set of entities pointing to other entities, of the
     * form KEY -> (LISTP of KEY) of the parents, compute the generality estimate of the nodes in
     * the graph. During each traversal, each node is guaranteed to be only visited once,
     * even in the face of a loop; notice that this penalizes diamonds.
     *
     * @see REVERSE-INDEX-MAP if the graph is built around a parents -> children assumption
    The algorithm traverses the graph from the bottom to the top, adding one to each
    node for each child.
     * @param ESTIMATES-MAP
     * 		if not provided, CLONE-MAP is used to generate one from the graph map
     * @param LEAF-DELTAS
     * 		MAP-P that provides starting counts for leafs; assume starting count
     * 		of 1, if not provided.
     * @return ESTIMATES-MAP
     */
    @LispMethod(comment = "Given a graph map, that is, a set of entities pointing to other entities, of the\r\nform KEY -> (LISTP of KEY) of the parents, compute the generality estimate of the nodes in\r\nthe graph. During each traversal, each node is guaranteed to be only visited once,\r\neven in the face of a loop; notice that this penalizes diamonds.\r\n\r\n@see REVERSE-INDEX-MAP if the graph is built around a parents -> children assumption\r\nThe algorithm traverses the graph from the bottom to the top, adding one to each\r\nnode for each child.\r\n@param ESTIMATES-MAP\r\n\t\tif not provided, CLONE-MAP is used to generate one from the graph map\r\n@param LEAF-DELTAS\r\n\t\tMAP-P that provides starting counts for leafs; assume starting count\r\n\t\tof 1, if not provided.\r\n@return ESTIMATES-MAP\nGiven a graph map, that is, a set of entities pointing to other entities, of the\nform KEY -> (LISTP of KEY) of the parents, compute the generality estimate of the nodes in\nthe graph. During each traversal, each node is guaranteed to be only visited once,\neven in the face of a loop; notice that this penalizes diamonds.")
    public static SubLObject compute_graph_rank_estimate(final SubLObject graph_map, SubLObject estimates_map, SubLObject leaf_deltas) {
        if (estimates_map == UNPROVIDED) {
            estimates_map = NIL;
        }
        if (leaf_deltas == UNPROVIDED) {
            leaf_deltas = NIL;
        }
        if (NIL == map_utilities.map_p(estimates_map)) {
            estimates_map = map_utilities.clone_map(graph_map, NIL);
        }
        final SubLObject singleton = list(NIL);
        final SubLObject key_test = map_utilities.map_test(graph_map);
        final SubLObject key_set = set_utilities.construct_set_from_list(map_utilities.map_keys(graph_map), key_test, map_utilities.map_size(graph_map));
        final SubLObject implied_roots = set.new_set(map_utilities.map_test(graph_map), UNPROVIDED);
        SubLObject set_contents_var = set.do_set_internal(key_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject node;
        SubLObject delta;
        SubLObject seen;
        SubLObject todo;
        SubLObject current;
        SubLObject super_nodes;
        SubLObject cdolist_list_var;
        SubLObject child;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            node = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, node)) {
                delta = ONE_INTEGER;
                if (NIL != map_utilities.map_p(leaf_deltas)) {
                    delta = map_utilities.map_get(leaf_deltas, node, delta);
                }
                seen = set.new_set(EQL, UNPROVIDED);
                todo = queues.create_queue(UNPROVIDED);
                queues.enqueue(node, todo);
                set.set_add(node, seen);
                while (NIL == queues.queue_empty_p(todo)) {
                    current = NIL;
                    super_nodes = NIL;
                    current = queues.dequeue(todo);
                    map_utilities.map_increment(estimates_map, current, delta);
                    super_nodes = map_utilities.map_get(graph_map, current, UNPROVIDED);
                    if (NIL == super_nodes) {
                        if (NIL == set.set_memberP(current, key_set)) {
                            set.set_add(current, implied_roots);
                        }
                    } else
                        if (!super_nodes.isCons()) {
                            rplaca(singleton, super_nodes);
                            super_nodes = singleton;
                        }

                    cdolist_list_var = super_nodes;
                    child = NIL;
                    child = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL == set.set_memberP(child, seen)) {
                            set.set_add(child, seen);
                            queues.enqueue(child, todo);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        child = cdolist_list_var.first();
                    } 
                } 
            }
        }
        set_contents_var = set.do_set_internal(implied_roots);
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            node = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, node)) {
                delta = ONE_INTEGER;
                if (NIL != map_utilities.map_p(leaf_deltas)) {
                    delta = map_utilities.map_get(leaf_deltas, node, delta);
                }
                map_utilities.map_increment(estimates_map, node, delta);
            }
        }
        return estimates_map;
    }

    public static final SubLObject test_compute_graph_rank_estimate_alt(SubLObject graph_alist, SubLObject expected_estimate_alist, SubLObject leaf_delta_alist) {
        if (leaf_delta_alist == UNPROVIDED) {
            leaf_delta_alist = NIL;
        }
        {
            SubLObject v_graph = dictionary_utilities.new_dictionary_from_alist(graph_alist, UNPROVIDED);
            SubLObject expected_estimate = dictionary_utilities.new_dictionary_from_alist(expected_estimate_alist, UNPROVIDED);
            SubLObject leaf_deltas = (NIL != list_utilities.alist_p(leaf_delta_alist)) ? ((SubLObject) (dictionary_utilities.new_dictionary_from_alist(leaf_delta_alist, UNPROVIDED))) : NIL;
            SubLObject estimates = com.cyc.cycjava.cycl.graph_utilities.compute_graph_rank_estimate(v_graph, NIL, leaf_deltas);
            return com.cyc.cycjava.cycl.graph_utilities.graph_rank_estimates_equalP(expected_estimate, estimates);
        }
    }

    public static SubLObject test_compute_graph_rank_estimate(final SubLObject graph_alist, final SubLObject expected_estimate_alist, SubLObject leaf_delta_alist) {
        if (leaf_delta_alist == UNPROVIDED) {
            leaf_delta_alist = NIL;
        }
        final SubLObject v_graph = dictionary_utilities.new_dictionary_from_alist(graph_alist, UNPROVIDED);
        final SubLObject expected_estimate = dictionary_utilities.new_dictionary_from_alist(expected_estimate_alist, UNPROVIDED);
        final SubLObject leaf_deltas = (NIL != list_utilities.alist_p(leaf_delta_alist)) ? dictionary_utilities.new_dictionary_from_alist(leaf_delta_alist, UNPROVIDED) : NIL;
        final SubLObject estimates = compute_graph_rank_estimate(v_graph, NIL, leaf_deltas);
        return graph_rank_estimates_equalP(expected_estimate, estimates);
    }

    public static final SubLObject graph_rank_estimates_equalP_alt(SubLObject expected_estimate, SubLObject estimates) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!map_utilities.map_size(expected_estimate).numE(map_utilities.map_size(estimates))) {
                Errors.error($str_alt37$The_expected_map_size__A_differs_, map_utilities.map_size(expected_estimate), map_utilities.map_size(estimates));
            }
            {
                SubLObject iterator = map_utilities.new_map_iterator(expected_estimate);
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
                                SubLObject node = NIL;
                                SubLObject expected_value = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt38);
                                node = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt38);
                                expected_value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject actual_value = map_utilities.map_get(estimates, node, UNPROVIDED);
                                        if (!expected_value.numE(actual_value)) {
                                            print(dictionary_utilities.dictionary_to_alist(estimates), UNPROVIDED);
                                            Errors.error($str_alt39$Expected_rank_estimate__A_for__A_, expected_value, node, actual_value);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt38);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
            }
            return $SUCCESS;
        }
    }

    public static SubLObject graph_rank_estimates_equalP(final SubLObject expected_estimate, final SubLObject estimates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!map_utilities.map_size(expected_estimate).numE(map_utilities.map_size(estimates))) {
            Errors.error($str36$The_expected_map_size__A_differs_, map_utilities.map_size(expected_estimate), map_utilities.map_size(estimates));
        }
        final SubLObject iterator = map_utilities.new_map_iterator(expected_estimate);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = NIL;
                SubLObject expected_value = NIL;
                destructuring_bind_must_consp(current, datum, $list37);
                node = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list37);
                expected_value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject actual_value = map_utilities.map_get(estimates, node, UNPROVIDED);
                    if (!expected_value.numE(actual_value)) {
                        print(dictionary_utilities.dictionary_to_alist(estimates), UNPROVIDED);
                        Errors.error($str38$Expected_rank_estimate__A_for__A_, expected_value, node, actual_value);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list37);
                }
            }
        }
        return $SUCCESS;
    }

    /**
     * Build up a set of leafs in a DAF by removing from the key set all
     * of the nodes that occur in the values.
     *
     * @return SET-P LEAF-SET
     */
    @LispMethod(comment = "Build up a set of leafs in a DAF by removing from the key set all\r\nof the nodes that occur in the values.\r\n\r\n@return SET-P LEAF-SET\nBuild up a set of leafs in a DAF by removing from the key set all\nof the nodes that occur in the values.")
    public static final SubLObject dag_identify_leafs_alt(SubLObject graph_map, SubLObject leaf_set) {
        if (leaf_set == UNPROVIDED) {
            leaf_set = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(graph_map, MAP_P);
            if (NIL == set.set_p(leaf_set)) {
                leaf_set = set.new_set(map_utilities.map_test(graph_map), UNPROVIDED);
            }
            set.clear_set(leaf_set);
            set_utilities.set_add_all(map_utilities.map_keys(graph_map), leaf_set);
            {
                SubLObject singleton = list(NIL);
                SubLObject iterator = map_utilities.new_map_iterator(graph_map);
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
                                SubLObject node = NIL;
                                SubLObject super_nodes = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt42);
                                node = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt42);
                                super_nodes = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != super_nodes) {
                                        if (!super_nodes.isCons()) {
                                            rplaca(singleton, super_nodes);
                                            super_nodes = singleton;
                                        }
                                        {
                                            SubLObject cdolist_list_var = super_nodes;
                                            SubLObject super_node = NIL;
                                            for (super_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , super_node = cdolist_list_var.first()) {
                                                set.set_remove(super_node, leaf_set);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt42);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
            }
            return leaf_set;
        }
    }

    @LispMethod(comment = "Build up a set of leafs in a DAF by removing from the key set all\r\nof the nodes that occur in the values.\r\n\r\n@return SET-P LEAF-SET\nBuild up a set of leafs in a DAF by removing from the key set all\nof the nodes that occur in the values.")
    public static SubLObject dag_identify_leafs(final SubLObject graph_map, SubLObject leaf_set) {
        if (leaf_set == UNPROVIDED) {
            leaf_set = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != map_utilities.map_p(graph_map) : "! map_utilities.map_p(graph_map) " + ("map_utilities.map_p(graph_map) " + "CommonSymbols.NIL != map_utilities.map_p(graph_map) ") + graph_map;
        if (NIL == set.set_p(leaf_set)) {
            leaf_set = set.new_set(map_utilities.map_test(graph_map), UNPROVIDED);
        }
        set.clear_set(leaf_set);
        set_utilities.set_add_all(map_utilities.map_keys(graph_map), leaf_set);
        final SubLObject singleton = list(NIL);
        final SubLObject iterator = map_utilities.new_map_iterator(graph_map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = NIL;
                SubLObject super_nodes = NIL;
                destructuring_bind_must_consp(current, datum, $list41);
                node = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list41);
                super_nodes = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != super_nodes) {
                        if (!super_nodes.isCons()) {
                            rplaca(singleton, super_nodes);
                            super_nodes = singleton;
                        }
                        SubLObject cdolist_list_var = super_nodes;
                        SubLObject super_node = NIL;
                        super_node = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            set.set_remove(super_node, leaf_set);
                            cdolist_list_var = cdolist_list_var.rest();
                            super_node = cdolist_list_var.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum, $list41);
                }
            }
        }
        return leaf_set;
    }

    /**
     * Convert the ALIST representation of the graph into a map, then
     * determine the leaf set, and compare it to the leaf-list provided.
     */
    @LispMethod(comment = "Convert the ALIST representation of the graph into a map, then\r\ndetermine the leaf set, and compare it to the leaf-list provided.\nConvert the ALIST representation of the graph into a map, then\ndetermine the leaf set, and compare it to the leaf-list provided.")
    public static final SubLObject test_dag_identify_leafs_alt(SubLObject graph_alist, SubLObject leaf_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject graph_map = dictionary_utilities.new_dictionary_from_alist(graph_alist, UNPROVIDED);
                SubLObject expected_leaf_set = set_utilities.construct_set_from_list(leaf_list, UNPROVIDED, UNPROVIDED);
                SubLObject leaf_set = com.cyc.cycjava.cycl.graph_utilities.dag_identify_leafs(graph_map, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!set.set_size(expected_leaf_set).numE(set.set_size(leaf_set))) {
                        Errors.error($str_alt45$Expected__A_leafs__got__A_leafs_i, set.set_size(expected_leaf_set), set.set_size(leaf_set));
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == set_utilities.sets_coextensionalP(leaf_set, expected_leaf_set)) {
                        Errors.error($str_alt46$The_expected_leaf_set__A_differs_, set.set_element_list(expected_leaf_set), set.set_element_list(leaf_set));
                    }
                }
            }
            return $SUCCESS;
        }
    }

    /**
     * Convert the ALIST representation of the graph into a map, then
     * determine the leaf set, and compare it to the leaf-list provided.
     */
    @LispMethod(comment = "Convert the ALIST representation of the graph into a map, then\r\ndetermine the leaf set, and compare it to the leaf-list provided.\nConvert the ALIST representation of the graph into a map, then\ndetermine the leaf set, and compare it to the leaf-list provided.")
    public static SubLObject test_dag_identify_leafs(final SubLObject graph_alist, final SubLObject leaf_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject graph_map = dictionary_utilities.new_dictionary_from_alist(graph_alist, UNPROVIDED);
        final SubLObject expected_leaf_set = set_utilities.construct_set_from_list(leaf_list, UNPROVIDED, UNPROVIDED);
        final SubLObject leaf_set = dag_identify_leafs(graph_map, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!set.set_size(expected_leaf_set).numE(set.set_size(leaf_set)))) {
            Errors.error($str44$Expected__A_leafs__got__A_leafs_i, set.set_size(expected_leaf_set), set.set_size(leaf_set));
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == set_utilities.sets_coextensionalP(leaf_set, expected_leaf_set))) {
            Errors.error($str45$The_expected_leaf_set__A_differs_, set.set_element_list(expected_leaf_set), set.set_element_list(leaf_set));
        }
        return $SUCCESS;
    }

    /**
     * Identify those nodes in the graph that are pointed to by other
     * nodes, but do not point to any nodes themselves.
     * In terms of the map representation of a graph, this is the
     * set of nodes that occur in the MAP-VALUES but not in the
     * MAP-KEYS (or have a value of NIL).
     * Notice that if the graph has a loop at the top, there may be
     * no root set in the sense of this definition.
     *
     * @return SET-P ROOT-SET
     */
    @LispMethod(comment = "Identify those nodes in the graph that are pointed to by other\r\nnodes, but do not point to any nodes themselves.\r\nIn terms of the map representation of a graph, this is the\r\nset of nodes that occur in the MAP-VALUES but not in the\r\nMAP-KEYS (or have a value of NIL).\r\nNotice that if the graph has a loop at the top, there may be\r\nno root set in the sense of this definition.\r\n\r\n@return SET-P ROOT-SET\nIdentify those nodes in the graph that are pointed to by other\nnodes, but do not point to any nodes themselves.\nIn terms of the map representation of a graph, this is the\nset of nodes that occur in the MAP-VALUES but not in the\nMAP-KEYS (or have a value of NIL).\nNotice that if the graph has a loop at the top, there may be\nno root set in the sense of this definition.")
    public static final SubLObject dag_identify_roots_alt(SubLObject graph_map, SubLObject root_set) {
        if (root_set == UNPROVIDED) {
            root_set = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == set.set_p(root_set)) {
                root_set = set.new_set(map_utilities.map_test(graph_map), map_utilities.map_size(graph_map));
            }
            set.clear_set(root_set);
            {
                SubLObject singleton = list(NIL);
                SubLObject nodes = NIL;
                SubLObject iterator = map_utilities.new_map_iterator(graph_map);
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
                                SubLObject node = NIL;
                                SubLObject super_nodes = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt42);
                                node = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt42);
                                super_nodes = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != super_nodes) {
                                        nodes = cons(node, nodes);
                                        if (!super_nodes.isCons()) {
                                            rplaca(singleton, super_nodes);
                                            super_nodes = singleton;
                                        }
                                        {
                                            SubLObject cdolist_list_var = super_nodes;
                                            SubLObject super_node = NIL;
                                            for (super_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , super_node = cdolist_list_var.first()) {
                                                set.set_add(super_node, root_set);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt42);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
                set_utilities.set_remove_all(nodes, root_set);
            }
            return root_set;
        }
    }

    /**
     * Identify those nodes in the graph that are pointed to by other
     * nodes, but do not point to any nodes themselves.
     * In terms of the map representation of a graph, this is the
     * set of nodes that occur in the MAP-VALUES but not in the
     * MAP-KEYS (or have a value of NIL).
     * Notice that if the graph has a loop at the top, there may be
     * no root set in the sense of this definition.
     *
     * @return SET-P ROOT-SET
     */
    @LispMethod(comment = "Identify those nodes in the graph that are pointed to by other\r\nnodes, but do not point to any nodes themselves.\r\nIn terms of the map representation of a graph, this is the\r\nset of nodes that occur in the MAP-VALUES but not in the\r\nMAP-KEYS (or have a value of NIL).\r\nNotice that if the graph has a loop at the top, there may be\r\nno root set in the sense of this definition.\r\n\r\n@return SET-P ROOT-SET\nIdentify those nodes in the graph that are pointed to by other\nnodes, but do not point to any nodes themselves.\nIn terms of the map representation of a graph, this is the\nset of nodes that occur in the MAP-VALUES but not in the\nMAP-KEYS (or have a value of NIL).\nNotice that if the graph has a loop at the top, there may be\nno root set in the sense of this definition.")
    public static SubLObject dag_identify_roots(final SubLObject graph_map, SubLObject root_set) {
        if (root_set == UNPROVIDED) {
            root_set = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == set.set_p(root_set)) {
            root_set = set.new_set(map_utilities.map_test(graph_map), map_utilities.map_size(graph_map));
        }
        set.clear_set(root_set);
        final SubLObject singleton = list(NIL);
        SubLObject nodes = NIL;
        final SubLObject iterator = map_utilities.new_map_iterator(graph_map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = NIL;
                SubLObject super_nodes = NIL;
                destructuring_bind_must_consp(current, datum, $list41);
                node = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list41);
                super_nodes = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != super_nodes) {
                        nodes = cons(node, nodes);
                        if (!super_nodes.isCons()) {
                            rplaca(singleton, super_nodes);
                            super_nodes = singleton;
                        }
                        SubLObject cdolist_list_var = super_nodes;
                        SubLObject super_node = NIL;
                        super_node = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            set.set_add(super_node, root_set);
                            cdolist_list_var = cdolist_list_var.rest();
                            super_node = cdolist_list_var.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum, $list41);
                }
            }
        }
        set_utilities.set_remove_all(nodes, root_set);
        return root_set;
    }

    /**
     * Convert the ALIST representation of the graph into a map, then
     * determine the roots set, and compare it to the root-list provided.
     */
    @LispMethod(comment = "Convert the ALIST representation of the graph into a map, then\r\ndetermine the roots set, and compare it to the root-list provided.\nConvert the ALIST representation of the graph into a map, then\ndetermine the roots set, and compare it to the root-list provided.")
    public static final SubLObject test_dag_identify_roots_alt(SubLObject graph_alist, SubLObject root_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject graph_map = dictionary_utilities.new_dictionary_from_alist(graph_alist, UNPROVIDED);
                SubLObject expected_root_set = set_utilities.construct_set_from_list(root_list, UNPROVIDED, UNPROVIDED);
                SubLObject root_set = com.cyc.cycjava.cycl.graph_utilities.dag_identify_roots(graph_map, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!set.set_size(expected_root_set).numE(set.set_size(root_set))) {
                        Errors.error($str_alt49$Expected__A_roots__got__A_roots_i, set.set_size(expected_root_set), set.set_size(root_set));
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == set_utilities.sets_coextensionalP(root_set, expected_root_set)) {
                        Errors.error($str_alt50$The_expected_roots_set__A_differs, set.set_element_list(expected_root_set), set.set_element_list(root_set));
                    }
                }
            }
            return $SUCCESS;
        }
    }

    @LispMethod(comment = "Convert the ALIST representation of the graph into a map, then\r\ndetermine the roots set, and compare it to the root-list provided.\nConvert the ALIST representation of the graph into a map, then\ndetermine the roots set, and compare it to the root-list provided.")
    public static SubLObject test_dag_identify_roots(final SubLObject graph_alist, final SubLObject root_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject graph_map = dictionary_utilities.new_dictionary_from_alist(graph_alist, UNPROVIDED);
        final SubLObject expected_root_set = set_utilities.construct_set_from_list(root_list, UNPROVIDED, UNPROVIDED);
        final SubLObject root_set = dag_identify_roots(graph_map, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!set.set_size(expected_root_set).numE(set.set_size(root_set)))) {
            Errors.error($str48$Expected__A_roots__got__A_roots_i, set.set_size(expected_root_set), set.set_size(root_set));
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == set_utilities.sets_coextensionalP(root_set, expected_root_set))) {
            Errors.error($str49$The_expected_roots_set__A_differs, set.set_element_list(expected_root_set), set.set_element_list(root_set));
        }
        return $SUCCESS;
    }/**
     * Convert the ALIST representation of the graph into a map, then
     * determine the roots set, and compare it to the root-list provided.
     */


    /**
     * Walk the DAG and note all of the nodes reachable from the
     * start-node.
     *
     * @return SET-P the transitive upward closure from the start node.
     */
    @LispMethod(comment = "Walk the DAG and note all of the nodes reachable from the\r\nstart-node.\r\n\r\n@return SET-P the transitive upward closure from the start node.\nWalk the DAG and note all of the nodes reachable from the\nstart-node.")
    public static final SubLObject dag_transitive_upward_closure_alt(SubLObject graph_map, SubLObject start_node) {
        {
            SubLObject closure = set.new_set(UNPROVIDED, UNPROVIDED);
            SubLObject seen = set.new_set(EQL, UNPROVIDED);
            SubLObject todo = queues.create_queue();
            queues.enqueue(start_node, todo);
            set.set_add(start_node, seen);
            while (NIL == queues.queue_empty_p(todo)) {
                {
                    SubLObject current = NIL;
                    SubLObject super_nodes = NIL;
                    current = queues.dequeue(todo);
                    super_nodes = map_utilities.map_get(graph_map, current, UNPROVIDED);
                    set_utilities.set_add_all(super_nodes, closure);
                    {
                        SubLObject cdolist_list_var = super_nodes;
                        SubLObject child = NIL;
                        for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                            if (NIL == set.set_memberP(child, seen)) {
                                set.set_add(child, seen);
                                queues.enqueue(child, todo);
                            }
                        }
                    }
                }
            } 
            return closure;
        }
    }

    @LispMethod(comment = "Walk the DAG and note all of the nodes reachable from the\r\nstart-node.\r\n\r\n@return SET-P the transitive upward closure from the start node.\nWalk the DAG and note all of the nodes reachable from the\nstart-node.")
    public static SubLObject dag_transitive_upward_closure(final SubLObject graph_map, final SubLObject start_node) {
        final SubLObject closure = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject seen = set.new_set(EQL, UNPROVIDED);
        final SubLObject todo = queues.create_queue(UNPROVIDED);
        queues.enqueue(start_node, todo);
        set.set_add(start_node, seen);
        while (NIL == queues.queue_empty_p(todo)) {
            SubLObject current = NIL;
            SubLObject super_nodes = NIL;
            current = queues.dequeue(todo);
            super_nodes = map_utilities.map_get(graph_map, current, UNPROVIDED);
            set_utilities.set_add_all(super_nodes, closure);
            SubLObject cdolist_list_var = super_nodes;
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == set.set_memberP(child, seen)) {
                    set.set_add(child, seen);
                    queues.enqueue(child, todo);
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
        } 
        return closure;
    }/**
     * Walk the DAG and note all of the nodes reachable from the
     * start-node.
     *
     * @return SET-P the transitive upward closure from the start node.
     */


    /**
     * Given a DAG stored as a MAP, and a list of NODES to delete,
     * walk the DAG upwards from the leafs, deleting members of the
     * node set
     *
     * @param GRAPH-MAP
     * 		MAP-P the graph to work from
     * @param DELETE-SET
     * 		LISTP or SETP the nodes to delete
     * @param USE-SINGLETONS?
     * 		controls output map format; if T, then links to
     * 		individual nodes are still encoded as lists: A -> (B); if NIL
     * 		links to individual nodes link to the nodes directly: A -> B
     * @param PRUNED-GRAPH-MAP;
     * 		if none is provided, it is created from graph-map
     * @return PRUNED-GRAPH-MAP
     */
    @LispMethod(comment = "Given a DAG stored as a MAP, and a list of NODES to delete,\r\nwalk the DAG upwards from the leafs, deleting members of the\r\nnode set\r\n\r\n@param GRAPH-MAP\r\n\t\tMAP-P the graph to work from\r\n@param DELETE-SET\r\n\t\tLISTP or SETP the nodes to delete\r\n@param USE-SINGLETONS?\r\n\t\tcontrols output map format; if T, then links to\r\n\t\tindividual nodes are still encoded as lists: A -> (B); if NIL\r\n\t\tlinks to individual nodes link to the nodes directly: A -> B\r\n@param PRUNED-GRAPH-MAP;\r\n\t\tif none is provided, it is created from graph-map\r\n@return PRUNED-GRAPH-MAP\nGiven a DAG stored as a MAP, and a list of NODES to delete,\nwalk the DAG upwards from the leafs, deleting members of the\nnode set")
    public static final SubLObject dag_elide_from_graph_alt(SubLObject graph_map, SubLObject delete_set, SubLObject use_singletonsP, SubLObject pruned_graph_map) {
        if (use_singletonsP == UNPROVIDED) {
            use_singletonsP = NIL;
        }
        if (pruned_graph_map == UNPROVIDED) {
            pruned_graph_map = NIL;
        }
        if (NIL == map_utilities.map_p(pruned_graph_map)) {
            pruned_graph_map = map_utilities.new_map_with_same_properties(graph_map);
        }
        if (NIL == delete_set) {
            map_utilities.copy_map(graph_map, pruned_graph_map, UNPROVIDED);
            return pruned_graph_map;
        }
        if (NIL == set.set_p(delete_set)) {
            SubLTrampolineFile.checkType(delete_set, CONSP);
            delete_set = set_utilities.construct_set_from_list(delete_set, UNPROVIDED, UNPROVIDED);
        }
        return com.cyc.cycjava.cycl.graph_utilities.dag_elide_from_graph_internal(graph_map, delete_set, pruned_graph_map, use_singletonsP);
    }

    @LispMethod(comment = "Given a DAG stored as a MAP, and a list of NODES to delete,\r\nwalk the DAG upwards from the leafs, deleting members of the\r\nnode set\r\n\r\n@param GRAPH-MAP\r\n\t\tMAP-P the graph to work from\r\n@param DELETE-SET\r\n\t\tLISTP or SETP the nodes to delete\r\n@param USE-SINGLETONS?\r\n\t\tcontrols output map format; if T, then links to\r\n\t\tindividual nodes are still encoded as lists: A -> (B); if NIL\r\n\t\tlinks to individual nodes link to the nodes directly: A -> B\r\n@param PRUNED-GRAPH-MAP;\r\n\t\tif none is provided, it is created from graph-map\r\n@return PRUNED-GRAPH-MAP\nGiven a DAG stored as a MAP, and a list of NODES to delete,\nwalk the DAG upwards from the leafs, deleting members of the\nnode set")
    public static SubLObject dag_elide_from_graph(final SubLObject graph_map, SubLObject delete_set, SubLObject use_singletonsP, SubLObject pruned_graph_map) {
        if (use_singletonsP == UNPROVIDED) {
            use_singletonsP = NIL;
        }
        if (pruned_graph_map == UNPROVIDED) {
            pruned_graph_map = NIL;
        }
        if (NIL == map_utilities.map_p(pruned_graph_map)) {
            pruned_graph_map = map_utilities.new_map_with_same_properties(graph_map);
        }
        if (NIL == delete_set) {
            map_utilities.copy_map(graph_map, pruned_graph_map, UNPROVIDED);
            return pruned_graph_map;
        }
        if (NIL == set.set_p(delete_set)) {
            assert NIL != consp(delete_set) : "! consp(delete_set) " + ("Types.consp(delete_set) " + "CommonSymbols.NIL != Types.consp(delete_set) ") + delete_set;
            delete_set = set_utilities.construct_set_from_list(delete_set, UNPROVIDED, UNPROVIDED);
        }
        return dag_elide_from_graph_internal(graph_map, delete_set, pruned_graph_map, use_singletonsP);
    }/**
     * Given a DAG stored as a MAP, and a list of NODES to delete,
     * walk the DAG upwards from the leafs, deleting members of the
     * node set
     *
     * @param GRAPH-MAP
     * 		MAP-P the graph to work from
     * @param DELETE-SET
     * 		LISTP or SETP the nodes to delete
     * @param USE-SINGLETONS?
     * 		controls output map format; if T, then links to
     * 		individual nodes are still encoded as lists: A -> (B); if NIL
     * 		links to individual nodes link to the nodes directly: A -> B
     * @param PRUNED-GRAPH-MAP;
     * 		if none is provided, it is created from graph-map
     * @return PRUNED-GRAPH-MAP
     */


    /**
     * This is a brute force method, that need not come up with the simplest graph.
     * We simply substitute the direct superiors for the nodes to delete in the link
     * list, then remove any duplicates before we are done.
     * The graph representation handles both singletons or not, but will produce
     * singletons for all output if any singleton is detected.
     */
    @LispMethod(comment = "This is a brute force method, that need not come up with the simplest graph.\r\nWe simply substitute the direct superiors for the nodes to delete in the link\r\nlist, then remove any duplicates before we are done.\r\nThe graph representation handles both singletons or not, but will produce\r\nsingletons for all output if any singleton is detected.\nThis is a brute force method, that need not come up with the simplest graph.\nWe simply substitute the direct superiors for the nodes to delete in the link\nlist, then remove any duplicates before we are done.\nThe graph representation handles both singletons or not, but will produce\nsingletons for all output if any singleton is detected.")
    public static final SubLObject dag_elide_from_graph_internal_alt(SubLObject graph_map, SubLObject delete_set, SubLObject pruned_graph_map, SubLObject use_singletonsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject to_consider = queues.create_queue();
                SubLObject clean_superiors = set.new_set(UNPROVIDED, UNPROVIDED);
                SubLObject worked_on = set.new_set(UNPROVIDED, UNPROVIDED);
                SubLObject iterator = map_utilities.new_map_iterator(graph_map);
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
                                SubLObject node = NIL;
                                SubLObject superior = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt52);
                                node = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt52);
                                superior = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL == set.set_memberP(node, delete_set)) {
                                        queues.clear_queue(to_consider);
                                        set.clear_set(clean_superiors);
                                        set.clear_set(worked_on);
                                        if (superior.isCons()) {
                                            queues.enqueue_all(superior, to_consider);
                                        } else {
                                            queues.enqueue(superior, to_consider);
                                        }
                                        while (NIL == queues.queue_empty_p(to_consider)) {
                                            {
                                                SubLObject curr = queues.dequeue(to_consider);
                                                set.set_add(curr, worked_on);
                                                if (NIL == set.set_memberP(curr, clean_superiors)) {
                                                    if (NIL != set.set_memberP(curr, delete_set)) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject next_level_up = map_utilities.map_get(graph_map, curr, UNPROVIDED);
                                                            SubLObject presentP = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if ((NIL == presentP) || (NIL == next_level_up)) {
                                                            } else {
                                                                if (next_level_up.isCons()) {
                                                                    {
                                                                        SubLObject cdolist_list_var = next_level_up;
                                                                        SubLObject next = NIL;
                                                                        for (next = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , next = cdolist_list_var.first()) {
                                                                            if (NIL == set.set_memberP(next, worked_on)) {
                                                                                queues.enqueue(next, to_consider);
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (NIL == set.set_memberP(next_level_up, worked_on)) {
                                                                        queues.enqueue(next_level_up, to_consider);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        set.set_add(curr, clean_superiors);
                                                    }
                                                }
                                            }
                                        } 
                                        if (NIL == set.set_emptyP(clean_superiors)) {
                                            {
                                                SubLObject next_level = set.set_element_list(clean_superiors);
                                                if (NIL != list_utilities.singletonP(next_level)) {
                                                    if (NIL == use_singletonsP) {
                                                        next_level = next_level.first();
                                                    }
                                                }
                                                map_utilities.map_put(pruned_graph_map, node, next_level);
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
                return pruned_graph_map;
            }
        }
    }

    /**
     * This is a brute force method, that need not come up with the simplest graph.
     * We simply substitute the direct superiors for the nodes to delete in the link
     * list, then remove any duplicates before we are done.
     * The graph representation handles both singletons or not, but will produce
     * singletons for all output if any singleton is detected.
     */
    @LispMethod(comment = "This is a brute force method, that need not come up with the simplest graph.\r\nWe simply substitute the direct superiors for the nodes to delete in the link\r\nlist, then remove any duplicates before we are done.\r\nThe graph representation handles both singletons or not, but will produce\r\nsingletons for all output if any singleton is detected.\nThis is a brute force method, that need not come up with the simplest graph.\nWe simply substitute the direct superiors for the nodes to delete in the link\nlist, then remove any duplicates before we are done.\nThe graph representation handles both singletons or not, but will produce\nsingletons for all output if any singleton is detected.")
    public static SubLObject dag_elide_from_graph_internal(final SubLObject graph_map, final SubLObject delete_set, final SubLObject pruned_graph_map, final SubLObject use_singletonsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject to_consider = queues.create_queue(UNPROVIDED);
        final SubLObject clean_superiors = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject worked_on = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject iterator = map_utilities.new_map_iterator(graph_map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = NIL;
                SubLObject superior = NIL;
                destructuring_bind_must_consp(current, datum, $list51);
                node = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list51);
                superior = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == set.set_memberP(node, delete_set)) {
                        queues.clear_queue(to_consider);
                        set.clear_set(clean_superiors);
                        set.clear_set(worked_on);
                        if (superior.isCons()) {
                            queues.enqueue_all(superior, to_consider);
                        } else {
                            queues.enqueue(superior, to_consider);
                        }
                        while (NIL == queues.queue_empty_p(to_consider)) {
                            final SubLObject curr = queues.dequeue(to_consider);
                            set.set_add(curr, worked_on);
                            if (NIL == set.set_memberP(curr, clean_superiors)) {
                                if (NIL != set.set_memberP(curr, delete_set)) {
                                    thread.resetMultipleValues();
                                    final SubLObject next_level_up = map_utilities.map_get(graph_map, curr, UNPROVIDED);
                                    final SubLObject presentP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == presentP) {
                                        continue;
                                    }
                                    if (NIL == next_level_up) {
                                        continue;
                                    }
                                    if (next_level_up.isCons()) {
                                        SubLObject cdolist_list_var = next_level_up;
                                        SubLObject next = NIL;
                                        next = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            if (NIL == set.set_memberP(next, worked_on)) {
                                                queues.enqueue(next, to_consider);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            next = cdolist_list_var.first();
                                        } 
                                    } else {
                                        if (NIL != set.set_memberP(next_level_up, worked_on)) {
                                            continue;
                                        }
                                        queues.enqueue(next_level_up, to_consider);
                                    }
                                } else {
                                    set.set_add(curr, clean_superiors);
                                }
                            }
                        } 
                        if (NIL == set.set_emptyP(clean_superiors)) {
                            SubLObject next_level = set.set_element_list(clean_superiors);
                            if ((NIL != list_utilities.singletonP(next_level)) && (NIL == use_singletonsP)) {
                                next_level = next_level.first();
                            }
                            map_utilities.map_put(pruned_graph_map, node, next_level);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list51);
                }
            }
        }
        return pruned_graph_map;
    }

    public static final SubLObject test_dag_elide_from_graph_alt(SubLObject graph_alist, SubLObject delete_list, SubLObject expected_graph_alist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject graph_map = dictionary_utilities.new_dictionary_from_alist(graph_alist, UNPROVIDED);
                SubLObject delete_set = set_utilities.construct_set_from_list(delete_list, UNPROVIDED, UNPROVIDED);
                SubLObject expected_graph_map = dictionary_utilities.new_dictionary_from_alist(expected_graph_alist, UNPROVIDED);
                SubLObject pruned_graph_map = com.cyc.cycjava.cycl.graph_utilities.dag_elide_from_graph(graph_map, delete_set, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!map_utilities.map_size(pruned_graph_map).numE(map_utilities.map_size(expected_graph_map))) {
                        Errors.error($str_alt55$_A_is_not_of_the_expected_size__A, dictionary_utilities.dictionary_to_alist(pruned_graph_map), map_utilities.map_size(expected_graph_map), dictionary_utilities.dictionary_to_alist(expected_graph_map));
                    }
                }
                {
                    SubLObject iterator = map_utilities.new_map_iterator(expected_graph_map);
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
                                    SubLObject node = NIL;
                                    SubLObject superiors = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt56);
                                    node = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt56);
                                    superiors = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (NIL == map_utilities.map_has_keyP(pruned_graph_map, node)) {
                                                Errors.error($str_alt57$_A_does_not_contain_the_expected_, dictionary_utilities.dictionary_to_alist(pruned_graph_map), node, superiors);
                                            }
                                        }
                                        {
                                            SubLObject pruned_superiors = map_utilities.map_get(pruned_graph_map, node, UNPROVIDED);
                                            if (superiors.isCons()) {
                                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                    if (!((pruned_superiors.isCons() && (NIL != list_utilities.lengthE(pruned_superiors, length(superiors), UNPROVIDED))) && (NIL != set_utilities.sets_coextensionalP(set_utilities.construct_set_from_list(superiors, UNPROVIDED, UNPROVIDED), set_utilities.construct_set_from_list(pruned_superiors, UNPROVIDED, UNPROVIDED))))) {
                                                        Errors.error($str_alt58$The_superiors_for_node__A_are__A_, node, pruned_superiors, superiors);
                                                    }
                                                }
                                            } else {
                                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                    if (!superiors.equal(pruned_superiors)) {
                                                        Errors.error($str_alt59$The_superior_for_node__A_is__A__n, node, pruned_superiors, superiors);
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
            }
            return $SUCCESS;
        }
    }

    public static SubLObject test_dag_elide_from_graph(final SubLObject graph_alist, final SubLObject delete_list, final SubLObject expected_graph_alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject graph_map = dictionary_utilities.new_dictionary_from_alist(graph_alist, UNPROVIDED);
        final SubLObject delete_set = set_utilities.construct_set_from_list(delete_list, UNPROVIDED, UNPROVIDED);
        final SubLObject expected_graph_map = dictionary_utilities.new_dictionary_from_alist(expected_graph_alist, UNPROVIDED);
        final SubLObject pruned_graph_map = dag_elide_from_graph(graph_map, delete_set, UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!map_utilities.map_size(pruned_graph_map).numE(map_utilities.map_size(expected_graph_map)))) {
            Errors.error($str54$_A_is_not_of_the_expected_size__A, dictionary_utilities.dictionary_to_alist(pruned_graph_map), map_utilities.map_size(expected_graph_map), dictionary_utilities.dictionary_to_alist(expected_graph_map));
        }
        final SubLObject iterator = map_utilities.new_map_iterator(expected_graph_map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = NIL;
                SubLObject superiors = NIL;
                destructuring_bind_must_consp(current, datum, $list55);
                node = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list55);
                superiors = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == map_utilities.map_has_keyP(pruned_graph_map, node))) {
                        Errors.error($str56$_A_does_not_contain_the_expected_, dictionary_utilities.dictionary_to_alist(pruned_graph_map), node, superiors);
                    }
                    final SubLObject pruned_superiors = map_utilities.map_get(pruned_graph_map, node, UNPROVIDED);
                    if (superiors.isCons()) {
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (((!pruned_superiors.isCons()) || (NIL == list_utilities.lengthE(pruned_superiors, length(superiors), UNPROVIDED))) || (NIL == set_utilities.sets_coextensionalP(set_utilities.construct_set_from_list(superiors, UNPROVIDED, UNPROVIDED), set_utilities.construct_set_from_list(pruned_superiors, UNPROVIDED, UNPROVIDED))))) {
                            Errors.error($str57$The_superiors_for_node__A_are__A_, node, pruned_superiors, superiors);
                        }
                    } else
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!superiors.equal(pruned_superiors))) {
                            Errors.error($str58$The_superior_for_node__A_is__A__n, node, pruned_superiors, superiors);
                        }

                } else {
                    cdestructuring_bind_error(datum, $list55);
                }
            }
        }
        return $SUCCESS;
    }

    public static SubLObject declare_graph_utilities_file() {
        declareFunction("categorize_nodes_via_links", "CATEGORIZE-NODES-VIA-LINKS", 2, 1, false);
        declareFunction("extract_link_nodes", "EXTRACT-LINK-NODES", 2, 1, false);
        declareFunction("extract_link_nodes_int", "EXTRACT-LINK-NODES-INT", 1, 0, false);
        new graph_utilities.$extract_link_nodes_int$UnaryFunction();
        declareFunction("extract_island_groups", "EXTRACT-ISLAND-GROUPS", 2, 1, false);
        declareFunction("island_group_for_node", "ISLAND-GROUP-FOR-NODE", 2, 1, false);
        declareFunction("merge_island_groups", "MERGE-ISLAND-GROUPS", 1, 0, false);
        declareFunction("sort_connected_groups", "SORT-CONNECTED-GROUPS", 3, 1, false);
        declareFunction("length_first", "LENGTH-FIRST", 1, 0, false);
        new graph_utilities.$length_first$UnaryFunction();
        declareFunction("sort_isolated_groups", "SORT-ISOLATED-GROUPS", 3, 1, false);
        declareFunction("sort_naked_groups", "SORT-NAKED-GROUPS", 2, 1, false);
        declareMacro("walk_graph_breadth_first", "WALK-GRAPH-BREADTH-FIRST");
        declareFunction("compute_graph_rank_estimate", "COMPUTE-GRAPH-RANK-ESTIMATE", 1, 2, false);
        declareFunction("test_compute_graph_rank_estimate", "TEST-COMPUTE-GRAPH-RANK-ESTIMATE", 2, 1, false);
        declareFunction("graph_rank_estimates_equalP", "GRAPH-RANK-ESTIMATES-EQUAL?", 2, 0, false);
        declareFunction("dag_identify_leafs", "DAG-IDENTIFY-LEAFS", 1, 1, false);
        declareFunction("test_dag_identify_leafs", "TEST-DAG-IDENTIFY-LEAFS", 2, 0, false);
        declareFunction("dag_identify_roots", "DAG-IDENTIFY-ROOTS", 1, 1, false);
        declareFunction("test_dag_identify_roots", "TEST-DAG-IDENTIFY-ROOTS", 2, 0, false);
        declareFunction("dag_transitive_upward_closure", "DAG-TRANSITIVE-UPWARD-CLOSURE", 2, 0, false);
        declareFunction("dag_elide_from_graph", "DAG-ELIDE-FROM-GRAPH", 2, 2, false);
        declareFunction("dag_elide_from_graph_internal", "DAG-ELIDE-FROM-GRAPH-INTERNAL", 4, 0, false);
        declareFunction("test_dag_elide_from_graph", "TEST-DAG-ELIDE-FROM-GRAPH", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_graph_utilities_file() {
        defparameter("*EXTRACT-LINK-NODES-NODES*", NIL);
        defparameter("*EXTRACT-LINK-NODES-TEST*", NIL);
        return NIL;
    }

    public static final SubLObject setup_graph_utilities_file_alt() {
        define_test_case_table_int(TEST_COMPUTE_GRAPH_RANK_ESTIMATE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt36);
        define_test_case_table_int(TEST_DAG_IDENTIFY_LEAFS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt44);
        define_test_case_table_int(TEST_DAG_IDENTIFY_ROOTS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt48);
        define_test_case_table_int(TEST_DAG_ELIDE_FROM_GRAPH, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt54);
        return NIL;
    }

    public static SubLObject setup_graph_utilities_file() {
        if (SubLFiles.USE_V1) {
            define_test_case_table_int(TEST_COMPUTE_GRAPH_RANK_ESTIMATE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list35);
            define_test_case_table_int(TEST_DAG_IDENTIFY_LEAFS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list43);
            define_test_case_table_int(TEST_DAG_IDENTIFY_ROOTS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list47);
            define_test_case_table_int(TEST_DAG_ELIDE_FROM_GRAPH, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list53);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TEST_COMPUTE_GRAPH_RANK_ESTIMATE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt36);
            define_test_case_table_int(TEST_DAG_IDENTIFY_LEAFS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt44);
            define_test_case_table_int(TEST_DAG_IDENTIFY_ROOTS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt48);
            define_test_case_table_int(TEST_DAG_ELIDE_FROM_GRAPH, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt54);
        }
        return NIL;
    }

    public static SubLObject setup_graph_utilities_file_Previous() {
        define_test_case_table_int(TEST_COMPUTE_GRAPH_RANK_ESTIMATE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list35);
        define_test_case_table_int(TEST_DAG_IDENTIFY_LEAFS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list43);
        define_test_case_table_int(TEST_DAG_IDENTIFY_ROOTS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list47);
        define_test_case_table_int(TEST_DAG_ELIDE_FROM_GRAPH, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list53);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_graph_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_graph_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_graph_utilities_file();
    }

    static {
    }

    public static final class $extract_link_nodes_int$UnaryFunction extends UnaryFunction {
        public $extract_link_nodes_int$UnaryFunction() {
            super(extractFunctionNamed("EXTRACT-LINK-NODES-INT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return extract_link_nodes_int(arg1);
        }
    }

    public static final class $length_first$UnaryFunction extends UnaryFunction {
        public $length_first$UnaryFunction() {
            super(extractFunctionNamed("LENGTH-FIRST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return length_first(arg1);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("GROUP-NODES"), makeSymbol("GROUP-LINKS"));

    static private final SubLList $list_alt2 = list(makeSymbol("NODES"), makeSymbol("LINKS"));

    static private final SubLList $list_alt6 = list(list(makeSymbol("START"), makeSymbol("CURRENT"), makeSymbol("CHILDREN"), makeSymbol("&KEY"), list(makeSymbol("TESTFN"), list(QUOTE, list(QUOTE, EQL)))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt7 = list(makeKeyword("TESTFN"));

    static private final SubLList $list_alt10 = list(QUOTE, EQL);

    static private final SubLList $list_alt16 = list(list(makeSymbol("CREATE-QUEUE")));

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt36 = list(list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(cons(makeSymbol("A"), SEVEN_INTEGER), cons(makeSymbol("B"), FIVE_INTEGER), cons(makeSymbol("C"), FIVE_INTEGER), cons(makeSymbol("D"), FOUR_INTEGER), cons(makeSymbol("E"), ONE_INTEGER), cons(makeSymbol("F"), ONE_INTEGER), cons(makeSymbol("G"), ONE_INTEGER))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(cons(makeSymbol("A"), TEN_INTEGER), cons(makeSymbol("B"), EIGHT_INTEGER), cons(makeSymbol("C"), EIGHT_INTEGER), cons(makeSymbol("D"), SEVEN_INTEGER), cons(makeSymbol("E"), THREE_INTEGER), cons(makeSymbol("F"), TWO_INTEGER), cons(makeSymbol("G"), ONE_INTEGER)), list(cons(makeSymbol("E"), THREE_INTEGER), cons(makeSymbol("F"), TWO_INTEGER), cons(makeSymbol("G"), ONE_INTEGER))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D"))), list(cons(makeSymbol("E"), ONE_INTEGER), cons(makeSymbol("F"), ONE_INTEGER), cons(makeSymbol("G"), ONE_INTEGER), cons(makeSymbol("D"), FOUR_INTEGER))), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt37$The_expected_map_size__A_differs_ = makeString("The expected map size ~A differs from the generated size ~A.");

    static private final SubLList $list_alt38 = list(makeSymbol("NODE"), makeSymbol("EXPECTED-VALUE"));

    static private final SubLString $str_alt39$Expected_rank_estimate__A_for__A_ = makeString("Expected rank estimate ~A for ~A, got ~A.");

    static private final SubLList $list_alt42 = list(makeSymbol("NODE"), makeSymbol("SUPER-NODES"));

    static private final SubLList $list_alt44 = list(list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(makeSymbol("E"), makeSymbol("F"), makeSymbol("G"))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), cons(makeSymbol("A"), makeSymbol("G"))), list(makeSymbol("E"), makeSymbol("F"))), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt45$Expected__A_leafs__got__A_leafs_i = makeString("Expected ~A leafs, got ~A leafs instead.");

    static private final SubLString $str_alt46$The_expected_leaf_set__A_differs_ = makeString("The expected leaf set ~A differs from the computed leaf set ~A.");

    static private final SubLList $list_alt48 = list(list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(makeSymbol("A"))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), list(makeSymbol("A"))), list(makeSymbol("A"))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), cons(makeSymbol("A"), makeSymbol("G"))), NIL), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt49$Expected__A_roots__got__A_roots_i = makeString("Expected ~A roots, got ~A roots instead.");

    static private final SubLString $str_alt50$The_expected_roots_set__A_differs = makeString("The expected roots set ~A differs from the computed roots set ~A.");

    static private final SubLList $list_alt52 = list(makeSymbol("NODE"), makeSymbol("SUPERIOR"));

    static private final SubLList $list_alt54 = list(list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(makeSymbol("D")), list(list(makeSymbol("E"), makeSymbol("B"), makeSymbol("C")), list(makeSymbol("F"), makeSymbol("B"), makeSymbol("C")), list(makeSymbol("G"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), cons(makeSymbol("A"), makeSymbol("G"))), list(makeSymbol("D"), makeSymbol("G")), list(list(makeSymbol("E"), makeSymbol("B"), makeSymbol("C")), list(makeSymbol("F"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A")), list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C")))), makeKeyword("SUCCESS")), list(list(list(list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"))), list(makeSymbol("C")), list(cons(makeSymbol("A"), makeSymbol("B")))), makeKeyword("SUCCESS")), list(list(list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")), cons(makeSymbol("B"), makeSymbol("A")), cons(makeSymbol("C"), makeSymbol("A"))), list(makeSymbol("A")), list(cons(makeSymbol("E"), makeSymbol("D")), cons(makeSymbol("F"), makeSymbol("D")), cons(makeSymbol("G"), makeSymbol("D")), list(makeSymbol("D"), makeSymbol("B"), makeSymbol("C")))), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt55$_A_is_not_of_the_expected_size__A = makeString("~A is not of the expected size ~A, as ~A is.");

    static private final SubLList $list_alt56 = list(makeSymbol("NODE"), makeSymbol("SUPERIORS"));

    static private final SubLString $str_alt57$_A_does_not_contain_the_expected_ = makeString("~A does not contain the expected key ~A, whose value should be ~A.");

    static private final SubLString $str_alt58$The_superiors_for_node__A_are__A_ = makeString("The superiors for node ~A are ~A, not ~A.");

    static private final SubLString $str_alt59$The_superior_for_node__A_is__A__n = makeString("The superior for node ~A is ~A, not ~A.");
}

/**
 * Total time: 226 ms
 */
