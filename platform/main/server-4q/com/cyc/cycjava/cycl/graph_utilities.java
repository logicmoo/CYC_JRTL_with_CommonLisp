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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class graph_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new graph_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.graph_utilities";

    public static final String myFingerPrint = "15d1ce9bccb9064896a9ac26a2f01669fa46cc595e19257cdbed8de081c81df5";

    // defparameter
    private static final SubLSymbol $extract_link_nodes_nodes$ = makeSymbol("*EXTRACT-LINK-NODES-NODES*");

    // defparameter
    private static final SubLSymbol $extract_link_nodes_test$ = makeSymbol("*EXTRACT-LINK-NODES-TEST*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("GROUP-NODES"), makeSymbol("GROUP-LINKS"));

    public static final SubLSymbol EXTRACT_LINK_NODES_INT = makeSymbol("EXTRACT-LINK-NODES-INT");

    public static final SubLList $list2 = list(makeSymbol("NODES"), makeSymbol("LINKS"));



    public static final SubLSymbol $sym4$_ = makeSymbol("<");

    public static final SubLSymbol LENGTH_FIRST = makeSymbol("LENGTH-FIRST");

    public static final SubLList $list6 = list(list(makeSymbol("START"), makeSymbol("CURRENT"), makeSymbol("CHILDREN"), makeSymbol("&KEY"), list(makeSymbol("TESTFN"), list(makeSymbol("QUOTE"), list(makeSymbol("QUOTE"), EQL)))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list7 = list(makeKeyword("TESTFN"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLList $list10 = list(makeSymbol("QUOTE"), EQL);

    public static final SubLSymbol $sym11$SEEN = makeUninternedSymbol("SEEN");

    public static final SubLSymbol $sym12$TODO = makeUninternedSymbol("TODO");

    public static final SubLSymbol $sym13$CHILD = makeUninternedSymbol("CHILD");





    public static final SubLList $list16 = list(list(makeSymbol("CREATE-QUEUE")));





















    public static final SubLSymbol $sym27$SET_MEMBER_ = makeSymbol("SET-MEMBER?");

    public static final SubLSymbol TEST_COMPUTE_GRAPH_RANK_ESTIMATE = makeSymbol("TEST-COMPUTE-GRAPH-RANK-ESTIMATE");













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

    public static SubLObject extract_link_nodes_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, $extract_link_nodes_nodes$.getDynamicValue(thread), $extract_link_nodes_test$.getDynamicValue(thread), UNPROVIDED);
    }

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

    public static SubLObject length_first(final SubLObject v_object) {
        return length(v_object.first());
    }

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

    public static SubLObject sort_naked_groups(final SubLObject naked_groups, final SubLObject all_nodes, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return list_utilities.sort_via_position(naked_groups, all_nodes, test, symbol_function(CAAR));
    }

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

    public static SubLObject dag_identify_leafs(final SubLObject graph_map, SubLObject leaf_set) {
        if (leaf_set == UNPROVIDED) {
            leaf_set = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != map_utilities.map_p(graph_map) : "map_utilities.map_p(graph_map) " + "CommonSymbols.NIL != map_utilities.map_p(graph_map) " + graph_map;
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
    }

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
    }

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
            assert NIL != consp(delete_set) : "Types.consp(delete_set) " + "CommonSymbols.NIL != Types.consp(delete_set) " + delete_set;
            delete_set = set_utilities.construct_set_from_list(delete_set, UNPROVIDED, UNPROVIDED);
        }
        return dag_elide_from_graph_internal(graph_map, delete_set, pruned_graph_map, use_singletonsP);
    }

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
        declareFunction(me, "categorize_nodes_via_links", "CATEGORIZE-NODES-VIA-LINKS", 2, 1, false);
        declareFunction(me, "extract_link_nodes", "EXTRACT-LINK-NODES", 2, 1, false);
        declareFunction(me, "extract_link_nodes_int", "EXTRACT-LINK-NODES-INT", 1, 0, false);
        new graph_utilities.$extract_link_nodes_int$UnaryFunction();
        declareFunction(me, "extract_island_groups", "EXTRACT-ISLAND-GROUPS", 2, 1, false);
        declareFunction(me, "island_group_for_node", "ISLAND-GROUP-FOR-NODE", 2, 1, false);
        declareFunction(me, "merge_island_groups", "MERGE-ISLAND-GROUPS", 1, 0, false);
        declareFunction(me, "sort_connected_groups", "SORT-CONNECTED-GROUPS", 3, 1, false);
        declareFunction(me, "length_first", "LENGTH-FIRST", 1, 0, false);
        new graph_utilities.$length_first$UnaryFunction();
        declareFunction(me, "sort_isolated_groups", "SORT-ISOLATED-GROUPS", 3, 1, false);
        declareFunction(me, "sort_naked_groups", "SORT-NAKED-GROUPS", 2, 1, false);
        declareMacro(me, "walk_graph_breadth_first", "WALK-GRAPH-BREADTH-FIRST");
        declareFunction(me, "compute_graph_rank_estimate", "COMPUTE-GRAPH-RANK-ESTIMATE", 1, 2, false);
        declareFunction(me, "test_compute_graph_rank_estimate", "TEST-COMPUTE-GRAPH-RANK-ESTIMATE", 2, 1, false);
        declareFunction(me, "graph_rank_estimates_equalP", "GRAPH-RANK-ESTIMATES-EQUAL?", 2, 0, false);
        declareFunction(me, "dag_identify_leafs", "DAG-IDENTIFY-LEAFS", 1, 1, false);
        declareFunction(me, "test_dag_identify_leafs", "TEST-DAG-IDENTIFY-LEAFS", 2, 0, false);
        declareFunction(me, "dag_identify_roots", "DAG-IDENTIFY-ROOTS", 1, 1, false);
        declareFunction(me, "test_dag_identify_roots", "TEST-DAG-IDENTIFY-ROOTS", 2, 0, false);
        declareFunction(me, "dag_transitive_upward_closure", "DAG-TRANSITIVE-UPWARD-CLOSURE", 2, 0, false);
        declareFunction(me, "dag_elide_from_graph", "DAG-ELIDE-FROM-GRAPH", 2, 2, false);
        declareFunction(me, "dag_elide_from_graph_internal", "DAG-ELIDE-FROM-GRAPH-INTERNAL", 4, 0, false);
        declareFunction(me, "test_dag_elide_from_graph", "TEST-DAG-ELIDE-FROM-GRAPH", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_graph_utilities_file() {
        defparameter("*EXTRACT-LINK-NODES-NODES*", NIL);
        defparameter("*EXTRACT-LINK-NODES-TEST*", NIL);
        return NIL;
    }

    public static SubLObject setup_graph_utilities_file() {
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
}

/**
 * Total time: 226 ms
 */
