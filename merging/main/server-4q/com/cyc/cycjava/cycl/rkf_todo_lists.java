/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-TODO-LISTS
 * source file: /cyc/top/cycl/rkf-todo-lists.lisp
 * created:     2019/07/03 17:38:01
 */
public final class rkf_todo_lists extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_todo_lists();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_todo_lists";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$_ITEM = makeSymbol("?ITEM");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");



    static private final SubLSymbol $sym4$_LIST = makeSymbol("?LIST");





    static private final SubLList $list7 = list(makeSymbol("?LIST"));



    // Definitions
    /**
     *
     *
     * @unknown rewrite using new-cycl-query material
     */
    @LispMethod(comment = "@unknown rewrite using new-cycl-query material")
    public static final SubLObject rkf_get_todolist_items_alt(SubLObject owner, SubLObject mt, SubLObject number) {
        if (number == UNPROVIDED) {
            number = TWENTY_INTEGER;
        }
        {
            SubLObject variable = $sym0$_ITEM;
            SubLObject v_properties = list($MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MAX_NUMBER, number);
            SubLObject sentence = list($$thereExists, $sym4$_LIST, list($$and, listS($$myToDoList, owner, $list_alt7), list($$toDoListItem, $sym4$_LIST, variable)));
            SubLObject v_bindings = NIL;
            SubLObject results = NIL;
            v_bindings = inference_kernel.new_cyc_query(sentence, mt, v_properties);
            {
                SubLObject cdolist_list_var = v_bindings;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    {
                        SubLObject result = assoc(variable, binding, UNPROVIDED, UNPROVIDED).rest();
                        results = cons(result, results);
                    }
                }
            }
            return nreverse(results);
        }
    }

    // Definitions
    /**
     *
     *
     * @unknown rewrite using new-cycl-query material
     */
    @LispMethod(comment = "@unknown rewrite using new-cycl-query material")
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
        declareFunction("rkf_get_todolist_items", "RKF-GET-TODOLIST-ITEMS", 2, 1, false);
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

    static private final SubLList $list_alt7 = list(makeSymbol("?LIST"));

    
}

/**
 * Total time: 65 ms
 */
