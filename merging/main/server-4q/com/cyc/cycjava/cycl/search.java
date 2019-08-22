/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.$structure_resourcing_enabled$;
import static com.cyc.cycjava.cycl.utilities_macros.$structure_resourcing_make_static$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.time_has_arrivedP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SEARCH
 * source file: /cyc/top/cycl/search.lisp
 * created:     2019/07/03 17:37:37
 */
public final class search extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new search();

 public static final String myName = "com.cyc.cycjava.cycl.search";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_search_struc$ = makeSymbol("*DTP-SEARCH-STRUC*");

    // deflexical
    // Free list for SEARCH-STRUC objects
    /**
     * Free list for SEARCH-STRUC objects
     */
    @LispMethod(comment = "Free list for SEARCH-STRUC objects\ndeflexical")
    private static final SubLSymbol $search_struc_free_list$ = makeSymbol("*SEARCH-STRUC-FREE-LIST*");

    // deflexical
    // Lock for SEARCH-STRUC object free list
    /**
     * Lock for SEARCH-STRUC object free list
     */
    @LispMethod(comment = "Lock for SEARCH-STRUC object free list\ndeflexical")
    private static final SubLSymbol $search_struc_free_lock$ = makeSymbol("*SEARCH-STRUC-FREE-LOCK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_search_node$ = makeSymbol("*DTP-SEARCH-NODE*");

    // deflexical
    // Free list for SEARCH-NODE objects
    /**
     * Free list for SEARCH-NODE objects
     */
    @LispMethod(comment = "Free list for SEARCH-NODE objects\ndeflexical")
    private static final SubLSymbol $search_node_free_list$ = makeSymbol("*SEARCH-NODE-FREE-LIST*");

    // deflexical
    // Lock for SEARCH-NODE object free list
    /**
     * Lock for SEARCH-NODE object free list
     */
    @LispMethod(comment = "Lock for SEARCH-NODE object free list\ndeflexical")
    private static final SubLSymbol $search_node_free_lock$ = makeSymbol("*SEARCH-NODE-FREE-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $dead_end_node_function$ = makeSymbol("*DEAD-END-NODE-FUNCTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reclaim_dead_end_node_function$ = makeSymbol("*RECLAIM-DEAD-END-NODE-FUNCTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $within_generic_search$ = makeSymbol("*WITHIN-GENERIC-SEARCH*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SEARCH_STRUC = makeSymbol("SEARCH-STRUC");

    private static final SubLSymbol SEARCH_STRUC_P = makeSymbol("SEARCH-STRUC-P");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("TREE"), makeSymbol("LEAVES"), makeSymbol("GOALS"), makeSymbol("NO-LEAVES-P-FUNC"), makeSymbol("NEXT-NODE-FUNC"), makeSymbol("GOAL-P-FUNC"), makeSymbol("ADD-GOAL-FUNC"), makeSymbol("OPTIONS-FUNC"), makeSymbol("EXPAND-FUNC"), makeSymbol("ADD-NODE-FUNC"), makeSymbol("TOO-DEEP-FUNC"), makeSymbol("STATE"), makeSymbol("PRINT-FUNC"), makeSymbol("LIMBO"), makeSymbol("CURRENT-NODE") });

    static private final SubLList $list3 = list(new SubLObject[]{ $TREE, makeKeyword("LEAVES"), makeKeyword("GOALS"), makeKeyword("NO-LEAVES-P-FUNC"), makeKeyword("NEXT-NODE-FUNC"), makeKeyword("GOAL-P-FUNC"), makeKeyword("ADD-GOAL-FUNC"), makeKeyword("OPTIONS-FUNC"), makeKeyword("EXPAND-FUNC"), makeKeyword("ADD-NODE-FUNC"), makeKeyword("TOO-DEEP-FUNC"), makeKeyword("STATE"), makeKeyword("PRINT-FUNC"), makeKeyword("LIMBO"), makeKeyword("CURRENT-NODE") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("SEARCH-TREE"), makeSymbol("SEARCH-LEAVES"), makeSymbol("SEARCH-GOALS"), makeSymbol("SEARCH-NO-LEAVES-P-FUNC"), makeSymbol("SEARCH-NEXT-NODE-FUNC"), makeSymbol("SEARCH-GOAL-P-FUNC"), makeSymbol("SEARCH-ADD-GOAL-FUNC"), makeSymbol("SEARCH-OPTIONS-FUNC"), makeSymbol("SEARCH-EXPAND-FUNC"), makeSymbol("SEARCH-ADD-NODE-FUNC"), makeSymbol("SEARCH-TOO-DEEP-FUNC"), makeSymbol("SEARCH-STATE"), makeSymbol("SEARCH-PRINT-FUNC"), makeSymbol("SEARCH-LIMBO"), makeSymbol("SEARCH-CURRENT-NODE") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-SEARCH-TREE"), makeSymbol("_CSETF-SEARCH-LEAVES"), makeSymbol("_CSETF-SEARCH-GOALS"), makeSymbol("_CSETF-SEARCH-NO-LEAVES-P-FUNC"), makeSymbol("_CSETF-SEARCH-NEXT-NODE-FUNC"), makeSymbol("_CSETF-SEARCH-GOAL-P-FUNC"), makeSymbol("_CSETF-SEARCH-ADD-GOAL-FUNC"), makeSymbol("_CSETF-SEARCH-OPTIONS-FUNC"), makeSymbol("_CSETF-SEARCH-EXPAND-FUNC"), makeSymbol("_CSETF-SEARCH-ADD-NODE-FUNC"), makeSymbol("_CSETF-SEARCH-TOO-DEEP-FUNC"), makeSymbol("_CSETF-SEARCH-STATE"), makeSymbol("_CSETF-SEARCH-PRINT-FUNC"), makeSymbol("_CSETF-SEARCH-LIMBO"), makeSymbol("_CSETF-SEARCH-CURRENT-NODE") });

    private static final SubLSymbol PRINT_SEARCH = makeSymbol("PRINT-SEARCH");

    private static final SubLSymbol SEARCH_STRUC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SEARCH-STRUC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SEARCH-STRUC-P"));

    private static final SubLSymbol SEARCH_TREE = makeSymbol("SEARCH-TREE");

    private static final SubLSymbol _CSETF_SEARCH_TREE = makeSymbol("_CSETF-SEARCH-TREE");

    private static final SubLSymbol SEARCH_LEAVES = makeSymbol("SEARCH-LEAVES");

    private static final SubLSymbol _CSETF_SEARCH_LEAVES = makeSymbol("_CSETF-SEARCH-LEAVES");

    private static final SubLSymbol SEARCH_GOALS = makeSymbol("SEARCH-GOALS");

    private static final SubLSymbol _CSETF_SEARCH_GOALS = makeSymbol("_CSETF-SEARCH-GOALS");

    private static final SubLSymbol SEARCH_NO_LEAVES_P_FUNC = makeSymbol("SEARCH-NO-LEAVES-P-FUNC");

    private static final SubLSymbol _CSETF_SEARCH_NO_LEAVES_P_FUNC = makeSymbol("_CSETF-SEARCH-NO-LEAVES-P-FUNC");

    private static final SubLSymbol SEARCH_NEXT_NODE_FUNC = makeSymbol("SEARCH-NEXT-NODE-FUNC");

    private static final SubLSymbol _CSETF_SEARCH_NEXT_NODE_FUNC = makeSymbol("_CSETF-SEARCH-NEXT-NODE-FUNC");

    private static final SubLSymbol SEARCH_GOAL_P_FUNC = makeSymbol("SEARCH-GOAL-P-FUNC");

    private static final SubLSymbol _CSETF_SEARCH_GOAL_P_FUNC = makeSymbol("_CSETF-SEARCH-GOAL-P-FUNC");

    private static final SubLSymbol SEARCH_ADD_GOAL_FUNC = makeSymbol("SEARCH-ADD-GOAL-FUNC");

    private static final SubLSymbol _CSETF_SEARCH_ADD_GOAL_FUNC = makeSymbol("_CSETF-SEARCH-ADD-GOAL-FUNC");

    private static final SubLSymbol SEARCH_OPTIONS_FUNC = makeSymbol("SEARCH-OPTIONS-FUNC");

    private static final SubLSymbol _CSETF_SEARCH_OPTIONS_FUNC = makeSymbol("_CSETF-SEARCH-OPTIONS-FUNC");

    private static final SubLSymbol SEARCH_EXPAND_FUNC = makeSymbol("SEARCH-EXPAND-FUNC");

    private static final SubLSymbol _CSETF_SEARCH_EXPAND_FUNC = makeSymbol("_CSETF-SEARCH-EXPAND-FUNC");

    private static final SubLSymbol SEARCH_ADD_NODE_FUNC = makeSymbol("SEARCH-ADD-NODE-FUNC");

    private static final SubLSymbol _CSETF_SEARCH_ADD_NODE_FUNC = makeSymbol("_CSETF-SEARCH-ADD-NODE-FUNC");

    private static final SubLSymbol SEARCH_TOO_DEEP_FUNC = makeSymbol("SEARCH-TOO-DEEP-FUNC");

    private static final SubLSymbol _CSETF_SEARCH_TOO_DEEP_FUNC = makeSymbol("_CSETF-SEARCH-TOO-DEEP-FUNC");

    private static final SubLSymbol SEARCH_STATE = makeSymbol("SEARCH-STATE");

    private static final SubLSymbol _CSETF_SEARCH_STATE = makeSymbol("_CSETF-SEARCH-STATE");

    private static final SubLSymbol SEARCH_PRINT_FUNC = makeSymbol("SEARCH-PRINT-FUNC");

    private static final SubLSymbol _CSETF_SEARCH_PRINT_FUNC = makeSymbol("_CSETF-SEARCH-PRINT-FUNC");

    private static final SubLSymbol SEARCH_LIMBO = makeSymbol("SEARCH-LIMBO");

    private static final SubLSymbol _CSETF_SEARCH_LIMBO = makeSymbol("_CSETF-SEARCH-LIMBO");

    private static final SubLSymbol SEARCH_CURRENT_NODE = makeSymbol("SEARCH-CURRENT-NODE");

    private static final SubLSymbol _CSETF_SEARCH_CURRENT_NODE = makeSymbol("_CSETF-SEARCH-CURRENT-NODE");

    private static final SubLSymbol $NO_LEAVES_P_FUNC = makeKeyword("NO-LEAVES-P-FUNC");

    private static final SubLSymbol $NEXT_NODE_FUNC = makeKeyword("NEXT-NODE-FUNC");

    private static final SubLSymbol $GOAL_P_FUNC = makeKeyword("GOAL-P-FUNC");

    private static final SubLSymbol $ADD_GOAL_FUNC = makeKeyword("ADD-GOAL-FUNC");

    private static final SubLSymbol $ADD_NODE_FUNC = makeKeyword("ADD-NODE-FUNC");

    private static final SubLSymbol $TOO_DEEP_FUNC = makeKeyword("TOO-DEEP-FUNC");

    private static final SubLString $str54$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SEARCH_STRUC = makeSymbol("MAKE-SEARCH-STRUC");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SEARCH_STRUC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SEARCH-STRUC-METHOD");

    private static final SubLString $str60$SEARCH_STRUC_resource_lock = makeString("SEARCH-STRUC resource lock");

    private static final SubLSymbol SEARCH_NODE = makeSymbol("SEARCH-NODE");

    private static final SubLSymbol SEARCH_NODE_P = makeSymbol("SEARCH-NODE-P");

    private static final SubLInteger $int$151 = makeInteger(151);

    private static final SubLList $list65 = list(makeSymbol("SEARCH"), makeSymbol("PARENT"), makeSymbol("CHILDREN"), makeSymbol("DEPTH"), makeSymbol("OPTIONS"), makeSymbol("STATE"));

    private static final SubLList $list66 = list(makeKeyword("SEARCH"), makeKeyword("PARENT"), makeKeyword("CHILDREN"), makeKeyword("DEPTH"), makeKeyword("OPTIONS"), makeKeyword("STATE"));

    private static final SubLList $list67 = list(makeSymbol("SNODE-SEARCH"), makeSymbol("SNODE-PARENT"), makeSymbol("SNODE-CHILDREN"), makeSymbol("SNODE-DEPTH"), makeSymbol("SNODE-OPTIONS"), makeSymbol("SNODE-STATE"));

    private static final SubLList $list68 = list(makeSymbol("_CSETF-SNODE-SEARCH"), makeSymbol("_CSETF-SNODE-PARENT"), makeSymbol("_CSETF-SNODE-CHILDREN"), makeSymbol("_CSETF-SNODE-DEPTH"), makeSymbol("_CSETF-SNODE-OPTIONS"), makeSymbol("_CSETF-SNODE-STATE"));

    private static final SubLSymbol PRINT_SNODE = makeSymbol("PRINT-SNODE");

    private static final SubLSymbol SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SEARCH-NODE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list71 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SEARCH-NODE-P"));

    private static final SubLSymbol SNODE_SEARCH = makeSymbol("SNODE-SEARCH");

    private static final SubLSymbol _CSETF_SNODE_SEARCH = makeSymbol("_CSETF-SNODE-SEARCH");

    private static final SubLSymbol SNODE_PARENT = makeSymbol("SNODE-PARENT");

    private static final SubLSymbol _CSETF_SNODE_PARENT = makeSymbol("_CSETF-SNODE-PARENT");

    private static final SubLSymbol SNODE_CHILDREN = makeSymbol("SNODE-CHILDREN");

    private static final SubLSymbol _CSETF_SNODE_CHILDREN = makeSymbol("_CSETF-SNODE-CHILDREN");

    private static final SubLSymbol SNODE_DEPTH = makeSymbol("SNODE-DEPTH");

    private static final SubLSymbol _CSETF_SNODE_DEPTH = makeSymbol("_CSETF-SNODE-DEPTH");

    private static final SubLSymbol SNODE_OPTIONS = makeSymbol("SNODE-OPTIONS");

    private static final SubLSymbol _CSETF_SNODE_OPTIONS = makeSymbol("_CSETF-SNODE-OPTIONS");

    private static final SubLSymbol SNODE_STATE = makeSymbol("SNODE-STATE");

    private static final SubLSymbol _CSETF_SNODE_STATE = makeSymbol("_CSETF-SNODE-STATE");

    private static final SubLSymbol MAKE_SEARCH_NODE = makeSymbol("MAKE-SEARCH-NODE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SEARCH_NODE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SEARCH-NODE-METHOD");

    private static final SubLString $str91$SEARCH_NODE_resource_lock = makeString("SEARCH-NODE resource lock");

    private static final SubLSymbol $sym93$DEAD_END_NODE_ = makeSymbol("DEAD-END-NODE?");

    private static final SubLSymbol RECLAIM_SEARCH_NODE = makeSymbol("RECLAIM-SEARCH-NODE");

    private static final SubLString $str95$So_don_t = makeString("So don't");

    private static final SubLString $str96$Cannot_reclaim_strange_node__S = makeString("Cannot reclaim strange node ~S");

    private static final SubLSymbol $ABORT_GENERIC_SEARCH = makeKeyword("ABORT-GENERIC-SEARCH");

    private static final SubLList $list99 = list(new SubLObject[]{ list(makeSymbol("REASON"), makeSymbol("SEARCH"), makeSymbol("&KEY"), makeSymbol("NUMBER-CUT"), makeSymbol("TIME-CUT"), makeSymbol("DEPTH-CUT")), makeSymbol("NO-LEAVES-P-FUNC"), makeSymbol("NEXT-NODE-FUNC"), makeSymbol("GOAL-P-FUNC"), makeSymbol("ADD-GOAL-FUNC"), makeSymbol("TOO-DEEP-FUNC"), makeSymbol("OPTIONS-FUNC"), makeSymbol("EXPAND-FUNC"), makeSymbol("ADD-NODE-FUNC") });

    private static final SubLList $list100 = list(makeKeyword("NUMBER-CUT"), makeKeyword("TIME-CUT"), makeKeyword("DEPTH-CUT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym105$NUMBER = makeUninternedSymbol("NUMBER");

    private static final SubLSymbol $sym106$TIME = makeUninternedSymbol("TIME");

    private static final SubLSymbol $sym107$DEPTH_LIMIT_CROSSED = makeUninternedSymbol("DEPTH-LIMIT-CROSSED");

    private static final SubLSymbol $sym108$ABORTED = makeUninternedSymbol("ABORTED");

    private static final SubLSymbol $sym109$NEXT = makeUninternedSymbol("NEXT");

    private static final SubLSymbol $sym110$NEW_LEAVES = makeUninternedSymbol("NEW-LEAVES");

    private static final SubLSymbol $sym111$PREVIOUS_GOALS = makeUninternedSymbol("PREVIOUS-GOALS");

    private static final SubLSymbol $sym112$NEW_GOALS = makeUninternedSymbol("NEW-GOALS");

    private static final SubLSymbol $sym113$INCREMENT_COUNT = makeUninternedSymbol("INCREMENT-COUNT");

    private static final SubLSymbol $sym114$OPTIONS = makeUninternedSymbol("OPTIONS");

    private static final SubLSymbol $sym115$OPTION = makeUninternedSymbol("OPTION");

    private static final SubLSymbol $sym116$SELF_RE_ADDED_ = makeUninternedSymbol("SELF-RE-ADDED?");

    private static final SubLSymbol $sym117$NEW_NODES = makeUninternedSymbol("NEW-NODES");

    private static final SubLSymbol $sym118$NEW_NODE = makeUninternedSymbol("NEW-NODE");

    private static final SubLSymbol $sym119$PREVIOUS_LEAVES = makeUninternedSymbol("PREVIOUS-LEAVES");

    static private final SubLList $list121 = list(ZERO_INTEGER);

    private static final SubLSymbol TIME_FROM_NOW = makeSymbol("TIME-FROM-NOW");

    private static final SubLList $list124 = list(NIL);

    private static final SubLList $list125 = list(makeSymbol("*INTERRUPT-GENERIC-SEARCH*"), NIL);

    private static final SubLList $list127 = list(list(makeSymbol("*WITHIN-GENERIC-SEARCH*"), T));

    public static final SubLSymbol $interrupt_generic_search$ = makeSymbol("*INTERRUPT-GENERIC-SEARCH*");

    private static final SubLSymbol $sym133$__ = makeSymbol(">=");

    private static final SubLSymbol $sym134$TIME_HAS_ARRIVED_ = makeSymbol("TIME-HAS-ARRIVED?");

    private static final SubLSymbol FUNCALL_SHORTCUT = makeSymbol("FUNCALL-SHORTCUT");

    private static final SubLSymbol $sym138$DOOMED_SEARCH_NODE_ = makeSymbol("DOOMED-SEARCH-NODE?");

    public static final SubLSymbol $reclaim_dead_end_search_nodes$ = makeSymbol("*RECLAIM-DEAD-END-SEARCH-NODES*");

    private static final SubLSymbol GENERIC_SEARCH_RECLAIM_NODE = makeSymbol("GENERIC-SEARCH-RECLAIM-NODE");

    private static final SubLList $list144 = list(T);

    private static final SubLSymbol GENERIC_SEARCH_LINK_CHILD_TO_PARENT = makeSymbol("GENERIC-SEARCH-LINK-CHILD-TO-PARENT");

    private static final SubLList $list151 = list(makeKeyword("ABORT"));

    private static final SubLList $list152 = list(makeKeyword("INTERRUPT"));

    private static final SubLList $list153 = list(makeKeyword("NUMBER"));

    private static final SubLList $list154 = list($TIME);

    private static final SubLList $list155 = list(makeKeyword("DEPTH"));

    private static final SubLList $list156 = list(makeKeyword("EXHAUST"));

    public static final SubLObject search_struc_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_search(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject search_struc_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_search(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject search_struc_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.search.$search_struc_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject search_struc_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.search.$search_struc_native.class ? T : NIL;
    }

    public static final SubLObject search_tree_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField2();
    }

    public static SubLObject search_tree(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject search_leaves_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField3();
    }

    public static SubLObject search_leaves(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject search_goals_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField4();
    }

    public static SubLObject search_goals(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject search_no_leaves_p_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField5();
    }

    public static SubLObject search_no_leaves_p_func(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject search_next_node_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField6();
    }

    public static SubLObject search_next_node_func(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject search_goal_p_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField7();
    }

    public static SubLObject search_goal_p_func(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject search_add_goal_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField8();
    }

    public static SubLObject search_add_goal_func(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject search_options_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField9();
    }

    public static SubLObject search_options_func(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject search_expand_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField10();
    }

    public static SubLObject search_expand_func(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject search_add_node_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField11();
    }

    public static SubLObject search_add_node_func(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject search_too_deep_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField12();
    }

    public static SubLObject search_too_deep_func(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject search_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField13();
    }

    public static SubLObject search_state(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject search_print_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField14();
    }

    public static SubLObject search_print_func(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject search_limbo_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField15();
    }

    public static SubLObject search_limbo(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField15();
    }

    public static final SubLObject search_current_node_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.getField16();
    }

    public static SubLObject search_current_node(final SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.getField16();
    }

    public static final SubLObject _csetf_search_tree_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_search_tree(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_search_leaves_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_search_leaves(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_search_goals_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_search_goals(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_search_no_leaves_p_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_search_no_leaves_p_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_search_next_node_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_search_next_node_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_search_goal_p_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_search_goal_p_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_search_add_goal_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_search_add_goal_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_search_options_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_search_options_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_search_expand_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_search_expand_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_search_add_node_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_search_add_node_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_search_too_deep_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_search_too_deep_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_search_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_search_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_search_print_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_search_print_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_search_limbo_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_search_limbo(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_search_current_node_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_search_current_node(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static final SubLObject make_search_struc_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.search.$search_struc_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TREE)) {
                        _csetf_search_tree(v_new, current_value);
                    } else {
                        if (pcase_var.eql($LEAVES)) {
                            _csetf_search_leaves(v_new, current_value);
                        } else {
                            if (pcase_var.eql($GOALS)) {
                                _csetf_search_goals(v_new, current_value);
                            } else {
                                if (pcase_var.eql($NO_LEAVES_P_FUNC)) {
                                    _csetf_search_no_leaves_p_func(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($NEXT_NODE_FUNC)) {
                                        _csetf_search_next_node_func(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($GOAL_P_FUNC)) {
                                            _csetf_search_goal_p_func(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($ADD_GOAL_FUNC)) {
                                                _csetf_search_add_goal_func(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($OPTIONS_FUNC)) {
                                                    _csetf_search_options_func(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($EXPAND_FUNC)) {
                                                        _csetf_search_expand_func(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($ADD_NODE_FUNC)) {
                                                            _csetf_search_add_node_func(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($TOO_DEEP_FUNC)) {
                                                                _csetf_search_too_deep_func(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($STATE)) {
                                                                    _csetf_search_state(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($PRINT_FUNC)) {
                                                                        _csetf_search_print_func(v_new, current_value);
                                                                    } else {
                                                                        if (pcase_var.eql($LIMBO)) {
                                                                            _csetf_search_limbo(v_new, current_value);
                                                                        } else {
                                                                            if (pcase_var.eql($CURRENT_NODE)) {
                                                                                _csetf_search_current_node(v_new, current_value);
                                                                            } else {
                                                                                Errors.error($str_alt53$Invalid_slot__S_for_construction_, current_arg);
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
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_search_struc(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.search.$search_struc_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TREE)) {
                _csetf_search_tree(v_new, current_value);
            } else
                if (pcase_var.eql($LEAVES)) {
                    _csetf_search_leaves(v_new, current_value);
                } else
                    if (pcase_var.eql($GOALS)) {
                        _csetf_search_goals(v_new, current_value);
                    } else
                        if (pcase_var.eql($NO_LEAVES_P_FUNC)) {
                            _csetf_search_no_leaves_p_func(v_new, current_value);
                        } else
                            if (pcase_var.eql($NEXT_NODE_FUNC)) {
                                _csetf_search_next_node_func(v_new, current_value);
                            } else
                                if (pcase_var.eql($GOAL_P_FUNC)) {
                                    _csetf_search_goal_p_func(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ADD_GOAL_FUNC)) {
                                        _csetf_search_add_goal_func(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($OPTIONS_FUNC)) {
                                            _csetf_search_options_func(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($EXPAND_FUNC)) {
                                                _csetf_search_expand_func(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($ADD_NODE_FUNC)) {
                                                    _csetf_search_add_node_func(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($TOO_DEEP_FUNC)) {
                                                        _csetf_search_too_deep_func(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($STATE)) {
                                                            _csetf_search_state(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($PRINT_FUNC)) {
                                                                _csetf_search_print_func(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($LIMBO)) {
                                                                    _csetf_search_limbo(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($CURRENT_NODE)) {
                                                                        _csetf_search_current_node(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str54$Invalid_slot__S_for_construction_, current_arg);
                                                                    }














        }
        return v_new;
    }

    public static SubLObject visit_defstruct_search_struc(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SEARCH_STRUC, FIFTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TREE, search_tree(obj));
        funcall(visitor_fn, obj, $SLOT, $LEAVES, search_leaves(obj));
        funcall(visitor_fn, obj, $SLOT, $GOALS, search_goals(obj));
        funcall(visitor_fn, obj, $SLOT, $NO_LEAVES_P_FUNC, search_no_leaves_p_func(obj));
        funcall(visitor_fn, obj, $SLOT, $NEXT_NODE_FUNC, search_next_node_func(obj));
        funcall(visitor_fn, obj, $SLOT, $GOAL_P_FUNC, search_goal_p_func(obj));
        funcall(visitor_fn, obj, $SLOT, $ADD_GOAL_FUNC, search_add_goal_func(obj));
        funcall(visitor_fn, obj, $SLOT, $OPTIONS_FUNC, search_options_func(obj));
        funcall(visitor_fn, obj, $SLOT, $EXPAND_FUNC, search_expand_func(obj));
        funcall(visitor_fn, obj, $SLOT, $ADD_NODE_FUNC, search_add_node_func(obj));
        funcall(visitor_fn, obj, $SLOT, $TOO_DEEP_FUNC, search_too_deep_func(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, search_state(obj));
        funcall(visitor_fn, obj, $SLOT, $PRINT_FUNC, search_print_func(obj));
        funcall(visitor_fn, obj, $SLOT, $LIMBO, search_limbo(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_NODE, search_current_node(obj));
        funcall(visitor_fn, obj, $END, MAKE_SEARCH_STRUC, FIFTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_search_struc_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_search_struc(obj, visitor_fn);
    }

    public static final SubLObject print_search_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            SubLObject fun = search_print_func(v_object);
            if (NIL != fun) {
                funcall(fun, v_object, stream, depth);
            } else {
                compatibility.default_struct_print_function(v_object, stream, depth);
            }
        }
        return v_object;
    }

    public static SubLObject print_search(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject fun = search_print_func(v_object);
        if (NIL != fun) {
            funcall(fun, v_object, stream, depth);
        } else {
            compatibility.default_struct_print_function(v_object, stream, depth);
        }
        return v_object;
    }

    /**
     * Make a new SEARCH-STRUC in the static area
     */
    @LispMethod(comment = "Make a new SEARCH-STRUC in the static area")
    public static final SubLObject make_static_search_struc_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_object = NIL;
                {
                    SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
                    try {
                        Storage.$current_area$.bind(Storage.get_static_area(), thread);
                        v_object = make_search_struc(UNPROVIDED);
                    } finally {
                        Storage.$current_area$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_object;
            }
        }
    }

    /**
     * Make a new SEARCH-STRUC in the static area
     */
    @LispMethod(comment = "Make a new SEARCH-STRUC in the static area")
    public static SubLObject make_static_search_struc() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_object = NIL;
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            v_object = make_search_struc(UNPROVIDED);
        } finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }

    /**
     * Initialize a SEARCH-STRUC for use
     */
    @LispMethod(comment = "Initialize a SEARCH-STRUC for use")
    public static final SubLObject init_search_struc_alt(SubLObject v_search) {
        return v_search;
    }

    /**
     * Initialize a SEARCH-STRUC for use
     */
    @LispMethod(comment = "Initialize a SEARCH-STRUC for use")
    public static SubLObject init_search_struc(final SubLObject v_search) {
        return v_search;
    }

    /**
     * Check if OBJECT is a SEARCH-STRUC that has been explicitly freed
     */
    @LispMethod(comment = "Check if OBJECT is a SEARCH-STRUC that has been explicitly freed")
    public static final SubLObject free_search_struc_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != search_struc_p(v_object)) && (search_leaves(v_object) == $FREE));
    }

    /**
     * Check if OBJECT is a SEARCH-STRUC that has been explicitly freed
     */
    @LispMethod(comment = "Check if OBJECT is a SEARCH-STRUC that has been explicitly freed")
    public static SubLObject free_search_struc_p(final SubLObject v_object) {
        return makeBoolean((NIL != search_struc_p(v_object)) && (search_leaves(v_object) == $FREE));
    }

    /**
     * Place a SEARCH-STRUC onto the free list
     */
    @LispMethod(comment = "Place a SEARCH-STRUC onto the free list")
    public static final SubLObject free_search_struc_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_STRUC_P);
        if (NIL == free_search_struc_p(v_object)) {
            v_object = init_search_struc(v_object);
            _csetf_search_leaves(v_object, $FREE);
            if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
                {
                    SubLObject lock = $search_struc_free_lock$.getGlobalValue();
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        _csetf_search_tree(v_object, $search_struc_free_list$.getGlobalValue());
                        $search_struc_free_list$.setGlobalValue(v_object);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     * Place a SEARCH-STRUC onto the free list
     */
    @LispMethod(comment = "Place a SEARCH-STRUC onto the free list")
    public static SubLObject free_search_struc(SubLObject v_object) {
        assert NIL != search_struc_p(v_object) : "! search.search_struc_p(v_object) " + "search.search_struc_p error :" + v_object;
        if (NIL == free_search_struc_p(v_object)) {
            v_object = init_search_struc(v_object);
            _csetf_search_leaves(v_object, $FREE);
            if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
                SubLObject release = NIL;
                try {
                    release = seize_lock($search_struc_free_lock$.getGlobalValue());
                    _csetf_search_tree(v_object, $search_struc_free_list$.getGlobalValue());
                    $search_struc_free_list$.setGlobalValue(v_object);
                } finally {
                    if (NIL != release) {
                        release_lock($search_struc_free_lock$.getGlobalValue());
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     * Get a SEARCH-STRUC from the free list, or make a new one if needed
     */
    @LispMethod(comment = "Get a SEARCH-STRUC from the free list, or make a new one if needed")
    public static final SubLObject get_search_struc_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $structure_resourcing_enabled$.getGlobalValue()) {
                if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
                    return init_search_struc(make_static_search_struc());
                } else {
                    return init_search_struc(make_search_struc(UNPROVIDED));
                }
            }
            {
                SubLObject v_object = NIL;
                SubLObject found = NIL;
                SubLObject lock = $search_struc_free_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    v_object = $search_struc_free_list$.getGlobalValue();
                    for (; !((NIL != found) || (NIL == v_object));) {
                        if (NIL != free_search_struc_p(v_object)) {
                            $search_struc_free_list$.setGlobalValue(search_tree(v_object));
                            found = T;
                        } else {
                            v_object = search_tree(v_object);
                        }
                    }
                    if (NIL == found) {
                        if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
                            v_object = make_static_search_struc();
                        } else {
                            v_object = make_search_struc(UNPROVIDED);
                        }
                        $search_struc_free_list$.setGlobalValue(NIL);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return init_search_struc(v_object);
            }
        }
    }

    /**
     * Get a SEARCH-STRUC from the free list, or make a new one if needed
     */
    @LispMethod(comment = "Get a SEARCH-STRUC from the free list, or make a new one if needed")
    public static SubLObject get_search_struc() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
            SubLObject v_object = NIL;
            SubLObject found = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock($search_struc_free_lock$.getGlobalValue());
                v_object = $search_struc_free_list$.getGlobalValue();
                while ((NIL == found) && (NIL != v_object)) {
                    if (NIL != free_search_struc_p(v_object)) {
                        $search_struc_free_list$.setGlobalValue(search_tree(v_object));
                        found = T;
                    } else {
                        v_object = search_tree(v_object);
                    }
                } 
                if (NIL == found) {
                    if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
                        v_object = make_static_search_struc();
                    } else {
                        v_object = make_search_struc(UNPROVIDED);
                    }
                    $search_struc_free_list$.setGlobalValue(NIL);
                }
            } finally {
                if (NIL != release) {
                    release_lock($search_struc_free_lock$.getGlobalValue());
                }
            }
            return init_search_struc(v_object);
        }
        if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
            return init_search_struc(make_static_search_struc());
        }
        return init_search_struc(make_search_struc(UNPROVIDED));
    }

    public static final SubLObject new_search_alt(SubLObject no_leaves_p_func, SubLObject next_node_func, SubLObject goal_p_func, SubLObject add_goal_func, SubLObject options_func, SubLObject expand_func, SubLObject add_node_func, SubLObject too_deep_func, SubLObject state, SubLObject print_func) {
        if (state == UNPROVIDED) {
            state = NIL;
        }
        if (print_func == UNPROVIDED) {
            print_func = NIL;
        }
        {
            SubLObject v_new = get_search_struc();
            _csetf_search_tree(v_new, NIL);
            _csetf_search_leaves(v_new, NIL);
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
    }

    public static SubLObject new_search(final SubLObject no_leaves_p_func, final SubLObject next_node_func, final SubLObject goal_p_func, final SubLObject add_goal_func, final SubLObject options_func, final SubLObject expand_func, final SubLObject add_node_func, final SubLObject too_deep_func, SubLObject state, SubLObject print_func) {
        if (state == UNPROVIDED) {
            state = NIL;
        }
        if (print_func == UNPROVIDED) {
            print_func = NIL;
        }
        final SubLObject v_new = get_search_struc();
        _csetf_search_tree(v_new, NIL);
        _csetf_search_leaves(v_new, NIL);
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

    public static final SubLObject search_node_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_snode(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject search_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_snode(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject search_node_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.search.$search_node_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject search_node_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.search.$search_node_native.class ? T : NIL;
    }

    public static final SubLObject snode_search_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        return v_object.getField2();
    }

    public static SubLObject snode_search(final SubLObject v_object) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject snode_parent_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        return v_object.getField3();
    }

    public static SubLObject snode_parent(final SubLObject v_object) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject snode_children_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        return v_object.getField4();
    }

    public static SubLObject snode_children(final SubLObject v_object) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject snode_depth_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        return v_object.getField5();
    }

    public static SubLObject snode_depth(final SubLObject v_object) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject snode_options_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        return v_object.getField6();
    }

    public static SubLObject snode_options(final SubLObject v_object) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject snode_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        return v_object.getField7();
    }

    public static SubLObject snode_state(final SubLObject v_object) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_snode_search_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_snode_search(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_snode_parent_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_snode_parent(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_snode_children_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_snode_children(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_snode_depth_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_snode_depth(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_snode_options_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_snode_options(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_snode_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_snode_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_search_node_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.search.$search_node_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SEARCH)) {
                        _csetf_snode_search(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PARENT)) {
                            _csetf_snode_parent(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CHILDREN)) {
                                _csetf_snode_children(v_new, current_value);
                            } else {
                                if (pcase_var.eql($DEPTH)) {
                                    _csetf_snode_depth(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($OPTIONS)) {
                                        _csetf_snode_options(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($STATE)) {
                                            _csetf_snode_state(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt53$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_search_node(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.search.$search_node_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SEARCH)) {
                _csetf_snode_search(v_new, current_value);
            } else
                if (pcase_var.eql($PARENT)) {
                    _csetf_snode_parent(v_new, current_value);
                } else
                    if (pcase_var.eql($CHILDREN)) {
                        _csetf_snode_children(v_new, current_value);
                    } else
                        if (pcase_var.eql($DEPTH)) {
                            _csetf_snode_depth(v_new, current_value);
                        } else
                            if (pcase_var.eql($OPTIONS)) {
                                _csetf_snode_options(v_new, current_value);
                            } else
                                if (pcase_var.eql($STATE)) {
                                    _csetf_snode_state(v_new, current_value);
                                } else {
                                    Errors.error($str54$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_search_node(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SEARCH_NODE, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SEARCH, snode_search(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT, snode_parent(obj));
        funcall(visitor_fn, obj, $SLOT, $CHILDREN, snode_children(obj));
        funcall(visitor_fn, obj, $SLOT, $DEPTH, snode_depth(obj));
        funcall(visitor_fn, obj, $SLOT, $OPTIONS, snode_options(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, snode_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_SEARCH_NODE, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_search_node_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_search_node(obj, visitor_fn);
    }

    public static final SubLObject print_snode_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt82$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return NIL;
        }
    }

    public static SubLObject print_snode(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, NIL);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return NIL;
    }

    /**
     * Make a new SEARCH-NODE in the static area
     */
    @LispMethod(comment = "Make a new SEARCH-NODE in the static area")
    public static final SubLObject make_static_search_node_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_object = NIL;
                {
                    SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
                    try {
                        Storage.$current_area$.bind(Storage.get_static_area(), thread);
                        v_object = make_search_node(UNPROVIDED);
                    } finally {
                        Storage.$current_area$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_object;
            }
        }
    }

    /**
     * Make a new SEARCH-NODE in the static area
     */
    @LispMethod(comment = "Make a new SEARCH-NODE in the static area")
    public static SubLObject make_static_search_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_object = NIL;
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            v_object = make_search_node(UNPROVIDED);
        } finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }

    /**
     * Initialize a SEARCH-NODE for use
     */
    @LispMethod(comment = "Initialize a SEARCH-NODE for use")
    public static final SubLObject init_search_node_alt(SubLObject snode) {
        _csetf_snode_search(snode, NIL);
        _csetf_snode_parent(snode, NIL);
        _csetf_snode_children(snode, NIL);
        _csetf_snode_depth(snode, NIL);
        _csetf_snode_options(snode, $UNDETERMINED);
        _csetf_snode_state(snode, NIL);
        return snode;
    }

    /**
     * Initialize a SEARCH-NODE for use
     */
    @LispMethod(comment = "Initialize a SEARCH-NODE for use")
    public static SubLObject init_search_node(final SubLObject snode) {
        _csetf_snode_search(snode, NIL);
        _csetf_snode_parent(snode, NIL);
        _csetf_snode_children(snode, NIL);
        _csetf_snode_depth(snode, NIL);
        _csetf_snode_options(snode, $UNDETERMINED);
        _csetf_snode_state(snode, NIL);
        return snode;
    }

    /**
     * Check if OBJECT is a SEARCH-NODE that has been explicitly freed
     */
    @LispMethod(comment = "Check if OBJECT is a SEARCH-NODE that has been explicitly freed")
    public static final SubLObject free_search_node_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != search_node_p(v_object)) && (snode_parent(v_object) == $FREE));
    }

    /**
     * Check if OBJECT is a SEARCH-NODE that has been explicitly freed
     */
    @LispMethod(comment = "Check if OBJECT is a SEARCH-NODE that has been explicitly freed")
    public static SubLObject free_search_node_p(final SubLObject v_object) {
        return makeBoolean((NIL != search_node_p(v_object)) && (snode_parent(v_object) == $FREE));
    }

    /**
     * Place a SEARCH-NODE onto the free list
     */
    @LispMethod(comment = "Place a SEARCH-NODE onto the free list")
    public static final SubLObject free_search_node_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SEARCH_NODE_P);
        if (NIL == free_search_node_p(v_object)) {
            v_object = init_search_node(v_object);
            _csetf_snode_parent(v_object, $FREE);
            if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
                {
                    SubLObject lock = $search_node_free_lock$.getGlobalValue();
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        _csetf_snode_search(v_object, $search_node_free_list$.getGlobalValue());
                        $search_node_free_list$.setGlobalValue(v_object);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     * Place a SEARCH-NODE onto the free list
     */
    @LispMethod(comment = "Place a SEARCH-NODE onto the free list")
    public static SubLObject free_search_node(SubLObject v_object) {
        assert NIL != search_node_p(v_object) : "! search.search_node_p(v_object) " + "search.search_node_p error :" + v_object;
        if (NIL == free_search_node_p(v_object)) {
            v_object = init_search_node(v_object);
            _csetf_snode_parent(v_object, $FREE);
            if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
                SubLObject release = NIL;
                try {
                    release = seize_lock($search_node_free_lock$.getGlobalValue());
                    _csetf_snode_search(v_object, $search_node_free_list$.getGlobalValue());
                    $search_node_free_list$.setGlobalValue(v_object);
                } finally {
                    if (NIL != release) {
                        release_lock($search_node_free_lock$.getGlobalValue());
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     * Get a SEARCH-NODE from the free list, or make a new one if needed
     */
    @LispMethod(comment = "Get a SEARCH-NODE from the free list, or make a new one if needed")
    public static final SubLObject get_search_node_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $structure_resourcing_enabled$.getGlobalValue()) {
                if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
                    return init_search_node(make_static_search_node());
                } else {
                    return init_search_node(make_search_node(UNPROVIDED));
                }
            }
            {
                SubLObject v_object = NIL;
                SubLObject found = NIL;
                SubLObject lock = $search_node_free_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    v_object = $search_node_free_list$.getGlobalValue();
                    for (; !((NIL != found) || (NIL == v_object));) {
                        if (NIL != free_search_node_p(v_object)) {
                            $search_node_free_list$.setGlobalValue(snode_search(v_object));
                            found = T;
                        } else {
                            v_object = snode_search(v_object);
                        }
                    }
                    if (NIL == found) {
                        if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
                            v_object = make_static_search_node();
                        } else {
                            v_object = make_search_node(UNPROVIDED);
                        }
                        $search_node_free_list$.setGlobalValue(NIL);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return init_search_node(v_object);
            }
        }
    }

    /**
     * Get a SEARCH-NODE from the free list, or make a new one if needed
     */
    @LispMethod(comment = "Get a SEARCH-NODE from the free list, or make a new one if needed")
    public static SubLObject get_search_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
            SubLObject v_object = NIL;
            SubLObject found = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock($search_node_free_lock$.getGlobalValue());
                v_object = $search_node_free_list$.getGlobalValue();
                while ((NIL == found) && (NIL != v_object)) {
                    if (NIL != free_search_node_p(v_object)) {
                        $search_node_free_list$.setGlobalValue(snode_search(v_object));
                        found = T;
                    } else {
                        v_object = snode_search(v_object);
                    }
                } 
                if (NIL == found) {
                    if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
                        v_object = make_static_search_node();
                    } else {
                        v_object = make_search_node(UNPROVIDED);
                    }
                    $search_node_free_list$.setGlobalValue(NIL);
                }
            } finally {
                if (NIL != release) {
                    release_lock($search_node_free_lock$.getGlobalValue());
                }
            }
            return init_search_node(v_object);
        }
        if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
            return init_search_node(make_static_search_node());
        }
        return init_search_node(make_search_node(UNPROVIDED));
    }

    public static final SubLObject free_entire_search_node_alt(SubLObject snode, SubLObject state_free_func) {
        if (state_free_func == UNPROVIDED) {
            state_free_func = NIL;
        }
        if (NIL != search_node_p(snode)) {
            {
                SubLObject cdolist_list_var = snode_children(snode);
                SubLObject child = NIL;
                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                    free_entire_search_node(child, state_free_func);
                }
            }
            if (NIL != state_free_func) {
                funcall(state_free_func, snode_state(snode));
            }
            free_search_node(snode);
        }
        return NIL;
    }

    public static SubLObject free_entire_search_node(final SubLObject snode, SubLObject state_free_func) {
        if (state_free_func == UNPROVIDED) {
            state_free_func = NIL;
        }
        if (NIL != search_node_p(snode)) {
            SubLObject cdolist_list_var = snode_children(snode);
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                free_entire_search_node(child, state_free_func);
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
            if (NIL != state_free_func) {
                funcall(state_free_func, snode_state(snode));
            }
            free_search_node(snode);
        }
        return NIL;
    }

    /**
     * NODE is a dead end if it has no children and no further expansion options.
     */
    @LispMethod(comment = "NODE is a dead end if it has no children and no further expansion options.")
    public static final SubLObject dead_end_nodeP_alt(SubLObject node) {
        return makeBoolean(((NIL != search_node_p(node)) && (NIL == valid_snode_options(node))) && (NIL == snode_children(node)));
    }

    /**
     * NODE is a dead end if it has no children and no further expansion options.
     */
    @LispMethod(comment = "NODE is a dead end if it has no children and no further expansion options.")
    public static SubLObject dead_end_nodeP(final SubLObject node) {
        return makeBoolean(((NIL != search_node_p(node)) && (NIL == valid_snode_options(node))) && (NIL == snode_children(node)));
    }

    public static final SubLObject reclaim_search_node_alt(SubLObject node) {
        if (NIL != search_node_p(node)) {
            {
                SubLObject parent = snode_parent(node);
                SubLObject v_search = snode_search(node);
                free_entire_search_node(node, UNPROVIDED);
                if (NIL != search_node_p(parent)) {
                    {
                        SubLObject siblings = snode_children(parent);
                        _csetf_snode_children(parent, delete(node, siblings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        if (NIL != dead_end_nodeP(parent)) {
                            reclaim_search_node(parent);
                        }
                    }
                } else {
                    if ((NIL != search_struc_p(v_search)) && (NIL != member(node, search_tree(v_search), UNPROVIDED, UNPROVIDED))) {
                        remove_search_start_node(v_search, node);
                    } else {
                        Errors.cerror($str_alt89$So_don_t, $str_alt90$Cannot_reclaim_strange_node__S, node);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject reclaim_search_node(final SubLObject node) {
        if (NIL != search_node_p(node)) {
            final SubLObject parent = snode_parent(node);
            final SubLObject v_search = snode_search(node);
            free_entire_search_node(node, UNPROVIDED);
            if (NIL != search_node_p(parent)) {
                final SubLObject siblings = snode_children(parent);
                _csetf_snode_children(parent, delete(node, siblings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL != dead_end_nodeP(parent)) {
                    reclaim_search_node(parent);
                }
            } else
                if ((NIL != search_struc_p(v_search)) && (NIL != member(node, search_tree(v_search), UNPROVIDED, UNPROVIDED))) {
                    remove_search_start_node(v_search, node);
                } else {
                    Errors.cerror($str95$So_don_t, $str96$Cannot_reclaim_strange_node__S, node);
                }

        }
        return NIL;
    }

    /**
     * Interrupt the generic search we are within
     * after it finishes expanding its current search node.
     */
    @LispMethod(comment = "Interrupt the generic search we are within\r\nafter it finishes expanding its current search node.\nInterrupt the generic search we are within\nafter it finishes expanding its current search node.")
    public static final SubLObject interrupt_generic_search_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $within_generic_search$.getDynamicValue(thread)) {
                $interrupt_generic_search$.setDynamicValue(T, thread);
                return T;
            }
            return NIL;
        }
    }

    /**
     * Interrupt the generic search we are within
     * after it finishes expanding its current search node.
     */
    @LispMethod(comment = "Interrupt the generic search we are within\r\nafter it finishes expanding its current search node.\nInterrupt the generic search we are within\nafter it finishes expanding its current search node.")
    public static SubLObject interrupt_generic_search() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_generic_search$.getDynamicValue(thread)) {
            $interrupt_generic_search$.setDynamicValue(T, thread);
            return T;
        }
        return NIL;
    }

    /**
     * Forcibly abort the generic search we are within.
     */
    @LispMethod(comment = "Forcibly abort the generic search we are within.")
    public static final SubLObject abort_generic_search_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $within_generic_search$.getDynamicValue(thread)) {
                sublisp_throw($ABORT_GENERIC_SEARCH, $ABORT);
            }
            return NIL;
        }
    }

    /**
     * Forcibly abort the generic search we are within.
     */
    @LispMethod(comment = "Forcibly abort the generic search we are within.")
    public static SubLObject abort_generic_search() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_generic_search$.getDynamicValue(thread)) {
            sublisp_throw($ABORT_GENERIC_SEARCH, $ABORT);
        }
        return NIL;
    }

    /**
     * Proceed with SEARCH until either:
     * (a) quit if explicitly aborted within the search
     * (a) quit if explicitly interrupted within the search
     * (a) quit when NUMBER-CUT goals have been found (if non-null)
     * (b) quit after TIME-CUT seconds have elapsed (if non-null)
     * (c) no more nodes are available
     * Also, don't expand nodes at or past DEPTH-CUT depth (if non-null)
     * Set REASON to the reason why the search quit.
     * Use the functions provided for the search rather than those given in SEARCH.
     */
    @LispMethod(comment = "Proceed with SEARCH until either:\r\n(a) quit if explicitly aborted within the search\r\n(a) quit if explicitly interrupted within the search\r\n(a) quit when NUMBER-CUT goals have been found (if non-null)\r\n(b) quit after TIME-CUT seconds have elapsed (if non-null)\r\n(c) no more nodes are available\r\nAlso, don\'t expand nodes at or past DEPTH-CUT depth (if non-null)\r\nSet REASON to the reason why the search quit.\r\nUse the functions provided for the search rather than those given in SEARCH.\nProceed with SEARCH until either:\n(a) quit if explicitly aborted within the search\n(a) quit if explicitly interrupted within the search\n(a) quit when NUMBER-CUT goals have been found (if non-null)\n(b) quit after TIME-CUT seconds have elapsed (if non-null)\n(c) no more nodes are available\nAlso, don\'t expand nodes at or past DEPTH-CUT depth (if non-null)\nSet REASON to the reason why the search quit.\nUse the functions provided for the search rather than those given in SEARCH.")
    public static final SubLObject do_generic_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt93);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject reason = NIL;
                    SubLObject v_search = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt93);
                    reason = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt93);
                    v_search = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt93);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt93);
                            if (NIL == member(current_3, $list_alt94, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt93);
                        }
                        {
                            SubLObject number_cut_tail = property_list_member($NUMBER_CUT, current);
                            SubLObject number_cut = (NIL != number_cut_tail) ? ((SubLObject) (cadr(number_cut_tail))) : NIL;
                            SubLObject time_cut_tail = property_list_member($TIME_CUT, current);
                            SubLObject time_cut = (NIL != time_cut_tail) ? ((SubLObject) (cadr(time_cut_tail))) : NIL;
                            SubLObject depth_cut_tail = property_list_member($DEPTH_CUT, current);
                            SubLObject depth_cut = (NIL != depth_cut_tail) ? ((SubLObject) (cadr(depth_cut_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject no_leaves_p_func = NIL;
                                SubLObject next_node_func = NIL;
                                SubLObject goal_p_func = NIL;
                                SubLObject add_goal_func = NIL;
                                SubLObject too_deep_func = NIL;
                                SubLObject options_func = NIL;
                                SubLObject expand_func = NIL;
                                SubLObject add_node_func = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt93);
                                no_leaves_p_func = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt93);
                                next_node_func = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt93);
                                goal_p_func = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt93);
                                add_goal_func = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt93);
                                too_deep_func = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt93);
                                options_func = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt93);
                                expand_func = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt93);
                                add_node_func = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject number = $sym99$NUMBER;
                                        SubLObject time = $sym100$TIME;
                                        SubLObject depth_limit_crossed = $sym101$DEPTH_LIMIT_CROSSED;
                                        SubLObject aborted = $sym102$ABORTED;
                                        SubLObject next = $sym103$NEXT;
                                        SubLObject new_leaves = $sym104$NEW_LEAVES;
                                        SubLObject previous_goals = $sym105$PREVIOUS_GOALS;
                                        SubLObject new_goals = $sym106$NEW_GOALS;
                                        SubLObject increment_count = $sym107$INCREMENT_COUNT;
                                        SubLObject options = $sym108$OPTIONS;
                                        SubLObject option = $sym109$OPTION;
                                        SubLObject self_re_addedP = $sym110$SELF_RE_ADDED_;
                                        SubLObject new_nodes = $sym111$NEW_NODES;
                                        SubLObject new_node = $sym112$NEW_NODE;
                                        SubLObject previous_leaves = $sym113$PREVIOUS_LEAVES;
                                        return list(CLET, list(bq_cons(number, $list_alt115), list(time, listS(FIF, time_cut, list(TIME_FROM_NOW, time_cut), $list_alt118)), list(depth_limit_crossed, list(SEARCH_LIMBO, v_search))), list(CLET, list($list_alt119, aborted), list(CCATCH, $ABORT_GENERIC_SEARCH, aborted, list(CLET, $list_alt121, listS(CSETF, list(SEARCH_CURRENT_NODE, v_search), $list_alt118), list(UNTIL, list(COR, $interrupt_generic_search$, list(CAND, number_cut, list($sym127$__, number, number_cut)), list(CAND, time_cut, list($sym128$TIME_HAS_ARRIVED_, time)), list(FUNCALL_SHORTCUT, no_leaves_p_func, list(SEARCH_LEAVES, v_search))), list(CMULTIPLE_VALUE_BIND, list(next, new_leaves), list(FUNCALL_SHORTCUT, next_node_func, list(SEARCH_LEAVES, v_search)), list(CSETF, list(SEARCH_LEAVES, v_search), new_leaves), list(PCOND, list(list($sym132$DOOMED_SEARCH_NODE_, next)), list(list(FUNCALL_SHORTCUT, goal_p_func, next), list(CLET, list(list(previous_goals, list(SEARCH_GOALS, v_search))), list(CMULTIPLE_VALUE_BIND, list(new_goals, increment_count), list(FUNCALL_SHORTCUT, add_goal_func, next, previous_goals), list(CSETF, list(SEARCH_GOALS, v_search), new_goals), list(PWHEN, increment_count, list(CINC, number))), listS(CSETF, list(SNODE_OPTIONS, next), $list_alt118), list(PWHEN, $reclaim_dead_end_search_nodes$, list(GENERIC_SEARCH_RECLAIM_NODE, next)))), list(list(FUNCALL_SHORTCUT, too_deep_func, next, depth_cut), listS(CSETQ, depth_limit_crossed, $list_alt138), list(CPUSH, next, list(SEARCH_LIMBO, v_search))), list(T, list(CLET, list(list(options, list(FUNCALL_SHORTCUT, options_func, next)), self_re_addedP), list(CSETF, list(SEARCH_CURRENT_NODE, v_search), next), list(CDOLIST, list(option, options), list(CLET, list(list(new_nodes, list(FUNCALL_SHORTCUT, expand_func, next, option))), list(PWHEN, new_nodes, list(CDOLIST, list(new_node, new_nodes), list(PIF, list(EQ, new_node, next), listS(CSETQ, self_re_addedP, $list_alt138), list(GENERIC_SEARCH_LINK_CHILD_TO_PARENT, new_node, next)), list(CLET, list(list(previous_leaves, list(SEARCH_LEAVES, v_search)), new_leaves), list(CSETQ, new_leaves, list(FUNCALL_SHORTCUT, add_node_func, new_node, previous_leaves)), list(CSETF, list(SEARCH_LEAVES, v_search), new_leaves)))))), listS(CSETF, list(SEARCH_CURRENT_NODE, v_search), $list_alt118), list(CSETF, list(SNODE_CHILDREN, next), list(NREVERSE, list(SNODE_CHILDREN, next))), list(PUNLESS, self_re_addedP, list(PWHEN, $reclaim_dead_end_search_nodes$, list(GENERIC_SEARCH_RECLAIM_NODE, next)))))))))), list(PCOND, list(aborted, listS(CSETQ, reason, $list_alt145)), list($interrupt_generic_search$, listS(CSETQ, reason, $list_alt146)), list(list(CAND, number_cut, list($sym127$__, number, number_cut)), listS(CSETQ, reason, $list_alt147)), list(list(CAND, time_cut, list($sym128$TIME_HAS_ARRIVED_, time)), listS(CSETQ, reason, $list_alt148)), list(depth_limit_crossed, listS(CSETQ, reason, $list_alt149)), list(T, listS(CSETQ, reason, $list_alt150)))));
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt93);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Proceed with SEARCH until either:
     * (a) quit if explicitly aborted within the search
     * (a) quit if explicitly interrupted within the search
     * (a) quit when NUMBER-CUT goals have been found (if non-null)
     * (b) quit after TIME-CUT seconds have elapsed (if non-null)
     * (c) no more nodes are available
     * Also, don't expand nodes at or past DEPTH-CUT depth (if non-null)
     * Set REASON to the reason why the search quit.
     * Use the functions provided for the search rather than those given in SEARCH.
     */
    @LispMethod(comment = "Proceed with SEARCH until either:\r\n(a) quit if explicitly aborted within the search\r\n(a) quit if explicitly interrupted within the search\r\n(a) quit when NUMBER-CUT goals have been found (if non-null)\r\n(b) quit after TIME-CUT seconds have elapsed (if non-null)\r\n(c) no more nodes are available\r\nAlso, don\'t expand nodes at or past DEPTH-CUT depth (if non-null)\r\nSet REASON to the reason why the search quit.\r\nUse the functions provided for the search rather than those given in SEARCH.\nProceed with SEARCH until either:\n(a) quit if explicitly aborted within the search\n(a) quit if explicitly interrupted within the search\n(a) quit when NUMBER-CUT goals have been found (if non-null)\n(b) quit after TIME-CUT seconds have elapsed (if non-null)\n(c) no more nodes are available\nAlso, don\'t expand nodes at or past DEPTH-CUT depth (if non-null)\nSet REASON to the reason why the search quit.\nUse the functions provided for the search rather than those given in SEARCH.")
    public static SubLObject do_generic_search(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject reason = NIL;
        SubLObject v_search = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        reason = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        v_search = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list99);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list99);
            if (NIL == member(current_$1, $list100, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list99);
        }
        final SubLObject number_cut_tail = property_list_member($NUMBER_CUT, current);
        final SubLObject number_cut = (NIL != number_cut_tail) ? cadr(number_cut_tail) : NIL;
        final SubLObject time_cut_tail = property_list_member($TIME_CUT, current);
        final SubLObject time_cut = (NIL != time_cut_tail) ? cadr(time_cut_tail) : NIL;
        final SubLObject depth_cut_tail = property_list_member($DEPTH_CUT, current);
        final SubLObject depth_cut = (NIL != depth_cut_tail) ? cadr(depth_cut_tail) : NIL;
        current = temp;
        SubLObject no_leaves_p_func = NIL;
        SubLObject next_node_func = NIL;
        SubLObject goal_p_func = NIL;
        SubLObject add_goal_func = NIL;
        SubLObject too_deep_func = NIL;
        SubLObject options_func = NIL;
        SubLObject expand_func = NIL;
        SubLObject add_node_func = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        no_leaves_p_func = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        next_node_func = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        goal_p_func = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        add_goal_func = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        too_deep_func = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        options_func = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        expand_func = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        add_node_func = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject number = $sym105$NUMBER;
            final SubLObject time = $sym106$TIME;
            final SubLObject depth_limit_crossed = $sym107$DEPTH_LIMIT_CROSSED;
            final SubLObject aborted = $sym108$ABORTED;
            final SubLObject next = $sym109$NEXT;
            final SubLObject new_leaves = $sym110$NEW_LEAVES;
            final SubLObject previous_goals = $sym111$PREVIOUS_GOALS;
            final SubLObject new_goals = $sym112$NEW_GOALS;
            final SubLObject increment_count = $sym113$INCREMENT_COUNT;
            final SubLObject options = $sym114$OPTIONS;
            final SubLObject option = $sym115$OPTION;
            final SubLObject self_re_addedP = $sym116$SELF_RE_ADDED_;
            final SubLObject new_nodes = $sym117$NEW_NODES;
            final SubLObject new_node = $sym118$NEW_NODE;
            final SubLObject previous_leaves = $sym119$PREVIOUS_LEAVES;
            return list(CLET, list(bq_cons(number, $list121), list(time, listS(FIF, time_cut, list(TIME_FROM_NOW, time_cut), $list124)), list(depth_limit_crossed, list(SEARCH_LIMBO, v_search))), list(CLET, list($list125, aborted), list(CCATCH, $ABORT_GENERIC_SEARCH, aborted, list(CLET, $list127, listS(CSETF, list(SEARCH_CURRENT_NODE, v_search), $list124), list(UNTIL, list(COR, $interrupt_generic_search$, list(CAND, number_cut, list($sym133$__, number, number_cut)), list(CAND, time_cut, list($sym134$TIME_HAS_ARRIVED_, time)), list(FUNCALL_SHORTCUT, no_leaves_p_func, list(SEARCH_LEAVES, v_search))), list(CMULTIPLE_VALUE_BIND, list(next, new_leaves), list(FUNCALL_SHORTCUT, next_node_func, list(SEARCH_LEAVES, v_search)), list(CSETF, list(SEARCH_LEAVES, v_search), new_leaves), list(PCOND, list(list($sym138$DOOMED_SEARCH_NODE_, next)), list(list(FUNCALL_SHORTCUT, goal_p_func, next), list(CLET, list(list(previous_goals, list(SEARCH_GOALS, v_search))), list(CMULTIPLE_VALUE_BIND, list(new_goals, increment_count), list(FUNCALL_SHORTCUT, add_goal_func, next, previous_goals), list(CSETF, list(SEARCH_GOALS, v_search), new_goals), list(PWHEN, increment_count, list(CINC, number))), listS(CSETF, list(SNODE_OPTIONS, next), $list124), list(PWHEN, $reclaim_dead_end_search_nodes$, list(GENERIC_SEARCH_RECLAIM_NODE, next)))), list(list(FUNCALL_SHORTCUT, too_deep_func, next, depth_cut), listS(CSETQ, depth_limit_crossed, $list144), list(CPUSH, next, list(SEARCH_LIMBO, v_search))), list(T, list(CLET, list(list(options, list(FUNCALL_SHORTCUT, options_func, next)), self_re_addedP), list(CSETF, list(SEARCH_CURRENT_NODE, v_search), next), list(CDOLIST, list(option, options), list(CLET, list(list(new_nodes, list(FUNCALL_SHORTCUT, expand_func, next, option))), list(PWHEN, new_nodes, list(CDOLIST, list(new_node, new_nodes), list(PIF, list(EQ, new_node, next), listS(CSETQ, self_re_addedP, $list144), list(GENERIC_SEARCH_LINK_CHILD_TO_PARENT, new_node, next)), list(CLET, list(list(previous_leaves, list(SEARCH_LEAVES, v_search)), new_leaves), list(CSETQ, new_leaves, list(FUNCALL_SHORTCUT, add_node_func, new_node, previous_leaves)), list(CSETF, list(SEARCH_LEAVES, v_search), new_leaves)))))), listS(CSETF, list(SEARCH_CURRENT_NODE, v_search), $list124), list(CSETF, list(SNODE_CHILDREN, next), list(NREVERSE, list(SNODE_CHILDREN, next))), list(PUNLESS, self_re_addedP, list(PWHEN, $reclaim_dead_end_search_nodes$, list(GENERIC_SEARCH_RECLAIM_NODE, next)))))))))), list(PCOND, list(aborted, listS(CSETQ, reason, $list151)), list($interrupt_generic_search$, listS(CSETQ, reason, $list152)), list(list(CAND, number_cut, list($sym133$__, number, number_cut)), listS(CSETQ, reason, $list153)), list(list(CAND, time_cut, list($sym134$TIME_HAS_ARRIVED_, time)), listS(CSETQ, reason, $list154)), list(depth_limit_crossed, listS(CSETQ, reason, $list155)), list(T, listS(CSETQ, reason, $list156)))));
        }
        cdestructuring_bind_error(datum, $list99);
        return NIL;
    }

    /**
     * Proceed with SEARCH until either:
     * (a) quit if explicitly aborted within the search
     * (a) quit if explicitly interrupted within the search
     * (a) quit when NUMBER-CUT goals have been found (if non-null)
     * (b) quit after TIME-CUT seconds have elapsed (if non-null)
     * (c) no more nodes are available
     * Return the reason why the search quit.
     * Also, don't expand nodes at or past DEPTH-CUT depth (if non-null)
     */
    @LispMethod(comment = "Proceed with SEARCH until either:\r\n(a) quit if explicitly aborted within the search\r\n(a) quit if explicitly interrupted within the search\r\n(a) quit when NUMBER-CUT goals have been found (if non-null)\r\n(b) quit after TIME-CUT seconds have elapsed (if non-null)\r\n(c) no more nodes are available\r\nReturn the reason why the search quit.\r\nAlso, don\'t expand nodes at or past DEPTH-CUT depth (if non-null)\nProceed with SEARCH until either:\n(a) quit if explicitly aborted within the search\n(a) quit if explicitly interrupted within the search\n(a) quit when NUMBER-CUT goals have been found (if non-null)\n(b) quit after TIME-CUT seconds have elapsed (if non-null)\n(c) no more nodes are available\nReturn the reason why the search quit.\nAlso, don\'t expand nodes at or past DEPTH-CUT depth (if non-null)")
    public static final SubLObject generic_search_alt(SubLObject v_search, SubLObject number_cut, SubLObject time_cut, SubLObject depth_cut) {
        if (number_cut == UNPROVIDED) {
            number_cut = NIL;
        }
        if (time_cut == UNPROVIDED) {
            time_cut = NIL;
        }
        if (depth_cut == UNPROVIDED) {
            depth_cut = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject no_leaves_p_func = search_no_leaves_p_func(v_search);
                SubLObject next_node_func = search_next_node_func(v_search);
                SubLObject goal_p_func = search_goal_p_func(v_search);
                SubLObject add_goal_func = search_add_goal_func(v_search);
                SubLObject too_deep_func = search_too_deep_func(v_search);
                SubLObject options_func = search_options_func(v_search);
                SubLObject expand_func = search_expand_func(v_search);
                SubLObject add_node_func = search_add_node_func(v_search);
                SubLObject reason = NIL;
                SubLObject number = ZERO_INTEGER;
                SubLObject time = (NIL != time_cut) ? ((SubLObject) (numeric_date_utilities.time_from_now(time_cut))) : NIL;
                SubLObject depth_limit_crossed = search_limbo(v_search);
                {
                    SubLObject _prev_bind_0 = $interrupt_generic_search$.currentBinding(thread);
                    try {
                        $interrupt_generic_search$.bind(NIL, thread);
                        {
                            SubLObject aborted = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0_4 = $within_generic_search$.currentBinding(thread);
                                    try {
                                        $within_generic_search$.bind(T, thread);
                                        _csetf_search_current_node(v_search, NIL);
                                        while (!((((NIL != $interrupt_generic_search$.getDynamicValue(thread)) || ((NIL != number_cut) && number.numGE(number_cut))) || ((NIL != time_cut) && (NIL != time_has_arrivedP(time)))) || (NIL != funcall(no_leaves_p_func, search_leaves(v_search))))) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject next = funcall(next_node_func, search_leaves(v_search));
                                                SubLObject new_leaves = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                _csetf_search_leaves(v_search, new_leaves);
                                                if (NIL != doomed_search_nodeP(next)) {
                                                } else {
                                                    if (NIL != funcall(goal_p_func, next)) {
                                                        {
                                                            SubLObject previous_goals = search_goals(v_search);
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject new_goals = funcall(add_goal_func, next, previous_goals);
                                                                SubLObject increment_count = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                _csetf_search_goals(v_search, new_goals);
                                                                if (NIL != increment_count) {
                                                                    number = add(number, ONE_INTEGER);
                                                                }
                                                            }
                                                            _csetf_snode_options(next, NIL);
                                                            if (NIL != $reclaim_dead_end_search_nodes$.getDynamicValue(thread)) {
                                                                generic_search_reclaim_node(next);
                                                            }
                                                        }
                                                    } else {
                                                        if (NIL != funcall(too_deep_func, next, depth_cut)) {
                                                            depth_limit_crossed = T;
                                                            _csetf_search_limbo(v_search, cons(next, search_limbo(v_search)));
                                                        } else {
                                                            {
                                                                SubLObject options = funcall(options_func, next);
                                                                SubLObject self_re_addedP = NIL;
                                                                _csetf_search_current_node(v_search, next);
                                                                {
                                                                    SubLObject cdolist_list_var = options;
                                                                    SubLObject option = NIL;
                                                                    for (option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , option = cdolist_list_var.first()) {
                                                                        {
                                                                            SubLObject new_nodes = funcall(expand_func, next, option);
                                                                            if (NIL != new_nodes) {
                                                                                {
                                                                                    SubLObject cdolist_list_var_5 = new_nodes;
                                                                                    SubLObject new_node = NIL;
                                                                                    for (new_node = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , new_node = cdolist_list_var_5.first()) {
                                                                                        if (new_node == next) {
                                                                                            self_re_addedP = T;
                                                                                        } else {
                                                                                            generic_search_link_child_to_parent(new_node, next);
                                                                                        }
                                                                                        {
                                                                                            SubLObject previous_leaves = search_leaves(v_search);
                                                                                            SubLObject new_leaves_6 = NIL;
                                                                                            new_leaves_6 = funcall(add_node_func, new_node, previous_leaves);
                                                                                            _csetf_search_leaves(v_search, new_leaves_6);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                _csetf_search_current_node(v_search, NIL);
                                                                _csetf_snode_children(next, nreverse(snode_children(next)));
                                                                if (NIL == self_re_addedP) {
                                                                    if (NIL != $reclaim_dead_end_search_nodes$.getDynamicValue(thread)) {
                                                                        generic_search_reclaim_node(next);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } 
                                    } finally {
                                        $within_generic_search$.rebind(_prev_bind_0_4, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                aborted = Errors.handleThrowable(ccatch_env_var, $ABORT_GENERIC_SEARCH);
                            }
                            if (NIL != aborted) {
                                reason = $ABORT;
                            } else {
                                if (NIL != $interrupt_generic_search$.getDynamicValue(thread)) {
                                    reason = $INTERRUPT;
                                } else {
                                    if ((NIL != number_cut) && number.numGE(number_cut)) {
                                        reason = $NUMBER;
                                    } else {
                                        if ((NIL != time_cut) && (NIL != time_has_arrivedP(time))) {
                                            reason = $TIME;
                                        } else {
                                            if (NIL != depth_limit_crossed) {
                                                reason = $DEPTH;
                                            } else {
                                                reason = $EXHAUST;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        $interrupt_generic_search$.rebind(_prev_bind_0, thread);
                    }
                }
                return reason;
            }
        }
    }

    @LispMethod(comment = "Proceed with SEARCH until either:\r\n(a) quit if explicitly aborted within the search\r\n(a) quit if explicitly interrupted within the search\r\n(a) quit when NUMBER-CUT goals have been found (if non-null)\r\n(b) quit after TIME-CUT seconds have elapsed (if non-null)\r\n(c) no more nodes are available\r\nReturn the reason why the search quit.\r\nAlso, don\'t expand nodes at or past DEPTH-CUT depth (if non-null)\nProceed with SEARCH until either:\n(a) quit if explicitly aborted within the search\n(a) quit if explicitly interrupted within the search\n(a) quit when NUMBER-CUT goals have been found (if non-null)\n(b) quit after TIME-CUT seconds have elapsed (if non-null)\n(c) no more nodes are available\nReturn the reason why the search quit.\nAlso, don\'t expand nodes at or past DEPTH-CUT depth (if non-null)")
    public static SubLObject generic_search(final SubLObject v_search, SubLObject number_cut, SubLObject time_cut, SubLObject depth_cut) {
        if (number_cut == UNPROVIDED) {
            number_cut = NIL;
        }
        if (time_cut == UNPROVIDED) {
            time_cut = NIL;
        }
        if (depth_cut == UNPROVIDED) {
            depth_cut = NIL;
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
        SubLObject reason = NIL;
        SubLObject number = ZERO_INTEGER;
        final SubLObject time = (NIL != time_cut) ? numeric_date_utilities.time_from_now(time_cut) : NIL;
        SubLObject depth_limit_crossed = search_limbo(v_search);
        final SubLObject _prev_bind_0 = $interrupt_generic_search$.currentBinding(thread);
        try {
            $interrupt_generic_search$.bind(NIL, thread);
            SubLObject aborted = NIL;
            try {
                thread.throwStack.push($ABORT_GENERIC_SEARCH);
                final SubLObject _prev_bind_0_$2 = $within_generic_search$.currentBinding(thread);
                try {
                    $within_generic_search$.bind(T, thread);
                    _csetf_search_current_node(v_search, NIL);
                    while ((((NIL == $interrupt_generic_search$.getDynamicValue(thread)) && ((NIL == number_cut) || (!number.numGE(number_cut)))) && ((NIL == time_cut) || (NIL == time_has_arrivedP(time)))) && (NIL == funcall(no_leaves_p_func, search_leaves(v_search)))) {
                        thread.resetMultipleValues();
                        final SubLObject next = funcall(next_node_func, search_leaves(v_search));
                        final SubLObject new_leaves = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        _csetf_search_leaves(v_search, new_leaves);
                        if (NIL != doomed_search_nodeP(next)) {
                            continue;
                        }
                        if (NIL != funcall(goal_p_func, next)) {
                            final SubLObject previous_goals = search_goals(v_search);
                            thread.resetMultipleValues();
                            final SubLObject new_goals = funcall(add_goal_func, next, previous_goals);
                            final SubLObject increment_count = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            _csetf_search_goals(v_search, new_goals);
                            if (NIL != increment_count) {
                                number = add(number, ONE_INTEGER);
                            }
                            _csetf_snode_options(next, NIL);
                            if (NIL == $reclaim_dead_end_search_nodes$.getDynamicValue(thread)) {
                                continue;
                            }
                            generic_search_reclaim_node(next);
                        } else
                            if (NIL != funcall(too_deep_func, next, depth_cut)) {
                                depth_limit_crossed = T;
                                _csetf_search_limbo(v_search, cons(next, search_limbo(v_search)));
                            } else {
                                final SubLObject options = funcall(options_func, next);
                                SubLObject self_re_addedP = NIL;
                                _csetf_search_current_node(v_search, next);
                                SubLObject cdolist_list_var = options;
                                SubLObject option = NIL;
                                option = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject new_nodes = funcall(expand_func, next, option);
                                    if (NIL != new_nodes) {
                                        SubLObject cdolist_list_var_$3 = new_nodes;
                                        SubLObject new_node = NIL;
                                        new_node = cdolist_list_var_$3.first();
                                        while (NIL != cdolist_list_var_$3) {
                                            if (new_node.eql(next)) {
                                                self_re_addedP = T;
                                            } else {
                                                generic_search_link_child_to_parent(new_node, next);
                                            }
                                            final SubLObject previous_leaves = search_leaves(v_search);
                                            SubLObject new_leaves_$4 = NIL;
                                            new_leaves_$4 = funcall(add_node_func, new_node, previous_leaves);
                                            _csetf_search_leaves(v_search, new_leaves_$4);
                                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                            new_node = cdolist_list_var_$3.first();
                                        } 
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    option = cdolist_list_var.first();
                                } 
                                _csetf_search_current_node(v_search, NIL);
                                _csetf_snode_children(next, nreverse(snode_children(next)));
                                if ((NIL != self_re_addedP) || (NIL == $reclaim_dead_end_search_nodes$.getDynamicValue(thread))) {
                                    continue;
                                }
                                generic_search_reclaim_node(next);
                            }

                    } 
                } finally {
                    $within_generic_search$.rebind(_prev_bind_0_$2, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                aborted = Errors.handleThrowable(ccatch_env_var, $ABORT_GENERIC_SEARCH);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != aborted) {
                reason = $ABORT;
            } else
                if (NIL != $interrupt_generic_search$.getDynamicValue(thread)) {
                    reason = $INTERRUPT;
                } else
                    if ((NIL != number_cut) && number.numGE(number_cut)) {
                        reason = $NUMBER;
                    } else
                        if ((NIL != time_cut) && (NIL != time_has_arrivedP(time))) {
                            reason = $TIME;
                        } else
                            if (NIL != depth_limit_crossed) {
                                reason = $DEPTH;
                            } else {
                                reason = $EXHAUST;
                            }




        } finally {
            $interrupt_generic_search$.rebind(_prev_bind_0, thread);
        }
        return reason;
    }

    public static final SubLObject generic_search_reclaim_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != funcall($dead_end_node_function$.getDynamicValue(thread), node)) {
                funcall($reclaim_dead_end_node_function$.getDynamicValue(thread), node);
            }
            return NIL;
        }
    }

    public static SubLObject generic_search_reclaim_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != funcall($dead_end_node_function$.getDynamicValue(thread), node)) {
            funcall($reclaim_dead_end_node_function$.getDynamicValue(thread), node);
        }
        return NIL;
    }

    public static final SubLObject generic_search_link_child_to_parent_alt(SubLObject child, SubLObject parent) {
        _csetf_snode_parent(child, parent);
        _csetf_snode_search(child, snode_search(parent));
        _csetf_snode_depth(child, add(ONE_INTEGER, snode_depth(parent)));
        _csetf_snode_children(parent, cons(child, snode_children(parent)));
        return NIL;
    }

    public static SubLObject generic_search_link_child_to_parent(final SubLObject child, final SubLObject parent) {
        _csetf_snode_parent(child, parent);
        _csetf_snode_search(child, snode_search(parent));
        _csetf_snode_depth(child, add(ONE_INTEGER, snode_depth(parent)));
        _csetf_snode_children(parent, cons(child, snode_children(parent)));
        return NIL;
    }

    public static final SubLObject reset_search_node_state_alt(SubLObject node, SubLObject state) {
        _csetf_snode_state(node, state);
        return NIL;
    }

    public static SubLObject reset_search_node_state(final SubLObject node, final SubLObject state) {
        _csetf_snode_state(node, state);
        return NIL;
    }

    public static final SubLObject new_search_node_alt(SubLObject state) {
        {
            SubLObject v_new = get_search_node();
            reset_search_node_state(v_new, state);
            _csetf_snode_options(v_new, $UNDETERMINED);
            return v_new;
        }
    }

    public static SubLObject new_search_node(final SubLObject state) {
        final SubLObject v_new = get_search_node();
        reset_search_node_state(v_new, state);
        _csetf_snode_options(v_new, $UNDETERMINED);
        return v_new;
    }

    public static final SubLObject new_search_start_node_alt(SubLObject v_search) {
        {
            SubLObject start_node = new_search_node(NIL);
            _csetf_snode_search(start_node, v_search);
            _csetf_snode_parent(start_node, NIL);
            _csetf_snode_children(start_node, NIL);
            _csetf_snode_depth(start_node, ZERO_INTEGER);
            return start_node;
        }
    }

    public static SubLObject new_search_start_node(final SubLObject v_search) {
        final SubLObject start_node = new_search_node(NIL);
        _csetf_snode_search(start_node, v_search);
        _csetf_snode_parent(start_node, NIL);
        _csetf_snode_children(start_node, NIL);
        _csetf_snode_depth(start_node, ZERO_INTEGER);
        return start_node;
    }

    public static final SubLObject register_search_start_node_alt(SubLObject v_search, SubLObject start_node) {
        _csetf_search_tree(v_search, cons(start_node, search_tree(v_search)));
        _csetf_search_leaves(v_search, funcall(search_add_node_func(v_search), start_node, search_leaves(v_search)));
        return start_node;
    }

    public static SubLObject register_search_start_node(final SubLObject v_search, final SubLObject start_node) {
        _csetf_search_tree(v_search, cons(start_node, search_tree(v_search)));
        _csetf_search_leaves(v_search, funcall(search_add_node_func(v_search), start_node, search_leaves(v_search)));
        return start_node;
    }

    public static final SubLObject add_search_start_node_alt(SubLObject v_search, SubLObject state) {
        {
            SubLObject start_node = new_search_start_node(v_search);
            reset_search_node_state(start_node, state);
            return register_search_start_node(v_search, start_node);
        }
    }

    public static SubLObject add_search_start_node(final SubLObject v_search, final SubLObject state) {
        final SubLObject start_node = new_search_start_node(v_search);
        reset_search_node_state(start_node, state);
        return register_search_start_node(v_search, start_node);
    }

    public static final SubLObject remove_search_start_node_alt(SubLObject v_search, SubLObject start_node) {
        _csetf_search_tree(v_search, delete(start_node, search_tree(v_search), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return v_search;
    }

    public static SubLObject remove_search_start_node(final SubLObject v_search, final SubLObject start_node) {
        _csetf_search_tree(v_search, delete(start_node, search_tree(v_search), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return v_search;
    }

    public static final SubLObject reconsider_limbo_alt(SubLObject v_search, SubLObject depth_cut) {
        {
            SubLObject add_node_func = search_add_node_func(v_search);
            SubLObject too_deep_func = search_too_deep_func(v_search);
            SubLObject leaves = search_leaves(v_search);
            SubLObject limbo = search_limbo(v_search);
            SubLObject revived = NIL;
            SubLObject still_in_limbo = NIL;
            {
                SubLObject cdolist_list_var = limbo;
                SubLObject node = NIL;
                for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                    if (NIL != funcall(too_deep_func, node, depth_cut)) {
                        still_in_limbo = cons(node, still_in_limbo);
                    } else {
                        revived = cons(node, revived);
                    }
                }
            }
            _csetf_search_limbo(v_search, nreverse(still_in_limbo));
            {
                SubLObject cdolist_list_var = nreverse(revived);
                SubLObject node = NIL;
                for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                    leaves = funcall(add_node_func, node, leaves);
                }
            }
            _csetf_search_leaves(v_search, leaves);
        }
        return v_search;
    }

    public static SubLObject reconsider_limbo(final SubLObject v_search, final SubLObject depth_cut) {
        final SubLObject add_node_func = search_add_node_func(v_search);
        final SubLObject too_deep_func = search_too_deep_func(v_search);
        SubLObject leaves = search_leaves(v_search);
        final SubLObject limbo = search_limbo(v_search);
        SubLObject revived = NIL;
        SubLObject still_in_limbo = NIL;
        SubLObject cdolist_list_var = limbo;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != funcall(too_deep_func, node, depth_cut)) {
                still_in_limbo = cons(node, still_in_limbo);
            } else {
                revived = cons(node, revived);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        _csetf_search_limbo(v_search, nreverse(still_in_limbo));
        cdolist_list_var = nreverse(revived);
        node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            leaves = funcall(add_node_func, node, leaves);
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        _csetf_search_leaves(v_search, leaves);
        return v_search;
    }

    public static final SubLObject valid_snode_options_alt(SubLObject node) {
        if (NIL == doomed_search_nodeP(node)) {
            return snode_options(node);
        }
        return NIL;
    }

    public static SubLObject valid_snode_options(final SubLObject node) {
        if (NIL == doomed_search_nodeP(node)) {
            return snode_options(node);
        }
        return NIL;
    }

    public static final SubLObject set_valid_snode_options_alt(SubLObject node, SubLObject value) {
        if (NIL == doomed_search_nodeP(node)) {
            _csetf_snode_options(node, value);
        }
        return value;
    }

    public static SubLObject set_valid_snode_options(final SubLObject node, final SubLObject value) {
        if (NIL == doomed_search_nodeP(node)) {
            _csetf_snode_options(node, value);
        }
        return value;
    }

    public static final SubLObject doomed_search_nodeP_alt(SubLObject node) {
        SubLTrampolineFile.checkType(node, SEARCH_NODE_P);
        return eq(snode_options(node), $DOOMED);
    }

    public static SubLObject doomed_search_nodeP(final SubLObject node) {
        assert NIL != search_node_p(node) : "! search.search_node_p(node) " + ("search.search_node_p(node) " + "CommonSymbols.NIL != search.search_node_p(node) ") + node;
        return eq(snode_options(node), $DOOMED);
    }

    public static final SubLObject mark_node_as_doomed_alt(SubLObject node) {
        if (NIL != node) {
            if (NIL == doomed_search_nodeP(node)) {
                _csetf_snode_options(node, $DOOMED);
                {
                    SubLObject cdolist_list_var = snode_children(node);
                    SubLObject child_node = NIL;
                    for (child_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child_node = cdolist_list_var.first()) {
                        mark_node_as_doomed(child_node);
                    }
                }
            }
        }
        return node;
    }

    public static SubLObject mark_node_as_doomed(final SubLObject node) {
        if ((NIL != node) && (NIL == doomed_search_nodeP(node))) {
            _csetf_snode_options(node, $DOOMED);
            SubLObject cdolist_list_var = snode_children(node);
            SubLObject child_node = NIL;
            child_node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                mark_node_as_doomed(child_node);
                cdolist_list_var = cdolist_list_var.rest();
                child_node = cdolist_list_var.first();
            } 
        }
        return node;
    }

    public static final SubLObject search_current_path_alt(SubLObject v_search) {
        return nreverse(search_current_path_internal(search_current_node(v_search)));
    }

    public static SubLObject search_current_path(final SubLObject v_search) {
        return nreverse(search_current_path_internal(search_current_node(v_search)));
    }

    public static final SubLObject search_current_path_internal_alt(SubLObject snode) {
        if (NIL != search_node_p(snode)) {
            return cons(snode, search_current_path_internal(snode_parent(snode)));
        } else {
            return NIL;
        }
    }

    public static SubLObject search_current_path_internal(final SubLObject snode) {
        if (NIL != search_node_p(snode)) {
            return cons(snode, search_current_path_internal(snode_parent(snode)));
        }
        return NIL;
    }

    public static final SubLObject remaining_time_cutoff_alt(SubLObject start_time, SubLObject initial_time_cutoff) {
        if (NIL == initial_time_cutoff) {
            return NIL;
        } else {
            return max(ZERO_INTEGER, subtract(initial_time_cutoff, subtract(get_universal_time(), start_time)));
        }
    }

    public static SubLObject remaining_time_cutoff(final SubLObject start_time, final SubLObject initial_time_cutoff) {
        if (NIL == initial_time_cutoff) {
            return NIL;
        }
        return max(ZERO_INTEGER, subtract(initial_time_cutoff, subtract(get_universal_time(), start_time)));
    }

    /**
     * Return the total number of search nodes currently in SEARCH
     */
    @LispMethod(comment = "Return the total number of search nodes currently in SEARCH")
    public static final SubLObject search_size_alt(SubLObject v_search) {
        SubLTrampolineFile.checkType(v_search, SEARCH_STRUC_P);
        {
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = search_tree(v_search);
            SubLObject snode = NIL;
            for (snode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , snode = cdolist_list_var.first()) {
                total = add(total, search_node_size(snode));
            }
            return total;
        }
    }

    /**
     * Return the total number of search nodes currently in SEARCH
     */
    @LispMethod(comment = "Return the total number of search nodes currently in SEARCH")
    public static SubLObject search_size(final SubLObject v_search) {
        assert NIL != search_struc_p(v_search) : "! search.search_struc_p(v_search) " + ("search.search_struc_p(v_search) " + "CommonSymbols.NIL != search.search_struc_p(v_search) ") + v_search;
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = search_tree(v_search);
        SubLObject snode = NIL;
        snode = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            total = add(total, search_node_size(snode));
            cdolist_list_var = cdolist_list_var.rest();
            snode = cdolist_list_var.first();
        } 
        return total;
    }

    /**
     * Return the total number of search node descendants under SNODE (including SNODE)
     */
    @LispMethod(comment = "Return the total number of search node descendants under SNODE (including SNODE)")
    public static final SubLObject search_node_size_alt(SubLObject snode) {
        if (NIL != search_node_p(snode)) {
            {
                SubLObject total = ONE_INTEGER;
                SubLObject cdolist_list_var = snode_children(snode);
                SubLObject child = NIL;
                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                    total = add(total, search_node_size(child));
                }
                return total;
            }
        } else {
            return ZERO_INTEGER;
        }
    }

    /**
     * Return the total number of search node descendants under SNODE (including SNODE)
     */
    @LispMethod(comment = "Return the total number of search node descendants under SNODE (including SNODE)")
    public static SubLObject search_node_size(final SubLObject snode) {
        if (NIL != search_node_p(snode)) {
            SubLObject total = ONE_INTEGER;
            SubLObject cdolist_list_var = snode_children(snode);
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                total = add(total, search_node_size(child));
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
            return total;
        }
        return ZERO_INTEGER;
    }

    public static SubLObject declare_search_file() {
        declareFunction("search_struc_print_function_trampoline", "SEARCH-STRUC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("search_struc_p", "SEARCH-STRUC-P", 1, 0, false);
        new search.$search_struc_p$UnaryFunction();
        declareFunction("search_tree", "SEARCH-TREE", 1, 0, false);
        declareFunction("search_leaves", "SEARCH-LEAVES", 1, 0, false);
        declareFunction("search_goals", "SEARCH-GOALS", 1, 0, false);
        declareFunction("search_no_leaves_p_func", "SEARCH-NO-LEAVES-P-FUNC", 1, 0, false);
        declareFunction("search_next_node_func", "SEARCH-NEXT-NODE-FUNC", 1, 0, false);
        declareFunction("search_goal_p_func", "SEARCH-GOAL-P-FUNC", 1, 0, false);
        declareFunction("search_add_goal_func", "SEARCH-ADD-GOAL-FUNC", 1, 0, false);
        declareFunction("search_options_func", "SEARCH-OPTIONS-FUNC", 1, 0, false);
        declareFunction("search_expand_func", "SEARCH-EXPAND-FUNC", 1, 0, false);
        declareFunction("search_add_node_func", "SEARCH-ADD-NODE-FUNC", 1, 0, false);
        declareFunction("search_too_deep_func", "SEARCH-TOO-DEEP-FUNC", 1, 0, false);
        declareFunction("search_state", "SEARCH-STATE", 1, 0, false);
        declareFunction("search_print_func", "SEARCH-PRINT-FUNC", 1, 0, false);
        declareFunction("search_limbo", "SEARCH-LIMBO", 1, 0, false);
        declareFunction("search_current_node", "SEARCH-CURRENT-NODE", 1, 0, false);
        declareFunction("_csetf_search_tree", "_CSETF-SEARCH-TREE", 2, 0, false);
        declareFunction("_csetf_search_leaves", "_CSETF-SEARCH-LEAVES", 2, 0, false);
        declareFunction("_csetf_search_goals", "_CSETF-SEARCH-GOALS", 2, 0, false);
        declareFunction("_csetf_search_no_leaves_p_func", "_CSETF-SEARCH-NO-LEAVES-P-FUNC", 2, 0, false);
        declareFunction("_csetf_search_next_node_func", "_CSETF-SEARCH-NEXT-NODE-FUNC", 2, 0, false);
        declareFunction("_csetf_search_goal_p_func", "_CSETF-SEARCH-GOAL-P-FUNC", 2, 0, false);
        declareFunction("_csetf_search_add_goal_func", "_CSETF-SEARCH-ADD-GOAL-FUNC", 2, 0, false);
        declareFunction("_csetf_search_options_func", "_CSETF-SEARCH-OPTIONS-FUNC", 2, 0, false);
        declareFunction("_csetf_search_expand_func", "_CSETF-SEARCH-EXPAND-FUNC", 2, 0, false);
        declareFunction("_csetf_search_add_node_func", "_CSETF-SEARCH-ADD-NODE-FUNC", 2, 0, false);
        declareFunction("_csetf_search_too_deep_func", "_CSETF-SEARCH-TOO-DEEP-FUNC", 2, 0, false);
        declareFunction("_csetf_search_state", "_CSETF-SEARCH-STATE", 2, 0, false);
        declareFunction("_csetf_search_print_func", "_CSETF-SEARCH-PRINT-FUNC", 2, 0, false);
        declareFunction("_csetf_search_limbo", "_CSETF-SEARCH-LIMBO", 2, 0, false);
        declareFunction("_csetf_search_current_node", "_CSETF-SEARCH-CURRENT-NODE", 2, 0, false);
        declareFunction("make_search_struc", "MAKE-SEARCH-STRUC", 0, 1, false);
        declareFunction("visit_defstruct_search_struc", "VISIT-DEFSTRUCT-SEARCH-STRUC", 2, 0, false);
        declareFunction("visit_defstruct_object_search_struc_method", "VISIT-DEFSTRUCT-OBJECT-SEARCH-STRUC-METHOD", 2, 0, false);
        declareFunction("print_search", "PRINT-SEARCH", 3, 0, false);
        declareFunction("make_static_search_struc", "MAKE-STATIC-SEARCH-STRUC", 0, 0, false);
        declareFunction("init_search_struc", "INIT-SEARCH-STRUC", 1, 0, false);
        declareFunction("free_search_struc_p", "FREE-SEARCH-STRUC-P", 1, 0, false);
        declareFunction("free_search_struc", "FREE-SEARCH-STRUC", 1, 0, false);
        declareFunction("get_search_struc", "GET-SEARCH-STRUC", 0, 0, false);
        declareFunction("new_search", "NEW-SEARCH", 8, 2, false);
        declareFunction("search_node_print_function_trampoline", "SEARCH-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("search_node_p", "SEARCH-NODE-P", 1, 0, false);
        new search.$search_node_p$UnaryFunction();
        declareFunction("snode_search", "SNODE-SEARCH", 1, 0, false);
        declareFunction("snode_parent", "SNODE-PARENT", 1, 0, false);
        declareFunction("snode_children", "SNODE-CHILDREN", 1, 0, false);
        declareFunction("snode_depth", "SNODE-DEPTH", 1, 0, false);
        declareFunction("snode_options", "SNODE-OPTIONS", 1, 0, false);
        declareFunction("snode_state", "SNODE-STATE", 1, 0, false);
        declareFunction("_csetf_snode_search", "_CSETF-SNODE-SEARCH", 2, 0, false);
        declareFunction("_csetf_snode_parent", "_CSETF-SNODE-PARENT", 2, 0, false);
        declareFunction("_csetf_snode_children", "_CSETF-SNODE-CHILDREN", 2, 0, false);
        declareFunction("_csetf_snode_depth", "_CSETF-SNODE-DEPTH", 2, 0, false);
        declareFunction("_csetf_snode_options", "_CSETF-SNODE-OPTIONS", 2, 0, false);
        declareFunction("_csetf_snode_state", "_CSETF-SNODE-STATE", 2, 0, false);
        declareFunction("make_search_node", "MAKE-SEARCH-NODE", 0, 1, false);
        declareFunction("visit_defstruct_search_node", "VISIT-DEFSTRUCT-SEARCH-NODE", 2, 0, false);
        declareFunction("visit_defstruct_object_search_node_method", "VISIT-DEFSTRUCT-OBJECT-SEARCH-NODE-METHOD", 2, 0, false);
        declareFunction("print_snode", "PRINT-SNODE", 3, 0, false);
        declareFunction("make_static_search_node", "MAKE-STATIC-SEARCH-NODE", 0, 0, false);
        declareFunction("init_search_node", "INIT-SEARCH-NODE", 1, 0, false);
        declareFunction("free_search_node_p", "FREE-SEARCH-NODE-P", 1, 0, false);
        declareFunction("free_search_node", "FREE-SEARCH-NODE", 1, 0, false);
        declareFunction("get_search_node", "GET-SEARCH-NODE", 0, 0, false);
        declareFunction("free_entire_search_node", "FREE-ENTIRE-SEARCH-NODE", 1, 1, false);
        declareFunction("dead_end_nodeP", "DEAD-END-NODE?", 1, 0, false);
        declareFunction("reclaim_search_node", "RECLAIM-SEARCH-NODE", 1, 0, false);
        declareFunction("interrupt_generic_search", "INTERRUPT-GENERIC-SEARCH", 0, 0, false);
        declareFunction("abort_generic_search", "ABORT-GENERIC-SEARCH", 0, 0, false);
        declareMacro("do_generic_search", "DO-GENERIC-SEARCH");
        declareFunction("generic_search", "GENERIC-SEARCH", 1, 3, false);
        declareFunction("generic_search_reclaim_node", "GENERIC-SEARCH-RECLAIM-NODE", 1, 0, false);
        declareFunction("generic_search_link_child_to_parent", "GENERIC-SEARCH-LINK-CHILD-TO-PARENT", 2, 0, false);
        declareFunction("reset_search_node_state", "RESET-SEARCH-NODE-STATE", 2, 0, false);
        declareFunction("new_search_node", "NEW-SEARCH-NODE", 1, 0, false);
        declareFunction("new_search_start_node", "NEW-SEARCH-START-NODE", 1, 0, false);
        declareFunction("register_search_start_node", "REGISTER-SEARCH-START-NODE", 2, 0, false);
        declareFunction("add_search_start_node", "ADD-SEARCH-START-NODE", 2, 0, false);
        declareFunction("remove_search_start_node", "REMOVE-SEARCH-START-NODE", 2, 0, false);
        declareFunction("reconsider_limbo", "RECONSIDER-LIMBO", 2, 0, false);
        declareFunction("valid_snode_options", "VALID-SNODE-OPTIONS", 1, 0, false);
        declareFunction("set_valid_snode_options", "SET-VALID-SNODE-OPTIONS", 2, 0, false);
        declareFunction("doomed_search_nodeP", "DOOMED-SEARCH-NODE?", 1, 0, false);
        declareFunction("mark_node_as_doomed", "MARK-NODE-AS-DOOMED", 1, 0, false);
        declareFunction("search_current_path", "SEARCH-CURRENT-PATH", 1, 0, false);
        declareFunction("search_current_path_internal", "SEARCH-CURRENT-PATH-INTERNAL", 1, 0, false);
        declareFunction("remaining_time_cutoff", "REMAINING-TIME-CUTOFF", 2, 0, false);
        declareFunction("search_size", "SEARCH-SIZE", 1, 0, false);
        declareFunction("search_node_size", "SEARCH-NODE-SIZE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_search_file_alt() {
        defconstant("*DTP-SEARCH-STRUC*", SEARCH_STRUC);
        deflexical("*SEARCH-STRUC-FREE-LIST*", NIL);
        deflexical("*SEARCH-STRUC-FREE-LOCK*", make_lock($str_alt54$SEARCH_STRUC_resource_lock));
        defconstant("*DTP-SEARCH-NODE*", SEARCH_NODE);
        deflexical("*SEARCH-NODE-FREE-LIST*", NIL);
        deflexical("*SEARCH-NODE-FREE-LOCK*", make_lock($str_alt85$SEARCH_NODE_resource_lock));
        defparameter("*RECLAIM-DEAD-END-SEARCH-NODES*", T);
        defparameter("*DEAD-END-NODE-FUNCTION*", $sym87$DEAD_END_NODE_);
        defparameter("*RECLAIM-DEAD-END-NODE-FUNCTION*", RECLAIM_SEARCH_NODE);
        defparameter("*WITHIN-GENERIC-SEARCH*", NIL);
        defparameter("*INTERRUPT-GENERIC-SEARCH*", NIL);
        return NIL;
    }

    public static SubLObject init_search_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-SEARCH-STRUC*", SEARCH_STRUC);
            deflexical("*SEARCH-STRUC-FREE-LIST*", NIL);
            deflexical("*SEARCH-STRUC-FREE-LOCK*", make_lock($str60$SEARCH_STRUC_resource_lock));
            defconstant("*DTP-SEARCH-NODE*", SEARCH_NODE);
            deflexical("*SEARCH-NODE-FREE-LIST*", NIL);
            deflexical("*SEARCH-NODE-FREE-LOCK*", make_lock($str91$SEARCH_NODE_resource_lock));
            defparameter("*RECLAIM-DEAD-END-SEARCH-NODES*", T);
            defparameter("*DEAD-END-NODE-FUNCTION*", $sym93$DEAD_END_NODE_);
            defparameter("*RECLAIM-DEAD-END-NODE-FUNCTION*", RECLAIM_SEARCH_NODE);
            defparameter("*WITHIN-GENERIC-SEARCH*", NIL);
            defparameter("*INTERRUPT-GENERIC-SEARCH*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SEARCH-STRUC-FREE-LOCK*", make_lock($str_alt54$SEARCH_STRUC_resource_lock));
            deflexical("*SEARCH-NODE-FREE-LOCK*", make_lock($str_alt85$SEARCH_NODE_resource_lock));
            defparameter("*DEAD-END-NODE-FUNCTION*", $sym87$DEAD_END_NODE_);
        }
        return NIL;
    }

    public static SubLObject init_search_file_Previous() {
        defconstant("*DTP-SEARCH-STRUC*", SEARCH_STRUC);
        deflexical("*SEARCH-STRUC-FREE-LIST*", NIL);
        deflexical("*SEARCH-STRUC-FREE-LOCK*", make_lock($str60$SEARCH_STRUC_resource_lock));
        defconstant("*DTP-SEARCH-NODE*", SEARCH_NODE);
        deflexical("*SEARCH-NODE-FREE-LIST*", NIL);
        deflexical("*SEARCH-NODE-FREE-LOCK*", make_lock($str91$SEARCH_NODE_resource_lock));
        defparameter("*RECLAIM-DEAD-END-SEARCH-NODES*", T);
        defparameter("*DEAD-END-NODE-FUNCTION*", $sym93$DEAD_END_NODE_);
        defparameter("*RECLAIM-DEAD-END-NODE-FUNCTION*", RECLAIM_SEARCH_NODE);
        defparameter("*WITHIN-GENERIC-SEARCH*", NIL);
        defparameter("*INTERRUPT-GENERIC-SEARCH*", NIL);
        return NIL;
    }

    public static SubLObject setup_search_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_search_struc$.getGlobalValue(), symbol_function(SEARCH_STRUC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(SEARCH_TREE, _CSETF_SEARCH_TREE);
        def_csetf(SEARCH_LEAVES, _CSETF_SEARCH_LEAVES);
        def_csetf(SEARCH_GOALS, _CSETF_SEARCH_GOALS);
        def_csetf(SEARCH_NO_LEAVES_P_FUNC, _CSETF_SEARCH_NO_LEAVES_P_FUNC);
        def_csetf(SEARCH_NEXT_NODE_FUNC, _CSETF_SEARCH_NEXT_NODE_FUNC);
        def_csetf(SEARCH_GOAL_P_FUNC, _CSETF_SEARCH_GOAL_P_FUNC);
        def_csetf(SEARCH_ADD_GOAL_FUNC, _CSETF_SEARCH_ADD_GOAL_FUNC);
        def_csetf(SEARCH_OPTIONS_FUNC, _CSETF_SEARCH_OPTIONS_FUNC);
        def_csetf(SEARCH_EXPAND_FUNC, _CSETF_SEARCH_EXPAND_FUNC);
        def_csetf(SEARCH_ADD_NODE_FUNC, _CSETF_SEARCH_ADD_NODE_FUNC);
        def_csetf(SEARCH_TOO_DEEP_FUNC, _CSETF_SEARCH_TOO_DEEP_FUNC);
        def_csetf(SEARCH_STATE, _CSETF_SEARCH_STATE);
        def_csetf(SEARCH_PRINT_FUNC, _CSETF_SEARCH_PRINT_FUNC);
        def_csetf(SEARCH_LIMBO, _CSETF_SEARCH_LIMBO);
        def_csetf(SEARCH_CURRENT_NODE, _CSETF_SEARCH_CURRENT_NODE);
        identity(SEARCH_STRUC);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_search_struc$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SEARCH_STRUC_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_search_node$.getGlobalValue(), symbol_function(SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list71);
        def_csetf(SNODE_SEARCH, _CSETF_SNODE_SEARCH);
        def_csetf(SNODE_PARENT, _CSETF_SNODE_PARENT);
        def_csetf(SNODE_CHILDREN, _CSETF_SNODE_CHILDREN);
        def_csetf(SNODE_DEPTH, _CSETF_SNODE_DEPTH);
        def_csetf(SNODE_OPTIONS, _CSETF_SNODE_OPTIONS);
        def_csetf(SNODE_STATE, _CSETF_SNODE_STATE);
        identity(SEARCH_NODE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_search_node$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SEARCH_NODE_METHOD));
        note_funcall_helper_function(PRINT_SNODE);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("TREE"), makeSymbol("LEAVES"), makeSymbol("GOALS"), makeSymbol("NO-LEAVES-P-FUNC"), makeSymbol("NEXT-NODE-FUNC"), makeSymbol("GOAL-P-FUNC"), makeSymbol("ADD-GOAL-FUNC"), makeSymbol("OPTIONS-FUNC"), makeSymbol("EXPAND-FUNC"), makeSymbol("ADD-NODE-FUNC"), makeSymbol("TOO-DEEP-FUNC"), makeSymbol("STATE"), makeSymbol("PRINT-FUNC"), makeSymbol("LIMBO"), makeSymbol("CURRENT-NODE") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ $TREE, makeKeyword("LEAVES"), makeKeyword("GOALS"), makeKeyword("NO-LEAVES-P-FUNC"), makeKeyword("NEXT-NODE-FUNC"), makeKeyword("GOAL-P-FUNC"), makeKeyword("ADD-GOAL-FUNC"), makeKeyword("OPTIONS-FUNC"), makeKeyword("EXPAND-FUNC"), makeKeyword("ADD-NODE-FUNC"), makeKeyword("TOO-DEEP-FUNC"), makeKeyword("STATE"), makeKeyword("PRINT-FUNC"), makeKeyword("LIMBO"), makeKeyword("CURRENT-NODE") });

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

    

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("SEARCH-TREE"), makeSymbol("SEARCH-LEAVES"), makeSymbol("SEARCH-GOALS"), makeSymbol("SEARCH-NO-LEAVES-P-FUNC"), makeSymbol("SEARCH-NEXT-NODE-FUNC"), makeSymbol("SEARCH-GOAL-P-FUNC"), makeSymbol("SEARCH-ADD-GOAL-FUNC"), makeSymbol("SEARCH-OPTIONS-FUNC"), makeSymbol("SEARCH-EXPAND-FUNC"), makeSymbol("SEARCH-ADD-NODE-FUNC"), makeSymbol("SEARCH-TOO-DEEP-FUNC"), makeSymbol("SEARCH-STATE"), makeSymbol("SEARCH-PRINT-FUNC"), makeSymbol("SEARCH-LIMBO"), makeSymbol("SEARCH-CURRENT-NODE") });

    public static final class $search_struc_native extends SubLStructNative {
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
            search.$search_struc_native.this.$tree = Lisp.NIL;
            search.$search_struc_native.this.$leaves = Lisp.NIL;
            search.$search_struc_native.this.$goals = Lisp.NIL;
            search.$search_struc_native.this.$no_leaves_p_func = Lisp.NIL;
            search.$search_struc_native.this.$next_node_func = Lisp.NIL;
            search.$search_struc_native.this.$goal_p_func = Lisp.NIL;
            search.$search_struc_native.this.$add_goal_func = Lisp.NIL;
            search.$search_struc_native.this.$options_func = Lisp.NIL;
            search.$search_struc_native.this.$expand_func = Lisp.NIL;
            search.$search_struc_native.this.$add_node_func = Lisp.NIL;
            search.$search_struc_native.this.$too_deep_func = Lisp.NIL;
            search.$search_struc_native.this.$state = Lisp.NIL;
            search.$search_struc_native.this.$print_func = Lisp.NIL;
            search.$search_struc_native.this.$limbo = Lisp.NIL;
            search.$search_struc_native.this.$current_node = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return search.$search_struc_native.this.$tree;
        }

        @Override
        public SubLObject getField3() {
            return search.$search_struc_native.this.$leaves;
        }

        @Override
        public SubLObject getField4() {
            return search.$search_struc_native.this.$goals;
        }

        @Override
        public SubLObject getField5() {
            return search.$search_struc_native.this.$no_leaves_p_func;
        }

        @Override
        public SubLObject getField6() {
            return search.$search_struc_native.this.$next_node_func;
        }

        @Override
        public SubLObject getField7() {
            return search.$search_struc_native.this.$goal_p_func;
        }

        @Override
        public SubLObject getField8() {
            return search.$search_struc_native.this.$add_goal_func;
        }

        @Override
        public SubLObject getField9() {
            return search.$search_struc_native.this.$options_func;
        }

        @Override
        public SubLObject getField10() {
            return search.$search_struc_native.this.$expand_func;
        }

        @Override
        public SubLObject getField11() {
            return search.$search_struc_native.this.$add_node_func;
        }

        @Override
        public SubLObject getField12() {
            return search.$search_struc_native.this.$too_deep_func;
        }

        @Override
        public SubLObject getField13() {
            return search.$search_struc_native.this.$state;
        }

        @Override
        public SubLObject getField14() {
            return search.$search_struc_native.this.$print_func;
        }

        @Override
        public SubLObject getField15() {
            return search.$search_struc_native.this.$limbo;
        }

        @Override
        public SubLObject getField16() {
            return search.$search_struc_native.this.$current_node;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return search.$search_struc_native.this.$tree = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return search.$search_struc_native.this.$leaves = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return search.$search_struc_native.this.$goals = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return search.$search_struc_native.this.$no_leaves_p_func = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return search.$search_struc_native.this.$next_node_func = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return search.$search_struc_native.this.$goal_p_func = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return search.$search_struc_native.this.$add_goal_func = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return search.$search_struc_native.this.$options_func = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return search.$search_struc_native.this.$expand_func = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return search.$search_struc_native.this.$add_node_func = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return search.$search_struc_native.this.$too_deep_func = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return search.$search_struc_native.this.$state = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return search.$search_struc_native.this.$print_func = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return search.$search_struc_native.this.$limbo = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return search.$search_struc_native.this.$current_node = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.search.$search_struc_native.class, SEARCH_STRUC, SEARCH_STRUC_P, $list2, $list3, new String[]{ "$tree", "$leaves", "$goals", "$no_leaves_p_func", "$next_node_func", "$goal_p_func", "$add_goal_func", "$options_func", "$expand_func", "$add_node_func", "$too_deep_func", "$state", "$print_func", "$limbo", "$current_node" }, $list4, $list5, PRINT_SEARCH);
        }
    }

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-SEARCH-TREE"), makeSymbol("_CSETF-SEARCH-LEAVES"), makeSymbol("_CSETF-SEARCH-GOALS"), makeSymbol("_CSETF-SEARCH-NO-LEAVES-P-FUNC"), makeSymbol("_CSETF-SEARCH-NEXT-NODE-FUNC"), makeSymbol("_CSETF-SEARCH-GOAL-P-FUNC"), makeSymbol("_CSETF-SEARCH-ADD-GOAL-FUNC"), makeSymbol("_CSETF-SEARCH-OPTIONS-FUNC"), makeSymbol("_CSETF-SEARCH-EXPAND-FUNC"), makeSymbol("_CSETF-SEARCH-ADD-NODE-FUNC"), makeSymbol("_CSETF-SEARCH-TOO-DEEP-FUNC"), makeSymbol("_CSETF-SEARCH-STATE"), makeSymbol("_CSETF-SEARCH-PRINT-FUNC"), makeSymbol("_CSETF-SEARCH-LIMBO"), makeSymbol("_CSETF-SEARCH-CURRENT-NODE") });

    static private final SubLString $str_alt53$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt54$SEARCH_STRUC_resource_lock = makeString("SEARCH-STRUC resource lock");

    static private final SubLList $list_alt59 = list(makeSymbol("SEARCH"), makeSymbol("PARENT"), makeSymbol("CHILDREN"), makeSymbol("DEPTH"), makeSymbol("OPTIONS"), makeSymbol("STATE"));

    static private final SubLList $list_alt60 = list(makeKeyword("SEARCH"), makeKeyword("PARENT"), makeKeyword("CHILDREN"), makeKeyword("DEPTH"), makeKeyword("OPTIONS"), makeKeyword("STATE"));

    static private final SubLList $list_alt61 = list(makeSymbol("SNODE-SEARCH"), makeSymbol("SNODE-PARENT"), makeSymbol("SNODE-CHILDREN"), makeSymbol("SNODE-DEPTH"), makeSymbol("SNODE-OPTIONS"), makeSymbol("SNODE-STATE"));

    public static final class $search_struc_p$UnaryFunction extends UnaryFunction {
        public $search_struc_p$UnaryFunction() {
            super(extractFunctionNamed("SEARCH-STRUC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return search_struc_p(arg1);
        }
    }

    static private final SubLList $list_alt62 = list(makeSymbol("_CSETF-SNODE-SEARCH"), makeSymbol("_CSETF-SNODE-PARENT"), makeSymbol("_CSETF-SNODE-CHILDREN"), makeSymbol("_CSETF-SNODE-DEPTH"), makeSymbol("_CSETF-SNODE-OPTIONS"), makeSymbol("_CSETF-SNODE-STATE"));

    public static final class $search_node_native extends SubLStructNative {
        public SubLObject $search;

        public SubLObject $parent;

        public SubLObject $children;

        public SubLObject $depth;

        public SubLObject $options;

        public SubLObject $state;

        private static final SubLStructDeclNative structDecl;

        public $search_node_native() {
            search.$search_node_native.this.$search = Lisp.NIL;
            search.$search_node_native.this.$parent = Lisp.NIL;
            search.$search_node_native.this.$children = Lisp.NIL;
            search.$search_node_native.this.$depth = Lisp.NIL;
            search.$search_node_native.this.$options = Lisp.NIL;
            search.$search_node_native.this.$state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return search.$search_node_native.this.$search;
        }

        @Override
        public SubLObject getField3() {
            return search.$search_node_native.this.$parent;
        }

        @Override
        public SubLObject getField4() {
            return search.$search_node_native.this.$children;
        }

        @Override
        public SubLObject getField5() {
            return search.$search_node_native.this.$depth;
        }

        @Override
        public SubLObject getField6() {
            return search.$search_node_native.this.$options;
        }

        @Override
        public SubLObject getField7() {
            return search.$search_node_native.this.$state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return search.$search_node_native.this.$search = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return search.$search_node_native.this.$parent = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return search.$search_node_native.this.$children = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return search.$search_node_native.this.$depth = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return search.$search_node_native.this.$options = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return search.$search_node_native.this.$state = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.search.$search_node_native.class, SEARCH_NODE, SEARCH_NODE_P, $list65, $list66, new String[]{ "$search", "$parent", "$children", "$depth", "$options", "$state" }, $list67, $list68, PRINT_SNODE);
        }
    }

    static private final SubLString $str_alt82$__ = makeString("#<");

    static private final SubLString $str_alt85$SEARCH_NODE_resource_lock = makeString("SEARCH-NODE resource lock");

    static private final SubLSymbol $sym87$DEAD_END_NODE_ = makeSymbol("DEAD-END-NODE?");

    static private final SubLString $str_alt89$So_don_t = makeString("So don't");

    static private final SubLString $str_alt90$Cannot_reclaim_strange_node__S = makeString("Cannot reclaim strange node ~S");

    static private final SubLList $list_alt93 = list(new SubLObject[]{ list(makeSymbol("REASON"), makeSymbol("SEARCH"), makeSymbol("&KEY"), makeSymbol("NUMBER-CUT"), makeSymbol("TIME-CUT"), makeSymbol("DEPTH-CUT")), makeSymbol("NO-LEAVES-P-FUNC"), makeSymbol("NEXT-NODE-FUNC"), makeSymbol("GOAL-P-FUNC"), makeSymbol("ADD-GOAL-FUNC"), makeSymbol("TOO-DEEP-FUNC"), makeSymbol("OPTIONS-FUNC"), makeSymbol("EXPAND-FUNC"), makeSymbol("ADD-NODE-FUNC") });

    static private final SubLList $list_alt94 = list(makeKeyword("NUMBER-CUT"), makeKeyword("TIME-CUT"), makeKeyword("DEPTH-CUT"));

    public static final class $search_node_p$UnaryFunction extends UnaryFunction {
        public $search_node_p$UnaryFunction() {
            super(extractFunctionNamed("SEARCH-NODE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return search_node_p(arg1);
        }
    }

    static private final SubLSymbol $sym99$NUMBER = makeUninternedSymbol("NUMBER");

    static private final SubLSymbol $sym100$TIME = makeUninternedSymbol("TIME");

    static private final SubLSymbol $sym101$DEPTH_LIMIT_CROSSED = makeUninternedSymbol("DEPTH-LIMIT-CROSSED");

    static private final SubLSymbol $sym102$ABORTED = makeUninternedSymbol("ABORTED");

    static private final SubLSymbol $sym103$NEXT = makeUninternedSymbol("NEXT");

    static private final SubLSymbol $sym104$NEW_LEAVES = makeUninternedSymbol("NEW-LEAVES");

    static private final SubLSymbol $sym105$PREVIOUS_GOALS = makeUninternedSymbol("PREVIOUS-GOALS");

    static private final SubLSymbol $sym106$NEW_GOALS = makeUninternedSymbol("NEW-GOALS");

    static private final SubLSymbol $sym107$INCREMENT_COUNT = makeUninternedSymbol("INCREMENT-COUNT");

    static private final SubLSymbol $sym108$OPTIONS = makeUninternedSymbol("OPTIONS");

    static private final SubLSymbol $sym109$OPTION = makeUninternedSymbol("OPTION");

    static private final SubLSymbol $sym110$SELF_RE_ADDED_ = makeUninternedSymbol("SELF-RE-ADDED?");

    static private final SubLSymbol $sym111$NEW_NODES = makeUninternedSymbol("NEW-NODES");

    static private final SubLSymbol $sym112$NEW_NODE = makeUninternedSymbol("NEW-NODE");

    static private final SubLSymbol $sym113$PREVIOUS_LEAVES = makeUninternedSymbol("PREVIOUS-LEAVES");

    static private final SubLList $list_alt115 = list(ZERO_INTEGER);

    static private final SubLList $list_alt118 = list(NIL);

    static private final SubLList $list_alt119 = list(makeSymbol("*INTERRUPT-GENERIC-SEARCH*"), NIL);

    static private final SubLList $list_alt121 = list(list(makeSymbol("*WITHIN-GENERIC-SEARCH*"), T));

    static private final SubLSymbol $sym127$__ = makeSymbol(">=");

    static private final SubLSymbol $sym128$TIME_HAS_ARRIVED_ = makeSymbol("TIME-HAS-ARRIVED?");

    static private final SubLSymbol $sym132$DOOMED_SEARCH_NODE_ = makeSymbol("DOOMED-SEARCH-NODE?");

    static private final SubLList $list_alt138 = list(T);

    static private final SubLList $list_alt145 = list(makeKeyword("ABORT"));

    static private final SubLList $list_alt146 = list(makeKeyword("INTERRUPT"));

    static private final SubLList $list_alt147 = list(makeKeyword("NUMBER"));

    static private final SubLList $list_alt148 = list($TIME);

    static private final SubLList $list_alt149 = list(makeKeyword("DEPTH"));

    static private final SubLList $list_alt150 = list(makeKeyword("EXHAUST"));
}

/**
 * Total time: 541 ms
 */
