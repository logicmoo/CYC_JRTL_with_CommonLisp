package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class search extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.search";
    public static final String myFingerPrint = "47a1814f8b40406f7321d9a9067c8848f2f35b2c535e9a2908789299618d7962";
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLSymbol $dtp_search_struc$;
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 2243L)
    private static SubLSymbol $search_struc_free_list$;
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 2243L)
    private static SubLSymbol $search_struc_free_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLSymbol $dtp_search_node$;
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3782L)
    private static SubLSymbol $search_node_free_list$;
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3782L)
    private static SubLSymbol $search_node_free_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 4469L)
    public static SubLSymbol $reclaim_dead_end_search_nodes$;
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 4709L)
    public static SubLSymbol $dead_end_node_function$;
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 4765L)
    public static SubLSymbol $reclaim_dead_end_node_function$;
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 5890L)
    public static SubLSymbol $within_generic_search$;
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 6028L)
    public static SubLSymbol $interrupt_generic_search$;
    private static final SubLSymbol $sym0$SEARCH_STRUC;
    private static final SubLSymbol $sym1$SEARCH_STRUC_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_SEARCH;
    private static final SubLSymbol $sym7$SEARCH_STRUC_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$SEARCH_TREE;
    private static final SubLSymbol $sym10$_CSETF_SEARCH_TREE;
    private static final SubLSymbol $sym11$SEARCH_LEAVES;
    private static final SubLSymbol $sym12$_CSETF_SEARCH_LEAVES;
    private static final SubLSymbol $sym13$SEARCH_GOALS;
    private static final SubLSymbol $sym14$_CSETF_SEARCH_GOALS;
    private static final SubLSymbol $sym15$SEARCH_NO_LEAVES_P_FUNC;
    private static final SubLSymbol $sym16$_CSETF_SEARCH_NO_LEAVES_P_FUNC;
    private static final SubLSymbol $sym17$SEARCH_NEXT_NODE_FUNC;
    private static final SubLSymbol $sym18$_CSETF_SEARCH_NEXT_NODE_FUNC;
    private static final SubLSymbol $sym19$SEARCH_GOAL_P_FUNC;
    private static final SubLSymbol $sym20$_CSETF_SEARCH_GOAL_P_FUNC;
    private static final SubLSymbol $sym21$SEARCH_ADD_GOAL_FUNC;
    private static final SubLSymbol $sym22$_CSETF_SEARCH_ADD_GOAL_FUNC;
    private static final SubLSymbol $sym23$SEARCH_OPTIONS_FUNC;
    private static final SubLSymbol $sym24$_CSETF_SEARCH_OPTIONS_FUNC;
    private static final SubLSymbol $sym25$SEARCH_EXPAND_FUNC;
    private static final SubLSymbol $sym26$_CSETF_SEARCH_EXPAND_FUNC;
    private static final SubLSymbol $sym27$SEARCH_ADD_NODE_FUNC;
    private static final SubLSymbol $sym28$_CSETF_SEARCH_ADD_NODE_FUNC;
    private static final SubLSymbol $sym29$SEARCH_TOO_DEEP_FUNC;
    private static final SubLSymbol $sym30$_CSETF_SEARCH_TOO_DEEP_FUNC;
    private static final SubLSymbol $sym31$SEARCH_STATE;
    private static final SubLSymbol $sym32$_CSETF_SEARCH_STATE;
    private static final SubLSymbol $sym33$SEARCH_PRINT_FUNC;
    private static final SubLSymbol $sym34$_CSETF_SEARCH_PRINT_FUNC;
    private static final SubLSymbol $sym35$SEARCH_LIMBO;
    private static final SubLSymbol $sym36$_CSETF_SEARCH_LIMBO;
    private static final SubLSymbol $sym37$SEARCH_CURRENT_NODE;
    private static final SubLSymbol $sym38$_CSETF_SEARCH_CURRENT_NODE;
    private static final SubLSymbol $kw39$TREE;
    private static final SubLSymbol $kw40$LEAVES;
    private static final SubLSymbol $kw41$GOALS;
    private static final SubLSymbol $kw42$NO_LEAVES_P_FUNC;
    private static final SubLSymbol $kw43$NEXT_NODE_FUNC;
    private static final SubLSymbol $kw44$GOAL_P_FUNC;
    private static final SubLSymbol $kw45$ADD_GOAL_FUNC;
    private static final SubLSymbol $kw46$OPTIONS_FUNC;
    private static final SubLSymbol $kw47$EXPAND_FUNC;
    private static final SubLSymbol $kw48$ADD_NODE_FUNC;
    private static final SubLSymbol $kw49$TOO_DEEP_FUNC;
    private static final SubLSymbol $kw50$STATE;
    private static final SubLSymbol $kw51$PRINT_FUNC;
    private static final SubLSymbol $kw52$LIMBO;
    private static final SubLSymbol $kw53$CURRENT_NODE;
    private static final SubLString $str54$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw55$BEGIN;
    private static final SubLSymbol $sym56$MAKE_SEARCH_STRUC;
    private static final SubLSymbol $kw57$SLOT;
    private static final SubLSymbol $kw58$END;
    private static final SubLSymbol $sym59$VISIT_DEFSTRUCT_OBJECT_SEARCH_STRUC_METHOD;
    private static final SubLString $str60$SEARCH_STRUC_resource_lock;
    private static final SubLSymbol $kw61$FREE;
    private static final SubLSymbol $sym62$SEARCH_NODE;
    private static final SubLSymbol $sym63$SEARCH_NODE_P;
    private static final SubLInteger $int64$151;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$PRINT_SNODE;
    private static final SubLSymbol $sym70$SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$SNODE_SEARCH;
    private static final SubLSymbol $sym73$_CSETF_SNODE_SEARCH;
    private static final SubLSymbol $sym74$SNODE_PARENT;
    private static final SubLSymbol $sym75$_CSETF_SNODE_PARENT;
    private static final SubLSymbol $sym76$SNODE_CHILDREN;
    private static final SubLSymbol $sym77$_CSETF_SNODE_CHILDREN;
    private static final SubLSymbol $sym78$SNODE_DEPTH;
    private static final SubLSymbol $sym79$_CSETF_SNODE_DEPTH;
    private static final SubLSymbol $sym80$SNODE_OPTIONS;
    private static final SubLSymbol $sym81$_CSETF_SNODE_OPTIONS;
    private static final SubLSymbol $sym82$SNODE_STATE;
    private static final SubLSymbol $sym83$_CSETF_SNODE_STATE;
    private static final SubLSymbol $kw84$SEARCH;
    private static final SubLSymbol $kw85$PARENT;
    private static final SubLSymbol $kw86$CHILDREN;
    private static final SubLSymbol $kw87$DEPTH;
    private static final SubLSymbol $kw88$OPTIONS;
    private static final SubLSymbol $sym89$MAKE_SEARCH_NODE;
    private static final SubLSymbol $sym90$VISIT_DEFSTRUCT_OBJECT_SEARCH_NODE_METHOD;
    private static final SubLString $str91$SEARCH_NODE_resource_lock;
    private static final SubLSymbol $kw92$UNDETERMINED;
    private static final SubLSymbol $sym93$DEAD_END_NODE_;
    private static final SubLSymbol $sym94$RECLAIM_SEARCH_NODE;
    private static final SubLString $str95$So_don_t;
    private static final SubLString $str96$Cannot_reclaim_strange_node__S;
    private static final SubLSymbol $kw97$ABORT_GENERIC_SEARCH;
    private static final SubLSymbol $kw98$ABORT;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLSymbol $kw101$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw102$NUMBER_CUT;
    private static final SubLSymbol $kw103$TIME_CUT;
    private static final SubLSymbol $kw104$DEPTH_CUT;
    private static final SubLSymbol $sym105$NUMBER;
    private static final SubLSymbol $sym106$TIME;
    private static final SubLSymbol $sym107$DEPTH_LIMIT_CROSSED;
    private static final SubLSymbol $sym108$ABORTED;
    private static final SubLSymbol $sym109$NEXT;
    private static final SubLSymbol $sym110$NEW_LEAVES;
    private static final SubLSymbol $sym111$PREVIOUS_GOALS;
    private static final SubLSymbol $sym112$NEW_GOALS;
    private static final SubLSymbol $sym113$INCREMENT_COUNT;
    private static final SubLSymbol $sym114$OPTIONS;
    private static final SubLSymbol $sym115$OPTION;
    private static final SubLSymbol $sym116$SELF_RE_ADDED_;
    private static final SubLSymbol $sym117$NEW_NODES;
    private static final SubLSymbol $sym118$NEW_NODE;
    private static final SubLSymbol $sym119$PREVIOUS_LEAVES;
    private static final SubLSymbol $sym120$CLET;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$FIF;
    private static final SubLSymbol $sym123$TIME_FROM_NOW;
    private static final SubLList $list124;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$CCATCH;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$CSETF;
    private static final SubLSymbol $sym129$UNTIL;
    private static final SubLSymbol $sym130$COR;
    private static final SubLSymbol $sym131$_INTERRUPT_GENERIC_SEARCH_;
    private static final SubLSymbol $sym132$CAND;
    private static final SubLSymbol $sym133$__;
    private static final SubLSymbol $sym134$TIME_HAS_ARRIVED_;
    private static final SubLSymbol $sym135$FUNCALL_SHORTCUT;
    private static final SubLSymbol $sym136$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym137$PCOND;
    private static final SubLSymbol $sym138$DOOMED_SEARCH_NODE_;
    private static final SubLSymbol $sym139$PWHEN;
    private static final SubLSymbol $sym140$CINC;
    private static final SubLSymbol $sym141$_RECLAIM_DEAD_END_SEARCH_NODES_;
    private static final SubLSymbol $sym142$GENERIC_SEARCH_RECLAIM_NODE;
    private static final SubLSymbol $sym143$CSETQ;
    private static final SubLList $list144;
    private static final SubLSymbol $sym145$CPUSH;
    private static final SubLSymbol $sym146$CDOLIST;
    private static final SubLSymbol $sym147$PIF;
    private static final SubLSymbol $sym148$GENERIC_SEARCH_LINK_CHILD_TO_PARENT;
    private static final SubLSymbol $sym149$NREVERSE;
    private static final SubLSymbol $sym150$PUNLESS;
    private static final SubLList $list151;
    private static final SubLList $list152;
    private static final SubLList $list153;
    private static final SubLList $list154;
    private static final SubLList $list155;
    private static final SubLList $list156;
    private static final SubLSymbol $kw157$INTERRUPT;
    private static final SubLSymbol $kw158$NUMBER;
    private static final SubLSymbol $kw159$TIME;
    private static final SubLSymbol $kw160$EXHAUST;
    private static final SubLSymbol $kw161$DOOMED;
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_struc_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_search(v_object, stream, (SubLObject)search.ZERO_INTEGER);
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_struc_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $search_struc_native.class) ? search.T : search.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_tree(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_leaves(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_goals(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_no_leaves_p_func(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_next_node_func(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_goal_p_func(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_add_goal_func(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_options_func(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_expand_func(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_add_node_func(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_too_deep_func(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_state(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_print_func(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_limbo(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField15();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject search_current_node(final SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.getField16();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_tree(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_leaves(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_goals(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_no_leaves_p_func(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_next_node_func(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_goal_p_func(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_add_goal_func(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_options_func(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_expand_func(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_add_node_func(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_too_deep_func(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_state(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_print_func(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_limbo(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField15(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject _csetf_search_current_node(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        return v_object.setField16(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject make_search_struc(SubLObject arglist) {
        if (arglist == search.UNPROVIDED) {
            arglist = (SubLObject)search.NIL;
        }
        final SubLObject v_new = (SubLObject)new $search_struc_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)search.NIL, next = arglist; search.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)search.$kw39$TREE)) {
                _csetf_search_tree(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw40$LEAVES)) {
                _csetf_search_leaves(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw41$GOALS)) {
                _csetf_search_goals(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw42$NO_LEAVES_P_FUNC)) {
                _csetf_search_no_leaves_p_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw43$NEXT_NODE_FUNC)) {
                _csetf_search_next_node_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw44$GOAL_P_FUNC)) {
                _csetf_search_goal_p_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw45$ADD_GOAL_FUNC)) {
                _csetf_search_add_goal_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw46$OPTIONS_FUNC)) {
                _csetf_search_options_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw47$EXPAND_FUNC)) {
                _csetf_search_expand_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw48$ADD_NODE_FUNC)) {
                _csetf_search_add_node_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw49$TOO_DEEP_FUNC)) {
                _csetf_search_too_deep_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw50$STATE)) {
                _csetf_search_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw51$PRINT_FUNC)) {
                _csetf_search_print_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw52$LIMBO)) {
                _csetf_search_limbo(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw53$CURRENT_NODE)) {
                _csetf_search_current_node(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)search.$str54$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject visit_defstruct_search_struc(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw55$BEGIN, (SubLObject)search.$sym56$MAKE_SEARCH_STRUC, (SubLObject)search.FIFTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw39$TREE, search_tree(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw40$LEAVES, search_leaves(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw41$GOALS, search_goals(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw42$NO_LEAVES_P_FUNC, search_no_leaves_p_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw43$NEXT_NODE_FUNC, search_next_node_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw44$GOAL_P_FUNC, search_goal_p_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw45$ADD_GOAL_FUNC, search_add_goal_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw46$OPTIONS_FUNC, search_options_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw47$EXPAND_FUNC, search_expand_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw48$ADD_NODE_FUNC, search_add_node_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw49$TOO_DEEP_FUNC, search_too_deep_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw50$STATE, search_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw51$PRINT_FUNC, search_print_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw52$LIMBO, search_limbo(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw53$CURRENT_NODE, search_current_node(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw58$END, (SubLObject)search.$sym56$MAKE_SEARCH_STRUC, (SubLObject)search.FIFTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 1113L)
    public static SubLObject visit_defstruct_object_search_struc_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_search_struc(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 2027L)
    public static SubLObject print_search(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject fun = search_print_func(v_object);
        if (search.NIL != fun) {
            Functions.funcall(fun, v_object, stream, depth);
        }
        else {
            compatibility.default_struct_print_function(v_object, stream, depth);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 2243L)
    public static SubLObject make_static_search_struc() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_object = (SubLObject)search.NIL;
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            v_object = make_search_struc((SubLObject)search.UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 2243L)
    public static SubLObject init_search_struc(final SubLObject v_search) {
        return v_search;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 2243L)
    public static SubLObject free_search_struc_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(search.NIL != search_struc_p(v_object) && search_leaves(v_object) == search.$kw61$FREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 2243L)
    public static SubLObject free_search_struc(SubLObject v_object) {
        assert search.NIL != search_struc_p(v_object) : v_object;
        if (search.NIL == free_search_struc_p(v_object)) {
            v_object = init_search_struc(v_object);
            _csetf_search_leaves(v_object, (SubLObject)search.$kw61$FREE);
            if (search.NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue()) {
                SubLObject release = (SubLObject)search.NIL;
                try {
                    release = Locks.seize_lock(search.$search_struc_free_lock$.getGlobalValue());
                    _csetf_search_tree(v_object, search.$search_struc_free_list$.getGlobalValue());
                    search.$search_struc_free_list$.setGlobalValue(v_object);
                }
                finally {
                    if (search.NIL != release) {
                        Locks.release_lock(search.$search_struc_free_lock$.getGlobalValue());
                    }
                }
            }
            return (SubLObject)search.T;
        }
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 2243L)
    public static SubLObject get_search_struc() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (search.NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue()) {
            SubLObject v_object = (SubLObject)search.NIL;
            SubLObject found = (SubLObject)search.NIL;
            SubLObject release = (SubLObject)search.NIL;
            try {
                release = Locks.seize_lock(search.$search_struc_free_lock$.getGlobalValue());
                v_object = search.$search_struc_free_list$.getGlobalValue();
                while (search.NIL == found && search.NIL != v_object) {
                    if (search.NIL != free_search_struc_p(v_object)) {
                        search.$search_struc_free_list$.setGlobalValue(search_tree(v_object));
                        found = (SubLObject)search.T;
                    }
                    else {
                        v_object = search_tree(v_object);
                    }
                }
                if (search.NIL == found) {
                    if (search.NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread)) {
                        v_object = make_static_search_struc();
                    }
                    else {
                        v_object = make_search_struc((SubLObject)search.UNPROVIDED);
                    }
                    search.$search_struc_free_list$.setGlobalValue((SubLObject)search.NIL);
                }
            }
            finally {
                if (search.NIL != release) {
                    Locks.release_lock(search.$search_struc_free_lock$.getGlobalValue());
                }
            }
            return init_search_struc(v_object);
        }
        if (search.NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread)) {
            return init_search_struc(make_static_search_struc());
        }
        return init_search_struc(make_search_struc((SubLObject)search.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 2360L)
    public static SubLObject new_search(final SubLObject no_leaves_p_func, final SubLObject next_node_func, final SubLObject goal_p_func, final SubLObject add_goal_func, final SubLObject options_func, final SubLObject expand_func, final SubLObject add_node_func, final SubLObject too_deep_func, SubLObject state, SubLObject print_func) {
        if (state == search.UNPROVIDED) {
            state = (SubLObject)search.NIL;
        }
        if (print_func == search.UNPROVIDED) {
            print_func = (SubLObject)search.NIL;
        }
        final SubLObject v_new = get_search_struc();
        _csetf_search_tree(v_new, (SubLObject)search.NIL);
        _csetf_search_leaves(v_new, (SubLObject)search.NIL);
        _csetf_search_no_leaves_p_func(v_new, no_leaves_p_func);
        _csetf_search_next_node_func(v_new, next_node_func);
        _csetf_search_goal_p_func(v_new, goal_p_func);
        _csetf_search_add_goal_func(v_new, add_goal_func);
        _csetf_search_options_func(v_new, options_func);
        _csetf_search_expand_func(v_new, expand_func);
        _csetf_search_add_node_func(v_new, add_node_func);
        _csetf_search_too_deep_func(v_new, too_deep_func);
        _csetf_search_state(v_new, state);
        _csetf_search_print_func(v_new, print_func);
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject search_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_snode(v_object, stream, (SubLObject)search.ZERO_INTEGER);
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject search_node_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $search_node_native.class) ? search.T : search.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject snode_search(final SubLObject v_object) {
        assert search.NIL != search_node_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject snode_parent(final SubLObject v_object) {
        assert search.NIL != search_node_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject snode_children(final SubLObject v_object) {
        assert search.NIL != search_node_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject snode_depth(final SubLObject v_object) {
        assert search.NIL != search_node_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject snode_options(final SubLObject v_object) {
        assert search.NIL != search_node_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject snode_state(final SubLObject v_object) {
        assert search.NIL != search_node_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject _csetf_snode_search(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_node_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject _csetf_snode_parent(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_node_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject _csetf_snode_children(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_node_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject _csetf_snode_depth(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_node_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject _csetf_snode_options(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_node_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject _csetf_snode_state(final SubLObject v_object, final SubLObject value) {
        assert search.NIL != search_node_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject make_search_node(SubLObject arglist) {
        if (arglist == search.UNPROVIDED) {
            arglist = (SubLObject)search.NIL;
        }
        final SubLObject v_new = (SubLObject)new $search_node_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)search.NIL, next = arglist; search.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)search.$kw84$SEARCH)) {
                _csetf_snode_search(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw85$PARENT)) {
                _csetf_snode_parent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw86$CHILDREN)) {
                _csetf_snode_children(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw87$DEPTH)) {
                _csetf_snode_depth(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw88$OPTIONS)) {
                _csetf_snode_options(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)search.$kw50$STATE)) {
                _csetf_snode_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)search.$str54$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject visit_defstruct_search_node(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw55$BEGIN, (SubLObject)search.$sym89$MAKE_SEARCH_NODE, (SubLObject)search.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw84$SEARCH, snode_search(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw85$PARENT, snode_parent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw86$CHILDREN, snode_children(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw87$DEPTH, snode_depth(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw88$OPTIONS, snode_options(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw57$SLOT, (SubLObject)search.$kw50$STATE, snode_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)search.$kw58$END, (SubLObject)search.$sym89$MAKE_SEARCH_NODE, (SubLObject)search.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3227L)
    public static SubLObject visit_defstruct_object_search_node_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_search_node(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3629L)
    public static SubLObject print_snode(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (search.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)search.T, (SubLObject)search.NIL);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)search.T, (SubLObject)search.T);
        }
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3782L)
    public static SubLObject make_static_search_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_object = (SubLObject)search.NIL;
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            v_object = make_search_node((SubLObject)search.UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3782L)
    public static SubLObject init_search_node(final SubLObject snode) {
        _csetf_snode_search(snode, (SubLObject)search.NIL);
        _csetf_snode_parent(snode, (SubLObject)search.NIL);
        _csetf_snode_children(snode, (SubLObject)search.NIL);
        _csetf_snode_depth(snode, (SubLObject)search.NIL);
        _csetf_snode_options(snode, (SubLObject)search.$kw92$UNDETERMINED);
        _csetf_snode_state(snode, (SubLObject)search.NIL);
        return snode;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3782L)
    public static SubLObject free_search_node_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(search.NIL != search_node_p(v_object) && snode_parent(v_object) == search.$kw61$FREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3782L)
    public static SubLObject free_search_node(SubLObject v_object) {
        assert search.NIL != search_node_p(v_object) : v_object;
        if (search.NIL == free_search_node_p(v_object)) {
            v_object = init_search_node(v_object);
            _csetf_snode_parent(v_object, (SubLObject)search.$kw61$FREE);
            if (search.NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue()) {
                SubLObject release = (SubLObject)search.NIL;
                try {
                    release = Locks.seize_lock(search.$search_node_free_lock$.getGlobalValue());
                    _csetf_snode_search(v_object, search.$search_node_free_list$.getGlobalValue());
                    search.$search_node_free_list$.setGlobalValue(v_object);
                }
                finally {
                    if (search.NIL != release) {
                        Locks.release_lock(search.$search_node_free_lock$.getGlobalValue());
                    }
                }
            }
            return (SubLObject)search.T;
        }
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 3782L)
    public static SubLObject get_search_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (search.NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue()) {
            SubLObject v_object = (SubLObject)search.NIL;
            SubLObject found = (SubLObject)search.NIL;
            SubLObject release = (SubLObject)search.NIL;
            try {
                release = Locks.seize_lock(search.$search_node_free_lock$.getGlobalValue());
                v_object = search.$search_node_free_list$.getGlobalValue();
                while (search.NIL == found && search.NIL != v_object) {
                    if (search.NIL != free_search_node_p(v_object)) {
                        search.$search_node_free_list$.setGlobalValue(snode_search(v_object));
                        found = (SubLObject)search.T;
                    }
                    else {
                        v_object = snode_search(v_object);
                    }
                }
                if (search.NIL == found) {
                    if (search.NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread)) {
                        v_object = make_static_search_node();
                    }
                    else {
                        v_object = make_search_node((SubLObject)search.UNPROVIDED);
                    }
                    search.$search_node_free_list$.setGlobalValue((SubLObject)search.NIL);
                }
            }
            finally {
                if (search.NIL != release) {
                    Locks.release_lock(search.$search_node_free_lock$.getGlobalValue());
                }
            }
            return init_search_node(v_object);
        }
        if (search.NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread)) {
            return init_search_node(make_static_search_node());
        }
        return init_search_node(make_search_node((SubLObject)search.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 4126L)
    public static SubLObject free_entire_search_node(final SubLObject snode, SubLObject state_free_func) {
        if (state_free_func == search.UNPROVIDED) {
            state_free_func = (SubLObject)search.NIL;
        }
        if (search.NIL != search_node_p(snode)) {
            SubLObject cdolist_list_var = snode_children(snode);
            SubLObject child = (SubLObject)search.NIL;
            child = cdolist_list_var.first();
            while (search.NIL != cdolist_list_var) {
                free_entire_search_node(child, state_free_func);
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            }
            if (search.NIL != state_free_func) {
                Functions.funcall(state_free_func, snode_state(snode));
            }
            free_search_node(snode);
        }
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 4834L)
    public static SubLObject dead_end_nodeP(final SubLObject node) {
        return (SubLObject)SubLObjectFactory.makeBoolean(search.NIL != search_node_p(node) && search.NIL == valid_snode_options(node) && search.NIL == snode_children(node));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 5066L)
    public static SubLObject reclaim_search_node(final SubLObject node) {
        if (search.NIL != search_node_p(node)) {
            final SubLObject parent = snode_parent(node);
            final SubLObject v_search = snode_search(node);
            free_entire_search_node(node, (SubLObject)search.UNPROVIDED);
            if (search.NIL != search_node_p(parent)) {
                final SubLObject siblings = snode_children(parent);
                _csetf_snode_children(parent, Sequences.delete(node, siblings, (SubLObject)search.UNPROVIDED, (SubLObject)search.UNPROVIDED, (SubLObject)search.UNPROVIDED, (SubLObject)search.UNPROVIDED, (SubLObject)search.UNPROVIDED));
                if (search.NIL != dead_end_nodeP(parent)) {
                    reclaim_search_node(parent);
                }
            }
            else if (search.NIL != search_struc_p(v_search) && search.NIL != conses_high.member(node, search_tree(v_search), (SubLObject)search.UNPROVIDED, (SubLObject)search.UNPROVIDED)) {
                remove_search_start_node(v_search, node);
            }
            else {
                Errors.cerror((SubLObject)search.$str95$So_don_t, (SubLObject)search.$str96$Cannot_reclaim_strange_node__S, node);
            }
        }
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 6084L)
    public static SubLObject interrupt_generic_search() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (search.NIL != search.$within_generic_search$.getDynamicValue(thread)) {
            search.$interrupt_generic_search$.setDynamicValue((SubLObject)search.T, thread);
            return (SubLObject)search.T;
        }
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 6329L)
    public static SubLObject abort_generic_search() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (search.NIL != search.$within_generic_search$.getDynamicValue(thread)) {
            Dynamic.sublisp_throw((SubLObject)search.$kw97$ABORT_GENERIC_SEARCH, (SubLObject)search.$kw98$ABORT);
        }
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 6510L)
    public static SubLObject do_generic_search(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search.$list99);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject reason = (SubLObject)search.NIL;
        SubLObject v_search = (SubLObject)search.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search.$list99);
        reason = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search.$list99);
        v_search = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)search.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)search.NIL;
        SubLObject current_$1 = (SubLObject)search.NIL;
        while (search.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)search.$list99);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)search.$list99);
            if (search.NIL == conses_high.member(current_$1, (SubLObject)search.$list100, (SubLObject)search.UNPROVIDED, (SubLObject)search.UNPROVIDED)) {
                bad = (SubLObject)search.T;
            }
            if (current_$1 == search.$kw101$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (search.NIL != bad && search.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)search.$list99);
        }
        final SubLObject number_cut_tail = cdestructuring_bind.property_list_member((SubLObject)search.$kw102$NUMBER_CUT, current);
        final SubLObject number_cut = (SubLObject)((search.NIL != number_cut_tail) ? conses_high.cadr(number_cut_tail) : search.NIL);
        final SubLObject time_cut_tail = cdestructuring_bind.property_list_member((SubLObject)search.$kw103$TIME_CUT, current);
        final SubLObject time_cut = (SubLObject)((search.NIL != time_cut_tail) ? conses_high.cadr(time_cut_tail) : search.NIL);
        final SubLObject depth_cut_tail = cdestructuring_bind.property_list_member((SubLObject)search.$kw104$DEPTH_CUT, current);
        final SubLObject depth_cut = (SubLObject)((search.NIL != depth_cut_tail) ? conses_high.cadr(depth_cut_tail) : search.NIL);
        current = temp;
        SubLObject no_leaves_p_func = (SubLObject)search.NIL;
        SubLObject next_node_func = (SubLObject)search.NIL;
        SubLObject goal_p_func = (SubLObject)search.NIL;
        SubLObject add_goal_func = (SubLObject)search.NIL;
        SubLObject too_deep_func = (SubLObject)search.NIL;
        SubLObject options_func = (SubLObject)search.NIL;
        SubLObject expand_func = (SubLObject)search.NIL;
        SubLObject add_node_func = (SubLObject)search.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search.$list99);
        no_leaves_p_func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search.$list99);
        next_node_func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search.$list99);
        goal_p_func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search.$list99);
        add_goal_func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search.$list99);
        too_deep_func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search.$list99);
        options_func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search.$list99);
        expand_func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search.$list99);
        add_node_func = current.first();
        current = current.rest();
        if (search.NIL == current) {
            final SubLObject number = (SubLObject)search.$sym105$NUMBER;
            final SubLObject time = (SubLObject)search.$sym106$TIME;
            final SubLObject depth_limit_crossed = (SubLObject)search.$sym107$DEPTH_LIMIT_CROSSED;
            final SubLObject aborted = (SubLObject)search.$sym108$ABORTED;
            final SubLObject next = (SubLObject)search.$sym109$NEXT;
            final SubLObject new_leaves = (SubLObject)search.$sym110$NEW_LEAVES;
            final SubLObject previous_goals = (SubLObject)search.$sym111$PREVIOUS_GOALS;
            final SubLObject new_goals = (SubLObject)search.$sym112$NEW_GOALS;
            final SubLObject increment_count = (SubLObject)search.$sym113$INCREMENT_COUNT;
            final SubLObject options = (SubLObject)search.$sym114$OPTIONS;
            final SubLObject option = (SubLObject)search.$sym115$OPTION;
            final SubLObject self_re_addedP = (SubLObject)search.$sym116$SELF_RE_ADDED_;
            final SubLObject new_nodes = (SubLObject)search.$sym117$NEW_NODES;
            final SubLObject new_node = (SubLObject)search.$sym118$NEW_NODE;
            final SubLObject previous_leaves = (SubLObject)search.$sym119$PREVIOUS_LEAVES;
            return (SubLObject)ConsesLow.list((SubLObject)search.$sym120$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(number, (SubLObject)search.$list121), (SubLObject)ConsesLow.list(time, (SubLObject)ConsesLow.listS((SubLObject)search.$sym122$FIF, time_cut, (SubLObject)ConsesLow.list((SubLObject)search.$sym123$TIME_FROM_NOW, time_cut), (SubLObject)search.$list124)), (SubLObject)ConsesLow.list(depth_limit_crossed, (SubLObject)ConsesLow.list((SubLObject)search.$sym35$SEARCH_LIMBO, v_search))), (SubLObject)ConsesLow.list((SubLObject)search.$sym120$CLET, (SubLObject)ConsesLow.list((SubLObject)search.$list125, aborted), (SubLObject)ConsesLow.list((SubLObject)search.$sym126$CCATCH, (SubLObject)search.$kw97$ABORT_GENERIC_SEARCH, aborted, (SubLObject)ConsesLow.list((SubLObject)search.$sym120$CLET, (SubLObject)search.$list127, (SubLObject)ConsesLow.listS((SubLObject)search.$sym128$CSETF, (SubLObject)ConsesLow.list((SubLObject)search.$sym37$SEARCH_CURRENT_NODE, v_search), (SubLObject)search.$list124), (SubLObject)ConsesLow.list((SubLObject)search.$sym129$UNTIL, (SubLObject)ConsesLow.list((SubLObject)search.$sym130$COR, (SubLObject)search.$sym131$_INTERRUPT_GENERIC_SEARCH_, (SubLObject)ConsesLow.list((SubLObject)search.$sym132$CAND, number_cut, (SubLObject)ConsesLow.list((SubLObject)search.$sym133$__, number, number_cut)), (SubLObject)ConsesLow.list((SubLObject)search.$sym132$CAND, time_cut, (SubLObject)ConsesLow.list((SubLObject)search.$sym134$TIME_HAS_ARRIVED_, time)), (SubLObject)ConsesLow.list((SubLObject)search.$sym135$FUNCALL_SHORTCUT, no_leaves_p_func, (SubLObject)ConsesLow.list((SubLObject)search.$sym11$SEARCH_LEAVES, v_search))), (SubLObject)ConsesLow.list((SubLObject)search.$sym136$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(next, new_leaves), (SubLObject)ConsesLow.list((SubLObject)search.$sym135$FUNCALL_SHORTCUT, next_node_func, (SubLObject)ConsesLow.list((SubLObject)search.$sym11$SEARCH_LEAVES, v_search)), (SubLObject)ConsesLow.list((SubLObject)search.$sym128$CSETF, (SubLObject)ConsesLow.list((SubLObject)search.$sym11$SEARCH_LEAVES, v_search), new_leaves), (SubLObject)ConsesLow.list((SubLObject)search.$sym137$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search.$sym138$DOOMED_SEARCH_NODE_, next)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search.$sym135$FUNCALL_SHORTCUT, goal_p_func, next), (SubLObject)ConsesLow.list((SubLObject)search.$sym120$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(previous_goals, (SubLObject)ConsesLow.list((SubLObject)search.$sym13$SEARCH_GOALS, v_search))), (SubLObject)ConsesLow.list((SubLObject)search.$sym136$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(new_goals, increment_count), (SubLObject)ConsesLow.list((SubLObject)search.$sym135$FUNCALL_SHORTCUT, add_goal_func, next, previous_goals), (SubLObject)ConsesLow.list((SubLObject)search.$sym128$CSETF, (SubLObject)ConsesLow.list((SubLObject)search.$sym13$SEARCH_GOALS, v_search), new_goals), (SubLObject)ConsesLow.list((SubLObject)search.$sym139$PWHEN, increment_count, (SubLObject)ConsesLow.list((SubLObject)search.$sym140$CINC, number))), (SubLObject)ConsesLow.listS((SubLObject)search.$sym128$CSETF, (SubLObject)ConsesLow.list((SubLObject)search.$sym80$SNODE_OPTIONS, next), (SubLObject)search.$list124), (SubLObject)ConsesLow.list((SubLObject)search.$sym139$PWHEN, (SubLObject)search.$sym141$_RECLAIM_DEAD_END_SEARCH_NODES_, (SubLObject)ConsesLow.list((SubLObject)search.$sym142$GENERIC_SEARCH_RECLAIM_NODE, next)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search.$sym135$FUNCALL_SHORTCUT, too_deep_func, next, depth_cut), (SubLObject)ConsesLow.listS((SubLObject)search.$sym143$CSETQ, depth_limit_crossed, (SubLObject)search.$list144), (SubLObject)ConsesLow.list((SubLObject)search.$sym145$CPUSH, next, (SubLObject)ConsesLow.list((SubLObject)search.$sym35$SEARCH_LIMBO, v_search))), (SubLObject)ConsesLow.list((SubLObject)search.T, (SubLObject)ConsesLow.list((SubLObject)search.$sym120$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(options, (SubLObject)ConsesLow.list((SubLObject)search.$sym135$FUNCALL_SHORTCUT, options_func, next)), self_re_addedP), (SubLObject)ConsesLow.list((SubLObject)search.$sym128$CSETF, (SubLObject)ConsesLow.list((SubLObject)search.$sym37$SEARCH_CURRENT_NODE, v_search), next), (SubLObject)ConsesLow.list((SubLObject)search.$sym146$CDOLIST, (SubLObject)ConsesLow.list(option, options), (SubLObject)ConsesLow.list((SubLObject)search.$sym120$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new_nodes, (SubLObject)ConsesLow.list((SubLObject)search.$sym135$FUNCALL_SHORTCUT, expand_func, next, option))), (SubLObject)ConsesLow.list((SubLObject)search.$sym139$PWHEN, new_nodes, (SubLObject)ConsesLow.list((SubLObject)search.$sym146$CDOLIST, (SubLObject)ConsesLow.list(new_node, new_nodes), (SubLObject)ConsesLow.list((SubLObject)search.$sym147$PIF, (SubLObject)ConsesLow.list((SubLObject)search.EQ, new_node, next), (SubLObject)ConsesLow.listS((SubLObject)search.$sym143$CSETQ, self_re_addedP, (SubLObject)search.$list144), (SubLObject)ConsesLow.list((SubLObject)search.$sym148$GENERIC_SEARCH_LINK_CHILD_TO_PARENT, new_node, next)), (SubLObject)ConsesLow.list((SubLObject)search.$sym120$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(previous_leaves, (SubLObject)ConsesLow.list((SubLObject)search.$sym11$SEARCH_LEAVES, v_search)), new_leaves), (SubLObject)ConsesLow.list((SubLObject)search.$sym143$CSETQ, new_leaves, (SubLObject)ConsesLow.list((SubLObject)search.$sym135$FUNCALL_SHORTCUT, add_node_func, new_node, previous_leaves)), (SubLObject)ConsesLow.list((SubLObject)search.$sym128$CSETF, (SubLObject)ConsesLow.list((SubLObject)search.$sym11$SEARCH_LEAVES, v_search), new_leaves)))))), (SubLObject)ConsesLow.listS((SubLObject)search.$sym128$CSETF, (SubLObject)ConsesLow.list((SubLObject)search.$sym37$SEARCH_CURRENT_NODE, v_search), (SubLObject)search.$list124), (SubLObject)ConsesLow.list((SubLObject)search.$sym128$CSETF, (SubLObject)ConsesLow.list((SubLObject)search.$sym76$SNODE_CHILDREN, next), (SubLObject)ConsesLow.list((SubLObject)search.$sym149$NREVERSE, (SubLObject)ConsesLow.list((SubLObject)search.$sym76$SNODE_CHILDREN, next))), (SubLObject)ConsesLow.list((SubLObject)search.$sym150$PUNLESS, self_re_addedP, (SubLObject)ConsesLow.list((SubLObject)search.$sym139$PWHEN, (SubLObject)search.$sym141$_RECLAIM_DEAD_END_SEARCH_NODES_, (SubLObject)ConsesLow.list((SubLObject)search.$sym142$GENERIC_SEARCH_RECLAIM_NODE, next)))))))))), (SubLObject)ConsesLow.list((SubLObject)search.$sym137$PCOND, (SubLObject)ConsesLow.list(aborted, (SubLObject)ConsesLow.listS((SubLObject)search.$sym143$CSETQ, reason, (SubLObject)search.$list151)), (SubLObject)ConsesLow.list((SubLObject)search.$sym131$_INTERRUPT_GENERIC_SEARCH_, (SubLObject)ConsesLow.listS((SubLObject)search.$sym143$CSETQ, reason, (SubLObject)search.$list152)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search.$sym132$CAND, number_cut, (SubLObject)ConsesLow.list((SubLObject)search.$sym133$__, number, number_cut)), (SubLObject)ConsesLow.listS((SubLObject)search.$sym143$CSETQ, reason, (SubLObject)search.$list153)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search.$sym132$CAND, time_cut, (SubLObject)ConsesLow.list((SubLObject)search.$sym134$TIME_HAS_ARRIVED_, time)), (SubLObject)ConsesLow.listS((SubLObject)search.$sym143$CSETQ, reason, (SubLObject)search.$list154)), (SubLObject)ConsesLow.list(depth_limit_crossed, (SubLObject)ConsesLow.listS((SubLObject)search.$sym143$CSETQ, reason, (SubLObject)search.$list155)), (SubLObject)ConsesLow.list((SubLObject)search.T, (SubLObject)ConsesLow.listS((SubLObject)search.$sym143$CSETQ, reason, (SubLObject)search.$list156)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)search.$list99);
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 10982L)
    public static SubLObject generic_search(final SubLObject v_search, SubLObject number_cut, SubLObject time_cut, SubLObject depth_cut) {
        if (number_cut == search.UNPROVIDED) {
            number_cut = (SubLObject)search.NIL;
        }
        if (time_cut == search.UNPROVIDED) {
            time_cut = (SubLObject)search.NIL;
        }
        if (depth_cut == search.UNPROVIDED) {
            depth_cut = (SubLObject)search.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject no_leaves_p_func = search_no_leaves_p_func(v_search);
        final SubLObject next_node_func = search_next_node_func(v_search);
        final SubLObject goal_p_func = search_goal_p_func(v_search);
        final SubLObject add_goal_func = search_add_goal_func(v_search);
        final SubLObject too_deep_func = search_too_deep_func(v_search);
        final SubLObject options_func = search_options_func(v_search);
        final SubLObject expand_func = search_expand_func(v_search);
        final SubLObject add_node_func = search_add_node_func(v_search);
        SubLObject reason = (SubLObject)search.NIL;
        SubLObject number = (SubLObject)search.ZERO_INTEGER;
        final SubLObject time = (SubLObject)((search.NIL != time_cut) ? numeric_date_utilities.time_from_now(time_cut) : search.NIL);
        SubLObject depth_limit_crossed = search_limbo(v_search);
        final SubLObject _prev_bind_0 = search.$interrupt_generic_search$.currentBinding(thread);
        try {
            search.$interrupt_generic_search$.bind((SubLObject)search.NIL, thread);
            SubLObject aborted = (SubLObject)search.NIL;
            try {
                thread.throwStack.push(search.$kw97$ABORT_GENERIC_SEARCH);
                final SubLObject _prev_bind_0_$2 = search.$within_generic_search$.currentBinding(thread);
                try {
                    search.$within_generic_search$.bind((SubLObject)search.T, thread);
                    _csetf_search_current_node(v_search, (SubLObject)search.NIL);
                    while (search.NIL == search.$interrupt_generic_search$.getDynamicValue(thread) && (search.NIL == number_cut || !number.numGE(number_cut)) && (search.NIL == time_cut || search.NIL == Time.time_has_arrivedP(time)) && search.NIL == Functions.funcall(no_leaves_p_func, search_leaves(v_search))) {
                        thread.resetMultipleValues();
                        final SubLObject next = Functions.funcall(next_node_func, search_leaves(v_search));
                        final SubLObject new_leaves = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        _csetf_search_leaves(v_search, new_leaves);
                        if (search.NIL != doomed_search_nodeP(next)) {
                            continue;
                        }
                        if (search.NIL != Functions.funcall(goal_p_func, next)) {
                            final SubLObject previous_goals = search_goals(v_search);
                            thread.resetMultipleValues();
                            final SubLObject new_goals = Functions.funcall(add_goal_func, next, previous_goals);
                            final SubLObject increment_count = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            _csetf_search_goals(v_search, new_goals);
                            if (search.NIL != increment_count) {
                                number = Numbers.add(number, (SubLObject)search.ONE_INTEGER);
                            }
                            _csetf_snode_options(next, (SubLObject)search.NIL);
                            if (search.NIL == search.$reclaim_dead_end_search_nodes$.getDynamicValue(thread)) {
                                continue;
                            }
                            generic_search_reclaim_node(next);
                        }
                        else if (search.NIL != Functions.funcall(too_deep_func, next, depth_cut)) {
                            depth_limit_crossed = (SubLObject)search.T;
                            _csetf_search_limbo(v_search, (SubLObject)ConsesLow.cons(next, search_limbo(v_search)));
                        }
                        else {
                            final SubLObject options = Functions.funcall(options_func, next);
                            SubLObject self_re_addedP = (SubLObject)search.NIL;
                            _csetf_search_current_node(v_search, next);
                            SubLObject cdolist_list_var = options;
                            SubLObject option = (SubLObject)search.NIL;
                            option = cdolist_list_var.first();
                            while (search.NIL != cdolist_list_var) {
                                final SubLObject new_nodes = Functions.funcall(expand_func, next, option);
                                if (search.NIL != new_nodes) {
                                    SubLObject cdolist_list_var_$3 = new_nodes;
                                    SubLObject new_node = (SubLObject)search.NIL;
                                    new_node = cdolist_list_var_$3.first();
                                    while (search.NIL != cdolist_list_var_$3) {
                                        if (new_node.eql(next)) {
                                            self_re_addedP = (SubLObject)search.T;
                                        }
                                        else {
                                            generic_search_link_child_to_parent(new_node, next);
                                        }
                                        final SubLObject previous_leaves = search_leaves(v_search);
                                        SubLObject new_leaves_$4 = (SubLObject)search.NIL;
                                        new_leaves_$4 = Functions.funcall(add_node_func, new_node, previous_leaves);
                                        _csetf_search_leaves(v_search, new_leaves_$4);
                                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                        new_node = cdolist_list_var_$3.first();
                                    }
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                option = cdolist_list_var.first();
                            }
                            _csetf_search_current_node(v_search, (SubLObject)search.NIL);
                            _csetf_snode_children(next, Sequences.nreverse(snode_children(next)));
                            if (search.NIL != self_re_addedP || search.NIL == search.$reclaim_dead_end_search_nodes$.getDynamicValue(thread)) {
                                continue;
                            }
                            generic_search_reclaim_node(next);
                        }
                    }
                }
                finally {
                    search.$within_generic_search$.rebind(_prev_bind_0_$2, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                aborted = Errors.handleThrowable(ccatch_env_var, (SubLObject)search.$kw97$ABORT_GENERIC_SEARCH);
            }
            finally {
                thread.throwStack.pop();
            }
            if (search.NIL != aborted) {
                reason = (SubLObject)search.$kw98$ABORT;
            }
            else if (search.NIL != search.$interrupt_generic_search$.getDynamicValue(thread)) {
                reason = (SubLObject)search.$kw157$INTERRUPT;
            }
            else if (search.NIL != number_cut && number.numGE(number_cut)) {
                reason = (SubLObject)search.$kw158$NUMBER;
            }
            else if (search.NIL != time_cut && search.NIL != Time.time_has_arrivedP(time)) {
                reason = (SubLObject)search.$kw159$TIME;
            }
            else if (search.NIL != depth_limit_crossed) {
                reason = (SubLObject)search.$kw87$DEPTH;
            }
            else {
                reason = (SubLObject)search.$kw160$EXHAUST;
            }
        }
        finally {
            search.$interrupt_generic_search$.rebind(_prev_bind_0, thread);
        }
        return reason;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 12300L)
    public static SubLObject generic_search_reclaim_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (search.NIL != Functions.funcall(search.$dead_end_node_function$.getDynamicValue(thread), node)) {
            Functions.funcall(search.$reclaim_dead_end_node_function$.getDynamicValue(thread), node);
        }
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 12483L)
    public static SubLObject generic_search_link_child_to_parent(final SubLObject child, final SubLObject parent) {
        _csetf_snode_parent(child, parent);
        _csetf_snode_search(child, snode_search(parent));
        _csetf_snode_depth(child, Numbers.add((SubLObject)search.ONE_INTEGER, snode_depth(parent)));
        _csetf_snode_children(parent, (SubLObject)ConsesLow.cons(child, snode_children(parent)));
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 12790L)
    public static SubLObject reset_search_node_state(final SubLObject node, final SubLObject state) {
        _csetf_snode_state(node, state);
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 12898L)
    public static SubLObject new_search_node(final SubLObject state) {
        final SubLObject v_new = get_search_node();
        reset_search_node_state(v_new, state);
        _csetf_snode_options(v_new, (SubLObject)search.$kw92$UNDETERMINED);
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 13089L)
    public static SubLObject new_search_start_node(final SubLObject v_search) {
        final SubLObject start_node = new_search_node((SubLObject)search.NIL);
        _csetf_snode_search(start_node, v_search);
        _csetf_snode_parent(start_node, (SubLObject)search.NIL);
        _csetf_snode_children(start_node, (SubLObject)search.NIL);
        _csetf_snode_depth(start_node, (SubLObject)search.ZERO_INTEGER);
        return start_node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 13462L)
    public static SubLObject register_search_start_node(final SubLObject v_search, final SubLObject start_node) {
        _csetf_search_tree(v_search, (SubLObject)ConsesLow.cons(start_node, search_tree(v_search)));
        _csetf_search_leaves(v_search, Functions.funcall(search_add_node_func(v_search), start_node, search_leaves(v_search)));
        return start_node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 13761L)
    public static SubLObject add_search_start_node(final SubLObject v_search, final SubLObject state) {
        final SubLObject start_node = new_search_start_node(v_search);
        reset_search_node_state(start_node, state);
        return register_search_start_node(v_search, start_node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 13977L)
    public static SubLObject remove_search_start_node(final SubLObject v_search, final SubLObject start_node) {
        _csetf_search_tree(v_search, Sequences.delete(start_node, search_tree(v_search), (SubLObject)search.UNPROVIDED, (SubLObject)search.UNPROVIDED, (SubLObject)search.UNPROVIDED, (SubLObject)search.UNPROVIDED, (SubLObject)search.UNPROVIDED));
        return v_search;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 14141L)
    public static SubLObject reconsider_limbo(final SubLObject v_search, final SubLObject depth_cut) {
        final SubLObject add_node_func = search_add_node_func(v_search);
        final SubLObject too_deep_func = search_too_deep_func(v_search);
        SubLObject leaves = search_leaves(v_search);
        final SubLObject limbo = search_limbo(v_search);
        SubLObject revived = (SubLObject)search.NIL;
        SubLObject still_in_limbo = (SubLObject)search.NIL;
        SubLObject cdolist_list_var = limbo;
        SubLObject node = (SubLObject)search.NIL;
        node = cdolist_list_var.first();
        while (search.NIL != cdolist_list_var) {
            if (search.NIL != Functions.funcall(too_deep_func, node, depth_cut)) {
                still_in_limbo = (SubLObject)ConsesLow.cons(node, still_in_limbo);
            }
            else {
                revived = (SubLObject)ConsesLow.cons(node, revived);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        }
        _csetf_search_limbo(v_search, Sequences.nreverse(still_in_limbo));
        cdolist_list_var = Sequences.nreverse(revived);
        node = (SubLObject)search.NIL;
        node = cdolist_list_var.first();
        while (search.NIL != cdolist_list_var) {
            leaves = Functions.funcall(add_node_func, node, leaves);
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        }
        _csetf_search_leaves(v_search, leaves);
        return v_search;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 14872L)
    public static SubLObject valid_snode_options(final SubLObject node) {
        if (search.NIL == doomed_search_nodeP(node)) {
            return snode_options(node);
        }
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 15050L)
    public static SubLObject set_valid_snode_options(final SubLObject node, final SubLObject value) {
        if (search.NIL == doomed_search_nodeP(node)) {
            _csetf_snode_options(node, value);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 15189L)
    public static SubLObject doomed_search_nodeP(final SubLObject node) {
        assert search.NIL != search_node_p(node) : node;
        return Equality.eq(snode_options(node), (SubLObject)search.$kw161$DOOMED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 15302L)
    public static SubLObject mark_node_as_doomed(final SubLObject node) {
        if (search.NIL != node && search.NIL == doomed_search_nodeP(node)) {
            _csetf_snode_options(node, (SubLObject)search.$kw161$DOOMED);
            SubLObject cdolist_list_var = snode_children(node);
            SubLObject child_node = (SubLObject)search.NIL;
            child_node = cdolist_list_var.first();
            while (search.NIL != cdolist_list_var) {
                mark_node_as_doomed(child_node);
                cdolist_list_var = cdolist_list_var.rest();
                child_node = cdolist_list_var.first();
            }
        }
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 15536L)
    public static SubLObject search_current_path(final SubLObject v_search) {
        return Sequences.nreverse(search_current_path_internal(search_current_node(v_search)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 15727L)
    public static SubLObject search_current_path_internal(final SubLObject snode) {
        if (search.NIL != search_node_p(snode)) {
            return (SubLObject)ConsesLow.cons(snode, search_current_path_internal(snode_parent(snode)));
        }
        return (SubLObject)search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 15921L)
    public static SubLObject remaining_time_cutoff(final SubLObject start_time, final SubLObject initial_time_cutoff) {
        if (search.NIL == initial_time_cutoff) {
            return (SubLObject)search.NIL;
        }
        return Numbers.max((SubLObject)search.ZERO_INTEGER, Numbers.subtract(initial_time_cutoff, Numbers.subtract(Time.get_universal_time(), start_time)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 16201L)
    public static SubLObject search_size(final SubLObject v_search) {
        assert search.NIL != search_struc_p(v_search) : v_search;
        SubLObject total = (SubLObject)search.ZERO_INTEGER;
        SubLObject cdolist_list_var = search_tree(v_search);
        SubLObject snode = (SubLObject)search.NIL;
        snode = cdolist_list_var.first();
        while (search.NIL != cdolist_list_var) {
            total = Numbers.add(total, search_node_size(snode));
            cdolist_list_var = cdolist_list_var.rest();
            snode = cdolist_list_var.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/search.lisp", position = 16457L)
    public static SubLObject search_node_size(final SubLObject snode) {
        if (search.NIL != search_node_p(snode)) {
            SubLObject total = (SubLObject)search.ONE_INTEGER;
            SubLObject cdolist_list_var = snode_children(snode);
            SubLObject child = (SubLObject)search.NIL;
            child = cdolist_list_var.first();
            while (search.NIL != cdolist_list_var) {
                total = Numbers.add(total, search_node_size(child));
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            }
            return total;
        }
        return (SubLObject)search.ZERO_INTEGER;
    }
    
    public static SubLObject declare_search_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_struc_print_function_trampoline", "SEARCH-STRUC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_struc_p", "SEARCH-STRUC-P", 1, 0, false);
        new $search_struc_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_tree", "SEARCH-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_leaves", "SEARCH-LEAVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_goals", "SEARCH-GOALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_no_leaves_p_func", "SEARCH-NO-LEAVES-P-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_next_node_func", "SEARCH-NEXT-NODE-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_goal_p_func", "SEARCH-GOAL-P-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_add_goal_func", "SEARCH-ADD-GOAL-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_options_func", "SEARCH-OPTIONS-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_expand_func", "SEARCH-EXPAND-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_add_node_func", "SEARCH-ADD-NODE-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_too_deep_func", "SEARCH-TOO-DEEP-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_state", "SEARCH-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_print_func", "SEARCH-PRINT-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_limbo", "SEARCH-LIMBO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_current_node", "SEARCH-CURRENT-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_tree", "_CSETF-SEARCH-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_leaves", "_CSETF-SEARCH-LEAVES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_goals", "_CSETF-SEARCH-GOALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_no_leaves_p_func", "_CSETF-SEARCH-NO-LEAVES-P-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_next_node_func", "_CSETF-SEARCH-NEXT-NODE-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_goal_p_func", "_CSETF-SEARCH-GOAL-P-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_add_goal_func", "_CSETF-SEARCH-ADD-GOAL-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_options_func", "_CSETF-SEARCH-OPTIONS-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_expand_func", "_CSETF-SEARCH-EXPAND-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_add_node_func", "_CSETF-SEARCH-ADD-NODE-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_too_deep_func", "_CSETF-SEARCH-TOO-DEEP-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_state", "_CSETF-SEARCH-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_print_func", "_CSETF-SEARCH-PRINT-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_limbo", "_CSETF-SEARCH-LIMBO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_search_current_node", "_CSETF-SEARCH-CURRENT-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "make_search_struc", "MAKE-SEARCH-STRUC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "visit_defstruct_search_struc", "VISIT-DEFSTRUCT-SEARCH-STRUC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "visit_defstruct_object_search_struc_method", "VISIT-DEFSTRUCT-OBJECT-SEARCH-STRUC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "print_search", "PRINT-SEARCH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "make_static_search_struc", "MAKE-STATIC-SEARCH-STRUC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "init_search_struc", "INIT-SEARCH-STRUC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "free_search_struc_p", "FREE-SEARCH-STRUC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "free_search_struc", "FREE-SEARCH-STRUC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "get_search_struc", "GET-SEARCH-STRUC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "new_search", "NEW-SEARCH", 8, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_node_print_function_trampoline", "SEARCH-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_node_p", "SEARCH-NODE-P", 1, 0, false);
        new $search_node_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "snode_search", "SNODE-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "snode_parent", "SNODE-PARENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "snode_children", "SNODE-CHILDREN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "snode_depth", "SNODE-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "snode_options", "SNODE-OPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "snode_state", "SNODE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_snode_search", "_CSETF-SNODE-SEARCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_snode_parent", "_CSETF-SNODE-PARENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_snode_children", "_CSETF-SNODE-CHILDREN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_snode_depth", "_CSETF-SNODE-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_snode_options", "_CSETF-SNODE-OPTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "_csetf_snode_state", "_CSETF-SNODE-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "make_search_node", "MAKE-SEARCH-NODE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "visit_defstruct_search_node", "VISIT-DEFSTRUCT-SEARCH-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "visit_defstruct_object_search_node_method", "VISIT-DEFSTRUCT-OBJECT-SEARCH-NODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "print_snode", "PRINT-SNODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "make_static_search_node", "MAKE-STATIC-SEARCH-NODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "init_search_node", "INIT-SEARCH-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "free_search_node_p", "FREE-SEARCH-NODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "free_search_node", "FREE-SEARCH-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "get_search_node", "GET-SEARCH-NODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "free_entire_search_node", "FREE-ENTIRE-SEARCH-NODE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "dead_end_nodeP", "DEAD-END-NODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "reclaim_search_node", "RECLAIM-SEARCH-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "interrupt_generic_search", "INTERRUPT-GENERIC-SEARCH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "abort_generic_search", "ABORT-GENERIC-SEARCH", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.search", "do_generic_search", "DO-GENERIC-SEARCH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "generic_search", "GENERIC-SEARCH", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "generic_search_reclaim_node", "GENERIC-SEARCH-RECLAIM-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "generic_search_link_child_to_parent", "GENERIC-SEARCH-LINK-CHILD-TO-PARENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "reset_search_node_state", "RESET-SEARCH-NODE-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "new_search_node", "NEW-SEARCH-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "new_search_start_node", "NEW-SEARCH-START-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "register_search_start_node", "REGISTER-SEARCH-START-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "add_search_start_node", "ADD-SEARCH-START-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "remove_search_start_node", "REMOVE-SEARCH-START-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "reconsider_limbo", "RECONSIDER-LIMBO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "valid_snode_options", "VALID-SNODE-OPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "set_valid_snode_options", "SET-VALID-SNODE-OPTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "doomed_search_nodeP", "DOOMED-SEARCH-NODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "mark_node_as_doomed", "MARK-NODE-AS-DOOMED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_current_path", "SEARCH-CURRENT-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_current_path_internal", "SEARCH-CURRENT-PATH-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "remaining_time_cutoff", "REMAINING-TIME-CUTOFF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_size", "SEARCH-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.search", "search_node_size", "SEARCH-NODE-SIZE", 1, 0, false);
        return (SubLObject)search.NIL;
    }
    
    public static SubLObject init_search_file() {
        search.$dtp_search_struc$ = SubLFiles.defconstant("*DTP-SEARCH-STRUC*", (SubLObject)search.$sym0$SEARCH_STRUC);
        search.$search_struc_free_list$ = SubLFiles.deflexical("*SEARCH-STRUC-FREE-LIST*", (SubLObject)search.NIL);
        search.$search_struc_free_lock$ = SubLFiles.deflexical("*SEARCH-STRUC-FREE-LOCK*", Locks.make_lock((SubLObject)search.$str60$SEARCH_STRUC_resource_lock));
        search.$dtp_search_node$ = SubLFiles.defconstant("*DTP-SEARCH-NODE*", (SubLObject)search.$sym62$SEARCH_NODE);
        search.$search_node_free_list$ = SubLFiles.deflexical("*SEARCH-NODE-FREE-LIST*", (SubLObject)search.NIL);
        search.$search_node_free_lock$ = SubLFiles.deflexical("*SEARCH-NODE-FREE-LOCK*", Locks.make_lock((SubLObject)search.$str91$SEARCH_NODE_resource_lock));
        search.$reclaim_dead_end_search_nodes$ = SubLFiles.defparameter("*RECLAIM-DEAD-END-SEARCH-NODES*", (SubLObject)search.T);
        search.$dead_end_node_function$ = SubLFiles.defparameter("*DEAD-END-NODE-FUNCTION*", (SubLObject)search.$sym93$DEAD_END_NODE_);
        search.$reclaim_dead_end_node_function$ = SubLFiles.defparameter("*RECLAIM-DEAD-END-NODE-FUNCTION*", (SubLObject)search.$sym94$RECLAIM_SEARCH_NODE);
        search.$within_generic_search$ = SubLFiles.defparameter("*WITHIN-GENERIC-SEARCH*", (SubLObject)search.NIL);
        search.$interrupt_generic_search$ = SubLFiles.defparameter("*INTERRUPT-GENERIC-SEARCH*", (SubLObject)search.NIL);
        return (SubLObject)search.NIL;
    }
    
    public static SubLObject setup_search_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), search.$dtp_search_struc$.getGlobalValue(), Symbols.symbol_function((SubLObject)search.$sym7$SEARCH_STRUC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)search.$list8);
        Structures.def_csetf((SubLObject)search.$sym9$SEARCH_TREE, (SubLObject)search.$sym10$_CSETF_SEARCH_TREE);
        Structures.def_csetf((SubLObject)search.$sym11$SEARCH_LEAVES, (SubLObject)search.$sym12$_CSETF_SEARCH_LEAVES);
        Structures.def_csetf((SubLObject)search.$sym13$SEARCH_GOALS, (SubLObject)search.$sym14$_CSETF_SEARCH_GOALS);
        Structures.def_csetf((SubLObject)search.$sym15$SEARCH_NO_LEAVES_P_FUNC, (SubLObject)search.$sym16$_CSETF_SEARCH_NO_LEAVES_P_FUNC);
        Structures.def_csetf((SubLObject)search.$sym17$SEARCH_NEXT_NODE_FUNC, (SubLObject)search.$sym18$_CSETF_SEARCH_NEXT_NODE_FUNC);
        Structures.def_csetf((SubLObject)search.$sym19$SEARCH_GOAL_P_FUNC, (SubLObject)search.$sym20$_CSETF_SEARCH_GOAL_P_FUNC);
        Structures.def_csetf((SubLObject)search.$sym21$SEARCH_ADD_GOAL_FUNC, (SubLObject)search.$sym22$_CSETF_SEARCH_ADD_GOAL_FUNC);
        Structures.def_csetf((SubLObject)search.$sym23$SEARCH_OPTIONS_FUNC, (SubLObject)search.$sym24$_CSETF_SEARCH_OPTIONS_FUNC);
        Structures.def_csetf((SubLObject)search.$sym25$SEARCH_EXPAND_FUNC, (SubLObject)search.$sym26$_CSETF_SEARCH_EXPAND_FUNC);
        Structures.def_csetf((SubLObject)search.$sym27$SEARCH_ADD_NODE_FUNC, (SubLObject)search.$sym28$_CSETF_SEARCH_ADD_NODE_FUNC);
        Structures.def_csetf((SubLObject)search.$sym29$SEARCH_TOO_DEEP_FUNC, (SubLObject)search.$sym30$_CSETF_SEARCH_TOO_DEEP_FUNC);
        Structures.def_csetf((SubLObject)search.$sym31$SEARCH_STATE, (SubLObject)search.$sym32$_CSETF_SEARCH_STATE);
        Structures.def_csetf((SubLObject)search.$sym33$SEARCH_PRINT_FUNC, (SubLObject)search.$sym34$_CSETF_SEARCH_PRINT_FUNC);
        Structures.def_csetf((SubLObject)search.$sym35$SEARCH_LIMBO, (SubLObject)search.$sym36$_CSETF_SEARCH_LIMBO);
        Structures.def_csetf((SubLObject)search.$sym37$SEARCH_CURRENT_NODE, (SubLObject)search.$sym38$_CSETF_SEARCH_CURRENT_NODE);
        Equality.identity((SubLObject)search.$sym0$SEARCH_STRUC);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), search.$dtp_search_struc$.getGlobalValue(), Symbols.symbol_function((SubLObject)search.$sym59$VISIT_DEFSTRUCT_OBJECT_SEARCH_STRUC_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), search.$dtp_search_node$.getGlobalValue(), Symbols.symbol_function((SubLObject)search.$sym70$SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)search.$list71);
        Structures.def_csetf((SubLObject)search.$sym72$SNODE_SEARCH, (SubLObject)search.$sym73$_CSETF_SNODE_SEARCH);
        Structures.def_csetf((SubLObject)search.$sym74$SNODE_PARENT, (SubLObject)search.$sym75$_CSETF_SNODE_PARENT);
        Structures.def_csetf((SubLObject)search.$sym76$SNODE_CHILDREN, (SubLObject)search.$sym77$_CSETF_SNODE_CHILDREN);
        Structures.def_csetf((SubLObject)search.$sym78$SNODE_DEPTH, (SubLObject)search.$sym79$_CSETF_SNODE_DEPTH);
        Structures.def_csetf((SubLObject)search.$sym80$SNODE_OPTIONS, (SubLObject)search.$sym81$_CSETF_SNODE_OPTIONS);
        Structures.def_csetf((SubLObject)search.$sym82$SNODE_STATE, (SubLObject)search.$sym83$_CSETF_SNODE_STATE);
        Equality.identity((SubLObject)search.$sym62$SEARCH_NODE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), search.$dtp_search_node$.getGlobalValue(), Symbols.symbol_function((SubLObject)search.$sym90$VISIT_DEFSTRUCT_OBJECT_SEARCH_NODE_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)search.$sym69$PRINT_SNODE);
        return (SubLObject)search.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_search_file();
    }
    
    @Override
	public void initializeVariables() {
        init_search_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_search_file();
    }
    
    static {
        me = (SubLFile)new search();
        search.$dtp_search_struc$ = null;
        search.$search_struc_free_list$ = null;
        search.$search_struc_free_lock$ = null;
        search.$dtp_search_node$ = null;
        search.$search_node_free_list$ = null;
        search.$search_node_free_lock$ = null;
        search.$reclaim_dead_end_search_nodes$ = null;
        search.$dead_end_node_function$ = null;
        search.$reclaim_dead_end_node_function$ = null;
        search.$within_generic_search$ = null;
        search.$interrupt_generic_search$ = null;
        $sym0$SEARCH_STRUC = SubLObjectFactory.makeSymbol("SEARCH-STRUC");
        $sym1$SEARCH_STRUC_P = SubLObjectFactory.makeSymbol("SEARCH-STRUC-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TREE"), SubLObjectFactory.makeSymbol("LEAVES"), SubLObjectFactory.makeSymbol("GOALS"), SubLObjectFactory.makeSymbol("NO-LEAVES-P-FUNC"), SubLObjectFactory.makeSymbol("NEXT-NODE-FUNC"), SubLObjectFactory.makeSymbol("GOAL-P-FUNC"), SubLObjectFactory.makeSymbol("ADD-GOAL-FUNC"), SubLObjectFactory.makeSymbol("OPTIONS-FUNC"), SubLObjectFactory.makeSymbol("EXPAND-FUNC"), SubLObjectFactory.makeSymbol("ADD-NODE-FUNC"), SubLObjectFactory.makeSymbol("TOO-DEEP-FUNC"), SubLObjectFactory.makeSymbol("STATE"), SubLObjectFactory.makeSymbol("PRINT-FUNC"), SubLObjectFactory.makeSymbol("LIMBO"), SubLObjectFactory.makeSymbol("CURRENT-NODE") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TREE"), SubLObjectFactory.makeKeyword("LEAVES"), SubLObjectFactory.makeKeyword("GOALS"), SubLObjectFactory.makeKeyword("NO-LEAVES-P-FUNC"), SubLObjectFactory.makeKeyword("NEXT-NODE-FUNC"), SubLObjectFactory.makeKeyword("GOAL-P-FUNC"), SubLObjectFactory.makeKeyword("ADD-GOAL-FUNC"), SubLObjectFactory.makeKeyword("OPTIONS-FUNC"), SubLObjectFactory.makeKeyword("EXPAND-FUNC"), SubLObjectFactory.makeKeyword("ADD-NODE-FUNC"), SubLObjectFactory.makeKeyword("TOO-DEEP-FUNC"), SubLObjectFactory.makeKeyword("STATE"), SubLObjectFactory.makeKeyword("PRINT-FUNC"), SubLObjectFactory.makeKeyword("LIMBO"), SubLObjectFactory.makeKeyword("CURRENT-NODE") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SEARCH-TREE"), SubLObjectFactory.makeSymbol("SEARCH-LEAVES"), SubLObjectFactory.makeSymbol("SEARCH-GOALS"), SubLObjectFactory.makeSymbol("SEARCH-NO-LEAVES-P-FUNC"), SubLObjectFactory.makeSymbol("SEARCH-NEXT-NODE-FUNC"), SubLObjectFactory.makeSymbol("SEARCH-GOAL-P-FUNC"), SubLObjectFactory.makeSymbol("SEARCH-ADD-GOAL-FUNC"), SubLObjectFactory.makeSymbol("SEARCH-OPTIONS-FUNC"), SubLObjectFactory.makeSymbol("SEARCH-EXPAND-FUNC"), SubLObjectFactory.makeSymbol("SEARCH-ADD-NODE-FUNC"), SubLObjectFactory.makeSymbol("SEARCH-TOO-DEEP-FUNC"), SubLObjectFactory.makeSymbol("SEARCH-STATE"), SubLObjectFactory.makeSymbol("SEARCH-PRINT-FUNC"), SubLObjectFactory.makeSymbol("SEARCH-LIMBO"), SubLObjectFactory.makeSymbol("SEARCH-CURRENT-NODE") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-SEARCH-TREE"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-LEAVES"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-GOALS"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-NO-LEAVES-P-FUNC"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-NEXT-NODE-FUNC"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-GOAL-P-FUNC"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-ADD-GOAL-FUNC"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-OPTIONS-FUNC"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-EXPAND-FUNC"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-ADD-NODE-FUNC"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-TOO-DEEP-FUNC"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-STATE"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-PRINT-FUNC"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-LIMBO"), SubLObjectFactory.makeSymbol("_CSETF-SEARCH-CURRENT-NODE") });
        $sym6$PRINT_SEARCH = SubLObjectFactory.makeSymbol("PRINT-SEARCH");
        $sym7$SEARCH_STRUC_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SEARCH-STRUC-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-STRUC-P"));
        $sym9$SEARCH_TREE = SubLObjectFactory.makeSymbol("SEARCH-TREE");
        $sym10$_CSETF_SEARCH_TREE = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-TREE");
        $sym11$SEARCH_LEAVES = SubLObjectFactory.makeSymbol("SEARCH-LEAVES");
        $sym12$_CSETF_SEARCH_LEAVES = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-LEAVES");
        $sym13$SEARCH_GOALS = SubLObjectFactory.makeSymbol("SEARCH-GOALS");
        $sym14$_CSETF_SEARCH_GOALS = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-GOALS");
        $sym15$SEARCH_NO_LEAVES_P_FUNC = SubLObjectFactory.makeSymbol("SEARCH-NO-LEAVES-P-FUNC");
        $sym16$_CSETF_SEARCH_NO_LEAVES_P_FUNC = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-NO-LEAVES-P-FUNC");
        $sym17$SEARCH_NEXT_NODE_FUNC = SubLObjectFactory.makeSymbol("SEARCH-NEXT-NODE-FUNC");
        $sym18$_CSETF_SEARCH_NEXT_NODE_FUNC = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-NEXT-NODE-FUNC");
        $sym19$SEARCH_GOAL_P_FUNC = SubLObjectFactory.makeSymbol("SEARCH-GOAL-P-FUNC");
        $sym20$_CSETF_SEARCH_GOAL_P_FUNC = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-GOAL-P-FUNC");
        $sym21$SEARCH_ADD_GOAL_FUNC = SubLObjectFactory.makeSymbol("SEARCH-ADD-GOAL-FUNC");
        $sym22$_CSETF_SEARCH_ADD_GOAL_FUNC = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-ADD-GOAL-FUNC");
        $sym23$SEARCH_OPTIONS_FUNC = SubLObjectFactory.makeSymbol("SEARCH-OPTIONS-FUNC");
        $sym24$_CSETF_SEARCH_OPTIONS_FUNC = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-OPTIONS-FUNC");
        $sym25$SEARCH_EXPAND_FUNC = SubLObjectFactory.makeSymbol("SEARCH-EXPAND-FUNC");
        $sym26$_CSETF_SEARCH_EXPAND_FUNC = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-EXPAND-FUNC");
        $sym27$SEARCH_ADD_NODE_FUNC = SubLObjectFactory.makeSymbol("SEARCH-ADD-NODE-FUNC");
        $sym28$_CSETF_SEARCH_ADD_NODE_FUNC = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-ADD-NODE-FUNC");
        $sym29$SEARCH_TOO_DEEP_FUNC = SubLObjectFactory.makeSymbol("SEARCH-TOO-DEEP-FUNC");
        $sym30$_CSETF_SEARCH_TOO_DEEP_FUNC = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-TOO-DEEP-FUNC");
        $sym31$SEARCH_STATE = SubLObjectFactory.makeSymbol("SEARCH-STATE");
        $sym32$_CSETF_SEARCH_STATE = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-STATE");
        $sym33$SEARCH_PRINT_FUNC = SubLObjectFactory.makeSymbol("SEARCH-PRINT-FUNC");
        $sym34$_CSETF_SEARCH_PRINT_FUNC = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-PRINT-FUNC");
        $sym35$SEARCH_LIMBO = SubLObjectFactory.makeSymbol("SEARCH-LIMBO");
        $sym36$_CSETF_SEARCH_LIMBO = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-LIMBO");
        $sym37$SEARCH_CURRENT_NODE = SubLObjectFactory.makeSymbol("SEARCH-CURRENT-NODE");
        $sym38$_CSETF_SEARCH_CURRENT_NODE = SubLObjectFactory.makeSymbol("_CSETF-SEARCH-CURRENT-NODE");
        $kw39$TREE = SubLObjectFactory.makeKeyword("TREE");
        $kw40$LEAVES = SubLObjectFactory.makeKeyword("LEAVES");
        $kw41$GOALS = SubLObjectFactory.makeKeyword("GOALS");
        $kw42$NO_LEAVES_P_FUNC = SubLObjectFactory.makeKeyword("NO-LEAVES-P-FUNC");
        $kw43$NEXT_NODE_FUNC = SubLObjectFactory.makeKeyword("NEXT-NODE-FUNC");
        $kw44$GOAL_P_FUNC = SubLObjectFactory.makeKeyword("GOAL-P-FUNC");
        $kw45$ADD_GOAL_FUNC = SubLObjectFactory.makeKeyword("ADD-GOAL-FUNC");
        $kw46$OPTIONS_FUNC = SubLObjectFactory.makeKeyword("OPTIONS-FUNC");
        $kw47$EXPAND_FUNC = SubLObjectFactory.makeKeyword("EXPAND-FUNC");
        $kw48$ADD_NODE_FUNC = SubLObjectFactory.makeKeyword("ADD-NODE-FUNC");
        $kw49$TOO_DEEP_FUNC = SubLObjectFactory.makeKeyword("TOO-DEEP-FUNC");
        $kw50$STATE = SubLObjectFactory.makeKeyword("STATE");
        $kw51$PRINT_FUNC = SubLObjectFactory.makeKeyword("PRINT-FUNC");
        $kw52$LIMBO = SubLObjectFactory.makeKeyword("LIMBO");
        $kw53$CURRENT_NODE = SubLObjectFactory.makeKeyword("CURRENT-NODE");
        $str54$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw55$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym56$MAKE_SEARCH_STRUC = SubLObjectFactory.makeSymbol("MAKE-SEARCH-STRUC");
        $kw57$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw58$END = SubLObjectFactory.makeKeyword("END");
        $sym59$VISIT_DEFSTRUCT_OBJECT_SEARCH_STRUC_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SEARCH-STRUC-METHOD");
        $str60$SEARCH_STRUC_resource_lock = SubLObjectFactory.makeString("SEARCH-STRUC resource lock");
        $kw61$FREE = SubLObjectFactory.makeKeyword("FREE");
        $sym62$SEARCH_NODE = SubLObjectFactory.makeSymbol("SEARCH-NODE");
        $sym63$SEARCH_NODE_P = SubLObjectFactory.makeSymbol("SEARCH-NODE-P");
        $int64$151 = SubLObjectFactory.makeInteger(151);
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("CHILDREN"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("STATE"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SEARCH"), (SubLObject)SubLObjectFactory.makeKeyword("PARENT"), (SubLObject)SubLObjectFactory.makeKeyword("CHILDREN"), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH"), (SubLObject)SubLObjectFactory.makeKeyword("OPTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("STATE"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SNODE-SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("SNODE-PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("SNODE-CHILDREN"), (SubLObject)SubLObjectFactory.makeSymbol("SNODE-DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("SNODE-OPTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("SNODE-STATE"));
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SNODE-SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SNODE-PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SNODE-CHILDREN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SNODE-DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SNODE-OPTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SNODE-STATE"));
        $sym69$PRINT_SNODE = SubLObjectFactory.makeSymbol("PRINT-SNODE");
        $sym70$SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SEARCH-NODE-PRINT-FUNCTION-TRAMPOLINE");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-NODE-P"));
        $sym72$SNODE_SEARCH = SubLObjectFactory.makeSymbol("SNODE-SEARCH");
        $sym73$_CSETF_SNODE_SEARCH = SubLObjectFactory.makeSymbol("_CSETF-SNODE-SEARCH");
        $sym74$SNODE_PARENT = SubLObjectFactory.makeSymbol("SNODE-PARENT");
        $sym75$_CSETF_SNODE_PARENT = SubLObjectFactory.makeSymbol("_CSETF-SNODE-PARENT");
        $sym76$SNODE_CHILDREN = SubLObjectFactory.makeSymbol("SNODE-CHILDREN");
        $sym77$_CSETF_SNODE_CHILDREN = SubLObjectFactory.makeSymbol("_CSETF-SNODE-CHILDREN");
        $sym78$SNODE_DEPTH = SubLObjectFactory.makeSymbol("SNODE-DEPTH");
        $sym79$_CSETF_SNODE_DEPTH = SubLObjectFactory.makeSymbol("_CSETF-SNODE-DEPTH");
        $sym80$SNODE_OPTIONS = SubLObjectFactory.makeSymbol("SNODE-OPTIONS");
        $sym81$_CSETF_SNODE_OPTIONS = SubLObjectFactory.makeSymbol("_CSETF-SNODE-OPTIONS");
        $sym82$SNODE_STATE = SubLObjectFactory.makeSymbol("SNODE-STATE");
        $sym83$_CSETF_SNODE_STATE = SubLObjectFactory.makeSymbol("_CSETF-SNODE-STATE");
        $kw84$SEARCH = SubLObjectFactory.makeKeyword("SEARCH");
        $kw85$PARENT = SubLObjectFactory.makeKeyword("PARENT");
        $kw86$CHILDREN = SubLObjectFactory.makeKeyword("CHILDREN");
        $kw87$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw88$OPTIONS = SubLObjectFactory.makeKeyword("OPTIONS");
        $sym89$MAKE_SEARCH_NODE = SubLObjectFactory.makeSymbol("MAKE-SEARCH-NODE");
        $sym90$VISIT_DEFSTRUCT_OBJECT_SEARCH_NODE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SEARCH-NODE-METHOD");
        $str91$SEARCH_NODE_resource_lock = SubLObjectFactory.makeString("SEARCH-NODE resource lock");
        $kw92$UNDETERMINED = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $sym93$DEAD_END_NODE_ = SubLObjectFactory.makeSymbol("DEAD-END-NODE?");
        $sym94$RECLAIM_SEARCH_NODE = SubLObjectFactory.makeSymbol("RECLAIM-SEARCH-NODE");
        $str95$So_don_t = SubLObjectFactory.makeString("So don't");
        $str96$Cannot_reclaim_strange_node__S = SubLObjectFactory.makeString("Cannot reclaim strange node ~S");
        $kw97$ABORT_GENERIC_SEARCH = SubLObjectFactory.makeKeyword("ABORT-GENERIC-SEARCH");
        $kw98$ABORT = SubLObjectFactory.makeKeyword("ABORT");
        $list99 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REASON"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-CUT"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-CUT"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUT")), SubLObjectFactory.makeSymbol("NO-LEAVES-P-FUNC"), SubLObjectFactory.makeSymbol("NEXT-NODE-FUNC"), SubLObjectFactory.makeSymbol("GOAL-P-FUNC"), SubLObjectFactory.makeSymbol("ADD-GOAL-FUNC"), SubLObjectFactory.makeSymbol("TOO-DEEP-FUNC"), SubLObjectFactory.makeSymbol("OPTIONS-FUNC"), SubLObjectFactory.makeSymbol("EXPAND-FUNC"), SubLObjectFactory.makeSymbol("ADD-NODE-FUNC") });
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUMBER-CUT"), (SubLObject)SubLObjectFactory.makeKeyword("TIME-CUT"), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH-CUT"));
        $kw101$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw102$NUMBER_CUT = SubLObjectFactory.makeKeyword("NUMBER-CUT");
        $kw103$TIME_CUT = SubLObjectFactory.makeKeyword("TIME-CUT");
        $kw104$DEPTH_CUT = SubLObjectFactory.makeKeyword("DEPTH-CUT");
        $sym105$NUMBER = SubLObjectFactory.makeUninternedSymbol("NUMBER");
        $sym106$TIME = SubLObjectFactory.makeUninternedSymbol("TIME");
        $sym107$DEPTH_LIMIT_CROSSED = SubLObjectFactory.makeUninternedSymbol("DEPTH-LIMIT-CROSSED");
        $sym108$ABORTED = SubLObjectFactory.makeUninternedSymbol("ABORTED");
        $sym109$NEXT = SubLObjectFactory.makeUninternedSymbol("NEXT");
        $sym110$NEW_LEAVES = SubLObjectFactory.makeUninternedSymbol("NEW-LEAVES");
        $sym111$PREVIOUS_GOALS = SubLObjectFactory.makeUninternedSymbol("PREVIOUS-GOALS");
        $sym112$NEW_GOALS = SubLObjectFactory.makeUninternedSymbol("NEW-GOALS");
        $sym113$INCREMENT_COUNT = SubLObjectFactory.makeUninternedSymbol("INCREMENT-COUNT");
        $sym114$OPTIONS = SubLObjectFactory.makeUninternedSymbol("OPTIONS");
        $sym115$OPTION = SubLObjectFactory.makeUninternedSymbol("OPTION");
        $sym116$SELF_RE_ADDED_ = SubLObjectFactory.makeUninternedSymbol("SELF-RE-ADDED?");
        $sym117$NEW_NODES = SubLObjectFactory.makeUninternedSymbol("NEW-NODES");
        $sym118$NEW_NODE = SubLObjectFactory.makeUninternedSymbol("NEW-NODE");
        $sym119$PREVIOUS_LEAVES = SubLObjectFactory.makeUninternedSymbol("PREVIOUS-LEAVES");
        $sym120$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list121 = ConsesLow.list((SubLObject)search.ZERO_INTEGER);
        $sym122$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym123$TIME_FROM_NOW = SubLObjectFactory.makeSymbol("TIME-FROM-NOW");
        $list124 = ConsesLow.list((SubLObject)search.NIL);
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*INTERRUPT-GENERIC-SEARCH*"), (SubLObject)search.NIL);
        $sym126$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");
        $list127 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-GENERIC-SEARCH*"), (SubLObject)search.T));
        $sym128$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym129$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym130$COR = SubLObjectFactory.makeSymbol("COR");
        $sym131$_INTERRUPT_GENERIC_SEARCH_ = SubLObjectFactory.makeSymbol("*INTERRUPT-GENERIC-SEARCH*");
        $sym132$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym133$__ = SubLObjectFactory.makeSymbol(">=");
        $sym134$TIME_HAS_ARRIVED_ = SubLObjectFactory.makeSymbol("TIME-HAS-ARRIVED?");
        $sym135$FUNCALL_SHORTCUT = SubLObjectFactory.makeSymbol("FUNCALL-SHORTCUT");
        $sym136$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym137$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym138$DOOMED_SEARCH_NODE_ = SubLObjectFactory.makeSymbol("DOOMED-SEARCH-NODE?");
        $sym139$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym140$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym141$_RECLAIM_DEAD_END_SEARCH_NODES_ = SubLObjectFactory.makeSymbol("*RECLAIM-DEAD-END-SEARCH-NODES*");
        $sym142$GENERIC_SEARCH_RECLAIM_NODE = SubLObjectFactory.makeSymbol("GENERIC-SEARCH-RECLAIM-NODE");
        $sym143$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list144 = ConsesLow.list((SubLObject)search.T);
        $sym145$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym146$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym147$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym148$GENERIC_SEARCH_LINK_CHILD_TO_PARENT = SubLObjectFactory.makeSymbol("GENERIC-SEARCH-LINK-CHILD-TO-PARENT");
        $sym149$NREVERSE = SubLObjectFactory.makeSymbol("NREVERSE");
        $sym150$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABORT"));
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERRUPT"));
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUMBER"));
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIME"));
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEPTH"));
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXHAUST"));
        $kw157$INTERRUPT = SubLObjectFactory.makeKeyword("INTERRUPT");
        $kw158$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $kw159$TIME = SubLObjectFactory.makeKeyword("TIME");
        $kw160$EXHAUST = SubLObjectFactory.makeKeyword("EXHAUST");
        $kw161$DOOMED = SubLObjectFactory.makeKeyword("DOOMED");
    }
    
    public static final class $search_struc_native extends SubLStructNative
    {
        public SubLObject $tree;
        public SubLObject $leaves;
        public SubLObject $goals;
        public SubLObject $no_leaves_p_func;
        public SubLObject $next_node_func;
        public SubLObject $goal_p_func;
        public SubLObject $add_goal_func;
        public SubLObject $options_func;
        public SubLObject $expand_func;
        public SubLObject $add_node_func;
        public SubLObject $too_deep_func;
        public SubLObject $state;
        public SubLObject $print_func;
        public SubLObject $limbo;
        public SubLObject $current_node;
        private static final SubLStructDeclNative structDecl;
        
        public $search_struc_native() {
            this.$tree = (SubLObject)CommonSymbols.NIL;
            this.$leaves = (SubLObject)CommonSymbols.NIL;
            this.$goals = (SubLObject)CommonSymbols.NIL;
            this.$no_leaves_p_func = (SubLObject)CommonSymbols.NIL;
            this.$next_node_func = (SubLObject)CommonSymbols.NIL;
            this.$goal_p_func = (SubLObject)CommonSymbols.NIL;
            this.$add_goal_func = (SubLObject)CommonSymbols.NIL;
            this.$options_func = (SubLObject)CommonSymbols.NIL;
            this.$expand_func = (SubLObject)CommonSymbols.NIL;
            this.$add_node_func = (SubLObject)CommonSymbols.NIL;
            this.$too_deep_func = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$print_func = (SubLObject)CommonSymbols.NIL;
            this.$limbo = (SubLObject)CommonSymbols.NIL;
            this.$current_node = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$search_struc_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$tree;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$leaves;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$goals;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$no_leaves_p_func;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$next_node_func;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$goal_p_func;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$add_goal_func;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$options_func;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$expand_func;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$add_node_func;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$too_deep_func;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$state;
        }
        
        @Override
		public SubLObject getField14() {
            return this.$print_func;
        }
        
        @Override
		public SubLObject getField15() {
            return this.$limbo;
        }
        
        @Override
		public SubLObject getField16() {
            return this.$current_node;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$tree = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$leaves = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$goals = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$no_leaves_p_func = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$next_node_func = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$goal_p_func = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$add_goal_func = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$options_func = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$expand_func = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$add_node_func = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$too_deep_func = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$state = value;
        }
        
        @Override
		public SubLObject setField14(final SubLObject value) {
            return this.$print_func = value;
        }
        
        @Override
		public SubLObject setField15(final SubLObject value) {
            return this.$limbo = value;
        }
        
        @Override
		public SubLObject setField16(final SubLObject value) {
            return this.$current_node = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$search_struc_native.class, search.$sym0$SEARCH_STRUC, search.$sym1$SEARCH_STRUC_P, search.$list2, search.$list3, new String[] { "$tree", "$leaves", "$goals", "$no_leaves_p_func", "$next_node_func", "$goal_p_func", "$add_goal_func", "$options_func", "$expand_func", "$add_node_func", "$too_deep_func", "$state", "$print_func", "$limbo", "$current_node" }, search.$list4, search.$list5, search.$sym6$PRINT_SEARCH);
        }
    }
    
    public static final class $search_struc_p$UnaryFunction extends UnaryFunction
    {
        public $search_struc_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SEARCH-STRUC-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return search.search_struc_p(arg1);
        }
    }
    
    public static final class $search_node_native extends SubLStructNative
    {
        public SubLObject $search;
        public SubLObject $parent;
        public SubLObject $children;
        public SubLObject $depth;
        public SubLObject $options;
        public SubLObject $state;
        private static final SubLStructDeclNative structDecl;
        
        public $search_node_native() {
            this.$search = (SubLObject)CommonSymbols.NIL;
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$children = (SubLObject)CommonSymbols.NIL;
            this.$depth = (SubLObject)CommonSymbols.NIL;
            this.$options = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$search_node_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$search;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$parent;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$children;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$depth;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$options;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$state;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$search = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$parent = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$children = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$depth = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$options = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$state = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$search_node_native.class, search.$sym62$SEARCH_NODE, search.$sym63$SEARCH_NODE_P, search.$list65, search.$list66, new String[] { "$search", "$parent", "$children", "$depth", "$options", "$state" }, search.$list67, search.$list68, search.$sym69$PRINT_SNODE);
        }
    }
    
    public static final class $search_node_p$UnaryFunction extends UnaryFunction
    {
        public $search_node_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SEARCH-NODE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return search.search_node_p(arg1);
        }
    }
}

/*

	Total time: 541 ms
	
*/