/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class glf_api_widgets extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt9$ = makeString("");

    public static final SubLFile me = new glf_api_widgets();

 public static final String myName = "com.cyc.cycjava.cycl.glf_api_widgets";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $glf_success_for_kb_operations$ = makeSymbol("*GLF-SUCCESS-FOR-KB-OPERATIONS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol GET_GLF_GRAPH_IN_XML = makeSymbol("GET-GLF-GRAPH-IN-XML");

    static private final SubLString $$$glfGraph = makeString("glfGraph");

    static private final SubLString $str2$http___www_opencyc_org_xml_glf_dt = makeString("http://www.opencyc.org/xml/glf.dtd");

    static private final SubLString $str3$All_KB_operations_completed_witho = makeString("All KB operations completed without error.");

    private static final SubLSymbol GLF_SUGGEST_NEW_NODE_NAME = makeSymbol("GLF-SUGGEST-NEW-NODE-NAME");

    static private final SubLString $$$GLFNode = makeString("GLFNode");

    private static final SubLSymbol GLF_ADD_NODE = makeSymbol("GLF-ADD-NODE");



    static private final SubLString $str8$Invalid_graph_specified_ = makeString("Invalid graph specified.");

    static private final SubLString $str9$ = makeString("");



    static private final SubLList $list11 = list(reader_make_constant_shell("Individual"));

    static private final SubLList $list12 = list(reader_make_constant_shell("UniversalVocabularyMt"));



    private static final SubLSymbol GLF_DROP_NODE = makeSymbol("GLF-DROP-NODE");

    private static final SubLSymbol GLF_ADD_NODE_SEMANTICS = makeSymbol("GLF-ADD-NODE-SEMANTICS");

    private static final SubLSymbol GLF_DROP_NODE_SEMANTICS = makeSymbol("GLF-DROP-NODE-SEMANTICS");

    private static final SubLSymbol GLF_ADD_NODE_LABEL = makeSymbol("GLF-ADD-NODE-LABEL");



    private static final SubLSymbol GLF_DROP_NODE_LABEL = makeSymbol("GLF-DROP-NODE-LABEL");

    private static final SubLSymbol GLF_SUGGEST_NEW_ARC_NAME = makeSymbol("GLF-SUGGEST-NEW-ARC-NAME");

    static private final SubLString $$$GLFArc = makeString("GLFArc");

    private static final SubLSymbol GLF_ADD_ARC = makeSymbol("GLF-ADD-ARC");





    private static final SubLSymbol GLF_DROP_ARC = makeSymbol("GLF-DROP-ARC");

    private static final SubLSymbol GLF_CONNECT_ARC_UP = makeSymbol("GLF-CONNECT-ARC-UP");

    static private final SubLString $str27$Multiple_from_nodes_are_currently = makeString("Multiple from-nodes are currently not supported.");



    private static final SubLSymbol GLF_DISCONNECT_ARC = makeSymbol("GLF-DISCONNECT-ARC");

    static private final SubLList $list30 = list(makeSymbol("?FROM"), makeSymbol("?TO"));

    static private final SubLSymbol $sym31$_FROM = makeSymbol("?FROM");

    static private final SubLSymbol $sym32$_TO = makeSymbol("?TO");

    static private final SubLList $list33 = list(makeSymbol("FROM"), makeSymbol("TO"));

    private static final SubLSymbol GLF_ADD_ARC_LABEL = makeSymbol("GLF-ADD-ARC-LABEL");

    private static final SubLSymbol GLF_DROP_ARC_LABEL = makeSymbol("GLF-DROP-ARC-LABEL");

    private static final SubLSymbol GLF_ADD_ARC_SEMANTICS = makeSymbol("GLF-ADD-ARC-SEMANTICS");

    private static final SubLSymbol GLF_DROP_ARC_SEMANTICS = makeSymbol("GLF-DROP-ARC-SEMANTICS");

    static private final SubLString $str38$_A__D = makeString("~A-~D");

    static private final SubLList $list39 = list(makeSymbol("SENTENCE"), makeSymbol("ELMT"));

    private static final SubLObject $$glfNodeSemantics_Underspecified = reader_make_constant_shell("glfNodeSemantics-Underspecified");

    private static final SubLObject $const41$variableMappingTableForGLFArcInDi = reader_make_constant_shell("variableMappingTableForGLFArcInDiagram");



    static private final SubLList $list44 = list(makeKeyword("PROPERTY"));

    // Definitions
    /**
     * Return a GLF graph as an XML encoded string.
     */
    @LispMethod(comment = "Return a GLF graph as an XML encoded string.")
    public static final SubLObject get_glf_graph_in_xml_alt(SubLObject graph_id, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            graph_id = czer_main.coerce_to_fort(graph_id);
            mt = hlmt_czer.coerce_to_hlmt(mt);
            {
                SubLObject glf_graph = NIL;
                SubLObject xml_string = NIL;
                glf_graph = graphic_library_format.load_glf_graph_from_kb(graph_id, mt);
                {
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        {
                            SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                            try {
                                xml_vars.$xml_stream$.bind(stream, thread);
                                xml_utilities.generate_valid_xml_header(stream);
                                xml_utilities.generate_xml_header_entry_for_dtd($$$glfGraph, $str_alt2$http___www_opencyc_org_xml_glf_dt, stream);
                                xml_utilities.xml_terpri();
                                graphic_library_format.xml_serialize_glf_graph(glf_graph, stream);
                            } finally {
                                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                            }
                        }
                        xml_string = get_output_stream_string(stream);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                close(stream, UNPROVIDED);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return xml_string;
            }
        }
    }

    // Definitions
    /**
     * Return a GLF graph as an XML encoded string.
     */
    @LispMethod(comment = "Return a GLF graph as an XML encoded string.")
    public static SubLObject get_glf_graph_in_xml(SubLObject graph_id, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        SubLObject glf_graph = NIL;
        SubLObject xml_string = NIL;
        glf_graph = graphic_library_format.load_glf_graph_from_kb(graph_id, mt);
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                xml_utilities.generate_valid_xml_header(stream);
                xml_utilities.generate_xml_header_entry_for_dtd($$$glfGraph, $str2$http___www_opencyc_org_xml_glf_dt, stream);
                xml_utilities.xml_terpri();
                graphic_library_format.xml_serialize_glf_graph(glf_graph, stream);
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            xml_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return xml_string;
    }

    /**
     * Suggest a new name for the GLF node.
     */
    @LispMethod(comment = "Suggest a new name for the GLF node.")
    public static final SubLObject glf_suggest_new_node_name_alt(SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $$$GLFNode;
        }
        return com.cyc.cycjava.cycl.glf_api_widgets.glf_suggest_new_name_for_component(prefix);
    }

    /**
     * Suggest a new name for the GLF node.
     */
    @LispMethod(comment = "Suggest a new name for the GLF node.")
    public static SubLObject glf_suggest_new_node_name(SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $$$GLFNode;
        }
        return glf_suggest_new_name_for_component(prefix);
    }

    /**
     * Add a new node to the graph.
     *
     * @return fort-p or nil boolean
     * @return string reason
     */
    @LispMethod(comment = "Add a new node to the graph.\r\n\r\n@return fort-p or nil boolean\r\n@return string reason")
    public static final SubLObject glf_add_node_alt(SubLObject node_name, SubLObject graph_id, SubLObject mt, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $$GLFNode;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            graph_id = czer_main.coerce_to_fort(graph_id);
            mt = hlmt_czer.coerce_to_hlmt(mt);
            {
                SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
                SubLObject node = NIL;
                if (NIL == cycl_utilities.fort_or_naut_p(ais)) {
                    return values(NIL, $str_alt8$Invalid_graph_specified_);
                }
                {
                    SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding(thread);
                    try {
                        rkf_term_utilities.$rkf_name_prefix$.bind($str_alt9$, thread);
                        node = rkf_term_utilities.rkf_create(node_name, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        rkf_term_utilities.$rkf_name_prefix$.rebind(_prev_bind_0, thread);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject successP = com.cyc.cycjava.cycl.glf_api_widgets.glf_assert_assertion_specifications(list(bq_cons(listS($$isa, node, $list_alt11), $list_alt12), list(list($$isa, node, type), mt), list(list($$nodeInSystem, node, ais), mt)));
                    SubLObject reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == successP) {
                        return values(NIL, reason);
                    }
                }
                return values(node, $glf_success_for_kb_operations$.getGlobalValue());
            }
        }
    }

    /**
     * Add a new node to the graph.
     *
     * @return fort-p or nil boolean
     * @return string reason
     */
    @LispMethod(comment = "Add a new node to the graph.\r\n\r\n@return fort-p or nil boolean\r\n@return string reason")
    public static SubLObject glf_add_node(final SubLObject node_name, SubLObject graph_id, SubLObject mt, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $$GLFNode;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        SubLObject node = NIL;
        if (NIL == cycl_utilities.fort_or_naut_p(ais)) {
            return values(NIL, $str8$Invalid_graph_specified_);
        }
        final SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding(thread);
        try {
            rkf_term_utilities.$rkf_name_prefix$.bind($str9$, thread);
            node = rkf_term_utilities.rkf_create(node_name, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            rkf_term_utilities.$rkf_name_prefix$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject successP = glf_assert_assertion_specifications(list(bq_cons(listS($$isa, node, $list11), $list12), list(list($$isa, node, type), mt), list(list($$nodeInSystem, node, ais), mt)));
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successP) {
            return values(NIL, reason);
        }
        return values(node, $glf_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Remove that node from the system completely.
     */
    @LispMethod(comment = "Remove that node from the system completely.")
    public static final SubLObject glf_drop_node_alt(SubLObject node, SubLObject graph_id, SubLObject mt) {
        rkf_term_utilities.rkf_kill(node);
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Remove that node from the system completely.
     */
    @LispMethod(comment = "Remove that node from the system completely.")
    public static SubLObject glf_drop_node(final SubLObject node, final SubLObject graph_id, final SubLObject mt) {
        rkf_term_utilities.rkf_kill(node);
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Set the node's semantics to be semantics, a FORT.
     */
    @LispMethod(comment = "Set the node\'s semantics to be semantics, a FORT.")
    public static final SubLObject glf_add_node_semantics_alt(SubLObject node, SubLObject graph_id, SubLObject semantics, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        semantics = czer_main.coerce_to_fort(semantics);
        return com.cyc.cycjava.cycl.glf_api_widgets.glf_assert_node_semantics(node, semantics, mt);
    }

    /**
     * Set the node's semantics to be semantics, a FORT.
     */
    @LispMethod(comment = "Set the node\'s semantics to be semantics, a FORT.")
    public static SubLObject glf_add_node_semantics(SubLObject node, SubLObject graph_id, SubLObject semantics, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        semantics = czer_main.coerce_to_fort(semantics);
        return glf_assert_node_semantics(node, semantics, mt);
    }

    /**
     * Eliminate all node semantics on node.
     */
    @LispMethod(comment = "Eliminate all node semantics on node.")
    public static final SubLObject glf_drop_node_semantics_alt(SubLObject node, SubLObject graph_id, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        return com.cyc.cycjava.cycl.glf_api_widgets.glf_unassert_all_node_semantics(node, mt);
    }

    /**
     * Eliminate all node semantics on node.
     */
    @LispMethod(comment = "Eliminate all node semantics on node.")
    public static SubLObject glf_drop_node_semantics(SubLObject node, SubLObject graph_id, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        return glf_unassert_all_node_semantics(node, mt);
    }

    /**
     * Set the node's label to be LABEL, a string
     */
    @LispMethod(comment = "Set the node\'s label to be LABEL, a string")
    public static final SubLObject glf_add_node_label_alt(SubLObject node, SubLObject graph_id, SubLObject label, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        {
            SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
            return com.cyc.cycjava.cycl.glf_api_widgets.glf_assert_component_property(node, ais, $$glfComponentLabel, label, mt);
        }
    }

    /**
     * Set the node's label to be LABEL, a string
     */
    @LispMethod(comment = "Set the node\'s label to be LABEL, a string")
    public static SubLObject glf_add_node_label(SubLObject node, SubLObject graph_id, final SubLObject label, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        return glf_assert_component_property(node, ais, $$glfComponentLabel, label, mt);
    }

    /**
     * Eliminate all labels on node.
     */
    @LispMethod(comment = "Eliminate all labels on node.")
    public static final SubLObject glf_drop_node_label_alt(SubLObject node, SubLObject graph_id, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        {
            SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
            return com.cyc.cycjava.cycl.glf_api_widgets.glf_unassert_all_property_instances_for_component(node, ais, $$glfComponentLabel, mt);
        }
    }

    /**
     * Eliminate all labels on node.
     */
    @LispMethod(comment = "Eliminate all labels on node.")
    public static SubLObject glf_drop_node_label(SubLObject node, SubLObject graph_id, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        return glf_unassert_all_property_instances_for_component(node, ais, $$glfComponentLabel, mt);
    }

    /**
     * Suggest a new name for the GLF arc
     */
    @LispMethod(comment = "Suggest a new name for the GLF arc")
    public static final SubLObject glf_suggest_new_arc_name_alt(SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $$$GLFArc;
        }
        return com.cyc.cycjava.cycl.glf_api_widgets.glf_suggest_new_name_for_component(prefix);
    }

    /**
     * Suggest a new name for the GLF arc
     */
    @LispMethod(comment = "Suggest a new name for the GLF arc")
    public static SubLObject glf_suggest_new_arc_name(SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $$$GLFArc;
        }
        return glf_suggest_new_name_for_component(prefix);
    }

    /**
     * Add a new arc to the graph.
     *
     * @return fort-p or nil boolean
     * @return string reason
     */
    @LispMethod(comment = "Add a new arc to the graph.\r\n\r\n@return fort-p or nil boolean\r\n@return string reason")
    public static final SubLObject glf_add_arc_alt(SubLObject arc_name, SubLObject graph_id, SubLObject mt, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $$GLFArc;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            graph_id = czer_main.coerce_to_fort(graph_id);
            mt = hlmt_czer.coerce_to_hlmt(mt);
            {
                SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
                SubLObject arc = NIL;
                if (NIL == cycl_utilities.fort_or_naut_p(ais)) {
                    return values(NIL, $str_alt8$Invalid_graph_specified_);
                }
                {
                    SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding(thread);
                    try {
                        rkf_term_utilities.$rkf_name_prefix$.bind($str_alt9$, thread);
                        arc = rkf_term_utilities.rkf_create(arc_name, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        rkf_term_utilities.$rkf_name_prefix$.rebind(_prev_bind_0, thread);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject successP = com.cyc.cycjava.cycl.glf_api_widgets.glf_assert_assertion_specifications(list(bq_cons(listS($$isa, arc, $list_alt11), $list_alt12), list(list($$isa, arc, type), mt), list(list($$linkInSystem, arc, ais), mt)));
                    SubLObject reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == successP) {
                        return values(NIL, reason);
                    }
                }
                return values(arc, $glf_success_for_kb_operations$.getGlobalValue());
            }
        }
    }

    /**
     * Add a new arc to the graph.
     *
     * @return fort-p or nil boolean
     * @return string reason
     */
    @LispMethod(comment = "Add a new arc to the graph.\r\n\r\n@return fort-p or nil boolean\r\n@return string reason")
    public static SubLObject glf_add_arc(final SubLObject arc_name, SubLObject graph_id, SubLObject mt, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $$GLFArc;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        SubLObject arc = NIL;
        if (NIL == cycl_utilities.fort_or_naut_p(ais)) {
            return values(NIL, $str8$Invalid_graph_specified_);
        }
        final SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding(thread);
        try {
            rkf_term_utilities.$rkf_name_prefix$.bind($str9$, thread);
            arc = rkf_term_utilities.rkf_create(arc_name, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            rkf_term_utilities.$rkf_name_prefix$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject successP = glf_assert_assertion_specifications(list(bq_cons(listS($$isa, arc, $list11), $list12), list(list($$isa, arc, type), mt), list(list($$linkInSystem, arc, ais), mt)));
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successP) {
            return values(NIL, reason);
        }
        return values(arc, $glf_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Remove that arc from the system completely.
     */
    @LispMethod(comment = "Remove that arc from the system completely.")
    public static final SubLObject glf_drop_arc_alt(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        rkf_term_utilities.rkf_kill(arc);
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Remove that arc from the system completely.
     */
    @LispMethod(comment = "Remove that arc from the system completely.")
    public static SubLObject glf_drop_arc(final SubLObject arc, final SubLObject graph_id, final SubLObject mt) {
        rkf_term_utilities.rkf_kill(arc);
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Establish the necessary KB connetions between the from and the to-set.
     */
    @LispMethod(comment = "Establish the necessary KB connetions between the from and the to-set.")
    public static final SubLObject glf_connect_arc_up_alt(SubLObject arc, SubLObject graph_id, SubLObject from_set, SubLObject to_set, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            arc = czer_main.coerce_to_fort(arc);
            graph_id = czer_main.coerce_to_fort(graph_id);
            mt = hlmt_czer.coerce_to_hlmt(mt);
            if ((NIL == from_set) || (NIL == to_set)) {
                return values(T, $glf_success_for_kb_operations$.getGlobalValue());
            }
            if (NIL == list_utilities.singletonP(from_set)) {
                return values(NIL, $str_alt27$Multiple_from_nodes_are_currently);
            }
            {
                SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
                SubLObject cdolist_list_var = from_set;
                SubLObject from = NIL;
                for (from = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , from = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_1 = to_set;
                        SubLObject to = NIL;
                        for (to = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , to = cdolist_list_var_1.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject successP = com.cyc.cycjava.cycl.glf_api_widgets.glf_assert_assertion_specifications(list(list(list($$linkFromToInSystem, arc, from, to, ais), mt)));
                                SubLObject reason = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL == successP) {
                                    return values(NIL, reason);
                                }
                            }
                        }
                    }
                }
            }
            return values(T, $glf_success_for_kb_operations$.getGlobalValue());
        }
    }

    /**
     * Establish the necessary KB connetions between the from and the to-set.
     */
    @LispMethod(comment = "Establish the necessary KB connetions between the from and the to-set.")
    public static SubLObject glf_connect_arc_up(SubLObject arc, SubLObject graph_id, final SubLObject from_set, final SubLObject to_set, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        if ((NIL == from_set) || (NIL == to_set)) {
            return values(T, $glf_success_for_kb_operations$.getGlobalValue());
        }
        if (NIL == list_utilities.singletonP(from_set)) {
            return values(NIL, $str27$Multiple_from_nodes_are_currently);
        }
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        SubLObject cdolist_list_var = from_set;
        SubLObject from = NIL;
        from = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = to_set;
            SubLObject to = NIL;
            to = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                thread.resetMultipleValues();
                final SubLObject successP = glf_assert_assertion_specifications(list(list(list($$linkFromToInSystem, arc, from, to, ais), mt)));
                final SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == successP) {
                    return values(NIL, reason);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                to = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            from = cdolist_list_var.first();
        } 
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Remove all KB connetions between the from and the to-set.
     */
    @LispMethod(comment = "Remove all KB connetions between the from and the to-set.")
    public static final SubLObject glf_disconnect_arc_alt(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        {
            SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
            SubLObject node_sets_linked = ask_utilities.ask_template($list_alt30, list($$linkFromToInSystem, arc, $sym31$_FROM, $sym32$_TO, ais), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = node_sets_linked;
            SubLObject node_set_linked = NIL;
            for (node_set_linked = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node_set_linked = cdolist_list_var.first()) {
                {
                    SubLObject datum = node_set_linked;
                    SubLObject current = datum;
                    SubLObject from = NIL;
                    SubLObject to = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt33);
                    from = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt33);
                    to = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        rkf_assertion_utilities.rkf_unassert(list($$linkFromToInSystem, arc, from, to, ais), mt);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt33);
                    }
                }
            }
        }
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Remove all KB connetions between the from and the to-set.
     */
    @LispMethod(comment = "Remove all KB connetions between the from and the to-set.")
    public static SubLObject glf_disconnect_arc(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        SubLObject cdolist_list_var;
        final SubLObject node_sets_linked = cdolist_list_var = ask_utilities.ask_template($list30, list($$linkFromToInSystem, arc, $sym31$_FROM, $sym32$_TO, ais), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject node_set_linked = NIL;
        node_set_linked = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = node_set_linked;
            SubLObject from = NIL;
            SubLObject to = NIL;
            destructuring_bind_must_consp(current, datum, $list33);
            from = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list33);
            to = current.first();
            current = current.rest();
            if (NIL == current) {
                rkf_assertion_utilities.rkf_unassert(list($$linkFromToInSystem, arc, from, to, ais), mt);
            } else {
                cdestructuring_bind_error(datum, $list33);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node_set_linked = cdolist_list_var.first();
        } 
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Set the arc's semantics to be semantics, a FORT.
     */
    @LispMethod(comment = "Set the arc\'s semantics to be semantics, a FORT.")
    public static final SubLObject glf_add_arc_label_alt(SubLObject arc, SubLObject graph_id, SubLObject label, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        {
            SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
            return com.cyc.cycjava.cycl.glf_api_widgets.glf_assert_component_property(arc, ais, $$glfComponentLabel, label, mt);
        }
    }

    /**
     * Set the arc's semantics to be semantics, a FORT.
     */
    @LispMethod(comment = "Set the arc\'s semantics to be semantics, a FORT.")
    public static SubLObject glf_add_arc_label(SubLObject arc, SubLObject graph_id, final SubLObject label, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        return glf_assert_component_property(arc, ais, $$glfComponentLabel, label, mt);
    }

    /**
     * Eliminate all arc semantics on arc.
     */
    @LispMethod(comment = "Eliminate all arc semantics on arc.")
    public static final SubLObject glf_drop_arc_label_alt(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        {
            SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
            return com.cyc.cycjava.cycl.glf_api_widgets.glf_unassert_all_property_instances_for_component(arc, ais, $$glfComponentLabel, mt);
        }
    }

    /**
     * Eliminate all arc semantics on arc.
     */
    @LispMethod(comment = "Eliminate all arc semantics on arc.")
    public static SubLObject glf_drop_arc_label(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        return glf_unassert_all_property_instances_for_component(arc, ais, $$glfComponentLabel, mt);
    }

    /**
     * Set the arc's semantics to be semantics, a FORT.
     */
    @LispMethod(comment = "Set the arc\'s semantics to be semantics, a FORT.")
    public static final SubLObject glf_add_arc_semantics_alt(SubLObject arc, SubLObject graph_id, SubLObject semantics, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        semantics = czer_main.coerce_to_fort(semantics);
        return com.cyc.cycjava.cycl.glf_api_widgets.glf_assert_arc_semantics(arc, semantics, graph_id, mt);
    }

    @LispMethod(comment = "Set the arc\'s semantics to be semantics, a FORT.")
    public static SubLObject glf_add_arc_semantics(SubLObject arc, SubLObject graph_id, SubLObject semantics, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        semantics = czer_main.coerce_to_fort(semantics);
        return glf_assert_arc_semantics(arc, semantics, graph_id, mt);
    }

    /**
     * Eliminate all arc semantics on arc.
     */
    @LispMethod(comment = "Eliminate all arc semantics on arc.")
    public static final SubLObject glf_drop_arc_semantics_alt(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        return com.cyc.cycjava.cycl.glf_api_widgets.glf_unassert_all_arc_semantics(arc, graph_id, mt);
    }

    @LispMethod(comment = "Eliminate all arc semantics on arc.")
    public static SubLObject glf_drop_arc_semantics(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        return glf_unassert_all_arc_semantics(arc, graph_id, mt);
    }

    public static final SubLObject generic_suggest_new_name_for_component_alt(SubLObject prefix) {
        {
            SubLObject term_name = NIL;
            while (NIL == term_name) {
                term_name = format(NIL, $str_alt38$_A__D, prefix, random.random($most_positive_fixnum$.getGlobalValue()));
                if (NIL == constant_completion_high.constant_name_available(term_name)) {
                    term_name = NIL;
                }
            } 
            return term_name;
        }
    }

    public static SubLObject generic_suggest_new_name_for_component(final SubLObject prefix) {
        SubLObject term_name;
        for (term_name = NIL; NIL == term_name; term_name = NIL) {
            term_name = format(NIL, $str38$_A__D, prefix, random.random($most_positive_fixnum$.getGlobalValue()));
            if (NIL == constant_completion_high.constant_name_available(term_name)) {
            }
        }
        return term_name;
    }

    public static final SubLObject generic_assert_assertion_specifications_alt(SubLObject assertion_specs, SubLObject success) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = assertion_specs;
                SubLObject assertion_spec = NIL;
                for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_spec = cdolist_list_var.first()) {
                    {
                        SubLObject datum = assertion_spec;
                        SubLObject current = datum;
                        SubLObject sentence = NIL;
                        SubLObject elmt = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt39);
                        sentence = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt39);
                        elmt = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            thread.resetMultipleValues();
                            {
                                SubLObject successP = rkf_assertion_utilities.rkf_assert_now(sentence, elmt);
                                SubLObject reason = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL == successP) {
                                    return values(NIL, reason);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt39);
                        }
                    }
                }
            }
            return values(T, success);
        }
    }

    public static SubLObject generic_assert_assertion_specifications(final SubLObject assertion_specs, final SubLObject success) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = assertion_specs;
        SubLObject assertion_spec = NIL;
        assertion_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = assertion_spec;
            SubLObject sentence = NIL;
            SubLObject elmt = NIL;
            destructuring_bind_must_consp(current, datum, $list39);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list39);
            elmt = current.first();
            current = current.rest();
            if (NIL == current) {
                thread.resetMultipleValues();
                final SubLObject successP = rkf_assertion_utilities.rkf_assert_now(sentence, elmt);
                final SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == successP) {
                    return values(NIL, reason);
                }
            } else {
                cdestructuring_bind_error(datum, $list39);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion_spec = cdolist_list_var.first();
        } 
        return values(T, success);
    }

    public static final SubLObject glf_suggest_new_name_for_component_alt(SubLObject prefix) {
        return com.cyc.cycjava.cycl.glf_api_widgets.generic_suggest_new_name_for_component(prefix);
    }

    public static SubLObject glf_suggest_new_name_for_component(final SubLObject prefix) {
        return generic_suggest_new_name_for_component(prefix);
    }

    public static final SubLObject glf_assert_assertion_specifications_alt(SubLObject assertion_specs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject successP = com.cyc.cycjava.cycl.glf_api_widgets.generic_assert_assertion_specifications(assertion_specs, $glf_success_for_kb_operations$.getGlobalValue());
                SubLObject message = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(successP, message);
            }
        }
    }

    public static SubLObject glf_assert_assertion_specifications(final SubLObject assertion_specs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject successP = generic_assert_assertion_specifications(assertion_specs, $glf_success_for_kb_operations$.getGlobalValue());
        final SubLObject message = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(successP, message);
    }

    public static final SubLObject glf_assert_component_property_alt(SubLObject component, SubLObject graph_ref, SubLObject prop_predicate, SubLObject property, SubLObject mt) {
        return com.cyc.cycjava.cycl.glf_api_widgets.glf_assert_assertion_specifications(list(list(list(prop_predicate, component, property, graph_ref), mt)));
    }

    public static SubLObject glf_assert_component_property(final SubLObject component, final SubLObject graph_ref, final SubLObject prop_predicate, final SubLObject property, final SubLObject mt) {
        return glf_assert_assertion_specifications(list(list(list(prop_predicate, component, property, graph_ref), mt)));
    }

    public static final SubLObject glf_assert_node_semantics_alt(SubLObject node, SubLObject semantics, SubLObject mt) {
        return com.cyc.cycjava.cycl.glf_api_widgets.glf_assert_assertion_specifications(list(list(list($$glfNodeSemantics_Underspecified, node, semantics), mt)));
    }

    public static SubLObject glf_assert_node_semantics(final SubLObject node, final SubLObject semantics, final SubLObject mt) {
        return glf_assert_assertion_specifications(list(list(list($$glfNodeSemantics_Underspecified, node, semantics), mt)));
    }

    public static final SubLObject glf_assert_arc_semantics_alt(SubLObject arc, SubLObject semantics, SubLObject graph_id, SubLObject mt) {
        return com.cyc.cycjava.cycl.glf_api_widgets.glf_assert_assertion_specifications(list(list(list($const41$variableMappingTableForGLFArcInDi, semantics, arc, list($$AISForFn, graph_id)), mt)));
    }

    public static SubLObject glf_assert_arc_semantics(final SubLObject arc, final SubLObject semantics, final SubLObject graph_id, final SubLObject mt) {
        return glf_assert_assertion_specifications(list(list(list($const41$variableMappingTableForGLFArcInDi, semantics, arc, list($$AISForFn, graph_id)), mt)));
    }

    public static final SubLObject glf_unassert_all_node_semantics_alt(SubLObject node, SubLObject mt) {
        {
            SubLObject prop_predicate = $$glfNodeSemantics_Underspecified;
            SubLObject property_values = ask_utilities.ask_variable($PROPERTY, listS(prop_predicate, node, $list_alt44), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = property_values;
            SubLObject property_value = NIL;
            for (property_value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property_value = cdolist_list_var.first()) {
                rkf_assertion_utilities.rkf_unassert(list(prop_predicate, node, property_value), mt);
            }
        }
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    public static SubLObject glf_unassert_all_node_semantics(final SubLObject node, final SubLObject mt) {
        final SubLObject prop_predicate = $$glfNodeSemantics_Underspecified;
        SubLObject cdolist_list_var;
        final SubLObject property_values = cdolist_list_var = ask_utilities.ask_variable($PROPERTY, listS(prop_predicate, node, $list44), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject property_value = NIL;
        property_value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_assertion_utilities.rkf_unassert(list(prop_predicate, node, property_value), mt);
            cdolist_list_var = cdolist_list_var.rest();
            property_value = cdolist_list_var.first();
        } 
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    public static final SubLObject glf_unassert_all_arc_semantics_alt(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        {
            SubLObject prop_predicate = $const41$variableMappingTableForGLFArcInDi;
            SubLObject property_values = ask_utilities.ask_variable($SEMANTICS, list(prop_predicate, $SEMANTICS, arc, list($$AISForFn, graph_id)), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = property_values;
            SubLObject property_value = NIL;
            for (property_value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property_value = cdolist_list_var.first()) {
                rkf_assertion_utilities.rkf_unassert(list(prop_predicate, property_value, arc, list($$AISForFn, graph_id)), mt);
            }
        }
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    public static SubLObject glf_unassert_all_arc_semantics(final SubLObject arc, final SubLObject graph_id, final SubLObject mt) {
        final SubLObject prop_predicate = $const41$variableMappingTableForGLFArcInDi;
        SubLObject cdolist_list_var;
        final SubLObject property_values = cdolist_list_var = ask_utilities.ask_variable($SEMANTICS, list(prop_predicate, $SEMANTICS, arc, list($$AISForFn, graph_id)), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject property_value = NIL;
        property_value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_assertion_utilities.rkf_unassert(list(prop_predicate, property_value, arc, list($$AISForFn, graph_id)), mt);
            cdolist_list_var = cdolist_list_var.rest();
            property_value = cdolist_list_var.first();
        } 
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    public static final SubLObject glf_unassert_all_property_instances_for_component_alt(SubLObject component, SubLObject graph_ref, SubLObject prop_predicate, SubLObject mt) {
        {
            SubLObject property_values = ask_utilities.ask_variable($PROPERTY, list(prop_predicate, component, $PROPERTY, graph_ref), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = property_values;
            SubLObject property_value = NIL;
            for (property_value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property_value = cdolist_list_var.first()) {
                rkf_assertion_utilities.rkf_unassert(list(prop_predicate, component, property_value, graph_ref), mt);
            }
        }
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    public static SubLObject glf_unassert_all_property_instances_for_component(final SubLObject component, final SubLObject graph_ref, final SubLObject prop_predicate, final SubLObject mt) {
        SubLObject cdolist_list_var;
        final SubLObject property_values = cdolist_list_var = ask_utilities.ask_variable($PROPERTY, list(prop_predicate, component, $PROPERTY, graph_ref), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject property_value = NIL;
        property_value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_assertion_utilities.rkf_unassert(list(prop_predicate, component, property_value, graph_ref), mt);
            cdolist_list_var = cdolist_list_var.rest();
            property_value = cdolist_list_var.first();
        } 
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    public static SubLObject declare_glf_api_widgets_file() {
        declareFunction("get_glf_graph_in_xml", "GET-GLF-GRAPH-IN-XML", 2, 0, false);
        declareFunction("glf_suggest_new_node_name", "GLF-SUGGEST-NEW-NODE-NAME", 0, 1, false);
        declareFunction("glf_add_node", "GLF-ADD-NODE", 3, 1, false);
        declareFunction("glf_drop_node", "GLF-DROP-NODE", 3, 0, false);
        declareFunction("glf_add_node_semantics", "GLF-ADD-NODE-SEMANTICS", 4, 0, false);
        declareFunction("glf_drop_node_semantics", "GLF-DROP-NODE-SEMANTICS", 3, 0, false);
        declareFunction("glf_add_node_label", "GLF-ADD-NODE-LABEL", 4, 0, false);
        declareFunction("glf_drop_node_label", "GLF-DROP-NODE-LABEL", 3, 0, false);
        declareFunction("glf_suggest_new_arc_name", "GLF-SUGGEST-NEW-ARC-NAME", 0, 1, false);
        declareFunction("glf_add_arc", "GLF-ADD-ARC", 3, 1, false);
        declareFunction("glf_drop_arc", "GLF-DROP-ARC", 3, 0, false);
        declareFunction("glf_connect_arc_up", "GLF-CONNECT-ARC-UP", 5, 0, false);
        declareFunction("glf_disconnect_arc", "GLF-DISCONNECT-ARC", 3, 0, false);
        declareFunction("glf_add_arc_label", "GLF-ADD-ARC-LABEL", 4, 0, false);
        declareFunction("glf_drop_arc_label", "GLF-DROP-ARC-LABEL", 3, 0, false);
        declareFunction("glf_add_arc_semantics", "GLF-ADD-ARC-SEMANTICS", 4, 0, false);
        declareFunction("glf_drop_arc_semantics", "GLF-DROP-ARC-SEMANTICS", 3, 0, false);
        declareFunction("generic_suggest_new_name_for_component", "GENERIC-SUGGEST-NEW-NAME-FOR-COMPONENT", 1, 0, false);
        declareFunction("generic_assert_assertion_specifications", "GENERIC-ASSERT-ASSERTION-SPECIFICATIONS", 2, 0, false);
        declareFunction("glf_suggest_new_name_for_component", "GLF-SUGGEST-NEW-NAME-FOR-COMPONENT", 1, 0, false);
        declareFunction("glf_assert_assertion_specifications", "GLF-ASSERT-ASSERTION-SPECIFICATIONS", 1, 0, false);
        declareFunction("glf_assert_component_property", "GLF-ASSERT-COMPONENT-PROPERTY", 5, 0, false);
        declareFunction("glf_assert_node_semantics", "GLF-ASSERT-NODE-SEMANTICS", 3, 0, false);
        declareFunction("glf_assert_arc_semantics", "GLF-ASSERT-ARC-SEMANTICS", 4, 0, false);
        declareFunction("glf_unassert_all_node_semantics", "GLF-UNASSERT-ALL-NODE-SEMANTICS", 2, 0, false);
        declareFunction("glf_unassert_all_arc_semantics", "GLF-UNASSERT-ALL-ARC-SEMANTICS", 3, 0, false);
        declareFunction("glf_unassert_all_property_instances_for_component", "GLF-UNASSERT-ALL-PROPERTY-INSTANCES-FOR-COMPONENT", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_glf_api_widgets_file() {
        deflexical("*GLF-SUCCESS-FOR-KB-OPERATIONS*", $str3$All_KB_operations_completed_witho);
        return NIL;
    }

    public static SubLObject setup_glf_api_widgets_file() {
        register_external_symbol(GET_GLF_GRAPH_IN_XML);
        register_external_symbol(GLF_SUGGEST_NEW_NODE_NAME);
        register_external_symbol(GLF_ADD_NODE);
        register_external_symbol(GLF_DROP_NODE);
        register_external_symbol(GLF_ADD_NODE_SEMANTICS);
        register_external_symbol(GLF_DROP_NODE_SEMANTICS);
        register_external_symbol(GLF_ADD_NODE_LABEL);
        register_external_symbol(GLF_DROP_NODE_LABEL);
        register_external_symbol(GLF_SUGGEST_NEW_ARC_NAME);
        register_external_symbol(GLF_ADD_ARC);
        register_external_symbol(GLF_DROP_ARC);
        register_external_symbol(GLF_CONNECT_ARC_UP);
        register_external_symbol(GLF_DISCONNECT_ARC);
        register_external_symbol(GLF_ADD_ARC_LABEL);
        register_external_symbol(GLF_DROP_ARC_LABEL);
        register_external_symbol(GLF_ADD_ARC_SEMANTICS);
        register_external_symbol(GLF_DROP_ARC_SEMANTICS);
        return NIL;
    }

    static private final SubLString $str_alt2$http___www_opencyc_org_xml_glf_dt = makeString("http://www.opencyc.org/xml/glf.dtd");

    static private final SubLString $str_alt3$All_KB_operations_completed_witho = makeString("All KB operations completed without error.");

    @Override
    public void declareFunctions() {
        declare_glf_api_widgets_file();
    }

    @Override
    public void initializeVariables() {
        init_glf_api_widgets_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_glf_api_widgets_file();
    }

    static {
    }

    static private final SubLString $str_alt8$Invalid_graph_specified_ = makeString("Invalid graph specified.");

    static private final SubLList $list_alt11 = list(reader_make_constant_shell("Individual"));

    static private final SubLList $list_alt12 = list(reader_make_constant_shell("UniversalVocabularyMt"));

    static private final SubLString $str_alt27$Multiple_from_nodes_are_currently = makeString("Multiple from-nodes are currently not supported.");

    static private final SubLList $list_alt30 = list(makeSymbol("?FROM"), makeSymbol("?TO"));

    static private final SubLList $list_alt33 = list(makeSymbol("FROM"), makeSymbol("TO"));

    static private final SubLString $str_alt38$_A__D = makeString("~A-~D");

    static private final SubLList $list_alt39 = list(makeSymbol("SENTENCE"), makeSymbol("ELMT"));

    static private final SubLList $list_alt44 = list(makeKeyword("PROPERTY"));
}

/**
 * Total time: 131 ms
 */
