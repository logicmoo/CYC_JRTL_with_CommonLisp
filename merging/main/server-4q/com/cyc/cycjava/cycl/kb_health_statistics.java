package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kb_health_statistics extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new kb_health_statistics();

    public static final String myName = "com.cyc.cycjava_2.cycl.kb_health_statistics";


    // deflexical
    public static final SubLSymbol $kb_health_issue_comparison_fn$ = makeSymbol("*KB-HEALTH-ISSUE-COMPARISON-FN*");











    // deflexical
    private static final SubLSymbol $no_such_key_map$ = makeSymbol("*NO-SUCH-KEY-MAP*");

    private static final SubLSymbol $kb_health_issues_store_lock$ = makeSymbol("*KB-HEALTH-ISSUES-STORE-LOCK*");

    private static final SubLString $$$KB_Health_Issues_Store = makeString("KB Health Issues Store");



    private static final SubLList $list3 = list(makeSymbol("*KB-HEALTH-ISSUES-STORE-LOCK*"));

    private static final SubLSymbol $kb_health_issues_store$ = makeSymbol("*KB-HEALTH-ISSUES-STORE*");





    private static final SubLList $list7 = list(list(makeSymbol("COMPONENT")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $kb_health_current_component$ = makeSymbol("*KB-HEALTH-CURRENT-COMPONENT*");

    private static final SubLList $list10 = list(list(makeSymbol("CONTEXT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $kb_health_current_context$ = makeSymbol("*KB-HEALTH-CURRENT-CONTEXT*");

    private static final SubLList $list12 = list(list(makeSymbol("SUB-CONTEXT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $kb_health_current_sub_context$ = makeSymbol("*KB-HEALTH-CURRENT-SUB-CONTEXT*");



    private static final SubLSymbol COMPILE_KB_HEALTH_STATISTICS = makeSymbol("COMPILE-KB-HEALTH-STATISTICS");

    public static SubLObject with_kb_health_issues_store_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list3, append(body, NIL));
    }

    public static SubLObject find_or_create_kb_health_details_unlocked(final SubLObject superior_map, final SubLObject key) {
        SubLObject sub_map = map_utilities.map_get_without_values(superior_map, key, $NOT_PRESENT);
        if ($NOT_PRESENT == sub_map) {
            sub_map = dictionary.new_dictionary($kb_health_issue_comparison_fn$.getGlobalValue(), UNPROVIDED);
            map_utilities.map_put(superior_map, key, sub_map);
        }
        return sub_map;
    }

    public static SubLObject with_kb_health_component(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject component = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        component = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($kb_health_current_component$, component)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static SubLObject with_kb_health_context(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_context = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        v_context = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($kb_health_current_context$, v_context)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list10);
        return NIL;
    }

    public static SubLObject with_kb_health_sub_context(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sub_context = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        sub_context = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($kb_health_current_sub_context$, sub_context)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list12);
        return NIL;
    }

    public static SubLObject kb_health_note_problem(final SubLObject handle, SubLObject component, SubLObject v_context, SubLObject sub_context) {
        if (component == UNPROVIDED) {
            component = $kb_health_current_component$.getDynamicValue();
        }
        if (v_context == UNPROVIDED) {
            v_context = $kb_health_current_context$.getDynamicValue();
        }
        if (sub_context == UNPROVIDED) {
            sub_context = $kb_health_current_sub_context$.getDynamicValue();
        }
        return kb_health_note_problem_with(handle, $GENERAL, component, v_context, sub_context);
    }

    public static SubLObject kb_health_note_problem_with(final SubLObject handle, final SubLObject with, SubLObject component, SubLObject v_context, SubLObject sub_context) {
        if (component == UNPROVIDED) {
            component = $kb_health_current_component$.getDynamicValue();
        }
        if (v_context == UNPROVIDED) {
            v_context = $kb_health_current_context$.getDynamicValue();
        }
        if (sub_context == UNPROVIDED) {
            sub_context = $kb_health_current_sub_context$.getDynamicValue();
        }
        if ((NIL != list_utilities.sublisp_boolean(component)) && (NIL != list_utilities.sublisp_boolean(v_context))) {
            SubLObject release = NIL;
            try {
                release = seize_lock($kb_health_issues_store_lock$.getGlobalValue());
                final SubLObject component_details = find_or_create_kb_health_details_unlocked($kb_health_issues_store$.getGlobalValue(), component);
                final SubLObject context_details = find_or_create_kb_health_details_unlocked(component_details, v_context);
                final SubLObject sub_context_details = find_or_create_kb_health_details_unlocked(context_details, sub_context);
                SubLObject details = map_utilities.map_get(sub_context_details, handle, $NOT_FOUND);
                if ($NOT_FOUND == details) {
                    details = bag.new_bag(EQUAL, UNPROVIDED);
                    map_utilities.map_put(sub_context_details, handle, details);
                }
                bag.bag_add(with, details);
            } finally {
                if (NIL != release) {
                    release_lock($kb_health_issues_store_lock$.getGlobalValue());
                }
            }
        }
        return handle;
    }

    public static SubLObject get_kb_health_statistic_components() {
        SubLObject components = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_health_issues_store_lock$.getGlobalValue());
            components = map_utilities.map_keys($kb_health_issues_store$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($kb_health_issues_store_lock$.getGlobalValue());
            }
        }
        return components;
    }

    public static SubLObject get_kb_health_statistic_contexts_for_component(final SubLObject component) {
        SubLObject contexts = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_health_issues_store_lock$.getGlobalValue());
            contexts = map_utilities.map_keys(map_utilities.map_get_without_values($kb_health_issues_store$.getGlobalValue(), component, $no_such_key_map$.getGlobalValue()));
        } finally {
            if (NIL != release) {
                release_lock($kb_health_issues_store_lock$.getGlobalValue());
            }
        }
        return contexts;
    }

    public static SubLObject get_kb_health_statistic_sub_contexts_for_context(final SubLObject component, final SubLObject v_context) {
        SubLObject sub_contexts = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_health_issues_store_lock$.getGlobalValue());
            sub_contexts = map_utilities.map_keys(map_utilities.map_get_without_values(map_utilities.map_get_without_values($kb_health_issues_store$.getGlobalValue(), component, $no_such_key_map$.getGlobalValue()), v_context, $no_such_key_map$.getGlobalValue()));
        } finally {
            if (NIL != release) {
                release_lock($kb_health_issues_store_lock$.getGlobalValue());
            }
        }
        return sub_contexts;
    }

    public static SubLObject get_kb_health_statistic_handles_for_sub_context(final SubLObject component, final SubLObject v_context, final SubLObject sub_context) {
        SubLObject handles = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_health_issues_store_lock$.getGlobalValue());
            handles = map_utilities.map_keys(map_utilities.map_get_without_values(map_utilities.map_get_without_values(map_utilities.map_get_without_values($kb_health_issues_store$.getGlobalValue(), component, $no_such_key_map$.getGlobalValue()), v_context, $no_such_key_map$.getGlobalValue()), sub_context, $no_such_key_map$.getGlobalValue()));
        } finally {
            if (NIL != release) {
                release_lock($kb_health_issues_store_lock$.getGlobalValue());
            }
        }
        return handles;
    }

    public static SubLObject get_kb_health_statistic_details_for_sub_context_handle(final SubLObject component, final SubLObject v_context, final SubLObject sub_context, final SubLObject handle) {
        SubLObject details = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_health_issues_store_lock$.getGlobalValue());
            details = map_utilities.map_get_without_values(map_utilities.map_get_without_values(map_utilities.map_get_without_values(map_utilities.map_get_without_values($kb_health_issues_store$.getGlobalValue(), component, $no_such_key_map$.getGlobalValue()), v_context, $no_such_key_map$.getGlobalValue()), sub_context, $no_such_key_map$.getGlobalValue()), handle, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($kb_health_issues_store_lock$.getGlobalValue());
            }
        }
        if (NIL == bag.bag_p(details)) {
            details = bag.new_bag(EQUAL, UNPROVIDED);
        }
        return details;
    }

    public static SubLObject get_kb_health_statistic_count_for_handle(final SubLObject component, final SubLObject v_context, final SubLObject sub_context, final SubLObject handle) {
        return bag.bag_size(get_kb_health_statistic_details_for_sub_context_handle(component, v_context, sub_context, handle));
    }

    public static SubLObject compile_kb_health_statistics() {
        SubLObject stats = NIL;
        SubLObject cdolist_list_var = get_kb_health_statistic_components();
        SubLObject component = NIL;
        component = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject s_component = string_utilities.to_string(component);
            SubLObject cdolist_list_var_$1 = get_kb_health_statistic_contexts_for_component(component);
            SubLObject v_context = NIL;
            v_context = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject s_context = string_utilities.to_string(v_context);
                SubLObject cdolist_list_var_$2 = get_kb_health_statistic_sub_contexts_for_context(component, v_context);
                SubLObject sub_context = NIL;
                sub_context = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    final SubLObject s_sub_context = string_utilities.to_string(sub_context);
                    SubLObject cdolist_list_var_$3 = get_kb_health_statistic_handles_for_sub_context(component, v_context, sub_context);
                    SubLObject handle = NIL;
                    handle = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        final SubLObject s_handle = string_utilities.to_string(handle);
                        final SubLObject details = get_kb_health_statistic_details_for_sub_context_handle(component, v_context, sub_context, handle);
                        final SubLObject count = bag.bag_size(details);
                        stats = cons(list(s_component, s_context, s_sub_context, s_handle, count), stats);
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        handle = cdolist_list_var_$3.first();
                    } 
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    sub_context = cdolist_list_var_$2.first();
                } 
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                v_context = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            component = cdolist_list_var.first();
        } 
        return nreverse(stats);
    }

    public static SubLObject declare_kb_health_statistics_file() {
        declareMacro("with_kb_health_issues_store_lock", "WITH-KB-HEALTH-ISSUES-STORE-LOCK");
        declareFunction("find_or_create_kb_health_details_unlocked", "FIND-OR-CREATE-KB-HEALTH-DETAILS-UNLOCKED", 2, 0, false);
        declareMacro("with_kb_health_component", "WITH-KB-HEALTH-COMPONENT");
        declareMacro("with_kb_health_context", "WITH-KB-HEALTH-CONTEXT");
        declareMacro("with_kb_health_sub_context", "WITH-KB-HEALTH-SUB-CONTEXT");
        declareFunction("kb_health_note_problem", "KB-HEALTH-NOTE-PROBLEM", 1, 3, false);
        declareFunction("kb_health_note_problem_with", "KB-HEALTH-NOTE-PROBLEM-WITH", 2, 3, false);
        declareFunction("get_kb_health_statistic_components", "GET-KB-HEALTH-STATISTIC-COMPONENTS", 0, 0, false);
        declareFunction("get_kb_health_statistic_contexts_for_component", "GET-KB-HEALTH-STATISTIC-CONTEXTS-FOR-COMPONENT", 1, 0, false);
        declareFunction("get_kb_health_statistic_sub_contexts_for_context", "GET-KB-HEALTH-STATISTIC-SUB-CONTEXTS-FOR-CONTEXT", 2, 0, false);
        declareFunction("get_kb_health_statistic_handles_for_sub_context", "GET-KB-HEALTH-STATISTIC-HANDLES-FOR-SUB-CONTEXT", 3, 0, false);
        declareFunction("get_kb_health_statistic_details_for_sub_context_handle", "GET-KB-HEALTH-STATISTIC-DETAILS-FOR-SUB-CONTEXT-HANDLE", 4, 0, false);
        declareFunction("get_kb_health_statistic_count_for_handle", "GET-KB-HEALTH-STATISTIC-COUNT-FOR-HANDLE", 4, 0, false);
        declareFunction("compile_kb_health_statistics", "COMPILE-KB-HEALTH-STATISTICS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_health_statistics_file() {
        deflexical("*KB-HEALTH-ISSUE-COMPARISON-FN*", EQL);
        deflexical("*KB-HEALTH-ISSUES-STORE-LOCK*", SubLTrampolineFile.maybeDefault($kb_health_issues_store_lock$, $kb_health_issues_store_lock$, () -> make_lock($$$KB_Health_Issues_Store)));
        deflexical("*KB-HEALTH-ISSUES-STORE*", SubLTrampolineFile.maybeDefault($kb_health_issues_store$, $kb_health_issues_store$, () -> dictionary.new_dictionary($kb_health_issue_comparison_fn$.getGlobalValue(), UNPROVIDED)));
        defparameter("*KB-HEALTH-CURRENT-COMPONENT*", NIL);
        defparameter("*KB-HEALTH-CURRENT-CONTEXT*", NIL);
        defparameter("*KB-HEALTH-CURRENT-SUB-CONTEXT*", $GENERAL);
        deflexical("*NO-SUCH-KEY-MAP*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_kb_health_statistics_file() {
        declare_defglobal($kb_health_issues_store_lock$);
        declare_defglobal($kb_health_issues_store$);
        register_external_symbol(COMPILE_KB_HEALTH_STATISTICS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_health_statistics_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_health_statistics_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_health_statistics_file();
    }

    
}

/**
 * Total time: 146 ms
 */
