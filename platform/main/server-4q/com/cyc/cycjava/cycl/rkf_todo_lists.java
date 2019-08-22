package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_todo_lists extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_todo_lists();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_todo_lists";

    public static final String myFingerPrint = "3f718b86155894f83b0ece298c593137e7e49667d36329b9a3678b14dfa1a78e";

    // Internal Constants
    public static final SubLSymbol $sym0$_ITEM = makeSymbol("?ITEM");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");



    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    public static final SubLSymbol $sym4$_LIST = makeSymbol("?LIST");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$myToDoList = reader_make_constant_shell(makeString("myToDoList"));

    public static final SubLList $list7 = list(makeSymbol("?LIST"));

    private static final SubLObject $$toDoListItem = reader_make_constant_shell(makeString("toDoListItem"));

    public static SubLObject rkf_get_todolist_items(final SubLObject owner, final SubLObject mt, SubLObject number) {
        if (number == UNPROVIDED) {
            number = TWENTY_INTEGER;
        }
        final SubLObject variable = $sym0$_ITEM;
        final SubLObject v_properties = list($MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MAX_NUMBER, number);
        final SubLObject sentence = list($$thereExists, $sym4$_LIST, list($$and, listS($$myToDoList, owner, $list7), list($$toDoListItem, $sym4$_LIST, variable)));
        SubLObject v_bindings = NIL;
        SubLObject results = NIL;
        SubLObject cdolist_list_var;
        v_bindings = cdolist_list_var = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject result = assoc(variable, binding, UNPROVIDED, UNPROVIDED).rest();
            results = cons(result, results);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    public static SubLObject declare_rkf_todo_lists_file() {
        declareFunction(me, "rkf_get_todolist_items", "RKF-GET-TODOLIST-ITEMS", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_rkf_todo_lists_file() {
        return NIL;
    }

    public static SubLObject setup_rkf_todo_lists_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_todo_lists_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_todo_lists_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_todo_lists_file();
    }

    
}

/**
 * Total time: 65 ms
 */
