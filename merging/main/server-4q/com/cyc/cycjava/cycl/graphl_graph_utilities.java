/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GRAPHL-GRAPH-UTILITIES
 * source file: /cyc/top/cycl/graphl-graph-utilities.lisp
 * created:     2019/07/03 17:37:25
 */
public final class graphl_graph_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new graphl_graph_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.graphl_graph_utilities";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $graphl_finishedP$ = makeSymbol("*GRAPHL-FINISHED?*");

    static private final SubLList $list1 = list(list(makeSymbol("*GRAPHL-FINISHED?*"), NIL));

    // Definitions
    /**
     *
     *
     * @return booleanp; whether OBJECT is a graphl-node.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a graphl-node.")
    public static final SubLObject graphl_node_p_alt(SubLObject v_object) {
        return makeBoolean(NIL != v_object);
    }

    // Definitions
    /**
     *
     *
     * @return booleanp; whether OBJECT is a graphl-node.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a graphl-node.")
    public static SubLObject graphl_node_p(final SubLObject v_object) {
        return makeBoolean(NIL != v_object);
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a graphl-edge
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a graphl-edge")
    public static final SubLObject graphl_edge_p_alt(SubLObject v_object) {
        return makeBoolean(NIL != v_object);
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a graphl-edge
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a graphl-edge")
    public static SubLObject graphl_edge_p(final SubLObject v_object) {
        return makeBoolean(NIL != v_object);
    }

    /**
     *
     *
     * @return booleanp; whether EDGE indicates a directed edge.
     */
    @LispMethod(comment = "@return booleanp; whether EDGE indicates a directed edge.")
    public static final SubLObject graphl_directed_edge_p_alt(SubLObject edge) {
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether EDGE indicates a directed edge.
     */
    @LispMethod(comment = "@return booleanp; whether EDGE indicates a directed edge.")
    public static SubLObject graphl_directed_edge_p(final SubLObject edge) {
        return NIL;
    }

    /**
     * returns either EDGE's label
     */
    @LispMethod(comment = "returns either EDGE\'s label")
    public static final SubLObject graphl_edge_label_alt(SubLObject edge) {
        return NIL;
    }

    @LispMethod(comment = "returns either EDGE\'s label")
    public static SubLObject graphl_edge_label(final SubLObject edge) {
        return NIL;
    }/**
     * returns either EDGE's label
     */


    /**
     *
     *
     * @return graphl-node-p; the start, index, or from node for EDGE.
     */
    @LispMethod(comment = "@return graphl-node-p; the start, index, or from node for EDGE.")
    public static final SubLObject graphl_edge_start_node_alt(SubLObject edge) {
        return NIL;
    }

    /**
     *
     *
     * @return graphl-node-p; the start, index, or from node for EDGE.
     */
    @LispMethod(comment = "@return graphl-node-p; the start, index, or from node for EDGE.")
    public static SubLObject graphl_edge_start_node(final SubLObject edge) {
        return NIL;
    }

    /**
     *
     *
     * @return graphl-node-p; the end, gather, or to node for EDGE.
     */
    @LispMethod(comment = "@return graphl-node-p; the end, gather, or to node for EDGE.")
    public static final SubLObject graphl_edge_end_node_alt(SubLObject edge) {
        return NIL;
    }

    /**
     *
     *
     * @return graphl-node-p; the end, gather, or to node for EDGE.
     */
    @LispMethod(comment = "@return graphl-node-p; the end, gather, or to node for EDGE.")
    public static SubLObject graphl_edge_end_node(final SubLObject edge) {
        return NIL;
    }

    public static final SubLObject with_new_graphl_finished_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt1, append(body, NIL));
        }
    }

    public static SubLObject with_new_graphl_finished(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static final SubLObject set_graphl_finished_alt() {
        $graphl_finishedP$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject set_graphl_finished() {
        $graphl_finishedP$.setDynamicValue(T);
        return NIL;
    }

    public static final SubLObject reset_graphl_finished_alt() {
        $graphl_finishedP$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject reset_graphl_finished() {
        $graphl_finishedP$.setDynamicValue(NIL);
        return NIL;
    }

    public static final SubLObject graphl_add_unwind_edges_now_p_alt(SubLObject v_search) {
        return makeBoolean((NIL != graphl_search_vars.graphl_add_edges_on_unwind_p(v_search)) && ((NIL == graphl_search_vars.graphl_goal_search_p(v_search)) || (NIL != graphl_search_vars.graphl_goal_found_p(v_search))));
    }

    public static SubLObject graphl_add_unwind_edges_now_p(final SubLObject v_search) {
        return makeBoolean((NIL != graphl_search_vars.graphl_add_edges_on_unwind_p(v_search)) && ((NIL == graphl_search_vars.graphl_goal_search_p(v_search)) || (NIL != graphl_search_vars.graphl_goal_found_p(v_search))));
    }

    public static SubLObject declare_graphl_graph_utilities_file() {
        declareFunction("graphl_node_p", "GRAPHL-NODE-P", 1, 0, false);
        declareFunction("graphl_edge_p", "GRAPHL-EDGE-P", 1, 0, false);
        declareFunction("graphl_directed_edge_p", "GRAPHL-DIRECTED-EDGE-P", 1, 0, false);
        declareFunction("graphl_edge_label", "GRAPHL-EDGE-LABEL", 1, 0, false);
        declareFunction("graphl_edge_start_node", "GRAPHL-EDGE-START-NODE", 1, 0, false);
        declareFunction("graphl_edge_end_node", "GRAPHL-EDGE-END-NODE", 1, 0, false);
        declareMacro("with_new_graphl_finished", "WITH-NEW-GRAPHL-FINISHED");
        declareFunction("set_graphl_finished", "SET-GRAPHL-FINISHED", 0, 0, false);
        declareFunction("reset_graphl_finished", "RESET-GRAPHL-FINISHED", 0, 0, false);
        declareFunction("graphl_add_unwind_edges_now_p", "GRAPHL-ADD-UNWIND-EDGES-NOW-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_graphl_graph_utilities_file() {
        defparameter("*GRAPHL-FINISHED?*", NIL);
        return NIL;
    }

    public static SubLObject setup_graphl_graph_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_graphl_graph_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_graphl_graph_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_graphl_graph_utilities_file();
    }

    

    static private final SubLList $list_alt1 = list(list(makeSymbol("*GRAPHL-FINISHED?*"), NIL));
}

/**
 * Total time: 66 ms
 */
