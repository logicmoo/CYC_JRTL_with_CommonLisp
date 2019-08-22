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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class ghl_marking_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new ghl_marking_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.ghl_marking_utilities";

    public static final String myFingerPrint = "ce0ccdc217bc742913db67916c5e9b97a49415c798ed92e6e465ecde8046a959";

    // defparameter
    // Definitions
    public static final SubLSymbol $ghl_table$ = makeSymbol("*GHL-TABLE*");

    // defparameter
    public static final SubLSymbol $use_zero_size_ghl_marking_spacesP$ = makeSymbol("*USE-ZERO-SIZE-GHL-MARKING-SPACES?*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list2 = list(makeSymbol("*GHL-TABLE*"));

    public static final SubLList $list3 = list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list4 = list(list(makeSymbol("*GHL-TABLE*"), list(makeSymbol("GHL-INSTANTIATE-NEW-SPACE"))));

    public static final SubLSymbol WITH_GHL_TABLE_VAR = makeSymbol("WITH-GHL-TABLE-VAR");

    public static final SubLList $list6 = list(list(makeSymbol("KEY-VAR"), makeSymbol("MARKING-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLInteger $int$200 = makeInteger(200);

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

    public static SubLObject with_new_ghl_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
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

    public static SubLObject ghl_instantiate_new_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return make_hash_table(NIL != $use_zero_size_ghl_marking_spacesP$.getDynamicValue(thread) ? ZERO_INTEGER : $int$200, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_ghl_marking(final SubLObject v_search, final SubLObject node) {
        return gethash(node, ghl_search_vars.ghl_space(v_search), UNPROVIDED);
    }

    public static SubLObject get_ghl_goal_marking(final SubLObject v_search, final SubLObject node) {
        return gethash(node, ghl_search_vars.ghl_goal_space(v_search), UNPROVIDED);
    }

    public static SubLObject ghl_marked_node_p(final SubLObject v_search, final SubLObject node) {
        return list_utilities.sublisp_boolean(get_ghl_marking(v_search, node));
    }

    public static SubLObject ghl_goal_marked_node_p(final SubLObject v_search, final SubLObject node) {
        return list_utilities.sublisp_boolean(get_ghl_goal_marking(v_search, node));
    }

    public static SubLObject ghl_node_marked_in_space_p(final SubLObject node, final SubLObject space) {
        return list_utilities.sublisp_boolean(gethash(node, space, UNPROVIDED));
    }

    public static SubLObject ghl_mark_node_in_space(final SubLObject node, final SubLObject mark, final SubLObject space) {
        sethash(node, space, mark);
        return NIL;
    }

    public static SubLObject ghl_mark_node(final SubLObject v_search, final SubLObject node, final SubLObject mark) {
        final SubLObject space = ghl_search_vars.ghl_space(v_search);
        ghl_mark_node_in_space(node, mark, space);
        return NIL;
    }

    public static SubLObject ghl_goal_mark_node(final SubLObject v_search, final SubLObject node, final SubLObject mark) {
        final SubLObject space = ghl_search_vars.ghl_goal_space(v_search);
        ghl_mark_node_in_space(node, mark, space);
        return NIL;
    }

    public static SubLObject ghl_mark_node_in_ghl_table(final SubLObject node, final SubLObject mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ghl_mark_node_in_space(node, mark, $ghl_table$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject ghl_unmark_node(final SubLObject v_search, final SubLObject node) {
        ghl_mark_node(v_search, node, NIL);
        return NIL;
    }

    public static SubLObject ghl_node_with_equal_or_shallower_depth_p(final SubLObject v_search, final SubLObject node, final SubLObject depth) {
        final SubLObject marking = get_ghl_marking(v_search, node);
        if (marking.isInteger()) {
            return numGE(marking, depth);
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

    public static SubLObject prepend_to_ghl_marking_state(final SubLObject v_search, final SubLObject node, final SubLObject marking) {
        final SubLObject space = ghl_search_vars.ghl_space(v_search);
        hash_table_utilities.push_hash(node, marking, space);
        return NIL;
    }

    public static SubLObject ghl_goal_mark_node_as_searched(final SubLObject v_search, final SubLObject node) {
        ghl_goal_mark_node(v_search, node, T);
        return NIL;
    }

    public static SubLObject ghl_marked_cardinality(final SubLObject space) {
        return hash_table_count(space);
    }

    public static SubLObject declare_ghl_marking_utilities_file() {
        declareMacro(me, "with_ghl_table_var", "WITH-GHL-TABLE-VAR");
        declareMacro(me, "with_new_ghl_table_named", "WITH-NEW-GHL-TABLE-NAMED");
        declareMacro(me, "with_new_ghl_table", "WITH-NEW-GHL-TABLE");
        declareMacro(me, "do_ghl_marking_table", "DO-GHL-MARKING-TABLE");
        declareFunction(me, "ghl_marking_table_marked_nodes", "GHL-MARKING-TABLE-MARKED-NODES", 0, 0, false);
        declareFunction(me, "ghl_instantiate_new_space", "GHL-INSTANTIATE-NEW-SPACE", 0, 0, false);
        declareFunction(me, "get_ghl_marking", "GET-GHL-MARKING", 2, 0, false);
        declareFunction(me, "get_ghl_goal_marking", "GET-GHL-GOAL-MARKING", 2, 0, false);
        declareFunction(me, "ghl_marked_node_p", "GHL-MARKED-NODE-P", 2, 0, false);
        declareFunction(me, "ghl_goal_marked_node_p", "GHL-GOAL-MARKED-NODE-P", 2, 0, false);
        declareFunction(me, "ghl_node_marked_in_space_p", "GHL-NODE-MARKED-IN-SPACE-P", 2, 0, false);
        declareFunction(me, "ghl_mark_node_in_space", "GHL-MARK-NODE-IN-SPACE", 3, 0, false);
        declareFunction(me, "ghl_mark_node", "GHL-MARK-NODE", 3, 0, false);
        declareFunction(me, "ghl_goal_mark_node", "GHL-GOAL-MARK-NODE", 3, 0, false);
        declareFunction(me, "ghl_mark_node_in_ghl_table", "GHL-MARK-NODE-IN-GHL-TABLE", 2, 0, false);
        declareFunction(me, "ghl_unmark_node", "GHL-UNMARK-NODE", 2, 0, false);
        declareFunction(me, "ghl_node_with_equal_or_shallower_depth_p", "GHL-NODE-WITH-EQUAL-OR-SHALLOWER-DEPTH-P", 3, 0, false);
        declareFunction(me, "ghl_goal_node_with_equal_or_shallower_depth_p", "GHL-GOAL-NODE-WITH-EQUAL-OR-SHALLOWER-DEPTH-P", 3, 0, false);
        declareFunction(me, "prepend_to_ghl_marking_state", "PREPEND-TO-GHL-MARKING-STATE", 3, 0, false);
        declareFunction(me, "ghl_goal_mark_node_as_searched", "GHL-GOAL-MARK-NODE-AS-SEARCHED", 2, 0, false);
        declareFunction(me, "ghl_marked_cardinality", "GHL-MARKED-CARDINALITY", 1, 0, false);
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

    
}

/**
 * Total time: 96 ms
 */
