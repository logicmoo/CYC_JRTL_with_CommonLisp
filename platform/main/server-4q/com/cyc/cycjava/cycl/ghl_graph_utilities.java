/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GHL-GRAPH-UTILITIES
 * source file: /cyc/top/cycl/ghl-graph-utilities.lisp
 * created:     2019/07/03 17:37:25
 */
public final class ghl_graph_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new ghl_graph_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.ghl_graph_utilities";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$Invalid_ghl_edge__a = makeString("Invalid ghl-edge ~a");

    // Definitions
    /**
     *
     *
     * @return booleanp; whether OBJECT is a ghl-node.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a ghl-node.")
    public static final SubLObject ghl_node_p_alt(SubLObject v_object) {
        return forts.fort_p(v_object);
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a ghl-node.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a ghl-node.")
    public static SubLObject ghl_node_p(final SubLObject v_object) {
        return forts.fort_p(v_object);
    }// Definitions


    /**
     *
     *
     * @return booleanp; whether OBJECT is a ghl-edge
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a ghl-edge")
    public static final SubLObject ghl_edge_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) || (NIL != arguments.hl_support_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a ghl-edge
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a ghl-edge")
    public static SubLObject ghl_edge_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) || (NIL != arguments.hl_support_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp; whether EDGE indicates a directed edge.
     */
    @LispMethod(comment = "@return booleanp; whether EDGE indicates a directed edge.")
    public static final SubLObject ghl_directed_edge_p_alt(SubLObject edge) {
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether EDGE indicates a directed edge.
     */
    @LispMethod(comment = "@return booleanp; whether EDGE indicates a directed edge.")
    public static SubLObject ghl_directed_edge_p(final SubLObject edge) {
        return NIL;
    }

    /**
     * returns either EDGE's assertion predicate or hl-module.
     */
    @LispMethod(comment = "returns either EDGE\'s assertion predicate or hl-module.")
    public static final SubLObject ghl_edge_label_alt(SubLObject edge) {
        if (NIL != assertions_high.gaf_assertionP(edge)) {
            return assertions_high.gaf_predicate(edge);
        } else {
            if (NIL != arguments.hl_support_p(edge)) {
                return com.cyc.cycjava.cycl.ghl_graph_utilities.hl_support_literal_predicate(edge);
            } else {
                ghl_search_vars.ghl_error(ONE_INTEGER, $str_alt0$Invalid_ghl_edge__a, edge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "returns either EDGE\'s assertion predicate or hl-module.")
    public static SubLObject ghl_edge_label(final SubLObject edge) {
        if (NIL != assertions_high.gaf_assertionP(edge)) {
            return assertions_high.gaf_predicate(edge);
        }
        if (NIL != arguments.hl_support_p(edge)) {
            return hl_support_literal_predicate(edge);
        }
        ghl_search_vars.ghl_error(ONE_INTEGER, $str0$Invalid_ghl_edge__a, edge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject hl_support_literal_predicate_alt(SubLObject hl_support) {
        return cycl_utilities.atomic_sentence_predicate(arguments.support_sentence(hl_support));
    }

    public static SubLObject hl_support_literal_predicate(final SubLObject hl_support) {
        return cycl_utilities.atomic_sentence_predicate(arguments.support_sentence(hl_support));
    }

    /**
     *
     *
     * @return ghl-node-p; the start, index, or from node for EDGE.
     */
    @LispMethod(comment = "@return ghl-node-p; the start, index, or from node for EDGE.")
    public static final SubLObject ghl_edge_start_node_alt(SubLObject edge) {
        if (NIL != assertions_high.gaf_assertionP(edge)) {
            return assertions_high.gaf_arg1(edge);
        } else {
            if (NIL != arguments.hl_support_p(edge)) {
                return cycl_utilities.atomic_sentence_arg1(arguments.support_sentence(edge), UNPROVIDED);
            } else {
                ghl_search_vars.ghl_error(ONE_INTEGER, $str_alt0$Invalid_ghl_edge__a, edge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return ghl-node-p; the start, index, or from node for EDGE.
     */
    @LispMethod(comment = "@return ghl-node-p; the start, index, or from node for EDGE.")
    public static SubLObject ghl_edge_start_node(final SubLObject edge) {
        if (NIL != assertions_high.gaf_assertionP(edge)) {
            return assertions_high.gaf_arg1(edge);
        }
        if (NIL != arguments.hl_support_p(edge)) {
            return cycl_utilities.atomic_sentence_arg1(arguments.support_sentence(edge), UNPROVIDED);
        }
        ghl_search_vars.ghl_error(ONE_INTEGER, $str0$Invalid_ghl_edge__a, edge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @return ghl-node-p; the end, gather, or to node for EDGE.
     */
    @LispMethod(comment = "@return ghl-node-p; the end, gather, or to node for EDGE.")
    public static final SubLObject ghl_edge_end_node_alt(SubLObject edge) {
        if (NIL != assertions_high.gaf_assertionP(edge)) {
            return assertions_high.gaf_arg2(edge);
        } else {
            if (NIL != arguments.hl_support_p(edge)) {
                return cycl_utilities.atomic_sentence_arg2(arguments.support_sentence(edge), UNPROVIDED);
            } else {
                ghl_search_vars.ghl_error(ONE_INTEGER, $str_alt0$Invalid_ghl_edge__a, edge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return ghl-node-p; the end, gather, or to node for EDGE.
     */
    @LispMethod(comment = "@return ghl-node-p; the end, gather, or to node for EDGE.")
    public static SubLObject ghl_edge_end_node(final SubLObject edge) {
        if (NIL != assertions_high.gaf_assertionP(edge)) {
            return assertions_high.gaf_arg2(edge);
        }
        if (NIL != arguments.hl_support_p(edge)) {
            return cycl_utilities.atomic_sentence_arg2(arguments.support_sentence(edge), UNPROVIDED);
        }
        ghl_search_vars.ghl_error(ONE_INTEGER, $str0$Invalid_ghl_edge__a, edge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @return microtheory-p; the mt for EDGE.
     */
    @LispMethod(comment = "@return microtheory-p; the mt for EDGE.")
    public static final SubLObject ghl_edge_mt_alt(SubLObject edge) {
        if (NIL != assertions_high.gaf_assertionP(edge)) {
            return assertions_high.assertion_mt(edge);
        } else {
            if (NIL != arguments.hl_support_p(edge)) {
                return arguments.support_mt(edge);
            } else {
                ghl_search_vars.ghl_error(ONE_INTEGER, $str_alt0$Invalid_ghl_edge__a, edge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return microtheory-p; the mt for EDGE.
     */
    @LispMethod(comment = "@return microtheory-p; the mt for EDGE.")
    public static SubLObject ghl_edge_mt(final SubLObject edge) {
        if (NIL != assertions_high.gaf_assertionP(edge)) {
            return assertions_high.assertion_mt(edge);
        }
        if (NIL != arguments.hl_support_p(edge)) {
            return arguments.support_mt(edge);
        }
        ghl_search_vars.ghl_error(ONE_INTEGER, $str0$Invalid_ghl_edge__a, edge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject declare_ghl_graph_utilities_file() {
        declareFunction("ghl_node_p", "GHL-NODE-P", 1, 0, false);
        declareFunction("ghl_edge_p", "GHL-EDGE-P", 1, 0, false);
        declareFunction("ghl_directed_edge_p", "GHL-DIRECTED-EDGE-P", 1, 0, false);
        declareFunction("ghl_edge_label", "GHL-EDGE-LABEL", 1, 0, false);
        declareFunction("hl_support_literal_predicate", "HL-SUPPORT-LITERAL-PREDICATE", 1, 0, false);
        declareFunction("ghl_edge_start_node", "GHL-EDGE-START-NODE", 1, 0, false);
        declareFunction("ghl_edge_end_node", "GHL-EDGE-END-NODE", 1, 0, false);
        declareFunction("ghl_edge_mt", "GHL-EDGE-MT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_ghl_graph_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_ghl_graph_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ghl_graph_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_ghl_graph_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ghl_graph_utilities_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$Invalid_ghl_edge__a = makeString("Invalid ghl-edge ~a");
}

/**
 * Total time: 67 ms
 */
