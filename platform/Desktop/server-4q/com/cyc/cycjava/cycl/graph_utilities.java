package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class graph_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.graph_utilities";
    public static final String myFingerPrint = "15d1ce9bccb9064896a9ac26a2f01669fa46cc595e19257cdbed8de081c81df5";
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 3699L)
    private static SubLSymbol $extract_link_nodes_nodes$;
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 3768L)
    private static SubLSymbol $extract_link_nodes_test$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$EXTRACT_LINK_NODES_INT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CAAR;
    private static final SubLSymbol $sym4$_;
    private static final SubLSymbol $sym5$LENGTH_FIRST;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw9$TESTFN;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$SEEN;
    private static final SubLSymbol $sym12$TODO;
    private static final SubLSymbol $sym13$CHILD;
    private static final SubLSymbol $sym14$CLET;
    private static final SubLSymbol $sym15$NEW_SET;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$ENQUEUE;
    private static final SubLSymbol $sym18$SET_ADD;
    private static final SubLSymbol $sym19$WHILE;
    private static final SubLSymbol $sym20$CNOT;
    private static final SubLSymbol $sym21$QUEUE_EMPTY_P;
    private static final SubLSymbol $sym22$CSETQ;
    private static final SubLSymbol $sym23$DEQUEUE;
    private static final SubLSymbol $sym24$PROGN;
    private static final SubLSymbol $sym25$CDOLIST;
    private static final SubLSymbol $sym26$PUNLESS;
    private static final SubLSymbol $sym27$SET_MEMBER_;
    private static final SubLSymbol $sym28$TEST_COMPUTE_GRAPH_RANK_ESTIMATE;
    private static final SubLSymbol $kw29$TEST;
    private static final SubLSymbol $kw30$OWNER;
    private static final SubLSymbol $kw31$CLASSES;
    private static final SubLSymbol $kw32$KB;
    private static final SubLSymbol $kw33$TINY;
    private static final SubLSymbol $kw34$WORKING_;
    private static final SubLList $list35;
    private static final SubLString $str36$The_expected_map_size__A_differs_;
    private static final SubLList $list37;
    private static final SubLString $str38$Expected_rank_estimate__A_for__A_;
    private static final SubLSymbol $kw39$SUCCESS;
    private static final SubLSymbol $sym40$MAP_P;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$TEST_DAG_IDENTIFY_LEAFS;
    private static final SubLList $list43;
    private static final SubLString $str44$Expected__A_leafs__got__A_leafs_i;
    private static final SubLString $str45$The_expected_leaf_set__A_differs_;
    private static final SubLSymbol $sym46$TEST_DAG_IDENTIFY_ROOTS;
    private static final SubLList $list47;
    private static final SubLString $str48$Expected__A_roots__got__A_roots_i;
    private static final SubLString $str49$The_expected_roots_set__A_differs;
    private static final SubLSymbol $sym50$CONSP;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$TEST_DAG_ELIDE_FROM_GRAPH;
    private static final SubLList $list53;
    private static final SubLString $str54$_A_is_not_of_the_expected_size__A;
    private static final SubLList $list55;
    private static final SubLString $str56$_A_does_not_contain_the_expected_;
    private static final SubLString $str57$The_superiors_for_node__A_are__A_;
    private static final SubLString $str58$The_superior_for_node__A_is__A__n;
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 846L)
    public static SubLObject categorize_nodes_via_links(final SubLObject nodes, final SubLObject links, SubLObject test) {
        if (test == graph_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)graph_utilities.EQL);
        }
        SubLObject all_island_groups = (SubLObject)graph_utilities.NIL;
        SubLObject cdolist_list_var = nodes;
        SubLObject node = (SubLObject)graph_utilities.NIL;
        node = cdolist_list_var.first();
        while (graph_utilities.NIL != cdolist_list_var) {
            all_island_groups = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node), (SubLObject)graph_utilities.NIL), all_island_groups);
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        }
        cdolist_list_var = links;
        SubLObject link = (SubLObject)graph_utilities.NIL;
        link = cdolist_list_var.first();
        while (graph_utilities.NIL != cdolist_list_var) {
            final SubLObject link_nodes = extract_link_nodes(link, nodes, test);
            final SubLObject island_groups = extract_island_groups(link_nodes, all_island_groups, test);
            SubLObject island_group = (SubLObject)graph_utilities.NIL;
            if (graph_utilities.NIL != list_utilities.singletonP(island_groups)) {
                island_group = island_groups.first();
            }
            else {
                final SubLObject merged_island_group = merge_island_groups(island_groups);
                all_island_groups = conses_high.set_difference(all_island_groups, island_groups, (SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED);
                all_island_groups = (SubLObject)ConsesLow.cons(merged_island_group, all_island_groups);
                island_group = merged_island_group;
            }
            SubLObject current;
            final SubLObject datum = current = island_group;
            SubLObject group_nodes = (SubLObject)graph_utilities.NIL;
            SubLObject group_links = (SubLObject)graph_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list0);
            group_nodes = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list0);
            group_links = current.first();
            current = current.rest();
            if (graph_utilities.NIL == current) {
                ConsesLow.set_nth((SubLObject)graph_utilities.ONE_INTEGER, island_group, (SubLObject)ConsesLow.cons(link, group_links));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph_utilities.$list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        SubLObject connected_groups = (SubLObject)graph_utilities.NIL;
        SubLObject isolated_groups = (SubLObject)graph_utilities.NIL;
        SubLObject naked_groups = (SubLObject)graph_utilities.NIL;
        SubLObject cdolist_list_var2 = all_island_groups;
        SubLObject island_group = (SubLObject)graph_utilities.NIL;
        island_group = cdolist_list_var2.first();
        while (graph_utilities.NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = island_group;
            SubLObject group_nodes = (SubLObject)graph_utilities.NIL;
            SubLObject group_links = (SubLObject)graph_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list0);
            group_nodes = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list0);
            group_links = current.first();
            current = current.rest();
            if (graph_utilities.NIL == current) {
                if (graph_utilities.NIL != list_utilities.singletonP(group_nodes)) {
                    if (graph_utilities.NIL == group_links) {
                        naked_groups = (SubLObject)ConsesLow.cons(island_group, naked_groups);
                    }
                    else {
                        isolated_groups = (SubLObject)ConsesLow.cons(island_group, isolated_groups);
                    }
                }
                else {
                    connected_groups = (SubLObject)ConsesLow.cons(island_group, connected_groups);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph_utilities.$list0);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            island_group = cdolist_list_var2.first();
        }
        if (graph_utilities.ONE_INTEGER.numE(Sequences.length(nodes))) {
            connected_groups = isolated_groups;
            isolated_groups = (SubLObject)graph_utilities.NIL;
        }
        connected_groups = sort_connected_groups(connected_groups, nodes, links, test);
        isolated_groups = sort_isolated_groups(isolated_groups, nodes, links, test);
        naked_groups = sort_naked_groups(naked_groups, nodes, test);
        return Values.values(connected_groups, isolated_groups, naked_groups);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 3822L)
    public static SubLObject extract_link_nodes(final SubLObject link, final SubLObject candidate_nodes, SubLObject test) {
        if (test == graph_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)graph_utilities.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)graph_utilities.NIL;
        final SubLObject _prev_bind_0 = graph_utilities.$extract_link_nodes_nodes$.currentBinding(thread);
        final SubLObject _prev_bind_2 = graph_utilities.$extract_link_nodes_test$.currentBinding(thread);
        try {
            graph_utilities.$extract_link_nodes_nodes$.bind(candidate_nodes, thread);
            graph_utilities.$extract_link_nodes_test$.bind(test, thread);
            v_answer = list_utilities.tree_gather(link, (SubLObject)graph_utilities.$sym1$EXTRACT_LINK_NODES_INT, test, (SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED);
        }
        finally {
            graph_utilities.$extract_link_nodes_test$.rebind(_prev_bind_2, thread);
            graph_utilities.$extract_link_nodes_nodes$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 4164L)
    public static SubLObject extract_link_nodes_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, graph_utilities.$extract_link_nodes_nodes$.getDynamicValue(thread), graph_utilities.$extract_link_nodes_test$.getDynamicValue(thread), (SubLObject)graph_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 4292L)
    public static SubLObject extract_island_groups(final SubLObject nodes, final SubLObject candidate_island_groups, SubLObject test) {
        if (test == graph_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)graph_utilities.EQL);
        }
        SubLObject island_groups = (SubLObject)graph_utilities.NIL;
        SubLObject cdolist_list_var = nodes;
        SubLObject node = (SubLObject)graph_utilities.NIL;
        node = cdolist_list_var.first();
        while (graph_utilities.NIL != cdolist_list_var) {
            final SubLObject item_var;
            final SubLObject island_group = item_var = island_group_for_node(node, candidate_island_groups, test);
            if (graph_utilities.NIL == conses_high.member(item_var, island_groups, Symbols.symbol_function((SubLObject)graph_utilities.EQL), Symbols.symbol_function((SubLObject)graph_utilities.IDENTITY))) {
                island_groups = (SubLObject)ConsesLow.cons(item_var, island_groups);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        }
        return island_groups;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 4673L)
    public static SubLObject island_group_for_node(final SubLObject node, final SubLObject island_groups, SubLObject test) {
        if (test == graph_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)graph_utilities.EQL);
        }
        SubLObject v_answer = (SubLObject)graph_utilities.NIL;
        if (graph_utilities.NIL == v_answer) {
            SubLObject csome_list_var = island_groups;
            SubLObject island_group = (SubLObject)graph_utilities.NIL;
            island_group = csome_list_var.first();
            while (graph_utilities.NIL == v_answer && graph_utilities.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = island_group;
                SubLObject nodes = (SubLObject)graph_utilities.NIL;
                SubLObject links = (SubLObject)graph_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list2);
                nodes = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list2);
                links = current.first();
                current = current.rest();
                if (graph_utilities.NIL == current) {
                    if (graph_utilities.NIL != subl_promotions.memberP(node, nodes, test, (SubLObject)graph_utilities.UNPROVIDED)) {
                        v_answer = island_group;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph_utilities.$list2);
                }
                csome_list_var = csome_list_var.rest();
                island_group = csome_list_var.first();
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 5045L)
    public static SubLObject merge_island_groups(final SubLObject island_groups) {
        SubLObject merged_group_nodes = (SubLObject)graph_utilities.NIL;
        SubLObject merged_group_links = (SubLObject)graph_utilities.NIL;
        SubLObject cdolist_list_var = island_groups;
        SubLObject island_group = (SubLObject)graph_utilities.NIL;
        island_group = cdolist_list_var.first();
        while (graph_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = island_group;
            SubLObject group_nodes = (SubLObject)graph_utilities.NIL;
            SubLObject group_links = (SubLObject)graph_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list0);
            group_nodes = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list0);
            group_links = current.first();
            current = current.rest();
            if (graph_utilities.NIL == current) {
                SubLObject cdolist_list_var_$1 = group_nodes;
                SubLObject node = (SubLObject)graph_utilities.NIL;
                node = cdolist_list_var_$1.first();
                while (graph_utilities.NIL != cdolist_list_var_$1) {
                    merged_group_nodes = (SubLObject)ConsesLow.cons(node, merged_group_nodes);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    node = cdolist_list_var_$1.first();
                }
                SubLObject cdolist_list_var_$2 = group_links;
                SubLObject link = (SubLObject)graph_utilities.NIL;
                link = cdolist_list_var_$2.first();
                while (graph_utilities.NIL != cdolist_list_var_$2) {
                    merged_group_links = (SubLObject)ConsesLow.cons(link, merged_group_links);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    link = cdolist_list_var_$2.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph_utilities.$list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            island_group = cdolist_list_var.first();
        }
        final SubLObject merged_island_group = (SubLObject)ConsesLow.list(merged_group_nodes, merged_group_links);
        return merged_island_group;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 5590L)
    public static SubLObject sort_connected_groups(SubLObject connected_groups, final SubLObject all_nodes, final SubLObject all_links, SubLObject test) {
        if (test == graph_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)graph_utilities.EQL);
        }
        SubLObject cdolist_list_var = connected_groups;
        SubLObject island_group = (SubLObject)graph_utilities.NIL;
        island_group = cdolist_list_var.first();
        while (graph_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = island_group;
            SubLObject nodes = (SubLObject)graph_utilities.NIL;
            SubLObject links = (SubLObject)graph_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list2);
            nodes = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list2);
            links = current.first();
            current = current.rest();
            if (graph_utilities.NIL == current) {
                ConsesLow.set_nth((SubLObject)graph_utilities.ZERO_INTEGER, island_group, list_utilities.sort_via_position(nodes, all_nodes, Symbols.symbol_function((SubLObject)graph_utilities.EQL), (SubLObject)graph_utilities.UNPROVIDED));
                ConsesLow.set_nth((SubLObject)graph_utilities.ONE_INTEGER, island_group, list_utilities.sort_via_position(links, all_links, Symbols.symbol_function((SubLObject)graph_utilities.EQL), (SubLObject)graph_utilities.UNPROVIDED));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph_utilities.$list2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            island_group = cdolist_list_var.first();
        }
        connected_groups = list_utilities.sort_via_position(connected_groups, all_nodes, test, Symbols.symbol_function((SubLObject)graph_utilities.$sym3$CAAR));
        return Sort.stable_sort(connected_groups, Symbols.symbol_function((SubLObject)graph_utilities.$sym4$_), Symbols.symbol_function((SubLObject)graph_utilities.$sym5$LENGTH_FIRST));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 6169L)
    public static SubLObject length_first(final SubLObject v_object) {
        return Sequences.length(v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 6241L)
    public static SubLObject sort_isolated_groups(final SubLObject isolated_groups, final SubLObject all_nodes, final SubLObject all_links, SubLObject test) {
        if (test == graph_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)graph_utilities.EQL);
        }
        SubLObject cdolist_list_var = isolated_groups;
        SubLObject island_group = (SubLObject)graph_utilities.NIL;
        island_group = cdolist_list_var.first();
        while (graph_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = island_group;
            SubLObject nodes = (SubLObject)graph_utilities.NIL;
            SubLObject links = (SubLObject)graph_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list2);
            nodes = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list2);
            links = current.first();
            current = current.rest();
            if (graph_utilities.NIL == current) {
                ConsesLow.set_nth((SubLObject)graph_utilities.ONE_INTEGER, island_group, list_utilities.sort_via_position(links, all_links, Symbols.symbol_function((SubLObject)graph_utilities.EQL), (SubLObject)graph_utilities.UNPROVIDED));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph_utilities.$list2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            island_group = cdolist_list_var.first();
        }
        return list_utilities.sort_via_position(isolated_groups, all_nodes, test, Symbols.symbol_function((SubLObject)graph_utilities.$sym3$CAAR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 6660L)
    public static SubLObject sort_naked_groups(final SubLObject naked_groups, final SubLObject all_nodes, SubLObject test) {
        if (test == graph_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)graph_utilities.EQL);
        }
        return list_utilities.sort_via_position(naked_groups, all_nodes, test, Symbols.symbol_function((SubLObject)graph_utilities.$sym3$CAAR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 6849L)
    public static SubLObject walk_graph_breadth_first(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject start = (SubLObject)graph_utilities.NIL;
        SubLObject current_$3 = (SubLObject)graph_utilities.NIL;
        SubLObject children = (SubLObject)graph_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list6);
        start = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list6);
        current_$3 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list6);
        children = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)graph_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)graph_utilities.NIL;
        SubLObject current_$4 = (SubLObject)graph_utilities.NIL;
        while (graph_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)graph_utilities.$list6);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)graph_utilities.$list6);
            if (graph_utilities.NIL == conses_high.member(current_$4, (SubLObject)graph_utilities.$list7, (SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED)) {
                bad = (SubLObject)graph_utilities.T;
            }
            if (current_$4 == graph_utilities.$kw8$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (graph_utilities.NIL != bad && graph_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph_utilities.$list6);
        }
        final SubLObject testfn_tail = cdestructuring_bind.property_list_member((SubLObject)graph_utilities.$kw9$TESTFN, current);
        final SubLObject testfn = (SubLObject)((graph_utilities.NIL != testfn_tail) ? conses_high.cadr(testfn_tail) : graph_utilities.$list10);
        final SubLObject body;
        current = (body = temp);
        final SubLObject seen = (SubLObject)graph_utilities.$sym11$SEEN;
        final SubLObject todo = (SubLObject)graph_utilities.$sym12$TODO;
        final SubLObject child = (SubLObject)graph_utilities.$sym13$CHILD;
        return (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym14$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(seen, (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym15$NEW_SET, testfn)), reader.bq_cons(todo, (SubLObject)graph_utilities.$list16)), (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym17$ENQUEUE, start, todo), (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym18$SET_ADD, start, seen), (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym19$WHILE, (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym20$CNOT, (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym21$QUEUE_EMPTY_P, todo)), (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym14$CLET, (SubLObject)ConsesLow.list(current_$3, children), (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym22$CSETQ, current_$3, (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym23$DEQUEUE, todo)), reader.bq_cons((SubLObject)graph_utilities.$sym24$PROGN, ConsesLow.append(body, (SubLObject)graph_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym25$CDOLIST, (SubLObject)ConsesLow.list(child, children), (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym26$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym27$SET_MEMBER_, child, seen), (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym18$SET_ADD, child, seen), (SubLObject)ConsesLow.list((SubLObject)graph_utilities.$sym17$ENQUEUE, child, todo))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 7892L)
    public static SubLObject compute_graph_rank_estimate(final SubLObject graph_map, SubLObject estimates_map, SubLObject leaf_deltas) {
        if (estimates_map == graph_utilities.UNPROVIDED) {
            estimates_map = (SubLObject)graph_utilities.NIL;
        }
        if (leaf_deltas == graph_utilities.UNPROVIDED) {
            leaf_deltas = (SubLObject)graph_utilities.NIL;
        }
        if (graph_utilities.NIL == map_utilities.map_p(estimates_map)) {
            estimates_map = map_utilities.clone_map(graph_map, (SubLObject)graph_utilities.NIL);
        }
        final SubLObject singleton = (SubLObject)ConsesLow.list((SubLObject)graph_utilities.NIL);
        final SubLObject key_test = map_utilities.map_test(graph_map);
        final SubLObject key_set = set_utilities.construct_set_from_list(map_utilities.map_keys(graph_map), key_test, map_utilities.map_size(graph_map));
        final SubLObject implied_roots = set.new_set(map_utilities.map_test(graph_map), (SubLObject)graph_utilities.UNPROVIDED);
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)graph_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); graph_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            node = set_contents.do_set_contents_next(basis_object, state);
            if (graph_utilities.NIL != set_contents.do_set_contents_element_validP(state, node)) {
                delta = (SubLObject)graph_utilities.ONE_INTEGER;
                if (graph_utilities.NIL != map_utilities.map_p(leaf_deltas)) {
                    delta = map_utilities.map_get(leaf_deltas, node, delta);
                }
                seen = set.new_set((SubLObject)graph_utilities.EQL, (SubLObject)graph_utilities.UNPROVIDED);
                todo = queues.create_queue((SubLObject)graph_utilities.UNPROVIDED);
                queues.enqueue(node, todo);
                set.set_add(node, seen);
                while (graph_utilities.NIL == queues.queue_empty_p(todo)) {
                    current = (SubLObject)graph_utilities.NIL;
                    super_nodes = (SubLObject)graph_utilities.NIL;
                    current = queues.dequeue(todo);
                    map_utilities.map_increment(estimates_map, current, delta);
                    super_nodes = map_utilities.map_get(graph_map, current, (SubLObject)graph_utilities.UNPROVIDED);
                    if (graph_utilities.NIL == super_nodes) {
                        if (graph_utilities.NIL == set.set_memberP(current, key_set)) {
                            set.set_add(current, implied_roots);
                        }
                    }
                    else if (!super_nodes.isCons()) {
                        ConsesLow.rplaca(singleton, super_nodes);
                        super_nodes = singleton;
                    }
                    cdolist_list_var = super_nodes;
                    child = (SubLObject)graph_utilities.NIL;
                    child = cdolist_list_var.first();
                    while (graph_utilities.NIL != cdolist_list_var) {
                        if (graph_utilities.NIL == set.set_memberP(child, seen)) {
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)graph_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); graph_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            node = set_contents.do_set_contents_next(basis_object, state);
            if (graph_utilities.NIL != set_contents.do_set_contents_element_validP(state, node)) {
                delta = (SubLObject)graph_utilities.ONE_INTEGER;
                if (graph_utilities.NIL != map_utilities.map_p(leaf_deltas)) {
                    delta = map_utilities.map_get(leaf_deltas, node, delta);
                }
                map_utilities.map_increment(estimates_map, node, delta);
            }
        }
        return estimates_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 11911L)
    public static SubLObject test_compute_graph_rank_estimate(final SubLObject graph_alist, final SubLObject expected_estimate_alist, SubLObject leaf_delta_alist) {
        if (leaf_delta_alist == graph_utilities.UNPROVIDED) {
            leaf_delta_alist = (SubLObject)graph_utilities.NIL;
        }
        final SubLObject v_graph = dictionary_utilities.new_dictionary_from_alist(graph_alist, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject expected_estimate = dictionary_utilities.new_dictionary_from_alist(expected_estimate_alist, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject leaf_deltas = (SubLObject)((graph_utilities.NIL != list_utilities.alist_p(leaf_delta_alist)) ? dictionary_utilities.new_dictionary_from_alist(leaf_delta_alist, (SubLObject)graph_utilities.UNPROVIDED) : graph_utilities.NIL);
        final SubLObject estimates = compute_graph_rank_estimate(v_graph, (SubLObject)graph_utilities.NIL, leaf_deltas);
        return graph_rank_estimates_equalP(expected_estimate, estimates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 12499L)
    public static SubLObject graph_rank_estimates_equalP(final SubLObject expected_estimate, final SubLObject estimates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!map_utilities.map_size(expected_estimate).numE(map_utilities.map_size(estimates))) {
            Errors.error((SubLObject)graph_utilities.$str36$The_expected_map_size__A_differs_, map_utilities.map_size(expected_estimate), map_utilities.map_size(estimates));
        }
        final SubLObject iterator = map_utilities.new_map_iterator(expected_estimate);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)graph_utilities.NIL; graph_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(graph_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (graph_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = (SubLObject)graph_utilities.NIL;
                SubLObject expected_value = (SubLObject)graph_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list37);
                node = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list37);
                expected_value = current.first();
                current = current.rest();
                if (graph_utilities.NIL == current) {
                    final SubLObject actual_value = map_utilities.map_get(estimates, node, (SubLObject)graph_utilities.UNPROVIDED);
                    if (!expected_value.numE(actual_value)) {
                        print_high.print(dictionary_utilities.dictionary_to_alist(estimates), (SubLObject)graph_utilities.UNPROVIDED);
                        Errors.error((SubLObject)graph_utilities.$str38$Expected_rank_estimate__A_for__A_, expected_value, node, actual_value);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph_utilities.$list37);
                }
            }
        }
        return (SubLObject)graph_utilities.$kw39$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 13118L)
    public static SubLObject dag_identify_leafs(final SubLObject graph_map, SubLObject leaf_set) {
        if (leaf_set == graph_utilities.UNPROVIDED) {
            leaf_set = (SubLObject)graph_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert graph_utilities.NIL != map_utilities.map_p(graph_map) : graph_map;
        if (graph_utilities.NIL == set.set_p(leaf_set)) {
            leaf_set = set.new_set(map_utilities.map_test(graph_map), (SubLObject)graph_utilities.UNPROVIDED);
        }
        set.clear_set(leaf_set);
        set_utilities.set_add_all(map_utilities.map_keys(graph_map), leaf_set);
        final SubLObject singleton = (SubLObject)ConsesLow.list((SubLObject)graph_utilities.NIL);
        final SubLObject iterator = map_utilities.new_map_iterator(graph_map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)graph_utilities.NIL; graph_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(graph_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (graph_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = (SubLObject)graph_utilities.NIL;
                SubLObject super_nodes = (SubLObject)graph_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list41);
                node = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list41);
                super_nodes = current.first();
                current = current.rest();
                if (graph_utilities.NIL == current) {
                    if (graph_utilities.NIL != super_nodes) {
                        if (!super_nodes.isCons()) {
                            ConsesLow.rplaca(singleton, super_nodes);
                            super_nodes = singleton;
                        }
                        SubLObject cdolist_list_var = super_nodes;
                        SubLObject super_node = (SubLObject)graph_utilities.NIL;
                        super_node = cdolist_list_var.first();
                        while (graph_utilities.NIL != cdolist_list_var) {
                            set.set_remove(super_node, leaf_set);
                            cdolist_list_var = cdolist_list_var.rest();
                            super_node = cdolist_list_var.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph_utilities.$list41);
                }
            }
        }
        return leaf_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 14263L)
    public static SubLObject test_dag_identify_leafs(final SubLObject graph_alist, final SubLObject leaf_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject graph_map = dictionary_utilities.new_dictionary_from_alist(graph_alist, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject expected_leaf_set = set_utilities.construct_set_from_list(leaf_list, (SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject leaf_set = dag_identify_leafs(graph_map, (SubLObject)graph_utilities.UNPROVIDED);
        if (graph_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !set.set_size(expected_leaf_set).numE(set.set_size(leaf_set))) {
            Errors.error((SubLObject)graph_utilities.$str44$Expected__A_leafs__got__A_leafs_i, set.set_size(expected_leaf_set), set.set_size(leaf_set));
        }
        if (graph_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && graph_utilities.NIL == set_utilities.sets_coextensionalP(leaf_set, expected_leaf_set)) {
            Errors.error((SubLObject)graph_utilities.$str45$The_expected_leaf_set__A_differs_, set.set_element_list(expected_leaf_set), set.set_element_list(leaf_set));
        }
        return (SubLObject)graph_utilities.$kw39$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 15058L)
    public static SubLObject dag_identify_roots(final SubLObject graph_map, SubLObject root_set) {
        if (root_set == graph_utilities.UNPROVIDED) {
            root_set = (SubLObject)graph_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (graph_utilities.NIL == set.set_p(root_set)) {
            root_set = set.new_set(map_utilities.map_test(graph_map), map_utilities.map_size(graph_map));
        }
        set.clear_set(root_set);
        final SubLObject singleton = (SubLObject)ConsesLow.list((SubLObject)graph_utilities.NIL);
        SubLObject nodes = (SubLObject)graph_utilities.NIL;
        final SubLObject iterator = map_utilities.new_map_iterator(graph_map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)graph_utilities.NIL; graph_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(graph_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (graph_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = (SubLObject)graph_utilities.NIL;
                SubLObject super_nodes = (SubLObject)graph_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list41);
                node = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list41);
                super_nodes = current.first();
                current = current.rest();
                if (graph_utilities.NIL == current) {
                    if (graph_utilities.NIL != super_nodes) {
                        nodes = (SubLObject)ConsesLow.cons(node, nodes);
                        if (!super_nodes.isCons()) {
                            ConsesLow.rplaca(singleton, super_nodes);
                            super_nodes = singleton;
                        }
                        SubLObject cdolist_list_var = super_nodes;
                        SubLObject super_node = (SubLObject)graph_utilities.NIL;
                        super_node = cdolist_list_var.first();
                        while (graph_utilities.NIL != cdolist_list_var) {
                            set.set_add(super_node, root_set);
                            cdolist_list_var = cdolist_list_var.rest();
                            super_node = cdolist_list_var.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph_utilities.$list41);
                }
            }
        }
        set_utilities.set_remove_all(nodes, root_set);
        return root_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 16688L)
    public static SubLObject test_dag_identify_roots(final SubLObject graph_alist, final SubLObject root_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject graph_map = dictionary_utilities.new_dictionary_from_alist(graph_alist, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject expected_root_set = set_utilities.construct_set_from_list(root_list, (SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject root_set = dag_identify_roots(graph_map, (SubLObject)graph_utilities.UNPROVIDED);
        if (graph_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !set.set_size(expected_root_set).numE(set.set_size(root_set))) {
            Errors.error((SubLObject)graph_utilities.$str48$Expected__A_roots__got__A_roots_i, set.set_size(expected_root_set), set.set_size(root_set));
        }
        if (graph_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && graph_utilities.NIL == set_utilities.sets_coextensionalP(root_set, expected_root_set)) {
            Errors.error((SubLObject)graph_utilities.$str49$The_expected_roots_set__A_differs, set.set_element_list(expected_root_set), set.set_element_list(root_set));
        }
        return (SubLObject)graph_utilities.$kw39$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 17479L)
    public static SubLObject dag_transitive_upward_closure(final SubLObject graph_map, final SubLObject start_node) {
        final SubLObject closure = set.new_set((SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject seen = set.new_set((SubLObject)graph_utilities.EQL, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject todo = queues.create_queue((SubLObject)graph_utilities.UNPROVIDED);
        queues.enqueue(start_node, todo);
        set.set_add(start_node, seen);
        while (graph_utilities.NIL == queues.queue_empty_p(todo)) {
            SubLObject current = (SubLObject)graph_utilities.NIL;
            SubLObject super_nodes = (SubLObject)graph_utilities.NIL;
            current = queues.dequeue(todo);
            super_nodes = map_utilities.map_get(graph_map, current, (SubLObject)graph_utilities.UNPROVIDED);
            set_utilities.set_add_all(super_nodes, closure);
            SubLObject cdolist_list_var = super_nodes;
            SubLObject child = (SubLObject)graph_utilities.NIL;
            child = cdolist_list_var.first();
            while (graph_utilities.NIL != cdolist_list_var) {
                if (graph_utilities.NIL == set.set_memberP(child, seen)) {
                    set.set_add(child, seen);
                    queues.enqueue(child, todo);
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            }
        }
        return closure;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 17904L)
    public static SubLObject dag_elide_from_graph(final SubLObject graph_map, SubLObject delete_set, SubLObject use_singletonsP, SubLObject pruned_graph_map) {
        if (use_singletonsP == graph_utilities.UNPROVIDED) {
            use_singletonsP = (SubLObject)graph_utilities.NIL;
        }
        if (pruned_graph_map == graph_utilities.UNPROVIDED) {
            pruned_graph_map = (SubLObject)graph_utilities.NIL;
        }
        if (graph_utilities.NIL == map_utilities.map_p(pruned_graph_map)) {
            pruned_graph_map = map_utilities.new_map_with_same_properties(graph_map);
        }
        if (graph_utilities.NIL == delete_set) {
            map_utilities.copy_map(graph_map, pruned_graph_map, (SubLObject)graph_utilities.UNPROVIDED);
            return pruned_graph_map;
        }
        if (graph_utilities.NIL == set.set_p(delete_set)) {
            assert graph_utilities.NIL != Types.consp(delete_set) : delete_set;
            delete_set = set_utilities.construct_set_from_list(delete_set, (SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED);
        }
        return dag_elide_from_graph_internal(graph_map, delete_set, pruned_graph_map, use_singletonsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 19039L)
    public static SubLObject dag_elide_from_graph_internal(final SubLObject graph_map, final SubLObject delete_set, final SubLObject pruned_graph_map, final SubLObject use_singletonsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject to_consider = queues.create_queue((SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject clean_superiors = set.new_set((SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject worked_on = set.new_set((SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject iterator = map_utilities.new_map_iterator(graph_map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)graph_utilities.NIL; graph_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(graph_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (graph_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = (SubLObject)graph_utilities.NIL;
                SubLObject superior = (SubLObject)graph_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list51);
                node = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list51);
                superior = current.first();
                current = current.rest();
                if (graph_utilities.NIL == current) {
                    if (graph_utilities.NIL == set.set_memberP(node, delete_set)) {
                        queues.clear_queue(to_consider);
                        set.clear_set(clean_superiors);
                        set.clear_set(worked_on);
                        if (superior.isCons()) {
                            queues.enqueue_all(superior, to_consider);
                        }
                        else {
                            queues.enqueue(superior, to_consider);
                        }
                        while (graph_utilities.NIL == queues.queue_empty_p(to_consider)) {
                            final SubLObject curr = queues.dequeue(to_consider);
                            set.set_add(curr, worked_on);
                            if (graph_utilities.NIL == set.set_memberP(curr, clean_superiors)) {
                                if (graph_utilities.NIL != set.set_memberP(curr, delete_set)) {
                                    thread.resetMultipleValues();
                                    final SubLObject next_level_up = map_utilities.map_get(graph_map, curr, (SubLObject)graph_utilities.UNPROVIDED);
                                    final SubLObject presentP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (graph_utilities.NIL == presentP) {
                                        continue;
                                    }
                                    if (graph_utilities.NIL == next_level_up) {
                                        continue;
                                    }
                                    if (next_level_up.isCons()) {
                                        SubLObject cdolist_list_var = next_level_up;
                                        SubLObject next = (SubLObject)graph_utilities.NIL;
                                        next = cdolist_list_var.first();
                                        while (graph_utilities.NIL != cdolist_list_var) {
                                            if (graph_utilities.NIL == set.set_memberP(next, worked_on)) {
                                                queues.enqueue(next, to_consider);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            next = cdolist_list_var.first();
                                        }
                                    }
                                    else {
                                        if (graph_utilities.NIL != set.set_memberP(next_level_up, worked_on)) {
                                            continue;
                                        }
                                        queues.enqueue(next_level_up, to_consider);
                                    }
                                }
                                else {
                                    set.set_add(curr, clean_superiors);
                                }
                            }
                        }
                        if (graph_utilities.NIL == set.set_emptyP(clean_superiors)) {
                            SubLObject next_level = set.set_element_list(clean_superiors);
                            if (graph_utilities.NIL != list_utilities.singletonP(next_level) && graph_utilities.NIL == use_singletonsP) {
                                next_level = next_level.first();
                            }
                            map_utilities.map_put(pruned_graph_map, node, next_level);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph_utilities.$list51);
                }
            }
        }
        return pruned_graph_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graph-utilities.lisp", position = 22236L)
    public static SubLObject test_dag_elide_from_graph(final SubLObject graph_alist, final SubLObject delete_list, final SubLObject expected_graph_alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject graph_map = dictionary_utilities.new_dictionary_from_alist(graph_alist, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject delete_set = set_utilities.construct_set_from_list(delete_list, (SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject expected_graph_map = dictionary_utilities.new_dictionary_from_alist(expected_graph_alist, (SubLObject)graph_utilities.UNPROVIDED);
        final SubLObject pruned_graph_map = dag_elide_from_graph(graph_map, delete_set, (SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED);
        if (graph_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !map_utilities.map_size(pruned_graph_map).numE(map_utilities.map_size(expected_graph_map))) {
            Errors.error((SubLObject)graph_utilities.$str54$_A_is_not_of_the_expected_size__A, dictionary_utilities.dictionary_to_alist(pruned_graph_map), map_utilities.map_size(expected_graph_map), dictionary_utilities.dictionary_to_alist(expected_graph_map));
        }
        final SubLObject iterator = map_utilities.new_map_iterator(expected_graph_map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)graph_utilities.NIL; graph_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(graph_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (graph_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = (SubLObject)graph_utilities.NIL;
                SubLObject superiors = (SubLObject)graph_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list55);
                node = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph_utilities.$list55);
                superiors = current.first();
                current = current.rest();
                if (graph_utilities.NIL == current) {
                    if (graph_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && graph_utilities.NIL == map_utilities.map_has_keyP(pruned_graph_map, node)) {
                        Errors.error((SubLObject)graph_utilities.$str56$_A_does_not_contain_the_expected_, dictionary_utilities.dictionary_to_alist(pruned_graph_map), node, superiors);
                    }
                    final SubLObject pruned_superiors = map_utilities.map_get(pruned_graph_map, node, (SubLObject)graph_utilities.UNPROVIDED);
                    if (superiors.isCons()) {
                        if (graph_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!pruned_superiors.isCons() || graph_utilities.NIL == list_utilities.lengthE(pruned_superiors, Sequences.length(superiors), (SubLObject)graph_utilities.UNPROVIDED) || graph_utilities.NIL == set_utilities.sets_coextensionalP(set_utilities.construct_set_from_list(superiors, (SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED), set_utilities.construct_set_from_list(pruned_superiors, (SubLObject)graph_utilities.UNPROVIDED, (SubLObject)graph_utilities.UNPROVIDED)))) {
                            Errors.error((SubLObject)graph_utilities.$str57$The_superiors_for_node__A_are__A_, node, pruned_superiors, superiors);
                        }
                    }
                    else if (graph_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !superiors.equal(pruned_superiors)) {
                        Errors.error((SubLObject)graph_utilities.$str58$The_superior_for_node__A_is__A__n, node, pruned_superiors, superiors);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph_utilities.$list55);
                }
            }
        }
        return (SubLObject)graph_utilities.$kw39$SUCCESS;
    }
    
    public static SubLObject declare_graph_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "categorize_nodes_via_links", "CATEGORIZE-NODES-VIA-LINKS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "extract_link_nodes", "EXTRACT-LINK-NODES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "extract_link_nodes_int", "EXTRACT-LINK-NODES-INT", 1, 0, false);
        new $extract_link_nodes_int$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "extract_island_groups", "EXTRACT-ISLAND-GROUPS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "island_group_for_node", "ISLAND-GROUP-FOR-NODE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "merge_island_groups", "MERGE-ISLAND-GROUPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "sort_connected_groups", "SORT-CONNECTED-GROUPS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "length_first", "LENGTH-FIRST", 1, 0, false);
        new $length_first$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "sort_isolated_groups", "SORT-ISOLATED-GROUPS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "sort_naked_groups", "SORT-NAKED-GROUPS", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.graph_utilities", "walk_graph_breadth_first", "WALK-GRAPH-BREADTH-FIRST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "compute_graph_rank_estimate", "COMPUTE-GRAPH-RANK-ESTIMATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "test_compute_graph_rank_estimate", "TEST-COMPUTE-GRAPH-RANK-ESTIMATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "graph_rank_estimates_equalP", "GRAPH-RANK-ESTIMATES-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "dag_identify_leafs", "DAG-IDENTIFY-LEAFS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "test_dag_identify_leafs", "TEST-DAG-IDENTIFY-LEAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "dag_identify_roots", "DAG-IDENTIFY-ROOTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "test_dag_identify_roots", "TEST-DAG-IDENTIFY-ROOTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "dag_transitive_upward_closure", "DAG-TRANSITIVE-UPWARD-CLOSURE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "dag_elide_from_graph", "DAG-ELIDE-FROM-GRAPH", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "dag_elide_from_graph_internal", "DAG-ELIDE-FROM-GRAPH-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graph_utilities", "test_dag_elide_from_graph", "TEST-DAG-ELIDE-FROM-GRAPH", 3, 0, false);
        return (SubLObject)graph_utilities.NIL;
    }
    
    public static SubLObject init_graph_utilities_file() {
        graph_utilities.$extract_link_nodes_nodes$ = SubLFiles.defparameter("*EXTRACT-LINK-NODES-NODES*", (SubLObject)graph_utilities.NIL);
        graph_utilities.$extract_link_nodes_test$ = SubLFiles.defparameter("*EXTRACT-LINK-NODES-TEST*", (SubLObject)graph_utilities.NIL);
        return (SubLObject)graph_utilities.NIL;
    }
    
    public static SubLObject setup_graph_utilities_file() {
        generic_testing.define_test_case_table_int((SubLObject)graph_utilities.$sym28$TEST_COMPUTE_GRAPH_RANK_ESTIMATE, (SubLObject)ConsesLow.list(new SubLObject[] { graph_utilities.$kw29$TEST, Symbols.symbol_function((SubLObject)graph_utilities.EQUAL), graph_utilities.$kw30$OWNER, graph_utilities.NIL, graph_utilities.$kw31$CLASSES, graph_utilities.NIL, graph_utilities.$kw32$KB, graph_utilities.$kw33$TINY, graph_utilities.$kw34$WORKING_, graph_utilities.T }), (SubLObject)graph_utilities.$list35);
        generic_testing.define_test_case_table_int((SubLObject)graph_utilities.$sym42$TEST_DAG_IDENTIFY_LEAFS, (SubLObject)ConsesLow.list(new SubLObject[] { graph_utilities.$kw29$TEST, graph_utilities.NIL, graph_utilities.$kw30$OWNER, graph_utilities.NIL, graph_utilities.$kw31$CLASSES, graph_utilities.NIL, graph_utilities.$kw32$KB, graph_utilities.$kw33$TINY, graph_utilities.$kw34$WORKING_, graph_utilities.T }), (SubLObject)graph_utilities.$list43);
        generic_testing.define_test_case_table_int((SubLObject)graph_utilities.$sym46$TEST_DAG_IDENTIFY_ROOTS, (SubLObject)ConsesLow.list(new SubLObject[] { graph_utilities.$kw29$TEST, graph_utilities.NIL, graph_utilities.$kw30$OWNER, graph_utilities.NIL, graph_utilities.$kw31$CLASSES, graph_utilities.NIL, graph_utilities.$kw32$KB, graph_utilities.$kw33$TINY, graph_utilities.$kw34$WORKING_, graph_utilities.T }), (SubLObject)graph_utilities.$list47);
        generic_testing.define_test_case_table_int((SubLObject)graph_utilities.$sym52$TEST_DAG_ELIDE_FROM_GRAPH, (SubLObject)ConsesLow.list(new SubLObject[] { graph_utilities.$kw29$TEST, graph_utilities.NIL, graph_utilities.$kw30$OWNER, graph_utilities.NIL, graph_utilities.$kw31$CLASSES, graph_utilities.NIL, graph_utilities.$kw32$KB, graph_utilities.$kw33$TINY, graph_utilities.$kw34$WORKING_, graph_utilities.T }), (SubLObject)graph_utilities.$list53);
        return (SubLObject)graph_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_graph_utilities_file();
    }
    
    public void initializeVariables() {
        init_graph_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_graph_utilities_file();
    }
    
    static {
        me = (SubLFile)new graph_utilities();
        graph_utilities.$extract_link_nodes_nodes$ = null;
        graph_utilities.$extract_link_nodes_test$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GROUP-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("GROUP-LINKS"));
        $sym1$EXTRACT_LINK_NODES_INT = SubLObjectFactory.makeSymbol("EXTRACT-LINK-NODES-INT");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("LINKS"));
        $sym3$CAAR = SubLObjectFactory.makeSymbol("CAAR");
        $sym4$_ = SubLObjectFactory.makeSymbol("<");
        $sym5$LENGTH_FIRST = SubLObjectFactory.makeSymbol("LENGTH-FIRST");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("CHILDREN"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TESTFN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)graph_utilities.EQL)))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TESTFN"));
        $kw8$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw9$TESTFN = SubLObjectFactory.makeKeyword("TESTFN");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)graph_utilities.EQL);
        $sym11$SEEN = SubLObjectFactory.makeUninternedSymbol("SEEN");
        $sym12$TODO = SubLObjectFactory.makeUninternedSymbol("TODO");
        $sym13$CHILD = SubLObjectFactory.makeUninternedSymbol("CHILD");
        $sym14$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym15$NEW_SET = SubLObjectFactory.makeSymbol("NEW-SET");
        $list16 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-QUEUE")));
        $sym17$ENQUEUE = SubLObjectFactory.makeSymbol("ENQUEUE");
        $sym18$SET_ADD = SubLObjectFactory.makeSymbol("SET-ADD");
        $sym19$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym20$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym21$QUEUE_EMPTY_P = SubLObjectFactory.makeSymbol("QUEUE-EMPTY-P");
        $sym22$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym23$DEQUEUE = SubLObjectFactory.makeSymbol("DEQUEUE");
        $sym24$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym25$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym26$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym27$SET_MEMBER_ = SubLObjectFactory.makeSymbol("SET-MEMBER?");
        $sym28$TEST_COMPUTE_GRAPH_RANK_ESTIMATE = SubLObjectFactory.makeSymbol("TEST-COMPUTE-GRAPH-RANK-ESTIMATE");
        $kw29$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw30$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw31$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw32$KB = SubLObjectFactory.makeKeyword("KB");
        $kw33$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw34$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)graph_utilities.SEVEN_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)graph_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)graph_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)graph_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)graph_utilities.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)graph_utilities.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)graph_utilities.ONE_INTEGER))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)graph_utilities.TEN_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)graph_utilities.EIGHT_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)graph_utilities.EIGHT_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)graph_utilities.SEVEN_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)graph_utilities.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)graph_utilities.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)graph_utilities.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)graph_utilities.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)graph_utilities.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)graph_utilities.ONE_INTEGER))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("D"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)graph_utilities.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)graph_utilities.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)graph_utilities.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)graph_utilities.FOUR_INTEGER))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str36$The_expected_map_size__A_differs_ = SubLObjectFactory.makeString("The expected map size ~A differs from the generated size ~A.");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPECTED-VALUE"));
        $str38$Expected_rank_estimate__A_for__A_ = SubLObjectFactory.makeString("Expected rank estimate ~A for ~A, got ~A.");
        $kw39$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $sym40$MAP_P = SubLObjectFactory.makeSymbol("MAP-P");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER-NODES"));
        $sym42$TEST_DAG_IDENTIFY_LEAFS = SubLObjectFactory.makeSymbol("TEST-DAG-IDENTIFY-LEAFS");
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("G"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("G"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("F"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str44$Expected__A_leafs__got__A_leafs_i = SubLObjectFactory.makeString("Expected ~A leafs, got ~A leafs instead.");
        $str45$The_expected_leaf_set__A_differs_ = SubLObjectFactory.makeString("The expected leaf set ~A differs from the computed leaf set ~A.");
        $sym46$TEST_DAG_IDENTIFY_ROOTS = SubLObjectFactory.makeSymbol("TEST-DAG-IDENTIFY-ROOTS");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("G"))), (SubLObject)graph_utilities.NIL), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str48$Expected__A_roots__got__A_roots_i = SubLObjectFactory.makeString("Expected ~A roots, got ~A roots instead.");
        $str49$The_expected_roots_set__A_differs = SubLObjectFactory.makeString("The expected roots set ~A differs from the computed roots set ~A.");
        $sym50$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"));
        $sym52$TEST_DAG_ELIDE_FROM_GRAPH = SubLObjectFactory.makeSymbol("TEST-DAG-ELIDE-FROM-GRAPH");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A")))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("G"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("G")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B")))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("F"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("G"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str54$_A_is_not_of_the_expected_size__A = SubLObjectFactory.makeString("~A is not of the expected size ~A, as ~A is.");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIORS"));
        $str56$_A_does_not_contain_the_expected_ = SubLObjectFactory.makeString("~A does not contain the expected key ~A, whose value should be ~A.");
        $str57$The_superiors_for_node__A_are__A_ = SubLObjectFactory.makeString("The superiors for node ~A are ~A, not ~A.");
        $str58$The_superior_for_node__A_is__A__n = SubLObjectFactory.makeString("The superior for node ~A is ~A, not ~A.");
    }
    
    public static final class $extract_link_nodes_int$UnaryFunction extends UnaryFunction
    {
        public $extract_link_nodes_int$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EXTRACT-LINK-NODES-INT"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return graph_utilities.extract_link_nodes_int(arg1);
        }
    }
    
    public static final class $length_first$UnaryFunction extends UnaryFunction
    {
        public $length_first$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("LENGTH-FIRST"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return graph_utilities.length_first(arg1);
        }
    }
}

/*

	Total time: 226 ms
	
*/