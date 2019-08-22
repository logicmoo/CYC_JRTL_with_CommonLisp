package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sixth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sg_search extends SubLTranslatedFile {
    public static final SubLFile me = new sg_search();

    public static final String myName = "com.cyc.cycjava.cycl.sg_search";

    public static final String myFingerPrint = "20abba4feb618e29f35949b5031159cf04c8bc05b8180dee40f811b91106e613";

    // deflexical
    // Definitions
    private static final SubLSymbol $sg_container_accessor_table$ = makeSymbol("*SG-CONTAINER-ACCESSOR-TABLE*");

    // deflexical
    private static final SubLSymbol $sg_search_valid_types$ = makeSymbol("*SG-SEARCH-VALID-TYPES*");

    // deflexical
    private static final SubLSymbol $sg_search_type_container_map$ = makeSymbol("*SG-SEARCH-TYPE-CONTAINER-MAP*");

    // defparameter
    /**
     * The current node being worked on. Currenly only needed to support
     * sg-note-new-forward-inference-for-browsing.
     */
    public static final SubLSymbol $sg_current_node$ = makeSymbol("*SG-CURRENT-NODE*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeKeyword("QUEUE"), makeSymbol("QUEUE-P"), makeSymbol("QUEUE-EMPTY-P"), makeSymbol("ENQUEUE"), makeSymbol("DEQUEUE"), makeSymbol("CREATE-QUEUE")), list(makeKeyword("PRIORITY-QUEUE"), makeSymbol("PRIORITY-QUEUE-P"), makeSymbol("P-QUEUE-EMPTY-P"), makeSymbol("P-ENQUEUE"), makeSymbol("P-DEQUEUE"), makeSymbol("CREATE-P-QUEUE")), list(makeKeyword("STACK"), makeSymbol("STACK-P"), makeSymbol("STACK-EMPTY-P"), makeSymbol("STACK-PUSH"), makeSymbol("STACK-POP"), makeSymbol("CREATE-STACK")));

    public static final SubLList $list1 = cons(makeSymbol("TYPE"), makeSymbol("FUNC-LIST"));

    public static final SubLList $list2 = list(makeKeyword("DEPTH-FIRST"), makeKeyword("BEST-FIRST"), makeKeyword("BREADTH-FIRST"));

    public static final SubLList $list3 = list(list(makeKeyword("DEPTH-FIRST"), makeKeyword("STACK")), list(makeKeyword("BREADTH-FIRST"), makeKeyword("QUEUE")), list(makeKeyword("BEST-FIRST"), makeKeyword("PRIORITY-QUEUE")));







    public static final SubLSymbol $sym7$_ = makeSymbol(">");

    private static final SubLSymbol $SG_SEARCH_TYPE = makeKeyword("SG-SEARCH-TYPE");

    public static final SubLString $str9$__SG_SEARCH__TYPE__a_ = makeString("#<SG-SEARCH :TYPE ~a>");



    private static final SubLSymbol $DEPTH_EXCEDED_FUNCTION = makeKeyword("DEPTH-EXCEDED-FUNCTION");





    private static final SubLSymbol $ADD_GOAL_FUNCTION = makeKeyword("ADD-GOAL-FUNCTION");



    public static final SubLSymbol SG_CONTAINER_EMPTY_P = makeSymbol("SG-CONTAINER-EMPTY-P");

    public static final SubLSymbol SG_CONTAINER_NEXT_NODE = makeSymbol("SG-CONTAINER-NEXT-NODE");

    public static final SubLSymbol SG_CONTAINER_ADD = makeSymbol("SG-CONTAINER-ADD");

    public static final SubLSymbol SG_PRINT_SEARCH = makeSymbol("SG-PRINT-SEARCH");

    public static SubLObject sg_container_type(final SubLObject container) {
        final SubLObject doneP = NIL;
        SubLObject result = NIL;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject type;
        SubLObject func_list;
        for (rest = NIL, rest = $sg_container_accessor_table$.getGlobalValue(); (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            type = NIL;
            func_list = NIL;
            destructuring_bind_must_consp(current, datum, $list1);
            type = current.first();
            current = func_list = current.rest();
            if (NIL != funcall(func_list.first(), container)) {
                result = type;
            }
        }
        return result;
    }

    public static SubLObject sg_create_container(final SubLObject type) {
        final SubLObject func = sixth(assoc(type, $sg_container_accessor_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        return funcall(func);
    }

    public static SubLObject sg_container_empty_p(final SubLObject container) {
        final SubLObject type = sg_container_type(container);
        final SubLObject pred = third(assoc(type, $sg_container_accessor_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        return funcall(pred, container);
    }

    public static SubLObject sg_container_add(final SubLObject item, final SubLObject container) {
        final SubLObject type = sg_container_type(container);
        final SubLObject pred = fourth(assoc(type, $sg_container_accessor_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        return funcall(pred, item, container);
    }

    public static SubLObject sg_container_next(final SubLObject container) {
        final SubLObject type = sg_container_type(container);
        final SubLObject pred = fifth(assoc(type, $sg_container_accessor_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        return funcall(pred, container);
    }

    public static SubLObject sg_valid_search_type_p(final SubLObject type) {
        return member(type, $sg_search_valid_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sg_search_type_container(final SubLObject type) {
        return second(assoc(type, $sg_search_type_container_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject sg_container_next_node(final SubLObject container) {
        final SubLObject next_node = sg_container_next(container);
        return values(next_node, container);
    }

    public static SubLObject sg_search_create_container(final SubLObject v_search, final SubLObject search_properties) {
        final SubLObject type = getf(search_properties, $SEARCH_TYPE, UNPROVIDED);
        final SubLObject container_type = sg_search_type_container(type);
        SubLObject container = NIL;
        final SubLObject pcase_var = container_type;
        if (pcase_var.eql($PRIORITY_QUEUE)) {
            final SubLObject ranking_func = getf(search_properties, $RANKING_FUNCTION, UNPROVIDED);
            container = queues.create_p_queue(NIL, ranking_func, symbol_function($sym7$_));
        } else {
            container = sg_create_container(container_type);
        }
        search._csetf_search_leaves(v_search, container);
        return v_search;
    }

    public static SubLObject sg_search_type(final SubLObject v_search) {
        return getf(search.search_state(v_search), $SG_SEARCH_TYPE, NIL);
    }

    public static SubLObject sg_print_search(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str9$__SG_SEARCH__TYPE__a_, sg_search_type(v_object));
        return v_object;
    }

    public static SubLObject new_sg_search(SubLObject state, final SubLObject search_properties) {
        final SubLObject type = getf(search_properties, $SEARCH_TYPE, UNPROVIDED);
        final SubLObject expand = getf(search_properties, $EXPAND_FUNCTION, UNPROVIDED);
        final SubLObject too_deep_p = getf(search_properties, $DEPTH_EXCEDED_FUNCTION, UNPROVIDED);
        final SubLObject options = getf(search_properties, $OPTIONS_FUNCTION, UNPROVIDED);
        final SubLObject goal_p = getf(search_properties, $GOAL_FUNCTION, UNPROVIDED);
        final SubLObject add_goal = getf(search_properties, $ADD_GOAL_FUNCTION, UNPROVIDED);
        final SubLObject active_modules = getf(search_properties, $ACTIVE_MODULES, UNPROVIDED);
        SubLObject v_search = NIL;
        state = putf(state, $SG_SEARCH_TYPE, type);
        state = putf(state, $ACTIVE_MODULES, active_modules);
        v_search = search.new_search(SG_CONTAINER_EMPTY_P, SG_CONTAINER_NEXT_NODE, goal_p, add_goal, options, expand, SG_CONTAINER_ADD, too_deep_p, state, SG_PRINT_SEARCH);
        v_search = sg_search_create_container(v_search, search_properties);
        return v_search;
    }

    public static SubLObject declare_sg_search_file() {
        declareFunction(me, "sg_container_type", "SG-CONTAINER-TYPE", 1, 0, false);
        declareFunction(me, "sg_create_container", "SG-CREATE-CONTAINER", 1, 0, false);
        declareFunction(me, "sg_container_empty_p", "SG-CONTAINER-EMPTY-P", 1, 0, false);
        declareFunction(me, "sg_container_add", "SG-CONTAINER-ADD", 2, 0, false);
        declareFunction(me, "sg_container_next", "SG-CONTAINER-NEXT", 1, 0, false);
        declareFunction(me, "sg_valid_search_type_p", "SG-VALID-SEARCH-TYPE-P", 1, 0, false);
        declareFunction(me, "sg_search_type_container", "SG-SEARCH-TYPE-CONTAINER", 1, 0, false);
        declareFunction(me, "sg_container_next_node", "SG-CONTAINER-NEXT-NODE", 1, 0, false);
        declareFunction(me, "sg_search_create_container", "SG-SEARCH-CREATE-CONTAINER", 2, 0, false);
        declareFunction(me, "sg_search_type", "SG-SEARCH-TYPE", 1, 0, false);
        declareFunction(me, "sg_print_search", "SG-PRINT-SEARCH", 3, 0, false);
        declareFunction(me, "new_sg_search", "NEW-SG-SEARCH", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sg_search_file() {
        deflexical("*SG-CONTAINER-ACCESSOR-TABLE*", $list0);
        deflexical("*SG-SEARCH-VALID-TYPES*", $list2);
        deflexical("*SG-SEARCH-TYPE-CONTAINER-MAP*", $list3);
        defparameter("*SG-CURRENT-NODE*", NIL);
        return NIL;
    }

    public static SubLObject setup_sg_search_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sg_search_file();
    }

    @Override
    public void initializeVariables() {
        init_sg_search_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sg_search_file();
    }

    
}

/**
 * Total time: 31 ms
 */
