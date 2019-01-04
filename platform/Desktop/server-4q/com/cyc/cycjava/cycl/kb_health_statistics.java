package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_health_statistics extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_health_statistics";
    public static final String myFingerPrint = "5f5a37b7e9d9c5730a030f7ee93ef1123bef662ec7171d8d1a04736aadd7618b";
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 821L)
    public static SubLSymbol $kb_health_issue_comparison_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 1015L)
    private static SubLSymbol $kb_health_issues_store_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 1365L)
    private static SubLSymbol $kb_health_issues_store$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 1836L)
    public static SubLSymbol $kb_health_current_component$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 1988L)
    public static SubLSymbol $kb_health_current_context$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 2085L)
    public static SubLSymbol $kb_health_current_sub_context$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 4182L)
    private static SubLSymbol $no_such_key_map$;
    private static final SubLSymbol $sym0$_KB_HEALTH_ISSUES_STORE_LOCK_;
    private static final SubLString $str1$KB_Health_Issues_Store;
    private static final SubLSymbol $sym2$WITH_LOCK_HELD;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$_KB_HEALTH_ISSUES_STORE_;
    private static final SubLSymbol $kw5$NOT_PRESENT;
    private static final SubLSymbol $kw6$GENERAL;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$CLET;
    private static final SubLSymbol $sym9$_KB_HEALTH_CURRENT_COMPONENT_;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$_KB_HEALTH_CURRENT_CONTEXT_;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$_KB_HEALTH_CURRENT_SUB_CONTEXT_;
    private static final SubLSymbol $kw14$NOT_FOUND;
    private static final SubLSymbol $sym15$COMPILE_KB_HEALTH_STATISTICS;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 1155L)
    public static SubLObject with_kb_health_issues_store_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_health_statistics.$sym2$WITH_LOCK_HELD, (SubLObject)kb_health_statistics.$list3, ConsesLow.append(body, (SubLObject)kb_health_statistics.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 1511L)
    public static SubLObject find_or_create_kb_health_details_unlocked(final SubLObject superior_map, final SubLObject key) {
        SubLObject sub_map = map_utilities.map_get_without_values(superior_map, key, (SubLObject)kb_health_statistics.$kw5$NOT_PRESENT);
        if (kb_health_statistics.$kw5$NOT_PRESENT == sub_map) {
            sub_map = dictionary.new_dictionary(kb_health_statistics.$kb_health_issue_comparison_fn$.getGlobalValue(), (SubLObject)kb_health_statistics.UNPROVIDED);
            map_utilities.map_put(superior_map, key, sub_map);
        }
        return sub_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 2187L)
    public static SubLObject with_kb_health_component(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_health_statistics.$list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject component = (SubLObject)kb_health_statistics.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_health_statistics.$list7);
        component = current.first();
        current = current.rest();
        if (kb_health_statistics.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)kb_health_statistics.$sym8$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_health_statistics.$sym9$_KB_HEALTH_CURRENT_COMPONENT_, component)), ConsesLow.append(body, (SubLObject)kb_health_statistics.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_health_statistics.$list7);
        return (SubLObject)kb_health_statistics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 2337L)
    public static SubLObject with_kb_health_context(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_health_statistics.$list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_context = (SubLObject)kb_health_statistics.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_health_statistics.$list10);
        v_context = current.first();
        current = current.rest();
        if (kb_health_statistics.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)kb_health_statistics.$sym8$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_health_statistics.$sym11$_KB_HEALTH_CURRENT_CONTEXT_, v_context)), ConsesLow.append(body, (SubLObject)kb_health_statistics.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_health_statistics.$list10);
        return (SubLObject)kb_health_statistics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 2479L)
    public static SubLObject with_kb_health_sub_context(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_health_statistics.$list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sub_context = (SubLObject)kb_health_statistics.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_health_statistics.$list12);
        sub_context = current.first();
        current = current.rest();
        if (kb_health_statistics.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)kb_health_statistics.$sym8$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_health_statistics.$sym13$_KB_HEALTH_CURRENT_SUB_CONTEXT_, sub_context)), ConsesLow.append(body, (SubLObject)kb_health_statistics.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_health_statistics.$list12);
        return (SubLObject)kb_health_statistics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 2637L)
    public static SubLObject kb_health_note_problem(final SubLObject handle, SubLObject component, SubLObject v_context, SubLObject sub_context) {
        if (component == kb_health_statistics.UNPROVIDED) {
            component = kb_health_statistics.$kb_health_current_component$.getDynamicValue();
        }
        if (v_context == kb_health_statistics.UNPROVIDED) {
            v_context = kb_health_statistics.$kb_health_current_context$.getDynamicValue();
        }
        if (sub_context == kb_health_statistics.UNPROVIDED) {
            sub_context = kb_health_statistics.$kb_health_current_sub_context$.getDynamicValue();
        }
        return kb_health_note_problem_with(handle, (SubLObject)kb_health_statistics.$kw6$GENERAL, component, v_context, sub_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 3084L)
    public static SubLObject kb_health_note_problem_with(final SubLObject handle, final SubLObject with, SubLObject component, SubLObject v_context, SubLObject sub_context) {
        if (component == kb_health_statistics.UNPROVIDED) {
            component = kb_health_statistics.$kb_health_current_component$.getDynamicValue();
        }
        if (v_context == kb_health_statistics.UNPROVIDED) {
            v_context = kb_health_statistics.$kb_health_current_context$.getDynamicValue();
        }
        if (sub_context == kb_health_statistics.UNPROVIDED) {
            sub_context = kb_health_statistics.$kb_health_current_sub_context$.getDynamicValue();
        }
        if (kb_health_statistics.NIL != list_utilities.sublisp_boolean(component) && kb_health_statistics.NIL != list_utilities.sublisp_boolean(v_context)) {
            SubLObject release = (SubLObject)kb_health_statistics.NIL;
            try {
                release = Locks.seize_lock(kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue());
                final SubLObject component_details = find_or_create_kb_health_details_unlocked(kb_health_statistics.$kb_health_issues_store$.getGlobalValue(), component);
                final SubLObject context_details = find_or_create_kb_health_details_unlocked(component_details, v_context);
                final SubLObject sub_context_details = find_or_create_kb_health_details_unlocked(context_details, sub_context);
                SubLObject details = map_utilities.map_get(sub_context_details, handle, (SubLObject)kb_health_statistics.$kw14$NOT_FOUND);
                if (kb_health_statistics.$kw14$NOT_FOUND == details) {
                    details = bag.new_bag((SubLObject)kb_health_statistics.EQUAL, (SubLObject)kb_health_statistics.UNPROVIDED);
                    map_utilities.map_put(sub_context_details, handle, details);
                }
                bag.bag_add(with, details);
            }
            finally {
                if (kb_health_statistics.NIL != release) {
                    Locks.release_lock(kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue());
                }
            }
        }
        return handle;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 4332L)
    public static SubLObject get_kb_health_statistic_components() {
        SubLObject components = (SubLObject)kb_health_statistics.NIL;
        SubLObject release = (SubLObject)kb_health_statistics.NIL;
        try {
            release = Locks.seize_lock(kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue());
            components = map_utilities.map_keys(kb_health_statistics.$kb_health_issues_store$.getGlobalValue());
        }
        finally {
            if (kb_health_statistics.NIL != release) {
                Locks.release_lock(kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue());
            }
        }
        return components;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 4562L)
    public static SubLObject get_kb_health_statistic_contexts_for_component(final SubLObject component) {
        SubLObject contexts = (SubLObject)kb_health_statistics.NIL;
        SubLObject release = (SubLObject)kb_health_statistics.NIL;
        try {
            release = Locks.seize_lock(kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue());
            contexts = map_utilities.map_keys(map_utilities.map_get_without_values(kb_health_statistics.$kb_health_issues_store$.getGlobalValue(), component, kb_health_statistics.$no_such_key_map$.getGlobalValue()));
        }
        finally {
            if (kb_health_statistics.NIL != release) {
                Locks.release_lock(kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue());
            }
        }
        return contexts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 4906L)
    public static SubLObject get_kb_health_statistic_sub_contexts_for_context(final SubLObject component, final SubLObject v_context) {
        SubLObject sub_contexts = (SubLObject)kb_health_statistics.NIL;
        SubLObject release = (SubLObject)kb_health_statistics.NIL;
        try {
            release = Locks.seize_lock(kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue());
            sub_contexts = map_utilities.map_keys(map_utilities.map_get_without_values(map_utilities.map_get_without_values(kb_health_statistics.$kb_health_issues_store$.getGlobalValue(), component, kb_health_statistics.$no_such_key_map$.getGlobalValue()), v_context, kb_health_statistics.$no_such_key_map$.getGlobalValue()));
        }
        finally {
            if (kb_health_statistics.NIL != release) {
                Locks.release_lock(kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue());
            }
        }
        return sub_contexts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 5377L)
    public static SubLObject get_kb_health_statistic_handles_for_sub_context(final SubLObject component, final SubLObject v_context, final SubLObject sub_context) {
        SubLObject handles = (SubLObject)kb_health_statistics.NIL;
        SubLObject release = (SubLObject)kb_health_statistics.NIL;
        try {
            release = Locks.seize_lock(kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue());
            handles = map_utilities.map_keys(map_utilities.map_get_without_values(map_utilities.map_get_without_values(map_utilities.map_get_without_values(kb_health_statistics.$kb_health_issues_store$.getGlobalValue(), component, kb_health_statistics.$no_such_key_map$.getGlobalValue()), v_context, kb_health_statistics.$no_such_key_map$.getGlobalValue()), sub_context, kb_health_statistics.$no_such_key_map$.getGlobalValue()));
        }
        finally {
            if (kb_health_statistics.NIL != release) {
                Locks.release_lock(kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue());
            }
        }
        return handles;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 5935L)
    public static SubLObject get_kb_health_statistic_details_for_sub_context_handle(final SubLObject component, final SubLObject v_context, final SubLObject sub_context, final SubLObject handle) {
        SubLObject details = (SubLObject)kb_health_statistics.NIL;
        SubLObject release = (SubLObject)kb_health_statistics.NIL;
        try {
            release = Locks.seize_lock(kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue());
            details = map_utilities.map_get_without_values(map_utilities.map_get_without_values(map_utilities.map_get_without_values(map_utilities.map_get_without_values(kb_health_statistics.$kb_health_issues_store$.getGlobalValue(), component, kb_health_statistics.$no_such_key_map$.getGlobalValue()), v_context, kb_health_statistics.$no_such_key_map$.getGlobalValue()), sub_context, kb_health_statistics.$no_such_key_map$.getGlobalValue()), handle, (SubLObject)kb_health_statistics.UNPROVIDED);
        }
        finally {
            if (kb_health_statistics.NIL != release) {
                Locks.release_lock(kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue());
            }
        }
        if (kb_health_statistics.NIL == bag.bag_p(details)) {
            details = bag.new_bag((SubLObject)kb_health_statistics.EQUAL, (SubLObject)kb_health_statistics.UNPROVIDED);
        }
        return details;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 6549L)
    public static SubLObject get_kb_health_statistic_count_for_handle(final SubLObject component, final SubLObject v_context, final SubLObject sub_context, final SubLObject handle) {
        return bag.bag_size(get_kb_health_statistic_details_for_sub_context_handle(component, v_context, sub_context, handle));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-health-statistics.lisp", position = 6759L)
    public static SubLObject compile_kb_health_statistics() {
        SubLObject stats = (SubLObject)kb_health_statistics.NIL;
        SubLObject cdolist_list_var = get_kb_health_statistic_components();
        SubLObject component = (SubLObject)kb_health_statistics.NIL;
        component = cdolist_list_var.first();
        while (kb_health_statistics.NIL != cdolist_list_var) {
            final SubLObject s_component = string_utilities.to_string(component);
            SubLObject cdolist_list_var_$1 = get_kb_health_statistic_contexts_for_component(component);
            SubLObject v_context = (SubLObject)kb_health_statistics.NIL;
            v_context = cdolist_list_var_$1.first();
            while (kb_health_statistics.NIL != cdolist_list_var_$1) {
                final SubLObject s_context = string_utilities.to_string(v_context);
                SubLObject cdolist_list_var_$2 = get_kb_health_statistic_sub_contexts_for_context(component, v_context);
                SubLObject sub_context = (SubLObject)kb_health_statistics.NIL;
                sub_context = cdolist_list_var_$2.first();
                while (kb_health_statistics.NIL != cdolist_list_var_$2) {
                    final SubLObject s_sub_context = string_utilities.to_string(sub_context);
                    SubLObject cdolist_list_var_$3 = get_kb_health_statistic_handles_for_sub_context(component, v_context, sub_context);
                    SubLObject handle = (SubLObject)kb_health_statistics.NIL;
                    handle = cdolist_list_var_$3.first();
                    while (kb_health_statistics.NIL != cdolist_list_var_$3) {
                        final SubLObject s_handle = string_utilities.to_string(handle);
                        final SubLObject details = get_kb_health_statistic_details_for_sub_context_handle(component, v_context, sub_context, handle);
                        final SubLObject count = bag.bag_size(details);
                        stats = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(s_component, s_context, s_sub_context, s_handle, count), stats);
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
        return Sequences.nreverse(stats);
    }
    
    public static SubLObject declare_kb_health_statistics_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_health_statistics", "with_kb_health_issues_store_lock", "WITH-KB-HEALTH-ISSUES-STORE-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_health_statistics", "find_or_create_kb_health_details_unlocked", "FIND-OR-CREATE-KB-HEALTH-DETAILS-UNLOCKED", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_health_statistics", "with_kb_health_component", "WITH-KB-HEALTH-COMPONENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_health_statistics", "with_kb_health_context", "WITH-KB-HEALTH-CONTEXT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_health_statistics", "with_kb_health_sub_context", "WITH-KB-HEALTH-SUB-CONTEXT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_health_statistics", "kb_health_note_problem", "KB-HEALTH-NOTE-PROBLEM", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_health_statistics", "kb_health_note_problem_with", "KB-HEALTH-NOTE-PROBLEM-WITH", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_health_statistics", "get_kb_health_statistic_components", "GET-KB-HEALTH-STATISTIC-COMPONENTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_health_statistics", "get_kb_health_statistic_contexts_for_component", "GET-KB-HEALTH-STATISTIC-CONTEXTS-FOR-COMPONENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_health_statistics", "get_kb_health_statistic_sub_contexts_for_context", "GET-KB-HEALTH-STATISTIC-SUB-CONTEXTS-FOR-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_health_statistics", "get_kb_health_statistic_handles_for_sub_context", "GET-KB-HEALTH-STATISTIC-HANDLES-FOR-SUB-CONTEXT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_health_statistics", "get_kb_health_statistic_details_for_sub_context_handle", "GET-KB-HEALTH-STATISTIC-DETAILS-FOR-SUB-CONTEXT-HANDLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_health_statistics", "get_kb_health_statistic_count_for_handle", "GET-KB-HEALTH-STATISTIC-COUNT-FOR-HANDLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_health_statistics", "compile_kb_health_statistics", "COMPILE-KB-HEALTH-STATISTICS", 0, 0, false);
        return (SubLObject)kb_health_statistics.NIL;
    }
    
    public static SubLObject init_kb_health_statistics_file() {
        kb_health_statistics.$kb_health_issue_comparison_fn$ = SubLFiles.deflexical("*KB-HEALTH-ISSUE-COMPARISON-FN*", (SubLObject)kb_health_statistics.EQL);
        kb_health_statistics.$kb_health_issues_store_lock$ = SubLFiles.deflexical("*KB-HEALTH-ISSUES-STORE-LOCK*", (kb_health_statistics.NIL != Symbols.boundp((SubLObject)kb_health_statistics.$sym0$_KB_HEALTH_ISSUES_STORE_LOCK_)) ? kb_health_statistics.$kb_health_issues_store_lock$.getGlobalValue() : Locks.make_lock((SubLObject)kb_health_statistics.$str1$KB_Health_Issues_Store));
        kb_health_statistics.$kb_health_issues_store$ = SubLFiles.deflexical("*KB-HEALTH-ISSUES-STORE*", (kb_health_statistics.NIL != Symbols.boundp((SubLObject)kb_health_statistics.$sym4$_KB_HEALTH_ISSUES_STORE_)) ? kb_health_statistics.$kb_health_issues_store$.getGlobalValue() : dictionary.new_dictionary(kb_health_statistics.$kb_health_issue_comparison_fn$.getGlobalValue(), (SubLObject)kb_health_statistics.UNPROVIDED));
        kb_health_statistics.$kb_health_current_component$ = SubLFiles.defparameter("*KB-HEALTH-CURRENT-COMPONENT*", (SubLObject)kb_health_statistics.NIL);
        kb_health_statistics.$kb_health_current_context$ = SubLFiles.defparameter("*KB-HEALTH-CURRENT-CONTEXT*", (SubLObject)kb_health_statistics.NIL);
        kb_health_statistics.$kb_health_current_sub_context$ = SubLFiles.defparameter("*KB-HEALTH-CURRENT-SUB-CONTEXT*", (SubLObject)kb_health_statistics.$kw6$GENERAL);
        kb_health_statistics.$no_such_key_map$ = SubLFiles.deflexical("*NO-SUCH-KEY-MAP*", dictionary.new_dictionary((SubLObject)kb_health_statistics.UNPROVIDED, (SubLObject)kb_health_statistics.UNPROVIDED));
        return (SubLObject)kb_health_statistics.NIL;
    }
    
    public static SubLObject setup_kb_health_statistics_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)kb_health_statistics.$sym0$_KB_HEALTH_ISSUES_STORE_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_health_statistics.$sym4$_KB_HEALTH_ISSUES_STORE_);
        access_macros.register_external_symbol((SubLObject)kb_health_statistics.$sym15$COMPILE_KB_HEALTH_STATISTICS);
        return (SubLObject)kb_health_statistics.NIL;
    }
    
    public void declareFunctions() {
        declare_kb_health_statistics_file();
    }
    
    public void initializeVariables() {
        init_kb_health_statistics_file();
    }
    
    public void runTopLevelForms() {
        setup_kb_health_statistics_file();
    }
    
    static {
        me = (SubLFile)new kb_health_statistics();
        kb_health_statistics.$kb_health_issue_comparison_fn$ = null;
        kb_health_statistics.$kb_health_issues_store_lock$ = null;
        kb_health_statistics.$kb_health_issues_store$ = null;
        kb_health_statistics.$kb_health_current_component$ = null;
        kb_health_statistics.$kb_health_current_context$ = null;
        kb_health_statistics.$kb_health_current_sub_context$ = null;
        kb_health_statistics.$no_such_key_map$ = null;
        $sym0$_KB_HEALTH_ISSUES_STORE_LOCK_ = SubLObjectFactory.makeSymbol("*KB-HEALTH-ISSUES-STORE-LOCK*");
        $str1$KB_Health_Issues_Store = SubLObjectFactory.makeString("KB Health Issues Store");
        $sym2$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*KB-HEALTH-ISSUES-STORE-LOCK*"));
        $sym4$_KB_HEALTH_ISSUES_STORE_ = SubLObjectFactory.makeSymbol("*KB-HEALTH-ISSUES-STORE*");
        $kw5$NOT_PRESENT = SubLObjectFactory.makeKeyword("NOT-PRESENT");
        $kw6$GENERAL = SubLObjectFactory.makeKeyword("GENERAL");
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPONENT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym8$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym9$_KB_HEALTH_CURRENT_COMPONENT_ = SubLObjectFactory.makeSymbol("*KB-HEALTH-CURRENT-COMPONENT*");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTEXT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym11$_KB_HEALTH_CURRENT_CONTEXT_ = SubLObjectFactory.makeSymbol("*KB-HEALTH-CURRENT-CONTEXT*");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-CONTEXT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym13$_KB_HEALTH_CURRENT_SUB_CONTEXT_ = SubLObjectFactory.makeSymbol("*KB-HEALTH-CURRENT-SUB-CONTEXT*");
        $kw14$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $sym15$COMPILE_KB_HEALTH_STATISTICS = SubLObjectFactory.makeSymbol("COMPILE-KB-HEALTH-STATISTICS");
    }
}

/*

	Total time: 146 ms
	
*/