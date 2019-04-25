package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class glf_api_widgets extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.glf_api_widgets";
    public static final String myFingerPrint = "c4d0284782c580a5b548e831b264b36b6cdbdef80529fe2b54fcf27e4dfddc96";
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 1685L)
    private static SubLSymbol $glf_success_for_kb_operations$;
    private static final SubLSymbol $sym0$GET_GLF_GRAPH_IN_XML;
    private static final SubLString $str1$glfGraph;
    private static final SubLString $str2$http___www_opencyc_org_xml_glf_dt;
    private static final SubLString $str3$All_KB_operations_completed_witho;
    private static final SubLSymbol $sym4$GLF_SUGGEST_NEW_NODE_NAME;
    private static final SubLString $str5$GLFNode;
    private static final SubLSymbol $sym6$GLF_ADD_NODE;
    private static final SubLObject $const7$GLFNode;
    private static final SubLString $str8$Invalid_graph_specified_;
    private static final SubLString $str9$;
    private static final SubLObject $const10$isa;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLObject $const13$nodeInSystem;
    private static final SubLSymbol $sym14$GLF_DROP_NODE;
    private static final SubLSymbol $sym15$GLF_ADD_NODE_SEMANTICS;
    private static final SubLSymbol $sym16$GLF_DROP_NODE_SEMANTICS;
    private static final SubLSymbol $sym17$GLF_ADD_NODE_LABEL;
    private static final SubLObject $const18$glfComponentLabel;
    private static final SubLSymbol $sym19$GLF_DROP_NODE_LABEL;
    private static final SubLSymbol $sym20$GLF_SUGGEST_NEW_ARC_NAME;
    private static final SubLString $str21$GLFArc;
    private static final SubLSymbol $sym22$GLF_ADD_ARC;
    private static final SubLObject $const23$GLFArc;
    private static final SubLObject $const24$linkInSystem;
    private static final SubLSymbol $sym25$GLF_DROP_ARC;
    private static final SubLSymbol $sym26$GLF_CONNECT_ARC_UP;
    private static final SubLString $str27$Multiple_from_nodes_are_currently;
    private static final SubLObject $const28$linkFromToInSystem;
    private static final SubLSymbol $sym29$GLF_DISCONNECT_ARC;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$_FROM;
    private static final SubLSymbol $sym32$_TO;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$GLF_ADD_ARC_LABEL;
    private static final SubLSymbol $sym35$GLF_DROP_ARC_LABEL;
    private static final SubLSymbol $sym36$GLF_ADD_ARC_SEMANTICS;
    private static final SubLSymbol $sym37$GLF_DROP_ARC_SEMANTICS;
    private static final SubLString $str38$_A__D;
    private static final SubLList $list39;
    private static final SubLObject $const40$glfNodeSemantics_Underspecified;
    private static final SubLObject $const41$variableMappingTableForGLFArcInDi;
    private static final SubLObject $const42$AISForFn;
    private static final SubLSymbol $kw43$PROPERTY;
    private static final SubLList $list44;
    private static final SubLSymbol $kw45$SEMANTICS;
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 923L)
    public static SubLObject get_glf_graph_in_xml(SubLObject graph_id, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        SubLObject glf_graph = (SubLObject)glf_api_widgets.NIL;
        SubLObject xml_string = (SubLObject)glf_api_widgets.NIL;
        glf_graph = graphic_library_format.load_glf_graph_from_kb(graph_id, mt);
        SubLObject stream = (SubLObject)glf_api_widgets.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                xml_utilities.generate_valid_xml_header(stream);
                xml_utilities.generate_xml_header_entry_for_dtd((SubLObject)glf_api_widgets.$str1$glfGraph, (SubLObject)glf_api_widgets.$str2$http___www_opencyc_org_xml_glf_dt, stream);
                xml_utilities.xml_terpri();
                graphic_library_format.xml_serialize_glf_graph(glf_graph, stream);
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            xml_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)glf_api_widgets.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)glf_api_widgets.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return xml_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 1843L)
    public static SubLObject glf_suggest_new_node_name(SubLObject prefix) {
        if (prefix == glf_api_widgets.UNPROVIDED) {
            prefix = (SubLObject)glf_api_widgets.$str5$GLFNode;
        }
        return glf_suggest_new_name_for_component(prefix);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 2171L)
    public static SubLObject glf_add_node(final SubLObject node_name, SubLObject graph_id, SubLObject mt, SubLObject type) {
        if (type == glf_api_widgets.UNPROVIDED) {
            type = glf_api_widgets.$const7$GLFNode;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        SubLObject node = (SubLObject)glf_api_widgets.NIL;
        if (glf_api_widgets.NIL == cycl_utilities.fort_or_naut_p(ais)) {
            return Values.values((SubLObject)glf_api_widgets.NIL, (SubLObject)glf_api_widgets.$str8$Invalid_graph_specified_);
        }
        final SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding(thread);
        try {
            rkf_term_utilities.$rkf_name_prefix$.bind((SubLObject)glf_api_widgets.$str9$, thread);
            node = rkf_term_utilities.rkf_create(node_name, mt, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED);
        }
        finally {
            rkf_term_utilities.$rkf_name_prefix$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject successP = glf_assert_assertion_specifications((SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)ConsesLow.listS(glf_api_widgets.$const10$isa, node, (SubLObject)glf_api_widgets.$list11), (SubLObject)glf_api_widgets.$list12), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(glf_api_widgets.$const10$isa, node, type), mt), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(glf_api_widgets.$const13$nodeInSystem, node, ais), mt)));
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (glf_api_widgets.NIL == successP) {
            return Values.values((SubLObject)glf_api_widgets.NIL, reason);
        }
        return Values.values(node, glf_api_widgets.$glf_success_for_kb_operations$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 3206L)
    public static SubLObject glf_drop_node(final SubLObject node, final SubLObject graph_id, final SubLObject mt) {
        rkf_term_utilities.rkf_kill(node);
        return Values.values((SubLObject)glf_api_widgets.T, glf_api_widgets.$glf_success_for_kb_operations$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 3568L)
    public static SubLObject glf_add_node_semantics(SubLObject node, SubLObject graph_id, SubLObject semantics, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        semantics = czer_main.coerce_to_fort(semantics);
        return glf_assert_node_semantics(node, semantics, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 4124L)
    public static SubLObject glf_drop_node_semantics(SubLObject node, SubLObject graph_id, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        return glf_unassert_all_node_semantics(node, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 4570L)
    public static SubLObject glf_add_node_label(SubLObject node, SubLObject graph_id, final SubLObject label, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        return glf_assert_component_property(node, ais, glf_api_widgets.$const18$glfComponentLabel, label, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 5134L)
    public static SubLObject glf_drop_node_label(SubLObject node, SubLObject graph_id, SubLObject mt) {
        node = czer_main.coerce_to_fort(node);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        return glf_unassert_all_property_instances_for_component(node, ais, glf_api_widgets.$const18$glfComponentLabel, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 5673L)
    public static SubLObject glf_suggest_new_arc_name(SubLObject prefix) {
        if (prefix == glf_api_widgets.UNPROVIDED) {
            prefix = (SubLObject)glf_api_widgets.$str21$GLFArc;
        }
        return glf_suggest_new_name_for_component(prefix);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 5997L)
    public static SubLObject glf_add_arc(final SubLObject arc_name, SubLObject graph_id, SubLObject mt, SubLObject type) {
        if (type == glf_api_widgets.UNPROVIDED) {
            type = glf_api_widgets.$const23$GLFArc;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        SubLObject arc = (SubLObject)glf_api_widgets.NIL;
        if (glf_api_widgets.NIL == cycl_utilities.fort_or_naut_p(ais)) {
            return Values.values((SubLObject)glf_api_widgets.NIL, (SubLObject)glf_api_widgets.$str8$Invalid_graph_specified_);
        }
        final SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding(thread);
        try {
            rkf_term_utilities.$rkf_name_prefix$.bind((SubLObject)glf_api_widgets.$str9$, thread);
            arc = rkf_term_utilities.rkf_create(arc_name, mt, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED);
        }
        finally {
            rkf_term_utilities.$rkf_name_prefix$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject successP = glf_assert_assertion_specifications((SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)ConsesLow.listS(glf_api_widgets.$const10$isa, arc, (SubLObject)glf_api_widgets.$list11), (SubLObject)glf_api_widgets.$list12), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(glf_api_widgets.$const10$isa, arc, type), mt), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(glf_api_widgets.$const24$linkInSystem, arc, ais), mt)));
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (glf_api_widgets.NIL == successP) {
            return Values.values((SubLObject)glf_api_widgets.NIL, reason);
        }
        return Values.values(arc, glf_api_widgets.$glf_success_for_kb_operations$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 7017L)
    public static SubLObject glf_drop_arc(final SubLObject arc, final SubLObject graph_id, final SubLObject mt) {
        rkf_term_utilities.rkf_kill(arc);
        return Values.values((SubLObject)glf_api_widgets.T, glf_api_widgets.$glf_success_for_kb_operations$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 7374L)
    public static SubLObject glf_connect_arc_up(SubLObject arc, SubLObject graph_id, final SubLObject from_set, final SubLObject to_set, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        if (glf_api_widgets.NIL == from_set || glf_api_widgets.NIL == to_set) {
            return Values.values((SubLObject)glf_api_widgets.T, glf_api_widgets.$glf_success_for_kb_operations$.getGlobalValue());
        }
        if (glf_api_widgets.NIL == list_utilities.singletonP(from_set)) {
            return Values.values((SubLObject)glf_api_widgets.NIL, (SubLObject)glf_api_widgets.$str27$Multiple_from_nodes_are_currently);
        }
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        SubLObject cdolist_list_var = from_set;
        SubLObject from = (SubLObject)glf_api_widgets.NIL;
        from = cdolist_list_var.first();
        while (glf_api_widgets.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = to_set;
            SubLObject to = (SubLObject)glf_api_widgets.NIL;
            to = cdolist_list_var_$1.first();
            while (glf_api_widgets.NIL != cdolist_list_var_$1) {
                thread.resetMultipleValues();
                final SubLObject successP = glf_assert_assertion_specifications((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(glf_api_widgets.$const28$linkFromToInSystem, arc, from, to, ais), mt)));
                final SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (glf_api_widgets.NIL == successP) {
                    return Values.values((SubLObject)glf_api_widgets.NIL, reason);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                to = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            from = cdolist_list_var.first();
        }
        return Values.values((SubLObject)glf_api_widgets.T, glf_api_widgets.$glf_success_for_kb_operations$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 8615L)
    public static SubLObject glf_disconnect_arc(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        SubLObject cdolist_list_var;
        final SubLObject node_sets_linked = cdolist_list_var = ask_utilities.ask_template((SubLObject)glf_api_widgets.$list30, (SubLObject)ConsesLow.list(glf_api_widgets.$const28$linkFromToInSystem, arc, (SubLObject)glf_api_widgets.$sym31$_FROM, (SubLObject)glf_api_widgets.$sym32$_TO, ais), mt, (SubLObject)glf_api_widgets.ZERO_INTEGER, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED);
        SubLObject node_set_linked = (SubLObject)glf_api_widgets.NIL;
        node_set_linked = cdolist_list_var.first();
        while (glf_api_widgets.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = node_set_linked;
            SubLObject from = (SubLObject)glf_api_widgets.NIL;
            SubLObject to = (SubLObject)glf_api_widgets.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)glf_api_widgets.$list33);
            from = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)glf_api_widgets.$list33);
            to = current.first();
            current = current.rest();
            if (glf_api_widgets.NIL == current) {
                rkf_assertion_utilities.rkf_unassert((SubLObject)ConsesLow.list(glf_api_widgets.$const28$linkFromToInSystem, arc, from, to, ais), mt);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)glf_api_widgets.$list33);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node_set_linked = cdolist_list_var.first();
        }
        return Values.values((SubLObject)glf_api_widgets.T, glf_api_widgets.$glf_success_for_kb_operations$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 9450L)
    public static SubLObject glf_add_arc_label(SubLObject arc, SubLObject graph_id, final SubLObject label, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        return glf_assert_component_property(arc, ais, glf_api_widgets.$const18$glfComponentLabel, label, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 10015L)
    public static SubLObject glf_drop_arc_label(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        return glf_unassert_all_property_instances_for_component(arc, ais, glf_api_widgets.$const18$glfComponentLabel, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 10555L)
    public static SubLObject glf_add_arc_semantics(SubLObject arc, SubLObject graph_id, SubLObject semantics, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        semantics = czer_main.coerce_to_fort(semantics);
        return glf_assert_arc_semantics(arc, semantics, graph_id, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 11108L)
    public static SubLObject glf_drop_arc_semantics(SubLObject arc, SubLObject graph_id, SubLObject mt) {
        arc = czer_main.coerce_to_fort(arc);
        graph_id = czer_main.coerce_to_fort(graph_id);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        return glf_unassert_all_arc_semantics(arc, graph_id, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 11553L)
    public static SubLObject generic_suggest_new_name_for_component(final SubLObject prefix) {
        SubLObject term_name;
        for (term_name = (SubLObject)glf_api_widgets.NIL; glf_api_widgets.NIL == term_name; term_name = (SubLObject)glf_api_widgets.NIL) {
            term_name = PrintLow.format((SubLObject)glf_api_widgets.NIL, (SubLObject)glf_api_widgets.$str38$_A__D, prefix, random.random(Numbers.$most_positive_fixnum$.getGlobalValue()));
            if (glf_api_widgets.NIL == constant_completion_high.constant_name_available(term_name)) {}
        }
        return term_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 11885L)
    public static SubLObject generic_assert_assertion_specifications(final SubLObject assertion_specs, final SubLObject success) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = assertion_specs;
        SubLObject assertion_spec = (SubLObject)glf_api_widgets.NIL;
        assertion_spec = cdolist_list_var.first();
        while (glf_api_widgets.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = assertion_spec;
            SubLObject sentence = (SubLObject)glf_api_widgets.NIL;
            SubLObject elmt = (SubLObject)glf_api_widgets.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)glf_api_widgets.$list39);
            sentence = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)glf_api_widgets.$list39);
            elmt = current.first();
            current = current.rest();
            if (glf_api_widgets.NIL == current) {
                thread.resetMultipleValues();
                final SubLObject successP = rkf_assertion_utilities.rkf_assert_now(sentence, elmt);
                final SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (glf_api_widgets.NIL == successP) {
                    return Values.values((SubLObject)glf_api_widgets.NIL, reason);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)glf_api_widgets.$list39);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion_spec = cdolist_list_var.first();
        }
        return Values.values((SubLObject)glf_api_widgets.T, success);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 12252L)
    public static SubLObject glf_suggest_new_name_for_component(final SubLObject prefix) {
        return generic_suggest_new_name_for_component(prefix);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 12371L)
    public static SubLObject glf_assert_assertion_specifications(final SubLObject assertion_specs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject successP = generic_assert_assertion_specifications(assertion_specs, glf_api_widgets.$glf_success_for_kb_operations$.getGlobalValue());
        final SubLObject message = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(successP, message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 12620L)
    public static SubLObject glf_assert_component_property(final SubLObject component, final SubLObject graph_ref, final SubLObject prop_predicate, final SubLObject property, final SubLObject mt) {
        return glf_assert_assertion_specifications((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(prop_predicate, component, property, graph_ref), mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 12823L)
    public static SubLObject glf_assert_node_semantics(final SubLObject node, final SubLObject semantics, final SubLObject mt) {
        return glf_assert_assertion_specifications((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(glf_api_widgets.$const40$glfNodeSemantics_Underspecified, node, semantics), mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 12996L)
    public static SubLObject glf_assert_arc_semantics(final SubLObject arc, final SubLObject semantics, final SubLObject graph_id, final SubLObject mt) {
        return glf_assert_assertion_specifications((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(glf_api_widgets.$const41$variableMappingTableForGLFArcInDi, semantics, arc, (SubLObject)ConsesLow.list(glf_api_widgets.$const42$AISForFn, graph_id)), mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 13205L)
    public static SubLObject glf_unassert_all_node_semantics(final SubLObject node, final SubLObject mt) {
        final SubLObject prop_predicate = glf_api_widgets.$const40$glfNodeSemantics_Underspecified;
        SubLObject cdolist_list_var;
        final SubLObject property_values = cdolist_list_var = ask_utilities.ask_variable((SubLObject)glf_api_widgets.$kw43$PROPERTY, (SubLObject)ConsesLow.listS(prop_predicate, node, (SubLObject)glf_api_widgets.$list44), mt, (SubLObject)glf_api_widgets.ZERO_INTEGER, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED);
        SubLObject property_value = (SubLObject)glf_api_widgets.NIL;
        property_value = cdolist_list_var.first();
        while (glf_api_widgets.NIL != cdolist_list_var) {
            rkf_assertion_utilities.rkf_unassert((SubLObject)ConsesLow.list(prop_predicate, node, property_value), mt);
            cdolist_list_var = cdolist_list_var.rest();
            property_value = cdolist_list_var.first();
        }
        return Values.values((SubLObject)glf_api_widgets.T, glf_api_widgets.$glf_success_for_kb_operations$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 13620L)
    public static SubLObject glf_unassert_all_arc_semantics(final SubLObject arc, final SubLObject graph_id, final SubLObject mt) {
        final SubLObject prop_predicate = glf_api_widgets.$const41$variableMappingTableForGLFArcInDi;
        SubLObject cdolist_list_var;
        final SubLObject property_values = cdolist_list_var = ask_utilities.ask_variable((SubLObject)glf_api_widgets.$kw45$SEMANTICS, (SubLObject)ConsesLow.list(prop_predicate, (SubLObject)glf_api_widgets.$kw45$SEMANTICS, arc, (SubLObject)ConsesLow.list(glf_api_widgets.$const42$AISForFn, graph_id)), mt, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED);
        SubLObject property_value = (SubLObject)glf_api_widgets.NIL;
        property_value = cdolist_list_var.first();
        while (glf_api_widgets.NIL != cdolist_list_var) {
            rkf_assertion_utilities.rkf_unassert((SubLObject)ConsesLow.list(prop_predicate, property_value, arc, (SubLObject)ConsesLow.list(glf_api_widgets.$const42$AISForFn, graph_id)), mt);
            cdolist_list_var = cdolist_list_var.rest();
            property_value = cdolist_list_var.first();
        }
        return Values.values((SubLObject)glf_api_widgets.T, glf_api_widgets.$glf_success_for_kb_operations$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 14059L)
    public static SubLObject glf_unassert_all_property_instances_for_component(final SubLObject component, final SubLObject graph_ref, final SubLObject prop_predicate, final SubLObject mt) {
        SubLObject cdolist_list_var;
        final SubLObject property_values = cdolist_list_var = ask_utilities.ask_variable((SubLObject)glf_api_widgets.$kw43$PROPERTY, (SubLObject)ConsesLow.list(prop_predicate, component, (SubLObject)glf_api_widgets.$kw43$PROPERTY, graph_ref), mt, (SubLObject)glf_api_widgets.ZERO_INTEGER, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED, (SubLObject)glf_api_widgets.UNPROVIDED);
        SubLObject property_value = (SubLObject)glf_api_widgets.NIL;
        property_value = cdolist_list_var.first();
        while (glf_api_widgets.NIL != cdolist_list_var) {
            rkf_assertion_utilities.rkf_unassert((SubLObject)ConsesLow.list(prop_predicate, component, property_value, graph_ref), mt);
            cdolist_list_var = cdolist_list_var.rest();
            property_value = cdolist_list_var.first();
        }
        return Values.values((SubLObject)glf_api_widgets.T, glf_api_widgets.$glf_success_for_kb_operations$.getGlobalValue());
    }
    
    public static SubLObject declare_glf_api_widgets_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "get_glf_graph_in_xml", "GET-GLF-GRAPH-IN-XML", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_suggest_new_node_name", "GLF-SUGGEST-NEW-NODE-NAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_add_node", "GLF-ADD-NODE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_drop_node", "GLF-DROP-NODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_add_node_semantics", "GLF-ADD-NODE-SEMANTICS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_drop_node_semantics", "GLF-DROP-NODE-SEMANTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_add_node_label", "GLF-ADD-NODE-LABEL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_drop_node_label", "GLF-DROP-NODE-LABEL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_suggest_new_arc_name", "GLF-SUGGEST-NEW-ARC-NAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_add_arc", "GLF-ADD-ARC", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_drop_arc", "GLF-DROP-ARC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_connect_arc_up", "GLF-CONNECT-ARC-UP", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_disconnect_arc", "GLF-DISCONNECT-ARC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_add_arc_label", "GLF-ADD-ARC-LABEL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_drop_arc_label", "GLF-DROP-ARC-LABEL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_add_arc_semantics", "GLF-ADD-ARC-SEMANTICS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_drop_arc_semantics", "GLF-DROP-ARC-SEMANTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "generic_suggest_new_name_for_component", "GENERIC-SUGGEST-NEW-NAME-FOR-COMPONENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "generic_assert_assertion_specifications", "GENERIC-ASSERT-ASSERTION-SPECIFICATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_suggest_new_name_for_component", "GLF-SUGGEST-NEW-NAME-FOR-COMPONENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_assert_assertion_specifications", "GLF-ASSERT-ASSERTION-SPECIFICATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_assert_component_property", "GLF-ASSERT-COMPONENT-PROPERTY", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_assert_node_semantics", "GLF-ASSERT-NODE-SEMANTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_assert_arc_semantics", "GLF-ASSERT-ARC-SEMANTICS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_unassert_all_node_semantics", "GLF-UNASSERT-ALL-NODE-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_unassert_all_arc_semantics", "GLF-UNASSERT-ALL-ARC-SEMANTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glf_api_widgets", "glf_unassert_all_property_instances_for_component", "GLF-UNASSERT-ALL-PROPERTY-INSTANCES-FOR-COMPONENT", 4, 0, false);
        return (SubLObject)glf_api_widgets.NIL;
    }
    
    public static SubLObject init_glf_api_widgets_file() {
        glf_api_widgets.$glf_success_for_kb_operations$ = SubLFiles.deflexical("*GLF-SUCCESS-FOR-KB-OPERATIONS*", (SubLObject)glf_api_widgets.$str3$All_KB_operations_completed_witho);
        return (SubLObject)glf_api_widgets.NIL;
    }
    
    public static SubLObject setup_glf_api_widgets_file() {
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym0$GET_GLF_GRAPH_IN_XML);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym4$GLF_SUGGEST_NEW_NODE_NAME);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym6$GLF_ADD_NODE);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym14$GLF_DROP_NODE);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym15$GLF_ADD_NODE_SEMANTICS);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym16$GLF_DROP_NODE_SEMANTICS);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym17$GLF_ADD_NODE_LABEL);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym19$GLF_DROP_NODE_LABEL);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym20$GLF_SUGGEST_NEW_ARC_NAME);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym22$GLF_ADD_ARC);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym25$GLF_DROP_ARC);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym26$GLF_CONNECT_ARC_UP);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym29$GLF_DISCONNECT_ARC);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym34$GLF_ADD_ARC_LABEL);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym35$GLF_DROP_ARC_LABEL);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym36$GLF_ADD_ARC_SEMANTICS);
        access_macros.register_external_symbol((SubLObject)glf_api_widgets.$sym37$GLF_DROP_ARC_SEMANTICS);
        return (SubLObject)glf_api_widgets.NIL;
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
    
    static {
        me = (SubLFile)new glf_api_widgets();
        glf_api_widgets.$glf_success_for_kb_operations$ = null;
        $sym0$GET_GLF_GRAPH_IN_XML = SubLObjectFactory.makeSymbol("GET-GLF-GRAPH-IN-XML");
        $str1$glfGraph = SubLObjectFactory.makeString("glfGraph");
        $str2$http___www_opencyc_org_xml_glf_dt = SubLObjectFactory.makeString("http://www.opencyc.org/xml/glf.dtd");
        $str3$All_KB_operations_completed_witho = SubLObjectFactory.makeString("All KB operations completed without error.");
        $sym4$GLF_SUGGEST_NEW_NODE_NAME = SubLObjectFactory.makeSymbol("GLF-SUGGEST-NEW-NODE-NAME");
        $str5$GLFNode = SubLObjectFactory.makeString("GLFNode");
        $sym6$GLF_ADD_NODE = SubLObjectFactory.makeSymbol("GLF-ADD-NODE");
        $const7$GLFNode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GLFNode"));
        $str8$Invalid_graph_specified_ = SubLObjectFactory.makeString("Invalid graph specified.");
        $str9$ = SubLObjectFactory.makeString("");
        $const10$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")));
        $list12 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")));
        $const13$nodeInSystem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nodeInSystem"));
        $sym14$GLF_DROP_NODE = SubLObjectFactory.makeSymbol("GLF-DROP-NODE");
        $sym15$GLF_ADD_NODE_SEMANTICS = SubLObjectFactory.makeSymbol("GLF-ADD-NODE-SEMANTICS");
        $sym16$GLF_DROP_NODE_SEMANTICS = SubLObjectFactory.makeSymbol("GLF-DROP-NODE-SEMANTICS");
        $sym17$GLF_ADD_NODE_LABEL = SubLObjectFactory.makeSymbol("GLF-ADD-NODE-LABEL");
        $const18$glfComponentLabel = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("glfComponentLabel"));
        $sym19$GLF_DROP_NODE_LABEL = SubLObjectFactory.makeSymbol("GLF-DROP-NODE-LABEL");
        $sym20$GLF_SUGGEST_NEW_ARC_NAME = SubLObjectFactory.makeSymbol("GLF-SUGGEST-NEW-ARC-NAME");
        $str21$GLFArc = SubLObjectFactory.makeString("GLFArc");
        $sym22$GLF_ADD_ARC = SubLObjectFactory.makeSymbol("GLF-ADD-ARC");
        $const23$GLFArc = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GLFArc"));
        $const24$linkInSystem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("linkInSystem"));
        $sym25$GLF_DROP_ARC = SubLObjectFactory.makeSymbol("GLF-DROP-ARC");
        $sym26$GLF_CONNECT_ARC_UP = SubLObjectFactory.makeSymbol("GLF-CONNECT-ARC-UP");
        $str27$Multiple_from_nodes_are_currently = SubLObjectFactory.makeString("Multiple from-nodes are currently not supported.");
        $const28$linkFromToInSystem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("linkFromToInSystem"));
        $sym29$GLF_DISCONNECT_ARC = SubLObjectFactory.makeSymbol("GLF-DISCONNECT-ARC");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?FROM"), (SubLObject)SubLObjectFactory.makeSymbol("?TO"));
        $sym31$_FROM = SubLObjectFactory.makeSymbol("?FROM");
        $sym32$_TO = SubLObjectFactory.makeSymbol("?TO");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeSymbol("TO"));
        $sym34$GLF_ADD_ARC_LABEL = SubLObjectFactory.makeSymbol("GLF-ADD-ARC-LABEL");
        $sym35$GLF_DROP_ARC_LABEL = SubLObjectFactory.makeSymbol("GLF-DROP-ARC-LABEL");
        $sym36$GLF_ADD_ARC_SEMANTICS = SubLObjectFactory.makeSymbol("GLF-ADD-ARC-SEMANTICS");
        $sym37$GLF_DROP_ARC_SEMANTICS = SubLObjectFactory.makeSymbol("GLF-DROP-ARC-SEMANTICS");
        $str38$_A__D = SubLObjectFactory.makeString("~A-~D");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("ELMT"));
        $const40$glfNodeSemantics_Underspecified = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("glfNodeSemantics-Underspecified"));
        $const41$variableMappingTableForGLFArcInDi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("variableMappingTableForGLFArcInDiagram"));
        $const42$AISForFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AISForFn"));
        $kw43$PROPERTY = SubLObjectFactory.makeKeyword("PROPERTY");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROPERTY"));
        $kw45$SEMANTICS = SubLObjectFactory.makeKeyword("SEMANTICS");
    }
}

/*

	Total time: 131 ms
	
*/