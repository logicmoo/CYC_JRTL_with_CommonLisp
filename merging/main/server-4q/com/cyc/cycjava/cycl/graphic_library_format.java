/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GRAPHIC-LIBRARY-FORMAT
 * source file: /cyc/top/cycl/graphic-library-format.lisp
 * created:     2019/07/03 17:38:02
 */
public final class graphic_library_format extends SubLTranslatedFile implements V12 {
    public static final class $glf_rendering_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_rendering_native.this.$label;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_rendering_native.this.$label = value;
        }

        public SubLObject $label = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.graphic_library_format.$glf_rendering_native.class, GLF_RENDERING, GLF_RENDERING_P, $list_alt169, $list_alt170, new String[]{ "$label" }, $list_alt171, $list_alt172, GLFRNDR_PRINT);
    }

    // Definitions
    public static final class $glf_graph_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$types;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$ais;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$nodes;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$node_types;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$source_node;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$arcs;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$arc_types;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$incoming_connectors;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$outgoing_connectors;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$incoming_connector_types;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$outgoing_connector_types;
        }

        public SubLObject getField14() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$rendering_info;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$types = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$ais = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$nodes = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$node_types = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$source_node = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$arcs = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$arc_types = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$incoming_connectors = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$outgoing_connectors = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$incoming_connector_types = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$outgoing_connector_types = value;
        }

        public SubLObject setField14(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.this.$rendering_info = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $types = Lisp.NIL;

        public SubLObject $ais = Lisp.NIL;

        public SubLObject $nodes = Lisp.NIL;

        public SubLObject $node_types = Lisp.NIL;

        public SubLObject $source_node = Lisp.NIL;

        public SubLObject $arcs = Lisp.NIL;

        public SubLObject $arc_types = Lisp.NIL;

        public SubLObject $incoming_connectors = Lisp.NIL;

        public SubLObject $outgoing_connectors = Lisp.NIL;

        public SubLObject $incoming_connector_types = Lisp.NIL;

        public SubLObject $outgoing_connector_types = Lisp.NIL;

        public SubLObject $rendering_info = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.class, GLF_GRAPH, GLF_GRAPH_P, $list_alt2, $list_alt3, new String[]{ "$id", "$types", "$ais", "$nodes", "$node_types", "$source_node", "$arcs", "$arc_types", "$incoming_connectors", "$outgoing_connectors", "$incoming_connector_types", "$outgoing_connector_types", "$rendering_info" }, $list_alt4, $list_alt5, GLFGRPH_PRINT);
    }

    public static final class $glf_arc_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.this.$types;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.this.$parent;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.this.$from;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.this.$to;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.this.$semantics;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.this.$types = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.this.$parent = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.this.$from = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.this.$to = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.this.$semantics = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $types = Lisp.NIL;

        public SubLObject $parent = Lisp.NIL;

        public SubLObject $from = Lisp.NIL;

        public SubLObject $to = Lisp.NIL;

        public SubLObject $semantics = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.class, GLF_ARC, GLF_ARC_P, $list_alt136, $list_alt137, new String[]{ "$id", "$types", "$parent", "$from", "$to", "$semantics" }, $list_alt138, $list_alt139, GLFARC_PRINT);
    }

    public static final SubLFile me = new graphic_library_format();

 public static final String myName = "com.cyc.cycjava.cycl.graphic_library_format";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_glf_graph$ = makeSymbol("*DTP-GLF-GRAPH*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_glf_node$ = makeSymbol("*DTP-GLF-NODE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_glf_arc$ = makeSymbol("*DTP-GLF-ARC*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_glf_rendering$ = makeSymbol("*DTP-GLF-RENDERING*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol GLF_GRAPH = makeSymbol("GLF-GRAPH");

    private static final SubLSymbol GLF_GRAPH_P = makeSymbol("GLF-GRAPH-P");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("TYPES"), makeSymbol("AIS"), makeSymbol("NODES"), makeSymbol("NODE-TYPES"), makeSymbol("SOURCE-NODE"), makeSymbol("ARCS"), makeSymbol("ARC-TYPES"), makeSymbol("INCOMING-CONNECTORS"), makeSymbol("OUTGOING-CONNECTORS"), makeSymbol("INCOMING-CONNECTOR-TYPES"), makeSymbol("OUTGOING-CONNECTOR-TYPES"), makeSymbol("RENDERING-INFO") });

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("TYPES"), makeKeyword("AIS"), makeKeyword("NODES"), makeKeyword("NODE-TYPES"), makeKeyword("SOURCE-NODE"), $ARCS, makeKeyword("ARC-TYPES"), makeKeyword("INCOMING-CONNECTORS"), makeKeyword("OUTGOING-CONNECTORS"), makeKeyword("INCOMING-CONNECTOR-TYPES"), makeKeyword("OUTGOING-CONNECTOR-TYPES"), makeKeyword("RENDERING-INFO") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("GLFGRPH-ID"), makeSymbol("GLFGRPH-TYPES"), makeSymbol("GLFGRPH-AIS"), makeSymbol("GLFGRPH-NODES"), makeSymbol("GLFGRPH-NODE-TYPES"), makeSymbol("GLFGRPH-SOURCE-NODE"), makeSymbol("GLFGRPH-ARCS"), makeSymbol("GLFGRPH-ARC-TYPES"), makeSymbol("GLFGRPH-INCOMING-CONNECTORS"), makeSymbol("GLFGRPH-OUTGOING-CONNECTORS"), makeSymbol("GLFGRPH-INCOMING-CONNECTOR-TYPES"), makeSymbol("GLFGRPH-OUTGOING-CONNECTOR-TYPES"), makeSymbol("GLFGRPH-RENDERING-INFO") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-GLFGRPH-ID"), makeSymbol("_CSETF-GLFGRPH-TYPES"), makeSymbol("_CSETF-GLFGRPH-AIS"), makeSymbol("_CSETF-GLFGRPH-NODES"), makeSymbol("_CSETF-GLFGRPH-NODE-TYPES"), makeSymbol("_CSETF-GLFGRPH-SOURCE-NODE"), makeSymbol("_CSETF-GLFGRPH-ARCS"), makeSymbol("_CSETF-GLFGRPH-ARC-TYPES"), makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTORS"), makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTORS"), makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTOR-TYPES"), makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTOR-TYPES"), makeSymbol("_CSETF-GLFGRPH-RENDERING-INFO") });

    private static final SubLSymbol GLFGRPH_PRINT = makeSymbol("GLFGRPH-PRINT");

    private static final SubLSymbol GLF_GRAPH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GLF-GRAPH-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GLF-GRAPH-P"));

    private static final SubLSymbol GLFGRPH_ID = makeSymbol("GLFGRPH-ID");

    private static final SubLSymbol _CSETF_GLFGRPH_ID = makeSymbol("_CSETF-GLFGRPH-ID");

    private static final SubLSymbol GLFGRPH_TYPES = makeSymbol("GLFGRPH-TYPES");

    private static final SubLSymbol _CSETF_GLFGRPH_TYPES = makeSymbol("_CSETF-GLFGRPH-TYPES");

    private static final SubLSymbol GLFGRPH_AIS = makeSymbol("GLFGRPH-AIS");

    private static final SubLSymbol _CSETF_GLFGRPH_AIS = makeSymbol("_CSETF-GLFGRPH-AIS");

    private static final SubLSymbol GLFGRPH_NODES = makeSymbol("GLFGRPH-NODES");

    private static final SubLSymbol _CSETF_GLFGRPH_NODES = makeSymbol("_CSETF-GLFGRPH-NODES");

    private static final SubLSymbol GLFGRPH_NODE_TYPES = makeSymbol("GLFGRPH-NODE-TYPES");

    private static final SubLSymbol _CSETF_GLFGRPH_NODE_TYPES = makeSymbol("_CSETF-GLFGRPH-NODE-TYPES");

    private static final SubLSymbol GLFGRPH_SOURCE_NODE = makeSymbol("GLFGRPH-SOURCE-NODE");

    private static final SubLSymbol _CSETF_GLFGRPH_SOURCE_NODE = makeSymbol("_CSETF-GLFGRPH-SOURCE-NODE");

    private static final SubLSymbol GLFGRPH_ARCS = makeSymbol("GLFGRPH-ARCS");

    private static final SubLSymbol _CSETF_GLFGRPH_ARCS = makeSymbol("_CSETF-GLFGRPH-ARCS");

    private static final SubLSymbol GLFGRPH_ARC_TYPES = makeSymbol("GLFGRPH-ARC-TYPES");

    private static final SubLSymbol _CSETF_GLFGRPH_ARC_TYPES = makeSymbol("_CSETF-GLFGRPH-ARC-TYPES");

    private static final SubLSymbol GLFGRPH_INCOMING_CONNECTORS = makeSymbol("GLFGRPH-INCOMING-CONNECTORS");

    private static final SubLSymbol _CSETF_GLFGRPH_INCOMING_CONNECTORS = makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTORS");

    private static final SubLSymbol GLFGRPH_OUTGOING_CONNECTORS = makeSymbol("GLFGRPH-OUTGOING-CONNECTORS");

    private static final SubLSymbol _CSETF_GLFGRPH_OUTGOING_CONNECTORS = makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTORS");

    private static final SubLSymbol GLFGRPH_INCOMING_CONNECTOR_TYPES = makeSymbol("GLFGRPH-INCOMING-CONNECTOR-TYPES");

    private static final SubLSymbol _CSETF_GLFGRPH_INCOMING_CONNECTOR_TYPES = makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTOR-TYPES");

    private static final SubLSymbol GLFGRPH_OUTGOING_CONNECTOR_TYPES = makeSymbol("GLFGRPH-OUTGOING-CONNECTOR-TYPES");

    private static final SubLSymbol _CSETF_GLFGRPH_OUTGOING_CONNECTOR_TYPES = makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTOR-TYPES");

    private static final SubLSymbol GLFGRPH_RENDERING_INFO = makeSymbol("GLFGRPH-RENDERING-INFO");

    private static final SubLSymbol _CSETF_GLFGRPH_RENDERING_INFO = makeSymbol("_CSETF-GLFGRPH-RENDERING-INFO");

    private static final SubLSymbol $INCOMING_CONNECTOR_TYPES = makeKeyword("INCOMING-CONNECTOR-TYPES");

    private static final SubLSymbol $OUTGOING_CONNECTOR_TYPES = makeKeyword("OUTGOING-CONNECTOR-TYPES");

    private static final SubLString $str48$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_GLF_GRAPH = makeSymbol("MAKE-GLF-GRAPH");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GLF_GRAPH_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GLF-GRAPH-METHOD");

    private static final SubLString $str54$_GLF_Graph_ = makeString("<GLF-Graph ");

    private static final SubLString $$$_of_types_ = makeString(" of types ");

    private static final SubLString $str56$_corresponding_AIS__ = makeString(" corresponding AIS: ");

    private static final SubLString $str57$_Types__ = makeString(" Types: ");

    private static final SubLString $str58$__Node_Types__ = makeString("  Node-Types: ");

    private static final SubLString $str59$__Arc_Types__ = makeString("  Arc-Types: ");

    private static final SubLString $str60$__In_Connectors__ = makeString("  In-Connectors: ");

    private static final SubLString $str61$__Out_Connectors__ = makeString("  Out-Connectors: ");

    private static final SubLString $$$_no_information_available_ = makeString(" no information available ");

    private static final SubLString $str63$_Content__ = makeString(" Content: ");

    private static final SubLString $str64$__Nodes__first_is_source___ = makeString("  Nodes (first is source): ");

    private static final SubLString $str65$__Arcs__ = makeString("  Arcs: ");

    private static final SubLString $$$_currently_empty_ = makeString(" currently empty ");

    private static final SubLString $$$_Rendering_Information_ = makeString(" Rendering Information ");

    private static final SubLString $$$__ = makeString("  ");

    private static final SubLString $str69$____ = makeString(" -> ");

    private static final SubLString $str70$__ = makeString("> ");

    private static final SubLString $$$glfGraph = makeString("glfGraph");

    private static final SubLString $$$glfCore = makeString("glfCore");

    private static final SubLString $$$glfNodeTypes = makeString("glfNodeTypes");

    private static final SubLString $$$glfNodeType = makeString("glfNodeType");

    private static final SubLString $$$glfArcTypes = makeString("glfArcTypes");

    private static final SubLString $$$glfArcType = makeString("glfArcType");

    private static final SubLString $$$glfDiagram = makeString("glfDiagram");

    private static final SubLString $$$glfId = makeString("glfId");

    private static final SubLString $$$glfOwnsNodes = makeString("glfOwnsNodes");

    private static final SubLString $$$glfOwnsNode = makeString("glfOwnsNode");

    private static final SubLString $$$glfIsHeadNode = makeString("glfIsHeadNode");

    private static final SubLString $$$glfHasTypes = makeString("glfHasTypes");

    private static final SubLString $$$glfHasType = makeString("glfHasType");

    private static final SubLString $$$glfOwnsArcs = makeString("glfOwnsArcs");

    private static final SubLString $$$glfOwnsArc = makeString("glfOwnsArc");

    private static final SubLString $$$glfFromSet = makeString("glfFromSet");

    private static final SubLString $$$glfFrom = makeString("glfFrom");

    private static final SubLString $$$glfToSet = makeString("glfToSet");

    private static final SubLString $$$glfTo = makeString("glfTo");

    private static final SubLString $$$glfRendering = makeString("glfRendering");

    private static final SubLString $$$glfRenderNodes = makeString("glfRenderNodes");

    private static final SubLString $$$glfRenderNode = makeString("glfRenderNode");

    private static final SubLString $$$glfRenderArcs = makeString("glfRenderArcs");

    private static final SubLString $$$glfRenderArc = makeString("glfRenderArc");

    private static final SubLString $$$glfRenderInfo = makeString("glfRenderInfo");

    private static final SubLString $$$glfRenderLabel = makeString("glfRenderLabel");

    private static final SubLString $$$glfFlowModel = makeString("glfFlowModel");

    private static final SubLString $$$glfSemanticForNodes = makeString("glfSemanticForNodes");

    private static final SubLString $$$glfSemanticForNode = makeString("glfSemanticForNode");

    private static final SubLString $$$glfHasSemantic = makeString("glfHasSemantic");

    private static final SubLString $$$glfSemanticForArcs = makeString("glfSemanticForArcs");

    private static final SubLString $$$glfSemanticForArc = makeString("glfSemanticForArc");



    private static final SubLList $list106 = list(reader_make_constant_shell("Graph-CW"));



    private static final SubLList $list108 = list(makeKeyword("AIS"));











    private static final SubLSymbol GLF_NODE = makeSymbol("GLF-NODE");

    private static final SubLSymbol GLF_NODE_P = makeSymbol("GLF-NODE-P");

    private static final SubLList $list119 = list(makeSymbol("ID"), makeSymbol("TYPES"), makeSymbol("PARENT"), makeSymbol("SEMANTICS"));

    private static final SubLList $list120 = list(makeKeyword("ID"), makeKeyword("TYPES"), makeKeyword("PARENT"), makeKeyword("SEMANTICS"));

    private static final SubLList $list121 = list(makeSymbol("GLFNODE-ID"), makeSymbol("GLFNODE-TYPES"), makeSymbol("GLFNODE-PARENT"), makeSymbol("GLFNODE-SEMANTICS"));

    private static final SubLList $list122 = list(makeSymbol("_CSETF-GLFNODE-ID"), makeSymbol("_CSETF-GLFNODE-TYPES"), makeSymbol("_CSETF-GLFNODE-PARENT"), makeSymbol("_CSETF-GLFNODE-SEMANTICS"));

    private static final SubLSymbol GLFNODE_PRINT = makeSymbol("GLFNODE-PRINT");

    private static final SubLSymbol GLF_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GLF-NODE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list125 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GLF-NODE-P"));

    private static final SubLSymbol GLFNODE_ID = makeSymbol("GLFNODE-ID");

    private static final SubLSymbol _CSETF_GLFNODE_ID = makeSymbol("_CSETF-GLFNODE-ID");

    private static final SubLSymbol GLFNODE_TYPES = makeSymbol("GLFNODE-TYPES");

    private static final SubLSymbol _CSETF_GLFNODE_TYPES = makeSymbol("_CSETF-GLFNODE-TYPES");

    private static final SubLSymbol GLFNODE_PARENT = makeSymbol("GLFNODE-PARENT");

    private static final SubLSymbol _CSETF_GLFNODE_PARENT = makeSymbol("_CSETF-GLFNODE-PARENT");

    private static final SubLSymbol GLFNODE_SEMANTICS = makeSymbol("GLFNODE-SEMANTICS");

    private static final SubLSymbol _CSETF_GLFNODE_SEMANTICS = makeSymbol("_CSETF-GLFNODE-SEMANTICS");

    private static final SubLSymbol MAKE_GLF_NODE = makeSymbol("MAKE-GLF-NODE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GLF_NODE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GLF-NODE-METHOD");

    private static final SubLString $str138$_GLF_Node_ = makeString("<GLF-Node ");

    private static final SubLString $$$_of_graph_ = makeString(" of graph ");

    private static final SubLString $$$_with_semantics_ = makeString(" with semantics ");

    private static final SubLString $$$_without_semantics_ = makeString(" without semantics ");

    private static final SubLObject $$glfNodeSemantics_Underspecified = reader_make_constant_shell("glfNodeSemantics-Underspecified");

    private static final SubLList $list143 = list(makeKeyword("SEMANTICS"));

    private static final SubLSymbol GLF_ARC = makeSymbol("GLF-ARC");

    private static final SubLSymbol GLF_ARC_P = makeSymbol("GLF-ARC-P");

    private static final SubLList $list146 = list(makeSymbol("ID"), makeSymbol("TYPES"), makeSymbol("PARENT"), makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("SEMANTICS"));

    private static final SubLList $list147 = list(makeKeyword("ID"), makeKeyword("TYPES"), makeKeyword("PARENT"), $FROM, makeKeyword("TO"), makeKeyword("SEMANTICS"));

    private static final SubLList $list148 = list(makeSymbol("GLFARC-ID"), makeSymbol("GLFARC-TYPES"), makeSymbol("GLFARC-PARENT"), makeSymbol("GLFARC-FROM"), makeSymbol("GLFARC-TO"), makeSymbol("GLFARC-SEMANTICS"));

    private static final SubLList $list149 = list(makeSymbol("_CSETF-GLFARC-ID"), makeSymbol("_CSETF-GLFARC-TYPES"), makeSymbol("_CSETF-GLFARC-PARENT"), makeSymbol("_CSETF-GLFARC-FROM"), makeSymbol("_CSETF-GLFARC-TO"), makeSymbol("_CSETF-GLFARC-SEMANTICS"));

    private static final SubLSymbol GLFARC_PRINT = makeSymbol("GLFARC-PRINT");

    private static final SubLSymbol GLF_ARC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GLF-ARC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list152 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GLF-ARC-P"));

    private static final SubLSymbol GLFARC_ID = makeSymbol("GLFARC-ID");

    private static final SubLSymbol _CSETF_GLFARC_ID = makeSymbol("_CSETF-GLFARC-ID");

    private static final SubLSymbol GLFARC_TYPES = makeSymbol("GLFARC-TYPES");

    private static final SubLSymbol _CSETF_GLFARC_TYPES = makeSymbol("_CSETF-GLFARC-TYPES");

    private static final SubLSymbol GLFARC_PARENT = makeSymbol("GLFARC-PARENT");

    private static final SubLSymbol _CSETF_GLFARC_PARENT = makeSymbol("_CSETF-GLFARC-PARENT");

    private static final SubLSymbol GLFARC_FROM = makeSymbol("GLFARC-FROM");

    private static final SubLSymbol _CSETF_GLFARC_FROM = makeSymbol("_CSETF-GLFARC-FROM");

    private static final SubLSymbol GLFARC_TO = makeSymbol("GLFARC-TO");

    private static final SubLSymbol _CSETF_GLFARC_TO = makeSymbol("_CSETF-GLFARC-TO");

    private static final SubLSymbol GLFARC_SEMANTICS = makeSymbol("GLFARC-SEMANTICS");

    private static final SubLSymbol _CSETF_GLFARC_SEMANTICS = makeSymbol("_CSETF-GLFARC-SEMANTICS");

    private static final SubLSymbol MAKE_GLF_ARC = makeSymbol("MAKE-GLF-ARC");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GLF_ARC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GLF-ARC-METHOD");

    private static final SubLString $str169$_GLF_Arc_ = makeString("<GLF-Arc ");

    private static final SubLString $str170$_from__ = makeString(" from: ");

    private static final SubLString $str171$_to____ = makeString(" to:   ");

    private static final SubLString $str172$_meaning__ = makeString(" meaning: ");

    private static final SubLObject $const173$variableMappingTableForGLFArcInDi = reader_make_constant_shell("variableMappingTableForGLFArcInDiagram");



    private static final SubLList $list175 = list(makeSymbol("?FROM"), makeSymbol("?TO"));



    private static final SubLSymbol $sym177$_FROM = makeSymbol("?FROM");

    private static final SubLSymbol $sym178$_TO = makeSymbol("?TO");

    private static final SubLList $list179 = list(makeSymbol("SOURCE"), makeSymbol("TARGET"));

    private static final SubLSymbol GLF_RENDERING = makeSymbol("GLF-RENDERING");

    private static final SubLSymbol GLF_RENDERING_P = makeSymbol("GLF-RENDERING-P");

    private static final SubLList $list182 = list(makeSymbol("LABEL"));

    private static final SubLList $list183 = list(makeKeyword("LABEL"));

    private static final SubLList $list184 = list(makeSymbol("GLFRNDR-LABEL"));

    private static final SubLList $list185 = list(makeSymbol("_CSETF-GLFRNDR-LABEL"));

    private static final SubLSymbol GLFRNDR_PRINT = makeSymbol("GLFRNDR-PRINT");

    private static final SubLSymbol GLF_RENDERING_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GLF-RENDERING-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list188 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GLF-RENDERING-P"));

    private static final SubLSymbol GLFRNDR_LABEL = makeSymbol("GLFRNDR-LABEL");

    private static final SubLSymbol _CSETF_GLFRNDR_LABEL = makeSymbol("_CSETF-GLFRNDR-LABEL");

    private static final SubLSymbol MAKE_GLF_RENDERING = makeSymbol("MAKE-GLF-RENDERING");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GLF_RENDERING_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GLF-RENDERING-METHOD");

    private static final SubLString $str194$__GLF_Rendering_ = makeString("#<GLF-Rendering ");

    private static final SubLString $str195$_label__ = makeString(" label: ");



    public static final SubLObject glf_graph_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        glfgrph_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject glf_graph_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        glfgrph_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject glf_graph_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject glf_graph_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native.class ? T : NIL;
    }

    public static final SubLObject glfgrph_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField2();
    }

    public static SubLObject glfgrph_id(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject glfgrph_types_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField3();
    }

    public static SubLObject glfgrph_types(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject glfgrph_ais_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField4();
    }

    public static SubLObject glfgrph_ais(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject glfgrph_nodes_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField5();
    }

    public static SubLObject glfgrph_nodes(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject glfgrph_node_types_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField6();
    }

    public static SubLObject glfgrph_node_types(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject glfgrph_source_node_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField7();
    }

    public static SubLObject glfgrph_source_node(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject glfgrph_arcs_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField8();
    }

    public static SubLObject glfgrph_arcs(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject glfgrph_arc_types_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField9();
    }

    public static SubLObject glfgrph_arc_types(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject glfgrph_incoming_connectors_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField10();
    }

    public static SubLObject glfgrph_incoming_connectors(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject glfgrph_outgoing_connectors_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField11();
    }

    public static SubLObject glfgrph_outgoing_connectors(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject glfgrph_incoming_connector_types_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField12();
    }

    public static SubLObject glfgrph_incoming_connector_types(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject glfgrph_outgoing_connector_types_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField13();
    }

    public static SubLObject glfgrph_outgoing_connector_types(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject glfgrph_rendering_info_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.getField14();
    }

    public static SubLObject glfgrph_rendering_info(final SubLObject v_object) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject _csetf_glfgrph_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_glfgrph_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_glfgrph_types_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_glfgrph_types(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_glfgrph_ais_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_glfgrph_ais(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_glfgrph_nodes_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_glfgrph_nodes(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_glfgrph_node_types_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_glfgrph_node_types(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_glfgrph_source_node_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_glfgrph_source_node(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_glfgrph_arcs_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_glfgrph_arcs(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_glfgrph_arc_types_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_glfgrph_arc_types(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_glfgrph_incoming_connectors_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_glfgrph_incoming_connectors(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_glfgrph_outgoing_connectors_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_glfgrph_outgoing_connectors(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_glfgrph_incoming_connector_types_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_glfgrph_incoming_connector_types(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_glfgrph_outgoing_connector_types_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_glfgrph_outgoing_connector_types(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_glfgrph_rendering_info_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_GRAPH_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_glfgrph_rendering_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_graph_p(v_object) : "! graphic_library_format.glf_graph_p(v_object) " + "graphic_library_format.glf_graph_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject make_glf_graph_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_glfgrph_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TYPES)) {
                            _csetf_glfgrph_types(v_new, current_value);
                        } else {
                            if (pcase_var.eql($AIS)) {
                                _csetf_glfgrph_ais(v_new, current_value);
                            } else {
                                if (pcase_var.eql($NODES)) {
                                    _csetf_glfgrph_nodes(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($NODE_TYPES)) {
                                        _csetf_glfgrph_node_types(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($SOURCE_NODE)) {
                                            _csetf_glfgrph_source_node(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($ARCS)) {
                                                _csetf_glfgrph_arcs(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($ARC_TYPES)) {
                                                    _csetf_glfgrph_arc_types(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($INCOMING_CONNECTORS)) {
                                                        _csetf_glfgrph_incoming_connectors(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($OUTGOING_CONNECTORS)) {
                                                            _csetf_glfgrph_outgoing_connectors(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($INCOMING_CONNECTOR_TYPES)) {
                                                                _csetf_glfgrph_incoming_connector_types(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($OUTGOING_CONNECTOR_TYPES)) {
                                                                    _csetf_glfgrph_outgoing_connector_types(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($RENDERING_INFO)) {
                                                                        _csetf_glfgrph_rendering_info(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
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
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_glf_graph(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.graphic_library_format.$glf_graph_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_glfgrph_id(v_new, current_value);
            } else
                if (pcase_var.eql($TYPES)) {
                    _csetf_glfgrph_types(v_new, current_value);
                } else
                    if (pcase_var.eql($AIS)) {
                        _csetf_glfgrph_ais(v_new, current_value);
                    } else
                        if (pcase_var.eql($NODES)) {
                            _csetf_glfgrph_nodes(v_new, current_value);
                        } else
                            if (pcase_var.eql($NODE_TYPES)) {
                                _csetf_glfgrph_node_types(v_new, current_value);
                            } else
                                if (pcase_var.eql($SOURCE_NODE)) {
                                    _csetf_glfgrph_source_node(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ARCS)) {
                                        _csetf_glfgrph_arcs(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($ARC_TYPES)) {
                                            _csetf_glfgrph_arc_types(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($INCOMING_CONNECTORS)) {
                                                _csetf_glfgrph_incoming_connectors(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($OUTGOING_CONNECTORS)) {
                                                    _csetf_glfgrph_outgoing_connectors(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($INCOMING_CONNECTOR_TYPES)) {
                                                        _csetf_glfgrph_incoming_connector_types(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($OUTGOING_CONNECTOR_TYPES)) {
                                                            _csetf_glfgrph_outgoing_connector_types(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($RENDERING_INFO)) {
                                                                _csetf_glfgrph_rendering_info(v_new, current_value);
                                                            } else {
                                                                Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
                                                            }












        }
        return v_new;
    }

    public static SubLObject visit_defstruct_glf_graph(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GLF_GRAPH, THIRTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, glfgrph_id(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPES, glfgrph_types(obj));
        funcall(visitor_fn, obj, $SLOT, $AIS, glfgrph_ais(obj));
        funcall(visitor_fn, obj, $SLOT, $NODES, glfgrph_nodes(obj));
        funcall(visitor_fn, obj, $SLOT, $NODE_TYPES, glfgrph_node_types(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE_NODE, glfgrph_source_node(obj));
        funcall(visitor_fn, obj, $SLOT, $ARCS, glfgrph_arcs(obj));
        funcall(visitor_fn, obj, $SLOT, $ARC_TYPES, glfgrph_arc_types(obj));
        funcall(visitor_fn, obj, $SLOT, $INCOMING_CONNECTORS, glfgrph_incoming_connectors(obj));
        funcall(visitor_fn, obj, $SLOT, $OUTGOING_CONNECTORS, glfgrph_outgoing_connectors(obj));
        funcall(visitor_fn, obj, $SLOT, $INCOMING_CONNECTOR_TYPES, glfgrph_incoming_connector_types(obj));
        funcall(visitor_fn, obj, $SLOT, $OUTGOING_CONNECTOR_TYPES, glfgrph_outgoing_connector_types(obj));
        funcall(visitor_fn, obj, $SLOT, $RENDERING_INFO, glfgrph_rendering_info(obj));
        funcall(visitor_fn, obj, $END, MAKE_GLF_GRAPH, THIRTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_glf_graph_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_glf_graph(obj, visitor_fn);
    }

    public static final SubLObject glfgrph_has_node_typesP_alt(SubLObject v_graph) {
        return plusp(set.set_size(glfgrph_node_types(v_graph)));
    }

    public static SubLObject glfgrph_has_node_typesP(final SubLObject v_graph) {
        return plusp(set.set_size(glfgrph_node_types(v_graph)));
    }

    public static final SubLObject glfgrph_has_arc_typesP_alt(SubLObject v_graph) {
        return plusp(set.set_size(glfgrph_arc_types(v_graph)));
    }

    public static SubLObject glfgrph_has_arc_typesP(final SubLObject v_graph) {
        return plusp(set.set_size(glfgrph_arc_types(v_graph)));
    }

    public static final SubLObject glfgrph_has_incoming_connector_typesP_alt(SubLObject v_graph) {
        return plusp(set.set_size(glfgrph_incoming_connector_types(v_graph)));
    }

    public static SubLObject glfgrph_has_incoming_connector_typesP(final SubLObject v_graph) {
        return plusp(set.set_size(glfgrph_incoming_connector_types(v_graph)));
    }

    public static final SubLObject glfgrph_has_outgoing_connector_typesP_alt(SubLObject v_graph) {
        return plusp(set.set_size(glfgrph_outgoing_connector_types(v_graph)));
    }

    public static SubLObject glfgrph_has_outgoing_connector_typesP(final SubLObject v_graph) {
        return plusp(set.set_size(glfgrph_outgoing_connector_types(v_graph)));
    }

    public static final SubLObject glfgrph_has_rendering_infoP_alt(SubLObject v_graph) {
        return makeBoolean(NIL == dictionary.dictionary_empty_p(glfgrph_rendering_info(v_graph)));
    }

    public static SubLObject glfgrph_has_rendering_infoP(final SubLObject v_graph) {
        return makeBoolean(NIL == dictionary.dictionary_empty_p(glfgrph_rendering_info(v_graph)));
    }

    public static final SubLObject glfgrph_has_nodesP_alt(SubLObject v_graph) {
        return list_utilities.sublisp_boolean(glfgrph_nodes(v_graph));
    }

    public static SubLObject glfgrph_has_nodesP(final SubLObject v_graph) {
        return list_utilities.sublisp_boolean(glfgrph_nodes(v_graph));
    }

    public static final SubLObject glfgrph_has_arcsP_alt(SubLObject v_graph) {
        return list_utilities.sublisp_boolean(glfgrph_arcs(v_graph));
    }

    public static SubLObject glfgrph_has_arcsP(final SubLObject v_graph) {
        return list_utilities.sublisp_boolean(glfgrph_arcs(v_graph));
    }

    public static final SubLObject glfgrph_print_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            string_utilities.indent(stream, depth);
            write_string($str_alt48$_GLF_Graph_, stream, UNPROVIDED, UNPROVIDED);
            prin1(glfgrph_id(v_object), stream);
            write_string($str_alt49$_of_types_, stream, UNPROVIDED, UNPROVIDED);
            prin1(glfgrph_types(v_object), stream);
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str_alt50$_corresponding_AIS__, stream, UNPROVIDED, UNPROVIDED);
            prin1(glfgrph_ais(v_object), stream);
            {
                SubLObject showed_typeP = NIL;
                terpri(stream);
                string_utilities.indent(stream, depth);
                write_string($str_alt51$_Types__, stream, UNPROVIDED, UNPROVIDED);
                if (NIL != glfgrph_has_node_typesP(v_object)) {
                    showed_typeP = T;
                    terpri(stream);
                    string_utilities.indent(stream, depth);
                    write_string($str_alt52$__Node_Types__, stream, UNPROVIDED, UNPROVIDED);
                    prin1(glfgrph_node_types(v_object), stream);
                }
                if (NIL != glfgrph_has_arc_typesP(v_object)) {
                    showed_typeP = T;
                    terpri(stream);
                    string_utilities.indent(stream, depth);
                    write_string($str_alt53$__Arc_Types__, stream, UNPROVIDED, UNPROVIDED);
                    prin1(glfgrph_arc_types(v_object), stream);
                }
                if (NIL != glfgrph_has_incoming_connector_typesP(v_object)) {
                    showed_typeP = T;
                    terpri(stream);
                    string_utilities.indent(stream, depth);
                    write_string($str_alt54$__In_Connectors__, stream, UNPROVIDED, UNPROVIDED);
                    prin1(glfgrph_incoming_connector_types(v_object), stream);
                }
                if (NIL != glfgrph_has_outgoing_connector_typesP(v_object)) {
                    showed_typeP = T;
                    terpri(stream);
                    string_utilities.indent(stream, depth);
                    write_string($str_alt55$__Out_Connectors__, stream, UNPROVIDED, UNPROVIDED);
                    prin1(glfgrph_outgoing_connector_types(v_object), stream);
                }
                if (NIL == showed_typeP) {
                    write_string($str_alt56$_no_information_available_, stream, UNPROVIDED, UNPROVIDED);
                }
            }
            {
                SubLObject showed_elementsP = NIL;
                terpri(stream);
                string_utilities.indent(stream, depth);
                write_string($str_alt57$_Content__, stream, UNPROVIDED, UNPROVIDED);
                if (NIL != glfgrph_nodes(v_object)) {
                    showed_elementsP = T;
                    terpri(stream);
                    string_utilities.indent(stream, depth);
                    write_string($str_alt58$__Nodes__first_is_source___, stream, UNPROVIDED, UNPROVIDED);
                    if (NIL != glfgrph_source_node(v_object)) {
                        terpri(stream);
                        glfnode_print(glfgrph_source_node(v_object), stream, add(depth, THREE_INTEGER));
                    }
                    {
                        SubLObject cdolist_list_var = glfgrph_nodes(v_object);
                        SubLObject node = NIL;
                        for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                            if (node != glfgrph_source_node(v_object)) {
                                terpri(stream);
                                glfnode_print(node, stream, add(depth, THREE_INTEGER));
                            }
                        }
                    }
                }
                if (NIL != glfgrph_arcs(v_object)) {
                    showed_elementsP = T;
                    terpri(stream);
                    string_utilities.indent(stream, depth);
                    write_string($str_alt59$__Arcs__, stream, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = glfgrph_arcs(v_object);
                        SubLObject arc = NIL;
                        for (arc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arc = cdolist_list_var.first()) {
                            terpri(stream);
                            glfarc_print(arc, stream, add(depth, THREE_INTEGER));
                        }
                    }
                }
                if (NIL == showed_elementsP) {
                    write_string($str_alt60$_currently_empty_, stream, UNPROVIDED, UNPROVIDED);
                }
            }
            if (NIL != glfgrph_has_rendering_infoP(v_object)) {
                terpri(stream);
                string_utilities.indent(stream, depth);
                write_string($str_alt61$_Rendering_Information_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(glfgrph_rendering_info(v_object)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject component_id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject rendering = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            terpri(stream);
                            string_utilities.indent(stream, depth);
                            write_string($str_alt62$__, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            prin1(component_id, stream);
                            write_string($str_alt63$____, stream, UNPROVIDED, UNPROVIDED);
                            glfrndr_print(rendering, stream, add(depth, THREE_INTEGER));
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
            }
            write_string($str_alt64$__, stream, UNPROVIDED, UNPROVIDED);
            return v_object;
        }
    }

    public static SubLObject glfgrph_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        string_utilities.indent(stream, depth);
        write_string($str54$_GLF_Graph_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfgrph_id(v_object), stream);
        write_string($$$_of_types_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfgrph_types(v_object), stream);
        terpri(stream);
        string_utilities.indent(stream, depth);
        write_string($str56$_corresponding_AIS__, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfgrph_ais(v_object), stream);
        SubLObject showed_typeP = NIL;
        terpri(stream);
        string_utilities.indent(stream, depth);
        write_string($str57$_Types__, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != glfgrph_has_node_typesP(v_object)) {
            showed_typeP = T;
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str58$__Node_Types__, stream, UNPROVIDED, UNPROVIDED);
            prin1(glfgrph_node_types(v_object), stream);
        }
        if (NIL != glfgrph_has_arc_typesP(v_object)) {
            showed_typeP = T;
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str59$__Arc_Types__, stream, UNPROVIDED, UNPROVIDED);
            prin1(glfgrph_arc_types(v_object), stream);
        }
        if (NIL != glfgrph_has_incoming_connector_typesP(v_object)) {
            showed_typeP = T;
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str60$__In_Connectors__, stream, UNPROVIDED, UNPROVIDED);
            prin1(glfgrph_incoming_connector_types(v_object), stream);
        }
        if (NIL != glfgrph_has_outgoing_connector_typesP(v_object)) {
            showed_typeP = T;
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str61$__Out_Connectors__, stream, UNPROVIDED, UNPROVIDED);
            prin1(glfgrph_outgoing_connector_types(v_object), stream);
        }
        if (NIL == showed_typeP) {
            write_string($$$_no_information_available_, stream, UNPROVIDED, UNPROVIDED);
        }
        SubLObject showed_elementsP = NIL;
        terpri(stream);
        string_utilities.indent(stream, depth);
        write_string($str63$_Content__, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != glfgrph_nodes(v_object)) {
            showed_elementsP = T;
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str64$__Nodes__first_is_source___, stream, UNPROVIDED, UNPROVIDED);
            if (NIL != glfgrph_source_node(v_object)) {
                terpri(stream);
                glfnode_print(glfgrph_source_node(v_object), stream, add(depth, THREE_INTEGER));
            }
            SubLObject cdolist_list_var = glfgrph_nodes(v_object);
            SubLObject node = NIL;
            node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!node.eql(glfgrph_source_node(v_object))) {
                    terpri(stream);
                    glfnode_print(node, stream, add(depth, THREE_INTEGER));
                }
                cdolist_list_var = cdolist_list_var.rest();
                node = cdolist_list_var.first();
            } 
        }
        if (NIL != glfgrph_arcs(v_object)) {
            showed_elementsP = T;
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str65$__Arcs__, stream, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = glfgrph_arcs(v_object);
            SubLObject arc = NIL;
            arc = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                terpri(stream);
                glfarc_print(arc, stream, add(depth, THREE_INTEGER));
                cdolist_list_var = cdolist_list_var.rest();
                arc = cdolist_list_var.first();
            } 
        }
        if (NIL == showed_elementsP) {
            write_string($$$_currently_empty_, stream, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != glfgrph_has_rendering_infoP(v_object)) {
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($$$_Rendering_Information_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(glfgrph_rendering_info(v_object))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject component_id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject rendering = thread.secondMultipleValue();
                thread.resetMultipleValues();
                terpri(stream);
                string_utilities.indent(stream, depth);
                write_string($$$__, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                prin1(component_id, stream);
                write_string($str69$____, stream, UNPROVIDED, UNPROVIDED);
                glfrndr_print(rendering, stream, add(depth, THREE_INTEGER));
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        write_string($str70$__, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static final SubLObject xml_serialize_glf_graph_alt(SubLObject glf_graph, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(glf_graph, GLF_GRAPH_P);
            {
                SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    {
                        SubLObject _prev_bind_0_1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$glfGraph, NIL, NIL);
                            xml_serialize_glf_graph_core(glf_graph, stream);
                            xml_serialize_glf_graph_diagram(glf_graph, stream);
                            xml_serialize_glf_graph_rendering(glf_graph, stream);
                            xml_serialize_glf_graph_flow_model(glf_graph, stream);
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_1, thread);
                        }
                    }
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$glfGraph);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return glf_graph;
        }
    }

    public static SubLObject xml_serialize_glf_graph(final SubLObject glf_graph, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != glf_graph_p(glf_graph) : "! graphic_library_format.glf_graph_p(glf_graph) " + ("graphic_library_format.glf_graph_p(glf_graph) " + "CommonSymbols.NIL != graphic_library_format.glf_graph_p(glf_graph) ") + glf_graph;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$glfGraph, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_serialize_glf_graph_core(glf_graph, stream);
                        xml_serialize_glf_graph_diagram(glf_graph, stream);
                        xml_serialize_glf_graph_rendering(glf_graph, stream);
                        xml_serialize_glf_graph_flow_model(glf_graph, stream);
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$glfGraph);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return glf_graph;
    }

    public static final SubLObject xml_serialize_glf_graph_core_alt(SubLObject glf_graph, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$glfCore, NIL, NIL);
                    if (NIL != glfgrph_has_node_typesP(glf_graph)) {
                        {
                            SubLObject _prev_bind_0_2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfNodeTypes, NIL, NIL);
                                {
                                    SubLObject set_contents_var = set.do_set_internal(glfgrph_node_types(glf_graph));
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject type = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                                {
                                                    SubLObject _prev_bind_0_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$glfNodeType, NIL, NIL);
                                                        cycml.cycml_serialize_term(type);
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_5, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$glfNodeType);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_3, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$glfNodeTypes);
                    }
                    if (NIL != glfgrph_has_arc_typesP(glf_graph)) {
                        {
                            SubLObject _prev_bind_0_6 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1_7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfArcTypes, NIL, NIL);
                                {
                                    SubLObject set_contents_var = set.do_set_internal(glfgrph_arc_types(glf_graph));
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject type = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                                {
                                                    SubLObject _prev_bind_0_8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$glfArcType, NIL, NIL);
                                                        cycml.cycml_serialize_term(type);
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_9, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_8, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$glfArcType);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_7, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_6, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$glfArcTypes);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($$$glfCore);
            return glf_graph;
        }
    }

    public static SubLObject xml_serialize_glf_graph_core(final SubLObject glf_graph, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$glfCore, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    if (NIL != glfgrph_has_node_typesP(glf_graph)) {
                        try {
                            final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfNodeTypes, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    final SubLObject set_var = glfgrph_node_types(glf_graph);
                                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                                    SubLObject basis_object;
                                    SubLObject state;
                                    SubLObject type;
                                    SubLObject _prev_bind_0_$7;
                                    SubLObject _prev_bind_1_$7;
                                    SubLObject _prev_bind_0_$8;
                                    SubLObject _prev_bind_0_$9;
                                    SubLObject _values;
                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        type = set_contents.do_set_contents_next(basis_object, state);
                                        if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                            try {
                                                _prev_bind_0_$7 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$glfNodeType, NIL, NIL, NIL, $UNINITIALIZED);
                                                    _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        cycml.cycml_serialize_term(type);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$7, thread);
                                                }
                                            } finally {
                                                _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    _values = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$glfNodeType);
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$5, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$glfNodeTypes);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                    }
                    if (NIL != glfgrph_has_arc_typesP(glf_graph)) {
                        try {
                            final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfArcTypes, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    final SubLObject set_var = glfgrph_arc_types(glf_graph);
                                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                                    SubLObject basis_object;
                                    SubLObject state;
                                    SubLObject type;
                                    SubLObject _prev_bind_0_$13;
                                    SubLObject _prev_bind_1_$9;
                                    SubLObject _prev_bind_0_$14;
                                    SubLObject _prev_bind_0_$15;
                                    SubLObject _values3;
                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        type = set_contents.do_set_contents_next(basis_object, state);
                                        if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                            try {
                                                _prev_bind_0_$13 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$glfArcType, NIL, NIL, NIL, $UNINITIALIZED);
                                                    _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        cycml.cycml_serialize_term(type);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$9, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$13, thread);
                                                }
                                            } finally {
                                                _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    _values3 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$glfArcType);
                                                    restoreValuesFromVector(_values3);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$11, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$glfArcTypes);
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values5 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$glfCore);
                restoreValuesFromVector(_values5);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return glf_graph;
    }

    public static final SubLObject xml_serialize_glf_graph_diagram_alt(SubLObject glf_graph, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$glfDiagram, NIL, NIL);
                    {
                        SubLObject _prev_bind_0_10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1_11 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL);
                            cycml.cycml_serialize_term(glfgrph_id(glf_graph));
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_11, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_10, thread);
                        }
                    }
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$glfId);
                    if (NIL != glfgrph_has_nodesP(glf_graph)) {
                        {
                            SubLObject _prev_bind_0_12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1_13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfOwnsNodes, NIL, NIL);
                                {
                                    SubLObject cdolist_list_var = glfgrph_nodes(glf_graph);
                                    SubLObject node = NIL;
                                    for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                        {
                                            SubLObject _prev_bind_0_14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            SubLObject _prev_bind_1_15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$glfOwnsNode, NIL, NIL);
                                                if (node == glfgrph_source_node(glf_graph)) {
                                                    {
                                                        SubLObject _prev_bind_0_16 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_17 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$glfIsHeadNode, NIL, $ATOMIC);
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_17, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_16, thread);
                                                        }
                                                    }
                                                    if (false) {
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal($$$glfIsHeadNode);
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_18 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL);
                                                        cycml.cycml_serialize_term(glfnode_id(node));
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_19, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_18, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$glfId);
                                                {
                                                    SubLObject _prev_bind_0_20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$glfHasTypes, NIL, NIL);
                                                        {
                                                            SubLObject cdolist_list_var_22 = glfnode_types(node);
                                                            SubLObject type = NIL;
                                                            for (type = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , type = cdolist_list_var_22.first()) {
                                                                {
                                                                    SubLObject _prev_bind_0_23 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$glfHasType, NIL, NIL);
                                                                        {
                                                                            SubLObject _prev_bind_0_25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL);
                                                                                cycml.cycml_serialize_term(type);
                                                                            } finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_26, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_25, thread);
                                                                            }
                                                                        }
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal($$$glfId);
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_24, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_23, thread);
                                                                    }
                                                                }
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$glfHasType);
                                                            }
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_21, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_20, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$glfHasTypes);
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_15, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_14, thread);
                                            }
                                        }
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$glfOwnsNode);
                                    }
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_13, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_12, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$glfOwnsNodes);
                    }
                    if (NIL != glfgrph_has_arcsP(glf_graph)) {
                        {
                            SubLObject _prev_bind_0_27 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1_28 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfOwnsArcs, NIL, NIL);
                                {
                                    SubLObject cdolist_list_var = glfgrph_arcs(glf_graph);
                                    SubLObject arc = NIL;
                                    for (arc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arc = cdolist_list_var.first()) {
                                        {
                                            SubLObject _prev_bind_0_29 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            SubLObject _prev_bind_1_30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$glfOwnsArc, NIL, NIL);
                                                {
                                                    SubLObject _prev_bind_0_31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL);
                                                        cycml.cycml_serialize_term(glfarc_id(arc));
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_32, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_31, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$glfId);
                                                {
                                                    SubLObject _prev_bind_0_33 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$glfHasTypes, NIL, NIL);
                                                        {
                                                            SubLObject cdolist_list_var_35 = glfarc_types(arc);
                                                            SubLObject type = NIL;
                                                            for (type = cdolist_list_var_35.first(); NIL != cdolist_list_var_35; cdolist_list_var_35 = cdolist_list_var_35.rest() , type = cdolist_list_var_35.first()) {
                                                                {
                                                                    SubLObject _prev_bind_0_36 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_37 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$glfHasType, NIL, NIL);
                                                                        {
                                                                            SubLObject _prev_bind_0_38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_39 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL);
                                                                                cycml.cycml_serialize_term(type);
                                                                            } finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_39, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_38, thread);
                                                                            }
                                                                        }
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal($$$glfId);
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_37, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_36, thread);
                                                                    }
                                                                }
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$glfHasType);
                                                            }
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_34, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_33, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$glfHasTypes);
                                                {
                                                    SubLObject _prev_bind_0_40 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_41 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$glfFromSet, NIL, NIL);
                                                        {
                                                            SubLObject set_contents_var = set.do_set_internal(glfarc_from(arc));
                                                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                            SubLObject state = NIL;
                                                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                {
                                                                    SubLObject from = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, from)) {
                                                                        {
                                                                            SubLObject _prev_bind_0_42 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_43 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal($$$glfFrom, NIL, NIL);
                                                                                {
                                                                                    SubLObject _prev_bind_0_44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_45 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                        xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL);
                                                                                        cycml.cycml_serialize_term(from);
                                                                                    } finally {
                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_45, thread);
                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_44, thread);
                                                                                    }
                                                                                }
                                                                                xml_utilities.xml_terpri();
                                                                                xml_utilities.xml_end_tag_internal($$$glfId);
                                                                            } finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_43, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_42, thread);
                                                                            }
                                                                        }
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal($$$glfFrom);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_41, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_40, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$glfFromSet);
                                                {
                                                    SubLObject _prev_bind_0_46 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_47 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$glfToSet, NIL, NIL);
                                                        {
                                                            SubLObject set_contents_var = set.do_set_internal(glfarc_to(arc));
                                                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                            SubLObject state = NIL;
                                                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                {
                                                                    SubLObject to = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, to)) {
                                                                        {
                                                                            SubLObject _prev_bind_0_48 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_49 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal($$$glfTo, NIL, NIL);
                                                                                {
                                                                                    SubLObject _prev_bind_0_50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_51 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                        xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL);
                                                                                        cycml.cycml_serialize_term(to);
                                                                                    } finally {
                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_51, thread);
                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_50, thread);
                                                                                    }
                                                                                }
                                                                                xml_utilities.xml_terpri();
                                                                                xml_utilities.xml_end_tag_internal($$$glfId);
                                                                            } finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_49, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_48, thread);
                                                                            }
                                                                        }
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal($$$glfTo);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_47, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_46, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$glfToSet);
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_30, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_29, thread);
                                            }
                                        }
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$glfOwnsArc);
                                    }
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_28, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_27, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$glfOwnsArcs);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($$$glfDiagram);
            return glf_graph;
        }
    }

    public static SubLObject xml_serialize_glf_graph_diagram(final SubLObject glf_graph, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$glfDiagram, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$23 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                cycml.cycml_serialize_term(glfgrph_id(glf_graph));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$23, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$23, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$22, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$glfId);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                        }
                    }
                    if (NIL != glfgrph_has_nodesP(glf_graph)) {
                        try {
                            final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfOwnsNodes, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = glfgrph_nodes(glf_graph);
                                    SubLObject node = NIL;
                                    node = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        try {
                                            final SubLObject _prev_bind_0_$27 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$glfOwnsNode, NIL, NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    if (node.eql(glfgrph_source_node(glf_graph))) {
                                                        try {
                                                            final SubLObject _prev_bind_0_$29 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$glfIsHeadNode, NIL, $ATOMIC, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$26, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$29, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values2 = getValuesAsVector();
                                                                restoreValuesFromVector(_values2);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$32 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$33 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                cycml.cycml_serialize_term(glfnode_id(node));
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$33, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$27, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$32, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values3 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$glfId);
                                                            restoreValuesFromVector(_values3);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$35 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$28 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$glfHasTypes, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                SubLObject cdolist_list_var_$43 = glfnode_types(node);
                                                                SubLObject type = NIL;
                                                                type = cdolist_list_var_$43.first();
                                                                while (NIL != cdolist_list_var_$43) {
                                                                    try {
                                                                        final SubLObject _prev_bind_0_$37 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$29 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                        try {
                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                            xml_utilities.xml_start_tag_internal($$$glfHasType, NIL, NIL, NIL, $UNINITIALIZED);
                                                                            final SubLObject _prev_bind_0_$38 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                            try {
                                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                try {
                                                                                    final SubLObject _prev_bind_0_$39 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                    final SubLObject _prev_bind_1_$30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                        xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                        final SubLObject _prev_bind_0_$40 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                        try {
                                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                            cycml.cycml_serialize_term(type);
                                                                                        } finally {
                                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$40, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$30, thread);
                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$39, thread);
                                                                                    }
                                                                                } finally {
                                                                                    final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        final SubLObject _values4 = getValuesAsVector();
                                                                                        xml_utilities.xml_terpri();
                                                                                        xml_utilities.xml_end_tag_internal($$$glfId);
                                                                                        restoreValuesFromVector(_values4);
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$38, thread);
                                                                            }
                                                                        } finally {
                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$29, thread);
                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$37, thread);
                                                                        }
                                                                    } finally {
                                                                        final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values5 = getValuesAsVector();
                                                                            xml_utilities.xml_terpri();
                                                                            xml_utilities.xml_end_tag_internal($$$glfHasType);
                                                                            restoreValuesFromVector(_values5);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                                                                        }
                                                                    }
                                                                    cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                                                                    type = cdolist_list_var_$43.first();
                                                                } 
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$36, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$28, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$35, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values6 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$glfHasTypes);
                                                            restoreValuesFromVector(_values6);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                                        }
                                                    }
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$28, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$25, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$27, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values7 = getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$glfOwnsNode);
                                                restoreValuesFromVector(_values7);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        node = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$26, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$24, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$25, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values8 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$glfOwnsNodes);
                                restoreValuesFromVector(_values8);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                            }
                        }
                    }
                    if (NIL != glfgrph_has_arcsP(glf_graph)) {
                        try {
                            final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$31 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfOwnsArcs, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = glfgrph_arcs(glf_graph);
                                    SubLObject arc = NIL;
                                    arc = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        try {
                                            final SubLObject _prev_bind_0_$48 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$glfOwnsArc, NIL, NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$49 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    try {
                                                        final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                cycml.cycml_serialize_term(glfarc_id(arc));
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$51, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$33, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$50, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values9 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$glfId);
                                                            restoreValuesFromVector(_values9);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$53 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$glfHasTypes, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$54 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                SubLObject cdolist_list_var_$44 = glfarc_types(arc);
                                                                SubLObject type = NIL;
                                                                type = cdolist_list_var_$44.first();
                                                                while (NIL != cdolist_list_var_$44) {
                                                                    try {
                                                                        final SubLObject _prev_bind_0_$55 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$35 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                        try {
                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                            xml_utilities.xml_start_tag_internal($$$glfHasType, NIL, NIL, NIL, $UNINITIALIZED);
                                                                            final SubLObject _prev_bind_0_$56 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                            try {
                                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                try {
                                                                                    final SubLObject _prev_bind_0_$57 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                    final SubLObject _prev_bind_1_$36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                        xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                        final SubLObject _prev_bind_0_$58 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                        try {
                                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                            cycml.cycml_serialize_term(type);
                                                                                        } finally {
                                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$58, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$36, thread);
                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$57, thread);
                                                                                    }
                                                                                } finally {
                                                                                    final SubLObject _prev_bind_0_$59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        final SubLObject _values10 = getValuesAsVector();
                                                                                        xml_utilities.xml_terpri();
                                                                                        xml_utilities.xml_end_tag_internal($$$glfId);
                                                                                        restoreValuesFromVector(_values10);
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$56, thread);
                                                                            }
                                                                        } finally {
                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$35, thread);
                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$55, thread);
                                                                        }
                                                                    } finally {
                                                                        final SubLObject _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values11 = getValuesAsVector();
                                                                            xml_utilities.xml_terpri();
                                                                            xml_utilities.xml_end_tag_internal($$$glfHasType);
                                                                            restoreValuesFromVector(_values11);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                                                        }
                                                                    }
                                                                    cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                                                                    type = cdolist_list_var_$44.first();
                                                                } 
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$54, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$34, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$53, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values12 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$glfHasTypes);
                                                            restoreValuesFromVector(_values12);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$62 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$37 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$glfFromSet, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$63 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                final SubLObject set_var = glfarc_from(arc);
                                                                final SubLObject set_contents_var = set.do_set_internal(set_var);
                                                                SubLObject basis_object;
                                                                SubLObject state;
                                                                SubLObject from;
                                                                SubLObject _prev_bind_0_$64;
                                                                SubLObject _prev_bind_1_$38;
                                                                SubLObject _prev_bind_0_$65;
                                                                SubLObject _prev_bind_0_$66;
                                                                SubLObject _prev_bind_1_$39;
                                                                SubLObject _prev_bind_0_$67;
                                                                SubLObject _prev_bind_0_$68;
                                                                SubLObject _values13;
                                                                SubLObject _prev_bind_0_$69;
                                                                SubLObject _values14;
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                    from = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, from)) {
                                                                        try {
                                                                            _prev_bind_0_$64 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            _prev_bind_1_$38 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal($$$glfFrom, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                _prev_bind_0_$65 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                try {
                                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                    try {
                                                                                        _prev_bind_0_$66 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                        _prev_bind_1_$39 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                        try {
                                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                            xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                            _prev_bind_0_$67 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                cycml.cycml_serialize_term(from);
                                                                                            } finally {
                                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$67, thread);
                                                                                            }
                                                                                        } finally {
                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$39, thread);
                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$66, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            _values13 = getValuesAsVector();
                                                                                            xml_utilities.xml_terpri();
                                                                                            xml_utilities.xml_end_tag_internal($$$glfId);
                                                                                            restoreValuesFromVector(_values13);
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$65, thread);
                                                                                }
                                                                            } finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$38, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$64, thread);
                                                                            }
                                                                        } finally {
                                                                            _prev_bind_0_$69 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                _values14 = getValuesAsVector();
                                                                                xml_utilities.xml_terpri();
                                                                                xml_utilities.xml_end_tag_internal($$$glfFrom);
                                                                                restoreValuesFromVector(_values14);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$63, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$37, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$62, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values15 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$glfFromSet);
                                                            restoreValuesFromVector(_values15);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$71 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$40 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$glfToSet, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$72 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                final SubLObject set_var = glfarc_to(arc);
                                                                final SubLObject set_contents_var = set.do_set_internal(set_var);
                                                                SubLObject basis_object;
                                                                SubLObject state;
                                                                SubLObject to;
                                                                SubLObject _prev_bind_0_$73;
                                                                SubLObject _prev_bind_1_$41;
                                                                SubLObject _prev_bind_0_$74;
                                                                SubLObject _prev_bind_0_$75;
                                                                SubLObject _prev_bind_1_$42;
                                                                SubLObject _prev_bind_0_$76;
                                                                SubLObject _prev_bind_0_$77;
                                                                SubLObject _values16;
                                                                SubLObject _prev_bind_0_$78;
                                                                SubLObject _values17;
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                    to = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, to)) {
                                                                        try {
                                                                            _prev_bind_0_$73 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            _prev_bind_1_$41 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal($$$glfTo, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                _prev_bind_0_$74 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                try {
                                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                    try {
                                                                                        _prev_bind_0_$75 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                        _prev_bind_1_$42 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                        try {
                                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                            xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                            _prev_bind_0_$76 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                cycml.cycml_serialize_term(to);
                                                                                            } finally {
                                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$76, thread);
                                                                                            }
                                                                                        } finally {
                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$42, thread);
                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$75, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            _values16 = getValuesAsVector();
                                                                                            xml_utilities.xml_terpri();
                                                                                            xml_utilities.xml_end_tag_internal($$$glfId);
                                                                                            restoreValuesFromVector(_values16);
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$74, thread);
                                                                                }
                                                                            } finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$41, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$73, thread);
                                                                            }
                                                                        } finally {
                                                                            _prev_bind_0_$78 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                _values17 = getValuesAsVector();
                                                                                xml_utilities.xml_terpri();
                                                                                xml_utilities.xml_end_tag_internal($$$glfTo);
                                                                                restoreValuesFromVector(_values17);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$78, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$72, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$40, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$71, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$79 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values18 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$glfToSet);
                                                            restoreValuesFromVector(_values18);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$79, thread);
                                                        }
                                                    }
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$49, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$32, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$48, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$80 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values19 = getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$glfOwnsArc);
                                                restoreValuesFromVector(_values19);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$80, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        arc = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$47, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$31, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$46, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values20 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$glfOwnsArcs);
                                restoreValuesFromVector(_values20);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values21 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$glfDiagram);
                restoreValuesFromVector(_values21);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return glf_graph;
    }

    public static final SubLObject xml_serialize_glf_graph_rendering_alt(SubLObject glf_graph, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$glfRendering, NIL, NIL);
                    if (NIL != glfgrph_has_rendering_infoP(glf_graph)) {
                        {
                            SubLObject rendering_info = glfgrph_rendering_info(glf_graph);
                            if (NIL != glfgrph_has_nodesP(glf_graph)) {
                                {
                                    SubLObject _prev_bind_0_52 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_53 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$glfRenderNodes, NIL, NIL);
                                        {
                                            SubLObject cdolist_list_var = glfgrph_nodes(glf_graph);
                                            SubLObject node = NIL;
                                            for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                                {
                                                    SubLObject rendering = dictionary.dictionary_lookup(rendering_info, glfnode_id(node), UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_54 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_55 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$glfRenderNode, NIL, NIL);
                                                            {
                                                                SubLObject _prev_bind_0_56 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_57 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL);
                                                                    cycml.cycml_serialize_term(glfnode_id(node));
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_57, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_56, thread);
                                                                }
                                                            }
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$glfId);
                                                            xml_serialize_glf_graph_rendering_info(rendering, stream);
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_55, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_54, thread);
                                                        }
                                                    }
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$glfRenderNode);
                                                }
                                            }
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_53, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_52, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$glfRenderNodes);
                            }
                            if (NIL != glfgrph_has_arcsP(glf_graph)) {
                                {
                                    SubLObject _prev_bind_0_58 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_59 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$glfRenderArcs, NIL, NIL);
                                        {
                                            SubLObject cdolist_list_var = glfgrph_arcs(glf_graph);
                                            SubLObject arc = NIL;
                                            for (arc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arc = cdolist_list_var.first()) {
                                                {
                                                    SubLObject _prev_bind_0_60 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_61 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$glfRenderArc, NIL, NIL);
                                                        {
                                                            SubLObject _prev_bind_0_62 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_63 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL);
                                                                cycml.cycml_serialize_term(glfarc_id(arc));
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_63, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_62, thread);
                                                            }
                                                        }
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal($$$glfId);
                                                        {
                                                            SubLObject rendering = dictionary.dictionary_lookup(rendering_info, glfarc_id(arc), UNPROVIDED);
                                                            xml_serialize_glf_graph_rendering_info(rendering, stream);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_61, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_60, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$glfRenderArc);
                                            }
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_59, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_58, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$glfRenderArcs);
                            }
                        }
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($$$glfRendering);
            return glf_graph;
        }
    }

    public static SubLObject xml_serialize_glf_graph_rendering(final SubLObject glf_graph, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$glfRendering, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$104 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    if (NIL != glfgrph_has_rendering_infoP(glf_graph)) {
                        final SubLObject rendering_info = glfgrph_rendering_info(glf_graph);
                        if (NIL != glfgrph_has_nodesP(glf_graph)) {
                            try {
                                final SubLObject _prev_bind_0_$105 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$106 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$glfRenderNodes, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$106 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = glfgrph_nodes(glf_graph);
                                        SubLObject node = NIL;
                                        node = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject rendering = dictionary.dictionary_lookup(rendering_info, glfnode_id(node), UNPROVIDED);
                                            try {
                                                final SubLObject _prev_bind_0_$107 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$107 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$glfRenderNode, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$108 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        try {
                                                            final SubLObject _prev_bind_0_$109 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$108 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$110 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(glfnode_id(node));
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$110, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$108, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$109, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$111 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$glfId);
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                                                            }
                                                        }
                                                        xml_serialize_glf_graph_rendering_info(rendering, stream);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$108, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$107, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$107, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$112 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$glfRenderNode);
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            node = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$106, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$106, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$105, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$113 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$glfRenderNodes);
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                                }
                            }
                        }
                        if (NIL != glfgrph_has_arcsP(glf_graph)) {
                            try {
                                final SubLObject _prev_bind_0_$114 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$109 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$glfRenderArcs, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$115 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = glfgrph_arcs(glf_graph);
                                        SubLObject arc = NIL;
                                        arc = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$116 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$110 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$glfRenderArc, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        try {
                                                            final SubLObject _prev_bind_0_$118 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$111 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$119 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(glfarc_id(arc));
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$119, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$111, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$118, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$120 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values4 = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$glfId);
                                                                restoreValuesFromVector(_values4);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$120, thread);
                                                            }
                                                        }
                                                        final SubLObject rendering2 = dictionary.dictionary_lookup(rendering_info, glfarc_id(arc), UNPROVIDED);
                                                        xml_serialize_glf_graph_rendering_info(rendering2, stream);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$117, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$110, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$116, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$121 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values5 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$glfRenderArc);
                                                    restoreValuesFromVector(_values5);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$121, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            arc = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$115, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$109, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$114, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$122 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values6 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$glfRenderArcs);
                                    restoreValuesFromVector(_values6);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$122, thread);
                                }
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$104, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values7 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$glfRendering);
                restoreValuesFromVector(_values7);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return glf_graph;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("TYPES"), makeSymbol("AIS"), makeSymbol("NODES"), makeSymbol("NODE-TYPES"), makeSymbol("SOURCE-NODE"), makeSymbol("ARCS"), makeSymbol("ARC-TYPES"), makeSymbol("INCOMING-CONNECTORS"), makeSymbol("OUTGOING-CONNECTORS"), makeSymbol("INCOMING-CONNECTOR-TYPES"), makeSymbol("OUTGOING-CONNECTOR-TYPES"), makeSymbol("RENDERING-INFO") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("TYPES"), makeKeyword("AIS"), makeKeyword("NODES"), makeKeyword("NODE-TYPES"), makeKeyword("SOURCE-NODE"), $ARCS, makeKeyword("ARC-TYPES"), makeKeyword("INCOMING-CONNECTORS"), makeKeyword("OUTGOING-CONNECTORS"), makeKeyword("INCOMING-CONNECTOR-TYPES"), makeKeyword("OUTGOING-CONNECTOR-TYPES"), makeKeyword("RENDERING-INFO") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("GLFGRPH-ID"), makeSymbol("GLFGRPH-TYPES"), makeSymbol("GLFGRPH-AIS"), makeSymbol("GLFGRPH-NODES"), makeSymbol("GLFGRPH-NODE-TYPES"), makeSymbol("GLFGRPH-SOURCE-NODE"), makeSymbol("GLFGRPH-ARCS"), makeSymbol("GLFGRPH-ARC-TYPES"), makeSymbol("GLFGRPH-INCOMING-CONNECTORS"), makeSymbol("GLFGRPH-OUTGOING-CONNECTORS"), makeSymbol("GLFGRPH-INCOMING-CONNECTOR-TYPES"), makeSymbol("GLFGRPH-OUTGOING-CONNECTOR-TYPES"), makeSymbol("GLFGRPH-RENDERING-INFO") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-GLFGRPH-ID"), makeSymbol("_CSETF-GLFGRPH-TYPES"), makeSymbol("_CSETF-GLFGRPH-AIS"), makeSymbol("_CSETF-GLFGRPH-NODES"), makeSymbol("_CSETF-GLFGRPH-NODE-TYPES"), makeSymbol("_CSETF-GLFGRPH-SOURCE-NODE"), makeSymbol("_CSETF-GLFGRPH-ARCS"), makeSymbol("_CSETF-GLFGRPH-ARC-TYPES"), makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTORS"), makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTORS"), makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTOR-TYPES"), makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTOR-TYPES"), makeSymbol("_CSETF-GLFGRPH-RENDERING-INFO") });

    static private final SubLString $str_alt47$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt48$_GLF_Graph_ = makeString("<GLF-Graph ");

    static private final SubLString $str_alt49$_of_types_ = makeString(" of types ");

    static private final SubLString $str_alt50$_corresponding_AIS__ = makeString(" corresponding AIS: ");

    static private final SubLString $str_alt51$_Types__ = makeString(" Types: ");

    static private final SubLString $str_alt52$__Node_Types__ = makeString("  Node-Types: ");

    static private final SubLString $str_alt53$__Arc_Types__ = makeString("  Arc-Types: ");

    static private final SubLString $str_alt54$__In_Connectors__ = makeString("  In-Connectors: ");

    static private final SubLString $str_alt55$__Out_Connectors__ = makeString("  Out-Connectors: ");

    static private final SubLString $str_alt56$_no_information_available_ = makeString(" no information available ");

    static private final SubLString $str_alt57$_Content__ = makeString(" Content: ");

    static private final SubLString $str_alt58$__Nodes__first_is_source___ = makeString("  Nodes (first is source): ");

    static private final SubLString $str_alt59$__Arcs__ = makeString("  Arcs: ");

    static private final SubLString $str_alt60$_currently_empty_ = makeString(" currently empty ");

    static private final SubLString $str_alt61$_Rendering_Information_ = makeString(" Rendering Information ");

    static private final SubLString $str_alt62$__ = makeString("  ");

    static private final SubLString $str_alt63$____ = makeString(" -> ");

    static private final SubLString $str_alt64$__ = makeString("> ");

    public static final SubLObject xml_serialize_glf_graph_rendering_info_alt(SubLObject rendering, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$glfRenderInfo, NIL, NIL);
                    if (NIL != glfrndr_label(rendering)) {
                        {
                            SubLObject _prev_bind_0_64 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1_65 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfRenderLabel, NIL, NIL);
                                cycml.cycml_serialize_term(glfrndr_label(rendering));
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_65, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_64, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$glfRenderLabel);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($$$glfRenderInfo);
            return rendering;
        }
    }

    public static SubLObject xml_serialize_glf_graph_rendering_info(final SubLObject rendering, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$glfRenderInfo, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$129 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    if (NIL != glfrndr_label(rendering)) {
                        try {
                            final SubLObject _prev_bind_0_$130 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$131 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfRenderLabel, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$131 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(glfrndr_label(rendering));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$131, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$131, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$130, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$132 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$glfRenderLabel);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$132, thread);
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$129, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$glfRenderInfo);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return rendering;
    }

    static private final SubLList $list_alt99 = list(reader_make_constant_shell("Graph-CW"));

    static private final SubLList $list_alt101 = list(makeKeyword("AIS"));

    static private final SubLList $list_alt112 = list(makeSymbol("ID"), makeSymbol("TYPES"), makeSymbol("PARENT"), makeSymbol("SEMANTICS"));

    static private final SubLList $list_alt113 = list(makeKeyword("ID"), makeKeyword("TYPES"), makeKeyword("PARENT"), makeKeyword("SEMANTICS"));

    static private final SubLList $list_alt114 = list(makeSymbol("GLFNODE-ID"), makeSymbol("GLFNODE-TYPES"), makeSymbol("GLFNODE-PARENT"), makeSymbol("GLFNODE-SEMANTICS"));

    static private final SubLList $list_alt115 = list(makeSymbol("_CSETF-GLFNODE-ID"), makeSymbol("_CSETF-GLFNODE-TYPES"), makeSymbol("_CSETF-GLFNODE-PARENT"), makeSymbol("_CSETF-GLFNODE-SEMANTICS"));

    static private final SubLString $str_alt128$_GLF_Node_ = makeString("<GLF-Node ");

    static private final SubLString $str_alt129$_of_graph_ = makeString(" of graph ");

    static private final SubLString $str_alt130$_with_semantics_ = makeString(" with semantics ");

    static private final SubLString $str_alt131$_without_semantics_ = makeString(" without semantics ");

    static private final SubLList $list_alt133 = list(makeKeyword("SEMANTICS"));

    static private final SubLList $list_alt136 = list(makeSymbol("ID"), makeSymbol("TYPES"), makeSymbol("PARENT"), makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("SEMANTICS"));

    public static final SubLObject xml_serialize_glf_graph_flow_model_alt(SubLObject glf_graph, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$glfFlowModel, NIL, NIL);
                    if (NIL != glfgrph_has_nodesP(glf_graph)) {
                        {
                            SubLObject _prev_bind_0_66 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1_67 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfSemanticForNodes, NIL, NIL);
                                {
                                    SubLObject cdolist_list_var = glfgrph_nodes(glf_graph);
                                    SubLObject node = NIL;
                                    for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                        if (NIL != glfnode_semantics(node)) {
                                            {
                                                SubLObject _prev_bind_0_68 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                SubLObject _prev_bind_1_69 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$glfSemanticForNode, NIL, NIL);
                                                    {
                                                        SubLObject _prev_bind_0_70 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_71 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL);
                                                            cycml.cycml_serialize_term(glfnode_id(node));
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_71, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_70, thread);
                                                        }
                                                    }
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$glfId);
                                                    {
                                                        SubLObject _prev_bind_0_72 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_73 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$glfHasSemantic, NIL, NIL);
                                                            cycml.cycml_serialize_term(glfnode_semantics(node));
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_73, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_72, thread);
                                                        }
                                                    }
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$glfHasSemantic);
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_69, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_68, thread);
                                                }
                                            }
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal($$$glfSemanticForNode);
                                        }
                                    }
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_67, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_66, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$glfSemanticForNodes);
                    }
                    if (NIL != glfgrph_has_arcsP(glf_graph)) {
                        {
                            SubLObject _prev_bind_0_74 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1_75 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfSemanticForArcs, NIL, NIL);
                                {
                                    SubLObject cdolist_list_var = glfgrph_arcs(glf_graph);
                                    SubLObject arc = NIL;
                                    for (arc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arc = cdolist_list_var.first()) {
                                        if (NIL != glfarc_semantics(arc)) {
                                            {
                                                SubLObject _prev_bind_0_76 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                SubLObject _prev_bind_1_77 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$glfSemanticForArc, NIL, NIL);
                                                    {
                                                        SubLObject _prev_bind_0_78 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_79 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL);
                                                            cycml.cycml_serialize_term(glfarc_id(arc));
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_79, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_78, thread);
                                                        }
                                                    }
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$glfId);
                                                    {
                                                        SubLObject _prev_bind_0_80 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_81 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$glfHasSemantic, NIL, NIL);
                                                            cycml.cycml_serialize_term(glfarc_semantics(arc));
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_81, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_80, thread);
                                                        }
                                                    }
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$glfHasSemantic);
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_77, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_76, thread);
                                                }
                                            }
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal($$$glfSemanticForArc);
                                        }
                                    }
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_75, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_74, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$glfSemanticForArcs);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($$$glfFlowModel);
            return glf_graph;
        }
    }

    public static SubLObject xml_serialize_glf_graph_flow_model(final SubLObject glf_graph, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$glfFlowModel, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$134 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    if (NIL != glfgrph_has_nodesP(glf_graph)) {
                        try {
                            final SubLObject _prev_bind_0_$135 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$136 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfSemanticForNodes, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$136 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = glfgrph_nodes(glf_graph);
                                    SubLObject node = NIL;
                                    node = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        if (NIL != glfnode_semantics(node)) {
                                            try {
                                                final SubLObject _prev_bind_0_$137 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$137 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$glfSemanticForNode, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$138 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        try {
                                                            final SubLObject _prev_bind_0_$139 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$138 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$140 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(glfnode_id(node));
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$140, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$138, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$139, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$141 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$glfId);
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$141, thread);
                                                            }
                                                        }
                                                        try {
                                                            final SubLObject _prev_bind_0_$142 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$139 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$glfHasSemantic, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$143 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(glfnode_semantics(node));
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$143, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$139, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$142, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$144 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values2 = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$glfHasSemantic);
                                                                restoreValuesFromVector(_values2);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$144, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$138, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$137, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$137, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$145 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values3 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$glfSemanticForNode);
                                                    restoreValuesFromVector(_values3);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$145, thread);
                                                }
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        node = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$136, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$136, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$135, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$146 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$glfSemanticForNodes);
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$146, thread);
                            }
                        }
                    }
                    if (NIL != glfgrph_has_arcsP(glf_graph)) {
                        try {
                            final SubLObject _prev_bind_0_$147 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$140 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$glfSemanticForArcs, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$148 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = glfgrph_arcs(glf_graph);
                                    SubLObject arc = NIL;
                                    arc = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        if (NIL != glfarc_semantics(arc)) {
                                            try {
                                                final SubLObject _prev_bind_0_$149 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$141 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$glfSemanticForArc, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$150 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        try {
                                                            final SubLObject _prev_bind_0_$151 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$142 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$glfId, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$152 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(glfarc_id(arc));
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$152, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$142, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$151, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$153 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values5 = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$glfId);
                                                                restoreValuesFromVector(_values5);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$153, thread);
                                                            }
                                                        }
                                                        try {
                                                            final SubLObject _prev_bind_0_$154 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$143 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$glfHasSemantic, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$155 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(glfarc_semantics(arc));
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$155, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$143, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$154, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$156 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values6 = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$glfHasSemantic);
                                                                restoreValuesFromVector(_values6);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$156, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$150, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$141, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$149, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$157 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values7 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$glfSemanticForArc);
                                                    restoreValuesFromVector(_values7);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$157, thread);
                                                }
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        arc = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$148, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$140, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$147, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$158 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values8 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$glfSemanticForArcs);
                                restoreValuesFromVector(_values8);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$158, thread);
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$134, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values9 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$glfFlowModel);
                restoreValuesFromVector(_values9);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return glf_graph;
    }

    static private final SubLList $list_alt137 = list(makeKeyword("ID"), makeKeyword("TYPES"), makeKeyword("PARENT"), $FROM, makeKeyword("TO"), makeKeyword("SEMANTICS"));

    static private final SubLList $list_alt138 = list(makeSymbol("GLFARC-ID"), makeSymbol("GLFARC-TYPES"), makeSymbol("GLFARC-PARENT"), makeSymbol("GLFARC-FROM"), makeSymbol("GLFARC-TO"), makeSymbol("GLFARC-SEMANTICS"));

    static private final SubLList $list_alt139 = list(makeSymbol("_CSETF-GLFARC-ID"), makeSymbol("_CSETF-GLFARC-TYPES"), makeSymbol("_CSETF-GLFARC-PARENT"), makeSymbol("_CSETF-GLFARC-FROM"), makeSymbol("_CSETF-GLFARC-TO"), makeSymbol("_CSETF-GLFARC-SEMANTICS"));

    static private final SubLString $str_alt156$_GLF_Arc_ = makeString("<GLF-Arc ");

    static private final SubLString $str_alt157$_from__ = makeString(" from: ");

    static private final SubLString $str_alt158$_to____ = makeString(" to:   ");

    static private final SubLString $str_alt159$_meaning__ = makeString(" meaning: ");

    public static final SubLObject $const160$variableMappingTableForGLFArcInDi = reader_make_constant_shell("variableMappingTableForGLFArcInDiagram");

    static private final SubLList $list_alt162 = list(makeSymbol("?FROM"), makeSymbol("?TO"));

    static private final SubLSymbol $sym164$_FROM = makeSymbol("?FROM");

    static private final SubLSymbol $sym165$_TO = makeSymbol("?TO");

    static private final SubLList $list_alt166 = list(makeSymbol("SOURCE"), makeSymbol("TARGET"));

    static private final SubLList $list_alt169 = list(makeSymbol("LABEL"));

    static private final SubLList $list_alt170 = list(makeKeyword("LABEL"));

    static private final SubLList $list_alt171 = list(makeSymbol("GLFRNDR-LABEL"));

    static private final SubLList $list_alt172 = list(makeSymbol("_CSETF-GLFRNDR-LABEL"));

    static private final SubLString $str_alt178$__GLF_Rendering_ = makeString("#<GLF-Rendering ");

    static private final SubLString $str_alt179$_label__ = makeString(" label: ");

    public static final SubLObject get_graph_defining_mt_alt(SubLObject graph_id) {
        {
            SubLObject assertion = kb_indexing.find_gaf_any_mt(listS($$isa, graph_id, $list_alt99));
            SubLObject mt = assertions_high.assertion_mt(assertion);
            return mt;
        }
    }

    public static SubLObject get_graph_defining_mt(final SubLObject graph_id) {
        final SubLObject assertion = kb_indexing.find_gaf_any_mt(listS($$isa, graph_id, $list106));
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return mt;
    }

    public static final SubLObject load_glf_graph_from_kb_alt(SubLObject graph_id, SubLObject mt) {
        {
            SubLObject v_graph = create_glf_graph_from_kb(graph_id, mt);
            load_all_glf_nodes_from_kb(v_graph, mt);
            load_all_glf_arcs_from_kb(v_graph, mt);
            return v_graph;
        }
    }

    public static SubLObject load_glf_graph_from_kb(final SubLObject graph_id, final SubLObject mt) {
        final SubLObject v_graph = create_glf_graph_from_kb(graph_id, mt);
        load_all_glf_nodes_from_kb(v_graph, mt);
        load_all_glf_arcs_from_kb(v_graph, mt);
        return v_graph;
    }

    public static final SubLObject map_glf_graph_to_ais_alt(SubLObject graph_id, SubLObject mt) {
        return ask_utilities.ask_variable($AIS, listS($$correspondingAIS, graph_id, $list_alt101), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject map_glf_graph_to_ais(final SubLObject graph_id, final SubLObject mt) {
        return ask_utilities.ask_variable($AIS, listS($$correspondingAIS, graph_id, $list108), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject create_glf_graph_from_kb_alt(SubLObject graph_id, SubLObject mt) {
        {
            SubLObject v_graph = make_glf_graph(UNPROVIDED);
            _csetf_glfgrph_id(v_graph, graph_id);
            _csetf_glfgrph_types(v_graph, isa.min_isa(graph_id, mt, UNPROVIDED));
            _csetf_glfgrph_ais(v_graph, map_glf_graph_to_ais(graph_id, mt));
            _csetf_glfgrph_node_types(v_graph, set.new_set(symbol_function(EQUAL), UNPROVIDED));
            initialize_glfgrph_node_types(v_graph, mt);
            _csetf_glfgrph_arc_types(v_graph, set.new_set(symbol_function(EQUAL), UNPROVIDED));
            initialize_glfgrph_arc_types(v_graph, mt);
            _csetf_glfgrph_incoming_connector_types(v_graph, set.new_set(symbol_function(EQUAL), UNPROVIDED));
            _csetf_glfgrph_outgoing_connector_types(v_graph, set.new_set(symbol_function(EQUAL), UNPROVIDED));
            _csetf_glfgrph_rendering_info(v_graph, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            return v_graph;
        }
    }

    public static SubLObject create_glf_graph_from_kb(final SubLObject graph_id, final SubLObject mt) {
        final SubLObject v_graph = make_glf_graph(UNPROVIDED);
        _csetf_glfgrph_id(v_graph, graph_id);
        _csetf_glfgrph_types(v_graph, isa.min_isa(graph_id, mt, UNPROVIDED));
        _csetf_glfgrph_ais(v_graph, map_glf_graph_to_ais(graph_id, mt));
        _csetf_glfgrph_node_types(v_graph, set.new_set(symbol_function(EQUAL), UNPROVIDED));
        initialize_glfgrph_node_types(v_graph, mt);
        _csetf_glfgrph_arc_types(v_graph, set.new_set(symbol_function(EQUAL), UNPROVIDED));
        initialize_glfgrph_arc_types(v_graph, mt);
        _csetf_glfgrph_incoming_connector_types(v_graph, set.new_set(symbol_function(EQUAL), UNPROVIDED));
        _csetf_glfgrph_outgoing_connector_types(v_graph, set.new_set(symbol_function(EQUAL), UNPROVIDED));
        _csetf_glfgrph_rendering_info(v_graph, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        return v_graph;
    }

    /**
     * more should be coming from the KB here
     */
    @LispMethod(comment = "more should be coming from the KB here")
    public static final SubLObject initialize_glfgrph_node_types_alt(SubLObject v_graph, SubLObject mt) {
        {
            SubLObject cdolist_list_var = genls.collection_leaves($$GLFNode, mt, UNPROVIDED);
            SubLObject spec = NIL;
            for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                note_glf_graph_node_type(v_graph, spec);
            }
        }
        return v_graph;
    }

    /**
     * more should be coming from the KB here
     */
    @LispMethod(comment = "more should be coming from the KB here")
    public static SubLObject initialize_glfgrph_node_types(final SubLObject v_graph, final SubLObject mt) {
        SubLObject cdolist_list_var = genls.collection_leaves($$GLFNode, mt, UNPROVIDED);
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            note_glf_graph_node_type(v_graph, spec);
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        return v_graph;
    }

    public static final SubLObject note_glf_graph_node_type_alt(SubLObject v_graph, SubLObject node_type) {
        set.set_add(node_type, glfgrph_node_types(v_graph));
        return v_graph;
    }

    public static SubLObject note_glf_graph_node_type(final SubLObject v_graph, final SubLObject node_type) {
        set.set_add(node_type, glfgrph_node_types(v_graph));
        return v_graph;
    }

    /**
     * more should be coming from the KB here
     */
    @LispMethod(comment = "more should be coming from the KB here")
    public static final SubLObject initialize_glfgrph_arc_types_alt(SubLObject v_graph, SubLObject mt) {
        {
            SubLObject cdolist_list_var = genls.collection_leaves($$GLFArc, mt, UNPROVIDED);
            SubLObject spec = NIL;
            for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                note_glf_graph_arc_type(v_graph, spec);
            }
        }
        return v_graph;
    }

    /**
     * more should be coming from the KB here
     */
    @LispMethod(comment = "more should be coming from the KB here")
    public static SubLObject initialize_glfgrph_arc_types(final SubLObject v_graph, final SubLObject mt) {
        SubLObject cdolist_list_var = genls.collection_leaves($$GLFArc, mt, UNPROVIDED);
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            note_glf_graph_arc_type(v_graph, spec);
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        return v_graph;
    }

    public static final SubLObject note_glf_graph_arc_type_alt(SubLObject v_graph, SubLObject arc_type) {
        set.set_add(arc_type, glfgrph_arc_types(v_graph));
        return v_graph;
    }

    public static SubLObject note_glf_graph_arc_type(final SubLObject v_graph, final SubLObject arc_type) {
        set.set_add(arc_type, glfgrph_arc_types(v_graph));
        return v_graph;
    }

    public static final SubLObject load_all_glf_nodes_from_kb_alt(SubLObject v_graph, SubLObject mt) {
        {
            SubLObject ais = glfgrph_ais(v_graph);
            SubLObject nodes = ask_utilities.ask_variable($NODE, list($$nodeInSystem, $NODE, ais), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject source_node = ask_utilities.ask_variable($SOURCE, list($$sourceNodeInSystem, $SOURCE, ais), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
            SubLObject cdolist_list_var = nodes;
            SubLObject node_id = NIL;
            for (node_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node_id = cdolist_list_var.first()) {
                {
                    SubLObject node = load_one_glf_node_from_kb(v_graph, node_id, mt);
                    if (node_id == source_node) {
                        _csetf_glfgrph_source_node(v_graph, node);
                    }
                }
            }
        }
        return v_graph;
    }

    public static SubLObject load_all_glf_nodes_from_kb(final SubLObject v_graph, final SubLObject mt) {
        final SubLObject ais = glfgrph_ais(v_graph);
        final SubLObject nodes = ask_utilities.ask_variable($NODE, list($$nodeInSystem, $NODE, ais), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject source_node = ask_utilities.ask_variable($SOURCE, list($$sourceNodeInSystem, $SOURCE, ais), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
        SubLObject cdolist_list_var = nodes;
        SubLObject node_id = NIL;
        node_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject node = load_one_glf_node_from_kb(v_graph, node_id, mt);
            if (node_id.eql(source_node)) {
                _csetf_glfgrph_source_node(v_graph, node);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node_id = cdolist_list_var.first();
        } 
        return v_graph;
    }

    public static final SubLObject load_one_glf_node_from_kb_alt(SubLObject v_graph, SubLObject node_id, SubLObject mt) {
        {
            SubLObject node = create_glf_node_from_kb(v_graph, node_id, mt);
            SubLObject rendering = create_glf_rendering_for_component_from_kb(v_graph, node_id, mt);
            SubLObject cdolist_list_var = glfnode_types(node);
            SubLObject type = NIL;
            for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                note_glf_graph_node_type(v_graph, type);
            }
            _csetf_glfgrph_nodes(v_graph, cons(node, glfgrph_nodes(v_graph)));
            dictionary.dictionary_enter(glfgrph_rendering_info(v_graph), node_id, rendering);
            return node;
        }
    }

    public static SubLObject load_one_glf_node_from_kb(final SubLObject v_graph, final SubLObject node_id, final SubLObject mt) {
        final SubLObject node = create_glf_node_from_kb(v_graph, node_id, mt);
        final SubLObject rendering = create_glf_rendering_for_component_from_kb(v_graph, node_id, mt);
        SubLObject cdolist_list_var = glfnode_types(node);
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            note_glf_graph_node_type(v_graph, type);
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        _csetf_glfgrph_nodes(v_graph, cons(node, glfgrph_nodes(v_graph)));
        dictionary.dictionary_enter(glfgrph_rendering_info(v_graph), node_id, rendering);
        return node;
    }

    public static final SubLObject load_all_glf_arcs_from_kb_alt(SubLObject v_graph, SubLObject mt) {
        {
            SubLObject ais = glfgrph_ais(v_graph);
            SubLObject arcs = ask_utilities.ask_variable($ARC, list($$linkInSystem, $ARC, ais), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = arcs;
            SubLObject arc = NIL;
            for (arc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arc = cdolist_list_var.first()) {
                load_one_glf_arc_from_kb(v_graph, arc, mt);
            }
        }
        return v_graph;
    }

    public static SubLObject load_all_glf_arcs_from_kb(final SubLObject v_graph, final SubLObject mt) {
        final SubLObject ais = glfgrph_ais(v_graph);
        SubLObject cdolist_list_var;
        final SubLObject arcs = cdolist_list_var = ask_utilities.ask_variable($ARC, list($$linkInSystem, $ARC, ais), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject arc = NIL;
        arc = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            load_one_glf_arc_from_kb(v_graph, arc, mt);
            cdolist_list_var = cdolist_list_var.rest();
            arc = cdolist_list_var.first();
        } 
        return v_graph;
    }

    public static final SubLObject load_one_glf_arc_from_kb_alt(SubLObject v_graph, SubLObject arc_id, SubLObject mt) {
        {
            SubLObject arc = create_glf_arc_from_kb(v_graph, arc_id, mt);
            SubLObject rendering = create_glf_rendering_for_component_from_kb(v_graph, arc_id, mt);
            SubLObject cdolist_list_var = glfarc_types(arc);
            SubLObject type = NIL;
            for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                note_glf_graph_arc_type(v_graph, type);
            }
            _csetf_glfgrph_arcs(v_graph, cons(arc, glfgrph_arcs(v_graph)));
            dictionary.dictionary_enter(glfgrph_rendering_info(v_graph), arc_id, rendering);
            return arc;
        }
    }

    public static SubLObject load_one_glf_arc_from_kb(final SubLObject v_graph, final SubLObject arc_id, final SubLObject mt) {
        final SubLObject arc = create_glf_arc_from_kb(v_graph, arc_id, mt);
        final SubLObject rendering = create_glf_rendering_for_component_from_kb(v_graph, arc_id, mt);
        SubLObject cdolist_list_var = glfarc_types(arc);
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            note_glf_graph_arc_type(v_graph, type);
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        _csetf_glfgrph_arcs(v_graph, cons(arc, glfgrph_arcs(v_graph)));
        dictionary.dictionary_enter(glfgrph_rendering_info(v_graph), arc_id, rendering);
        return arc;
    }

    public static final SubLObject glf_node_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        glfnode_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject glf_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        glfnode_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject glf_node_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.graphic_library_format.$glf_node_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject glf_node_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.graphic_library_format.$glf_node_native.class ? T : NIL;
    }

    public static final SubLObject glfnode_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_NODE_P);
        return v_object.getField2();
    }

    public static SubLObject glfnode_id(final SubLObject v_object) {
        assert NIL != glf_node_p(v_object) : "! graphic_library_format.glf_node_p(v_object) " + "graphic_library_format.glf_node_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject glfnode_types_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_NODE_P);
        return v_object.getField3();
    }

    public static SubLObject glfnode_types(final SubLObject v_object) {
        assert NIL != glf_node_p(v_object) : "! graphic_library_format.glf_node_p(v_object) " + "graphic_library_format.glf_node_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject glfnode_parent_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_NODE_P);
        return v_object.getField4();
    }

    public static SubLObject glfnode_parent(final SubLObject v_object) {
        assert NIL != glf_node_p(v_object) : "! graphic_library_format.glf_node_p(v_object) " + "graphic_library_format.glf_node_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject glfnode_semantics_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_NODE_P);
        return v_object.getField5();
    }

    public static SubLObject glfnode_semantics(final SubLObject v_object) {
        assert NIL != glf_node_p(v_object) : "! graphic_library_format.glf_node_p(v_object) " + "graphic_library_format.glf_node_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_glfnode_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_NODE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_glfnode_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_node_p(v_object) : "! graphic_library_format.glf_node_p(v_object) " + "graphic_library_format.glf_node_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_glfnode_types_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_NODE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_glfnode_types(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_node_p(v_object) : "! graphic_library_format.glf_node_p(v_object) " + "graphic_library_format.glf_node_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_glfnode_parent_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_NODE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_glfnode_parent(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_node_p(v_object) : "! graphic_library_format.glf_node_p(v_object) " + "graphic_library_format.glf_node_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_glfnode_semantics_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_NODE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_glfnode_semantics(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_node_p(v_object) : "! graphic_library_format.glf_node_p(v_object) " + "graphic_library_format.glf_node_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_glf_node_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.graphic_library_format.$glf_node_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_glfnode_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TYPES)) {
                            _csetf_glfnode_types(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PARENT)) {
                                _csetf_glfnode_parent(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SEMANTICS)) {
                                    _csetf_glfnode_semantics(v_new, current_value);
                                } else {
                                    Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_glf_node(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.graphic_library_format.$glf_node_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_glfnode_id(v_new, current_value);
            } else
                if (pcase_var.eql($TYPES)) {
                    _csetf_glfnode_types(v_new, current_value);
                } else
                    if (pcase_var.eql($PARENT)) {
                        _csetf_glfnode_parent(v_new, current_value);
                    } else
                        if (pcase_var.eql($SEMANTICS)) {
                            _csetf_glfnode_semantics(v_new, current_value);
                        } else {
                            Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_glf_node(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GLF_NODE, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, glfnode_id(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPES, glfnode_types(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT, glfnode_parent(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMANTICS, glfnode_semantics(obj));
        funcall(visitor_fn, obj, $END, MAKE_GLF_NODE, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_glf_node_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_glf_node(obj, visitor_fn);
    }

    public static final SubLObject glfnode_print_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        string_utilities.indent(stream, depth);
        write_string($str_alt128$_GLF_Node_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfnode_id(v_object), stream);
        write_string($str_alt49$_of_types_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfnode_types(v_object), stream);
        terpri(stream);
        string_utilities.indent(stream, depth);
        write_string($str_alt129$_of_graph_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfgrph_id(glfnode_parent(v_object)), stream);
        terpri(stream);
        string_utilities.indent(stream, depth);
        if (NIL != glfnode_semantics(v_object)) {
            write_string($str_alt130$_with_semantics_, stream, UNPROVIDED, UNPROVIDED);
            prin1(glfnode_semantics(v_object), stream);
        } else {
            write_string($str_alt131$_without_semantics_, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str_alt64$__, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject glfnode_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        string_utilities.indent(stream, depth);
        write_string($str138$_GLF_Node_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfnode_id(v_object), stream);
        write_string($$$_of_types_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfnode_types(v_object), stream);
        terpri(stream);
        string_utilities.indent(stream, depth);
        write_string($$$_of_graph_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfgrph_id(glfnode_parent(v_object)), stream);
        terpri(stream);
        string_utilities.indent(stream, depth);
        if (NIL != glfnode_semantics(v_object)) {
            write_string($$$_with_semantics_, stream, UNPROVIDED, UNPROVIDED);
            prin1(glfnode_semantics(v_object), stream);
        } else {
            write_string($$$_without_semantics_, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str70$__, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static final SubLObject create_glf_node_from_kb_alt(SubLObject glf_graph, SubLObject node_id, SubLObject mt) {
        {
            SubLObject node = make_glf_node(UNPROVIDED);
            _csetf_glfnode_id(node, node_id);
            _csetf_glfnode_parent(node, glf_graph);
            _csetf_glfnode_types(node, isa.min_isa(node_id, mt, UNPROVIDED));
            _csetf_glfnode_semantics(node, ask_utilities.ask_variable($SEMANTICS, listS($$glfNodeSemantics_Underspecified, node_id, $list_alt133), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first());
            return node;
        }
    }

    public static SubLObject create_glf_node_from_kb(final SubLObject glf_graph, final SubLObject node_id, final SubLObject mt) {
        final SubLObject node = make_glf_node(UNPROVIDED);
        _csetf_glfnode_id(node, node_id);
        _csetf_glfnode_parent(node, glf_graph);
        _csetf_glfnode_types(node, isa.min_isa(node_id, mt, UNPROVIDED));
        _csetf_glfnode_semantics(node, ask_utilities.ask_variable($SEMANTICS, listS($$glfNodeSemantics_Underspecified, node_id, $list143), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first());
        return node;
    }

    public static final SubLObject glf_arc_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        glfarc_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject glf_arc_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        glfarc_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject glf_arc_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject glf_arc_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native.class ? T : NIL;
    }

    public static final SubLObject glfarc_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_ARC_P);
        return v_object.getField2();
    }

    public static SubLObject glfarc_id(final SubLObject v_object) {
        assert NIL != glf_arc_p(v_object) : "! graphic_library_format.glf_arc_p(v_object) " + "graphic_library_format.glf_arc_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject glfarc_types_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_ARC_P);
        return v_object.getField3();
    }

    public static SubLObject glfarc_types(final SubLObject v_object) {
        assert NIL != glf_arc_p(v_object) : "! graphic_library_format.glf_arc_p(v_object) " + "graphic_library_format.glf_arc_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject glfarc_parent_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_ARC_P);
        return v_object.getField4();
    }

    public static SubLObject glfarc_parent(final SubLObject v_object) {
        assert NIL != glf_arc_p(v_object) : "! graphic_library_format.glf_arc_p(v_object) " + "graphic_library_format.glf_arc_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject glfarc_from_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_ARC_P);
        return v_object.getField5();
    }

    public static SubLObject glfarc_from(final SubLObject v_object) {
        assert NIL != glf_arc_p(v_object) : "! graphic_library_format.glf_arc_p(v_object) " + "graphic_library_format.glf_arc_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject glfarc_to_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_ARC_P);
        return v_object.getField6();
    }

    public static SubLObject glfarc_to(final SubLObject v_object) {
        assert NIL != glf_arc_p(v_object) : "! graphic_library_format.glf_arc_p(v_object) " + "graphic_library_format.glf_arc_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject glfarc_semantics_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_ARC_P);
        return v_object.getField7();
    }

    public static SubLObject glfarc_semantics(final SubLObject v_object) {
        assert NIL != glf_arc_p(v_object) : "! graphic_library_format.glf_arc_p(v_object) " + "graphic_library_format.glf_arc_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_glfarc_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_ARC_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_glfarc_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_arc_p(v_object) : "! graphic_library_format.glf_arc_p(v_object) " + "graphic_library_format.glf_arc_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_glfarc_types_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_ARC_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_glfarc_types(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_arc_p(v_object) : "! graphic_library_format.glf_arc_p(v_object) " + "graphic_library_format.glf_arc_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_glfarc_parent_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_ARC_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_glfarc_parent(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_arc_p(v_object) : "! graphic_library_format.glf_arc_p(v_object) " + "graphic_library_format.glf_arc_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_glfarc_from_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_ARC_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_glfarc_from(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_arc_p(v_object) : "! graphic_library_format.glf_arc_p(v_object) " + "graphic_library_format.glf_arc_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_glfarc_to_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_ARC_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_glfarc_to(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_arc_p(v_object) : "! graphic_library_format.glf_arc_p(v_object) " + "graphic_library_format.glf_arc_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_glfarc_semantics_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_ARC_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_glfarc_semantics(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_arc_p(v_object) : "! graphic_library_format.glf_arc_p(v_object) " + "graphic_library_format.glf_arc_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_glf_arc_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_glfarc_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TYPES)) {
                            _csetf_glfarc_types(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PARENT)) {
                                _csetf_glfarc_parent(v_new, current_value);
                            } else {
                                if (pcase_var.eql($FROM)) {
                                    _csetf_glfarc_from(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($TO)) {
                                        _csetf_glfarc_to(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($SEMANTICS)) {
                                            _csetf_glfarc_semantics(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_glf_arc(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.graphic_library_format.$glf_arc_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_glfarc_id(v_new, current_value);
            } else
                if (pcase_var.eql($TYPES)) {
                    _csetf_glfarc_types(v_new, current_value);
                } else
                    if (pcase_var.eql($PARENT)) {
                        _csetf_glfarc_parent(v_new, current_value);
                    } else
                        if (pcase_var.eql($FROM)) {
                            _csetf_glfarc_from(v_new, current_value);
                        } else
                            if (pcase_var.eql($TO)) {
                                _csetf_glfarc_to(v_new, current_value);
                            } else
                                if (pcase_var.eql($SEMANTICS)) {
                                    _csetf_glfarc_semantics(v_new, current_value);
                                } else {
                                    Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_glf_arc(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GLF_ARC, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, glfarc_id(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPES, glfarc_types(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT, glfarc_parent(obj));
        funcall(visitor_fn, obj, $SLOT, $FROM, glfarc_from(obj));
        funcall(visitor_fn, obj, $SLOT, $TO, glfarc_to(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMANTICS, glfarc_semantics(obj));
        funcall(visitor_fn, obj, $END, MAKE_GLF_ARC, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_glf_arc_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_glf_arc(obj, visitor_fn);
    }

    public static final SubLObject glfarc_print_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        string_utilities.indent(stream, depth);
        write_string($str_alt156$_GLF_Arc_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfarc_id(v_object), stream);
        write_string($str_alt49$_of_types_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfarc_types(v_object), stream);
        terpri(stream);
        string_utilities.indent(stream, depth);
        write_string($str_alt129$_of_graph_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfgrph_id(glfarc_parent(v_object)), stream);
        if (set.set_size(glfarc_from(v_object)).isPositive()) {
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str_alt157$_from__, stream, UNPROVIDED, UNPROVIDED);
            prin1(set.set_element_list(glfarc_from(v_object)), stream);
        }
        if (set.set_size(glfarc_to(v_object)).isPositive()) {
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str_alt158$_to____, stream, UNPROVIDED, UNPROVIDED);
            prin1(set.set_element_list(glfarc_to(v_object)), stream);
        }
        if (NIL != glfarc_semantics(v_object)) {
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str_alt159$_meaning__, stream, UNPROVIDED, UNPROVIDED);
            prin1(glfarc_semantics(v_object), stream);
        }
        write_string($str_alt64$__, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject glfarc_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        string_utilities.indent(stream, depth);
        write_string($str169$_GLF_Arc_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfarc_id(v_object), stream);
        write_string($$$_of_types_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfarc_types(v_object), stream);
        terpri(stream);
        string_utilities.indent(stream, depth);
        write_string($$$_of_graph_, stream, UNPROVIDED, UNPROVIDED);
        prin1(glfgrph_id(glfarc_parent(v_object)), stream);
        if (set.set_size(glfarc_from(v_object)).isPositive()) {
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str170$_from__, stream, UNPROVIDED, UNPROVIDED);
            prin1(set.set_element_list(glfarc_from(v_object)), stream);
        }
        if (set.set_size(glfarc_to(v_object)).isPositive()) {
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str171$_to____, stream, UNPROVIDED, UNPROVIDED);
            prin1(set.set_element_list(glfarc_to(v_object)), stream);
        }
        if (NIL != glfarc_semantics(v_object)) {
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str172$_meaning__, stream, UNPROVIDED, UNPROVIDED);
            prin1(glfarc_semantics(v_object), stream);
        }
        write_string($str70$__, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static final SubLObject create_glf_arc_from_kb_alt(SubLObject glf_graph, SubLObject arc_id, SubLObject mt) {
        {
            SubLObject arc = make_glf_arc(UNPROVIDED);
            SubLObject graph_id = glfgrph_id(glf_graph);
            SubLObject ais = glfgrph_ais(glf_graph);
            _csetf_glfarc_id(arc, arc_id);
            _csetf_glfarc_parent(arc, glf_graph);
            _csetf_glfarc_types(arc, isa.min_isa(arc_id, mt, UNPROVIDED));
            _csetf_glfarc_semantics(arc, ask_utilities.ask_variable($SEMANTICS, list($const160$variableMappingTableForGLFArcInDi, $SEMANTICS, arc_id, list($$AISForFn, graph_id)), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first());
            {
                SubLObject from = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                SubLObject to = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                SubLObject linkage_bindings = ask_utilities.ask_template($list_alt162, list($$linkFromToInSystem, arc_id, $sym164$_FROM, $sym165$_TO, ais), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = linkage_bindings;
                SubLObject linkage_binding = NIL;
                for (linkage_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , linkage_binding = cdolist_list_var.first()) {
                    {
                        SubLObject datum = linkage_binding;
                        SubLObject current = datum;
                        SubLObject source = NIL;
                        SubLObject target = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt166);
                        source = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt166);
                        target = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            set.set_add(source, from);
                            set.set_add(target, to);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt166);
                        }
                    }
                }
                _csetf_glfarc_to(arc, to);
                _csetf_glfarc_from(arc, from);
            }
            return arc;
        }
    }

    public static SubLObject create_glf_arc_from_kb(final SubLObject glf_graph, final SubLObject arc_id, final SubLObject mt) {
        final SubLObject arc = make_glf_arc(UNPROVIDED);
        final SubLObject graph_id = glfgrph_id(glf_graph);
        final SubLObject ais = glfgrph_ais(glf_graph);
        _csetf_glfarc_id(arc, arc_id);
        _csetf_glfarc_parent(arc, glf_graph);
        _csetf_glfarc_types(arc, isa.min_isa(arc_id, mt, UNPROVIDED));
        _csetf_glfarc_semantics(arc, ask_utilities.ask_variable($SEMANTICS, list($const173$variableMappingTableForGLFArcInDi, $SEMANTICS, arc_id, list($$AISForFn, graph_id)), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first());
        final SubLObject from = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject to = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject linkage_bindings = cdolist_list_var = ask_utilities.ask_template($list175, list($$linkFromToInSystem, arc_id, $sym177$_FROM, $sym178$_TO, ais), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject linkage_binding = NIL;
        linkage_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = linkage_binding;
            SubLObject source = NIL;
            SubLObject target = NIL;
            destructuring_bind_must_consp(current, datum, $list179);
            source = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list179);
            target = current.first();
            current = current.rest();
            if (NIL == current) {
                set.set_add(source, from);
                set.set_add(target, to);
            } else {
                cdestructuring_bind_error(datum, $list179);
            }
            cdolist_list_var = cdolist_list_var.rest();
            linkage_binding = cdolist_list_var.first();
        } 
        _csetf_glfarc_to(arc, to);
        _csetf_glfarc_from(arc, from);
        return arc;
    }

    public static final SubLObject glf_rendering_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        glfrndr_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject glf_rendering_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        glfrndr_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject glf_rendering_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.graphic_library_format.$glf_rendering_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject glf_rendering_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.graphic_library_format.$glf_rendering_native.class ? T : NIL;
    }

    public static final SubLObject glfrndr_label_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GLF_RENDERING_P);
        return v_object.getField2();
    }

    public static SubLObject glfrndr_label(final SubLObject v_object) {
        assert NIL != glf_rendering_p(v_object) : "! graphic_library_format.glf_rendering_p(v_object) " + "graphic_library_format.glf_rendering_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_glfrndr_label_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GLF_RENDERING_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_glfrndr_label(final SubLObject v_object, final SubLObject value) {
        assert NIL != glf_rendering_p(v_object) : "! graphic_library_format.glf_rendering_p(v_object) " + "graphic_library_format.glf_rendering_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_glf_rendering_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.graphic_library_format.$glf_rendering_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LABEL)) {
                        _csetf_glfrndr_label(v_new, current_value);
                    } else {
                        Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_glf_rendering(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.graphic_library_format.$glf_rendering_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LABEL)) {
                _csetf_glfrndr_label(v_new, current_value);
            } else {
                Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_glf_rendering(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GLF_RENDERING, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LABEL, glfrndr_label(obj));
        funcall(visitor_fn, obj, $END, MAKE_GLF_RENDERING, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_glf_rendering_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_glf_rendering(obj, visitor_fn);
    }

    public static final SubLObject glfrndr_print_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        string_utilities.indent(stream, depth);
        write_string($str_alt178$__GLF_Rendering_, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != glfrndr_label(v_object)) {
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str_alt179$_label__, stream, UNPROVIDED, UNPROVIDED);
            write_string(glfrndr_label(v_object), stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str_alt64$__, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject glfrndr_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        string_utilities.indent(stream, depth);
        write_string($str194$__GLF_Rendering_, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != glfrndr_label(v_object)) {
            terpri(stream);
            string_utilities.indent(stream, depth);
            write_string($str195$_label__, stream, UNPROVIDED, UNPROVIDED);
            write_string(glfrndr_label(v_object), stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str70$__, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static final SubLObject create_glf_rendering_for_component_from_kb_alt(SubLObject glf_graph, SubLObject component_id, SubLObject mt) {
        {
            SubLObject rendering = make_glf_rendering(UNPROVIDED);
            SubLObject ais = glfgrph_ais(glf_graph);
            _csetf_glfrndr_label(rendering, ask_utilities.ask_variable($LABEL, list($$glfComponentLabel, component_id, $LABEL, ais), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first());
            return rendering;
        }
    }

    public static SubLObject create_glf_rendering_for_component_from_kb(final SubLObject glf_graph, final SubLObject component_id, final SubLObject mt) {
        final SubLObject rendering = make_glf_rendering(UNPROVIDED);
        final SubLObject ais = glfgrph_ais(glf_graph);
        _csetf_glfrndr_label(rendering, ask_utilities.ask_variable($LABEL, list($$glfComponentLabel, component_id, $LABEL, ais), mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first());
        return rendering;
    }

    public static SubLObject declare_graphic_library_format_file() {
        declareFunction("glf_graph_print_function_trampoline", "GLF-GRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("glf_graph_p", "GLF-GRAPH-P", 1, 0, false);
        new graphic_library_format.$glf_graph_p$UnaryFunction();
        declareFunction("glfgrph_id", "GLFGRPH-ID", 1, 0, false);
        declareFunction("glfgrph_types", "GLFGRPH-TYPES", 1, 0, false);
        declareFunction("glfgrph_ais", "GLFGRPH-AIS", 1, 0, false);
        declareFunction("glfgrph_nodes", "GLFGRPH-NODES", 1, 0, false);
        declareFunction("glfgrph_node_types", "GLFGRPH-NODE-TYPES", 1, 0, false);
        declareFunction("glfgrph_source_node", "GLFGRPH-SOURCE-NODE", 1, 0, false);
        declareFunction("glfgrph_arcs", "GLFGRPH-ARCS", 1, 0, false);
        declareFunction("glfgrph_arc_types", "GLFGRPH-ARC-TYPES", 1, 0, false);
        declareFunction("glfgrph_incoming_connectors", "GLFGRPH-INCOMING-CONNECTORS", 1, 0, false);
        declareFunction("glfgrph_outgoing_connectors", "GLFGRPH-OUTGOING-CONNECTORS", 1, 0, false);
        declareFunction("glfgrph_incoming_connector_types", "GLFGRPH-INCOMING-CONNECTOR-TYPES", 1, 0, false);
        declareFunction("glfgrph_outgoing_connector_types", "GLFGRPH-OUTGOING-CONNECTOR-TYPES", 1, 0, false);
        declareFunction("glfgrph_rendering_info", "GLFGRPH-RENDERING-INFO", 1, 0, false);
        declareFunction("_csetf_glfgrph_id", "_CSETF-GLFGRPH-ID", 2, 0, false);
        declareFunction("_csetf_glfgrph_types", "_CSETF-GLFGRPH-TYPES", 2, 0, false);
        declareFunction("_csetf_glfgrph_ais", "_CSETF-GLFGRPH-AIS", 2, 0, false);
        declareFunction("_csetf_glfgrph_nodes", "_CSETF-GLFGRPH-NODES", 2, 0, false);
        declareFunction("_csetf_glfgrph_node_types", "_CSETF-GLFGRPH-NODE-TYPES", 2, 0, false);
        declareFunction("_csetf_glfgrph_source_node", "_CSETF-GLFGRPH-SOURCE-NODE", 2, 0, false);
        declareFunction("_csetf_glfgrph_arcs", "_CSETF-GLFGRPH-ARCS", 2, 0, false);
        declareFunction("_csetf_glfgrph_arc_types", "_CSETF-GLFGRPH-ARC-TYPES", 2, 0, false);
        declareFunction("_csetf_glfgrph_incoming_connectors", "_CSETF-GLFGRPH-INCOMING-CONNECTORS", 2, 0, false);
        declareFunction("_csetf_glfgrph_outgoing_connectors", "_CSETF-GLFGRPH-OUTGOING-CONNECTORS", 2, 0, false);
        declareFunction("_csetf_glfgrph_incoming_connector_types", "_CSETF-GLFGRPH-INCOMING-CONNECTOR-TYPES", 2, 0, false);
        declareFunction("_csetf_glfgrph_outgoing_connector_types", "_CSETF-GLFGRPH-OUTGOING-CONNECTOR-TYPES", 2, 0, false);
        declareFunction("_csetf_glfgrph_rendering_info", "_CSETF-GLFGRPH-RENDERING-INFO", 2, 0, false);
        declareFunction("make_glf_graph", "MAKE-GLF-GRAPH", 0, 1, false);
        declareFunction("visit_defstruct_glf_graph", "VISIT-DEFSTRUCT-GLF-GRAPH", 2, 0, false);
        declareFunction("visit_defstruct_object_glf_graph_method", "VISIT-DEFSTRUCT-OBJECT-GLF-GRAPH-METHOD", 2, 0, false);
        declareFunction("glfgrph_has_node_typesP", "GLFGRPH-HAS-NODE-TYPES?", 1, 0, false);
        declareFunction("glfgrph_has_arc_typesP", "GLFGRPH-HAS-ARC-TYPES?", 1, 0, false);
        declareFunction("glfgrph_has_incoming_connector_typesP", "GLFGRPH-HAS-INCOMING-CONNECTOR-TYPES?", 1, 0, false);
        declareFunction("glfgrph_has_outgoing_connector_typesP", "GLFGRPH-HAS-OUTGOING-CONNECTOR-TYPES?", 1, 0, false);
        declareFunction("glfgrph_has_rendering_infoP", "GLFGRPH-HAS-RENDERING-INFO?", 1, 0, false);
        declareFunction("glfgrph_has_nodesP", "GLFGRPH-HAS-NODES?", 1, 0, false);
        declareFunction("glfgrph_has_arcsP", "GLFGRPH-HAS-ARCS?", 1, 0, false);
        declareFunction("glfgrph_print", "GLFGRPH-PRINT", 3, 0, false);
        declareFunction("xml_serialize_glf_graph", "XML-SERIALIZE-GLF-GRAPH", 1, 1, false);
        declareFunction("xml_serialize_glf_graph_core", "XML-SERIALIZE-GLF-GRAPH-CORE", 2, 0, false);
        declareFunction("xml_serialize_glf_graph_diagram", "XML-SERIALIZE-GLF-GRAPH-DIAGRAM", 2, 0, false);
        declareFunction("xml_serialize_glf_graph_rendering", "XML-SERIALIZE-GLF-GRAPH-RENDERING", 2, 0, false);
        declareFunction("xml_serialize_glf_graph_rendering_info", "XML-SERIALIZE-GLF-GRAPH-RENDERING-INFO", 2, 0, false);
        declareFunction("xml_serialize_glf_graph_flow_model", "XML-SERIALIZE-GLF-GRAPH-FLOW-MODEL", 2, 0, false);
        declareFunction("get_graph_defining_mt", "GET-GRAPH-DEFINING-MT", 1, 0, false);
        declareFunction("load_glf_graph_from_kb", "LOAD-GLF-GRAPH-FROM-KB", 2, 0, false);
        declareFunction("map_glf_graph_to_ais", "MAP-GLF-GRAPH-TO-AIS", 2, 0, false);
        declareFunction("create_glf_graph_from_kb", "CREATE-GLF-GRAPH-FROM-KB", 2, 0, false);
        declareFunction("initialize_glfgrph_node_types", "INITIALIZE-GLFGRPH-NODE-TYPES", 2, 0, false);
        declareFunction("note_glf_graph_node_type", "NOTE-GLF-GRAPH-NODE-TYPE", 2, 0, false);
        declareFunction("initialize_glfgrph_arc_types", "INITIALIZE-GLFGRPH-ARC-TYPES", 2, 0, false);
        declareFunction("note_glf_graph_arc_type", "NOTE-GLF-GRAPH-ARC-TYPE", 2, 0, false);
        declareFunction("load_all_glf_nodes_from_kb", "LOAD-ALL-GLF-NODES-FROM-KB", 2, 0, false);
        declareFunction("load_one_glf_node_from_kb", "LOAD-ONE-GLF-NODE-FROM-KB", 3, 0, false);
        declareFunction("load_all_glf_arcs_from_kb", "LOAD-ALL-GLF-ARCS-FROM-KB", 2, 0, false);
        declareFunction("load_one_glf_arc_from_kb", "LOAD-ONE-GLF-ARC-FROM-KB", 3, 0, false);
        declareFunction("glf_node_print_function_trampoline", "GLF-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("glf_node_p", "GLF-NODE-P", 1, 0, false);
        new graphic_library_format.$glf_node_p$UnaryFunction();
        declareFunction("glfnode_id", "GLFNODE-ID", 1, 0, false);
        declareFunction("glfnode_types", "GLFNODE-TYPES", 1, 0, false);
        declareFunction("glfnode_parent", "GLFNODE-PARENT", 1, 0, false);
        declareFunction("glfnode_semantics", "GLFNODE-SEMANTICS", 1, 0, false);
        declareFunction("_csetf_glfnode_id", "_CSETF-GLFNODE-ID", 2, 0, false);
        declareFunction("_csetf_glfnode_types", "_CSETF-GLFNODE-TYPES", 2, 0, false);
        declareFunction("_csetf_glfnode_parent", "_CSETF-GLFNODE-PARENT", 2, 0, false);
        declareFunction("_csetf_glfnode_semantics", "_CSETF-GLFNODE-SEMANTICS", 2, 0, false);
        declareFunction("make_glf_node", "MAKE-GLF-NODE", 0, 1, false);
        declareFunction("visit_defstruct_glf_node", "VISIT-DEFSTRUCT-GLF-NODE", 2, 0, false);
        declareFunction("visit_defstruct_object_glf_node_method", "VISIT-DEFSTRUCT-OBJECT-GLF-NODE-METHOD", 2, 0, false);
        declareFunction("glfnode_print", "GLFNODE-PRINT", 3, 0, false);
        declareFunction("create_glf_node_from_kb", "CREATE-GLF-NODE-FROM-KB", 3, 0, false);
        declareFunction("glf_arc_print_function_trampoline", "GLF-ARC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("glf_arc_p", "GLF-ARC-P", 1, 0, false);
        new graphic_library_format.$glf_arc_p$UnaryFunction();
        declareFunction("glfarc_id", "GLFARC-ID", 1, 0, false);
        declareFunction("glfarc_types", "GLFARC-TYPES", 1, 0, false);
        declareFunction("glfarc_parent", "GLFARC-PARENT", 1, 0, false);
        declareFunction("glfarc_from", "GLFARC-FROM", 1, 0, false);
        declareFunction("glfarc_to", "GLFARC-TO", 1, 0, false);
        declareFunction("glfarc_semantics", "GLFARC-SEMANTICS", 1, 0, false);
        declareFunction("_csetf_glfarc_id", "_CSETF-GLFARC-ID", 2, 0, false);
        declareFunction("_csetf_glfarc_types", "_CSETF-GLFARC-TYPES", 2, 0, false);
        declareFunction("_csetf_glfarc_parent", "_CSETF-GLFARC-PARENT", 2, 0, false);
        declareFunction("_csetf_glfarc_from", "_CSETF-GLFARC-FROM", 2, 0, false);
        declareFunction("_csetf_glfarc_to", "_CSETF-GLFARC-TO", 2, 0, false);
        declareFunction("_csetf_glfarc_semantics", "_CSETF-GLFARC-SEMANTICS", 2, 0, false);
        declareFunction("make_glf_arc", "MAKE-GLF-ARC", 0, 1, false);
        declareFunction("visit_defstruct_glf_arc", "VISIT-DEFSTRUCT-GLF-ARC", 2, 0, false);
        declareFunction("visit_defstruct_object_glf_arc_method", "VISIT-DEFSTRUCT-OBJECT-GLF-ARC-METHOD", 2, 0, false);
        declareFunction("glfarc_print", "GLFARC-PRINT", 3, 0, false);
        declareFunction("create_glf_arc_from_kb", "CREATE-GLF-ARC-FROM-KB", 3, 0, false);
        declareFunction("glf_rendering_print_function_trampoline", "GLF-RENDERING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("glf_rendering_p", "GLF-RENDERING-P", 1, 0, false);
        new graphic_library_format.$glf_rendering_p$UnaryFunction();
        declareFunction("glfrndr_label", "GLFRNDR-LABEL", 1, 0, false);
        declareFunction("_csetf_glfrndr_label", "_CSETF-GLFRNDR-LABEL", 2, 0, false);
        declareFunction("make_glf_rendering", "MAKE-GLF-RENDERING", 0, 1, false);
        declareFunction("visit_defstruct_glf_rendering", "VISIT-DEFSTRUCT-GLF-RENDERING", 2, 0, false);
        declareFunction("visit_defstruct_object_glf_rendering_method", "VISIT-DEFSTRUCT-OBJECT-GLF-RENDERING-METHOD", 2, 0, false);
        declareFunction("glfrndr_print", "GLFRNDR-PRINT", 3, 0, false);
        declareFunction("create_glf_rendering_for_component_from_kb", "CREATE-GLF-RENDERING-FOR-COMPONENT-FROM-KB", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_graphic_library_format_file() {
        defconstant("*DTP-GLF-GRAPH*", GLF_GRAPH);
        defconstant("*DTP-GLF-NODE*", GLF_NODE);
        defconstant("*DTP-GLF-ARC*", GLF_ARC);
        defconstant("*DTP-GLF-RENDERING*", GLF_RENDERING);
        return NIL;
    }

    public static SubLObject setup_graphic_library_format_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_glf_graph$.getGlobalValue(), symbol_function(GLF_GRAPH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(GLFGRPH_ID, _CSETF_GLFGRPH_ID);
        def_csetf(GLFGRPH_TYPES, _CSETF_GLFGRPH_TYPES);
        def_csetf(GLFGRPH_AIS, _CSETF_GLFGRPH_AIS);
        def_csetf(GLFGRPH_NODES, _CSETF_GLFGRPH_NODES);
        def_csetf(GLFGRPH_NODE_TYPES, _CSETF_GLFGRPH_NODE_TYPES);
        def_csetf(GLFGRPH_SOURCE_NODE, _CSETF_GLFGRPH_SOURCE_NODE);
        def_csetf(GLFGRPH_ARCS, _CSETF_GLFGRPH_ARCS);
        def_csetf(GLFGRPH_ARC_TYPES, _CSETF_GLFGRPH_ARC_TYPES);
        def_csetf(GLFGRPH_INCOMING_CONNECTORS, _CSETF_GLFGRPH_INCOMING_CONNECTORS);
        def_csetf(GLFGRPH_OUTGOING_CONNECTORS, _CSETF_GLFGRPH_OUTGOING_CONNECTORS);
        def_csetf(GLFGRPH_INCOMING_CONNECTOR_TYPES, _CSETF_GLFGRPH_INCOMING_CONNECTOR_TYPES);
        def_csetf(GLFGRPH_OUTGOING_CONNECTOR_TYPES, _CSETF_GLFGRPH_OUTGOING_CONNECTOR_TYPES);
        def_csetf(GLFGRPH_RENDERING_INFO, _CSETF_GLFGRPH_RENDERING_INFO);
        identity(GLF_GRAPH);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_glf_graph$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GLF_GRAPH_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_glf_node$.getGlobalValue(), symbol_function(GLF_NODE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list125);
        def_csetf(GLFNODE_ID, _CSETF_GLFNODE_ID);
        def_csetf(GLFNODE_TYPES, _CSETF_GLFNODE_TYPES);
        def_csetf(GLFNODE_PARENT, _CSETF_GLFNODE_PARENT);
        def_csetf(GLFNODE_SEMANTICS, _CSETF_GLFNODE_SEMANTICS);
        identity(GLF_NODE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_glf_node$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GLF_NODE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_glf_arc$.getGlobalValue(), symbol_function(GLF_ARC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list152);
        def_csetf(GLFARC_ID, _CSETF_GLFARC_ID);
        def_csetf(GLFARC_TYPES, _CSETF_GLFARC_TYPES);
        def_csetf(GLFARC_PARENT, _CSETF_GLFARC_PARENT);
        def_csetf(GLFARC_FROM, _CSETF_GLFARC_FROM);
        def_csetf(GLFARC_TO, _CSETF_GLFARC_TO);
        def_csetf(GLFARC_SEMANTICS, _CSETF_GLFARC_SEMANTICS);
        identity(GLF_ARC);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_glf_arc$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GLF_ARC_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_glf_rendering$.getGlobalValue(), symbol_function(GLF_RENDERING_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list188);
        def_csetf(GLFRNDR_LABEL, _CSETF_GLFRNDR_LABEL);
        identity(GLF_RENDERING);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_glf_rendering$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GLF_RENDERING_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_graphic_library_format_file();
    }

    @Override
    public void initializeVariables() {
        init_graphic_library_format_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_graphic_library_format_file();
    }

    

    public static final class $glf_graph_p$UnaryFunction extends UnaryFunction {
        public $glf_graph_p$UnaryFunction() {
            super(extractFunctionNamed("GLF-GRAPH-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return glf_graph_p(arg1);
        }
    }

    public static final class $glf_node_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $types;

        public SubLObject $parent;

        public SubLObject $semantics;

        private static final SubLStructDeclNative structDecl;

        public $glf_node_native() {
            graphic_library_format.$glf_node_native.this.$id = Lisp.NIL;
            graphic_library_format.$glf_node_native.this.$types = Lisp.NIL;
            graphic_library_format.$glf_node_native.this.$parent = Lisp.NIL;
            graphic_library_format.$glf_node_native.this.$semantics = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return graphic_library_format.$glf_node_native.this.$id;
        }

        @Override
        public SubLObject getField3() {
            return graphic_library_format.$glf_node_native.this.$types;
        }

        @Override
        public SubLObject getField4() {
            return graphic_library_format.$glf_node_native.this.$parent;
        }

        @Override
        public SubLObject getField5() {
            return graphic_library_format.$glf_node_native.this.$semantics;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return graphic_library_format.$glf_node_native.this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return graphic_library_format.$glf_node_native.this.$types = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return graphic_library_format.$glf_node_native.this.$parent = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return graphic_library_format.$glf_node_native.this.$semantics = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.graphic_library_format.$glf_node_native.class, GLF_NODE, GLF_NODE_P, $list119, $list120, new String[]{ "$id", "$types", "$parent", "$semantics" }, $list121, $list122, GLFNODE_PRINT);
        }
    }

    public static final class $glf_node_p$UnaryFunction extends UnaryFunction {
        public $glf_node_p$UnaryFunction() {
            super(extractFunctionNamed("GLF-NODE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return glf_node_p(arg1);
        }
    }

    public static final class $glf_arc_p$UnaryFunction extends UnaryFunction {
        public $glf_arc_p$UnaryFunction() {
            super(extractFunctionNamed("GLF-ARC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return glf_arc_p(arg1);
        }
    }

    public static final class $glf_rendering_p$UnaryFunction extends UnaryFunction {
        public $glf_rendering_p$UnaryFunction() {
            super(extractFunctionNamed("GLF-RENDERING-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return glf_rendering_p(arg1);
        }
    }
}

/**
 * Total time: 6364 ms
 */
