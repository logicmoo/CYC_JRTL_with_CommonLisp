package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ghl_marking_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ghl_marking_utilities";
    public static final String myFingerPrint = "ce0ccdc217bc742913db67916c5e9b97a49415c798ed92e6e465ecde8046a959";
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 935L)
    public static SubLSymbol $ghl_table$;
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1001L)
    public static SubLSymbol $use_zero_size_ghl_marking_spacesP$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CLET;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$WITH_GHL_TABLE_VAR;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$CDOHASH;
    private static final SubLInteger $int8$200;
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1089L)
    public static SubLObject with_ghl_table_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)ghl_marking_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_marking_utilities.$list0);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)ghl_marking_utilities.$sym1$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(var, (SubLObject)ghl_marking_utilities.$list2)), ConsesLow.append(body, (SubLObject)ghl_marking_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1228L)
    public static SubLObject with_new_ghl_table_named(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)ghl_marking_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_marking_utilities.$list3);
        name = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)ghl_marking_utilities.$sym1$CLET, (SubLObject)ghl_marking_utilities.$list4, (SubLObject)ConsesLow.listS((SubLObject)ghl_marking_utilities.$sym5$WITH_GHL_TABLE_VAR, name, ConsesLow.append(body, (SubLObject)ghl_marking_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1471L)
    public static SubLObject with_new_ghl_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)ghl_marking_utilities.$sym1$CLET, (SubLObject)ghl_marking_utilities.$list4, ConsesLow.append(body, (SubLObject)ghl_marking_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1645L)
    public static SubLObject do_ghl_marking_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_marking_utilities.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key_var = (SubLObject)ghl_marking_utilities.NIL;
        SubLObject marking_var = (SubLObject)ghl_marking_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_marking_utilities.$list6);
        key_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_marking_utilities.$list6);
        marking_var = current.first();
        current = current.rest();
        if (ghl_marking_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)ghl_marking_utilities.$sym7$CDOHASH, (SubLObject)ConsesLow.listS(key_var, marking_var, (SubLObject)ghl_marking_utilities.$list2), ConsesLow.append(body, (SubLObject)ghl_marking_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ghl_marking_utilities.$list6);
        return (SubLObject)ghl_marking_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1785L)
    public static SubLObject ghl_marking_table_marked_nodes() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nodes = (SubLObject)ghl_marking_utilities.NIL;
        final SubLObject cdohash_table = ghl_marking_utilities.$ghl_table$.getDynamicValue(thread);
        SubLObject node = (SubLObject)ghl_marking_utilities.NIL;
        SubLObject marking = (SubLObject)ghl_marking_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                node = Hashtables.getEntryKey(cdohash_entry);
                marking = Hashtables.getEntryValue(cdohash_entry);
                if (ghl_marking_utilities.NIL != marking) {
                    nodes = (SubLObject)ConsesLow.cons(node, nodes);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return nodes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1953L)
    public static SubLObject ghl_instantiate_new_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.make_hash_table((SubLObject)((ghl_marking_utilities.NIL != ghl_marking_utilities.$use_zero_size_ghl_marking_spacesP$.getDynamicValue(thread)) ? ghl_marking_utilities.ZERO_INTEGER : ghl_marking_utilities.$int8$200), (SubLObject)ghl_marking_utilities.UNPROVIDED, (SubLObject)ghl_marking_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2091L)
    public static SubLObject get_ghl_marking(final SubLObject v_search, final SubLObject node) {
        return Hashtables.gethash(node, ghl_search_vars.ghl_space(v_search), (SubLObject)ghl_marking_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2218L)
    public static SubLObject get_ghl_goal_marking(final SubLObject v_search, final SubLObject node) {
        return Hashtables.gethash(node, ghl_search_vars.ghl_goal_space(v_search), (SubLObject)ghl_marking_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2320L)
    public static SubLObject ghl_marked_node_p(final SubLObject v_search, final SubLObject node) {
        return list_utilities.sublisp_boolean(get_ghl_marking(v_search, node));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2420L)
    public static SubLObject ghl_goal_marked_node_p(final SubLObject v_search, final SubLObject node) {
        return list_utilities.sublisp_boolean(get_ghl_goal_marking(v_search, node));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2530L)
    public static SubLObject ghl_node_marked_in_space_p(final SubLObject node, final SubLObject space) {
        return list_utilities.sublisp_boolean(Hashtables.gethash(node, space, (SubLObject)ghl_marking_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2629L)
    public static SubLObject ghl_mark_node_in_space(final SubLObject node, final SubLObject mark, final SubLObject space) {
        Hashtables.sethash(node, space, mark);
        return (SubLObject)ghl_marking_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2744L)
    public static SubLObject ghl_mark_node(final SubLObject v_search, final SubLObject node, final SubLObject mark) {
        final SubLObject space = ghl_search_vars.ghl_space(v_search);
        ghl_mark_node_in_space(node, mark, space);
        return (SubLObject)ghl_marking_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2892L)
    public static SubLObject ghl_goal_mark_node(final SubLObject v_search, final SubLObject node, final SubLObject mark) {
        final SubLObject space = ghl_search_vars.ghl_goal_space(v_search);
        ghl_mark_node_in_space(node, mark, space);
        return (SubLObject)ghl_marking_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 3050L)
    public static SubLObject ghl_mark_node_in_ghl_table(final SubLObject node, final SubLObject mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ghl_mark_node_in_space(node, mark, ghl_marking_utilities.$ghl_table$.getDynamicValue(thread));
        return (SubLObject)ghl_marking_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 3170L)
    public static SubLObject ghl_unmark_node(final SubLObject v_search, final SubLObject node) {
        ghl_mark_node(v_search, node, (SubLObject)ghl_marking_utilities.NIL);
        return (SubLObject)ghl_marking_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 3266L)
    public static SubLObject ghl_node_with_equal_or_shallower_depth_p(final SubLObject v_search, final SubLObject node, final SubLObject depth) {
        final SubLObject marking = get_ghl_marking(v_search, node);
        if (marking.isInteger()) {
            return Numbers.numGE(marking, depth);
        }
        return (SubLObject)ghl_marking_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 3520L)
    public static SubLObject ghl_goal_node_with_equal_or_shallower_depth_p(final SubLObject v_search, final SubLObject node, final SubLObject depth) {
        final SubLObject marking = get_ghl_goal_marking(v_search, node);
        if (marking.isInteger()) {
            return Numbers.numGE(marking, depth);
        }
        return (SubLObject)ghl_marking_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 3784L)
    public static SubLObject prepend_to_ghl_marking_state(final SubLObject v_search, final SubLObject node, final SubLObject marking) {
        final SubLObject space = ghl_search_vars.ghl_space(v_search);
        hash_table_utilities.push_hash(node, marking, space);
        return (SubLObject)ghl_marking_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 4000L)
    public static SubLObject ghl_goal_mark_node_as_searched(final SubLObject v_search, final SubLObject node) {
        ghl_goal_mark_node(v_search, node, (SubLObject)ghl_marking_utilities.T);
        return (SubLObject)ghl_marking_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 4114L)
    public static SubLObject ghl_marked_cardinality(final SubLObject space) {
        return Hashtables.hash_table_count(space);
    }
    
    public static SubLObject declare_ghl_marking_utilities_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_marking_utilities", "with_ghl_table_var", "WITH-GHL-TABLE-VAR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_marking_utilities", "with_new_ghl_table_named", "WITH-NEW-GHL-TABLE-NAMED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_marking_utilities", "with_new_ghl_table", "WITH-NEW-GHL-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_marking_utilities", "do_ghl_marking_table", "DO-GHL-MARKING-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_marking_table_marked_nodes", "GHL-MARKING-TABLE-MARKED-NODES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_instantiate_new_space", "GHL-INSTANTIATE-NEW-SPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "get_ghl_marking", "GET-GHL-MARKING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "get_ghl_goal_marking", "GET-GHL-GOAL-MARKING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_marked_node_p", "GHL-MARKED-NODE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_goal_marked_node_p", "GHL-GOAL-MARKED-NODE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_node_marked_in_space_p", "GHL-NODE-MARKED-IN-SPACE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_mark_node_in_space", "GHL-MARK-NODE-IN-SPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_mark_node", "GHL-MARK-NODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_goal_mark_node", "GHL-GOAL-MARK-NODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_mark_node_in_ghl_table", "GHL-MARK-NODE-IN-GHL-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_unmark_node", "GHL-UNMARK-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_node_with_equal_or_shallower_depth_p", "GHL-NODE-WITH-EQUAL-OR-SHALLOWER-DEPTH-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_goal_node_with_equal_or_shallower_depth_p", "GHL-GOAL-NODE-WITH-EQUAL-OR-SHALLOWER-DEPTH-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "prepend_to_ghl_marking_state", "PREPEND-TO-GHL-MARKING-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_goal_mark_node_as_searched", "GHL-GOAL-MARK-NODE-AS-SEARCHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_marking_utilities", "ghl_marked_cardinality", "GHL-MARKED-CARDINALITY", 1, 0, false);
        return (SubLObject)ghl_marking_utilities.NIL;
    }
    
    public static SubLObject init_ghl_marking_utilities_file() {
        ghl_marking_utilities.$ghl_table$ = SubLFiles.defparameter("*GHL-TABLE*", (SubLObject)ghl_marking_utilities.NIL);
        ghl_marking_utilities.$use_zero_size_ghl_marking_spacesP$ = SubLFiles.defparameter("*USE-ZERO-SIZE-GHL-MARKING-SPACES?*", (SubLObject)ghl_marking_utilities.NIL);
        return (SubLObject)ghl_marking_utilities.NIL;
    }
    
    public static SubLObject setup_ghl_marking_utilities_file() {
        return (SubLObject)ghl_marking_utilities.NIL;
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
    
    static {
        me = (SubLFile)new ghl_marking_utilities();
        ghl_marking_utilities.$ghl_table$ = null;
        ghl_marking_utilities.$use_zero_size_ghl_marking_spacesP$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GHL-TABLE*"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GHL-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GHL-INSTANTIATE-NEW-SPACE"))));
        $sym5$WITH_GHL_TABLE_VAR = SubLObjectFactory.makeSymbol("WITH-GHL-TABLE-VAR");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MARKING-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym7$CDOHASH = SubLObjectFactory.makeSymbol("CDOHASH");
        $int8$200 = SubLObjectFactory.makeInteger(200);
    }
}

/*

	Total time: 96 ms
	
*/