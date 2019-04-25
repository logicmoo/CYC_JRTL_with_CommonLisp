package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class graphic_library_format extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.graphic_library_format";
    public static final String myFingerPrint = "ef2475bcbc7d9d072a980a2ad5319490c89018321af98a1955033c448dcdd186";
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLSymbol $dtp_glf_graph$;
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLSymbol $dtp_glf_node$;
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLSymbol $dtp_glf_arc$;
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 18298L)
    public static SubLSymbol $dtp_glf_rendering$;
    private static final SubLSymbol $sym0$GLF_GRAPH;
    private static final SubLSymbol $sym1$GLF_GRAPH_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$GLFGRPH_PRINT;
    private static final SubLSymbol $sym7$GLF_GRAPH_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$GLFGRPH_ID;
    private static final SubLSymbol $sym10$_CSETF_GLFGRPH_ID;
    private static final SubLSymbol $sym11$GLFGRPH_TYPES;
    private static final SubLSymbol $sym12$_CSETF_GLFGRPH_TYPES;
    private static final SubLSymbol $sym13$GLFGRPH_AIS;
    private static final SubLSymbol $sym14$_CSETF_GLFGRPH_AIS;
    private static final SubLSymbol $sym15$GLFGRPH_NODES;
    private static final SubLSymbol $sym16$_CSETF_GLFGRPH_NODES;
    private static final SubLSymbol $sym17$GLFGRPH_NODE_TYPES;
    private static final SubLSymbol $sym18$_CSETF_GLFGRPH_NODE_TYPES;
    private static final SubLSymbol $sym19$GLFGRPH_SOURCE_NODE;
    private static final SubLSymbol $sym20$_CSETF_GLFGRPH_SOURCE_NODE;
    private static final SubLSymbol $sym21$GLFGRPH_ARCS;
    private static final SubLSymbol $sym22$_CSETF_GLFGRPH_ARCS;
    private static final SubLSymbol $sym23$GLFGRPH_ARC_TYPES;
    private static final SubLSymbol $sym24$_CSETF_GLFGRPH_ARC_TYPES;
    private static final SubLSymbol $sym25$GLFGRPH_INCOMING_CONNECTORS;
    private static final SubLSymbol $sym26$_CSETF_GLFGRPH_INCOMING_CONNECTORS;
    private static final SubLSymbol $sym27$GLFGRPH_OUTGOING_CONNECTORS;
    private static final SubLSymbol $sym28$_CSETF_GLFGRPH_OUTGOING_CONNECTORS;
    private static final SubLSymbol $sym29$GLFGRPH_INCOMING_CONNECTOR_TYPES;
    private static final SubLSymbol $sym30$_CSETF_GLFGRPH_INCOMING_CONNECTOR_TYPES;
    private static final SubLSymbol $sym31$GLFGRPH_OUTGOING_CONNECTOR_TYPES;
    private static final SubLSymbol $sym32$_CSETF_GLFGRPH_OUTGOING_CONNECTOR_TYPES;
    private static final SubLSymbol $sym33$GLFGRPH_RENDERING_INFO;
    private static final SubLSymbol $sym34$_CSETF_GLFGRPH_RENDERING_INFO;
    private static final SubLSymbol $kw35$ID;
    private static final SubLSymbol $kw36$TYPES;
    private static final SubLSymbol $kw37$AIS;
    private static final SubLSymbol $kw38$NODES;
    private static final SubLSymbol $kw39$NODE_TYPES;
    private static final SubLSymbol $kw40$SOURCE_NODE;
    private static final SubLSymbol $kw41$ARCS;
    private static final SubLSymbol $kw42$ARC_TYPES;
    private static final SubLSymbol $kw43$INCOMING_CONNECTORS;
    private static final SubLSymbol $kw44$OUTGOING_CONNECTORS;
    private static final SubLSymbol $kw45$INCOMING_CONNECTOR_TYPES;
    private static final SubLSymbol $kw46$OUTGOING_CONNECTOR_TYPES;
    private static final SubLSymbol $kw47$RENDERING_INFO;
    private static final SubLString $str48$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw49$BEGIN;
    private static final SubLSymbol $sym50$MAKE_GLF_GRAPH;
    private static final SubLSymbol $kw51$SLOT;
    private static final SubLSymbol $kw52$END;
    private static final SubLSymbol $sym53$VISIT_DEFSTRUCT_OBJECT_GLF_GRAPH_METHOD;
    private static final SubLString $str54$_GLF_Graph_;
    private static final SubLString $str55$_of_types_;
    private static final SubLString $str56$_corresponding_AIS__;
    private static final SubLString $str57$_Types__;
    private static final SubLString $str58$__Node_Types__;
    private static final SubLString $str59$__Arc_Types__;
    private static final SubLString $str60$__In_Connectors__;
    private static final SubLString $str61$__Out_Connectors__;
    private static final SubLString $str62$_no_information_available_;
    private static final SubLString $str63$_Content__;
    private static final SubLString $str64$__Nodes__first_is_source___;
    private static final SubLString $str65$__Arcs__;
    private static final SubLString $str66$_currently_empty_;
    private static final SubLString $str67$_Rendering_Information_;
    private static final SubLString $str68$__;
    private static final SubLString $str69$____;
    private static final SubLString $str70$__;
    private static final SubLString $str71$glfGraph;
    private static final SubLSymbol $kw72$UNINITIALIZED;
    private static final SubLString $str73$glfCore;
    private static final SubLString $str74$glfNodeTypes;
    private static final SubLString $str75$glfNodeType;
    private static final SubLString $str76$glfArcTypes;
    private static final SubLString $str77$glfArcType;
    private static final SubLString $str78$glfDiagram;
    private static final SubLString $str79$glfId;
    private static final SubLString $str80$glfOwnsNodes;
    private static final SubLString $str81$glfOwnsNode;
    private static final SubLString $str82$glfIsHeadNode;
    private static final SubLSymbol $kw83$ATOMIC;
    private static final SubLString $str84$glfHasTypes;
    private static final SubLString $str85$glfHasType;
    private static final SubLString $str86$glfOwnsArcs;
    private static final SubLString $str87$glfOwnsArc;
    private static final SubLString $str88$glfFromSet;
    private static final SubLString $str89$glfFrom;
    private static final SubLString $str90$glfToSet;
    private static final SubLString $str91$glfTo;
    private static final SubLString $str92$glfRendering;
    private static final SubLString $str93$glfRenderNodes;
    private static final SubLString $str94$glfRenderNode;
    private static final SubLString $str95$glfRenderArcs;
    private static final SubLString $str96$glfRenderArc;
    private static final SubLString $str97$glfRenderInfo;
    private static final SubLString $str98$glfRenderLabel;
    private static final SubLString $str99$glfFlowModel;
    private static final SubLString $str100$glfSemanticForNodes;
    private static final SubLString $str101$glfSemanticForNode;
    private static final SubLString $str102$glfHasSemantic;
    private static final SubLString $str103$glfSemanticForArcs;
    private static final SubLString $str104$glfSemanticForArc;
    private static final SubLObject $const105$isa;
    private static final SubLList $list106;
    private static final SubLObject $const107$correspondingAIS;
    private static final SubLList $list108;
    private static final SubLObject $const109$GLFNode;
    private static final SubLObject $const110$GLFArc;
    private static final SubLSymbol $kw111$NODE;
    private static final SubLObject $const112$nodeInSystem;
    private static final SubLSymbol $kw113$SOURCE;
    private static final SubLObject $const114$sourceNodeInSystem;
    private static final SubLSymbol $kw115$ARC;
    private static final SubLObject $const116$linkInSystem;
    private static final SubLSymbol $sym117$GLF_NODE;
    private static final SubLSymbol $sym118$GLF_NODE_P;
    private static final SubLList $list119;
    private static final SubLList $list120;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$GLFNODE_PRINT;
    private static final SubLSymbol $sym124$GLF_NODE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$GLFNODE_ID;
    private static final SubLSymbol $sym127$_CSETF_GLFNODE_ID;
    private static final SubLSymbol $sym128$GLFNODE_TYPES;
    private static final SubLSymbol $sym129$_CSETF_GLFNODE_TYPES;
    private static final SubLSymbol $sym130$GLFNODE_PARENT;
    private static final SubLSymbol $sym131$_CSETF_GLFNODE_PARENT;
    private static final SubLSymbol $sym132$GLFNODE_SEMANTICS;
    private static final SubLSymbol $sym133$_CSETF_GLFNODE_SEMANTICS;
    private static final SubLSymbol $kw134$PARENT;
    private static final SubLSymbol $kw135$SEMANTICS;
    private static final SubLSymbol $sym136$MAKE_GLF_NODE;
    private static final SubLSymbol $sym137$VISIT_DEFSTRUCT_OBJECT_GLF_NODE_METHOD;
    private static final SubLString $str138$_GLF_Node_;
    private static final SubLString $str139$_of_graph_;
    private static final SubLString $str140$_with_semantics_;
    private static final SubLString $str141$_without_semantics_;
    private static final SubLObject $const142$glfNodeSemantics_Underspecified;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$GLF_ARC;
    private static final SubLSymbol $sym145$GLF_ARC_P;
    private static final SubLList $list146;
    private static final SubLList $list147;
    private static final SubLList $list148;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$GLFARC_PRINT;
    private static final SubLSymbol $sym151$GLF_ARC_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list152;
    private static final SubLSymbol $sym153$GLFARC_ID;
    private static final SubLSymbol $sym154$_CSETF_GLFARC_ID;
    private static final SubLSymbol $sym155$GLFARC_TYPES;
    private static final SubLSymbol $sym156$_CSETF_GLFARC_TYPES;
    private static final SubLSymbol $sym157$GLFARC_PARENT;
    private static final SubLSymbol $sym158$_CSETF_GLFARC_PARENT;
    private static final SubLSymbol $sym159$GLFARC_FROM;
    private static final SubLSymbol $sym160$_CSETF_GLFARC_FROM;
    private static final SubLSymbol $sym161$GLFARC_TO;
    private static final SubLSymbol $sym162$_CSETF_GLFARC_TO;
    private static final SubLSymbol $sym163$GLFARC_SEMANTICS;
    private static final SubLSymbol $sym164$_CSETF_GLFARC_SEMANTICS;
    private static final SubLSymbol $kw165$FROM;
    private static final SubLSymbol $kw166$TO;
    private static final SubLSymbol $sym167$MAKE_GLF_ARC;
    private static final SubLSymbol $sym168$VISIT_DEFSTRUCT_OBJECT_GLF_ARC_METHOD;
    private static final SubLString $str169$_GLF_Arc_;
    private static final SubLString $str170$_from__;
    private static final SubLString $str171$_to____;
    private static final SubLString $str172$_meaning__;
    private static final SubLObject $const173$variableMappingTableForGLFArcInDi;
    private static final SubLObject $const174$AISForFn;
    private static final SubLList $list175;
    private static final SubLObject $const176$linkFromToInSystem;
    private static final SubLSymbol $sym177$_FROM;
    private static final SubLSymbol $sym178$_TO;
    private static final SubLList $list179;
    private static final SubLSymbol $sym180$GLF_RENDERING;
    private static final SubLSymbol $sym181$GLF_RENDERING_P;
    private static final SubLList $list182;
    private static final SubLList $list183;
    private static final SubLList $list184;
    private static final SubLList $list185;
    private static final SubLSymbol $sym186$GLFRNDR_PRINT;
    private static final SubLSymbol $sym187$GLF_RENDERING_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list188;
    private static final SubLSymbol $sym189$GLFRNDR_LABEL;
    private static final SubLSymbol $sym190$_CSETF_GLFRNDR_LABEL;
    private static final SubLSymbol $kw191$LABEL;
    private static final SubLSymbol $sym192$MAKE_GLF_RENDERING;
    private static final SubLSymbol $sym193$VISIT_DEFSTRUCT_OBJECT_GLF_RENDERING_METHOD;
    private static final SubLString $str194$__GLF_Rendering_;
    private static final SubLString $str195$_label__;
    private static final SubLObject $const196$glfComponentLabel;
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glf_graph_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        glfgrph_print(v_object, stream, (SubLObject)graphic_library_format.ZERO_INTEGER);
        return (SubLObject)graphic_library_format.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glf_graph_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $glf_graph_native.class) ? graphic_library_format.T : graphic_library_format.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_id(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_types(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_ais(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_nodes(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_node_types(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_source_node(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_arcs(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_arc_types(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_incoming_connectors(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_outgoing_connectors(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_incoming_connector_types(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_outgoing_connector_types(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject glfgrph_rendering_info(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_id(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_types(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_ais(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_nodes(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_node_types(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_source_node(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_arcs(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_arc_types(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_incoming_connectors(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_outgoing_connectors(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_incoming_connector_types(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_outgoing_connector_types(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject _csetf_glfgrph_rendering_info(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_graph_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject make_glf_graph(SubLObject arglist) {
        if (arglist == graphic_library_format.UNPROVIDED) {
            arglist = (SubLObject)graphic_library_format.NIL;
        }
        final SubLObject v_new = (SubLObject)new $glf_graph_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)graphic_library_format.NIL, next = arglist; graphic_library_format.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)graphic_library_format.$kw35$ID)) {
                _csetf_glfgrph_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw36$TYPES)) {
                _csetf_glfgrph_types(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw37$AIS)) {
                _csetf_glfgrph_ais(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw38$NODES)) {
                _csetf_glfgrph_nodes(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw39$NODE_TYPES)) {
                _csetf_glfgrph_node_types(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw40$SOURCE_NODE)) {
                _csetf_glfgrph_source_node(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw41$ARCS)) {
                _csetf_glfgrph_arcs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw42$ARC_TYPES)) {
                _csetf_glfgrph_arc_types(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw43$INCOMING_CONNECTORS)) {
                _csetf_glfgrph_incoming_connectors(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw44$OUTGOING_CONNECTORS)) {
                _csetf_glfgrph_outgoing_connectors(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw45$INCOMING_CONNECTOR_TYPES)) {
                _csetf_glfgrph_incoming_connector_types(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw46$OUTGOING_CONNECTOR_TYPES)) {
                _csetf_glfgrph_outgoing_connector_types(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw47$RENDERING_INFO)) {
                _csetf_glfgrph_rendering_info(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)graphic_library_format.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject visit_defstruct_glf_graph(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw49$BEGIN, (SubLObject)graphic_library_format.$sym50$MAKE_GLF_GRAPH, (SubLObject)graphic_library_format.THIRTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw35$ID, glfgrph_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw36$TYPES, glfgrph_types(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw37$AIS, glfgrph_ais(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw38$NODES, glfgrph_nodes(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw39$NODE_TYPES, glfgrph_node_types(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw40$SOURCE_NODE, glfgrph_source_node(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw41$ARCS, glfgrph_arcs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw42$ARC_TYPES, glfgrph_arc_types(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw43$INCOMING_CONNECTORS, glfgrph_incoming_connectors(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw44$OUTGOING_CONNECTORS, glfgrph_outgoing_connectors(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw45$INCOMING_CONNECTOR_TYPES, glfgrph_incoming_connector_types(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw46$OUTGOING_CONNECTOR_TYPES, glfgrph_outgoing_connector_types(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw47$RENDERING_INFO, glfgrph_rendering_info(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw52$END, (SubLObject)graphic_library_format.$sym50$MAKE_GLF_GRAPH, (SubLObject)graphic_library_format.THIRTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1027L)
    public static SubLObject visit_defstruct_object_glf_graph_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_glf_graph(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1725L)
    public static SubLObject glfgrph_has_node_typesP(final SubLObject v_graph) {
        return Numbers.plusp(set.set_size(glfgrph_node_types(v_graph)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1878L)
    public static SubLObject glfgrph_has_arc_typesP(final SubLObject v_graph) {
        return Numbers.plusp(set.set_size(glfgrph_arc_types(v_graph)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 1980L)
    public static SubLObject glfgrph_has_incoming_connector_typesP(final SubLObject v_graph) {
        return Numbers.plusp(set.set_size(glfgrph_incoming_connector_types(v_graph)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 2112L)
    public static SubLObject glfgrph_has_outgoing_connector_typesP(final SubLObject v_graph) {
        return Numbers.plusp(set.set_size(glfgrph_outgoing_connector_types(v_graph)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 2244L)
    public static SubLObject glfgrph_has_rendering_infoP(final SubLObject v_graph) {
        return (SubLObject)SubLObjectFactory.makeBoolean(graphic_library_format.NIL == dictionary.dictionary_empty_p(glfgrph_rendering_info(v_graph)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 2365L)
    public static SubLObject glfgrph_has_nodesP(final SubLObject v_graph) {
        return list_utilities.sublisp_boolean(glfgrph_nodes(v_graph));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 2450L)
    public static SubLObject glfgrph_has_arcsP(final SubLObject v_graph) {
        return list_utilities.sublisp_boolean(glfgrph_arcs(v_graph));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 2533L)
    public static SubLObject glfgrph_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        string_utilities.indent(stream, depth);
        streams_high.write_string((SubLObject)graphic_library_format.$str54$_GLF_Graph_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        print_high.prin1(glfgrph_id(v_object), stream);
        streams_high.write_string((SubLObject)graphic_library_format.$str55$_of_types_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        print_high.prin1(glfgrph_types(v_object), stream);
        streams_high.terpri(stream);
        string_utilities.indent(stream, depth);
        streams_high.write_string((SubLObject)graphic_library_format.$str56$_corresponding_AIS__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        print_high.prin1(glfgrph_ais(v_object), stream);
        SubLObject showed_typeP = (SubLObject)graphic_library_format.NIL;
        streams_high.terpri(stream);
        string_utilities.indent(stream, depth);
        streams_high.write_string((SubLObject)graphic_library_format.$str57$_Types__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        if (graphic_library_format.NIL != glfgrph_has_node_typesP(v_object)) {
            showed_typeP = (SubLObject)graphic_library_format.T;
            streams_high.terpri(stream);
            string_utilities.indent(stream, depth);
            streams_high.write_string((SubLObject)graphic_library_format.$str58$__Node_Types__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
            print_high.prin1(glfgrph_node_types(v_object), stream);
        }
        if (graphic_library_format.NIL != glfgrph_has_arc_typesP(v_object)) {
            showed_typeP = (SubLObject)graphic_library_format.T;
            streams_high.terpri(stream);
            string_utilities.indent(stream, depth);
            streams_high.write_string((SubLObject)graphic_library_format.$str59$__Arc_Types__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
            print_high.prin1(glfgrph_arc_types(v_object), stream);
        }
        if (graphic_library_format.NIL != glfgrph_has_incoming_connector_typesP(v_object)) {
            showed_typeP = (SubLObject)graphic_library_format.T;
            streams_high.terpri(stream);
            string_utilities.indent(stream, depth);
            streams_high.write_string((SubLObject)graphic_library_format.$str60$__In_Connectors__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
            print_high.prin1(glfgrph_incoming_connector_types(v_object), stream);
        }
        if (graphic_library_format.NIL != glfgrph_has_outgoing_connector_typesP(v_object)) {
            showed_typeP = (SubLObject)graphic_library_format.T;
            streams_high.terpri(stream);
            string_utilities.indent(stream, depth);
            streams_high.write_string((SubLObject)graphic_library_format.$str61$__Out_Connectors__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
            print_high.prin1(glfgrph_outgoing_connector_types(v_object), stream);
        }
        if (graphic_library_format.NIL == showed_typeP) {
            streams_high.write_string((SubLObject)graphic_library_format.$str62$_no_information_available_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        }
        SubLObject showed_elementsP = (SubLObject)graphic_library_format.NIL;
        streams_high.terpri(stream);
        string_utilities.indent(stream, depth);
        streams_high.write_string((SubLObject)graphic_library_format.$str63$_Content__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        if (graphic_library_format.NIL != glfgrph_nodes(v_object)) {
            showed_elementsP = (SubLObject)graphic_library_format.T;
            streams_high.terpri(stream);
            string_utilities.indent(stream, depth);
            streams_high.write_string((SubLObject)graphic_library_format.$str64$__Nodes__first_is_source___, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
            if (graphic_library_format.NIL != glfgrph_source_node(v_object)) {
                streams_high.terpri(stream);
                glfnode_print(glfgrph_source_node(v_object), stream, Numbers.add(depth, (SubLObject)graphic_library_format.THREE_INTEGER));
            }
            SubLObject cdolist_list_var = glfgrph_nodes(v_object);
            SubLObject node = (SubLObject)graphic_library_format.NIL;
            node = cdolist_list_var.first();
            while (graphic_library_format.NIL != cdolist_list_var) {
                if (!node.eql(glfgrph_source_node(v_object))) {
                    streams_high.terpri(stream);
                    glfnode_print(node, stream, Numbers.add(depth, (SubLObject)graphic_library_format.THREE_INTEGER));
                }
                cdolist_list_var = cdolist_list_var.rest();
                node = cdolist_list_var.first();
            }
        }
        if (graphic_library_format.NIL != glfgrph_arcs(v_object)) {
            showed_elementsP = (SubLObject)graphic_library_format.T;
            streams_high.terpri(stream);
            string_utilities.indent(stream, depth);
            streams_high.write_string((SubLObject)graphic_library_format.$str65$__Arcs__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
            SubLObject cdolist_list_var = glfgrph_arcs(v_object);
            SubLObject arc = (SubLObject)graphic_library_format.NIL;
            arc = cdolist_list_var.first();
            while (graphic_library_format.NIL != cdolist_list_var) {
                streams_high.terpri(stream);
                glfarc_print(arc, stream, Numbers.add(depth, (SubLObject)graphic_library_format.THREE_INTEGER));
                cdolist_list_var = cdolist_list_var.rest();
                arc = cdolist_list_var.first();
            }
        }
        if (graphic_library_format.NIL == showed_elementsP) {
            streams_high.write_string((SubLObject)graphic_library_format.$str66$_currently_empty_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        }
        if (graphic_library_format.NIL != glfgrph_has_rendering_infoP(v_object)) {
            streams_high.terpri(stream);
            string_utilities.indent(stream, depth);
            streams_high.write_string((SubLObject)graphic_library_format.$str67$_Rendering_Information_, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(glfgrph_rendering_info(v_object))); graphic_library_format.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject component_id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject rendering = thread.secondMultipleValue();
                thread.resetMultipleValues();
                streams_high.terpri(stream);
                string_utilities.indent(stream, depth);
                streams_high.write_string((SubLObject)graphic_library_format.$str68$__, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
                print_high.prin1(component_id, stream);
                streams_high.write_string((SubLObject)graphic_library_format.$str69$____, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
                glfrndr_print(rendering, stream, Numbers.add(depth, (SubLObject)graphic_library_format.THREE_INTEGER));
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        streams_high.write_string((SubLObject)graphic_library_format.$str70$__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 5523L)
    public static SubLObject xml_serialize_glf_graph(final SubLObject glf_graph, SubLObject stream) {
        if (stream == graphic_library_format.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert graphic_library_format.NIL != glf_graph_p(glf_graph) : glf_graph;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str71$glfGraph, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                        xml_serialize_glf_graph_core(glf_graph, stream);
                        xml_serialize_glf_graph_diagram(glf_graph, stream);
                        xml_serialize_glf_graph_rendering(glf_graph, stream);
                        xml_serialize_glf_graph_flow_model(glf_graph, stream);
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str71$glfGraph);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return glf_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 6013L)
    public static SubLObject xml_serialize_glf_graph_core(final SubLObject glf_graph, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str73$glfCore, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                    if (graphic_library_format.NIL != glfgrph_has_node_typesP(glf_graph)) {
                        try {
                            final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str74$glfNodeTypes, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
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
                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)graphic_library_format.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); graphic_library_format.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        type = set_contents.do_set_contents_next(basis_object, state);
                                        if (graphic_library_format.NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                            try {
                                                _prev_bind_0_$7 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str75$glfNodeType, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                    _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                        cycml.cycml_serialize_term(type);
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$7, thread);
                                                }
                                            }
                                            finally {
                                                _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                    _values = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str75$glfNodeType);
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str74$glfNodeTypes);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                    }
                    if (graphic_library_format.NIL != glfgrph_has_arc_typesP(glf_graph)) {
                        try {
                            final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str76$glfArcTypes, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
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
                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)graphic_library_format.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); graphic_library_format.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        type = set_contents.do_set_contents_next(basis_object, state);
                                        if (graphic_library_format.NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                            try {
                                                _prev_bind_0_$13 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str77$glfArcType, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                    _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                        cycml.cycml_serialize_term(type);
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$9, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$13, thread);
                                                }
                                            }
                                            finally {
                                                _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                    _values3 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str77$glfArcType);
                                                    Values.restoreValuesFromVector(_values3);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str76$glfArcTypes);
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                final SubLObject _values5 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str73$glfCore);
                Values.restoreValuesFromVector(_values5);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return glf_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 6599L)
    public static SubLObject xml_serialize_glf_graph_diagram(final SubLObject glf_graph, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str78$glfDiagram, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$23 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str79$glfId, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                cycml.cycml_serialize_term(glfgrph_id(glf_graph));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$23, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$23, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str79$glfId);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                        }
                    }
                    if (graphic_library_format.NIL != glfgrph_has_nodesP(glf_graph)) {
                        try {
                            final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str80$glfOwnsNodes, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = glfgrph_nodes(glf_graph);
                                    SubLObject node = (SubLObject)graphic_library_format.NIL;
                                    node = cdolist_list_var.first();
                                    while (graphic_library_format.NIL != cdolist_list_var) {
                                        try {
                                            final SubLObject _prev_bind_0_$27 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str81$glfOwnsNode, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                    if (node.eql(glfgrph_source_node(glf_graph))) {
                                                        try {
                                                            final SubLObject _prev_bind_0_$29 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str82$glfIsHeadNode, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw83$ATOMIC, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$26, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$29, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                                Values.restoreValuesFromVector(_values2);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$32 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str79$glfId, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$33 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                cycml.cycml_serialize_term(glfnode_id(node));
                                                            }
                                                            finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$33, thread);
                                                            }
                                                        }
                                                        finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$27, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$32, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                            final SubLObject _values3 = Values.getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str79$glfId);
                                                            Values.restoreValuesFromVector(_values3);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$35 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$28 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str84$glfHasTypes, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                SubLObject cdolist_list_var_$43 = glfnode_types(node);
                                                                SubLObject type = (SubLObject)graphic_library_format.NIL;
                                                                type = cdolist_list_var_$43.first();
                                                                while (graphic_library_format.NIL != cdolist_list_var_$43) {
                                                                    try {
                                                                        final SubLObject _prev_bind_0_$37 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$29 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                        try {
                                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                            xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str85$glfHasType, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                            final SubLObject _prev_bind_0_$38 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                            try {
                                                                                xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                                try {
                                                                                    final SubLObject _prev_bind_0_$39 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                    final SubLObject _prev_bind_1_$30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                        xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str79$glfId, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                                        final SubLObject _prev_bind_0_$40 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                        try {
                                                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                                            cycml.cycml_serialize_term(type);
                                                                                        }
                                                                                        finally {
                                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$40, thread);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$30, thread);
                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$39, thread);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                                        final SubLObject _values4 = Values.getValuesAsVector();
                                                                                        xml_utilities.xml_terpri();
                                                                                        xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str79$glfId);
                                                                                        Values.restoreValuesFromVector(_values4);
                                                                                    }
                                                                                    finally {
                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$38, thread);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$29, thread);
                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$37, thread);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                            final SubLObject _values5 = Values.getValuesAsVector();
                                                                            xml_utilities.xml_terpri();
                                                                            xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str85$glfHasType);
                                                                            Values.restoreValuesFromVector(_values5);
                                                                        }
                                                                        finally {
                                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                                                                        }
                                                                    }
                                                                    cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                                                                    type = cdolist_list_var_$43.first();
                                                                }
                                                            }
                                                            finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$36, thread);
                                                            }
                                                        }
                                                        finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$28, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$35, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                            final SubLObject _values6 = Values.getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str84$glfHasTypes);
                                                            Values.restoreValuesFromVector(_values6);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$28, thread);
                                                }
                                            }
                                            finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$25, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$27, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                final SubLObject _values7 = Values.getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str81$glfOwnsNode);
                                                Values.restoreValuesFromVector(_values7);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        node = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$26, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$24, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$25, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                final SubLObject _values8 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str80$glfOwnsNodes);
                                Values.restoreValuesFromVector(_values8);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                            }
                        }
                    }
                    if (graphic_library_format.NIL != glfgrph_has_arcsP(glf_graph)) {
                        try {
                            final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$31 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str86$glfOwnsArcs, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = glfgrph_arcs(glf_graph);
                                    SubLObject arc = (SubLObject)graphic_library_format.NIL;
                                    arc = cdolist_list_var.first();
                                    while (graphic_library_format.NIL != cdolist_list_var) {
                                        try {
                                            final SubLObject _prev_bind_0_$48 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str87$glfOwnsArc, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$49 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                    try {
                                                        final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str79$glfId, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                cycml.cycml_serialize_term(glfarc_id(arc));
                                                            }
                                                            finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$51, thread);
                                                            }
                                                        }
                                                        finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$33, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$50, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                            final SubLObject _values9 = Values.getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str79$glfId);
                                                            Values.restoreValuesFromVector(_values9);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$53 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str84$glfHasTypes, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$54 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                SubLObject cdolist_list_var_$44 = glfarc_types(arc);
                                                                SubLObject type = (SubLObject)graphic_library_format.NIL;
                                                                type = cdolist_list_var_$44.first();
                                                                while (graphic_library_format.NIL != cdolist_list_var_$44) {
                                                                    try {
                                                                        final SubLObject _prev_bind_0_$55 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$35 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                        try {
                                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                            xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str85$glfHasType, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                            final SubLObject _prev_bind_0_$56 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                            try {
                                                                                xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                                try {
                                                                                    final SubLObject _prev_bind_0_$57 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                    final SubLObject _prev_bind_1_$36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                        xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str79$glfId, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                                        final SubLObject _prev_bind_0_$58 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                        try {
                                                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                                            cycml.cycml_serialize_term(type);
                                                                                        }
                                                                                        finally {
                                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$58, thread);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$36, thread);
                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$57, thread);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                                        final SubLObject _values10 = Values.getValuesAsVector();
                                                                                        xml_utilities.xml_terpri();
                                                                                        xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str79$glfId);
                                                                                        Values.restoreValuesFromVector(_values10);
                                                                                    }
                                                                                    finally {
                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$56, thread);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$35, thread);
                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$55, thread);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                            final SubLObject _values11 = Values.getValuesAsVector();
                                                                            xml_utilities.xml_terpri();
                                                                            xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str85$glfHasType);
                                                                            Values.restoreValuesFromVector(_values11);
                                                                        }
                                                                        finally {
                                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                                                        }
                                                                    }
                                                                    cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                                                                    type = cdolist_list_var_$44.first();
                                                                }
                                                            }
                                                            finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$54, thread);
                                                            }
                                                        }
                                                        finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$34, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$53, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                            final SubLObject _values12 = Values.getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str84$glfHasTypes);
                                                            Values.restoreValuesFromVector(_values12);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$62 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$37 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str88$glfFromSet, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$63 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
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
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)graphic_library_format.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); graphic_library_format.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                    from = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (graphic_library_format.NIL != set_contents.do_set_contents_element_validP(state, from)) {
                                                                        try {
                                                                            _prev_bind_0_$64 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            _prev_bind_1_$38 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str89$glfFrom, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                                _prev_bind_0_$65 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                try {
                                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                                    try {
                                                                                        _prev_bind_0_$66 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                        _prev_bind_1_$39 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                        try {
                                                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                            xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str79$glfId, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                                            _prev_bind_0_$67 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                                                cycml.cycml_serialize_term(from);
                                                                                            }
                                                                                            finally {
                                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$67, thread);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$39, thread);
                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$66, thread);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                                            _values13 = Values.getValuesAsVector();
                                                                                            xml_utilities.xml_terpri();
                                                                                            xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str79$glfId);
                                                                                            Values.restoreValuesFromVector(_values13);
                                                                                        }
                                                                                        finally {
                                                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$65, thread);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$38, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$64, thread);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                                _values14 = Values.getValuesAsVector();
                                                                                xml_utilities.xml_terpri();
                                                                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str89$glfFrom);
                                                                                Values.restoreValuesFromVector(_values14);
                                                                            }
                                                                            finally {
                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$63, thread);
                                                            }
                                                        }
                                                        finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$37, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$62, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                            final SubLObject _values15 = Values.getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str88$glfFromSet);
                                                            Values.restoreValuesFromVector(_values15);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$71 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$40 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str90$glfToSet, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$72 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
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
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)graphic_library_format.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); graphic_library_format.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                    to = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (graphic_library_format.NIL != set_contents.do_set_contents_element_validP(state, to)) {
                                                                        try {
                                                                            _prev_bind_0_$73 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            _prev_bind_1_$41 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str91$glfTo, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                                _prev_bind_0_$74 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                try {
                                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                                    try {
                                                                                        _prev_bind_0_$75 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                        _prev_bind_1_$42 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                        try {
                                                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                            xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str79$glfId, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                                            _prev_bind_0_$76 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                                                cycml.cycml_serialize_term(to);
                                                                                            }
                                                                                            finally {
                                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$76, thread);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$42, thread);
                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$75, thread);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                                            _values16 = Values.getValuesAsVector();
                                                                                            xml_utilities.xml_terpri();
                                                                                            xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str79$glfId);
                                                                                            Values.restoreValuesFromVector(_values16);
                                                                                        }
                                                                                        finally {
                                                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$74, thread);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$41, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$73, thread);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            _prev_bind_0_$78 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                                _values17 = Values.getValuesAsVector();
                                                                                xml_utilities.xml_terpri();
                                                                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str91$glfTo);
                                                                                Values.restoreValuesFromVector(_values17);
                                                                            }
                                                                            finally {
                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$78, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$72, thread);
                                                            }
                                                        }
                                                        finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$40, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$71, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$79 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                            final SubLObject _values18 = Values.getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str90$glfToSet);
                                                            Values.restoreValuesFromVector(_values18);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$79, thread);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$49, thread);
                                                }
                                            }
                                            finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$32, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$48, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$80 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                final SubLObject _values19 = Values.getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str87$glfOwnsArc);
                                                Values.restoreValuesFromVector(_values19);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$80, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        arc = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$47, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$31, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$46, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                final SubLObject _values20 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str86$glfOwnsArcs);
                                Values.restoreValuesFromVector(_values20);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                            }
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                final SubLObject _values21 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str78$glfDiagram);
                Values.restoreValuesFromVector(_values21);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return glf_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 8289L)
    public static SubLObject xml_serialize_glf_graph_rendering(final SubLObject glf_graph, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str92$glfRendering, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                final SubLObject _prev_bind_0_$104 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                    if (graphic_library_format.NIL != glfgrph_has_rendering_infoP(glf_graph)) {
                        final SubLObject rendering_info = glfgrph_rendering_info(glf_graph);
                        if (graphic_library_format.NIL != glfgrph_has_nodesP(glf_graph)) {
                            try {
                                final SubLObject _prev_bind_0_$105 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$106 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str93$glfRenderNodes, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$106 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = glfgrph_nodes(glf_graph);
                                        SubLObject node = (SubLObject)graphic_library_format.NIL;
                                        node = cdolist_list_var.first();
                                        while (graphic_library_format.NIL != cdolist_list_var) {
                                            final SubLObject rendering = dictionary.dictionary_lookup(rendering_info, glfnode_id(node), (SubLObject)graphic_library_format.UNPROVIDED);
                                            try {
                                                final SubLObject _prev_bind_0_$107 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$107 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str94$glfRenderNode, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$108 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                        try {
                                                            final SubLObject _prev_bind_0_$109 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$108 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str79$glfId, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$110 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(glfnode_id(node));
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$110, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$108, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$109, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$111 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str79$glfId);
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                                                            }
                                                        }
                                                        xml_serialize_glf_graph_rendering_info(rendering, stream);
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$108, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$107, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$107, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str94$glfRenderNode);
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            node = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$106, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$106, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$105, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str93$glfRenderNodes);
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                                }
                            }
                        }
                        if (graphic_library_format.NIL != glfgrph_has_arcsP(glf_graph)) {
                            try {
                                final SubLObject _prev_bind_0_$114 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$109 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str95$glfRenderArcs, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$115 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = glfgrph_arcs(glf_graph);
                                        SubLObject arc = (SubLObject)graphic_library_format.NIL;
                                        arc = cdolist_list_var.first();
                                        while (graphic_library_format.NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$116 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$110 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str96$glfRenderArc, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                        try {
                                                            final SubLObject _prev_bind_0_$118 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$111 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str79$glfId, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$119 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(glfarc_id(arc));
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$119, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$111, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$118, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$120 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                final SubLObject _values4 = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str79$glfId);
                                                                Values.restoreValuesFromVector(_values4);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$120, thread);
                                                            }
                                                        }
                                                        final SubLObject rendering2 = dictionary.dictionary_lookup(rendering_info, glfarc_id(arc), (SubLObject)graphic_library_format.UNPROVIDED);
                                                        xml_serialize_glf_graph_rendering_info(rendering2, stream);
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$117, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$110, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$116, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$121 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                    final SubLObject _values5 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str96$glfRenderArc);
                                                    Values.restoreValuesFromVector(_values5);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$121, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            arc = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$115, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$109, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$114, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$122 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                    final SubLObject _values6 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str95$glfRenderArcs);
                                    Values.restoreValuesFromVector(_values6);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$122, thread);
                                }
                            }
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$104, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                final SubLObject _values7 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str92$glfRendering);
                Values.restoreValuesFromVector(_values7);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return glf_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 9485L)
    public static SubLObject xml_serialize_glf_graph_rendering_info(final SubLObject rendering, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str97$glfRenderInfo, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                final SubLObject _prev_bind_0_$129 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                    if (graphic_library_format.NIL != glfrndr_label(rendering)) {
                        try {
                            final SubLObject _prev_bind_0_$130 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$131 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str98$glfRenderLabel, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$131 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(glfrndr_label(rendering));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$131, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$131, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$130, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$132 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str98$glfRenderLabel);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$132, thread);
                            }
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$129, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str97$glfRenderInfo);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return rendering;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 9758L)
    public static SubLObject xml_serialize_glf_graph_flow_model(final SubLObject glf_graph, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str99$glfFlowModel, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                final SubLObject _prev_bind_0_$134 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                    if (graphic_library_format.NIL != glfgrph_has_nodesP(glf_graph)) {
                        try {
                            final SubLObject _prev_bind_0_$135 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$136 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str100$glfSemanticForNodes, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$136 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = glfgrph_nodes(glf_graph);
                                    SubLObject node = (SubLObject)graphic_library_format.NIL;
                                    node = cdolist_list_var.first();
                                    while (graphic_library_format.NIL != cdolist_list_var) {
                                        if (graphic_library_format.NIL != glfnode_semantics(node)) {
                                            try {
                                                final SubLObject _prev_bind_0_$137 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$137 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str101$glfSemanticForNode, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$138 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                        try {
                                                            final SubLObject _prev_bind_0_$139 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$138 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str79$glfId, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$140 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(glfnode_id(node));
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$140, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$138, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$139, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$141 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str79$glfId);
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$141, thread);
                                                            }
                                                        }
                                                        try {
                                                            final SubLObject _prev_bind_0_$142 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$139 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str102$glfHasSemantic, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$143 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(glfnode_semantics(node));
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$143, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$139, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$142, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$144 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str102$glfHasSemantic);
                                                                Values.restoreValuesFromVector(_values2);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$144, thread);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$138, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$137, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$137, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$145 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                    final SubLObject _values3 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str101$glfSemanticForNode);
                                                    Values.restoreValuesFromVector(_values3);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$145, thread);
                                                }
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        node = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$136, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$136, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$135, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$146 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str100$glfSemanticForNodes);
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$146, thread);
                            }
                        }
                    }
                    if (graphic_library_format.NIL != glfgrph_has_arcsP(glf_graph)) {
                        try {
                            final SubLObject _prev_bind_0_$147 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$140 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str103$glfSemanticForArcs, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$148 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var = glfgrph_arcs(glf_graph);
                                    SubLObject arc = (SubLObject)graphic_library_format.NIL;
                                    arc = cdolist_list_var.first();
                                    while (graphic_library_format.NIL != cdolist_list_var) {
                                        if (graphic_library_format.NIL != glfarc_semantics(arc)) {
                                            try {
                                                final SubLObject _prev_bind_0_$149 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$141 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str104$glfSemanticForArc, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$150 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                        try {
                                                            final SubLObject _prev_bind_0_$151 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$142 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str79$glfId, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$152 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(glfarc_id(arc));
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$152, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$142, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$151, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$153 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                final SubLObject _values5 = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str79$glfId);
                                                                Values.restoreValuesFromVector(_values5);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$153, thread);
                                                            }
                                                        }
                                                        try {
                                                            final SubLObject _prev_bind_0_$154 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$143 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)graphic_library_format.$str102$glfHasSemantic, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.NIL, (SubLObject)graphic_library_format.$kw72$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$155 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)graphic_library_format.$kw72$UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(glfarc_semantics(arc));
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$155, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$143, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$154, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$156 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                                final SubLObject _values6 = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str102$glfHasSemantic);
                                                                Values.restoreValuesFromVector(_values6);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$156, thread);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$150, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$141, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$149, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$157 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                                    final SubLObject _values7 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str104$glfSemanticForArc);
                                                    Values.restoreValuesFromVector(_values7);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$157, thread);
                                                }
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        arc = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$148, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$140, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$147, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$158 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                                final SubLObject _values8 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str103$glfSemanticForArcs);
                                Values.restoreValuesFromVector(_values8);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$158, thread);
                            }
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$134, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graphic_library_format.T, thread);
                final SubLObject _values9 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)graphic_library_format.$str99$glfFlowModel);
                Values.restoreValuesFromVector(_values9);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return glf_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 10730L)
    public static SubLObject get_graph_defining_mt(final SubLObject graph_id) {
        final SubLObject assertion = kb_indexing.find_gaf_any_mt((SubLObject)ConsesLow.listS(graphic_library_format.$const105$isa, graph_id, (SubLObject)graphic_library_format.$list106));
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 10949L)
    public static SubLObject load_glf_graph_from_kb(final SubLObject graph_id, final SubLObject mt) {
        final SubLObject v_graph = create_glf_graph_from_kb(graph_id, mt);
        load_all_glf_nodes_from_kb(v_graph, mt);
        load_all_glf_arcs_from_kb(v_graph, mt);
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 11160L)
    public static SubLObject map_glf_graph_to_ais(final SubLObject graph_id, final SubLObject mt) {
        return ask_utilities.ask_variable((SubLObject)graphic_library_format.$kw37$AIS, (SubLObject)ConsesLow.listS(graphic_library_format.$const107$correspondingAIS, graph_id, (SubLObject)graphic_library_format.$list108), mt, (SubLObject)graphic_library_format.ZERO_INTEGER, (SubLObject)graphic_library_format.ONE_INTEGER, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 11348L)
    public static SubLObject create_glf_graph_from_kb(final SubLObject graph_id, final SubLObject mt) {
        final SubLObject v_graph = make_glf_graph((SubLObject)graphic_library_format.UNPROVIDED);
        _csetf_glfgrph_id(v_graph, graph_id);
        _csetf_glfgrph_types(v_graph, isa.min_isa(graph_id, mt, (SubLObject)graphic_library_format.UNPROVIDED));
        _csetf_glfgrph_ais(v_graph, map_glf_graph_to_ais(graph_id, mt));
        _csetf_glfgrph_node_types(v_graph, set.new_set(Symbols.symbol_function((SubLObject)graphic_library_format.EQUAL), (SubLObject)graphic_library_format.UNPROVIDED));
        initialize_glfgrph_node_types(v_graph, mt);
        _csetf_glfgrph_arc_types(v_graph, set.new_set(Symbols.symbol_function((SubLObject)graphic_library_format.EQUAL), (SubLObject)graphic_library_format.UNPROVIDED));
        initialize_glfgrph_arc_types(v_graph, mt);
        _csetf_glfgrph_incoming_connector_types(v_graph, set.new_set(Symbols.symbol_function((SubLObject)graphic_library_format.EQUAL), (SubLObject)graphic_library_format.UNPROVIDED));
        _csetf_glfgrph_outgoing_connector_types(v_graph, set.new_set(Symbols.symbol_function((SubLObject)graphic_library_format.EQUAL), (SubLObject)graphic_library_format.UNPROVIDED));
        _csetf_glfgrph_rendering_info(v_graph, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)graphic_library_format.EQUAL), (SubLObject)graphic_library_format.UNPROVIDED));
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 12094L)
    public static SubLObject initialize_glfgrph_node_types(final SubLObject v_graph, final SubLObject mt) {
        SubLObject cdolist_list_var = genls.collection_leaves(graphic_library_format.$const109$GLFNode, mt, (SubLObject)graphic_library_format.UNPROVIDED);
        SubLObject spec = (SubLObject)graphic_library_format.NIL;
        spec = cdolist_list_var.first();
        while (graphic_library_format.NIL != cdolist_list_var) {
            note_glf_graph_node_type(v_graph, spec);
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        }
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 12304L)
    public static SubLObject note_glf_graph_node_type(final SubLObject v_graph, final SubLObject node_type) {
        set.set_add(node_type, glfgrph_node_types(v_graph));
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 12429L)
    public static SubLObject initialize_glfgrph_arc_types(final SubLObject v_graph, final SubLObject mt) {
        SubLObject cdolist_list_var = genls.collection_leaves(graphic_library_format.$const110$GLFArc, mt, (SubLObject)graphic_library_format.UNPROVIDED);
        SubLObject spec = (SubLObject)graphic_library_format.NIL;
        spec = cdolist_list_var.first();
        while (graphic_library_format.NIL != cdolist_list_var) {
            note_glf_graph_arc_type(v_graph, spec);
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        }
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 12636L)
    public static SubLObject note_glf_graph_arc_type(final SubLObject v_graph, final SubLObject arc_type) {
        set.set_add(arc_type, glfgrph_arc_types(v_graph));
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 12756L)
    public static SubLObject load_all_glf_nodes_from_kb(final SubLObject v_graph, final SubLObject mt) {
        final SubLObject ais = glfgrph_ais(v_graph);
        final SubLObject nodes = ask_utilities.ask_variable((SubLObject)graphic_library_format.$kw111$NODE, (SubLObject)ConsesLow.list(graphic_library_format.$const112$nodeInSystem, (SubLObject)graphic_library_format.$kw111$NODE, ais), mt, (SubLObject)graphic_library_format.ZERO_INTEGER, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        final SubLObject source_node = ask_utilities.ask_variable((SubLObject)graphic_library_format.$kw113$SOURCE, (SubLObject)ConsesLow.list(graphic_library_format.$const114$sourceNodeInSystem, (SubLObject)graphic_library_format.$kw113$SOURCE, ais), mt, (SubLObject)graphic_library_format.ZERO_INTEGER, (SubLObject)graphic_library_format.ONE_INTEGER, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED).first();
        SubLObject cdolist_list_var = nodes;
        SubLObject node_id = (SubLObject)graphic_library_format.NIL;
        node_id = cdolist_list_var.first();
        while (graphic_library_format.NIL != cdolist_list_var) {
            final SubLObject node = load_one_glf_node_from_kb(v_graph, node_id, mt);
            if (node_id.eql(source_node)) {
                _csetf_glfgrph_source_node(v_graph, node);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node_id = cdolist_list_var.first();
        }
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 13370L)
    public static SubLObject load_one_glf_node_from_kb(final SubLObject v_graph, final SubLObject node_id, final SubLObject mt) {
        final SubLObject node = create_glf_node_from_kb(v_graph, node_id, mt);
        final SubLObject rendering = create_glf_rendering_for_component_from_kb(v_graph, node_id, mt);
        SubLObject cdolist_list_var = glfnode_types(node);
        SubLObject type = (SubLObject)graphic_library_format.NIL;
        type = cdolist_list_var.first();
        while (graphic_library_format.NIL != cdolist_list_var) {
            note_glf_graph_node_type(v_graph, type);
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        }
        _csetf_glfgrph_nodes(v_graph, (SubLObject)ConsesLow.cons(node, glfgrph_nodes(v_graph)));
        dictionary.dictionary_enter(glfgrph_rendering_info(v_graph), node_id, rendering);
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 13789L)
    public static SubLObject load_all_glf_arcs_from_kb(final SubLObject v_graph, final SubLObject mt) {
        final SubLObject ais = glfgrph_ais(v_graph);
        SubLObject cdolist_list_var;
        final SubLObject arcs = cdolist_list_var = ask_utilities.ask_variable((SubLObject)graphic_library_format.$kw115$ARC, (SubLObject)ConsesLow.list(graphic_library_format.$const116$linkInSystem, (SubLObject)graphic_library_format.$kw115$ARC, ais), mt, (SubLObject)graphic_library_format.ZERO_INTEGER, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        SubLObject arc = (SubLObject)graphic_library_format.NIL;
        arc = cdolist_list_var.first();
        while (graphic_library_format.NIL != cdolist_list_var) {
            load_one_glf_arc_from_kb(v_graph, arc, mt);
            cdolist_list_var = cdolist_list_var.rest();
            arc = cdolist_list_var.first();
        }
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14100L)
    public static SubLObject load_one_glf_arc_from_kb(final SubLObject v_graph, final SubLObject arc_id, final SubLObject mt) {
        final SubLObject arc = create_glf_arc_from_kb(v_graph, arc_id, mt);
        final SubLObject rendering = create_glf_rendering_for_component_from_kb(v_graph, arc_id, mt);
        SubLObject cdolist_list_var = glfarc_types(arc);
        SubLObject type = (SubLObject)graphic_library_format.NIL;
        type = cdolist_list_var.first();
        while (graphic_library_format.NIL != cdolist_list_var) {
            note_glf_graph_arc_type(v_graph, type);
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        }
        _csetf_glfgrph_arcs(v_graph, (SubLObject)ConsesLow.cons(arc, glfgrph_arcs(v_graph)));
        dictionary.dictionary_enter(glfgrph_rendering_info(v_graph), arc_id, rendering);
        return arc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject glf_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        glfnode_print(v_object, stream, (SubLObject)graphic_library_format.ZERO_INTEGER);
        return (SubLObject)graphic_library_format.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject glf_node_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $glf_node_native.class) ? graphic_library_format.T : graphic_library_format.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject glfnode_id(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_node_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject glfnode_types(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_node_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject glfnode_parent(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_node_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject glfnode_semantics(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_node_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject _csetf_glfnode_id(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_node_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject _csetf_glfnode_types(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_node_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject _csetf_glfnode_parent(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_node_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject _csetf_glfnode_semantics(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_node_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject make_glf_node(SubLObject arglist) {
        if (arglist == graphic_library_format.UNPROVIDED) {
            arglist = (SubLObject)graphic_library_format.NIL;
        }
        final SubLObject v_new = (SubLObject)new $glf_node_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)graphic_library_format.NIL, next = arglist; graphic_library_format.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)graphic_library_format.$kw35$ID)) {
                _csetf_glfnode_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw36$TYPES)) {
                _csetf_glfnode_types(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw134$PARENT)) {
                _csetf_glfnode_parent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw135$SEMANTICS)) {
                _csetf_glfnode_semantics(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)graphic_library_format.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject visit_defstruct_glf_node(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw49$BEGIN, (SubLObject)graphic_library_format.$sym136$MAKE_GLF_NODE, (SubLObject)graphic_library_format.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw35$ID, glfnode_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw36$TYPES, glfnode_types(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw134$PARENT, glfnode_parent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw135$SEMANTICS, glfnode_semantics(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw52$END, (SubLObject)graphic_library_format.$sym136$MAKE_GLF_NODE, (SubLObject)graphic_library_format.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14506L)
    public static SubLObject visit_defstruct_object_glf_node_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_glf_node(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 14821L)
    public static SubLObject glfnode_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        string_utilities.indent(stream, depth);
        streams_high.write_string((SubLObject)graphic_library_format.$str138$_GLF_Node_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        print_high.prin1(glfnode_id(v_object), stream);
        streams_high.write_string((SubLObject)graphic_library_format.$str55$_of_types_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        print_high.prin1(glfnode_types(v_object), stream);
        streams_high.terpri(stream);
        string_utilities.indent(stream, depth);
        streams_high.write_string((SubLObject)graphic_library_format.$str139$_of_graph_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        print_high.prin1(glfgrph_id(glfnode_parent(v_object)), stream);
        streams_high.terpri(stream);
        string_utilities.indent(stream, depth);
        if (graphic_library_format.NIL != glfnode_semantics(v_object)) {
            streams_high.write_string((SubLObject)graphic_library_format.$str140$_with_semantics_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
            print_high.prin1(glfnode_semantics(v_object), stream);
        }
        else {
            streams_high.write_string((SubLObject)graphic_library_format.$str141$_without_semantics_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        }
        streams_high.write_string((SubLObject)graphic_library_format.$str70$__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15474L)
    public static SubLObject create_glf_node_from_kb(final SubLObject glf_graph, final SubLObject node_id, final SubLObject mt) {
        final SubLObject node = make_glf_node((SubLObject)graphic_library_format.UNPROVIDED);
        _csetf_glfnode_id(node, node_id);
        _csetf_glfnode_parent(node, glf_graph);
        _csetf_glfnode_types(node, isa.min_isa(node_id, mt, (SubLObject)graphic_library_format.UNPROVIDED));
        _csetf_glfnode_semantics(node, ask_utilities.ask_variable((SubLObject)graphic_library_format.$kw135$SEMANTICS, (SubLObject)ConsesLow.listS(graphic_library_format.$const142$glfNodeSemantics_Underspecified, node_id, (SubLObject)graphic_library_format.$list143), mt, (SubLObject)graphic_library_format.ZERO_INTEGER, (SubLObject)graphic_library_format.ONE_INTEGER, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED).first());
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject glf_arc_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        glfarc_print(v_object, stream, (SubLObject)graphic_library_format.ZERO_INTEGER);
        return (SubLObject)graphic_library_format.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject glf_arc_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $glf_arc_native.class) ? graphic_library_format.T : graphic_library_format.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject glfarc_id(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_arc_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject glfarc_types(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_arc_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject glfarc_parent(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_arc_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject glfarc_from(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_arc_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject glfarc_to(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_arc_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject glfarc_semantics(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_arc_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject _csetf_glfarc_id(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_arc_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject _csetf_glfarc_types(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_arc_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject _csetf_glfarc_parent(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_arc_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject _csetf_glfarc_from(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_arc_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject _csetf_glfarc_to(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_arc_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject _csetf_glfarc_semantics(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_arc_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject make_glf_arc(SubLObject arglist) {
        if (arglist == graphic_library_format.UNPROVIDED) {
            arglist = (SubLObject)graphic_library_format.NIL;
        }
        final SubLObject v_new = (SubLObject)new $glf_arc_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)graphic_library_format.NIL, next = arglist; graphic_library_format.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)graphic_library_format.$kw35$ID)) {
                _csetf_glfarc_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw36$TYPES)) {
                _csetf_glfarc_types(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw134$PARENT)) {
                _csetf_glfarc_parent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw165$FROM)) {
                _csetf_glfarc_from(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw166$TO)) {
                _csetf_glfarc_to(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphic_library_format.$kw135$SEMANTICS)) {
                _csetf_glfarc_semantics(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)graphic_library_format.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject visit_defstruct_glf_arc(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw49$BEGIN, (SubLObject)graphic_library_format.$sym167$MAKE_GLF_ARC, (SubLObject)graphic_library_format.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw35$ID, glfarc_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw36$TYPES, glfarc_types(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw134$PARENT, glfarc_parent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw165$FROM, glfarc_from(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw166$TO, glfarc_to(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw135$SEMANTICS, glfarc_semantics(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw52$END, (SubLObject)graphic_library_format.$sym167$MAKE_GLF_ARC, (SubLObject)graphic_library_format.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 15939L)
    public static SubLObject visit_defstruct_object_glf_arc_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_glf_arc(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 16281L)
    public static SubLObject glfarc_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        string_utilities.indent(stream, depth);
        streams_high.write_string((SubLObject)graphic_library_format.$str169$_GLF_Arc_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        print_high.prin1(glfarc_id(v_object), stream);
        streams_high.write_string((SubLObject)graphic_library_format.$str55$_of_types_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        print_high.prin1(glfarc_types(v_object), stream);
        streams_high.terpri(stream);
        string_utilities.indent(stream, depth);
        streams_high.write_string((SubLObject)graphic_library_format.$str139$_of_graph_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        print_high.prin1(glfgrph_id(glfarc_parent(v_object)), stream);
        if (set.set_size(glfarc_from(v_object)).isPositive()) {
            streams_high.terpri(stream);
            string_utilities.indent(stream, depth);
            streams_high.write_string((SubLObject)graphic_library_format.$str170$_from__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
            print_high.prin1(set.set_element_list(glfarc_from(v_object)), stream);
        }
        if (set.set_size(glfarc_to(v_object)).isPositive()) {
            streams_high.terpri(stream);
            string_utilities.indent(stream, depth);
            streams_high.write_string((SubLObject)graphic_library_format.$str171$_to____, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
            print_high.prin1(set.set_element_list(glfarc_to(v_object)), stream);
        }
        if (graphic_library_format.NIL != glfarc_semantics(v_object)) {
            streams_high.terpri(stream);
            string_utilities.indent(stream, depth);
            streams_high.write_string((SubLObject)graphic_library_format.$str172$_meaning__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
            print_high.prin1(glfarc_semantics(v_object), stream);
        }
        streams_high.write_string((SubLObject)graphic_library_format.$str70$__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 17261L)
    public static SubLObject create_glf_arc_from_kb(final SubLObject glf_graph, final SubLObject arc_id, final SubLObject mt) {
        final SubLObject arc = make_glf_arc((SubLObject)graphic_library_format.UNPROVIDED);
        final SubLObject graph_id = glfgrph_id(glf_graph);
        final SubLObject ais = glfgrph_ais(glf_graph);
        _csetf_glfarc_id(arc, arc_id);
        _csetf_glfarc_parent(arc, glf_graph);
        _csetf_glfarc_types(arc, isa.min_isa(arc_id, mt, (SubLObject)graphic_library_format.UNPROVIDED));
        _csetf_glfarc_semantics(arc, ask_utilities.ask_variable((SubLObject)graphic_library_format.$kw135$SEMANTICS, (SubLObject)ConsesLow.list(graphic_library_format.$const173$variableMappingTableForGLFArcInDi, (SubLObject)graphic_library_format.$kw135$SEMANTICS, arc_id, (SubLObject)ConsesLow.list(graphic_library_format.$const174$AISForFn, graph_id)), mt, (SubLObject)graphic_library_format.ZERO_INTEGER, (SubLObject)graphic_library_format.ONE_INTEGER, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED).first());
        final SubLObject from = set.new_set(Symbols.symbol_function((SubLObject)graphic_library_format.EQUAL), (SubLObject)graphic_library_format.UNPROVIDED);
        final SubLObject to = set.new_set(Symbols.symbol_function((SubLObject)graphic_library_format.EQUAL), (SubLObject)graphic_library_format.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject linkage_bindings = cdolist_list_var = ask_utilities.ask_template((SubLObject)graphic_library_format.$list175, (SubLObject)ConsesLow.list(graphic_library_format.$const176$linkFromToInSystem, arc_id, (SubLObject)graphic_library_format.$sym177$_FROM, (SubLObject)graphic_library_format.$sym178$_TO, ais), mt, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        SubLObject linkage_binding = (SubLObject)graphic_library_format.NIL;
        linkage_binding = cdolist_list_var.first();
        while (graphic_library_format.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = linkage_binding;
            SubLObject source = (SubLObject)graphic_library_format.NIL;
            SubLObject target = (SubLObject)graphic_library_format.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graphic_library_format.$list179);
            source = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graphic_library_format.$list179);
            target = current.first();
            current = current.rest();
            if (graphic_library_format.NIL == current) {
                set.set_add(source, from);
                set.set_add(target, to);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graphic_library_format.$list179);
            }
            cdolist_list_var = cdolist_list_var.rest();
            linkage_binding = cdolist_list_var.first();
        }
        _csetf_glfarc_to(arc, to);
        _csetf_glfarc_from(arc, from);
        return arc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 18298L)
    public static SubLObject glf_rendering_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        glfrndr_print(v_object, stream, (SubLObject)graphic_library_format.ZERO_INTEGER);
        return (SubLObject)graphic_library_format.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 18298L)
    public static SubLObject glf_rendering_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $glf_rendering_native.class) ? graphic_library_format.T : graphic_library_format.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 18298L)
    public static SubLObject glfrndr_label(final SubLObject v_object) {
        assert graphic_library_format.NIL != glf_rendering_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 18298L)
    public static SubLObject _csetf_glfrndr_label(final SubLObject v_object, final SubLObject value) {
        assert graphic_library_format.NIL != glf_rendering_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 18298L)
    public static SubLObject make_glf_rendering(SubLObject arglist) {
        if (arglist == graphic_library_format.UNPROVIDED) {
            arglist = (SubLObject)graphic_library_format.NIL;
        }
        final SubLObject v_new = (SubLObject)new $glf_rendering_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)graphic_library_format.NIL, next = arglist; graphic_library_format.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)graphic_library_format.$kw191$LABEL)) {
                _csetf_glfrndr_label(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)graphic_library_format.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 18298L)
    public static SubLObject visit_defstruct_glf_rendering(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw49$BEGIN, (SubLObject)graphic_library_format.$sym192$MAKE_GLF_RENDERING, (SubLObject)graphic_library_format.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw51$SLOT, (SubLObject)graphic_library_format.$kw191$LABEL, glfrndr_label(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphic_library_format.$kw52$END, (SubLObject)graphic_library_format.$sym192$MAKE_GLF_RENDERING, (SubLObject)graphic_library_format.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 18298L)
    public static SubLObject visit_defstruct_object_glf_rendering_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_glf_rendering(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 18512L)
    public static SubLObject glfrndr_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        string_utilities.indent(stream, depth);
        streams_high.write_string((SubLObject)graphic_library_format.$str194$__GLF_Rendering_, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        if (graphic_library_format.NIL != glfrndr_label(v_object)) {
            streams_high.terpri(stream);
            string_utilities.indent(stream, depth);
            streams_high.write_string((SubLObject)graphic_library_format.$str195$_label__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
            streams_high.write_string(glfrndr_label(v_object), stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        }
        streams_high.write_string((SubLObject)graphic_library_format.$str70$__, stream, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphic-library-format.lisp", position = 18843L)
    public static SubLObject create_glf_rendering_for_component_from_kb(final SubLObject glf_graph, final SubLObject component_id, final SubLObject mt) {
        final SubLObject rendering = make_glf_rendering((SubLObject)graphic_library_format.UNPROVIDED);
        final SubLObject ais = glfgrph_ais(glf_graph);
        _csetf_glfrndr_label(rendering, ask_utilities.ask_variable((SubLObject)graphic_library_format.$kw191$LABEL, (SubLObject)ConsesLow.list(graphic_library_format.$const196$glfComponentLabel, component_id, (SubLObject)graphic_library_format.$kw191$LABEL, ais), mt, (SubLObject)graphic_library_format.ZERO_INTEGER, (SubLObject)graphic_library_format.ONE_INTEGER, (SubLObject)graphic_library_format.UNPROVIDED, (SubLObject)graphic_library_format.UNPROVIDED).first());
        return rendering;
    }
    
    public static SubLObject declare_graphic_library_format_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glf_graph_print_function_trampoline", "GLF-GRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glf_graph_p", "GLF-GRAPH-P", 1, 0, false);
        new $glf_graph_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_id", "GLFGRPH-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_types", "GLFGRPH-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_ais", "GLFGRPH-AIS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_nodes", "GLFGRPH-NODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_node_types", "GLFGRPH-NODE-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_source_node", "GLFGRPH-SOURCE-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_arcs", "GLFGRPH-ARCS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_arc_types", "GLFGRPH-ARC-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_incoming_connectors", "GLFGRPH-INCOMING-CONNECTORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_outgoing_connectors", "GLFGRPH-OUTGOING-CONNECTORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_incoming_connector_types", "GLFGRPH-INCOMING-CONNECTOR-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_outgoing_connector_types", "GLFGRPH-OUTGOING-CONNECTOR-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_rendering_info", "GLFGRPH-RENDERING-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_id", "_CSETF-GLFGRPH-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_types", "_CSETF-GLFGRPH-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_ais", "_CSETF-GLFGRPH-AIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_nodes", "_CSETF-GLFGRPH-NODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_node_types", "_CSETF-GLFGRPH-NODE-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_source_node", "_CSETF-GLFGRPH-SOURCE-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_arcs", "_CSETF-GLFGRPH-ARCS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_arc_types", "_CSETF-GLFGRPH-ARC-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_incoming_connectors", "_CSETF-GLFGRPH-INCOMING-CONNECTORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_outgoing_connectors", "_CSETF-GLFGRPH-OUTGOING-CONNECTORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_incoming_connector_types", "_CSETF-GLFGRPH-INCOMING-CONNECTOR-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_outgoing_connector_types", "_CSETF-GLFGRPH-OUTGOING-CONNECTOR-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfgrph_rendering_info", "_CSETF-GLFGRPH-RENDERING-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "make_glf_graph", "MAKE-GLF-GRAPH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "visit_defstruct_glf_graph", "VISIT-DEFSTRUCT-GLF-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "visit_defstruct_object_glf_graph_method", "VISIT-DEFSTRUCT-OBJECT-GLF-GRAPH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_has_node_typesP", "GLFGRPH-HAS-NODE-TYPES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_has_arc_typesP", "GLFGRPH-HAS-ARC-TYPES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_has_incoming_connector_typesP", "GLFGRPH-HAS-INCOMING-CONNECTOR-TYPES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_has_outgoing_connector_typesP", "GLFGRPH-HAS-OUTGOING-CONNECTOR-TYPES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_has_rendering_infoP", "GLFGRPH-HAS-RENDERING-INFO?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_has_nodesP", "GLFGRPH-HAS-NODES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_has_arcsP", "GLFGRPH-HAS-ARCS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfgrph_print", "GLFGRPH-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "xml_serialize_glf_graph", "XML-SERIALIZE-GLF-GRAPH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "xml_serialize_glf_graph_core", "XML-SERIALIZE-GLF-GRAPH-CORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "xml_serialize_glf_graph_diagram", "XML-SERIALIZE-GLF-GRAPH-DIAGRAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "xml_serialize_glf_graph_rendering", "XML-SERIALIZE-GLF-GRAPH-RENDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "xml_serialize_glf_graph_rendering_info", "XML-SERIALIZE-GLF-GRAPH-RENDERING-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "xml_serialize_glf_graph_flow_model", "XML-SERIALIZE-GLF-GRAPH-FLOW-MODEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "get_graph_defining_mt", "GET-GRAPH-DEFINING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "load_glf_graph_from_kb", "LOAD-GLF-GRAPH-FROM-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "map_glf_graph_to_ais", "MAP-GLF-GRAPH-TO-AIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "create_glf_graph_from_kb", "CREATE-GLF-GRAPH-FROM-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "initialize_glfgrph_node_types", "INITIALIZE-GLFGRPH-NODE-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "note_glf_graph_node_type", "NOTE-GLF-GRAPH-NODE-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "initialize_glfgrph_arc_types", "INITIALIZE-GLFGRPH-ARC-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "note_glf_graph_arc_type", "NOTE-GLF-GRAPH-ARC-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "load_all_glf_nodes_from_kb", "LOAD-ALL-GLF-NODES-FROM-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "load_one_glf_node_from_kb", "LOAD-ONE-GLF-NODE-FROM-KB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "load_all_glf_arcs_from_kb", "LOAD-ALL-GLF-ARCS-FROM-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "load_one_glf_arc_from_kb", "LOAD-ONE-GLF-ARC-FROM-KB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glf_node_print_function_trampoline", "GLF-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glf_node_p", "GLF-NODE-P", 1, 0, false);
        new $glf_node_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfnode_id", "GLFNODE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfnode_types", "GLFNODE-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfnode_parent", "GLFNODE-PARENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfnode_semantics", "GLFNODE-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfnode_id", "_CSETF-GLFNODE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfnode_types", "_CSETF-GLFNODE-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfnode_parent", "_CSETF-GLFNODE-PARENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfnode_semantics", "_CSETF-GLFNODE-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "make_glf_node", "MAKE-GLF-NODE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "visit_defstruct_glf_node", "VISIT-DEFSTRUCT-GLF-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "visit_defstruct_object_glf_node_method", "VISIT-DEFSTRUCT-OBJECT-GLF-NODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfnode_print", "GLFNODE-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "create_glf_node_from_kb", "CREATE-GLF-NODE-FROM-KB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glf_arc_print_function_trampoline", "GLF-ARC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glf_arc_p", "GLF-ARC-P", 1, 0, false);
        new $glf_arc_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfarc_id", "GLFARC-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfarc_types", "GLFARC-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfarc_parent", "GLFARC-PARENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfarc_from", "GLFARC-FROM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfarc_to", "GLFARC-TO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfarc_semantics", "GLFARC-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfarc_id", "_CSETF-GLFARC-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfarc_types", "_CSETF-GLFARC-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfarc_parent", "_CSETF-GLFARC-PARENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfarc_from", "_CSETF-GLFARC-FROM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfarc_to", "_CSETF-GLFARC-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfarc_semantics", "_CSETF-GLFARC-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "make_glf_arc", "MAKE-GLF-ARC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "visit_defstruct_glf_arc", "VISIT-DEFSTRUCT-GLF-ARC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "visit_defstruct_object_glf_arc_method", "VISIT-DEFSTRUCT-OBJECT-GLF-ARC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfarc_print", "GLFARC-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "create_glf_arc_from_kb", "CREATE-GLF-ARC-FROM-KB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glf_rendering_print_function_trampoline", "GLF-RENDERING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glf_rendering_p", "GLF-RENDERING-P", 1, 0, false);
        new $glf_rendering_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfrndr_label", "GLFRNDR-LABEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "_csetf_glfrndr_label", "_CSETF-GLFRNDR-LABEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "make_glf_rendering", "MAKE-GLF-RENDERING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "visit_defstruct_glf_rendering", "VISIT-DEFSTRUCT-GLF-RENDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "visit_defstruct_object_glf_rendering_method", "VISIT-DEFSTRUCT-OBJECT-GLF-RENDERING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "glfrndr_print", "GLFRNDR-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphic_library_format", "create_glf_rendering_for_component_from_kb", "CREATE-GLF-RENDERING-FOR-COMPONENT-FROM-KB", 3, 0, false);
        return (SubLObject)graphic_library_format.NIL;
    }
    
    public static SubLObject init_graphic_library_format_file() {
        graphic_library_format.$dtp_glf_graph$ = SubLFiles.defconstant("*DTP-GLF-GRAPH*", (SubLObject)graphic_library_format.$sym0$GLF_GRAPH);
        graphic_library_format.$dtp_glf_node$ = SubLFiles.defconstant("*DTP-GLF-NODE*", (SubLObject)graphic_library_format.$sym117$GLF_NODE);
        graphic_library_format.$dtp_glf_arc$ = SubLFiles.defconstant("*DTP-GLF-ARC*", (SubLObject)graphic_library_format.$sym144$GLF_ARC);
        graphic_library_format.$dtp_glf_rendering$ = SubLFiles.defconstant("*DTP-GLF-RENDERING*", (SubLObject)graphic_library_format.$sym180$GLF_RENDERING);
        return (SubLObject)graphic_library_format.NIL;
    }
    
    public static SubLObject setup_graphic_library_format_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), graphic_library_format.$dtp_glf_graph$.getGlobalValue(), Symbols.symbol_function((SubLObject)graphic_library_format.$sym7$GLF_GRAPH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)graphic_library_format.$list8);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym9$GLFGRPH_ID, (SubLObject)graphic_library_format.$sym10$_CSETF_GLFGRPH_ID);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym11$GLFGRPH_TYPES, (SubLObject)graphic_library_format.$sym12$_CSETF_GLFGRPH_TYPES);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym13$GLFGRPH_AIS, (SubLObject)graphic_library_format.$sym14$_CSETF_GLFGRPH_AIS);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym15$GLFGRPH_NODES, (SubLObject)graphic_library_format.$sym16$_CSETF_GLFGRPH_NODES);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym17$GLFGRPH_NODE_TYPES, (SubLObject)graphic_library_format.$sym18$_CSETF_GLFGRPH_NODE_TYPES);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym19$GLFGRPH_SOURCE_NODE, (SubLObject)graphic_library_format.$sym20$_CSETF_GLFGRPH_SOURCE_NODE);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym21$GLFGRPH_ARCS, (SubLObject)graphic_library_format.$sym22$_CSETF_GLFGRPH_ARCS);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym23$GLFGRPH_ARC_TYPES, (SubLObject)graphic_library_format.$sym24$_CSETF_GLFGRPH_ARC_TYPES);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym25$GLFGRPH_INCOMING_CONNECTORS, (SubLObject)graphic_library_format.$sym26$_CSETF_GLFGRPH_INCOMING_CONNECTORS);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym27$GLFGRPH_OUTGOING_CONNECTORS, (SubLObject)graphic_library_format.$sym28$_CSETF_GLFGRPH_OUTGOING_CONNECTORS);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym29$GLFGRPH_INCOMING_CONNECTOR_TYPES, (SubLObject)graphic_library_format.$sym30$_CSETF_GLFGRPH_INCOMING_CONNECTOR_TYPES);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym31$GLFGRPH_OUTGOING_CONNECTOR_TYPES, (SubLObject)graphic_library_format.$sym32$_CSETF_GLFGRPH_OUTGOING_CONNECTOR_TYPES);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym33$GLFGRPH_RENDERING_INFO, (SubLObject)graphic_library_format.$sym34$_CSETF_GLFGRPH_RENDERING_INFO);
        Equality.identity((SubLObject)graphic_library_format.$sym0$GLF_GRAPH);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), graphic_library_format.$dtp_glf_graph$.getGlobalValue(), Symbols.symbol_function((SubLObject)graphic_library_format.$sym53$VISIT_DEFSTRUCT_OBJECT_GLF_GRAPH_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), graphic_library_format.$dtp_glf_node$.getGlobalValue(), Symbols.symbol_function((SubLObject)graphic_library_format.$sym124$GLF_NODE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)graphic_library_format.$list125);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym126$GLFNODE_ID, (SubLObject)graphic_library_format.$sym127$_CSETF_GLFNODE_ID);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym128$GLFNODE_TYPES, (SubLObject)graphic_library_format.$sym129$_CSETF_GLFNODE_TYPES);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym130$GLFNODE_PARENT, (SubLObject)graphic_library_format.$sym131$_CSETF_GLFNODE_PARENT);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym132$GLFNODE_SEMANTICS, (SubLObject)graphic_library_format.$sym133$_CSETF_GLFNODE_SEMANTICS);
        Equality.identity((SubLObject)graphic_library_format.$sym117$GLF_NODE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), graphic_library_format.$dtp_glf_node$.getGlobalValue(), Symbols.symbol_function((SubLObject)graphic_library_format.$sym137$VISIT_DEFSTRUCT_OBJECT_GLF_NODE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), graphic_library_format.$dtp_glf_arc$.getGlobalValue(), Symbols.symbol_function((SubLObject)graphic_library_format.$sym151$GLF_ARC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)graphic_library_format.$list152);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym153$GLFARC_ID, (SubLObject)graphic_library_format.$sym154$_CSETF_GLFARC_ID);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym155$GLFARC_TYPES, (SubLObject)graphic_library_format.$sym156$_CSETF_GLFARC_TYPES);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym157$GLFARC_PARENT, (SubLObject)graphic_library_format.$sym158$_CSETF_GLFARC_PARENT);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym159$GLFARC_FROM, (SubLObject)graphic_library_format.$sym160$_CSETF_GLFARC_FROM);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym161$GLFARC_TO, (SubLObject)graphic_library_format.$sym162$_CSETF_GLFARC_TO);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym163$GLFARC_SEMANTICS, (SubLObject)graphic_library_format.$sym164$_CSETF_GLFARC_SEMANTICS);
        Equality.identity((SubLObject)graphic_library_format.$sym144$GLF_ARC);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), graphic_library_format.$dtp_glf_arc$.getGlobalValue(), Symbols.symbol_function((SubLObject)graphic_library_format.$sym168$VISIT_DEFSTRUCT_OBJECT_GLF_ARC_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), graphic_library_format.$dtp_glf_rendering$.getGlobalValue(), Symbols.symbol_function((SubLObject)graphic_library_format.$sym187$GLF_RENDERING_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)graphic_library_format.$list188);
        Structures.def_csetf((SubLObject)graphic_library_format.$sym189$GLFRNDR_LABEL, (SubLObject)graphic_library_format.$sym190$_CSETF_GLFRNDR_LABEL);
        Equality.identity((SubLObject)graphic_library_format.$sym180$GLF_RENDERING);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), graphic_library_format.$dtp_glf_rendering$.getGlobalValue(), Symbols.symbol_function((SubLObject)graphic_library_format.$sym193$VISIT_DEFSTRUCT_OBJECT_GLF_RENDERING_METHOD));
        return (SubLObject)graphic_library_format.NIL;
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
    
    static {
        me = (SubLFile)new graphic_library_format();
        graphic_library_format.$dtp_glf_graph$ = null;
        graphic_library_format.$dtp_glf_node$ = null;
        graphic_library_format.$dtp_glf_arc$ = null;
        graphic_library_format.$dtp_glf_rendering$ = null;
        $sym0$GLF_GRAPH = SubLObjectFactory.makeSymbol("GLF-GRAPH");
        $sym1$GLF_GRAPH_P = SubLObjectFactory.makeSymbol("GLF-GRAPH-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("TYPES"), SubLObjectFactory.makeSymbol("AIS"), SubLObjectFactory.makeSymbol("NODES"), SubLObjectFactory.makeSymbol("NODE-TYPES"), SubLObjectFactory.makeSymbol("SOURCE-NODE"), SubLObjectFactory.makeSymbol("ARCS"), SubLObjectFactory.makeSymbol("ARC-TYPES"), SubLObjectFactory.makeSymbol("INCOMING-CONNECTORS"), SubLObjectFactory.makeSymbol("OUTGOING-CONNECTORS"), SubLObjectFactory.makeSymbol("INCOMING-CONNECTOR-TYPES"), SubLObjectFactory.makeSymbol("OUTGOING-CONNECTOR-TYPES"), SubLObjectFactory.makeSymbol("RENDERING-INFO") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("TYPES"), SubLObjectFactory.makeKeyword("AIS"), SubLObjectFactory.makeKeyword("NODES"), SubLObjectFactory.makeKeyword("NODE-TYPES"), SubLObjectFactory.makeKeyword("SOURCE-NODE"), SubLObjectFactory.makeKeyword("ARCS"), SubLObjectFactory.makeKeyword("ARC-TYPES"), SubLObjectFactory.makeKeyword("INCOMING-CONNECTORS"), SubLObjectFactory.makeKeyword("OUTGOING-CONNECTORS"), SubLObjectFactory.makeKeyword("INCOMING-CONNECTOR-TYPES"), SubLObjectFactory.makeKeyword("OUTGOING-CONNECTOR-TYPES"), SubLObjectFactory.makeKeyword("RENDERING-INFO") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("GLFGRPH-ID"), SubLObjectFactory.makeSymbol("GLFGRPH-TYPES"), SubLObjectFactory.makeSymbol("GLFGRPH-AIS"), SubLObjectFactory.makeSymbol("GLFGRPH-NODES"), SubLObjectFactory.makeSymbol("GLFGRPH-NODE-TYPES"), SubLObjectFactory.makeSymbol("GLFGRPH-SOURCE-NODE"), SubLObjectFactory.makeSymbol("GLFGRPH-ARCS"), SubLObjectFactory.makeSymbol("GLFGRPH-ARC-TYPES"), SubLObjectFactory.makeSymbol("GLFGRPH-INCOMING-CONNECTORS"), SubLObjectFactory.makeSymbol("GLFGRPH-OUTGOING-CONNECTORS"), SubLObjectFactory.makeSymbol("GLFGRPH-INCOMING-CONNECTOR-TYPES"), SubLObjectFactory.makeSymbol("GLFGRPH-OUTGOING-CONNECTOR-TYPES"), SubLObjectFactory.makeSymbol("GLFGRPH-RENDERING-INFO") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-ID"), SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-TYPES"), SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-AIS"), SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-NODES"), SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-NODE-TYPES"), SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-SOURCE-NODE"), SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-ARCS"), SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-ARC-TYPES"), SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTORS"), SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTORS"), SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTOR-TYPES"), SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTOR-TYPES"), SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-RENDERING-INFO") });
        $sym6$GLFGRPH_PRINT = SubLObjectFactory.makeSymbol("GLFGRPH-PRINT");
        $sym7$GLF_GRAPH_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GLF-GRAPH-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GLF-GRAPH-P"));
        $sym9$GLFGRPH_ID = SubLObjectFactory.makeSymbol("GLFGRPH-ID");
        $sym10$_CSETF_GLFGRPH_ID = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-ID");
        $sym11$GLFGRPH_TYPES = SubLObjectFactory.makeSymbol("GLFGRPH-TYPES");
        $sym12$_CSETF_GLFGRPH_TYPES = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-TYPES");
        $sym13$GLFGRPH_AIS = SubLObjectFactory.makeSymbol("GLFGRPH-AIS");
        $sym14$_CSETF_GLFGRPH_AIS = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-AIS");
        $sym15$GLFGRPH_NODES = SubLObjectFactory.makeSymbol("GLFGRPH-NODES");
        $sym16$_CSETF_GLFGRPH_NODES = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-NODES");
        $sym17$GLFGRPH_NODE_TYPES = SubLObjectFactory.makeSymbol("GLFGRPH-NODE-TYPES");
        $sym18$_CSETF_GLFGRPH_NODE_TYPES = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-NODE-TYPES");
        $sym19$GLFGRPH_SOURCE_NODE = SubLObjectFactory.makeSymbol("GLFGRPH-SOURCE-NODE");
        $sym20$_CSETF_GLFGRPH_SOURCE_NODE = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-SOURCE-NODE");
        $sym21$GLFGRPH_ARCS = SubLObjectFactory.makeSymbol("GLFGRPH-ARCS");
        $sym22$_CSETF_GLFGRPH_ARCS = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-ARCS");
        $sym23$GLFGRPH_ARC_TYPES = SubLObjectFactory.makeSymbol("GLFGRPH-ARC-TYPES");
        $sym24$_CSETF_GLFGRPH_ARC_TYPES = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-ARC-TYPES");
        $sym25$GLFGRPH_INCOMING_CONNECTORS = SubLObjectFactory.makeSymbol("GLFGRPH-INCOMING-CONNECTORS");
        $sym26$_CSETF_GLFGRPH_INCOMING_CONNECTORS = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTORS");
        $sym27$GLFGRPH_OUTGOING_CONNECTORS = SubLObjectFactory.makeSymbol("GLFGRPH-OUTGOING-CONNECTORS");
        $sym28$_CSETF_GLFGRPH_OUTGOING_CONNECTORS = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTORS");
        $sym29$GLFGRPH_INCOMING_CONNECTOR_TYPES = SubLObjectFactory.makeSymbol("GLFGRPH-INCOMING-CONNECTOR-TYPES");
        $sym30$_CSETF_GLFGRPH_INCOMING_CONNECTOR_TYPES = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTOR-TYPES");
        $sym31$GLFGRPH_OUTGOING_CONNECTOR_TYPES = SubLObjectFactory.makeSymbol("GLFGRPH-OUTGOING-CONNECTOR-TYPES");
        $sym32$_CSETF_GLFGRPH_OUTGOING_CONNECTOR_TYPES = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTOR-TYPES");
        $sym33$GLFGRPH_RENDERING_INFO = SubLObjectFactory.makeSymbol("GLFGRPH-RENDERING-INFO");
        $sym34$_CSETF_GLFGRPH_RENDERING_INFO = SubLObjectFactory.makeSymbol("_CSETF-GLFGRPH-RENDERING-INFO");
        $kw35$ID = SubLObjectFactory.makeKeyword("ID");
        $kw36$TYPES = SubLObjectFactory.makeKeyword("TYPES");
        $kw37$AIS = SubLObjectFactory.makeKeyword("AIS");
        $kw38$NODES = SubLObjectFactory.makeKeyword("NODES");
        $kw39$NODE_TYPES = SubLObjectFactory.makeKeyword("NODE-TYPES");
        $kw40$SOURCE_NODE = SubLObjectFactory.makeKeyword("SOURCE-NODE");
        $kw41$ARCS = SubLObjectFactory.makeKeyword("ARCS");
        $kw42$ARC_TYPES = SubLObjectFactory.makeKeyword("ARC-TYPES");
        $kw43$INCOMING_CONNECTORS = SubLObjectFactory.makeKeyword("INCOMING-CONNECTORS");
        $kw44$OUTGOING_CONNECTORS = SubLObjectFactory.makeKeyword("OUTGOING-CONNECTORS");
        $kw45$INCOMING_CONNECTOR_TYPES = SubLObjectFactory.makeKeyword("INCOMING-CONNECTOR-TYPES");
        $kw46$OUTGOING_CONNECTOR_TYPES = SubLObjectFactory.makeKeyword("OUTGOING-CONNECTOR-TYPES");
        $kw47$RENDERING_INFO = SubLObjectFactory.makeKeyword("RENDERING-INFO");
        $str48$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw49$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym50$MAKE_GLF_GRAPH = SubLObjectFactory.makeSymbol("MAKE-GLF-GRAPH");
        $kw51$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw52$END = SubLObjectFactory.makeKeyword("END");
        $sym53$VISIT_DEFSTRUCT_OBJECT_GLF_GRAPH_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GLF-GRAPH-METHOD");
        $str54$_GLF_Graph_ = SubLObjectFactory.makeString("<GLF-Graph ");
        $str55$_of_types_ = SubLObjectFactory.makeString(" of types ");
        $str56$_corresponding_AIS__ = SubLObjectFactory.makeString(" corresponding AIS: ");
        $str57$_Types__ = SubLObjectFactory.makeString(" Types: ");
        $str58$__Node_Types__ = SubLObjectFactory.makeString("  Node-Types: ");
        $str59$__Arc_Types__ = SubLObjectFactory.makeString("  Arc-Types: ");
        $str60$__In_Connectors__ = SubLObjectFactory.makeString("  In-Connectors: ");
        $str61$__Out_Connectors__ = SubLObjectFactory.makeString("  Out-Connectors: ");
        $str62$_no_information_available_ = SubLObjectFactory.makeString(" no information available ");
        $str63$_Content__ = SubLObjectFactory.makeString(" Content: ");
        $str64$__Nodes__first_is_source___ = SubLObjectFactory.makeString("  Nodes (first is source): ");
        $str65$__Arcs__ = SubLObjectFactory.makeString("  Arcs: ");
        $str66$_currently_empty_ = SubLObjectFactory.makeString(" currently empty ");
        $str67$_Rendering_Information_ = SubLObjectFactory.makeString(" Rendering Information ");
        $str68$__ = SubLObjectFactory.makeString("  ");
        $str69$____ = SubLObjectFactory.makeString(" -> ");
        $str70$__ = SubLObjectFactory.makeString("> ");
        $str71$glfGraph = SubLObjectFactory.makeString("glfGraph");
        $kw72$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str73$glfCore = SubLObjectFactory.makeString("glfCore");
        $str74$glfNodeTypes = SubLObjectFactory.makeString("glfNodeTypes");
        $str75$glfNodeType = SubLObjectFactory.makeString("glfNodeType");
        $str76$glfArcTypes = SubLObjectFactory.makeString("glfArcTypes");
        $str77$glfArcType = SubLObjectFactory.makeString("glfArcType");
        $str78$glfDiagram = SubLObjectFactory.makeString("glfDiagram");
        $str79$glfId = SubLObjectFactory.makeString("glfId");
        $str80$glfOwnsNodes = SubLObjectFactory.makeString("glfOwnsNodes");
        $str81$glfOwnsNode = SubLObjectFactory.makeString("glfOwnsNode");
        $str82$glfIsHeadNode = SubLObjectFactory.makeString("glfIsHeadNode");
        $kw83$ATOMIC = SubLObjectFactory.makeKeyword("ATOMIC");
        $str84$glfHasTypes = SubLObjectFactory.makeString("glfHasTypes");
        $str85$glfHasType = SubLObjectFactory.makeString("glfHasType");
        $str86$glfOwnsArcs = SubLObjectFactory.makeString("glfOwnsArcs");
        $str87$glfOwnsArc = SubLObjectFactory.makeString("glfOwnsArc");
        $str88$glfFromSet = SubLObjectFactory.makeString("glfFromSet");
        $str89$glfFrom = SubLObjectFactory.makeString("glfFrom");
        $str90$glfToSet = SubLObjectFactory.makeString("glfToSet");
        $str91$glfTo = SubLObjectFactory.makeString("glfTo");
        $str92$glfRendering = SubLObjectFactory.makeString("glfRendering");
        $str93$glfRenderNodes = SubLObjectFactory.makeString("glfRenderNodes");
        $str94$glfRenderNode = SubLObjectFactory.makeString("glfRenderNode");
        $str95$glfRenderArcs = SubLObjectFactory.makeString("glfRenderArcs");
        $str96$glfRenderArc = SubLObjectFactory.makeString("glfRenderArc");
        $str97$glfRenderInfo = SubLObjectFactory.makeString("glfRenderInfo");
        $str98$glfRenderLabel = SubLObjectFactory.makeString("glfRenderLabel");
        $str99$glfFlowModel = SubLObjectFactory.makeString("glfFlowModel");
        $str100$glfSemanticForNodes = SubLObjectFactory.makeString("glfSemanticForNodes");
        $str101$glfSemanticForNode = SubLObjectFactory.makeString("glfSemanticForNode");
        $str102$glfHasSemantic = SubLObjectFactory.makeString("glfHasSemantic");
        $str103$glfSemanticForArcs = SubLObjectFactory.makeString("glfSemanticForArcs");
        $str104$glfSemanticForArc = SubLObjectFactory.makeString("glfSemanticForArc");
        $const105$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list106 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Graph-CW")));
        $const107$correspondingAIS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("correspondingAIS"));
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AIS"));
        $const109$GLFNode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GLFNode"));
        $const110$GLFArc = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GLFArc"));
        $kw111$NODE = SubLObjectFactory.makeKeyword("NODE");
        $const112$nodeInSystem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nodeInSystem"));
        $kw113$SOURCE = SubLObjectFactory.makeKeyword("SOURCE");
        $const114$sourceNodeInSystem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourceNodeInSystem"));
        $kw115$ARC = SubLObjectFactory.makeKeyword("ARC");
        $const116$linkInSystem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("linkInSystem"));
        $sym117$GLF_NODE = SubLObjectFactory.makeSymbol("GLF-NODE");
        $sym118$GLF_NODE_P = SubLObjectFactory.makeSymbol("GLF-NODE-P");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTICS"));
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("PARENT"), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTICS"));
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLFNODE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("GLFNODE-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("GLFNODE-PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("GLFNODE-SEMANTICS"));
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLFNODE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLFNODE-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLFNODE-PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLFNODE-SEMANTICS"));
        $sym123$GLFNODE_PRINT = SubLObjectFactory.makeSymbol("GLFNODE-PRINT");
        $sym124$GLF_NODE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GLF-NODE-PRINT-FUNCTION-TRAMPOLINE");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GLF-NODE-P"));
        $sym126$GLFNODE_ID = SubLObjectFactory.makeSymbol("GLFNODE-ID");
        $sym127$_CSETF_GLFNODE_ID = SubLObjectFactory.makeSymbol("_CSETF-GLFNODE-ID");
        $sym128$GLFNODE_TYPES = SubLObjectFactory.makeSymbol("GLFNODE-TYPES");
        $sym129$_CSETF_GLFNODE_TYPES = SubLObjectFactory.makeSymbol("_CSETF-GLFNODE-TYPES");
        $sym130$GLFNODE_PARENT = SubLObjectFactory.makeSymbol("GLFNODE-PARENT");
        $sym131$_CSETF_GLFNODE_PARENT = SubLObjectFactory.makeSymbol("_CSETF-GLFNODE-PARENT");
        $sym132$GLFNODE_SEMANTICS = SubLObjectFactory.makeSymbol("GLFNODE-SEMANTICS");
        $sym133$_CSETF_GLFNODE_SEMANTICS = SubLObjectFactory.makeSymbol("_CSETF-GLFNODE-SEMANTICS");
        $kw134$PARENT = SubLObjectFactory.makeKeyword("PARENT");
        $kw135$SEMANTICS = SubLObjectFactory.makeKeyword("SEMANTICS");
        $sym136$MAKE_GLF_NODE = SubLObjectFactory.makeSymbol("MAKE-GLF-NODE");
        $sym137$VISIT_DEFSTRUCT_OBJECT_GLF_NODE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GLF-NODE-METHOD");
        $str138$_GLF_Node_ = SubLObjectFactory.makeString("<GLF-Node ");
        $str139$_of_graph_ = SubLObjectFactory.makeString(" of graph ");
        $str140$_with_semantics_ = SubLObjectFactory.makeString(" with semantics ");
        $str141$_without_semantics_ = SubLObjectFactory.makeString(" without semantics ");
        $const142$glfNodeSemantics_Underspecified = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("glfNodeSemantics-Underspecified"));
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SEMANTICS"));
        $sym144$GLF_ARC = SubLObjectFactory.makeSymbol("GLF-ARC");
        $sym145$GLF_ARC_P = SubLObjectFactory.makeSymbol("GLF-ARC-P");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeSymbol("TO"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTICS"));
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("PARENT"), (SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)SubLObjectFactory.makeKeyword("TO"), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTICS"));
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLFARC-ID"), (SubLObject)SubLObjectFactory.makeSymbol("GLFARC-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("GLFARC-PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("GLFARC-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("GLFARC-TO"), (SubLObject)SubLObjectFactory.makeSymbol("GLFARC-SEMANTICS"));
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLFARC-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLFARC-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLFARC-PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLFARC-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLFARC-TO"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLFARC-SEMANTICS"));
        $sym150$GLFARC_PRINT = SubLObjectFactory.makeSymbol("GLFARC-PRINT");
        $sym151$GLF_ARC_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GLF-ARC-PRINT-FUNCTION-TRAMPOLINE");
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GLF-ARC-P"));
        $sym153$GLFARC_ID = SubLObjectFactory.makeSymbol("GLFARC-ID");
        $sym154$_CSETF_GLFARC_ID = SubLObjectFactory.makeSymbol("_CSETF-GLFARC-ID");
        $sym155$GLFARC_TYPES = SubLObjectFactory.makeSymbol("GLFARC-TYPES");
        $sym156$_CSETF_GLFARC_TYPES = SubLObjectFactory.makeSymbol("_CSETF-GLFARC-TYPES");
        $sym157$GLFARC_PARENT = SubLObjectFactory.makeSymbol("GLFARC-PARENT");
        $sym158$_CSETF_GLFARC_PARENT = SubLObjectFactory.makeSymbol("_CSETF-GLFARC-PARENT");
        $sym159$GLFARC_FROM = SubLObjectFactory.makeSymbol("GLFARC-FROM");
        $sym160$_CSETF_GLFARC_FROM = SubLObjectFactory.makeSymbol("_CSETF-GLFARC-FROM");
        $sym161$GLFARC_TO = SubLObjectFactory.makeSymbol("GLFARC-TO");
        $sym162$_CSETF_GLFARC_TO = SubLObjectFactory.makeSymbol("_CSETF-GLFARC-TO");
        $sym163$GLFARC_SEMANTICS = SubLObjectFactory.makeSymbol("GLFARC-SEMANTICS");
        $sym164$_CSETF_GLFARC_SEMANTICS = SubLObjectFactory.makeSymbol("_CSETF-GLFARC-SEMANTICS");
        $kw165$FROM = SubLObjectFactory.makeKeyword("FROM");
        $kw166$TO = SubLObjectFactory.makeKeyword("TO");
        $sym167$MAKE_GLF_ARC = SubLObjectFactory.makeSymbol("MAKE-GLF-ARC");
        $sym168$VISIT_DEFSTRUCT_OBJECT_GLF_ARC_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GLF-ARC-METHOD");
        $str169$_GLF_Arc_ = SubLObjectFactory.makeString("<GLF-Arc ");
        $str170$_from__ = SubLObjectFactory.makeString(" from: ");
        $str171$_to____ = SubLObjectFactory.makeString(" to:   ");
        $str172$_meaning__ = SubLObjectFactory.makeString(" meaning: ");
        $const173$variableMappingTableForGLFArcInDi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("variableMappingTableForGLFArcInDiagram"));
        $const174$AISForFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AISForFn"));
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?FROM"), (SubLObject)SubLObjectFactory.makeSymbol("?TO"));
        $const176$linkFromToInSystem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("linkFromToInSystem"));
        $sym177$_FROM = SubLObjectFactory.makeSymbol("?FROM");
        $sym178$_TO = SubLObjectFactory.makeSymbol("?TO");
        $list179 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"));
        $sym180$GLF_RENDERING = SubLObjectFactory.makeSymbol("GLF-RENDERING");
        $sym181$GLF_RENDERING_P = SubLObjectFactory.makeSymbol("GLF-RENDERING-P");
        $list182 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LABEL"));
        $list183 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LABEL"));
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLFRNDR-LABEL"));
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLFRNDR-LABEL"));
        $sym186$GLFRNDR_PRINT = SubLObjectFactory.makeSymbol("GLFRNDR-PRINT");
        $sym187$GLF_RENDERING_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GLF-RENDERING-PRINT-FUNCTION-TRAMPOLINE");
        $list188 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GLF-RENDERING-P"));
        $sym189$GLFRNDR_LABEL = SubLObjectFactory.makeSymbol("GLFRNDR-LABEL");
        $sym190$_CSETF_GLFRNDR_LABEL = SubLObjectFactory.makeSymbol("_CSETF-GLFRNDR-LABEL");
        $kw191$LABEL = SubLObjectFactory.makeKeyword("LABEL");
        $sym192$MAKE_GLF_RENDERING = SubLObjectFactory.makeSymbol("MAKE-GLF-RENDERING");
        $sym193$VISIT_DEFSTRUCT_OBJECT_GLF_RENDERING_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GLF-RENDERING-METHOD");
        $str194$__GLF_Rendering_ = SubLObjectFactory.makeString("#<GLF-Rendering ");
        $str195$_label__ = SubLObjectFactory.makeString(" label: ");
        $const196$glfComponentLabel = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("glfComponentLabel"));
    }
    
    public static final class $glf_graph_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $types;
        public SubLObject $ais;
        public SubLObject $nodes;
        public SubLObject $node_types;
        public SubLObject $source_node;
        public SubLObject $arcs;
        public SubLObject $arc_types;
        public SubLObject $incoming_connectors;
        public SubLObject $outgoing_connectors;
        public SubLObject $incoming_connector_types;
        public SubLObject $outgoing_connector_types;
        public SubLObject $rendering_info;
        private static final SubLStructDeclNative structDecl;
        
        public $glf_graph_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$types = (SubLObject)CommonSymbols.NIL;
            this.$ais = (SubLObject)CommonSymbols.NIL;
            this.$nodes = (SubLObject)CommonSymbols.NIL;
            this.$node_types = (SubLObject)CommonSymbols.NIL;
            this.$source_node = (SubLObject)CommonSymbols.NIL;
            this.$arcs = (SubLObject)CommonSymbols.NIL;
            this.$arc_types = (SubLObject)CommonSymbols.NIL;
            this.$incoming_connectors = (SubLObject)CommonSymbols.NIL;
            this.$outgoing_connectors = (SubLObject)CommonSymbols.NIL;
            this.$incoming_connector_types = (SubLObject)CommonSymbols.NIL;
            this.$outgoing_connector_types = (SubLObject)CommonSymbols.NIL;
            this.$rendering_info = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$glf_graph_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$types;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$ais;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$nodes;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$node_types;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$source_node;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$arcs;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$arc_types;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$incoming_connectors;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$outgoing_connectors;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$incoming_connector_types;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$outgoing_connector_types;
        }
        
        @Override
		public SubLObject getField14() {
            return this.$rendering_info;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$types = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$ais = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$nodes = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$node_types = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$source_node = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$arcs = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$arc_types = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$incoming_connectors = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$outgoing_connectors = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$incoming_connector_types = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$outgoing_connector_types = value;
        }
        
        @Override
		public SubLObject setField14(final SubLObject value) {
            return this.$rendering_info = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$glf_graph_native.class, graphic_library_format.$sym0$GLF_GRAPH, graphic_library_format.$sym1$GLF_GRAPH_P, graphic_library_format.$list2, graphic_library_format.$list3, new String[] { "$id", "$types", "$ais", "$nodes", "$node_types", "$source_node", "$arcs", "$arc_types", "$incoming_connectors", "$outgoing_connectors", "$incoming_connector_types", "$outgoing_connector_types", "$rendering_info" }, graphic_library_format.$list4, graphic_library_format.$list5, graphic_library_format.$sym6$GLFGRPH_PRINT);
        }
    }
    
    public static final class $glf_graph_p$UnaryFunction extends UnaryFunction
    {
        public $glf_graph_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GLF-GRAPH-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return graphic_library_format.glf_graph_p(arg1);
        }
    }
    
    public static final class $glf_node_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $types;
        public SubLObject $parent;
        public SubLObject $semantics;
        private static final SubLStructDeclNative structDecl;
        
        public $glf_node_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$types = (SubLObject)CommonSymbols.NIL;
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$semantics = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$glf_node_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$types;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$parent;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$semantics;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$types = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$parent = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$semantics = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$glf_node_native.class, graphic_library_format.$sym117$GLF_NODE, graphic_library_format.$sym118$GLF_NODE_P, graphic_library_format.$list119, graphic_library_format.$list120, new String[] { "$id", "$types", "$parent", "$semantics" }, graphic_library_format.$list121, graphic_library_format.$list122, graphic_library_format.$sym123$GLFNODE_PRINT);
        }
    }
    
    public static final class $glf_node_p$UnaryFunction extends UnaryFunction
    {
        public $glf_node_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GLF-NODE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return graphic_library_format.glf_node_p(arg1);
        }
    }
    
    public static final class $glf_arc_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $types;
        public SubLObject $parent;
        public SubLObject $from;
        public SubLObject $to;
        public SubLObject $semantics;
        private static final SubLStructDeclNative structDecl;
        
        public $glf_arc_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$types = (SubLObject)CommonSymbols.NIL;
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$from = (SubLObject)CommonSymbols.NIL;
            this.$to = (SubLObject)CommonSymbols.NIL;
            this.$semantics = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$glf_arc_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$types;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$parent;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$from;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$to;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$semantics;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$types = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$parent = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$from = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$to = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$semantics = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$glf_arc_native.class, graphic_library_format.$sym144$GLF_ARC, graphic_library_format.$sym145$GLF_ARC_P, graphic_library_format.$list146, graphic_library_format.$list147, new String[] { "$id", "$types", "$parent", "$from", "$to", "$semantics" }, graphic_library_format.$list148, graphic_library_format.$list149, graphic_library_format.$sym150$GLFARC_PRINT);
        }
    }
    
    public static final class $glf_arc_p$UnaryFunction extends UnaryFunction
    {
        public $glf_arc_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GLF-ARC-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return graphic_library_format.glf_arc_p(arg1);
        }
    }
    
    public static final class $glf_rendering_native extends SubLStructNative
    {
        public SubLObject $label;
        private static final SubLStructDeclNative structDecl;
        
        public $glf_rendering_native() {
            this.$label = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$glf_rendering_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$label;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$label = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$glf_rendering_native.class, graphic_library_format.$sym180$GLF_RENDERING, graphic_library_format.$sym181$GLF_RENDERING_P, graphic_library_format.$list182, graphic_library_format.$list183, new String[] { "$label" }, graphic_library_format.$list184, graphic_library_format.$list185, graphic_library_format.$sym186$GLFRNDR_PRINT);
        }
    }
    
    public static final class $glf_rendering_p$UnaryFunction extends UnaryFunction
    {
        public $glf_rendering_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GLF-RENDERING-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return graphic_library_format.glf_rendering_p(arg1);
        }
    }
}

/*

	Total time: 6364 ms
	
*/