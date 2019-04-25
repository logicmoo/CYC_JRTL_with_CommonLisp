package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.term;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.dictionary_contents;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.instances;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class graph extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.graph";
    public static final String myFingerPrint = "18095250d0f9b0e28d79bf844eb9fda36ae5ce517cab88c63dc5f44e0e5487a1";
    private static final SubLSymbol $sym0$GRAPH_NODE;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$LABEL;
    private static final SubLSymbol $sym4$ID;
    private static final SubLSymbol $sym5$CORE;
    private static final SubLSymbol $sym6$INSTANCE_COUNT;
    private static final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_CLASS;
    private static final SubLSymbol $sym8$ISOLATED_P;
    private static final SubLSymbol $sym9$INSTANCE_NUMBER;
    private static final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_INSTANCE;
    private static final SubLSymbol $sym11$INITIALIZE;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$GRAPH_NODE_INITIALIZE_METHOD;
    private static final SubLSymbol $sym15$SET_ID;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
    private static final SubLSymbol $sym19$INTEGERP;
    private static final SubLSymbol $sym20$GRAPH_NODE_SET_ID_METHOD;
    private static final SubLSymbol $sym21$SET_CORE;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
    private static final SubLSymbol $sym25$CORE_NODE_MAP;
    private static final SubLSymbol $sym26$GRAPH_NODE_SET_CORE_METHOD;
    private static final SubLSymbol $sym27$SET_LABEL;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
    private static final SubLSymbol $sym31$STRINGP;
    private static final SubLSymbol $sym32$GRAPH_NODE_SET_LABEL_METHOD;
    private static final SubLSymbol $sym33$GET_LABEL;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
    private static final SubLString $str36$;
    private static final SubLSymbol $sym37$GRAPH_NODE_GET_LABEL_METHOD;
    private static final SubLSymbol $sym38$GET_CORE;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
    private static final SubLSymbol $sym41$GRAPH_NODE_GET_CORE_METHOD;
    private static final SubLSymbol $sym42$GET_ID;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
    private static final SubLSymbol $sym45$GRAPH_NODE_GET_ID_METHOD;
    private static final SubLSymbol $sym46$PRINT;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
    private static final SubLString $str50$__;
    private static final SubLString $str51$_;
    private static final SubLString $str52$_D;
    private static final SubLString $str53$__;
    private static final SubLString $str54$_;
    private static final SubLSymbol $sym55$GRAPH_NODE_PRINT_METHOD;
    private static final SubLSymbol $sym56$GRAPH_EDGE;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$TO;
    private static final SubLSymbol $sym59$FROM;
    private static final SubLSymbol $sym60$SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_CLASS;
    private static final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_INSTANCE;
    private static final SubLSymbol $sym62$MAKE_EDGE;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$GRAPH_NODE_P;
    private static final SubLSymbol $sym67$SET_FROM;
    private static final SubLSymbol $sym68$SET_TO;
    private static final SubLSymbol $sym69$GRAPH_EDGE_MAKE_EDGE_METHOD;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$GRAPH_EDGE_INITIALIZE_METHOD;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
    private static final SubLSymbol $sym74$GRAPH_EDGE_SET_FROM_METHOD;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
    private static final SubLSymbol $sym77$GRAPH_EDGE_SET_TO_METHOD;
    private static final SubLSymbol $sym78$GET_FROM;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
    private static final SubLSymbol $sym81$GRAPH_EDGE_GET_FROM_METHOD;
    private static final SubLSymbol $sym82$GET_TO;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
    private static final SubLSymbol $sym85$GRAPH_EDGE_GET_TO_METHOD;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
    private static final SubLSymbol $sym88$GRAPH_EDGE_SET_LABEL_METHOD;
    private static final SubLSymbol $sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
    private static final SubLSymbol $sym90$GRAPH_EDGE_GET_LABEL_METHOD;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
    private static final SubLString $str93$__;
    private static final SubLString $str94$_A;
    private static final SubLString $str95$__;
    private static final SubLSymbol $sym96$GRAPH_EDGE_PRINT_METHOD;
    private static final SubLSymbol $sym97$GRAPH;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$EDGES_TARGET;
    private static final SubLSymbol $sym100$EDGES_SOURCE;
    private static final SubLSymbol $sym101$LABEL_EDGE_MAP;
    private static final SubLSymbol $sym102$NODES;
    private static final SubLSymbol $sym103$LABEL_NODE_MAP;
    private static final SubLSymbol $sym104$INTEGER_SEQUENCE_GENERATOR;
    private static final SubLSymbol $sym105$NAME;
    private static final SubLSymbol $sym106$SUBLOOP_RESERVED_INITIALIZE_GRAPH_CLASS;
    private static final SubLSymbol $sym107$SUBLOOP_RESERVED_INITIALIZE_GRAPH_INSTANCE;
    private static final SubLList $list108;
    private static final SubLSymbol $sym109$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym110$GRAPH_INITIALIZE_METHOD;
    private static final SubLSymbol $sym111$ACCEPT_NODE;
    private static final SubLList $list112;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$GRAPH_ACCEPT_NODE_METHOD;
    private static final SubLSymbol $sym115$ACCEPT_EDGE;
    private static final SubLList $list116;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$GRAPH_ACCEPT_EDGE_METHOD;
    private static final SubLSymbol $sym119$ADD_NODE;
    private static final SubLList $list120;
    private static final SubLSymbol $sym121$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLString $str122$__Cannot_add_node__S;
    private static final SubLSymbol $sym123$GRAPH_ADD_NODE_METHOD;
    private static final SubLSymbol $sym124$GET_NODE_BY_ID;
    private static final SubLList $list125;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym128$GRAPH_GET_NODE_BY_ID_METHOD;
    private static final SubLSymbol $sym129$GET_NODE_BY_LABEL;
    private static final SubLList $list130;
    private static final SubLSymbol $sym131$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym132$GRAPH_GET_NODE_BY_LABEL_METHOD;
    private static final SubLSymbol $sym133$GET_NODE_BY_CORE;
    private static final SubLList $list134;
    private static final SubLList $list135;
    private static final SubLSymbol $sym136$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym137$GRAPH_GET_NODE_BY_CORE_METHOD;
    private static final SubLSymbol $sym138$ADD_EDGE;
    private static final SubLList $list139;
    private static final SubLSymbol $sym140$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLString $str141$__Cannot_add_edge__S;
    private static final SubLSymbol $sym142$GRAPH_ADD_EDGE_METHOD;
    private static final SubLSymbol $sym143$REMOVE_EDGE;
    private static final SubLList $list144;
    private static final SubLList $list145;
    private static final SubLSymbol $sym146$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym147$GRAPH_EDGE_P;
    private static final SubLSymbol $sym148$GRAPH_REMOVE_EDGE_METHOD;
    private static final SubLSymbol $sym149$GET_EDGES_FROM;
    private static final SubLList $list150;
    private static final SubLSymbol $sym151$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym152$GRAPH_GET_EDGES_FROM_METHOD;
    private static final SubLSymbol $sym153$GET_EDGES_TO;
    private static final SubLList $list154;
    private static final SubLSymbol $sym155$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym156$GRAPH_GET_EDGES_TO_METHOD;
    private static final SubLSymbol $sym157$GET_EDGES_FROM_NODE;
    private static final SubLList $list158;
    private static final SubLList $list159;
    private static final SubLSymbol $sym160$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym161$GRAPH_GET_EDGES_FROM_NODE_METHOD;
    private static final SubLSymbol $sym162$GET_EDGES_TO_NODE;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym165$GRAPH_GET_EDGES_TO_NODE_METHOD;
    private static final SubLSymbol $sym166$GET_NODES_FROM_NODE;
    private static final SubLList $list167;
    private static final SubLSymbol $sym168$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym169$GRAPH_GET_NODES_FROM_NODE_METHOD;
    private static final SubLSymbol $sym170$GET_NODES_TO_NODE;
    private static final SubLList $list171;
    private static final SubLSymbol $sym172$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym173$GRAPH_GET_NODES_TO_NODE_METHOD;
    private static final SubLSymbol $sym174$GET_PATH_LABELS;
    private static final SubLList $list175;
    private static final SubLList $list176;
    private static final SubLSymbol $sym177$LISTP;
    private static final SubLSymbol $sym178$COLLECT_ALL_ASCENDING;
    private static final SubLSymbol $sym179$GRAPH_GET_PATH_LABELS_METHOD;
    private static final SubLSymbol $sym180$COLLECT_ASCENDING;
    private static final SubLList $list181;
    private static final SubLSymbol $sym182$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym183$GRAPH_COLLECT_ASCENDING_METHOD;
    private static final SubLList $list184;
    private static final SubLList $list185;
    private static final SubLSymbol $sym186$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLSymbol $sym187$GRAPH_COLLECT_ALL_ASCENDING_METHOD;
    private static final SubLList $list188;
    private static final SubLSymbol $sym189$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLString $str190$_nodes;
    private static final SubLSymbol $sym191$GRAPH_PRINT_METHOD;
    private static final SubLSymbol $sym192$PPRINT;
    private static final SubLList $list193;
    private static final SubLList $list194;
    private static final SubLSymbol $sym195$OUTER_CATCH_FOR_GRAPH_METHOD;
    private static final SubLString $str196$___;
    private static final SubLString $str197$_;
    private static final SubLSymbol $sym198$GRAPH_PPRINT_METHOD;
    private static final SubLList $list199;
    private static final SubLSymbol $sym200$GRAPH_VAR;
    private static final SubLSymbol $sym201$CLET;
    private static final SubLSymbol $sym202$DO_DICTIONARY;
    private static final SubLSymbol $sym203$KEY;
    private static final SubLSymbol $sym204$GET_SLOT;
    private static final SubLList $list205;
    private static final SubLList $list206;
    private static final SubLSymbol $sym207$CYC_GRAPH_NODE;
    private static final SubLList $list208;
    private static final SubLSymbol $sym209$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_CLASS;
    private static final SubLSymbol $sym210$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_INSTANCE;
    private static final SubLSymbol $sym211$MAKE_NODE;
    private static final SubLList $list212;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$GENERATE_PHRASE;
    private static final SubLSymbol $sym215$CYC_GRAPH_NODE_MAKE_NODE_METHOD;
    private static final SubLList $list216;
    private static final SubLList $list217;
    private static final SubLSymbol $sym218$CLOSED_TERM_;
    private static final SubLSymbol $sym219$CYC_GRAPH_NODE_SET_CORE_METHOD;
    private static final SubLList $list220;
    private static final SubLSymbol $sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD;
    private static final SubLSymbol $sym222$CYC_GRAPH_NODE_GENERATE_PHRASE_METHOD;
    private static final SubLSymbol $sym223$CYC_GRAPH_EDGE;
    private static final SubLList $list224;
    private static final SubLSymbol $sym225$PREDICATE;
    private static final SubLSymbol $sym226$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_CLASS;
    private static final SubLSymbol $sym227$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_INSTANCE;
    private static final SubLList $list228;
    private static final SubLList $list229;
    private static final SubLObject $const230$genls;
    private static final SubLSymbol $sym231$CYC_GRAPH_NODE_P;
    private static final SubLSymbol $sym232$PREDICATE_;
    private static final SubLSymbol $sym233$SET_PREDICATE;
    private static final SubLSymbol $sym234$CYC_GRAPH_EDGE_MAKE_EDGE_METHOD;
    private static final SubLList $list235;
    private static final SubLList $list236;
    private static final SubLSymbol $sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD;
    private static final SubLSymbol $sym238$CYC_GRAPH_EDGE_SET_PREDICATE_METHOD;
    private static final SubLSymbol $sym239$CYC_GRAPH;
    private static final SubLList $list240;
    private static final SubLSymbol $sym241$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_CLASS;
    private static final SubLSymbol $sym242$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_INSTANCE;
    private static final SubLObject $const243$isa;
    private static final SubLList $list244;
    private static final SubLSymbol $sym245$CYC_GRAPH_ACCEPT_NODE_METHOD;
    private static final SubLList $list246;
    private static final SubLSymbol $sym247$CYC_GRAPH_ACCEPT_EDGE_METHOD;
    private static final SubLSymbol $sym248$INTERPOLATE_NODE;
    private static final SubLList $list249;
    private static final SubLList $list250;
    private static final SubLSymbol $sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD;
    private static final SubLObject $const252$EverythingPSC;
    private static final SubLSymbol $sym253$CYC_GRAPH_INTERPOLATE_NODE_METHOD;
    private static final SubLSymbol $sym254$INTERPOLATE_CYC_TERM;
    private static final SubLList $list255;
    private static final SubLList $list256;
    private static final SubLSymbol $sym257$CYC_GRAPH_INTERPOLATE_CYC_TERM_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 1977L)
    public static SubLObject get_graph_node_label(final SubLObject graph_node) {
        return classes.subloop_get_access_protected_instance_slot(graph_node, (SubLObject)graph.THREE_INTEGER, (SubLObject)graph.$sym3$LABEL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 1977L)
    public static SubLObject set_graph_node_label(final SubLObject graph_node, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(graph_node, value, (SubLObject)graph.THREE_INTEGER, (SubLObject)graph.$sym3$LABEL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 1977L)
    public static SubLObject get_graph_node_id(final SubLObject graph_node) {
        return classes.subloop_get_access_protected_instance_slot(graph_node, (SubLObject)graph.TWO_INTEGER, (SubLObject)graph.$sym4$ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 1977L)
    public static SubLObject set_graph_node_id(final SubLObject graph_node, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(graph_node, value, (SubLObject)graph.TWO_INTEGER, (SubLObject)graph.$sym4$ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 1977L)
    public static SubLObject get_graph_node_core(final SubLObject graph_node) {
        return classes.subloop_get_access_protected_instance_slot(graph_node, (SubLObject)graph.ONE_INTEGER, (SubLObject)graph.$sym5$CORE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 1977L)
    public static SubLObject set_graph_node_core(final SubLObject graph_node, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(graph_node, value, (SubLObject)graph.ONE_INTEGER, (SubLObject)graph.$sym5$CORE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 1977L)
    public static SubLObject subloop_reserved_initialize_graph_node_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym6$INSTANCE_COUNT, (SubLObject)graph.ZERO_INTEGER);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 1977L)
    public static SubLObject subloop_reserved_initialize_graph_node_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym8$ISOLATED_P, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym9$INSTANCE_NUMBER, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym5$CORE, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym4$ID, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym3$LABEL, (SubLObject)graph.NIL);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 1977L)
    public static SubLObject graph_node_p(final SubLObject graph_node) {
        return classes.subloop_instanceof_class(graph_node, (SubLObject)graph.$sym0$GRAPH_NODE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 2572L)
    public static SubLObject graph_node_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 2696L)
    public static SubLObject graph_node_set_id_method(final SubLObject self, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = (SubLObject)graph.NIL;
        SubLObject id = get_graph_node_id(self);
        try {
            thread.throwStack.push(graph.$sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                assert graph.NIL != Types.integerp(num) : num;
                id = num;
                Dynamic.sublisp_throw((SubLObject)graph.$sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_node_id(self, id);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 2899L)
    public static SubLObject graph_node_set_core_method(final SubLObject self, final SubLObject v_object, SubLObject v_graph) {
        if (v_graph == graph.UNPROVIDED) {
            v_graph = (SubLObject)graph.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = (SubLObject)graph.NIL;
        SubLObject v_core = get_graph_node_core(self);
        try {
            thread.throwStack.push(graph.$sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                v_core = v_object;
                if (graph.NIL != graph_p(v_graph)) {
                    dictionary.dictionary_enter(instances.get_slot(v_graph, (SubLObject)graph.$sym25$CORE_NODE_MAP), v_core, self);
                }
                Dynamic.sublisp_throw((SubLObject)graph.$sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_node_core(self, v_core);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 3202L)
    public static SubLObject graph_node_set_label_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = (SubLObject)graph.NIL;
        SubLObject label = get_graph_node_label(self);
        try {
            thread.throwStack.push(graph.$sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                assert graph.NIL != Types.stringp(string) : string;
                label = string;
                Dynamic.sublisp_throw((SubLObject)graph.$sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_node_label(self, label);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 3427L)
    public static SubLObject graph_node_get_label_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = (SubLObject)graph.NIL;
        final SubLObject label = get_graph_node_label(self);
        try {
            thread.throwStack.push(graph.$sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                if (graph.NIL != label) {
                    Dynamic.sublisp_throw((SubLObject)graph.$sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, label);
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)graph.$sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, (SubLObject)graph.$str36$);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_node_label(self, label);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 3621L)
    public static SubLObject graph_node_get_core_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = (SubLObject)graph.NIL;
        final SubLObject v_core = get_graph_node_core(self);
        try {
            thread.throwStack.push(graph.$sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)graph.$sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, v_core);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_node_core(self, v_core);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 3778L)
    public static SubLObject graph_node_get_id_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = (SubLObject)graph.NIL;
        final SubLObject id = get_graph_node_id(self);
        try {
            thread.throwStack.push(graph.$sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)graph.$sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, id);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_node_id(self, id);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 3929L)
    public static SubLObject graph_node_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = (SubLObject)graph.NIL;
        final SubLObject label = get_graph_node_label(self);
        final SubLObject id = get_graph_node_id(self);
        try {
            thread.throwStack.push(graph.$sym49$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                streams_high.write_string((SubLObject)graph.$str50$__, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                print_high.princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                if (id.isNumber()) {
                    streams_high.write_string(Sequences.cconcatenate((SubLObject)graph.$str51$_, PrintLow.format((SubLObject)graph.NIL, (SubLObject)graph.$str52$_D, id)), stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                }
                streams_high.write_string((SubLObject)graph.$str53$__, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                streams_high.write_string(label, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                streams_high.write_string((SubLObject)graph.$str54$_, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_node_label(self, label);
                    set_graph_node_id(self, id);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym49$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 4325L)
    public static SubLObject get_graph_edge_label(final SubLObject graph_edge) {
        return classes.subloop_get_access_protected_instance_slot(graph_edge, (SubLObject)graph.THREE_INTEGER, (SubLObject)graph.$sym3$LABEL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 4325L)
    public static SubLObject set_graph_edge_label(final SubLObject graph_edge, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(graph_edge, value, (SubLObject)graph.THREE_INTEGER, (SubLObject)graph.$sym3$LABEL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 4325L)
    public static SubLObject get_graph_edge_to(final SubLObject graph_edge) {
        return classes.subloop_get_access_protected_instance_slot(graph_edge, (SubLObject)graph.TWO_INTEGER, (SubLObject)graph.$sym58$TO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 4325L)
    public static SubLObject set_graph_edge_to(final SubLObject graph_edge, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(graph_edge, value, (SubLObject)graph.TWO_INTEGER, (SubLObject)graph.$sym58$TO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 4325L)
    public static SubLObject get_graph_edge_from(final SubLObject graph_edge) {
        return classes.subloop_get_access_protected_instance_slot(graph_edge, (SubLObject)graph.ONE_INTEGER, (SubLObject)graph.$sym59$FROM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 4325L)
    public static SubLObject set_graph_edge_from(final SubLObject graph_edge, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(graph_edge, value, (SubLObject)graph.ONE_INTEGER, (SubLObject)graph.$sym59$FROM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 4325L)
    public static SubLObject subloop_reserved_initialize_graph_edge_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym6$INSTANCE_COUNT, (SubLObject)graph.ZERO_INTEGER);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 4325L)
    public static SubLObject subloop_reserved_initialize_graph_edge_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym8$ISOLATED_P, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym9$INSTANCE_NUMBER, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym59$FROM, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym58$TO, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym3$LABEL, (SubLObject)graph.NIL);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 4325L)
    public static SubLObject graph_edge_p(final SubLObject graph_edge) {
        return classes.subloop_instanceof_class(graph_edge, (SubLObject)graph.$sym56$GRAPH_EDGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 4906L)
    public static SubLObject graph_edge_make_edge_method(final SubLObject self, final SubLObject from_node, final SubLObject to_node) {
        assert graph.NIL != graph_node_p(to_node) : to_node;
        assert graph.NIL != graph_node_p(from_node) : from_node;
        final SubLObject fid = instances.get_slot(from_node, (SubLObject)graph.$sym4$ID);
        final SubLObject tid = instances.get_slot(to_node, (SubLObject)graph.$sym4$ID);
        final SubLObject new_edge = object.new_class_instance(self);
        if (fid.isNumber() && tid.isNumber()) {
            methods.funcall_instance_method_with_1_args(new_edge, (SubLObject)graph.$sym67$SET_FROM, fid);
            methods.funcall_instance_method_with_1_args(new_edge, (SubLObject)graph.$sym68$SET_TO, tid);
            return new_edge;
        }
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 5502L)
    public static SubLObject graph_edge_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 5633L)
    public static SubLObject graph_edge_set_from_method(final SubLObject self, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = (SubLObject)graph.NIL;
        SubLObject from = get_graph_edge_from(self);
        try {
            thread.throwStack.push(graph.$sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                assert graph.NIL != Types.integerp(num) : num;
                from = num;
                Dynamic.sublisp_throw((SubLObject)graph.$sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edge_from(self, from);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 5849L)
    public static SubLObject graph_edge_set_to_method(final SubLObject self, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = (SubLObject)graph.NIL;
        SubLObject to = get_graph_edge_to(self);
        try {
            thread.throwStack.push(graph.$sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                assert graph.NIL != Types.integerp(num) : num;
                to = num;
                Dynamic.sublisp_throw((SubLObject)graph.$sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edge_to(self, to);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 6059L)
    public static SubLObject graph_edge_get_from_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = (SubLObject)graph.NIL;
        final SubLObject from = get_graph_edge_from(self);
        try {
            thread.throwStack.push(graph.$sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)graph.$sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, from);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edge_from(self, from);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 6198L)
    public static SubLObject graph_edge_get_to_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = (SubLObject)graph.NIL;
        final SubLObject to = get_graph_edge_to(self);
        try {
            thread.throwStack.push(graph.$sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)graph.$sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, to);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edge_to(self, to);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 6331L)
    public static SubLObject graph_edge_set_label_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = (SubLObject)graph.NIL;
        SubLObject label = get_graph_edge_label(self);
        try {
            thread.throwStack.push(graph.$sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                assert graph.NIL != Types.stringp(string) : string;
                label = string;
                Dynamic.sublisp_throw((SubLObject)graph.$sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edge_label(self, label);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 6561L)
    public static SubLObject graph_edge_get_label_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = (SubLObject)graph.NIL;
        final SubLObject label = get_graph_edge_label(self);
        try {
            thread.throwStack.push(graph.$sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                if (graph.NIL != label) {
                    Dynamic.sublisp_throw((SubLObject)graph.$sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, label);
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)graph.$sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, (SubLObject)graph.$str36$);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edge_label(self, label);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 6755L)
    public static SubLObject graph_edge_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = (SubLObject)graph.NIL;
        final SubLObject label = get_graph_edge_label(self);
        final SubLObject to = get_graph_edge_to(self);
        final SubLObject from = get_graph_edge_from(self);
        try {
            thread.throwStack.push(graph.$sym92$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                streams_high.write_string((SubLObject)graph.$str50$__, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                print_high.princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                streams_high.write_string((SubLObject)graph.$str53$__, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                streams_high.write_string(Sequences.cconcatenate(print_high.prin1_to_string(from), (SubLObject)graph.$str93$__), stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                streams_high.write_string(PrintLow.format((SubLObject)graph.NIL, (SubLObject)graph.$str94$_A, label), stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                streams_high.write_string(Sequences.cconcatenate((SubLObject)graph.$str95$__, print_high.prin1_to_string(to)), stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                streams_high.write_string((SubLObject)graph.$str54$_, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edge_label(self, label);
                    set_graph_edge_to(self, to);
                    set_graph_edge_from(self, from);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym92$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject get_graph_core_node_map(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, (SubLObject)graph.EIGHT_INTEGER, (SubLObject)graph.$sym25$CORE_NODE_MAP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject set_graph_core_node_map(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, (SubLObject)graph.EIGHT_INTEGER, (SubLObject)graph.$sym25$CORE_NODE_MAP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject get_graph_edges_target(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, (SubLObject)graph.SEVEN_INTEGER, (SubLObject)graph.$sym99$EDGES_TARGET);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject set_graph_edges_target(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, (SubLObject)graph.SEVEN_INTEGER, (SubLObject)graph.$sym99$EDGES_TARGET);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject get_graph_edges_source(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, (SubLObject)graph.SIX_INTEGER, (SubLObject)graph.$sym100$EDGES_SOURCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject set_graph_edges_source(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, (SubLObject)graph.SIX_INTEGER, (SubLObject)graph.$sym100$EDGES_SOURCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject get_graph_label_edge_map(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, (SubLObject)graph.FIVE_INTEGER, (SubLObject)graph.$sym101$LABEL_EDGE_MAP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject set_graph_label_edge_map(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, (SubLObject)graph.FIVE_INTEGER, (SubLObject)graph.$sym101$LABEL_EDGE_MAP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject get_graph_nodes(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, (SubLObject)graph.FOUR_INTEGER, (SubLObject)graph.$sym102$NODES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject set_graph_nodes(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, (SubLObject)graph.FOUR_INTEGER, (SubLObject)graph.$sym102$NODES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject get_graph_label_node_map(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, (SubLObject)graph.THREE_INTEGER, (SubLObject)graph.$sym103$LABEL_NODE_MAP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject set_graph_label_node_map(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, (SubLObject)graph.THREE_INTEGER, (SubLObject)graph.$sym103$LABEL_NODE_MAP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject get_graph_integer_sequence_generator(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, (SubLObject)graph.TWO_INTEGER, (SubLObject)graph.$sym104$INTEGER_SEQUENCE_GENERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject set_graph_integer_sequence_generator(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, (SubLObject)graph.TWO_INTEGER, (SubLObject)graph.$sym104$INTEGER_SEQUENCE_GENERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject get_graph_name(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, (SubLObject)graph.ONE_INTEGER, (SubLObject)graph.$sym105$NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject set_graph_name(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, (SubLObject)graph.ONE_INTEGER, (SubLObject)graph.$sym105$NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject subloop_reserved_initialize_graph_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym6$INSTANCE_COUNT, (SubLObject)graph.ZERO_INTEGER);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject subloop_reserved_initialize_graph_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym8$ISOLATED_P, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym9$INSTANCE_NUMBER, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym105$NAME, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym104$INTEGER_SEQUENCE_GENERATOR, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym103$LABEL_NODE_MAP, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym102$NODES, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym101$LABEL_EDGE_MAP, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym100$EDGES_SOURCE, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym99$EDGES_TARGET, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym25$CORE_NODE_MAP, (SubLObject)graph.NIL);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 7268L)
    public static SubLObject graph_p(final SubLObject v_graph) {
        return classes.subloop_instanceof_class(v_graph, (SubLObject)graph.$sym97$GRAPH);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 8400L)
    public static SubLObject new_graph(final SubLObject name) {
        assert graph.NIL != Types.stringp(name) : name;
        final SubLObject v_graph = object.new_class_instance((SubLObject)graph.$sym97$GRAPH);
        instances.set_slot(v_graph, (SubLObject)graph.$sym105$NAME, name);
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 8559L)
    public static SubLObject graph_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        SubLObject core_node_map = get_graph_core_node_map(self);
        SubLObject edges_target = get_graph_edges_target(self);
        SubLObject edges_source = get_graph_edges_source(self);
        SubLObject label_edge_map = get_graph_label_edge_map(self);
        SubLObject nodes = get_graph_nodes(self);
        SubLObject label_node_map = get_graph_label_node_map(self);
        SubLObject v_integer_sequence_generator = get_graph_integer_sequence_generator(self);
        try {
            thread.throwStack.push(graph.$sym109$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                object.object_initialize_method(self);
                v_integer_sequence_generator = integer_sequence_generator.new_integer_sequence_generator((SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                nodes = dictionary.new_dictionary((SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                edges_source = dictionary.new_dictionary((SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                edges_target = dictionary.new_dictionary((SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                label_node_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)graph.EQUAL), (SubLObject)graph.UNPROVIDED);
                label_edge_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)graph.EQUAL), (SubLObject)graph.UNPROVIDED);
                core_node_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)graph.EQUALP), (SubLObject)graph.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)graph.$sym109$OUTER_CATCH_FOR_GRAPH_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_core_node_map(self, core_node_map);
                    set_graph_edges_target(self, edges_target);
                    set_graph_edges_source(self, edges_source);
                    set_graph_label_edge_map(self, label_edge_map);
                    set_graph_nodes(self, nodes);
                    set_graph_label_node_map(self, label_node_map);
                    set_graph_integer_sequence_generator(self, v_integer_sequence_generator);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym109$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 9015L)
    public static SubLObject graph_accept_node_method(final SubLObject self, final SubLObject new_node) {
        return graph_node_p(new_node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 9230L)
    public static SubLObject graph_accept_edge_method(final SubLObject self, final SubLObject new_edge) {
        return graph_edge_p(new_edge);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 9445L)
    public static SubLObject graph_add_node_method(final SubLObject self, final SubLObject new_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject core_node_map = get_graph_core_node_map(self);
        final SubLObject nodes = get_graph_nodes(self);
        final SubLObject label_node_map = get_graph_label_node_map(self);
        final SubLObject v_integer_sequence_generator = get_graph_integer_sequence_generator(self);
        try {
            thread.throwStack.push(graph.$sym121$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                if (graph.NIL == methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym111$ACCEPT_NODE, new_node)) {
                    Errors.warn((SubLObject)graph.$str122$__Cannot_add_node__S, new_node);
                    Dynamic.sublisp_throw((SubLObject)graph.$sym121$OUTER_CATCH_FOR_GRAPH_METHOD, (SubLObject)graph.NIL);
                }
                SubLObject node_id = instances.get_slot(new_node, (SubLObject)graph.$sym4$ID);
                final SubLObject node_label = methods.funcall_instance_method_with_0_args(new_node, (SubLObject)graph.$sym33$GET_LABEL);
                final SubLObject node_core = methods.funcall_instance_method_with_0_args(new_node, (SubLObject)graph.$sym38$GET_CORE);
                if (graph.NIL == node_id) {
                    node_id = integer_sequence_generator.integer_sequence_generator_next(v_integer_sequence_generator);
                    methods.funcall_instance_method_with_1_args(new_node, (SubLObject)graph.$sym15$SET_ID, node_id);
                }
                dictionary.dictionary_enter(nodes, node_id, new_node);
                if (graph.NIL != node_label) {
                    dictionary.dictionary_enter(label_node_map, node_label, new_node);
                }
                if (graph.NIL != node_core) {
                    dictionary.dictionary_enter(core_node_map, node_core, new_node);
                }
                Dynamic.sublisp_throw((SubLObject)graph.$sym121$OUTER_CATCH_FOR_GRAPH_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_core_node_map(self, core_node_map);
                    set_graph_nodes(self, nodes);
                    set_graph_label_node_map(self, label_node_map);
                    set_graph_integer_sequence_generator(self, v_integer_sequence_generator);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym121$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 10218L)
    public static SubLObject graph_get_node_by_id_method(final SubLObject self, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push(graph.$sym127$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert graph.NIL != Types.integerp(id) : id;
                Dynamic.sublisp_throw((SubLObject)graph.$sym127$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(nodes, id, (SubLObject)graph.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_nodes(self, nodes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym127$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 10454L)
    public static SubLObject graph_get_node_by_label_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject label_node_map = get_graph_label_node_map(self);
        try {
            thread.throwStack.push(graph.$sym131$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert graph.NIL != Types.stringp(string) : string;
                Dynamic.sublisp_throw((SubLObject)graph.$sym131$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(label_node_map, string, (SubLObject)graph.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_label_node_map(self, label_node_map);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym131$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 10723L)
    public static SubLObject graph_get_node_by_core_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject core_node_map = get_graph_core_node_map(self);
        try {
            thread.throwStack.push(graph.$sym136$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)graph.$sym136$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(core_node_map, v_object, (SubLObject)graph.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_core_node_map(self, core_node_map);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym136$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 10952L)
    public static SubLObject graph_add_edge_method(final SubLObject self, final SubLObject new_edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject edges_target = get_graph_edges_target(self);
        final SubLObject edges_source = get_graph_edges_source(self);
        final SubLObject label_edge_map = get_graph_label_edge_map(self);
        try {
            thread.throwStack.push(graph.$sym140$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                if (graph.NIL == methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym115$ACCEPT_EDGE, new_edge)) {
                    Errors.warn((SubLObject)graph.$str141$__Cannot_add_edge__S, new_edge);
                    Dynamic.sublisp_throw((SubLObject)graph.$sym140$OUTER_CATCH_FOR_GRAPH_METHOD, (SubLObject)graph.NIL);
                }
                final SubLObject label = methods.funcall_instance_method_with_0_args(new_edge, (SubLObject)graph.$sym33$GET_LABEL);
                final SubLObject source = instances.get_slot(new_edge, (SubLObject)graph.$sym59$FROM);
                final SubLObject target = instances.get_slot(new_edge, (SubLObject)graph.$sym58$TO);
                dictionary_utilities.dictionary_push(edges_source, source, new_edge);
                dictionary_utilities.dictionary_push(edges_target, target, new_edge);
                if (graph.NIL == string_utilities.empty_string_p(label)) {
                    dictionary_utilities.dictionary_push(label_edge_map, label, new_edge);
                }
                Dynamic.sublisp_throw((SubLObject)graph.$sym140$OUTER_CATCH_FOR_GRAPH_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edges_target(self, edges_target);
                    set_graph_edges_source(self, edges_source);
                    set_graph_label_edge_map(self, label_edge_map);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym140$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 11522L)
    public static SubLObject graph_remove_edge_method(final SubLObject self, final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject edges_target = get_graph_edges_target(self);
        final SubLObject edges_source = get_graph_edges_source(self);
        final SubLObject label_edge_map = get_graph_label_edge_map(self);
        try {
            thread.throwStack.push(graph.$sym146$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert graph.NIL != graph_edge_p(edge) : edge;
                final SubLObject label = methods.funcall_instance_method_with_0_args(edge, (SubLObject)graph.$sym33$GET_LABEL);
                final SubLObject source = instances.get_slot(edge, (SubLObject)graph.$sym59$FROM);
                final SubLObject target = instances.get_slot(edge, (SubLObject)graph.$sym58$TO);
                dictionary.dictionary_remove(edges_source, source);
                dictionary.dictionary_remove(edges_target, target);
                dictionary.dictionary_remove(label_edge_map, label);
                Dynamic.sublisp_throw((SubLObject)graph.$sym146$OUTER_CATCH_FOR_GRAPH_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edges_target(self, edges_target);
                    set_graph_edges_source(self, edges_source);
                    set_graph_label_edge_map(self, label_edge_map);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym146$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 11949L)
    public static SubLObject graph_get_edges_from_method(final SubLObject self, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject edges_source = get_graph_edges_source(self);
        try {
            thread.throwStack.push(graph.$sym151$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert graph.NIL != Types.integerp(id) : id;
                Dynamic.sublisp_throw((SubLObject)graph.$sym151$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(edges_source, id, (SubLObject)graph.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edges_source(self, edges_source);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym151$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 12215L)
    public static SubLObject graph_get_edges_to_method(final SubLObject self, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject edges_target = get_graph_edges_target(self);
        try {
            thread.throwStack.push(graph.$sym155$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert graph.NIL != Types.integerp(id) : id;
                Dynamic.sublisp_throw((SubLObject)graph.$sym155$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(edges_target, id, (SubLObject)graph.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edges_target(self, edges_target);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym155$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 12478L)
    public static SubLObject graph_get_edges_from_node_method(final SubLObject self, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject edges_source = get_graph_edges_source(self);
        try {
            thread.throwStack.push(graph.$sym160$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert graph.NIL != graph_node_p(node) : node;
                final SubLObject node_id = methods.funcall_instance_method_with_0_args(node, (SubLObject)graph.$sym42$GET_ID);
                Dynamic.sublisp_throw((SubLObject)graph.$sym160$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(edges_source, node_id, (SubLObject)graph.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edges_source(self, edges_source);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym160$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 12809L)
    public static SubLObject graph_get_edges_to_node_method(final SubLObject self, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject edges_target = get_graph_edges_target(self);
        try {
            thread.throwStack.push(graph.$sym164$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert graph.NIL != graph_node_p(node) : node;
                final SubLObject node_id = methods.funcall_instance_method_with_0_args(node, (SubLObject)graph.$sym42$GET_ID);
                Dynamic.sublisp_throw((SubLObject)graph.$sym164$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(edges_target, node_id, (SubLObject)graph.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edges_target(self, edges_target);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym164$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 13132L)
    public static SubLObject graph_get_nodes_from_node_method(final SubLObject self, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push(graph.$sym168$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert graph.NIL != graph_node_p(node) : node;
                SubLObject result = (SubLObject)graph.NIL;
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym157$GET_EDGES_FROM_NODE, node);
                SubLObject edge = (SubLObject)graph.NIL;
                edge = cdolist_list_var.first();
                while (graph.NIL != cdolist_list_var) {
                    final SubLObject node_id = methods.funcall_instance_method_with_0_args(edge, (SubLObject)graph.$sym82$GET_TO);
                    result = (SubLObject)ConsesLow.cons(dictionary.dictionary_lookup(nodes, node_id, (SubLObject)graph.UNPROVIDED), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    edge = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)graph.$sym168$OUTER_CATCH_FOR_GRAPH_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_nodes(self, nodes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym168$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 13567L)
    public static SubLObject graph_get_nodes_to_node_method(final SubLObject self, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push(graph.$sym172$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert graph.NIL != graph_node_p(node) : node;
                SubLObject result = (SubLObject)graph.NIL;
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)graph.$sym162$GET_EDGES_TO_NODE);
                SubLObject edge = (SubLObject)graph.NIL;
                edge = cdolist_list_var.first();
                while (graph.NIL != cdolist_list_var) {
                    final SubLObject node_id = methods.funcall_instance_method_with_0_args(edge, (SubLObject)graph.$sym82$GET_TO);
                    result = (SubLObject)ConsesLow.cons(dictionary.dictionary_lookup(nodes, node_id, (SubLObject)graph.UNPROVIDED), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    edge = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)graph.$sym172$OUTER_CATCH_FOR_GRAPH_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_nodes(self, nodes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym172$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 13994L)
    public static SubLObject graph_get_path_labels_method(final SubLObject self, final SubLObject terms) {
        assert graph.NIL != Types.listp(terms) : terms;
        SubLObject target_nodes = (SubLObject)graph.NIL;
        SubLObject ascending_labels = (SubLObject)graph.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)graph.NIL;
        v_term = cdolist_list_var.first();
        while (graph.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = string_utilities.split_string(v_term, (SubLObject)graph.UNPROVIDED);
            SubLObject token = (SubLObject)graph.NIL;
            token = cdolist_list_var_$1.first();
            while (graph.NIL != cdolist_list_var_$1) {
                final SubLObject node = methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym129$GET_NODE_BY_LABEL, token);
                if (graph.NIL != graph_node_p(node)) {
                    target_nodes = (SubLObject)ConsesLow.cons(node, target_nodes);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                token = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        cdolist_list_var = methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym178$COLLECT_ALL_ASCENDING, target_nodes);
        SubLObject ascending = (SubLObject)graph.NIL;
        ascending = cdolist_list_var.first();
        while (graph.NIL != cdolist_list_var) {
            ascending_labels = (SubLObject)ConsesLow.cons(instances.get_slot(ascending, (SubLObject)graph.$sym3$LABEL), ascending_labels);
            cdolist_list_var = cdolist_list_var.rest();
            ascending = cdolist_list_var.first();
        }
        return ascending_labels;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 14807L)
    public static SubLObject graph_collect_ascending_method(final SubLObject self, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject edges_target = get_graph_edges_target(self);
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push(graph.$sym182$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert graph.NIL != graph_node_p(node) : node;
                final SubLObject marks = Hashtables.make_hash_table((SubLObject)graph.EIGHT_INTEGER, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                final SubLObject node_id = instances.get_slot(node, (SubLObject)graph.$sym4$ID);
                SubLObject edges = dictionary.dictionary_lookup(edges_target, node_id, (SubLObject)graph.UNPROVIDED);
                SubLObject collected_nodes = (SubLObject)graph.NIL;
                Hashtables.sethash(node_id, marks, (SubLObject)graph.T);
                while (graph.NIL != edges) {
                    final SubLObject top_edge = edges.first();
                    final SubLObject other_edges = edges.rest();
                    final SubLObject from_node_id = instances.get_slot(top_edge, (SubLObject)graph.$sym59$FROM);
                    if (graph.NIL != Hashtables.gethash(from_node_id, marks, (SubLObject)graph.UNPROVIDED)) {
                        edges = other_edges;
                    }
                    else {
                        Hashtables.sethash(from_node_id, marks, (SubLObject)graph.T);
                        edges = ConsesLow.append(dictionary.dictionary_lookup(edges_target, from_node_id, (SubLObject)graph.UNPROVIDED), other_edges);
                    }
                }
                SubLObject key = (SubLObject)graph.NIL;
                SubLObject value = (SubLObject)graph.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(marks);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        key = Hashtables.getEntryKey(cdohash_entry);
                        value = Hashtables.getEntryValue(cdohash_entry);
                        collected_nodes = (SubLObject)ConsesLow.cons(dictionary.dictionary_lookup(nodes, key, (SubLObject)graph.UNPROVIDED), collected_nodes);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
                Dynamic.sublisp_throw((SubLObject)graph.$sym182$OUTER_CATCH_FOR_GRAPH_METHOD, collected_nodes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edges_target(self, edges_target);
                    set_graph_nodes(self, nodes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym182$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 15713L)
    public static SubLObject graph_collect_all_ascending_method(final SubLObject self, final SubLObject node_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject edges_target = get_graph_edges_target(self);
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push(graph.$sym186$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert graph.NIL != Types.listp(node_list) : node_list;
                final SubLObject marks = Hashtables.make_hash_table((SubLObject)graph.EIGHT_INTEGER, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                SubLObject edges = (SubLObject)graph.NIL;
                SubLObject collected_nodes = (SubLObject)graph.NIL;
                SubLObject cdolist_list_var = node_list;
                SubLObject node = (SubLObject)graph.NIL;
                node = cdolist_list_var.first();
                while (graph.NIL != cdolist_list_var) {
                    if (graph.NIL != graph_node_p(node)) {
                        final SubLObject node_id = instances.get_slot(node, (SubLObject)graph.$sym4$ID);
                        edges = ConsesLow.append(dictionary.dictionary_lookup(edges_target, node_id, (SubLObject)graph.UNPROVIDED), edges);
                        Hashtables.sethash(node_id, marks, (SubLObject)graph.T);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                }
                while (graph.NIL != edges) {
                    final SubLObject top_edge = edges.first();
                    final SubLObject other_edges = edges.rest();
                    final SubLObject from_node_id = instances.get_slot(top_edge, (SubLObject)graph.$sym59$FROM);
                    if (graph.NIL != Hashtables.gethash(from_node_id, marks, (SubLObject)graph.UNPROVIDED)) {
                        edges = other_edges;
                    }
                    else {
                        Hashtables.sethash(from_node_id, marks, (SubLObject)graph.T);
                        edges = ConsesLow.append(dictionary.dictionary_lookup(edges_target, from_node_id, (SubLObject)graph.UNPROVIDED), other_edges);
                    }
                }
                SubLObject key = (SubLObject)graph.NIL;
                SubLObject value = (SubLObject)graph.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(marks);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        key = Hashtables.getEntryKey(cdohash_entry);
                        value = Hashtables.getEntryValue(cdohash_entry);
                        collected_nodes = (SubLObject)ConsesLow.cons(dictionary.dictionary_lookup(nodes, key, (SubLObject)graph.UNPROVIDED), collected_nodes);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
                Dynamic.sublisp_throw((SubLObject)graph.$sym186$OUTER_CATCH_FOR_GRAPH_METHOD, collected_nodes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edges_target(self, edges_target);
                    set_graph_nodes(self, nodes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym186$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 16771L)
    public static SubLObject graph_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push(graph.$sym189$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                streams_high.write_string((SubLObject)graph.$str50$__, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                print_high.princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                streams_high.write_string((SubLObject)graph.$str53$__, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                streams_high.write_string(print_high.prin1_to_string(dictionary.dictionary_length(nodes)), stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                streams_high.write_string((SubLObject)graph.$str190$_nodes, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                streams_high.write_string((SubLObject)graph.$str54$_, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_nodes(self, nodes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym189$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 17194L)
    public static SubLObject graph_pprint_method(final SubLObject self, SubLObject stream) {
        if (stream == graph.UNPROVIDED) {
            stream = (SubLObject)graph.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = (SubLObject)graph.NIL;
        final SubLObject edges_source = get_graph_edges_source(self);
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push(graph.$sym195$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                streams_high.write_string((SubLObject)graph.$str50$__, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                print_high.princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(nodes)); graph.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject node_from = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    streams_high.write_string(string_utilities.$new_line_string$.getGlobalValue(), stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                    methods.funcall_instance_method_with_2_args(node_from, (SubLObject)graph.$sym46$PRINT, stream, (SubLObject)graph.NIL);
                    streams_high.write_string(Sequences.cconcatenate(string_utilities.$new_line_string$.getGlobalValue(), (SubLObject)graph.$str196$___), stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                    SubLObject cdolist_list_var;
                    final SubLObject edges = cdolist_list_var = dictionary.dictionary_lookup(edges_source, key, (SubLObject)graph.UNPROVIDED);
                    SubLObject edge = (SubLObject)graph.NIL;
                    edge = cdolist_list_var.first();
                    while (graph.NIL != cdolist_list_var) {
                        final SubLObject node_to = dictionary.dictionary_lookup(nodes, instances.get_slot(edge, (SubLObject)graph.$sym58$TO), (SubLObject)graph.UNPROVIDED);
                        streams_high.write_string((SubLObject)graph.$str197$_, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
                        methods.funcall_instance_method_with_2_args(node_to, (SubLObject)graph.$sym46$PRINT, stream, (SubLObject)graph.NIL);
                        cdolist_list_var = cdolist_list_var.rest();
                        edge = cdolist_list_var.first();
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                streams_high.write_string((SubLObject)graph.$str54$_, stream, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_edges_source(self, edges_source);
                    set_graph_nodes(self, nodes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym195$OUTER_CATCH_FOR_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 17912L)
    public static SubLObject make_graph_from_string_lists(final SubLObject list) {
        final SubLObject v_graph = object.new_class_instance((SubLObject)graph.$sym97$GRAPH);
        SubLObject cdolist_list_var = list;
        SubLObject node_list = (SubLObject)graph.NIL;
        node_list = cdolist_list_var.first();
        while (graph.NIL != cdolist_list_var) {
            final SubLObject from_string = node_list.first();
            SubLObject from_node = methods.funcall_instance_method_with_1_args(v_graph, (SubLObject)graph.$sym129$GET_NODE_BY_LABEL, from_string);
            final SubLObject to_strings = node_list.rest();
            if (graph.NIL == from_node) {
                from_node = object.new_class_instance((SubLObject)graph.$sym0$GRAPH_NODE);
                methods.funcall_instance_method_with_1_args(from_node, (SubLObject)graph.$sym27$SET_LABEL, from_string);
            }
            methods.funcall_instance_method_with_1_args(v_graph, (SubLObject)graph.$sym119$ADD_NODE, from_node);
            SubLObject cdolist_list_var_$2 = to_strings;
            SubLObject to_string = (SubLObject)graph.NIL;
            to_string = cdolist_list_var_$2.first();
            while (graph.NIL != cdolist_list_var_$2) {
                SubLObject to_node = methods.funcall_instance_method_with_1_args(v_graph, (SubLObject)graph.$sym129$GET_NODE_BY_LABEL, to_string);
                if (graph.NIL == to_node) {
                    to_node = object.new_class_instance((SubLObject)graph.$sym0$GRAPH_NODE);
                    methods.funcall_instance_method_with_1_args(to_node, (SubLObject)graph.$sym27$SET_LABEL, to_string);
                }
                methods.funcall_instance_method_with_1_args(v_graph, (SubLObject)graph.$sym119$ADD_NODE, to_node);
                methods.funcall_instance_method_with_1_args(v_graph, (SubLObject)graph.$sym138$ADD_EDGE, methods.funcall_class_method_with_2_args((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym62$MAKE_EDGE, from_node, to_node));
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                to_string = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            node_list = cdolist_list_var.first();
        }
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 18982L)
    public static SubLObject do_graph_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph.$list199);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node = (SubLObject)graph.NIL;
        SubLObject v_graph = (SubLObject)graph.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph.$list199);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graph.$list199);
        v_graph = current.first();
        current = current.rest();
        final SubLObject done = (SubLObject)(current.isCons() ? current.first() : graph.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)graph.$list199);
        current = current.rest();
        if (graph.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject graph_var = (SubLObject)graph.$sym200$GRAPH_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)graph.$sym201$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(graph_var, v_graph)), (SubLObject)ConsesLow.listS((SubLObject)graph.$sym202$DO_DICTIONARY, (SubLObject)ConsesLow.list((SubLObject)graph.$sym203$KEY, node, (SubLObject)ConsesLow.listS((SubLObject)graph.$sym204$GET_SLOT, graph_var, (SubLObject)graph.$list205), done), (SubLObject)graph.$list206, ConsesLow.append(body, (SubLObject)graph.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)graph.$list199);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 19285L)
    public static SubLObject subloop_reserved_initialize_cyc_graph_node_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym6$INSTANCE_COUNT, (SubLObject)graph.ZERO_INTEGER);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 19285L)
    public static SubLObject subloop_reserved_initialize_cyc_graph_node_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym8$ISOLATED_P, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym9$INSTANCE_NUMBER, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym5$CORE, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym4$ID, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym3$LABEL, (SubLObject)graph.NIL);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 19285L)
    public static SubLObject cyc_graph_node_p(final SubLObject cyc_graph_node) {
        return classes.subloop_instanceof_class(cyc_graph_node, (SubLObject)graph.$sym207$CYC_GRAPH_NODE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 19600L)
    public static SubLObject cyc_graph_node_make_node_method(final SubLObject self, final SubLObject cyc_term) {
        final SubLObject new_node = object.new_class_instance(self);
        methods.funcall_instance_method_with_1_args(new_node, (SubLObject)graph.$sym21$SET_CORE, cyc_term);
        methods.funcall_instance_method_with_1_args(new_node, (SubLObject)graph.$sym27$SET_LABEL, methods.funcall_instance_method_with_0_args(new_node, (SubLObject)graph.$sym214$GENERATE_PHRASE));
        return new_node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 19926L)
    public static SubLObject cyc_graph_node_set_core_method(final SubLObject self, final SubLObject cyc_term, SubLObject v_graph) {
        if (v_graph == graph.UNPROVIDED) {
            v_graph = (SubLObject)graph.NIL;
        }
        assert graph.NIL != term.closed_termP(cyc_term, (SubLObject)graph.UNPROVIDED) : cyc_term;
        return methods.funcall_instance_super_method_with_2_args(self, (SubLObject)graph.$sym21$SET_CORE, cyc_term, v_graph);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 20210L)
    public static SubLObject cyc_graph_node_generate_phrase_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_graph_node_method = (SubLObject)graph.NIL;
        final SubLObject v_core = get_graph_node_core(self);
        try {
            thread.throwStack.push(graph.$sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)graph.$sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD, pph_main.generate_phrase(v_core, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_node_core(self, v_core);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyc_graph_node_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_graph_node_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 20397L)
    public static SubLObject get_cyc_graph_edge_predicate(final SubLObject cyc_graph_edge) {
        return classes.subloop_get_access_protected_instance_slot(cyc_graph_edge, (SubLObject)graph.FOUR_INTEGER, (SubLObject)graph.$sym225$PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 20397L)
    public static SubLObject set_cyc_graph_edge_predicate(final SubLObject cyc_graph_edge, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_graph_edge, value, (SubLObject)graph.FOUR_INTEGER, (SubLObject)graph.$sym225$PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 20397L)
    public static SubLObject subloop_reserved_initialize_cyc_graph_edge_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym6$INSTANCE_COUNT, (SubLObject)graph.ZERO_INTEGER);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 20397L)
    public static SubLObject subloop_reserved_initialize_cyc_graph_edge_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym8$ISOLATED_P, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym9$INSTANCE_NUMBER, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym59$FROM, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym58$TO, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym3$LABEL, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym223$CYC_GRAPH_EDGE, (SubLObject)graph.$sym225$PREDICATE, (SubLObject)graph.NIL);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 20397L)
    public static SubLObject cyc_graph_edge_p(final SubLObject cyc_graph_edge) {
        return classes.subloop_instanceof_class(cyc_graph_edge, (SubLObject)graph.$sym223$CYC_GRAPH_EDGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 20708L)
    public static SubLObject cyc_graph_edge_make_edge_method(final SubLObject self, final SubLObject from_node, final SubLObject to_node, SubLObject pred) {
        if (pred == graph.UNPROVIDED) {
            pred = graph.$const230$genls;
        }
        assert graph.NIL != cyc_graph_node_p(to_node) : to_node;
        assert graph.NIL != cyc_graph_node_p(from_node) : from_node;
        assert graph.NIL != fort_types_interface.predicateP(pred) : pred;
        final SubLObject fid = instances.get_slot(from_node, (SubLObject)graph.$sym4$ID);
        final SubLObject tid = instances.get_slot(to_node, (SubLObject)graph.$sym4$ID);
        final SubLObject new_edge = object.new_class_instance((SubLObject)graph.$sym223$CYC_GRAPH_EDGE);
        if (fid.isNumber() && tid.isNumber()) {
            methods.funcall_instance_method_with_1_args(new_edge, (SubLObject)graph.$sym67$SET_FROM, fid);
            methods.funcall_instance_method_with_1_args(new_edge, (SubLObject)graph.$sym68$SET_TO, tid);
            methods.funcall_instance_method_with_1_args(new_edge, (SubLObject)graph.$sym233$SET_PREDICATE, pred);
            return new_edge;
        }
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 21530L)
    public static SubLObject cyc_graph_edge_set_predicate_method(final SubLObject self, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_graph_edge_method = (SubLObject)graph.NIL;
        SubLObject predicate = get_cyc_graph_edge_predicate(self);
        try {
            thread.throwStack.push(graph.$sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD);
            try {
                assert graph.NIL != fort_types_interface.predicateP(pred) : pred;
                predicate = pred;
                Dynamic.sublisp_throw((SubLObject)graph.$sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyc_graph_edge_predicate(self, predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyc_graph_edge_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_graph_edge_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 21760L)
    public static SubLObject subloop_reserved_initialize_cyc_graph_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym6$INSTANCE_COUNT, (SubLObject)graph.ZERO_INTEGER);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 21760L)
    public static SubLObject subloop_reserved_initialize_cyc_graph_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym8$ISOLATED_P, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.$sym9$INSTANCE_NUMBER, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym105$NAME, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym104$INTEGER_SEQUENCE_GENERATOR, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym103$LABEL_NODE_MAP, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym102$NODES, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym101$LABEL_EDGE_MAP, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym100$EDGES_SOURCE, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym99$EDGES_TARGET, (SubLObject)graph.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym25$CORE_NODE_MAP, (SubLObject)graph.NIL);
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 21760L)
    public static SubLObject cyc_graph_p(final SubLObject cyc_graph) {
        return classes.subloop_instanceof_class(cyc_graph, (SubLObject)graph.$sym239$CYC_GRAPH);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 22073L)
    public static SubLObject new_cyc_graph(final SubLObject name) {
        assert graph.NIL != Types.stringp(name) : name;
        final SubLObject v_graph = object.new_class_instance((SubLObject)graph.$sym239$CYC_GRAPH);
        instances.set_slot(v_graph, (SubLObject)graph.$sym105$NAME, name);
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 22238L)
    public static SubLObject get_cyc_graph_ancestor_pruning_predicate(final SubLObject predicate) {
        assert graph.NIL != fort_types_interface.predicateP(predicate) : predicate;
        if (predicate.eql(graph.$const230$genls)) {
            return graph.$const230$genls;
        }
        if (predicate.eql(graph.$const243$isa)) {
            return graph.$const230$genls;
        }
        return (SubLObject)graph.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 22419L)
    public static SubLObject cyc_graph_accept_node_method(final SubLObject self, final SubLObject new_node) {
        return cyc_graph_node_p(new_node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 22646L)
    public static SubLObject cyc_graph_accept_edge_method(final SubLObject self, final SubLObject new_edge) {
        return cyc_graph_edge_p(new_edge);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 22869L)
    public static SubLObject cyc_graph_interpolate_node_method(final SubLObject self, final SubLObject new_node, SubLObject predicate) {
        if (predicate == graph.UNPROVIDED) {
            predicate = graph.$const230$genls;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_graph_method = (SubLObject)graph.NIL;
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push(graph.$sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD);
            try {
                if (graph.NIL == methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym133$GET_NODE_BY_CORE, methods.funcall_instance_method_with_0_args(new_node, (SubLObject)graph.$sym38$GET_CORE))) {
                    methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym119$ADD_NODE, new_node);
                    SubLObject adopted_children = (SubLObject)graph.NIL;
                    SubLObject most_specific_ancestors = (SubLObject)graph.NIL;
                    final SubLObject pruning_pred = get_cyc_graph_ancestor_pruning_predicate(predicate);
                    SubLObject iteration_state;
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(nodes)); graph.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        final SubLObject old_node = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (!old_node.eql(new_node)) {
                            final SubLObject arg_old = methods.funcall_instance_method_with_0_args(old_node, (SubLObject)graph.$sym38$GET_CORE);
                            final SubLObject arg_new = methods.funcall_instance_method_with_0_args(new_node, (SubLObject)graph.$sym38$GET_CORE);
                            final SubLObject candidate_ancestor = (SubLObject)((graph.NIL != cyc_kernel.cyc_query((SubLObject)ConsesLow.list(predicate, arg_new, arg_old), graph.$const252$EverythingPSC, (SubLObject)graph.UNPROVIDED)) ? arg_old : graph.NIL);
                            final SubLObject candidate_adoptee = (SubLObject)((graph.NIL != cyc_kernel.cyc_query((SubLObject)ConsesLow.list(predicate, arg_old, arg_new), graph.$const252$EverythingPSC, (SubLObject)graph.UNPROVIDED)) ? arg_old : graph.NIL);
                            most_specific_ancestors = challenge_set_wrt_predicate(most_specific_ancestors, candidate_ancestor, pruning_pred, (SubLObject)graph.UNPROVIDED);
                            adopted_children = challenge_set_wrt_predicate(adopted_children, candidate_adoptee, pruning_pred, (SubLObject)graph.NIL);
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    SubLObject cdolist_list_var = most_specific_ancestors;
                    SubLObject ancestor = (SubLObject)graph.NIL;
                    ancestor = cdolist_list_var.first();
                    while (graph.NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$3 = methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym157$GET_EDGES_FROM_NODE, methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym133$GET_NODE_BY_CORE, ancestor));
                        SubLObject edge_from_ancestor = (SubLObject)graph.NIL;
                        edge_from_ancestor = cdolist_list_var_$3.first();
                        while (graph.NIL != cdolist_list_var_$3) {
                            final SubLObject to_id = methods.funcall_instance_method_with_0_args(edge_from_ancestor, (SubLObject)graph.$sym82$GET_TO);
                            SubLObject match = (SubLObject)graph.NIL;
                            if (graph.NIL == match) {
                                SubLObject csome_list_var;
                                SubLObject adoptee;
                                for (csome_list_var = adopted_children, adoptee = (SubLObject)graph.NIL, adoptee = csome_list_var.first(); graph.NIL == match && graph.NIL != csome_list_var; match = Numbers.numE(to_id, instances.get_slot(methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym133$GET_NODE_BY_CORE, adoptee), (SubLObject)graph.$sym4$ID)), csome_list_var = csome_list_var.rest(), adoptee = csome_list_var.first()) {}
                            }
                            if (graph.NIL != match) {
                                methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym143$REMOVE_EDGE, edge_from_ancestor);
                            }
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            edge_from_ancestor = cdolist_list_var_$3.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        ancestor = cdolist_list_var.first();
                    }
                    cdolist_list_var = most_specific_ancestors;
                    ancestor = (SubLObject)graph.NIL;
                    ancestor = cdolist_list_var.first();
                    while (graph.NIL != cdolist_list_var) {
                        final SubLObject ancestor_node = methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym133$GET_NODE_BY_CORE, ancestor);
                        methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym138$ADD_EDGE, methods.funcall_class_method_with_3_args((SubLObject)graph.$sym223$CYC_GRAPH_EDGE, (SubLObject)graph.$sym62$MAKE_EDGE, ancestor_node, new_node, predicate));
                        cdolist_list_var = cdolist_list_var.rest();
                        ancestor = cdolist_list_var.first();
                    }
                    cdolist_list_var = adopted_children;
                    SubLObject adoptee2 = (SubLObject)graph.NIL;
                    adoptee2 = cdolist_list_var.first();
                    while (graph.NIL != cdolist_list_var) {
                        final SubLObject adoptee_node = methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym133$GET_NODE_BY_CORE, adoptee2);
                        methods.funcall_instance_method_with_1_args(self, (SubLObject)graph.$sym138$ADD_EDGE, methods.funcall_class_method_with_3_args((SubLObject)graph.$sym223$CYC_GRAPH_EDGE, (SubLObject)graph.$sym62$MAKE_EDGE, new_node, adoptee_node, predicate));
                        cdolist_list_var = cdolist_list_var.rest();
                        adoptee2 = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)graph.$sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)graph.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_graph_nodes(self, nodes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyc_graph_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)graph.$sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_graph_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 25723L)
    public static SubLObject cyc_graph_interpolate_cyc_term_method(final SubLObject self, final SubLObject cyc_term, SubLObject predicate) {
        if (predicate == graph.UNPROVIDED) {
            predicate = graph.$const230$genls;
        }
        final SubLObject new_node = methods.funcall_class_method_with_1_args((SubLObject)graph.$sym207$CYC_GRAPH_NODE, (SubLObject)graph.$sym211$MAKE_NODE, cyc_term);
        methods.funcall_instance_method_with_2_args(self, (SubLObject)graph.$sym248$INTERPOLATE_NODE, new_node, predicate);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/graph.lisp", position = 26225L)
    public static SubLObject challenge_set_wrt_predicate(final SubLObject incumbents, final SubLObject challenger, final SubLObject predicate, SubLObject entrant_arg1P) {
        if (entrant_arg1P == graph.UNPROVIDED) {
            entrant_arg1P = (SubLObject)graph.T;
        }
        if (graph.NIL == challenger) {
            return incumbents;
        }
        if (graph.NIL == incumbents) {
            return (SubLObject)ConsesLow.list(challenger);
        }
        final SubLObject head = incumbents.first();
        final SubLObject tail = incumbents.rest();
        final SubLObject queries = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(predicate, challenger, head), (SubLObject)ConsesLow.list(predicate, head, challenger));
        final SubLObject new_head_query = (graph.NIL != entrant_arg1P) ? queries.first() : conses_high.second(queries);
        final SubLObject survivor_query = (graph.NIL != entrant_arg1P) ? conses_high.second(queries) : queries.first();
        final SubLObject new_head = (graph.NIL != cyc_kernel.cyc_query(new_head_query, graph.$const252$EverythingPSC, (SubLObject)graph.UNPROVIDED)) ? challenger : head;
        final SubLObject survivor = (SubLObject)((graph.NIL != cyc_kernel.cyc_query(survivor_query, graph.$const252$EverythingPSC, (SubLObject)graph.UNPROVIDED)) ? graph.NIL : challenger);
        return Sequences.remove_duplicates((SubLObject)ConsesLow.cons(new_head, challenge_set_wrt_predicate(tail, survivor, predicate, entrant_arg1P)), (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED, (SubLObject)graph.UNPROVIDED);
    }
    
    public static SubLObject declare_graph_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_node_label", "GET-GRAPH-NODE-LABEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_node_label", "SET-GRAPH-NODE-LABEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_node_id", "GET-GRAPH-NODE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_node_id", "SET-GRAPH-NODE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_node_core", "GET-GRAPH-NODE-CORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_node_core", "SET-GRAPH-NODE-CORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "subloop_reserved_initialize_graph_node_class", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-NODE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "subloop_reserved_initialize_graph_node_instance", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-NODE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_node_p", "GRAPH-NODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_node_initialize_method", "GRAPH-NODE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_node_set_id_method", "GRAPH-NODE-SET-ID-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_node_set_core_method", "GRAPH-NODE-SET-CORE-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_node_set_label_method", "GRAPH-NODE-SET-LABEL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_node_get_label_method", "GRAPH-NODE-GET-LABEL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_node_get_core_method", "GRAPH-NODE-GET-CORE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_node_get_id_method", "GRAPH-NODE-GET-ID-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_node_print_method", "GRAPH-NODE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_edge_label", "GET-GRAPH-EDGE-LABEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_edge_label", "SET-GRAPH-EDGE-LABEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_edge_to", "GET-GRAPH-EDGE-TO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_edge_to", "SET-GRAPH-EDGE-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_edge_from", "GET-GRAPH-EDGE-FROM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_edge_from", "SET-GRAPH-EDGE-FROM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "subloop_reserved_initialize_graph_edge_class", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-EDGE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "subloop_reserved_initialize_graph_edge_instance", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-EDGE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_edge_p", "GRAPH-EDGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_edge_make_edge_method", "GRAPH-EDGE-MAKE-EDGE-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_edge_initialize_method", "GRAPH-EDGE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_edge_set_from_method", "GRAPH-EDGE-SET-FROM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_edge_set_to_method", "GRAPH-EDGE-SET-TO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_edge_get_from_method", "GRAPH-EDGE-GET-FROM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_edge_get_to_method", "GRAPH-EDGE-GET-TO-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_edge_set_label_method", "GRAPH-EDGE-SET-LABEL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_edge_get_label_method", "GRAPH-EDGE-GET-LABEL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_edge_print_method", "GRAPH-EDGE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_core_node_map", "GET-GRAPH-CORE-NODE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_core_node_map", "SET-GRAPH-CORE-NODE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_edges_target", "GET-GRAPH-EDGES-TARGET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_edges_target", "SET-GRAPH-EDGES-TARGET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_edges_source", "GET-GRAPH-EDGES-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_edges_source", "SET-GRAPH-EDGES-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_label_edge_map", "GET-GRAPH-LABEL-EDGE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_label_edge_map", "SET-GRAPH-LABEL-EDGE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_nodes", "GET-GRAPH-NODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_nodes", "SET-GRAPH-NODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_label_node_map", "GET-GRAPH-LABEL-NODE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_label_node_map", "SET-GRAPH-LABEL-NODE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_integer_sequence_generator", "GET-GRAPH-INTEGER-SEQUENCE-GENERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_integer_sequence_generator", "SET-GRAPH-INTEGER-SEQUENCE-GENERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_graph_name", "GET-GRAPH-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_graph_name", "SET-GRAPH-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "subloop_reserved_initialize_graph_class", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "subloop_reserved_initialize_graph_instance", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_p", "GRAPH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "new_graph", "NEW-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_initialize_method", "GRAPH-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_accept_node_method", "GRAPH-ACCEPT-NODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_accept_edge_method", "GRAPH-ACCEPT-EDGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_add_node_method", "GRAPH-ADD-NODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_get_node_by_id_method", "GRAPH-GET-NODE-BY-ID-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_get_node_by_label_method", "GRAPH-GET-NODE-BY-LABEL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_get_node_by_core_method", "GRAPH-GET-NODE-BY-CORE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_add_edge_method", "GRAPH-ADD-EDGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_remove_edge_method", "GRAPH-REMOVE-EDGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_get_edges_from_method", "GRAPH-GET-EDGES-FROM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_get_edges_to_method", "GRAPH-GET-EDGES-TO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_get_edges_from_node_method", "GRAPH-GET-EDGES-FROM-NODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_get_edges_to_node_method", "GRAPH-GET-EDGES-TO-NODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_get_nodes_from_node_method", "GRAPH-GET-NODES-FROM-NODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_get_nodes_to_node_method", "GRAPH-GET-NODES-TO-NODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_get_path_labels_method", "GRAPH-GET-PATH-LABELS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_collect_ascending_method", "GRAPH-COLLECT-ASCENDING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_collect_all_ascending_method", "GRAPH-COLLECT-ALL-ASCENDING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_print_method", "GRAPH-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "graph_pprint_method", "GRAPH-PPRINT-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "make_graph_from_string_lists", "MAKE-GRAPH-FROM-STRING-LISTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.quirk.graph", "do_graph_nodes", "DO-GRAPH-NODES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "subloop_reserved_initialize_cyc_graph_node_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-NODE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "subloop_reserved_initialize_cyc_graph_node_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-NODE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "cyc_graph_node_p", "CYC-GRAPH-NODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "cyc_graph_node_make_node_method", "CYC-GRAPH-NODE-MAKE-NODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "cyc_graph_node_set_core_method", "CYC-GRAPH-NODE-SET-CORE-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "cyc_graph_node_generate_phrase_method", "CYC-GRAPH-NODE-GENERATE-PHRASE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_cyc_graph_edge_predicate", "GET-CYC-GRAPH-EDGE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "set_cyc_graph_edge_predicate", "SET-CYC-GRAPH-EDGE-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "subloop_reserved_initialize_cyc_graph_edge_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-EDGE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "subloop_reserved_initialize_cyc_graph_edge_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-EDGE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "cyc_graph_edge_p", "CYC-GRAPH-EDGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "cyc_graph_edge_make_edge_method", "CYC-GRAPH-EDGE-MAKE-EDGE-METHOD", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "cyc_graph_edge_set_predicate_method", "CYC-GRAPH-EDGE-SET-PREDICATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "subloop_reserved_initialize_cyc_graph_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "subloop_reserved_initialize_cyc_graph_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "cyc_graph_p", "CYC-GRAPH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "new_cyc_graph", "NEW-CYC-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "get_cyc_graph_ancestor_pruning_predicate", "GET-CYC-GRAPH-ANCESTOR-PRUNING-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "cyc_graph_accept_node_method", "CYC-GRAPH-ACCEPT-NODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "cyc_graph_accept_edge_method", "CYC-GRAPH-ACCEPT-EDGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "cyc_graph_interpolate_node_method", "CYC-GRAPH-INTERPOLATE-NODE-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "cyc_graph_interpolate_cyc_term_method", "CYC-GRAPH-INTERPOLATE-CYC-TERM-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.graph", "challenge_set_wrt_predicate", "CHALLENGE-SET-WRT-PREDICATE", 3, 1, false);
        return (SubLObject)graph.NIL;
    }
    
    public static SubLObject init_graph_file() {
        return (SubLObject)graph.NIL;
    }
    
    public static SubLObject setup_graph_file() {
        classes.subloop_new_class((SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.NIL, (SubLObject)graph.NIL, (SubLObject)graph.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym7$SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym10$SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_INSTANCE);
        subloop_reserved_initialize_graph_node_class((SubLObject)graph.$sym0$GRAPH_NODE);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym11$INITIALIZE, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$list12, (SubLObject)graph.NIL, (SubLObject)graph.$list13);
        methods.subloop_register_instance_method((SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym11$INITIALIZE, (SubLObject)graph.$sym14$GRAPH_NODE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym15$SET_ID, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$list12, (SubLObject)graph.$list16, (SubLObject)graph.$list17);
        methods.subloop_register_instance_method((SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym15$SET_ID, (SubLObject)graph.$sym20$GRAPH_NODE_SET_ID_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym21$SET_CORE, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$list12, (SubLObject)graph.$list22, (SubLObject)graph.$list23);
        methods.subloop_register_instance_method((SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym21$SET_CORE, (SubLObject)graph.$sym26$GRAPH_NODE_SET_CORE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym27$SET_LABEL, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$list12, (SubLObject)graph.$list28, (SubLObject)graph.$list29);
        methods.subloop_register_instance_method((SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym27$SET_LABEL, (SubLObject)graph.$sym32$GRAPH_NODE_SET_LABEL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym33$GET_LABEL, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$list12, (SubLObject)graph.NIL, (SubLObject)graph.$list34);
        methods.subloop_register_instance_method((SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym33$GET_LABEL, (SubLObject)graph.$sym37$GRAPH_NODE_GET_LABEL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym38$GET_CORE, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$list12, (SubLObject)graph.NIL, (SubLObject)graph.$list39);
        methods.subloop_register_instance_method((SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym38$GET_CORE, (SubLObject)graph.$sym41$GRAPH_NODE_GET_CORE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym42$GET_ID, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$list12, (SubLObject)graph.NIL, (SubLObject)graph.$list43);
        methods.subloop_register_instance_method((SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym42$GET_ID, (SubLObject)graph.$sym45$GRAPH_NODE_GET_ID_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym46$PRINT, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$list12, (SubLObject)graph.$list47, (SubLObject)graph.$list48);
        methods.subloop_register_instance_method((SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.$sym46$PRINT, (SubLObject)graph.$sym55$GRAPH_NODE_PRINT_METHOD);
        classes.subloop_new_class((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.NIL, (SubLObject)graph.NIL, (SubLObject)graph.$list57);
        classes.class_set_implements_slot_listeners((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym60$SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym61$SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_INSTANCE);
        subloop_reserved_initialize_graph_edge_class((SubLObject)graph.$sym56$GRAPH_EDGE);
        methods.methods_incorporate_class_method((SubLObject)graph.$sym62$MAKE_EDGE, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$list63, (SubLObject)graph.$list64, (SubLObject)graph.$list65);
        methods.subloop_register_class_method((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym62$MAKE_EDGE, (SubLObject)graph.$sym69$GRAPH_EDGE_MAKE_EDGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym11$INITIALIZE, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$list12, (SubLObject)graph.NIL, (SubLObject)graph.$list70);
        methods.subloop_register_instance_method((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym11$INITIALIZE, (SubLObject)graph.$sym71$GRAPH_EDGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym67$SET_FROM, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$list12, (SubLObject)graph.$list16, (SubLObject)graph.$list72);
        methods.subloop_register_instance_method((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym67$SET_FROM, (SubLObject)graph.$sym74$GRAPH_EDGE_SET_FROM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym68$SET_TO, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$list12, (SubLObject)graph.$list16, (SubLObject)graph.$list75);
        methods.subloop_register_instance_method((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym68$SET_TO, (SubLObject)graph.$sym77$GRAPH_EDGE_SET_TO_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym78$GET_FROM, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$list12, (SubLObject)graph.NIL, (SubLObject)graph.$list79);
        methods.subloop_register_instance_method((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym78$GET_FROM, (SubLObject)graph.$sym81$GRAPH_EDGE_GET_FROM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym82$GET_TO, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$list12, (SubLObject)graph.NIL, (SubLObject)graph.$list83);
        methods.subloop_register_instance_method((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym82$GET_TO, (SubLObject)graph.$sym85$GRAPH_EDGE_GET_TO_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym27$SET_LABEL, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$list12, (SubLObject)graph.$list28, (SubLObject)graph.$list86);
        methods.subloop_register_instance_method((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym27$SET_LABEL, (SubLObject)graph.$sym88$GRAPH_EDGE_SET_LABEL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym33$GET_LABEL, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$list12, (SubLObject)graph.NIL, (SubLObject)graph.$list34);
        methods.subloop_register_instance_method((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym33$GET_LABEL, (SubLObject)graph.$sym90$GRAPH_EDGE_GET_LABEL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym46$PRINT, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$list12, (SubLObject)graph.$list47, (SubLObject)graph.$list91);
        methods.subloop_register_instance_method((SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.$sym46$PRINT, (SubLObject)graph.$sym96$GRAPH_EDGE_PRINT_METHOD);
        classes.subloop_new_class((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym1$OBJECT, (SubLObject)graph.NIL, (SubLObject)graph.NIL, (SubLObject)graph.$list98);
        classes.class_set_implements_slot_listeners((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym106$SUBLOOP_RESERVED_INITIALIZE_GRAPH_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym107$SUBLOOP_RESERVED_INITIALIZE_GRAPH_INSTANCE);
        subloop_reserved_initialize_graph_class((SubLObject)graph.$sym97$GRAPH);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym11$INITIALIZE, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list12, (SubLObject)graph.NIL, (SubLObject)graph.$list108);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym11$INITIALIZE, (SubLObject)graph.$sym110$GRAPH_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym111$ACCEPT_NODE, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list12, (SubLObject)graph.$list112, (SubLObject)graph.$list113);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym111$ACCEPT_NODE, (SubLObject)graph.$sym114$GRAPH_ACCEPT_NODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym115$ACCEPT_EDGE, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list12, (SubLObject)graph.$list116, (SubLObject)graph.$list117);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym115$ACCEPT_EDGE, (SubLObject)graph.$sym118$GRAPH_ACCEPT_EDGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym119$ADD_NODE, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list112, (SubLObject)graph.$list120);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym119$ADD_NODE, (SubLObject)graph.$sym123$GRAPH_ADD_NODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym124$GET_NODE_BY_ID, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list125, (SubLObject)graph.$list126);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym124$GET_NODE_BY_ID, (SubLObject)graph.$sym128$GRAPH_GET_NODE_BY_ID_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym129$GET_NODE_BY_LABEL, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list28, (SubLObject)graph.$list130);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym129$GET_NODE_BY_LABEL, (SubLObject)graph.$sym132$GRAPH_GET_NODE_BY_LABEL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym133$GET_NODE_BY_CORE, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list134, (SubLObject)graph.$list135);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym133$GET_NODE_BY_CORE, (SubLObject)graph.$sym137$GRAPH_GET_NODE_BY_CORE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym138$ADD_EDGE, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list116, (SubLObject)graph.$list139);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym138$ADD_EDGE, (SubLObject)graph.$sym142$GRAPH_ADD_EDGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym143$REMOVE_EDGE, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list144, (SubLObject)graph.$list145);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym143$REMOVE_EDGE, (SubLObject)graph.$sym148$GRAPH_REMOVE_EDGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym149$GET_EDGES_FROM, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list125, (SubLObject)graph.$list150);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym149$GET_EDGES_FROM, (SubLObject)graph.$sym152$GRAPH_GET_EDGES_FROM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym153$GET_EDGES_TO, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list125, (SubLObject)graph.$list154);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym153$GET_EDGES_TO, (SubLObject)graph.$sym156$GRAPH_GET_EDGES_TO_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym157$GET_EDGES_FROM_NODE, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list158, (SubLObject)graph.$list159);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym157$GET_EDGES_FROM_NODE, (SubLObject)graph.$sym161$GRAPH_GET_EDGES_FROM_NODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym162$GET_EDGES_TO_NODE, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list158, (SubLObject)graph.$list163);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym162$GET_EDGES_TO_NODE, (SubLObject)graph.$sym165$GRAPH_GET_EDGES_TO_NODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym166$GET_NODES_FROM_NODE, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list158, (SubLObject)graph.$list167);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym166$GET_NODES_FROM_NODE, (SubLObject)graph.$sym169$GRAPH_GET_NODES_FROM_NODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym170$GET_NODES_TO_NODE, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list158, (SubLObject)graph.$list171);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym170$GET_NODES_TO_NODE, (SubLObject)graph.$sym173$GRAPH_GET_NODES_TO_NODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym174$GET_PATH_LABELS, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list175, (SubLObject)graph.$list176);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym174$GET_PATH_LABELS, (SubLObject)graph.$sym179$GRAPH_GET_PATH_LABELS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym180$COLLECT_ASCENDING, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list158, (SubLObject)graph.$list181);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym180$COLLECT_ASCENDING, (SubLObject)graph.$sym183$GRAPH_COLLECT_ASCENDING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym178$COLLECT_ALL_ASCENDING, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list184, (SubLObject)graph.$list185);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym178$COLLECT_ALL_ASCENDING, (SubLObject)graph.$sym187$GRAPH_COLLECT_ALL_ASCENDING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym46$PRINT, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list12, (SubLObject)graph.$list47, (SubLObject)graph.$list188);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym46$PRINT, (SubLObject)graph.$sym191$GRAPH_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym192$PPRINT, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list193, (SubLObject)graph.$list194);
        methods.subloop_register_instance_method((SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.$sym192$PPRINT, (SubLObject)graph.$sym198$GRAPH_PPRINT_METHOD);
        classes.subloop_new_class((SubLObject)graph.$sym207$CYC_GRAPH_NODE, (SubLObject)graph.$sym0$GRAPH_NODE, (SubLObject)graph.NIL, (SubLObject)graph.NIL, (SubLObject)graph.$list208);
        classes.class_set_implements_slot_listeners((SubLObject)graph.$sym207$CYC_GRAPH_NODE, (SubLObject)graph.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)graph.$sym207$CYC_GRAPH_NODE, (SubLObject)graph.$sym209$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)graph.$sym207$CYC_GRAPH_NODE, (SubLObject)graph.$sym210$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_INSTANCE);
        subloop_reserved_initialize_cyc_graph_node_class((SubLObject)graph.$sym207$CYC_GRAPH_NODE);
        methods.methods_incorporate_class_method((SubLObject)graph.$sym211$MAKE_NODE, (SubLObject)graph.$sym207$CYC_GRAPH_NODE, (SubLObject)graph.$list63, (SubLObject)graph.$list212, (SubLObject)graph.$list213);
        methods.subloop_register_class_method((SubLObject)graph.$sym207$CYC_GRAPH_NODE, (SubLObject)graph.$sym211$MAKE_NODE, (SubLObject)graph.$sym215$CYC_GRAPH_NODE_MAKE_NODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym21$SET_CORE, (SubLObject)graph.$sym207$CYC_GRAPH_NODE, (SubLObject)graph.$list63, (SubLObject)graph.$list216, (SubLObject)graph.$list217);
        methods.subloop_register_instance_method((SubLObject)graph.$sym207$CYC_GRAPH_NODE, (SubLObject)graph.$sym21$SET_CORE, (SubLObject)graph.$sym219$CYC_GRAPH_NODE_SET_CORE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym214$GENERATE_PHRASE, (SubLObject)graph.$sym207$CYC_GRAPH_NODE, (SubLObject)graph.$list63, (SubLObject)graph.NIL, (SubLObject)graph.$list220);
        methods.subloop_register_instance_method((SubLObject)graph.$sym207$CYC_GRAPH_NODE, (SubLObject)graph.$sym214$GENERATE_PHRASE, (SubLObject)graph.$sym222$CYC_GRAPH_NODE_GENERATE_PHRASE_METHOD);
        classes.subloop_new_class((SubLObject)graph.$sym223$CYC_GRAPH_EDGE, (SubLObject)graph.$sym56$GRAPH_EDGE, (SubLObject)graph.NIL, (SubLObject)graph.NIL, (SubLObject)graph.$list224);
        classes.class_set_implements_slot_listeners((SubLObject)graph.$sym223$CYC_GRAPH_EDGE, (SubLObject)graph.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)graph.$sym223$CYC_GRAPH_EDGE, (SubLObject)graph.$sym226$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)graph.$sym223$CYC_GRAPH_EDGE, (SubLObject)graph.$sym227$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_INSTANCE);
        subloop_reserved_initialize_cyc_graph_edge_class((SubLObject)graph.$sym223$CYC_GRAPH_EDGE);
        methods.methods_incorporate_class_method((SubLObject)graph.$sym62$MAKE_EDGE, (SubLObject)graph.$sym223$CYC_GRAPH_EDGE, (SubLObject)graph.$list63, (SubLObject)graph.$list228, (SubLObject)graph.$list229);
        methods.subloop_register_class_method((SubLObject)graph.$sym223$CYC_GRAPH_EDGE, (SubLObject)graph.$sym62$MAKE_EDGE, (SubLObject)graph.$sym234$CYC_GRAPH_EDGE_MAKE_EDGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym233$SET_PREDICATE, (SubLObject)graph.$sym223$CYC_GRAPH_EDGE, (SubLObject)graph.$list63, (SubLObject)graph.$list235, (SubLObject)graph.$list236);
        methods.subloop_register_instance_method((SubLObject)graph.$sym223$CYC_GRAPH_EDGE, (SubLObject)graph.$sym233$SET_PREDICATE, (SubLObject)graph.$sym238$CYC_GRAPH_EDGE_SET_PREDICATE_METHOD);
        classes.subloop_new_class((SubLObject)graph.$sym239$CYC_GRAPH, (SubLObject)graph.$sym97$GRAPH, (SubLObject)graph.NIL, (SubLObject)graph.NIL, (SubLObject)graph.$list240);
        classes.class_set_implements_slot_listeners((SubLObject)graph.$sym239$CYC_GRAPH, (SubLObject)graph.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)graph.$sym239$CYC_GRAPH, (SubLObject)graph.$sym241$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)graph.$sym239$CYC_GRAPH, (SubLObject)graph.$sym242$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_INSTANCE);
        subloop_reserved_initialize_cyc_graph_class((SubLObject)graph.$sym239$CYC_GRAPH);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym111$ACCEPT_NODE, (SubLObject)graph.$sym239$CYC_GRAPH, (SubLObject)graph.$list12, (SubLObject)graph.$list112, (SubLObject)graph.$list244);
        methods.subloop_register_instance_method((SubLObject)graph.$sym239$CYC_GRAPH, (SubLObject)graph.$sym111$ACCEPT_NODE, (SubLObject)graph.$sym245$CYC_GRAPH_ACCEPT_NODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym115$ACCEPT_EDGE, (SubLObject)graph.$sym239$CYC_GRAPH, (SubLObject)graph.$list12, (SubLObject)graph.$list116, (SubLObject)graph.$list246);
        methods.subloop_register_instance_method((SubLObject)graph.$sym239$CYC_GRAPH, (SubLObject)graph.$sym115$ACCEPT_EDGE, (SubLObject)graph.$sym247$CYC_GRAPH_ACCEPT_EDGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym248$INTERPOLATE_NODE, (SubLObject)graph.$sym239$CYC_GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list249, (SubLObject)graph.$list250);
        methods.subloop_register_instance_method((SubLObject)graph.$sym239$CYC_GRAPH, (SubLObject)graph.$sym248$INTERPOLATE_NODE, (SubLObject)graph.$sym253$CYC_GRAPH_INTERPOLATE_NODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)graph.$sym254$INTERPOLATE_CYC_TERM, (SubLObject)graph.$sym239$CYC_GRAPH, (SubLObject)graph.$list63, (SubLObject)graph.$list255, (SubLObject)graph.$list256);
        methods.subloop_register_instance_method((SubLObject)graph.$sym239$CYC_GRAPH, (SubLObject)graph.$sym254$INTERPOLATE_CYC_TERM, (SubLObject)graph.$sym257$CYC_GRAPH_INTERPOLATE_CYC_TERM_METHOD);
        return (SubLObject)graph.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_graph_file();
    }
    
    @Override
	public void initializeVariables() {
        init_graph_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_graph_file();
    }
    
    static {
        me = (SubLFile)new graph();
        $sym0$GRAPH_NODE = SubLObjectFactory.makeSymbol("GRAPH-NODE");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJ")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-LABEL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STR")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LABEL"), (SubLObject)graph.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORE"), (SubLObject)graph.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ID"), (SubLObject)graph.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)graph.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym3$LABEL = SubLObjectFactory.makeSymbol("LABEL");
        $sym4$ID = SubLObjectFactory.makeSymbol("ID");
        $sym5$CORE = SubLObjectFactory.makeSymbol("CORE");
        $sym6$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym7$SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GRAPH-NODE-CLASS");
        $sym8$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym9$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym10$SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GRAPH-NODE-INSTANCE");
        $sym11$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return a new GRAPH-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym14$GRAPH_NODE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-NODE-INITIALIZE-METHOD");
        $sym15$SET_ID = SubLObjectFactory.makeSymbol("SET-ID");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NUM integerp\n   @return graph-node-p\n   Sets the id of this object to NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");
        $sym19$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym20$GRAPH_NODE_SET_ID_METHOD = SubLObjectFactory.makeSymbol("GRAPH-NODE-SET-ID-METHOD");
        $sym21$SET_CORE = SubLObjectFactory.makeSymbol("SET-CORE");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param OBJECT anything atall\n   @return graph-node-p\n   Sets the core of this object to OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CORE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRAPH-P"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-ENTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CORE-NODE-MAP"))), (SubLObject)SubLObjectFactory.makeSymbol("CORE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");
        $sym25$CORE_NODE_MAP = SubLObjectFactory.makeSymbol("CORE-NODE-MAP");
        $sym26$GRAPH_NODE_SET_CORE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-NODE-SET-CORE-METHOD");
        $sym27$SET_LABEL = SubLObjectFactory.makeSymbol("SET-LABEL");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp\n   @return graph-node-p\n   Sets the label of this object to STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");
        $sym31$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym32$GRAPH_NODE_SET_LABEL_METHOD = SubLObjectFactory.makeSymbol("GRAPH-NODE-SET-LABEL-METHOD");
        $sym33$GET_LABEL = SubLObjectFactory.makeSymbol("GET-LABEL");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp\n   Returns the label of this object if it has one, otherwise the empty string."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeString(""))));
        $sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");
        $str36$ = SubLObjectFactory.makeString("");
        $sym37$GRAPH_NODE_GET_LABEL_METHOD = SubLObjectFactory.makeSymbol("GRAPH-NODE-GET-LABEL-METHOD");
        $sym38$GET_CORE = SubLObjectFactory.makeSymbol("GET-CORE");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return anything\n   Returns the core of this object if it has one, otherwise nil"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CORE")));
        $sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");
        $sym41$GRAPH_NODE_GET_CORE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-NODE-GET-CORE-METHOD");
        $sym42$GET_ID = SubLObjectFactory.makeSymbol("GET-ID");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return integerp\n   Returns the id of this object if it has one, otherwise nil"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ID")));
        $sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");
        $sym45$GRAPH_NODE_GET_ID_METHOD = SubLObjectFactory.makeSymbol("GRAPH-NODE-GET-ID-METHOD");
        $sym46$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints GRAPH-NODE to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)graph.NIL, (SubLObject)SubLObjectFactory.makeString("~D"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(": "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")));
        $sym49$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");
        $str50$__ = SubLObjectFactory.makeString("#<");
        $str51$_ = SubLObjectFactory.makeString("-");
        $str52$_D = SubLObjectFactory.makeString("~D");
        $str53$__ = SubLObjectFactory.makeString(": ");
        $str54$_ = SubLObjectFactory.makeString(">");
        $sym55$GRAPH_NODE_PRINT_METHOD = SubLObjectFactory.makeSymbol("GRAPH-NODE-PRINT-METHOD");
        $sym56$GRAPH_EDGE = SubLObjectFactory.makeSymbol("GRAPH-EDGE");
        $list57 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("TO-NODE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-FROM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-TO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TO"), (SubLObject)graph.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-LABEL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LABEL"), (SubLObject)graph.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)graph.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)graph.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym58$TO = SubLObjectFactory.makeSymbol("TO");
        $sym59$FROM = SubLObjectFactory.makeSymbol("FROM");
        $sym60$SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GRAPH-EDGE-CLASS");
        $sym61$SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GRAPH-EDGE-INSTANCE");
        $sym62$MAKE_EDGE = SubLObjectFactory.makeSymbol("MAKE-EDGE");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("TO-NODE"));
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TO-NODE graph-node-p\n   @param FROM-NODE graph-node-p\n   @return graph-edge-p if both nodes have appropriate ids and NIL otherwise.\n   Creates an edge object connecting TO-NODE to FROM-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TO-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH-NODE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH-NODE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ID")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TO-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ID")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("FID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("TID"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-FROM")), (SubLObject)SubLObjectFactory.makeSymbol("FID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-TO")), (SubLObject)SubLObjectFactory.makeSymbol("TID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE")))));
        $sym66$GRAPH_NODE_P = SubLObjectFactory.makeSymbol("GRAPH-NODE-P");
        $sym67$SET_FROM = SubLObjectFactory.makeSymbol("SET-FROM");
        $sym68$SET_TO = SubLObjectFactory.makeSymbol("SET-TO");
        $sym69$GRAPH_EDGE_MAKE_EDGE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-EDGE-MAKE-EDGE-METHOD");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return a new graph-edge object"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym71$GRAPH_EDGE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-EDGE-INITIALIZE-METHOD");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NUM integerp\n   @return graph-edge-p\n   Sets the 'from' slot of this object to NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeSymbol("NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");
        $sym74$GRAPH_EDGE_SET_FROM_METHOD = SubLObjectFactory.makeSymbol("GRAPH-EDGE-SET-FROM-METHOD");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NUM integerp\n   @return graph-edge-p\n   Sets the 'to' slot of this object to NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TO"), (SubLObject)SubLObjectFactory.makeSymbol("NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");
        $sym77$GRAPH_EDGE_SET_TO_METHOD = SubLObjectFactory.makeSymbol("GRAPH-EDGE-SET-TO-METHOD");
        $sym78$GET_FROM = SubLObjectFactory.makeSymbol("GET-FROM");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return integer-p; the id of the node at from-end of this edge"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("FROM")));
        $sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");
        $sym81$GRAPH_EDGE_GET_FROM_METHOD = SubLObjectFactory.makeSymbol("GRAPH-EDGE-GET-FROM-METHOD");
        $sym82$GET_TO = SubLObjectFactory.makeSymbol("GET-TO");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return integer-p; the id of the node at to-end of this edge"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TO")));
        $sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");
        $sym85$GRAPH_EDGE_GET_TO_METHOD = SubLObjectFactory.makeSymbol("GRAPH-EDGE-GET-TO-METHOD");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp\n   @return graph-edge-p\n   Sets the label slot of this object to STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");
        $sym88$GRAPH_EDGE_SET_LABEL_METHOD = SubLObjectFactory.makeSymbol("GRAPH-EDGE-SET-LABEL-METHOD");
        $sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");
        $sym90$GRAPH_EDGE_GET_LABEL_METHOD = SubLObjectFactory.makeSymbol("GRAPH-EDGE-GET-LABEL-METHOD");
        $list91 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("@param STREAM streamp\n   @param DEPTH integerp\n   Prints this GRAPH-EDGE to STREAM, ignoring DEPTH"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(": "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("FROM")), (SubLObject)SubLObjectFactory.makeString("--")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)graph.NIL, (SubLObject)SubLObjectFactory.makeString("~A"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TO"))), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")) });
        $sym92$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");
        $str93$__ = SubLObjectFactory.makeString("--");
        $str94$_A = SubLObjectFactory.makeString("~A");
        $str95$__ = SubLObjectFactory.makeString("->");
        $sym96$GRAPH_EDGE_PRINT_METHOD = SubLObjectFactory.makeSymbol("GRAPH-EDGE-PRINT-METHOD");
        $sym97$GRAPH = SubLObjectFactory.makeSymbol("GRAPH");
        $list98 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LABEL-NODE-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LABEL-EDGE-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGES-SOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGES-TARGET"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORE-NODE-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)graph.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPT-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPT-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-EDGES-FROM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-EDGES-TO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-EDGES-FROM-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-EDGES-TO-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PATH-LABELS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERMS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECT-ASCENDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECT-ALL-ASCENDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym99$EDGES_TARGET = SubLObjectFactory.makeSymbol("EDGES-TARGET");
        $sym100$EDGES_SOURCE = SubLObjectFactory.makeSymbol("EDGES-SOURCE");
        $sym101$LABEL_EDGE_MAP = SubLObjectFactory.makeSymbol("LABEL-EDGE-MAP");
        $sym102$NODES = SubLObjectFactory.makeSymbol("NODES");
        $sym103$LABEL_NODE_MAP = SubLObjectFactory.makeSymbol("LABEL-NODE-MAP");
        $sym104$INTEGER_SEQUENCE_GENERATOR = SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR");
        $sym105$NAME = SubLObjectFactory.makeSymbol("NAME");
        $sym106$SUBLOOP_RESERVED_INITIALIZE_GRAPH_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GRAPH-CLASS");
        $sym107$SUBLOOP_RESERVED_INITIALIZE_GRAPH_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GRAPH-INSTANCE");
        $list108 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("@return a new graph object"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INTEGER-SEQUENCE-GENERATOR"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-SOURCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL-NODE-MAP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)graph.EQUAL))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL-EDGE-MAP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)graph.EQUAL))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CORE-NODE-MAP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)graph.EQUALP))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")) });
        $sym109$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym110$GRAPH_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-INITIALIZE-METHOD");
        $sym111$ACCEPT_NODE = SubLObjectFactory.makeSymbol("ACCEPT-NODE");
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"));
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NEW-NODE graph-node-p\n   @return boolean, T if NEW-NODE is acceptable for this graph object, NIL otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRAPH-NODE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"))));
        $sym114$GRAPH_ACCEPT_NODE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-ACCEPT-NODE-METHOD");
        $sym115$ACCEPT_EDGE = SubLObjectFactory.makeSymbol("ACCEPT-EDGE");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"));
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NEW-EDGE graph-edge-p\n   @return boolean, T if NEW-EDGE is acceptable for this graph object, NIL otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRAPH-EDGE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"))));
        $sym118$GRAPH_ACCEPT_EDGE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-ACCEPT-EDGE-METHOD");
        $sym119$ADD_NODE = SubLObjectFactory.makeSymbol("ADD-NODE");
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NEW-NODE graph-node-p\n   @return graph-p\n   Adds NEW-NODE to this graph object"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPT-NODE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~%Cannot add node ~S"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)graph.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ID")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-LABEL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LABEL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-CORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ID")), (SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-ENTER"), (SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-LABEL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-ENTER"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL-NODE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-CORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-ENTER"), (SubLObject)SubLObjectFactory.makeSymbol("CORE-NODE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-CORE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym121$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $str122$__Cannot_add_node__S = SubLObjectFactory.makeString("~%Cannot add node ~S");
        $sym123$GRAPH_ADD_NODE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-ADD-NODE-METHOD");
        $sym124$GET_NODE_BY_ID = SubLObjectFactory.makeSymbol("GET-NODE-BY-ID");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"));
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ID integerp\n   @return graph-node-p\n   Returns the node in this graph which has ID as its id, if any."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))));
        $sym127$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym128$GRAPH_GET_NODE_BY_ID_METHOD = SubLObjectFactory.makeSymbol("GRAPH-GET-NODE-BY-ID-METHOD");
        $sym129$GET_NODE_BY_LABEL = SubLObjectFactory.makeSymbol("GET-NODE-BY-LABEL");
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp\n   @return graph-node-p\n   Returns the node in this graph which has STRING as its label, if any."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL-NODE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))));
        $sym131$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym132$GRAPH_GET_NODE_BY_LABEL_METHOD = SubLObjectFactory.makeSymbol("GRAPH-GET-NODE-BY-LABEL-METHOD");
        $sym133$GET_NODE_BY_CORE = SubLObjectFactory.makeSymbol("GET-NODE-BY-CORE");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param OBJECT\n   @return graph-node-p\n   Returns the node in this graph which has OBJECT as its core, if any."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("CORE-NODE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))));
        $sym136$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym137$GRAPH_GET_NODE_BY_CORE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-GET-NODE-BY-CORE-METHOD");
        $sym138$ADD_EDGE = SubLObjectFactory.makeSymbol("ADD-EDGE");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NEW-EDGE graph-edge-p\n   @return graph-p\n   Adds NEW-EDGE to this graph."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPT-EDGE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~%Cannot add edge ~S"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)graph.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LABEL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FROM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TO"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-PUSH"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-PUSH"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-STRING-P"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-PUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL-EDGE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym140$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $str141$__Cannot_add_edge__S = SubLObjectFactory.makeString("~%Cannot add edge ~S");
        $sym142$GRAPH_ADD_EDGE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-ADD-EDGE-METHOD");
        $sym143$REMOVE_EDGE = SubLObjectFactory.makeSymbol("REMOVE-EDGE");
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGE"));
        $list145 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param EDGE graph-edge-p\n   @return graph-p\n   Removes EDGE from this graph."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH-EDGE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LABEL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FROM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TO"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL-EDGE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym146$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym147$GRAPH_EDGE_P = SubLObjectFactory.makeSymbol("GRAPH-EDGE-P");
        $sym148$GRAPH_REMOVE_EDGE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-REMOVE-EDGE-METHOD");
        $sym149$GET_EDGES_FROM = SubLObjectFactory.makeSymbol("GET-EDGES-FROM");
        $list150 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ID integerp\n   @return listp of graph-edge-p\n   Returns the list of all the edges of this graph starting at node with id ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))));
        $sym151$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym152$GRAPH_GET_EDGES_FROM_METHOD = SubLObjectFactory.makeSymbol("GRAPH-GET-EDGES-FROM-METHOD");
        $sym153$GET_EDGES_TO = SubLObjectFactory.makeSymbol("GET-EDGES-TO");
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ID integerp\n   @return listp of graph-edge-p\n   Returns the list of all the edges of this graph pointing at node with id ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))));
        $sym155$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym156$GRAPH_GET_EDGES_TO_METHOD = SubLObjectFactory.makeSymbol("GRAPH-GET-EDGES-TO-METHOD");
        $sym157$GET_EDGES_FROM_NODE = SubLObjectFactory.makeSymbol("GET-EDGES-FROM-NODE");
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"));
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NODE graph-node-p\n   @return listp of graph-edge-p\n   Returns the list of all the edges of this graph starting at node with id ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH-NODE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ID"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-ID")))));
        $sym160$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym161$GRAPH_GET_EDGES_FROM_NODE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-GET-EDGES-FROM-NODE-METHOD");
        $sym162$GET_EDGES_TO_NODE = SubLObjectFactory.makeSymbol("GET-EDGES-TO-NODE");
        $list163 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ID integerp\n   @return listp of graph-edge-p\n   Returns the list of all the edges of this graph pointing at node with id ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH-NODE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ID"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-ID")))));
        $sym164$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym165$GRAPH_GET_EDGES_TO_NODE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-GET-EDGES-TO-NODE-METHOD");
        $sym166$GET_NODES_FROM_NODE = SubLObjectFactory.makeSymbol("GET-NODES-FROM-NODE");
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NODE graph-node-p\n   @return listp of graph-edge-p\n   Returns the list of all the child-nodes of this graph starting at node with id ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH-NODE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-EDGES-FROM-NODE")), (SubLObject)SubLObjectFactory.makeSymbol("NODE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TO"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-ID")), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym168$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym169$GRAPH_GET_NODES_FROM_NODE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-GET-NODES-FROM-NODE-METHOD");
        $sym170$GET_NODES_TO_NODE = SubLObjectFactory.makeSymbol("GET-NODES-TO-NODE");
        $list171 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NODE graph-node-p\n   @return listp of graph-edge-p\n   Returns the list of all the parent nodes of this graph starting at node with id ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH-NODE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-EDGES-TO-NODE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TO"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-ID")), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym172$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym173$GRAPH_GET_NODES_TO_NODE_METHOD = SubLObjectFactory.makeSymbol("GRAPH-GET-NODES-TO-NODE-METHOD");
        $sym174$GET_PATH_LABELS = SubLObjectFactory.makeSymbol("GET-PATH-LABELS");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERMS"));
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TERMS listp; a list of strings whose connecting graph labels are to be returned\n   @return listp; the list of strings that connect TERMS in this graph"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-NODES"), (SubLObject)graph.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASCENDING-LABELS"), (SubLObject)graph.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPLIT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NODE-BY-LABEL")), (SubLObject)SubLObjectFactory.makeSymbol("TOKEN")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRAPH-NODE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-NODES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASCENDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECT-ALL-ASCENDING")), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-NODES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("ASCENDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"))), (SubLObject)SubLObjectFactory.makeSymbol("ASCENDING-LABELS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ASCENDING-LABELS"))));
        $sym177$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym178$COLLECT_ALL_ASCENDING = SubLObjectFactory.makeSymbol("COLLECT-ALL-ASCENDING");
        $sym179$GRAPH_GET_PATH_LABELS_METHOD = SubLObjectFactory.makeSymbol("GRAPH-GET-PATH-LABELS-METHOD");
        $sym180$COLLECT_ASCENDING = SubLObjectFactory.makeSymbol("COLLECT-ASCENDING");
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NODE graph-node-p\n   @return list of graph-node-p\n   Returns the list of all nodes in this graph from which NODE can be reached\n   following the graph's edges."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH-NODE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MARKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)graph.EIGHT_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ID")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"))), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTED-NODES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("MARKS"), (SubLObject)graph.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOP-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-EDGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TOP-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("MARKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-EDGES"))), (SubLObject)ConsesLow.list((SubLObject)graph.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("MARKS"), (SubLObject)graph.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE-ID")), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-EDGES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MARKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTED-NODES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTED-NODES"))));
        $sym182$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym183$GRAPH_COLLECT_ASCENDING_METHOD = SubLObjectFactory.makeSymbol("GRAPH-COLLECT-ASCENDING-METHOD");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-LIST"));
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NODE-LIST listp of graph-node-p\n   @return list of graph-node-p\n   Returns the list of all nodes in this graph from which any NODE in NODE-LIST can be reached\n   following the graph's edges."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MARKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)graph.EIGHT_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGES"), (SubLObject)graph.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTED-NODES"), (SubLObject)graph.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRAPH-NODE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-ID")), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("MARKS"), (SubLObject)graph.T)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOP-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-EDGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TOP-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("MARKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-EDGES"))), (SubLObject)ConsesLow.list((SubLObject)graph.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("MARKS"), (SubLObject)graph.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE-ID")), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-EDGES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MARKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTED-NODES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTED-NODES"))));
        $sym186$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $sym187$GRAPH_COLLECT_ALL_ASCENDING_METHOD = SubLObjectFactory.makeSymbol("GRAPH-COLLECT-ALL-ASCENDING-METHOD");
        $list188 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STREAM streamp\n   @param DEPTH integerp\n   Prints this GRAPH to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(": "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1-TO-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("NODES"))), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(" nodes"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")));
        $sym189$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $str190$_nodes = SubLObjectFactory.makeString(" nodes");
        $sym191$GRAPH_PRINT_METHOD = SubLObjectFactory.makeSymbol("GRAPH-PRINT-METHOD");
        $sym192$PPRINT = SubLObjectFactory.makeSymbol("PPRINT");
        $list193 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)graph.T));
        $list194 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STREAM streamp\n   Pretty prints this GRAPH to STREAM, showing the contents of its nodes\n   and how they link to one another."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("NODES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-FROM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)graph.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeSymbol("*NEW-LINE-STRING*"), (SubLObject)SubLObjectFactory.makeString("   ")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGE"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-TO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TO")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(" "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-TO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)graph.NIL))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")));
        $sym195$OUTER_CATCH_FOR_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");
        $str196$___ = SubLObjectFactory.makeString("   ");
        $str197$_ = SubLObjectFactory.makeString(" ");
        $sym198$GRAPH_PPRINT_METHOD = SubLObjectFactory.makeSymbol("GRAPH-PPRINT-METHOD");
        $list199 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym200$GRAPH_VAR = SubLObjectFactory.makeUninternedSymbol("GRAPH-VAR");
        $sym201$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym202$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $sym203$KEY = SubLObjectFactory.makeSymbol("KEY");
        $sym204$GET_SLOT = SubLObjectFactory.makeSymbol("GET-SLOT");
        $list205 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NODES")));
        $list206 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"));
        $sym207$CYC_GRAPH_NODE = SubLObjectFactory.makeSymbol("CYC-GRAPH-NODE");
        $list208 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATE-PHRASE"), (SubLObject)graph.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym209$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-NODE-CLASS");
        $sym210$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-NODE-INSTANCE");
        $sym211$MAKE_NODE = SubLObjectFactory.makeSymbol("MAKE-NODE");
        $list212 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM"));
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param CYC-TERM a Cyc term\n   @return cyc-graph-node-p, a node with CYC-TERM as its core"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CORE")), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-LABEL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATE-PHRASE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"))));
        $sym214$GENERATE_PHRASE = SubLObjectFactory.makeSymbol("GENERATE-PHRASE");
        $sym215$CYC_GRAPH_NODE_MAKE_NODE_METHOD = SubLObjectFactory.makeSymbol("CYC-GRAPH-NODE-MAKE-NODE-METHOD");
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH"));
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param CYC-TERM a Cyc term\n   @return cyc-graph-node-p, a node with CYC-TERM as its core"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("CLOSED-TERM?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CORE")), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH"))));
        $sym218$CLOSED_TERM_ = SubLObjectFactory.makeSymbol("CLOSED-TERM?");
        $sym219$CYC_GRAPH_NODE_SET_CORE_METHOD = SubLObjectFactory.makeSymbol("CYC-GRAPH-NODE-SET-CORE-METHOD");
        $list220 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp, an English string denoting the concept at the core\n   of this node."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("CORE"))));
        $sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYC-GRAPH-NODE-METHOD");
        $sym222$CYC_GRAPH_NODE_GENERATE_PHRASE_METHOD = SubLObjectFactory.makeSymbol("CYC-GRAPH-NODE-GENERATE-PHRASE-METHOD");
        $sym223$CYC_GRAPH_EDGE = SubLObjectFactory.makeSymbol("CYC-GRAPH-EDGE");
        $list224 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("TO-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym225$PREDICATE = SubLObjectFactory.makeSymbol("PREDICATE");
        $sym226$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-EDGE-CLASS");
        $sym227$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-EDGE-INSTANCE");
        $list228 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("TO-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))));
        $list229 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TO-NODE cyc-graph-node-p\n   @param FROM-NODE cyc-graph-node-p\n   @param PREDICATE predicate-p, the CycL predicate that represents the semantics\n   of this edge\n   @return graph-edge-p if both nodes have appropriate ids and NIL otherwise.\n   Creates an edge object connecting TO-NODE to FROM-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TO-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-GRAPH-NODE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-GRAPH-NODE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ID")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TO-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ID")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-GRAPH-EDGE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("FID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("TID"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-FROM")), (SubLObject)SubLObjectFactory.makeSymbol("FID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-TO")), (SubLObject)SubLObjectFactory.makeSymbol("TID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PREDICATE")), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE")))));
        $const230$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym231$CYC_GRAPH_NODE_P = SubLObjectFactory.makeSymbol("CYC-GRAPH-NODE-P");
        $sym232$PREDICATE_ = SubLObjectFactory.makeSymbol("PREDICATE?");
        $sym233$SET_PREDICATE = SubLObjectFactory.makeSymbol("SET-PREDICATE");
        $sym234$CYC_GRAPH_EDGE_MAKE_EDGE_METHOD = SubLObjectFactory.makeSymbol("CYC-GRAPH-EDGE-MAKE-EDGE-METHOD");
        $list235 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $list236 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PRED a predicate?\n   @return cyc-graph-edge-p\n   sets the predicate of this edge"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYC-GRAPH-EDGE-METHOD");
        $sym238$CYC_GRAPH_EDGE_SET_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("CYC-GRAPH-EDGE-SET-PREDICATE-METHOD");
        $sym239$CYC_GRAPH = SubLObjectFactory.makeSymbol("CYC-GRAPH");
        $list240 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INTERPOLATE-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")))), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym241$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-CLASS");
        $sym242$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-INSTANCE");
        $const243$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list244 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NEW-NODE cyc-graph-node-p\n   @return boolean, T if NEW-NODE is acceptable for this graph object, NIL otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-GRAPH-NODE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"))));
        $sym245$CYC_GRAPH_ACCEPT_NODE_METHOD = SubLObjectFactory.makeSymbol("CYC-GRAPH-ACCEPT-NODE-METHOD");
        $list246 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NEW-EDGE graph-edge-p\n   @return boolean, T if NEW-EDGE is acceptable for this graph object, NIL otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-GRAPH-EDGE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-EDGE"))));
        $sym247$CYC_GRAPH_ACCEPT_EDGE_METHOD = SubLObjectFactory.makeSymbol("CYC-GRAPH-ACCEPT-EDGE-METHOD");
        $sym248$INTERPOLATE_NODE = SubLObjectFactory.makeSymbol("INTERPOLATE-NODE");
        $list249 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))));
        $list250 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NEW-NODE, cyc-graph-node-p\n   @param PREDICATE, predicate?\n   @return cyc-graph-p\n   Finds all nodes of this graph whose cores are immediate ancestors of the core \n   of NEW-NODE and creates an edge from them to NEW-NODE. Finds all nodes of this \n   graph whose cores are immediate specs of the core of NEW-NODE and creates an \n   edge from NEW-NODE to them. Removes all edges from ancestors to specs that can\n   now be accounted by edges that run through NEW-NODE. The notion of ancestor is\n   parameterized by PREDICATE."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NODE-BY-CORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-NODE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADOPTED-CHILDREN"), (SubLObject)graph.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOST-SPECIFIC-ANCESTORS"), (SubLObject)graph.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRUNING-PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CYC-GRAPH-ANCESTOR-PRUNING-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("NODES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)graph.EQL, (SubLObject)SubLObjectFactory.makeSymbol("OLD-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-OLD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-NEW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NEW"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-OLD")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)SubLObjectFactory.makeSymbol("ARG-OLD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-ADOPTEE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-OLD"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NEW")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)SubLObjectFactory.makeSymbol("ARG-OLD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MOST-SPECIFIC-ANCESTORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHALLENGE-SET-WRT-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("MOST-SPECIFIC-ANCESTORS"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-ANCESTOR"), (SubLObject)SubLObjectFactory.makeSymbol("PRUNING-PRED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ADOPTED-CHILDREN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHALLENGE-SET-WRT-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ADOPTED-CHILDREN"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-ADOPTEE"), (SubLObject)SubLObjectFactory.makeSymbol("PRUNING-PRED"), (SubLObject)graph.NIL))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)SubLObjectFactory.makeSymbol("MOST-SPECIFIC-ANCESTORS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGE-FROM-ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-EDGES-FROM-NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NODE-BY-CORE")), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE-FROM-ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TO")))), (SubLObject)SubLObjectFactory.makeSymbol("MATCH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADOPTEE"), (SubLObject)SubLObjectFactory.makeSymbol("ADOPTED-CHILDREN"), (SubLObject)SubLObjectFactory.makeSymbol("MATCH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MATCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("TO-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NODE-BY-CORE")), (SubLObject)SubLObjectFactory.makeSymbol("ADOPTEE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ID")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MATCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-EDGE")), (SubLObject)SubLObjectFactory.makeSymbol("EDGE-FROM-ANCESTOR")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)SubLObjectFactory.makeSymbol("MOST-SPECIFIC-ANCESTORS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NODE-BY-CORE")), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-EDGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-GRAPH-EDGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-EDGE")), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADOPTEE"), (SubLObject)SubLObjectFactory.makeSymbol("ADOPTED-CHILDREN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADOPTEE-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NODE-BY-CORE")), (SubLObject)SubLObjectFactory.makeSymbol("ADOPTEE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-EDGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-GRAPH-EDGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-EDGE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("ADOPTEE-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYC-GRAPH-METHOD");
        $const252$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym253$CYC_GRAPH_INTERPOLATE_NODE_METHOD = SubLObjectFactory.makeSymbol("CYC-GRAPH-INTERPOLATE-NODE-METHOD");
        $sym254$INTERPOLATE_CYC_TERM = SubLObjectFactory.makeSymbol("INTERPOLATE-CYC-TERM");
        $list255 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))));
        $list256 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param CYC-TERM, closed-term?\n   @param PREDICATE, predicate?\n   @return cyc-graph-p\n   Given CYC-TERM, creates a new cyc-graph-node-p with it at its core and\n   interpolates the new node in the graph according to the relationship\n   specified in PREDICATE."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-GRAPH-NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-NODE")), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERPOLATE-NODE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym257$CYC_GRAPH_INTERPOLATE_CYC_TERM_METHOD = SubLObjectFactory.makeSymbol("CYC-GRAPH-INTERPOLATE-CYC-TERM-METHOD");
    }
}

/*

	Total time: 1617 ms
	
*/