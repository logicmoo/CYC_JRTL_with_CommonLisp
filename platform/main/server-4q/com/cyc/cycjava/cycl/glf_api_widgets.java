package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

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


public final class glf_api_widgets extends SubLTranslatedFile {
    public static final SubLFile me = new glf_api_widgets();

    public static final String myName = "com.cyc.cycjava.cycl.glf_api_widgets";

    public static final String myFingerPrint = "c4d0284782c580a5b548e831b264b36b6cdbdef80529fe2b54fcf27e4dfddc96";

    // deflexical
    private static final SubLSymbol $glf_success_for_kb_operations$ = makeSymbol("*GLF-SUCCESS-FOR-KB-OPERATIONS*");

    // Internal Constants
    public static final SubLSymbol GET_GLF_GRAPH_IN_XML = makeSymbol("GET-GLF-GRAPH-IN-XML");

    public static final SubLString $$$glfGraph = makeString("glfGraph");

    public static final SubLString $str2$http___www_opencyc_org_xml_glf_dt = makeString("http://www.opencyc.org/xml/glf.dtd");

    public static final SubLString $str3$All_KB_operations_completed_witho = makeString("All KB operations completed without error.");

    public static final SubLSymbol GLF_SUGGEST_NEW_NODE_NAME = makeSymbol("GLF-SUGGEST-NEW-NODE-NAME");

    public static final SubLString $$$GLFNode = makeString("GLFNode");

    public static final SubLSymbol GLF_ADD_NODE = makeSymbol("GLF-ADD-NODE");

    private static final SubLObject $$GLFNode = reader_make_constant_shell(makeString("GLFNode"));

    public static final SubLString $str8$Invalid_graph_specified_ = makeString("Invalid graph specified.");

    public static final SubLString $str9$ = makeString("");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list11 = list(reader_make_constant_shell(makeString("Individual")));

    public static final SubLList $list12 = list(reader_make_constant_shell(makeString("UniversalVocabularyMt")));

    private static final SubLObject $$nodeInSystem = reader_make_constant_shell(makeString("nodeInSystem"));

    public static final SubLSymbol GLF_DROP_NODE = makeSymbol("GLF-DROP-NODE");

    public static final SubLSymbol GLF_ADD_NODE_SEMANTICS = makeSymbol("GLF-ADD-NODE-SEMANTICS");

    public static final SubLSymbol GLF_DROP_NODE_SEMANTICS = makeSymbol("GLF-DROP-NODE-SEMANTICS");

    public static final SubLSymbol GLF_ADD_NODE_LABEL = makeSymbol("GLF-ADD-NODE-LABEL");

    private static final SubLObject $$glfComponentLabel = reader_make_constant_shell(makeString("glfComponentLabel"));

    public static final SubLSymbol GLF_DROP_NODE_LABEL = makeSymbol("GLF-DROP-NODE-LABEL");

    public static final SubLSymbol GLF_SUGGEST_NEW_ARC_NAME = makeSymbol("GLF-SUGGEST-NEW-ARC-NAME");

    public static final SubLString $$$GLFArc = makeString("GLFArc");

    public static final SubLSymbol GLF_ADD_ARC = makeSymbol("GLF-ADD-ARC");

    private static final SubLObject $$GLFArc = reader_make_constant_shell(makeString("GLFArc"));

    private static final SubLObject $$linkInSystem = reader_make_constant_shell(makeString("linkInSystem"));

    public static final SubLSymbol GLF_DROP_ARC = makeSymbol("GLF-DROP-ARC");

    public static final SubLSymbol GLF_CONNECT_ARC_UP = makeSymbol("GLF-CONNECT-ARC-UP");

    public static final SubLString $str27$Multiple_from_nodes_are_currently = makeString("Multiple from-nodes are currently not supported.");

    private static final SubLObject $$linkFromToInSystem = reader_make_constant_shell(makeString("linkFromToInSystem"));

    public static final SubLSymbol GLF_DISCONNECT_ARC = makeSymbol("GLF-DISCONNECT-ARC");

    public static final SubLList $list30 = list(makeSymbol("?FROM"), makeSymbol("?TO"));

    public static final SubLSymbol $sym31$_FROM = makeSymbol("?FROM");

    public static final SubLSymbol $sym32$_TO = makeSymbol("?TO");

    public static final SubLList $list33 = list(makeSymbol("FROM"), makeSymbol("TO"));

    public static final SubLSymbol GLF_ADD_ARC_LABEL = makeSymbol("GLF-ADD-ARC-LABEL");

    public static final SubLSymbol GLF_DROP_ARC_LABEL = makeSymbol("GLF-DROP-ARC-LABEL");

    public static final SubLSymbol GLF_ADD_ARC_SEMANTICS = makeSymbol("GLF-ADD-ARC-SEMANTICS");

    public static final SubLSymbol GLF_DROP_ARC_SEMANTICS = makeSymbol("GLF-DROP-ARC-SEMANTICS");

    public static final SubLString $str38$_A__D = makeString("~A-~D");

    public static final SubLList $list39 = list(makeSymbol("SENTENCE"), makeSymbol("ELMT"));

    private static final SubLObject $$glfNodeSemantics_Underspecified = reader_make_constant_shell(makeString("glfNodeSemantics-Underspecified"));

    private static final SubLObject $const41$variableMappingTableForGLFArcInDi = reader_make_constant_shell(makeString("variableMappingTableForGLFArcInDiagram"));

    private static final SubLObject $$AISForFn = reader_make_constant_shell(makeString("AISForFn"));



    public static final SubLList $list44 = list(makeKeyword("PROPERTY"));



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

    public static SubLObject glf_suggest_new_node_name(SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $$$GLFNode;
        }
        return glf_suggest_new_name_for_component(prefix);
    }

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

    public static SubLObject glf_drop_node(final SubLObject node, final SubLObject graph_id, final SubLObject mt) {
        rkf_term_utilities.rkf_kill(node);
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

    public static SubLObject glf_add_node_semantics(SubLObject node, SubLObject graph_id, SubLObject semantics, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        semantics = czer_main.coerce_to_fort(semantics);
        return glf_assert_node_semantics(node, semantics, mt);
    }

    public static SubLObject glf_drop_node_semantics(SubLObject node, SubLObject graph_id, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        return glf_unassert_all_node_semantics(node, mt);
    }

    public static SubLObject glf_add_node_label(SubLObject node, SubLObject graph_id, final SubLObject label, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        return glf_assert_component_property(node, ais, $$glfComponentLabel, label, mt);
    }

    public static SubLObject glf_drop_node_label(SubLObject node, SubLObject graph_id, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        return glf_unassert_all_property_instances_for_component(node, ais, $$glfComponentLabel, mt);
    }

    public static SubLObject glf_suggest_new_arc_name(SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $$$GLFArc;
        }
        return glf_suggest_new_name_for_component(prefix);
    }

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

    public static SubLObject glf_drop_arc(final SubLObject arc, final SubLObject graph_id, final SubLObject mt) {
        rkf_term_utilities.rkf_kill(arc);
        return values(T, $glf_success_for_kb_operations$.getGlobalValue());
    }

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

    public static SubLObject glf_add_arc_label(SubLObject arc, SubLObject graph_id, final SubLObject label, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        return glf_assert_component_property(arc, ais, $$glfComponentLabel, label, mt);
    }

    public static SubLObject glf_drop_arc_label(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        return glf_unassert_all_property_instances_for_component(arc, ais, $$glfComponentLabel, mt);
    }

    public static SubLObject glf_add_arc_semantics(SubLObject arc, SubLObject graph_id, SubLObject semantics, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        semantics = czer_main.coerce_to_fort(semantics);
        return glf_assert_arc_semantics(arc, semantics, graph_id, mt);
    }

    public static SubLObject glf_drop_arc_semantics(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        return glf_unassert_all_arc_semantics(arc, graph_id, mt);
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

    public static SubLObject glf_suggest_new_name_for_component(final SubLObject prefix) {
        return generic_suggest_new_name_for_component(prefix);
    }

    public static SubLObject glf_assert_assertion_specifications(final SubLObject assertion_specs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject successP = generic_assert_assertion_specifications(assertion_specs, $glf_success_for_kb_operations$.getGlobalValue());
        final SubLObject message = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(successP, message);
    }

    public static SubLObject glf_assert_component_property(final SubLObject component, final SubLObject graph_ref, final SubLObject prop_predicate, final SubLObject property, final SubLObject mt) {
        return glf_assert_assertion_specifications(list(list(list(prop_predicate, component, property, graph_ref), mt)));
    }

    public static SubLObject glf_assert_node_semantics(final SubLObject node, final SubLObject semantics, final SubLObject mt) {
        return glf_assert_assertion_specifications(list(list(list($$glfNodeSemantics_Underspecified, node, semantics), mt)));
    }

    public static SubLObject glf_assert_arc_semantics(final SubLObject arc, final SubLObject semantics, final SubLObject graph_id, final SubLObject mt) {
        return glf_assert_assertion_specifications(list(list(list($const41$variableMappingTableForGLFArcInDi, semantics, arc, list($$AISForFn, graph_id)), mt)));
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
        declareFunction(me, "get_glf_graph_in_xml", "GET-GLF-GRAPH-IN-XML", 2, 0, false);
        declareFunction(me, "glf_suggest_new_node_name", "GLF-SUGGEST-NEW-NODE-NAME", 0, 1, false);
        declareFunction(me, "glf_add_node", "GLF-ADD-NODE", 3, 1, false);
        declareFunction(me, "glf_drop_node", "GLF-DROP-NODE", 3, 0, false);
        declareFunction(me, "glf_add_node_semantics", "GLF-ADD-NODE-SEMANTICS", 4, 0, false);
        declareFunction(me, "glf_drop_node_semantics", "GLF-DROP-NODE-SEMANTICS", 3, 0, false);
        declareFunction(me, "glf_add_node_label", "GLF-ADD-NODE-LABEL", 4, 0, false);
        declareFunction(me, "glf_drop_node_label", "GLF-DROP-NODE-LABEL", 3, 0, false);
        declareFunction(me, "glf_suggest_new_arc_name", "GLF-SUGGEST-NEW-ARC-NAME", 0, 1, false);
        declareFunction(me, "glf_add_arc", "GLF-ADD-ARC", 3, 1, false);
        declareFunction(me, "glf_drop_arc", "GLF-DROP-ARC", 3, 0, false);
        declareFunction(me, "glf_connect_arc_up", "GLF-CONNECT-ARC-UP", 5, 0, false);
        declareFunction(me, "glf_disconnect_arc", "GLF-DISCONNECT-ARC", 3, 0, false);
        declareFunction(me, "glf_add_arc_label", "GLF-ADD-ARC-LABEL", 4, 0, false);
        declareFunction(me, "glf_drop_arc_label", "GLF-DROP-ARC-LABEL", 3, 0, false);
        declareFunction(me, "glf_add_arc_semantics", "GLF-ADD-ARC-SEMANTICS", 4, 0, false);
        declareFunction(me, "glf_drop_arc_semantics", "GLF-DROP-ARC-SEMANTICS", 3, 0, false);
        declareFunction(me, "generic_suggest_new_name_for_component", "GENERIC-SUGGEST-NEW-NAME-FOR-COMPONENT", 1, 0, false);
        declareFunction(me, "generic_assert_assertion_specifications", "GENERIC-ASSERT-ASSERTION-SPECIFICATIONS", 2, 0, false);
        declareFunction(me, "glf_suggest_new_name_for_component", "GLF-SUGGEST-NEW-NAME-FOR-COMPONENT", 1, 0, false);
        declareFunction(me, "glf_assert_assertion_specifications", "GLF-ASSERT-ASSERTION-SPECIFICATIONS", 1, 0, false);
        declareFunction(me, "glf_assert_component_property", "GLF-ASSERT-COMPONENT-PROPERTY", 5, 0, false);
        declareFunction(me, "glf_assert_node_semantics", "GLF-ASSERT-NODE-SEMANTICS", 3, 0, false);
        declareFunction(me, "glf_assert_arc_semantics", "GLF-ASSERT-ARC-SEMANTICS", 4, 0, false);
        declareFunction(me, "glf_unassert_all_node_semantics", "GLF-UNASSERT-ALL-NODE-SEMANTICS", 2, 0, false);
        declareFunction(me, "glf_unassert_all_arc_semantics", "GLF-UNASSERT-ALL-ARC-SEMANTICS", 3, 0, false);
        declareFunction(me, "glf_unassert_all_property_instances_for_component", "GLF-UNASSERT-ALL-PROPERTY-INSTANCES-FOR-COMPONENT", 4, 0, false);
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

    
}

/**
 * Total time: 131 ms
 */
