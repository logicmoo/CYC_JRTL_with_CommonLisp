package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class graphl_graph_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.graphl_graph_utilities";
    public static final String myFingerPrint = "c86ee12888a8203f36e2067dda1a30dc83b3a5ec4fa7977af5d5d825cb4c6795";
    @SubLTranslatedFile.SubL(source = "cycl/graphl-graph-utilities.lisp", position = 1783L)
    public static SubLSymbol $graphl_finishedP$;
    private static final SubLSymbol $sym0$CLET;
    private static final SubLList $list1;
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-graph-utilities.lisp", position = 919L)
    public static SubLObject graphl_node_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(graphl_graph_utilities.NIL != v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-graph-utilities.lisp", position = 1068L)
    public static SubLObject graphl_edge_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(graphl_graph_utilities.NIL != v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-graph-utilities.lisp", position = 1226L)
    public static SubLObject graphl_directed_edge_p(final SubLObject edge) {
        return (SubLObject)graphl_graph_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-graph-utilities.lisp", position = 1373L)
    public static SubLObject graphl_edge_label(final SubLObject edge) {
        return (SubLObject)graphl_graph_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-graph-utilities.lisp", position = 1484L)
    public static SubLObject graphl_edge_start_node(final SubLObject edge) {
        return (SubLObject)graphl_graph_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-graph-utilities.lisp", position = 1636L)
    public static SubLObject graphl_edge_end_node(final SubLObject edge) {
        return (SubLObject)graphl_graph_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-graph-utilities.lisp", position = 1889L)
    public static SubLObject with_new_graphl_finished(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)graphl_graph_utilities.$sym0$CLET, (SubLObject)graphl_graph_utilities.$list1, ConsesLow.append(body, (SubLObject)graphl_graph_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-graph-utilities.lisp", position = 2001L)
    public static SubLObject set_graphl_finished() {
        graphl_graph_utilities.$graphl_finishedP$.setDynamicValue((SubLObject)graphl_graph_utilities.T);
        return (SubLObject)graphl_graph_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-graph-utilities.lisp", position = 2086L)
    public static SubLObject reset_graphl_finished() {
        graphl_graph_utilities.$graphl_finishedP$.setDynamicValue((SubLObject)graphl_graph_utilities.NIL);
        return (SubLObject)graphl_graph_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-graph-utilities.lisp", position = 2175L)
    public static SubLObject graphl_add_unwind_edges_now_p(final SubLObject v_search) {
        return (SubLObject)SubLObjectFactory.makeBoolean(graphl_graph_utilities.NIL != graphl_search_vars.graphl_add_edges_on_unwind_p(v_search) && (graphl_graph_utilities.NIL == graphl_search_vars.graphl_goal_search_p(v_search) || graphl_graph_utilities.NIL != graphl_search_vars.graphl_goal_found_p(v_search)));
    }
    
    public static SubLObject declare_graphl_graph_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_graph_utilities", "graphl_node_p", "GRAPHL-NODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_graph_utilities", "graphl_edge_p", "GRAPHL-EDGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_graph_utilities", "graphl_directed_edge_p", "GRAPHL-DIRECTED-EDGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_graph_utilities", "graphl_edge_label", "GRAPHL-EDGE-LABEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_graph_utilities", "graphl_edge_start_node", "GRAPHL-EDGE-START-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_graph_utilities", "graphl_edge_end_node", "GRAPHL-EDGE-END-NODE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.graphl_graph_utilities", "with_new_graphl_finished", "WITH-NEW-GRAPHL-FINISHED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_graph_utilities", "set_graphl_finished", "SET-GRAPHL-FINISHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_graph_utilities", "reset_graphl_finished", "RESET-GRAPHL-FINISHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_graph_utilities", "graphl_add_unwind_edges_now_p", "GRAPHL-ADD-UNWIND-EDGES-NOW-P", 1, 0, false);
        return (SubLObject)graphl_graph_utilities.NIL;
    }
    
    public static SubLObject init_graphl_graph_utilities_file() {
        graphl_graph_utilities.$graphl_finishedP$ = SubLFiles.defparameter("*GRAPHL-FINISHED?*", (SubLObject)graphl_graph_utilities.NIL);
        return (SubLObject)graphl_graph_utilities.NIL;
    }
    
    public static SubLObject setup_graphl_graph_utilities_file() {
        return (SubLObject)graphl_graph_utilities.NIL;
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
    
    static {
        me = (SubLFile)new graphl_graph_utilities();
        graphl_graph_utilities.$graphl_finishedP$ = null;
        $sym0$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GRAPHL-FINISHED?*"), (SubLObject)graphl_graph_utilities.NIL));
    }
}

/*

	Total time: 66 ms
	
*/