/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class ghl_marking_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new ghl_marking_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.ghl_marking_utilities";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $ghl_table$ = makeSymbol("*GHL-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $use_zero_size_ghl_marking_spacesP$ = makeSymbol("*USE-ZERO-SIZE-GHL-MARKING-SPACES?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list2 = list(makeSymbol("*GHL-TABLE*"));

    static private final SubLList $list3 = list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list4 = list(list(makeSymbol("*GHL-TABLE*"), list(makeSymbol("GHL-INSTANTIATE-NEW-SPACE"))));

    private static final SubLSymbol WITH_GHL_TABLE_VAR = makeSymbol("WITH-GHL-TABLE-VAR");

    static private final SubLList $list6 = list(list(makeSymbol("KEY-VAR"), makeSymbol("MARKING-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLInteger $int$200 = makeInteger(200);

    /**
     * Binds VAR to current *ghl-table*
     */
    @LispMethod(comment = "Binds VAR to current *ghl-table*")
    public static final SubLObject with_ghl_table_var_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(bq_cons(var, $list_alt2)), append(body, NIL));
            }
        }
    }

    /**
     * Binds VAR to current *ghl-table*
     */
    @LispMethod(comment = "Binds VAR to current *ghl-table*")
    public static SubLObject with_ghl_table_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(bq_cons(var, $list2)), append(body, NIL));
    }

    /**
     * Initialize *ghl-table* to a new hash table and bind NAME to this table.
     */
    @LispMethod(comment = "Initialize *ghl-table* to a new hash table and bind NAME to this table.")
    public static final SubLObject with_new_ghl_table_named_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            name = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(CLET, $list_alt4, listS(WITH_GHL_TABLE_VAR, name, append(body, NIL)));
            }
        }
    }

    /**
     * Initialize *ghl-table* to a new hash table and bind NAME to this table.
     */
    @LispMethod(comment = "Initialize *ghl-table* to a new hash table and bind NAME to this table.")
    public static SubLObject with_new_ghl_table_named(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        name = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, $list4, listS(WITH_GHL_TABLE_VAR, name, append(body, NIL)));
    }

    /**
     * Initialize *ghl-table* to a new hash table.
     */
    @LispMethod(comment = "Initialize *ghl-table* to a new hash table.")
    public static final SubLObject with_new_ghl_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt4, append(body, NIL));
        }
    }

    @LispMethod(comment = "Initialize *ghl-table* to a new hash table.")
    public static SubLObject with_new_ghl_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
    }

    public static final SubLObject do_ghl_marking_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key_var = NIL;
                    SubLObject marking_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    key_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    marking_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOHASH, listS(key_var, marking_var, $list_alt2), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt6);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_ghl_marking_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key_var = NIL;
        SubLObject marking_var = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        key_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        marking_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOHASH, listS(key_var, marking_var, $list2), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list6);
        return NIL;
    }

    public static final SubLObject ghl_marking_table_marked_nodes_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nodes = NIL;
                SubLObject cdohash_table = $ghl_table$.getDynamicValue(thread);
                SubLObject node = NIL;
                SubLObject marking = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            node = getEntryKey(cdohash_entry);
                            marking = getEntryValue(cdohash_entry);
                            if (NIL != marking) {
                                nodes = cons(node, nodes);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return nodes;
            }
        }
    }

    public static SubLObject ghl_marking_table_marked_nodes() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nodes = NIL;
        final SubLObject cdohash_table = $ghl_table$.getDynamicValue(thread);
        SubLObject node = NIL;
        SubLObject marking = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                node = getEntryKey(cdohash_entry);
                marking = getEntryValue(cdohash_entry);
                if (NIL != marking) {
                    nodes = cons(node, nodes);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return nodes;
    }

    public static final SubLObject ghl_instantiate_new_space_alt() {
        return make_hash_table($int$200, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ghl_instantiate_new_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return make_hash_table(NIL != $use_zero_size_ghl_marking_spacesP$.getDynamicValue(thread) ? ZERO_INTEGER : $int$200, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_ghl_marking_alt(SubLObject v_search, SubLObject node) {
        return gethash(node, ghl_search_vars.ghl_space(v_search), UNPROVIDED);
    }

    public static SubLObject get_ghl_marking(final SubLObject v_search, final SubLObject node) {
        return gethash(node, ghl_search_vars.ghl_space(v_search), UNPROVIDED);
    }

    public static final SubLObject get_ghl_goal_marking_alt(SubLObject v_search, SubLObject node) {
        return gethash(node, ghl_search_vars.ghl_goal_space(v_search), UNPROVIDED);
    }

    public static SubLObject get_ghl_goal_marking(final SubLObject v_search, final SubLObject node) {
        return gethash(node, ghl_search_vars.ghl_goal_space(v_search), UNPROVIDED);
    }

    public static final SubLObject ghl_marked_node_p_alt(SubLObject v_search, SubLObject node) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.ghl_marking_utilities.get_ghl_marking(v_search, node));
    }

    public static SubLObject ghl_marked_node_p(final SubLObject v_search, final SubLObject node) {
        return list_utilities.sublisp_boolean(get_ghl_marking(v_search, node));
    }

    public static final SubLObject ghl_goal_marked_node_p_alt(SubLObject v_search, SubLObject node) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.ghl_marking_utilities.get_ghl_goal_marking(v_search, node));
    }

    public static SubLObject ghl_goal_marked_node_p(final SubLObject v_search, final SubLObject node) {
        return list_utilities.sublisp_boolean(get_ghl_goal_marking(v_search, node));
    }

    public static final SubLObject ghl_node_marked_in_space_p_alt(SubLObject node, SubLObject space) {
        return list_utilities.sublisp_boolean(gethash(node, space, UNPROVIDED));
    }

    public static SubLObject ghl_node_marked_in_space_p(final SubLObject node, final SubLObject space) {
        return list_utilities.sublisp_boolean(gethash(node, space, UNPROVIDED));
    }

    public static final SubLObject ghl_mark_node_in_space_alt(SubLObject node, SubLObject mark, SubLObject space) {
        sethash(node, space, mark);
        return NIL;
    }

    public static SubLObject ghl_mark_node_in_space(final SubLObject node, final SubLObject mark, final SubLObject space) {
        sethash(node, space, mark);
        return NIL;
    }

    public static final SubLObject ghl_mark_node_alt(SubLObject v_search, SubLObject node, SubLObject mark) {
        {
            SubLObject space = ghl_search_vars.ghl_space(v_search);
            com.cyc.cycjava.cycl.ghl_marking_utilities.ghl_mark_node_in_space(node, mark, space);
        }
        return NIL;
    }

    public static SubLObject ghl_mark_node(final SubLObject v_search, final SubLObject node, final SubLObject mark) {
        final SubLObject space = ghl_search_vars.ghl_space(v_search);
        ghl_mark_node_in_space(node, mark, space);
        return NIL;
    }

    public static final SubLObject ghl_goal_mark_node_alt(SubLObject v_search, SubLObject node, SubLObject mark) {
        {
            SubLObject space = ghl_search_vars.ghl_goal_space(v_search);
            com.cyc.cycjava.cycl.ghl_marking_utilities.ghl_mark_node_in_space(node, mark, space);
        }
        return NIL;
    }

    public static SubLObject ghl_goal_mark_node(final SubLObject v_search, final SubLObject node, final SubLObject mark) {
        final SubLObject space = ghl_search_vars.ghl_goal_space(v_search);
        ghl_mark_node_in_space(node, mark, space);
        return NIL;
    }

    public static final SubLObject ghl_mark_node_in_ghl_table_alt(SubLObject node, SubLObject mark) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.ghl_marking_utilities.ghl_mark_node_in_space(node, mark, $ghl_table$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject ghl_mark_node_in_ghl_table(final SubLObject node, final SubLObject mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ghl_mark_node_in_space(node, mark, $ghl_table$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject ghl_unmark_node_alt(SubLObject v_search, SubLObject node) {
        com.cyc.cycjava.cycl.ghl_marking_utilities.ghl_mark_node(v_search, node, NIL);
        return NIL;
    }

    public static SubLObject ghl_unmark_node(final SubLObject v_search, final SubLObject node) {
        ghl_mark_node(v_search, node, NIL);
        return NIL;
    }

    public static final SubLObject ghl_node_with_equal_or_shallower_depth_p_alt(SubLObject v_search, SubLObject node, SubLObject depth) {
        {
            SubLObject marking = com.cyc.cycjava.cycl.ghl_marking_utilities.get_ghl_marking(v_search, node);
            if (marking.isInteger()) {
                return numGE(marking, depth);
            }
        }
        return NIL;
    }

    public static SubLObject ghl_node_with_equal_or_shallower_depth_p(final SubLObject v_search, final SubLObject node, final SubLObject depth) {
        final SubLObject marking = get_ghl_marking(v_search, node);
        if (marking.isInteger()) {
            return numGE(marking, depth);
        }
        return NIL;
    }

    public static final SubLObject ghl_goal_node_with_equal_or_shallower_depth_p_alt(SubLObject v_search, SubLObject node, SubLObject depth) {
        {
            SubLObject marking = com.cyc.cycjava.cycl.ghl_marking_utilities.get_ghl_goal_marking(v_search, node);
            if (marking.isInteger()) {
                return numGE(marking, depth);
            }
        }
        return NIL;
    }

    public static SubLObject ghl_goal_node_with_equal_or_shallower_depth_p(final SubLObject v_search, final SubLObject node, final SubLObject depth) {
        final SubLObject marking = get_ghl_goal_marking(v_search, node);
        if (marking.isInteger()) {
            return numGE(marking, depth);
        }
        return NIL;
    }

    /**
     * Modifier: adjoins MARKING to marking state of NODE.
     */
    @LispMethod(comment = "Modifier: adjoins MARKING to marking state of NODE.")
    public static final SubLObject prepend_to_ghl_marking_state_alt(SubLObject v_search, SubLObject node, SubLObject marking) {
        {
            SubLObject space = ghl_search_vars.ghl_space(v_search);
            hash_table_utilities.push_hash(node, marking, space);
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: adjoins MARKING to marking state of NODE.")
    public static SubLObject prepend_to_ghl_marking_state(final SubLObject v_search, final SubLObject node, final SubLObject marking) {
        final SubLObject space = ghl_search_vars.ghl_space(v_search);
        hash_table_utilities.push_hash(node, marking, space);
        return NIL;
    }

    public static final SubLObject ghl_goal_mark_node_as_searched_alt(SubLObject v_search, SubLObject node) {
        com.cyc.cycjava.cycl.ghl_marking_utilities.ghl_goal_mark_node(v_search, node, T);
        return NIL;
    }

    public static SubLObject ghl_goal_mark_node_as_searched(final SubLObject v_search, final SubLObject node) {
        ghl_goal_mark_node(v_search, node, T);
        return NIL;
    }

    /**
     *
     *
     * @return integerp; the number of nodes marked in SPACE.
     */
    @LispMethod(comment = "@return integerp; the number of nodes marked in SPACE.")
    public static final SubLObject ghl_marked_cardinality_alt(SubLObject space) {
        return hash_table_count(space);
    }

    /**
     *
     *
     * @return integerp; the number of nodes marked in SPACE.
     */
    @LispMethod(comment = "@return integerp; the number of nodes marked in SPACE.")
    public static SubLObject ghl_marked_cardinality(final SubLObject space) {
        return hash_table_count(space);
    }

    public static SubLObject declare_ghl_marking_utilities_file() {
        declareMacro("with_ghl_table_var", "WITH-GHL-TABLE-VAR");
        declareMacro("with_new_ghl_table_named", "WITH-NEW-GHL-TABLE-NAMED");
        declareMacro("with_new_ghl_table", "WITH-NEW-GHL-TABLE");
        declareMacro("do_ghl_marking_table", "DO-GHL-MARKING-TABLE");
        declareFunction("ghl_marking_table_marked_nodes", "GHL-MARKING-TABLE-MARKED-NODES", 0, 0, false);
        declareFunction("ghl_instantiate_new_space", "GHL-INSTANTIATE-NEW-SPACE", 0, 0, false);
        declareFunction("get_ghl_marking", "GET-GHL-MARKING", 2, 0, false);
        declareFunction("get_ghl_goal_marking", "GET-GHL-GOAL-MARKING", 2, 0, false);
        declareFunction("ghl_marked_node_p", "GHL-MARKED-NODE-P", 2, 0, false);
        declareFunction("ghl_goal_marked_node_p", "GHL-GOAL-MARKED-NODE-P", 2, 0, false);
        declareFunction("ghl_node_marked_in_space_p", "GHL-NODE-MARKED-IN-SPACE-P", 2, 0, false);
        declareFunction("ghl_mark_node_in_space", "GHL-MARK-NODE-IN-SPACE", 3, 0, false);
        declareFunction("ghl_mark_node", "GHL-MARK-NODE", 3, 0, false);
        declareFunction("ghl_goal_mark_node", "GHL-GOAL-MARK-NODE", 3, 0, false);
        declareFunction("ghl_mark_node_in_ghl_table", "GHL-MARK-NODE-IN-GHL-TABLE", 2, 0, false);
        declareFunction("ghl_unmark_node", "GHL-UNMARK-NODE", 2, 0, false);
        declareFunction("ghl_node_with_equal_or_shallower_depth_p", "GHL-NODE-WITH-EQUAL-OR-SHALLOWER-DEPTH-P", 3, 0, false);
        declareFunction("ghl_goal_node_with_equal_or_shallower_depth_p", "GHL-GOAL-NODE-WITH-EQUAL-OR-SHALLOWER-DEPTH-P", 3, 0, false);
        declareFunction("prepend_to_ghl_marking_state", "PREPEND-TO-GHL-MARKING-STATE", 3, 0, false);
        declareFunction("ghl_goal_mark_node_as_searched", "GHL-GOAL-MARK-NODE-AS-SEARCHED", 2, 0, false);
        declareFunction("ghl_marked_cardinality", "GHL-MARKED-CARDINALITY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_ghl_marking_utilities_file() {
        defparameter("*GHL-TABLE*", NIL);
        defparameter("*USE-ZERO-SIZE-GHL-MARKING-SPACES?*", NIL);
        return NIL;
    }

    public static SubLObject setup_ghl_marking_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ghl_marking_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_ghl_marking_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ghl_marking_utilities_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt2 = list(makeSymbol("*GHL-TABLE*"));

    static private final SubLList $list_alt3 = list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt4 = list(list(makeSymbol("*GHL-TABLE*"), list(makeSymbol("GHL-INSTANTIATE-NEW-SPACE"))));

    static private final SubLList $list_alt6 = list(list(makeSymbol("KEY-VAR"), makeSymbol("MARKING-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
}

/**
 * Total time: 96 ms
 */
